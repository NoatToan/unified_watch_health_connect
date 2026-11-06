package com.unified.health.e2e

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.semantics.SemanticsProperties
import com.unified.health.core.demo.virtual.huawei.HuaweiVirtualDevice
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * The Huawei driver end to end against the in-repo watch simulator
 * (`core/demo/.../virtual/huawei/HuaweiVirtualWatch.kt`): scan → `HuaweiDriver.recognize` → the
 * real 0x5A/CRC16/TLV/AES-CBC transport completes a full handshake
 * (`HuaweiSession.open`, debug-only `HuaweiSimulatorAuthenticator`, then 0x0107 version,
 * 0x0105/0x0132 time, 0x0102/0x0103 capability consult) → connected with battery/firmware read
 * from 0x0107 (the simulator's standard-GATT values differ on purpose, so seeing these proves the
 * 0x0107 parser is used) → a full raw sync sweep completes → unpair.
 *
 * `HuaweiSession.sync()` cannot emit a single typed health record yet — every service 7 response
 * body layout is undocumented (see `HuaweiSession.sync` KDoc, protocol doc §7.2/§10) — so unlike
 * [UserJourneyE2ETest]'s simulated watch this flow does not assert Summary metric cards; it proves
 * the real production pipeline (recognize → authenticate → encrypt → sync → Room) runs clean for
 * this brand, which is the part of "production ready" this protocol currently allows (see
 * docs/DECISIONS.md D-3xx).
 */
@HiltAndroidTest
class HuaweiWatchE2ETest : E2EBase() {

    private val watch = HuaweiVirtualDevice.ADDRESS

    @Test
    fun pairSyncAndUnpairTheSimulatedHuaweiWatch() {
        val report = report("HuaweiWatchE2ETest")

        report.flow(10, "huawei-watch", "Devices → scan → pair → sync → unpair (Huawei)") {
            step("onboarding", "Finish onboarding with Bluetooth granted", "Summary opens with \"No device paired\"") {
                skipOnboarding(grant = true)
            }
            step("scanning", "Open Devices, tap \"Scan\"", "The simulated Huawei watch is listed with its brand") {
                clickTag("nav_DEVICES")
                clickTag("scan_fab")
                waitForTag("discovered_$watch")
                compose.onNode(
                    hasText(HuaweiVirtualDevice.NAME) and hasAnyAncestor(hasTestTag("discovered_$watch")),
                    useUnmergedTree = true,
                ).assertIsDisplayed()
                compose.onNode(
                    hasText("Huawei", substring = true) and hasAnyAncestor(hasTestTag("discovered_$watch")),
                    useUnmergedTree = true,
                ).assertIsDisplayed()
            }
            step(
                "connected",
                "Tap \"Pair\"",
                "Real 0x5A/TLV/AES-CBC handshake completes: Connected, battery and firmware from 0x0107, attributed to Huawei",
            ) {
                clickTag("pair_$watch")
                waitForTag("paired_$watch")
                waitFor(hasText("Connected") and hasAnyAncestor(hasTestTag("paired_$watch")), what = "Connected chip")
                compose.onNode(
                    hasText("Huawei", substring = true) and hasAnyAncestor(hasTestTag("paired_$watch")),
                    useUnmergedTree = true,
                ).assertIsDisplayed()
                waitFor(
                    hasText("${HuaweiVirtualDevice.BATTERY_PERCENT}%") and hasAnyAncestor(hasTestTag("paired_$watch")),
                    what = "battery level",
                )
                waitFor(
                    hasText("Firmware ${HuaweiVirtualDevice.FIRMWARE}", substring = true) and hasAnyAncestor(hasTestTag("paired_$watch")),
                    what = "firmware version",
                )
            }
            step("synced", "Tap \"Sync now\"", "The real sweep (link nego → time sync → service 7 probes) completes without error") {
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                compose.onNodeWithTag("sync_$watch", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("sync_$watch") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasText("Last sync: never"), 30_000)
                // No error text on the card: the handshake and sweep genuinely succeeded.
                waitGone(hasText("Huawei watch did not answer", substring = true) and hasAnyAncestor(hasTestTag("paired_$watch")))
            }
            step("device-menu", "Tap ⋮ on the watch", "Menu with Unpair") {
                clickTag("more_$watch")
                waitForTag("unpair_menu_item")
            }
            step("confirm", "Tap Unpair", "Confirmation dialog explains synced data is kept") {
                clickTag("unpair_menu_item")
                waitForText("Unpair ${HuaweiVirtualDevice.NAME}?")
            }
            step("unpaired", "Confirm", "Watch removed; \"No device paired yet\" again") {
                clickTag("confirm_unpair")
                waitForText("No device paired yet")
                waitGone(hasTestTag("paired_$watch"))
            }
        }
    }
}
