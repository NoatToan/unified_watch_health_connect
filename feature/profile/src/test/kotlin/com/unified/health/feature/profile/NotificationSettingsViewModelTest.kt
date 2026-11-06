package com.unified.health.feature.profile

import com.unified.health.core.domain.repository.NotificationPreferencesRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.NotificationPreferences
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import com.unified.health.feature.profile.notifications.NotificationSettingsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.time.LocalDate

@OptIn(ExperimentalCoroutinesApi::class)
class NotificationSettingsViewModelTest {

    private class FakeNotifications : NotificationPreferencesRepository {
        val prefs = MutableStateFlow(NotificationPreferences())
        override val preferences: Flow<NotificationPreferences> = prefs
        override suspend fun setSyncReminders(enabled: Boolean) = prefs.update { it.copy(syncReminders = enabled) }
        override suspend fun setGoalAchieved(enabled: Boolean) = prefs.update { it.copy(goalAchieved = enabled) }
        override suspend fun setLowWatchBattery(enabled: Boolean) = prefs.update { it.copy(lowWatchBattery = enabled) }
        override val goalNotifiedOn: Flow<LocalDate?> = MutableStateFlow(null)
        override suspend fun setGoalNotifiedOn(date: LocalDate) = Unit
        override val lowBatteryAlertedDevices: Flow<Set<String>> = MutableStateFlow(emptySet())
        override suspend fun setLowBatteryAlertedDevices(deviceIds: Set<String>) = Unit
    }

    private class FakeUserPreferences : UserPreferencesRepository {
        override val userPreferences = MutableStateFlow(UserPreferences(dailyStepGoal = 10_000))
        override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
        override suspend fun setUnitSystem(unitSystem: UnitSystem) = Unit
        override suspend fun setThemeMode(themeMode: ThemeMode) = Unit
        override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
        override suspend fun setDailyStepGoal(steps: Int) = Unit
        override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) = Unit
    }

    private val notifications = FakeNotifications()

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    @Test
    fun `defaults and step goal are exposed once loaded`() = runTest(dispatcher) {
        val vm = NotificationSettingsViewModel(notifications, FakeUserPreferences())
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value
        assertFalse(state.isLoading)
        assertEquals(10_000, state.dailyStepGoal)
        assertTrue(state.preferences.goalAchieved)
        assertTrue(state.preferences.lowWatchBattery)
        assertFalse(state.preferences.syncReminders)
    }

    @Test
    fun `toggles are written to the repository and reflected`() = runTest(dispatcher) {
        val vm = NotificationSettingsViewModel(notifications, FakeUserPreferences())
        backgroundScope.launch { vm.uiState.collect {} }
        vm.setGoalAchieved(false)
        vm.setLowWatchBattery(false)
        vm.setSyncReminders(true)
        assertEquals(NotificationPreferences(syncReminders = true, goalAchieved = false, lowWatchBattery = false), notifications.prefs.value)
        assertEquals(notifications.prefs.value, vm.uiState.value.preferences)
    }
}
