class Student{
    String name;
    int rollNumber;
    char grade;
    public void displayDetails(){
        System.out.printf("Name: "+name);
        System.out.printf("Roll Number: "+rollNumber);
        System.out.printf("Grade: "+grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
