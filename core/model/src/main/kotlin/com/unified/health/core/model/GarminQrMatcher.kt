package com.unified.health.core.model

/**
 * Picks the exact BLE scan candidate a Garmin QR-pairing hint refers to, mirroring Garmin
 * Connect's own discovery filter (`k90.b` in the decompiled app, `docs/analysis/
 * QR_PAIRING_ANALYSIS.md` §4.4-4.5): it accepts only the candidate whose advertised `unitId`
 * **and** `productNumber` — both read from the BLE manufacturer-specific data before any GATT
 * connection — match the QR's.
 *
 * The exact byte layout of Garmin's manufacturer-specific-data payload past the company id is
 * unverified (`docs/DECISIONS.md` D-903: only the company id + first two bytes, read as a
 * big-endian u16, are trusted). Rather than guess a fixed offset for `unitId` too, this searches
 * the whole payload for the QR's `unitId` as a little- or big-endian 4-byte value (GFDI unit ids
 * fit in a u32) at any byte-aligned offset — see D-1183.
 */
object GarminQrMatcher {

    /**
     * @param candidates Devices seen during the find-by-hint scan; non-Garmin entries are ignored
     * defensively (the caller is expected to have already filtered to `vendor == GARMIN`).
     * @param hint The parsed Garmin QR payload ([QrPairingHint.Garmin]).
     * @return The single candidate the hint resolves to, or `null` when it does not uniquely
     * identify one — this never guesses (D-903's "don't guess" policy extends to this matcher).
     */
    fun select(candidates: List<DiscoveredDevice>, hint: QrPairingHint.Garmin): DiscoveredDevice? {
        val garminCandidates = candidates.filter { it.vendor == WearableVendor.GARMIN }
        if (garminCandidates.isEmpty()) return null

        // (1) unitId found (LE or BE) anywhere in the manufacturer-data payload is a definite
        // match — prefer the strongest signal if, extremely unlikely, more than one candidate's
        // payload happens to contain the same 4 bytes.
        val unitId = hint.unitId
        if (unitId != null && unitId in 0..0xFFFFFFFFL) {
            val byUnitId = garminCandidates.filter { payloadContainsUnitId(it, unitId) }
            if (byUnitId.isNotEmpty()) {
                return byUnitId.maxByOrNull { it.rssi ?: Int.MIN_VALUE }
            }
        }

        // (2) exactly one candidate whose product-number identifier matches, or whose payload
        // carries the product number as a u16 (LE or BE) at offset 0..1.
        val productNumber = hint.productNumber
        if (productNumber != null) {
            val byProductNumber = garminCandidates.filter { matchesProductNumber(it, productNumber) }
            if (byProductNumber.size == 1) return byProductNumber.single()
        }

        // (3) exactly one Garmin candidate actually advertising nearby. Bond-list entries (no RSSI)
        // are excluded: an old Garmin already bonded to this phone must not be picked over the new
        // watch the QR came from, which is advertising in pairing mode.
        return garminCandidates.filter { it.rssi != null }.singleOrNull()
    }

    private fun payloadContainsUnitId(candidate: DiscoveredDevice, unitId: Long): Boolean {
        val bytes = candidate.manufacturerDataBytes() ?: return false
        return bytes.containsSubsequence(unitId.toU32Bytes(littleEndian = true)) ||
            bytes.containsSubsequence(unitId.toU32Bytes(littleEndian = false))
    }

    private fun matchesProductNumber(candidate: DiscoveredDevice, productNumber: String): Boolean {
        if (candidate.vendorIdentifiers[VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER] == productNumber) return true

        val number = productNumber.toIntOrNull() ?: return false
        if (number !in 0..0xFFFF) return false
        val bytes = candidate.manufacturerDataBytes() ?: return false
        if (bytes.size < 2) return false
        val le = byteArrayOf((number and 0xFF).toByte(), ((number shr 8) and 0xFF).toByte())
        val be = byteArrayOf(((number shr 8) and 0xFF).toByte(), (number and 0xFF).toByte())
        val head = bytes.copyOfRange(0, 2)
        return head.contentEquals(le) || head.contentEquals(be)
    }

    private fun DiscoveredDevice.manufacturerDataBytes(): ByteArray? =
        vendorIdentifiers[VendorIdentifierKeys.GARMIN_MANUFACTURER_DATA]?.decodeHexOrNull()

    private fun Long.toU32Bytes(littleEndian: Boolean): ByteArray {
        val b0 = (this and 0xFF).toByte()
        val b1 = ((this shr 8) and 0xFF).toByte()
        val b2 = ((this shr 16) and 0xFF).toByte()
        val b3 = ((this shr 24) and 0xFF).toByte()
        return if (littleEndian) byteArrayOf(b0, b1, b2, b3) else byteArrayOf(b3, b2, b1, b0)
    }

    private fun ByteArray.containsSubsequence(needle: ByteArray): Boolean {
        if (needle.isEmpty() || needle.size > size) return false
        outer@ for (offset in 0..size - needle.size) {
            for (i in needle.indices) {
                if (this[offset + i] != needle[i]) continue@outer
            }
            return true
        }
        return false
    }

    /** Local hex decode — `core/model` is pure JVM and must not depend on `core/ble`. */
    private fun String.decodeHexOrNull(): ByteArray? {
        val clean = trim()
        if (clean.isEmpty() || clean.length % 2 != 0) return null
        return try {
            ByteArray(clean.length / 2) { i -> clean.substring(i * 2, i * 2 + 2).toInt(16).toByte() }
        } catch (_: NumberFormatException) {
            null
        }
    }
}
