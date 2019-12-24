package com.example.happy

import androidx.lifecycle.LiveData

class FeelingRepository(private val feelingDao : FeelingDao) {
    val allFeelings: LiveData<List<Feeling>> =
        feelingDao.getAllRecords()

    suspend fun insert(feeling: Feeling) {
        feelingDao.insertFeeling(feeling)
    }
}