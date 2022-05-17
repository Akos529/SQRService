package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void shouldCalculateNumberOfSQRInRange() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSQRInZeroRange() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 200;
        int expected = 0;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSQRWhenLowerLimitSameAsSQR() {
        SQRService service = new SQRService();
        int lowerLimit = 100;
        int upperLimit = 150;
        int expected = 3;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSQRWhenUpperLimitSameAsSQR() {
        SQRService service = new SQRService();
        int lowerLimit = 101;
        int upperLimit = 144;
        int expected = 2;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberOfSQRRangeUpsideDown() {
        SQRService service = new SQRService();
        int lowerLimit = 150;
        int upperLimit = 100;
        int expected = 0;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }
}
