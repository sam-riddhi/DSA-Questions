class Solution {
    public int addDigits(int num) {
        //int x = num;
        int sum = 0;
        //int s = 0;
        if(num >= 0 && num <= 9)
        {
            return num;
        }
        while(num >= 10)
        {
            while(num != 0)
            {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if(sum > 9)
            {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}