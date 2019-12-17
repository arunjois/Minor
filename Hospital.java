import java.util.Scanner;

public class Hospital {
	public static void print(int capacity[][],int n) {
		System.out.println("*********************************");
		System.out.println("Printing the matrix After Deduction");
		for (int p = 0; p < n; p++) {
			for (int q = 0; q < 2; q++)
				System.out.print(capacity[p][q] + "\t");
			System.out.println();
		}
		System.out.println("*********************************");
	}

	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		int capacity[][] = new int[n][2];
		System.out.println("Enter Matrix");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 2; j++)
				capacity[i][j] = sc.nextInt();
		while (true) {
			System.out.println("Enter C For Admit of Critical Paitent");
			System.out.println("Enter N For Admit of Non-Cricitcal Paitent");
			System.out.println("Enter P for priting of matrix");
			System.out.println("Enter E for Exit");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case 'c':
			case 'C':
				System.out.println("Enter the Hospital Number");
				int i = sc.nextInt();
				if (i != 0)
					i = i - 1;
				capacity[i][0] = capacity[i][0] - 1;
				print(capacity,n);
				break;
			case 'n':
			case 'N':
				System.out.println("Enter the Hospital Number");
				int j = sc.nextInt();
				if (j != 0)
					j = j - 1;
				capacity[j][1] = capacity[j][1] - 1;
				print(capacity,n);
				break;
			case 'p':
			case 'P':
				for (int p = 0; p < n; p++) {
					for (int q = 0; q < 2; q++)
						System.out.print(capacity[p][q] + "\t");
					System.out.println();
				}
				print(capacity,n);
				break;
			case 'e':
			case 'E':
				System.exit(0);
			}
		}
	}
}
