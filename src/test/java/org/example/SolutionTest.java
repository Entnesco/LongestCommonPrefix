package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testFl(){
        var solution = new Solution();
        assertEquals("fl",solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    @Test
    void testnull(){
        var solution = new Solution();
        assertEquals("",solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
    @Test
    void testopa(){
        var solution = new Solution();
        assertEquals("opa",solution.longestCommonPrefix(new String[]{"opatopa","opawopa","opatopas"}));
    }
    @Test
    void testa(){
        var solution = new Solution();
        assertEquals("a",solution.longestCommonPrefix(new String[]{"abc","ab","a"}));
    }

}