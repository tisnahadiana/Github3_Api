package id.tisnahadiana.githubapi.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.tisnahadiana.githubapi.data.local.FavoriteUser
import id.tisnahadiana.githubapi.data.local.FavoriteUserDao
import id.tisnahadiana.githubapi.data.local.UserDatabase

class FavoriteViewModel (application: Application): AndroidViewModel(application){
    private var userDao: FavoriteUserDao?
    private var userDB: UserDatabase?

    init {
        userDB = UserDatabase.getDatabase(application)
        userDao = userDB?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}