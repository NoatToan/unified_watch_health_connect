package com.unified.health.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.unified.health.core.model.HealthMetricType

/**
 * Semantic accent colors per health metric. These stay stable even when dynamic color is on,
 * so users can recognise a metric by its color across the app (always paired with an icon + label).
 */
@Immutable
data class MetricColors(
    val steps: Color,
    val heartRate: Color,
    val sleep: Color,
    val spO2: Color,
    val stress: Color,
    val calories: Color,
    val weight: Color,
    val exercise: Color,
    val hrv: Color,
    val vo2Max: Color,
) {
    fun forMetric(metric: HealthMetricType): Color = when (metric) {
        HealthMetricType.STEPS -> steps
        HealthMetricType.HEART_RATE -> heartRate
        HealthMetricType.SLEEP -> sleep
        HealthMetricType.SPO2 -> spO2
        HealthMetricType.STRESS -> stress
        HealthMetricType.CALORIES -> calories
        HealthMetricType.WEIGHT -> weight
        HealthMetricType.DISTANCE -> steps
        HealthMetricType.EXERCISE_MINUTES -> exercise
        HealthMetricType.RESTING_HEART_RATE -> heartRate
        HealthMetricType.HRV -> hrv
        HealthMetricType.VO2_MAX -> vo2Max
    }

    /** Hypnogram colours, awake → deep. */
    fun sleepStage(stage: com.unified.health.core.model.SleepStage): Color = when (stage) {
        com.unified.health.core.model.SleepStage.AWAKE -> calories
        com.unified.health.core.model.SleepStage.REM -> spO2
        com.unified.health.core.model.SleepStage.LIGHT -> sleep.copy(alpha = 0.65f)
        com.unified.health.core.model.SleepStage.DEEP -> sleep
    }
}

internal val LightMetricColors = MetricColors(
    steps = Color(0xFF2E7D32),
    heartRate = Color(0xFFC62828),
    sleep = Color(0xFF4F45B5),
    spO2 = Color(0xFF00838F),
    stress = Color(0xFFB26A00),
    calories = Color(0xFFD84315),
    weight = Color(0xFF6A4C93),
    exercise = Color(0xFF558B2F),
    hrv = Color(0xFF00695C),
    vo2Max = Color(0xFF5E35B1),
)

internal val DarkMetricColors = MetricColors(
    steps = Color(0xFF81C995),
    heartRate = Color(0xFFFF8A80),
    sleep = Color(0xFFB4ABFF),
    spO2 = Color(0xFF80DEEA),
    stress = Color(0xFFFFCC80),
    calories = Color(0xFFFFAB91),
    weight = Color(0xFFCFB8F0),
    exercise = Color(0xFFC5E1A5),
    hrv = Color(0xFF80CBC4),
    vo2Max = Color(0xFFB39DDB),
)

val LocalMetricColors = staticCompositionLocalOf { LightMetricColors }
