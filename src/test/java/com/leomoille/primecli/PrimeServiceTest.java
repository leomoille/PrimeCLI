package com.leomoille.primecli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeServiceTest {

    private final PrimeService service = new PrimeService();

    @Test
    public void testIsPrime() {
        assertTrue(service.isPrime(2));
        assertTrue(service.isPrime(13));
        assertFalse(service.isPrime(1));
        assertFalse(service.isPrime(9));
    }
}
