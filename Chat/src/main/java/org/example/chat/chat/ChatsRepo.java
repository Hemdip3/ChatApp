package org.example.chat.chat;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ChatsRepo extends MongoRepository<Chat,Integer> {
}
