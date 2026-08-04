import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
    int ip = 0;
    for(int i = 0; i <nums.length; i++) {
        if(nums[i] != 0) {
            nums[ip] = nums[i];
            ip++;
        }
    } 
    while(ip < nums.length) {
        nums[ip] = 0;
        ip++;
    }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,0,3,12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}