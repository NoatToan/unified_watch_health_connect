package com.unified.health.feature.gear

import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearItem
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
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class GearViewModelTest {

    private class FakeGearRepository : GearRepository {
        val state = MutableStateFlow<GearState>(GearState.Loading)
        override val items: Flow<GearState> = state
        var refreshCalls = 0
        override suspend fun refresh() {
            refreshCalls++
        }
    }

    private val repository = FakeGearRepository()
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel() = GearViewModel(repository)

    private fun item(id: String, category: GearCategory = GearCategory.ACCESSORIES) = GearItem(
        id = id,
        name = "Item $id",
        brand = "Brand",
        category = category,
        priceVnd = null,
        description = null,
        imageUrl = null,
        productUrl = "https://example.com/$id",
        variants = emptyList(),
    )

    @Test
    fun `default state shows every category`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("shoe", GearCategory.SHOES), item("shirt", GearCategory.APPAREL), item("cap", GearCategory.ACCESSORIES)),
        )

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(setOf("shoe", "shirt", "cap"), success.items.map { it.id }.toSet())
    }

    @Test
    fun `category filter narrows the list to just that category`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("shoe", GearCategory.SHOES), item("shirt", GearCategory.APPAREL)),
        )

        vm.setCategoryFilter(GearCategory.SHOES)

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(listOf("shoe"), success.items.map { it.id })
        assertEquals(GearCategory.SHOES, success.categoryFilter)
    }

    @Test
    fun `clearing the filter with null restores the full list`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("shoe", GearCategory.SHOES), item("shirt", GearCategory.APPAREL)),
        )
        vm.setCategoryFilter(GearCategory.SHOES)
        assertEquals(1, (vm.uiState.value as GearUiState.Success).items.size)

        vm.setCategoryFilter(null)

        assertEquals(2, (vm.uiState.value as GearUiState.Success).items.size)
    }

    @Test
    fun `Loading, Empty and Error pass through from the repository unchanged`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }

        assertEquals(GearUiState.Loading, vm.uiState.value)

        repository.state.value = GearState.Empty
        assertEquals(GearUiState.Empty, vm.uiState.value)

        repository.state.value = GearState.Error("boom")
        assertEquals(GearUiState.Error("boom"), vm.uiState.value)
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
