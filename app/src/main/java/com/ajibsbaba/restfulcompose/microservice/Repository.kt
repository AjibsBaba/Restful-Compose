package com.ajibsbaba.restfulcompose.microservice

class Repository {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}