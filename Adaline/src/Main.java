
public class Main {

	public static void main(String[] args) {
		
		int[] d = {1, -1, -1, -1};
		int[][] x = {{1,1},{1,0},{0,1},{0,0}};
		int epoca = 10000;
		
		Adaline a = new Adaline();
		a.teste(x, d, epoca);

	}

}
