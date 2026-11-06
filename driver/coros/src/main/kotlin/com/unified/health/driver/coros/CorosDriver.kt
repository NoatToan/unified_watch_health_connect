package com.unified.health.driver.coros

import com.unified.health.core.ble.driver.LinkRequirements
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.WearableVendor
import javax.inject.Inject

/**
 * COROS watches (APEX/PACE/VERTIX/DURA/M1/OMNI GPS watches, plus HR01/HR31 heart-rate straps, POD GPS
 * pods, Cadence/Speed sensors…), reverse-engineered from `com.yf.smart.coros.dist` 4.11.8
 * (`COROS_DEVICE_PROTOCOL.md`).
 *
 * **This APK build is wrapped by a commercial app-hardening shell** that defeats static
 * decompilation of the real `com.yf.lib.bluetooth`/`com.yf.coros.blecmd` classes (protocol doc §0).
 * Only class/package names and string constants survive (via `strings` on `classes.dex`), which is
 * enough to confirm the transport *architecture* (custom "UART-over-BLE" service, Protobuf command
 * layer, OS bonding) but NOT enough to safely reproduce the actual command framing, command ids or
 * handshake byte layout. Per the driver contract's "never invent a layout" rule, this driver
 * implements only the safe subset: recognition, OS bonding, and the standard SIG GATT fallback
 * (Device Information / Battery / Heart Rate). Full history sync is a documented
 * `TODO(coros-protocol)` pending a real device or an HCI snoop log (protocol doc §6, §9).
 */
class CorosDriver @Inject constructor() : WearableDriver {

    override val vendor = WearableVendor.COROS

    /**
     * Bond before talking to the device (protocol doc §2.4 [V]: the app listens for
     * `ACTION_BOND_STATE_CHANGED`, and a dedicated `YfBtSystemBondAuth` class name ties auth to OS
     * bonding). MTU 247 is an unverified default (§3.3 [I]), not a value read from the app.
     *
     * D-105 in `docs/DECISIONS.md`: **Tạm** — needs confirmation on real hardware.
     */
    override val linkRequirements = LinkRequirements(bond = true, mtu = REQUESTED_MTU)

    override fun recognize(advertisement: Advertisement): Int = when {
        CorosUuids.VENDOR_SERVICES.any { advertisement.hasService(it) } -> RecognitionScore.VENDOR_SERVICE
        advertisement.nameStartsWith(*NAME_PREFIXES) -> RecognitionScore.NAME
        else -> RecognitionScore.NONE
    }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession =
        CorosSession(gatt).also { it.start() }

    internal companion object {
        /** Unverified default; the app's own requested MTU was not found in the recoverable strings (§3.3 [I]). */
        const val REQUESTED_MTU = 247

        /**
         * Every COROS model name confirmed present as a string literal in `classes.dex`
         * (`docs/re-evidence/coros/device-names.md` [V]) starts with `COROS ` or `COROS_`; one
         * prefix covers both. Not extended to bare model words (`APEX`, `VERTIX`…) because no
         * evidence shows the watch ever advertises a shortened name, and those words are common
         * enough in other products to risk false positives.
         */
        val NAME_PREFIXES = arrayOf("COROS")
    }
}
