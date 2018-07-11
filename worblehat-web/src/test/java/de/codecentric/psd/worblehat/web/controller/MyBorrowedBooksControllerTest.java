package de.codecentric.psd.worblehat.web.controller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyBorrowedBooksControllerTest {

    @Test
    public void shouldNavigateTomyBorrowedBooks() {
        String navigateTo = new MyBorrowedBooksController().myBorrowedBooks();

        assertThat(navigateTo, is("myBorrowedBooks"));
    }
}