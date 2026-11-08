package com.unified.health.driver.zepp

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.zepp.codec.CommandResponse
import com.unified.health.driver.zepp.codec.GdspCodec
import com.unified.health.driver.zepp.codec.GdspDataType
import com.unified.health.driver.zepp.codec.GdspHeader
import com.unified.health.driver.zepp.codec.GdspRecordParsers
import com.unified.health.driver.zepp.codec.LegacyBatteryCodec
import com.unified.health.driver.zepp.codec.OpenAppCodec
import com.unified.health.driver.zepp.codec.ZeppOsBatteryCodec
import com.unified.health.driver.zepp.transport.ChannelTransport
import com.unified.health.driver.zepp.transport.GdspClient
import com.unified.health.driver.zepp.transport.GdspTransientException
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Duration
import java.time.Instant
import java.time.ZoneId

/**
 * An authenticated Zepp / Amazfit connection. History is pulled with GDSP (§6.1) for activity
 * (steps + heart rate per minute), SpO2 points and all-day stress.
 *
 * @param channel the authenticated channel (Zepp OS), kept alive so its reader keeps ACKing the
 *  watch; null for legacy watches.
 * @param scope session-owned scope (channel reader); cancelled in [close].
 */
internal class ZeppSession(
    private val gatt: GattClient,
    private val channel: ChannelTransport?,
    private val scope: CoroutineScope,
    private val zone: ZoneId,
) : WearableSession {

    private val gdsp: GdspClient? = run {
        val control = gatt.findCharacteristic(ZeppUuids.GDSP_CONTROL, ZeppUuids.SERVICE_MILI) ?: gatt.findCharacteristic(ZeppUuids.GDSP_CONTROL)
        val data = gatt.findCharacteristic(ZeppUuids.GDSP_DATA, ZeppUuids.SERVICE_MILI) ?: gatt.findCharacteristic(ZeppUuids.GDSP_DATA)
        if (control != null && data != null) GdspClient(gatt, control, data) else null
    }

    /**
     * Like the vendor (`HMHeartRateController.java:142-151`), a watch listing OpenAppModule (29)
     * is switched over the channel even when it also exposes `2A39`; otherwise `2A39` is used.
     */
    private val live: Flow<HealthRecord.HeartRate>? = run {
        val measurement = gatt.findCharacteristic(StandardUuids.HEART_RATE_MEASUREMENT, StandardUuids.HEART_RATE_SERVICE)
            ?: return@run null
        val control = gatt.findCharacteristic(ZeppUuids.HR_CONTROL, StandardUuids.HEART_RATE_SERVICE)
        when {
            channel != null && channel.supportsModule(OpenAppCodec.MODULE) -> ZeppOsLiveHeartRate(gatt, measurement, channel).flow
            control != null -> ZeppLiveHeartRate(gatt, measurement, control).flow
            else -> null
        }
    }

    override val liveHeartRate: Flow<HealthRecord.HeartRate> = live ?: emptyFlow()

    /** Legacy Huami battery characteristic 0x0006 in FEE0 (`MiLiProProfile.getBatteryInfo`, §3.1 [V]). */
    private val legacyBattery: GattCharacteristic? = gatt.findCharacteristic(ZeppUuids.BATTERY, ZeppUuids.SERVICE_MILI)
        ?: gatt.findCharacteristic(ZeppUuids.BATTERY)

    private val hasStandardBattery: Boolean =
        gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null

    private val hasChannelBattery: Boolean = channel?.supportsModule(ZeppOsBatteryCodec.MODULE) == true

    /**
     * Latest level pushed by module 0x29 command 0x04 (`BatteryCommand` notify). The watch sends it
     * unsolicited after the one-shot query and when the level changes, so it is preferred over a
     * new query; the on-demand query below remains the fallback.
     */
    private val pushedBattery = MutableStateFlow<Int?>(null)

    private val batteryTap = channel?.takeIf { hasChannelBattery }?.let { ch ->
        // Register synchronously so a push arriving right after openSession is not refused as an
        // unknown module; only the consumption loop is asynchronous.
        val tap = ch.tap(ZeppOsBatteryCodec.MODULE)
        scope.launch {
            for (message in tap) {
                val response = CommandResponse.parse(message) ?: continue
                if (response.command != ZeppOsBatteryCodec.CMD_BATTERY || !response.isSuccess) continue
                LegacyBatteryCodec.parseLevel(response.data)?.let { pushedBattery.value = it }
            }
        }
    }

    override val capabilities: Set<DeviceCapability> = buildSet {
        if (live != null) add(DeviceCapability.LIVE_HEART_RATE)
        if (gdsp != null) add(DeviceCapability.HISTORY_SYNC)
        if (hasChannelBattery || legacyBattery != null || hasStandardBattery) add(DeviceCapability.BATTERY_LEVEL)
    }

    /**
     * Battery sources in vendor order (`HMBaseBleDevice`/`LullabyDevice.java:112` [V]): channel
     * module 0x29 on Zepp OS, the bit-flagged FEE0 characteristic 0x0006 on legacy watches, and the
     * SIG 0x180F service as the last fallback.
     */
    override suspend fun readDeviceInfo(): DeviceInfo {
        val base = StandardGattReader.readDeviceInfo(gatt)
        val info = if (base.model != null) base else base.copy(model = readPnpModel())
        return info.copy(batteryPercent = readBattery() ?: info.batteryPercent)
    }

    private suspend fun readBattery(): Int? =
        pushedBattery.value ?: readChannelBattery() ?: readLegacyBattery()

    /** Module 0x29: query version 0x01 (only version 1 is used, `LullabyDevice.java:112`), then battery 0x03. */
    private suspend fun readChannelBattery(): Int? {
        val channel = channel ?: return null
        if (!hasChannelBattery) return null
        return try {
            val versionReply = channel.request(
                ZeppOsBatteryCodec.MODULE, ZeppOsBatteryCodec.queryVersion(), BATTERY_TIMEOUT_MS,
            ) { CommandResponse.parse(it)?.command == ZeppOsBatteryCodec.CMD_VERSION_RESPONSE }
            val version = CommandResponse.parse(versionReply)
                ?.takeIf { it.isSuccess }
                ?.data?.firstOrNull()?.toInt()?.and(0xFF)
            if (version != ZeppOsBatteryCodec.SUPPORTED_VERSION) return null
            val reply = channel.request(
                ZeppOsBatteryCodec.MODULE, ZeppOsBatteryCodec.queryBattery(), BATTERY_TIMEOUT_MS,
            ) { CommandResponse.parse(it)?.command == ZeppOsBatteryCodec.CMD_BATTERY }
            val response = CommandResponse.parse(reply) ?: return null
            if (!response.isSuccess) null else LegacyBatteryCodec.parseLevel(response.data)
        } catch (e: CancellationException) {
            throw e
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "Battery module 0x29 query failed: ${e.message}")
            null
        } catch (e: GattException) {
            Log.w(TAG, "Battery module 0x29 query failed: ${e.message}")
            null
        }
    }

    private suspend fun readLegacyBattery(): Int? {
        val characteristic = legacyBattery ?: return null
        val data = try {
            gatt.read(characteristic)
        } catch (e: CancellationException) {
            throw e
        } catch (e: GattException) {
            return null
        }
        return LegacyBatteryCodec.parseLevel(data)
    }

    /**
     * PnP ID (`2A50`, standard DIS characteristic, brief TODO-3 [V]): `[vendorSource u8, vendorId
     * u16 LE, productId u16 LE, productVersion u16 LE]` (Bluetooth Assigned Numbers §6.5). No
     * vendor→name table exists for Huami product ids, so this is only a fallback label (e.g. when
     * the watch omits the plain-text model number, 0x2A24) — not a human-readable model name.
     */
    private suspend fun readPnpModel(): String? {
        val characteristic = gatt.findCharacteristic(StandardUuids.PNP_ID, StandardUuids.DEVICE_INFORMATION_SERVICE) ?: return null
        val data = try {
            gatt.read(characteristic)
        } catch (e: CancellationException) {
            throw e
        } catch (e: GattException) {
            return null
        }
        if (data.size != PNP_ID_SIZE) return null
        val reader = ByteReader(data)
        reader.skip(1) // vendorSource (1 = Bluetooth SIG, 2 = USB-IF): not needed for a display label.
        reader.skip(2) // vendorId (Huami = 0x0157, already known from recognition).
        val productId = reader.u16le()
        val productVersion = reader.u16le()
        return "Zepp %04X.%04X".format(productId, productVersion)
    }

    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val gdsp = gdsp ?: throw UnsupportedDeviceException("Watch does not expose the GDSP history characteristics")
        gdsp.open()
        val since = request.effectiveSince()
        val now = request.now
        var delivered = 0
        SYNC_TYPES.forEachIndexed { typeIndex, type ->
            delivered += syncType(gdsp, type, since, now, sink) { fraction ->
                progress.report(((typeIndex + fraction) / SYNC_TYPES.size).coerceIn(0f, 1f))
            }
        }
        progress.report(1f)
        return delivered
    }

    /** Pulls [type] block by block from [since], looping on the header count (§6.1). */
    private suspend fun syncType(
        gdsp: GdspClient,
        type: GdspDataType,
        since: Instant,
        now: Instant,
        sink: HealthRecordSink,
        report: (Float) -> Unit,
    ): Int {
        var cursor = since
        var delivered = 0
        var retries = MAX_SYNC_RETRIES
        while (true) {
            var completed = false
            try {
                var blocks = 0
                while (blocks++ < MAX_BLOCKS_PER_TYPE) {
                    val header = gdsp.requestHeader(type, cursor, zone) ?: break
                    if (header.count <= 0) break
                    val payload = gdsp.fetch()
                    val records = decode(type, payload, header)
                    if (records.isNotEmpty()) sink.onRecords(records)
                    delivered += records.count { it !is HealthRecord.RawPayload }
                    val next = nextCursor(type, header, records) ?: break
                    if (!next.isAfter(cursor)) break
                    cursor = next
                    report(fractionOf(since, cursor, now))
                }
                completed = true
            } catch (e: GdspTransientException) {
                // The vendor retries the whole sync unit from the last good cursor up to 3 times
                // (`CommonGdspSyncTask.java:102-157`, `BaseGdspSyncParam.retryCount = 3`). Protocol,
                // decoding and auth failures are not [GdspTransientException] and propagate at once.
                if (retries-- <= 0) throw e
                Log.w(TAG, "GDSP $type failed transiently (${e.message}); retrying from $cursor ($retries retries left)")
                continue
            } finally {
                withContext(NonCancellable) { finishTransfer(gdsp, type, completed) }
            }
            break
        }
        report(1f)
        return delivered
    }

    /**
     * Ends the GDSP exchange like `GDSPSyncTask` does once per data type: `[0x03, 0x01]` on
     * success (see [GdspCodec.STOP_CODE_CONFIRM_DELIVERED] for the "data delivered" risk) and a
     * plain `[0x03]` otherwise. Best effort: a failure here must not hide the original error.
     */
    private suspend fun finishTransfer(gdsp: GdspClient, type: GdspDataType, success: Boolean) {
        try {
            val confirmed = gdsp.stop(if (success) GdspCodec.STOP_CODE_CONFIRM_DELIVERED else null)
            if (!confirmed) Log.d(TAG, "GDSP stop for $type not confirmed")
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            Log.w(TAG, "GDSP stop for $type failed: ${e.message}")
        }
    }

    private fun decode(type: GdspDataType, payload: ByteArray, header: GdspHeader): List<HealthRecord> = try {
        when (type) {
            GdspDataType.ACTIVITY -> GdspRecordParsers.parseActivity(payload, header.start, header.count)
            GdspDataType.STRESS_ALL_DAY -> GdspRecordParsers.parseStressAllDay(payload, header.start)
            GdspDataType.STRESS_SINGLE -> GdspRecordParsers.parseStressSingle(payload)
            // TODO(zepp-protocol): NEEDS-REAL-WATCH — layout is inferred by analogy, see parser KDoc.
            GdspDataType.RESTING_HEART_RATE -> GdspRecordParsers.parseRestingHeartRate(payload, zone)
            GdspDataType.SPO2_POINT -> {
                val result = GdspRecordParsers.parseSpo2(payload)
                val version = result.unsupportedVersion
                if (version == null) {
                    result.records
                } else {
                    // Only a version outside {1, 2} reaches here; its layout is genuinely undocumented.
                    Log.i(TAG, "Keeping SpO2 payload version $version as raw data")
                    listOf(HealthRecord.RawPayload(WearableVendor.ZEPP, "gdsp_spo2_v$version", header.start, payload))
                }
            }
        }
    } catch (e: MalformedPayloadException) {
        throw WearableProtocolException("Could not decode GDSP $type data: ${e.message}", e)
    }

    /**
     * Where the next header request starts (vendor loop behaviour, [V]):
     * activity = header + count minutes (`HMProSyncDataTask`), stress-all-day = header + count
     * minutes + 1 s (`HMSyncPressureTask`); event types (SpO2, stress-single, resting HR) = last
     * decoded record + a margin (`HMSyncSpo2DataTask`), since their header `count` is a record count,
     * not a duration.
     */
    private fun nextCursor(type: GdspDataType, header: GdspHeader, records: List<HealthRecord>): Instant? = when (type) {
        GdspDataType.ACTIVITY -> header.start.plus(Duration.ofMinutes(header.count))
        GdspDataType.STRESS_ALL_DAY -> header.start.plus(Duration.ofMinutes(header.count)).plusSeconds(1)
        GdspDataType.SPO2_POINT -> records.filterIsInstance<HealthRecord.SpO2>().maxOfOrNull { it.time }?.plusSeconds(EVENT_NEXT_OFFSET_SECONDS)
        GdspDataType.STRESS_SINGLE -> records.filterIsInstance<HealthRecord.Stress>().maxOfOrNull { it.time }?.plusSeconds(EVENT_NEXT_OFFSET_SECONDS)
        // RestingHeartRate has no time field (device-local-day granularity): advance past the latest
        // day seen so the loop terminates instead of re-requesting the same day forever.
        GdspDataType.RESTING_HEART_RATE -> records.filterIsInstance<HealthRecord.RestingHeartRate>()
            .maxOfOrNull { it.date }?.plusDays(1)?.atStartOfDay(zone)?.toInstant()
    }

    private fun fractionOf(since: Instant, cursor: Instant, now: Instant): Float {
        val total = Duration.between(since, now).toMillis().toFloat()
        if (total <= 0f) return 1f
        return (Duration.between(since, cursor).toMillis() / total).coerceIn(0f, 1f)
    }

    override suspend fun close() {
        scope.cancel()
    }

    private companion object {
        const val TAG = "ZeppSession"

        const val PNP_ID_SIZE = 7

        val SYNC_TYPES = listOf(
            GdspDataType.ACTIVITY,
            GdspDataType.SPO2_POINT,
            GdspDataType.STRESS_ALL_DAY,
            GdspDataType.STRESS_SINGLE,
            GdspDataType.RESTING_HEART_RATE,
        )

        /** Guards against a watch that keeps answering with data for the same window. */
        const val MAX_BLOCKS_PER_TYPE = 512

        /** Vendor default `retryCount`: three retries after the first transient failure. */
        const val MAX_SYNC_RETRIES = 3

        /** Battery queries are best effort; keep the failure short instead of the module default 15 s. */
        const val BATTERY_TIMEOUT_MS = 5_000L

        const val EVENT_NEXT_OFFSET_SECONDS = 30L
    }
}
