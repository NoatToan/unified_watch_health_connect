# Huawei Driver – Implementation Brief

Engineer-ready checklist derived from two RE passes on Huawei Health v17.0.7.310.
See `docs/protocols/HUAWEI_DEVICE_PROTOCOL.md` for full protocol spec.
See `docs/re-evidence/huawei/` for byte-level evidence with class:line citations.

Status codes: **RESOLVED** (byte layout confirmed, can implement), **PARTIAL** (layout known
but one sub-field missing), **NEEDS-REAL-WATCH** (requires HCI snoop log or hardware access).

---

## Priority 1 – Blockers in `HuaweiSession.kt`

### TODO 1 of 3 – 0x0107 version response TLV layout
**File**: `driver/huawei/src/main/kotlin/.../HuaweiSession.kt`
**Status: RESOLVED**

The 29 response TLV type IDs are now mapped (see §11.1 of protocol doc and
`docs/re-evidence/huawei/version_tlv_types.md`).

Action items:
- Parse type 22 (capabilityBitmap) from 0x0107 response; store in `HuaweiSession.capabilities`.
- Parse type 12 (batteryLevel, int 0-100); emit `HealthRecord.DeviceStatus(batteryPercent)`.
- Parse types 1, 3, 7, 25 (firmware strings); store in `DeviceInfo` passed to `SessionContext`.
- Remove the first TODO comment in `HuaweiSession` and replace with the parse logic.

Test vector: Manufacture a fake 0x0107 response frame with TLV `{type=12, len=1, value=0x4B}` (75%)
and verify `HuaweiSession` emits a `DeviceStatus` record with `batteryPercent = 75`. Add to
`HuaweiDriverTest.kt`.

---

### TODO 2 of 3 – 0x0132/0x0102/0x0103 steps in handshake
**File**: `driver/huawei/src/main/kotlin/.../HuaweiSession.kt`
**Status: PARTIAL**

Sub-items:
- **0x0102 ServiceCapabilityConsult – RESOLVED**
  Request layout: TLV(0x01, [svcCount-1, svcId_1, ...]), optional TLV(0x03, deviceType).
  Response: hex ASCII bitmap; bit 0 of hex-byte at offset (svcId-1) = supported.
  Implement: send request with minimal service list {7}, parse response bitmap, record
  which services the watch reports as supported.

- **0x0103 CommandCapabilityConsult – RESOLVED (request), PARTIAL (response)**
  Request: nested TLV header 0x81 + per-service {TLV(0x02,svcId), TLV(0x03,cmdCount,cmdIds)}.
  Response parsing sequence `d → b → a` confirmed [V]; byte layout of response body is [I].
  Implement the request side now; response can be parsed opportunistically (store raw TLVs
  and log until confirmed with real device).

- **0x0132 SetDeviceTimeZoneId – PARTIAL**
  TLV(0x03, IANA_tz_utf8) is RESOLVED [V]. TLV(0x01, 50-byte cku.c() output) is PARTIAL –
  the 50-byte internal layout is not yet confirmed.
  Implement: skip TLV(0x01) or send 50 zero bytes as placeholder; send TLV(0x03) with correct
  IANA ID. Mark with `// TODO(huawei-protocol): confirm 50-byte cku.c() layout via HCI log`.

---

### TODO 3 of 3 – Service 7 response layouts
**File**: `driver/huawei/src/main/kotlin/.../HuaweiSession.kt`
**Also**: `driver/huawei/src/main/kotlin/.../codec/FitnessCommands.kt`
**Status: NEEDS-REAL-WATCH**

Data model confirmed via jadx (`DataTotalMotion`: step, calorie, distance, height, sleep_time,
motion_type, pushes; `HeartRateDetect` for HR samples). The TLV type IDs used to populate
these fields from service 7 cmd 3/4/5/8/10/11/12/13 responses are unknown.

Blocking on: HCI snoop log capture while Huawei Health syncs. Steps:
1. Enable HCI snoop: `adb shell setprop persist.bluetooth.btsnoopenable true`
2. Pair and sync the watch in Huawei Health
3. Pull: `adb pull /data/misc/bluetooth/logs/btsnoop_hci.log`
4. Open in Wireshark with BTLE dissector; filter `btle.advertising_header.pdu_type == 0`
   then filter by ATT Write/Notify on UUID 0000FE01/FE02-...
5. Decode 0x5A frames from notify packets; look for serviceId=7 responses to cmd 3/4/8

---

## Priority 2 – Transport layer

### Watch-initiated command routing
**File**: `driver/huawei/src/main/kotlin/.../transport/HuaweiTransport.kt:174`
**Status: RESOLVED (design) / Not yet implemented**

Add interface:
```kotlin
interface WatchInitiatedHandler {
    fun onWatchInitiated(serviceId: Int, commandId: Int, payload: ByteArray)
}
```

In `HuaweiTransport.onPayload()`, after the pending-request lookup fails:
```kotlin
val serviceId = (parsedTag ushr 16) and 0xFF
val commandId = parsedTag and 0xFF
watchInitiatedHandler?.onWatchInitiated(serviceId, commandId, payload)
    ?: Timber.w("HuaweiTransport: unhandled watch-initiated svc=$serviceId cmd=$commandId")
```

`HuaweiSession` registers itself as the handler during `connect()` and routes:
- svc=7, cmd varies → real-time HR/fitness alert → emit `HealthRecord.HeartRateSample`
- svc=44 → file transfer request → open `CommonFileReceiver`
- svc=1, cmd=8/9 → battery alert → emit `HealthRecord.DeviceStatus`

---

## Priority 3 – Test coverage

Affected test file: `driver/huawei/src/test/kotlin/.../HuaweiDriverTest.kt`

New test cases needed:
1. `parse_0x0107_response_battery_and_firmware` – inject fake response, assert `batteryPercent`
   and `firmwareVersion` are parsed correctly.
2. `parse_0x0102_response_bitmap_single_service` – hex bitmap `"0100"` → service 1 not supported,
   service 2 supported (bit 0 of byte at index 1 = 1).
3. `send_0x0132_request_contains_iana_tz` – capture outbound frame, assert TLV type=3 value
   equals `TimeZone.getDefault().id.toByteArray(Charsets.UTF_8)`.
4. `watch_initiated_hr_alert_dispatched` – inject unsolicited notify payload for svc=7,
   assert `WatchInitiatedHandler.onWatchInitiated` called with correct serviceId/commandId.

---

## Summary table

| Item | File | Status | Effort |
|---|---|---|---|
| 0x0107 TLV type table | HuaweiSession.kt | RESOLVED | ~2h |
| 0x0102 request+response | HuaweiSession.kt | RESOLVED | ~3h |
| 0x0103 request | HuaweiSession.kt | RESOLVED | ~2h |
| 0x0103 response byte layout | HuaweiSession.kt | PARTIAL [I] | ~1h + verify |
| 0x0132 TLV(0x01) 50-byte | HuaweiSession.kt | NEEDS-REAL-WATCH | — |
| 0x0132 TLV(0x03) IANA tz | HuaweiSession.kt | RESOLVED | included above |
| Service 7 response layout | FitnessCommands.kt + Session | NEEDS-REAL-WATCH | — |
| Watch-initiated routing | HuaweiTransport.kt | RESOLVED (design) | ~2h |
| Unit tests (above 4 cases) | HuaweiDriverTest.kt | Not started | ~3h |
