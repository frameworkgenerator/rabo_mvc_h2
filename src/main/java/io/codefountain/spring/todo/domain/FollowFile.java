package io.codefountain.spring.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FollowFile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	private String fileName;
	private String status;
	
	public FollowFile(String fileName, String status) {
		super();
		this.setFileName(fileName);
		this.setStatus(status);
	}

	public FollowFile() {
		// TODO Auto-generated constructor stub
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}