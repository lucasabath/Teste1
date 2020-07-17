import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		int i = 0;
		int j = 0;

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();

		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j<2) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("up: " + mat[i - 1][j]);
					}
					if(i<2) {
						System.out.println("down: " + mat[i + 1][j]);
					}
				}

			}
		}

		sc.close();

	}

}
