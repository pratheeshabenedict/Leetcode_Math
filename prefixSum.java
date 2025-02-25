class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddCount = 0, evenCount = 1; // evenCount starts at 1 (for initial sum=0)
        int prefixSum = 0, result = 0, MOD = 1000000007;
        
        for (int num : arr) {
            prefixSum += num;
            
            // Check the parity of prefixSum
            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++; // Increment even prefix count
            } else {
                result = (result + evenCount) % MOD;
                oddCount++; // Increment odd prefix count
            }
        }
        
        return result;
    }
}
