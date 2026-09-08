class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] >= prices[i]) {
                int prevIndex = st.pop();
                ans[prevIndex] -= prices[i];
            }
            st.push(i);
        }
        return ans;
    }
}