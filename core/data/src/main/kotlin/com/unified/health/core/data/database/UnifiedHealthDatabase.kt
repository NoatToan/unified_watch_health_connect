package com.unified.health.core.data.database

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * v1: paired devices. v2: vendor column + health records written by wearable sync. v3: per-lap
 * splits and per-second samples for a workout (D-1093) — two new, purely additive tables. v4: the
 * active training plan selection + its check-ins (D-1190) — two more new, purely additive tables.
 */
@Database(
    entities = [
        PairedDeviceEntity::class,
        HealthSampleEntity::class,
        WorkoutEntity::class,
        WorkoutLapEntity::class,
        WorkoutSampleEntity::class,
        ActiveTrainingPlanEntity::class,
        TrainingCheckInEntity::class,
    ],
    version = 4,
    exportSchema = true,
    autoMigrations = [AutoMigration(from = 1, to = 2), AutoMigration(from = 2, to = 3), AutoMigration(from = 3, to = 4)],
)
abstract class UnifiedHealthDatabase : RoomDatabase() {
    abstract fun pairedDeviceDao(): PairedDeviceDao
    abstract fun healthRecordDao(): HealthRecordDao
    abstract fun trainingPlanDao(): TrainingPlanDao
}
