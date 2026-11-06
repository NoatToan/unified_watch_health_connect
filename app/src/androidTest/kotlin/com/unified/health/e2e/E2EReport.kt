package com.unified.health.e2e

import android.graphics.Bitmap
import android.os.Build
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.services.storage.TestStorage
import java.time.Instant

/**
 * Records every E2E step as `e2e-report/<NN-flow>/<NN-step>.png` + `.json` through TestStorage
 * (`/sdcard/googletest/test_outputfiles`), which `scripts/e2e.sh` pulls and turns into
 * `build/e2e-report/index.html`. A failing step is still captured (status FAIL) before the error is rethrown.
 */
class E2EReport(private val testName: String, private val beforeCapture: () -> Unit = {}) {

    private val storage = TestStorage()
    private val instrumentation = InstrumentationRegistry.getInstrumentation()

    init {
        write("e2e-report/device-$testName.json", deviceJson().toByteArray())
    }

    fun flow(index: Int, slug: String, title: String, block: Flow.() -> Unit) {
        Flow("%02d-%s".format(index, slug), title).block()
    }

    inner class Flow(private val dir: String, private val title: String) {
        private var count = 0

        /** [action] is what the test does, [expected] what must be true afterwards (both shown in the report). */
        fun step(slug: String, action: String, expected: String, block: () -> Unit) {
            count++
            val name = "%02d-%s".format(count, slug)
            val started = Instant.now()
            var error: Throwable? = null
            try {
                block()
            } catch (t: Throwable) {
                error = t
            }
            runCatching(beforeCapture)
            val shot = runCatching { capture("e2e-report/$dir/$name.png") }.getOrDefault(false)
            val json = buildString {
                append('{')
                field("flow", dir); append(',')
                field("flowTitle", title); append(',')
                field("step", name); append(',')
                field("index", count); append(',')
                field("action", action); append(',')
                field("expected", expected); append(',')
                field("status", if (error == null) "PASS" else "FAIL"); append(',')
                field("error", error?.let { "${it::class.java.simpleName}: ${it.message}".take(MAX_ERROR) }); append(',')
                field("screenshot", if (shot) "$dir/$name.png" else null); append(',')
                field("test", testName); append(',')
                field("startedAt", started.toString()); append(',')
                field("durationMs", java.time.Duration.between(started, Instant.now()).toMillis())
                append('}')
            }
            write("e2e-report/$dir/$name.json", json.toByteArray())
            Log.i(TAG, "$dir/$name ${if (error == null) "PASS" else "FAIL: ${error.message}"}")
            error?.let { throw it }
        }
    }

    private fun capture(path: String): Boolean {
        instrumentation.waitForIdleSync()
        val bitmap: Bitmap = instrumentation.uiAutomation.takeScreenshot() ?: return false
        storage.openOutputFile(path).use { bitmap.compress(Bitmap.CompressFormat.PNG, 100, it) }
        bitmap.recycle()
        return true
    }

    private fun write(path: String, bytes: ByteArray) {
        storage.openOutputFile(path).use { it.write(bytes) }
    }

    private fun deviceJson(): String = buildString {
        append('{')
        field("manufacturer", Build.MANUFACTURER); append(',')
        field("model", Build.MODEL); append(',')
        field("device", Build.DEVICE); append(',')
        field("product", Build.PRODUCT); append(',')
        field("release", Build.VERSION.RELEASE); append(',')
        field("sdk", Build.VERSION.SDK_INT); append(',')
        field("fingerprint", Build.FINGERPRINT); append(',')
        field("emulator", Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.contains("emu") || Build.PRODUCT.contains("sdk")); append(',')
        field("startedAt", Instant.now().toString())
        append('}')
    }

    private fun StringBuilder.field(name: String, value: Any?) {
        append('"').append(name).append("\":")
        when (value) {
            null -> append("null")
            is Number, is Boolean -> append(value.toString())
            else -> append('"').append(escape(value.toString())).append('"')
        }
    }

    private fun escape(s: String) = buildString {
        s.forEach { c ->
            when (c) {
                '"' -> append("\\\"")
                '\\' -> append("\\\\")
                '\n' -> append("\\n")
                '\r' -> append("\\r")
                '\t' -> append("\\t")
                else -> if (c < ' ') append("\\u%04x".format(c.code)) else append(c)
            }
        }
    }

    private companion object {
        const val TAG = "E2EReport"
        const val MAX_ERROR = 600
    }
}
