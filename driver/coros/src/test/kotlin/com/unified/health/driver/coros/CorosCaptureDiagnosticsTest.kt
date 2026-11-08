package com.unified.health.driver.coros

import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.core.testing.characteristic
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class CorosCaptureDiagnosticsTest {

    private val noCredentials = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })

    private fun rememberAdvertisement(
        driver: CorosDriver,
        name: String? = "COROS PACE 2",
        bonded: Boolean = true,
        services: Set<java.util.UUID> = emptySet(),
    ) {
        driver.recognize(
            Advertisement(
                address = "AA:BB:CC:DD:EE:FF",
                name = name,
                rssi = -50,
                serviceUuids = services,
                isBonded = bonded,
            ),
        )
    }

    @Test
    fun `vendor-only device fails with a precise capture request`() = runTest {
        val driver = CorosDriver()
        rememberAdvertisement(driver, services = setOf(CorosUuids.WELOOP_UART_SERVICE))
        val gatt = FakeGattClient(
            listOf(characteristic(CorosUuids.WELOOP_UART_SERVICE, CorosUuids.WELOOP_UART_WRITE, PROPERTY_WRITE)),
        )

        val failure = runCatching { driver.openSession(gatt, noCredentials) }.exceptionOrNull()

        assertTrue("expected CorosCaptureNeededException, was $failure", failure is CorosCaptureNeededException)
        val message = failure!!.message!!
        assertTrue(message.contains("HCI snoop log"))
        assertTrue(message.contains("advertisedName=COROS PACE 2"))
        assertTrue(message.contains("bond=bonded"))
        assertTrue(message.contains("6E400001"))
        // A capture-needed failure is deterministic: exactly one attempt is made.
        assertEquals(1, driver.connectionStateMachine.lastAttempt?.attempt)
        assertTrue(driver.connectionStateMachine.state.value is CorosConnectionState.PrepareServiceRediscovery)
    }

    @Test
    fun `captured snapshot records name bond state uuids and vendor families`() = runTest {
        val gatt = FakeGattClient(
            listOf(
                characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ),
                characteristic(CorosUuids.WELOOP_UART_SERVICE, CorosUuids.WELOOP_UART_WRITE, PROPERTY_WRITE),
                characteristic(CorosUuids.ADF7_SERVICE, CorosUuids.ADF7_CHAR_1, PROPERTY_WRITE),
                characteristic(CorosUuids.NORDIC_DFU_SERVICE, CorosUuids.NORDIC_DFU_CONTROL_POINT, PROPERTY_WRITE),
            ),
        )
        val session = CorosSession(
            gatt = gatt,
            dispatcher = StandardTestDispatcher(testScheduler),
            seen = SeenAdvertisement(name = "COROS PACE 2", isBonded = true),
        )
        session.start()

        val snapshot = session.captureDiagnostics()
        assertEquals("COROS PACE 2", snapshot.advertisedName)
        assertEquals("AA:BB:CC:DD:EE:FF", snapshot.address)
        assertEquals(CorosBondState.BONDED, snapshot.bondState)
        assertTrue(snapshot.sigBaselinePresent)
        assertTrue(snapshot.vendorProtocolPresent)
        assertTrue(StandardUuids.BATTERY_SERVICE in snapshot.serviceUuids)
        assertTrue(CorosUuids.WELOOP_UART_SERVICE in snapshot.serviceUuids)
        assertTrue(StandardUuids.BATTERY_LEVEL in snapshot.characteristicUuids)
        assertTrue(CorosUuids.WELOOP_UART_WRITE in snapshot.characteristicUuids)
        assertEquals(
            setOf(CorosVendorFamily.UART_6E400001, CorosVendorFamily.ADF70001, CorosVendorFamily.NORDIC_DFU),
            snapshot.vendorFamilies,
        )
        assertTrue(snapshot.summary().contains("6E400001"))
        assertTrue(snapshot.summary().contains("ADF70001"))
        session.close()
    }

    @Test
    fun `sig battery still works but history sync asks for a capture`() = runTest {
        val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
        val vendor = characteristic(CorosUuids.WELOOP_UART_SERVICE, CorosUuids.WELOOP_UART_WRITE, PROPERTY_WRITE)
        val gatt = FakeGattClient(listOf(battery, vendor))
        gatt.readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(88)
        val driver = CorosDriver()
        rememberAdvertisement(driver)

        val session = driver.openSession(gatt, noCredentials)
        assertEquals(setOf(DeviceCapability.BATTERY_LEVEL), session.capabilities)
        assertEquals(88, session.readDeviceInfo().batteryPercent)
        assertTrue((session as CorosSession).connectionState.value is CorosConnectionState.Ready)

        val failure = runCatching {
            session.sync(SyncRequest(since = null), RecordingSink()) {}
        }.exceptionOrNull()

        assertTrue("expected CorosCaptureNeededException, was $failure", failure is CorosCaptureNeededException)
        val diagnostics = (failure as CorosCaptureNeededException).diagnostics
        assertEquals("COROS PACE 2", diagnostics.advertisedName)
        assertEquals(CorosBondState.BONDED, diagnostics.bondState)
        assertTrue(failure.message!!.contains("HCI snoop log"))
        session.close()
    }

    @Test
    fun `one bounded retry recovers a transient subscribe failure`() = runTest {
        val hr = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
        val delegate = FakeGattClient(listOf(hr))
        val gatt = FailingSubscribeGatt(delegate, failuresRemaining = 1)
        val machine = CorosConnectionStateMachine(connectorInstanceId = 42)
        val session = CorosSession(
            gatt = gatt,
            dispatcher = StandardTestDispatcher(testScheduler),
            stateMachine = machine,
        )

        session.start()

        assertEquals(2, gatt.subscribeAttempts)
        assertEquals(2, machine.lastAttempt?.attempt)
        assertTrue(session.connectionState.value is CorosConnectionState.Ready)
        session.close()
    }

    @Test
    fun `link loss tears down and invalidates the gatt generation`() = runTest {
        val hr = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
        val gatt = FakeGattClient(listOf(hr))
        val machine = CorosConnectionStateMachine(connectorInstanceId = 5)
        val session = CorosSession(
            gatt = gatt,
            dispatcher = StandardTestDispatcher(testScheduler),
            stateMachine = machine,
        )
        session.start()
        val readyState = session.connectionState.value
        assertTrue(readyState is CorosConnectionState.Ready)

        gatt.disconnect()
        testScheduler.advanceUntilIdle()

        assertTrue(session.connectionState.value is CorosConnectionState.PrepareServiceRediscovery)
        assertFalse(machine.isCurrent((readyState as CorosConnectionState.Ready).gattRef))
    }

    /** Delegates to [FakeGattClient] but fails the first N subscribe calls, like a transient CCCD write. */
    private class FailingSubscribeGatt(
        private val delegate: FakeGattClient,
        private var failuresRemaining: Int,
    ) : GattClient by delegate {
        var subscribeAttempts: Int = 0
            private set

        override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
            subscribeAttempts++
            if (failuresRemaining > 0) {
                failuresRemaining--
                throw GattException("transient subscribe failure")
            }
            return delegate.subscribe(characteristic)
        }
    }
}
