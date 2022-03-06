package com.cx.book_server.service;

import com.cx.book_server.dao.BookDao;
import com.cx.book_server.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> queryAllBooks(){
        return bookDao.queryAllBooks();
    }

    public List<Book> queryBooksById(int bookId) {
        return bookDao.queryBookById(bookId);
    }

    public Book insertBook(Book book) {
        bookDao.insertBook(book);
        return book;
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public int deleteBook(int bookId) {
        return bookDao.deleteBook(bookId);
    }

    public void test() {

    }
}
