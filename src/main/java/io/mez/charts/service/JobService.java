package io.mez.charts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mez.charts.entity.Job;
import io.mez.charts.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	JobRepository repo;
	
	public List<Job> listJobs(){
		return repo.findAll();
	}
	
	public Job getJob(Integer id) {
		return repo.findById(id).get();
	}
	
	public void addJob(Job job) {
		repo.save(job);
	}
	
	public Job updateJob(Job job) {
			return repo.saveAndFlush(job);
	}
	
	public void deleteJobById(Integer id) {
		repo.deleteById(id);
	}
	
	public void deleteJob(Job job) {
		repo.delete(job);
	}
	
}
