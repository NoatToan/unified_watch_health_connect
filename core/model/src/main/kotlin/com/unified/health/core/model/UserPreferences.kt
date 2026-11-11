package com.unified.health.core.model

enum class UnitSystem { METRIC, IMPERIAL }

enum class ThemeMode { SYSTEM, LIGHT, DARK }

/** How Home's "All metrics" section lays out its cards (D-1073). */
enum class HomeMetricsViewMode {
    /** One metric per full-width row, chart visible. */
    LIST,

    /** 2-column grid (D-1050): name + value, no chart or a tiny one. */
    GRID,
}

data class UserPreferences(
    val onboardingCompleted: Boolean = false,
    val unitSystem: UnitSystem = UnitSystem.METRIC,
    val themeMode: ThemeMode = ThemeMode.SYSTEM,
    val useDynamicColor: Boolean = true,
    val dailyStepGoal: Int = 8_000,
    /** Overrides `MetricThresholds.defaultActiveCalorieGoal`; null uses the default (docs/DECISIONS.md D-1030). */
    val activeCalorieGoalOverride: Int? = null,
    /** Overrides `MetricThresholds.sleepDurationHours`'s target; null uses the default (docs/DECISIONS.md D-1030). */
    val sleepGoalHoursOverride: Int? = null,
    /** Metrics pinned to the top of Summary, in display order. */
    val pinnedMetrics: List<HealthMetricType> = DEFAULT_PINNED_METRICS,
    /** Card order on the flat Health feed (see [FeedCardId] for the non-metric card ids). */
    val feedCardOrder: List<String> = DEFAULT_FEED_CARD_ORDER,
    /** Card ids hidden from the Health feed via "Edit cards"; empty shows every card. */
    val hiddenFeedCards: Set<String> = emptySet(),
    /** D-1074: persists the List/Grid toggle (D-1073) on Home's "All metrics" section. */
    val homeMetricsViewMode: HomeMetricsViewMode = HomeMetricsViewMode.GRID,
    /** Debug-only (Profile's Developer section, D-1188): when true, Home's Metrics section skips
     *  its own "hide cards with no data" filter and shows every card, including empty ones. The
     *  toggle that flips this is only ever rendered in debug/androidTest builds (same
     *  `:core:demo`-presence gate as the rest of the Developer section), so this stays false for
     *  every real user. */
    val showEmptyMetricCards: Boolean = false,
) {
    companion object {
        val DEFAULT_PINNED_METRICS: List<HealthMetricType> = listOf(
            HealthMetricType.STEPS,
            HealthMetricType.HEART_RATE,
            HealthMetricType.SLEEP,
            HealthMetricType.CALORIES,
            HealthMetricType.RESTING_HEART_RATE,
            HealthMetricType.SPO2,
        )

        /** Huawei Health-style ordering: activity overview, then daily vitals, then workouts and body stats. */
        val DEFAULT_FEED_CARD_ORDER: List<String> = listOf(
            FeedCardId.ACTIVITY_RINGS,
            HealthMetricType.STEPS.name,
            HealthMetricType.HEART_RATE.name,
            HealthMetricType.SLEEP.name,
            HealthMetricType.STRESS.name,
            HealthMetricType.SPO2.name,
            HealthMetricType.HRV.name,
            HealthMetricType.VO2_MAX.name,
            FeedCardId.WORKOUTS,
            HealthMetricType.RESTING_HEART_RATE.name,
            HealthMetricType.CALORIES.name,
            HealthMetricType.DISTANCE.name,
            HealthMetricType.EXERCISE_MINUTES.name,
            HealthMetricType.WEIGHT.name,
        )
    }
}

/** Ids of Health feed cards that are not backed by a single [HealthMetricType] (metric cards use [HealthMetricType.name]). */
object FeedCardId {
    const val ACTIVITY_RINGS = "ACTIVITY_RINGS"
    const val WORKOUTS = "WORKOUTS"
}

enum class HealthConnectAvailability { AVAILABLE, NOT_INSTALLED, NOT_SUPPORTED }
