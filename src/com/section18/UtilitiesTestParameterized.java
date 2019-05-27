package com.section18;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities utils;

    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    // new instance of utilities class
    @org.junit.Before
    public void setup(){
        utils = new Utilities();
    }

    // return collection
    @Parameterized.Parameters
    public static List<Object[]> testCondition(){
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"A", "A"}
        });
    }

    // gives result of the parameterized test conditions
    @org.junit.Test
    public void removePairs(){
        assertEquals(output, utils.removePairs(input));
    }
}
