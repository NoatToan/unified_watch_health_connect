package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.hexToBytes

/**
 * 0x0137 DeviceExpandCapability reply (HUAWEI_CONNECTION_ANALYSIS.md §1.5).
 *
 * Layout [V] `ckj.java:59-84`: a nested ("father") TLV whose child TLV 1 holds an ASCII hex
 * bitmap; the app stores that string and tests it bit by bit (`cqd.c`:
 * `byte[bit / 8] & (1 << (bit % 8))`). Bit 56 = dual socket, bit 142 = extend socket
 * (`ckk.java:54-78`).
 */
internal object ExpandCapability {
    const val BIT_DUAL_SOCKET = 56
    const val BIT_EXTEND_SOCKET = 142

    private const val TAG_BITMAP = 0x01

    /**
     * @return the bitmap bytes, or null when the reply is an error or has no nested father with
     *  children (both fatal in the vendor). A father without a child TLV 1 means "no expand
     *  capability" and yields an empty bitmap, matching `ckj.b` (`strC = ""`).
     */
    fun parse(response: HuaweiCommand): ByteArray? {
        val error = response.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) return null
        val father = response.tlvs.filter { it.tag != HuaweiCommand.ERROR_TAG && it.isNested }.firstOrNull() ?: return null
        val children = runCatching { father.children() }.getOrNull()?.takeIf { it.isNotEmpty() } ?: return null
        val child = children.find { it.tag == TAG_BITMAP } ?: return ByteArray(0)
        return runCatching { child.value.toString(Charsets.US_ASCII).trim().hexToBytes() }.getOrNull()
    }

    /** True when [bit] is set; bits beyond the bitmap are unsupported, as in the vendor. */
    fun supports(bitmap: ByteArray, bit: Int): Boolean =
        bit >= 0 && bit < bitmap.size * 8 && (bitmap[bit / 8].toInt() and (1 shl (bit % 8))) != 0
}
