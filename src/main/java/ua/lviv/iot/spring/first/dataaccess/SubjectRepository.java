package ua.lviv.iot.spring.first.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.first.rest.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

	List<Subject> findAllBySubjectName();

}
