package arrays;
/*
LeetCode: 3668. Restore Finishing Order
Difficulty: Easy
Topic: Stack
Time: O(n^2)
*/
public class RestoreFinishingOrder {
	
	 public int[] recoverOrder(int[] order, int[] friends) {
	        int[] ids = new int[friends.length];
	        int index = 0;

	        for(int i=0; i<order.length; i++){
	            for(int j=0; j<friends.length; j++){
	                if(order[i] == friends[j]){
	                    ids[index] = order[i] ;
	                    index++;
	                }
	            }
	        }
	        return ids;
	    }
}
