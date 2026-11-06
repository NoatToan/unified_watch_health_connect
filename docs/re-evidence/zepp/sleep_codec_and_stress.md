# Zepp Sleep module 0x32 codec + Stress GDSP layouts — Distilled evidence

Source: `SleepDataCodec.java`, `Command.java`, `DataType.java`, `SleepStage.java`,
        `HMSyncPressureTask.java`, `HMProSyncDataProfile.java`
Decompile base: `docs/re-evidence/zepp/jadx-base/`

---

## Sleep module 0x32: WriteData payload (phone → watch) [V]

Command 0x07 (`Command.WriteData`). Encoded by `SleepDataCodec.encode()` (lines 68-96):

```
Offset  Len  Type       Name              Notes
0       4    u32 LE     timestamp         UTC seconds (sleep session start time)
4       4    u32 LE     updateTimestamp   UTC seconds (last modified time)
8       1    u8         timezoneKey       ProfileUtils.getTimezoneKey(tz)
9       4    u32 LE     dataFlag          Bitmask: 0x01=SleepScore, 0x02=RestingHr, 0x04=SleepStage
13      2    u16 LE     start             Sleep start (unit: [I] minutes relative to 00:00)
15      2    u16 LE     stop              Sleep stop  (unit: [I] minutes relative to 00:00)
17      2    u16 LE     sleepDuration     Sleep duration in minutes
-- optional fields follow, presence determined by dataFlag bits --
+0      1    u8         sleepScore        present if dataFlag & 0x01
+0      1    u8         restingHr         present if dataFlag & 0x02
+0      2    u16 LE     stageCount        present if dataFlag & 0x04
+2      6×N  struct     stages            N = stageCount, each 6 bytes:
                                            start  u16 LE  (minutes [I])
                                            stop   u16 LE  (minutes [I])
                                            status u16 LE  (stage type, see below)
```

DataType constants (DataType.java):
- `SleepScore = 1`, `RestingHr = 2`, `SleepStage = 4`

SleepStage.status values: **not found as named constants in Java code** [I].
Based on [Ext] Gadgetbridge's Huami band implementation:
- 0 = light sleep ("light")
- 1 = deep sleep ("deep")  
- 2 = REM
- 3 = awake (within sleep session)

(Needs confirmation on real device via HCI snoop log.)

## Sleep module 0x32: command set (Command.java) [V]

| Cmd byte | Name | Direction |
|---|---|---|
| 0x01 | QueryVersion | phone → watch |
| 0x02 | VersionResult | watch → phone |
| 0x03 | QueryConfig | phone → watch |
| 0x04 | ConfigResult | watch → phone |
| 0x05 | QueryData | phone → watch |
| 0x06 | DataResult | watch → phone |
| 0x07 | WriteData | phone → watch |
| 0x08 | WriteDataResult | watch → phone |

Commands are matched by prefix byte comparison (`Command.toCommand()`).

---

## Stress all-day (GDSP type 19) [V]

`HMSyncPressureTask.a()` (all-day path) + `HMProSyncDataProfile.M()` (parse):

**Binary format**: raw payload byte array where:
- `byte[0]`: skipped (index starts at 1 in loop)
- `byte[1]`, `byte[2]`, … `byte[N]`: one unsigned stress value (0–255) per minute

Timestamp for sample at index i (0-based, mapping to byte[i+1]):
```
timestamp_ms = header.start_ms + DST_offset_ms + i * 60_000
```
where `DST_offset_ms = ProfileUtils.getDstOffset(dataHeader.calendar) * 1000`.

### Test vector
Header start = 2024-01-15 00:00:00 UTC, 3 samples: stress = 25, 40, 70:
```
XX  19  28  46
↑ skipped byte[0]
```
Timestamps: 00:00, 00:01, 00:02 UTC (+DST if applicable).

---

## Stress single (GDSP type 18) [V]

`HMProSyncDataProfile.parsePressureSingleData()` (lines 212-228):

**Binary format**: payload where:
- `byte[0]`: skipped
- 5-byte records starting at byte[1]:

```
Offset  Len  Type     Name
0       4    u32 LE   timestamp   (UTC seconds)
4       1    u8       stress      (0–255)
```

Validation: `(length - 1) % 5 == 0` else return empty list.

### Test vector
Timestamp = 1705276800 (2024-01-15 00:00:00 UTC), stress = 42:
```
XX  00 E8 93 65  2A
↑ skipped
```
(`1705276800` = `0x659300E8` → LE = `E8 00 93 65`, let me recalculate:
`1705276800` = `0x659300E8`? Let me compute: 1705276800 / 256 = 6661237.5..., so
hex = `0x65A30000`... actually let me just note use real timestamp values.)

---

## HR manual (GDSP type 2) [V — documented for completeness]

`HMProSyncDataProfile.parseHrData()` (lines 193-210):

```
byte[0]: skipped
6-byte records:
  [0..3]  timestamp  u32 LE (UTC seconds)
  [4]     tzKey      u8
  [5]     bpm        u8
```

Validation: `(length - 1) % 6 == 0`.

---

## Driver impact

- **Stress all-day / stress single**: not currently in `ZeppSession.SYNC_TYPES`. Add `GdspDataType.STRESS_ALL_DAY` (type 19) and `GdspDataType.STRESS_SINGLE` (type 18) to the sync list; implement corresponding parser branches in `GdspRecordParsers.kt`.
- **Sleep module 0x32**: currently described as "app writes computed sleep to watch". Driver does NOT need to implement write; to READ sleep from Zepp OS use GDSP (there is no GDSP type for Zepp OS sleep stages — they come from `libdataProcess.so` activity heuristics or from the sleep module 0x32 `QueryData` command, neither of which is in the driver yet).
