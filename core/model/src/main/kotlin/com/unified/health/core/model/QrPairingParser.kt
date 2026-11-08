package com.unified.health.core.model

import java.net.URI
import java.net.URLDecoder

/**
 * Parses a raw QR-scan string into a [QrPairingHint], trying each vendor's format in turn. Pure
 * Kotlin/JVM, no Android types, so it is directly unit-testable and reusable from the camera
 * screen and from the manual-entry fallback.
 *
 * Adding a vendor = add a [SubParser] implementation to [parsers]; nothing else changes.
 */
object QrPairingParser {

    /** One vendor's QR shape. */
    private interface SubParser {
        /** Returns the hint when [raw] is a complete, valid code for this vendor, else null. */
        fun parse(raw: String): QrPairingHint?

        /** True when [raw] looks like this vendor's shape even though [parse] returned null. */
        fun looksLikeThisVendor(raw: String): Boolean
    }

    private val parsers: List<SubParser> = listOf(ZeppParser, HuaweiParser, GarminParser)

    /** The parsed hint, or null when [raw] does not match any known vendor format. */
    fun parse(raw: String): QrPairingHint? {
        val trimmed = raw.trim()
        if (trimmed.isEmpty()) return null
        for (parser in parsers) {
            parser.parse(trimmed)?.let { return it }
        }
        return null
    }

    /**
     * For a QR that [parse] could not turn into a hint: tells the UI which brand it still looks
     * like (e.g. a Garmin link with neither `deviceId` nor `productNumber`), so it can say
     * "<Brand> QR detected — choose your watch from the list" instead of a generic error.
     */
    fun isLikelyVendorQr(raw: String): VendorQrBrand? {
        val trimmed = raw.trim()
        if (trimmed.isEmpty()) return null
        return when {
            ZeppParser.looksLikeThisVendor(trimmed) -> VendorQrBrand.ZEPP
            HuaweiParser.looksLikeThisVendor(trimmed) -> VendorQrBrand.HUAWEI
            GarminParser.looksLikeThisVendor(trimmed) -> VendorQrBrand.GARMIN
            else -> null
        }
    }

    // --- Zepp / Amazfit / Xiaomi --------------------------------------------------------------

    private object ZeppParser : SubParser {
        private val macHex12 = Regex("^[0-9A-Fa-f]{12}$")

        override fun parse(raw: String): QrPairingHint.Zepp? {
            val params = parseQuery(raw)
            val macRaw = params["macaddress"] ?: params["mac"] ?: return null
            if (!macHex12.matches(macRaw)) return null
            return QrPairingHint.Zepp(
                mac = MacAddressFormat.normalizeOrNull(macRaw) ?: return null,
                pnpNumber = params["pnpnumber"]?.toIntOrNull(),
                pnpVersion = params["pnpversion"]?.toIntOrNull(),
            )
        }

        override fun looksLikeThisVendor(raw: String): Boolean {
            // Lenient on purpose: a macAddress/mac key with a malformed value is still "shaped
            // like" a Zepp code, just not a usable one.
            return parseQuery(raw).let { it["macaddress"] ?: it["mac"] } != null
        }
    }

    // --- Huawei / Honor ------------------------------------------------------------------------

    private object HuaweiParser : SubParser {
        override fun parse(raw: String): QrPairingHint.Huawei? {
            val params = parseQuery(raw)
            val type = params["t"]?.toIntOrNull() ?: return null
            val name = (params["n"] ?: params["bt_name"])?.takeIf { it.isNotBlank() } ?: return null
            val pin = (params["r"] ?: params["pin"])?.takeIf { it.isNotBlank() }
            return QrPairingHint.Huawei(type, name, pin)
        }

        override fun looksLikeThisVendor(raw: String): Boolean {
            // A bare "t=<n>" key is distinctive enough on its own (no other vendor uses it);
            // the name may still be missing/blank in an otherwise Huawei-shaped code.
            return parseQuery(raw)["t"]?.toIntOrNull() != null
        }
    }

    // --- Garmin ----------------------------------------------------------------------------------

    private object GarminParser : SubParser {
        private val hostSuffixes = listOf("garmin.com", "garmin.cn")
        private const val PAIR_PATH = "/mobile-link/gcm/pair-device"

        override fun parse(raw: String): QrPairingHint.Garmin? {
            if (!looksLikeThisVendor(raw)) return null
            val uri = toUri(raw) ?: return null
            if (uri.path?.contains(PAIR_PATH) != true) return null
            val params = parseQuery(uri.rawQuery.orEmpty())
            val unitId = params["deviceid"]?.toLongOrNull()
            val productNumber = params["productnumber"]?.takeIf { it.isNotBlank() }
            // applicationKey (if present) is intentionally never read: it is a Garmin-cloud OAuth
            // scope id, not a BLE pairing secret (docs/DECISIONS.md D-901).
            if (unitId == null && productNumber == null) return null
            return QrPairingHint.Garmin(unitId, productNumber)
        }

        override fun looksLikeThisVendor(raw: String): Boolean {
            val host = toUri(raw)?.host?.lowercase() ?: return false
            return hostSuffixes.any { host.endsWith(it) }
        }

        private fun toUri(raw: String): URI? = runCatching { URI(raw.trim()) }.getOrNull()
    }

    /**
     * Tolerant query-string parser: works on a full URL (`scheme://host/path?a=b`) or a bare
     * `a=b&c=d` string (what the Zepp/Huawei watches actually print), is whitespace-tolerant, and
     * URL-decodes each key/value. Keys are lower-cased so vendor aliases differing only by case
     * (`PIN` / `pin`) are found with a single lookup.
     */
    private fun parseQuery(raw: String): Map<String, String> {
        val query = raw.substringAfter('?', raw)
        return query.split('&')
            .mapNotNull { pair ->
                val trimmedPair = pair.trim()
                if (trimmedPair.isEmpty()) return@mapNotNull null
                val key = trimmedPair.substringBefore('=').trim()
                if (key.isEmpty()) return@mapNotNull null
                val value = trimmedPair.substringAfter('=', "").trim()
                decode(key).lowercase() to decode(value)
            }
            .toMap()
    }

    private fun decode(value: String): String = runCatching { URLDecoder.decode(value, "UTF-8") }.getOrDefault(value)
}

/** Shared MAC-address parsing/formatting, used by [QrPairingParser] and the manual-entry dialog. */
object MacAddressFormat {
    private val hex12 = Regex("^[0-9A-Fa-f]{12}$")

    /** Accepts 12 hex chars with or without `:`/`-` separators; returns `AA:BB:CC:DD:EE:FF` (uppercase) or null. */
    fun normalizeOrNull(raw: String): String? {
        val stripped = raw.trim().replace(":", "").replace("-", "")
        if (!hex12.matches(stripped)) return null
        return stripped.uppercase().chunked(2).joinToString(":")
    }
}
