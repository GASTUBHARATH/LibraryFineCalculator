package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryFineCalculatorTest {

    LibraryFineCalculator calculator =
            new LibraryFineCalculator();

    @Test
    public void testCalculateFine() {
        assertEquals(50,
                calculator.calculateFine(10));
    }

    @Test
    public void testDiscount() {
        assertEquals(20,
                calculator.calculateDiscount(150));
    }

    @Test
    public void testTotalAmount() {
        assertEquals(130,
                calculator.calculateTotalAmount(30));
    }
}