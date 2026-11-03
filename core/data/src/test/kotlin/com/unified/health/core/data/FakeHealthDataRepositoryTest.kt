package com.unified.health.core.data

import com.unified.health.core.data.repository.FakeHealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate

class FakeHealthDataRepositoryTest {

    private val prefs = object : UserPreferencesRepository {
        override val userPreferences: Flow<UserPreferences> = flowOf(UserPreferences(dailyStepGoal = 10_000))
        override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
        override suspend fun setUnitSystem(unitSystem: UnitSystem) = Unit
        override suspend fun setThemeMode(themeMode: ThemeMode) = Unit
        override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
        override suspend fun setDailyStepGoal(steps: Int) = Unit
    }
    private val repo = FakeHealthDataRepository(prefs)
    private val date = LocalDate.of(2026, 10, 31)

    @Test
    fun `daily summary is deterministic and uses the step goal`() = runTest {
        val a = repo.observeDailySummary(date).first()
        val b = repo.observeDailySummary(date).first()
        assertEquals(a, b)
        assertEquals(10_000, a.steps.goal)
        assertEquals(a.steps.hourly.sum(), a.steps.count)
    }

    @Test
    fun `series sizes match the requested range`() = runTest {
        assertEquals(24, repo.observeMetricSeries(HealthMetricType.STEPS, TimeRange.DAY, date).first().size)
        assertEquals(7, repo.observeMetricSeries(HealthMetricType.STEPS, TimeRange.WEEK, date).first().size)
        assertEquals(30, repo.observeMetricSeries(HealthMetricType.STEPS, TimeRange.MONTH, date).first().size)
    }

    @Test
    fun `fake workouts are non empty`() = runTest {
        assertTrue(repo.observeWorkouts().first().isNotEmpty())
    }
}
