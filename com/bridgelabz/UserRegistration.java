package com.bridgelabz;

public class UserRegistration {
    public static void main(String[] args) {
        // Create object of class
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        // Method calling to check Firstname,lastname, emailId, mobilenumber, password
        validateUserInfo.checkFirstName();
        validateUserInfo.checkLastName();
        validateUserInfo.checkEmail();
        validateUserInfo.checkMobileNumber();
        validateUserInfo.checkPassword();
        validateUserInfo.checkSampleEmail();
    }
}