package com.h2boot.facade.post;

import com.h2boot.domain.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostFacade {
    Page<Post> findAll(final Pageable pageable);

    Post save(Long id);
}
