package io.mez.charts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mez_charts")
public class Job {
	int jobId;
	String title;
	String type;
	String category;
	String location;
	int vacancies;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getVacancies() {
		return vacancies;
	}
	public void setVacancies(int vacancies) {
		this.vacancies = vacancies;
	}
	public Job() {}
	public Job(int jobId, String title, String type, String category, String location, int vacancies) {
		this.jobId = jobId;
		this.title = title;
		this.type = type;
		this.category = category;
		this.location = location;
		this.vacancies = vacancies;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", type=" + type + ", category=" + category + ", location="
				+ location + ", vacancies=" + vacancies + "]";
	}
	
	
	
}
