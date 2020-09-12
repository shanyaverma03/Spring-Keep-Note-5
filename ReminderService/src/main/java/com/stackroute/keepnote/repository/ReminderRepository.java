package com.stackroute.keepnote.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.keepnote.model.Reminder;
import org.springframework.web.bind.annotation.RestController;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */
@RestController
public interface ReminderRepository extends MongoRepository<Reminder, String> {

}
