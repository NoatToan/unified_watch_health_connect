package com.unified.health.e2e

import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToNode
import com.unified.health.core.demo.virtual.GarminVirtualWatchIdentity
import com.unified.health.core.model.WearableVendor
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * The Garmin driver against the simulated watch from `:core:demo` (`GarminVirtualWatch`, dedicated
 * GFDI service, §3.1/§4.C): scan → recognised as Garmin (manufacturer id 0x0087) → pair (bond,
 * handshake, no credential) → connected (device info/firmware/battery) → sync (steps/distance/
 * calories, heart rate, resting heart rate, HRV, stress, SpO2, sleep stages, one workout, via FIT
 * files over GFDI) → Summary/Health feed show the data with Garmin source attribution → unpair.
 * Exercises the real scan → `GarminDriver.recognize` → `openSession` → `sync` → Room pipeline
 * (see `docs/DECISIONS.md` D-4xx).
 */
@HiltAndroidTest
class GarminWatchE2ETest : E2EBase() {

    private val watch = GarminVirtualWatchIdentity.ADDRESS
    private val name = GarminVirtualWatchIdentity.NAME
    private val card = hasAnyAncestor(hasTestTag("paired_$watch"))

    @Test
    fun pairSyncAndUnpairGarminWatch() {
        val report = report("GarminWatchE2ETest")
        skipOnboarding()

        report.flow(40, "garmin-watch", "Garmin watch (driver:garmin, dedicated GFDI service)") {
            step("scan", "Open Devices, tap Scan", "$name is listed as ${WearableVendor.GARMIN.displayName}") {
                clickTag("nav_DEVICES")
                clickTag("onboarding_scan_button")
                waitForTag("discovered_$watch", timeoutMs = 20_000)
                waitFor(hasText(name) and hasAnyAncestor(hasTestTag("discovered_$watch")), what = "watch name")
                waitFor(
                    hasText(WearableVendor.GARMIN.displayName, substring = true) and hasAnyAncestor(hasTestTag("discovered_$watch")),
                    what = "Garmin vendor label",
                )
            }
            step("connected", "Tap Pair", "No credential asked; GFDI handshake completes with device info and battery") {
                clickTag("pair_$watch")
                waitForTag("paired_$watch")
                waitFor(hasText("Connected") and card, timeoutMs = 20_000, what = "Connected chip")
                waitFor(hasText("${GarminVirtualWatchIdentity.BATTERY_PERCENT}%") and card, what = "battery level")
                waitFor(hasText(GarminVirtualWatchIdentity.FIRMWARE, substring = true) and card, what = "firmware version")
            }
            step("synced", "Tap \"Sync now\"", "Directory + two FIT files download; \"Last sync\" shows a time") {
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                compose.onNodeWithTag("sync_$watch", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasTestTag("last_sync_$watch") and hasText("never", substring = true), 30_000)
            }
            step("summary", "Open Summary", "Pinned heart rate and steps cards show synced values") {
                clickTag("nav_HOME")
                waitForTag("summary_card_HEART_RATE")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "heart rate value")
                waitFor(hasTestTag("summary_card_STEPS") and hasContentDescription("steps", substring = true), what = "steps value")
            }
            step("steps-source", "Open Steps, tap \"Show all data\"", "A daily row is attributed to the Garmin watch by name and brand") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_STEPS"))
                clickTag("summary_card_STEPS")
                waitForTag("metric_header")
                compose.onNodeWithTag("show_all_data").performScrollTo()
                clickTag("show_all_data")
                waitForTag("data_row_0")
                waitForText(name)
                waitForText(WearableVendor.GARMIN.displayName, substring = true)
            }
            step("resting-hr-and-hrv", "Back twice, Health feed → Heart rate cards", "Resting heart rate and HRV both have values from the synced FIT file") {
                device.pressBack()
                device.pressBack()
                waitForTag("summary_list")
                clickTag("nav_HEALTH")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_RESTING_HEART_RATE"))
                clickTag("card_RESTING_HEART_RATE")
                waitFor(hasTestTag("metric_header") and !hasContentDescription("No data"), what = "resting HR with data")
                device.pressBack()
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_HRV"))
                clickTag("card_HRV")
                waitFor(hasTestTag("metric_header") and hasContentDescription("ms", substring = true), what = "HRV header in ms")
            }
            step("sleep-and-workout", "Back, Health feed → Sleep card › D, then Activity › workout", "Sleep stages and the synced running workout both show up") {
                device.pressBack()
                waitForTag("feed_list")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_SLEEP"))
                clickTag("card_SLEEP")
                clickTag("range_DAY")
                waitForTag("sleep_stage_chart")
                device.pressBack()
                clickTag("nav_ACTIVITY")
                waitForText("Running", substring = true)
            }
            step("unpair", "Devices › ⋮ › Unpair › confirm", "Watch removed; synced data from it is kept") {
                clickTag("nav_DEVICES")
                clickTag("more_$watch")
                waitForTag("unpair_menu_item")
                clickTag("unpair_menu_item")
                waitForText("Unpair $name?")
                clickTag("confirm_unpair")
                waitGone(hasTestTag("paired_$watch"))
                clickTag("nav_HOME")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "kept heart rate")
            }
        }
    }
}
