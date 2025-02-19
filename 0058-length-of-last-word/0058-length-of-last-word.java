class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count =0 ;

        while(s.charAt(n-1) == ' ' && n>0){
            n--;
        }
        while(n> 0 && s.charAt(n-1) != ' '){
            count++;
            n--;
        }
        return count;
    }
}