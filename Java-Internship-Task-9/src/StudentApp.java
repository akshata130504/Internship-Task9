/*
 * Main application class
 */
public class StudentApp {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        // Adding students (including duplicate)
        manager.addStudent(new Student(1, "Akshu", 85));
        manager.addStudent(new Student(2, "Riya", 92));
        manager.addStudent(new Student(3, "Anu", 78));
        manager.addStudent(new Student(1, "Akshu", 85)); // duplicate

        // Remove duplicates
        manager.removeDuplicates();

        // Sort by marks
        manager.sortByMarks();

        // Print report
        manager.printReport();

        // HashMap fast lookup
        System.out.println("\nSearching for student with ID 2:");
        System.out.println(manager.getStudentById(2));
    }
}
