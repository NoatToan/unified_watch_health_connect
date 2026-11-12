package com.unified.health.feature.gear

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.domain.usecase.ColorFamily
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearGender
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant
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
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
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

    private fun viewModel(savedStateHandle: SavedStateHandle = SavedStateHandle()) = GearViewModel(savedStateHandle, repository)

    private fun item(
        id: String,
        category: GearCategory = GearCategory.ACCESSORIES,
        priceVnd: Long? = null,
        variants: List<GearVariant> = emptyList(),
        gender: GearGender? = null,
    ) = GearItem(
        id = id,
        name = "Item $id",
        brand = "Brand",
        category = category,
        priceVnd = priceVnd,
        description = null,
        imageUrl = null,
        productUrl = "https://example.com/$id",
        variants = variants,
        gender = gender,
    )

    private fun variant(color: String) = GearVariant(color = color, imageUrl = null, productUrl = "https://example.com/v/$color")

    @Test
    fun `default state shows every category`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("shoe", GearCategory.SHOES), item("shirt", GearCategory.APPAREL), item("cap", GearCategory.ACCESSORIES)),
        )

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(setOf("shoe", "shirt", "cap"), success.items.map { it.id }.toSet())
        assertEquals(0, success.activeFilterCount)
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

    @Test
    fun `price range filter excludes items outside the range and null-priced items`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("cheap", priceVnd = 300_000), item("mid", priceVnd = 800_000), item("noPrice", priceVnd = null)),
        )

        vm.setPriceRangeFilter(500_000L..1_000_000L)

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(listOf("mid"), success.items.map { it.id })
        assertEquals(500_000L..1_000_000L, success.priceRangeFilter)
        assertEquals(1, success.activeFilterCount)
    }

    @Test
    fun `clearing the price filter restores null-priced items`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(listOf(item("mid", priceVnd = 800_000), item("noPrice", priceVnd = null)))
        vm.setPriceRangeFilter(500_000L..1_000_000L)
        assertEquals(1, (vm.uiState.value as GearUiState.Success).items.size)

        vm.setPriceRangeFilter(null)

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(2, success.items.size)
        assertNull(success.priceRangeFilter)
    }

    @Test
    fun `color filter toggles a family on and off, matching any variant's dominant family`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(
                item("black", variants = listOf(variant("PUMA Black"))),
                item("white", variants = listOf(variant("PUMA White"))),
                item("noColor"),
            ),
        )

        vm.toggleColorFamily(ColorFamily.BLACK)

        var success = vm.uiState.value as GearUiState.Success
        assertEquals(listOf("black"), success.items.map { it.id })
        assertEquals(setOf(ColorFamily.BLACK), success.colorFilter)
        assertEquals(1, success.activeFilterCount)

        vm.toggleColorFamily(ColorFamily.BLACK)

        success = vm.uiState.value as GearUiState.Success
        assertEquals(3, success.items.size)
        assertTrue(success.colorFilter.isEmpty())
    }

    @Test
    fun `color filter is multi-select, matching any selected family`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(
                item("black", variants = listOf(variant("PUMA Black"))),
                item("white", variants = listOf(variant("PUMA White"))),
                item("red", variants = listOf(variant("Ultra Red"))),
            ),
        )

        vm.toggleColorFamily(ColorFamily.BLACK)
        vm.toggleColorFamily(ColorFamily.WHITE)

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(setOf("black", "white"), success.items.map { it.id }.toSet())
    }

    @Test
    fun `removeColorFamily drops just that one family`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        vm.toggleColorFamily(ColorFamily.BLACK)
        vm.toggleColorFamily(ColorFamily.WHITE)

        vm.removeColorFamily(ColorFamily.BLACK)

        repository.state.value = GearState.Success(emptyList())
        assertEquals(setOf(ColorFamily.WHITE), (vm.uiState.value as GearUiState.Success).colorFilter)
    }

    @Test
    fun `clearFilters resets price, color and gender but keeps the category filter`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(
                item(
                    "shoe", GearCategory.SHOES, priceVnd = 800_000,
                    variants = listOf(variant("PUMA Black")), gender = GearGender.MEN,
                ),
            ),
        )
        vm.setCategoryFilter(GearCategory.SHOES)
        vm.setPriceRangeFilter(500_000L..1_000_000L)
        vm.toggleColorFamily(ColorFamily.BLACK)
        vm.setGenderFilter(GearGender.MEN)

        vm.clearFilters()

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(GearCategory.SHOES, success.categoryFilter)
        assertNull(success.priceRangeFilter)
        assertTrue(success.colorFilter.isEmpty())
        assertNull(success.genderFilter)
        assertEquals(0, success.activeFilterCount)
    }

    // --- gender filter (gender-filter task, 2026-11-12) ---

    @Test
    fun `gender filter narrows to that gender, UNISEX matches both MEN and WOMEN`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(
                item("men", gender = GearGender.MEN),
                item("women", gender = GearGender.WOMEN),
                item("unisex", gender = GearGender.UNISEX),
                item("none", gender = null),
            ),
        )

        vm.setGenderFilter(GearGender.MEN)
        var success = vm.uiState.value as GearUiState.Success
        assertEquals(setOf("men", "unisex"), success.items.map { it.id }.toSet())
        assertEquals(1, success.activeFilterCount)

        vm.setGenderFilter(GearGender.WOMEN)
        success = vm.uiState.value as GearUiState.Success
        assertEquals(setOf("women", "unisex"), success.items.map { it.id }.toSet())

        vm.setGenderFilter(null)
        success = vm.uiState.value as GearUiState.Success
        assertEquals(4, success.items.size)
        assertEquals(0, success.activeFilterCount)
    }

    @Test
    fun `KIDS gender filter matches only KIDS, not UNISEX`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("kids", gender = GearGender.KIDS), item("unisex", gender = GearGender.UNISEX)),
        )

        vm.setGenderFilter(GearGender.KIDS)

        val success = vm.uiState.value as GearUiState.Success
        assertEquals(listOf("kids"), success.items.map { it.id })
    }

    @Test
    fun `hasKidsAvailable comes from the category-filtered set, true only when a KIDS item exists`() = runTest(dispatcher) {
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        repository.state.value = GearState.Success(
            listOf(item("men", GearCategory.SHOES, gender = GearGender.MEN)),
        )
        assertFalse((vm.uiState.value as GearUiState.Success).hasKidsAvailable)

        repository.state.value = GearState.Success(
            listOf(
                item("men", GearCategory.SHOES, gender = GearGender.MEN),
                item("kid", GearCategory.SHOES, gender = GearGender.KIDS),
            ),
        )
        assertTrue((vm.uiState.value as GearUiState.Success).hasKidsAvailable)

        // Still true even once the gender filter itself narrows the visible items down to none —
        // same "computed pre-filter" rule as priceBoundsVnd/availableColorFamilies.
        vm.setGenderFilter(GearGender.MEN)
        val success = vm.uiState.value as GearUiState.Success
        assertEquals(listOf("men"), success.items.map { it.id })
        assertTrue(success.hasKidsAvailable)
    }

    @Test
    fun `availableColorFamilies and priceBoundsVnd come from the category-filtered set, unaffected by price or color filters`() =
        runTest(dispatcher) {
            val vm = viewModel()
            backgroundScope.launch { vm.uiState.collect {} }
            repository.state.value = GearState.Success(
                listOf(
                    item("black", priceVnd = 300_000, variants = listOf(variant("PUMA Black"))),
                    item("white", priceVnd = 1_500_000, variants = listOf(variant("PUMA White"))),
                ),
            )

            vm.toggleColorFamily(ColorFamily.BLACK)
            vm.setPriceRangeFilter(0L..1_000_000L)

            val success = vm.uiState.value as GearUiState.Success
            assertEquals(300_000L..1_500_000L, success.priceBoundsVnd)
            assertEquals(setOf(ColorFamily.BLACK, ColorFamily.WHITE), success.availableColorFamilies.map { it.family }.toSet())
        }

    @Test
    fun `filters survive recreating the ViewModel from the same SavedStateHandle (process death)`() = runTest(dispatcher) {
        val handle = SavedStateHandle()
        val vm = viewModel(handle)
        backgroundScope.launch { vm.uiState.collect {} }
        vm.setCategoryFilter(GearCategory.SHOES)
        vm.setPriceRangeFilter(500_000L..1_000_000L)
        vm.toggleColorFamily(ColorFamily.BLACK)
        vm.setGenderFilter(GearGender.WOMEN)

        val recreated = viewModel(handle)
        backgroundScope.launch { recreated.uiState.collect {} }
        repository.state.value = GearState.Success(emptyList())

        val success = recreated.uiState.value as GearUiState.Success
        assertEquals(GearCategory.SHOES, success.categoryFilter)
        assertEquals(500_000L..1_000_000L, success.priceRangeFilter)
        assertEquals(setOf(ColorFamily.BLACK), success.colorFilter)
        assertEquals(GearGender.WOMEN, success.genderFilter)
        assertFalse(success.activeFilterCount == 0)
    }
}
