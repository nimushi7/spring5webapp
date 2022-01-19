package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootStrap(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("Mat Jones", "Flowery Lane", "Durham", "North Carolina", "808080");

        publisherRepository.save(publisher);

        System.out.println("Started BootStrap");
        System.out.println("Number of publishers:" + publisherRepository.count());
    }
}
