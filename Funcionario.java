package POO;

import java.util.Scanner;

public class Funcionario {
	
	Scanner leia = new Scanner(System.in);
	
	private int idade;
	private String sexo;
	private double salario;
	private String cargo;
	private int AnosDeEmpresa;
	
	public Funcionario(int idade, String sexo, double salario, String cargo, int AnosDeEmpresa) {
			this.idade = idade;
			this.sexo = sexo;
			this.salario = salario;
			this.cargo = cargo;
			this.AnosDeEmpresa = AnosDeEmpresa;
	}
			
			
			
			public int getIdade() {
				return idade;
			}
			
			public void setIdade(int idade) {
				this.idade = idade;
			}
			
			public String getSexo() {
				return sexo;
			}
			
			public void setSexo(String sexo) {
				this.sexo = sexo;
			}
			
			public double getSalario() {
				return salario;
			}
			
			public void setSalario(double salario) {
				this.salario = salario;
			}
			
			public String getCargo() {
				return cargo;
			}
			
			public void setCargo(String cargo) {
				this.cargo = cargo;
			}
			
			public int getAnosDeEmpresa() {
				return AnosDeEmpresa;
			}
			
			public void setAnosDeEmpresa(int AnosDeEmpresa) {
				this.AnosDeEmpresa = AnosDeEmpresa;
			}
			

			public void visualiza(){
				System.out.println("\n\n************************************************************");
				System.out.println("Dados do Funcionario:");
				System.out.println("****************************************************************");
				System.out.println("Qual a idade do funcionario: " +this.idade);
				System.out.println("Qual o sexo do funcionario: " +this.sexo);
				System.out.println("Qual o salario: " +this.salario);
				System.out.println("Qual o cargo do salario: " +this.cargo);
				System.out.println("Quanto Anos de empresa: " +this.AnosDeEmpresa);
				}
			
	}

