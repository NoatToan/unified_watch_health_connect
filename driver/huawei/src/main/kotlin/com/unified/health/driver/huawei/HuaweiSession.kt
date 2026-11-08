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
import com.unified.health.driver.huawei.codec.DeviceConfigCommands
import com.unified.health.driver.huawei.codec.FitnessCommands
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.IvGenerator
import com.unified.health.driver.huawei.codec.LinkNegotiationException
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.LiveHeartRateCommands
import com.unified.health.driver.huawei.codec.LiveHeartRateParser
import com.unified.health.driver.huawei.codec.PayloadCipher
import com.unified.health.driver.huawei.transport.FrameSettings
import com.unified.health.driver.huawei.transport.HuaweiTransport
import com.unified.health.driver.huawei.transport.TransportTimeouts
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Clock
import java.time.Instant

/**
 * A Huawei link. Built by [open], which runs the handshake of HUAWEI_CONNECTION_ANALYSIS.md
 * §1.3-1.5 as far as this driver can: 0x0101 link negotiation → (only when the watch reports a
 * non-zero authenticVersion) authenticator selection and authentication → [DeviceConfigurator]
 * (0x0107, 0x0105, 0x0102, 0x0103, optional 0x0137/0x013C/0x0132/0x0112; 0x0116 is BR-only).
 *
 * A watch that reports `authenticVersion == 0` takes the vendor's "no app auth" branch
 * ([V] `cke.java:60-65`): the driver skips authentication, sends the handshake in clear text and
 * works with the full session. A non-zero version without a matching [HuaweiAuthenticator]
 * (production ships none) fails fast with a precise [UnsupportedDeviceException] — this driver
 * deliberately has no CAK/HiChain implementation.
 *
 * Watch-initiated messages are routed to [router] for the whole session; service 23 command 3
 * notifications additionally feed [liveHeartRate].
 */
internal class HuaweiSession private constructor(
    private val gatt: GattClient,
    private val transport: HuaweiTransport,
    private val scope: CoroutineScope,
    private val clock: Clock,
    private val router: WatchInitiatedRouter,
    /** What the handshake learned; exposed for diagnostics and tests. */
    val configuration: DeviceConfiguration,
    /** True when an authenticator installed a work key; false on the authVersion == 0 path. */
    private val encrypted: Boolean,
) : WearableSession {

    /**
     * Battery level (service 1 cmd 8 when 0x0103 announces it, or the standard GATT Battery
     * service) and live heart rate (service 23 cmd 18 report + cmd 3 notifications, when 0x0103
     * announces command 23/18).
     *
     * No [DeviceCapability.HISTORY_SYNC]: [sync] cannot decode a single typed [HealthRecord] yet
     * (see below).
     */
    override val capabilities: Set<DeviceCapability> = buildSet {
        val gattBattery = gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null
        val protocolBattery = configuration.commandSupport
            ?.supports(DeviceConfigCommands.SERVICE_ID, DeviceConfigCommands.GET_BATTERY) == true
        if (gattBattery || protocolBattery) add(DeviceCapability.BATTERY_LEVEL)
        val liveHeartRate = configuration.commandSupport
            ?.supports(LiveHeartRateCommands.SERVICE_ID, LiveHeartRateCommands.COMMAND_ID) == true
        if (liveHeartRate) add(DeviceCapability.LIVE_HEART_RATE)
    }

    /**
     * Fresh 0x0107 (model type 20/3, firmware type 1, serial type 9, device name type 12, BT mode
     * type 22) with the service 1 cmd 8 battery query and standard GATT Device Information /
     * Battery filling whatever the watch does not report.
     */
    override suspend fun readDeviceInfo(): DeviceInfo {
        val version = DeviceConfigurator.readVersion(transport, encrypted)
        val protocolBattery = if (capabilities.contains(DeviceCapability.BATTERY_LEVEL)) DeviceConfigurator.readBattery(transport, encrypted) else null
        val gattInfo = StandardGattReader.readDeviceInfo(gatt)
        return DeviceInfo(
            model = version?.productModel ?: gattInfo.model,
            firmwareVersion = version?.firmwareVersion ?: gattInfo.firmwareVersion,
            serialNumber = version?.serialNumber ?: gattInfo.serialNumber,
            batteryPercent = protocolBattery?.levelPercent ?: gattInfo.batteryPercent,
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

    /**
     * Live heart rate from the vendor's on-demand report: service 23 command 18 opens it (operator
     * 1) and command 3 notifications carry the samples; cancelling the collection sends the close
     * (operator 0). Only available when 0x0103 announced command 23/18.
     *
     * KDoc with the exact evidence for the request/notification layouts is in
     * [com.unified.health.driver.huawei.codec.LiveHeartRateCommands] /
     * [com.unified.health.driver.huawei.codec.LiveHeartRateParser]. The subscription is started
     * before the open request so a sample sent with the open acknowledgment is not lost; the close
     * is best-effort and bounded so it cannot delay teardown indefinitely.
     */
    override val liveHeartRate: Flow<HealthRecord.HeartRate> =
        if (capabilities.contains(DeviceCapability.LIVE_HEART_RATE)) liveHeartRateFlow() else emptyFlow()

    private fun liveHeartRateFlow(): Flow<HealthRecord.HeartRate> = channelFlow {
        val forward = launch(start = CoroutineStart.UNDISPATCHED) {
            router.events.collect { command ->
                LiveHeartRateParser.parse(command, Instant.now(clock))?.let { send(it) }
            }
        }
        var opened = false
        try {
            val reply = transport.request(LiveHeartRateCommands.report(open = true), encrypted)
            val error = reply.errorCode()
            if (error != null && error != HuaweiCommand.SUCCESS_CODE) {
                Log.w(TAG, "Watch rejected the live-HR report (error $error)")
                return@channelFlow
            }
            opened = true
            awaitCancellation()
        } catch (e: CancellationException) {
            throw e
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "Live-HR report failed: ${e.message}")
        } finally {
            forward.cancel()
            if (opened) closeHeartRateReport()
        }
    }

    private suspend fun closeHeartRateReport() {
        withContext(NonCancellable) {
            runCatching {
                withTimeoutOrNull(CLOSE_REPORT_TIMEOUT_MS) {
                    transport.request(LiveHeartRateCommands.report(open = false), encrypted)
                }
            }.onFailure { Log.w(TAG, "Live-HR report close failed: ${it.message}") }
        }
    }

    /** Sends one probe command; stores a successful reply, logs and skips a rejected one. */
    private suspend fun probe(kind: String, command: HuaweiCommand, sink: HealthRecordSink) {
        val response = transport.request(command, encrypted)
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

        /** Vendor branch "Device do not need authentic after check device available" [V] `cke.java:60-65`. */
        private const val NO_APP_AUTH_VERSION = 0

        /** Bound on the best-effort close report sent when live-HR collection ends. */
        private const val CLOSE_REPORT_TIMEOUT_MS = 2_000L

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
                Log.i(
                    TAG,
                    "Auth capability: authVersion=%d (0x%04x), authType=%d, TLV17=%s, bondStatus=%s, encryption=%d".format(
                        link.authVersion, link.authVersion, link.authType, link.authKeyInfoFlag, link.bondStatus, link.encryptionMethod,
                    ),
                )

                // The vendor still generates randB/token before checking authVersion, but only this
                // branch matters: version 0 means "device does not need authentic" [V] cke.java:60-65.
                val encrypted = if (link.authVersion == NO_APP_AUTH_VERSION) {
                    Log.i(TAG, "authVersion 0: watch requires no app authentication; continuing in clear text")
                    false
                } else {
                    val authenticator = authenticators.selectFor(link) ?: throw unsupportedAuth(link)
                    Log.i(TAG, "Authenticating with ${authenticator.mode.label}")
                    val keys = authenticator.authenticate(transport, link, context)
                    val cipherMode = keys.cipherMode
                        ?: if (authenticator.mode == HuaweiAuthMode.HICHAIN3) CipherMode.AES_GCM else link.cipherMode
                    transport.cipher = PayloadCipher(keys.workKey, cipherMode, IvGenerator(keys.ivCounterSeed))
                    true
                }

                val configuration = DeviceConfigurator.configure(transport, clock, link, encrypted)
                return HuaweiSession(gatt, transport, scope, clock, router, configuration, encrypted)
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
            val auth = "auth type ${link.authType}, auth version 0x%04x".format(link.authVersion)
            val keyHint = if (link.keyMissing) " The watch also reports lost bond keys: unpair it in Android Bluetooth settings." else ""
            return UnsupportedDeviceException(
                "Direct BLE is not available for this watch because it requires Huawei's app-level authentication " +
                    "($modes; $auth). This driver does not implement CAK/HiChain authentication; " +
                    "sync this watch through Huawei Health and Health Connect instead." + keyHint,
            )
        }
    }
}
