package com.unified.health.e2e

import android.Manifest
import android.os.Build
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.test.platform.app.InstrumentationRegistry
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

/** Profile › Notifications: Android permission, then toggles that survive leaving the screen. */
@HiltAndroidTest
class NotificationSettingsE2ETest : E2EBase() {

    private fun openNotifications() {
        clickTag("nav_PROFILE")
        compose.onNodeWithTag("profile_notifications").performScrollTo()
        clickTag("profile_notifications")
        waitForTag("notification_settings")
    }

    @Test
    fun notificationPreferencesPersist() {
        val report = report("NotificationSettingsE2ETest")

        report.flow(15, "notifications", "Profile › Notifications") {
            step("settings", "Finish onboarding, Profile › Notifications", "Goal achieved and low battery on, sync reminders off") {
                skipOnboarding(grant = false)
                openNotifications()
                compose.onNodeWithTag("notif_goal").assertIsOn()
                compose.onNodeWithTag("notif_battery").assertIsOn()
                compose.onNodeWithTag("notif_sync").assertIsOff()
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                var dialog = false
                step("permission-needed", "(Android 13+) notifications not yet allowed, tap \"Allow\"", "Card explains alerts are blocked; Android asks for permission") {
                    waitForTag("notifications_blocked")
                    clickTag("notifications_allow")
                    dialog = systemPermissionDialogShown()
                }
                step("permission-granted", "Tap \"Allow\" in the system dialog", "The blocked-notifications card disappears") {
                    if (!dialog || !allowSystemPermissionDialog()) {
                        InstrumentationRegistry.getInstrumentation().uiAutomation
                            .grantRuntimePermission(context.packageName, Manifest.permission.POST_NOTIFICATIONS)
                    }
                    waitGone(hasTestTag("notifications_blocked"))
                }
            }
            step("toggled", "Turn off Goal achieved, turn on Sync reminders", "Switches reflect the new choice") {
                compose.onNodeWithTag("notif_goal").performClick()
                compose.onNodeWithTag("notif_sync").performClick()
                compose.waitUntil(TIMEOUT_MS) { runCatching { compose.onNodeWithTag("notif_goal").assertIsOff() }.isSuccess }
                compose.waitUntil(TIMEOUT_MS) { runCatching { compose.onNodeWithTag("notif_sync").assertIsOn() }.isSuccess }
            }
            step("persisted", "Back, open Notifications again", "Choices were saved (DataStore)") {
                device.pressBack()
                waitForTag("profile_notifications")
                openNotifications()
                compose.onNodeWithTag("notif_goal").assertIsOff()
                compose.onNodeWithTag("notif_battery").assertIsOn()
                compose.onNodeWithTag("notif_sync").assertIsOn()
            }
        }
    }
}
