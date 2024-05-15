package com.example.barutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.barutoapp.data.local.dao.HeroDao
import com.example.barutoapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BarutoDatabase:RoomDatabase() {

    abstract fun heroDao():HeroDao

}