package ua.lviv.iot.spring.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.dataaccess.SubjectRepository;
import ua.lviv.iot.spring.first.rest.model.Subject;

@Service
public class SubjectService {
	
		@Autowired
		private SubjectRepository subjectRepository;


		public List<Subject> getAllSubjects() {
			return subjectRepository.findAll();
		}

}
