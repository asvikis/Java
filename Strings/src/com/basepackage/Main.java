package com.basepackage;

public class Main {

    public static void main(String[] args) {

       String myString = "This is string";
        System.out.println("mySting is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("mySting is equal to: " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("mySting is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);


    }
}
