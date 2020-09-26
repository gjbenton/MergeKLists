import java.util.List;
public class KLists{
	//double[][] klists= {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6,8.8}}; //8.8 doesn't belong but wanted to make it work with eqaul size strings

	public double[] mergeKLists (double[][] outerArray){
		//count will be used to get the size of the sorted array & increment target index
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

		for(int i=0; i<indexO.length-1; i++){
			while(outerArray[i].length > indexO[i] && outerArray[i+1].length > indexO[i]){
				if(outerArray[i][i]< outerArray[i+1][i]){
					//smallest = outerArray[i][i];
					sorted[target_index] = outerArray[i][i];
				}
				indexO[i] +=1;
				target_index++;

			}
		}
		
		/*
		Loop through the first item of every inner array
		Compare and identify the smallest value, assign it to sorted
		*/
		// for(int i=0; i<outerArray.length-1;i++){
		// 	int j=0;
		// 	if(outerArray[i][j]< outerArray[i+1][j])
		// 		smallest = outerArray[i][j] ;
		// }
		return sorted;
	}
	public double sortedIndex(double[][] outerArray, int[] index0){
		double smallest= outerArray[0][0];
		for(int i=0; i<indexO.length; i++){
			if(index[i] < outerArray[i].length && outerArray[i][index[i]]< smallest)
				smallest = outerArray[i][index[i]];
		}
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