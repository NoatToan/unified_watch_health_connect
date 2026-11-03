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
) {
    fun forMetric(metric: HealthMetricType): Color = when (metric) {
        HealthMetricType.STEPS -> steps
        HealthMetricType.HEART_RATE -> heartRate
        HealthMetricType.SLEEP -> sleep
        HealthMetricType.SPO2 -> spO2
        HealthMetricType.STRESS -> stress
        HealthMetricType.CALORIES -> calories
        HealthMetricType.WEIGHT -> weight
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
)

internal val DarkMetricColors = MetricColors(
    steps = Color(0xFF81C995),
    heartRate = Color(0xFFFF8A80),
    sleep = Color(0xFFB4ABFF),
    spO2 = Color(0xFF80DEEA),
    stress = Color(0xFFFFCC80),
    calories = Color(0xFFFFAB91),
    weight = Color(0xFFCFB8F0),
)

val LocalMetricColors = staticCompositionLocalOf { LightMetricColors }
