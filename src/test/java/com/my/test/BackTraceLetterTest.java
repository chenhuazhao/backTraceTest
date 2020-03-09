package com.my.test;

import org.junit.Test;

import java.util.*;

public class BackTraceLetterTest {

    @Test
    public void outLetterTest() {
        BackTraceLetter traceTest = new BackTraceLetter();
        String num = "91";
        int[] numArr = new int[]{8, 4};
        String outLetter = traceTest.letterCombinations(numArr);
        if (outLetter.equals("")) {
            outLetter = "have no letter";
        }
        System.out.println(outLetter);

    }


}
