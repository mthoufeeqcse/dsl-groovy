job("Deploy") {
 scm {
  git {
   remote {
     url 'https://github.com/mthoufeeqcse/MyApp'  
  }
  branch 'master'
  doGenerateSubmoduleConfigurations: false  
  }
 }
 steps{
   shell(readFileFromWorkspace('deploy.sh'))
   }
}
