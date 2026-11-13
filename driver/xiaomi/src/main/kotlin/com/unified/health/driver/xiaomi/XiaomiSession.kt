package com.unified.health.driver.xiaomi

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.driver.xiaomi.auth.XiaomiAuthResult
import com.unified.health.driver.xiaomi.device.XiaomiDeviceCommands
import com.unified.health.driver.xiaomi.sync.XiaomiFitnessSync
import com.unified.health.driver.xiaomi.transport.XiaomiLink

/**
 * An authenticated MiWear connection (protocol §9 [V]). [readDeviceInfo] reads watch info +
 * battery (`e = 2`); [sync] delegates to [fitnessSync] (protocol §9.3-§9.5, owned by the fitness
 * agent, M3); [close] releases [link]. [capabilities] come from the handshake's [XiaomiAuthResult],
 * falling back to [DeviceCapability.HISTORY_SYNC] -- every MiWear V2 watch supports fitness
 * history, and the vendor's own `deviceCapability`/`deviceCapabilityV2` bits have no documented
 * mandatory meaning (see the TODO on [XiaomiAuthResult]).
 *
 * Deliberately does **not** keep a reference to `XiaomiAuthenticator`/`ZoneId`/`Clock`: nothing in
 * [WearableSession]'s contract needs them once the handshake (driven by [XiaomiDriver.openSession])
 * has already produced [authResult] and synced the clock: a stored-but-unused collaborator would
 * be the kind of dead weight the next reviewer has to ask "why is this here?" about.
 */
internal class XiaomiSession(
    private val link: XiaomiLink,
    private val fitnessSync: XiaomiFitnessSync,
    authResult: XiaomiAuthResult,
) : WearableSession {

    override val capabilities: Set<DeviceCapability> =
        authResult.capabilities.ifEmpty { setOf(DeviceCapability.HISTORY_SYNC) }

    override suspend fun readDeviceInfo(): DeviceInfo {
        val info = XiaomiDeviceCommands.readWatchInfo(link)
        val battery = XiaomiDeviceCommands.readBattery(link)
        return DeviceInfo(
            model = info.model,
            firmwareVersion = info.firmwareVersion,
            serialNumber = info.serialNumber,
            batteryPercent = battery.percent,
        )
    }

    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int =
        fitnessSync.sync(link, sink, progress, request)

    override suspend fun close() {
        link.close()
    }
}
