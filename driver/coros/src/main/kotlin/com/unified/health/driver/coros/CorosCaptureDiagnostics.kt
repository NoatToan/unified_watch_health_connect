package com.unified.health.driver.coros

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import java.util.Locale
import java.util.UUID

/**
 * Bond state as last seen in a scan result; [GattClient] exposes no authoritative bond API.
 * TODO(coros-capture): read `BluetoothDevice.getBondState()` live through a platform bridge for an
 * authoritative value (bond ordering evidence: docs/analysis/COROS_CONNECTION_ANALYSIS.md §1.4).
 */
internal enum class CorosBondState { BONDED, NOT_BONDED, UNKNOWN }

/** What the last advertisement for one address told us; kept only for capture diagnostics. */
internal data class SeenAdvertisement(val name: String?, val isBonded: Boolean)

/**
 * Bounded, thread-safe memo of the last COROS advertisement per address. The scanner walks
 * `recognize()` for every advertisement and [CorosDriver.openSession] only receives a MAC address,
 * so this is the only place the advertised name and scan-time bond state are available to the
 * session. It is diagnostic state only: it never changes recognition scores or protocol behaviour.
 */
internal class CorosCaptureRecorder {

    private val seen = LinkedHashMap<String, SeenAdvertisement>()

    @Synchronized
    fun record(advertisement: Advertisement) {
        val key = advertisement.address.uppercase(Locale.ROOT)
        seen.remove(key) // Re-insert so the iteration order is least-recently-seen first.
        seen[key] = SeenAdvertisement(advertisement.name, advertisement.isBonded)
        while (seen.size > MAX_ENTRIES) {
            seen.remove(seen.keys.first())
        }
    }

    @Synchronized
    fun lastSeen(address: String): SeenAdvertisement? = seen[address.uppercase(Locale.ROOT)]

    private companion object {
        const val MAX_ENTRIES = 16
    }
}

/**
 * The three vendor UUID families whose presence decides whether the proprietary COROS protocol is
 * needed (protocol doc §3.2 [V] literals, [I] roles). `6E400001` covers all three suffix variants
 * found in the dex.
 */
internal enum class CorosVendorFamily(val label: String, val serviceUuids: List<UUID>) {
    UART_6E400001(
        "6E400001",
        listOf(
            CorosUuids.WELOOP_UART_SERVICE,
            CorosUuids.WELOOP_UART_ALT_SERVICE,
            CorosUuids.NORDIC_UART_SERVICE,
        ),
    ),
    ADF70001("ADF70001", listOf(CorosUuids.ADF7_SERVICE)),
    NORDIC_DFU("Nordic DFU 00001530", listOf(CorosUuids.NORDIC_DFU_SERVICE)),
}

/**
 * What the driver could observe at the "capture needed" point. This is what a future HCI snoop log
 * must be compared against: advertised name, bond state, the discovered known service/characteristic
 * UUIDs and which vendor UUID families are present.
 *
 * Limitation, by design: [GattClient] only answers `hasService(uuid)`/`findCharacteristic(uuid)`,
 * so unknown UUIDs cannot be enumerated. The snapshot therefore probes the verified COROS + SIG
 * candidate list and records only the ones present.
 * TODO(coros-capture): full enumeration needs the HCI log (or a core GATT API that lists
 * `BluetoothGatt.services`) — see COROS_CONNECTION_ANALYSIS.md §5 gap #1.
 */
internal data class CorosCaptureSnapshot(
    val address: String,
    val advertisedName: String?,
    val bondState: CorosBondState,
    val serviceUuids: Set<UUID>,
    val characteristicUuids: Set<UUID>,
    val vendorFamilies: Set<CorosVendorFamily>,
) {
    /** A vendor transport family was found: history/vendor live data needs the unimplemented protocol. */
    val vendorProtocolPresent: Boolean get() = vendorFamilies.isNotEmpty()

    /** At least one standard SIG service the driver can actually use is present. */
    val sigBaselinePresent: Boolean
        get() = serviceUuids.any {
            it == StandardUuids.DEVICE_INFORMATION_SERVICE ||
                it == StandardUuids.BATTERY_SERVICE ||
                it == StandardUuids.HEART_RATE_SERVICE
        }

    fun summary(): String = buildString {
        append("advertisedName=").append(advertisedName ?: "<unknown>")
        append(", address=").append(address)
        append(", bond=").append(bondState.name.lowercase(Locale.ROOT))
        append(", sigBaselinePresent=").append(sigBaselinePresent)
        append(", vendorFamilies=")
        append(if (vendorFamilies.isEmpty()) "none" else vendorFamilies.joinToString(",") { it.label })
        append(", services=[").append(serviceUuids.joinToString(",") { it.toString() }).append(']')
        append(", characteristics=[").append(characteristicUuids.joinToString(",") { it.toString() }).append(']')
    }
}

/** Single place that turns a live [GattClient] into a [CorosCaptureSnapshot]. */
internal object CorosCaptureProbe {

    private val knownServices: List<UUID> = listOf(
        StandardUuids.DEVICE_INFORMATION_SERVICE,
        StandardUuids.BATTERY_SERVICE,
        StandardUuids.HEART_RATE_SERVICE,
        StandardUuids.CURRENT_TIME_SERVICE,
        CorosUuids.WELOOP_UART_SERVICE,
        CorosUuids.WELOOP_UART_ALT_SERVICE,
        CorosUuids.NORDIC_UART_SERVICE,
        CorosUuids.ADF7_SERVICE,
        CorosUuids.NORDIC_DFU_SERVICE,
    )

    private val knownCharacteristics: List<Pair<UUID, UUID>> = listOf(
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.MANUFACTURER_NAME,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.MODEL_NUMBER,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.SERIAL_NUMBER,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.HARDWARE_REVISION,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.FIRMWARE_REVISION,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.SOFTWARE_REVISION,
        StandardUuids.DEVICE_INFORMATION_SERVICE to StandardUuids.PNP_ID,
        StandardUuids.BATTERY_SERVICE to StandardUuids.BATTERY_LEVEL,
        StandardUuids.HEART_RATE_SERVICE to StandardUuids.HEART_RATE_MEASUREMENT,
        StandardUuids.CURRENT_TIME_SERVICE to StandardUuids.CURRENT_TIME,
        CorosUuids.WELOOP_UART_SERVICE to CorosUuids.WELOOP_UART_WRITE,
        CorosUuids.WELOOP_UART_SERVICE to CorosUuids.WELOOP_UART_NOTIFY,
        CorosUuids.WELOOP_UART_ALT_SERVICE to CorosUuids.WELOOP_UART_ALT_WRITE,
        CorosUuids.WELOOP_UART_ALT_SERVICE to CorosUuids.WELOOP_UART_ALT_NOTIFY,
        CorosUuids.NORDIC_UART_SERVICE to CorosUuids.NORDIC_UART_WRITE,
        CorosUuids.NORDIC_UART_SERVICE to CorosUuids.NORDIC_UART_NOTIFY,
        CorosUuids.ADF7_SERVICE to CorosUuids.ADF7_CHAR_1,
        CorosUuids.ADF7_SERVICE to CorosUuids.ADF7_CHAR_2,
        CorosUuids.NORDIC_DFU_SERVICE to CorosUuids.NORDIC_DFU_CONTROL_POINT,
        CorosUuids.NORDIC_DFU_SERVICE to CorosUuids.NORDIC_DFU_PACKET,
    )

    fun snapshot(gatt: GattClient, seen: SeenAdvertisement?): CorosCaptureSnapshot {
        val services = LinkedHashSet<UUID>()
        for (service in knownServices) {
            if (gatt.hasService(service)) services.add(service)
        }
        val characteristics = LinkedHashSet<UUID>()
        for ((service, characteristic) in knownCharacteristics) {
            if (service in services && gatt.findCharacteristic(characteristic, service) != null) {
                characteristics.add(characteristic)
            }
        }
        val families = LinkedHashSet<CorosVendorFamily>()
        for (family in CorosVendorFamily.entries) {
            if (family.serviceUuids.any { gatt.hasService(it) }) families.add(family)
        }
        return CorosCaptureSnapshot(
            address = gatt.address,
            advertisedName = seen?.name,
            bondState = when {
                seen == null -> CorosBondState.UNKNOWN
                seen.isBonded -> CorosBondState.BONDED
                else -> CorosBondState.NOT_BONDED
            },
            serviceUuids = services,
            characteristicUuids = characteristics,
            vendorFamilies = families,
        )
    }
}

/**
 * Raised when the device needs the proprietary `com.yf.coros.blecmd` / `BleCmdPb` channel and its
 * byte layout is unknown (protocol doc §0/§6/§9). The message is deliberately actionable: it names
 * every observed UUID and points at a Bluetooth HCI snoop log, the cheapest way to recover framing,
 * command ids and the bond/handshake order ([COROS_CONNECTION_ANALYSIS.md] §5).
 */
internal class CorosCaptureNeededException(
    val diagnostics: CorosCaptureSnapshot,
    reason: String,
) : WearableProtocolException(
    "COROS capture needed: $reason requires the proprietary COROS BleCmdPb command channel, " +
        "which this driver does not implement (no command ids or frame layout are recoverable from " +
        "the hardened 4.11.8 APK). Capture a Bluetooth HCI snoop log while the official COROS app " +
        "pairs and syncs once with this watch (Android Developer options -> Bluetooth HCI snoop log " +
        "-> adb bugreport -> btsnoop_hci.log) and attach it to the COROS investigation. Evidence: " +
        "docs/analysis/COROS_CONNECTION_ANALYSIS.md §5; docs/protocols/COROS_DEVICE_PROTOCOL.md §6, §9. " +
        "Diagnostics: ${diagnostics.summary()}",
)

/** Logs the snapshot once per session; keeps the full UUID set out of normal UI errors. */
internal fun logCaptureDiagnostics(snapshot: CorosCaptureSnapshot) {
    Log.i("CorosCapture", "COROS capture diagnostics: ${snapshot.summary()}")
}
