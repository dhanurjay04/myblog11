package com.myblog.myblog11.service.Impl;

import com.myblog.myblog11.Repository.PostRepository;
import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.playload.PostDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {

private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = new Post();
     post.setTittle(postDto.getTittle());
     post.setContent(postDto.getContent());
     post.setDescription(postDto.getDescription());
        Post savePost = postRepository.save(post);
        PostDto dto = new PostDto();
       dto.setTittle(savePost.getTittle());
       dto.setContent(savePost.getContent());
       dto.setDescription(savePost.getDescription());

        return dto;
    }
}
