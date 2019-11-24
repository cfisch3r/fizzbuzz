package de.agiledojo.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shallReturnNumberForANumber() {
        String answer = fizzBuzz.nextTurn(1);
        assertEquals("1",answer);
    }

    @ParameterizedTest
    @ValueSource(ints = { 3,6,9})
    void shallReturnFizzForNumberWithDivisor3(int number) {
        String answer = fizzBuzz.nextTurn(number);
        assertEquals("fizz",answer);
    }

    @ParameterizedTest
    @ValueSource(ints = { 5,10,20})
    void shallReturnBuzzForNumberWithDivisor5(int number) {
        String answer = fizzBuzz.nextTurn(number);
        assertEquals("buzz",answer);
    }

    @ParameterizedTest
    @ValueSource(ints = { 15,30,45})
    void shallReturnFizzBuzzForNumberWithDivisor3And5(int number) {
        String answer = fizzBuzz.nextTurn(number);
        assertEquals("fizzbuzz",answer);
    }
}
