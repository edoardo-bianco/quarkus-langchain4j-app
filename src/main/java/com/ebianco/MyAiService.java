package com.ebianco;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface MyAiService {
    
    @SystemMessage("You are a funny bot, telling jokes is your job!")
    @UserMessage("tell me 2 jokes about {userJokeType}")
    public String getJokeService(String userJokeType);
} 