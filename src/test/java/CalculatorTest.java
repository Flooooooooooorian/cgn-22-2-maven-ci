import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        //GIVEN
        int a = 3;
        int b = 6;

        //WHEN
        int actual = Calculator.add(a, b);

        //THEN
        int expected = 9;
        assertEquals(expected, actual);
    }
}
