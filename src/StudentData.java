import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();

        /*while true results in an infinite loop with the 'Done' keyword to exit the loop
        * name is scanned
        * address is scanned
        * and GPA is verified using a while and if loop */
        while (true) {
            System.out.println("Please enter student information. (Press 'Done' to exit)");
            System.out.println("Starting with \nName: ");

            String name = scnr.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Please enter the Student's address: \nAddress:");
            String address = scnr.nextLine();

            double GPA = 0.0;
            boolean validGPA = false;
            while (!validGPA) {
                System.out.print("GPA: ");
                try {
                    GPA = Double.parseDouble(scnr.nextLine());
                    if (GPA >= 0 && GPA <= 4.0) {
                        validGPA = true;
                    } else {
                        System.out.println("GPA must be between 0.0 and 4.0.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid GPA format. Please enter a number.");
                }
            }
            Student student = new Student(name, address, GPA);  /*new Student object
            created with the parameters from the inputs*/
            students.add(student); // new student object is added to LinkedList 'students'

            }

        System.out.println(students); //used to verify student objects created without sorting
        Collections.sort(students, new NameComparator()); //used to sort
        System.out.println(students);//used to verify students after sorting

        //this is the file writer to the 'Student.txt'
        try {
            FileWriter writer = new FileWriter("Student.txt");
            for (Student student : students) {
                writer.write("Name: " + student.getName());
                writer.write("\nAddress: " + student.getAddress());
                writer.write("\nGPA: " + student.getGPA());
                writer.write("--- \n\n"); // Separator for readability
            }
            writer.close();
        }
        catch (IOException e) {e.printStackTrace();}

        scnr.close();
        }


    }
