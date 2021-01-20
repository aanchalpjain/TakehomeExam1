package random;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumber {

	public static void main(String[] args) {
		int lenght = 500;
		int[] Array;
		 Array = new int[lenght];
		Random rand = new Random();

		for (int i = 0; i < lenght - 1; i++) {

			Array[i] = rand.nextInt(501);
		}

		System.out.println("Actual Array[] : " + Arrays.toString(Array));

		Arrays.sort(Array);
		
		System.out.println("Modified Array[] : " + Arrays.toString(Array));

		System.out.println("which smallest number do you want to print?");
		Scanner userIn = new Scanner(System.in);
		int N = userIn.nextInt();
		System.out.println(Array[N - 1]);
	}

}
