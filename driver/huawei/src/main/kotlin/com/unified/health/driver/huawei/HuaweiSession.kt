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
 * authenticator selection → authentication → 0x0105 time sync.
 */
internal class HuaweiSession private constructor(
    private val gatt: GattClient,
    private val transport: HuaweiTransport,
    private val scope: CoroutineScope,
    private val clock: Clock,
) : WearableSession {

    override val capabilities: Set<DeviceCapability> = buildSet {
        add(DeviceCapability.HISTORY_SYNC)
        if (gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null) add(DeviceCapability.BATTERY_LEVEL)
    }

    /**
     * Standard GATT Device Information / Battery only.
     * TODO(huawei-protocol): 0x0107 GetDeviceVersion carries model/firmware (§5.1 step 4) but its
     * request and response layouts are not in the document.
     */
    override suspend fun readDeviceInfo(): DeviceInfo = StandardGattReader.readDeviceInfo(gatt)

    /**
     * Fetches today's totals (service 7 cmd 3) and keeps the decrypted response as a
     * [HealthRecord.RawPayload] because its TLV layout is unknown; no typed records yet.
     *
     * TODO(huawei-protocol): history needs the response layouts of the count/frame commands in
     * [FitnessCommands] (cmd 4→5/8, 10→11, 12→13, §7.2 "count, then fetch by index"). Once known,
     * loop over [SyncRequest.effectiveSince]..now and emit Steps/HeartRate/SpO2/Sleep in batches.
     */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val response = transport.request(FitnessCommands.todayTotal(), encrypted = true)
        requireSuccess(response)
        sink.onRecords(listOf(HealthRecord.RawPayload(WearableVendor.HUAWEI, RAW_TODAY_TOTAL, Instant.now(clock), response.encode())))
        progress.report(1f)
        return 0
    }

    override suspend fun close() {
        scope.cancel()
    }

    companion object {
        private const val TAG = "HuaweiSession"
        const val RAW_TODAY_TOTAL = "huawei_fitness_today_total"

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
                val transport = HuaweiTransport(gatt, write, notify, scope, timeouts).also { it.start() }
                val link = negotiateLink(transport)
                transport.frameSettings = FrameSettings(link)

                val authenticator = authenticators.selectFor(link) ?: throw unsupportedAuth(link)
                Log.i(TAG, "Authenticating with ${authenticator.mode.label}")
                val keys = authenticator.authenticate(transport, link, context)
                val cipherMode = keys.cipherMode
                    ?: if (authenticator.mode == HuaweiAuthMode.HICHAIN3) CipherMode.AES_GCM else link.cipherMode
                transport.cipher = PayloadCipher(keys.workKey, cipherMode, IvGenerator(keys.ivCounterSeed))

                val now = clock.instant()
                requireSuccess(transport.request(DeviceConfigCommands.setDateTime(now, clock.zone.rules.getOffset(now)), encrypted = true))
                // TODO(huawei-protocol): 0x0132 time-zone id, 0x0102/0x0103 capability consult (§5.1 steps 6-8): layouts undocumented.
                return HuaweiSession(gatt, transport, scope, clock)
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

        private fun requireSuccess(response: HuaweiCommand) {
            val code = response.errorCode() ?: return
            if (code != HuaweiCommand.SUCCESS_CODE) throw WearableProtocolException("Huawei watch rejected ${response.tag} with error $code")
        }
    }
}
