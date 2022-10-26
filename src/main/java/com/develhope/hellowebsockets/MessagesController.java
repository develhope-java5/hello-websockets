package com.develhope.hellowebsockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessagesController {
    @MessageMapping("/inbox")
    @SendTo("/mail/messages")
    public Message send(Message message) {
        return message;
    }
}
