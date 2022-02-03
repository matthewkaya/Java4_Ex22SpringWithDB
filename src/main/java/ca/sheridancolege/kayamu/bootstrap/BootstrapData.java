package ca.sheridancolege.kayamu.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancolege.kayamu.beans.Appointment;
import ca.sheridancolege.kayamu.repositories.AppointmentRepository;


@Component
public class BootstrapData implements CommandLineRunner {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	//TODO - This method add data o production data
	public void run(String... args) throws Exception {
		appointmentRepository.save(new Appointment("Visit", LocalDate.parse("2022-11-01"), LocalTime.parse("01:00:00"),"Matthew Kaya"));
		appointmentRepository.save(new Appointment("Consulting", LocalDate.parse("2022-10-01"), LocalTime.parse("02:00:00"),"Jeffrey Hogan"));
		appointmentRepository.save(new Appointment("Dinner", LocalDate.parse("2022-09-01"), LocalTime.parse("03:00:00"),"Matthew Kaya"));
		appointmentRepository.save(new Appointment("Visit", LocalDate.parse("2022-08-01"), LocalTime.parse("04:00:00"),"Simon Hood"));
	}

}

