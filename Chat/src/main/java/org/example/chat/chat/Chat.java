package org.example.chat.chat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Chat {

    public int senderID;
    public int receiverId;
    public String content;


    public Chat() {
    }

    public Chat(int senderID, int receiverId, String content) {
        this.senderID = senderID;
        this.receiverId = receiverId;
        this.content = content;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }
}
