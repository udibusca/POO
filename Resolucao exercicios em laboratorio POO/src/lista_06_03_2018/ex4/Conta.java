package lista_06_03_2018.ex4;

public class Conta {
	private double saldo;

	public Conta() {}

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			System.out.println("N�o pode ser negativo "+Conta.class.getSimpleName()+" metodo setSaldo");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (saldo > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("N�o pode ser negativo "+Conta.class.getSimpleName()+" metodo sacar");
		}
	}

}
