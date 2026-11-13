package com.unified.health.core.ble.gatt

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.model.PairingCodeRequest
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull

/**
 * Creates an OS bond with [device] and suspends until it resolves, handling PIN/passkey prompts
 * via [pairingCodes]. Returns normally once bonded (including when already bonded); throws
 * [GattException] if pairing is rejected, cancelled or times out.
 *
 * Shared by two callers that bond at different points of a connection's lifetime:
 * [AndroidGattConnector.connect] bonds *before* a driver's [com.unified.health.core.ble.driver.WearableDriver.openSession]
 * runs, when [com.unified.health.core.ble.driver.LinkRequirements.bond] is known upfront; a driver
 * can also call [AndroidGattClient.ensureBonded] to bond *mid-session*, after it has learned from
 * the device itself that bonding is required (e.g. Xiaomi MiWear V1, distinguished from V2 only by
 * reading a post-connect version characteristic -- see `driver/xiaomi`'s `XiaomiDriver`). Extracted
 * so both call sites share the exact same broadcast-receiver handling instead of drifting apart.
 */
@SuppressLint("MissingPermission") // Callers already checked BLUETOOTH_CONNECT before connecting.
internal suspend fun createBondAndAwait(context: Context, device: BluetoothDevice, pairingCodes: PairingCodeRequester) = coroutineScope {
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

private const val BOND_TIMEOUT_MS = 60_000L
private const val PASSKEY_LENGTH = 6
private const val PIN_16_LENGTH = 16
private const val PAIRING_VARIANT_PIN_16_DIGITS = 7 // @hide in the SDK.
private const val PAIRING_RECEIVER_PRIORITY = 999
