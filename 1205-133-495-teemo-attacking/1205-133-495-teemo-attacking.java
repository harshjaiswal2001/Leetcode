class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = duration ;
        for (int i = 1 ; i < timeSeries.length ; i++){
        int x =duration + timeSeries[i-1];
         if(timeSeries[i] <= x){
            count = count - (x - timeSeries[i]);
         }
         count = count + duration ; 
        }
        return count ;
    }
}