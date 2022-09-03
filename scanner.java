package de.kaktus.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in;
        String message;

        in = new Scanner(System.in);
        System.out.println("Enter Username: ");
        message = in.nextLine();

        System.out.println("Hello " + message);
    }
}
