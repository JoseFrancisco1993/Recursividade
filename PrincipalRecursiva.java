package Colevati;

public class PrincipalRecursiva {

	public static void main(String[] args) {
		Fatorial n = new Fatorial ();
		int resposta = n.fatorial(5);
		System.out.println(resposta);
		}
	public int fatorial (int i) {
		//condição de parada
		if (i == 0) 
			return 1;
		else {
		return (i * fatorial (i-1));
		}
}
}