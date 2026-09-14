import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("         WELCOME TO EXAMSMART");
        System.out.println("========================================");

        System.out.println("\n1. Institution Login");
        System.out.println("2. Student Login");
        System.out.println("3. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:

                System.out.println("\n===== INSTITUTION LOGIN =====");

                System.out.print("Enter institution name: ");
                String institutionName = sc.nextLine();

                System.out.print("Enter institution type (School/College): ");
                String institutionType = sc.nextLine();

                System.out.print("Enter institution code: ");
                String institutionCode = sc.nextLine();

                Institution institution = new Institution(
                        institutionName,
                        institutionType,
                        institutionCode
                );

                System.out.println("\nInstitution created successfully!");

                System.out.print("\nEnter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter date of birth (DD/MM/YYYY): ");
                String dateOfBirth = sc.nextLine();

                System.out.print("Enter student roll number: ");
                String rollNumber = sc.nextLine();

                Student student = new Student(
                        name,
                        dateOfBirth,
                        rollNumber,
                        institutionName,
                        institutionType
                );

                institution.addStudent(student);

                System.out.println("\nStudent added successfully!");

                System.out.println("\n===== STUDENT RECORD =====");
                System.out.println("Name             : " + student.name);
                System.out.println("Date of Birth    : " + student.dateOfBirth);
                System.out.println("Roll Number      : " + student.rollNumber);
                System.out.println("Institution      : " + institution.institutionName);
                System.out.println("Institution Type : " + institution.institutionType);

                break;

            case 2:

                System.out.println("\n===== STUDENT LOGIN =====");

                System.out.print("Enter institution name: ");
                String loginInstitution = sc.nextLine();

                System.out.print("Enter student name: ");
                String loginName = sc.nextLine();

                System.out.print("Enter date of birth (DD/MM/YYYY): ");
                String loginDob = sc.nextLine();

                System.out.println("\nStudent login feature will be connected to");
                System.out.println("the database and hall-ticket system.");

                break;

            case 3:

                System.out.println("\nThank you for using ExamSmart.");
                break;

            default:

                System.out.println("\nInvalid choice.");
        }

        sc.close();
    }
}