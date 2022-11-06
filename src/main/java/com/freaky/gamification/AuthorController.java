package com.freaky.gamification;

import com.freaky.gamification.entity.Book;
import com.freaky.gamification.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    GamificationService gamificationService;
    @Autowired
    BookRepository bookRepository;

    @PostMapping("{id}/books")
    public String postBooks(@PathVariable("id") String authorId, @RequestBody Books books) {
        return gamificationService.postBooks(authorId+books);
    }

    @GetMapping("{id}/books")
    public Book getBook() {
        return bookRepository.findAll().iterator().next();
    }

}
