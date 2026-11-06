package com.unified.health.driver.huawei

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.huawei.auth.HuaweiAuthMode
import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import com.unified.health.driver.huawei.auth.selectFor
import com.unified.health.driver.huawei.codec.CipherMode
import com.unified.health.driver.huawei.codec.FitnessCommands
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.IvGenerator
import com.unified.health.driver.huawei.codec.LinkNegotiationException
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.PayloadCipher
import com.unified.health.driver.huawei.transport.FrameSettings
import com.unified.health.driver.huawei.transport.HuaweiTransport
import com.unified.health.driver.huawei.transport.TransportTimeouts
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import java.time.Clock
import java.time.Instant

/**
 * An authenticated Huawei link. Built by [open], which runs the handshake of
 * HUAWEI_DEVICE_PROTOCOL.md §5.1 as far as this driver can: 0x0101 link negotiation →
 * authenticator selection → authentication → [DeviceConfigurator] (0x0107, 0x0105, 0x0132,
 * 0x0102, 0x0103). Watch-initiated messages are routed to [router] for the whole session.
 */
internal class HuaweiSession private constructor(
    private val gatt: GattClient,
    private val transport: HuaweiTransport,
    private val scope: CoroutineScope,
    private val clock: Clock,
    private val router: WatchInitiatedRouter,
    /** What the handshake learned; exposed for diagnostics and tests. */
    val configuration: DeviceConfiguration,
) : WearableSession {

    /**
     * No [DeviceCapability.HISTORY_SYNC] or [DeviceCapability.LIVE_HEART_RATE]: [sync] cannot
     * decode a single typed [HealthRecord] yet (see below) and the document gives no evidence that
     * Huawei watches also expose the Bluetooth SIG Heart Rate service (§3.1 only lists
     * FE86/0x181C/0x1805). [DeviceCapability.BATTERY_LEVEL] is real: 0x0107 type 12 (§11.1) or the
     * standard GATT Battery service. The 0x0107 capability bitmap (type 22) is NOT mapped onto
     * these flags: its bit meanings are undocumented.
     */
    override val capabilities: Set<DeviceCapability> = buildSet {
        val gattBattery = gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null
        if (gattBattery || configuration.version?.batteryPercent != null) add(DeviceCapability.BATTERY_LEVEL)
    }

    /**
     * Fresh 0x0107 (model type 20/3, firmware type 1, serial type 9, battery type 12, §11.1) with
     * standard GATT Device Information / Battery filling whatever the watch does not report.
     */
    override suspend fun readDeviceInfo(): DeviceInfo {
        val version = DeviceConfigurator.readVersion(transport)
        val gattInfo = StandardGattReader.readDeviceInfo(gatt)
        return DeviceInfo(
            model = version?.productModel ?: gattInfo.model,
            firmwareVersion = version?.firmwareVersion ?: gattInfo.firmwareVersion,
            serialNumber = version?.serialNumber ?: gattInfo.serialNumber,
            batteryPercent = version?.batteryPercent ?: gattInfo.batteryPercent,
        )
    }

    /**
     * Best-effort raw sweep of service 7 (Fitness): every REQUEST layout §7.2 documents ([V]) is
     * sent once for [request]'s window — today's totals (cmd 3) and the frame counts behind steps/
     * distance/calories (cmd 4 "health frames"), continuous HR/SpO2 (cmd 10 "sample frames") and
     * sleep/status (cmd 12 "status frames"). Each accepted reply is kept as an opaque
     * [HealthRecord.RawPayload] (the sink persists it for later re-decoding); a reply the watch
     * rejects (its own 0x7F error TLV) is logged and skipped so one unsupported command does not
     * abort the rest. Only a transport failure (timeout, link loss) aborts the sweep.
     *
     * TODO(huawei-protocol): every RESPONSE body layout in service 7 is undocumented (§7.2 "chưa
     * giải mã ở tầng nội dung", §10 "[?] response payload chi tiết") — the count TLV of cmd
     * 4/10/12 and the frame bodies of cmd 5/8/11/13 are not decoded here, so this never emits a
     * typed Steps/HeartRate/RestingHeartRate/HeartRateVariability/Sleep/SpO2/Stress/Workout record
     * and always returns 0. Once an HCI snoop log or a real watch resolves those layouts: parse the
     * count reply, loop `getXFrame(index)` for 0..count (cmd 5/8/11/13), decode each frame and
     * deliver it through [sink] in batches, reporting partial [progress] as you go.
     */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val startSec = request.effectiveSince().epochSecond
        val endSec = request.now.epochSecond
        val probes = listOf(
            RAW_TODAY_TOTAL to FitnessCommands.todayTotal(),
            RAW_HEALTH_FRAME_COUNT to FitnessCommands.healthFrameCount(startSec, endSec),
            RAW_SAMPLE_FRAME_COUNT to FitnessCommands.sampleFrameCount(startSec, endSec),
            RAW_STATUS_FRAME_COUNT to FitnessCommands.statusFrameCount(startSec, endSec),
        )
        probes.forEachIndexed { index, (kind, command) ->
            probe(kind, command, sink)
            progress.report((index + 1f) / probes.size)
        }
        // Watch-initiated messages received since the last sync (also undecoded, see the router).
        router.drain().takeIf { it.isNotEmpty() }?.let { sink.onRecords(it) }
        return 0
    }

    /** Sends one probe command; stores a successful reply, logs and skips a rejected one. */
    private suspend fun probe(kind: String, command: HuaweiCommand, sink: HealthRecordSink) {
        val response = transport.request(command, encrypted = true)
        val error = response.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) {
            Log.w(TAG, "Huawei watch rejected $kind (${response.tag}) with error $error")
            return
        }
        sink.onRecords(listOf(HealthRecord.RawPayload(WearableVendor.HUAWEI, kind, Instant.now(clock), response.encode())))
    }

    override suspend fun close() {
        transport.watchInitiatedHandler = null
        scope.cancel()
    }

    companion object {
        private const val TAG = "HuaweiSession"
        const val RAW_TODAY_TOTAL = "huawei_fitness_today_total"
        const val RAW_HEALTH_FRAME_COUNT = "huawei_fitness_health_frame_count"
        const val RAW_SAMPLE_FRAME_COUNT = "huawei_fitness_sample_frame_count"
        const val RAW_STATUS_FRAME_COUNT = "huawei_fitness_status_frame_count"

        /**
         * Runs the handshake. On any failure the session scope is cancelled and the exception
         * rethrown; the caller closes [gatt].
         */
        suspend fun open(
            gatt: GattClient,
            context: SessionContext,
            authenticators: Set<HuaweiAuthenticator>,
            dispatcher: CoroutineDispatcher,
            clock: Clock,
            timeouts: TransportTimeouts,
        ): HuaweiSession {
            val write = gatt.findCharacteristic(HuaweiUuids.WRITE, HuaweiUuids.SERVICE)
            val notify = gatt.findCharacteristic(HuaweiUuids.NOTIFY, HuaweiUuids.SERVICE)
            if (write == null || notify == null) throw UnsupportedDeviceException("Device does not expose the Huawei FE86 service (FE01/FE02)")

            val scope = CoroutineScope(SupervisorJob() + dispatcher)
            try {
                val router = WatchInitiatedRouter(clock)
                val transport = HuaweiTransport(gatt, write, notify, scope, timeouts)
                transport.watchInitiatedHandler = router // before start(): nothing unsolicited is dropped
                transport.start()
                val link = negotiateLink(transport)
                transport.frameSettings = FrameSettings(link)

                val authenticator = authenticators.selectFor(link) ?: throw unsupportedAuth(link)
                Log.i(TAG, "Authenticating with ${authenticator.mode.label}")
                val keys = authenticator.authenticate(transport, link, context)
                val cipherMode = keys.cipherMode
                    ?: if (authenticator.mode == HuaweiAuthMode.HICHAIN3) CipherMode.AES_GCM else link.cipherMode
                transport.cipher = PayloadCipher(keys.workKey, cipherMode, IvGenerator(keys.ivCounterSeed))

                val configuration = DeviceConfigurator.configure(transport, clock)
                return HuaweiSession(gatt, transport, scope, clock, router, configuration)
            } catch (e: Throwable) { // includes CancellationException, which is rethrown unchanged
                scope.cancel()
                throw e
            }
        }

        private suspend fun negotiateLink(transport: HuaweiTransport): LinkParameters {
            val response = transport.request(LinkParameters.request())
            val link = try {
                LinkParameters.parse(response)
            } catch (e: LinkNegotiationException) {
                throw WearableProtocolException("Huawei link negotiation failed: ${e.message}")
            }
            Log.i(TAG, "Link negotiated: $link")
            return link
        }

        private fun unsupportedAuth(link: LinkParameters): UnsupportedDeviceException {
            val modes = HuaweiAuthMode.candidatesFor(link.authType).joinToString(" / ") { it.label }
            val keyHint = if (link.keyMissing) " The watch also reports lost bond keys: unpair it in Android Bluetooth settings." else ""
            return UnsupportedDeviceException(
                "Huawei $modes authentication is not supported yet (watch auth type ${link.authType}, " +
                    "auth version 0x%04x). Sync this watch through Huawei Health and Health Connect instead.".format(link.authVersion) +
                    keyHint,
            )
        }
    }
}
