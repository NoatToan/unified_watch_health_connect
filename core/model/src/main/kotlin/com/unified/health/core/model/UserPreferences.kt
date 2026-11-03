package com.unified.health.core.model

enum class UnitSystem { METRIC, IMPERIAL }

enum class ThemeMode { SYSTEM, LIGHT, DARK }

data class UserPreferences(
    val onboardingCompleted: Boolean = false,
    val unitSystem: UnitSystem = UnitSystem.METRIC,
    val themeMode: ThemeMode = ThemeMode.SYSTEM,
    val useDynamicColor: Boolean = true,
    val dailyStepGoal: Int = 8_000,
)

enum class HealthConnectAvailability { AVAILABLE, NOT_INSTALLED, NOT_SUPPORTED }
