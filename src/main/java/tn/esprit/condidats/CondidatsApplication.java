package tn.esprit.condidats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.condidats.Repositories.CandidatRepository;
import tn.esprit.condidats.entites.Condidat;

@SpringBootApplication
public class CondidatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondidatsApplication.class, args);
	}
	@Autowired
	private CandidatRepository repository ;
	@Bean
	ApplicationRunner init(){
		return (args -> {
			repository.save(new Condidat("Meriem" , "CH" , "ma@esprit.tn"));
			repository.save(new Condidat("Meriem" , "CH" , "ma@esprit.tn"));
			repository.save(new Condidat("Meriem" , "CH" , "ma@esprit.tn"));
			repository.findAll().forEach(System.out::println);
		}) ;
	}
}
