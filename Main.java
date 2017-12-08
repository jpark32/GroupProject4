package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static employee setter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = input.next();
        System.out.print("Enter your last name: ");
        String lastname = input.next();
        System.out.print("Enter your gender: ");
        String gender = input.next();
        gender = gender.toLowerCase();
        if (!gender.equals("male") && !gender.equals("female")) {
            do {
                System.out.println("Invalid, enter either male or female: ");
                gender = input.next();
            } while (!gender.equals("male") && !gender.equals("female"));
        }

        byte count = 1;
        employee emp = new employee(firstname, lastname, gender, count);
        String[] position = new String[]{"Store Manager", "Branch Manager", "Executive VP", "Register"};
        int index = (new Random()).nextInt(position.length);
        System.out.println(position[index]);
        String job = position[index];
        int salary;

    return emp;
    }

    public static void main(String[] args)
    {
        //  ExecutiveVP evp=new ExecutiveVP("Test", "Test1", "", 0);
        //  evp.returnSalary();
        // evp.hasBenefit();

        int random = (int )(Math. random() * 4 + 1);

        employee emp = setter();

        System.out.println(emp.getName());

        switch (random){
            case 1:
                Register reg = new Register(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                break;
            case 2:
                StoreManager sm = new StoreManager(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                break;
            case 3:
                BranchManager bm = new BranchManager(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                break;
            case 4:
                ExecutiveVP vp = new ExecutiveVP(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                break;
            default:

                break;
        }




        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Level Number from 1 and 4: ");

        String employeeLevel = input.nextLine();

        System.out.println(employeeLevel);

    }





}
