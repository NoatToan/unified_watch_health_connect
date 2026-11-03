package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Application message carried inside 0x5A frames: `serviceId | commandId | TLV...`
 * (HUAWEI_DEVICE_PROTOCOL.md §4.4, [V] `coa.java:732-746`). The app logs commands as the
 * 4-hex-digit tag `SSCC` (e.g. `0101` = service 1, command 1, [V] `cku.java:339-344`).
 */
internal class HuaweiCommand(
    val serviceId: Int,
    val commandId: Int,
    val tlvs: List<Tlv> = emptyList(),
) {
    init {
        require(serviceId in 0..0xFF && commandId in 0..0xFF) { "Service/command ids are single bytes" }
    }

    val tag: String get() = "%02X%02X".format(serviceId, commandId)

    fun matches(other: HuaweiCommand): Boolean = serviceId == other.serviceId && commandId == other.commandId

    fun encode(): ByteArray = byteArrayOf(serviceId.toByte(), commandId.toByte()) + TlvCodec.encode(tlvs)

    /**
     * Error code carried in TLV 0x7F, or null when absent. The app treats tag 127 in a response as
     * a failure ([V] `ckv.java:249`, `cla.java:161`) and uses 100000 as its own success status
     * ([V] `cke.java:42`); that the watch also sends 100000 for "OK" is [I].
     */
    fun errorCode(): Long? = tlvs.find(ERROR_TAG)?.let { if (it.value.isEmpty()) 0L else it.uint() }

    override fun toString(): String = "HuaweiCommand($tag, ${tlvs.size} tlvs)"

    companion object {
        const val ERROR_TAG = 0x7F
        const val SUCCESS_CODE = 100_000L

        fun decode(payload: ByteArray): HuaweiCommand {
            if (payload.size < 2) throw MalformedPayloadException("Huawei payload shorter than service+command: ${payload.size}")
            return HuaweiCommand(
                serviceId = payload[0].toInt() and 0xFF,
                commandId = payload[1].toInt() and 0xFF,
                tlvs = TlvCodec.decode(payload, 2),
            )
        }
    }
}
