package com.section18;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utils;

    @org.junit.Before
    public void setup(){
        utils = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        // Array result...using the AssertArrayEquals method
        char[] output = utils.everyNthChar(new char[] {'h', 'o', 'l', 'a'}, 2);
        assertArrayEquals(new char[] {'o', 'a'}, output);
        char[] output2 = utils.everyNthChar(new char[] {'h', 'o', 'l', 'a'}, 7);
        assertArrayEquals(new char[] {'h', 'o', 'l', 'a'}, output2);

    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull("Argument passed was null", utils.removePairs(null));
        assertEquals("A", utils.removePairs("A"));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utils.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException(){
        utils.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("even"));
    }
}