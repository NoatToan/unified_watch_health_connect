package com.unified.health.driver.huawei

import com.unified.health.core.ble.gatt.sigUuid
import java.util.UUID

/**
 * GATT identifiers of the Huawei/Honor wearable link (HUAWEI_DEVICE_PROTOCOL.md §0, §3.1).
 * The phone writes 0x5A frames to [WRITE] and receives them as notifications on [NOTIFY].
 */
internal object HuaweiUuids {
    /** 0xFE86, assigned by the Bluetooth SIG to Huawei. [V] `cmj.java:15` */
    val SERVICE: UUID = sigUuid(0xFE86)

    /** Phone -> watch frames. [V] `cmj.java:16`, `cld.java:789` */
    val WRITE: UUID = sigUuid(0xFE01)

    /** Watch -> phone frames; enabled through CCCD 0x2902. [V] `cmj.java:17`, `cld.java:790-811` */
    val NOTIFY: UUID = sigUuid(0xFE02)
}
