package com.unified.health.driver.huawei.codec

/**
 * Service 7 (Fitness) requests whose layout is verified in the app (HUAWEI_DEVICE_PROTOCOL.md §7.2,
 * builders in `lxp.java`, senders in `lxw.java`). All are sent with needAck and, after
 * authentication, encrypted.
 *
 * Note: the byte layouts below follow the decompiled builders, which differ in places from the
 * prose in §7.2 (e.g. cmd 3 is `01 00`, not `01 01 02 00`; cmd 4 starts with an empty TLV 1).
 *
 * TODO(huawei-protocol): every RESPONSE layout of service 7 is unknown (§10: "[?] response payload
 * chi tiết"). Capture an HCI snoop log of Huawei Health syncing a watch and decode: the frame count
 * TLV of cmd 4/10/12, and the frame bodies of cmd 5/8/11/13. Commands 31/32 (getDesFrameCount /
 * getDesFrame) are not built because their request layout is not documented.
 */
internal object FitnessCommands {
    const val SERVICE_ID = 0x07

    const val GET_TODAY_TOTAL = 3
    const val GET_HEALTH_FRAME_COUNT = 4
    const val GET_HEALTH_FRAME_COMPRESSED = 5
    const val GET_HEALTH_FRAME = 8
    const val GET_SAMPLE_FRAME_COUNT = 10
    const val GET_SAMPLE_FRAME = 11
    const val GET_STATUS_FRAME_COUNT = 12
    const val GET_STATUS_FRAME = 13

    private const val FATHER = 0x81

    /** cmd 3, steps/calories of today: `01 00`. [V] `lxw.java:96-97`, `lxp.java:163-165` */
    fun todayTotal(): HuaweiCommand = HuaweiCommand(SERVICE_ID, GET_TODAY_TOTAL, listOf(Tlv(1)))

    /**
     * cmd 4, number of health frames between two epoch-second timestamps:
     * `01 00 [03 04 start] [04 04 end]`; a zero bound is omitted, and `end` is only sent with `start`.
     * [V] `lxw.java:112-113`, `lxp.java:167-178`. [I] timestamps are epoch seconds.
     */
    fun healthFrameCount(startEpochSec: Long, endEpochSec: Long): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_HEALTH_FRAME_COUNT, listOf(Tlv(1)) + range(startEpochSec, endEpochSec))

    /** cmd 5, compressed health frame [index]: `81 04 | 02 02 index`. [V] `lxp.java:180-182` */
    fun healthFrameCompressed(index: Int): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_HEALTH_FRAME_COMPRESSED, listOf(Tlv.nested(FATHER, listOf(Tlv.u16(2, index)))))

    /** cmd 8, health frame [index]: `81 08 | 02 02 index | 03 02 index`. [V] `lxw.java:142-143`, `lxp.java:196-198` */
    fun healthFrame(index: Int): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_HEALTH_FRAME, listOf(Tlv.nested(FATHER, listOf(Tlv.u16(2, index), Tlv.u16(3, index)))))

    /**
     * cmd 10, number of sample frames (continuous HR/SpO2): `81 00 [03 04 start] [04 04 end]`.
     * The father TLV is sent EMPTY and the range follows as sibling TLVs, exactly as the app builds
     * it. [V] `lxw.java:157-160`, `lxp.java:200-228`
     */
    fun sampleFrameCount(startEpochSec: Long, endEpochSec: Long): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_SAMPLE_FRAME_COUNT, listOf(Tlv(FATHER)) + range(startEpochSec, endEpochSec))

    /** cmd 11, sample frame [index]: `81 04 | 02 02 index`. [V] `lxp.java:248-252` */
    fun sampleFrame(index: Int): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_SAMPLE_FRAME, listOf(Tlv.nested(FATHER, listOf(Tlv.u16(2, index)))))

    /** cmd 12, number of status frames: same layout as cmd 10. [V] `lxw.java:184-187`, `lxp.java:254-282` */
    fun statusFrameCount(startEpochSec: Long, endEpochSec: Long): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_STATUS_FRAME_COUNT, listOf(Tlv(FATHER)) + range(startEpochSec, endEpochSec))

    /** cmd 13, status frame [index]: `81 04 | 02 02 index`. [V] `lxp.java:284-288` */
    fun statusFrame(index: Int): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_STATUS_FRAME, listOf(Tlv.nested(FATHER, listOf(Tlv.u16(2, index)))))

    private fun range(start: Long, end: Long): List<Tlv> = buildList {
        if (start != 0L) {
            add(Tlv.u32(3, start and 0xFFFF_FFFFL))
            if (end != 0L) add(Tlv.u32(4, end and 0xFFFF_FFFFL))
        }
    }
}
