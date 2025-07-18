class Student{
String name="John Doe";
int rollNumber= 71;
char grade='S';
public void displayDetails(){
    System.out.println("Name: "+name);
    System.out.println("Roll Number: "+rollNumber);
    System.out.println("Grade: "+grade);
}
}
public class Main {

    // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details

    public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
        Student john = new Student();
        john.displayDetails();
    }
}
