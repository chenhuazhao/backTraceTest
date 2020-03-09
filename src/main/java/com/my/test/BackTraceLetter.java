package com.my.test;

import java.util.*;

public class BackTraceLetter {
    //number map onto letter
    Map<String, String> map = new HashMap<String, String>() {{
        put("0", "");
        put("1", "");
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> out = new ArrayList<String>();

    //convert number to letter
    private void backtrack(String combination, String nums) {
        nums = nums.replace("0", "").replace("1", "");
        if (nums.length() == 0) {
            out.add(combination);
        } else {
            String num = nums.substring(0, 1);
            String letters = map.get(num);
            for (int i = 0; i < letters.length(); ++i) {
                String letter = letters.substring(i, i + 1);
                backtrack(combination + letter, nums.substring(1));
            }
        }
    }

    // out letter
    public String letterCombinations(String nums) {
        if (nums.length() != 0) {
            backtrack("", nums);
        }
        return out.toString().replace(",", "").replace("[", "").replace("]", "");
    }

    // out letter
    public String letterCombinations(int[] num) {

        String nums = Arrays.toString(num).replace("[", "").replace("]", "")
                .replace(",", "").replace(" ", "");
        if (nums.length() != 0) {
            backtrack("", nums);
        }
        return out.toString().replace(",", "").replace("[", "").replace("]", "");
    }

}
