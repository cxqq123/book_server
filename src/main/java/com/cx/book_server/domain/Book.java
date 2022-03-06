package com.cx.book_server.domain;

import java.util.Date;

public class Book {

    private int bookId;

    private String bookEName;

    private String bookCName;

    private int bookQuantity;

    private Date startTime;

    private Date endTime;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookEName() {
        return bookEName;
    }

    public void setBookEName(String bookEName) {
        this.bookEName = bookEName;
    }

    public String getBookCName() {
        return bookCName;
    }

    public void setBookCName(String bookCName) {
        this.bookCName = bookCName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookEName='" + bookEName + '\'' +
                ", bookCName='" + bookCName + '\'' +
                ", bookQuantity=" + bookQuantity +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
