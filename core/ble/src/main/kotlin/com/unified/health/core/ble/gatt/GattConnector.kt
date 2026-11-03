package com.unified.health.core.ble.gatt

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.model.PairingCodeRequest
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.withTimeoutOrNull
import javax.inject.Inject
import javax.inject.Singleton

/** Opens GATT links. Abstracted so the connection manager can be tested without Android. */
interface GattConnector {
    /**
     * Connects to [address], discovers services, then optionally bonds and requests an MTU.
     * Retries once on the transient connect failures common on Android (e.g. status 133).
     */
    suspend fun connect(address: String, bond: Boolean, mtu: Int?): GattClient
}

@Singleton
@SuppressLint("MissingPermission") // Checked in requireConnectPermission().
internal class AndroidGattConnector @Inject constructor(
    @ApplicationContext private val context: Context,
    private val pairingCodes: PairingCodeRequester,
) : GattConnector {

    override suspend fun connect(address: String, bond: Boolean, mtu: Int?): GattClient {
        requireConnectPermission()
        val adapter = context.getSystemService(BluetoothManager::class.java)?.adapter
            ?: throw BluetoothUnavailableException("This device has no Bluetooth adapter")
        if (!adapter.isEnabled) throw BluetoothUnavailableException("Bluetooth is turned off")
        if (!BluetoothAdapter.checkBluetoothAddress(address)) throw IllegalArgumentException("Invalid MAC address $address")
        val device = adapter.getRemoteDevice(address)

        val client = try {
            connectWithRetry(device)
        } catch (e: SecurityException) {
            throw BluetoothUnavailableException("Bluetooth permission was revoked", e)
        }
        try {
            if (bond) ensureBonded(device)
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

    private suspend fun connectWithRetry(device: BluetoothDevice): GattClient {
        repeat(CONNECT_ATTEMPTS - 1) { attempt ->
            try {
                return AndroidGattClient.connect(context, device, CONNECT_TIMEOUT_MS)
            } catch (e: GattException) {
                Log.w(TAG, "Connect attempt ${attempt + 1} to ${device.address} failed: ${e.message}")
                delay(RETRY_DELAY_MS)
            }
        }
        return AndroidGattClient.connect(context, device, CONNECT_TIMEOUT_MS)
    }

    /**
     * Creates an OS bond and waits for the result. When the watch shows a PIN/passkey, the code is asked
     * in-app and handed to the stack; other pairing variants fall back to the system dialog.
     */
    private suspend fun ensureBonded(device: BluetoothDevice) = coroutineScope {
        if (device.bondState == BluetoothDevice.BOND_BONDED) return@coroutineScope
        val result = CompletableDeferred<Boolean>()
        val codeRequests = Channel<Int>(Channel.UNLIMITED)
        val bondReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                val changed = IntentCompat.getParcelableExtra(intent, BluetoothDevice.EXTRA_DEVICE, BluetoothDevice::class.java)
                if (changed?.address != device.address) return
                when (intent.getIntExtra(BluetoothDevice.EXTRA_BOND_STATE, BluetoothDevice.ERROR)) {
                    BluetoothDevice.BOND_BONDED -> result.complete(true)
                    BluetoothDevice.BOND_NONE -> result.complete(false)
                }
            }
        }
        val pairingReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                val target = IntentCompat.getParcelableExtra(intent, BluetoothDevice.EXTRA_DEVICE, BluetoothDevice::class.java)
                if (target?.address != device.address) return
                val maxLength = when (intent.getIntExtra(BluetoothDevice.EXTRA_PAIRING_VARIANT, BluetoothDevice.ERROR)) {
                    BluetoothDevice.PAIRING_VARIANT_PIN -> PASSKEY_LENGTH
                    PAIRING_VARIANT_PIN_16_DIGITS -> PIN_16_LENGTH
                    else -> return
                }
                if (isOrderedBroadcast) abortBroadcast() // Keep the system dialog from covering ours.
                codeRequests.trySend(maxLength)
            }
        }
        val codeJob = launch {
            for (maxLength in codeRequests) {
                val code = pairingCodes.requestCode(
                    PairingCodeRequest(deviceName = device.name ?: device.address, address = device.address, maxLength = maxLength),
                )
                if (code == null) result.complete(false) else device.setPin(code.toByteArray(Charsets.UTF_8))
            }
        }
        ContextCompat.registerReceiver(
            context,
            bondReceiver,
            IntentFilter(BluetoothDevice.ACTION_BOND_STATE_CHANGED),
            ContextCompat.RECEIVER_EXPORTED, // System broadcast.
        )
        ContextCompat.registerReceiver(
            context,
            pairingReceiver,
            IntentFilter(BluetoothDevice.ACTION_PAIRING_REQUEST).apply { priority = PAIRING_RECEIVER_PRIORITY },
            ContextCompat.RECEIVER_EXPORTED, // System broadcast.
        )
        try {
            if (device.bondState == BluetoothDevice.BOND_BONDED) return@coroutineScope
            if (device.bondState != BluetoothDevice.BOND_BONDING && !device.createBond()) {
                throw GattException("Could not start pairing with ${device.address}")
            }
            when (withTimeoutOrNull(BOND_TIMEOUT_MS) { result.await() }) {
                true -> Unit
                false -> throw GattException("Pairing was rejected or cancelled")
                null -> throw GattException("Pairing timed out")
            }
        } finally {
            context.unregisterReceiver(pairingReceiver)
            context.unregisterReceiver(bondReceiver)
            codeRequests.close()
            codeJob.cancel()
        }
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
        const val CONNECT_TIMEOUT_MS = 20_000L
        const val RETRY_DELAY_MS = 600L
        const val BOND_TIMEOUT_MS = 60_000L
        const val PASSKEY_LENGTH = 6
        const val PIN_16_LENGTH = 16
        const val PAIRING_VARIANT_PIN_16_DIGITS = 7 // @hide in the SDK.
        const val PAIRING_RECEIVER_PRIORITY = 999
    }
}
