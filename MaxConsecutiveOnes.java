public class MaxConsecutiveOnes {

    // Function to find the maximum number of consecutive 1's
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // To store the maximum count of consecutive 1s
        int currentCount = 0; // To track the ongoing streak of 1s

        // Iterate through the array
        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increment the streak
                maxCount = Math.max(maxCount, currentCount); // Update maxCount if needed
            } else {
                currentCount = 0; // Reset the streak if we encounter a 0
            }
        }

        return maxCount; // Return the maximum count
    }

    // Main method
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive 1's: " + findMaxConsecutiveOnes(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Maximum consecutive 1's: " + findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
