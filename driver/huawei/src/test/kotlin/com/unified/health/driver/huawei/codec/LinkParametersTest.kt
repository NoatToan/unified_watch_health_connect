package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.huawei.auth.HuaweiAuthMode
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class LinkParametersTest {

    private val randA = "a0a1a2a3a4a5a6a7a8a9aaabacadaeaf"

    @Test
    fun `parses frame sizes auth version randA and auth type`() {
        val response = HuaweiCommand.decode(
            ("0101 0101 01 020200fe 030200f4 04010a 0512 0003$randA 070102 090101 0c0101 0f0200f4").replace(" ", "").hexToBytes(),
        )
        val link = LinkParameters.parse(response)
        assertEquals(254, link.maxFrameSize)
        assertEquals(244, link.singleFrameSize)
        assertEquals(10, link.intervalMs)
        assertEquals(3, link.authVersion)
        assertEquals(randA, link.randA!!.toHex())
        assertEquals(2, link.authType)
        assertEquals(CipherMode.AES_GCM, link.cipherMode)
        assertEquals(false, link.keyMissing)
        assertEquals(244, link.singleFrameSizeDevice)
        assertEquals(listOf(HuaweiAuthMode.HICHAIN_LITE), HuaweiAuthMode.candidatesFor(link.authType))
    }

    @Test
    fun `applies the 2698 single frame quirk`() {
        val link = LinkParameters.parse(HuaweiCommand.decode("0101 02020a8a 03020a8a 0512 0001$randA".replace(" ", "").hexToBytes()))
        assertEquals(990, link.maxFrameSize)
        assertEquals(990, link.singleFrameSize)
    }

    @Test
    fun `rejects error, demo watch and missing auth version`() {
        for (hex in listOf("0101 7f0400000001", "0101 100101 0512 0001$randA", "0101 0202 00fe", "0101 0503 000102")) {
            try {
                LinkParameters.parse(HuaweiCommand.decode(hex.replace(" ", "").hexToBytes()))
                throw AssertionError("$hex should be rejected")
            } catch (e: LinkNegotiationException) {
                assertTrue(e.message!!.isNotEmpty())
            }
        }
    }

    @Test
    fun `auth candidates follow the app's selection`() {
        assertEquals(listOf(HuaweiAuthMode.HICHAIN, HuaweiAuthMode.HICHAIN_LITE), HuaweiAuthMode.candidatesFor(1))
        assertEquals(listOf(HuaweiAuthMode.HICHAIN_LITE), HuaweiAuthMode.candidatesFor(8))
        assertEquals(listOf(HuaweiAuthMode.HICHAIN3), HuaweiAuthMode.candidatesFor(4))
        assertEquals(listOf(HuaweiAuthMode.LEGACY_HMAC), HuaweiAuthMode.candidatesFor(0))
    }
}
