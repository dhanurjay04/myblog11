package com.myblog.myblog11.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="post")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tittle;

    private String description;

    private String content;

}
