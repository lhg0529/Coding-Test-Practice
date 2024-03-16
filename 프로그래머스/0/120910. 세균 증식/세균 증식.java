class Solution {
    public int solution(int n, int t) { //n:세균, t:경과한 시간
        int count =1;
        for(int i=0; i<t;i++){
            count=count*2;
        }
        return n*count;
    }
}