package com.lhoriza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userOriginalString = "";
        String userReverseString = "";
        boolean isTrue = false;
        Scanner appScanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        userOriginalString = appScanner.nextLine().toLowerCase();

        for (int i = 0; i < userOriginalString.length(); i++) {
            userReverseString = userOriginalString.charAt(i) + userReverseString;
        }

        if (userOriginalString.equals(userReverseString)) {
            isTrue = true;
            System.out.println("Palindrome? " + isTrue);
        } else {
            System.out.println("Palindrome? " + isTrue);
        }
    }
}