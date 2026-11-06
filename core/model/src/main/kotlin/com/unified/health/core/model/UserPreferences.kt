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
    }
}

enum class HealthConnectAvailability { AVAILABLE, NOT_INSTALLED, NOT_SUPPORTED }
