
public class MCP {

	public static void main(String[] args) {
		int[][] array = {{1,2,3},
						{4,5,6},
						{3,2,1}};
		System.out.printf("The minmum cost from origin to (2,2) of array\n1,2,3\n4,5,6\n3,2,1\nis %d",minCost(array, 2, 2, 2, 2));

	}
	/* Build minCost at every point from bottom up */
	public static int minCost(int[][] array, int m, int n, int x, int y){
		int totalCost[][] = new int[3][3];
		totalCost[0][0] = array[0][0];
		//Fill first row
		for(int i = 1; i <= m; i++)
			totalCost[i][0] = totalCost[i - 1][0]+ array[i][0];
		//Fill first column
		for(int j = 1;j <= n;j++)
			totalCost[0][j] = totalCost[0][j - 1] + array[0][j];
		//Fill rest of columns
		for(int i = 1;i <= m; i++)
			for(int j = 1; j <= n; j++)
				totalCost[i][j] = min(totalCost[i -1][j], totalCost[i][j - 1], totalCost[i - 1][j - 1]) + array[i][j];
			
		
		return totalCost[x][y];
	}
	/* Utility function */
	public static int min(int x, int y, int z){
		if(x < y)
			return (x < z)? x : z;
		else
			return (y < z)? y : z;
	}

}
