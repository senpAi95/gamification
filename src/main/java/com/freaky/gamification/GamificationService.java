package com.freaky.gamification;

import org.springframework.stereotype.Component;

/**
 * This service will handle requests and delegate them to DAO
 */
@Component
public class GamificationService {
    public String postBooks(String books) {
        return "Successfully posted " + books;
    }
}
