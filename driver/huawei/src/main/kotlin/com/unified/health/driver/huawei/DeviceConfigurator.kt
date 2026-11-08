package com.unified.health.driver.huawei

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.huawei.codec.BatteryStatus
import com.unified.health.driver.huawei.codec.CapabilityConsult
import com.unified.health.driver.huawei.codec.CommandSupport
import com.unified.health.driver.huawei.codec.DeviceConfigCommands
import com.unified.health.driver.huawei.codec.DeviceVersion
import com.unified.health.driver.huawei.codec.ExpandCapability
import com.unified.health.driver.huawei.codec.FitnessCommands
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.LiveHeartRateCommands
import com.unified.health.driver.huawei.transport.HuaweiCommandChannel
import java.time.Clock
import java.time.ZoneId
import java.time.ZoneOffset

/**
 * What the post-authentication handshake learned about the watch.
 *
 * @property version 0x0107 reply, or null when the watch rejected it.
 * @property supportedServices 0x0102 result (subset of [DeviceConfigurator.CONSULTED_SERVICES]),
 *  or null when the watch rejected it / sent no bitmap.
 * @property commandSupport 0x0103 result (service → supported command ids), or null when rejected.
 * @property linkParameters 0x0101 result, exposed for the auth-capability diagnostic.
 */
internal class DeviceConfiguration(
    val version: DeviceVersion?,
    val supportedServices: List<Int>?,
    val commandSupport: CommandSupport?,
    val linkParameters: LinkParameters,
)

/**
 * Steps 4-8 of the app's handshake (HUAWEI_CONNECTION_ANALYSIS.md §1.5, layouts §3), run right
 * after authentication (or directly after 0x0101 when the watch reports authVersion 0), in the
 * app's verified order: 0x0107 version → 0x0105 date/time → 0x0102 service consult → 0x0103
 * command consult → optional 0x0137 expand capability → optional 0x013C dual channel → optional
 * 0x0132 time-zone id → optional 0x0112 activity types. 0x0116 QueryAvailableCommand is BR-only
 * and is deliberately not sent on BLE [V] `ckv.java:131-141`.
 *
 * Optional steps are capability-gated on the 0x0103 reply exactly as the app does: 0x0137 on
 * service 1 command 0x37 (`cle.java:807`), 0x013C on bit 56 of the 0x0137 bitmap (`ckk.java:54-78`),
 * 0x0132 on service 1 command 0x32, and 0x0112 on service 1 command 0x12 (`cle.java:754`).
 *
 * Failure policy: 0x0105, 0x0137, 0x013C and 0x0112 are required by the vendor and fail the
 * connection when rejected (statuses 50107/50155/50160/50118). 0x0102/0x0103 are informational
 * for this driver, so a 0x7F rejection is logged and the handshake continues; 0x0132 keeps its
 * previous log-and-continue behaviour. A transport failure (timeout, link loss) always propagates.
 *
 * @param encrypted true after authentication; false on the vendor's authVersion == 0 branch,
 *  where no work key exists and the app therefore sends these commands in clear text.
 */
internal object DeviceConfigurator {
    private const val TAG = "HuaweiHandshake"

    /** Services this driver talks to: DeviceConfig (1), Fitness (7) and Workout/HR (23). */
    val CONSULTED_SERVICES: List<Int> =
        listOf(DeviceConfigCommands.SERVICE_ID, FitnessCommands.SERVICE_ID, LiveHeartRateCommands.SERVICE_ID)

    /** Commands this driver sends per service, announced in 0x0103 (the app sends its own `cor.d` map). */
    val COMMANDS_BY_SERVICE: Map<Int, List<Int>> = mapOf(
        DeviceConfigCommands.SERVICE_ID to listOf(
            0x01, // link negotiation
            DeviceConfigCommands.SERVICE_CAPABILITY,
            DeviceConfigCommands.COMMAND_CAPABILITY,
            DeviceConfigCommands.SET_DATE_TIME,
            DeviceConfigCommands.GET_DEVICE_VERSION,
            DeviceConfigCommands.SET_TIME_ZONE_ID,
            DeviceConfigCommands.GET_BATTERY,
            DeviceConfigCommands.EXPAND_CAPABILITY,
            DeviceConfigCommands.DEVICE_SUPPORT_ACTIVITY_TYPE,
        ),
        FitnessCommands.SERVICE_ID to listOf(
            FitnessCommands.GET_TODAY_TOTAL,
            FitnessCommands.GET_HEALTH_FRAME_COUNT,
            FitnessCommands.GET_SAMPLE_FRAME_COUNT,
            FitnessCommands.GET_STATUS_FRAME_COUNT,
        ),
        LiveHeartRateCommands.SERVICE_ID to listOf(
            LiveHeartRateCommands.COMMAND_ID,
        ),
    )

    suspend fun configure(
        channel: HuaweiCommandChannel,
        clock: Clock,
        linkParameters: LinkParameters,
        encrypted: Boolean,
    ): DeviceConfiguration {
        val version = readVersion(channel, encrypted)

        val now = clock.instant()
        val timeReply = channel.request(DeviceConfigCommands.setDateTime(now, clock.zone.rules.getOffset(now)), encrypted)
        requireSuccess(timeReply)

        val serviceReply = channel.request(DeviceConfigCommands.serviceCapability(CONSULTED_SERVICES), encrypted)
        val supported = CapabilityConsult.supportedServices(serviceReply, CONSULTED_SERVICES)
        if (supported == null) Log.w(TAG, "0x0102 gave no service bitmap (error ${serviceReply.errorCode()})")

        val requested = supported?.takeIf { it.isNotEmpty() }?.let { services ->
            COMMANDS_BY_SERVICE.filterKeys { it in services }
        }
        val commandSupport = requested?.let { commands ->
            val reply = channel.request(DeviceConfigCommands.commandCapability(commands), encrypted)
            CapabilityConsult.commandSupport(reply, commands).also {
                if (it == null) Log.w(TAG, "0x0103 gave no command support (error ${reply.errorCode()})")
            }
        }

        // 0x0137 → 0x013C, gated on the capability consult exactly as the app does (§1.5).
        val expandCapability = if (commandSupport?.supports(DeviceConfigCommands.SERVICE_ID, DeviceConfigCommands.EXPAND_CAPABILITY) == true) {
            queryExpandCapability(channel, encrypted)
        } else {
            Log.i(TAG, "0x0137 skipped: watch did not announce service 1 cmd 0x37")
            null
        }
        if (expandCapability != null && ExpandCapability.supports(expandCapability, ExpandCapability.BIT_DUAL_SOCKET)) {
            val extendSocket = ExpandCapability.supports(expandCapability, ExpandCapability.BIT_EXTEND_SOCKET)
            requireSuccess(channel.request(DeviceConfigCommands.createDualChannel(extendSocket), encrypted))
        }

        // 0x0132 is capability-gated and runs after 0x0137/0x013C, as in the app's order (§1.5).
        if (commandSupport?.supports(DeviceConfigCommands.SERVICE_ID, DeviceConfigCommands.SET_TIME_ZONE_ID) == true) {
            configureTimeZone(channel, clock, encrypted)
        } else {
            Log.i(TAG, "0x0132 skipped: watch did not announce service 1 cmd 0x32")
        }

        // 0x0112, last optional step before status 53/OOBE in the app (§1.5).
        if (commandSupport?.supports(DeviceConfigCommands.SERVICE_ID, DeviceConfigCommands.DEVICE_SUPPORT_ACTIVITY_TYPE) == true) {
            requireSuccess(channel.request(DeviceConfigCommands.activityTypes(), encrypted))
        } else {
            Log.i(TAG, "0x0112 skipped: watch did not announce service 1 cmd 0x12")
        }

        val configuration = DeviceConfiguration(version, supported, commandSupport, linkParameters)
        Log.i(TAG, "Configured: $version, services=$supported, commandSupport=$commandSupport")
        return configuration
    }

    /** 0x0137: the vendor stores the reply's bitmap and aborts the handshake if it is unusable. */
    private suspend fun queryExpandCapability(channel: HuaweiCommandChannel, encrypted: Boolean): ByteArray {
        val reply = channel.request(DeviceConfigCommands.expandCapability(), encrypted)
        requireSuccess(reply)
        return ExpandCapability.parse(reply)
            ?: throw WearableProtocolException("Huawei watch sent an unusable 0x0137 expand-capability reply")
    }

    /** 0x0132, including the vendor's one-resend echo check (`ckw.a/d`: ≥ 1 s drift → resend once). */
    private suspend fun configureTimeZone(channel: HuaweiCommandChannel, clock: Clock, encrypted: Boolean) {
        val zone = ianaZone(clock.zone) ?: run {
            Log.w(TAG, "Zone ${clock.zone.id} has no IANA id; 0x0132 skipped (0x0105 already set the offset)")
            return
        }
        val now = clock.instant()
        val command = DeviceConfigCommands.setTimeZoneId(now, clock.zone.rules.getOffset(now), zone)
        var reply = channel.request(command, encrypted)
        if (!succeeded(reply)) {
            Log.w(TAG, "Watch rejected time-zone id ${zone.id} (error ${reply.errorCode()})")
            return
        }
        if (!DeviceConfigCommands.timeZoneEchoMatches(reply, clock.instant())) {
            Log.w(TAG, "0x0132 echoed a time differing by >= 1 s; resending once")
            reply = channel.request(command, encrypted)
            if (!succeeded(reply)) {
                Log.w(TAG, "Watch rejected the 0x0132 resend (error ${reply.errorCode()})")
            } else if (!DeviceConfigCommands.timeZoneEchoMatches(reply, clock.instant())) {
                Log.w(TAG, "0x0132 time echo still differs after the resend; continuing")
            }
        }
    }

    /** 0x0107; null when the watch rejects it (the caller then falls back to standard GATT). */
    suspend fun readVersion(channel: HuaweiCommandChannel, encrypted: Boolean): DeviceVersion? {
        val reply = channel.request(DeviceConfigCommands.deviceVersion(), encrypted)
        return try {
            DeviceVersion.parse(reply)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "0x0107 unusable: ${e.message}")
            null
        }
    }

    /** 0x0108, best effort: a rejected or unanswered query returns null (callers fall back to GATT). */
    suspend fun readBattery(channel: HuaweiCommandChannel, encrypted: Boolean): BatteryStatus? {
        val reply = try {
            channel.request(DeviceConfigCommands.battery(), encrypted)
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "0x0108 battery query failed: ${e.message}")
            return null
        }
        return BatteryStatus.parse(reply)
    }

    /**
     * IANA id for 0x0132: region zones as-is, a zero fixed offset as `Etc/UTC`; other fixed
     * offsets (`+07:00`) have no IANA name, so nothing is sent rather than a non-IANA string.
     */
    fun ianaZone(zone: ZoneId): ZoneId? = when {
        zone !is ZoneOffset -> zone
        zone.totalSeconds == 0 -> ZoneId.of("Etc/UTC")
        else -> null
    }

    private fun succeeded(reply: HuaweiCommand): Boolean {
        val code = reply.errorCode()
        return code == null || code == HuaweiCommand.SUCCESS_CODE
    }

    private fun requireSuccess(reply: HuaweiCommand) {
        if (!succeeded(reply)) throw WearableProtocolException("Huawei watch rejected ${reply.tag} with error ${reply.errorCode()}")
    }
}
