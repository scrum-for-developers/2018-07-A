package de.codecentric.psd.worblehat.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyBorrowedBooksController {

    @RequestMapping(value = "/myBorrowedBooks", method = RequestMethod.GET)
    public String myBorrowedBooks() {
        return "myBorrowedBooks";
    }

}
