class Solution {
    private:
    long long reverse(int x){
        long long remainder=0;
        long long sum=0;
        while(x!=0){
            remainder=x%10;
            sum=remainder+sum*10;
            x/=10;
        }
        return sum;
    }
public:
    bool isPalindrome(int x) {
        long long rev= reverse(x);
        if(x<0) return false;
        if(rev==x){
            return true;
        }
        return false;
    }
};
