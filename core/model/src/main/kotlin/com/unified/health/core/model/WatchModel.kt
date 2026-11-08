package com.unified.health.core.model

/** Outline of a watch, used to pick a fallback silhouette when no product image is bundled. */
enum class WatchShape { ROUND, SQUARE, BAND }

/**
 * A concrete product (e.g. Forerunner 265) recognised from what the watch tells us about itself.
 * [id] is also the key of its bundled product image (`watch_<id>` in `:core:designsystem`).
 */
data class WatchModel(
    val id: String,
    val vendor: WearableVendor,
    val displayName: String,
    /** Matched (case-insensitively) against the advertised BLE name and the DIS model string. */
    val namePattern: Regex,
    val shape: WatchShape = WatchShape.ROUND,
    val releaseYear: Int? = null,
) {
    /** True for the brand-level entry used when no specific model matched. */
    val isGeneric: Boolean get() = id.endsWith(GENERIC_SUFFIX)

    companion object {
        const val GENERIC_SUFFIX = "_generic"
    }
}

/**
 * Maps a device's BLE name / Device Information model string to a [WatchModel] from [WatchCatalog].
 *
 * Order matters: [WatchCatalog.models] lists specific patterns before broader ones ("Forerunner 265S"
 * before "Forerunner 265"), and the first hit wins.
 */
object WatchModelMatcher {

    /**
     * @param model the DIS model string read after connecting; preferred over [name] because it does
     * not carry the user-chosen or MAC-derived suffix some watches append to their advertised name.
     */
    fun match(vendor: WearableVendor, name: String?, model: String? = null): WatchModel? {
        val candidates = candidatesFor(vendor)
        val texts = listOfNotNull(model, name).map(::normalize).filter(String::isNotBlank)
        texts.forEach { text -> candidates.firstOrNull { !it.isGeneric && it.namePattern.containsMatchIn(text) }?.let { return it } }
        // No specific model matched: prefer a generic whose own pattern matches (e.g. an HONOR
        // name should land on honor_generic, not the first HUAWEI-vendor generic in the list).
        val generics = WatchCatalog.models.filter { it.isGeneric && it.vendor == vendor }
        texts.forEach { text -> generics.firstOrNull { it.namePattern.containsMatchIn(text) }?.let { return it } }
        return generics.firstOrNull()
    }

    fun match(device: WearableDevice): WatchModel? = match(device.vendor, device.name, device.model)

    fun match(device: DiscoveredDevice): WatchModel? = match(device.vendor, device.name)

    /** A brand watch heard only through its SIG services lands on [WearableVendor.STANDARD]; let it match any brand. */
    private fun candidatesFor(vendor: WearableVendor): List<WatchModel> = when (vendor) {
        WearableVendor.STANDARD, WearableVendor.DEMO -> WatchCatalog.models
        else -> WatchCatalog.models.filter { it.vendor == vendor }
    }

    /** Folds the diacritics Garmin uses in names ("fēnix", "vívoactive") so patterns can stay ASCII. */
    internal fun normalize(text: String): String = java.text.Normalizer.normalize(text, java.text.Normalizer.Form.NFD)
        .replace(DIACRITICS, "")
        .trim()

    private val DIACRITICS = Regex("\\p{Mn}+")
}
