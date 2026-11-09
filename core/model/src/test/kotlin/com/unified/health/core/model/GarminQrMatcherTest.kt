package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class GarminQrMatcherTest {

    private fun device(
        name: String = "Forerunner 265",
        mac: String = "AA:BB:CC:DD:EE:FF",
        rssi: Int? = -60,
        vendor: WearableVendor = WearableVendor.GARMIN,
        manufacturerDataHex: String? = null,
        productNumber: String? = null,
    ): DiscoveredDevice {
        val identifiers = buildMap {
            manufacturerDataHex?.let { put(VendorIdentifierKeys.GARMIN_MANUFACTURER_DATA, it) }
            productNumber?.let { put(VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER, it) }
        }
        return DiscoveredDevice(name, mac, rssi, vendor, vendorIdentifiers = identifiers)
    }

    private fun le(value: Long): String {
        val b0 = value and 0xFF
        val b1 = (value shr 8) and 0xFF
        val b2 = (value shr 16) and 0xFF
        val b3 = (value shr 24) and 0xFF
        return "%02x%02x%02x%02x".format(b0, b1, b2, b3)
    }

    private fun be(value: Long): String {
        val b0 = value and 0xFF
        val b1 = (value shr 8) and 0xFF
        val b2 = (value shr 16) and 0xFF
        val b3 = (value shr 24) and 0xFF
        return "%02x%02x%02x%02x".format(b3, b2, b1, b0)
    }

    // --- (1) unitId match -------------------------------------------------------------------------

    @Test
    fun `matches by little-endian unitId anywhere in the payload`() {
        val unitId = 123_456_789L
        val match = device(mac = "11:11:11:11:11:11", manufacturerDataHex = "aaaa" + le(unitId) + "bbbb")
        val noise = device(mac = "22:22:22:22:22:22", manufacturerDataHex = "000000000000")
        val result = GarminQrMatcher.select(listOf(noise, match), QrPairingHint.Garmin(unitId, null))
        assertEquals(match, result)
    }

    @Test
    fun `matches by big-endian unitId anywhere in the payload`() {
        val unitId = 987_654L
        val match = device(mac = "11:11:11:11:11:11", manufacturerDataHex = "0f96" + be(unitId))
        val result = GarminQrMatcher.select(listOf(match), QrPairingHint.Garmin(unitId, null))
        assertEquals(match, result)
    }

    @Test
    fun `prefers highest rssi when several candidates contain the unitId`() {
        val unitId = 42L
        val weak = device(mac = "11:11:11:11:11:11", rssi = -80, manufacturerDataHex = le(unitId))
        val strong = device(mac = "22:22:22:22:22:22", rssi = -40, manufacturerDataHex = le(unitId))
        val result = GarminQrMatcher.select(listOf(weak, strong), QrPairingHint.Garmin(unitId, null))
        assertEquals(strong, result)
    }

    @Test
    fun `unitId outside u32 range is not searched and falls through to the other rules`() {
        val tooBig = 1L shl 40
        val only = device(mac = "11:11:11:11:11:11", manufacturerDataHex = "aabbcc")
        val result = GarminQrMatcher.select(listOf(only), QrPairingHint.Garmin(tooBig, null))
        assertEquals(only, result) // rule (3): exactly one Garmin candidate
    }

    // --- (2) productNumber match -------------------------------------------------------------------

    @Test
    fun `falls back to the product-number identifier when unitId does not match`() {
        val unitId = 1L
        val wrong = device(mac = "11:11:11:11:11:11", manufacturerDataHex = le(999L))
        val right = device(mac = "22:22:22:22:22:22", productNumber = "006483")
        val result = GarminQrMatcher.select(listOf(wrong, right), QrPairingHint.Garmin(unitId, "006483"))
        assertEquals(right, result)
    }

    @Test
    fun `falls back to productNumber as u16 LE at offset 0-1 when the identifier is missing`() {
        val right = device(mac = "22:22:22:22:22:22", manufacturerDataHex = "9601" + "aabb") // 0x0196 = 406 LE
        val result = GarminQrMatcher.select(listOf(right), QrPairingHint.Garmin(null, "406"))
        assertEquals(right, result)
    }

    @Test
    fun `falls back to productNumber as u16 BE at offset 0-1 when the identifier is missing`() {
        val right = device(mac = "22:22:22:22:22:22", manufacturerDataHex = "0196" + "aabb") // 0x0196 = 406 BE
        val result = GarminQrMatcher.select(listOf(right), QrPairingHint.Garmin(null, "406"))
        assertEquals(right, result)
    }

    @Test
    fun `productNumber match is ignored when ambiguous between several candidates`() {
        val one = device(mac = "11:11:11:11:11:11", productNumber = "006483")
        val two = device(mac = "22:22:22:22:22:22", productNumber = "006483")
        val result = GarminQrMatcher.select(listOf(one, two), QrPairingHint.Garmin(null, "006483"))
        assertNull(result)
    }

    // --- (3) single Garmin candidate fallback --------------------------------------------------------

    @Test
    fun `falls back to the only Garmin candidate when no identifier matches anything`() {
        val only = device(mac = "11:11:11:11:11:11")
        val result = GarminQrMatcher.select(listOf(only), QrPairingHint.Garmin(999L, "no-match"))
        assertEquals(only, result)
    }

    @Test
    fun `non-Garmin candidates are ignored even if they slip through`() {
        val garmin = device(mac = "11:11:11:11:11:11")
        val zepp = device(mac = "22:22:22:22:22:22", vendor = WearableVendor.ZEPP)
        val result = GarminQrMatcher.select(listOf(garmin, zepp), QrPairingHint.Garmin(null, null))
        assertEquals(garmin, result)
    }

    // --- null cases -----------------------------------------------------------------------------------

    @Test
    fun `returns null for an empty candidate list`() {
        assertNull(GarminQrMatcher.select(emptyList(), QrPairingHint.Garmin(1L, "x")))
    }

    @Test
    fun `returns null when nothing matches and there are several Garmin candidates`() {
        val one = device(mac = "11:11:11:11:11:11")
        val two = device(mac = "22:22:22:22:22:22")
        val result = GarminQrMatcher.select(listOf(one, two), QrPairingHint.Garmin(999L, "no-match"))
        assertNull(result)
    }

    @Test
    fun `candidates without manufacturer-data hex are skipped by the byte-level rules, not crashed`() {
        val noPayload = device(mac = "11:11:11:11:11:11")
        val result = GarminQrMatcher.select(listOf(noPayload), QrPairingHint.Garmin(42L, "x"))
        assertEquals(noPayload, result) // falls through to rule (3)
    }

    @Test
    fun `bonded-only Garmin without rssi is not picked by the single-candidate fallback`() {
        val bondedOld = device(mac = "33:33:33:33:33:33", rssi = null, manufacturerDataHex = null)
        assertNull(GarminQrMatcher.select(listOf(bondedOld), QrPairingHint.Garmin(unitId = 3_405_691_582L, productNumber = null)))
    }
}
