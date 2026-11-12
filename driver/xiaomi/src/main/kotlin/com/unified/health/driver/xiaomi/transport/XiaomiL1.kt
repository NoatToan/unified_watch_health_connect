package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.xiaomi.XiaomiChannel

/**
 * L1 -- framing, CRC, the session-start (CMD) handshake and the ACK/window state machine
 * (protocol §3 [V]). CRC itself lives in [Crc16Arc] (its own file, not touched here) so the
 * crypto/auth agent implementing session encryption never needs to open this one.
 */

/** One 8-byte-header L1 frame: `magic(2) type/frx(1) seq(1) dataLength(2) crc16(2) payload(N)`. */
internal data class L1Frame(val type: Int, val frx: Int, val seq: Int, val payload: ByteArray) {

    companion object {
        const val TYPE_NAK = 0
        const val TYPE_ACK = 1
        const val TYPE_CMD = 2
        const val TYPE_DATA = 3

        /**
         * Builds a complete frame. `frx` defaults to 0 (used by every packet except the flow-control
         * variants DATA may use, protocol §3.1 [V]).
         */
        fun encode(type: Int, seq: Int, payload: ByteArray = ByteArray(0), frx: Int = 0): ByteArray {
            require(type in 0..0xF) { "type must fit a nibble, was $type" }
            require(frx in 0..0xF) { "frx must fit a nibble, was $frx" }
            require(seq in 0..0xFF) { "seq must fit a byte, was $seq" }
            require(payload.size <= 0xFFFF) { "payload of ${payload.size} bytes exceeds the u16 dataLength field" }
            val crc = Crc16Arc.compute(payload)
            val writer = ByteWriter(XiaomiL0.HEADER_SIZE + payload.size)
            writer.u8(XiaomiL0.MAGIC_LO)
            writer.u8(XiaomiL0.MAGIC_HI)
            writer.u8((frx shl 4) or type)
            writer.u8(seq)
            writer.u16le(payload.size)
            writer.u16le(crc)
            writer.bytes(payload)
            return writer.toByteArray()
        }

        /**
         * Parses and CRC-validates one complete frame. Redundant with [XiaomiL0.Reassembler]'s own
         * CRC check by design: this keeps [L1Frame] independently correct and testable, and cheap
         * enough that the duplication is not worth avoiding.
         * @throws MalformedPayloadException on a short frame, bad magic, length mismatch or CRC failure.
         */
        fun decode(frame: ByteArray): L1Frame {
            if (frame.size < XiaomiL0.HEADER_SIZE) throw MalformedPayloadException("L1 frame shorter than the 8-byte header: ${frame.size} bytes")
            val reader = ByteReader(frame)
            val m0 = reader.u8()
            val m1 = reader.u8()
            if (m0 != XiaomiL0.MAGIC_LO || m1 != XiaomiL0.MAGIC_HI) {
                throw MalformedPayloadException("Bad L1 magic 0x%02x%02x".format(m0, m1))
            }
            val typeFrx = reader.u8()
            val type = typeFrx and 0x0F
            val frx = (typeFrx ushr 4) and 0x0F
            val seq = reader.u8()
            val dataLength = reader.u16le()
            val crc = reader.u16le()
            if (reader.remaining != dataLength) {
                throw MalformedPayloadException("L1 dataLength $dataLength does not match ${reader.remaining} remaining bytes")
            }
            val payload = reader.bytes(dataLength)
            val computed = Crc16Arc.compute(payload)
            if (crc != computed) {
                throw MalformedPayloadException("L1 CRC mismatch: header says 0x%04x, computed 0x%04x".format(crc, computed))
            }
            return L1Frame(type, frx, seq, payload)
        }
    }
}

/** One TLV entry of the L1 CMD start config list: `type:u8, len:u16LE, value:len bytes` (protocol §3.2 [V]). */
internal data class L1ConfigEntry(val type: Int, val value: ByteArray) {
    companion object {
        const val TYPE_VERSION = 1
        const val TYPE_MPS = 2
        const val TYPE_TX_WIN = 3
        const val TYPE_SEND_TIMEOUT = 4
    }
}

/** Parsed CMD start config list (protocol §3.2 [V]). [version] is informational; [mps]/[txWindow]/
 * [sendTimeoutMs] are the sender's advertised limits for frames it will receive. */
internal data class L1StartConfig(
    val version: ByteArray? = null,
    val mps: Int? = null,
    val txWindow: Int? = null,
    val sendTimeoutMs: Int? = null,
) {
    companion object {
        fun from(entries: List<L1ConfigEntry>): L1StartConfig {
            var version: ByteArray? = null
            var mps: Int? = null
            var txWindow: Int? = null
            var sendTimeout: Int? = null
            entries.forEach { entry ->
                when (entry.type) {
                    L1ConfigEntry.TYPE_VERSION -> version = entry.value
                    L1ConfigEntry.TYPE_MPS -> mps = u16leOrNull(entry.value)
                    L1ConfigEntry.TYPE_TX_WIN -> txWindow = u16leOrNull(entry.value)
                    L1ConfigEntry.TYPE_SEND_TIMEOUT -> sendTimeout = u16leOrNull(entry.value)
                }
            }
            return L1StartConfig(version, mps, txWindow, sendTimeout)
        }

        private fun u16leOrNull(bytes: ByteArray): Int? {
            if (bytes.size < 2) return null
            return (bytes[0].toInt() and 0xFF) or ((bytes[1].toInt() and 0xFF) shl 8)
        }
    }
}

/** Encodes/decodes the CMD packet payload used to open the L1 session (protocol §3.2 [V]). */
internal object L1StartCodec {
    /** `CMD_L1START_REQ` (protocol §3.2 [V]). */
    const val CMD_L1START_REQ = 1

    /** `CMD_L1START_RSP` (protocol §3.2 [V]). */
    const val CMD_L1START_RSP = 2

    /**
     * Our outgoing config, byte-identical to the vendor's own request (protocol §3.2 [V]):
     * version 1.0.0, MPS 64512, TX window 32, send timeout 10000 ms. Used both for our own
     * CMD_L1START_REQ and for the CMD_L1START_RSP we must answer an unsolicited device REQ with.
     */
    val DEFAULT_ENTRIES: List<L1ConfigEntry> = listOf(
        L1ConfigEntry(L1ConfigEntry.TYPE_VERSION, byteArrayOf(1, 0, 0)),
        L1ConfigEntry(L1ConfigEntry.TYPE_MPS, byteArrayOf(0x00, 0xFC.toByte())),
        L1ConfigEntry(L1ConfigEntry.TYPE_TX_WIN, byteArrayOf(0x20, 0x00)),
        L1ConfigEntry(L1ConfigEntry.TYPE_SEND_TIMEOUT, byteArrayOf(0x10, 0x27)),
    )

    fun encodeRequest(entries: List<L1ConfigEntry> = DEFAULT_ENTRIES): ByteArray = encode(CMD_L1START_REQ, entries)

    fun encodeResponse(entries: List<L1ConfigEntry> = DEFAULT_ENTRIES): ByteArray = encode(CMD_L1START_RSP, entries)

    private fun encode(cmd: Int, entries: List<L1ConfigEntry>): ByteArray {
        val writer = ByteWriter()
        writer.u8(cmd)
        entries.forEach { entry ->
            writer.u8(entry.type)
            writer.u16le(entry.value.size)
            writer.bytes(entry.value)
        }
        return writer.toByteArray()
    }

    /** @return the CMD sub-command id ([CMD_L1START_REQ]/[CMD_L1START_RSP]) and its parsed config. */
    fun decode(payload: ByteArray): Pair<Int, L1StartConfig> {
        if (payload.isEmpty()) throw MalformedPayloadException("Empty L1 CMD payload")
        val reader = ByteReader(payload)
        val cmd = reader.u8()
        val entries = ArrayList<L1ConfigEntry>()
        while (reader.hasRemaining) {
            val type = reader.u8()
            val len = reader.u16le()
            entries += L1ConfigEntry(type, reader.bytes(len))
        }
        return cmd to L1StartConfig.from(entries)
    }
}

/**
 * The L1 ACK/window state machine (protocol §3.3 [V]): seq assignment mod 256, the 32-packet local
 * window, cumulative ACK release, NAK-driven and timeout-driven retransmission, and the receiver's
 * immediate-vs-cumulative ACK policy. Pure and coroutine-free by design -- every method is a
 * synchronous state transition given an explicit `nowMs` -- so it is fully unit-testable without
 * [XiaomiLink]'s coroutines/timers, which own the actual scheduling (background retransmit/ACK
 * pump, 10 s send timeout, ~500 ms cumulative ACK timeout).
 *
 * Not thread-safe: drive it from a single coroutine (the link's own event loop).
 */
internal class XiaomiL1(private val localWindow: Int = DEFAULT_LOCAL_WINDOW) {

    // ---- sender side: we assign seq to outgoing DATA frames and track them until ACKed ----

    private var nextSeqOut = 0
    private val unacked = LinkedHashMap<Int, PendingFrame>()

    /** Remote's advertised receive window (its `CONFIG_TYPE_TX_WIN`); default 4 until negotiated. */
    var remoteWindow: Int = DEFAULT_REMOTE_WINDOW
        private set

    var remoteConfig: L1StartConfig? = null
        private set

    private class PendingFrame(val seq: Int, val frame: ByteArray, var lastSentAtMs: Long)

    /** Applies the watch's CMD_L1START_RSP config (protocol §3.2 [V]). */
    fun applyRemoteConfig(config: L1StartConfig) {
        remoteConfig = config
        remoteWindow = config.txWindow ?: DEFAULT_REMOTE_WINDOW
    }

    val outstandingCount: Int get() = unacked.size

    /** Whether another DATA frame may be sent without exceeding [remoteWindow]. */
    fun canSend(): Boolean = unacked.size < remoteWindow

    /** Assigns the next seq (mod 256), builds the DATA frame and tracks it as unacked. */
    fun prepareData(payload: ByteArray, nowMs: Long, frx: Int = 0): ByteArray {
        val seq = nextSeqOut
        nextSeqOut = (nextSeqOut + 1) % SEQ_MODULO
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq, payload, frx)
        unacked[seq] = PendingFrame(seq, frame, nowMs)
        return frame
    }

    /** Cumulative release: frees every unacked frame whose seq is at or before [ackSeq] (protocol §3.3 [V]). */
    fun onAck(ackSeq: Int) {
        unacked.keys.filter { seqDistance(it, ackSeq) <= 0 }.forEach { unacked.remove(it) }
    }

    /** NAK carrying [fromSeq] (the receiver's `rxExpect`): resend every unacked frame from there on. */
    fun onNak(fromSeq: Int): List<ByteArray> =
        unacked.values.filter { seqDistance(it.seq, fromSeq) >= 0 }.sortedBy { it.seq }.map { it.frame }

    /** Frames unacked for at least [timeoutMs]; marks them resent at [nowMs] (protocol §3.3 [V]). */
    fun framesToRetransmit(nowMs: Long, timeoutMs: Long): List<ByteArray> =
        unacked.values.filter { nowMs - it.lastSentAtMs >= timeoutMs }
            .sortedBy { it.seq }
            .onEach { it.lastSentAtMs = nowMs }
            .map { it.frame }

    // ---- receiver side: the watch's DATA frames arrive here ----

    private var rxExpect = 0
    private var unackedReceivedCount = 0
    private var firstUnackedAtMs: Long? = null

    sealed interface ReceiveResult {
        data class Deliver(val payload: ByteArray) : ReceiveResult

        /** Seq mismatch (stale/duplicate or out of order); send a NAK carrying [nakSeq], do not deliver. */
        data class Rejected(val nakSeq: Int) : ReceiveResult
    }

    /**
     * `frx == 1` is accepted unconditionally and never ACKed, resynchronising [rxExpect]; `frx == 0`
     * requires `seq == rxExpect`, otherwise the frame is [ReceiveResult.Rejected] (protocol §3.3 [V]).
     */
    fun onDataReceived(frame: L1Frame, nowMs: Long): ReceiveResult {
        if (frame.frx != 0) {
            rxExpect = (frame.seq + 1) % SEQ_MODULO
            return ReceiveResult.Deliver(frame.payload)
        }
        if (frame.seq != rxExpect) return ReceiveResult.Rejected(rxExpect)
        rxExpect = (rxExpect + 1) % SEQ_MODULO
        if (unackedReceivedCount == 0) firstUnackedAtMs = nowMs
        unackedReceivedCount++
        return ReceiveResult.Deliver(frame.payload)
    }

    /**
     * Whether the frame just accepted by [onDataReceived] must be ACKed immediately: its L2 payload
     * (`payload[0]` = channel) is [XiaomiChannel.PROTOBUF] or [XiaomiChannel.LYRA], or the unacked
     * count has reached ⅔ of [localWindow] (protocol §3.3 [V]; the exact ⅔ threshold has no integer
     * formula in the doc, so this rounds down -- TODO(xiaomi-protocol): confirm against a real
     * watch if bulk transfers ever rely on this threshold rather than the 500 ms cumulative timer).
     */
    fun needsImmediateAck(l2Payload: ByteArray): Boolean {
        val channel = l2Payload.firstOrNull()?.toInt()?.and(0xFF) ?: return false
        if (channel == XiaomiChannel.PROTOBUF.id || channel == XiaomiChannel.LYRA.id) return true
        return unackedReceivedCount >= (localWindow * 2) / 3
    }

    /** True once the oldest not-yet-acked received frame is older than [timeoutMs] (`SAR_CUM_ACK_TIMEOUT`). */
    fun isCumulativeAckDue(nowMs: Long, timeoutMs: Long): Boolean {
        val since = firstUnackedAtMs ?: return false
        return nowMs - since >= timeoutMs
    }

    /** Seq to put in our next outgoing ACK: the highest seq received so far (`rxExpect - 1`). */
    fun ackSeq(): Int = (rxExpect + SEQ_MODULO - 1) % SEQ_MODULO

    /** Call after actually sending an ACK, to reset the cumulative-ACK bookkeeping. */
    fun onAckSent() {
        unackedReceivedCount = 0
        firstUnackedAtMs = null
    }

    companion object {
        const val SEQ_MODULO = 256
        const val DEFAULT_LOCAL_WINDOW = 32
        const val DEFAULT_REMOTE_WINDOW = 4

        /** Signed mod-256 distance `a - b` (shortest signed path), used for cumulative ACK/NAK release. */
        fun seqDistance(a: Int, b: Int): Int {
            var d = (a - b) % SEQ_MODULO
            if (d > SEQ_MODULO / 2) d -= SEQ_MODULO
            if (d < -SEQ_MODULO / 2) d += SEQ_MODULO
            return d
        }
    }
}
