package leetcode.easy;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class Pallindrome {

    /**
     * This below solution executes at 10 ms need
     * @param x
     * @return
     */
//    public boolean isPalindrome(int x) {
//            if(x<0)return false;
//            if (x<10) return true;
//            String input = String.valueOf(x);
//            String output = String.valueOf((new StringBuilder(input)).reverse());
//            return input.equals(output);
//    }

    /**
     * 10 ms processing speed
     * @param x
     * @return
     */
//    public boolean isPalindrome(int x) {
//
//        if(x<0)return false;
//        if (x<10) return true;
//        String input = String.valueOf(x);
//        for (int i=0;i<input.length()/2;i++)
//            if (input.charAt(i)!=input.charAt(input.length()-1-i))
//                return false;
//        return true;
//    }

    /**
     * 9ms processing speed best solution
     * integer processing is faster than string since int is primitive data type data is processed once
     * @param x
     * @return
     */
    public boolean isPalindrome(int x){
        if(x<0)return false;
        if (x<10) return true;
        int temp=x, reverse=0 ;
        while (x!=0){
            reverse=reverse*10+(x%10);
            x/=10;
        }
        if(reverse==temp) return true;
        return false;

    }

}
