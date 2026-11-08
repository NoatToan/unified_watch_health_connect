package com.unified.health.core.ble.driver

import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattOptions
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.WearableVendor

/**
 * Plug-in point for one watch brand. Implementations live in their own `:driver:<brand>` module
 * and register with Hilt via `@Binds @IntoSet`; nothing in `:core` changes when a brand is added.
 *
 * A driver is stateless and long-lived; per-connection state belongs in the [WearableSession]
 * returned by [openSession].
 */
interface WearableDriver {
    val vendor: WearableVendor

    /** Link-level needs, applied by the connection manager before [openSession]. */
    val linkRequirements: LinkRequirements get() = LinkRequirements()

    /** Secrets the user must provide (shown in the UI before connecting). */
    val credentialRequirements: List<CredentialRequirement> get() = emptyList()

    /**
     * How confident this driver is that [advertisement] is one of its devices, using the
     * [RecognitionScore] scale. The highest score across drivers wins; [RecognitionScore.NONE]
     * means "not mine". Must be cheap and side-effect free (called for every scan result).
     */
    fun recognize(advertisement: Advertisement): Int

    /**
     * Runs the vendor handshake/authentication on an already connected [gatt] link and returns a
     * ready session. Throw [WearableProtocolException] (or a subclass) on failure; the caller
     * closes [gatt]. Must honour coroutine cancellation.
     */
    suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession
}

/**
 * @property bond create an OS-level bond (SMP pairing) before the handshake.
 * @property mtu ATT MTU to request after connecting, or null to keep the default.
 * @property connectTimeoutMs how long `connectGatt` may take before the attempt fails.
 * @property discoveryTimeoutMs how long service discovery may take.
 * @property operationTimeoutMs per read/write/descriptor operation.
 * @property refreshGattCacheBeforeDiscovery refresh the hidden GATT service cache on API 28+
 *   before `discoverServices` (vendor workaround for stale services / status 133; no-op below 28).
 */
data class LinkRequirements(
    val bond: Boolean = false,
    /** When true, a failed OS bond is logged and the link continues unbonded (Garmin Auth fallback). */
    val bondOptional: Boolean = false,
    val mtu: Int? = null,
    val connectTimeoutMs: Long = GattOptions.DEFAULT_CONNECT_TIMEOUT_MS,
    val discoveryTimeoutMs: Long = GattOptions.DEFAULT_DISCOVERY_TIMEOUT_MS,
    val operationTimeoutMs: Long = GattOptions.DEFAULT_OPERATION_TIMEOUT_MS,
    val refreshGattCacheBeforeDiscovery: Boolean = false,
) {
    /** The GATT-layer subset, consumed by [com.unified.health.core.ble.gatt.GattConnector]. */
    internal fun toGattOptions() = GattOptions(
        connectTimeoutMs = connectTimeoutMs,
        discoveryTimeoutMs = discoveryTimeoutMs,
        operationTimeoutMs = operationTimeoutMs,
        refreshCacheBeforeDiscovery = refreshGattCacheBeforeDiscovery,
    )
}

/** Shared scale for [WearableDriver.recognize] so drivers rank consistently. */
object RecognitionScore {
    const val NONE = 0

    /** Only the advertised/bonded name looks like the brand. */
    const val NAME = 10

    /** Generic SIG services (e.g. Heart Rate 0x180D) that any brand may expose. */
    const val STANDARD_SERVICE = 20

    /** A vendor-specific service UUID or service data. */
    const val VENDOR_SERVICE = 80

    /** Manufacturer-specific data under the vendor's Bluetooth SIG company id. */
    const val VENDOR_MANUFACTURER_DATA = 100
}

/** Per-connection inputs for [WearableDriver.openSession]. */
data class SessionContext(
    val address: String,
    val credentials: CredentialReader,
    val credentialWriter: CredentialWriter = CredentialWriter.None,
)

/** Lets a driver update the credentials of the device it is connecting to (e.g. after a first bind). */
interface CredentialWriter {
    suspend fun put(key: String, value: ByteArray)
    suspend fun remove(key: String)

    object None : CredentialWriter {
        override suspend fun put(key: String, value: ByteArray) = Unit
        override suspend fun remove(key: String) = Unit
    }
}

/** Read-only view of the credentials the user stored for one device. */
fun interface CredentialReader {
    suspend fun get(key: String): ByteArray?
}
