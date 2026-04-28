import java.util.*;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        Boolean[]arr=new Boolean[nums.length];
        return helper(nums,arr,0);
    }

    public static boolean helper(int[]nums,Boolean []dp,int index){
        if(index>=nums.length)return false;
        if(index==nums.length-1)return true;
        if(dp[index]!=null)return dp[index];
        for(int jump=1;jump<=nums[index];jump++){
            if(helper(nums,dp,index+jump)){
                dp[index]=true;
                return true;
            }
        }
        dp[index]=false;
        return false;
    }
}
