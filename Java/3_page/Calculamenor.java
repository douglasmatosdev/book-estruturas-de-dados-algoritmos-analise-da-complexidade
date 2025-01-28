class Calculamenor {

	public static void main(String[] args) {
		int [] list = {3, 2, 1};
		int menor = calculamenor(list, 3);
		System.out.println(menor);
	}
	
	static int calculamenor(int A[], int n) {
		int i, menor;

		menor = A[0];
		for (i = 1; i < n; i++) {
			if (A[i] < menor) {
				menor = A[i];
			}
		}
		return menor;
	}
}