import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {
    @Test
    void testEvenOddNumberWithEven() {
        assertTrue(EvenOddNumber.evenOddNumber(4));
        assertTrue(EvenOddNumber.evenOddNumber(0));
    }

    @Test
    void testEvenOddNumberWithOdd() {
        assertFalse(EvenOddNumber.evenOddNumber(5));
        assertFalse(EvenOddNumber.evenOddNumber(-17));

    }

    @Test
    void testEvenOddNumberWithZero() {
        assertTrue(EvenOddNumber.evenOddNumber(0));
    }

}
