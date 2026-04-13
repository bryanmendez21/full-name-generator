package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner dataCatcher = new Scanner(System.in);

        System.out.println("What is your name: ");
        String firstName = dataCatcher.nextLine();

        System.out.println("what's your middle name: ");
        String middleName = dataCatcher.nextLine();

        System.out.println("What is your last name: ");
        String lastName = dataCatcher.nextLine();

        System.out.println("what's your suffix: ");
        String suffix = dataCatcher.nextLine();


        if (suffix.equalsIgnoreCase("") && (middleName.equalsIgnoreCase(""))){
            String fullName = firstName + " "+ lastName;

            System.out.println(fullName);

        }
        else if (suffix.equalsIgnoreCase("")){
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println(fullName);
        }
        else if (suffix.equalsIgnoreCase("")){
            String fullName = firstName  + " " + lastName + "," + suffix ;
            System.out.println(fullName);
        }
        else{
            String fullName = firstName + " " + middleName + " " + lastName + ","+ suffix;
            System.out.println(fullName);
        }


    }
}
