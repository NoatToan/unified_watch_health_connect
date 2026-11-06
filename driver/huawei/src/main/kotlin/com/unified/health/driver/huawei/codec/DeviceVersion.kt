package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Parsed 0x0107 GetDeviceVersion response (HUAWEI_DEVICE_PROTOCOL.md §11.1,
 * `docs/re-evidence/huawei/version_tlv_types.md`). The type ids (the doc says "29"; its three
 * switch lists actually name 30) and the sub-dispatcher each
 * one goes to are [V] (`ckq.b/c/d`); what each type MEANS is [I] (inferred from the
 * `DeviceInfo` field the app stores it in), and so is the value encoding: version/name types are
 * read as UTF-8 text (the app keeps them as `String`), the battery as an unsigned integer.
 * Every TLV received is kept in [raw] so later evidence can re-map fields without a protocol change.
 *
 * @property firmwareVersion type 1, main firmware.
 * @property hardwareVersion type 2.
 * @property productModel type 20 (string product model), falling back to type 3 (device type/model).
 * @property serialNumber type 9.
 * @property batteryPercent type 12, 0..100 (out-of-range values are dropped).
 * @property deviceName type 15 (alias).
 * @property capabilityBitmap type 22, kept as bytes: the bit → feature mapping is not documented,
 *  so it is NOT translated into `DeviceCapability` (that would invent semantics).
 */
internal class DeviceVersion(
    val firmwareVersion: String?,
    val hardwareVersion: String?,
    val productModel: String?,
    val serialNumber: String?,
    val batteryPercent: Int?,
    val deviceName: String?,
    capabilityBitmap: ByteArray?,
    val raw: List<Tlv>,
) {
    val capabilityBitmap: ByteArray? = capabilityBitmap?.copyOf()

    override fun toString(): String =
        "DeviceVersion(firmware=$firmwareVersion, hw=$hardwareVersion, model=$productModel, battery=$batteryPercent, " +
            "capabilityBitmap=${capabilityBitmap?.size ?: 0} bytes, ${raw.size} tlvs)"

    companion object {
        const val TYPE_FIRMWARE = 1
        const val TYPE_HARDWARE = 2
        const val TYPE_DEVICE_TYPE = 3
        const val TYPE_HEALTH_FIRMWARE = 7
        const val TYPE_SERIAL = 9
        const val TYPE_BATTERY = 12
        const val TYPE_ALIAS = 15
        const val TYPE_PRODUCT_MODEL = 20
        const val TYPE_CAPABILITY_BITMAP = 22

        /** Every type id the app's three sub-dispatchers handle ([V] `ckq.b/c/d`): 30 ids. */
        val KNOWN_TYPES: Set<Int> = setOf(
            1, 3, 7, 25, 36, 37, 38, 39, 40, 41, // ckq.d
            2, 10, 14, 17, 18, 22, 26, // ckq.b
            9, 12, 15, 20, 21, 27, 29, 30, 31, 32, 33, 34, 35, // ckq.c
        )

        /**
         * What the driver asks for: the types it maps plus the capability bitmap. The app requests a
         * device-dependent subset ([V] "a subset of the 29 types", exact subset not traced), so
         * asking only for what is used keeps the request as small as the app's.
         */
        val REQUESTED_TYPES: List<Int> = listOf(
            TYPE_FIRMWARE, TYPE_HARDWARE, TYPE_DEVICE_TYPE, TYPE_HEALTH_FIRMWARE, TYPE_SERIAL,
            TYPE_BATTERY, TYPE_ALIAS, TYPE_PRODUCT_MODEL, TYPE_CAPABILITY_BITMAP,
        )

        /** @throws MalformedPayloadException when the response carries the 0x7F error TLV. */
        fun parse(response: HuaweiCommand): DeviceVersion {
            val error = response.errorCode()
            if (error != null && error != HuaweiCommand.SUCCESS_CODE) throw MalformedPayloadException("0x0107 rejected with error $error")
            val tlvs = response.tlvs.filter { it.tag != HuaweiCommand.ERROR_TAG }
            fun text(type: Int): String? = tlvs.find(type)?.value?.toString(Charsets.UTF_8)?.trim('\u0000', ' ')?.takeIf { it.isNotEmpty() }
            return DeviceVersion(
                firmwareVersion = text(TYPE_FIRMWARE),
                hardwareVersion = text(TYPE_HARDWARE),
                productModel = text(TYPE_PRODUCT_MODEL) ?: text(TYPE_DEVICE_TYPE),
                serialNumber = text(TYPE_SERIAL),
                batteryPercent = tlvs.find(TYPE_BATTERY)?.let(::uintOrNull)?.takeIf { it in 0..100 },
                deviceName = text(TYPE_ALIAS),
                capabilityBitmap = tlvs.find(TYPE_CAPABILITY_BITMAP)?.value,
                raw = tlvs,
            )
        }

        private fun uintOrNull(tlv: Tlv): Int? = try {
            tlv.int()
        } catch (_: MalformedPayloadException) {
            null
        }
    }
}
