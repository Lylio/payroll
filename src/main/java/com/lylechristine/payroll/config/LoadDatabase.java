package com.lylechristine.payroll.config;

import com.lylechristine.payroll.model.Employee;
import com.lylechristine.payroll.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Egon Spengler", "Scientist")));
            log.info("Preloading " + repository.save(new Employee("Ray Stantz", "Ghostbuster")));
            log.info("Preloading " + repository.save(new Employee("Peter Venkman", "Ghostbuster")));
            log.info("Preloading " + repository.save(new Employee("Winston Zeddmore", "Ghostbuster")));
        };
    }
}
