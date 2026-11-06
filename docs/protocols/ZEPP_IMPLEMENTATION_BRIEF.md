# Zepp Driver — Implementation Brief (2026-11-06)

> Engineer-ready checklist from static RE of Zepp 6.10.1 APK.
> Tag: [V] seen in code / [I] inferred / [Ext] public knowledge.
> Evidence snippets in `docs/re-evidence/zepp/`.

---

## Priority 1 — Unblock active driver TODOs

### TODO-1: `ZeppHandshake.kt:56` — v1 watches with module 0x80

**Status: RESOLVED** [V]

The `TODO` comment frames this as "v1 watches may still use 0x0009 when they lack module
0x80/0x82". That is **correct but backwards**: the decision is determined by the BuiltInModule
list, not the channel version number.

**Decision tree** (`DeviceAuthorizationFactory.java:88-94`):
```
if supportModule(0x80) || supportModule(0x82):
    if encryptEnable == null:  → module 0x80 auth  (§5.5)
    else:                      → module 0x82 ECDH  (§5.2, already implemented)
else:
    → char 0x0009 auth         (§5.6, already implemented)
```

**What to implement in `ZeppHandshake.kt`:**

1. After channel version query, query BuiltInModule (module 0x00):
   - Channel v2: command `0x03` → `[0x04, count u16 LE, (id u16 LE, requireEncrypt u8)…]`
   - Channel v1: command `0x00` → `[0x01, count u16 LE, id u8…]`
2. If `moduleList.contains(0x80)` AND `encryptEnable == null` → run module 0x80 auth below.
3. If `moduleList.contains(0x80) || moduleList.contains(0x82)` AND `encryptEnable != null` → existing ECDH path.
4. Else → 0x0009 path (already implemented; also valid for channel-v1 watches without 0x80).

**Module 0x80 session auth** (3-step, no ECDH, `AuthModule.java:401-538`):
```
Step 1 — getAuthorizationInfo
  Send (module 0x80): [0x00]
  Recv:               [code=1, version_u8, apiLevel_low, apiLevel_high, allowLocalBind_u8]

Step 2 — requestRandomNumber
  Send: [0x04, 0x01, 0x00, 0x02]
  Recv: [code=1, random(16 bytes)]

Step 3 — authorize
  encrypted = AES/ECB/NoPadding.encrypt(key=authKey, data=random)
  Send: [0x05, encrypted(16)]
  Recv: [code]  — 0x01 = success
```

No session key derivation. No `EncryptKeyStore`. No channel encryption for module 0x80 watches.

**Test byte sequence** (key = `01..10`, random = `A0..AF`):
- getAuthInfo req: `00`
- requestRandom req: `04 01 00 02`
- random response: `01 A0 A1 A2 A3 A4 A5 A6 A7 A8 A9 AA AB AC AD AE AF`
- authorize req: `05` + AES_ECB(key, random) [compute offline for unit test]
- success response: `01`

**Affected file:** `driver/zepp/src/main/kotlin/.../ZeppHandshake.kt`

---

### TODO-2: `ZeppSession.kt:159` — SpO2 v2 `Spo2PointDataExtends`

**Status: RESOLVED** [V]

**Version selector** (`HMSyncSpo2Profile.java:63-77`):
When `supportVersion == true`, first payload byte[1] = version byte:
- `version == 1` or `supportVersion == false` → 5-byte records (v1, existing code)
- `version == 2` → 65-byte records (v2, needs implementation)
- other → unsupported, return null

**v2 record layout** (`Spo2PointDataExtends.java:41-51`):
```
Offset  Len  Type      Field
0       4    u32 LE    timestamp (UTC seconds)
4       1    u8        spo2      (current point reading, %)
5       60   byte[60]  spo2History (oldest→newest, 1 byte/minute, 60 minutes)
```
Parse loop: `for (i = 0; i < values.length; i += 65)`
Total = `N × 65` bytes.

**Test vector (v2):** timestamp = `00 94 35 65` (= 1700000000 LE), spo2 = `61` (97 %),
60 history bytes of `60` (96 %):
```
00 94 35 65 61 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60
60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60
60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60 60
60 60 60 60 60
```
(65 bytes total)

**How to store history entries:** for index i (0 = oldest, 59 = newest):
```kotlin
timestamp_i = record.timestamp - (59 - i) * 60L
emit HealthRecord.SpO2(timestamp = timestamp_i * 1000, spo2 = spo2History[i].toInt() and 0xFF)
```

**Affected file:** `driver/zepp/src/main/kotlin/.../ZeppSession.kt` (around line 159) or the
dedicated GDSP parser for type 37.

---

### TODO-3: `ZeppSession.kt:80` — PnP ID layout

**Status: RESOLVED** [V]

**Characteristic 0x2A50 layout** (`BaseProfile.setPnpInfo():406-430`):
```
Byte  Len  Type     Field
0     1    u8       vendorSource  (1 = Bluetooth SIG, 2 = USB-IF)
1     2    u16 LE   vendorId      (Huami = 0x0157)
3     2    u16 LE   productId
5     2    u16 LE   productVersion
```
Standard Bluetooth Assigned Numbers §6.5. `productVersion` is LE: `[5] | ([6] << 8)`.

**Affected file:** `driver/zepp/src/main/kotlin/.../ZeppSession.kt` (around line 80, PnP parse).

---

## Priority 2 — New GDSP data types (not yet synced)

### Stress all-day (GDSP type 19)

**Status: RESOLVED** [V] — `HMProSyncDataProfile.M()`

```
Payload byte[0]: skip
byte[1], byte[2], … byte[N]: stress value (u8, 0–255) for each minute
Timestamp for index i: header.startMs + DST_offset_ms + i * 60_000
```

Action: add `GdspDataType.STRESS_ALL_DAY = 0x13` to sync type list; implement parser.

---

### Stress single (GDSP type 18)

**Status: RESOLVED** [V] — `HMProSyncDataProfile.parsePressureSingleData()`

```
Payload byte[0]: skip
5-byte records starting at byte[1]:
  [0..3] timestamp u32 LE (UTC seconds)
  [4]    stress u8 (0–255)
Validation: (payload.length - 1) % 5 == 0
```

Action: add `GdspDataType.STRESS_SINGLE = 0x12`; implement parser.

---

### Resting HR (GDSP type 58 = 0x3A)

**Status: PARTIAL — needs real watch** [I]

Constant `DATA_TYPE_RESTING_HEART_RATE = 58` found at `HMProSyncDataBaseProfile.java:71`.
No parse method found in decompiled Java (likely obfuscated by R8 or in a class with
decompile errors). Inferred layout based on pattern similarity to type 18:
```
[I] 5-byte records:
  [0..3] timestamp u32 LE (UTC seconds)
  [4]    bpm u8
```
Action: implement as inferred; validate against HCI snoop log before merging.

---

## Priority 3 — Module 0x32 sleep write-back (not needed for reading)

**Status: RESOLVED (write-only)** [V]

`SleepDataCodec.decode()` = `throw NotImplementedError`. Module 0x32 is phone→watch only.
The driver does NOT need to implement reading from this module.

To read sleep from Zepp OS watches: use activity heuristic from GDSP type 0x01 (8-byte
records with `sleepProbability` fields), processed by libdataProcess.so algorithm.
Until that is implemented, sleep data is unavailable.

If the driver eventually needs to write computed sleep back to the watch:
See `docs/re-evidence/zepp/sleep_codec_and_stress.md` for the full WriteData payload layout.
SleepStage.status values: 0=light, 1=deep, 2=REM, 3=awake [I/Ext].

---

## Gaps not resolvable from static analysis (need real device)

| Item | Evidence found | Confidence | Test method |
|---|---|---|---|
| Resting HR type 58 parse layout | Constant only | Low [I] | HCI snoop log, 1 sync |
| `allowLocalBinding` flag on current Zepp OS firmware | Code exists, never triggered by app | Low | Send `[0x00]` to module 0x82 |
| Sleep stage status enum | 2-byte field, no enum in Java | Low [Ext] | HCI snoop + Gadgetbridge comparison |
| PAI layout (type 13) | Class exists, layout unread | Unknown | HCI snoop |
| Sport summary protobuf (type 5) | `SportSummary2.java` proto, unread | Unknown | Capture one workout sync |
| Workout detail GPS track (type 6) | `DetailNodeType.java` tags, unread | Unknown | Capture one workout sync |
| BleChannelImpl2.sendData ACK window | Method not decompiled (jadx error) | Medium | jadx debug or REA bytecode |
| ECDH key byte order in libdevice-encrypt.so | .rodata constants match B-163 | Medium | Compare against Gadgetbridge ECDH_B163.java |

---

## Driver capability checklist (current vs implemented)

| Capability | Driver status | Evidence status |
|---|---|---|
| BLE scan (FEE0) + connect | ✓ Implemented | [V] |
| Channel v2 (Zepp OS) auth + ECDH | ✓ Implemented | [V] |
| Channel v1 auth (module 0x80) | ✗ Throws exception | [V] RESOLVED → implement |
| Auth 0x0009 (legacy band) | ✓ Implemented | [V] |
| PnP ID parse | ✗ TODO | [V] RESOLVED → implement |
| GDSP activity sync (type 1) | ✓ Implemented | [V] |
| GDSP HR manual (type 2) | ✓ Implemented | [V] |
| GDSP SpO2 v1 (type 37) | ✓ Implemented | [V] |
| GDSP SpO2 v2 (type 37, v2 record) | ✗ Saves as RawPayload | [V] RESOLVED → implement |
| GDSP Stress all-day (type 19) | ✗ Not in SYNC_TYPES | [V] RESOLVED → add |
| GDSP Stress single (type 18) | ✗ Not in SYNC_TYPES | [V] RESOLVED → add |
| GDSP Resting HR (type 58) | ✗ Not in SYNC_TYPES | [I] PARTIAL → add with caveat |
| GDSP PAI (type 13) | ✗ Not in SYNC_TYPES | Unknown |
| GDSP sport summary (type 5) | ✗ Not in SYNC_TYPES | Unknown |
| Realtime HR (2A37 / OpenAppModule 0x1D) | ✓ Implemented | [V] |
| Live steps (module 0x16) | ✓ Implemented | [V] |
| Sleep reading | ✗ Not implemented | [I] needs libdataProcess heuristic |
| Sleep write-back (module 0x32) | ✗ Not implemented | [V] write-only codec documented |
