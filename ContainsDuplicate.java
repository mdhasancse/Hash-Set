import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hmap = new HashSet();
       for (int i : nums)
       {
           // iterate over elements is already in hasset
           if(hmap.contains(i))
           {
               return true;
           }else{
               //add the number to the hasset
               hmap.add(i);
           }
       }
        return false;
    }
}
