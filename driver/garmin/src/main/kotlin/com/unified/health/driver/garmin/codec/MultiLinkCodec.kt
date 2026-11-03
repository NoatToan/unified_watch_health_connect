package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes

/**
 * Multi-Link control channel (handle 0) commands, all little-endian (§3.3 [V]). Every packet on a
 * Multi-Link characteristic is `[handle u8][payload]`; control packets use handle 0, so the leading
 * `0x00` of each command below is that handle.
 */
internal object MultiLinkCodec {

    const val CONTROL_HANDLE = 0

    /** Multi-Link service id of GFDI (§3.3 [V], `ml2/q.java`). */
    const val SERVICE_GFDI = 1

    /** `ml2/q.java`, `xm2/h.java:11`: REAL_TIME_HR. */
    const val SERVICE_REAL_TIME_HR = 6

    const val CMD_REGISTER = 0x00
    const val CMD_REGISTER_RESPONSE = 0x01
    const val CMD_CLOSE_HANDLE = 0x02
    const val CMD_CLOSE_ALL = 0x05
    const val CMD_CLOSE_ALL_RESPONSE = 0x06

    /** REGISTER flags: 0 = plain, 2 = request the reliable (MLR) layer, which this driver cannot speak. */
    const val REGISTER_FLAGS_PLAIN = 0

    /** Bit set in the REGISTER response when the device insists on MLR (§3.3 [V], `ml2/l.java:66`). */
    const val RELIABLE_FLAG = 0x01

    /** `00 00 | clientId u64 | serviceId u16 | flags u8` (`nl2/d.java:211-236`). */
    fun register(clientId: Long, serviceId: Int, flags: Int = REGISTER_FLAGS_PLAIN): ByteArray = buildBytes(13) {
        u8(CONTROL_HANDLE)
        u8(CMD_REGISTER)
        u64le(clientId)
        u16le(serviceId)
        u8(flags)
    }

    /** `00 05 | clientId u64 | 0000` (`nl2/d.java:172-178`). Closes only this client's handles. */
    fun closeAll(clientId: Long): ByteArray = buildBytes(12) {
        u8(CONTROL_HANDLE)
        u8(CMD_CLOSE_ALL)
        u64le(clientId)
        u16le(0)
    }

    /** `00 02 | clientId u64 | serviceId u16 | handle u8` (`ml2/l.java:128-157`). */
    fun closeHandle(clientId: Long, serviceId: Int, handle: Int): ByteArray = buildBytes(13) {
        u8(CONTROL_HANDLE)
        u8(CMD_CLOSE_HANDLE)
        u64le(clientId)
        u16le(serviceId)
        u8(handle)
    }

    /** Parses a control packet (including its leading handle byte); null when it is not one we use. */
    fun parseResponse(packet: ByteArray): MultiLinkResponse? {
        if (packet.size < 2 || packet[0].toInt() != CONTROL_HANDLE) return null
        return try {
            when (packet[1].toInt() and 0xFF) {
                CMD_REGISTER_RESPONSE -> parseRegisterResponse(packet)
                CMD_CLOSE_ALL_RESPONSE -> MultiLinkResponse.CloseAll(
                    clientId = if (packet.size >= 10) ByteReader(packet, 2).u64le() else null,
                )
                else -> null
            }
        } catch (_: MalformedPayloadException) {
            null
        }
    }

    /**
     * `00 01 | clientId u64 | serviceId u16 | status u8 | handle u8 | reliableFlags u8 | version u8`;
     * the last three only when status is SUCCESS; ALREADY_IN_USE carries a u16 alternative service id
     * (`nl2/h.java:17-55`).
     */
    private fun parseRegisterResponse(packet: ByteArray): MultiLinkResponse.Register {
        val r = ByteReader(packet, 2)
        val clientId = r.u64le()
        val serviceId = r.u16le()
        val status = r.u8()
        val handle = if (status == RegisterStatus.SUCCESS) r.u8() else 0
        val reliableFlags = if (status == RegisterStatus.SUCCESS && r.hasRemaining) r.u8() else 0
        return MultiLinkResponse.Register(clientId, serviceId, status, handle, reliableFlags)
    }
}

internal sealed interface MultiLinkResponse {
    data class Register(
        val clientId: Long,
        val serviceId: Int,
        val status: Int,
        val handle: Int,
        val reliableFlags: Int,
    ) : MultiLinkResponse

    data class CloseAll(val clientId: Long?) : MultiLinkResponse
}

/** REGISTER status codes (§3.3 [V], `nl2/h.java:79-92`). */
internal object RegisterStatus {
    const val SUCCESS = 0
    const val INVALID_SERVICE_ID = 1

    /** The firmware is asking the user/whitelist; keep waiting (`nl2/d.java:224-231`, up to 30 s). */
    const val PENDING_AUTH = 2
    const val ALREADY_IN_USE = 3
    const val REJECTED = 4
}
