package com.unified.health.e2e

import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToNode
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.TimeRange
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * Debug menu: Profile › Developer › Seed demo data writes 90 days into Room, every chart renders,
 * then Clear health data empties it again. No device involved.
 */
@HiltAndroidTest
class DemoDataE2ETest : E2EBase() {

    /** The previous step leaves a metric page open (so its screenshot shows the chart); go back first. */
    private fun backToBrowse() {
        // The first Back may only hide the keyboard (it depends on the device), so retry a few times.
        repeat(3) {
            compose.waitForIdle()
            if (compose.onAllNodes(hasTestTag("metric_header"), useUnmergedTree = true).fetchSemanticsNodes().isEmpty()) return@repeat
            device.pressBack()
        }
        waitForTag("browse_search")
    }

    @Test
    fun seedEveryChartThenClear() {
        val report = report("DemoDataE2ETest")

        report.flow(7, "debug-seed", "Profile › Developer: seed demo data") {
            step("profile-developer", "Finish onboarding, open Profile", "Developer section (debug only) with Seed / Clear") {
                skipOnboarding(grant = false)
                clickTag("nav_PROFILE")
                waitForTag("seed_demo_data")
                compose.onNodeWithTag("seed_demo_data").performScrollTo()
            }
            step("seeded", "Tap \"Seed demo data\"", "Status reports the records written") {
                clickTag("seed_demo_data")
                waitFor(hasTestTag("developer_status") and hasText("Seeded", substring = true), timeoutMs = 60_000, what = "seed finished")
            }
            step("summary", "Open Summary", "Pinned metrics show seeded values") {
                clickTag("nav_HOME")
                waitFor(hasTestTag("summary_card_RESTING_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "resting HR")
                waitFor(hasTestTag("summary_card_STEPS") and hasContentDescription("steps", substring = true), what = "steps")
            }
        }

        report.flow(8, "all-charts", "Every metric chart after seeding") {
            val metrics = HealthMetricType.entries - HealthMetricType.WEIGHT
            clickTag("nav_BROWSE")
            for (metric in metrics) {
                val range = if (metric.aggregation == MetricAggregation.SLEEP) TimeRange.DAY else TimeRange.MONTH
                step(metric.name.lowercase().replace('_', '-'), "Browse › search \"${metric.label()}\" › open › ${range.shortLabel}", "Header has a value and the chart has data") {
                    backToBrowse()
                    compose.onNodeWithTag("browse_search").performTextClearance()
                    compose.onNodeWithTag("browse_search").performTextInput(metric.label())
                    clickTag("browse_metric_${metric.name}")
                    clickTag("range_${range.name}")
                    waitFor(hasTestTag("metric_header") and !hasContentDescription("NO DATA", substring = true), what = "${metric.name} header")
                    val chart = when {
                        metric.aggregation == MetricAggregation.SLEEP -> "sleep_stage_chart"
                        metric.aggregation == MetricAggregation.DISCRETE -> "range_chart"
                        else -> "bar_chart"
                    }
                    waitFor(hasTestTag(chart) and !hasContentDescription("No data"), what = "$chart with data")
                }
            }
            step("year-heart-rate", "Open Heart rate › Y", "Twelve monthly min–max ranges") {
                backToBrowse()
                compose.onNodeWithTag("browse_search").performTextClearance()
                compose.onNodeWithTag("browse_search").performTextInput("Heart rate")
                clickTag("browse_metric_HEART_RATE")
                clickTag("range_YEAR")
                waitFor(hasTestTag("metric_header") and hasContentDescription("RANGE", substring = true), what = "range header")
            }
        }

        report.flow(9, "clear-data", "Profile › Developer: clear health data") {
            step("cleared", "Profile › \"Clear health data\"", "Status confirms the wipe") {
                backToBrowse()
                clickTag("nav_PROFILE")
                compose.onNodeWithTag("clear_health_data").performScrollTo()
                clickTag("clear_health_data")
                waitFor(hasTestTag("developer_status") and hasText("cleared", substring = true), what = "cleared status")
            }
            step("summary-empty", "Open Summary", "Pinned cards show \"No data\"") {
                clickTag("nav_HOME")
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_STEPS"))
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("No data", substring = true), what = "empty heart rate")
            }
        }
    }
}
