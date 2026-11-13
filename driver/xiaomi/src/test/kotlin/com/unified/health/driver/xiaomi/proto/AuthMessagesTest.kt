package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class AuthMessagesTest {

    private val appRandom = ByteArray(16) { it.toByte() }

    @Test
    fun `W90 requires a 16-byte appRandom`() {
        assertThrows(IllegalArgumentException::class.java) { W90(appRandom = ByteArray(10)).encode() }
    }

    @Test
    fun `W90 omits appDeviceId when null or empty`() {
        val withNull = ProtoReader(W90(appRandom, appDeviceId = null).encode())
        val withEmpty = ProtoReader(W90(appRandom, appDeviceId = "").encode())
        for (reader in listOf(withNull, withEmpty)) {
            var sawDeviceId = false
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                if (tag.fieldNumber == 2) sawDeviceId = true
                reader.skip(tag.wireType)
            }
            assertFalse(sawDeviceId)
        }
    }

    @Test
    fun `W90 encodes appRandom appDeviceId and hasOob`() {
        val bytes = W90(appRandom, appDeviceId = "dev-1", hasOob = true).encode()
        val expected = ProtoWriter()
            .bytesField(1, appRandom)
            .stringField(2, "dev-1")
            .boolField(3, true)
            .toByteArray()
        assertEquals(expected.toHex(), bytes.toHex())
    }

    @Test
    fun `Ca0 decodes deviceRandom and deviceSign`() {
        val deviceRandom = ByteArray(16) { (it + 1).toByte() }
        val deviceSign = ByteArray(32) { (it + 2).toByte() }
        val bytes = ProtoWriter().bytesField(1, deviceRandom).bytesField(2, deviceSign).toByteArray()
        val ca0 = Ca0.decode(bytes)
        assertEquals(deviceRandom.toHex(), ca0.deviceRandom.toHex())
        assertEquals(deviceSign.toHex(), ca0.deviceSign.toHex())
    }

    @Test
    fun `Ca0 decode throws when deviceSign is missing`() {
        val bytes = ProtoWriter().bytesField(1, ByteArray(16)).toByteArray()
        assertThrows(MalformedPayloadException::class.java) { Ca0.decode(bytes) }
    }

    @Test
    fun `AppDeviceInfo encodes exactly like the dc0 test vector`() {
        // XIAOMI_TEST_VECTORS.json authCcm.dc0_hex, decoded: sdkInt 35.0f, model "Pixel 9", region "VN".
        val bytes = AppDeviceInfo(sdkInt = 35.0f, model = "Pixel 9", region = "VN").encode()
        assertEquals("08001500000c421a07506978656c20392a02564e", bytes.toHex())
    }

    @Test
    fun `AppDeviceInfo omits appCapability when zero and region when empty`() {
        val bytes = AppDeviceInfo(sdkInt = 1.0f, model = "", appCapability = 0, region = "").encode()
        val reader = ProtoReader(bytes)
        val fields = mutableSetOf<Int>()
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            fields += tag.fieldNumber
            reader.skip(tag.wireType)
        }
        assertFalse(4 in fields) // appCapability
        assertFalse(5 in fields) // region
        assertFalse(6 in fields) // field 6 is always unused per the doc
    }

    @Test
    fun `AppDeviceInfo emits appCapability when non-zero`() {
        val bytes = AppDeviceInfo(sdkInt = 1.0f, model = "x", appCapability = 7).encode()
        val reader = ProtoReader(bytes)
        var sawCapability = false
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            if (tag.fieldNumber == 4) {
                sawCapability = true
                assertEquals(7L, reader.readVarint())
            } else {
                reader.skip(tag.wireType)
            }
        }
        assertTrue(sawCapability)
    }

    @Test
    fun `T90 round-trips appSign and encryptedInfo`() {
        val appSign = ByteArray(32) { it.toByte() }
        val encryptedInfo = "4d6daa007f881ae828d8107de55e8e8f93ac79d42c3afed1".hexToBytes()
        val bytes = T90(appSign, encryptedInfo).encode()
        val reader = ProtoReader(bytes)
        var decodedAppSign: ByteArray? = null
        var decodedInfo: ByteArray? = null
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            when (tag.fieldNumber) {
                1 -> decodedAppSign = reader.readLengthDelimited()
                2 -> decodedInfo = reader.readLengthDelimited()
                else -> reader.skip(tag.wireType)
            }
        }
        assertEquals(appSign.toHex(), decodedAppSign?.toHex())
        assertEquals(encryptedInfo.toHex(), decodedInfo?.toHex())
    }

    @Test
    fun `Z90 decodes confirmed true with capability bits`() {
        val bytes = ProtoWriter().boolField(1, true).int32Field(2, 5).int32Field(3, 9).toByteArray()
        val z90 = Z90.decode(bytes)
        assertTrue(z90.confirmed)
        assertEquals(5, z90.deviceCapability)
        assertEquals(9, z90.deviceCapabilityV2)
    }

    @Test
    fun `Z90 defaults confirmed to false and capability to null when absent`() {
        val z90 = Z90.decode(ByteArray(0))
        assertFalse(z90.confirmed)
        assertNull(z90.deviceCapability)
        assertNull(z90.deviceCapabilityV2)
    }
}
