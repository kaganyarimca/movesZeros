import java.util.*;

public class Main {

	static void siralama2(int dizi[], int n) {
		int sayaç = 0; // 0 olmayan için yazıldı.

		// sayıları gezer, sıfır değilse o sayıyla yer değiştirir.
		for (int i = 0; i < n; i++)
			if (dizi[i] != 0)
				dizi[sayaç++] = dizi[i];

			
		while (sayaç < n)  // 0 olmayanlar bir önceki indexe kaydı.
			dizi[sayaç++] = 0;
	}

	public static void main(String[] args) {

		int numbers[] = { 33, 51, 0, 0, 18, 90, 78, 0, 7, 0, 1, 9 };
		// System.out.println("verilen sayı dizisi:" + numbers[] );
		int n = numbers.length;
		siralama2(numbers, n);
		System.out.println("Sıfırlar sona atıldıktan sonra:  ");
		for (int i = 0; i < n; i++)
			System.out.print(numbers[i] + " ");
	}

}
