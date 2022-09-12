package ru.netology.javaqa.javaqamvn.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testbetweenrealvalues() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 200);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testbetweenunrealvalues() {
        SQRService service = new SQRService();
        int actual = service.calculate(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }
}

