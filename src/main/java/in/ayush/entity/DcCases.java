package in.ayush.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DC_CASES")
public class DcCases {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseID;
	private Integer caseNum;
	private Integer appId;
	private Integer planId;

	@CreationTimestamp
	private LocalDate createdDate;

	@UpdateTimestamp
	private LocalDate updatedDate;

	private String createdBy;
	private String updatedBy;

}