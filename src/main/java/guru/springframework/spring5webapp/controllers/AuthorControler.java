package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alfredo sanz
 * @time Dec 2019
 */
@Controller
public class AuthorControler {

    private AuthorRepository authorRepository;

    public AuthorControler(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authorList", this.authorRepository.findAll());

        return "authorsTP";
    }
}
