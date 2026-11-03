package com.unified.health.core.data.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PairedDeviceDao {
    @Query("SELECT * FROM paired_devices ORDER BY pairedAtEpochMs ASC")
    fun observeAll(): Flow<List<PairedDeviceEntity>>

    @Query("SELECT * FROM paired_devices WHERE id = :id")
    suspend fun getById(id: String): PairedDeviceEntity?

    @Upsert
    suspend fun upsert(entity: PairedDeviceEntity)

    @Query("UPDATE paired_devices SET batteryPercent = :battery, firmwareVersion = :firmware, model = :model WHERE id = :id")
    suspend fun updateInfo(id: String, battery: Int?, firmware: String?, model: String?)

    @Query("UPDATE paired_devices SET lastSyncedAtEpochMs = :epochMs WHERE id = :id")
    suspend fun updateLastSynced(id: String, epochMs: Long)

    @Query("DELETE FROM paired_devices WHERE id = :id")
    suspend fun delete(id: String)
}
