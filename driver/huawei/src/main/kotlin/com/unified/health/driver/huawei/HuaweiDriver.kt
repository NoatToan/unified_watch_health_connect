package com.unified.health.driver.huawei

import com.unified.health.core.ble.driver.LinkRequirements
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import com.unified.health.driver.huawei.transport.TransportTimeouts
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import java.time.Clock
import javax.inject.Inject

/**
 * Huawei / Honor watches and bands over the proprietary 0x5A protocol on GATT service FE86
 * (source: HUAWEI_DEVICE_PROTOCOL.md, reverse-engineered from Huawei Health 17.0.7.310).
 *
 * ## Status: cannot connect to a real watch yet
 * Every Huawei watch requires authentication before it accepts or answers business commands, and
 * every known mechanism needs material a third party cannot legitimately obtain (§6, §9 Option B):
 * - legacy HMAC (0x0113) and HiChainLite's Kn step use the CAK hidden in Huawei Health's
 *   white-box crypto, which this project deliberately does not extract or embed;
 * - HiChain / HiChain3 run the native OpenHarmony `deviceauth` PAKE, which is not reimplemented.
 *
 * So [openSession] negotiates the link, reads the watch's auth type and then throws
 * [com.unified.health.core.ble.driver.UnsupportedDeviceException]
 * ("Huawei HiChainLite (PIN) authentication is not supported yet …") unless a
 * [HuaweiAuthenticator] for that mode is bound in `HuaweiDriverModule`. None is shipped.
 * The supported path for Huawei data today is Huawei Health → Health Connect (§7.6, §9 Option A).
 *
 * ## What is implemented and unit-tested
 * - Recognition by advertised name prefix and the FE86 service UUID; bonding as link requirement.
 * - 0x5A framing: single and sliced frames (flags 1/2/3 + index), CRC-16/XMODEM, chunking at the
 *   negotiated single-frame size, reassembly of notifications (§4.1-4.3).
 * - TLVs with base-128 varint lengths and nested (≥ 0x80) tags (§4.4).
 * - Payload encryption envelope 0x7C/0x7D/0x7E with AES-CBC/PKCS5 or AES-GCM and the IV counter (§6.4).
 * - Request/response matching by service+command, 10 s timeout, 3 attempts (§4.5).
 * - 0x0101 link negotiation (frame sizes, interval, auth version, randA, auth type) (§5.2).
 * - Pluggable authentication: a Hilt set of [HuaweiAuthenticator], selected per auth type (§6).
 * - After authentication, the app's handshake steps 4-8 (§5.1, layouts §11, [DeviceConfigurator]):
 *   0x0107 device version (firmware/model/serial/battery TLVs, also used by `readDeviceInfo`),
 *   0x0105 date/time, 0x0132 IANA time-zone id, 0x0102 service and 0x0103 command capability consult.
 * - Watch-initiated messages are routed by service and kept raw until the next sync (§11.5).
 * - A best-effort `sync()` that fires every
 *   documented service 7 request (today totals cmd 3, and the frame-count requests behind steps/
 *   distance/calories, continuous HR/SpO2 and sleep/status, cmd 4/10/12) and keeps each accepted
 *   reply as an opaque raw payload for later re-decoding.
 * - Request builders for service 7 history commands 4/5/8/10/11/12/13 (§7.2).
 * - `capabilities` only ever advertises battery level (from 0x0107 type 12 or the standard GATT
 *   Battery service); neither history sync nor live heart rate is declared because no typed
 *   record can be produced yet (see below).
 *
 * ## Still unknown (needs an HCI snoop log of Huawei Health with a real watch)
 * - Every service 7 response layout (the frame-count TLV and the frame bodies cmd 5/8/11/13), so no
 *   typed Steps/HeartRate/SpO2/Sleep/Stress/Workout record is decoded yet.
 * - The 50-byte TLV 0x01 of 0x0132 (not sent), the 0x0103 response body (kept raw), the meaning of
 *   the 0x0107 capability bitmap (kept raw), and every watch-initiated payload (kept raw).
 * - Whether the IV counter must strictly increase on the watch side.
 */
class HuaweiDriver internal constructor(
    private val authenticators: Set<HuaweiAuthenticator>,
    private val dispatcher: CoroutineDispatcher,
    private val clock: Clock,
    private val timeouts: TransportTimeouts,
) : WearableDriver {

    @Inject
    internal constructor(authenticators: Set<@JvmSuppressWildcards HuaweiAuthenticator>) :
        this(authenticators, Dispatchers.Default, Clock.systemDefaultZone(), TransportTimeouts())

    override val vendor = WearableVendor.HUAWEI

    /**
     * The app creates an OS bond when pairing (`pairDevice`/`createSystemBond`,
     * [V] `DevicesManagementService.java:174-191`) and the watch reports lost bond keys in link
     * parameter 9 (§3.4). No ATT MTU request: the app never calls `requestMtu` and negotiates frame
     * sizes in 0x0101 instead (§3.1).
     */
    override val linkRequirements = LinkRequirements(bond = true, mtu = null)

    override fun recognize(advertisement: Advertisement): Int = when {
        advertisement.hasService(HuaweiUuids.SERVICE) -> RecognitionScore.VENDOR_SERVICE
        advertisement.nameStartsWith(*NAME_PREFIXES) -> RecognitionScore.NAME
        else -> RecognitionScore.NONE
    }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession =
        HuaweiSession.open(gatt, context, authenticators, dispatcher, clock, timeouts)

    private companion object {
        /**
         * Case-insensitive prefixes from the app's device table (§2.2, [V] `lvi.java:282,322,390,517`):
         * "HUAWEI WATCH" also covers "HUAWEI WATCH GT-…" and "HUAWEI WATCH FIT…"; "HONOR Band" covers
         * "honor band A2"; "HONOR Watch" appears as "honor watch"/"honor Watch-" in `lvi.java`.
         * The app matches names because it scans with an empty filter (§2.1).
         */
        val NAME_PREFIXES = arrayOf("HUAWEI WATCH", "HUAWEI Band", "HONOR Band", "HONOR Watch")
    }
}
