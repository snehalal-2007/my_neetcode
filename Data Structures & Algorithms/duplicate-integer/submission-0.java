class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // empty hashset
        for (int num : nums) { // loops through the nums[]
            if (seen.contains(num)) { // checks if duplicate
                return true;
            }
            seen.add(num); // if no duplicate, adds to hash so we can check later
        }
        return false; // returns when no dup found
    }
}