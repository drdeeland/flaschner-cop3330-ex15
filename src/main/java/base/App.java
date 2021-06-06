/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int compareCheck = 0;

        String storedUsername = myApp.setUsername();
        String storedPassword = myApp.setPassword();

        String inputUser = myApp.inputUsername();
        String inputPass = myApp.inputPassword();

        compareCheck += myApp.compareUsername(storedUsername, inputUser);
        compareCheck += myApp.comparePassword(storedPassword, inputPass);

        if (compareCheck == 0) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }

    public String setUsername() {
        System.out.print("What would you like your username to be? ");
        return input.nextLine();
    }

    public String setPassword() {
        System.out.print("What would you like your password to be? ");
        return input.nextLine();
    }

    public String inputUsername() {
        System.out.print("What is the username? ");
        return input.nextLine();
    }

    public String inputPassword() {
        System.out.print("What is the password? ");
        return input.nextLine();
    }

    public int compareUsername(String storedUsername, String inputUsername) {
        if (inputUsername.equals(storedUsername)) {
            return 0;
        } else {
            return 1;
        }
    }

    public int comparePassword(String storedPassword, String inputPassword) {
        if (inputPassword.equals(storedPassword)) {
            return 0;
        } else {
            return 1;
        }
    }
}
