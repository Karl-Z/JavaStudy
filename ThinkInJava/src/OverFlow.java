import java.util.ArrayList;
import java.util.List;

/**
 * Created by azzhangc on 14/4/2016.
 */

public class OverFlow {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("Out of memory soon");
            }
        } catch (OutOfMemoryError e) {
            System.err.println("list size: " + list.size());
            throw e;
        }
    }
}
