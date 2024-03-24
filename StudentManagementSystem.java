import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> studentList;

    // Constructor to initialize studentList
    public StudentManagementSystem() {
        studentList = new ArrayList<>();
    }

    // Method to add a new student to the system
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Method to view all students in the system
    public void viewAllStudents() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    // Method to search for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found:\n" + student.toString());
                return; // Exit the method after finding the student
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Method to update grade of a student by roll number
    public void updateGrade(int rollNumber, String newGrade) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                student.setGrade(newGrade);
                System.out.println("Grade updated successfully for Roll Number " + rollNumber);
                return; // Exit the method after updating grade
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Method to delete a student by roll number
    public void deleteStudent(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                studentList.remove(student);
                System.out.println("Student with Roll Number " + rollNumber + " deleted successfully.");
                return; // Exit the method after deleting student
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
}

