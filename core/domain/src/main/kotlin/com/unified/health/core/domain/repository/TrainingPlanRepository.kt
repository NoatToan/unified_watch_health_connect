package com.unified.health.core.domain.repository

import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.TrainingPlanId
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/**
 * The one Hal Higdon Novice training plan (docs/DECISIONS.md D-1190) a user is currently following —
 * v1 scope is deliberately **one active plan at a time**: [selectPlan] replaces whatever was active
 * before (the UI confirms this with the user first when one is already active, since it discards that
 * plan's check-in progress — see [clearActivePlan]'s own doc).
 */
interface TrainingPlanRepository {
    /** Null when no plan is currently selected. [ActiveTrainingPlan.schedule] is generated fresh from
     *  [com.unified.health.core.model.HigdonNoviceSchedules] on every emission and overlaid with
     *  whatever check-in rows are stored for it — never stored as a huge table of its own. */
    val activePlan: Flow<ActiveTrainingPlan?>

    /** Starts following [planId] from [startDate] onward. Replaces any previously active plan (and
     *  its check-in progress) outright — the confirmation prompt is a UI-layer concern. */
    suspend fun selectPlan(planId: TrainingPlanId, startDate: LocalDate)

    /** Marks the active plan's day at [dayOffset] as completed, timestamped now. No-op if no plan is
     *  active (shouldn't normally happen from the UI, but never crashes). */
    suspend fun checkIn(dayOffset: Int)

    /** Reverts [checkIn] for [dayOffset]. */
    suspend fun uncheckIn(dayOffset: Int)

    /** Drops the active plan and all of its check-in progress — no plan selected afterward. */
    suspend fun clearActivePlan()
}
