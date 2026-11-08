package com.unified.health.feature.races

import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceRegistrationStatus
import com.unified.health.core.model.RaceStatus
import com.unified.health.core.model.RaceTerrain
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
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.time.LocalDate
import java.time.YearMonth

@OptIn(ExperimentalCoroutinesApi::class)
class RacesViewModelTest {

    private class FakeRacesRepository : RacesRepository {
        val state = MutableStateFlow<RacesState>(RacesState.Loading)
        override val races: Flow<RacesState> = state
        var refreshCalls = 0
        override suspend fun refresh() {
            refreshCalls++
        }
    }

    private val repository = FakeRacesRepository()
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel() = RacesViewModel(repository)

    private fun race(
        id: String,
        province: String? = "Hà Nội",
        startDate: LocalDate = LocalDate.of(2026, 12, 1),
        raceStatus: RaceStatus = RaceStatus.UPCOMING,
    ) = Race(
        id = id,
        name = "Race $id",
        startDate = startDate,
        endDate = null,
        province = province,
        location = null,
        terrain = RaceTerrain.ROAD,
        distances = emptyList(),
        priceFromVnd = null,
        registrationStatus = RaceRegistrationStatus.OPEN,
        organizer = null,
        registrationUrl = "https://example.com/$id",
        imageUrl = null,
        description = null,
        raceStatus = raceStatus,
    )

    @Test
    fun `default state shows only upcoming races, hiding past ones`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(
                race("upcoming-1", raceStatus = RaceStatus.UPCOMING),
                race("past-1", raceStatus = RaceStatus.PAST),
            ),
        )

        val success = vm.uiState.value as RacesUiState.Success
        assertEquals(listOf("upcoming-1"), success.races.map { it.id })
    }

    @Test
    fun `enabling showPast brings past races into the result alongside upcoming ones`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(
                race("upcoming-1", raceStatus = RaceStatus.UPCOMING),
                race("past-1", raceStatus = RaceStatus.PAST),
            ),
        )

        vm.setShowPast(true)

        val success = vm.uiState.value as RacesUiState.Success
        assertEquals(setOf("upcoming-1", "past-1"), success.races.map { it.id }.toSet())
        assertTrue(success.filters.showPast)
    }

    @Test
    fun `province filter narrows the list and available options reflect the whole feed`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(
                race("hanoi-1", province = "Hà Nội"),
                race("hcmc-1", province = "Hồ Chí Minh"),
            ),
        )

        vm.setProvinceFilter("Hà Nội")

        val success = vm.uiState.value as RacesUiState.Success
        assertEquals(listOf("hanoi-1"), success.races.map { it.id })
        assertEquals(listOf("Hà Nội", "Hồ Chí Minh"), success.availableProvinces)
    }

    @Test
    fun `month filter narrows by the race's startDate year-month`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(
                race("nov", startDate = LocalDate.of(2026, 11, 15)),
                race("dec", startDate = LocalDate.of(2026, 12, 15)),
            ),
        )

        vm.setMonthFilter(YearMonth.of(2026, 11))

        val success = vm.uiState.value as RacesUiState.Success
        assertEquals(listOf("nov"), success.races.map { it.id })
    }

    @Test
    fun `province and month filters combine with AND`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(
                race("match", province = "Hà Nội", startDate = LocalDate.of(2026, 11, 15)),
                race("wrong-province", province = "Hồ Chí Minh", startDate = LocalDate.of(2026, 11, 15)),
                race("wrong-month", province = "Hà Nội", startDate = LocalDate.of(2026, 12, 15)),
            ),
        )

        vm.setProvinceFilter("Hà Nội")
        vm.setMonthFilter(YearMonth.of(2026, 11))

        val success = vm.uiState.value as RacesUiState.Success
        assertEquals(listOf("match"), success.races.map { it.id })
    }

    @Test
    fun `clearing a filter with null restores the full (status-filtered) list`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = RacesState.Success(
            listOf(race("a", province = "Hà Nội"), race("b", province = "Hồ Chí Minh")),
        )
        vm.setProvinceFilter("Hà Nội")
        assertEquals(1, (vm.uiState.value as RacesUiState.Success).races.size)

        vm.setProvinceFilter(null)

        assertEquals(2, (vm.uiState.value as RacesUiState.Success).races.size)
    }

    @Test
    fun `Loading, Empty and Error pass through from the repository unchanged`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        assertEquals(RacesUiState.Loading, vm.uiState.value)

        repository.state.value = RacesState.Empty
        assertEquals(RacesUiState.Empty, vm.uiState.value)

        repository.state.value = RacesState.Error("boom")
        assertEquals(RacesUiState.Error("boom"), vm.uiState.value)
    }

    @Test
    fun `refresh delegates to the repository and toggles isRefreshing`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        backgroundScope.launch { vm.isRefreshing.collect {} }

        vm.refresh()

        assertEquals(1, repository.refreshCalls)
        assertEquals(false, vm.isRefreshing.value)
    }
}
