package com.mycompany.chatapp_part1;

import java.util.Scanner;

public class ChatApp_Part1
{
    public static void main(String[] args)
    {
        System.out.print("ENTER USERNAME: ");
        Scanner usernameScanner = new Scanner(System.in);
        String username = usernameScanner.next();
        
        System.out.print("ENTER PASSWORD: ");
        Scanner passwordScanner = new Scanner(System.in);
        String password = passwordScanner.next();
        
        System.out.print("ENTER CELLPHONE NUMBER: ");
        Scanner cellPhoneNumberScanner = new Scanner(System.in);
        String cellPhoneNumber = cellPhoneNumberScanner.next();
        
        usernameScanner.close();
        passwordScanner.close();
        cellPhoneNumberScanner.close();
        
        Login login = new Login();
        
        System.out.println();
        
        if (login.checkUserName(username) == true)
        {
            System.out.println("Username successfully captured.");
        }
        else
        {
            System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        if (login.checkPasswordComplexity(password) == true)
        {
            System.out.println("Password successfully captured.");
        }
        else
        {
            System.out.println("Password is not correctly formatted. Please ensure that your password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        
        if (login.checkCellPhoneNumber(cellPhoneNumber) == true)
        {
            System.out.println("Cellphone number successfully captured.");
        }
        else
        {
            System.out.println("Cellphone number is not correctly formatted or does not contain an international code.");
        }
        
        System.out.println();
        System.out.println(login.registerUser(username, password));
        System.out.println(login.returnLogInStatus(username, password, cellPhoneNumber));
    }
}