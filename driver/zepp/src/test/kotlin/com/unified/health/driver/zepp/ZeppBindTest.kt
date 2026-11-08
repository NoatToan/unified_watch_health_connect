package com.unified.health.driver.zepp

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.SessionContext
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.time.ZoneOffset
import java.util.Random

class ZeppBindTest {

    private val generatedKey = ByteArray(16) { (it * 7 + 1).toByte() }
    private val watchOldKey = ByteArray(16) { 0x11 }
    private val marker = ZeppDriver.AUTH_KEY.unboundMarkerKey

    private class Store(initial: Map<String, ByteArray>) : CredentialWriter {
        val values = initial.toMutableMap()
        override suspend fun put(key: String, value: ByteArray) { values[key] = value }
        override suspend fun remove(key: String) { values.remove(key) }
    }

    private fun contextFor(store: Store) =
        SessionContext("AA:BB:CC:DD:EE:FF", { key -> store.values[key] }, store)

    private fun unbound() = Store(mapOf(ZeppDriver.AUTH_KEY.key to generatedKey, marker to byteArrayOf(1)))

    private fun TestScope.driver() = ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1))

    @Test
    fun `legacy bind writes the key, clears the marker and then authenticates`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, hasChannel = false, hasLegacyAuth = true)
        val store = unbound()

        val session = driver().openSession(watch.gatt, contextFor(store))

        assertEquals(1, watch.bindCommands.size)
        assertArrayEquals(byteArrayOf(0x01, 0x00) + generatedKey, watch.bindCommands.single())
        assertArrayEquals(generatedKey, watch.storedKey)
        assertTrue(watch.authenticated)
        assertFalse(marker in store.values)
        assertTrue(ZeppDriver.AUTH_KEY.key in store.values)
        session.close()
    }

    @Test
    fun `legacy bind refused by the watch keeps the marker`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, hasChannel = false, hasLegacyAuth = true).apply { bindStatus = 2 }
        val store = unbound()

        try {
            driver().openSession(watch.gatt, contextFor(store))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("did not accept the new key"))
        }
        assertTrue(marker in store.values)
        assertFalse(watch.authenticated)
        assertArrayEquals(watchOldKey, watch.storedKey)
    }

    @Test
    fun `Zepp OS local bind runs only when the firmware allows it`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, allowLocalBinding = 1)
        val store = unbound()

        val session = driver().openSession(watch.gatt, contextFor(store))

        assertEquals(1, watch.infoRequests)
        assertArrayEquals(byteArrayOf(0x01, 0x02, 0x00) + generatedKey, watch.bindCommands.single())
        assertTrue(watch.authenticated)
        assertFalse(marker in store.values)
        session.close()
    }

    @Test
    fun `Zepp OS watch without local binding explains the server signature and keeps the marker`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, allowLocalBinding = 0)
        val store = unbound()

        try {
            driver().openSession(watch.gatt, contextFor(store))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("Huami server"))
            assertTrue(e.message!!.contains("Zepp app"))
        }
        assertTrue(watch.bindCommands.isEmpty())
        assertTrue(marker in store.values)
        assertFalse(watch.authenticated)
    }

    @Test
    fun `Zepp OS local bind refused by the user keeps the marker`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, allowLocalBinding = 1).apply { bindStatus = 2 }
        val store = unbound()

        try {
            driver().openSession(watch.gatt, contextFor(store))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("status 2"))
        }
        assertTrue(marker in store.values)
    }

    @Test
    fun `without the marker no bind command is ever written`() = runTest {
        val legacy = FakeZeppWatch(generatedKey, hasChannel = false, hasLegacyAuth = true)
        val osWatch = FakeZeppWatch(generatedKey, allowLocalBinding = 1)
        val store = Store(mapOf(ZeppDriver.AUTH_KEY.key to generatedKey))

        driver().openSession(legacy.gatt, contextFor(store)).close()
        driver().openSession(osWatch.gatt, contextFor(store)).close()

        assertTrue(legacy.bindCommands.isEmpty())
        assertTrue(osWatch.bindCommands.isEmpty())
        assertEquals(0, osWatch.infoRequests)
        assertTrue(legacy.authenticated && osWatch.authenticated)
    }

    @Test
    fun `module 0x80 local bind is accepted when the firmware allows it`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, encryptByte = null, allowLocalBinding = 1)
        val store = unbound()

        val session = driver().openSession(watch.gatt, contextFor(store))

        assertEquals(1, watch.infoRequests)
        assertArrayEquals(byteArrayOf(0x01, 0x01, 0x00) + generatedKey, watch.bindCommands.single())
        assertArrayEquals(generatedKey, watch.storedKey)
        assertTrue(watch.authenticated)
        assertFalse(marker in store.values)
        session.close()
    }

    @Test
    fun `module 0x80 without local binding explains the server signature and keeps the marker`() = runTest {
        val watch = FakeZeppWatch(watchOldKey, encryptByte = null, allowLocalBinding = 0)
        val store = unbound()

        try {
            driver().openSession(watch.gatt, contextFor(store))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("Huami server"))
        }
        assertTrue(watch.bindCommands.isEmpty())
        assertFalse(watch.authenticated)
        assertTrue(marker in store.values)
    }

    @Test
    fun `the auth key credential can be generated by the app`() {
        assertTrue(ZeppDriver.AUTH_KEY.generatable)
        assertEquals("zepp.auth_key.unbound", marker)
    }
}
