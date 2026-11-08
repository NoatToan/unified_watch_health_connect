package com.unified.health.feature.profile

import com.unified.health.core.domain.repository.DemoDataController
import com.unified.health.core.domain.repository.DemoModeController
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
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
import java.util.Optional

/**
 * Covers the "Demo mode" toggle logic (default off, turning off always asks first, turning on is
 * immediate) and the Fill/Clear demo data wiring, independent of `:core:demo`'s real implementation.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class ProfileViewModelTest {

    private class FakeUserPreferences : UserPreferencesRepository {
        override val userPreferences = MutableStateFlow(UserPreferences())
        override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
        override suspend fun setUnitSystem(unitSystem: UnitSystem) = Unit
        override suspend fun setThemeMode(themeMode: ThemeMode) = Unit
        override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
        override suspend fun setDailyStepGoal(steps: Int) = Unit
        override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) = Unit
        override suspend fun setFeedCards(order: List<String>, hidden: Set<String>) = Unit
    }

    private class FakeDemoDataController : DemoDataController {
        var seedCalls = 0
        var clearCalls = 0
        var seedResult = 12_345
        override suspend fun seed(days: Int): Int {
            seedCalls++
            return seedResult
        }
        override suspend fun clearDemoData() {
            clearCalls++
        }
    }

    private class FakeDemoModeController(initial: Boolean = false) : DemoModeController {
        private val state = MutableStateFlow(initial)
        val setEnabledCalls = mutableListOf<Boolean>()
        override val enabled: StateFlow<Boolean> = state
        override suspend fun setEnabled(enabled: Boolean) {
            setEnabledCalls += enabled
            state.value = enabled
        }
    }

    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun vm(demo: DemoDataController? = null, mode: DemoModeController? = null) = ProfileViewModel(
        preferences = FakeUserPreferences(),
        demoData = Optional.ofNullable(demo),
        demoMode = Optional.ofNullable(mode),
    )

    @Test
    fun `developer tools are hidden when core demo is absent (release)`() {
        val viewModel = vm()
        assertFalse(viewModel.developerToolsAvailable)
        assertFalse(viewModel.demoModeEnabled.value)
    }

    @Test
    fun `developer tools are visible once both controllers are present, demo mode defaults off`() {
        val viewModel = vm(FakeDemoDataController(), FakeDemoModeController())
        assertTrue(viewModel.developerToolsAvailable)
        assertFalse(viewModel.demoModeEnabled.value)
    }

    @Test
    fun `switching demo mode on is immediate, no confirmation`() = runTest(dispatcher) {
        val mode = FakeDemoModeController()
        val viewModel = vm(FakeDemoDataController(), mode)
        viewModel.onDemoModeSwitch(true)
        assertEquals(listOf(true), mode.setEnabledCalls)
        assertTrue(viewModel.demoModeEnabled.value)
        assertNull("turning on needs no dialog", viewModel.dialog.value)
    }

    @Test
    fun `switching demo mode off asks first and does not disable until confirmed`() = runTest(dispatcher) {
        val mode = FakeDemoModeController(initial = true)
        val viewModel = vm(FakeDemoDataController(), mode)
        viewModel.onDemoModeSwitch(false)
        assertEquals("setEnabled(false) must wait for confirmation", emptyList<Boolean>(), mode.setEnabledCalls)
        assertEquals(DeveloperDialog.ConfirmTurnOffDemoMode, viewModel.dialog.value)
        assertTrue("still on until confirmed", viewModel.demoModeEnabled.value)
    }

    @Test
    fun `confirming turn-off with clear wipes demo data then disables`() = runTest(dispatcher) {
        val demo = FakeDemoDataController()
        val mode = FakeDemoModeController(initial = true)
        val viewModel = vm(demo, mode)
        viewModel.onDemoModeSwitch(false)
        viewModel.confirmTurnOffDemoMode(alsoClearData = true)
        assertEquals(1, demo.clearCalls)
        assertEquals(listOf(false), mode.setEnabledCalls)
        assertFalse(viewModel.demoModeEnabled.value)
        assertNull(viewModel.dialog.value)
    }

    @Test
    fun `confirming turn-off without clearing keeps the demo data`() = runTest(dispatcher) {
        val demo = FakeDemoDataController()
        val mode = FakeDemoModeController(initial = true)
        val viewModel = vm(demo, mode)
        viewModel.onDemoModeSwitch(false)
        viewModel.confirmTurnOffDemoMode(alsoClearData = false)
        assertEquals(0, demo.clearCalls)
        assertEquals(listOf(false), mode.setEnabledCalls)
    }

    @Test
    fun `fill demo data reports how many records were written`() = runTest(dispatcher) {
        val demo = FakeDemoDataController().apply { seedResult = 54_321 }
        val viewModel = vm(demo, FakeDemoModeController(initial = true))
        backgroundScope.launch { viewModel.developerStatus.collect {} }
        viewModel.fillDemoData()
        assertEquals(1, demo.seedCalls)
        val status = viewModel.developerStatus.value
        assertTrue(status is DeveloperStatus.Done)
        assertTrue((status as DeveloperStatus.Done).message.contains("54321") || status.message.contains("54,321"))
    }

    @Test
    fun `clear demo data asks first, never deletes without confirmation`() = runTest(dispatcher) {
        val demo = FakeDemoDataController()
        val viewModel = vm(demo, FakeDemoModeController(initial = true))
        viewModel.requestClearDemoData()
        assertEquals(DeveloperDialog.ConfirmClearDemoData, viewModel.dialog.value)
        assertEquals(0, demo.clearCalls)

        viewModel.confirmClearDemoData()
        assertEquals(1, demo.clearCalls)
        assertNull(viewModel.dialog.value)
    }

    @Test
    fun `dismissing a dialog performs no action`() = runTest(dispatcher) {
        val demo = FakeDemoDataController()
        val mode = FakeDemoModeController(initial = true)
        val viewModel = vm(demo, mode)
        viewModel.requestClearDemoData()
        viewModel.dismissDialog()
        assertNull(viewModel.dialog.value)
        assertEquals(0, demo.clearCalls)
    }
}
