// Program: Project I - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1

package com.company;
import java.util.Scanner;

public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");
        // Initializes input
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please input a command: ");
        // Accepts user input and makes decisions
        String inString = userIn.nextLine();
        if(inString.toLowerCase() == "e" || inString.toLowerCase()== "events")
        {
            events(); // method call to event listing
        }
        else if(inString.toLowerCase() == "o" || inString.toLowerCase() == "olympians")
        {
            olympians(); // method call to olympians
        }
        else if(inString.toLowerCase() == "h" || inString.toLowerCase() == "help")
        {
            help(); // method call to help
        }
        else
        {
            // error return
        }

    }
    public static void events()
    {
    //filler
    }
    public static void olympians()
    {
    // filler
    }
    public static void help()
    {
    // filler
    }

}
