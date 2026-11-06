package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.TimeRange
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import java.time.LocalDate
import javax.inject.Inject
import kotlin.math.roundToInt

/** What the big number above a chart means (Apple Health's "TOTAL" / "AVERAGE" / "RANGE"). */
enum class StatKind { TOTAL, AVERAGE, RANGE }

data class MetricStats(
    val kind: StatKind,
    /** Total, or the average of buckets that have data. */
    val value: Double,
    val min: Double?,
    val max: Double?,
)

/** Header statistics for a chart. Empty buckets (no data) never drag averages or minimums down. */
object MetricStatsCalculator {

    fun of(metric: HealthMetricType, range: TimeRange, points: List<ChartPoint>): MetricStats? {
        val withData = points.filter { it.hasData }
        if (withData.isEmpty()) return null
        val values = withData.map { it.value.toDouble() }
        val lows = withData.map { (it.min ?: it.value).toDouble() }
        val highs = withData.map { (it.max ?: it.value).toDouble() }
        return when (metric.aggregation) {
            MetricAggregation.CUMULATIVE ->
                if (range == TimeRange.DAY) {
                    MetricStats(StatKind.TOTAL, values.sum(), values.min(), values.max())
                } else {
                    MetricStats(StatKind.AVERAGE, values.average(), values.min(), values.max())
                }
            MetricAggregation.SLEEP ->
                MetricStats(if (range == TimeRange.DAY) StatKind.TOTAL else StatKind.AVERAGE, values.average(), values.min(), values.max())
            MetricAggregation.DISCRETE ->
                MetricStats(
                    kind = if (metric == HealthMetricType.HEART_RATE) StatKind.RANGE else StatKind.AVERAGE,
                    value = values.average(),
                    min = lows.min(),
                    max = highs.max(),
                )
        }
    }
}

enum class Trend { UP, DOWN, STEADY }

/** A Summary highlight: this week's daily average against the week before. */
data class Highlight(
    val metric: HealthMetricType,
    val recentAverage: Double,
    val previousAverage: Double,
) {
    val changePercent: Int
        get() = if (previousAverage == 0.0) 0 else ((recentAverage - previousAverage) / previousAverage * 100).roundToInt()

    val trend: Trend
        get() = when {
            changePercent >= STEADY_BAND_PERCENT -> Trend.UP
            changePercent <= -STEADY_BAND_PERCENT -> Trend.DOWN
            else -> Trend.STEADY
        }

    companion object {
        const val STEADY_BAND_PERCENT = 3
    }
}

object HighlightCalculator {

    /**
     * Compares the average of the last [window] daily points with the [window] before them, ignoring
     * days without data. Null when either window has fewer than [minDays] days of data.
     */
    fun compute(metric: HealthMetricType, daily: List<ChartPoint>, window: Int = 7, minDays: Int = 3): Highlight? {
        if (daily.size < window * 2) return null
        val recent = daily.takeLast(window).filter { it.hasData }
        val previous = daily.dropLast(window).takeLast(window).filter { it.hasData }
        if (recent.size < minDays || previous.size < minDays) return null
        return Highlight(metric, recent.map { it.value.toDouble() }.average(), previous.map { it.value.toDouble() }.average())
    }
}

/** Highlights for the Summary screen, computed over complete days (ending yesterday). */
class ObserveHighlightsUseCase @Inject constructor(
    private val repository: HealthDataRepository,
) {
    operator fun invoke(today: LocalDate = LocalDate.now()): Flow<List<Highlight>> {
        val flows = HIGHLIGHT_METRICS.map { metric ->
            repository.observeMetricSeries(metric, TimeRange.MONTH, today.minusDays(1))
        }
        return combine(flows) { series ->
            series.mapIndexedNotNull { i, points -> HighlightCalculator.compute(HIGHLIGHT_METRICS[i], points) }
        }
    }

    companion object {
        val HIGHLIGHT_METRICS = listOf(
            HealthMetricType.STEPS,
            HealthMetricType.EXERCISE_MINUTES,
            HealthMetricType.SLEEP,
            HealthMetricType.RESTING_HEART_RATE,
            HealthMetricType.CALORIES,
        )
    }
}
