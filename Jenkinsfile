pipeline {
  agent { label 'master'}

stages{
  stage ('CHECKOUT') {
		steps {
			//deleteDir()
			//sh 'cd ${WORKSPACE}'
			//sh 'rm -rf *'
			echo "Configuration build runing for branch ${env.Branch_Name}"
      checkout([$class: 'GitSCM', branches: [[name: "*/${params.branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], 
      submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'test2', url: 'git@github.com:kumar130/hiring.git']]])
		}
	}

  stage('BUILD') {
    steps {
      bat 'mvn clean install'
    }
  }

}//End of Stages
}// End of pipeline
