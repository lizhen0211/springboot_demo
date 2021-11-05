https://spring.io/projects/spring-boot#overview
https://github.com/spring-guides

####启动命令
Run the Application $./mvnw spring-boot:run
####检查应用程序的运行状况
curl localhost:8080/actuator/health
####关闭服务
curl -X POST localhost:8080/actuator/shutdown