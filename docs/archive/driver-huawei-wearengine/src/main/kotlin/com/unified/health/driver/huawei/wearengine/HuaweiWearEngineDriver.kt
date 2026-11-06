package com.unified.health.driver.huawei.wearengine

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CompanionAppDriver
import com.unified.health.core.ble.driver.CompanionAvailability
import com.unified.health.core.ble.driver.CompanionDevice
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.model.WearableVendor
import javax.inject.Inject

/**
 * Huawei watches through the official WearEngine SDK (the supported route for third parties;
 * see HUAWEI_DEVICE_PROTOCOL.md §8–9). Preferred over the raw BLE driver whenever Huawei Health
 * is installed, because direct BLE cannot authenticate without Huawei's secrets.
 *
 * Release prerequisites (outside the code): register the app on Huawei Developer, apply for the
 * Wear Engine service and the DEVICE_MANAGER + SENSOR permissions for this package name and
 * signing certificate. Until approved, every call fails with a WearEngine error code.
 *
 * Scope: device list, live heart rate, battery. WearEngine has no history API; Huawei history
 * comes from Health Connect, which Huawei Health writes to.
 */
internal class HuaweiWearEngineDriver @Inject constructor(
    private val gateway: WearEngineGateway,
) : CompanionAppDriver {

    override val vendor = WearableVendor.HUAWEI

    override suspend fun availability(): CompanionAvailability =
        if (gateway.isHealthAppInstalled()) CompanionAvailability.Available else CompanionAvailability.AppMissing(HEALTH_PACKAGE)

    override suspend fun bondedDevices(): List<CompanionDevice> {
        ensurePermissions(setOf(WearPermission.DEVICE_MANAGER))
        return call { gateway.bondedDevices() }.map { CompanionDevice(it.id, it.name, it.model, it.isConnected) }
    }

    override suspend fun openSession(deviceId: String): WearableSession {
        ensurePermissions(SESSION_PERMISSIONS)
        val device = call { gateway.bondedDevices() }.firstOrNull { it.id == deviceId }
            ?: throw WearableProtocolException("This watch is no longer bound in Huawei Health")
        if (!device.isConnected) throw WearableProtocolException("${device.name} is not connected to Huawei Health. Open Huawei Health and reconnect it.")
        return HuaweiWearEngineSession(gateway, device)
    }

    private suspend fun ensurePermissions(permissions: Set<WearPermission>) {
        if (call { gateway.hasPermissions(permissions) }) return
        val granted = gateway.requestPermissions(permissions)
        val missing = permissions - granted
        if (missing.isNotEmpty()) throw AuthenticationException("Huawei Health permission not granted: ${missing.joinToString()}")
    }

    private companion object {
        const val HEALTH_PACKAGE = "com.huawei.health"
        val SESSION_PERMISSIONS = setOf(WearPermission.DEVICE_MANAGER, WearPermission.SENSOR)
    }
}

/** Converts SDK failures into the driver contract's exception type. */
internal suspend fun <T> call(block: suspend () -> T): T = try {
    block()
} catch (e: WearEngineCallException) {
    throw WearableProtocolException(
        e.message + ". If this persists, check that the app is approved for Huawei Wear Engine.",
        e,
    )
}
