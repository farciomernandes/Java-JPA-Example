package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Marcio Fernandes", "marcio@gmail.com");
		Pessoa p3 = new Pessoa(null, "Anderson Silva", "anderson@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Para o jpa faz alguma acao no BD que nao seja leitura ele precisa de uma transacao
		// -> em.getTransaction().begin(); //Inicia transacao
			
		
		
			//Create item in BD
		
		//em.persist(p1); //salva p1
		//em.persist(p2); //salva p2
		//em.persist(p3); //salva p3
				
		
		
			//Search item in BD
		
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p.toString());
		
			
		
			//Delete item in BD
		
		//Pessoa p = em.find(Pessoa.class, 2);
		//em.remove(p);
		
		
		
		// -> em.getTransaction().commit(); //encerra transacao e confirma transacoes feitas

		System.out.println("Pronto");
		
		em.close();
		emf.close();

		


	}

}
