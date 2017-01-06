docker build -t docker-tomcat .
[ $(docker ps -aq -f name=tomcatServer | wc -l) -gt 0 ] && \docker stop tomcatServer && docker rm tomcatServer
docker run -d -it -p 8383:8080 --name tomcatServer docker-tomcat
