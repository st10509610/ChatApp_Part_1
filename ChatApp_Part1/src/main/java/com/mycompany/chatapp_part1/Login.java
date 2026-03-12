package com.mycompany.chatapp_part1;

public class Login
{
    int passes = 0;
    
    public boolean checkUserName(String username)
    {
        boolean validUsername = false;
        
        if (username.length() <= 5 && username.contains("_"))
        {
            passes++;
            validUsername = true;
        }
        
        return validUsername;
    }
    
    public boolean checkPasswordComplexity(String password)
    {
        boolean validPassword = false;
        
        if (password.length() >= 8)
        {
            passes++;
            validPassword = true;
        }
        
        return validPassword;
    }
    
    public boolean checkCellPhoneNumber(String cellPhoneNumber)
    {
        boolean validCellPhoneNumber = false;
        
        if (cellPhoneNumber.charAt(0) == '+' && cellPhoneNumber.charAt(1) == '2' && cellPhoneNumber.charAt(2) == '7' && cellPhoneNumber.length() <= 12)
        {
            passes++;
            validCellPhoneNumber = true;
        }
        
        return validCellPhoneNumber;
    }
    
    /*
    private String registerUser()
    {
        
    }
    
    private boolean logInUser()
    {
        
    }
    */
    
    public String returnLogInStatus()
    {
        String logInStatus;
        
        if (passes == 3)
        {
            logInStatus = "Logged in successfully.";
        }
        else
        {
            logInStatus = "Login failed. Please check that your username, password, and cellphone number are correct.";
        }
        
        return logInStatus;
    }
}