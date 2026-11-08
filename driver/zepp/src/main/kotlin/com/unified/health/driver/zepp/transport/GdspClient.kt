package com.unified.health.driver.zepp.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.zepp.codec.CommandResponse
import com.unified.health.driver.zepp.codec.GdspCodec
import com.unified.health.driver.zepp.codec.GdspDataType
import com.unified.health.driver.zepp.codec.GdspHeader
import com.unified.health.driver.zepp.codec.crc32
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.selects.select
import kotlinx.coroutines.withTimeoutOrNull
import java.io.ByteArrayOutputStream
import java.time.Instant
import java.time.ZoneId

/**
 * A GDSP failure that is worth retrying (lost packet, stall, busy/CRC mismatch, transient error
 * code). Malformed frames, unsupported types and auth failures deliberately stay plain
 * [WearableProtocolException]s so callers never retry them.
 */
internal class GdspTransientException(message: String, cause: Throwable? = null) :
    WearableProtocolException(message, cause)

/**
 * GDSP request/response on 0x0004 (control, notifies `[0x10, cmd, code, data…]`) and 0x0005
 * (data, notifies `[seq, payload…]`), §6.1 [V]. One operation at a time; callers serialize.
 */
internal class GdspClient(
    private val gatt: GattClient,
    private val control: GattCharacteristic,
    private val data: GattCharacteristic,
) {
    private lateinit var controlFrames: ReceiveChannel<ByteArray>
    private lateinit var dataFrames: ReceiveChannel<ByteArray>
    private var opened = false

    /** GDSP version reported by the watch, or null when it did not answer. */
    var version: Int? = null
        private set

    /** Subscribes once (data first, so no packet is lost) and queries the GDSP version `[0x00]`. */
    suspend fun open() {
        if (opened) return
        dataFrames = gatt.subscribe(data)
        controlFrames = gatt.subscribe(control)
        opened = true
        val response = command(GdspCodec.QUERY_VERSION, GdspCodec.CMD_QUERY_VERSION, CONTROL_TIMEOUT_MS)
        version = response?.takeIf { it.isSuccess }?.let { GdspCodec.parseVersion(it.data) }
        Log.d(TAG, "GDSP version $version")
    }

    /**
     * Asks how much [type] data exists from [since].
     * @return the header, or null when the watch refuses the request (e.g. unsupported type).
     * @throws WearableProtocolException when the watch does not answer in time.
     */
    suspend fun requestHeader(type: GdspDataType, since: Instant, zone: ZoneId): GdspHeader? {
        val request = GdspCodec.requestHeader(type, since, zone, version)
        val response = command(request, GdspCodec.CMD_REQUEST_HEADER, HEADER_TIMEOUT_MS)
            ?: throw GdspTransientException("Watch did not answer the GDSP header request for $type")
        if (!response.isSuccess) {
            val message = "GDSP header for $type refused with code ${response.status}"
            // BUSY/TIMEOUT/OPERATION_FAILED etc. are worth retrying; unsupported-type refusals are not.
            if (response.status in TRANSIENT_ERROR_CODES) throw GdspTransientException(message)
            Log.i(TAG, message)
            return null
        }
        return try {
            GdspCodec.parseHeader(response.data)
        } catch (e: MalformedPayloadException) {
            throw WearableProtocolException("Malformed GDSP header for $type: ${e.message}", e)
        }
    }

    /**
     * Starts the transfer `[0x02]`, collects 0x0005 packets until the control point reports the end
     * `[0x10, 0x02, code, crc32]`, and checks sequence continuity and the CRC32 of the payload.
     * @return the payload with sequence bytes removed.
     */
    suspend fun fetch(): ByteArray {
        drain(dataFrames)
        drain(controlFrames)
        gatt.write(control, GdspCodec.START_TRANSFER)
        val payload = ByteArrayOutputStream()
        var lastSeq = -1
        while (true) {
            val event = withTimeoutOrNull(DATA_IDLE_TIMEOUT_MS) {
                select<Pair<Boolean, ByteArray>> {
                    dataFrames.onReceive { true to it }
                    controlFrames.onReceive { false to it }
                }
            } ?: throw GdspTransientException("GDSP transfer stalled for $DATA_IDLE_TIMEOUT_MS ms")
            val (isData, frame) = event
            if (isData) {
                lastSeq = appendPacket(payload, lastSeq, frame)
                continue
            }
            val response = CommandResponse.parse(frame)
            if (response == null || response.command != GdspCodec.CMD_START_TRANSFER) continue
            // Data notifications queued before the end marker still belong to this transfer.
            while (true) lastSeq = appendPacket(payload, lastSeq, dataFrames.tryReceive().getOrNull() ?: break)
            return verify(response, payload.toByteArray())
        }
    }

    /** `[0x03]` or `[0x03, code]`; best effort, returns whether the watch confirmed. */
    suspend fun stop(code: Int?): Boolean {
        val request = if (code == null) GdspCodec.STOP_TRANSFER else GdspCodec.stopTransfer(code)
        return command(request, GdspCodec.CMD_STOP_TRANSFER, CONTROL_TIMEOUT_MS)?.isSuccess == true
    }

    private fun appendPacket(payload: ByteArrayOutputStream, lastSeq: Int, frame: ByteArray): Int {
        if (frame.isEmpty()) throw WearableProtocolException("Empty GDSP data packet")
        val seq = frame[0].toInt() and 0xFF
        if ((lastSeq + 1) % 256 != seq) throw GdspTransientException("GDSP packet lost (expected ${(lastSeq + 1) % 256}, got $seq)")
        if (payload.size() + frame.size > MAX_PAYLOAD_SIZE) throw WearableProtocolException("GDSP payload exceeds $MAX_PAYLOAD_SIZE bytes")
        payload.write(frame, 1, frame.size - 1)
        return seq
    }

    private fun verify(end: CommandResponse, payload: ByteArray): ByteArray {
        if (!end.isSuccess) {
            val message = "GDSP transfer failed with code ${end.status}"
            // Transient link/transfer states: operation failed, packet index, busy, CRC mismatch,
            // timeout (GDSPErrorCode 4/6/7/8/50). Anything else is a protocol/state error.
            if (end.status in TRANSIENT_ERROR_CODES) throw GdspTransientException(message)
            throw WearableProtocolException(message)
        }
        val expected = GdspCodec.parseTransferCrc(end.data) ?: throw WearableProtocolException("GDSP end marker without CRC")
        if (expected != crc32(payload)) throw GdspTransientException("GDSP CRC mismatch")
        return payload
    }

    private suspend fun command(request: ByteArray, command: Int, timeoutMs: Long): CommandResponse? {
        drain(controlFrames)
        gatt.write(control, request)
        return withTimeoutOrNull(timeoutMs) {
            var match: CommandResponse? = null
            while (match == null) match = CommandResponse.parse(controlFrames.receive())?.takeIf { it.command == command }
            match
        }
    }

    private fun drain(frames: ReceiveChannel<ByteArray>) = frames.discardBuffered()

    companion object {
        private const val TAG = "ZeppGdsp"

        /** `sendControlCommandResponse(cmd)` default: 5 s [V]. */
        const val CONTROL_TIMEOUT_MS = 5_000L

        /** Header requests wait 20 s (`HMProSyncDataBaseProfile.h`, [V]). */
        const val HEADER_TIMEOUT_MS = 20_000L

        /** Transfer idle wait 20 s (`waiting(20000)`, [V]). */
        const val DATA_IDLE_TIMEOUT_MS = 20_000L

        /** 90 days of 8-byte activity minutes is ~1 MiB; anything far larger is corrupt. */
        const val MAX_PAYLOAD_SIZE = 8 shl 20

        /**
         * `GDSPErrorCode` values worth a fresh sync attempt: OPERATION_FAILED(4),
         * PACKET_INDEX_ERROR(6), BUSY(7), CRC_MISMATCH(8), TIMEOUT(50) (`GDSPErrorCode.java`).
         */
        val TRANSIENT_ERROR_CODES = setOf(4, 6, 7, 8, 50)
    }
}
