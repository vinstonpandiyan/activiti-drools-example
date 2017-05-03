package org.activiti.designer.test;

import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.ActivitiRule;
import org.junit.Rule;
import org.junit.Test;

public class ProcessTestMyProcess {

	@Rule
	public ActivitiRule activitiRule = new ActivitiRule();

	@Test
	public void startProcess() throws Exception {
		RepositoryService repositoryService = activitiRule.getRepositoryService();
		repositoryService.createDeployment().addClasspathResource("diagrams/BusinessRuleLoanProcess.bpmn")
				.addClasspathResource("diagrams/BusinessRuleLoanProcess.png")
				.addClasspathResource("diagrams/LoanRequestRules.drl").enableDuplicateFiltering()
				.name("businessRuleLoanProcessSimple").deploy();
		//repositoryService.createDeployment().addInputStream("BusinessRuleLoanProcess.bpmn", new FileInputStream(filename)).deploy();
		RuntimeService runtimeService = activitiRule.getRuntimeService();
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("name", "pandiyan");
		variableMap.put("amount", 200L);
		variableMap.put("salary", 10000L);
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess", variableMap);
		assertNotNull(processInstance.getId());
		System.out.println("id " + processInstance.getId() + " " + processInstance.getProcessDefinitionId());
	}
}
