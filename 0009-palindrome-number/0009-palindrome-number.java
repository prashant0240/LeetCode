class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a= 0;
        int temp = x;
        while(temp > 0){
            a = a*10 + (temp%10);
            temp = temp/10;
        }
        return (x == a);
    }
}