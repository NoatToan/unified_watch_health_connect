package com.unified.health.feature.home.insight

import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.domain.usecase.Trend
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.UnitSystem

/**
 * One-line analysis under a feed card / metric detail chart, Huawei Health style (e.g. "Averaged
 * 7,840 steps/day this week, +12% vs last week."). Pure text composition over domain output
 * ([Highlight] from [com.unified.health.core.domain.usecase.HighlightCalculator], [MetricStats] from
 * [com.unified.health.core.domain.usecase.MetricStatsCalculator]) so it is unit-testable without Compose.
 *
 * Prefers the week-over-week [highlight]; without two full weeks of history yet, falls back to this
 * week's own average/range from [weekStats]; returns null when there is nothing to say at all.
 */
internal fun metricInsightLine(
    metric: HealthMetricType,
    highlight: Highlight?,
    weekStats: MetricStats?,
    unitSystem: UnitSystem = UnitSystem.METRIC,
): String? {
    if (highlight != null) return highlightLine(metric, highlight, unitSystem)
    if (weekStats != null) return weekStatsLine(metric, weekStats, unitSystem)
    return null
}

private fun highlightLine(metric: HealthMetricType, highlight: Highlight, unitSystem: UnitSystem): String {
    val value = metric.formatValue(highlight.recentAverage, unitSystem = unitSystem)
    val unit = unitSuffix(metric, unitSystem)
    val verb = if (metric.aggregation == MetricAggregation.SLEEP) "Slept" else "Averaged"
    val perDay = if (metric.aggregation == MetricAggregation.CUMULATIVE) "/day" else ""
    val change = when (highlight.trend) {
        Trend.UP -> "+${highlight.changePercent}% vs last week"
        Trend.DOWN -> "${highlight.changePercent}% vs last week"
        Trend.STEADY -> "about the same as last week"
    }
    return "$verb $value$unit$perDay this week, $change."
}

private fun weekStatsLine(metric: HealthMetricType, stats: MetricStats, unitSystem: UnitSystem): String {
    val unit = unitSuffix(metric, unitSystem)
    return when (stats.kind) {
        StatKind.RANGE -> "This week ${metric.formatValue(stats.min ?: stats.value, unitSystem = unitSystem)}–${metric.formatValue(stats.max ?: stats.value, unitSystem = unitSystem)}$unit."
        StatKind.TOTAL, StatKind.AVERAGE -> "This week's average ${metric.formatValue(stats.value, unitSystem = unitSystem)}$unit."
    }
}

private fun unitSuffix(metric: HealthMetricType, unitSystem: UnitSystem): String = metric.unit(unitSystem).let { unit ->
    when {
        unit.isEmpty() -> ""
        unit == "%" -> unit // "96%", not "96 %"
        else -> " $unit"
    }
}
