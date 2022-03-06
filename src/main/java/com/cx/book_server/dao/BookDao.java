package com.cx.book_server.dao;

import com.cx.book_server.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {

    public List<Book> queryAllBooks();

    List<Book> queryBookById(int bookId);

    public int insertBook(Book book);

    public int updateBook(Book book);

    public int deleteBook(int bookId);
}
