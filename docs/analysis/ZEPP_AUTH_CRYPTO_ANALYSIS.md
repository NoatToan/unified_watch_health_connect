# Zepp / Amazfit auth + channel crypto — deep dive

Status: 2026-11-08. Scope: Zepp 6.10.1 (Huami) channel module `0x82` (130), `EncryptKeyStore`,
`EncryptApiImpl`, and the native ECDH in `libdevice-encrypt.so`.
Evidence: `unified_health_app/docs/re-evidence/zepp/jadx-base/sources/...` (paths below).
Tags: [V] read in decompiled code, [I] inferred, [Ext] external/native.

## 1. Where auth sits

Transport is the Huami "channel" over GATT chars `0x0016` (phone→watch) / `0x0017` (watch→phone).
Module list is exchanged after connect; module `0x82` (`AUTH_MODULE_ID = 130`) carries auth commands.
Auth is app-level; the vendor app does **not** rely on an OS bond (bond evidence is weak — [I]).

Command IDs inside module `0x82` (verified from `AuthModule.java` / `AuthModule2.java`):

| Cmd | Method | Payload |
|---|---|---|
| 0 | getAuthorizationInfo | none; reply `version(u8) | apiLevel(u16 BE) | allowLocalBinding(u8)` |
| 1 | startLocalBinding(apiLevel, key) | `0x01 | apiLevel u16 BE | key16` (30 s timeout) |
| 2 | startCloudBiding(apiLevel, pubKey) | `0x02 | apiLevel u16 BE | phonePubKey48` |
| 3 | verifySignature(signature) | `0x03 | signature` |
| 4 | requestAuth(apiLevel, pubKey) | `0x04 | apiLevel u16 BE | 0x02 | phonePubKey48` |
| 5 | authorize(cipher) | `0x05 | 32-byte cipher` |
| 6 | requestDeAuth(apiLevel) | `0x06`; reply 16-byte random |
| 7 | deAuthorize(cipher) | `0x07 | cipher` |

API level used by the app: **2** (`DeviceAuthorizationImpl2.APP_API_LEVEL = 2`) [V].

## 2. Key material

The 16-byte **auth key** is per device:

- **Cloud bind (new pairing):** generated from the ECDH shared secret — first 16 bytes of the shared
  secret become the auth key (`bArrHexStringToBytes = copyOf(bArr, 16)` in `DeviceAuthorizationImpl2.b`)
  [V]. It is persisted in the app and (in the vendor flow) associated with the Zepp account.
- **Local bind:** the user supplies it: hex string (16 bytes) or arbitrary string → MD5
  (`AuthUtilsKt.localKeyFromString`) [V]. Whether a watch accepts this is gated by
  `AuthorizationProtocolInfo.allowLocalBinding == 1` and `!HMBleConfig.SUPPORT_NEW_AUTH` [V].
- **Already bound:** app reads the stored hex key (`GattUtils.hexStringToBytes(info.getKey())`) [V].

No vendor secret constant is involved in the session auth itself [V]. The only server dependency is the
**first cloud bind signature** (§3).

## 3. Bind flows

### 3.1 Cloud bind (vendor default)

1. `startCloudBiding(2, phonePub48)` → watch replies `code(1)`, and when `len == 65`:
   `publicKeyHash16 || watchPub48`.
2. `newRandom = HMProAuthProfile.d(mac, watchPub48)`; `sha256 = HMProAuthProfile.u(newRandom)` [V,
   helper bodies not decompiled — [uncertain]].
3. `callback.onGetSignData(sha256, publicKeyHash16, 0)` — the vendor app asks its backend/account layer
   to sign `sha256` bound to the watch public-key hash (`HMDeviceWebAPI.getSign`) [V].
4. `verifySignature(sig)` → module cmd 3; watch verifies the signature.
5. On success: `shared = ECDH(phonePriv24, watchPub48)`; **authKey = shared[0..15]**; stored [V].
6. Normal session auth (§4) runs with that key.

A third-party app cannot produce step 3 without Huami's cloud/account signing key → **first bind is
blocked** unless the firmware allows local binding.

### 3.2 Local bind

1. User enters/binds a key (hex or string→MD5).
2. `startLocalBinding(2, key16)` → code 1 = accepted, 2 = rejected, other = error [V].
3. Normal session auth with that key.

This is the path used by `driver/zepp` when the user supplies their own auth key. It still requires the
watch firmware to report `allowLocalBinding=1` [V logic; real-firmware behavior unverified].

The same local-bind capability exists on the **module-0x80 (legacy) path**: `DeviceAuthorizationImpl1`
(`authorize`, lines 210-213 and 162) calls `AuthModule.startLocalBinding(apiLevel, key)` under exactly
the same `allowLocalBinding && !SUPPORT_NEW_AUTH` condition [V]. This contradicts the earlier
implementation brief's claim that 0x80 cannot bind a new key, and means `driver/zepp` should allow a
user-supplied key bind for 0x80 watches instead of throwing.

## 4. Session auth (every connection)

Source: `DeviceAuthorizationImpl2.a`, `AuthModule2.requestAuth`, `AuthUtilsKt`.

1. `phonePriv = 24 random bytes`; `phonePub = ECDH_generatePublicKey(phonePriv)` (native, 48 bytes)
   [V; curve B-163/sect163r2 per `libdevice-encrypt.so` symbols from the earlier RE — [I]].
2. `requestAuth(2, phonePub)` → watch replies `status(1)`; on status 1:
   `random16 || watchPub48` (`RequestAuthResponse`) [V].
3. `shared = ECDH(phonePriv, watchPub)` (native) [V].
4. Derived key: `derived[i] = shared[i + 8] XOR authKey[i]`, i = 0..15 (key length 16) [V].
5. `chip1 = AES-ECB-encrypt(authKey, random16)`;
   `chip2 = AES-ECB-encrypt(derived, random16)` [V, `AuthUtilsKt.encrypt`].
6. `authorize(chip1 || chip2)` (module cmd 5) [V].
7. On success the app installs `EncryptKeyStore(shared, authKey)`, which becomes the channel cipher
   state [V].
8. Reconnect = repeat 1–7 with the same persistent auth key; there is no cached session key across
   connections [V].

## 5. Channel payload encryption

Source: `EncryptKeyStore`, `EncryptApiImpl`, `AuthUtilsKt`.

`EncryptKeyStore(shared, authKey)`:

```
r0 = u32 from shared[0..3]      // local nonce  (byte order [I], likely LE)
r1 = u32 from shared[4..7]      // remote nonce
key[0..15] = shared[8..23] XOR authKey[0..15]
```

Per-session AES key: `sessionKey = key XOR (sessionId & 0xFF)` repeated over 16 bytes [V]. Note this is
AES-ECB/NoPadding, and `sessionId` is the channel session id — so the same ECDH key produces a distinct
AES key per session.

Encrypt (`EncryptApiImpl.encryptData`):

```
plain = data || r0(u32) || CRC32(data || r0)(u32) || zero-pad to 16
cipher = AES-ECB(plain, sessionKey)
r0 += 1 (mod 2^32-1)
```

Decrypt: AES-ECB decrypt, then verify CRC32 over `data || r0` and accept the remote nonce `r1` only
within a sliding window of 100000 (`EncryptKeyStore.validRemoteNOnce`) — replay protection [V].

## 6. Implementability / what our driver has

`driver/zepp` already implements module `0x82`, `0x80`, and legacy `0x0009` auth plus channel
encryption (see `ZeppHandshake.kt`, `ZeppSession.kt`, `transport/`, `codec/`).

What is fully implementable from this analysis (own device, no vendor secrets):
- session auth with a user-supplied auth key (steps §4)
- derived channel key + AES-ECB packet cipher + nonce/CRC validation (§5)
- local bind when the firmware allows it (§3.2)

Blocked / unverified:
- `driver/zepp` currently refuses a 0x80 bind, but the vendor `DeviceAuthorizationImpl1` supports
  local bind through the same `startLocalBinding` command (§3.2) — candidate fix [V].
- first **cloud** bind requires Huami's signing key (step §3.1-3) — not extractable and not needed for
  already-bound or locally-bound watches [V].
- exact ECDH byte layout (24-byte private, 48-byte public, shared-secret endianness) lives in
  `libdevice-encrypt.so`; our implementation must match it byte-for-byte. Current driver hard-codes the
  B-163 assumption — needs a real-watch test [I].
- nonce byte order (`BufByteDecoder.readLong(4)`) [I].
- `HMProAuthProfile.d/u` bodies (bind signature input construction) — not decompiled [uncertain].

## 7. Evidence index

| Fact | Evidence |
|---|---|
| Auth module ID and command format | `.../zepp/jadx-base/sources/com/huami/bluetooth/profile/channel/module/auth/AuthModule2.java` |
| Local/cloud bind, session auth derivation | `.../sources/com/xiaomi/hm/health/bt/profile/auth/DeviceAuthorizationImpl2.java` |
| AES-ECB helpers, key-from-string | `.../sources/com/xiaomi/hm/health/bt/profile/auth/AuthUtilsKt.java` |
| Key store (nonces, key XOR) | `.../sources/com/huami/bluetooth/profile/channel/encrypt/EncryptKeyStore.java` |
| Channel packet cipher | `.../sources/com/huami/bluetooth/profile/channel/encrypt/impl/EncryptApiImpl.java` |
| allowLocalBinding flag | `.../sources/com/huami/bluetooth/profile/channel/module/auth/AuthorizationProtocolInfo.java` |
| 24-byte private key / native ECDH | `.../sources/com/huami/core/device/feature/encrypt/impl/KeyShareApiImpl.java` |
| Native symbols | `zepp-analysis/native/lib/arm64-v8a/libdevice-encrypt.so` (earlier string analysis) |
