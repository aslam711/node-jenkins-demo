pipeline {
    agent any
    stages {
      stage('build') {
          steps {
              sh ' echo "my home" '
            }
        }
      stage('unit test') {
          steps {
              sh ' echo "this is my build step" '
          } 
        }
      stage('test') {
          steps {
              sh 'echo "This is my test" '
          } 
        }
      stage('LocalBuild') {
          steps {
              sh ' echo  "this my local build" '
          } 
      }
      stage('push') {
          steps {
              sh 'echo "this is my artifact push" '
            } 
      
        }
    }

}
