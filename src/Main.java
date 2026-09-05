import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter college name: ");
        String college = scanner.nextLine();

        System.out.print("Enter exam name: ");
        String examName = scanner.nextLine();

        Student student1 = new Student(name, rollNumber, college, examName);

        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name: " + student1.name);
        System.out.println("Roll Number: " + student1.rollNumber);
        System.out.println("College: " + student1.college);
        System.out.println("Exam: " + student1.examName);

        scanner.close();
    }
}