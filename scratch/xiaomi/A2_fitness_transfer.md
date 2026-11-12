You are implementing fitness ID sync and the channel-5 file receiver for `:driver:xiaomi` in
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`. Non-secret work; work only inside
`driver/xiaomi/`.

PRECONDITION: the module skeleton, L0/L1/L2 transport, `XiaomiLink`, `FitnessIds`/`ur9` codecs,
`XiaomiSession` and a stub `sync/XiaomiFitnessSyncImpl.kt` already exist. Read the actual code.

READ:
- `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` §9.3/§9.4 (and §9.5 for context)
- `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md` M3, §5 items 10–12, §6 data mapping
- `driver/xiaomi/.../transport/XiaomiLink.kt`, `proto/FitnessIds.kt`
- `core/ble/.../driver/WearableSession.kt` (`SyncRequest`, `SyncProgress`)
- `core/model/.../HealthRecord.kt` (`RawPayload`), `HealthRecordSink` in core:ble
- `driver/zepp`/`driver/garmin` for sync/progress style.

TASK — replace the `sync/XiaomiFitnessSyncImpl.kt` stub with a real implementation; add a small
`sync/FitnessFileReceiver.kt` if useful. Do not implement payload parsers (another agent owns
`parse/`); emit `HealthRecord.RawPayload` and return 0 non-raw records for now.

Required behavior:
1. Query today IDs (`s7r e=8 f=1`, `ur9{5: nu9{1: isAutoSync ? 1 : 0}}`) and history IDs
   (`e=8 f=2`, no payload). Response `ur9` field 2 (one ID) or field 3 (concatenated 7-byte IDs).
2. Decode each 7-byte ID (timestamp u32 LE, tz int8/15min, version u8, typeByte) and keep enough
   for a raw-payload label and time filter. Skip IDs older than `since.effectiveSince()`
   (bounded first-sync window from `SyncRequest`), dedupe by the 7 raw bytes, and process in
   ascending timestamp order. Skip IDs whose timestamps are in
   `SyncRequest.knownRawPayloadTimestamps` when available; otherwise dedupe within the session.
3. For each ID request one file (`e=8 f=4`, `ur9{3: 7-byte ID}`), wait for channel 5 packets
   (type 102), and reassemble:
   `u16 LE totalSegments`, `u16 LE sequence` (1-based), segment data. Accept segments in any
   order but require every sequence 1..total exactly once; reset/discard on duplicate/gap,
   enforce a timeout (named constant, e.g. 30 s), and a maximum merged size (e.g. 4 MiB).
   Merged bytes = 7-byte ID + payload, with an optional trailing CRC32. If the last 4 bytes
   match CRC32 of the prefix, strip them; if not, keep the bytes (mark `[I]`: CRC presence is
   firmware-dependent) and log only a short warning.
4. Validate the merged ID equals the requested ID; otherwise discard and report a protocol error.
5. Deliver `HealthRecord.RawPayload(vendor = WearableVendor.XIAOMI,
   kind = "fitness_<dataType>_<daily|sport>_<fileType>" (per implementation brief §6),
   createdAt = dataId.timestamp, bytes = payload)` to the sink, then confirm the ID (`e=8 f=5`,
   `ur9{3: 7-byte ID}`) **only after** the sink accepted the raw payload. On any failure do not
   confirm, so the watch retains the data; continue with the next ID where safe.
6. Report progress with `progress.report(fraction, stage)`; stage text in Vietnamese, e.g.
   "Đang tải dữ liệu từ đồng hồ (3/12 file)...". Keep the fraction monotonic and bounded.
7. Bound the number of files per sync (e.g. 200) and handle cancellation cleanly. The session
   interface may pass `SyncRequest`/`since`; adapt to the actual `XiaomiFitnessSync` signature,
   making the smallest interface edit if needed and reporting it.
8. Channel 5 may arrive encrypted (opCode 2); `XiaomiLink` already decrypts. Do not implement
   crypto. If the link lacks a channel-5 subscription hook, add the smallest one and report it.

TESTS (JVM, `driver/xiaomi/src/test/kotlin/...`):
- ID decode/encode + filtering by timestamp + dedupe.
- Segment reassembly: 3 segments in order, out-of-order, duplicate, gap reset, timeout,
  oversized file, optional CRC present/absent.
- Raw kind label for daily/sport/fileType combinations.
- A fake link/sink test that verifies confirm (`f=5`) happens only after sink acceptance and not
  after a failure.
Do not test parsers or auth.

CONSTRAINTS:
- Use named timeouts, never swallow `CancellationException`.
- Do not edit `auth/`, `crypto/`, transport framing semantics, or anything outside
  `driver/xiaomi/`. Do not touch `core/`, `app/`, `feature/`, or other drivers.
- Do not commit. No vendor secrets/GPL code.

VERIFY:
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
./gradlew :driver:xiaomi:testDebugUnitTest :driver:xiaomi:lintDebug
```
Confirm test XML exists. Report files changed, test count/result, exact raw-payload kind format,
and any protocol assumption marked `[I]`.
