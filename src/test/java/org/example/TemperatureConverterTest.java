package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Starting to test TemperatureConverter");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Finished testing TemperatureConverter");
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 1e-9);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0), 1e-9);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40.0), 1e-9);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 1e-9);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0), 1e-9);
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40.0), 1e-9);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-41.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(-40.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(50.0));
        assertTrue(TemperatureConverter.isExtremeTemperature(51.0));
    }

    @Test
    void nullInputsThrowNullPointer() {
        Double nullDouble = null;
        assertThrows(NullPointerException.class, () -> TemperatureConverter.fahrenheitToCelsius(nullDouble));
        assertThrows(NullPointerException.class, () -> TemperatureConverter.celsiusToFahrenheit(nullDouble));
        assertThrows(NullPointerException.class, () -> TemperatureConverter.isExtremeTemperature(nullDouble));
    }
}