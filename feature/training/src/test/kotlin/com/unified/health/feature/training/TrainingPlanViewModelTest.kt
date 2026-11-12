package com.unified.health.feature.training

import com.unified.health.core.domain.repository.TrainingPlanRepository
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.HigdonNoviceSchedules
import com.unified.health.core.model.TrainingPlanId
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import java.time.LocalDate

@OptIn(ExperimentalCoroutinesApi::class)
class TrainingPlanViewModelTest {

    private class FakeTrainingPlanRepository : TrainingPlanRepository {
        val state = MutableStateFlow<ActiveTrainingPlan?>(null)
        override val activePlan: Flow<ActiveTrainingPlan?> = state
        var lastSelected: Pair<TrainingPlanId, LocalDate>? = null
        var lastCheckedIn: Int? = null
        var lastUncheckedIn: Int? = null

        override suspend fun selectPlan(planId: TrainingPlanId, startDate: LocalDate) {
            lastSelected = planId to startDate
            state.value = ActiveTrainingPlan(planId, startDate, HigdonNoviceSchedules.generate(planId, startDate))
        }

        override suspend fun checkIn(dayOffset: Int) {
            lastCheckedIn = dayOffset
        }

        override suspend fun uncheckIn(dayOffset: Int) {
            lastUncheckedIn = dayOffset
        }

        override suspend fun clearActivePlan() {
            state.value = null
        }
    }

    private val repository = FakeTrainingPlanRepository()
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel() = TrainingPlanViewModel(repository)

    @Test
    fun `no plan selected yet is null`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.activePlan.collect {} }

        assertNull(vm.activePlan.value)
    }

    @Test
    fun `selectPlan delegates to the repository and the new plan shows up`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.activePlan.collect {} }
        val start = LocalDate.of(2026, 11, 16)

        vm.selectPlan(TrainingPlanId.NOVICE_5K, start)

        assertEquals(TrainingPlanId.NOVICE_5K to start, repository.lastSelected)
        assertEquals(TrainingPlanId.NOVICE_5K, vm.activePlan.value?.planId)
    }

    @Test
    fun `checkIn and uncheckIn delegate to the repository with the given dayOffset`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.activePlan.collect {} }

        vm.checkIn(3)
        assertEquals(3, repository.lastCheckedIn)

        vm.uncheckIn(3)
        assertEquals(3, repository.lastUncheckedIn)
    }
}
