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
        System.out.println("Welcome to the Help menu.");
        System.out.println("Input 1 to return to Splash Screen. 0 to end program.");
        System.out.println("On the splash screen input 'e' or 'events' to view today's events.");
        System.out.println("Input 'o' or 'olympians' to view the status of all olympians.");
        System.out.println("You figured out how to get here by typing 'h' or 'help.");
        Scanner userIn = new Scanner(System.in);
        int helpExit = userIn.nextInt();
        if (helpExit == 0) {
            // end program
        } else if (helpExit == 1) {
            splashscreen(); // returns us to the splash screen
        } else {
            help(); // calls us back to the help menu, this activates because of failed input.
        }
    }
}