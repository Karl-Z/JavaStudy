import java.util.ArrayList;
import java.util.List;
import static debug.Debug.debug;
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
            debug("list size: " + list.size());
            throw e;
        }
    }
}
