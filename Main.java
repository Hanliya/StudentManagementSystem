public class Main {
    public static void main(String[] args) {
        // Create StudentManagementSystem object
        StudentManagementSystem sms = new StudentManagementSystem();

        // Add sample students
        Student student1 = new Student(101, "John Doe", "A");
        Student student2 = new Student(102, "Jane Smith", "B");
        sms.addStudent(student1);
        sms.addStudent(student2);

        // View all students
        System.out.println("All Students:");
        sms.viewAllStudents();

        // Search and update grade
        sms.searchByRollNumber(101);
        sms.updateGrade(101, "A+");
        sms.searchByRollNumber(101);

        // Delete student
        sms.deleteStudent(102);
        System.out.println("After deletion:");
        sms.viewAllStudents();
    }
}
