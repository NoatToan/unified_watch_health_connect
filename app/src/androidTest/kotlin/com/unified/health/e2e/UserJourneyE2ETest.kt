package com.unified.health.e2e

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToNode
import androidx.compose.ui.semantics.SemanticsProperties
import com.unified.health.core.demo.DemoDevice
import com.unified.health.core.model.TimeRange
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * The whole first-run journey on the real app graph, one flow after another so state carries over:
 * onboarding → permissions (system dialog) → Devices → scan → pair the simulated watch → connected →
 * sync → Summary with data → metric detail D/W/M/6M/Y → Show All Data → Health feed → unpair.
 */
@HiltAndroidTest
class UserJourneyE2ETest : E2EBase() {

    private val watch = DemoDevice.ADDRESS

    @Test
    fun firstRunJourney() {
        val report = report("UserJourneyE2ETest")

        report.flow(1, "onboarding", "Onboarding → permissions") {
            step("welcome", "Launch the app on a fresh install", "Welcome screen with \"Get started\"") {
                waitForTag("get_started")
                compose.onNodeWithTag("get_started").assertIsDisplayed()
            }
            step("permissions", "Tap \"Get started\"", "Permissions list: Bluetooth, notifications, Health Connect, background") {
                clickTag("get_started")
                waitForTag("permission_bluetooth")
            }
            var dialog = false
            step("bluetooth-system-dialog", "Tap \"Allow\" on Nearby devices", "Android shows its runtime-permission dialog") {
                // On a re-used install the permission may already be granted: then there is nothing to tap.
                val alreadyGranted = compose.onAllNodes(hasTestTag("granted_bluetooth"), useUnmergedTree = true).fetchSemanticsNodes().isNotEmpty()
                if (!alreadyGranted) {
                    clickTag("grant_bluetooth")
                    dialog = systemPermissionDialogShown()
                }
            }
            step("bluetooth-granted", "Tap \"Allow\" in the system dialog", "Nearby devices row shows a granted check mark") {
                if (!dialog || !allowSystemPermissionDialog()) grantBluetooth() // already granted or dialog suppressed
                waitForTag("permission_bluetooth")
                // The row re-checks permissions on resume.
                compose.waitUntil(TIMEOUT_MS) {
                    compose.onAllNodes(hasTestTag("granted_bluetooth"), useUnmergedTree = true).fetchSemanticsNodes().isNotEmpty()
                }
            }
            step("summary-empty", "Tap \"Continue\"", "Summary opens with \"No device paired\"") {
                clickTag("onboarding_continue")
                waitForTag("summary_list")
                waitForText("No device paired")
            }
        }

        report.flow(2, "pair-mock-watch", "Devices → scan → pair → sync") {
            step("devices-empty", "Open the Devices tab", "\"No device paired yet\" card") {
                clickTag("nav_DEVICES")
                waitForText("No device paired yet")
            }
            step("scanning", "Tap \"Scan\"", "Scan runs and the simulated watch is listed with its brand") {
                clickTag("scan_fab")
                waitForTag("discovered_$watch")
                compose.onNode(hasText(DemoDevice.NAME) and hasAnyAncestor(hasTestTag("discovered_$watch")), useUnmergedTree = true).assertIsDisplayed()
            }
            step("connected", "Tap \"Pair\" on ${DemoDevice.NAME}", "Device moves to My devices, status Connected, battery and firmware read") {
                clickTag("pair_$watch")
                waitForTag("paired_$watch")
                waitFor(hasText("Connected") and hasAnyAncestor(hasTestTag("paired_$watch")), what = "Connected chip")
                waitFor(hasText("${DemoDevice.BATTERY_PERCENT}%") and hasAnyAncestor(hasTestTag("paired_$watch")), what = "battery level")
            }
            step("synced", "Tap \"Sync now\"", "Sync completes; \"Last sync\" shows a time instead of \"never\"") {
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                compose.onNodeWithTag("sync_$watch", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasText("Last sync: never"), 30_000)
            }
        }

        report.flow(3, "summary", "Summary") {
            step("pinned", "Open the Summary tab", "Pinned cards show synced values (steps, heart rate, sleep…)") {
                clickTag("nav_HOME")
                waitForTag("summary_card_HEART_RATE")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "heart rate value")
                waitFor(hasTestTag("summary_card_SLEEP") and !hasContentDescription("No data", substring = true), what = "sleep value")
            }
            step("rings-and-highlights", "Scroll down", "Activity rings and Highlights comparing the last 7 days") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("activity_rings"))
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("highlight_STEPS"))
                compose.onNodeWithTag("highlight_STEPS").assertIsDisplayed()
            }
            step("edit-pinned", "Tap Edit, pin Heart rate variability, Done", "A new pinned card for HRV appears") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("edit_pinned"))
                clickTag("edit_pinned")
                clickTag("pin_HRV")
                compose.onNode(hasText("Done")).performClick()
                // The preference write is asynchronous: retry until the new card is in the list.
                compose.waitUntil(TIMEOUT_MS) {
                    runCatching { compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_HRV")) }.isSuccess
                }
                waitFor(hasTestTag("summary_card_HRV") and hasContentDescription("ms", substring = true), what = "HRV card")
            }
        }

        report.flow(4, "metric-detail", "Metric detail: D / W / M / 6M / Y") {
            step("steps-week", "Tap the Steps card", "Steps page, W selected, daily average + bar chart") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_STEPS"))
                clickTag("summary_card_STEPS")
                waitForTag("metric_header")
                compose.onNodeWithTag("range_WEEK").assertIsSelected()
                waitFor(hasTestTag("metric_header") and hasContentDescription("DAILY AVERAGE", substring = true), what = "daily average header")
                compose.onNodeWithTag("bar_chart", useUnmergedTree = true).assertIsDisplayed()
            }
            for ((range, header) in listOf(
                TimeRange.DAY to "TOTAL",
                TimeRange.MONTH to "DAILY AVERAGE",
                TimeRange.SIX_MONTHS to "DAILY AVERAGE",
                TimeRange.YEAR to "DAILY AVERAGE",
            )) {
                step("steps-${range.shortLabel.lowercase()}", "Tap ${range.shortLabel}", "${range.shortLabel} selected, header $header, chart has data") {
                    clickTag("range_${range.name}")
                    compose.onNodeWithTag("range_${range.name}").assertIsSelected()
                    waitFor(hasTestTag("metric_header") and hasContentDescription(header, substring = true), what = "$header header")
                    compose.onNodeWithTag("bar_chart", useUnmergedTree = true).assert(!hasContentDescription("No data"))
                }
            }
            step("show-all-data", "Tap \"Show all data\"", "Daily totals listed newest first with the source watch") {
                compose.onNodeWithTag("show_all_data").performScrollTo()
                clickTag("show_all_data")
                waitForTag("data_row_0")
                waitForText(DemoDevice.NAME)
            }
            step("heart-rate-range", "Back to Summary, open Heart rate", "Range header (min–max bpm) and range chart") {
                device.pressBack()
                device.pressBack()
                waitForTag("summary_list")
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_HEART_RATE"))
                clickTag("summary_card_HEART_RATE")
                waitFor(hasTestTag("metric_header") and hasContentDescription("RANGE", substring = true), what = "range header")
                compose.onNodeWithTag("range_chart", useUnmergedTree = true).assertIsDisplayed()
            }
            step("sleep-stages", "Back, open Sleep, tap D", "Last night's sleep stage chart with Awake/REM/Core/Deep") {
                device.pressBack()
                waitForTag("summary_list")
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_SLEEP"))
                clickTag("summary_card_SLEEP")
                clickTag("range_DAY")
                waitForTag("sleep_stage_chart")
                waitForText("Deep")
            }
        }

        report.flow(5, "health-feed", "Health feed: every metric flattened onto one screen") {
            step("feed", "Back to Summary, open the Health tab", "Activity rings and every metric card, one screen, no category menu") {
                device.pressBack() // leave the Sleep page (detail screens hide the bottom bar)
                clickTag("nav_HEALTH")
                waitForTag("card_ACTIVITY_RINGS")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_RESTING_HEART_RATE"))
            }
            step("resting-heart-rate", "Tap the Resting heart rate card", "Average resting heart rate with a daily chart") {
                clickTag("card_RESTING_HEART_RATE")
                waitFor(hasTestTag("metric_header") and hasContentDescription("AVERAGE", substring = true), what = "average header")
            }
            step("spo2-card", "Back, scroll to the Blood oxygen card", "Blood oxygen card shows a value") {
                device.pressBack()
                waitForTag("feed_list")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_SPO2"))
                waitForTag("card_SPO2")
            }
        }

        report.flow(6, "unpair", "Devices → unpair") {
            step("device-menu", "Open Devices, tap ⋮ on the watch", "Menu with Unpair") {
                clickTag("nav_DEVICES")
                clickTag("more_$watch")
                waitForTag("unpair_menu_item")
            }
            step("confirm", "Tap Unpair", "Confirmation dialog explains synced data is kept") {
                clickTag("unpair_menu_item")
                waitForText("Unpair ${DemoDevice.NAME}?")
            }
            step("unpaired", "Confirm", "Watch removed; \"No device paired yet\" again") {
                clickTag("confirm_unpair")
                waitForText("No device paired yet")
                waitGone(hasTestTag("paired_$watch"))
            }
            step("data-kept", "Open Summary", "Synced history is still shown without a device") {
                clickTag("nav_HOME")
                waitForText("No device paired")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "kept heart rate")
            }
        }
    }
}
