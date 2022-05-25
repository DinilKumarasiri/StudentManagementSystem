package com.company;

import java.util.Scanner;

public class StudentRecordLinkedList {

    public static void main(String[] args) {
        StudentRecordManagement hr = new StudentRecordManagement();
        Record record = new Record();


        record.setIdNumber(354);
        record.setContactNumber(324);
        record.setName("dsfgs");

        hr.add(record);

        Scanner input = new Scanner(System.in);

        int option =0;

        do {
            menu();
            option = input.nextInt();

            switch(option){
                case 1:

                    // Display message
                    System.out.print(
                            "What is the Student id Number ? ");

                    int idNumber = input.nextInt();

                    // Display message
                    System.out.print(
                            "What is the Student contact Number ? ");

                    int contactNumber = input.nextInt();
                    input.nextLine();

                    // Display message
                    System.out.print(
                            "What is the Student Name ? ");

                    String name = input.nextLine();

                    // Create record object and pass constructor
                    // parameters.
                    record = new Record(name, idNumber,
                            contactNumber);
                    // Call add() record
                    hr.add(record);
                    System.out.println(record.toString());

                    // Break statement used to terminate program
                    // from here only once it entered this case
                    break;

                // Case 2
                case 2:

                    // Display message
                    System.out.print(
                            "What is the Student id number ? ");
                    int rId = input.nextInt();

                    // Invoke remove/delete record
                    hr.delete(rId);

                    break;

                // Case 3
                case 3:

                    // Display message
                    System.out.print(
                            "What is the Student id number? ");

                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);

                    break;

                // Case 4
                case 4:

                    // Display message
                    System.out.print(
                            "What is the Student id ? ");
                    int bookId = input.nextInt();

                    if (!hr.find(bookId)) {
                        System.out.println(
                                "Student id does not exist\n");
                    }

                    break;

                // Case 5
                case 5:
                    hr.display();
                    break;

                // Case 6
                case 9:

                    // Display message
                    System.out.println(
                            "\nThank you for using the program. Goodbye!\n");
                    System.exit(0);

                    break;

                // Case 7: Defualt case
                // If none above case executes
                default:

                    // Print statement
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }

        // Checking condition
        while (option != 9);
    }




    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Search Student");
        System.out.println("5. Display Student");
        System.out.println("6. Exit Program");
        System.out.println("Enter your selection : ");

    }
}
