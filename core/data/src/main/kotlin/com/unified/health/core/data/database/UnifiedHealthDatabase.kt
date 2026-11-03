package com.unified.health.core.data.database

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * v1: paired devices. v2: vendor column + health records written by wearable sync.
 */
@Database(
    entities = [PairedDeviceEntity::class, HealthSampleEntity::class, WorkoutEntity::class],
    version = 2,
    exportSchema = true,
    autoMigrations = [AutoMigration(from = 1, to = 2)],
)
abstract class UnifiedHealthDatabase : RoomDatabase() {
    abstract fun pairedDeviceDao(): PairedDeviceDao
    abstract fun healthRecordDao(): HealthRecordDao
}
