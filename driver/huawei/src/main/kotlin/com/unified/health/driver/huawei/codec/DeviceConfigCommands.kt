package com.unified.health.driver.huawei.codec

import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset
import kotlin.math.abs

/** Service 0x01 (DeviceConfig) commands whose request layout is documented (HUAWEI_DEVICE_PROTOCOL.md §5, §11). */
internal object DeviceConfigCommands {
    const val SERVICE_ID = 0x01
    const val SERVICE_CAPABILITY = 0x02
    const val COMMAND_CAPABILITY = 0x03
    const val SET_DATE_TIME = 0x05
    const val GET_DEVICE_VERSION = 0x07
    const val SET_TIME_ZONE_ID = 0x32

    private const val TAG_TIME_ZONE_ID = 0x03
    private const val TAG_SERVICE_LIST = 0x01
    private const val TAG_CAPABILITY_SERVICE = 0x02
    private const val TAG_CAPABILITY_COMMANDS = 0x03
    private const val FATHER = 0x81

    /**
     * 0x0105 SetDeviceDateAndTime (HUAWEI_DEVICE_PROTOCOL.md §5.3, [V] `cku.java:154-204`):
     * - TLV 1, 4 bytes: epoch seconds, big-endian, rounded to the nearest second;
     * - TLV 2, 2 bytes: UTC offset as `hours | minutes`, where a negative offset sets bit 0x80 of
     *   the hour byte (`hours + 128`).
     *
     * The app derives the sign from the whole-hour part only, so it would encode e.g. -00:30 as
     * +00:30; here the sign of the full offset is used ([I] that the watch expects this).
     * This command is sent encrypted after authentication in the app's handshake order (§5.1 step 5).
     */
    fun setDateTime(now: Instant, offset: ZoneOffset): HuaweiCommand {
        val epochSeconds = now.epochSecond + if (now.nano >= 500_000_000) 1 else 0
        val totalMinutes = offset.totalSeconds / 60
        val hours = abs(totalMinutes) / 60
        val minutes = abs(totalMinutes) % 60
        val hourByte = if (totalMinutes < 0) hours + NEGATIVE_OFFSET_BIT else hours
        return HuaweiCommand(
            SERVICE_ID,
            SET_DATE_TIME,
            listOf(
                Tlv.u32(1, epochSeconds and 0xFFFF_FFFFL),
                Tlv(2, byteArrayOf(hourByte.toByte(), minutes.toByte())),
            ),
        )
    }

    /**
     * 0x0107 GetDeviceVersion request: one empty TLV per requested type, i.e. `type 00` pairs
     * (§11.1 "type1_lo, type1_hi …" — every type is < 128, so each pair is exactly an empty TLV,
     * the same shape as the 0x0101 request). [V] `ckq.getDeviceCommand`
     */
    fun deviceVersion(types: List<Int> = DeviceVersion.REQUESTED_TYPES): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_DEVICE_VERSION, types.map { Tlv(it) })

    /**
     * 0x0132 SetDeviceTimeZoneId (§11.2): TLV 0x03 = IANA zone id, UTF-8. [V] `ckw.b`
     *
     * TODO(huawei-protocol): the app also sends TLV 0x01 with the 50-byte output of `cku.c()`,
     * whose layout is not decompiled (§11.2, NEEDS-REAL-WATCH). It is deliberately omitted rather
     * than filled with zeros or a guess: fabricated content is worse than an absent field, and a
     * watch that requires it answers with a 0x7F error, which the session logs and tolerates.
     */
    fun setTimeZoneId(zone: ZoneId): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, SET_TIME_ZONE_ID, listOf(Tlv(TAG_TIME_ZONE_ID, zone.id.toByteArray(Charsets.UTF_8))))

    /**
     * 0x0102 ServiceCapabilityConsult request (§11.3, [V] `ckn.b`):
     * TLV 0x01 = `[count - 1, serviceId_1, …, serviceId_n]`. The optional TLV 0x03 (phone
     * "deviceType") is not sent: its value is an app-internal identifier this driver has no
     * evidence for.
     */
    fun serviceCapability(services: List<Int>): HuaweiCommand {
        require(services.isNotEmpty() && services.all { it in 1..0xFF }) { "Need 1..255 service ids: $services" }
        val value = byteArrayOf((services.size - 1).toByte()) + ByteArray(services.size) { services[it].toByte() }
        return HuaweiCommand(SERVICE_ID, SERVICE_CAPABILITY, listOf(Tlv(TAG_SERVICE_LIST, value)))
    }

    /**
     * 0x0103 CommandCapabilityConsult request (§11.4, [V] `cki.a`): one father TLV 0x81 holding,
     * per service, `TLV 0x02 = serviceId` and `TLV 0x03 = [cmdCount, cmdId_1, …]`.
     */
    fun commandCapability(commandsByService: Map<Int, List<Int>>): HuaweiCommand {
        val children = commandsByService.flatMap { (service, commands) ->
            listOf(
                Tlv.u8(TAG_CAPABILITY_SERVICE, service),
                Tlv(TAG_CAPABILITY_COMMANDS, byteArrayOf(commands.size.toByte()) + ByteArray(commands.size) { commands[it].toByte() }),
            )
        }
        return HuaweiCommand(SERVICE_ID, COMMAND_CAPABILITY, listOf(Tlv.nested(FATHER, children)))
    }

    private const val NEGATIVE_OFFSET_BIT = 0x80
}
