
package com.vabi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(200, calculator.multiply(10, 20));
    }

//    @Test
//    void testAddition2() {
//        assertEquals(50, calculator.add(10, 20));
//    }
}
