# Huawei auth + payload crypto — deep dive

Status: 2026-11-08. Scope: Huawei Health 17.0.7.310 `com.huawei.devicesdk` handshake and
`EncryptStrategyGeneral`. Evidence: `unified_health_app/docs/re-evidence/huawei/jadx-out/sources/...`.
Tags: [V] decompiled code, [I] inferred, [Ext] external/native.

## 1. Auth variants (selected by capability negotiation)

The handshake negotiates an auth version (`0x0116` / `0x0133`, cached per MAC as `authVersion` in
`cnk`/`cml`). Three implementations exist:

1. **Legacy HMAC challenge-response** — CAK-based (`cku`, `cqh`, `HealthWhiteBoxManager`).
2. **HiChainLite** — PIN shown on watch + PBKDF2 + CAK mix (`cni`).
3. **HiChain / HiChain3** — OpenHarmony `deviceauth` via `libhichain_sdk_jni.so`
   (`HiChainClient`, `cnd` = HiChain3GroupManager, relay command `cks` 0x0128).

## 1.1 Auth selection — what the watch itself declares [V]

After link negotiation `0x0101`, the watch returns:

- TLV **5** (36 hex chars): `authenticVersion u16 BE || RandA[16]` → `cml.b()` / `cml.g()`
- TLV **7**: `authType` → `cml.j()` (this is the field `cke.d()` tests). TLV 17 is a different
  link parameter (`cml.j(int)` / field `g`), not the auth selector [V, corrected 2026-11-08].

`cke.d()` then chooses:

| Condition | Path |
|---|---|
| `authType ∈ {1,3}` (`cnc.b`) | **HiChain** (native) |
| `authType ∈ {2,8}` (`cni.b`) | **HiChainLite** |
| `authType == 4` (`cmz.c`) | **HiChain3** |
| otherwise, `authenticVersion != 0` | **Traditional HMAC** via `cku.c` |
| `authenticVersion == 0` | **No app auth** — jumps straight to `ckq` (0x0107) |

So the only clean direct-BLE path without Huawei material is a watch that reports
`authenticVersion == 0`. That branch exists in the vendor code (`cke.c`, "Device do not need authentic
after check device available") [V]. Modern Huawei watches report a non-zero version and an authType of
1/2/4, so they do require Huawei's auth material [I, to be confirmed by a real 0x0101 capture].

## 2. Legacy HMAC path [V structure]

- **CAK source:** `cku.a(version)` builds the CAK by concatenating whitebox chunks:
  - v1: `cqh.c(1,30) + cqh.c(1,1030) + cqh.c(1,2030)`
  - v2: `cqh.c(1,31) + cqh.c(1,1031) + cqh.c(1,2031)`
  - v3: base64-decode `cqh.c(1,23) + cqh.c(1,1023) + cqh.c(1,2023)`
  then hex/base64-encodes it. `cqh.c(...)` is backed by **Huawei white-box native code**
  (`HealthWhiteBoxManager.d/a` → `com.huawei.whitebox.NdkJniUtils.encrypt/decrypt`), which only runs in
  a Huawei-signed app with its own integrity check [V].
- **Device secret:** 16 bytes stored per MAC (works with the watch after pairing).
- **Auth token** (`cku.c(cml, secret, random)`): key = 32 bytes = `deviceSecret(16) || random(16)`;
  `HMAC-SHA256( HMAC-SHA256(key, CAK_hex + random), key )`, hex-encoded [V].
- The token is sent in the auth handshake TLVs; response code 127/100000 = success
  (`cku.d/e` parse `127 | 100000`) [V].

## 3. HiChainLite path [V]

- PIN from the watch (4/6 digits) is stored per MAC (`cku.d(device, pin)` / `cku.b(device)`).
- `Kn` derivation (`cni.e(str="0100", version, nonce, mac)`), exact:
  ```
  pin   = stored PIN for this MAC (set from the 0x012C PIN reply)
  sha   = SHA-256(pin)
  cak   = CAK(version)                       // white-box, §2
  mix   = cak XOR sha (first 16 bytes)
  Kn    = HMAC-SHA256( key = hex(mix) || "0100", data = nonce )
  store first half of Kn as the device secret for this MAC
  token = HMAC-SHA256( key = Kn, data = nonce )
  ```
  where `nonce = RandA[16] || RandB[16]` (the watch's RandA from 0x0101 plus the phone's 16-byte RandB)
  [V]. The token is sent in `0x0113` TLV 1 (`ckd`).
- **Reconnect** does **not** need the CAK: it uses the stored device secret directly —
  `token = HMAC-SHA256(key = secret || "0100", data = nonce)` (`ckx.e` → `cni.d`) [V]. The secret is the
  only thing required once a device has been paired.
- Password token: `PBKDF2WithHmacSHA256(PIN, salt = MAC bytes, iterations = 1000, keyLength = 256)`
  (`cni.a`) [V].
- Fallback when PBKDF2 is unavailable: `HMAC-SHA256(PIN, MAC)` [V].

Both §2 and §3 mix the white-box CAK → **neither can be reproduced by a third-party app** without
Huawei's white-box secret/native library.

## 4. HiChain / HiChain3 path [V structure, native internals unknown]

- `HiChainClient` (395 lines) drives the OpenHarmony `deviceauth` protocol (PAKE/ISO exchange) through
  `cnd` (HiChain3GroupManager, 544 lines) and the native bridge `NativeDas`.
- Handshake data is carried in command `0x0128` (`cks`): TLV `01 28 | len | data`, optional
  `02 01 mode` and `03 len rand` [V].
- Session key: `HiChainAuthManager.e().d(mac)` returns the negotiated key [V]; key length 16/32.
- Requires Huawei's native `libhichain_sdk_jni.so` plus device-identity provisioning; the `.so` is **not
  in any extracted tree** in this repo [V, absent].

## 5. Business-payload envelope (after auth) [V]

`EncryptStrategyGeneral` (`cjy`):

- TLVs: **124** = encrypted flag (`01 01 01` when encrypted), **125** = IV, **126** = ciphertext [V,
  `cjy.java:256-278`, `cjy.java:589-598`].
- Algorithm: `AES/GCM/NoPadding` when HiChain3 (`cmz.a`) or cached key version == 1, otherwise
  `AES/CBC/PKCS5Padding` (`ckg.e/d`) [V].
- Key selection (`cjy.d(str, iv, ver)`):
  1. HiChain session key (`HiChainAuthManager`)
  2. HiChainLite `Kn` (`cni.a`)
  3. HiChain3 key (`cnd.e`)
  4. legacy work key derived from the device secret (`cjy.c`)
  Per-MAC cache: `i` (work key), `g` (counters) [V].
- `ckg` wraps the JCE primitives: AES-CBC/GCM, HMAC-SHA256, SHA-256 (truncated to 16 bytes for key
  derivation), `SecureRandom` AES key generator [V].

## 6. Implementability assessment for `driver/huawei`

| Path | Verdict | Reason |
|---|---|---|
| `authenticVersion == 0` | **Directly implementable** | Vendor code skips app auth in this branch (`cke.c`); no CAK involved [V]. Needs a real 0x0101 capture to know which models report 0. |
| Legacy HMAC | **Blocked** | CAK lives in Huawei white-box native code (`NdkJniUtils.getStorageInfo`), bound to the Huawei-signed APK. No extractable constant. |
| HiChainLite | **Blocked on first pairing** | `Kn` mixes the same white-box CAK; PIN alone is not enough. **Reconnect is not blocked** if the per-device secret is available (HMAC only, no CAK) [V]. |
| HiChain3 | **Blocked** | Needs `libhichain_sdk_jni.so` + Huawei device-auth provisioning; not present and not redistributable. |
| Reuse Huawei Health's secret | **Blocked** | Stored in SharedPreferences encrypted with an **AndroidKeyStore** AES key whose alias is Huawei Health's package name (`cqo`); the key is non-exportable and app-scoped. Another app cannot decrypt it, root or not [V]. |
| Post-auth crypto | **Implemented** | Our driver already has the 0x5A/TLV/AES envelope (`codec/`, `transport/`). Only the key never arrives on a real watch. |
| Data acquisition | **Health Connect** | Remaining legitimate path for modern watches: read Huawei's exported records from Health Connect instead of BLE. |

This confirms decision **D-301**: the production driver binds no authenticator; `openSession` throws
`UnsupportedDeviceException` on real hardware, and only the debug simulator authenticates.

**Immediate diagnostic (no secrets involved):** parse the `0x0101` reply in `DeviceConfigurator` /
`HuaweiSession` — TLV 5 gives `authenticVersion u16 || RandA[16]`, TLV 17 gives `authType`. Surface both
on the debug device screen. If `authenticVersion == 0`, the watch explicitly does not require app auth and
the existing 0x5A pipeline can talk to it directly. If `authType == 2` (HiChainLite), first pairing needs
Huawei's white-box material — this is the honest decision point, measurable on the user's own watch with
one connection attempt and no key extraction.

If Huawei support over BLE becomes mandatory, the only realistic options are:
1. a Huawei-authorized integration (WearEngine/Health Kit) — requires partner credentials, or
2. a user-assisted flow where the watch is already paired with Huawei Health and keys are exported by
   that app — not available to third-party apps.

No vendor secrets were extracted for this analysis, and none should be embedded.

## 7. Evidence index

| Fact | Evidence |
|---|---|
| CAK from white-box | `.../huawei/jadx-out/sources/defpackage/cku.java`; `.../sources/health/compact/a/HealthWhiteBoxManager.java`; `.../sources/com/huawei/whitebox/NdkJniUtils.java` |
| HiChainLite PBKDF2/Kn | `.../sources/defpackage/cni.java` |
| AES/HMAC/SHA helpers | `.../sources/defpackage/ckg.java` |
| Envelope TLV 124/125/126 | `.../sources/defpackage/cjy.java` |
| HiChain native bridge | `.../sources/com/huawei/devicesdk/hichain/HiChainClient.java`; `.../sources/defpackage/cnd.java` |
| 0x0128 relay | `.../sources/defpackage/cks.java` |
| No authenticator in driver | `unified_health_app/driver/huawei/src/main/kotlin/.../auth/HuaweiAuthenticator.kt`; DECISIONS D-301 |
