You are the cryptography/authentication specialist for the new `:driver:xiaomi` module in the
Unified Health Android repo at `/Users/Apple/Documents/Projects/noattoan/unified_health_app`.
This is the SECRET-BEARING part of the Xiaomi MiWear driver. Work only inside `driver/xiaomi/`.

CONTEXT: another agent has already implemented the module skeleton, L0/L1/L2 transport, MiWear
protobuf envelopes (`S7r`/`P90`/`T7r`/`Q90`), time/battery/watch-info commands, `XiaomiLink`,
`XiaomiSession`, `XiaomiDriver`, and stubs:
- `auth/XiaomiAuthenticator.kt` (interface + `XiaomiAuthResult`)
- `auth/XiaomiAuthenticatorImpl.kt` (`@Inject`, every method TODO)
- `sync/XiaomiFitnessSyncImpl.kt` (fitness agent owns; do not edit)
Read the actual files before coding; adapt to the APIs they expose. Do not reimplement transport
or fitness. You MAY make minimal edits to `XiaomiLink.kt`, `XiaomiSession.kt`, `proto/*.kt`,
`auth/XiaomiAuthenticator.kt`, and `di/XiaomiDriverModule.kt` only when needed to expose the
encryption hook or extra protobuf fields; report every such edit.

READ (in this order):
- `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` §5, §6, §7, §8 (byte-level spec)
- `docs/protocols/XIAOMI_TEST_VECTORS.json` (`authCrypto`, `authCcm`, `l2Ctr`, `cloudPost`,
  `cloudGet` are your fixtures)
- `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md` (blockers, M2 acceptance)
- `CLAUDE.md`, `.claude/agents/wearable-driver-engineer.md`
- the existing `driver/xiaomi` sources, `core/ble/.../driver/WearableDriver.kt`,
  `WearableProtocolException.kt`
- `docs/DECISIONS.md` D-1193 (cloud self-bind is blocked; do not pretend it is usable)

IMPLEMENT:

1. `crypto/XiaomiCrypto.kt` (or split into small files):
   - HKDF-SHA256 exactly as §5.1: IKM = token/sharedKey, salt = appRandom||deviceRandom,
     info = ASCII label (`miwear-auth` / `miwear-bind`), L = 64.
   - HMAC-SHA256 raw 32 bytes.
   - AES-CCM with 32-bit tag, 12-byte nonce, optional AAD (§5.3), returning ciphertext||tag(4).
     Use BouncyCastle (`org.bouncycastle:bcprov-jdk18on`, already a dependency);
     `Cipher.getInstance("AES/CCM/NoPadding", "BC")` with `AEADParameters`.
   - AES-128-CTR/NoPadding with key=IV for L2 (§5.4).
   - ECDH P-256, public point X||Y 64 bytes (uncompressed without 0x04), shared secret = 32-byte
     X coordinate (§7.2).
   - constant-time byte comparison via `MessageDigest.isEqual`.
   - never log keys, tokens, plaintext auth payloads, or derived bytes.

2. `auth/XiaomiToken.kt`: normalize/parse the 16-byte device token from 32 hex chars (accept
   upper/lower case, optional `0x`, surrounding whitespace); reject wrong length. Render uppercase
   hex for persistence only if the storage convention needs it. Do not accept arbitrary text.

3. Fill `auth/XiaomiAuthenticatorImpl.kt`:
   - `probeBindMode(link, userId)`: §7.1 `s7r e=1 f=17` with `p90{11: sb0{1:false,2:MD5(userId)}}`;
     parse `p90{12: ha0}` into verifyMode, SN, MAC, model, oobMode, DID. A `p90` field 3 error 1
     means already bound; surface a typed exception.
   - `authenticateV2(link, token, appDeviceId, oob)`: §6.1 exactly — msg 26 AppVerify, verify
     `deviceSign = HMAC(deviceKey, deviceRandom||appRandom)` (append OOB UTF-8 if non-empty),
     msg 27 AppConfirm with `appSign = HMAC(appKey, appRandom||deviceRandom)` and AES-CCM
     `dc0` encrypted with nonce `appIV||8 zero bytes`; parse `z90`; install appKey/appIV
     (outgoing) and deviceKey/deviceIV (incoming) on the link; return capabilities/token state.
     AppVerify must start plaintext (opCode 1); confirm only from the watch response.
   - `localBind(link, userId, appDeviceId, writer)`: §7.2 exactly — generate P-256 keypair,
     msg 18 `na0{appDeviceId, appPub}`, parse `ta0`, verify `deviceSign =
     HMAC(sharedKey, deviceRandom)`, msg 19 `ka0{appRandom, HMAC(sharedKey, appRandom)}`, parse
     `qa0{confirmed}`, msg 25 `pb0{AES-CCM(appKey, nonce 10..1B, wa0{userId, cc0},
     aad="bind-data")}`. Persist token (raw 16 bytes) to `xiaomi.auth_token`, userId and
     appDeviceId via `CredentialWriter`; return the token. Handle watch-confirm timeout/cancel
     with `AuthenticationException` (code 6 equivalent); do not auto-confirm.
   - `authenticateV1(link, userId)`: §6.2, send `t7r` field 1=1, field 2=5
     (`CMD_SEND_USERID`), field 3 `q90` field 7=userId, parse q90 field 8 bool / field 3 error.
     V1 needs an OS bond that the core contract cannot create; implement the message path for an
     already-bonded watch and return a clear `UnsupportedDeviceException` if the caller has no
     bond context. Do not claim V1 is fully supported.
   - `appDeviceId` fallback when no credential: derive a stable string from the device address +
     MAC + userId; mark `[I]` in a comment that the vendor uses its `DeviceUtil.getDeviceID()`
     and this must be verified at Gate 0. Never invent a real vendor key.
   - `userId` fallback for local bind: use a stable app-generated identifier and persist it; mark
     `[I]` and document Gate 0. Do not require a Xiaomi account for the local-bind path.

4. `cloud/XiaomiCloudSigner.kt` + small models: implement §8.2 request signing ONLY — POST
   canonical sorted params, stateful RC4 (fresh state, discard 1024), `rc4_hash__`, SHA-1
   signature, GET HMAC signature, response Base64(RC4(JSON)) decrypt. Verify against
   `cloudPost`/`cloudGet` vectors. Do NOT add OkHttp/INTERNET permission, do NOT wire cloud
   binding into the driver, and do NOT claim cloud self-bind works: D-1193 says it is blocked by
   Xiaomi's `miothealth` Passport service token. Keep the signer as tested, unwired code for
   completeness only.

5. Tests (`driver/xiaomi/src/test/kotlin/...`, JVM only):
   - HKDF/HMAC/AES-CCM/AES-CTR exact vectors from `XIAOMI_TEST_VECTORS.json`.
   - token parse/format edge cases.
   - auth protobuf builders/parsers (AppVerify, DeviceVerify, AppConfirm, `ha0`, `ta0`, `qa0`,
     `pb0`); malformed input throws, never crashes.
   - ECDH shared-secret symmetry and local-bind derivation with two generated P-256 keypairs;
     assert token length 16 and key split 16/16/4/4/16.
   - cloud signer vectors.
   Do not test `sync/` or fitness parsing (another agent owns it).

CONSTRAINTS:
- Use `WearableProtocolException` subclasses (`AuthenticationException`, `MissingCredentialException`,
  `UnsupportedDeviceException`) with actionable messages; never bare `Exception`.
- Every wait has a named timeout; never swallow `CancellationException`.
- Do not modify `sync/XiaomiFitnessSyncImpl.kt`, transport framing semantics, or anything outside
  `driver/xiaomi/`. Do not touch `core/`, `app/`, `feature/`, or other drivers.
- Do not commit. No GPL code, no vendor secret/white-box key, no real token in tests.

VERIFY:
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
./gradlew :driver:xiaomi:testDebugUnitTest :driver:xiaomi:lintDebug
```
If Gradle lock timeout, wait and retry. Confirm test XML exists. Report: files changed, protocol
sections implemented, test count/result, exactly what remains blocked (cloud/PSK/V1 bond), and any
interface assumption you had to change.
