package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void shouldSqr() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrCount(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSqr2() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.sqrCount(0, 199);
        assertEquals(expected, actual);
    }
}
