package com.unified.health.core.model

/**
 * What a "Pair with QR code" scan found, extracted from the QR printed on (or shown by) the
 * watch. See `docs/analysis/QR_PAIRING_ANALYSIS.md` §6 for the per-vendor payload formats this
 * is based on.
 *
 * None of these carry a BLE pairing secret: the Huawei PIN is a handshake input we do not use
 * (kept in memory only, see [Huawei.pin]), Garmin's `applicationKey` is a cloud OAuth scope id we
 * never read, and Zepp has no secret at all. The normal per-vendor auth (Huawei HiChain, Garmin
 * GFDI passkey, Zepp cloud/manual key) still runs after the device is found.
 */
sealed interface QrPairingHint {

    /**
     * Zepp / Amazfit / Xiaomi. The watch prints `https://api.amazfit.com/app.json?macAddress=...`
     * (host/path are not actually checked by the vendor app, so a bare query string is accepted
     * too). [mac] is mandatory; [pnpNumber]/[pnpVersion] are mandatory for the vendor app but we
     * treat them as optional hints since the MAC alone is enough to run an address-filtered scan.
     */
    data class Zepp(val mac: String, val pnpNumber: Int? = null, val pnpVersion: Int? = null) : QrPairingHint

    /**
     * Huawei / Honor. The watch prints a bare `t=<type>&n=<btName>&r=<PIN>` string (aliases
     * `bt_name=`, `PIN=`). There is no MAC: the target is found by advertised-name match. [pin]
     * is the 6-digit code shown on the watch; its role in Huawei's handshake is unverified, so we
     * never persist or log it (see `docs/DECISIONS.md`).
     */
    data class Huawei(val deviceType: Int, val btName: String, val pin: String? = null) : QrPairingHint

    /**
     * Garmin. The watch prints a `connect.garmin.com/mobile-link/gcm/pair-device` App Link.
     * Neither field is a MAC; the matching candidate is found from the BLE advertisement (see
     * `VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER`). The link's `applicationKey` query parameter
     * is a Garmin-cloud OAuth scope id — intentionally not represented here, never stored or
     * logged (D- entry in `docs/DECISIONS.md`).
     */
    data class Garmin(val unitId: Long?, val productNumber: String?) : QrPairingHint
}

/** A QR code that looks like one of the three vendors' shapes but could not be fully parsed. */
enum class VendorQrBrand(val displayName: String) {
    ZEPP("Zepp/Amazfit"),
    HUAWEI("Huawei/Honor"),
    GARMIN("Garmin"),
}
