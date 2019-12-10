package com.example.happy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Feeling::class),version = 1)
abstract class FeelingDatabase:RoomDatabase() {
    abstract fun feelingDao() : FeelingDao

    companion object{
        @Volatile
        private var INTANCE: FeelingDatabase? = null

        fun getDatabase(context : Context): FeelingDatabase{
            val tempInstance = INTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FeelingDatabase::class.java,
                    "feeling_db"
                ).build()
                INTANCE = instance
                return instance
            }
        }
    }
}