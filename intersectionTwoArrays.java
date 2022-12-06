import java.util.Arrays;
import java.util.HashSet;

public class intersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[]  nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for(int num : nums1){
            set1.add(num);
        }
        
        for(int num : nums2){
            if(set1.contains(num))
            {
                set2.add(num);
            }            
        }
        
        int[] result = new int[set2.size()];
        int i = 0;
        for(int num : set2){
            result[i++] = num;
        }
        return result;
    }
}
