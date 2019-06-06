import java.util.Random;

public class Adaline {

	Random r = new Random();
	double w[] = {r.nextDouble(), r.nextDouble()};
	double b = r.nextDouble();
	double a = 0.1, er1 = 1, er0 = 0;
	int aux = r.nextInt(2);
	
	
	public void teste(int x[][], int d[], int t) {
		if(aux==0)
			b=-b;
		int k=0;
		double y, aux1 = 1;
		double[] e = new double[4];
		while(aux1>0.0000001 && k<t) {
			er0 = er1;
			er1 = 0;
			for (int i = 0; i < x.length; i++) {
				y = Math.tanh(w[0]*x[i][0] + w[1]*x[i][1] + b); 
				e[i] = d[i] - y;
				er1 += Math.pow(e[i], 2);
				w[0] = w[0] + (a*e[i]*x[i][0]);
				w[1] = w[1] + (a*e[i]*x[i][1]);
				b = b + (a*e[i]);
				}
			
			System.out.println(k);
			k++;
			er1 = er1/x.length;
			aux1 = Math.abs(er1-er0);
			System.out.println(aux1);
		}
		
		System.out.println(w[0]+" "+w[1]+" "+b);
	}
}


