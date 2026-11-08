package com.unified.health.driver.huawei.codec

import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset
import kotlin.math.abs

/** Service 0x01 (DeviceConfig) commands whose request layout is documented (HUAWEI_CONNECTION_ANALYSIS.md §3, §11). */
internal object DeviceConfigCommands {
    const val SERVICE_ID = 0x01
    const val SERVICE_CAPABILITY = 0x02
    const val COMMAND_CAPABILITY = 0x03
    const val SET_DATE_TIME = 0x05
    const val GET_DEVICE_VERSION = 0x07
    const val GET_BATTERY = 0x08
    const val DEVICE_SUPPORT_ACTIVITY_TYPE = 0x12
    const val SET_TIME_ZONE_ID = 0x32
    const val EXPAND_CAPABILITY = 0x37
    const val CREATE_DUAL_CHANNEL = 0x3C

    private const val TAG_EPOCH = 0x01
    private const val TAG_TIME_ZONE_OFFSET = 0x02
    private const val TAG_TIME_ZONE_ID = 0x03
    private const val TAG_SERVICE_LIST = 0x01
    private const val TAG_CAPABILITY_SERVICE = 0x02
    private const val TAG_CAPABILITY_COMMANDS = 0x03
    private const val TAG_EMPTY = 0x01
    private const val TAG_EMPTY_2 = 0x02
    private const val TAG_EMPTY_3 = 0x03
    private const val TAG_EMPTY_4 = 0x04
    private const val FATHER = 0x81

    /**
     * 0x0105 SetDeviceDateAndTime (HUAWEI_CONNECTION_ANALYSIS.md §3, [V] `cku.java:154-204`):
     * - TLV 1, 4 bytes: epoch seconds, big-endian, rounded to the nearest second;
     * - TLV 2, 2 bytes: UTC offset as `hours | minutes`, where a negative offset sets bit 0x80 of
     *   the hour byte (`hours + 128`).
     *
     * The app derives the sign from the whole-hour part only, so it would encode e.g. -00:30 as
     * +00:30; here the sign of the full offset is used ([I] that the watch expects this).
     * This command is sent encrypted after authentication in the app's handshake order (§5.1 step 5).
     */
    fun setDateTime(now: Instant, offset: ZoneOffset): HuaweiCommand =
        HuaweiCommand(
            SERVICE_ID,
            SET_DATE_TIME,
            listOf(
                Tlv.u32(TAG_EPOCH, epochSeconds(now)),
                Tlv(TAG_TIME_ZONE_OFFSET, zoneOffsetValue(offset)),
            ),
        )

    /**
     * 0x0107 GetDeviceVersion request: one empty TLV per requested type, i.e. `type 00` pairs
     * (every type is < 128, so each pair is exactly an empty TLV, the same shape as the 0x0101
     * request). [V] `ckq.getDeviceCommand`
     */
    fun deviceVersion(types: List<Int> = DeviceVersion.REQUESTED_TYPES): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, GET_DEVICE_VERSION, types.map { Tlv(it) })

    /**
     * 0x0108 GetBattery: `01 08 | 01 00` for the watch itself (earbuds additionally ask for TLV
     * 2/3 when capability 112 is supported, not modelled here) [V] `mev.java:155-179`. The reply has
     * two wire formats, see [BatteryStatus].
     */
    fun battery(): HuaweiCommand = HuaweiCommand(SERVICE_ID, GET_BATTERY, listOf(Tlv(1)))

    /**
     * 0x0137 DeviceExpandCapabilitySimpleCommand request: one empty TLV 1, i.e. payload
     * `01 37 01 00`. Runs only when 0x0103 announced command 0x37 (vendor capability key `1.55`)
     * and the reply's child TLV 1 is the expand-capability bitmap [V] `ckj.java:59-84`,
     * `cle.java:807`. Requesting it is fatal in the vendor when rejected (status 50155).
     */
    fun expandCapability(): HuaweiCommand = HuaweiCommand(SERVICE_ID, EXPAND_CAPABILITY, listOf(Tlv(TAG_EMPTY)))

    /**
     * 0x013C DeviceCreateDualChannel request: empty TLVs 1 and 2, plus 3 and 4 only for a watch
     * that also reports "extend socket" capability (bit 142), i.e. `01 3c 01 00 02 00 [03 00 04 00]`.
     * Runs only when 0x0137's bitmap has bit 56 (dual socket) [V] `ckl.java:255-282`,
     * `ckk.java:54-78`; rejection is fatal in the vendor (status 50160).
     */
    fun createDualChannel(extendSocket: Boolean): HuaweiCommand =
        HuaweiCommand(
            SERVICE_ID,
            CREATE_DUAL_CHANNEL,
            listOf(Tlv(TAG_EMPTY), Tlv(TAG_EMPTY_2)) +
                if (extendSocket) listOf(Tlv(TAG_EMPTY_3), Tlv(TAG_EMPTY_4)) else emptyList(),
        )

    /**
     * 0x0112 DeviceSupportActivityType request: an empty nested TLV 0x81, i.e. payload
     * `01 12 81 00`. Runs only when 0x0103 announced command 0x12 (vendor capability key `1.18`)
     * [V] `cko.java:60-68`, `cle.java:754`; rejection is fatal in the vendor (status 50118).
     */
    fun activityTypes(): HuaweiCommand =
        HuaweiCommand(SERVICE_ID, DEVICE_SUPPORT_ACTIVITY_TYPE, listOf(Tlv.nested(FATHER, emptyList())))

    /**
     * 0x0132 SetDeviceTimeZoneId: after the `01 32` service/command header the payload is
     * TLV 1 = epoch seconds (4 B), TLV 2 = UTC offset (2 B, same encoding as 0x0105) and
     * TLV 3 = IANA zone id UTF-8 [V] `ckw.b`, `cku.c` (`c()` then `d()`). The old "50-byte TLV 1"
     * in the protocol doc was the `01 32` header itself.
     */
    fun setTimeZoneId(now: Instant, offset: ZoneOffset, zone: ZoneId): HuaweiCommand =
        HuaweiCommand(
            SERVICE_ID,
            SET_TIME_ZONE_ID,
            listOf(
                Tlv.u32(TAG_EPOCH, epochSeconds(now)),
                Tlv(TAG_TIME_ZONE_OFFSET, zoneOffsetValue(offset)),
                Tlv(TAG_TIME_ZONE_ID, zone.id.toByteArray(Charsets.UTF_8)),
            ),
        )

    /**
     * True when the 0x0132 reply's echoed epoch (TLV 1) is within the vendor's 1-second tolerance,
     * or when there is nothing to verify ([V] `ckw.d`: no TLV 1 or a non-success reply never
     * triggers a resend). A readable-but-wrong echo returns false, and the caller resends once.
     */
    fun timeZoneEchoMatches(response: HuaweiCommand, now: Instant): Boolean {
        val error = response.errorCode()
        if (error != null && error != HuaweiCommand.SUCCESS_CODE) return true
        val echoed = response.tlvs.find(TAG_EPOCH)?.let { tlv -> runCatching { tlv.uint() }.getOrNull() } ?: return true
        return abs(now.epochSecond - echoed) < 1
    }

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

    private fun epochSeconds(now: Instant): Long =
        (now.epochSecond + if (now.nano >= 500_000_000) 1 else 0) and 0xFFFF_FFFFL

    /** `hours | minutes`; a negative offset sets bit 0x80 of the hour byte [V] `cku.d`. */
    private fun zoneOffsetValue(offset: ZoneOffset): ByteArray {
        val totalMinutes = offset.totalSeconds / 60
        val hours = abs(totalMinutes) / 60
        val minutes = abs(totalMinutes) % 60
        val hourByte = if (totalMinutes < 0) hours + NEGATIVE_OFFSET_BIT else hours
        return byteArrayOf(hourByte.toByte(), minutes.toByte())
    }

    private const val NEGATIVE_OFFSET_BIT = 0x80
}
