package com.company;

public class Main {

    public static void main(String[] args) {
        // 2.
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = (int) 2e9;
        long longVar = (long) 1e18;
        float floatVar = 123.44f;
        double doubleVar = 1.5d;
        char charVar = 'A';
        boolean boolVar = true;

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(boolVar);
    }
    //3.
    static float function (float a, float b, float c, float d) {
        float x = a * (b + (c / d));
        return x;
    }
    //4.
    static boolean trust (int n, int a){
        return (n + a) >= 10 && (n + a) <= 20;
    }
    //5.
    static void statusNumber (int x) {
        if (x >= 0)
            System.out.println("Позитивное");
        else
            System.out.println("Негативное");
    }
    //6.
    static boolean Number (int n) {
        return (n < 0);
    }
    //7.
    static void helloName (String name) {
        System.out.println( "Привет," + name + "!");
    }

}