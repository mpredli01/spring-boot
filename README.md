
## Spring Releases Versions 1.3.8 and 1.4.1 of Spring Boot

### InfoQ Java Queue

#### published October 10, 2016

This example application demonstrates the new features of Spring Boot 1.4 and is adapted from the Spring Boot [Getting Started Guide](https://spring.io/guides/gs/spring-boot/). 

The application is built with [Gradle 3.0](https://gradle.org/) and the resulting [Build Scan](https://scans.gradle.com/s/rdxi67rgwazis) explains the details of the build.

The application can be built and run by executing the command:

`gradle build && java -jar build/libs/gs-spring-boot-1.4.1.jar`

Once running, open a browser with URL `localhost:8080` and other endpoints such as `localhost:8080/info`, `localhost:8080/health`, and `localhost:8080/beans`. All available production-ready endpoints can be found [here](http://docs.spring.io/spring-boot/docs/1.4.1.RELEASE/reference/htmlsingle/#production-ready-endpoints).

A custom HTTP 404 status code message will be diplayed with an endpoint such as `localhost:8080/fred`. 

Please don't hesitate to contact me at [mike@redlich.net](mailto:mike@redlich.net) for any questions.
