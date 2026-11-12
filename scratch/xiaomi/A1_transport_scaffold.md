You are implementing the non-secret foundation of `:driver:xiaomi` in the Unified Health Android repo at
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`.

CONTEXT: the module `driver/xiaomi` already exists and is wired (`settings.gradle.kts`,
`app/build.gradle.kts`, `WearableVendor.XIAOMI`); it contains only `package-info.kt` and a build
file with core:ble, coroutines, BouncyCastle and core:testing. Do NOT edit Gradle files outside
`driver/xiaomi/`, `settings.gradle.kts`, `app/build.gradle.kts`, or anything in `core/`, `app/`,
`feature/`, or another driver. Another session has unrelated uncommitted changes in `core/demo`;
never touch or build `core/demo`.

READ FIRST (do not skip):
- `CLAUDE.md` (repo rules, build command, delegation model)
- `.claude/agents/wearable-driver-engineer.md` (your engineering contract)
- `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` (wire protocol; cite section numbers in comments)
- `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md` (architecture, milestones, module layout)
- `docs/protocols/XIAOMI_TEST_VECTORS.json` (byte vectors)
- `core/ble/.../driver/WearableDriver.kt`, `WearableSession.kt`, `WearableProtocolException.kt`
- `core/ble/.../gatt/GattClient.kt`, `core/ble/.../protocol/ByteReader.kt`/`ByteWriter.kt`
- `core/testing/.../FakeGattClient.kt`, `driver/standard` and `driver/zepp` for style.

SCOPE — NON-SECRET ONLY. Another agent (DeepSeek) will implement all cryptography, auth, bind,
token and cloud code. You must NOT implement HKDF, HMAC, AES-CCM, AES-CTR, ECDH, the MiWear token,
the bind handshake, `WearAuthV2` messages, the cloud client/signing, or secret storage logic.
Create interfaces/stubs only for those; implement the transport/codecs/device layer fully.

DELIVERABLES (under `driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/`):

1. `XiaomiUuids.kt`: MiWear service `0000fe95-0000-1000-8000-00805f9b34fb`, V2 notify `005e`,
   write `005f`, version `0050`, V1 chars 51/52/53/55, plus the version-read rule and channel
   feature constants. Constants only.

2. `transport/XiaomiL0.kt`: chunked writes never exceeding `gatt.maxWriteLength`; reassembly by
   `0xA5A5` magic + `dataLength`; drop/scan behavior for junk; no interleaving. Protocol §2/§3.

3. `transport/XiaomiL1.kt`: 8-byte header (magic, type/frx, seq, len, CRC-16/ARC), packet types
   NAK/ACK/CMD/DATA, CMD start request/response config TLV (VERSION/MPS/TX_WIN/SEND_TIMEOUT),
   seq assignment mod 256, window 32, cumulative ACK, NAK, retransmit-on-timeout, immediate ACK
   for L2 channel 1/8 and otherwise cumulative (protocol §3). Encapsulate CRC in a small internal
   object; the crypto agent must not need to touch it. Use `ByteWriter`/`ByteReader`.

4. `transport/XiaomiL2.kt`: channel+opCode framing, channel→type mapping, opCode 1/2/3. Do NOT
   implement encryption: accept `encrypt: (ByteArray) -> ByteArray` / `decrypt` hooks supplied by
   the session (default identity), apply encrypt only for opCode==2 / type 101, decrypt when
   incoming opCode==2. Protocol §4.

5. `transport/XiaomiLink.kt`: owns L0/L1/L2; opens the link (L1 START); exposes
   `suspend fun request(e: Int, f: Int, payload: ByteArray?, timeoutMs: Long = ...): S7r`,
   `suspend fun requestRaw(type: Int, payload: ByteArray, timeoutMs: Long): ByteArray`, and
   `suspend fun send(...)` for best-effort commands. Matches responses by `(s7r.e, s7r.f)`; field
   100 becomes a typed protocol exception; one request in flight per channel; named timeouts;
   cancellation-safe; installs the waiter BEFORE writing. `close()` is idempotent.

6. `proto/NanoProto.kt`: minimal protobuf varint/tag/length-delimited reader+writer for the fields
   used here. Malformed input must throw `MalformedPayloadException` (add this in the driver package
   or `proto/`), never crash with IndexOutOfBounds.

7. `proto/S7r.kt`, `proto/P90.kt`, `proto/T7r.kt`, `proto/Q90.kt`: codecs for the envelope fields
   used by protocol §6/§7/§9 (oneof field numbers; field 100 error). Preserving unknown fields is
   not required. Include only fields these tasks need, with clearly named extension points.

8. `proto/Txos.kt`: `txo` with `wxo` (`n64`/`t64`/`v64`), `vwo` battery, `swo` watch info;
   encode/decode. Protocol §7.

9. `proto/FitnessIds.kt`: `ur9`/`nu9` codecs + 7-byte `FitnessDataId` encode/decode (protocol §9.3)
   — codecs only, no file transfer/parsing (fitness agent owns those).

10. `device/XiaomiDeviceCommands.kt`: time sync (`e=2 f=3`), battery (`e=2 f=1`), watch info
    (`e=2 f=2`) using `XiaomiLink`; typed results; time sync best-effort (vendor needResponse=false).

11. `auth/XiaomiAuthenticator.kt`: interface with `probeBindMode`, `authenticateV2`, `localBind`,
    `authenticateV1` (V1 may throw a clear `UnsupportedDeviceException` until core bond support
    exists), and a `XiaomiAuthResult` data class (session keys/capabilities/token if generated).
    Transport-agnostic: takes `XiaomiLink` + `CredentialReader`/`CredentialWriter`.

12. `auth/XiaomiAuthenticatorImpl.kt`: `@Inject constructor()` implementing the interface; every
    method `TODO("M2: implemented by the crypto/auth agent")`. No crypto added here.

13. `sync/XiaomiFitnessSync.kt`: interface `sync(link, sink, progress, since): Int`.
    `sync/XiaomiFitnessSyncImpl.kt`: `@Inject constructor()` stub `TODO("M3: implemented by the fitness agent")`.

14. `XiaomiSession.kt`: implements `WearableSession`; takes link, authenticator, fitness sync,
    `ZoneId`/`Clock`; `readDeviceInfo()` uses device commands; `sync()` delegates; `close()` closes
    link; capabilities from auth result (fallback `HISTORY_SYNC`).

15. `XiaomiDriver.kt`: `@Inject constructor`; `recognize` (FE95 service data/service/name prefixes;
    never Wear OS); `linkRequirements` (`bond=false`, mtu=512, 45s connect, 30s discovery, 10s
    operations, refresh cache true); credential requirements (`xiaomi.auth_token` HEX_16_BYTES
    `generatable=true`, `xiaomi.user_id` TEXT optional, `xiaomi.app_device_id` TEXT optional);
    `openSession` reads `0x50` version and refuses Wear OS; calls authenticator, then device
    commands; whole-handshake watchdog 120s. No crypto.

16. `di/XiaomiDriverModule.kt`: Hilt `@Binds @IntoSet WearableDriver`, `@Binds XiaomiAuthenticator`,
    `@Binds XiaomiFitnessSync`.

TESTS (JVM only, `driver/xiaomi/src/test/kotlin/...`):
- CRC-16/ARC + L1 frame parsing/serialization against `XIAOMI_TEST_VECTORS.json`
  (`getBindInfo.l1_frame_hex`, the L1 START frame).
- L2 mapping/opCode with identity hooks.
- Protobuf round-trip + known vectors for getBindInfo/time/battery/fitness IDs; malformed input.
- Device command encoding with a stub/fake link.
- `recognize()` positive/negative advertisements.
Do NOT test auth/crypto/bind/fitness parsing (other agents own those).

VERIFY before reporting (module only; do not build the app):
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
./gradlew :driver:xiaomi:testDebugUnitTest :driver:xiaomi:lintDebug
```
Confirm test-result XML exists. If a Gradle lock timeout occurs, wait and retry. Fix all
compiler warnings in this module. Do not commit. Report: files created, implemented vs TODO with
protocol section refs, test count/result, and any blocker. Match repo Kotlin style (4-space indent,
trailing commas, KDoc), no Gadgetbridge code, no vendor secrets, never log keys.
