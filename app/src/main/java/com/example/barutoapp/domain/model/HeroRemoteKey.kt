package com.example.barutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.barutoapp.utils.Constants.HERO_REMOTE_KEY_TABLE

@Entity(tableName = HERO_REMOTE_KEY_TABLE)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id:Int,
    val prevKey:Int,
    val nextKey:Int
)
