import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            list.get(11);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            System.out.println("Continue");
        }
    }
}
