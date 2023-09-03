import java.util.Arrays;

public class SumArray{
    public static void main(String[] args) {
        
        int nums[] = {1,3,10,2};

        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}   