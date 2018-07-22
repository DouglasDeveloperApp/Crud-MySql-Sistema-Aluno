package control;

/**
 * @author Douglas Coelho Goveia de Almeida
 */ 

public class Aluno {
	
	private int id;
	private String nomeAluno;
    private String curso;
    private double nota;

	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
    @Override
    public String toString() {
        return getNomeAluno(); 
    }
	public void add(Aluno alunos) {
		// TODO Auto-generated method stub
		
	}
    
}

   