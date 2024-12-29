import java.util.Objects;

public class Student {
    String name;
    String faculty;
    int years;

    public Student(String name, String faculty, int years) {
        this.name = name;
        this.faculty = faculty;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", years=" + years +
                '}';
    }
}
