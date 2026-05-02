class Solution {
    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int c = 0;
        for(int i = 1; i <= g; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                c++;
            }
        }
       return c;
    }
    public int gcd(int m, int n)
    {
        while(n != 0)
        {
            int temp = n;
            n = m % n;
            m = temp;
        }   
        return m;
    }
}