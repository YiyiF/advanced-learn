pipeline {
    agent any
    stages {
    stage('Preparation') { // for display purposes
        steps {
        echo 'Preparation'
        script {
        value = ''
        }}
        }
    stage('Get number') {
        steps {
        echo "Build Stage begin with param value $value"

        script {
            value = sh(script: 'python /Users/yiyi/WorkSpace/learn-Jenkins/pipeline/use_python_value.py', returnStdout: true).trim()
        }
        }
    }
    stage('Results') {
        steps {
        echo "value now is $value"
        }
    }
    }
    }
