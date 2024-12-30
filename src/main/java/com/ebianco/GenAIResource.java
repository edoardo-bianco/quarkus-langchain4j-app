package com.ebianco;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/chat")
public class GenAIResource {

    private final MyAiService myAiService;

    @Inject
    public GenAIResource(MyAiService myAiService) {
        this.myAiService = myAiService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String myAiRest() {
        return myAiService.getJokeService("tell me 2  jokes");
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String myAiPrompt(String prompString) {
        return myAiService.getJokeService(prompString);
    }    
}
