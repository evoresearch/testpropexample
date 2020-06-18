package evo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    BasicCalculator  basicCalculator = new BasicCalculator();
    @BeforeAll
    static void setUp(){

    }
    @Test
    void divide() {
        assertEquals(basicCalculator.divide(0,0),Double.NaN);
    }
}