
public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,8,19,6,7};
		longestIncreasingSubstring(array, array.length);
	}
	
	public static void longestIncreasingSubstring(int[] array, int n){
		int result = 0;
		int[] LISArray = new int[n];
		
		/* Initialize LISArray to hold at least 1*/
		for(int i : LISArray)
			LISArray[i] = 1;
		
		for(int i = 1; i < n; i++)
			for(int j = 0; j < i; j++){
				if(array[i] > array [j] 
						&& LISArray[i] < LISArray[j] + 1)
					LISArray[i] = LISArray[j] + 1;
			}
		
		
		/* Find the index in LISArray holding the highest LIS*/
		for(int k : LISArray){
			if(result < LISArray[k])
			result = LISArray[k];
		}
		
		System.out.println("The longest insreasing substring is " + result);
	}

}
