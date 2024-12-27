package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalcTest {

    private SumCalc calc;

    @BeforeEach
    public void setUp() {
        calc = new SumCalc();
    }

    @Test
    public void testSum() {

        int expectedSum = 3;
        int sum = calc.sum(1, 2);

        assert sum == expectedSum;

    }
}
