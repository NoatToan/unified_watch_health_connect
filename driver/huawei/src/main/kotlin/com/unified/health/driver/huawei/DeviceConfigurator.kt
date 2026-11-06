package com.unified.health.driver.huawei

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.huawei.codec.CapabilityConsult
import com.unified.health.driver.huawei.codec.DeviceConfigCommands
import com.unified.health.driver.huawei.codec.DeviceVersion
import com.unified.health.driver.huawei.codec.FitnessCommands
import com.unified.health.driver.huawei.codec.HuaweiCommand
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
 * @property commandCapability raw 0x0103 reply (body layout [I], see [CapabilityConsult]).
 */
internal class DeviceConfiguration(
    val version: DeviceVersion?,
    val supportedServices: List<Int>?,
    val commandCapability: HuaweiCommand?,
)

/**
 * Steps 4-8 of the app's handshake (HUAWEI_DEVICE_PROTOCOL.md §5.1, layouts §11), run on the
 * encrypted channel right after authentication, in the app's order:
 * 0x0107 version → 0x0105 date/time → 0x0132 time-zone id → 0x0102 service consult → 0x0103
 * command consult.
 *
 * Failure policy: 0x0105 is required (its rejection fails the connection, as before). The other
 * steps are informational for this driver, so a 0x7F rejection from the watch is logged and the
 * handshake continues; a transport failure (timeout, link loss) always propagates.
 * [I] that the app also sends these encrypted — it does so for 0x0105, and the transport accepts
 * clear or encrypted replies either way.
 */
internal object DeviceConfigurator {
    private const val TAG = "HuaweiHandshake"

    /** Services this driver talks to: DeviceConfig (1) and Fitness (7). */
    val CONSULTED_SERVICES: List<Int> = listOf(DeviceConfigCommands.SERVICE_ID, FitnessCommands.SERVICE_ID)

    /** Commands this driver sends per service, announced in 0x0103 (the app sends its own `cor.d` map). */
    val COMMANDS_BY_SERVICE: Map<Int, List<Int>> = mapOf(
        DeviceConfigCommands.SERVICE_ID to listOf(
            0x01, // link negotiation
            DeviceConfigCommands.SERVICE_CAPABILITY,
            DeviceConfigCommands.COMMAND_CAPABILITY,
            DeviceConfigCommands.SET_DATE_TIME,
            DeviceConfigCommands.GET_DEVICE_VERSION,
            DeviceConfigCommands.SET_TIME_ZONE_ID,
        ),
        FitnessCommands.SERVICE_ID to listOf(
            FitnessCommands.GET_TODAY_TOTAL,
            FitnessCommands.GET_HEALTH_FRAME_COUNT,
            FitnessCommands.GET_SAMPLE_FRAME_COUNT,
            FitnessCommands.GET_STATUS_FRAME_COUNT,
        ),
    )

    suspend fun configure(channel: HuaweiCommandChannel, clock: Clock): DeviceConfiguration {
        val version = readVersion(channel)

        val now = clock.instant()
        val timeReply = channel.request(DeviceConfigCommands.setDateTime(now, clock.zone.rules.getOffset(now)), encrypted = true)
        requireSuccess(timeReply)

        ianaZone(clock.zone)?.let { zone ->
            val reply = channel.request(DeviceConfigCommands.setTimeZoneId(zone), encrypted = true)
            if (!succeeded(reply)) Log.w(TAG, "Watch rejected time-zone id ${zone.id} (error ${reply.errorCode()})")
        } ?: Log.w(TAG, "Zone ${clock.zone.id} has no IANA id; 0x0132 skipped (0x0105 already set the offset)")

        val serviceReply = channel.request(DeviceConfigCommands.serviceCapability(CONSULTED_SERVICES), encrypted = true)
        val supported = CapabilityConsult.supportedServices(serviceReply, CONSULTED_SERVICES)
        if (supported == null) Log.w(TAG, "0x0102 gave no service bitmap (error ${serviceReply.errorCode()})")

        val commandReply = supported?.takeIf { it.isNotEmpty() }?.let { services ->
            val commands = COMMANDS_BY_SERVICE.filterKeys { it in services }
            channel.request(DeviceConfigCommands.commandCapability(commands), encrypted = true)
                .takeIf(CapabilityConsult::commandCapabilityAccepted)
                ?: run {
                    Log.w(TAG, "Watch rejected 0x0103")
                    null
                }
        }
        val configuration = DeviceConfiguration(version, supported, commandReply)
        Log.i(TAG, "Configured: $version, services=$supported, 0x0103 ${if (commandReply != null) "accepted" else "skipped"}")
        return configuration
    }

    /** 0x0107; null when the watch rejects it (the caller then falls back to standard GATT). */
    suspend fun readVersion(channel: HuaweiCommandChannel): DeviceVersion? {
        val reply = channel.request(DeviceConfigCommands.deviceVersion(), encrypted = true)
        return try {
            DeviceVersion.parse(reply)
        } catch (e: MalformedPayloadException) {
            Log.w(TAG, "0x0107 unusable: ${e.message}")
            null
        }
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
