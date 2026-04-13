package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner dataCatcher = new Scanner(System.in);

        System.out.println("What is your name: ");
        String firstName = dataCatcher.nextLine();

        System.out.println("what's your suffix? if none write none: ");
        String suffix = dataCatcher.nextLine();

        System.out.println("What is your last name: ");
        String lastName = dataCatcher.nextLine();

        if (suffix.equalsIgnoreCase("none")){
            String fullName = firstName + lastName;

            System.out.println(fullName);

        }


    }
}
