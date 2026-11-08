package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class XxteaTest {

    @Test
    fun `matches the vendor ss2 n cipher vector`() {
        val key = "000102030405060708090a0b0c0d0e0f".hexToBytes()
        val data = "0102030405060708".hexToBytes()
        assertEquals("56f7991fe6946d54", Xxtea.encrypt(data, key).toHex())
        assertArrayEquals(data, Xxtea.decrypt("56f7991fe6946d54".hexToBytes(), key))
    }

    @Test
    fun `round trips multiples of four bytes`() {
        val key = "00112233445566778899aabbccddeeff".hexToBytes()
        for (size in intArrayOf(8, 16, 32, 64)) {
            val data = ByteArray(size) { (it * 7 + 3).toByte() }
            assertArrayEquals(data, Xxtea.decrypt(Xxtea.encrypt(data, key), key))
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rejects a single word because the vendor never uses it`() {
        Xxtea.encrypt(ByteArray(4), ByteArray(16))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rejects inputs that are not word aligned`() {
        Xxtea.encrypt(ByteArray(5), ByteArray(16))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rejects short keys`() {
        Xxtea.encrypt(ByteArray(4), ByteArray(8))
    }
}
