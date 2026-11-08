package com.unified.health.feature.home

import com.unified.health.core.designsystem.component.label
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.Workout

/**
 * One card in Home's full metric feed (Huawei Health reference: every metric flattened onto one
 * vertically scrolling screen, no category menu). Merged from the old standalone Health tab into
 * Home per D-1010. [id] matches [com.unified.health.core.model.UserPreferences.feedCardOrder].
 *
 * Public (not `internal`) because it's a field of [com.unified.health.feature.home.HomeUiState.Success],
 * which is itself public — the data class's generated `copy()` would otherwise leak an internal type.
 */
sealed interface FeedCardData {
    val id: String

    /** Latest workouts, newest first (at most [MAX_SHOWN]). */
    data class Workouts(val recent: List<Workout>) : FeedCardData {
        override val id: String get() = FeedCardId.WORKOUTS

        companion object {
            const val MAX_SHOWN = 3
        }
    }

    /** Any single [HealthMetricType]: a value, a 7-day mini chart and a one-line analysis. */
    data class Metric(
        val metric: HealthMetricType,
        val reading: MetricReading?,
        val weekPoints: List<ChartPoint>,
        val weekStats: MetricStats?,
        val highlight: Highlight?,
        /** Today's resting heart rate, only set for [HealthMetricType.HEART_RATE]. */
        val restingBpm: Int? = null,
        /** Last night's session (for the stage bar + score), only set for [HealthMetricType.SLEEP]. */
        val sleepSession: SleepSession? = null,
    ) : FeedCardData {
        override val id: String get() = metric.name

        val hasData: Boolean get() = reading != null || weekPoints.any { it.hasData }
    }
}

/** Display title for a non-metric card; metric cards use [com.unified.health.core.designsystem.component.label]. */
fun feedCardTitle(id: String): String = when (id) {
    FeedCardId.WORKOUTS -> "Workouts"
    else -> HealthMetricType.entries.firstOrNull { it.name == id }?.label() ?: id
}
