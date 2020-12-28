package com.yneerg.admin.book.web.dto;

import com.yneerg.admin.book.domain.posts.Posts;
import lombok.Getter;

import java.awt.*;
import java.net.ContentHandler;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
