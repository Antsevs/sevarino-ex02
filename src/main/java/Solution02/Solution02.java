/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Sevarino
 */

package Solution02;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        int counter = 0, i;
        System.out.println("What is the input string?");
        Scanner scnr = new Scanner(System.in);
        String strng = scnr.nextLine();
        for(i = 0; i < strng.length(); i++){
            counter++;
        }
        System.out.printf(strng + " has %d characters.", counter);
    }
}
