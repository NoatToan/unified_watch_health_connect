package com.unified.health.e2e

import android.Manifest
import android.content.Context
import android.os.Build
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.ComposeTimeoutException
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performSemanticsAction
import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import com.unified.health.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import java.io.File
import java.util.regex.Pattern

/**
 * Shared setup: wipes local storage before the activity starts (each test runs in its own process
 * under the orchestrator, so nothing has opened the DB or DataStore yet), then launches [MainActivity]
 * on the real Hilt graph, which in debug includes the simulated watch from `:core:demo`.
 */
abstract class E2EBase {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val compose: ComposeTestRule = createEmptyComposeRule()

    protected val context: Context get() = InstrumentationRegistry.getInstrumentation().targetContext
    protected val device: UiDevice get() = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    private var scenario: ActivityScenario<MainActivity>? = null

    @Before
    fun resetAndLaunch() {
        context.deleteDatabase("unified-health.db")
        File(context.filesDir, "datastore").deleteRecursively()
        File(context.filesDir, "wearable_raw").deleteRecursively()
        hiltRule.inject()
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun close() {
        scenario?.close()
    }

    protected fun report(name: String) = E2EReport(name, beforeCapture = { compose.waitForIdle() })

    protected fun waitFor(matcher: SemanticsMatcher, timeoutMs: Long = TIMEOUT_MS, what: String = matcher.description) {
        try {
            compose.waitUntil(timeoutMs) { compose.onAllNodesWithMatcher(matcher).isNotEmpty() }
        } catch (e: ComposeTimeoutException) {
            throw AssertionError("Timed out after ${timeoutMs}ms waiting for $what", e)
        }
    }

    protected fun waitForTag(tag: String, timeoutMs: Long = TIMEOUT_MS) = waitFor(hasTestTag(tag), timeoutMs, "tag '$tag'")

    protected fun waitForText(text: String, timeoutMs: Long = TIMEOUT_MS, substring: Boolean = true) =
        waitFor(hasText(text, substring = substring), timeoutMs, "text '$text'")

    protected fun waitGone(matcher: SemanticsMatcher, timeoutMs: Long = TIMEOUT_MS) {
        compose.waitUntil(timeoutMs) { compose.onAllNodesWithMatcher(matcher).isEmpty() }
    }

    /**
     * Brings the node into view and invokes its click action. Using the semantics action instead of a coordinate tap
     * keeps a click reliable when the node sits under the Scan FAB or below the fold of a long device list.
     */
    protected fun clickTag(tag: String) {
        waitForTag(tag)
        val node = compose.onNodeWithTag(tag, useUnmergedTree = true)
        runCatching { node.performScrollTo() }
        compose.waitForIdle()
        if (node.fetchSemanticsNode().config.contains(SemanticsActions.OnClick)) {
            node.performSemanticsAction(SemanticsActions.OnClick)
        } else {
            node.performClick()
        }
    }

    /** Completes onboarding the quick way (no system dialogs), optionally granting Bluetooth through UiAutomation. */
    protected fun skipOnboarding(grant: Boolean = true) {
        if (grant) grantBluetooth()
        clickTag("get_started")
        clickTag("onboarding_continue")
        waitForTag("summary_list")
    }

    protected fun grantBluetooth() {
        val automation = InstrumentationRegistry.getInstrumentation().uiAutomation
        bluetoothPermissions().forEach { automation.grantRuntimePermission(context.packageName, it) }
    }

    protected fun bluetoothPermissions(): List<String> =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            listOf(Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT)
        } else {
            listOf(Manifest.permission.ACCESS_FINE_LOCATION)
        }

    /** Taps "Allow" on the system runtime-permission dialog; false when no dialog appeared. */
    protected fun allowSystemPermissionDialog(timeoutMs: Long = 6_000): Boolean {
        val button = device.wait(Until.findObject(By.res(Pattern.compile(".*:id/permission_allow_button"))), timeoutMs)
            ?: device.wait(Until.findObject(By.text(Pattern.compile("(?i)allow"))), 1_000)
            ?: return false
        button.click()
        return true
    }

    protected fun systemPermissionDialogShown(timeoutMs: Long = 6_000): Boolean =
        device.wait(Until.hasObject(By.res(Pattern.compile(".*:id/permission_allow_button"))), timeoutMs)

    private fun ComposeTestRule.onAllNodesWithMatcher(matcher: SemanticsMatcher) =
        onAllNodes(matcher, useUnmergedTree = true).fetchSemanticsNodes()

    companion object {
        const val TIMEOUT_MS = 15_000L
    }
}
