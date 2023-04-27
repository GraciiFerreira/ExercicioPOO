package POO;

import java.util.Scanner;

public class Cliente {
	
Scanner leia = new Scanner(System.in);
	
	private String nome;
	private String sexo;
	private int idade;
	private String cidade;
	private long telefone;
	
	public Cliente(String nome, String sexo, int idade, String cidade, long telefone) {
			this.nome = nome;
			this.sexo = sexo;
			this.idade= idade;
			this.cidade = cidade;
			this.telefone = telefone;
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void settelefone(long telefone) {
		this.telefone = telefone;
	}

	public void visualiza() {

		System.out.println("\n\n************************************************************");
		System.out.println("Dados do Cliente:");
		System.out.println("****************************************************************");
		System.out.println("Nome do cliente: " +this.nome);
		System.out.println("Sexo do cliente: " +this.sexo);
		System.out.println("Idade do cliente: " +this.idade);
		System.out.println("Cidade do cliente: " +this.cidade);
		System.out.println("Telefone do cliente: " +this.telefone);
		}
}
