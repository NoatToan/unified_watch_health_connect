package com.unified.health.core.ble.virtual

import android.util.Log
import com.unified.health.core.ble.gatt.AndroidGattConnector
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattConnector
import com.unified.health.core.ble.gatt.GattOptions
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.scan.AndroidBleScanner
import com.unified.health.core.ble.scan.BleScanner
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.merge
import javax.inject.Inject
import javax.inject.Singleton

/**
 * A device that exists only in software and is reached through an in-memory [GattClient] instead of
 * the radio. Contributed with Hilt `@IntoSet` by debug-only modules (the simulated watch used by E2E
 * tests); the set is empty in release builds, where the wrappers below are pure pass-throughs.
 */
interface VirtualDevice {
    /**
     * Whether this device currently counts as "present". Checked fresh on every scan/connect
     * attempt, so a contributor can gate it on a runtime switch (e.g. a debug-only "Demo mode"
     * setting) without this interface or its callers knowing anything about that switch.
     */
    val isActive: Boolean get() = true

    /** What the device "advertises"; a driver must recognise it like any real advertisement. */
    val advertisement: Advertisement

    /** Opens a fresh link, as `GattConnector.connect` would for a real device. */
    suspend fun connect(): GattClient
}

/** Real BLE advertisements plus those of [VirtualDevice]s. */
@Singleton
internal class VirtualAwareBleScanner @Inject constructor(
    private val real: AndroidBleScanner,
    private val virtualDevices: Set<@JvmSuppressWildcards VirtualDevice>,
) : BleScanner {

    override fun advertisements(): Flow<Advertisement> {
        if (virtualDevices.isEmpty()) return real.advertisements()
        val virtual = flow {
            delay(VIRTUAL_ADVERTISEMENT_DELAY_MS) // Shows up like a nearby device, not instantly.
            virtualDevices.forEach { if (it.isActive) emit(it.advertisement) }
        }
        // Without a usable radio (emulator, Bluetooth off, permission missing) virtual devices still appear.
        val radio = real.advertisements().catch { Log.i(TAG, "Real BLE scan unavailable: ${it.message}") }
        return merge(virtual, radio)
    }

    override fun bondedDevices(): List<Advertisement> = real.bondedDevices()

    private companion object {
        const val TAG = "VirtualAwareBleScanner"
        const val VIRTUAL_ADVERTISEMENT_DELAY_MS = 400L
    }
}

/** Routes virtual addresses to their in-memory link and everything else to the radio. */
@Singleton
internal class VirtualAwareGattConnector @Inject constructor(
    private val real: AndroidGattConnector,
    private val virtualDevices: Set<@JvmSuppressWildcards VirtualDevice>,
) : GattConnector {

    override suspend fun connect(
        address: String,
        bond: Boolean,
        mtu: Int?,
        options: GattOptions,
        bondOptional: Boolean,
    ): GattClient {
        val virtual = virtualDevices.firstOrNull { it.isActive && it.advertisement.address.equals(address, ignoreCase = true) }
            ?: return real.connect(address, bond, mtu, options, bondOptional)
        val client = virtual.connect()
        if (mtu != null) runCatching { client.requestMtu(mtu) }
        return client
    }
}
