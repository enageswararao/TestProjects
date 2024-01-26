pipeline {
agent any
    stages {
           
        stage('Build') {
            steps {
                sh 'mvn -version'
                sh 'mvn clean install'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
        stage('send email') {
        def subject = "Test Result"
        def content = 'ًLog file attached'
        def toList = ["aaa@gmail.com", "bbb@gmail.com"]        
        lib.sendMail(toList, , subject, content)
    }
    }
}
