package com.unified.health.core.data

import com.unified.health.core.data.database.ActiveTrainingPlanEntity
import com.unified.health.core.data.database.TrainingCheckInEntity
import com.unified.health.core.data.database.TrainingPlanDao
import com.unified.health.core.data.training.RoomTrainingPlanRepository
import com.unified.health.core.model.ScheduledDayKind
import com.unified.health.core.model.TrainingPlanId
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate

/**
 * [RoomTrainingPlanRepository] against a hand-written [TrainingPlanDao] fake (same technique as
 * `GearViewModelTest`'s `FakeGearRepository`, one layer lower) — [TrainingPlanDao] is a plain Room
 * `@Dao` interface with no Android-runtime dependency of its own, so a fake in-memory implementation
 * exercises the repository's real combine/overlay logic without needing an instrumented/Robolectric
 * SQLite database.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class RoomTrainingPlanRepositoryTest {

    private class FakeTrainingPlanDao : TrainingPlanDao {
        val active = MutableStateFlow<ActiveTrainingPlanEntity?>(null)
        val checkInsByPlan = mutableMapOf<String, MutableStateFlow<List<TrainingCheckInEntity>>>()

        private fun checkInsFlow(planId: String) = checkInsByPlan.getOrPut(planId) { MutableStateFlow(emptyList()) }

        override fun observeActivePlan(): Flow<ActiveTrainingPlanEntity?> = active

        override suspend fun activePlanOnce(): ActiveTrainingPlanEntity? = active.value

        override suspend fun setActivePlan(entity: ActiveTrainingPlanEntity) {
            active.value = entity
        }

        override suspend fun clearActivePlan() {
            active.value = null
        }

        override fun observeCheckIns(planId: String): Flow<List<TrainingCheckInEntity>> = checkInsFlow(planId)

        override suspend fun upsertCheckIn(entity: TrainingCheckInEntity) {
            val flow = checkInsFlow(entity.planId)
            flow.value = flow.value.filterNot { it.dayOffset == entity.dayOffset } + entity
        }

        override suspend fun deleteCheckIn(planId: String, dayOffset: Int) {
            val flow = checkInsFlow(planId)
            flow.value = flow.value.filterNot { it.dayOffset == dayOffset }
        }

        override suspend fun deleteAllCheckIns(planId: String) {
            checkInsFlow(planId).value = emptyList()
        }
    }

    private val dao = FakeTrainingPlanDao()
    private val repository = RoomTrainingPlanRepository(dao)

    private val startDate: LocalDate = LocalDate.of(2026, 11, 16)

    @Test
    fun `no plan selected yet emits null`() = runTest {
        assertNull(repository.activePlan.first())
    }

    @Test
    fun `selectPlan generates the full schedule from HigdonNoviceSchedules`() = runTest {
        repository.selectPlan(TrainingPlanId.NOVICE_5K, startDate)

        val plan = repository.activePlan.first()
        assertEquals(TrainingPlanId.NOVICE_5K, plan?.planId)
        assertEquals(startDate, plan?.startDate)
        assertEquals(56, plan?.schedule?.size)
        assertTrue(plan!!.schedule.none { it.completed })
    }

    @Test
    fun `checkIn marks just that day completed, the rest stay untouched`() = runTest {
        repository.selectPlan(TrainingPlanId.NOVICE_5K, startDate)

        repository.checkIn(dayOffset = 1) // week 1 Tuesday run

        val plan = repository.activePlan.first()!!
        val tuesday = plan.schedule.single { it.dayOffset == 1 }
        assertTrue(tuesday.completed)
        assertEquals(ScheduledDayKind.RUN, tuesday.kind)
        assertTrue(plan.schedule.filterNot { it.dayOffset == 1 }.none { it.completed })
    }

    @Test
    fun `uncheckIn reverts a previous checkIn`() = runTest {
        repository.selectPlan(TrainingPlanId.NOVICE_5K, startDate)
        repository.checkIn(dayOffset = 1)

        repository.uncheckIn(dayOffset = 1)

        val plan = repository.activePlan.first()!!
        assertTrue(plan.schedule.none { it.completed })
    }

    @Test
    fun `selecting a different plan while one is active replaces it and drops its check-ins`() = runTest {
        repository.selectPlan(TrainingPlanId.NOVICE_5K, startDate)
        repository.checkIn(dayOffset = 1)

        repository.selectPlan(TrainingPlanId.NOVICE_10K, startDate)

        val plan = repository.activePlan.first()!!
        assertEquals(TrainingPlanId.NOVICE_10K, plan.planId)
        assertEquals(56, plan.schedule.size)
        assertTrue(plan.schedule.none { it.completed })
        // The old plan's own check-in row is gone too, not just hidden.
        assertTrue(dao.checkInsByPlan.getValue(TrainingPlanId.NOVICE_5K.name).value.isEmpty())
    }

    @Test
    fun `clearActivePlan drops the plan and all of its check-ins`() = runTest {
        repository.selectPlan(TrainingPlanId.NOVICE_5K, startDate)
        repository.checkIn(dayOffset = 1)

        repository.clearActivePlan()

        assertNull(repository.activePlan.first())
        assertTrue(dao.checkInsByPlan.getValue(TrainingPlanId.NOVICE_5K.name).value.isEmpty())
    }

    @Test
    fun `checkIn and uncheckIn are no-ops when no plan is active`() = runTest {
        repository.checkIn(dayOffset = 0)
        repository.uncheckIn(dayOffset = 0)

        assertNull(repository.activePlan.first())
    }
}
