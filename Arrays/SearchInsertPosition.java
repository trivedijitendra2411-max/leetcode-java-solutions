class Solution {
    public int searchInsert(int[] arr, int target) {
        int i;
        for(i=0;i<arr.length;i++){
        if(arr[i]>=target){
           return i;
        }   
        }
      return arr.length;
    }     
}
