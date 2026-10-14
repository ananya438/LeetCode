class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }
        int revNum = 0;
        int n = x;
        while(n>0){
            int lastDigit = n%10;
            revNum = (revNum *10)+lastDigit;
            n = n/10;
        }
        return x==revNum;
    }
}