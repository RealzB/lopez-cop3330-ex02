package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string?");
        String userInput = sc.nextLine();
        System.out.println(userInput + " has " + userInput.length() + " characters.");
    }
}