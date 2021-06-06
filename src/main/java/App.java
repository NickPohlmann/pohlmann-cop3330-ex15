/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String correctPassword = "Abcd123@";
        String username = myApp.readInput("What is your username? ");
        String passwordGuess = myApp.readInput("What is the password? ");
        String passwordCorrectness = myApp.testPassword(correctPassword,passwordGuess);
        String outputString = myApp.generateOutputString(passwordCorrectness, username);
        myApp.printOutputString(outputString);
    }

    private void printOutputString(String outputString) { System.out.println(outputString);}
    private String generateOutputString(String passwordCorrectness, String username) {
        if(passwordCorrectness.equals("correct")) {
            return String.format("Welcome %s!", username);
        }
        return "I don't know you.";
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private String testPassword (String correctPassword, String passwordGuess) {
        if(correctPassword.equals(passwordGuess)) {
            return "correct";
        } else {
            return "incorrect";
        }
    }
}
