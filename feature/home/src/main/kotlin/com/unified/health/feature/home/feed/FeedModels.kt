package com.unified.health.feature.home.feed

import com.unified.health.core.designsystem.component.label
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.Workout

/**
 * One card on the flat Health feed (Huawei Health "Health" tab reference: everything on one
 * vertically scrolling screen, no category menu). [id] matches [com.unified.health.core.model.UserPreferences.feedCardOrder].
 */
internal sealed interface FeedCardData {
    val id: String

    /** Activity rings (steps / exercise minutes / active calories), Home's own card repeated here so the feed is complete on its own. */
    data class Activity(val summary: DailyHealthSummary) : FeedCardData {
        override val id: String get() = FeedCardId.ACTIVITY_RINGS
    }

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
internal fun feedCardTitle(id: String): String = when (id) {
    FeedCardId.ACTIVITY_RINGS -> "Activity"
    FeedCardId.WORKOUTS -> "Workouts"
    else -> HealthMetricType.entries.firstOrNull { it.name == id }?.label() ?: id
}
