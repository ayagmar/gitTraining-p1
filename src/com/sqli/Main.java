package com.sqli;

public class Main {


    public static String cat() {
        return "meow";
    }

    public static String dog() {
        return "bark";
    }

    public static void main(String[] args) {
        // write your code here
        String mycat = cat();
        String mydog = dog();
        System.out.println(mycat);
        System.out.println(mydog);


    }
}