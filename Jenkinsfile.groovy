pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests -Dquarkus.http.port=8082'
            }
        }
    }
}
