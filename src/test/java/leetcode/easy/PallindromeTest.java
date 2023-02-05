package leetcode.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PallindromeTest {
    private Pallindrome object;

    @Before
    public void init(){
        object= new Pallindrome();
    }

    @Test
    public void PallindromeCondition1(){
        assertTrue(this.object.isPalindrome(121));
    }

    @Test
    public void PallindromeCondition2(){
        assertFalse(this.object.isPalindrome(-121));
    }

    @Test
    public void PallindromeCondition3(){
        assertFalse(this.object.isPalindrome(10));
    }


}
