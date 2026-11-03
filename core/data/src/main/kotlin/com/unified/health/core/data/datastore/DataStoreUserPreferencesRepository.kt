package com.unified.health.core.data.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class DataStoreUserPreferencesRepository @Inject constructor(
    private val dataStore: DataStore<Preferences>,
) : UserPreferencesRepository {

    private object Keys {
        val onboardingCompleted = booleanPreferencesKey("onboarding_completed")
        val unitSystem = stringPreferencesKey("unit_system")
        val themeMode = stringPreferencesKey("theme_mode")
        val dynamicColor = booleanPreferencesKey("dynamic_color")
        val stepGoal = intPreferencesKey("daily_step_goal")
    }

    override val userPreferences: Flow<UserPreferences> = dataStore.data.map { p ->
        val defaults = UserPreferences()
        UserPreferences(
            onboardingCompleted = p[Keys.onboardingCompleted] ?: defaults.onboardingCompleted,
            unitSystem = p[Keys.unitSystem]?.let { runCatching { UnitSystem.valueOf(it) }.getOrNull() } ?: defaults.unitSystem,
            themeMode = p[Keys.themeMode]?.let { runCatching { ThemeMode.valueOf(it) }.getOrNull() } ?: defaults.themeMode,
            useDynamicColor = p[Keys.dynamicColor] ?: defaults.useDynamicColor,
            dailyStepGoal = p[Keys.stepGoal] ?: defaults.dailyStepGoal,
        )
    }

    override suspend fun setOnboardingCompleted(completed: Boolean) {
        dataStore.edit { it[Keys.onboardingCompleted] = completed }
    }

    override suspend fun setUnitSystem(unitSystem: UnitSystem) {
        dataStore.edit { it[Keys.unitSystem] = unitSystem.name }
    }

    override suspend fun setThemeMode(themeMode: ThemeMode) {
        dataStore.edit { it[Keys.themeMode] = themeMode.name }
    }

    override suspend fun setUseDynamicColor(enabled: Boolean) {
        dataStore.edit { it[Keys.dynamicColor] = enabled }
    }

    override suspend fun setDailyStepGoal(steps: Int) {
        require(steps > 0) { "Step goal must be positive" }
        dataStore.edit { it[Keys.stepGoal] = steps }
    }
}
