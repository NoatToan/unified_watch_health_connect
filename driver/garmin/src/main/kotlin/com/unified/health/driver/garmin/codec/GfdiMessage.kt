package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.buildBytes

internal class GfdiFrameException(message: String) : WearableProtocolException(message)

/**
 * One GFDI message (§3.4.2 [V], writer `ct2/f.java:59-85`, reader `cd0/h0.java:207-238`):
 * ```
 * [len u16 LE = whole message incl. len and CRC]
 * [msgId u16 LE]                         normal header
 *   or [msgId - 5000 u8][txId | 0x80]    compact header
 * [payload]
 * [crc u16 LE over every preceding byte]
 * ```
 * @property transactionId set when the message used the compact header; a reply to it must reuse
 *  the same transaction id (and therefore the compact header).
 */
internal class GfdiMessage(
    val id: Int,
    val payload: ByteArray,
    val transactionId: Int? = null,
) {
    fun encode(): ByteArray {
        val length = HEADER_SIZE + payload.size + CRC_SIZE
        if (length > 0xFFFF) throw GfdiFrameException("GFDI message $id too large: $length bytes")
        val body = buildBytes(length) {
            u16le(length)
            if (transactionId == null) {
                u16le(id)
            } else {
                val compactId = id - COMPACT_ID_BASE
                require(compactId in 0..0xFF) { "Message $id cannot use the compact header" }
                require(transactionId in 0..COMPACT_TX_MASK) { "Transaction id $transactionId out of range" }
                u8(compactId)
                u8(transactionId or COMPACT_FLAG)
            }
            bytes(payload)
        }
        val crc = GarminCrc16.compute(body)
        return buildBytes(length) {
            bytes(body)
            u16le(crc)
        }
    }

    override fun toString(): String = "GfdiMessage(id=$id, ${payload.size} bytes, tx=$transactionId)"

    companion object {
        const val HEADER_SIZE = 4
        const val CRC_SIZE = 2
        const val COMPACT_ID_BASE = 5000
        const val COMPACT_FLAG = 0x80
        const val COMPACT_TX_MASK = 0x1F

        /** Validates length and CRC, then parses the header. Throws [GfdiFrameException] on corruption. */
        fun decode(frame: ByteArray): GfdiMessage {
            if (frame.size < HEADER_SIZE + CRC_SIZE) throw GfdiFrameException("GFDI frame too short: ${frame.size} bytes")
            val reader = ByteReader(frame)
            val length = reader.u16le()
            if (length != frame.size) throw GfdiFrameException("GFDI length field $length != frame size ${frame.size}")
            val expectedCrc = GarminCrc16.compute(frame, 0, frame.size - CRC_SIZE)
            val actualCrc = ByteReader(frame, frame.size - CRC_SIZE).u16le()
            if (expectedCrc != actualCrc) {
                throw GfdiFrameException("GFDI CRC mismatch: computed %04x, frame has %04x".format(expectedCrc, actualCrc))
            }
            val b2 = frame[2].toInt() and 0xFF
            val b3 = frame[3].toInt() and 0xFF
            val compact = b3 and COMPACT_FLAG != 0
            val id = if (compact) b2 + COMPACT_ID_BASE else b2 or (b3 shl 8)
            val transactionId = if (compact) b3 and COMPACT_TX_MASK else null
            return GfdiMessage(id, frame.copyOfRange(HEADER_SIZE, frame.size - CRC_SIZE), transactionId)
        }
    }
}

/** Message ids used by this driver (§3.4.5 [V], `ct2/c.java:20-200`). */
internal object GfdiMessageId {
    const val ACK = 5000
    const val DOWNLOAD_REQUEST = 5002
    const val FILE_DATA = 5004
    const val FIT_DEFINITION = 5011
    const val FIT_DATA = 5012
    const val BATTERY_STATUS = 5023
    const val DEVICE_INFORMATION = 5024
    const val SET_DEVICE_SETTINGS = 5026
    const val SYSTEM_EVENT = 5030
    const val SYNC_REQUEST = 5037
    const val CONFIGURATION = 5050
    const val CURRENT_TIME_REQUEST = 5052

    /** Garmin application-level auth (§5.2 [V], `ss2/c.java:152-158`); never used when bonded. */
    val GARMIN_AUTH = 5101..5112
}

/** Status byte of an Acknowledgement (§3.4.4 [V], `cd0/h0.java:277-292`). */
internal object GfdiStatus {
    const val ACK = 0
    const val NAK = 1
    const val UNKNOWN_OR_NOT_SUPPORTED = 2
    const val COBS_ERROR = 3
    const val CRC_ERROR = 4
    const val LENGTH_ERROR = 5

    fun name(status: Int): String = when (status) {
        ACK -> "ACK"
        NAK -> "NAK"
        UNKNOWN_OR_NOT_SUPPORTED -> "UNKNOWN_OR_NOT_SUPPORTED"
        COBS_ERROR -> "COBS_ERROR"
        CRC_ERROR -> "CRC_ERROR"
        LENGTH_ERROR -> "LENGTH_ERROR"
        else -> "STATUS_$status"
    }
}

/** 5000 payload: `origMsgId u16 | status u8 | data` (§3.4.4 [V]). */
internal class GfdiAck(
    val originalId: Int,
    val status: Int,
    val data: ByteArray = ByteArray(0),
) {
    val isAck: Boolean get() = status == GfdiStatus.ACK

    fun encode(): ByteArray = buildBytes(3 + data.size) {
        u16le(originalId)
        u8(status)
        bytes(data)
    }

    override fun toString(): String = "GfdiAck($originalId, ${GfdiStatus.name(status)}, ${data.size} bytes)"

    companion object {
        fun decode(payload: ByteArray): GfdiAck {
            val reader = ByteReader(payload)
            return GfdiAck(reader.u16le(), reader.u8(), reader.rest())
        }
    }
}
