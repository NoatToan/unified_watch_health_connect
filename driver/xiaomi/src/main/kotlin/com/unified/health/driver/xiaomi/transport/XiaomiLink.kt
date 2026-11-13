package com.unified.health.driver.xiaomi.transport

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.xiaomi.XiaomiChannel
import com.unified.health.driver.xiaomi.proto.S7r
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeout
import java.util.concurrent.ConcurrentHashMap

/** Discards everything already buffered, so the next receive sees only a fresh answer. */
private fun <T> ReceiveChannel<T>.discardBuffered() {
    while (tryReceive().isSuccess) continue
}

/**
 * Owns [XiaomiL0] (chunking/reassembly), [XiaomiL1] (framing/ACK/window) and [XiaomiL2]
 * (channel/opCode) for one connected link, and exposes the coroutine request/response API every
 * higher layer (auth, device commands, fitness sync) is built on (protocol §2/§3/§4/§9 [V]).
 *
 * Concurrency: GATT writes are serialized (L0 "no interleaving"); at most one [request]/
 * [requestRaw] is in flight per L2 channel at a time ([channelLock]); the response waiter is
 * always installed (its inbox exists and is drained) *before* the request is written, so a late
 * answer to a timed-out call can never be mistaken for the answer to the next one. A background
 * pump (owned by [scope], stopped in [close]) retransmits unacked DATA frames after
 * [RETRANSMIT_TIMEOUT_MS] and sends a cumulative ACK after [CUMULATIVE_ACK_TIMEOUT_MS].
 *
 * [encrypt]/[decrypt] default to identity (plaintext); the session installs the real AES-CTR
 * functions once the handshake derives the session keys (protocol §4 [V]; see `XiaomiL2.kt`).
 */
internal class XiaomiLink(
    private val gatt: GattClient,
    private val writeCharacteristic: GattCharacteristic,
    private val notifyCharacteristic: GattCharacteristic,
    private val scope: CoroutineScope,
    private val clock: () -> Long = System::currentTimeMillis,
) {
    private val l1 = XiaomiL1()
    private val reassembler = XiaomiL0.Reassembler()
    private val writeMutex = Mutex()
    private val channelLocks = ConcurrentHashMap<Int, Mutex>()
    private val typeInboxes = ConcurrentHashMap<Int, Channel<ByteArray>>()
    private val cmdInbox = Channel<ByteArray>(Channel.UNLIMITED)

    private var readerJob: Job? = null
    private var pumpJob: Job? = null
    private var started = false
    private val closeLock = Mutex()
    private var closed = false

    /** Applied to outgoing payloads exactly when the derived L2 type requires encryption. */
    var encrypt: (ByteArray) -> ByteArray = { it }

    /** Applied to incoming payloads exactly when the derived L2 type is encrypted. */
    var decrypt: (ByteArray) -> ByteArray = { it }

    /**
     * Enables notifications and runs the L1 session-start CMD exchange (protocol §1.2/§3.2 [V]).
     * Must be called exactly once, before any [request]/[requestRaw]/[send].
     * @throws WearableProtocolException if the watch does not answer within [timeoutMs], or
     * answers with something other than `CMD_L1START_RSP`.
     */
    suspend fun start(timeoutMs: Long = START_TIMEOUT_MS) {
        check(!started) { "XiaomiLink.start() was already called" }
        started = true
        val frames = gatt.subscribe(notifyCharacteristic)
        readerJob = scope.launch { readLoop(frames) }
        pumpJob = scope.launch { backgroundPump() }

        cmdInbox.discardBuffered()
        writeFrame(L1Frame.encode(L1Frame.TYPE_CMD, seq = 0, payload = L1StartCodec.encodeRequest()))
        val replyPayload = try {
            withTimeout(timeoutMs) { cmdInbox.receive() }
        } catch (e: TimeoutCancellationException) {
            throw WearableProtocolException("Xiaomi watch did not answer the L1 session-start request within ${timeoutMs}ms", e)
        }
        val (cmd, config) = L1StartCodec.decode(replyPayload)
        if (cmd != L1StartCodec.CMD_L1START_RSP) {
            throw WearableProtocolException("Expected CMD_L1START_RSP (2) from the watch, got CMD $cmd")
        }
        l1.applyRemoteConfig(config)
        Log.i(TAG, "L1 session started; remote window=${l1.remoteWindow}")
    }

    /**
     * Sends an `s7r` request for `(e, f)` and returns the matching `s7r` response (protocol §9.1
     * [V]), always over L2 channel 1 / type 101 (post-auth device commands). Throws
     * [com.unified.health.driver.xiaomi.proto.XiaomiDeviceErrorException] if the response carries
     * a non-zero `field 100`.
     * @throws WearableProtocolException on a timeout, or if the watch answers a different `(e, f)`.
     */
    suspend fun request(e: Int, f: Int, payload: ByteArray? = null, timeoutMs: Long = DEFAULT_REQUEST_TIMEOUT_MS): S7r {
        val requestBytes = S7r.request(e, f, payload).encode()
        val responseBytes = requestRaw(L2Frame.TYPE_PB_ENCRYPTED, requestBytes, timeoutMs)
        val response = S7r.decode(responseBytes)
        if (response.e != e || response.f != f) {
            throw WearableProtocolException(
                "Xiaomi watch answered class ${response.e} command ${response.f}, expected class $e command $f",
            )
        }
        response.throwOnError()
        return response
    }

    /**
     * Lower-level primitive: writes [payload] as the L2 message that derives to [type] (protocol
     * §4 [V], see [L2Frame.typeFor]) and returns the raw payload bytes of the next message that
     * derives to the same [type]. One request in flight per L2 channel; the inbox is drained
     * before writing so a late answer from a previous (timed-out) call cannot be mistaken for
     * this one's answer.
     * @throws WearableProtocolException if [type] has no known channel, or on a timeout.
     */
    suspend fun requestRaw(type: Int, payload: ByteArray, timeoutMs: Long): ByteArray {
        check(started) { "XiaomiLink.start() must be called before requestRaw()" }
        val (channel, opCode) = L2Frame.channelAndOpCodeFor(type)
            ?: throw WearableProtocolException("No known L2 channel/opCode for type $type")
        return channelLock(channel).withLock {
            val inbox = inbox(type)
            inbox.discardBuffered()
            sendData(L2Frame.encode(channel, opCode, payload, encrypt))
            try {
                withTimeout(timeoutMs) { inbox.receive() }
            } catch (e: TimeoutCancellationException) {
                throw WearableProtocolException("Xiaomi watch did not answer type $type within ${timeoutMs}ms", e)
            }
        }
    }

    /**
     * Receives the next message that derives to [type], without writing anything first (protocol
     * §9.4 [V]: channel-5 fitness file data arrives as a stream the watch pushes on its own once a
     * transfer was triggered by an `s7r f=3/4` request on channel 1 -- it is not itself the answer
     * to that request, so [requestRaw]'s write-then-wait pairing does not apply). Unlike
     * [requestRaw], nothing is discarded before waiting: channel 5 is not used by anything else in
     * this module today, so there is no "stale answer from a previous call" to guard against, and
     * every packet the caller has not consumed yet must still be delivered in order -- discarding
     * would drop real segments, not stale ones. For the same reason this does not take
     * [channelLock]: there is only ever one fitness-file transfer in flight (the fitness sync loop
     * is itself sequential, one id at a time), so there is nothing to serialize against [I] --
     * revisit if a later milestone shares channel 5 with a second concurrent requester.
     * @throws WearableProtocolException if [type] has no known channel, or on a timeout.
     */
    suspend fun receiveRaw(type: Int, timeoutMs: Long): ByteArray {
        check(started) { "XiaomiLink.start() must be called before receiveRaw()" }
        return try {
            withTimeout(timeoutMs) { inbox(type).receive() }
        } catch (e: TimeoutCancellationException) {
            throw WearableProtocolException("Xiaomi watch did not send type $type within ${timeoutMs}ms", e)
        }
    }

    /**
     * Fire-and-forget `s7r` command for `(e, f)` (protocol §9.2 f=3 `needResponse=false` time
     * sync is the only user of this today): writes the request, does not wait for an answer.
     */
    suspend fun send(e: Int, f: Int, payload: ByteArray? = null) {
        check(started) { "XiaomiLink.start() must be called before send()" }
        val requestBytes = S7r.request(e, f, payload).encode()
        channelLock(XiaomiChannel.PROTOBUF.id).withLock {
            sendData(L2Frame.encode(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.WRITE_ENC, requestBytes, encrypt))
        }
    }

    /** Releases notifications and stops the background loops. Idempotent; never throws. */
    suspend fun close() {
        closeLock.withLock {
            if (closed) return
            closed = true
            readerJob?.cancel()
            pumpJob?.cancel()
            typeInboxes.values.forEach { it.close() }
            cmdInbox.close()
            if (started) {
                try {
                    gatt.unsubscribe(notifyCharacteristic)
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    Log.w(TAG, "unsubscribe failed while closing: ${e.message}")
                }
            }
        }
    }

    // ---- outgoing: L1 window + L0 chunking ----

    private suspend fun sendData(l2Bytes: ByteArray) {
        while (!l1.canSend()) delay(WINDOW_POLL_INTERVAL_MS)
        writeFrame(l1.prepareData(l2Bytes, clock()))
    }

    /**
     * Chunks [frame] to `gatt.maxWriteLength` and writes the pieces in order, serialized so two
     * frames' chunks never interleave (protocol §2 [V]; write-with-response is the conservative
     * choice per §1.2 until a real-watch capture proves write-without-response is stable).
     */
    private suspend fun writeFrame(frame: ByteArray) = writeMutex.withLock {
        XiaomiL0.chunk(frame, gatt.maxWriteLength).forEach { gatt.write(writeCharacteristic, it, WriteType.DEFAULT) }
    }

    // ---- incoming: reassembly -> L1 -> L2 -> per-type inbox ----

    private suspend fun readLoop(frames: ReceiveChannel<ByteArray>) {
        for (notification in frames) {
            val l1Frames = try {
                reassembler.feed(notification)
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                Log.w(TAG, "Dropping unreassemblable notification: ${e.message}")
                emptyList()
            }
            l1Frames.forEach { handleL1Frame(it) }
        }
    }

    private suspend fun handleL1Frame(raw: ByteArray) {
        val frame = try {
            L1Frame.decode(raw)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Dropping malformed L1 frame: ${e.message}")
            return
        }
        when (frame.type) {
            L1Frame.TYPE_ACK -> l1.onAck(frame.seq)
            L1Frame.TYPE_NAK -> l1.onNak(frame.seq).forEach { writeFrame(it) }
            L1Frame.TYPE_CMD -> handleCmd(frame.payload)
            L1Frame.TYPE_DATA -> handleData(frame)
            else -> Log.w(TAG, "Dropping L1 frame of unknown type ${frame.type}")
        }
    }

    private suspend fun handleCmd(payload: ByteArray) {
        val (cmd, config) = try {
            L1StartCodec.decode(payload)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "Dropping malformed L1 CMD payload: ${e.message}")
            return
        }
        when (cmd) {
            // Device-initiated start (reconnect race): answer with our own config (protocol §3.2 [V]).
            L1StartCodec.CMD_L1START_REQ -> {
                l1.applyRemoteConfig(config)
                writeFrame(L1Frame.encode(L1Frame.TYPE_CMD, seq = 0, payload = L1StartCodec.encodeResponse()))
            }
            L1StartCodec.CMD_L1START_RSP -> cmdInbox.trySend(payload)
            else -> Log.w(TAG, "Dropping L1 CMD payload with unknown sub-command $cmd")
        }
    }

    private suspend fun handleData(frame: L1Frame) {
        when (val result = l1.onDataReceived(frame, clock())) {
            is XiaomiL1.ReceiveResult.Rejected -> writeFrame(L1Frame.encode(L1Frame.TYPE_NAK, seq = result.nakSeq))
            is XiaomiL1.ReceiveResult.Deliver -> {
                if (l1.needsImmediateAck(result.payload)) sendAck()
                deliverL2(result.payload)
            }
        }
    }

    private suspend fun sendAck() {
        writeFrame(L1Frame.encode(L1Frame.TYPE_ACK, seq = l1.ackSeq()))
        l1.onAckSent()
    }

    private fun deliverL2(l1Payload: ByteArray) {
        val l2 = try {
            L2Frame.decode(l1Payload, decrypt)
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            Log.w(TAG, "Dropping malformed/undecryptable L2 frame: ${e.message}")
            return
        }
        val type = L2Frame.typeFor(l2.channel, l2.opCode)
        if (type == null) {
            Log.w(TAG, "Dropping L2 frame on unknown channel ${l2.channel}")
            return
        }
        inbox(type).trySend(l2.payload)
    }

    private suspend fun backgroundPump() {
        while (true) {
            delay(ACK_PUMP_INTERVAL_MS)
            val now = clock()
            if (l1.isCumulativeAckDue(now, CUMULATIVE_ACK_TIMEOUT_MS)) sendAck()
            l1.framesToRetransmit(now, RETRANSMIT_TIMEOUT_MS).forEach { writeFrame(it) }
        }
    }

    private fun channelLock(channel: Int): Mutex = channelLocks.getOrPut(channel) { Mutex() }

    private fun inbox(type: Int): Channel<ByteArray> = typeInboxes.getOrPut(type) { Channel(Channel.UNLIMITED) }

    companion object {
        private const val TAG = "XiaomiLink"

        /** Vendor state-machine step timeout for "notifications + L1 START" (protocol §10.1 [V]). */
        const val START_TIMEOUT_MS = 10_000L

        /** Generic fallback for [request]/[requestRaw]; device commands pass their own value (protocol §9.2 [V]). */
        const val DEFAULT_REQUEST_TIMEOUT_MS = 10_000L

        /** Per-outstanding-DATA-packet retransmit timeout (protocol §3.3 [V]). */
        const val RETRANSMIT_TIMEOUT_MS = 10_000L

        /** `SAR_CUM_ACK_TIMEOUT` (protocol §3.3 [V]). */
        const val CUMULATIVE_ACK_TIMEOUT_MS = 500L

        /** Background pump tick; not specified by the doc, fine-grained enough for the 500 ms ack timer [I]. */
        const val ACK_PUMP_INTERVAL_MS = 200L

        /** Poll interval while [XiaomiL1.canSend] is false; this module never sends enough to hit the window [I]. */
        const val WINDOW_POLL_INTERVAL_MS = 50L
    }
}
