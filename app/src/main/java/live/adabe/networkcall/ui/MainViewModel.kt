package live.adabe.networkcall.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import live.adabe.networkcall.api.RetrofitProvider
import live.adabe.networkcall.models.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val usersLiveData = MutableLiveData<List<User>>()

    fun getUsers(){
        CoroutineScope(Dispatchers.IO).launch {
            usersLiveData.postValue(RetrofitProvider.placeHolderAPI.getUsers())
        }
    }
}