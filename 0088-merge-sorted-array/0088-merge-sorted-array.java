class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
             // Start from the end of nums1 and nums2
        int p1 = m - 1; // Last valid element in nums1
        int p2 = n - 1; // Last element in nums2
        int p = m + n - 1; // Last position in nums1

        // Merge nums2 into nums1 from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are still elements left in nums2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
}
}