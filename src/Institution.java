import java.util.ArrayList;

public class Institution {

    String institutionName;
    String institutionType;
    String institutionCode;

    ArrayList<Student> students;

    public Institution(String institutionName, String institutionType,
                       String institutionCode) {

        this.institutionName = institutionName;
        this.institutionType = institutionType;
        this.institutionCode = institutionCode;

        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}