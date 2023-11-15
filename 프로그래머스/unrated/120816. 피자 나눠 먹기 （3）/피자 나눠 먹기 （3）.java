class Solution {
    public int solution(int slice, int n) {
        int a = n/slice;
        if(n%slice!=0){
            a+=1;
        }
        return a;
    }
}