package com.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.Avengers;
import com.springboot.repositorys.AvengerRepository;

@Service
public class AvengerService {

	@Autowired
	private AvengerRepository avengerRepo = null;

	public Avengers saveAvenger(Avengers avenger) {
		return avengerRepo.save(avenger);
	}
	
	public Avengers updateAvenger(Avengers avenger) {
		return avengerRepo.save(avenger);
		
	}
	
	public void deleteAvenger(Integer id) {
		
		avengerRepo.deleteById(id);
		
	}

}
