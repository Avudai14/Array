package org.emp;
import org.company.Company;
import org.client.Client;
import org.project.Project;


public class Employee {
	public void empName() {
		System.out.println("Krish");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		Company f = new Company();
		f.companyName();
		Client g = new Client();
		g.clientName();
		Project h = new Project();
		h.projectName();
		
		
	}

}
