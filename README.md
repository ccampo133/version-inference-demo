# Version Inference Demo

Demo project showing version inference with the [Nebula Release Plugin](https://github.com/nebula-plugins/nebula-release-plugin).

The version is inferred using Git tags and metadata.

### To Build

    ./gradlew build
    
### To Run

    ./gradlew bootRun

OR

    ./gradlew build
    java -jar build/libs/versiondemo-<version>.jar
    
The server will run on HTTP port 8080

## Demonstration

Versions are automatically inferred according to the default rules of the 
[Nebula Release Plugin](https://github.com/nebula-plugins/nebula-release-plugin). You can see the application version
by hitting the `/version` endpoint. Example:

    $ curl -s -X GET http://localhost:8080/version | jq
    {
      "version": "0.2.1-dev.1+c9353d9"
    }
    
Try checking out different commits, building and seeing which version are inferred.

Play around with various inferences behaviours. For example, to use the latest tag in the version inference, do:

    ./gradlew -Prelease.useLastTag=true build

To only bump the patch version (NOTE: this is set as the default in `gradle.properties`), do:

   
    ./gradlew -Prelease.scope=patch build

For more information, see the [Nebula Release Plugin](https://github.com/nebula-plugins/nebula-release-plugin) docs.
