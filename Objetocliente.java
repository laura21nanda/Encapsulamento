package Encapsulamento;

public class Objetocliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		
		cliente1.setId(10);
		cliente1.setNome("Flulaninho");
		cliente1.setTelefone("991234-5678");
		cliente1.setCpf("1234-5678/99");
		cliente1.setRg("1234-5678");
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		//**************************************
		
		Cliente cliente2 = new Cliente(11,"Beutrano","998765-4321","8765-4321/99","8765-4321");
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		
	}

}
