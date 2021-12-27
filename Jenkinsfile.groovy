pipeline {
    agent any
    stages {
      stage('build') {
          steps {
              sh ' echo "my home" '
          } 
      }
    }
    stages {
      stage('build') {
          steps {
              sh ' echo "this is my build step" '
          } 
      }
    }
    stages {
      stage('test') {
          steps {
              sh ' This is my test" '
          } 
      }
    }
    stages {
      stage('LocalBuild') {
          steps {
              sh ' echo " this my local build" '
          } 
      }
    }
    stages {
      stage('push') {
          steps {
              sh ' this is my artifact push" '
          } 
      }
    }
}