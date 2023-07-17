package com.bridgelabz.assignment.day1;

public class CommandLineSum {
    public static void main(String[] args) {
        int i, sum=0;
        for( i =0;i< args.length;i++){
            sum = sum+Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
