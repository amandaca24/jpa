package br.unipe.tad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager; 

public class AlunoDAO { 
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("tad");
	
	public void incluir(Aluno aluno){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void atualizar(Aluno aluno){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(aluno);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void remover(Aluno aluno){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
		manager.close();
	}

}
