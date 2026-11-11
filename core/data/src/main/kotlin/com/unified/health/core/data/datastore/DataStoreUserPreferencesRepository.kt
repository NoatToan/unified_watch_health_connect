package com.unified.health.core.data.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HomeMetricsViewMode
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
        val calorieGoalOverride = intPreferencesKey("active_calorie_goal_override")
        val sleepGoalHoursOverride = intPreferencesKey("sleep_goal_hours_override")

        /** Comma-separated [HealthMetricType] names, in display order. */
        val pinnedMetrics = stringPreferencesKey("pinned_metrics")

        /** Comma-separated feed card ids ([FeedCardId] or [HealthMetricType] names), in display order. */
        val feedCardOrder = stringPreferencesKey("feed_card_order")

        /** Comma-separated feed card ids hidden from the feed. */
        val hiddenFeedCards = stringPreferencesKey("hidden_feed_cards")

        /** D-1074: [HomeMetricsViewMode] name. */
        val homeMetricsViewMode = stringPreferencesKey("home_metrics_view_mode")

        /** D-1188: Profile's debug-only Developer section toggle. */
        val showEmptyMetricCards = booleanPreferencesKey("show_empty_metric_cards")
    }

    override val userPreferences: Flow<UserPreferences> = dataStore.data.map { p ->
        val defaults = UserPreferences()
        UserPreferences(
            onboardingCompleted = p[Keys.onboardingCompleted] ?: defaults.onboardingCompleted,
            unitSystem = p[Keys.unitSystem]?.let { runCatching { UnitSystem.valueOf(it) }.getOrNull() } ?: defaults.unitSystem,
            themeMode = p[Keys.themeMode]?.let { runCatching { ThemeMode.valueOf(it) }.getOrNull() } ?: defaults.themeMode,
            useDynamicColor = p[Keys.dynamicColor] ?: defaults.useDynamicColor,
            dailyStepGoal = p[Keys.stepGoal] ?: defaults.dailyStepGoal,
            activeCalorieGoalOverride = p[Keys.calorieGoalOverride],
            sleepGoalHoursOverride = p[Keys.sleepGoalHoursOverride],
            pinnedMetrics = p[Keys.pinnedMetrics]?.let(::parseMetrics) ?: defaults.pinnedMetrics,
            feedCardOrder = p[Keys.feedCardOrder]?.let(::parseFeedCardOrder) ?: defaults.feedCardOrder,
            hiddenFeedCards = p[Keys.hiddenFeedCards]?.let(::parseFeedCardIds)?.toSet() ?: defaults.hiddenFeedCards,
            homeMetricsViewMode = p[Keys.homeMetricsViewMode]?.let { runCatching { HomeMetricsViewMode.valueOf(it) }.getOrNull() }
                ?: defaults.homeMetricsViewMode,
            showEmptyMetricCards = p[Keys.showEmptyMetricCards] ?: defaults.showEmptyMetricCards,
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

    override suspend fun setActiveCalorieGoalOverride(kcal: Int?) {
        require(kcal == null || kcal > 0) { "Calorie goal must be positive" }
        dataStore.edit { if (kcal == null) it.remove(Keys.calorieGoalOverride) else it[Keys.calorieGoalOverride] = kcal }
    }

    override suspend fun setSleepGoalHoursOverride(hours: Int?) {
        require(hours == null || hours > 0) { "Sleep goal must be positive" }
        dataStore.edit { if (hours == null) it.remove(Keys.sleepGoalHoursOverride) else it[Keys.sleepGoalHoursOverride] = hours }
    }

    override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) {
        dataStore.edit { it[Keys.pinnedMetrics] = metrics.distinct().joinToString(",") { m -> m.name } }
    }

    override suspend fun setFeedCards(order: List<String>, hidden: Set<String>) {
        dataStore.edit {
            it[Keys.feedCardOrder] = order.filter(::isKnownFeedCard).distinct().joinToString(",")
            it[Keys.hiddenFeedCards] = hidden.filter(::isKnownFeedCard).distinct().joinToString(",")
        }
    }

    override suspend fun setHomeMetricsViewMode(mode: HomeMetricsViewMode) {
        dataStore.edit { it[Keys.homeMetricsViewMode] = mode.name }
    }

    override suspend fun setShowEmptyMetricCards(enabled: Boolean) {
        dataStore.edit { it[Keys.showEmptyMetricCards] = enabled }
    }

    /** Unknown names (a metric removed in a later version) are skipped. */
    private fun parseMetrics(raw: String): List<HealthMetricType> =
        raw.split(',').filter { it.isNotBlank() }.mapNotNull { name -> HealthMetricType.entries.firstOrNull { it.name == name } }

    private fun parseFeedCardIds(raw: String): List<String> = raw.split(',').filter { it.isNotBlank() && isKnownFeedCard(it) }

    /** Stored order, with any card id added after this install (app upgrade) appended at the end. */
    private fun parseFeedCardOrder(raw: String): List<String> {
        val stored = parseFeedCardIds(raw)
        return stored + (UserPreferences.DEFAULT_FEED_CARD_ORDER - stored.toSet())
    }

    private fun isKnownFeedCard(id: String): Boolean =
        id == FeedCardId.ACTIVITY_RINGS || id == FeedCardId.WORKOUTS || HealthMetricType.entries.any { it.name == id }
}
