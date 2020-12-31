package com.byl.mvvm.api

import com.byl.mvvm.api.response.BaseResult
import com.byl.mvvm.ui.main.model.ArticleListBean
import retrofit2.http.*


interface ApiService {

    @GET("article/listproject/{page}/json")
    suspend fun getArticleList(@Path("page") page: Int): BaseResult<ArticleListBean>
}