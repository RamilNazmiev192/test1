import java.util.Objects;

public class FacultyYearKey {
    private final String faculty;
    private final int year;

    public FacultyYearKey(String faculty, int year) {
        this.faculty = faculty;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FacultyYearKey that = (FacultyYearKey) o;
        return year == that.year && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, year);
    }

    @Override
    public String toString() {
        return faculty + " " + year;
    }
}
