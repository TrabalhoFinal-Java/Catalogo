import java.util.ArrayList;

public class Conta{
	private String nome;
	private String email;
	private String senha;
	
	public Conta(String nome,String email,String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
}

class ContaFuncionario extends Conta{

	public ContaFuncionario(String nome,String email, String senha) {
		super(nome, email, senha);
	}
	
	void AddFilme() {}
	
	void RemoveFilme() {}
	
}

class ContaCliente extends Conta{
	
	public ContaCliente(String nome,String email, String senha) {
		super(nome, email, senha);
	}
	
	void AvaliarFilme() {}
	
	void PesquisarFilme() {}
	
}

class ListaContas {
	ArrayList<Conta> contas = new ArrayList<Conta>();
}
