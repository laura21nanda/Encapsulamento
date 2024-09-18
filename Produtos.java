package Encapsulamento;

public class Produtos {

	private String nome;
	private double preco;
	
	public Produtos (String none, double preco) {
		this.nome = nome;
		setPreco(preco);
	}
	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String nome) {
		this.nome = nome;
	 }
	 public double getPreco() {
		 return preco;
	 }
	 public void setPreco(double preco) {
		 if (preco>=0) {
		 }else {
			 System.out.println("Preço inválido! Não pode ser negativo.");
		 }
	 }
	 public void exibirInformacoes() {
		 System.out.println(" Produtos " + nome + ",Preço: " +preco);
	 }
}
