package com.example.demo;

import org.omg.CORBA.PERSIST_STORE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecurityTesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your person");

        SecurityTesting securityTesting = new SecurityTesting();

        List<Person> names = new ArrayList<>();

        names.add(new Person("Simba", 77, new int[]{1, 2, 3, 4}));
        names.add(new Person("Nick", 88, new int[]{1, 2, 3}));
        names.add(new Person("Jessica", 99, new int[]{1, 2, 3}));
        names.add(new Person("Mohamed", 66, new int[]{1, 2, 3}));


        String name;
        Person selectedPerson = null;         // nazvanie, spisok pust poka
        do {
            name = scanner.nextLine();

            for (Person person : names) {          // peredajem znachenie k person spisku?
                if (person.getName().equals(name)) {
                    selectedPerson = person;              //
                }
            }

            if (selectedPerson == null) {
                System.out.println("Incorrect name, please try again");
            }
        } while (selectedPerson == null);

        System.out.println("Select floor which you want to access");   // next class?
        int floor = Integer.parseInt(scanner.nextLine());        //   next line - poka ne nazhmjeshj enter
        if (securityTesting.checkAccess(selectedPerson, floor)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied. Try again");
            scanner.next();
        }


    }

    public boolean checkAccess(Person person, int floor) {   //loop in the loop?
        for (int accessible : person.getAccess()) {
            if (accessible == floor) {
                return true;
            }
        }
        return false;
    }


}
