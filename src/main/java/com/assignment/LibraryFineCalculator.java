package com.assignment;

public class LibraryFineCalculator {

    public int calculateFine(int daysLate) {
        return daysLate * 5;
    }

    public int calculateDiscount(int fine) {
        if (fine > 100) {
            return 20;
        }
        return 0;
    }

    public int calculateTotalAmount(int daysLate) {
        int fine = calculateFine(daysLate);
        return fine - calculateDiscount(fine);
    }
}