class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int len =0;
        Set<Character> charSet = new HashSet<>();
        
        for(int right = 0; right < n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                len = Math.max(len, right-left+1);
            }else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return len;
    }
}