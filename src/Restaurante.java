
public class Restaurante {

	static final int tam= 3;
	static Pratos prato[] = new Pratos[tam];
	static int indice = 0;
	
	private static void mostrarCardapio() {
		for(int k=0 ; k<indice ; k++)
			System.out.println(prato[k].toString());
	}
}
