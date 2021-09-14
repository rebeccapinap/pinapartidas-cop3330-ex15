package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Checks to see if password is entered correctly when prompted
        System.out.print("What is the username? ");
        String userName = input.nextLine();

        System.out.print("What is the password? ");
        String password = input.nextLine();

        if (password.equals("abc$123"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
