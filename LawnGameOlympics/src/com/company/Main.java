// Program: Project I - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1

package com.company;
import java.util.Scanner;

public class Main
{
    String[] EventName = {"Washoos", "Canjam", "Horseshoes","Cornhole","Ladderball", "Stickgame"}; // This array holds each game name for descriptions later.
    String [][] OlympianData = {}; // For olympian data in the olympian method.

    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        splashscreen(); // Call to splash screen function that way we can cycle through this program
    }
    public static void splashscreen()
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");
        // Initializes input
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please input a command: ");
        // Accepts user input and makes decisions
        String inString = userIn.next();
        if(inString.equals("e") || inString.equals("events"))
        {
            events(); // method call to event listing
        }
        else if(inString.equals("o") || inString.equals("olympians"))
        {
            olympians(); // method call to olympians
        }
        else if(inString.equals("h") || inString.equals("help"))
        {
            help(); // method call to help
        }
        else
        {
            System.out.println("Error: Not a command.");
            splashscreen();
        }

    }
    public static void events()
    {
        System.out.println(EventName[0]);
    }
    public static void olympians()
    {
    // filler
    }
    public static void help()
    {
        System.out.println("Welcome to the Help menu.");
        System.out.println("Input 1 to return to Splash Screen. 0 to end program.");
        System.out.println("On the splash screen input 'e' or 'events' to view today's events.");
        System.out.println("Input 'o' or 'olympians' to view the status of all olympians.");
        System.out.println("You figured out how to get here by typing 'h' or 'help.");
        Scanner userIn = new Scanner(System.in);
        String helpExit = userIn.next();
        if (helpExit.equals("0"))
        {
            // end program
        }
        else if (helpExit.equals("1"))
        {
            splashscreen(); // returns us to the splash screen
        }
        else
        {
            help(); // calls us back to the help menu, this activates because of failed input.
        }
    }
}