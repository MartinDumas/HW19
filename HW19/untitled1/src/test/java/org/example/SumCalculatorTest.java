package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private Sumcalculator sumcalculator;

    @BeforeEach
    public void setUp() {
        sumcalculator = new Sumcalculator();
    }
    @Test
    public void testSum() {
        int expected = 5;

        int result = sumcalculator.sum(2,3);

        assert result == expected;
    }
}
