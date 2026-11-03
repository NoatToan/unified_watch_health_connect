package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes

/**
 * A module / control-point response `[0x10, cmd, status, data…]` (`HMNotifyResponse.java:49-71`,
 * `AuthModule.java:169-182`, §3.3 [V]).
 */
internal class CommandResponse(val command: Int, val status: Int, val data: ByteArray) {
    val isSuccess: Boolean get() = status == CommandResponse.STATUS_OK

    companion object {
        const val MARKER = 0x10
        const val STATUS_OK = 1

        /** @return null when [frame] is not a response (wrong marker or shorter than 3 bytes). */
        fun parse(frame: ByteArray): CommandResponse? {
            if (frame.size < 3 || (frame[0].toInt() and 0xFF) != MARKER) return null
            return CommandResponse(frame[1].toInt() and 0xFF, frame[2].toInt() and 0xFF, frame.copyOfRange(3, frame.size))
        }
    }
}

/** Watch answer to the 0x82 "request auth" command: 16 random bytes and its ephemeral public key. */
internal class AuthChallenge(val random: ByteArray, val watchPublicKey: ByteArray)

/**
 * Zepp OS session auth on channel module 0x0082 (`AuthModule2`, `DeviceAuthorizationImpl2.a`,
 * §5.2 [V]). Pure byte layouts; the flow lives in `ZeppHandshake`.
 */
internal object ZeppOsAuthCodec {
    const val MODULE = 0x0082
    const val CMD_GET_AUTH_INFO = 0x00
    const val CMD_LOCAL_BIND = 0x01
    const val CMD_REQUEST_AUTH = 0x04
    const val CMD_AUTHORIZE = 0x05

    /** `DeviceAuthorizationImpl2.APP_API_LEVEL` (§5.2 step 2, [V]). */
    const val APP_API_LEVEL = 2

    /** Fixed byte after the API level in the request (`AuthModule2.java:153-154`, [V]). */
    private const val REQUEST_AUTH_MARKER = 0x02

    const val RANDOM_SIZE = 16

    /** `[0x00]`: asks which bind modes the firmware allows (§5.2 step 0, `AuthModule.java:425-435`). */
    fun getAuthorizationInfo(): ByteArray = byteArrayOf(CMD_GET_AUTH_INFO.toByte())

    /**
     * `allowLocalBinding` of a successful info response `version u8 ‖ apiLevel u16 ‖ allowLocalBinding u8`
     * (`AuthorizationProtocolInfo.java:42`); null when the data is too short.
     */
    fun parseAllowLocalBinding(data: ByteArray): Boolean? = data.getOrNull(3)?.let { it.toInt() == 1 }

    /** Local bind `[0x01, apiLevel u16 LE, key(16)]`; the answer code is 1 = OK, 2 = user refused (§5.3 step 5). */
    fun localBind(key: ByteArray): ByteArray {
        require(key.size == RANDOM_SIZE) { "Key must be $RANDOM_SIZE bytes" }
        return buildBytes(3 + key.size) {
            u8(CMD_LOCAL_BIND)
            u16le(APP_API_LEVEL)
            bytes(key)
        }
    }

    /** `[0x04, apiLevel u16 LE, 0x02, pubPhone(48)]` (§5.2 step 2). */
    fun requestAuth(phonePublicKey: ByteArray): ByteArray {
        require(phonePublicKey.size == B163Ecdh.PUBLIC_KEY_SIZE) { "Public key must be ${B163Ecdh.PUBLIC_KEY_SIZE} bytes" }
        return buildBytes(4 + phonePublicKey.size) {
            u8(CMD_REQUEST_AUTH)
            u16le(APP_API_LEVEL)
            u8(REQUEST_AUTH_MARKER)
            bytes(phonePublicKey)
        }
    }

    /**
     * Parses the data of a successful CMD_REQUEST_AUTH response: `random(16) ‖ pubWatch(48)` (§5.2 step 3).
     * @throws MalformedPayloadException when shorter than 64 bytes.
     */
    fun parseChallenge(data: ByteArray): AuthChallenge {
        val reader = ByteReader(data)
        return AuthChallenge(random = reader.bytes(RANDOM_SIZE), watchPublicKey = reader.bytes(B163Ecdh.PUBLIC_KEY_SIZE))
    }

    /** `[0x05, AES(authKey, random), AES(sessionKey, random)]` (§5.2 step 6). */
    fun authorize(authKey: ByteArray, sessionKey: ByteArray, random: ByteArray): ByteArray {
        require(random.size == RANDOM_SIZE) { "Random must be $RANDOM_SIZE bytes" }
        return byteArrayOf(CMD_AUTHORIZE.toByte()) + AesEcb.encrypt(authKey, random) + AesEcb.encrypt(sessionKey, random)
    }
}

/**
 * Legacy auth on characteristic 0x0009 for watches without the channel (`HMProAuthProfile`, §5.5 [V]).
 * The appId byte is `HMBleConfig.APP_ID` = 0; the optional flag bits (`0x80`) are not used.
 */
internal object LegacyAuthCodec {
    const val CMD_BIND = 0x01
    const val CMD_REQUEST_RANDOM = 0x02
    const val CMD_SEND_ENCRYPTED = 0x03

    /** `[0x01, appId, key(16)]`: stores a new auth key while the watch is unbound (`HMProAuthProfile.java:165-176`, [V]). */
    fun bind(key: ByteArray): ByteArray {
        require(key.size == ZeppOsAuthCodec.RANDOM_SIZE) { "Key must be ${ZeppOsAuthCodec.RANDOM_SIZE} bytes" }
        return byteArrayOf(CMD_BIND.toByte(), ChannelCodec.APP_ID.toByte()) + key
    }

    /** Third byte of the random request (`getRandom`, `HMProAuthProfile.java:293-312`, [V]). */
    private const val RANDOM_REQUEST_SUFFIX = 0x02

    /** `[0x02, appId, 0x02]`, tried first by the vendor app. */
    fun requestRandom(): ByteArray = byteArrayOf(CMD_REQUEST_RANDOM.toByte(), ChannelCodec.APP_ID.toByte(), RANDOM_REQUEST_SUFFIX.toByte())

    /** `[0x02, appId]`, the vendor app's fallback when the first form is refused. */
    fun requestRandomShort(): ByteArray = byteArrayOf(CMD_REQUEST_RANDOM.toByte(), ChannelCodec.APP_ID.toByte())

    /** `[0x03, appId, AES(key, random)]` (`HMProAuthProfile.java:110-121`, [V]). */
    fun sendEncryptedRandom(authKey: ByteArray, random: ByteArray): ByteArray {
        require(random.size == ZeppOsAuthCodec.RANDOM_SIZE) { "Random must be ${ZeppOsAuthCodec.RANDOM_SIZE} bytes" }
        return byteArrayOf(CMD_SEND_ENCRYPTED.toByte(), ChannelCodec.APP_ID.toByte()) + AesEcb.encrypt(authKey, random)
    }
}
