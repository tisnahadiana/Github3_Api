package id.tisnahadiana.githubapi.api

import id.tisnahadiana.githubapi.data.model.DetailUserResponse
import id.tisnahadiana.githubapi.data.model.User
import id.tisnahadiana.githubapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
        ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String

    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String

    ): Call<ArrayList<User>>

}