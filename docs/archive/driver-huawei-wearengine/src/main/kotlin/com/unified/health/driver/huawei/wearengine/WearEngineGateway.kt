package com.unified.health.driver.huawei.wearengine

import kotlinx.coroutines.flow.Flow
import java.time.Instant

/**
 * The slice of the Huawei WearEngine SDK this driver uses, behind an interface so the session
 * logic is testable on the JVM. The real implementation is [sdk.SdkWearEngineGateway].
 *
 * WearEngine reaches the watch through the Huawei Health app; it offers device listing, live
 * sensors and status monitoring, but no history (use Health Connect for Huawei history).
 */
internal interface WearEngineGateway {
    fun isHealthAppInstalled(): Boolean

    suspend fun hasPermissions(permissions: Set<WearPermission>): Boolean

    /** Shows WearEngine's consent screen. @return the permissions the user granted. */
    suspend fun requestPermissions(permissions: Set<WearPermission>): Set<WearPermission>

    suspend fun bondedDevices(): List<WearDevice>

    /** Battery percentage, or null when the watch does not report it. */
    suspend fun batteryPercent(deviceId: String): Int?

    /** Live heart rate while collected; stops the sensor on cancellation. */
    fun heartRate(deviceId: String): Flow<HeartRateReading>
}

internal enum class WearPermission { DEVICE_MANAGER, SENSOR }

internal data class WearDevice(
    val id: String,
    val name: String,
    val model: String?,
    val softwareVersion: String?,
    val isConnected: Boolean,
)

internal data class HeartRateReading(val time: Instant, val bpm: Int)

/** A WearEngine call failed; [errorCode] is the SDK's `WearEngineException.getErrorCode()`. */
internal class WearEngineCallException(val errorCode: Int?, message: String, cause: Throwable? = null) : Exception(message, cause)
