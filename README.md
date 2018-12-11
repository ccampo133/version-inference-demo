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
      "version": "0.2.0-dev.0.uncommitted+0a22a51"
    }
    
Try checking out different commits and seeing which version are inferred.
