pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {

        success {
            mail to: 'maanyav30@gmail.com',
            subject: 'Jenkins Build Success',
            body: 'The Maven project build completed successfully.'
        }

        failure {
            mail to: 'maanyav30@gmail.com',
            subject: 'Jenkins Build Failed',
            body: 'The Maven project build has failed.'
        }
    }
}
