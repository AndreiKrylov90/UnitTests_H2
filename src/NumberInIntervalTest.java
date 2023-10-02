import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberInIntervalTest {
    @Test
    void testNumberInIntervalLess25() {
        assertFalse(NumberInInterval.numberInInterval(4));
        assertFalse(NumberInInterval.numberInInterval(-25));
    }
    @Test
    void testNumberInIntervalMore100() {
        assertFalse(NumberInInterval.numberInInterval(156));
        assertFalse(NumberInInterval.numberInInterval(15648));
    }
    @Test
    void testNumberInIntervalAtMin() {
        assertFalse(NumberInInterval.numberInInterval(25));
    }
    @Test
    void testNumberInIntervalAtMax() {
        assertFalse(NumberInInterval.numberInInterval(100));
    }
    @Test
    void testNumberInIntervalinRange() {
        assertTrue(NumberInInterval.numberInInterval(26));
        assertTrue(NumberInInterval.numberInInterval(99));
    }
}
