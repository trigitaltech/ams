package com.trigital.ams.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trigital.ams.model.Client;

public interface ClientRepository extends MongoRepository<Client, Long>{
	
	List<Client> findAll();
	
}