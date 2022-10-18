package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserInfo {
    // Scanner for user Input
    Scanner scan = new Scanner(System.in);

    // Method Checking FirstName with regex pattern
    public void checkFirstName() {
        System.out.println("Enter the first name :");
        String firstName = scan.nextLine();
        /*
         *  checking input is valid or not
         *  Name - First name starts with Cap and has minimum 3 characters
         */
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            System.out.println("first name is valid");
        } else {
            System.out.println("first name invalid");
        }
    }

    public void checkLastName() {
        System.out.println("Enter the Last name : ");
        String lastName = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        // matcher searching the above pattern with lastName
        Matcher matcher = pattern.matcher(lastName);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        // Name - Last name starts with Cap and has minimum 3 characters
        if (matchFound) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name invalid");
        }
    }

    // Method Checking Email with regex pattern
    public void checkEmail() {
        System.out.println("Enter the Email : ");
        String eMail = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
        // matcher searching the above pattern with Email
        Matcher matcher = pattern.matcher(eMail);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid. Enter Email Again ");
            checkEmail();
        }
    }

    // Method Checking Mobile Number with Regex pattern
    public void checkMobileNumber() {
        System.out.println("Enter the Mobile Number : ");
        String mobileNumber = scan.nextLine();
        // Creating/Defining a pattern to be searched
        Pattern pattern = Pattern.compile("^[+][0-9]{2}+[ ]?[0-9]{10}$");
        // matcher searching the above pattern
        Matcher matcher = pattern.matcher(mobileNumber);
        // matchFound store true if pattern matches
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Mobile Number is valid");
        } else {
            System.out.println("Mobile Number is invalid. Enter Again: ");
            checkMobileNumber();
        }
    }

    /* Method Checking Password Rules are minimum 8 characters, at least one upper case
    * at least one numeric*/
    public void checkPassword() {
        System.out.println("Enter the Password : ");
        String password = scan.nextLine();
        // Checking pattern with Password
        if (Pattern.matches("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$", password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid. Enter Again: ");
            checkPassword();
        }
    }
}
