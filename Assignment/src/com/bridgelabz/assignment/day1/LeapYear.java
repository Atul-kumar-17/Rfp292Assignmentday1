package com.bridgelabz.assignment.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want check whether it is leap year or not");
        int year = sc.nextInt();
        if(year>=1582 && year % 4 == 0){
            System.out.println("It is a leap year. ");
        }else if(year <=1582) {
            System.out.println("year is not a valid year.");
        }else {
            System.out.println("it is not a leap year.");
        }
    }
}
