package com.demarqui.reddit.exceptions;

import com.demarqui.reddit.model.Subreddit;

public class SubredditNotFoundException extends RuntimeException{
    public SubredditNotFoundException(String message) {
        super(message);
    }
}
