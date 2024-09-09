package com.ai.minichatbot.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ChatGPTRequest implements ChatRequest{
    private String model;
    private List<Message> messages;
    public ChatGPTRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
