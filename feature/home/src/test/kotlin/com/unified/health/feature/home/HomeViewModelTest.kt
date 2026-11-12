package com.unified.health.feature.home

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.domain.repository.TrainingPlanRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.ObserveHighlightsUseCase
import com.unified.health.core.domain.usecase.ObservePrimaryDeviceUseCase
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.domain.usecase.ObserveWeekActivitySummaryUseCase
import com.unified.health.core.model.ActiveTrainingPlan
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.HigdonNoviceSchedules
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.ScheduledDayKind
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.TrainingPlanId
import com.unified.health.core.model.UserPreferences
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flowOf
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
import java.time.Instant
import java.time.LocalDate

/**
 * Focuses on D-1190's "today's workout" derivation — every other input flow (health data, device,
 * preferences, races) is faked with the simplest value that keeps [HomeViewModel.uiState] at
 * [HomeUiState.Success], since those are already covered indirectly by this app's manual/E2E checks
 * and this test's job is just the new [HomeUiState.Success.todayWorkout] field.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {

    // [HomeViewModel]'s own derivation calls [ActiveTrainingPlan.entryOn] with no argument, which
    // defaults to `LocalDate.now()` — so every plan built here has to be anchored to the real "today"
    // too, not an arbitrary fixed date, or the two would never agree on which day is "today".
    private val today: LocalDate = LocalDate.now()

    private class FakeHealthDataRepository : HealthDataRepository {
        override fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary> = flowOf(
            DailyHealthSummary(
                date = date,
                steps = StepsSummary(date, 0, 8_000, 0.0),
                heartRate = HeartRateSummary(null, null, null, null),
                sleep = null,
                spO2 = null,
                stress = null,
                calories = CaloriesSummary(0, 500),
                activeMinutes = 0,
                activeMinutesGoal = 30,
            ),
        )
        override fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>> = flowOf(emptyList())
        override fun observeWorkouts(): Flow<List<Workout>> = flowOf(emptyList())
        override fun observeWorkout(id: String): Flow<Workout?> = flowOf(null)
        override fun observeWorkoutLaps(workoutId: String): Flow<List<WorkoutLap>> = flowOf(emptyList())
        override fun observeWorkoutSamples(workoutId: String): Flow<List<WorkoutSample>> = flowOf(emptyList())
        override fun observeHeartRateSamples(from: Instant, to: Instant, deviceId: String?): Flow<List<HeartRateSample>> = flowOf(emptyList())
        override fun observeSleep(date: LocalDate): Flow<SleepSession?> = flowOf(null)
        override fun observeLatestReading(metric: HealthMetricType, today: LocalDate): Flow<MetricReading?> = flowOf(null)
        override fun observeMetricReadings(metric: HealthMetricType, limit: Int): Flow<List<MetricReading>> = flowOf(emptyList())
    }

    private class FakeWearableDeviceRepository : WearableDeviceRepository {
        override val pairedDevices: Flow<List<com.unified.health.core.model.WearableDevice>> = flowOf(emptyList())
        override val connectionState: Flow<ConnectionState> = flowOf(ConnectionState.Disconnected)
        override val syncState: Flow<SyncState> = flowOf(SyncState.Idle)
        override fun scan(): Flow<List<DiscoveredDevice>> = flowOf(emptyList())
        override suspend fun pair(device: DiscoveredDevice) = error("not used")
        override suspend fun connect(deviceId: String) = Result.success(Unit)
        override suspend fun disconnect(deviceId: String) = Unit
        override suspend fun unpair(deviceId: String) = Unit
        override suspend fun syncNow(deviceId: String) = Result.success(Unit)
        override suspend fun reprocessRawPayloads(deviceId: String) = Result.success(0)
        override suspend fun setCredential(deviceId: String, key: String, value: String) = Result.success(Unit)
        override suspend fun generateCredential(deviceId: String, key: String) = Result.success("")
    }

    private class FakeUserPreferencesRepository : UserPreferencesRepository {
        override val userPreferences: Flow<UserPreferences> = flowOf(UserPreferences())
        override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
        override suspend fun setUnitSystem(unitSystem: com.unified.health.core.model.UnitSystem) = Unit
        override suspend fun setThemeMode(themeMode: com.unified.health.core.model.ThemeMode) = Unit
        override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
        override suspend fun setDailyStepGoal(steps: Int) = Unit
        override suspend fun setActiveCalorieGoalOverride(kcal: Int?) = Unit
        override suspend fun setSleepGoalHoursOverride(hours: Int?) = Unit
        override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) = Unit
        override suspend fun setFeedCards(order: List<String>, hidden: Set<String>) = Unit
        override suspend fun setHomeMetricsViewMode(mode: com.unified.health.core.model.HomeMetricsViewMode) = Unit
        override suspend fun setShowEmptyMetricCards(enabled: Boolean) = Unit
    }

    private class FakeRacesRepository : RacesRepository {
        override val races: Flow<RacesState> = flowOf(RacesState.Loading)
        override suspend fun refresh() = Unit
    }

    private class FakeLiveHealthRepository : LiveHealthRepository {
        override val heartRate: kotlinx.coroutines.flow.StateFlow<LiveHeartRate?> = MutableStateFlow(null)
        override val liveMetrics: kotlinx.coroutines.flow.StateFlow<Set<HealthMetricType>> = MutableStateFlow(emptySet())
    }

    private class FakeTrainingPlanRepository : TrainingPlanRepository {
        val plan = MutableStateFlow<ActiveTrainingPlan?>(null)
        override val activePlan: Flow<ActiveTrainingPlan?> = plan
        override suspend fun selectPlan(planId: TrainingPlanId, startDate: LocalDate) = Unit
        override suspend fun checkIn(dayOffset: Int) = Unit
        override suspend fun uncheckIn(dayOffset: Int) = Unit
        override suspend fun clearActivePlan() = Unit
    }

    private val trainingPlanRepository = FakeTrainingPlanRepository()
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel(savedStateHandle: SavedStateHandle = SavedStateHandle()): HomeViewModel {
        val healthData = FakeHealthDataRepository()
        val deviceRepository = FakeWearableDeviceRepository()
        return HomeViewModel(
            savedStateHandle = savedStateHandle,
            observeTodaySummary = ObserveTodaySummaryUseCase(healthData),
            observePrimaryDevice = ObservePrimaryDeviceUseCase(deviceRepository),
            observeHighlights = ObserveHighlightsUseCase(healthData),
            observeWeekActivitySummary = ObserveWeekActivitySummaryUseCase(healthData),
            deviceRepository = deviceRepository,
            healthData = healthData,
            preferences = FakeUserPreferencesRepository(),
            racesRepository = FakeRacesRepository(),
            trainingPlanRepository = trainingPlanRepository,
            liveHealth = FakeLiveHealthRepository(),
        )
    }

    private fun successState(vm: HomeViewModel) = vm.uiState.value as HomeUiState.Success

    @Test
    fun `no active plan means no today's workout`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        assertNull(successState(vm).todayWorkout)
    }

    @Test
    fun `plan active with today scheduled surfaces that day`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        trainingPlanRepository.plan.value = ActiveTrainingPlan(
            TrainingPlanId.NOVICE_5K,
            today,
            HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, today),
        )

        val workout = successState(vm).todayWorkout
        assertEquals(0, workout?.dayOffset) // startDate == today, so today is day 0 (a Monday-position Rest day)
        assertEquals(ScheduledDayKind.REST, workout?.kind)
    }

    @Test
    fun `plan active but today's entry already checked in surfaces nothing`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val schedule = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, today)
            .map { if (it.dayOffset == 0) it.copy(completed = true) else it }
        trainingPlanRepository.plan.value = ActiveTrainingPlan(TrainingPlanId.NOVICE_5K, today, schedule)

        assertNull(successState(vm).todayWorkout)
    }

    @Test
    fun `a run day today also surfaces, the derivation isn't rest-specific`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        // Day offset 1 (Tuesday position) is a run in the 5K plan; start the plan yesterday so today
        // lands on day offset 1 instead of day 0's Rest (covered by the test above).
        trainingPlanRepository.plan.value = ActiveTrainingPlan(
            TrainingPlanId.NOVICE_5K,
            today.minusDays(1),
            HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, today.minusDays(1)),
        )

        val workout = successState(vm).todayWorkout
        assertEquals(1, workout?.dayOffset)
        assertEquals(ScheduledDayKind.RUN, workout?.kind)
    }

    // D-1196: the "7 mini rings" week strip exposed on HomeUiState.Success.
    @Test
    fun `week has exactly 7 entries, Monday through Sunday`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val week = successState(vm).week
        assertEquals(7, week.size)
        assertEquals(java.time.DayOfWeek.MONDAY, week.first().summary.date.dayOfWeek)
        assertEquals(java.time.DayOfWeek.SUNDAY, week.last().summary.date.dayOfWeek)
    }

    @Test
    fun `week's today entry matches the big ring's own summary exactly`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val state = successState(vm)
        val todays = state.week.filter { it.isToday }
        assertEquals(1, todays.size)
        assertEquals(today, todays.single().summary.date)
        assertEquals(state.summary, todays.single().summary)
    }

    @Test
    fun `week flags days after today as future`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val week = successState(vm).week
        week.forEach { day -> assertEquals(day.summary.date.isAfter(today), day.isFuture) }
    }

    // D-1215: HomeViewModel's own wiring of HomeDaySelection — the pure toggle/future/out-of-week
    // rules themselves are covered exhaustively in HomeDaySelectionTest; these just confirm the
    // ViewModel actually plugs that logic into uiState/SavedStateHandle correctly.

    @Test
    fun `selecting a non-today day in the week updates selectedDate and the big ring's summary`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        // Guarded, not `.first`: on a Monday (the week's first day) there is no past, non-today day
        // to pick — `LocalDate.now()` drives `today` here (see this file's own `today`), so this
        // genuinely varies by the date the suite runs on.
        val pastDay = successState(vm).week.firstOrNull { !it.isToday && !it.isFuture } ?: return@runTest
        vm.selectDay(pastDay.summary.date)

        val state = successState(vm)
        assertEquals(pastDay.summary.date, state.selectedDate)
        assertEquals(pastDay.summary, state.selectedDaySummary)
    }

    @Test
    fun `today's own selectedDaySummary is exactly the big ring's summary, unaffected by selection`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val state = successState(vm)
        assertNull(state.selectedDate)
        assertEquals(state.summary, state.selectedDaySummary)
    }

    @Test
    fun `tapping the selected day again returns the selection to today`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val pastDay = successState(vm).week.firstOrNull { !it.isToday && !it.isFuture } ?: return@runTest
        vm.selectDay(pastDay.summary.date)
        assertEquals(pastDay.summary.date, successState(vm).selectedDate)

        vm.selectDay(pastDay.summary.date)
        assertNull(successState(vm).selectedDate)
    }

    @Test
    fun `jumpToToday resets the selection back to today`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val pastDay = successState(vm).week.firstOrNull { !it.isToday && !it.isFuture } ?: return@runTest
        vm.selectDay(pastDay.summary.date)
        assertEquals(pastDay.summary.date, successState(vm).selectedDate)

        vm.jumpToToday()
        assertNull(successState(vm).selectedDate)
    }

    @Test
    fun `selecting a future day is rejected`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        val futureDay = successState(vm).week.firstOrNull { it.isFuture }
        if (futureDay == null) return@runTest // today == Sunday: no future day exists this week, nothing to assert.

        vm.selectDay(futureDay.summary.date)
        assertNull(successState(vm).selectedDate)
    }

    @Test
    fun `a selection survives recreating the ViewModel from the same SavedStateHandle`() = runTest(dispatcher) {
        val handle = SavedStateHandle()
        val vm = viewModel(handle)
        backgroundScope.launch { vm.uiState.collect {} }
        val pastDay = successState(vm).week.firstOrNull { !it.isToday && !it.isFuture } ?: return@runTest
        vm.selectDay(pastDay.summary.date)
        assertEquals(pastDay.summary.date, successState(vm).selectedDate)

        val recreated = viewModel(handle)
        backgroundScope.launch { recreated.uiState.collect {} }
        assertEquals(pastDay.summary.date, successState(recreated).selectedDate)
    }
}
