package com.unified.health.core.ble.scan

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import com.unified.health.core.ble.gatt.BluetoothUnavailableException
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject
import javax.inject.Singleton

/** Raw BLE discovery; vendor recognition happens in the drivers. */
interface BleScanner {
    /** Hot while collected; stops scanning on cancellation. Fails if Bluetooth is unavailable. */
    fun advertisements(): Flow<Advertisement>

    /**
     * Devices bonded at OS level. Watches connected to their vendor app usually stop advertising,
     * so they are only discoverable this way.
     */
    fun bondedDevices(): List<Advertisement>
}

@Singleton
@SuppressLint("MissingPermission") // Checked in requireScanPermission().
internal class AndroidBleScanner @Inject constructor(
    @ApplicationContext private val context: Context,
) : BleScanner {

    private val adapter get() = context.getSystemService(BluetoothManager::class.java)?.adapter

    override fun advertisements(): Flow<Advertisement> = callbackFlow {
        requirePermission(if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) Manifest.permission.BLUETOOTH_SCAN else Manifest.permission.ACCESS_FINE_LOCATION)
        val scanner = adapter?.takeIf { it.isEnabled }?.bluetoothLeScanner
            ?: throw BluetoothUnavailableException("Bluetooth is turned off")
        val callback = object : ScanCallback() {
            override fun onScanResult(callbackType: Int, result: ScanResult) {
                trySend(result.toAdvertisement())
            }

            override fun onBatchScanResults(results: MutableList<ScanResult>) {
                results.forEach { trySend(it.toAdvertisement()) }
            }

            override fun onScanFailed(errorCode: Int) {
                close(BluetoothUnavailableException("BLE scan failed (error $errorCode)"))
            }
        }
        // No OS ScanFilter: brands identify themselves differently (manufacturer id, service, name),
        // and the vendor apps themselves filter in software. Foreground-only scanning, so this is fine.
        val settings = ScanSettings.Builder().setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY).build()
        scanner.startScan(null, settings, callback)
        awaitClose {
            runCatching { scanner.stopScan(callback) }.onFailure { Log.w(TAG, "stopScan failed", it) }
        }
    }

    override fun bondedDevices(): List<Advertisement> {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && !granted(Manifest.permission.BLUETOOTH_CONNECT)) return emptyList()
        return adapter?.bondedDevices.orEmpty().map { device ->
            Advertisement(address = device.address, name = device.name, rssi = null, isBonded = true)
        }
    }

    private fun ScanResult.toAdvertisement(): Advertisement {
        val record = scanRecord
        val manufacturer = buildMap {
            val data = record?.manufacturerSpecificData ?: return@buildMap
            for (i in 0 until data.size()) put(data.keyAt(i), data.valueAt(i))
        }
        return Advertisement(
            address = device.address,
            name = record?.deviceName ?: runCatching { device.name }.getOrNull(),
            rssi = rssi,
            serviceUuids = record?.serviceUuids.orEmpty().map { it.uuid }.toSet(),
            manufacturerData = manufacturer,
            serviceData = record?.serviceData.orEmpty().mapKeys { it.key.uuid },
            // Name and bond state need BLUETOOTH_CONNECT on API 31+; degrade instead of failing the scan.
            isBonded = runCatching { device.bondState == BluetoothDevice.BOND_BONDED }.getOrDefault(false),
        )
    }

    private fun granted(permission: String) =
        ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED

    private fun requirePermission(permission: String) {
        if (!granted(permission)) throw BluetoothUnavailableException("Permission $permission not granted")
    }

    private companion object {
        const val TAG = "AndroidBleScanner"
    }
}
