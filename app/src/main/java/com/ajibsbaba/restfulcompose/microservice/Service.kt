package com.ajibsbaba.restfulcompose.microservice

import retrofit2.http.GET


interface Service {

    @GET("posts/1")
    suspend fun getPost(): Post
}