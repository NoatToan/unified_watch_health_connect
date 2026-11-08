package com.unified.health.core.model

enum class UnitSystem { METRIC, IMPERIAL }

enum class ThemeMode { SYSTEM, LIGHT, DARK }

data class UserPreferences(
    val onboardingCompleted: Boolean = false,
    val unitSystem: UnitSystem = UnitSystem.METRIC,
    val themeMode: ThemeMode = ThemeMode.SYSTEM,
    val useDynamicColor: Boolean = true,
    val dailyStepGoal: Int = 8_000,
    /** Metrics pinned to the top of Summary, in display order. */
    val pinnedMetrics: List<HealthMetricType> = DEFAULT_PINNED_METRICS,
    /** Card order on the flat Health feed (see [FeedCardId] for the non-metric card ids). */
    val feedCardOrder: List<String> = DEFAULT_FEED_CARD_ORDER,
    /** Card ids hidden from the Health feed via "Edit cards"; empty shows every card. */
    val hiddenFeedCards: Set<String> = emptySet(),
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
