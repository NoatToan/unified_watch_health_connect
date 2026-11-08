package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Parsed 0x0107 GetDeviceVersion response (HUAWEI_CONNECTION_ANALYSIS.md §3,
 * `docs/re-evidence/huawei/version_tlv_types.md`). The type ids and the sub-dispatcher each one goes
 * to are [V] (`ckq.b/c/d`); the meanings below follow the `DeviceInfo` setter each type calls.
 * Every TLV received is kept in [raw] so later evidence can re-map fields without a protocol change.
 *
 * Type 12 is the device name and type 22 the device BT mode [V] (`ckq.c` `setDeviceName`,
 * `ckq.b` `setDeviceBtMode`); 0x0107 carries neither battery level nor a capability bitmap.
 *
 * @property firmwareVersion type 1, main firmware.
 * @property hardwareVersion type 2.
 * @property productModel type 20 (string product model), falling back to type 3 (device type/model).
 * @property serialNumber type 9.
 * @property deviceName type 12, UTF-8 device name [V].
 * @property deviceBtMode type 22, UTF-8 BT mode string [V].
 */
internal class DeviceVersion(
    val firmwareVersion: String?,
    val hardwareVersion: String?,
    val productModel: String?,
    val serialNumber: String?,
    val deviceName: String?,
    val deviceBtMode: String?,
    val raw: List<Tlv>,
) {

    override fun toString(): String =
        "DeviceVersion(firmware=$firmwareVersion, hw=$hardwareVersion, model=$productModel, " +
            "deviceName=$deviceName, btMode=$deviceBtMode, ${raw.size} tlvs)"

    companion object {
        const val TYPE_FIRMWARE = 1
        const val TYPE_HARDWARE = 2
        const val TYPE_DEVICE_TYPE = 3
        const val TYPE_HEALTH_FIRMWARE = 7
        const val TYPE_SERIAL = 9
        const val TYPE_DEVICE_NAME = 12
        const val TYPE_PRODUCT_MODEL = 20
        const val TYPE_DEVICE_BT_MODE = 22

        /** Every type id the app's three sub-dispatchers handle ([V] `ckq.b/c/d`): 30 ids. */
        val KNOWN_TYPES: Set<Int> = setOf(
            1, 3, 7, 25, 36, 37, 38, 39, 40, 41, // ckq.d
            2, 10, 14, 17, 18, 22, 26, // ckq.b
            9, 12, 15, 20, 21, 27, 29, 30, 31, 32, 33, 34, 35, // ckq.c
        )

        /**
         * What the driver asks for: the types it maps. The app requests a device-dependent subset
         * ([V] "a subset of the 29 types", exact subset not traced), so asking only for what is used
         * keeps the request as small as the app's.
         */
        val REQUESTED_TYPES: List<Int> = listOf(
            TYPE_FIRMWARE, TYPE_HARDWARE, TYPE_DEVICE_TYPE, TYPE_HEALTH_FIRMWARE, TYPE_SERIAL,
            TYPE_DEVICE_NAME, TYPE_PRODUCT_MODEL, TYPE_DEVICE_BT_MODE,
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
                deviceName = text(TYPE_DEVICE_NAME),
                deviceBtMode = text(TYPE_DEVICE_BT_MODE),
                raw = tlvs,
            )
        }
    }
}
