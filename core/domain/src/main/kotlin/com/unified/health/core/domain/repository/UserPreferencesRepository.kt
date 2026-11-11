package com.unified.health.core.domain.repository

import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HomeMetricsViewMode
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

    /** Null resets to `MetricThresholds.defaultActiveCalorieGoal` (docs/DECISIONS.md D-1030). */
    suspend fun setActiveCalorieGoalOverride(kcal: Int?)

    /** Null resets to the default sleep target (docs/DECISIONS.md D-1030). */
    suspend fun setSleepGoalHoursOverride(hours: Int?)
    suspend fun setPinnedMetrics(metrics: List<HealthMetricType>)

    /** Persists the Health feed's "Edit cards": [order] (every known card id, in display order) and [hidden] ids. */
    suspend fun setFeedCards(order: List<String>, hidden: Set<String>)

    /** D-1074: persists the List/Grid toggle (D-1073) on Home's "All metrics" section. */
    suspend fun setHomeMetricsViewMode(mode: HomeMetricsViewMode)

    /** Debug-only Developer section toggle (D-1188): show every Home metric card, including no-data ones. */
    suspend fun setShowEmptyMetricCards(enabled: Boolean)
}
