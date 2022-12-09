package com.example.board;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardVO {

    private int seq;
    private String title;
    private Date regdate;
    private String writer;
    private String content;
    private String category;
}
