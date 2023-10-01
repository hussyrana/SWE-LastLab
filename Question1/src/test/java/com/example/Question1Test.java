package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    @Test
    public void flattenArrayTest() {
        Question1 question1 = new Question1();
        int[][] twoDArray = {
                {1, 3},
                {0},
                {4, 5, 9}
        };

        int[] arr = question1.flattenArray(twoDArray);
        int[] expectedArr = {1,3,0,4,5,9};
        assertArrayEquals(expectedArr, arr);
    }
    @Test
    public void flattenArrayNullTest() {
        Question1 question1 = new Question1();
        int[] arr = question1.flattenArray(null);
        assertNull(arr);
    }
}