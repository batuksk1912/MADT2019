package com.lambton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Test {

    private static Scanner i;

    public static void showMenu(){
        System.out.println("");
        System.out.println("0. Quit");
        System.out.println("1. Add Student");
        System.out.println("2. Add Faculty");
        System.out.println("3. Remove Student");
        System.out.println("4. Remove Faculty");
        System.out.println("5. List Student");
        System.out.println("6. List Faculty");
        System.out.println("7. List All");
        System.out.println("");
        System.out.println("Please enter your choice :");
    }

    public static void main(String[] args) {


        ArrayList<Person> myArr = new ArrayList<Person>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            showMenu();
            int choice;
            i = new Scanner(System.in);
            choice = i.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Do you want to exit ? (Y/N)");
                    String ex = scan.nextLine();
                    if (ex.equals("Y") || ex.equals("y")) {
                        i.close();
                        scan.close();
                        System.exit(0);
                    }
                    break;

                case 1 :
                    System.out.println("Please enter the student id :");
                    String id = scan.nextLine();
                    System.out.println("Please enter the student first name :");
                    String firstName = scan.nextLine();
                    System.out.println("Please enter the student gender :");
                    String gender = scan.nextLine();
                    System.out.println("Please enter the student last name :");
                    String lastName = scan.nextLine();
                    System.out.println("Please enter the student city :");
                    String city = scan.nextLine();
                    System.out.println("Please enter the course name :");
                    String courseName = scan.nextLine();
                    System.out.println("Please enter the result status :");
                    String result = scan.nextLine();
                    Integer idx = Integer.valueOf(id);
                    Student s = new Student(idx,firstName,gender,lastName,city,courseName,result);
                    myArr.add(s);
                    System.out.println("Student added successfully.");
                    break;

                case 2 :
                    System.out.println("Please enter the student id :");
                    String idf = scan.nextLine();
                    System.out.println("Please enter the student first name :");
                    String firstNamef = scan.nextLine();
                    System.out.println("Please enter the student gender :");
                    String genderf = scan.nextLine();
                    System.out.println("Please enter the student last name :");
                    String lastNamef = scan.nextLine();
                    System.out.println("Please enter the student city :");
                    String cityf = scan.nextLine();
                    System.out.println("Please enter the designation :");
                    String designation = scan.nextLine();
                    System.out.println("Please enter the specialization :");
                    String specialization = scan.nextLine();
                    System.out.println("Please enter the salary :");
                    String salary = scan.nextLine();
                    Integer idxx = Integer.valueOf(idf);
                    Float   salaryx = Float.valueOf(salary);
                    Faculty f = new Faculty(idxx,firstNamef,genderf,lastNamef,cityf,designation,specialization,salaryx);
                    myArr.add(f);
                    System.out.println("Faculty added successfully.");
                    break;

                case 3 :
                    System.out.println("Please enter the student first name :");
                    String searchString = scan.nextLine();
                    for( Iterator<Person> it = myArr.iterator() ; it.hasNext();)
                    {
                        Person ss = (Student) it.next();
                        if((ss.getFirstName().equals(searchString)))
                        {
                            if(ss instanceof Student)
                            {
                                it.remove();
                                System.out.println("Student removed successfully.");
                                break;
                            }
                        }
                    }
                    break;

                case 4 :
                    System.out.println("Please enter the instructors last name :");
                    String searchStringI = scan.nextLine();
                    for( Iterator<Person> it = myArr.iterator() ; it.hasNext();)
                    {
                        Person ff = (Faculty) it.next();
                        if(ff.getLastName().equals(searchStringI))
                        {
                            if(ff instanceof Faculty)
                            {
                                it.remove();
                                System.out.println("Faculty removed successfully.");
                                break;
                            }
                        }
                    }
                    break;

                case 5 :
                    System.out.println("");
                    System.out.println("**List of Students**");
                    for(Person p : myArr) {
                        if (p instanceof Student) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 6 :
                    System.out.println("");
                    System.out.println("**List of Faculties**");
                    for(Person pp : myArr) {
                        if (pp instanceof Faculty) {
                            System.out.println(pp);
                        }
                    }
                    break;

                case 7 :
                    System.out.println("");
                    System.out.println("**List of All**");
                    for(Person ppp : myArr) {
                        System.out.println(ppp);
                    }
                    break;
            }
                if (choice != 0) continue;
        }
    }
}
