package webinar.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.InstrutorDao;
import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		/*Endereco endereco1 = new Endereco("Rua Tupi","Alfenas");
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Augusto");
		aluno1.setMatricula("123456");
		aluno1.setEmail("Augusto@gmail.com");
		aluno1.setEndereco(endereco1);
		
		em.getTransaction().begin();
		//teve que persistir o endereço antes pois o aluno depende dele
		em.persist(endereco1);
		em.persist(aluno1);
		em.getTransaction().commit();
		
		Aluno aluno2 = new Aluno("1234","Lucas", new Endereco("Rua Abrao","Soleidy"),"Lucas@unifenas.br");
		em.getTransaction().begin();
		em.persist(aluno2);
		em.getTransaction().commit();
		
		Instrutor instrutor1 = new Instrutor("Yoda", new Endereco("Rua Manoel","SP"),
				"yoda@gmail.com",1000, Formacao.JEDI);
		
		Instrutor instrutor2 = new Instrutor("Darth", new Endereco("Rua Guimaraes","MG"),
				"darth@gmail.com",2000, Formacao.GRADUADO);
		
		em.getTransaction().begin();
		em.persist(instrutor1);
		em.persist(instrutor2);
		em.getTransaction().commit();
		
		List<Instrutor> Lista_Instrutores = new ArrayList();
		Lista_Instrutores.add(instrutor1);
		Lista_Instrutores.add(instrutor2);
		
		
		Seminario seminario1 = new Seminario("JOIN",31,80.00,Lista_Instrutores);
		em.getTransaction().begin();
		em.persist(seminario1);
		em.getTransaction().commit();
		
		Seminario semicon = em.find(Seminario.class, 1);
		Aluno alunocon = em.find(Aluno.class, 1);
		
		InscricaoSeminario inscricao = new InscricaoSeminario(alunocon, semicon); // realizei a inscrição
		em.getTransaction().begin();
		em.persist(inscricao);
		em.getTransaction().commit();*/
		
		//Seminario semicon = em.find(Seminario.class, 1);
		
		List<Instrutor> instrutores = new InstrutorDao().getAllbyFormacao(Formacao.GRADUADO);
		for (Instrutor instrutor : instrutores) {
			System.out.println(instrutor.getNome());			
		}
		
		
		
		
		JPAUtil.shutdown();

	}

}
