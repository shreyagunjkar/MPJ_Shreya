import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int mark1, mark2, mark3, mark4, mark5;

    public Student(String name, int rollNo, int mark1, int mark2, int mark3, int mark4, int mark5) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
    }

    public double calculateAverage() {
        int sum = mark1 + mark2 + mark3 + mark4 + mark5;
        return sum / 5.0;
    }

    public char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 75)
            return 'A';
        else if (avg >= 60)
            return 'B';
        else
            return 'C';
    }

    public void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Average   : " + calculateAverage());
        System.out.println("Grade     : " + calculateGrade());
    }
}

public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        Student s = new Student(name, rollNo, m1, m2, m3, m4, m5);
        s.display();

        sc.close();
    }
}
