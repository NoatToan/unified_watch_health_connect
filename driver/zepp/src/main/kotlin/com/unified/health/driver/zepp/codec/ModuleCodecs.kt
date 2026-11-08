package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes
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
 * `AuthModule` (channel module 0x80): the pre-Zepp-OS session auth, used when the BuiltInModule
 * list has an auth module but the channel version reply omitted the encrypt byte (§4 step 5,
 * `AuthModule.java:401-538` [V]). No ECDH: the session key *is* the auth key, so there is no
 * channel encryption either (`ChannelTransport.requiresEncryption` already returns false whenever
 * `encryptEnabled` is null, which is exactly this case). Local bind uses the same
 * `[0x01, apiLevel u16 LE, key]` command as 0x82 (`DeviceAuthorizationImpl1.java:162`).
 */
internal object AuthModule1Codec {
    const val MODULE = 0x80

    const val CMD_GET_AUTH_INFO = 0x00
    const val CMD_LOCAL_BIND = 0x01
    const val CMD_REQUEST_RANDOM = 0x04
    const val CMD_AUTHORIZE = 0x05

    /** `DeviceAuthorizationImpl1`/`AuthModule` API level (distinct from `ZeppOsAuthCodec.APP_API_LEVEL`). */
    const val APP_API_LEVEL = 1

    /** Fixed byte after the API level in the request (`AuthModule.java:424-435`, [V]). */
    private const val REQUEST_RANDOM_MARKER = 0x02

    /** `[0x00]`: asks which bind modes the firmware allows (`AuthModule.getAuthorizationInfo`, [V]). */
    fun getAuthorizationInfo(): ByteArray = byteArrayOf(CMD_GET_AUTH_INFO.toByte())

    /** Local bind `[0x01, apiLevel u16 LE, key(16)]` (`AuthModule.java:569-578`, [V]). */
    fun localBind(key: ByteArray): ByteArray {
        require(key.size == ZeppOsAuthCodec.RANDOM_SIZE) { "Key must be ${ZeppOsAuthCodec.RANDOM_SIZE} bytes" }
        return buildBytes(3 + key.size) {
            u8(CMD_LOCAL_BIND)
            u16le(APP_API_LEVEL)
            bytes(key)
        }
    }

    /** `[0x04, apiLevel u16 LE, 0x02]`; the successful reply's data is the 16-byte random challenge. */
    fun requestRandom(): ByteArray = buildBytes(4) {
        u8(CMD_REQUEST_RANDOM)
        u16le(APP_API_LEVEL)
        u8(REQUEST_RANDOM_MARKER)
    }

    fun parseRandom(data: ByteArray): ByteArray {
        if (data.size != ZeppOsAuthCodec.RANDOM_SIZE) {
            throw MalformedPayloadException("Module 0x80 random challenge has ${data.size} bytes")
        }
        return data
    }

    /** `[0x05, AES_ECB(authKey, random)(16)]`: no session key, unlike module 0x82 (`AuthModule.java:401-411`, [V]). */
    fun authorize(authKey: ByteArray, random: ByteArray): ByteArray =
        byteArrayOf(CMD_AUTHORIZE.toByte()) + AesEcb.encrypt(authKey, random)
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

/**
 * Huami legacy battery characteristic 0x0006 in FEE0 (`BatteryInfo.parseBatteryInfo`, §3.1 [V]):
 * `[flags, level, optional fields…]`. Flag bits add variable-length fields after the level:
 * bit0 DC status (+1), bit1 last-charge-full (+8), bit2 last-charge (+8), bit3 last-charge-level
 * (+1). Only the level is exposed; a truncated payload is rejected like the vendor parser does.
 */
internal object LegacyBatteryCodec {
    fun parseLevel(value: ByteArray): Int? {
        if (value.size < 2) return null
        val flags = value[0].toInt() and 0xFF
        val required = 2 +
            (if (flags and 0x01 != 0) 1 else 0) +
            (if (flags and 0x02 != 0) 8 else 0) +
            (if (flags and 0x04 != 0) 8 else 0) +
            (if (flags and 0x08 != 0) 1 else 0)
        if (value.size < required) return null
        return (value[1].toInt() and 0xFF).takeIf { it in 0..100 }
    }
}

/**
 * Zepp OS battery module 0x29 (`BatteryModule`, `BatteryCommand`, §3.1 [V]): query version
 * `0x01` (reply `0x02`), query battery `0x03`. The answer and the unsolicited notify both use
 * command `0x04`; after that command byte the payload is the common [LegacyBatteryCodec] layout.
 */
internal object ZeppOsBatteryCodec {
    const val MODULE = 0x29

    const val CMD_QUERY_VERSION = 0x01
    const val CMD_VERSION_RESPONSE = 0x02
    const val CMD_QUERY_BATTERY = 0x03
    const val CMD_BATTERY = 0x04

    /** The vendor only creates its battery API when the module version is 1 (`LullabyDevice.java:112`). */
    const val SUPPORTED_VERSION = 1

    fun queryVersion(): ByteArray = bytesOf(CMD_QUERY_VERSION)

    fun queryBattery(): ByteArray = bytesOf(CMD_QUERY_BATTERY)
}
