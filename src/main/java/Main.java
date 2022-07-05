import model.ComputerScienceStudent;
import model.Student;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent csStudent = new ComputerScienceStudent("123", "Florian", "Java");
        System.out.println(csStudent.getCourse());
    }
}
