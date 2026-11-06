package com.unified.health.driver.huawei.wearengine.sdk

import android.content.Context
import android.content.pm.PackageManager
import android.util.Log
import com.huawei.wearengine.HiWear
import com.huawei.wearengine.auth.AuthCallback
import com.huawei.wearengine.auth.Permission
import com.huawei.wearengine.device.Device
import com.huawei.wearengine.monitor.MonitorItem
import com.huawei.wearengine.sensor.Sensor
import com.huawei.wearengine.sensor.SensorReadCallback
import com.unified.health.driver.huawei.wearengine.HeartRateReading
import com.unified.health.driver.huawei.wearengine.WearDevice
import com.unified.health.driver.huawei.wearengine.WearEngineCallException
import com.unified.health.driver.huawei.wearengine.WearEngineGateway
import com.unified.health.driver.huawei.wearengine.WearPermission
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.suspendCancellableCoroutine
import java.time.Instant
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.coroutines.resume

/**
 * [WearEngineGateway] over WearEngine SDK 5.0.3.305 (`com.huawei.hms:wearengine`). API surface
 * verified with `javap` on the published AAR; value semantics marked [I] still need a real watch.
 */
@Singleton
internal class SdkWearEngineGateway @Inject constructor(
    @ApplicationContext private val context: Context,
) : WearEngineGateway {

    /** SDK `Device` objects by uuid; every call needs the original object. */
    private val devices = ConcurrentHashMap<String, Device>()

    override fun isHealthAppInstalled(): Boolean = try {
        context.packageManager.getPackageInfo(HEALTH_PACKAGE, 0)
        true
    } catch (_: PackageManager.NameNotFoundException) {
        false
    }

    override suspend fun hasPermissions(permissions: Set<WearPermission>): Boolean {
        val sdkPermissions = permissions.map { it.toSdk() }.toTypedArray()
        val granted = HiWear.getAuthClient(context).checkPermissions(sdkPermissions).await("checkPermissions")
        return granted.all { it == true }
    }

    override suspend fun requestPermissions(permissions: Set<WearPermission>): Set<WearPermission> {
        val client = HiWear.getAuthClient(context)
        return suspendCancellableCoroutine { cont ->
            val callback = object : AuthCallback {
                override fun onOk(granted: Array<out Permission>?) {
                    val names = granted.orEmpty().map { it.name }.toSet()
                    if (cont.isActive) cont.resume(permissions.filter { it.toSdk().name in names }.toSet())
                }

                override fun onCancel() {
                    if (cont.isActive) cont.resume(emptySet())
                }
            }
            client.requestPermission(callback, *permissions.map { it.toSdk() }.toTypedArray())
                .addOnFailureListener { error ->
                    Log.w(TAG, "requestPermission failed", error)
                    if (cont.isActive) cont.resume(emptySet())
                }
        }
    }

    override suspend fun bondedDevices(): List<WearDevice> {
        val bonded = HiWear.getDeviceClient(context).bondedDevices.await("getBondedDevices").orEmpty()
        return bonded.mapNotNull { device ->
            val id = device.uuid ?: return@mapNotNull null
            devices[id] = device
            WearDevice(
                id = id,
                name = device.name ?: device.model ?: "Huawei watch",
                model = device.model,
                softwareVersion = device.softwareVersion,
                isConnected = device.isConnected,
            )
        }
    }

    /** [I] `MONITOR_POWER_STATUS` is assumed to report the battery percentage as an int. */
    override suspend fun batteryPercent(deviceId: String): Int? {
        val device = device(deviceId)
        val data = HiWear.getMonitorClient(context).query(device, MonitorItem.MONITOR_POWER_STATUS).await("query power status")
        return data?.asInt()?.takeIf { it in 0..100 }
    }

    /**
     * Streams the watch's HR sensor (`Sensor.TYPE_HR`). [I] the first float of `DataResult` is
     * the bpm and `errorCode == 0` means success.
     */
    override fun heartRate(deviceId: String): Flow<HeartRateReading> = callbackFlow {
        val device = device(deviceId)
        val client = HiWear.getSensorClient(context)
        val sensor = client.getSensorList(device).await("getSensorList").orEmpty().firstOrNull { it.type == Sensor.TYPE_HR }
            ?: throw WearEngineCallException(null, "This watch does not expose a heart rate sensor to WearEngine")
        val callback = SensorReadCallback { errorCode, result ->
            if (errorCode != 0 || result == null) {
                Log.d(TAG, "HR read error $errorCode")
                return@SensorReadCallback
            }
            val bpm = result.asFloats()?.firstOrNull()?.toInt() ?: return@SensorReadCallback
            if (bpm <= 0) return@SensorReadCallback
            val time = result.utc.takeIf { it > 0 }?.let(Instant::ofEpochMilli) ?: Instant.now()
            trySend(HeartRateReading(time, bpm))
        }
        client.asyncRead(device, sensor, callback).await("asyncRead HR")
        awaitClose {
            client.stopAsyncRead(device, sensor) { code -> if (code != 0) Log.d(TAG, "stopAsyncRead returned $code") }
        }
    }

    private fun device(deviceId: String): Device =
        devices[deviceId] ?: throw WearEngineCallException(null, "Unknown WearEngine device $deviceId; list devices first")

    private fun WearPermission.toSdk(): Permission = when (this) {
        WearPermission.DEVICE_MANAGER -> Permission.DEVICE_MANAGER
        WearPermission.SENSOR -> Permission.SENSOR
    }

    private companion object {
        const val TAG = "WearEngineGateway"
        const val HEALTH_PACKAGE = "com.huawei.health"
    }
}
