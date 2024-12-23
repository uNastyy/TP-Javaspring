package org.example.controller;

import org.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.example.model.Article;

@Controller // This means that this class is a Controller
@RequestMapping(path="/article") // This means URL's start with /demo (after Application path)
public class ArticleController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ArticleRepository articleRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Article> getAllArticles() {
        // This returns a JSON or XML with the users
        return articleRepository.findAll();
    }


}
