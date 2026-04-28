import java.util.*;
public class JumpGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;
        int jumps = 0;
        int currEnd = 0;
        int maxReach = 0;
        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = maxReach;
                if (currEnd >= n - 1) break;
            }
        }
        return jumps;
    }
}
