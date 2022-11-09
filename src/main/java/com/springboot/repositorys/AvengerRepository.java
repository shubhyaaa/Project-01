package com.springboot.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.Avengers;

@Repository
public interface AvengerRepository extends JpaRepository<Avengers, Integer>{

}
