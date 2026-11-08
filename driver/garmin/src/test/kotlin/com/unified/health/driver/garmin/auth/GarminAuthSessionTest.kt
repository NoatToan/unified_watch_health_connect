package com.unified.health.driver.garmin.auth

import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.driver.garmin.codec.GfdiAck
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.Xxtea
import java.security.SecureRandom
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class GarminAuthSessionTest {

    private val mac = "AA:BB:CC:DD:EE:FF"
    private val passkey = ByteArray(16)
    private val watchRandom = ByteArray(16) { (it + 1).toByte() }

    @Test
    fun `just works auth completes and stores the ltk`() = runTest {
        val stored = mutableMapOf<String, ByteArray>()
        val failures = mutableListOf<Throwable>()
        var secure: GarminAuthCrypto.GarminSecureSession? = null
        var phoneRandom: ByteArray? = null
        var stk: ByteArray? = null

        val request: suspend (Int, ByteArray) -> GfdiAck = { id, payload ->
            when (id) {
                GarminAuthMessages.STK_CONFIRM -> GfdiAck(
                    id,
                    GfdiStatus.ACK,
                    byteArrayOf(0) + GarminAuthCrypto.confirm(passkey, watchRandom, mac),
                )
                GarminAuthMessages.STK_RANDOM -> {
                    phoneRandom = payload
                    GfdiAck(id, GfdiStatus.ACK, byteArrayOf(0) + watchRandom)
                }
                GarminAuthMessages.STK_RESULT -> GfdiAck(id, GfdiStatus.ACK, byteArrayOf(0))
                else -> GfdiAck(id, GfdiStatus.ACK)
            }
        }
        val session = GarminAuthSession(
            address = mac,
            deviceName = "Watch",
            request = request,
            credentials = CredentialReader { stored[it] },
            credentialWriter = object : CredentialWriter {
                override suspend fun put(key: String, value: ByteArray) {
                    stored[key] = value
                }

                override suspend fun remove(key: String) {
                    stored.remove(key)
                }
            },
            pairingCodes = null,
            random = SecureRandom(),
            onFailure = failures::add,
            onSecureSession = { secure = it },
        )

        val start = session.onMessage(GfdiMessage(GarminAuthMessages.START, byteArrayOf(0, 1, 0, 0, 0)))
        assertEquals(GfdiStatus.ACK, start.status)
        assertArrayEquals(byteArrayOf(0, 0, 1, 0, 0, 0), start.data)

        val mode = session.onMessage(GfdiMessage(GarminAuthMessages.PASSKEY_MODE, byteArrayOf(0, 30, 0, 0, 0, 1)))
        assertEquals(GfdiStatus.ACK, mode.status)
        mode.afterAck?.invoke()
        assertTrue(failures.toString(), failures.isEmpty())

        val phone = requireNotNull(phoneRandom)
        stk = GarminAuthCrypto.deriveStk(passkey, phone, watchRandom)
        val ltk = ByteArray(16) { (0x10 + it).toByte() }
        val ediv = byteArrayOf(1, 2)
        val rand = ByteArray(8) { (0x20 + it).toByte() }
        val ltkBlob = ltk + ediv + rand + ByteArray(6) // the vendor encrypts a 32-byte block
        val ltkReply = session.onMessage(
            GfdiMessage(GarminAuthMessages.LTK_DISTRIBUTION, byteArrayOf(0) + Xxtea.encrypt(ltkBlob, requireNotNull(stk))),
        )
        assertEquals(0, ltkReply.data[0].toInt())

        val diversifier = ByteArray(8) { (0x30 + it).toByte() }
        val diversifierReply = session.onMessage(GfdiMessage(GarminAuthMessages.SESSION_DIVERSIFIER, diversifier))
        val localRandom = diversifierReply.data.copyOfRange(1, 9)
        val sessionKey = GarminAuthCrypto.deriveSessionKey(ltk, diversifier, localRandom)

        val verifyBlob = sessionKey + ByteArray(8) { (0x40 + it).toByte() }
        val verify = session.onMessage(
            GfdiMessage(GarminAuthMessages.SESSION_VERIFY, byteArrayOf(0) + Xxtea.encrypt(verifyBlob, sessionKey)),
        )
        assertEquals(0, verify.data[0].toInt())

        val securePayload = Xxtea.encrypt(ByteArray(16) { (0x50 + it).toByte() }, sessionKey)
        val secureReply = session.onMessage(GfdiMessage(GarminAuthMessages.SECURE_SESSION, securePayload))
        assertEquals(16, secureReply.data.size)
        secureReply.afterAck?.invoke()

        assertEquals(GarminAuthSession.State.AUTHENTICATED, session.state)
        assertNotNull(secure)
        assertTrue(failures.toString(), failures.isEmpty())
        assertEquals(26, stored["garmin_auth_info"]?.size)
    }

    @Test
    fun `visible mode without a code requester fails with a clear error`() = runTest {
        val failures = mutableListOf<Throwable>()
        val session = GarminAuthSession(
            address = mac,
            deviceName = "Watch",
            request = { id, _ -> GfdiAck(id, GfdiStatus.ACK, byteArrayOf(0)) },
            credentials = CredentialReader { null },
            credentialWriter = CredentialWriter.None,
            pairingCodes = null,
            random = SecureRandom(),
            onFailure = failures::add,
            onSecureSession = {},
        )
        session.onMessage(GfdiMessage(GarminAuthMessages.START, byteArrayOf(0, 1, 0, 0, 0)))
        val mode = session.onMessage(GfdiMessage(GarminAuthMessages.PASSKEY_MODE, byteArrayOf(0, 30, 0, 0, 0, 0)))
        mode.afterAck?.invoke()
        assertEquals(GarminAuthSession.State.FAILED, session.state)
        assertEquals(1, failures.size)
    }
}
