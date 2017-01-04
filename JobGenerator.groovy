job("Deploy") {
 scm {
  git {
   remote {
     url 'https://github.com/mthoufeeqcse/dsl-groovy'  
  }
  branch 'master'
  doGenerateSubmoduleConfigurations: false  
  }
 }
 steps{
   shell("docker build -t docker-tomcat .")
   shell("docker run -d -it -p 8383:8080 docker-tomcat")
 }
}
