package com.mgmt.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/school")
public class SchoolManagementController {

	@GetMapping("/students")
	public String getStudents() {
		return "All Students are here";
	}
	
	@GetMapping("/students/{id}")
	public String getStudentById(@PathVariable("id") String id) {	
		return "Student "+id+" is here";
	}
	
}
