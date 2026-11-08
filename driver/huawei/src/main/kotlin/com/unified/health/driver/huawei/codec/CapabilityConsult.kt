package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Response side of 0x0102 / 0x0103 capability negotiation (HUAWEI_CONNECTION_ANALYSIS.md §1.5,
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
     * Command support from the 0x0103 reply [V] `cki.java:165-249`: the reply is a list of nested
     * ("father") TLVs, each with child TLV 2 = serviceId and child TLV 4 = a support vector, one
     * wire byte per command in the order the same command list was sent (`0x01` supported,
     * `0x00` not; `cki.d` reads `cpb.a(vectorHexCharPair) == 1`). Positions beyond the vector are
     * unsupported, as in the vendor loop. Multiple services may be returned.
     *
     * [requested] is the exact `serviceId -> commandIds` map sent in 0x0103; the vector index maps
     * positionally onto each command list.
     *
     * @return null when the reply is an error or has no parseable service group.
     */
    fun commandSupport(response: HuaweiCommand, requested: Map<Int, List<Int>>): CommandSupport? {
        val error = response.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) return null
        val parsed = LinkedHashMap<Int, Set<Int>>()
        for (father in response.tlvs.filter { it.tag != HuaweiCommand.ERROR_TAG && it.isNested }) {
            val children = try {
                father.children()
            } catch (_: MalformedPayloadException) {
                continue
            }
            val serviceId = children.find(TAG_SERVICE)?.let { runCatching { it.int() }.getOrNull() } ?: continue
            val vector = children.find(TAG_SUPPORT_VECTOR)?.value?.takeIf { it.isNotEmpty() } ?: continue
            val commands = requested[serviceId] ?: continue
            parsed[serviceId] = commands.filterIndexed { i, _ -> i < vector.size && (vector[i].toInt() and 0xFF) == 1 }.toSet()
        }
        return parsed.takeIf { it.isNotEmpty() }?.let(::CommandSupport)
    }

    private const val TAG_SERVICE = 0x02
    private const val TAG_SUPPORT_VECTOR = 0x04
}

/** Which commands of a service the watch announced as supported in 0x0103. */
internal class CommandSupport(private val commandsByService: Map<Int, Set<Int>>) {

    fun supports(serviceId: Int, commandId: Int): Boolean = commandsByService[serviceId]?.contains(commandId) == true

    fun supportedCommands(serviceId: Int): Set<Int> = commandsByService[serviceId].orEmpty()

    override fun toString(): String = "CommandSupport(${commandsByService.mapValues { it.value.sorted() }})"
}
