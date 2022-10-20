package in.ayush.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CitizenAppDto {

	private String fullName;
	private String email;
	private Long phno;
	private String gender;
	private Long ssn;
	private LocalDate dob;

}
