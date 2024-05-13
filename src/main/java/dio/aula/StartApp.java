package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Vito");
        user.setUserName("Hirynnn");
        user.setPassword("aloooBrasil");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.print(u);
        }


    }
}
