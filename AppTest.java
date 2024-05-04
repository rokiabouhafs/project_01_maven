package exemple;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateSum() {
        assertEquals(15, App.calculateSum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-15, App.calculateSum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(0, App.calculateSum(new int[]{}));
    }
}
