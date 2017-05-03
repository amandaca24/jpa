package br.unipe.tad;

public class AlunoController {
	
	public static void main(String[] args){
		
		Aluno aluno = new Aluno();
		aluno.setNome("Amanda");
		
		AlunoDAO dao = new AlunoDAO();
		dao.incluir(aluno);
		
	}

}
 