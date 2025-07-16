# spring-microservices

Step 1- Run locally in IntelliJ (open in explorer and use terminal)
             mvn clean package -DskipTests -X

**1. Build Your Docker Image in Docker Desktop**
Docker Desktop doesn’t have a button for building from source yet, so you use the terminal integrated in Docker Desktop or your system terminal:
docker build -t hello-docker-java . 
•	This tells Docker: “Use the Dockerfile in this folder to build an image named hello-docker-java.”
🧭 Make sure you run this from the folder that contains both your Dockerfile and your target/docker-beginner-0.0.1-SNAPSHOT.jar.

-	docker run -p 5000:5000 hello-docker-java

**2. Push Image to docker Hub-** 
  docker tag hello-docker-java anjali0715/hello-docker-java:latest
  docker push anjali0715/hello-docker-java:latest
