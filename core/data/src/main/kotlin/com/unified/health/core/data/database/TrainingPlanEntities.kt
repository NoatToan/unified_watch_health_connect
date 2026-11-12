package com.unified.health.core.data.database

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

/**
 * The one currently-selected training plan (docs/DECISIONS.md D-1190) — [id] is always
 * [SINGLETON_ID], so `@Upsert` naturally replaces the previous row instead of accumulating history;
 * v1 only ever follows one plan at a time (see [TrainingPlanDao.setActivePlan]'s callers).
 */
@Entity(tableName = "active_training_plan")
data class ActiveTrainingPlanEntity(
    @PrimaryKey val id: Int = SINGLETON_ID,
    val planId: String,
    val startDateEpochDay: Long,
    val selectedAtEpochMs: Long,
) {
    companion object {
        const val SINGLETON_ID = 0
    }
}

/**
 * One checked-in day of [ActiveTrainingPlanEntity.planId]'s generated schedule — only checked-in days
 * get a row at all (no row = not completed), so clearing/replacing the active plan is just "delete
 * every row for that planId" rather than updating a huge pre-generated table.
 */
@Entity(tableName = "training_checkins", primaryKeys = ["planId", "dayOffset"])
data class TrainingCheckInEntity(
    val planId: String,
    val dayOffset: Int,
    val completedAtEpochMs: Long,
)

@Dao
interface TrainingPlanDao {
    @Query("SELECT * FROM active_training_plan WHERE id = ${ActiveTrainingPlanEntity.SINGLETON_ID}")
    fun observeActivePlan(): Flow<ActiveTrainingPlanEntity?>

    /** One-shot read, used by [com.unified.health.core.data.training.RoomTrainingPlanRepository]'s
     *  mutating methods, which only need to know *which* plan is active right now. */
    @Query("SELECT * FROM active_training_plan WHERE id = ${ActiveTrainingPlanEntity.SINGLETON_ID}")
    suspend fun activePlanOnce(): ActiveTrainingPlanEntity?

    @Upsert
    suspend fun setActivePlan(entity: ActiveTrainingPlanEntity)

    @Query("DELETE FROM active_training_plan")
    suspend fun clearActivePlan()

    @Query("SELECT * FROM training_checkins WHERE planId = :planId")
    fun observeCheckIns(planId: String): Flow<List<TrainingCheckInEntity>>

    @Upsert
    suspend fun upsertCheckIn(entity: TrainingCheckInEntity)

    @Query("DELETE FROM training_checkins WHERE planId = :planId AND dayOffset = :dayOffset")
    suspend fun deleteCheckIn(planId: String, dayOffset: Int)

    @Query("DELETE FROM training_checkins WHERE planId = :planId")
    suspend fun deleteAllCheckIns(planId: String)
}
