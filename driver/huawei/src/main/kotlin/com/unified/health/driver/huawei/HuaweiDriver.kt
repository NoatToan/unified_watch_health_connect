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
 * ## Status: direct BLE works only for watches that report `authenticVersion == 0`
 * After 0x0101 the watch's TLV 5 carries `authenticVersion u16 BE`. Version 0 selects the vendor's
 * "Device do not need authentic after check device available" branch ([V] `cke.java:60-65`):
 * [openSession] then skips authentication and runs the normal clear-text
 * `0107 → 0105 → 0102 → 0103 → …` handshake. Watches with a non-zero version demand one of the
 * Huawei app-auth mechanisms (§6, §9 Option B), none of which a third party can implement without
 * vendor material:
 * - legacy HMAC (0x0113) and HiChainLite's Kn step use the CAK hidden in Huawei Health's
 *   white-box crypto, which this project deliberately does not extract or embed;
 * - HiChain / HiChain3 run the native OpenHarmony `deviceauth` PAKE, which is not reimplemented.
 *
 * For those watches [openSession] fails fast with a precise
 * [com.unified.health.core.ble.driver.UnsupportedDeviceException] ("Direct BLE is not available
 * for this watch because it requires Huawei's app-level authentication …") unless a
 * [HuaweiAuthenticator] for that mode is bound in `HuaweiDriverModule`. None is shipped, and no
 * CAK/HiChain code exists. The supported path for such watches is Huawei Health → Health Connect
 * (§7.6, §9 Option A).
 *
 * ## What is implemented and unit-tested
 * - Recognition by advertised name prefix and the FE86 service UUID; bonding as link requirement.
 * - 0x5A framing: single and sliced frames (flags 1/2/3 + index), CRC-16/XMODEM, chunking at the
 *   negotiated single-frame size, reassembly of notifications (§4.1-4.3).
 * - TLVs with base-128 varint lengths and nested (≥ 0x80) tags (§4.4).
 * - Payload encryption envelope 0x7C/0x7D/0x7E with AES-CBC/PKCS5 or AES-GCM and the IV counter (§6.4).
 * - Request/response matching by service+command, 10 s timeout, 3 attempts (§4.5).
 * - 0x0101 link negotiation (frame sizes, interval, auth version, randA, auth type TLV 7, TLV 17
 *   diagnostic) (§5.2), including the vendor's `authenticVersion == 0` no-auth branch.
 * - Pluggable authentication: a Hilt set of [HuaweiAuthenticator], selected per auth type (§6),
 *   used only when the watch reports a non-zero auth version.
 * - The app's handshake steps 4-8 (§5.1, layouts §11, [DeviceConfigurator]):
 *   0x0107 device version (firmware/model/serial/name, also used by `readDeviceInfo`),
 *   0x0105 date/time, 0x0102 service and 0x0103 command capability consult, then the capability-
 *   gated 0x0137 expand capability, 0x013C dual channel, 0x0132 IANA time-zone id with echo check
 *   and one resend, and 0x0112 activity types — in the app's verified order. All clear text on the
 *   no-auth path, encrypted when an authenticator ran.
 * - Live heart rate: service 23 cmd 18 open/close report and cmd 3 notifications mapped to
 *   [com.unified.health.core.model.HealthRecord.HeartRate] (§11.8, evidence in
 *   [com.unified.health.driver.huawei.codec.LiveHeartRateCommands]).
 * - Watch-initiated messages are routed by service and kept raw until the next sync (§11.5).
 * - A best-effort `sync()` that fires every
 *   documented service 7 request (today totals cmd 3, and the frame-count requests behind steps/
 *   distance/calories, continuous HR/SpO2 and sleep/status, cmd 4/10/12) and keeps each accepted
 *   reply as an opaque raw payload for later re-decoding.
 * - Request builders for service 7 history commands 4/5/8/10/11/12/13 (§7.2).
 * - `capabilities` advertises battery level (service 1 cmd 8 when 0x0103 announces it, or the
 *   standard GATT Battery service) and live heart rate (when 0x0103 announces service 23 cmd 18).
 *   History sync is not declared because no typed record from service 7 can be produced yet.
 *
 * ## Still unknown (needs an HCI snoop log of Huawei Health with a real watch)
 * - The exact nesting of service 23 cmd 3 live-HR notifications (the driver walks every nested
 *   level, so any section depth works) and whether the watch needs a periodic re-open.
 * - Every service 7 response layout (the frame-count TLV and the frame bodies cmd 5/8/11/13), so no
 *   typed Steps/HeartRate/SpO2/Sleep/Stress/Workout record is decoded yet.
 * - The 0x0132 reply beyond TLV 1, and every watch-initiated payload (kept raw).
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
