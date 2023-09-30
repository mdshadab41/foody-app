package com.example.modernfoodrecipesapp.di

import android.content.Context
import androidx.room.Room
import com.example.modernfoodrecipesapp.data.database.RecipesDatabase
import com.example.modernfoodrecipesapp.utils.Constants.Companion.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        RecipesDatabase::class.java,
        DATABASE_NAME
    ).build()


    @Singleton
    @Provides
    fun provideDao(database: RecipesDatabase) = database.recipesDao()

    fun justtoCheckgithubStatus(){

    }
    fun justtoCheckgithubStatus2(){

    }
    fun justtoCheckgithubStatus3(){

    }
    fun justtoCheckgithubStatus4(){

    }
    fun justtoCheckgithubStatus5(){

    }
    fun justtoCheckgithubStatus6(){

    }


}