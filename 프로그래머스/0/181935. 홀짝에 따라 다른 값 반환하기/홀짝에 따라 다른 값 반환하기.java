class Solution {
    public int solution(int n) {
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += i * i;  // 짝수 → 제곱
            } else {
                odd += i;       // 홀수 → 그대로
            }
        }

        if (n % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }
}