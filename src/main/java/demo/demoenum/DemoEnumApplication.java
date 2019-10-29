package demo.demoenum;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoEnumApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoEnumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(NPC.KING);
		
		for(NPC npc : NPC.values()) {
			System.out.println(npc.getType());
		}
		
		System.exit(0);
		
	}

}
