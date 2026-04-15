class Solution {
    public int solution(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c && b != c) {
            sum = a + b + c;
        }
        else if (a == b || a == c || b == c) {
            sum = (a + b + c) * (a*a + b*b + c*c);
        }
        if (a == b && b == c) {
            sum = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }

        return sum;
    }
}