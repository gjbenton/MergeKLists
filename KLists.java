import java.util.List;
public class KLists{
	//double[][] klists= {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6,8.8}}; //8.8 doesn't belong but wanted to make it work with eqaul size strings
	public double[] mergeKLists (double[][] outerArray){
		//count will be used to get the size of the sorted array & increment target index
		//make a helper function (later)
		int count = 0;
		for(int i=0; i<outerArray.length; i++){
			for(int j=0; j<outerArray[i].length; j++){
				count += 1;
			}
		}
		//System.out.println("Count = " +count);
		
		double[] sorted = new double[count];
		int[] indexO = new int[outerArray.length];
		int target_index = 0;

		
		//while(sorted.length > target_index){
			// for(int i=0; i<indexO.length-1; i++){	
			// 	sorted[target_index] = getSortedIndex(outerArray, indexO);
			// 	target_index++;
			// }
		//}
		for(int i=0; i<indexO.length-1; i++){
			while(indexO[i] < outerArray[i].length && indexO[i+1] < outerArray[i+1].length)	
				//if(outerArray[i].length)
				sorted[target_index] = getSortedIndex(outerArray, indexO, i);
				target_index++;
			}
		
			// while(outerArray[i].length > indexO[i] && outerArray[i+1].length > indexO[i]){
			// if(outerArray[i][i]< outerArray[i+1][i]){
			// 	//smallest = outerArray[i][i];
			// 	sorted[target_index] = outerArray[i][i];
			// }
			// indexO[i] +=1;
			// target_index++;

			// }
		return sorted;
	}
	public double getSortedIndex(double[][] outerArray, int[] indexO, int k){
		//int k=0;
		double smallest= outerArray[0][indexO[0]];
		for(int i=0; i<indexO.length; i++){
			if(indexO[i] < outerArray[i].length && outerArray[i][indexO[i]]< smallest)
				smallest = outerArray[i][indexO[i]];	
		}
		//k++;
		return smallest;
	}
	// public String toString(){
	// 	String output =" ";
	// 	for(int i=0; i<klists.length; i++){
	// 		output += "[";
	// 		for(int j=0; j<klists.length; j++){
	// 			output += klists[i][j];
	// 			if(j!= klists[i].length-1)
	// 				output += ", ";
	// 		}
	// 		output += "]";
	// 	}
	// 	return output;
	// }
	public static void main(String[] args){
		KLists klist = new KLists();
		double[][] list = {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6,8.8}};
		double[] merged = klist.mergeKLists(list);

		for(int i=0; i<merged.length; i++){
     		System.out.println(merged[i]);
		}
		
	}
}