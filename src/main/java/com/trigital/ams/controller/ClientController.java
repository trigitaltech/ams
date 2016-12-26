package com.trigital.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trigital.ams.model.Client;
import com.trigital.ams.repository.ClientRepository;

@Controller
public class ClientController {

	@Autowired
	ClientRepository clientRepository;
	
	
	@RequestMapping(value="/client",method = RequestMethod.GET)
	public @ResponseBody List<Client> home() {
		return clientRepository.findAll();
	}
	
	@RequestMapping(value = "/client", method = RequestMethod.POST)
	public @ResponseBody  Client addClient(@RequestBody Client client) {
		
		return clientRepository.save(client);
		
	}
		
}
