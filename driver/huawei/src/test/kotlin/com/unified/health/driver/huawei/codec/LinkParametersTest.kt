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
    fun `parses frame sizes auth version randA auth type and TLV 17`() {
        val response = HuaweiCommand.decode(
            ("0101 0101 01 020200fe 030200f4 04010a 0512 0003$randA 070102 090101 0c0101 0f0200f4 110101").replace(" ", "").hexToBytes(),
        )
        val link = LinkParameters.parse(response)
        assertEquals(254, link.maxFrameSize)
        assertEquals(244, link.singleFrameSize)
        assertEquals(10, link.intervalMs)
        assertEquals(3, link.authVersion)
        assertEquals(randA, link.randA!!.toHex())
        assertEquals(2, link.authType)
        assertEquals(1, link.authKeyInfoFlag)
        assertEquals(CipherMode.AES_GCM, link.cipherMode)
        assertEquals(false, link.keyMissing)
        assertEquals(244, link.singleFrameSizeDevice)
        assertEquals(listOf(HuaweiAuthMode.HICHAIN_LITE), HuaweiAuthMode.candidatesFor(link.authType))
    }

    @Test
    fun `auth selection uses TLV 7 while TLV 17 stays a diagnostic`() {
        // TLV 17 = 4 would select HiChain3 if it were the auth type; selection must stay on TLV 7
        // (absent here -> 0 -> legacy HMAC), matching cke.d() / cml.j() in the vendor code.
        val link = LinkParameters.parse(HuaweiCommand.decode("0101 0512 0001$randA 110104".replace(" ", "").hexToBytes()))
        assertEquals(0, link.authType)
        assertEquals(4, link.authKeyInfoFlag)
        assertEquals(listOf(HuaweiAuthMode.LEGACY_HMAC), HuaweiAuthMode.candidatesFor(link.authType))
    }

    @Test
    fun `applies the 2698 single frame quirk`() {
        val link = LinkParameters.parse(HuaweiCommand.decode("0101 02020a8a 03020a8a 0512 0001$randA".replace(" ", "").hexToBytes()))
        assertEquals(990, link.maxFrameSize)
        assertEquals(990, link.singleFrameSize)
    }

    @Test
    fun `authVersion zero selects the vendor no-app-auth branch`() {
        // cke.java:60-65: version 0 means "Device do not need authentic"; parsing must not reject it.
        val link = LinkParameters.parse(HuaweiCommand.decode("0101 0512 0000$randA".replace(" ", "").hexToBytes()))
        assertEquals(0, link.authVersion)
        assertEquals(randA, link.randA!!.toHex())
        assertEquals(0, link.authType)
    }

    @Test
    fun `rejects error, demo watch and malformed auth version`() {
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
