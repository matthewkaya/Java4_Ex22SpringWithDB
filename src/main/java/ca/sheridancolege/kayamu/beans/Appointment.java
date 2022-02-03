package ca.sheridancolege.kayamu.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @NonNull
	private String purpose;
    @NonNull    
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate appointmentDate;
    @NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalTime appointmentTime;
    @NonNull
	private String person;

    
    
}
