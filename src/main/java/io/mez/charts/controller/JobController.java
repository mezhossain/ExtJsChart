package io.mez.charts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.mez.charts.entity.Job;
import io.mez.charts.service.JobService;

@RestController
public class JobController {
	@Autowired
	JobService ser;
	
	@GetMapping("/jobs")
	public List<Job> getAllJobs(){
		return ser.listJobs();
	}
	
	@GetMapping("/jobs/{id}")
	public Job getJobById(@PathVariable Integer id) {
		return ser.getJob(id);		
	}
	
	@PostMapping("/jobs/add")
	public void addJob(@RequestBody Job job) {
		ser.addJob(job);		
	}
	
	@PutMapping("/jobs/update")
	public Job updateJobById(@RequestBody Job job) {
		return ser.updateJob(job);
	}
	
	@DeleteMapping("/jobs/delete/{id}") 
	public void deleteJobById(@PathVariable Integer id) {
		ser.deleteJobById(id);
	}
	
	@DeleteMapping("/jobs/delete") 
	public void deleteJob(@RequestBody Job job) {
		ser.deleteJob(job);
	}
}
