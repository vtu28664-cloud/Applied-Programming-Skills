class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();

        // Process nums2 to find the next greater element for each number
        for (int x : nums2) {
            while (!st.isEmpty() && st.peek() < x) {
                map.put(st.pop(), x);
            }
            st.push(x);
        }

        // Remaining elements in stack have no next greater element
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        // Build the result for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}