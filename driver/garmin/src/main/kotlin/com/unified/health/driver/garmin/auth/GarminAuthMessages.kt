package com.unified.health.driver.garmin.auth

import com.unified.health.driver.garmin.codec.GfdiMessageId

/**
 * Wire helpers for Garmin's app-level auth (`ss2/c.java`, `ss2/a.java` [V]).
 * See `docs/analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md`.
 */
internal object GarminAuthMessages {

    const val START = 5101
    const val PASSKEY_MODE = 5103
    const val STK_CONFIRM = 5104
    const val STK_RANDOM = 5105
    const val STK_RESULT = 5106
    const val LTK_DISTRIBUTION = 5107
    const val SESSION_DIVERSIFIER = 5108
    const val SESSION_VERIFY = 5109
    const val SECURE_SESSION = 5111

    val IDS = GfdiMessageId.GARMIN_AUTH

    const val MODE_VISIBLE = 0
    const val MODE_JUST_WORKS = 1
    const val MODE_OUT_OF_BAND = 2

    const val DEFAULT_PASSKEY_TIMEOUT_SECONDS = 30

    data class Start(val status: Int, val algorithmMask: Int)
    data class PasskeyMode(val timeoutSeconds: Int, val mode: Int)

    /** 5101 payload: `status u8 | algorithmMask u32 LE` (the host offers XXTEA only). */
    fun parseStart(payload: ByteArray): Start {
        require(payload.size >= 5) { "5101 payload too short: ${payload.size}" }
        return Start(status = payload[0].toInt() and 0xFF, algorithmMask = readU32Le(payload, 1))
    }

    /** ACK to 5101: `0 | hasLtk | algorithmMask u32 LE` (`ss2/c.onMessageReceived`, 5101 arm). */
    fun startAck(hasLongTermKey: Boolean, algorithmMask: Int): ByteArray = byteArrayOf(
        0,
        if (hasLongTermKey) 1 else 0,
        (algorithmMask and 0xFF).toByte(),
        ((algorithmMask ushr 8) and 0xFF).toByte(),
        ((algorithmMask ushr 16) and 0xFF).toByte(),
        ((algorithmMask ushr 24) and 0xFF).toByte(),
    )

    /** 5103 payload: `? | timeout u16 LE at 1 | ? | mode u8 at 5` (vendor accepts modes 0..2). */
    fun parsePasskeyMode(payload: ByteArray): PasskeyMode {
        require(payload.size >= 6) { "5103 payload too short: ${payload.size}" }
        val timeout = readU16Le(payload, 1).takeIf { it > 0 } ?: DEFAULT_PASSKEY_TIMEOUT_SECONDS
        return PasskeyMode(timeoutSeconds = timeout, mode = payload[5].toInt() and 0xFF)
    }

    /** ACK to 5103: `0 | mode` (255 signals an unsupported mode to the watch). */
    fun passkeyAck(mode: Int): ByteArray = byteArrayOf(0, if (mode in 0..2) mode.toByte() else 0xFF.toByte())

    /**
     * Response to 5104/5105: `status u8 | 16-byte value` (`ss2/c.e`/`f`). Returns the 16 bytes when
     * the watch reported status 0, otherwise null.
     */
    fun parseRandomResponse(data: ByteArray): ByteArray? {
        if (data.size < 17 || data[0].toInt() != 0) return null
        return data.copyOfRange(1, 17)
    }

    /** 5107 payload: `status u8 | XXTEA(ltk[16] | ediv[2] | rand[8], stk)` (`ss2/c.onMessageReceived`). */
    fun parseLtkDistribution(payload: ByteArray, stk: ByteArray): GarminAuthCrypto.AuthInfo {
        require(payload.size >= 33) { "5107 payload too short: ${payload.size}" }
        val decrypted = com.unified.health.driver.garmin.codec.Xxtea.decrypt(payload.copyOfRange(1, 33), stk)
        return GarminAuthCrypto.AuthInfo(
            ltk = decrypted.copyOfRange(0, 16),
            ediv = decrypted.copyOfRange(16, 18),
            rand = decrypted.copyOfRange(18, 26),
        )
    }

    /** 5108 payload: the watch's 8-byte diversifier at offset 0 (`ss2/c.onMessageReceived`). */
    fun parseSessionDiversifier(payload: ByteArray): ByteArray {
        require(payload.size >= 8) { "5108 payload too short: ${payload.size}" }
        return payload.copyOfRange(0, 8)
    }

    fun sessionKeyAck(status: Int, localRandom: ByteArray): ByteArray = byteArrayOf(status.toByte()) + localRandom

    fun verifyAck(status: Int): ByteArray = byteArrayOf(status.toByte())

    fun stkResult(success: Boolean): ByteArray = byteArrayOf(if (success) 0 else 1)

    /**
     * The vendor converts the user's numeric passkey with `Integer.parseInt` and writes it as a
     * little-endian int, zero-padded to 16 bytes (`ss2/w.a`, `ss2/n.d`) [V].
     */
    fun passkeyFromCode(code: String): ByteArray? {
        val value = code.trim().toIntOrNull() ?: return null
        val out = ByteArray(GarminAuthCrypto.KEY_SIZE)
        for (i in 0 until 4) out[i] = ((value ushr (8 * i)) and 0xFF).toByte()
        return out
    }

    fun serialiseAuthInfo(info: GarminAuthCrypto.AuthInfo): ByteArray = info.ltk + info.ediv + info.rand

    fun parseAuthInfo(bytes: ByteArray?): GarminAuthCrypto.AuthInfo? {
        if (bytes == null || bytes.size < 26) return null
        return runCatching {
            GarminAuthCrypto.AuthInfo(
                ltk = bytes.copyOfRange(0, 16),
                ediv = bytes.copyOfRange(16, 18),
                rand = bytes.copyOfRange(18, 26),
            )
        }.getOrNull()
    }

    private fun readU16Le(data: ByteArray, offset: Int): Int =
        (data[offset].toInt() and 0xFF) or ((data[offset + 1].toInt() and 0xFF) shl 8)

    private fun readU32Le(data: ByteArray, offset: Int): Int =
        (data[offset].toInt() and 0xFF) or
            ((data[offset + 1].toInt() and 0xFF) shl 8) or
            ((data[offset + 2].toInt() and 0xFF) shl 16) or
            ((data[offset + 3].toInt() and 0xFF) shl 24)
}
