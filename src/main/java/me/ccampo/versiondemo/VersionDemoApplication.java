package me.ccampo.versiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
public class VersionDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(VersionDemoApplication.class, args);
    }

    @RestController
    public static class VersionController {

        @GetMapping("/version")
        public Version version() {
            return new Version();
        }
    }

    // Gets the application version set in the JAR's MANIFEST.MF file.
    public static class Version {

        public final String version;

        public Version() {
            this.version = Optional.ofNullable(getClass().getPackage().getImplementationVersion()).orElse("undefined");
        }
    }
}
