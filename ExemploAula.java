package POO;

public class ExemploAula {
		
		/*Atributos da classe conta*/
		
		private int numero;
		private int agencia;
		private String tipo;
		private String titular;
		private float saldo;
	
		
		public ExemploAula(int numero, int agencia, String tipo, String titular, float saldo) {
				this.numero = numero;
				this.agencia = agencia;
				this.tipo = tipo;
				this.titular = titular;
				this.saldo = saldo;
		}
		
		
		public int getnumero() {
			return numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public int getagencia() {
			return agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
			
		}
		
		public String gettipo() {
			return tipo;
		}
		
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public String gettitular() {
			return titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public float getsaldo() {
			return saldo;
		}
		
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

}
