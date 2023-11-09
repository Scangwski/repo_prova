package prova_progetto;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MyListUtilTest {
    private List<Integer> list;

    @Before
    public void setUp() {
        list = Arrays.asList(3, 1, 4, 1, 5, 9);
    }

    @Test
    public void testSortAscending() {
        DateTime start = new DateTime();
        System.out.println("Test Start: " + start.toString("yyyy-MM-dd HH:mm:ss"));
        
        List<Integer> sorted = MyListUtil.sort(list, MyListUtil.Order.ASCENDING);
        
        DateTime end = new DateTime();
        System.out.println("Test End: " + end.toString("yyyy-MM-dd HH:mm:ss"));
        
        assertEquals(Arrays.asList(1, 1, 3, 4, 5, 9), sorted);
    }

    @Test
    public void testSortDescending() {
        DateTime start = new DateTime();
        System.out.println("Test Start: " + start.toString("yyyy-MM-dd HH:mm:ss"));
        
        List<Integer> sorted = MyListUtil.sort(list, MyListUtil.Order.DESCENDING);
        
        DateTime end = new DateTime();
        System.out.println("Test End: " + end.toString("yyyy-MM-dd HH:mm:ss"));
        
        assertEquals(Arrays.asList(9, 5, 4, 3, 1, 1), sorted);
    }
}