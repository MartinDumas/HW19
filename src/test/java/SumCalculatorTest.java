import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testWithInputValue1(){
        int expected = 1;

        int result = sumCalculator.sum(1);

        assertEquals(expected, result);
    }

    @Test
    void testWithInputValue3(){
        int expected = 6;

        int result = sumCalculator.sum(3);

        assertEquals(expected, result);
    }

    @Test
    void testWithInputValue0(){
        assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(0));
    }



}