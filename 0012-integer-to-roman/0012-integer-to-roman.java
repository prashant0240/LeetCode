class Solution {
    public String intToRoman(int num) {
        String [] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ans = "";
        int i=0;
        while(num>0){
            if(num>=value[i]){
                ans = ans + str[i];
                num = num-value[i];
            }else{
                i++;
            }
        }
        return ans;
    }
}