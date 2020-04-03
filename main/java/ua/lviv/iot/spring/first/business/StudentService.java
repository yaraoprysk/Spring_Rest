package ua.lviv.iot.spring.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.dataaccess.StudentRepository;
import ua.lviv.iot.spring.first.rest.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student, String id) {
		// studentRepository.
		// "; delete from students;"
		String query = "select * from students where id = :id";
		String finalQuery = query + id;
		return null;
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}
}
