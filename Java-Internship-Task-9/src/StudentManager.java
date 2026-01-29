import java.util.*;

/*
 * Handles collection operations
 */
public class StudentManager {

    // ArrayList to store students
    private List<Student> studentList = new ArrayList<>();

    // HashMap for fast lookup
    private Map<Integer, Student> studentMap = new HashMap<>();

    // Add student
    public void addStudent(Student student) {
        studentList.add(student);
        studentMap.put(student.getId(), student);
    }

    // Remove duplicates using Set
    public void removeDuplicates() {
        Set<Student> uniqueStudents = new HashSet<>(studentList);
        studentList.clear();
        studentList.addAll(uniqueStudents);
    }

    // Sort students by marks using Comparator
    public void sortByMarks() {
        studentList.sort(Comparator.comparingInt(Student::getMarks).reversed());
    }

    // Get student by ID (HashMap lookup)
    public Student getStudentById(int id) {
        return studentMap.get(id);
    }

    // Display report
    public void printReport() {
        System.out.println("\n--- Student Report ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
