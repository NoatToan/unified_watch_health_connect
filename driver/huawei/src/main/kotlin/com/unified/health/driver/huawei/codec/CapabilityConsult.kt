package com.unified.health.driver.huawei.codec

/**
 * Response side of 0x0102 / 0x0103 capability negotiation (HUAWEI_DEVICE_PROTOCOL.md §11.3-11.4,
 * `docs/re-evidence/huawei/capability_consult.md`).
 */
internal object CapabilityConsult {

    /**
     * Services the watch supports, out of the [requested] list sent in 0x0102.
     *
     * [V] `ckn.e`: for index `i` of the requested list, byte `i` of the first child TLV's value is
     * read and bit 0 set means "supported". The RE note calls the value a "hex ASCII bitmap"
     * because the app handles every TLV value as a hex string (§4.4 "TLV được build như chuỗi hex"),
     * so `hexStr[i*2..i*2+1]` is simply raw byte `i` — that reading is [I]. The tag of that first
     * child is not named in the evidence, so the first non-error TLV is used.
     *
     * Note: the brief's sample vector (`"0100"` → "service 1 unsupported, service 2 supported")
     * contradicts its own rule (byte 0 = 0x01 has bit 0 set); this follows the decompiled code.
     *
     * @return null when the reply has no bitmap or carries the 0x7F error TLV.
     */
    fun supportedServices(response: HuaweiCommand, requested: List<Int>): List<Int>? {
        val error = response.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) return null
        val bitmap = response.tlvs.firstOrNull { it.tag != HuaweiCommand.ERROR_TAG }?.value ?: return null
        return requested.filterIndexed { i, _ -> i < bitmap.size && (bitmap[i].toInt() and 0x01) == 1 }
    }

    /**
     * True when a 0x0103 reply is not an error. Its body is kept raw by the caller.
     *
     * TODO(huawei-protocol): the 0x0103 response byte layout is only [I] ("mirrors the request",
     * §11.4 — traced through `cki.d → b → a` method names, not to bytes). Decode the per-service
     * command bitmap once an HCI log confirms it.
     */
    fun commandCapabilityAccepted(response: HuaweiCommand): Boolean {
        val error = response.errorCode()
        return error == null || error == HuaweiCommand.SUCCESS_CODE
    }
}
