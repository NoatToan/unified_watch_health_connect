# Xiaomi MiWear driver — implementation brief (transferable)

> Companion to `XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` (byte-level reference, cited here as
> “Protocol §N”). This file is self-contained enough to hand to an implementation model:
> it states the goal, the honest blocker analysis, the architecture, milestones,
> acceptance criteria, data mapping and test plan.
> Source of truth: Mi Fitness 3.46.1 (`com.mi.health`, versionCode 346001), decompiled at
> `docs/re-evidence/mi/jadx-base/`. Tags: [V] verified, [I] inferred, [Ext] external,
> [Gate] must be settled on a real watch before depending on it.

---

## 1. Goal

Add a `:driver:xiaomi` module to Unified Health that connects directly over BLE to:

1. **MiWear BLE V2** devices — Xiaomi Smart Band 8/9/10, Redmi Watch 3/4/5,
   Xiaomi Watch S1/S2/S3/S4 (non-Wear-OS). **Primary target: Xiaomi Smart Band 10.**
2. **MiWear BLE V1** devices — legacy bands/watches that report protocol version 0
   (OS bond + userId auth; optional cloud bind key).
3. **Wear OS Mi Watch (2019 / Watch 2)** — **not implementable from this APK.** The
   `wearos` module is a stub; treat it as a separate project (Wear OS SDK / Health
   Connect), not part of this driver.

Deliver: connect, bind, authenticate, time sync, battery, device info, full fitness sync
(steps/HR/sleep/workouts) with raw-payload retention for re-parsing, reconnect/backoff and
a foreground sync service.

---

## 2. Blocker analysis — read before coding

The user asked for “no blockers” and “the app binds itself via the cloud”. The RE shows
two hard truths:

### 2.1 Cloud self-bind is not available to a normal third-party app

The health/bind APIs are authenticated with a **Xiaomi Passport service token for SID
`miothealth`** plus a per-request `security` key and signed/RC4-encrypted payloads
(Protocol §8). Those credentials are issued to Mi Fitness's account authenticator
(`OwnAppXiaomiAccountAuthenticatorService`, `com.xiaomi.permission.AUTH_SERVICE`) and its
package signing identity. A different app cannot obtain a `miothealth` service token by
declaring the permission; it needs Xiaomi's service registration/partnership or Mi
Fitness's signing key (not in the APK). Scraping Mi Fitness logs/storage yields
short-lived tokens and is not shippable. Therefore:

- **Do not promise cloud self-bind** unless Xiaomi authorises the app.
- The protocol reference still documents the full cloud API so it can be implemented if
  credentials are ever available.
- Put any cloud code behind `BuildConfig.XIAOMI_CLOUD_BIND` and a startup feasibility
  check; never ship scraped credentials.

### 2.2 The two viable no-cloud paths

1. **Local bind (verifyMode 2)** — the watch itself performs an ECDH bind and gives the
   app a 16-byte token; no Xiaomi account or cloud is involved. Mi Fitness implements this
   in `LocalWearBinderV2` and the watch advertises the mode in `getBindInfo` (Protocol
   §7.1–7.2). **This is the only true self-bind path.** It is [Gate]-dependent: the
   firmware must report `verifyMode == 2`. That is a 5-minute probe on the real device.
2. **Token import (proven)** — bind the band once in Mi Fitness, extract the 16-byte
   `token`/`encryptKey` from Mi Fitness's log via `adb` (no root per public reports), enter
   it in Unified Health; authenticate with Protocol §6.1. This is what Gadgetbridge users
   do for the Smart Band 10 [Ext]. It is not self-bind, but it has no cloud/account crypto
   and no Xiaomi authorisation problem.

**Recommended product flow:** try local bind first when the watch is unbound; if the probe
reports `verifyMode == 1` or local bind fails, fall back to “Import token from Mi Fitness”
with an in-app guide. Offer cloud bind only as an experimental, feature-flagged path.

### 2.3 Wear OS

`WearOSUtilImpl` is empty in this APK; `isWearosRequirementNotPass()` returns `true`. No
Wear OS pairing/auth/data-layer code is present. Scope it out; use Health Connect for Wear
OS data. Do not route Wear OS devices to the MiWear driver.

### 2.4 Version 1 devices

V1 uses an OS bond and `CMD_SEND_USERID` (Protocol §6.2), and its first bind needs a cloud
`bindkey` (`WearBinderV1`, Protocol §7.4). Without cloud credentials, a V1 device can only
be used if it is already bonded to the phone and its userId/auth state is known; treat V1
as best-effort after V2 works.

---

## 3. Module architecture (repo conventions)

New module `driver/xiaomi`, package `com.unified.health.driver.xiaomi`. Implements the
existing `WearableDriver` / `WearableSession` contract (`core/ble`), registers via Hilt
`@Binds @IntoSet`, and adds `WearableVendor.XIAOMI` to `core/model`.

```
driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/
  XiaomiDriver.kt                 // recognition, link requirements, credentials, openSession
  XiaomiSession.kt                // WearableSession: readDeviceInfo, sync, live HR if supported
  XiaomiUuids.kt                  // FE95/5E/5F/50, V1 chars
  XiaomiDeviceType.kt             // V1/V2/V WearOS detection from advertisement/version
  transport/
    XiaomiL0.kt                   // chunked writes + magic/length reassembly
    XiaomiL1.kt                   // header, CRC16/ARC, CMD start, seq/ACK/window, retransmit
    XiaomiL2.kt                   // channel/opCode, AES-CTR, type mapping
    XiaomiLink.kt                 // owns L0+L1+L2, request/response matching by (e,f), timeouts
  crypto/
    HkdfSha256.kt                 // extract+expand, label overload
    AesCcm4.kt                    // 4-byte-tag CCM (BouncyCastle provider or vendored implementation)
    AesCtr.kt                     // AES/CTR/NoPadding with key=IV
    EcdhP256.kt                   // secp256r1, 64-byte uncompressed public key
    XiaomiKeys.kt                 // auth/bind key schedules, token encode/decode
  bind/
    XiaomiBindProbe.kt            // getBindInfo (s7r e=1 f=17); verifyMode/oobMode
    XiaomiLocalBinder.kt          // local ECDH bind (f=18/19/25)
    XiaomiPskBinder.kt            // cloud PSK bind (f=18/19/25 + cloud client)
  auth/
    XiaomiHandshakeV2.kt          // t7r 26/27, HKDF/HMAC/CCM
    XiaomiHandshakeV1.kt          // OS bond + CMD_SEND_USERID
  proto/
    S7r.kt / P90.kt / T7r.kt / Q90.kt   // minimal nano-protobuf codecs for the fields used
    Txos.kt                       // txo/wxo/vwo/swo codecs
    FitnessIds.kt                 // ur9 + 7-byte FitnessDataId
  sync/
    XiaomiFitnessSync.kt          // IDs → request → channel 5 reassembly → confirm
    FitnessFileReceiver.kt        // total/seq segments, optional CRC32
  parse/
    DailyRecordParser.kt          // port of vendor FourDimen layout (v1/v2/v3)
    DailyReportParser.kt
    SleepParsers.kt               // NightSleep + AllDaySleep
    SportParsers.kt               // record/report for needed sports
  cloud/ (feature-flagged)/
    XiaomiCloudAuth.kt            // Passport service token bridge/feasibility check
    XiaomiCloudClient.kt          // endpoints, CloudInterceptor signing, RC4
```

### 3.1 Driver contract choices

- `linkRequirements = LinkRequirements(bond = false, mtu = 512, connectTimeoutMs = 45_000,
  discoveryTimeoutMs = 30_000, operationTimeoutMs = 10_000, refreshGattCacheBeforeDiscovery = true)`.
  V1 sets `bond = true`; V2 uses the same requirements and performs an optional bond only
  when the credential/watch requires it (do not bond by default — it breaks local-bind
  reconnects on some phones).
- `credentialRequirements`:
  - `xiaomi.auth_token` — `HEX_16_BYTES`, label “Xiaomi auth token”,
    `generatable = true` (local bind can create it). The UI must explain that the token
    can be created by local bind **or** imported from Mi Fitness.
  - `xiaomi.app_device_id` — TEXT, required only if the watch asks for it (Wear OS or a
    firmware that rejects an empty id); normally absent.
  - `xiaomi.user_id` — TEXT, generated once (UUID) for local bind; not a Xiaomi account id.
  - `xiaomi.bind_mode` — TEXT (`local`/`token`/`cloud`), for diagnostics only.
- `recognize()`: `FE95` service data → `VENDOR_MANUFACTURER_DATA`; `FE95` service →
  `VENDOR_SERVICE`; name prefixes `Xiaomi`, `Redmi`, `Mi Watch`, `Mi Band`,
  `Xiaomi Smart Band`, `Mi Smart Band` → `NAME`. Never match a Wear OS device.
- `openSession()`: version read → choose V1/V2; V2 → optional bind probe when no token,
  else session auth; then time sync, battery/info; return session. Whole-handshake
  watchdog 120 s, per-step timeouts as above.

### 3.2 State and persistence

Per device (MAC-keyed, using `DeviceCredentialStore`):
`auth_token` (16 bytes), `app_device_id`, `user_id`, `bind_mode`, `did`, `model`, `sn`,
`access_type` (1 = local bind), `last_sync`, `data_id_cursor` (set of confirmed IDs, or the
last confirmed timestamp per data type). Keep the raw fitness files as
`HealthRecord.RawPayload(vendor=XIAOMI, kind="fitness_<dataType>_<daily/sport>_<fileType>",
createdAt=dataId.timestamp)` so parser fixes can `reprocess()` without a new BLE sync.

---

## 4. Milestones and acceptance criteria

### M0 — Probe (½ day, real device)

- Build a debug “Xiaomi probe” screen (or a unit-testable `ProbeSession`) that connects,
  reads `0x50`, opens the link and sends `getBindInfo` (Protocol §7.1).
- Log: version bytes/string, notify/write UUID presence, MTU, `ha0` fields
  (verifyMode, oobMode, model, MAC, SN, DID), whether `getBindInfo` succeeds on a
  factory-reset watch.
- **Acceptance:** a saved log answering Gate 0. If `verifyMode == 2`, proceed with the
  local-bind path; if `1`, implement token import first and keep local bind behind a probe.

### M1 — Transport + auth (V2 token path)

- L0 chunking/reassembly, L1 CMD start, CRC, seq/ACK/window, L2 channel/opcode, AES-CTR.
- Session auth 26/27 with a user-supplied 16-byte token; derive keys; verify device sign;
  send AppConfirm; parse `z90`.
- Time sync (`e=2 f=3`), battery (`e=2 f=1`), watch info (`e=2 f=2`).
- **Acceptance:** on the real band with a token imported from Mi Fitness: link
  authenticates, time is set, battery and model/serial are read, and a second reconnect
  works without re-pairing. Unit tests cover CRC/L1 frames/HKDF/HMAC/CCM/CTR with the
  vectors in `docs/protocols/XIAOMI_TEST_VECTORS.json`.

### M2 — Local bind (if Gate 0 allows)

- Probe → ECDH (P-256) → verify device sign → confirm OOB → bind result CCM → persist
  token/appDeviceId/userId. Handle oobMode 3 (watch button) with a progress dialog and
  timeout; oobMode 0/2 auto-confirm.
- **Acceptance:** factory-reset band binds from the app without Mi Fitness; token stored;
  reconnect authenticates; a second app install with the same token also connects (proves
  the token is the credential, not a transient session).

### M3 — Fitness ID sync + file receiver

- `f=1/2` get today/history IDs, `f=3/4` request, channel 5 segment reassembly, optional
  CRC32, `f=5` confirm.
- Persist raw payloads; dedupe by 7-byte data ID + timestamp; skip IDs already confirmed.
- **Acceptance:** a day with steps/sleep yields the expected number of raw files; no
  duplicates on a second sync; the watch does not lose data if the app disconnects
  mid-file (re-request on reconnect).

### M4 — Parsers and Unified Health integration

- `DailyRecordParser` (minute steps/HR/calories/distance/sport/stress/spo2) → `Steps`,
  `HeartRate`, `DailyActivity`; `DailyReportParser` → resting HR, daily totals, SpO2/stress
  summaries; `NightSleep`/`AllDaySleep` → `Sleep` stage segments; `SportRecord/Report` →
  `Workout` (+ laps/samples if the layout exposes them).
- **Acceptance:** one real day matches Mi Fitness within expected rounding (steps ±1%,
  sleep stages ±1 min, workout totals ±1%); reprocessing a stored raw payload after a
  parser fix reproduces the same records without a live watch.

### M5 — Reconnect / foreground service

- Exponential backoff 2 s → 256 s, reset on success; guard for BT-off/app-inactive;
  reconnect after link loss; foreground service with a persistent notification; sync
  scheduling (manual + periodic) and battery updates.
- **Acceptance:** kill the app / walk out of range / toggle BT; the service reconnects and
  resumes sync; no duplicate records; battery/notification behavior survives Doze.

### M6 — V1 (best effort)

- Version 0 detection; OS bond; `CMD_SEND_USERID`; optional cloud bind-key path behind a
  feature flag; the V1 family UUID table. Do this only after M1–M5 are stable.

### M7 — Wear OS (separate project, not this driver)

- Use the Wear OS SDK/CompanionDeviceManager/Wearable Data Layer; read health data via
  Health Connect. Do not add it to `:driver:xiaomi`.

---

## 5. Implementation details that are easy to get wrong

1. **HKDF argument order.** `iql.i(label, ikm, salt)` → Extract uses `salt` as the HMAC
   key and `ikm` as the message; Expand uses `info=label`. Auth uses
   `ikm=token, salt=appRandom||deviceRandom`; bind uses `ikm=sharedKey, salt=appRandom||
   deviceRandom`.
2. **Sign message order differs from the HKDF salt order.** Device sign is
   `HMAC(deviceKey, deviceRandom||appRandom)`; app sign is
   `HMAC(appKey, appRandom||deviceRandom)`. Bind verify is
   `HMAC(sharedKey, deviceRandom)` and confirm is `HMAC(sharedKey, appRandom)` (append oob
   only if non-empty). Do not reuse one concatenation for everything.
3. **AES-CCM, not GCM.** Tag is 4 bytes, nonce is 12 bytes. The vendor's `iql.d` returns
   `ciphertext||tag`; the device-info nonce is `appIV||8 zero bytes`; the bind-result
   nonce is `10 11 12 13 14 15 16 17 18 19 1A 1B`; bind AAD is `"bind-data"`.
4. **AES-CTR key=IV.** Session data (`type 101`) is CTR with the 16-byte app/device key as
   both key and IV. Do not use the 4-byte IVs here.
5. **CRC-16/ARC, init 0, reflected.** Not CRC-16/CCITT; the table starts `0, 0xC0C1,
   0xC181, 0x0140`. Frame CRC covers only the payload, not the header.
6. **L1 header byte order.** `magic u16 LE, (frx<<4)|type, seq, dataLength u16 LE,
   crc u16 LE`. The parser reads type from the low nibble and frx from bit 4.
7. **Session start is mandatory.** No DATA before CMD_L1START_REQ/RSP. The config list is
   TLV (`type u8, len u16 LE, value`); parse remote MPS/TX window/send timeout.
8. **ACK cumulativity and frx.** ACK with seq N releases ≤ N; `frx==1` data is accepted
   without an ACK. Immediate ACK when the L2 channel byte is 1 or 8; otherwise cumulative.
9. **Responses have no request id.** Match by L2 type (channel/opCode) then by
   `s7r.e`+`s7r.f`; a response with field 100 error is a failure. Implement a per-`(e,f)`
   queue with a timeout.
10. **Fitness IDs are 7-byte LE records** (timestamp u32, tz int8/15min, version u8,
    type byte). Response `ur9` may carry one ID (field 2) or a concatenation (field 3).
11. **Fitness files use total/sequence u16 LE and optional CRC32.** Reassemble strictly by
    sequence; reset on a gap; the merged payload starts with the 7-byte ID. Confirm with
    `f=5` only after parsing/storing.
12. **DailyRecord is bit-packed.** `dataValid` is a nibble bitmap; each record's size is
    the sum of present field byte sizes; fields use `(raw & mask) >>> startBit`. Port the
    vendor's `FourDimenDataInfo` arrays per version; do not assume a fixed struct.
13. **Time zone is sint32 zigzag** in 15-minute units (`TimeZone.getRawOffset()/900000`);
    the `tzId` string is informational.
14. **Token storage is hex.** The vendor writes uppercase hex and parses it back; the user
    may paste `0x`-prefixed 32-hex. Normalize to 16 bytes.
15. **Only one app can hold the link.** Force-stop/disable Mi Fitness during development;
    the band may also require “Connect new phone” mode before accepting a new identity.

---

## 6. Data mapping to Unified Health

| Vendor data | Record |
|---|---|
| DailyRecord steps (`type 2`) per minute | `HealthRecord.Steps(start,end,count)` + daily `DailyActivity` aggregate |
| DailyRecord hr (`type 8`) | `HealthRecord.HeartRate` |
| DailyRecord calories (`type 4/9/11`), distance (`7`) | `DailyActivity.activeKcal` / `distanceMeters` |
| DailyRecord stress (`15`), spo2 (`14`) | `HealthRecord.Stress` / `SpO2` |
| DailyReport restHr (`3`) | `RestingHeartRate(date, bpm)` |
| DailyReport max/min hr + times | `HeartRate` points or workout-independent summaries (choose one; document) |
| NightSleep / AllDaySleep segments | `HealthRecord.Sleep(start,end,stage)` with `SleepStage.{AWAKE,REM,LIGHT,DEEP}` |
| Sport record/report | `HealthRecord.Workout` (+ `WorkoutLap`/`WorkoutSample` when the payload exposes them) |
| Any raw fitness file | `HealthRecord.RawPayload(XIAOMI, "fitness_<...>", dataId.timestamp, bytes)` |
| Device info | `DeviceInfo(model, firmwareVersion, serialNumber, batteryPercent)` |
| Battery updates after initial read | `batteryUpdates: Flow<Int>` |

Sleep mapping needs care: the vendor reports durations/stages in separate fields, not a
full hypnogram for every firmware. Start with the summary record (`NightSleepParser`) and
derive segments only when the payload contains stage transitions (`AllDaySleepParser`).
If the stage timeline is absent, emit a single `Sleep` record for the total duration and
leave stages empty rather than inventing them.

---

## 7. Test plan

### 7.1 Unit / JVM

- CRC-16/ARC table and the L1 frame vector
  `a5a5 0300 1e00 5ef5 0101080110111a165a1408001210e807…`.
- L1 start frame and config parse.
- HKDF/HMAC/CCM/CTR vectors from `docs/protocols/XIAOMI_TEST_VECTORS.json`.
- Protobuf encoders/decoders: getBindInfo, time, battery, fitness IDs; unknown-field
  tolerance; error field 100.
- L2 type mapping and response matching (same e/f; wrong e/f ignored).
- Fitness file receiver: 3 segments, out-of-order reset, CRC failure, duplicate confirm.
- DailyRecord parser: build a synthetic record from the vendor arrays and assert one
  minute of steps/hr; version selection.

### 7.2 Simulator / E2E

- `core/demo` virtual Xiaomi device implementing the same L1/L2 + auth + a canned fitness
  file; E2E flow: scan → connect → token import → sync → records visible. Use the vectors
  to keep the simulator byte-exact. Add a “local bind” simulator variant with ECDH.
- Reprocess test: store a raw file, re-run `reprocess`, assert idempotent records.

### 7.3 Real watch (Band 10)

1. Factory-reset band; Mi Fitness uninstalled/force-stopped.
2. M0 probe: record `0x50`, `getBindInfo`, verifyMode/oobMode. **This decides local bind
   vs token import.**
3. Token import: pair in Mi Fitness once, `adb shell` read
   `/sdcard/Android/data/com.xiaomi.wearable/files/log/Transfer.device.log`, grep
   `token=`/`encryptKey=`, enter 32 hex chars; then force-stop Mi Fitness.
4. Auth + time + battery + info; capture `adb logcat` and, if possible, an HCI snoop log
   (`Developer options → Enable Bluetooth HCI snoop log`) and save it under
   `docs/re-evidence/xiaomi/`.
5. Sync a day with steps + sleep; compare against Mi Fitness; confirm no duplicates on a
   second sync; reboot the band and reconnect.
6. Failure drills: wrong token (expect error 4/not bound; clear message), BT off/on,
   out of range, Mi Fitness competing, watch reboot.

### 7.4 Cloud (only with authorization)

- Signing vector check first (offline), then a mock server; never hit production with
  scraped credentials. A Passport feasibility test: use `XiaomiAccountManager` with the
  app's own SID and see whether `getServiceToken(..., "miothealth")` returns
  `ERROR_NONE`; if not, stop and use local/token.

---

## 8. Risks / open gates

| Risk | Impact | Resolution |
|---|---|---|
| Watch reports `verifyMode=1` only | no local bind | token import (proven) or Xiaomi partnership; cloud code stays flagged |
| `appDeviceId`/userId requirements on non-Wear-OS | auth error 4 | log `sendAppVerify`; try empty then the vendor-style `MD5(deviceId+MAC+userId)` (`DeviceUtil.getDeviceID()`, Android-ID-like) |
| `ha0` field mapping for PSK bind | cloud bind wrong | HCI snoop of a Mi Fitness bind |
| Firmware differences in `swo`/`vwo`/fitness IDs | parse gaps | tolerate missing fields; log raw protobuf; per-model fixtures |
| Fitness payload version/layout | wrong health data | port the vendor parser for the observed `dataId.version`; raw-payload reprocess |
| Channel 5 encryption/CRC | file corruption | handle opCode 1 and 2, CRC optional; verify on a real file |
| Watch contention / “connect new phone” | cannot connect | force-stop Mi Fitness; user enables the mode; document in UI |
| Wear OS scope | user expectation | explicitly out of this driver; Health Connect/Wear OS SDK project |
| Xiaomi ToS / account misuse | legal | interoperability on the user's own device only; no credential scraping or bypass; no cloud impersonation |

---

## 9. Definition of done

- `:driver:xiaomi` builds, lint clean, unit tests green, no new dependencies outside
  BouncyCastle (or a small vendored CCM) and the existing Hilt/Compose stack.
- A real Band 10 completes: local bind **or** token import → auth → time/battery/info →
  one full day sync → records in the app → reconnect after reboot.
- Raw payloads stored and `reprocess()` implemented for the parsers shipped.
- Foreground service + backoff + user-facing errors (wrong token, already bound, watch
  out of range, Mi Fitness holding the link).
- Docs updated: this brief, the protocol doc, `docs/DECISIONS.md` (D-…. for the local
  bind/token-import decision and the cloud blocker), and `docs/protocols/` index.
- No cloud self-bind shipped without explicit Xiaomi authorization; the feature flag is
  off by default.

---

## 10. What to hand to the implementing model

1. This brief.
2. `XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` (byte-level reference).
3. `docs/re-evidence/mi/jadx-base/sources/` (the decompiled source; cite paths when a
   detail is missing).
4. `docs/re-evidence/mi/tools/gen_vectors.js` + `docs/protocols/XIAOMI_TEST_VECTORS.json`.
5. The existing `core/ble` contract (`WearableDriver`, `WearableSession`, `LinkRequirements`,
   `DeviceCredentialStore`) and one existing driver (`driver/zepp`) as the style template.

Implementation order is M0 → M1 → M2 (if gate allows) → M3 → M4 → M5 → M6. Do not start
with the cloud or Wear OS; both are blocked/out of scope for an independent app and would
burn the schedule without producing a working connection.
