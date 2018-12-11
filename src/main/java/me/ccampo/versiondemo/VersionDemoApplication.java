package me.ccampo.versiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VersionDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(VersionDemoApplication.class, args);
    }

    @RestController
    public static class VersionController {

        @GetMapping("/version")
        public String version() {
            return this.getClass().getPackage().getImplementationVersion();
        }
    }
}
