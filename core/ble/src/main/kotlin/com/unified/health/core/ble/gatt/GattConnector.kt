package com.unified.health.core.ble.gatt

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import com.unified.health.core.ble.pairing.PairingCodeRequester
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Per-link GATT timing and workaround knobs. The defaults preserve the app-wide behaviour; a
 * driver overrides them through its [com.unified.health.core.ble.driver.LinkRequirements].
 *
 * @property refreshCacheBeforeDiscovery call the hidden `BluetoothGatt.refresh()` before
 *   `discoverServices` on API 28+ (no-op below 28). The Zepp app does this after every connect.
 */
data class GattOptions(
    val connectTimeoutMs: Long = DEFAULT_CONNECT_TIMEOUT_MS,
    val discoveryTimeoutMs: Long = DEFAULT_DISCOVERY_TIMEOUT_MS,
    val operationTimeoutMs: Long = DEFAULT_OPERATION_TIMEOUT_MS,
    val refreshCacheBeforeDiscovery: Boolean = false,
) {
    init {
        require(connectTimeoutMs > 0 && discoveryTimeoutMs > 0 && operationTimeoutMs > 0) {
            "GATT timeouts must be positive"
        }
    }

    companion object {
        const val DEFAULT_CONNECT_TIMEOUT_MS = 20_000L
        const val DEFAULT_DISCOVERY_TIMEOUT_MS = 20_000L
        const val DEFAULT_OPERATION_TIMEOUT_MS = 10_000L
    }
}

/** Opens GATT links. Abstracted so the connection manager can be tested without Android. */
interface GattConnector {
    /**
     * Connects to [address], discovers services, then optionally bonds and requests an MTU.
     * Retries once on the transient connect failures common on Android (e.g. status 133).
     */
    suspend fun connect(
        address: String,
        bond: Boolean,
        mtu: Int?,
        options: GattOptions = GattOptions(),
        bondOptional: Boolean = false,
    ): GattClient
}

@Singleton
@SuppressLint("MissingPermission") // Checked in requireConnectPermission().
internal class AndroidGattConnector @Inject constructor(
    @ApplicationContext private val context: Context,
    private val pairingCodes: PairingCodeRequester,
) : GattConnector {

    override suspend fun connect(
        address: String,
        bond: Boolean,
        mtu: Int?,
        options: GattOptions,
        bondOptional: Boolean,
    ): GattClient {
        requireConnectPermission()
        val adapter = context.getSystemService(BluetoothManager::class.java)?.adapter
            ?: throw BluetoothUnavailableException("This device has no Bluetooth adapter")
        if (!adapter.isEnabled) throw BluetoothUnavailableException("Bluetooth is turned off")
        if (!BluetoothAdapter.checkBluetoothAddress(address)) throw IllegalArgumentException("Invalid MAC address $address")
        val device = adapter.getRemoteDevice(address)

        val client = try {
            connectWithRetry(device, options)
        } catch (e: SecurityException) {
            throw BluetoothUnavailableException("Bluetooth permission was revoked", e)
        }
        try {
            if (bond) {
                try {
                    createBondAndAwait(context, device, pairingCodes)
                } catch (e: Exception) {
                    if (!bondOptional) throw e
                    Log.w(TAG, "OS bond with $address failed; continuing unbonded for app-level auth", e)
                }
            }
            if (mtu != null) {
                runCatching { client.requestMtu(mtu) }
                    .onFailure { Log.w(TAG, "MTU $mtu request failed, keeping ${client.mtu}", it) }
            }
        } catch (t: Throwable) {
            client.close()
            throw t
        }
        return client
    }

    private suspend fun connectWithRetry(device: BluetoothDevice, options: GattOptions): GattClient {
        repeat(CONNECT_ATTEMPTS - 1) { attempt ->
            try {
                return AndroidGattClient.connect(context, device, options, pairingCodes)
            } catch (e: GattException) {
                Log.w(TAG, "Connect attempt ${attempt + 1} to ${device.address} failed: ${e.message}")
                delay(RETRY_DELAY_MS)
            }
        }
        return AndroidGattClient.connect(context, device, options, pairingCodes)
    }

    private fun requireConnectPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S &&
            ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED
        ) {
            throw BluetoothUnavailableException("Nearby devices permission (BLUETOOTH_CONNECT) not granted")
        }
    }

    private companion object {
        const val TAG = "AndroidGattConnector"
        const val CONNECT_ATTEMPTS = 2
        const val RETRY_DELAY_MS = 600L
    }
}
