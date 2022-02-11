package com.company;

public class Circle {
    private static final double PI = 3.14159265359;


    public static void area(int radius) {
        System.out.println("Area: " + PI * (radius * radius));

    }

    public static void circumference(int radius) {
        System.out.println("Circumference: " + PI * (2 * radius));
    }
}

