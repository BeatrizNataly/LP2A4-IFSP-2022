package pacote;
public class Aluno {
	private int id;
	private String nome;
	private String matricula;

	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
