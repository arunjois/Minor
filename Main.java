import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) 
				mat[i][j] = sc.nextInt();
		HungarianAlgorithm h = new HungarianAlgorithm(mat);
		int[][] result = h.findOptimalAssignment();

		for(int i=0;i<result.length;i++) {
			for(int j=0;j<2;j++) 
				System.out.print(result[i][j]+"\t");

			System.out.println();
		}
	}
}

