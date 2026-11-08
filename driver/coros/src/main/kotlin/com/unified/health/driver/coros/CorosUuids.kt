package com.unified.health.driver.coros

import java.util.UUID

/**
 * GATT identifiers referenced by the COROS Android app (`com.yf.smart.coros.dist` 4.11.8).
 *
 * Section numbers refer to `COROS_DEVICE_PROTOCOL.md`. Unlike the other vendors, this APK build is
 * wrapped by a commercial app-hardening shell: `classes.dex` only decompiles to its 30-class loader
 * (`com.zgpgarg.zmr.kcaqqgc.*`), so none of the UUIDs below come from a decompiled constants class.
 * They are string literals confirmed present in the dex via `strings -n 6 classes.dex` (§0, §3.2 of
 * the protocol doc; raw citations in `docs/re-evidence/coros/uuid-strings.md`). Treat every constant
 * here as [I] (plausible custom transport service) unless noted [V]/[Ext].
 */
internal object CorosUuids {

    /**
     * "weloop"-suffixed variant of the Nordic UART Service pattern (§3.2 [V] string evidence, [I]
     * role): the last 6 bytes of the 128-bit UUID decode as ASCII `weloop` — COROS's predecessor
     * brand name, matching `com.yf.smart.weloopx.app.WeLoopApplication` still being the app's
     * `Application` class name [V]. `*_SERVICE`/`*_WRITE`/`*_NOTIFY` naming mirrors the Nordic UART
     * convention (service / RX-from-central / TX-to-central) but which characteristic is which
     * direction is NOT confirmed — needs a real device or HCI snoop log.
     */
    val WELOOP_UART_SERVICE: UUID = UUID.fromString("6E400001-B5A3-F393-E0A9-77656C6F6F70")
    val WELOOP_UART_WRITE: UUID = UUID.fromString("6E400002-B5A3-F393-E0A9-77656C6F6F70")
    val WELOOP_UART_NOTIFY: UUID = UUID.fromString("6E400003-B5A3-F393-E0A9-77656C6F6F70")

    /**
     * Second `6E400001-…` suffix variant found as a literal in the dex (§3.2 [V]). The suffix
     * `77 75 7C 7F 7F 70` is not clean ASCII, suggesting a different hardware/product generation.
     * [I] Its service/characteristic role is unconfirmed, so it is **not** used for recognition
     * (D-104); only the capture diagnostics probe it.
     */
    val WELOOP_UART_ALT_SERVICE: UUID = UUID.fromString("6E400001-B5A3-F393-E0A9-77757C7F7F70")
    val WELOOP_UART_ALT_WRITE: UUID = UUID.fromString("6E400002-B5A3-F393-E0A9-77757C7F7F70")
    val WELOOP_UART_ALT_NOTIFY: UUID = UUID.fromString("6E400003-B5A3-F393-E0A9-77757C7F7F70")

    /** Standard public Nordic UART Service UUID, also found as a literal (§3.2 [Ext] for the suffix). */
    val NORDIC_UART_SERVICE: UUID = UUID.fromString("6E400001-B5A3-F393-E0A9-E50E24DCCA9E")
    val NORDIC_UART_WRITE: UUID = UUID.fromString("6E400002-B5A3-F393-E0A9-E50E24DCCA9E")
    val NORDIC_UART_NOTIFY: UUID = UUID.fromString("6E400003-B5A3-F393-E0A9-E50E24DCCA9E")

    /** A second custom family with no "weloop"/Nordic suffix link found, but same service+2-char shape (§3.2 [I]). */
    val ADF7_SERVICE: UUID = UUID.fromString("ADF70001-6B99-45E9-98E6-DF67A4C3D291")
    val ADF7_CHAR_1: UUID = UUID.fromString("ADF70002-6B99-45E9-98E6-DF67A4C3D291")
    val ADF7_CHAR_2: UUID = UUID.fromString("ADF70003-6B99-45E9-98E6-DF67A4C3D291")

    /** Nordic Semiconductor legacy DFU service/control-point/packet, used for firmware OTA (§3.2 [Ext]). */
    val NORDIC_DFU_SERVICE: UUID = UUID.fromString("00001530-1212-EFDE-1523-785FEABCD123")
    val NORDIC_DFU_CONTROL_POINT: UUID = UUID.fromString("00001531-1212-EFDE-1523-785FEABCD123")
    val NORDIC_DFU_PACKET: UUID = UUID.fromString("00001532-1212-EFDE-1523-785FEABCD123")

    /** Every custom service that counts as "this is a COROS device" when seen in an advertisement. */
    val VENDOR_SERVICES: Set<UUID> = setOf(
        WELOOP_UART_SERVICE,
        NORDIC_UART_SERVICE,
        ADF7_SERVICE,
        NORDIC_DFU_SERVICE,
    )
}
