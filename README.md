# spring-boot-with-activiti-drools-example
Spring-boot integration with Activiti,Drools example.

[![Build Status](https://travis-ci.org/vinstonpandiyan/activiti-drools-example.svg?branch=master)](https://travis-ci.org/vinstonpandiyan/activiti-drools-example.svg?branch=master) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/052c959cb6ee407586280f7b01c04b09)](https://www.codacy.com/app/vinstonpandiyan/activiti-drools-example?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=vinstonpandiyan/activiti-drools-example&amp;utm_campaign=Badge_Grade) [![DockerHub](https://img.shields.io/badge/docker-available-blue.svg)](https://hub.docker.com/u/vinston/)

# Tutorial: 

http://www.attuneww.com/ebook/drools-activiti-integration.pdf

# Drools:

@see: https://github.com/vinstonpandiyan/activiti-drools-example/master/src/main/resources/diagrams/LoanRequestRules.drl

# BPM Diagram:

![Screenshot of "BPM Diagram"](https://raw.githubusercontent.com/vinstonpandiyan/activiti-drools-example/master/src/main/resources/diagrams/BusinessRuleLoanProcess.png)

# Modifications:

1.Without "BAR" style deployment, using "addClasspathResource" style. 

@see: https://github.com/vinstonpandiyan/activiti-drools-example/master/src/test/java/org/activiti/designer/test/ProcessTestMyProcess.java

# TODO:

1.Using SpreadsheetCompiler to support XLS rules input;
