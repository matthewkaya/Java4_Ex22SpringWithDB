package ca.sheridancolege.kayamu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancolege.kayamu.beans.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
