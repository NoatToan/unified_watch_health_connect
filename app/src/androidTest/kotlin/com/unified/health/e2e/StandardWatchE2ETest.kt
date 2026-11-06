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
import com.unified.health.core.demo.virtual.StandardVirtualWatch
import com.unified.health.core.model.WearableVendor
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * A generic Bluetooth SIG band (simulated in `:core:demo`, speaking only public SIG GATT services)
 * served by the production `:driver:standard`: scan → recognised as "Bluetooth standard" → pair →
 * connected (battery/firmware from Battery + Device Information) → live heart rate buffered →
 * sync (incl. stored SpO2 spot-checks over RACP) → Summary/detail show the data attributed to the
 * band → unpair.
 */
@HiltAndroidTest
class StandardWatchE2ETest : E2EBase() {

    private val band = StandardVirtualWatch.ADDRESS
    private val card = hasAnyAncestor(hasTestTag("paired_$band"))

    @Test
    fun standardWatchJourney() {
        val report = report("StandardWatchE2ETest")
        skipOnboarding()

        report.flow(60, "standard-watch", "Bluetooth SIG band (driver:standard)") {
            step("scan", "Open Devices, tap Scan", "${StandardVirtualWatch.NAME} is listed as ${WearableVendor.STANDARD.displayName}") {
                clickTag("nav_DEVICES")
                clickTag("scan_fab")
                waitForTag("discovered_$band")
                waitFor(
                    hasText(WearableVendor.STANDARD.displayName, substring = true) and hasAnyAncestor(hasTestTag("discovered_$band")),
                    what = "Bluetooth standard vendor label",
                )
            }
            step("connected", "Tap Pair", "Connected; battery and firmware read from the SIG Battery / Device Information services") {
                clickTag("pair_$band")
                waitForTag("paired_$band")
                waitFor(hasText("Connected") and card, timeoutMs = 30_000, what = "Connected chip")
                waitFor(hasText("${StandardVirtualWatch.BATTERY_PERCENT}%") and card, what = "battery level")
                waitFor(hasText("Firmware ${StandardVirtualWatch.FIRMWARE}") and card, what = "firmware")
            }
            step("synced", "Let the band stream ~5 s of heart rate, tap Sync now", "Sync completes; \"Last sync\" shows a time") {
                waitFor(hasTestTag("sync_$band") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                Thread.sleep(LIVE_STREAM_MS) // 1 Hz heart rate notifications are buffered by the session meanwhile.
                compose.onNodeWithTag("sync_$band", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("sync_$band") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasText("Last sync: never") and card, 30_000)
                waitGone(hasText("Connection lost") and card, 1_000)
            }
            step("summary-heart-rate", "Open Summary", "Heart rate card shows the streamed bpm") {
                clickTag("nav_HOME")
                waitForTag("summary_card_HEART_RATE")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "heart rate value")
            }
            step("heart-rate-source", "Open Heart rate › Show all data", "Readings attributed to ${StandardVirtualWatch.NAME}") {
                compose.onNodeWithTag("summary_list").performScrollToNode(hasTestTag("summary_card_HEART_RATE"))
                clickTag("summary_card_HEART_RATE")
                clickTag("range_DAY")
                compose.onNodeWithTag("show_all_data").performScrollTo()
                clickTag("show_all_data")
                waitForTag("data_row_0")
                waitForText(StandardVirtualWatch.NAME)
            }
            step("spo2-history", "Back, Browse › Respiratory › Blood oxygen, W", "SpO2 history from the band's stored spot-checks (RACP), clock set via CTS") {
                backUntilTag("nav_BROWSE")
                clickTag("nav_BROWSE")
                clickTag("category_Respiratory")
                clickTag("browse_metric_SPO2")
                clickTag("range_WEEK")
                waitFor(hasTestTag("metric_header") and hasContentDescription("AVERAGE", substring = true), what = "SpO2 average header")
            }
            step("spo2-source", "Tap Show all data", "Stored readings listed with ${StandardVirtualWatch.NAME} as source") {
                compose.onNodeWithTag("show_all_data").performScrollTo()
                clickTag("show_all_data")
                waitForTag("data_row_0")
                waitForText(StandardVirtualWatch.NAME)
            }
            step("unpair", "Devices › ⋮ › Unpair › confirm", "Band removed; synced data kept") {
                backUntilTag("nav_DEVICES")
                clickTag("nav_DEVICES")
                clickTag("more_$band")
                clickTag("unpair_menu_item")
                clickTag("confirm_unpair")
                waitGone(hasTestTag("paired_$band"))
                clickTag("nav_HOME")
                waitFor(hasTestTag("summary_card_HEART_RATE") and hasContentDescription("bpm", substring = true), what = "kept heart rate")
            }
        }
    }

    /** Detail screens hide the bottom bar: go back until [tag] (a bottom-bar item) is shown again. */
    private fun backUntilTag(tag: String, maxBacks: Int = 4) {
        repeat(maxBacks) {
            compose.waitForIdle()
            if (compose.onAllNodes(hasTestTag(tag), useUnmergedTree = true).fetchSemanticsNodes().isNotEmpty()) return
            device.pressBack()
        }
        waitForTag(tag)
    }

    private companion object {
        const val LIVE_STREAM_MS = 5_000L
    }
}
