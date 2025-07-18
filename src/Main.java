class Student{
string name="John Doe";
int rollNumber= 71;
char grade='S';
public void displayDetails(){
    System.out.println("Name: "+name);
    System.out.println("Roll Number: "+rollNumber);
    System.out.println("Grade: "+grade);
}
}
public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        john.displayDetails();
    }
}
