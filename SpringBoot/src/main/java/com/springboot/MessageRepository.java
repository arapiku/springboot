package com.springboot;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {

	List<Message> findByOrderByIdDesc(Pageable pageable);
}
