
public class Pratos {
	
	private String nome;
	private Double preco;
	private String descricao;
	private Ingrediente[] ingredientes = new Ingrediente[3];
	
	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Pratos(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String toString() {
		return nome + ": " + preco + "\n" + descricao;
	}

}