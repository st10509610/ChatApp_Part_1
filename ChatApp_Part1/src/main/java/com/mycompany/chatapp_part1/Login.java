package com.mycompany.chatapp_part1;

public class Login
{
    public boolean checkUserName(String username)
    {
        boolean validUsername = false;
        
        if (username.length() <= 5 && username.contains("_"))
        {
            validUsername = true;
        }
        
        return validUsername;
    }
    
    public boolean checkPasswordComplexity(String password)
    {
        boolean validPassword = false;
        
        if (password.length() >= 8)
        {
            validPassword = true;
        }
        
        return validPassword;
    }
    
    public boolean checkCellPhoneNumber(String cellPhoneNumber)
    {
        boolean validCellPhoneNumber = false;
        
        if (cellPhoneNumber.charAt(0) == '+' && cellPhoneNumber.charAt(1) == '2' && cellPhoneNumber.charAt(2) == '7' && cellPhoneNumber.length() <= 12)
        {
            validCellPhoneNumber = true;
        }
        
        return validCellPhoneNumber;
    }
    
    public String registerUser(String username, String password)
    {
        boolean usernamePass = false;
        boolean passwordPass = false;
        String message = "";
        
        if (checkUserName(username) == true)
        {
            usernamePass = true;
        }
        
        if (checkPasswordComplexity(password) == true)
        {
            passwordPass = true;
        }
        
        if (usernamePass == false)
        {
            message = "The username is incorrectly formatted.";
        }
        
        if (passwordPass == false)
        {
            message = "The password does not meet the complexity requirements.";
        }
        
        if (usernamePass == false && passwordPass == false)
        {
            message = "The username is incorrectly formatted.\nThe password does not meet the complexity requirements.";
        }
        
        if (usernamePass == true && passwordPass == true)
        {
            message = "User registered successfully.";
        }
        
        return message;
    }
    
    private boolean logInUser(String username, String password)
    {
        boolean logInAuthorised = false;
        
        if (checkUserName(username) == true && checkPasswordComplexity(password) == true)
        {
            logInAuthorised = true;
        }
        
        return logInAuthorised;
    }
    
    public String returnLogInStatus(String username, String password)
    {
        String logInStatus = "";
        String firstName = "firstName";
        String lastName = "lastName";
        
        if (logInUser(username, password) == true)
        {
            logInStatus = "Welcome " + firstName + " " + lastName + ". It is nice to see you again.";
        }
        else
        {
            logInStatus = "Login failed. Please check that your username and password are correct.";
        }
        
        return logInStatus;
    }

    public String getUsername()
    {
        String username = "user";
        
        return username;
    }
    
    public String getPassword()
    {
        String password = "pass";
        
        return password;
    }
    
    public String getCellPhoneNumber()
    {
        String cellPhoneNumber = "011";
        
        return cellPhoneNumber;
    }
}