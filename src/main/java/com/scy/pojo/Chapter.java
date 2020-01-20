package com.scy.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 章节实体类
 */
@Component
public class Chapter {

    private Integer chapter_id;
    private Integer book_id;
    private String chapter_title;
    private String charpter_info;
    private Date book_last_update_time;
    private String book_last_chapter_info;

    @Override
    public String toString() {
        return "Chapter{" +
                "chapter_id=" + chapter_id +
                ", book_id=" + book_id +
                ", chapter_title='" + chapter_title + '\'' +
                ", charpter_info='" + charpter_info + '\'' +
                ", book_last_update_time=" + book_last_update_time +
                ", book_last_chapter_info='" + book_last_chapter_info + '\'' +
                '}';
    }

    public Integer getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Integer chapter_id) {
        this.chapter_id = chapter_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public String getCharpter_info() {
        return charpter_info;
    }

    public void setCharpter_info(String charpter_info) {
        this.charpter_info = charpter_info;
    }

    public Date getBook_last_update_time() {
        return book_last_update_time;
    }

    public void setBook_last_update_time(Date book_last_update_time) {
        this.book_last_update_time = book_last_update_time;
    }

    public String getBook_last_chapter_info() {
        return book_last_chapter_info;
    }

    public void setBook_last_chapter_info(String book_last_chapter_info) {
        this.book_last_chapter_info = book_last_chapter_info;
    }
}
