package com.unified.health.e2e

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performScrollToNode
import androidx.compose.ui.semantics.SemanticsProperties
import com.unified.health.core.demo.virtual.ZeppVirtualWatchIdentity
import com.unified.health.core.model.WearableVendor
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * The Zepp/Amazfit driver against the simulated watch from `:core:demo` (`ZeppVirtualWatch`, legacy
 * auth path, §5.5): pair → enter credential → generate + locally bind a key → connected → sync
 * (steps, heart rate, SpO2, stress via GDSP) → Summary/Health feed show the data with Zepp source
 * attribution → unpair. Exercises the real scan → `ZeppDriver.recognize` → `openSession` → `sync` →
 * Room pipeline (see `docs/DECISIONS.md` D-5xx).
 */
@HiltAndroidTest
class ZeppWatchE2ETest : E2EBase() {

    private val watch = ZeppVirtualWatchIdentity.ADDRESS
    private val name = ZeppVirtualWatchIdentity.NAME

    @Test
    fun pairSyncAndUnpairZeppWatch() {
        val report = report("ZeppWatchE2ETest")

        report.flow(20, "zepp-pair", "Devices → scan → pair → generate key → bind → connected") {
            step("onboarding", "Finish onboarding, grant Bluetooth", "Summary opens with no device paired") {
                skipOnboarding(grant = true)
            }
            step("scanning", "Open Devices, tap Scan", "The simulated Zepp watch is listed with its brand") {
                clickTag("nav_DEVICES")
                clickTag("onboarding_scan_button")
                waitForTag("discovered_$watch", timeoutMs = 20_000)
                compose.onNode(hasText(name) and hasAnyAncestor(hasTestTag("discovered_$watch")), useUnmergedTree = true).assertIsDisplayed()
                compose.onNode(
                    hasText(WearableVendor.ZEPP.displayName, substring = true) and hasAnyAncestor(hasTestTag("discovered_$watch")),
                    useUnmergedTree = true,
                ).assertIsDisplayed()
            }
            step("paired-needs-key", "Tap \"Pair\"", "Device moves to My devices and asks for its auth key (no credential yet)") {
                clickTag("pair_$watch")
                waitForTag("paired_$watch")
                waitForText("Enter Zepp auth key")
            }
            step("generate-key", "Tap \"Enter Zepp auth key\" then \"Create a new key and bind this watch\"", "A key is generated and shown once, to back up") {
                compose.onNodeWithText("Enter Zepp auth key").performClick()
                waitForText("Create a new key and bind this watch")
                compose.onNodeWithText("Create a new key and bind this watch").performClick()
                waitForText("Back up Zepp auth key")
            }
            step("connected", "Tap \"Done\"", "The watch accepts the local bind; the device becomes Connected with battery and firmware read") {
                compose.onNode(hasText("Done")).performClick()
                waitFor(
                    hasText("Connected") and hasAnyAncestor(hasTestTag("paired_$watch")),
                    timeoutMs = 20_000,
                    what = "Connected chip",
                )
                waitFor(
                    hasText("${ZeppVirtualWatchIdentity.BATTERY_PERCENT}%") and hasAnyAncestor(hasTestTag("paired_$watch")),
                    what = "battery level",
                )
                waitFor(
                    hasText(ZeppVirtualWatchIdentity.FIRMWARE, substring = true) and hasAnyAncestor(hasTestTag("paired_$watch")),
                    what = "firmware version",
                )
            }
        }

        report.flow(21, "zepp-sync", "Sync now: steps, heart rate, SpO2 and stress over GDSP") {
            step("synced", "Tap \"Sync now\"", "Sync completes; \"Last sync\" shows a time instead of \"never\"") {
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                compose.onNodeWithTag("sync_$watch", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasTestTag("last_sync_$watch") and hasText("never", substring = true), 30_000)
            }
        }

        report.flow(22, "zepp-summary", "Summary and the Health feed show the synced data with Zepp source attribution") {
            step("summary", "Open Summary", "Pinned heart rate and steps cards show synced values") {
                clickTag("nav_HOME")
                waitForTag("summary_card_HEART_RATE")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "heart rate value")
                waitFor(hasTestTag("summary_card_STEPS") and hasContentDescription("steps", substring = true), what = "steps value")
            }
            step("show-all-data", "Open Steps, tap \"Show all data\"", "A daily row is attributed to the Zepp watch by name and brand") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_STEPS"))
                clickTag("summary_card_STEPS")
                waitForTag("metric_header")
                compose.onNodeWithTag("show_all_data").performScrollTo()
                clickTag("show_all_data")
                waitForTag("data_row_0")
                waitForText(name)
                waitForText(WearableVendor.ZEPP.displayName, substring = true)
            }
            step("feed-spo2", "Back twice, Health feed → Blood oxygen card", "Blood oxygen has a value from the synced SpO2 points") {
                device.pressBack()
                device.pressBack()
                waitForTag("summary_list")
                clickTag("nav_HEALTH")
                waitForTag("feed_list")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_SPO2"))
                clickTag("card_SPO2")
                waitFor(hasTestTag("metric_header") and !hasContentDescription("No data"), what = "SpO2 header with data")
            }
            step("feed-stress", "Back, Health feed → Stress card", "Stress has a value from the synced all-day stress data") {
                device.pressBack()
                waitForTag("feed_list")
                compose.onNodeWithTag("feed_list").performScrollToNode(hasTestTag("card_STRESS"))
                clickTag("card_STRESS")
                waitFor(hasTestTag("metric_header") and !hasContentDescription("No data"), what = "Stress header with data")
            }
        }

        report.flow(23, "zepp-unpair", "Devices → unpair") {
            step("device-menu", "Open Devices, tap ⋮ on the watch", "Menu with Unpair") {
                device.pressBack()
                clickTag("nav_DEVICES")
                clickTag("more_$watch")
                waitForTag("unpair_menu_item")
            }
            step("confirm", "Tap Unpair, confirm", "Watch removed; synced data from it is kept") {
                clickTag("unpair_menu_item")
                waitForText("Unpair $name?")
                clickTag("confirm_unpair")
                waitGone(hasTestTag("paired_$watch"))
            }
        }
    }
}
