class Solution {
    public int countDigits(int num) {
        int x = num;
        int count = 0;
        int d = 0;
        while(num != 0)
        {
            d = num%10;
            if(x % d == 0)
            {
                count++;
            }
            num = num/10;
        }
        return count;
    }
}