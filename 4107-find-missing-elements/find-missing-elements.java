import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}