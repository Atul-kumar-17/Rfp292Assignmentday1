package com.bridgelabz.assignment.day1;

public class DemonstrationOfBlocks {
    static int x =20;
    /* Static block of code
    *for calling the static block of code we do not need to create object
    *it can be called by itself
     */
    static {
        System.out.println("This is a static block of code.");
    }
    // instance block of code - it does not called without the object
    {
        System.out.println("This is instance block of code.");
    }

    public static void main(String[] args) {
        DemonstrationOfBlocks a = new DemonstrationOfBlocks();
        System.out.println("static variable "+x);


    }
}
