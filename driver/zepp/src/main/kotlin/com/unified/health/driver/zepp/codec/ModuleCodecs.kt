package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf

/**
 * BuiltInModule (channel module 0x00): the watch's list of supported modules (§3.4 [V],
 * `channel/module/BuiltInModule.java:365-430`). The reply's first byte echoes the command + 1.
 */
internal object BuiltInModuleCodec {
    const val MODULE = 0x00

    /** Used when the version reply carried the encrypt byte: entries are `module u16le, requireEncryption u8`. */
    const val CMD_LIST_WITH_ENCRYPTION = 0x03
    const val CMD_LIST_WITH_ENCRYPTION_REPLY = 0x04

    /** Older layout: entries are `module u8`, never encrypted. */
    const val CMD_LIST = 0x00
    const val CMD_LIST_REPLY = 0x01

    fun request(withEncryption: Boolean): ByteArray = bytesOf(if (withEncryption) CMD_LIST_WITH_ENCRYPTION else CMD_LIST)

    fun replyCommand(withEncryption: Boolean): Int = if (withEncryption) CMD_LIST_WITH_ENCRYPTION_REPLY else CMD_LIST_REPLY

    /**
     * @return module id → requireEncryption. Like the vendor parser, trailing bytes invalidate the list.
     * @throws MalformedPayloadException on a truncated or oversized reply.
     */
    fun parse(reply: ByteArray, withEncryption: Boolean): Map<Int, Boolean> {
        val reader = ByteReader(reply)
        if (reader.u8() != replyCommand(withEncryption)) throw MalformedPayloadException("Not a module list reply")
        val count = reader.u16le()
        val modules = LinkedHashMap<Int, Boolean>(count)
        repeat(count) {
            if (withEncryption) modules[reader.u16le()] = reader.u8() == 1 else modules[reader.u8()] = false
        }
        if (reader.remaining > 0) throw MalformedPayloadException("Module list has ${reader.remaining} trailing bytes")
        return modules
    }
}

/**
 * OpenAppModule (channel module 29 = 0x1D) realtime heart-rate switch on Zepp OS (§6.4 [V],
 * `channel/module/openapp/OpenAppModule.java:489-500, 614`, `OpenAppCommand.java:67, 78`,
 * `RealtimeHrState.java:10-12`). It only switches the sensor; readings still arrive on 0x2A37.
 */
internal object OpenAppCodec {
    const val MODULE = 0x1D

    const val CMD_REALTIME_HR = 0x04
    const val CMD_REALTIME_HR_RESULT = 0x05

    const val STATE_STOP = 0
    const val STATE_OPEN = 1
    const val STATE_KEEP = 2

    fun realtimeHr(state: Int): ByteArray = bytesOf(CMD_REALTIME_HR, state)

    fun isRealtimeHrResult(message: ByteArray): Boolean = message.isNotEmpty() && (message[0].toInt() and 0xFF) == CMD_REALTIME_HR_RESULT

    /** `[0x05, status]`; status 0 means accepted (`OpenAppModule.java:142-146`). */
    fun realtimeHrAccepted(message: ByteArray): Boolean = message.size >= 2 && message[1].toInt() and 0xFF == 0
}
