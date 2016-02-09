package analisiscodigoestatico;


public class multiplica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumando= 0, producto = 1;

		for (int inicial = 1; inicial <= 10; inicial++) {
			sumando = sumando + inicial;
			producto = producto * inicial;

		}
		System.out.println("valor de la sumando " + sumando);
		System.out.println("valor del producto " + producto);

	}


}
