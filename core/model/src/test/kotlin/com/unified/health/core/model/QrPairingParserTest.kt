package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class QrPairingParserTest {

    // --- Zepp / Amazfit / Xiaomi ----------------------------------------------------------------

    @Test
    fun `Zepp full URL with mac and pnp`() {
        val hint = QrPairingParser.parse("https://api.amazfit.com/app.json?macAddress=AABBCCDDEEFF&pnpNumber=1&pnpVersion=2")
        assertEquals(QrPairingHint.Zepp("AA:BB:CC:DD:EE:FF", 1, 2), hint)
    }

    @Test
    fun `Zepp bare query string with no scheme or host`() {
        val hint = QrPairingParser.parse("macAddress=aabbccddeeff&pnpNumber=5&pnpVersion=9")
        assertEquals(QrPairingHint.Zepp("AA:BB:CC:DD:EE:FF", 5, 9), hint)
    }

    @Test
    fun `Zepp mac alias and mixed case hex are accepted`() {
        val hint = QrPairingParser.parse("mac=aAbBcCddEEff")
        assertEquals(QrPairingHint.Zepp("AA:BB:CC:DD:EE:FF", null, null), hint)
    }

    @Test
    fun `Zepp pnp fields are optional`() {
        val hint = QrPairingParser.parse("macAddress=AABBCCDDEEFF")
        assertEquals(QrPairingHint.Zepp("AA:BB:CC:DD:EE:FF", null, null), hint)
    }

    @Test
    fun `Zepp rejects a mac that is not 12 hex chars`() {
        assertNull(QrPairingParser.parse("macAddress=AABBCCDDEE&pnpNumber=1&pnpVersion=2"))
        assertNull(QrPairingParser.parse("macAddress=AABBCCDDEEFFGG&pnpNumber=1&pnpVersion=2"))
    }

    @Test
    fun `Zepp tolerates surrounding and internal whitespace`() {
        val hint = QrPairingParser.parse("  macAddress=AABBCCDDEEFF & pnpNumber=1 & pnpVersion=2  ")
        assertEquals(QrPairingHint.Zepp("AA:BB:CC:DD:EE:FF", 1, 2), hint)
    }

    // --- Huawei / Honor --------------------------------------------------------------------------

    @Test
    fun `Huawei short key aliases`() {
        val hint = QrPairingParser.parse("t=71&n=HUAWEI Band 8&r=123456")
        assertEquals(QrPairingHint.Huawei(71, "HUAWEI Band 8", "123456"), hint)
    }

    @Test
    fun `Huawei long key aliases and url-encoded name`() {
        val hint = QrPairingParser.parse("t=12&bt_name=HONOR%20Watch%20GS%203&PIN=654321")
        assertEquals(QrPairingHint.Huawei(12, "HONOR Watch GS 3", "654321"), hint)
    }

    @Test
    fun `Huawei pin is optional`() {
        val hint = QrPairingParser.parse("t=71&n=HUAWEI Band 8")
        assertEquals(QrPairingHint.Huawei(71, "HUAWEI Band 8", null), hint)
    }

    @Test
    fun `Huawei requires both type and name`() {
        assertNull(QrPairingParser.parse("t=71"))
        assertNull(QrPairingParser.parse("n=HUAWEI Band 8"))
        assertNull(QrPairingParser.parse("t=notanumber&n=HUAWEI Band 8"))
    }

    // --- Garmin ------------------------------------------------------------------------------------

    @Test
    fun `Garmin app link with all fields, applicationKey ignored`() {
        val hint = QrPairingParser.parse(
            "https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=123456789&productNumber=006483&applicationKey=super-secret-opaque-token",
        )
        assertEquals(QrPairingHint.Garmin(123_456_789L, "006483"), hint)
    }

    @Test
    fun `Garmin cn host and test host variants are accepted`() {
        assertEquals(
            QrPairingHint.Garmin(1L, "006483"),
            QrPairingParser.parse("https://connect.garmin.cn/mobile-link/gcm/pair-device?deviceId=1&productNumber=006483"),
        )
        assertEquals(
            QrPairingHint.Garmin(1L, "006483"),
            QrPairingParser.parse("https://connecttest.garmin.com/mobile-link/gcm/pair-device?deviceId=1&productNumber=006483"),
        )
    }

    @Test
    fun `Garmin accepts deviceId or productNumber alone`() {
        assertEquals(
            QrPairingHint.Garmin(42L, null),
            QrPairingParser.parse("https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=42"),
        )
        assertEquals(
            QrPairingHint.Garmin(null, "006483"),
            QrPairingParser.parse("https://connect.garmin.com/mobile-link/gcm/pair-device?productNumber=006483"),
        )
    }

    @Test
    fun `Garmin applicationKey alone is not a valid hint`() {
        assertNull(QrPairingParser.parse("https://connect.garmin.com/mobile-link/gcm/pair-device?applicationKey=only-this"))
    }

    @Test
    fun `Garmin rejects wrong host or path`() {
        assertNull(QrPairingParser.parse("https://evil.com/mobile-link/gcm/pair-device?deviceId=1&productNumber=2"))
        assertNull(QrPairingParser.parse("https://connect.garmin.com/some-other-path?deviceId=1&productNumber=2"))
    }

    // --- Cross-vendor / garbage -------------------------------------------------------------------

    @Test
    fun `unrecognised garbage returns null and is not flagged as a likely vendor`() {
        assertNull(QrPairingParser.parse("not a qr code at all"))
        assertNull(QrPairingParser.isLikelyVendorQr("not a qr code at all"))
        assertNull(QrPairingParser.parse(""))
        assertNull(QrPairingParser.parse("   "))
    }

    @Test
    fun `vendor ordering does not cross-match`() {
        // Huawei-shaped string must not be picked up by the Zepp or Garmin parsers.
        assertEquals(QrPairingHint.Huawei(1, "Watch", null), QrPairingParser.parse("t=1&n=Watch"))
        // Garmin link must not be picked up by Zepp/Huawei parsers (no macAddress/t/n keys present).
        assertEquals(
            QrPairingHint.Garmin(1L, null),
            QrPairingParser.parse("https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=1"),
        )
    }

    // --- isLikelyVendorQr: recognisable brand but unparsable code ----------------------------------

    @Test
    fun `likely Zepp when mac is malformed`() {
        assertEquals(VendorQrBrand.ZEPP, QrPairingParser.isLikelyVendorQr("macAddress=not-hex-at-all"))
    }

    @Test
    fun `likely Huawei when name is missing`() {
        assertEquals(VendorQrBrand.HUAWEI, QrPairingParser.isLikelyVendorQr("t=71"))
    }

    @Test
    fun `likely Garmin when host matches but no usable field`() {
        assertEquals(
            VendorQrBrand.GARMIN,
            QrPairingParser.isLikelyVendorQr("https://connect.garmin.com/mobile-link/gcm/pair-device?applicationKey=only-this"),
        )
    }

    @Test
    fun `a fully parsable hint is also reported as its own likely brand`() {
        assertEquals(VendorQrBrand.ZEPP, QrPairingParser.isLikelyVendorQr("macAddress=AABBCCDDEEFF"))
    }
}
