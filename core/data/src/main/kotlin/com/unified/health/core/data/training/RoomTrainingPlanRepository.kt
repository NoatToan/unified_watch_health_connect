package com.unified.health.core.data.training

import com.unified.health.core.data.database.ActiveTrainingPlanEntity
import com.unified.health.core.data.database.TrainingCheckInEntity
import com.unified.health.core.data.database.TrainingPlanDao
import com.unified.health.core.domain.repository.TrainingPlanRepository
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.HigdonNoviceSchedules
import com.unified.health.core.model.ScheduledDay
import com.unified.health.core.model.TrainingPlanId
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import java.time.Instant
import java.time.LocalDate
import javax.inject.Inject

/**
 * [TrainingPlanRepository] backed by [TrainingPlanDao] (docs/DECISIONS.md D-1190): the active plan's
 * full schedule is generated fresh every emission from [HigdonNoviceSchedules] (static content, not
 * stored row-by-row) and overlaid with whichever [TrainingCheckInEntity] rows exist for it.
 */
class RoomTrainingPlanRepository @Inject constructor(
    private val dao: TrainingPlanDao,
) : TrainingPlanRepository {

    override val activePlan: Flow<ActiveTrainingPlan?> =
        dao.observeActivePlan().flatMapLatest { active ->
            if (active == null) {
                flowOf(null)
            } else {
                val planId = TrainingPlanId.valueOf(active.planId)
                val startDate = LocalDate.ofEpochDay(active.startDateEpochDay)
                dao.observeCheckIns(active.planId).map { checkIns ->
                    val completedByOffset = checkIns.associateBy({ it.dayOffset }, { it.completedAtEpochMs })
                    val schedule = HigdonNoviceSchedules.generate(planId, startDate).map { day ->
                        completedByOffset[day.dayOffset]?.let { epochMs ->
                            day.copy(completed = true, completedAt = Instant.ofEpochMilli(epochMs))
                        } ?: day
                    }
                    ActiveTrainingPlan(planId, startDate, schedule)
                }
            }
        }

    override suspend fun selectPlan(planId: TrainingPlanId, startDate: LocalDate) {
        // Replace whatever was active before: its check-ins belong to a different plan instance now,
        // so they're dropped along with it (the "are you sure" confirmation is a UI-layer concern,
        // see the interface doc).
        val previous = currentActivePlanIdOrNull()
        if (previous != null) dao.deleteAllCheckIns(previous)
        dao.setActivePlan(
            ActiveTrainingPlanEntity(
                planId = planId.name,
                startDateEpochDay = startDate.toEpochDay(),
                selectedAtEpochMs = Instant.now().toEpochMilli(),
            ),
        )
    }

    override suspend fun checkIn(dayOffset: Int) {
        val planId = currentActivePlanIdOrNull() ?: return
        dao.upsertCheckIn(TrainingCheckInEntity(planId, dayOffset, Instant.now().toEpochMilli()))
    }

    override suspend fun uncheckIn(dayOffset: Int) {
        val planId = currentActivePlanIdOrNull() ?: return
        dao.deleteCheckIn(planId, dayOffset)
    }

    override suspend fun clearActivePlan() {
        val planId = currentActivePlanIdOrNull()
        if (planId != null) dao.deleteAllCheckIns(planId)
        dao.clearActivePlan()
    }

    /** A one-shot read of whichever plan is active right now (its raw [ActiveTrainingPlanEntity.planId]
     *  string), without collecting the whole schedule — used by the mutating methods above, which only
     *  need to know *which* plan is active, not its generated days. */
    private suspend fun currentActivePlanIdOrNull(): String? =
        dao.activePlanOnce()?.planId
}
