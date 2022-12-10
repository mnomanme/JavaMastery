package Strings;

public class Main {
    public static void main(String[] args) {
        String message = "Hello World" + " !!";
        message.startsWith("H");
        message.endsWith("!!");
        message.length();
        message.indexOf("H");
        message.toLowerCase();
        message.toUpperCase();
        message.trim();
        String replace = message.replace("!","*");
        System.out.println(replace);
        System.out.println(message);
    }
}
