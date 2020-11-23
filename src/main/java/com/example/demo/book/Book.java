package com.example.demo.book;

import java.util.Date;

public class Book {
    private Date created;

    public Date getCreated() {
        return created;
    }

    private BookStatus bookStatus;

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
}
