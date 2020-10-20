package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Валли";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());

    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        int currentTemperature = 19;
        int expected = 20;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        int currentTemperature = 19;
        int expected = 18;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        int currentTemperature = 5;
        int expected = 5;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        int currentTemperature = 30;
        int expected = 30;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void minTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        int currentTemperature = 4;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void maxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        int currentTemperature = 31;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}

