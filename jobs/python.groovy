project_name = "jenkins-pipeline-python"
repo = "git@github.com:dcmikki/jenkins-holamundo.git"
repo_name = ""

pipelineJob(project_name) {
    definition {
        triggers {
            scm('H/1 * * * *')
        }
        cpsScm {
            scm {
                git {
                    remote {
                        name()
                        url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
            }
        }
    }
}

