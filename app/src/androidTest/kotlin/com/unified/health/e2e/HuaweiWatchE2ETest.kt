package com.unified.health.e2e

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.semantics.SemanticsProperties
import com.unified.health.core.demo.virtual.huawei.HuaweiAuthRequiredVirtualDevice
import com.unified.health.core.demo.virtual.huawei.HuaweiVirtualDevice
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/**
 * The Huawei driver end to end against the in-repo watch simulator
 * (`core/demo/.../virtual/huawei/HuaweiVirtualWatch.kt`):
 * 1. the `authenticVersion == 0` watch takes the vendor's no-app-auth branch — scan →
 *    `HuaweiDriver.recognize` → the real 0x5A/CRC16/TLV transport runs the clear-text
 *    `0107 → 0105 → 0102 → 0103 → 0137 → 013C → 0132 → 0112` handshake → connected with battery from
 *    the service 1 cmd 8 query and firmware from 0x0107 (the simulator's standard-GATT values differ
 *    on purpose, so seeing these proves the protocol parsers are used) → a full raw sync sweep
 *    completes → unpair;
 * 2. a watch with a non-zero auth version fails fast with the precise "requires Huawei's app-level
 *    authentication … Health Connect" error, without attempting CAK/HiChain.
 *
 * `HuaweiSession.sync()` cannot emit a single typed service-7 health record yet — every service 7
 * response body layout is undocumented (see `HuaweiSession.sync` KDoc, protocol doc §7.2/§10) — so
 * unlike [UserJourneyE2ETest]'s simulated watch this flow does not assert Summary metric cards; it
 * proves the real production pipeline (recognize → handshake → sync → Room) runs clean for this
 * brand, which is the part of "production ready" this protocol currently allows (see
 * docs/DECISIONS.md D-3xx).
 */
@HiltAndroidTest
class HuaweiWatchE2ETest : E2EBase() {

    private val watch = HuaweiVirtualDevice.ADDRESS
    private val authRequiredWatch = HuaweiAuthRequiredVirtualDevice.ADDRESS

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
                "Real 0x5A/TLV no-auth handshake completes: Connected, battery from service 1 cmd 8 and firmware from 0x0107, attributed to Huawei",
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
            step("synced", "Tap \"Sync now\"", "The real sweep (time sync → service 7 probes) completes without error") {
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

    @Test
    fun pairingAnAuthRequiredHuaweiWatchFailsWithAClearMessage() {
        val report = report("HuaweiWatchE2ETest")

        report.flow(11, "huawei-auth-required", "Devices → scan → pair a Huawei watch that requires app auth") {
            step("onboarding", "Finish onboarding with Bluetooth granted", "Summary opens with \"No device paired\"") {
                skipOnboarding(grant = true)
            }
            step("scanning", "Open Devices, tap \"Scan\"", "The auth-required simulated Huawei watch is listed") {
                clickTag("nav_DEVICES")
                clickTag("scan_fab")
                waitForTag("discovered_$authRequiredWatch")
                compose.onNode(
                    hasText(HuaweiAuthRequiredVirtualDevice.NAME) and hasAnyAncestor(hasTestTag("discovered_$authRequiredWatch")),
                    useUnmergedTree = true,
                ).assertIsDisplayed()
            }
            step(
                "pairing",
                "Tap \"Pair\"",
                "The real 0x0101 reply reports authVersion 3/authType 2; pairing fails fast with the app-auth explanation and Health Connect guidance",
            ) {
                clickTag("pair_$authRequiredWatch")
                waitForTag("paired_$authRequiredWatch")
                waitFor(
                    hasText("requires Huawei's app-level authentication", substring = true) and
                        hasAnyAncestor(hasTestTag("paired_$authRequiredWatch")),
                    timeoutMs = 30_000,
                    what = "auth-required error on the device card",
                )
                waitFor(
                    hasText("Health Connect", substring = true) and hasAnyAncestor(hasTestTag("paired_$authRequiredWatch")),
                    what = "Health Connect guidance",
                )
            }
        }
    }
}
