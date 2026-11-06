# Zepp SpO2 v2 — Distilled evidence

Source: `HMSyncSpo2Profile.java`, `Spo2PointDataExtends.java`, `Spo2PointData.java`
Decompile base: `docs/re-evidence/zepp/jadx-base/`

## Version selector (HMSyncSpo2Profile.java:63-77) [V]

When GDSP type 37 (SpO2 point) data arrives:
- If `supportVersion == false` (older device without version byte): use v1 parser directly
- If `supportVersion == true`: **first chunk's byte[1]** (after the seq byte[0]) = version:
  - version == 1 → `Spo2PointData.parse()` (5-byte records, existing format)
  - version == 2 → `Spo2PointDataExtends.parse()` (65-byte records)
  - other → log "not support", return null

The `supportVersion` flag is passed at GDSP profile construction; it is set when the
header response contains extra bytes beyond basic size (device capability flag).

## v1 record format (Spo2PointData.java:34-38) [V]

Each record: **5 bytes**
```
[0..3]  timestamp  u32 LE   (UTC seconds)
[4]     spo2       u8       (% SpO2, e.g. 0x62 = 98)
```
Parse loop: `for (i = 0; i < values.length; i += 5)`

### Test vector (v1)
Timestamp = 1700000000 (2023-11-14 22:13:20 UTC), spo2 = 97 %:
```
00 94 35 65  61
```

## v2 record format (Spo2PointDataExtends.java:41-51) [V]

Each record: **65 bytes**
```
[0..3]   timestamp    u32 LE   (UTC seconds)
[4]      spo2         u8       (current point measurement %)
[5..64]  spo2History  byte[60] (last 60 minutes of SpO2, 1 byte/minute, oldest→newest)
```
Constants: `VERSION = 2`, `POINT_SPO2_SIZE = 65` (private field `e = 60`).
Parse loop: `for (i = 0; i < values.length; i += 65)`

### Test vector (v2)
Timestamp = 1700000000 (above), spo2 = 97 %, history = 60 bytes all 96 %:
```
00 94 35 65  61  60 60 60 60 60 60 60 60 60 60  (×6 = 60 bytes of 0x60)
```
Full: `00 94 35 65 61` + `60`×60 = 65 bytes total.

## Driver impact

`driver/zepp/src/main/kotlin/.../GdspRecordParsers.kt` → `parseSpo2()`:
- Current code emits `unsupportedVersion` when version byte ≠ 1.
- After this finding: add branch for version == 2, parse 65-byte records,
  store `spo2History` as 60 `HealthRecord.SpO2` entries with synthetic timestamps
  `(record.timestamp - (59 - i) * 60)` seconds for index i.
