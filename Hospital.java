import java.util.Scanner;
public class Hospital {
	public static void main(String args[]) {
		int capacity[][] = new int[3][2];
		System.out.println("Enter Matrix");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
				capacity[i][j] = sc.nextInt();
		while(true) {
			System.out.println("Enter the Status of Paitent(C/N):" );
			System.out.println("Enter P for priting of matrix");
			char ch = sc.next().charAt(0);
			switch(ch) {
				case 'c':
				case 'C' :capacity[0][0]=capacity[0][0]-1;
				break;
				case 'n':
				case 'N' :capacity[0][1]=capacity[0][1]-1;
				break;
				case 'p':
				case 'P': 
				for(int i=0;i<3;i++) {
					for(int j=0;j<2;j++) 
						System.out.print(capacity[i][j]+"\t");	
					System.out.println();
				}
				break;
				case 'e':
				case 'E':
				System.exit(0);
			}
		}		
	}
}
