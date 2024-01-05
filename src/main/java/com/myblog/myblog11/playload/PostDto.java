package com.myblog.myblog11.playload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private long id;
    private String tittle;
    private String description;
    private String content;

}
