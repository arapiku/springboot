package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

public class MessageService {

	@Autowired
	public MessageRepository repository;

	public List<Message> getRecentMessages(Integer n) {
		return repository.findByOrderByIdDesc(new PageRequest(0, n));
	}

	@Transactional
	public void save(Message message) {
		repository.save(message);
	}

}
