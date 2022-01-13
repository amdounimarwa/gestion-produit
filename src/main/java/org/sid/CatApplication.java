package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatApplication implements CommandLineRunner {
	@Autowired
   private ProduitRepository produitRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit("Ordianateur Lx 45", 6700, 3));
		produitRepository.save(new Produit("Imprimante Hp", 1700, 3));	
		produitRepository.save(new Produit("Smart Phone Samsung S9", 8000, 13));
		produitRepository.save(new Produit("Ordinateur led", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lx", 2000, 10));
		produitRepository.save(new Produit("Ordinateur lp", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));

		produitRepository.save(new Produit("Ordinateur lp", 6000, 17));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Dell", 900, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 900, 18));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur lo", 9000, 14));
		produitRepository.save(new Produit("Ordinateur sony", 700, 12));
		produitRepository.save(new Produit("Ordinateur sony", 600, 10));


	}

}
