package leetcode.easy;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


@RunWith(JUnit4.class)
public class TwoSumTest {
    private TwoSum ts;
    private int[] result;


    @Before
    public void init(){
        this.ts=new TwoSum();
        this.result=new int[]{-1,-1};
    }
    @Test
    public void twoSumCondition1(){
        this.result=this.ts.solution(new int[]{2,7,11,15},9 );
        Arrays.sort(this.result);
        assertArrayEquals(new int[]{0,1},this.result);
    }
    @Test
    public void twoSumCondition2(){
        this.result=this.ts.solution(new int[]{3,2,4},6 );
        Arrays.sort(this.result);
        assertArrayEquals(new int[]{1,2},this.result);
    }

    @Test
    public void twoSumCondition3 (){
        this.result=this.ts.solution(new int[]{3,3},6 );
        Arrays.sort(this.result);
        assertArrayEquals(new int[]{0,1},this.result);
    }


}
