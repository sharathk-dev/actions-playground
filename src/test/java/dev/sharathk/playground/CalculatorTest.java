package dev.sharathk.playground;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(3, calculator.divide(7, 2));
    }

    @Test
    void refusesToDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void takesModulo() {
        assertEquals(1, calculator.modulo(7, 3));
    }
}
