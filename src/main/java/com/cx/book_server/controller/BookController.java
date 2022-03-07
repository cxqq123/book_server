package com.cx.book_server.controller;


import com.cx.book_server.domain.Book;
import com.cx.book_server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book", method = {RequestMethod.GET, RequestMethod.POST})
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/queryAllBooks")
    @ResponseBody
    public List<Book> queryAllBooks(){
        return bookService.queryAllBooks();
    }

    @RequestMapping("/queryBookById")
    @ResponseBody
    public List<Book> queryBooksById(int bookId) {
        return bookService.queryBooksById(bookId);
    }

    @RequestMapping(value = "/insertBook", method = RequestMethod.POST)
    public Book insertBook(@RequestBody Book book) {
        return bookService.insertBook(book);
    }

    @RequestMapping(value = "updateBook", method = RequestMethod.PUT)
    public int updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "deleteBook", method = RequestMethod.GET)
    public int deleteBook(int bookId) {
        return bookService.deleteBook(bookId);
    }
}
