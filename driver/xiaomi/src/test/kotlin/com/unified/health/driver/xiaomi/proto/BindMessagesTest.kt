package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class BindMessagesTest {

    @Test
    fun `Na0 encodes appDeviceId and the 64-byte appPub`() {
        val appPub = ByteArray(64) { it.toByte() }
        val bytes = Na0("dev-42", appPub).encode()
        val expected = ProtoWriter().stringField(1, "dev-42").bytesField(2, appPub).toByteArray()
        assertEquals(expected.toHex(), bytes.toHex())
    }

    @Test
    fun `Ta0 decodes devicePub deviceSign and deviceRandom`() {
        val devicePub = ByteArray(64) { it.toByte() }
        val deviceSign = ByteArray(32) { (it + 1).toByte() }
        val deviceRandom = ByteArray(16) { (it + 2).toByte() }
        val bytes = ProtoWriter()
            .bytesField(1, devicePub)
            .bytesField(2, deviceSign)
            .bytesField(3, deviceRandom)
            .toByteArray()
        val ta0 = Ta0.decode(bytes)
        assertEquals(devicePub.toHex(), ta0.devicePub.toHex())
        assertEquals(deviceSign.toHex(), ta0.deviceSign.toHex())
        assertEquals(deviceRandom.toHex(), ta0.deviceRandom.toHex())
    }

    @Test
    fun `Ta0 decode throws when deviceRandom is missing`() {
        val bytes = ProtoWriter().bytesField(1, ByteArray(64)).bytesField(2, ByteArray(32)).toByteArray()
        assertThrows(MalformedPayloadException::class.java) { Ta0.decode(bytes) }
    }

    @Test
    fun `Ka0 round-trips appRandom and sign`() {
        val appRandom = ByteArray(16) { it.toByte() }
        val sign = ByteArray(32) { (it + 1).toByte() }
        val bytes = Ka0(appRandom, sign).encode()
        val reader = ProtoReader(bytes)
        var decodedRandom: ByteArray? = null
        var decodedSign: ByteArray? = null
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            when (tag.fieldNumber) {
                1 -> decodedRandom = reader.readLengthDelimited()
                2 -> decodedSign = reader.readLengthDelimited()
                else -> reader.skip(tag.wireType)
            }
        }
        assertEquals(appRandom.toHex(), decodedRandom?.toHex())
        assertEquals(sign.toHex(), decodedSign?.toHex())
    }

    @Test
    fun `Qa0 decodes confirmed true and false`() {
        assertTrue(Qa0.decode(ProtoWriter().boolField(1, true).toByteArray()).confirmed)
        assertFalse(Qa0.decode(ProtoWriter().boolField(1, false).toByteArray()).confirmed)
        assertFalse(Qa0.decode(ByteArray(0)).confirmed) // absent field 1 defaults to false
    }

    @Test
    fun `Wa0 wraps userId and the AppDeviceInfo submessage`() {
        val deviceInfo = AppDeviceInfo(sdkInt = 35.0f, model = "Pixel 9", region = "VN")
        val bytes = Wa0("user-9", deviceInfo).encode()
        val expected = ProtoWriter()
            .stringField(1, "user-9")
            .messageField(2, deviceInfo.encode())
            .toByteArray()
        assertEquals(expected.toHex(), bytes.toHex())
    }

    @Test
    fun `Pb0 wraps the encrypted bind result`() {
        val encrypted = ByteArray(20) { it.toByte() }
        val bytes = Pb0(encrypted).encode()
        assertEquals(ProtoWriter().bytesField(1, encrypted).toByteArray().toHex(), bytes.toHex())
    }
}
