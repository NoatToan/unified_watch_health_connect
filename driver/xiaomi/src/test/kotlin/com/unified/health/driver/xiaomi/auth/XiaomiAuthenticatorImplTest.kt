package com.unified.health.driver.xiaomi.auth

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.driver.xiaomi.FakeMiWearWatch
import com.unified.health.driver.xiaomi.XiaomiDriver
import com.unified.health.driver.xiaomi.crypto.aesCtrCrypt
import com.unified.health.driver.xiaomi.crypto.deriveAuthKeys
import com.unified.health.driver.xiaomi.crypto.deriveBindKeys
import com.unified.health.driver.xiaomi.crypto.generateEcKeyPair
import com.unified.health.driver.xiaomi.crypto.hmacSha256
import com.unified.health.driver.xiaomi.proto.Ca0
import com.unified.health.driver.xiaomi.proto.Ha0
import com.unified.health.driver.xiaomi.proto.P90
import com.unified.health.driver.xiaomi.proto.ProtoReader
import com.unified.health.driver.xiaomi.proto.ProtoWriter
import com.unified.health.driver.xiaomi.proto.Q90
import com.unified.health.driver.xiaomi.proto.Qa0
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.T7r
import com.unified.health.driver.xiaomi.proto.Ta0
import com.unified.health.driver.xiaomi.proto.Z90
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/**
 * Scripts a [FakeMiWearWatch] through the M2/M6 handshakes: the bind probe (protocol §7.1 [V]),
 * the full V2 session-auth nonce exchange (protocol §6.1 [V]), the full no-cloud local bind
 * (protocol §7.2 [V]) and V1's plaintext `CMD_SEND_USERID` (protocol §6.2 [V]), plus failure paths
 * for each. Unlike [XiaomiLinkTest]'s fixed-payload scripts, every V2/local-bind response here is
 * *computed* from the real request bytes -- those handshakes are nonce-based, so a canned response
 * would not exercise the actual crypto; V1 has no crypto to exercise, so its responses are canned.
 */
class XiaomiAuthenticatorImplTest {

    private fun TestScope.buildLink(watch: FakeMiWearWatch): XiaomiLink =
        XiaomiLink(watch.gatt, watch.write, watch.notify, backgroundScope, clock = { 0L })

    private fun credentials(vararg pairs: Pair<String, ByteArray>) = CredentialReader { key -> pairs.toMap()[key] }

    private class RecordingWriter : CredentialWriter {
        val written = mutableMapOf<String, ByteArray>()
        override suspend fun put(key: String, value: ByteArray) {
            written[key] = value
        }
        override suspend fun remove(key: String) = Unit
    }

    // ---- small test-only decoders for the request side of each message (production code never
    // needs to decode its own outgoing messages) ----

    private fun decodeFirstBytesField(bytes: ByteArray, fieldNumber: Int): ByteArray? {
        val reader = ProtoReader(bytes)
        var value: ByteArray? = null
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            if (tag.fieldNumber == fieldNumber) value = reader.readLengthDelimited() else reader.skip(tag.wireType)
        }
        return value
    }

    private fun decodeNa0AppPub(bytes: ByteArray): ByteArray = checkNotNull(decodeFirstBytesField(bytes, 2))

    private fun decodeKa0(bytes: ByteArray): Pair<ByteArray, ByteArray> =
        checkNotNull(decodeFirstBytesField(bytes, 1)) to checkNotNull(decodeFirstBytesField(bytes, 2))

    // ===== probeBindMode (protocol §7.1 [V]) =====

    @Test
    fun `probeBindMode decodes a local-ECDH ha0 response`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 17) {
            val ha0 = ProtoWriter()
                .int32Field(1, Ha0.VERIFY_MODE_LOCAL_ECDH)
                .stringField(2, "SN1")
                .stringField(3, "AA:BB:CC:DD:EE:FF")
                .stringField(4, "M2457B1")
                .int32Field(5, 0)
                .toByteArray()
            S7r(e = S7r.CLASS_BIND, f = 17, p90 = P90(ha0 = ha0).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        val probe = XiaomiAuthenticatorImpl().probeBindMode(link, userId = "1234567890")

        assertEquals(Ha0.VERIFY_MODE_LOCAL_ECDH, probe.verifyMode)
        assertEquals("SN1", probe.serialNumber)
        assertEquals("M2457B1", probe.model)
        // The vector in XIAOMI_TEST_VECTORS.json: md5("1234567890") is cross-checked in P90Test/XiaomiCryptoTest;
        // here we only confirm the probe sent *some* sb0 at all.
        assertTrue(watch.received.any { it.e == S7r.CLASS_BIND && it.f == 17 })
    }

    @Test
    fun `probeBindMode throws when the watch reports it is already bound`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 17) {
            S7r(e = S7r.CLASS_BIND, f = 17, p90 = P90(errorCode = P90.ERROR_ALREADY_BOUND).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().probeBindMode(link, userId = "user")
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("already bound"))
        }
    }

    @Test
    fun `probeBindMode times out when the watch never answers`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 17) { null }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().probeBindMode(link, userId = "user")
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("did not answer"))
        }
    }

    // ===== authenticateV2 (protocol §6.1 [V]) =====

    private val token = ByteArray(16) { it.toByte() }

    @Test
    fun `authenticateV2 completes the nonce handshake and installs AES-CTR session ciphers`() = runTest {
        val deviceRandom = ByteArray(16) { (0xB0 + it).toByte() }
        var sentAppRandom: ByteArray? = null

        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_NONCE) { s7r ->
            // s7r.p90 here is really the raw q90 bytes (S7r.decode's generic field3 slot happens to
            // line up with t7r's field3); unwrap q90.appVerify (field 30), then w90.appRandom (field 1).
            val w90Bytes = checkNotNull(decodeFirstBytesField(checkNotNull(s7r.p90), fieldNumber = Q90.FIELD_APP_VERIFY))
            val appRandom = checkNotNull(decodeFirstBytesField(w90Bytes, fieldNumber = 1))
            sentAppRandom = appRandom
            val keys = deriveAuthKeys(token, appRandom, deviceRandom)
            val ca0 = Ca0(deviceRandom, keys.deviceSign(deviceRandom, appRandom)).encode()
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_NONCE, p90 = Q90(deviceVerify = ca0).encode()).encode()
        }
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_AUTH) {
            val z90 = Z90(confirmed = true, deviceCapability = 5, deviceCapabilityV2 = 9).encode()
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_AUTH, p90 = Q90(deviceConfirm = z90).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        val result = XiaomiAuthenticatorImpl().authenticateV2(
            link,
            credentials(XiaomiDriver.AUTH_TOKEN.key to token),
        )

        assertEquals(5, result.deviceCapability)
        assertEquals(9, result.deviceCapabilityV2)
        val appRandom = checkNotNull(sentAppRandom)
        val keys = deriveAuthKeys(token, appRandom, deviceRandom)
        val plaintext = "hello".toByteArray()
        assertArrayEquals(aesCtrCrypt(keys.appKey, keys.appKey, plaintext), link.encrypt(plaintext))
        assertArrayEquals(aesCtrCrypt(keys.deviceKey, keys.deviceKey, plaintext), link.decrypt(plaintext))
    }

    @Test
    fun `authenticateV2 rejects a watch whose deviceSign does not match the token`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_NONCE) {
            val ca0 = Ca0(deviceRandom = ByteArray(16), deviceSign = ByteArray(32)).encode() // wrong sign
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_NONCE, p90 = Q90(deviceVerify = ca0).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV2(link, credentials(XiaomiDriver.AUTH_TOKEN.key to token))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("deviceSign"))
        }
    }

    @Test
    fun `authenticateV2 surfaces error code 4 (not bound) as an actionable AuthenticationException`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_NONCE) {
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_NONCE, p90 = Q90(errorCode = Q90.ERROR_NOT_BOUND).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV2(link, credentials(XiaomiDriver.AUTH_TOKEN.key to token))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("not bound"))
        }
    }

    @Test
    fun `authenticateV2 throws MissingCredentialException when no token is stored`() = runTest {
        val watch = FakeMiWearWatch()
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV2(link, CredentialReader { null })
            fail("expected MissingCredentialException")
        } catch (e: MissingCredentialException) {
            assertEquals(XiaomiDriver.AUTH_TOKEN, e.requirement)
        }
    }

    // ===== localBind (protocol §7.2 [V]) =====

    @Test
    fun `localBind completes the full ECDH handshake and persists the new token`() = runTest {
        val deviceKeyPair = generateEcKeyPair()
        val deviceRandom = ByteArray(16) { (0xC0 + it).toByte() }
        var sharedKeyOnWatch: ByteArray? = null
        var appRandomSeen: ByteArray? = null

        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 18) { s7r ->
            val na0 = checkNotNull(P90.decode(checkNotNull(s7r.p90)).na0)
            val appPub = decodeNa0AppPub(na0)
            val sharedKey = deviceKeyPair.sharedSecret(appPub)
            sharedKeyOnWatch = sharedKey
            val deviceSign = hmacSha256(sharedKey, deviceRandom)
            val ta0 = Ta0(deviceKeyPair.publicKey, deviceSign, deviceRandom).encode()
            S7r(e = S7r.CLASS_BIND, f = 18, p90 = P90(ta0 = ta0).encode()).encode()
        }
        watch.onRequest(S7r.CLASS_BIND, 19) { s7r ->
            val ka0 = checkNotNull(P90.decode(checkNotNull(s7r.p90)).ka0)
            val (appRandom, sign) = decodeKa0(ka0)
            appRandomSeen = appRandom
            assertArrayEquals(hmacSha256(checkNotNull(sharedKeyOnWatch), appRandom), sign)
            val qa0 = Qa0(confirmed = true).encode()
            S7r(e = S7r.CLASS_BIND, f = 19, p90 = P90(qa0 = qa0).encode()).encode()
        }
        watch.onRequest(S7r.CLASS_BIND, 25) {
            S7r(e = S7r.CLASS_BIND, f = 25, p90 = P90().encode()).encode()
        }
        val link = buildLink(watch)
        link.start()
        val writer = RecordingWriter()

        val result = XiaomiAuthenticatorImpl().localBind(link, userId = "user-1", appDeviceId = "dev-1", credentialWriter = writer)

        val expectedKeys = deriveBindKeys(checkNotNull(sharedKeyOnWatch), checkNotNull(appRandomSeen), deviceRandom)
        assertArrayEquals(expectedKeys.token, checkNotNull(result.token))
        assertEquals("dev-1", result.appDeviceId)
        assertArrayEquals(expectedKeys.token, writer.written[XiaomiDriver.AUTH_TOKEN.key])
        assertEquals("user-1", writer.written[XiaomiDriver.USER_ID.key]?.toString(Charsets.UTF_8))
        assertEquals("dev-1", writer.written[XiaomiDriver.APP_DEVICE_ID.key]?.toString(Charsets.UTF_8))
    }

    @Test
    fun `localBind rejects a watch ECDH signature that does not match the shared secret`() = runTest {
        val deviceKeyPair = generateEcKeyPair()
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 18) {
            val ta0 = Ta0(deviceKeyPair.publicKey, deviceSign = ByteArray(32), deviceRandom = ByteArray(16)).encode()
            S7r(e = S7r.CLASS_BIND, f = 18, p90 = P90(ta0 = ta0).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().localBind(link, userId = "u", appDeviceId = "d", credentialWriter = CredentialWriter.None)
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("ECDH"))
        }
    }

    @Test
    fun `localBind rejects a declined confirmation (qa0 confirmed == false)`() = runTest {
        val deviceKeyPair = generateEcKeyPair()
        val deviceRandom = ByteArray(16) { (0xD0 + it).toByte() }
        var sharedKeyOnWatch: ByteArray? = null

        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, 18) { s7r ->
            val na0 = checkNotNull(P90.decode(checkNotNull(s7r.p90)).na0)
            val appPub = decodeNa0AppPub(na0)
            val sharedKey = deviceKeyPair.sharedSecret(appPub)
            sharedKeyOnWatch = sharedKey
            val deviceSign = hmacSha256(sharedKey, deviceRandom)
            S7r(e = S7r.CLASS_BIND, f = 18, p90 = P90(ta0 = Ta0(deviceKeyPair.publicKey, deviceSign, deviceRandom).encode()).encode()).encode()
        }
        watch.onRequest(S7r.CLASS_BIND, 19) {
            S7r(e = S7r.CLASS_BIND, f = 19, p90 = P90(qa0 = Qa0(confirmed = false).encode()).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().localBind(link, userId = "u", appDeviceId = "d", credentialWriter = CredentialWriter.None)
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("declined"))
        }
        assertFalse(sharedKeyOnWatch == null) // sanity: the ECDH step did run
    }

    // ===== authenticateV1 (protocol §6.2 [V]) =====

    @Test
    fun `authenticateV1 sends the stored user id and succeeds on a true success flag`() = runTest {
        val watch = FakeMiWearWatch()
        var sentUserId: String? = null
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_SEND_USERID) { s7r ->
            sentUserId = checkNotNull(decodeFirstBytesField(checkNotNull(s7r.p90), Q90.FIELD_USER_ID)).toString(Charsets.UTF_8)
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_SEND_USERID, p90 = Q90(success = true).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        val result = XiaomiAuthenticatorImpl().authenticateV1(link, credentials(XiaomiDriver.USER_ID.key to "mi-fitness-user-1".toByteArray()))

        assertEquals("mi-fitness-user-1", sentUserId)
        assertEquals(null, result.token) // V1 has no token/HKDF exchange to produce one
    }

    @Test
    fun `authenticateV1 surfaces error code 4 as an actionable not-bound message`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_SEND_USERID) {
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_SEND_USERID, p90 = Q90(errorCode = Q90.ERROR_NOT_BOUND).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV1(link, credentials(XiaomiDriver.USER_ID.key to "user".toByteArray()))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("not bound"))
            assertTrue(e.message!!.contains("Mi Fitness"))
        }
    }

    @Test
    fun `authenticateV1 surfaces a generic error code`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_SEND_USERID) {
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_SEND_USERID, p90 = Q90(errorCode = 99).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV1(link, credentials(XiaomiDriver.USER_ID.key to "user".toByteArray()))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("99"))
        }
    }

    @Test
    fun `authenticateV1 rejects a reply with neither a success flag nor an error code`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_SEND_USERID) {
            S7r(e = S7r.CLASS_BIND, f = T7r.CMD_SEND_USERID, p90 = Q90().encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV1(link, credentials(XiaomiDriver.USER_ID.key to "user".toByteArray()))
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("did not confirm"))
        }
    }

    @Test
    fun `authenticateV1 throws MissingCredentialException when no user id is stored`() = runTest {
        val watch = FakeMiWearWatch()
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV1(link, CredentialReader { null })
            fail("expected MissingCredentialException")
        } catch (e: MissingCredentialException) {
            assertEquals(XiaomiDriver.USER_ID, e.requirement)
        }
    }

    @Test
    fun `authenticateV1 times out when the watch never answers`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_BIND, T7r.CMD_SEND_USERID) { null }
        val link = buildLink(watch)
        link.start()

        try {
            XiaomiAuthenticatorImpl().authenticateV1(link, credentials(XiaomiDriver.USER_ID.key to "user".toByteArray()))
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("did not answer"))
        }
    }
}
