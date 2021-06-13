import java.util.Scanner;

class Students {
    private String name, RollNo;
    private float marks, attendence;

    Students() {
        name = "Your Name Here";
        RollNo = "20XX12345";
        marks = 10;
        attendence = 10;
    }

    void setStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in the format(Name,RollNo,Marks,Attendance):");
        name = sc.next();
        RollNo = sc.next();
        marks = sc.nextFloat();
        attendence = sc.nextFloat();
    }

    void getStudent() {
        if (marks < 0) {
            marks = 0;
        }
        if (attendence > 75) {
            marks = (marks * 110) / 100;
        }
        if (marks > 100) {
            marks = 100;
        }
        System.out.println(name + " " + RollNo + " " + marks + " " + attendence);
    }
}

class StudentsTest {

    public static void main(String[] args) {

        Students S1 = new Students();
        Students S2 = new Students();

        S1.setStudent();
        S2.setStudent();
        S1.getStudent();
        S2.getStudent();
    }
}