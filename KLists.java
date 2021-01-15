import java.util.List;
public class KLists{
	public double[] mergeKLists (double[][] outerArray){
		double[] sorted = {};
		int i = 0;
		while(i < outerArray.length){
			double tempArr [] = new double[sorted.length + outerArray[i].length];
			merge(sorted, outerArray[i], tempArr);
			sorted = tempArr;
			i++;
		}
		return sorted;
	}
	public void merge(double[] left, double[] right, double[] target){
		int left_index = 0;
		int right_index = 0;
		int target_index = 0;

		//compares left array with right array (both sorted)
		while(left_index < left.length && right_index < right.length){
			if(left[left_index] > right[right_index]){
				target[target_index] = right[right_index];
				target_index++;
				right_index++;
			}
			else{
				target[target_index] = left[left_index];
				target_index++;
				left_index++;
			}
		}
		while(left_index< left.length){
			target[target_index] = left[left_index];
		target_index++;
		left_index++;
		}
		while(right_index < right.length){
			target[target_index] = right[right_index];
		target_index++;
		right_index++;
		}
	}

	public static void main(String[] args){
		KLists klist = new KLists();
		double[][] list = {{1.1,4.4,5.5},{1.1,3.3,4.4},{2.2,6.6},{1.1, 2.2}};
		double[] merged = klist.mergeKLists(list);

		for(int i=0; i<merged.length; i++){
     		System.out.println(merged[i]);
		}
		
	}
}