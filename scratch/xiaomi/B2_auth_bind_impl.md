You are completing the SECRET-BEARING authentication/bind flow of `:driver:xiaomi` in
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`. Work only inside `driver/xiaomi/`.

PRECONDITION: the non-secret transport/protobuf/session layer and the crypto primitives already
exist. Read the actual code first:
- `driver/xiaomi/.../auth/XiaomiAuthenticator.kt` and `XiaomiAuthenticatorImpl.kt`
- `driver/xiaomi/.../crypto/XiaomiCrypto.kt`, `auth/XiaomiToken.kt`
- `driver/xiaomi/.../transport/XiaomiLink.kt`, `transport/XiaomiL2.kt`
- `driver/xiaomi/.../proto/{S7r,P90,T7r,Q90,NanoProto}.kt`
- `driver/xiaomi/.../XiaomiSession.kt`, `XiaomiDriver.kt`
- `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` §6.1/§6.2/§7.1/§7.2
- `docs/protocols/XIAOMI_TEST_VECTORS.json` (`authCrypto`, `authCcm`)
- `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md` M2 + Gate 0
- `docs/DECISIONS.md` D-1193

IMPLEMENT in `auth/XiaomiAuthenticatorImpl.kt` (adapt the existing interface; make only minimal edits
to it or to `XiaomiSession`/`XiaomiLink` where the encryption hook/capability wiring requires it).

IMPORTANT API NOTE: `XiaomiLink.request()` is for post-auth encrypted `s7r` (type 101). The bind
probe and the whole msg 26/27/18/19/25 handshake are PLAINTEXT: send them with
`link.requestRaw(L2Frame.TYPE_PB_PLAINTEXT, s7r.encode(), timeoutMs)` and decode the returned
bytes with `S7r.decode`, or add one small `requestPlaintext(...)` convenience wrapper. Do not use
`XiaomiLink.request()` for auth/bind packets.

1. `probeBindMode(link, userId)` — §7.1:
   send `s7r {1:1, 2:17, 3:p90{11: sb0{1:false, 2:MD5(userId)}}}` over channel 1/type 100;
   parse `p90{12: ha0}` => verifyMode, SN, MAC, model, oobMode, DID. `p90` field 3 error 1 =
   already bound; surface a typed exception. If userId is absent, send empty MD5 input and mark
   `[I]`; do not block the probe.

2. `authenticateV2(link, token, appDeviceId, oob)` — §6.1 exactly:
   - msg 26: `w90 {1: appRandom(16), 2: appDeviceId optional, 3: hasOob}`;
   - response `ca0 {1: deviceRandom, 2: deviceSign}`; derive HKDF(ikm=token,
     salt=appRandom||deviceRandom, info="miwear-auth", L=64); verify
     `HMAC(deviceKey, deviceRandom||appRandom)` (append oob UTF-8 only if non-empty);
   - msg 27: `t90 {1: HMAC(appKey, appRandom||deviceRandom), 2: AES-CCM(appKey,
     appIV||8 zero bytes, dc0)}`; `dc0` = {0, SDK_INT as float, Build.MODEL, appCapability 0,
     region, empty}. Parse `z90 {confirmed, deviceCapability, deviceCapabilityV2}`;
   - on confirmed: install appKey/appIV outgoing + deviceKey/deviceIV incoming on the link, return
     capabilities and metadata. Detect `p90` field 3 error code 4 as not-bound.
   - All pre-confirm auth packets are plaintext (opCode 1); never encrypt msg 26/27.

3. `localBind(link, userId, appDeviceId, writer)` — §7.2 exactly:
   - P-256 keypair, appPub = X||Y 64 bytes; msg 18 `na0{1: appDeviceId, 2: appPub}`;
   - response `ta0{devicePub, deviceSign, deviceRandom}`; ECDH sharedKey; verify
     `HMAC(sharedKey, deviceRandom)` (append oob only if present);
   - generate appRandom 16; HKDF(ikm=sharedKey, salt=appRandom||deviceRandom,
     info="miwear-bind", L=64) => 16/16/4/4/16 token;
   - msg 19 `ka0{1: appRandom, 2: HMAC(sharedKey, appRandom)}`; parse `qa0{confirmed}`;
     code 6 / timeout = user cancelled, throw `AuthenticationException` and do not pretend success;
   - msg 25 `pb0{1: AES-CCM(appKey, nonce 10..1B, wa0{1:userId, 2:cc0}, aad="bind-data")}`;
   - persist `xiaomi.auth_token` raw 16 bytes, `xiaomi.user_id`, `xiaomi.app_device_id` via
     `CredentialWriter`; return token + metadata. If userId/appDeviceId are absent, derive
     stable values and mark `[I]` (vendor algorithm + Gate 0); never require a Xiaomi account.
   - appDeviceId: prefer supplied credential; else `MD5(deviceId + MAC_upper + userId)` with
     deviceId from a stable local identifier (document the exact fallback and mark [I]).

4. `authenticateV1(link, userId)` — §6.2:
   send `t7r {1:1, 2:5, 3:q90{7:userId}}`, parse q90 field 8 bool / field 3 error. V1 requires
   an OS bond that the current core contract cannot create; implement the message path for an
   already-bonded watch, and otherwise throw `UnsupportedDeviceException` with a clear message.
   Do not claim full V1 support in comments.

CONSTRAINTS:
- No PSK/cloud bind: when probe returns verifyMode==1, return a typed
  `UnsupportedDeviceException` explaining that cloud self-bind is blocked (D-1193) and the user
  should import a token; do NOT call any cloud endpoint. Wire the existing cloud signer nowhere.
- Use existing protobuf helpers; add fields only if missing. Keep the auth packets on channel 1,
  type 100. Preserve `CancellationException`; named timeouts (probe 10s, auth 15s, bind confirm 60s).
- Never log tokens/keys/plaintext. Constant-time signature compare.
- Do not edit `sync/`, transport framing semantics, or files outside `driver/xiaomi/`.
- Do not commit. No vendor secrets/GPL code.

TESTS (JVM, `driver/xiaomi/src/test/kotlin/...`):
- Message encode/decode for msg 26/27, ha0, ta0, qa0, pb0, plus malformed/error cases.
- HKDF local-bind split and token length using a fixed synthetic shared secret (do not hit Android).
- ECDH symmetry with generated P-256 keypairs.
- Token/credential normalization and a fake `CredentialWriter` persistence test.
- Probe/verify parse tests with synthetic `ha0`/`ca0`/`z90` bytes.
Do not test fitness.

VERIFY:
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
./gradlew :driver:xiaomi:testDebugUnitTest :driver:xiaomi:lintDebug
```
If Gradle lock timeout, wait and retry. Report files changed, test count/result, interface edits,
and Gate 0 assumptions that still need a real watch.
