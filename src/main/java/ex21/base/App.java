/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 NURIDEAN MUBARAK
 */
package ex21.base;

import java.util.Scanner;

/*
Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.
Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

    Use a switch or case statement for this program.
    Use a single output statement for this program.

Challenges

    Use a map or dictionary to remove the switch statement from the program.
    Support multiple languages. Prompt for the language at the beginning of the program.

 */
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String month = " ";
        System.out.print("Please enter the number of the month:");
        String userInput = in.nextLine();
        int userNum = Integer.parseInt(userInput);

        switch (userNum) {
            case 1:
                month = month.replaceAll(" ", "January");
                break;
            case 2:
                month = month.replaceAll(" ", "February");
                break;
            case 3:
                month = month.replaceAll(" ", "March");
                break;
            case 4:
                month = month.replaceAll(" ", "April");
                break;
            case 5:
                month = month.replaceAll(" ", "May");
                break;
            case 6:
                month = month.replaceAll(" ", "June");
                break;
            case 7:
                month = month.replaceAll(" ", "July");
                break;
            case 8:
                month = month.replaceAll(" ", "August");
                break;
            case 9:
                month = month.replaceAll(" ", "September");
                break;
            case 10:
                month = month.replaceAll(" ", "October");
                break;
            case 11:
                month = month.replaceAll(" ", "November");
                break;
            case 12:
                month = month.replaceAll(" ", "December");
                break;
            default:System.out.print("Error");
            System.exit(0);

        }
        String output = "The name of the month is " + month + ".";
        System.out.print(output);



    }
}
