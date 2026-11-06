package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.model.DeviceCapability
import com.unified.health.driver.zepp.ZeppDriver
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/**
 * The real [ZeppDriver] against [ZeppVirtualWatch], replaying what `ZeppWatchE2ETest` flow 20 does
 * through `MultiVendorConnection`: generate a key (stored with the "unbound" marker), connect → local
 * bind → auth, then reconnect with the same key. Regression for the E2E failure "Watch rejected the
 * auth key (status 4)": the simulator kept the bound key per link, so every reconnect after the bind
 * found an unbound watch, while a real watch keeps it until reset/unbind (§5.5).
 */
class ZeppVirtualWatchDriverTest {

    private val generatedKey = ByteArray(16) { (it * 7 + 3).toByte() }
    private val marker = ZeppDriver.AUTH_KEY.unboundMarkerKey

    private class Store(initial: Map<String, ByteArray>) : CredentialWriter {
        val values = initial.toMutableMap()
        override suspend fun put(key: String, value: ByteArray) { values[key] = value }
        override suspend fun remove(key: String) { values.remove(key) }
    }

    private fun Store.context() = SessionContext(ZeppVirtualWatchIdentity.ADDRESS, { key -> values[key] }, this)

    /** What `generateCredential` leaves in the store: the new key plus the "unbound" marker. */
    private fun generated() = Store(mapOf(ZeppDriver.AUTH_KEY.key to generatedKey, marker to byteArrayOf(1)))

    private suspend fun connectAndOpen(watch: ZeppVirtualWatch, store: Store) {
        val gatt = watch.connect()
        try {
            val session = ZeppDriver().openSession(gatt, store.context())
            assertTrue(DeviceCapability.HISTORY_SYNC in session.capabilities)
            assertEquals(ZeppVirtualWatchIdentity.BATTERY_PERCENT, session.readDeviceInfo().batteryPercent)
            session.close()
        } finally {
            gatt.close()
        }
    }

    @Test
    fun `generated key binds, then every reconnect authenticates with it`() = runBlocking {
        withTimeout(TIMEOUT_MS) {
            val watch = ZeppVirtualWatch()
            val store = generated()

            connectAndOpen(watch, store) // first link: local bind + auth
            assertFalse("marker cleared after the watch accepted the bind", marker in store.values)

            // The app reconnects (credential change, retry, app restart): no marker → auth only.
            repeat(3) { connectAndOpen(watch, store) }
        }
    }

    @Test
    fun `reconnect with a different key is still rejected`() = runBlocking {
        withTimeout(TIMEOUT_MS) {
            val watch = ZeppVirtualWatch()
            connectAndOpen(watch, generated())

            val other = Store(mapOf(ZeppDriver.AUTH_KEY.key to ByteArray(16) { 0x5A }))
            val gatt = watch.connect()
            try {
                ZeppDriver().openSession(gatt, other.context())
                fail("expected AuthenticationException")
            } catch (e: AuthenticationException) {
                assertTrue(e.message!!.contains("status 4"))
            } finally {
                gatt.close()
            }
        }
    }

    private companion object {
        const val TIMEOUT_MS = 20_000L
    }
}
