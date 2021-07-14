package live.adabe.networkcall.api

import live.adabe.networkcall.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {

    @GET("users")
    suspend fun getUsers(): List<User>
}