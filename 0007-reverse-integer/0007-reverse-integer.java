class Solution {
    public int reverse(int x) {
        int rev=0;
        int n=Math.abs(x);
        while(n!=0){
            int dig=n%10;
            if(rev>(Integer.MAX_VALUE-dig)/10){
                return 0;
            }
            rev=rev*10+dig;
            n=n/10;
        }
       return (x<0)?(-rev):rev;
        
    }
}