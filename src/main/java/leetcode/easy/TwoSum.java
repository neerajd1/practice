package leetcode.easy;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 *
 */


public class TwoSum {

    private HashMap<Integer,Integer> differenceMap;
    int [] result;

    public TwoSum(){
        this.result = new int[]{-1,-1};
        this.differenceMap=new HashMap<Integer,Integer>();
    }

    public int[] solution(int [] nums , int target){
        for (int i=0 ; i<nums.length ;i++){
            if(this.differenceMap.containsKey(nums[i])){
                this.setResult(this.differenceMap.get(nums[i]),i);
                return this.getResult();
            }else{

                this.differenceMap.put(target-nums[i],i);
                System.out.println(this.differenceMap);
            }
        }
        return this.getResult();
    }
    private int[] getResult() {
        return this.result;
    }
    private void setResult(int firstIndex, int secondIndex){
        this.result[0]= firstIndex;
        this.result[1]=secondIndex;
    }

}
