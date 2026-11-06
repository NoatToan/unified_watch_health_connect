# Archived: Huawei WearEngine companion driver (2026-11-01)

Removed from the app when the product target became **BLE-only** (no vendor app / SDK in the loop).
Working state at archive time: 6/6 unit tests passing against WearEngine SDK 5.0.3.305.

To restore:
1. Move this folder back to `unified_health_app/driver/huawei-wearengine` (drop this README).
2. Restore the core contract: `CompanionAppDriver.kt.contract` → `core/ble/.../driver/CompanionAppDriver.kt`,
   plus `WearableTransport.COMPANION_APP`, the companion branches in `MultiVendorDeviceScanner`,
   `MultiVendorDeviceConnection`, `DriverRegistry`, `BleModule` (@Multibinds) and `WearableSession.linkLost`.
3. Re-add the Huawei Maven repo (`https://developer.huawei.com/repo/`, groups com.huawei.hms/hmf) in
   `settings.gradle.kts`, `huawei-wearengine` in `libs.versions.toml`, and the module in settings + :app.
