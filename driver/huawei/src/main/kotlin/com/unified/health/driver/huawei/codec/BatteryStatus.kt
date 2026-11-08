package com.unified.health.driver.huawei.codec

/**
 * Reply to service 1 command 8 GetBattery (HUAWEI_CONNECTION_ANALYSIS.md §3, [V] `mer.java:240-346`).
 *
 * Two wire formats exist and the driver has no `DeviceInfo.deviceProtocol` to select on, so the
 * format is detected by shape: a `TLV 1` level means the newer protocol, otherwise the level is
 * raw payload byte 14 from the `01 08` header (protocol 0) [V]. Earbud levels come from TLV 2
 * (left, right, case; 255 = unknown) and their charge states from TLV 3, which is not exposed.
 *
 * @property levelPercent main battery, clamped to 0..100.
 * @property leftEarPercent / [rightEarPercent] / [casePercent] TLV 2 earbud levels; null for 255.
 */
internal data class BatteryStatus(
    val levelPercent: Int?,
    val leftEarPercent: Int? = null,
    val rightEarPercent: Int? = null,
    val casePercent: Int? = null,
) {
    companion object {
        private const val TAG_LEVEL = 0x01
        private const val TAG_EARBUDS = 0x02

        /** Protocol-0 replies put the level at byte 14 of the `svc | cmd | ...` payload [V] `mer.b`. */
        private const val PROTOCOL_0_LEVEL_INDEX = 14

        /** @return null when the reply is an error or has no recognizable level. */
        fun parse(response: HuaweiCommand): BatteryStatus? {
            val error = response.errorCode()
            if (error != null && error != HuaweiCommand.SUCCESS_CODE) return null
            val tlvs = response.tlvs.filter { it.tag != HuaweiCommand.ERROR_TAG }
            val level = tlvs.find(TAG_LEVEL)?.value?.takeIf { it.size == 1 }?.get(0)
                ?.let { (it.toInt() and 0xFF).coerceAtMost(100) }
            if (level != null) {
                val ears = tlvs.find(TAG_EARBUDS)?.value?.takeIf { it.size >= 3 }
                return BatteryStatus(
                    levelPercent = level,
                    leftEarPercent = ears?.get(0)?.let(::earbudPercent),
                    rightEarPercent = ears?.get(1)?.let(::earbudPercent),
                    casePercent = ears?.get(2)?.let(::earbudPercent),
                )
            }
            val raw = response.encode()
            if (raw.size <= PROTOCOL_0_LEVEL_INDEX) return null
            return BatteryStatus(levelPercent = (raw[PROTOCOL_0_LEVEL_INDEX].toInt() and 0xFF).coerceAtMost(100))
        }

        /** 255 means "not present"; anything above 100 is clamped [V] `mer.c`. */
        private fun earbudPercent(byte: Byte): Int? =
            (byte.toInt() and 0xFF).let { if (it == 255) null else it.coerceAtMost(100) }
    }
}
