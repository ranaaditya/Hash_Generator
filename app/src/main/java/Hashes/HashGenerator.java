package Hashes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public   class HashGenerator {

     public static String generate_md5(String user_text) {
         String passwordToHash = user_text;
         String generatedPassword=null;

         try {
             MessageDigest md = MessageDigest.getInstance("MD5");
             md.update(passwordToHash.getBytes());
             byte[] bytes = md.digest();
             StringBuilder sb = new StringBuilder();

             for (int i = 0; i < bytes.length; i++) {
                 sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
             }

             generatedPassword = sb.toString();
         } catch (NoSuchAlgorithmException e) {
             e.printStackTrace();
         }
         return generatedPassword;
     }
     public static String generate_sha1(String user_data){

         String passwordToHash = user_data;
         String generatedPassword=null;

         try {
             MessageDigest md = MessageDigest.getInstance("SHA-1");
             md.update(passwordToHash.getBytes());
             byte[] bytes = md.digest();
             StringBuilder sb = new StringBuilder();

             for (int i = 0; i < bytes.length; i++) {
                 sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
             }

             generatedPassword = sb.toString();
         } catch (NoSuchAlgorithmException e) {
             e.printStackTrace();
         }
         return generatedPassword;
     }
     public static String  generate_sha256(String user_data){


         String passwordToHash = user_data;
         String generatedPassword=null;

         try {
             MessageDigest md = MessageDigest.getInstance("SHA-256");
             md.update(passwordToHash.getBytes());
             byte[] bytes = md.digest();
             StringBuilder sb = new StringBuilder();

             for (int i = 0; i < bytes.length; i++) {
                 sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
             }

             generatedPassword = sb.toString();
         } catch (NoSuchAlgorithmException e) {
             e.printStackTrace();
         }
         return generatedPassword;
     }
}
