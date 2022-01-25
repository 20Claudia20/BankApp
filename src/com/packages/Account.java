package com.packages;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the ABC Bank!" +
                           "\n" + "What would you like to do today?" +"\n");
        System.out.println("1. Check Balance " +
                     "\n" + "2. Withdraw" + "\n" + "3. Deposit" + "\n" + "4. Exit");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


    }
}
