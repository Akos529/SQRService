package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void shouldCalculateSQR() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;

        int actual = service.sqrCount(lowerLimit, upperLimit);
        assertEquals(expected, actual);
    }

}
