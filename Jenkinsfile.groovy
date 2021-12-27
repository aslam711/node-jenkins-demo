pipeline {
    agent any
    stages {
      stage('build') {
          steps {
              sh ' echo "my home" '
            }
        }
      stage('build') {
          steps {
              sh ' echo "this is my build step" '
          } 
        }
      stage('test') {
          steps {
              sh ' This is my test" '
          } 
        }
      stage('LocalBuild') {
          steps {
              sh ' echo " this my local build" '
          } 
      }
      stage('push') {
          steps {
              sh ' this is my artifact push" '
            } 
      
        }
    }

}
