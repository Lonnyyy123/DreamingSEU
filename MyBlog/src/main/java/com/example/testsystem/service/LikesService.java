package com.example.testsystem.service;

import com.example.testsystem.Util.ResponseMessage;
import com.example.testsystem.model.toback.LikeArticleToBack;

public interface LikesService {
    ResponseMessage<String>likeArticle(LikeArticleToBack likeArticleToBack);
}
