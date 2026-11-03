package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class AuthCodecTest {

    private val key = "000102030405060708090a0b0c0d0e0f".hexToBytes()
    private val random = "00112233445566778899aabbccddeeff".hexToBytes()

    @Test
    fun `request auth carries api level 2 and the public key`() {
        val pub = ByteArray(48) { it.toByte() }
        val request = ZeppOsAuthCodec.requestAuth(pub)
        assertArrayEquals(bytesOf(0x04, 0x02, 0x00, 0x02), request.copyOfRange(0, 4))
        assertArrayEquals(pub, request.copyOfRange(4, 52))
    }

    @Test
    fun `parses the challenge`() {
        val data = ByteArray(64) { it.toByte() }
        val challenge = ZeppOsAuthCodec.parseChallenge(data)
        assertArrayEquals(data.copyOfRange(0, 16), challenge.random)
        assertArrayEquals(data.copyOfRange(16, 64), challenge.watchPublicKey)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `short challenge is malformed`() {
        ZeppOsAuthCodec.parseChallenge(ByteArray(63))
    }

    @Test
    fun `authorize encrypts the random with both keys`() {
        val message = ZeppOsAuthCodec.authorize(key, key, random)
        assertEquals(33, message.size)
        assertEquals(0x05, message[0].toInt())
        assertEquals("69c4e0d86a7b0430d8cdb78070b4c55a", message.copyOfRange(1, 17).toHex())
        assertEquals("69c4e0d86a7b0430d8cdb78070b4c55a", message.copyOfRange(17, 33).toHex())
    }

    @Test
    fun `parses command responses`() {
        val ok = CommandResponse.parse(bytesOf(0x10, 0x05, 0x01))!!
        assertTrue(ok.isSuccess)
        assertEquals(0x05, ok.command)
        assertEquals(2, CommandResponse.parse(bytesOf(0x10, 0x04, 0x02, 0xAA))!!.status)
        assertNull(CommandResponse.parse(bytesOf(0x11, 0x05, 0x01)))
        assertNull(CommandResponse.parse(bytesOf(0x10, 0x05)))
    }

    @Test
    fun `legacy commands`() {
        assertArrayEquals(bytesOf(0x02, 0x00, 0x02), LegacyAuthCodec.requestRandom())
        assertArrayEquals(bytesOf(0x02, 0x00), LegacyAuthCodec.requestRandomShort())
        val proof = LegacyAuthCodec.sendEncryptedRandom(key, random)
        assertEquals("0300" + "69c4e0d86a7b0430d8cdb78070b4c55a", proof.toHex())
    }
}
