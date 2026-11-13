# Xiaomi real-device test — 2026-11-13, Tony's Galaxy S24 + Xiaomi Smart Band 10

## What happened

Ran the debug build (`com.unified.health.debug`) via adb on device `RFCWC18NJJZ`
(Samsung SM-S921B). Connected to the Xiaomi Smart Band 10 at `74:FB:17:05:30:DC`.
Two back-to-back connection attempts (14:45:53 and 14:45:57), both failed the
same way. Full trimmed logcat: `2026-11-13_real_device_connect_log.txt` (same
directory).

**Sequence that worked:**
1. BLE connect + GATT service discovery — OK (`AndroidGattClient`, `GATTC_Discover` x N).
2. Read version characteristic 0x0050 — OK: `MiWear protocol version 3.0.65 (V2)`.
3. Open L1 transport session — OK: `XiaomiLink: L1 session started; remote window=3`.
4. `probeBindMode` (since the credential is a freshly self-generated, unbound
   token) — band answered, but...

**Where it failed:**
```
W MultiVendorConnection: Connecting to 74:FB:17:05:30:DC (XIAOMI) failed
com.unified.health.core.ble.driver.UnsupportedDeviceException: This Xiaomi watch
requires a cloud-signed bind (Xiaomi account), which Unified Health does not
perform (protocol §7.3/§8.5 -- D-1193). Bind it once in Mi Fitness, extract the
16-byte token from its Transfer.device.log via adb, and paste it as the Xiaomi
auth token instead.
    at com.unified.health.driver.xiaomi.XiaomiDriver.authenticate(XiaomiDriver.kt:211)
```

## Root cause (confirmed, not a bug)

`Ha0.verifyMode` returned by the band's own `getBindInfo` response is `1`
(`VERIFY_MODE_PSK_CLOUD`), not `2` (`VERIFY_MODE_LOCAL_ECDH`). The M2 local-bind
path implemented in D-1217 only works for watches that answer `verifyMode=2`.
This specific Xiaomi Smart Band 10 unit requires a cloud-signed bind (signed by
Xiaomi's own servers via a Mi Fitness account) — that path is explicitly out of
scope per D-1193 (no cloud credentials/keys extraction). The driver is throwing
the *correct*, by-design exception for this case; nothing to fix in the
bind-mode detection logic itself.

Logged as **D-1222** in `docs/DECISIONS.md`.

## TODO for tonight (Tony to check / decide)

- [ ] **Try the documented workaround**: bind the band once through the real
      Mi Fitness app (so it has a cloud-signed token), then pull the 16-byte
      auth token (see `Transfer.device.log` via adb — same hint the exception
      message gives) and paste it in as the `xiaomi.auth_token` credential
      instead of letting the app self-generate one. If that works, the driver
      should go through `authenticateV2` (reauth), not `probeBindMode`/local-bind,
      and should connect.
- [ ] If pulling the token from Mi Fitness's log is unclear/flaky in practice,
      report back exactly what you see — that UX (how a user is supposed to get
      this token in practice) is not solved yet and might need a dedicated
      "import token from Mi Fitness" flow in the app (new scope, not started).
- [ ] Decide product-level: is cloud-signed bind (talking to Xiaomi's own
      binding servers, not just BLE) something we want to implement at all? If
      yes, that's new scope beyond the BLE-only driver contract and needs a
      fresh decision entry + brief before any agent touches it.
- [ ] Two identical back-to-back failures (14:45:53, 14:45:57) suggest the
      screen's "reconnect"/retry path ran right after the first failure and hit
      the exact same wall — expected given the root cause above, just noting it
      didn't loop forever or hang.

## Evidence

- `2026-11-13_real_device_connect_log.txt` — trimmed logcat (BLE/GATT + XiaomiDriver/
  XiaomiLink/MultiVendorConnection tags only, MAC partially redacted by the OS
  logger in some lines).
- Code path: `driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/XiaomiDriver.kt:195-217`
  (`authenticate()`), `Ha0` verify-mode constants in
  `driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/proto/P90.kt:120-123`.
