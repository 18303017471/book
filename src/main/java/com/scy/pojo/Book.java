package com.scy.pojo;

import org.springframework.stereotype.Component;

/**
 * 书籍实体类
 */
@Component
public class Book {

    private Integer book_id;
    private String book_title;
    private String book_author;
    private String book_description;
    private String book_status;

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_title='" + book_title + '\'' +
                ", book_author='" + book_author + '\'' +
                ", book_description='" + book_description + '\'' +
                ", book_status='" + book_status + '\'' +
                '}';
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_description() {
        return book_description;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }
}
