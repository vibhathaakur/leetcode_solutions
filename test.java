class Solution {
    
    private int translate(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        int curr= translate(s.charAt(0));

        for(int i=1; i<s.length(); i++){
             
             int next= translate(s.charAt(i));

             if(curr<next)
                sum-=curr;
    
             else
             sum+=curr;
             curr=next;
        }
        sum+=curr;
        return sum;
    }
}
