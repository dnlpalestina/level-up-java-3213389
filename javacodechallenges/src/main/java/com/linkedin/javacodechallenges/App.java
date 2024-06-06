package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6
                && password.matches(".*\\d.*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*");
    }

    public static boolean isPasswordComplexFunctional(String s) {
        return s.length() >= 6 &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
