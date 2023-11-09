package prova_progetto;

import java.util.Collections;
import java.util.List;

public class MyListUtil {
    public enum Order {
        ASCENDING, DESCENDING
    }
    
    public static List<Integer> sort(List<Integer> list, Order order) {
        if (order == Order.ASCENDING) {
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }
        return list;
    }
}