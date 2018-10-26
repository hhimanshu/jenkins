pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn test'
            }
        }
        stage('finalize') {
            steps {
                sh 'echo "The pipeline suceeded!"'
                sh '''
                  echo "I am done."
                '''
            }
        }
    }
}