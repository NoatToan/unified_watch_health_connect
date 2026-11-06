package com.unified.health.core.domain.repository

import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import kotlinx.coroutines.flow.Flow

interface UserPreferencesRepository {
    val userPreferences: Flow<UserPreferences>
    suspend fun setOnboardingCompleted(completed: Boolean)
    suspend fun setUnitSystem(unitSystem: UnitSystem)
    suspend fun setThemeMode(themeMode: ThemeMode)
    suspend fun setUseDynamicColor(enabled: Boolean)
    suspend fun setDailyStepGoal(steps: Int)
    suspend fun setPinnedMetrics(metrics: List<HealthMetricType>)
}
