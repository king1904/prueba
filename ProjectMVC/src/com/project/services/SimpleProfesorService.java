package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProfesorService implements ProfesorService {
	
	
	@Autowired
	private ProfesorRepo profesorRepository;
	
	@Override
	public List<Profesor> getProfesores() {
		return profesorRepository.findAllProfesor();		
	}

	@Override
	public Profesor getById(int id) {
		return profesorRepository.findProfesor(id);
	}


}
