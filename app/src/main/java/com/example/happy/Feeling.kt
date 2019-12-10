package com.example.happy

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "feeling")
class Feeling (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val mode: Int,
    val remark : String,
    val created_at : Date
)