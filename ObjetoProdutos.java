package Encapsulamento;

public class ObjetoProdutos {

	public static void main(String[] args) {

		Produtos prod = new Produtos("Queijo prato", 50.00);
		
		
		System.out.println(prod.getNome() + " " + prod.getPreco());
		
		prod.setPreco(53);
		System.out.println(prod.getPreco());
		
		
		prod.setPreco(56);
		System.out.println(prod.getPreco());
		
		prod.setNome("QueijParmesão");
		prod.setPreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
	}

}
