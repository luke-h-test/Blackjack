package com.lbg.cohort4;

import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;

import java.lang.Math.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    int[] userInput()
    {
        int[] userNums = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        userNums[0] = parseInt(sc.nextLine());

        System.out.println("Enter your second number: ");
        userNums[1] = parseInt(sc.nextLine());

        return userNums;

    }

    int comparator(int[] userChoices)
    {
        int checkOne = 21 - userChoices[0];
        int checkTwo = 21 - userChoices[1];

        if(checkOne >=0 & checkTwo >=0)
        {
            return max(userChoices[0], userChoices[1]);
        }
        else if(checkOne >= 0 & checkTwo < 0)
        {
            return userChoices[0];
        }
        else if (checkOne < 0 & checkTwo >= 0)
        {
            return userChoices[1];
        }
        else {
            return 0;
        }


    }


    public static void main(String[] args) {

        Main mm = new Main();
        int[] userChoices = mm.userInput();

        System.out.println(mm.comparator(userChoices));

    }
}