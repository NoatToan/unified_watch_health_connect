package com.unified.health.e2e

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.hasAnyAncestor
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performSemanticsAction
import com.unified.health.core.demo.DemoDevice
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/** Devices › ⋮ › Device settings: About this device, capabilities, per-device sync, unpair. */
@HiltAndroidTest
class DeviceSettingsE2ETest : E2EBase() {

    private val watch = DemoDevice.ADDRESS

    private fun about(tag: String, text: String) =
        waitFor(hasText(text, substring = true) and hasAnyAncestor(hasTestTag(tag)), what = "$tag = $text")

    @Test
    fun aboutThisDevice() {
        val report = report("DeviceSettingsE2ETest")

        report.flow(14, "device-settings", "Devices › Device settings (About this device)") {
            step("paired", "Pair the simulated watch from Devices", "Watch connected in My devices") {
                skipOnboarding(grant = true)
                clickTag("nav_DEVICES")
                clickTag("scan_fab")
                // Several simulated watches advertise; give the scan a full window to list the demo one.
                waitForTag("pair_$watch", timeoutMs = 30_000)
                clickTag("pair_$watch")
                waitFor(hasText("Connected") and hasAnyAncestor(hasTestTag("paired_$watch")), what = "Connected chip")
            }
            step("menu", "Tap ⋮ on the watch", "Menu offers \"Device settings\" (no longer \"coming soon\")") {
                clickTag("more_$watch")
                waitForTag("device_settings_menu_item")
            }
            step("about", "Tap \"Device settings\"", "Name, brand, model, firmware, battery and Bluetooth address") {
                clickTag("device_settings_menu_item")
                waitForTag("device_detail")
                about("about_name", DemoDevice.NAME)
                about("about_model", DemoDevice.MODEL)
                about("about_firmware", DemoDevice.FIRMWARE)
                about("about_battery", "${DemoDevice.BATTERY_PERCENT}%")
                about("about_address", watch)
            }
            step("capabilities", "Scroll to Capabilities", "History sync, live heart rate and battery level are supported") {
                compose.onNodeWithTag("capability_BATTERY_LEVEL", useUnmergedTree = true).performScrollTo()
                waitForTag("capability_HISTORY_SYNC")
                waitForTag("capability_LIVE_HEART_RATE")
            }
            step("synced", "Scroll up, tap \"Sync now\"", "Sync completes; Last sync shows a time instead of \"Never\"") {
                compose.onNodeWithTag("detail_sync").performScrollTo()
                waitFor(hasTestTag("detail_sync") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "Sync now enabled")
                compose.onNodeWithTag("detail_sync", useUnmergedTree = true).performClick()
                waitFor(hasTestTag("detail_sync") and SemanticsMatcher.keyNotDefined(SemanticsProperties.Disabled), timeoutMs = 30_000, what = "sync finished")
                waitGone(hasText("Never") and hasAnyAncestor(hasTestTag("about_last_sync")), 30_000)
            }
            step("confirm-unpair", "Scroll down, tap \"Unpair this device\"", "Confirmation dialog: synced data is kept") {
                // Scroll past the button so it is clear of the gesture bar, then tap it.
                compose.onNodeWithTag("detail_unpair_note", useUnmergedTree = true).performScrollTo()
                compose.onNodeWithTag("detail_unpair").performSemanticsAction(SemanticsActions.OnClick)
                waitForText("Unpair ${DemoDevice.NAME}?")
            }
            step("unpaired", "Confirm", "Back on Devices with no paired watch") {
                clickTag("detail_confirm_unpair")
                waitForText("No device paired yet")
                waitGone(hasTestTag("paired_$watch"))
            }
        }
    }
}
