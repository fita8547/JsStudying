class Solution {
    public int solution(int[] num_list) {
        int con = 1;   
        int sum = 0;   
        
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            con *= num_list[i];
        }
        
        if (con < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}