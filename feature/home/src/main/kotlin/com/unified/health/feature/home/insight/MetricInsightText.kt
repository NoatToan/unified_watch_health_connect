package com.unified.health.feature.home.insight

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.domain.usecase.Trend
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.UnitSystem
import com.unified.health.feature.home.R
import kotlin.math.abs

/**
 * The English sentence fragments [metricInsightLine] composes with. Defaults to the literal English
 * copy this function always produced before D-1040, so existing callers (and `MetricInsightTextTest`,
 * a plain JVM unit test with no Compose/Android runtime) keep working unchanged. Composable call
 * sites (`HomeScreen.kt`, `MetricDetailScreen.kt`) should instead build one of these from
 * `stringResource(...)` so the line is localized — see `feature/home/res/values-vi/strings.xml`'s
 * `insight_*` entries.
 */
internal data class InsightStrings(
    val verbAveraged: String = "Averaged",
    val verbSlept: String = "Slept",
    val perDaySuffix: String = "/day",
    /** "%1\$s this week, %2\$s." — %1 = verb+value+unit+perDay, %2 = the change clause. */
    val sentenceTemplate: String = "%1\$s this week, %2\$s.",
    /** %1 = `abs(changePercent)`. */
    val changeUpTemplate: String = "+%1\$d%% vs last week",
    val changeDownTemplate: String = "-%1\$d%% vs last week",
    val changeSteady: String = "about the same as last week",
    /** %1 = min, %2 = max, %3 = unit suffix. */
    val weekRangeTemplate: String = "This week %1\$s–%2\$s%3\$s.",
    /** %1 = value, %2 = unit suffix. */
    val weekAverageTemplate: String = "This week's average %1\$s%2\$s.",
) {
    companion object {
        val ENGLISH = InsightStrings()
    }
}

/** The current locale's [InsightStrings], for composable call sites ([com.unified.health.feature.home.HomeScreen]'s
 *  `MetricFeedCard`/`HighlightCard` siblings, `MetricDetailScreen`). */
@Composable
internal fun localizedInsightStrings(): InsightStrings = InsightStrings(
    verbAveraged = stringResource(R.string.insight_verb_averaged),
    verbSlept = stringResource(R.string.insight_verb_slept),
    perDaySuffix = stringResource(R.string.insight_per_day_suffix),
    sentenceTemplate = stringResource(R.string.insight_sentence),
    changeUpTemplate = stringResource(R.string.insight_change_up),
    changeDownTemplate = stringResource(R.string.insight_change_down),
    changeSteady = stringResource(R.string.insight_change_steady),
    weekRangeTemplate = stringResource(R.string.insight_week_range),
    weekAverageTemplate = stringResource(R.string.insight_week_average),
)

/**
 * One-line analysis under a feed card / metric detail chart, Huawei Health style (e.g. "Averaged
 * 7,840 steps/day this week, +12% vs last week."). Pure text composition over domain output
 * ([Highlight] from [com.unified.health.core.domain.usecase.HighlightCalculator], [MetricStats] from
 * [com.unified.health.core.domain.usecase.MetricStatsCalculator]) so it is unit-testable without Compose.
 * [strings] defaults to [InsightStrings.ENGLISH]; pass a localized instance from a Composable context.
 *
 * Prefers the week-over-week [highlight]; without two full weeks of history yet, falls back to this
 * week's own average/range from [weekStats]; returns null when there is nothing to say at all.
 */
internal fun metricInsightLine(
    metric: HealthMetricType,
    highlight: Highlight?,
    weekStats: MetricStats?,
    unitSystem: UnitSystem = UnitSystem.METRIC,
    strings: InsightStrings = InsightStrings.ENGLISH,
): String? {
    if (highlight != null) return highlightLine(metric, highlight, unitSystem, strings)
    if (weekStats != null) return weekStatsLine(metric, weekStats, unitSystem, strings)
    return null
}

private fun highlightLine(metric: HealthMetricType, highlight: Highlight, unitSystem: UnitSystem, strings: InsightStrings): String {
    val value = metric.formatValue(highlight.recentAverage, unitSystem = unitSystem)
    val unit = unitSuffix(metric, unitSystem)
    val verb = if (metric.aggregation == MetricAggregation.SLEEP) strings.verbSlept else strings.verbAveraged
    val perDay = if (metric.aggregation == MetricAggregation.CUMULATIVE) strings.perDaySuffix else ""
    val change = when (highlight.trend) {
        Trend.UP -> strings.changeUpTemplate.format(abs(highlight.changePercent))
        Trend.DOWN -> strings.changeDownTemplate.format(abs(highlight.changePercent))
        Trend.STEADY -> strings.changeSteady
    }
    return strings.sentenceTemplate.format("$verb $value$unit$perDay", change)
}

private fun weekStatsLine(metric: HealthMetricType, stats: MetricStats, unitSystem: UnitSystem, strings: InsightStrings): String {
    val unit = unitSuffix(metric, unitSystem)
    return when (stats.kind) {
        StatKind.RANGE -> strings.weekRangeTemplate.format(
            metric.formatValue(stats.min ?: stats.value, unitSystem = unitSystem),
            metric.formatValue(stats.max ?: stats.value, unitSystem = unitSystem),
            unit,
        )
        StatKind.TOTAL, StatKind.AVERAGE -> strings.weekAverageTemplate.format(metric.formatValue(stats.value, unitSystem = unitSystem), unit)
    }
}

private fun unitSuffix(metric: HealthMetricType, unitSystem: UnitSystem): String = metric.unit(unitSystem).let { unit ->
    when {
        unit.isEmpty() -> ""
        unit == "%" -> unit // "96%", not "96 %"
        else -> " $unit"
    }
}
