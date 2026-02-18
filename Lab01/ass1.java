import java.util.Scanner;

public class ass1 {

    static class Student {
        private String name;
        private int rollNo;
        private int[] marks;
        private double average;
        private char grade;

        public Student(String name, int rollNo, int[] marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        public void avg() {
            int total = 0;
            for (int i = 0; i < marks.length; i++) {
                total += marks[i];
            }
            average = total / 5.0;
        }

        public void grade() {
            if (average >= 75)
                grade = 'A';
            else if (average >= 50)
                grade = 'B';
            else
                grade = 'C';
        }

        public void display() {
            System.out.println("\nStudent Details: \n");
            System.out.println("Name    : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.println("Average : " + average);
            System.out.println("Grade   : " + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int j = 0; j < n; j++) {
            System.out.println("\nEnter details for student " + (j + 1));

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            int[] marks = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
            sc.nextLine();

            
            students[j] = new Student(name, rollNo, marks);
            students[j].avg();
            students[j].grade();
        }

        
        System.out.println("\nStudent List: \n");
        for (int j = 0; j < n; j++) {
            students[j].display();
        }

        sc.close();
    }
}


