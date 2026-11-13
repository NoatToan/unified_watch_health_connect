package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test

class P90Test {

    private val userIdMd5 = "e807f1fcf82d132f9bb018ca6738a19f".hexToBytes()

    @Test
    fun `Sb0 encodes the getBindInfo probe exactly like the test vector`() {
        // XIAOMI_TEST_VECTORS.json getBindInfo: userId "1234567890", its MD5 is userIdMd5 above.
        val bytes = Sb0(dynamicCode = false, userIdMd5 = userIdMd5).encode()
        assertEquals("08001210e807f1fcf82d132f9bb018ca6738a19f", bytes.toHex())
    }

    @Test
    fun `Sb0 requires a 16-byte md5`() {
        assertThrows(IllegalArgumentException::class.java) { Sb0(dynamicCode = false, userIdMd5 = ByteArray(10)).encode() }
    }

    @Test
    fun `P90 wraps Sb0 at field 11 exactly like the s7r vector`() {
        val sb0 = Sb0(dynamicCode = false, userIdMd5 = userIdMd5).encode()
        val bytes = P90(sb0 = sb0).encode()
        assertEquals("5a1408001210e807f1fcf82d132f9bb018ca6738a19f", bytes.toHex())
    }

    @Test
    fun `P90 decode extracts sb0 from the getBindInfo vector`() {
        val p90 = P90.decode("5a1408001210e807f1fcf82d132f9bb018ca6738a19f".hexToBytes())
        assertEquals("08001210e807f1fcf82d132f9bb018ca6738a19f", p90.sb0?.toHex())
        assertNull(p90.ha0)
        assertNull(p90.errorCode)
    }

    @Test
    fun `P90 round-trips an error code (p90 field 3, distinct from s7r field 100)`() {
        val bytes = P90(errorCode = 1).encode()
        assertEquals(1, P90.decode(bytes).errorCode)
    }

    @Test
    fun `Ha0 decodes every documented field`() {
        val bytes = ProtoWriter()
            .int32Field(1, Ha0.VERIFY_MODE_LOCAL_ECDH)
            .stringField(2, "SN12345")
            .stringField(3, "AA:BB:CC:DD:EE:FF")
            .stringField(4, "M2457B1")
            .int32Field(5, Ha0.OOB_MODE_BUTTON_CONFIRM)
            .int32Field(6, 0)
            .stringField(7, "DID999")
            .toByteArray()
        val ha0 = Ha0.decode(bytes)
        assertEquals(Ha0.VERIFY_MODE_LOCAL_ECDH, ha0.verifyMode)
        assertEquals("SN12345", ha0.serialNumber)
        assertEquals("AA:BB:CC:DD:EE:FF", ha0.mac)
        assertEquals("M2457B1", ha0.model)
        assertEquals(Ha0.OOB_MODE_BUTTON_CONFIRM, ha0.oobMode)
        assertEquals(0, ha0.reserved)
        assertEquals("DID999", ha0.did)
    }

    @Test
    fun `Ha0 tolerates missing optional fields`() {
        val bytes = ProtoWriter().int32Field(1, Ha0.VERIFY_MODE_PSK_CLOUD).toByteArray()
        val ha0 = Ha0.decode(bytes)
        assertEquals(Ha0.VERIFY_MODE_PSK_CLOUD, ha0.verifyMode)
        assertNull(ha0.serialNumber)
        assertNull(ha0.mac)
        assertNull(ha0.model)
        assertNull(ha0.oobMode)
        assertNull(ha0.did)
    }

    @Test
    fun `Ha0 decode throws when verifyMode (field 1) is missing`() {
        assertThrows(MalformedPayloadException::class.java) { Ha0.decode(ByteArray(0)) }
    }

    // ---- bind-handshake fields added for M2 (protocol §7.2 [V]) ----

    @Test
    fun `P90 round-trips the local-bind fields (na0 ta0 ka0 qa0 pb0)`() {
        val na0 = byteArrayOf(1, 2, 3)
        val ta0 = byteArrayOf(4, 5)
        val ka0 = byteArrayOf(6)
        val qa0 = byteArrayOf(7, 8, 9, 10)
        val pb0 = byteArrayOf(11)
        val decoded = P90.decode(P90(na0 = na0, ta0 = ta0, ka0 = ka0, qa0 = qa0, pb0 = pb0).encode())
        assertEquals(na0.toHex(), decoded.na0?.toHex())
        assertEquals(ta0.toHex(), decoded.ta0?.toHex())
        assertEquals(ka0.toHex(), decoded.ka0?.toHex())
        assertEquals(qa0.toHex(), decoded.qa0?.toHex())
        assertEquals(pb0.toHex(), decoded.pb0?.toHex())
    }

    @Test
    fun `P90 new fields do not disturb the sb0 ha0 errorCode vectors`() {
        val decoded = P90.decode("5a1408001210e807f1fcf82d132f9bb018ca6738a19f".hexToBytes())
        assertEquals("08001210e807f1fcf82d132f9bb018ca6738a19f", decoded.sb0?.toHex())
        assertNull(decoded.na0)
        assertNull(decoded.ta0)
        assertNull(decoded.ka0)
        assertNull(decoded.qa0)
        assertNull(decoded.pb0)
    }

    @Test
    fun `S7r wrapping a getBindInfo P90 matches the full test vector`() {
        // XIAOMI_TEST_VECTORS.json getBindInfo.s7r_hex: e=1, f=17 over the Sb0 built above.
        val sb0 = Sb0(dynamicCode = false, userIdMd5 = userIdMd5).encode()
        val bytes = S7r.request(S7r.CLASS_BIND, 17, P90(sb0 = sb0).encode()).encode()
        assertEquals("080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f", bytes.toHex())
    }
}
