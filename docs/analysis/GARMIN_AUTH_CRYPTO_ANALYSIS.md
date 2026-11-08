# Garmin Auth (app-level) — crypto deep dive

Status: 2026-11-08. Scope: Garmin Connect 5.30.1 `com.garmin.gfdi` auth layer (`ss2/*`), i.e. the
fallback used when the OS BLE bond is unavailable. This is **not** the normal path: with an OS bond the
GFDI link is protected by BLE link-layer encryption and no app crypto runs.

Evidence: full jadx sources in `unified_health_app/docs/re-evidence/garmin/jadx-base/sources`:
`ss2/c.java` (AuthManager), `ss2/a.java` (helpers), `ss2/n.java` (XXTEA), `ss2/p.java` (session cipher),
`ss2/b.java` (delegate), `da2/a.java` (AuthInfo), `com/garmin/android/gfdi/AuthRegistry.java`.
All tags: [V] read in decompiled code, [I] inferred, [Ext] external.

## 1. Mechanism

App-level "Garmin Auth" re-implements BLE SMP legacy pairing over GFDI messages, using **XXTEA** as the
only cipher. Garmin Connect advertises exactly one algorithm in 5101: `XXTEA` (enum value 0) [V,
`ss2/a.java:17`]. AES-128 is defined in the enum but not included in the offered array [V].

Primitives:

- **XXTEA** (Corrected Block TEA): `ss2/n.c(len, pad, data, key)` encrypt, `ss2/n.b(data, off, len, pad, key)`
  decrypt; delta `0x9E3779B9`, rounds `6 + 52/n`, key expanded to little-endian ints. This is stock XXTEA [V].
- **Confirm function** `F(key, r)` (`ss2/a.a`):
  `t = XXTEA(r, key)`; `t2 = XXTEA(t, key)`; `mac16` = the 6 device MAC bytes written **in reverse**
  (`mac[5],mac[4],…,mac[0]`) followed by 10 zero bytes; `out = XXTEA( t2 XOR mac16 XOR r , key )` [V].
- Random `r` is 16 bytes from `SecureRandom` (`ss2/a.b`) [V].
- Just-works passkey is 16 zero bytes (`ss2/c.f160782o`) [V].

Message map (GFDI message IDs; registered in `ss2/c.<init>`):

| ID | Direction | Purpose | Payload (verified unless noted) |
|---|---|---|---|
| 5101 | phone→watch / reply | Start auth, algorithm mask | req: `u8 0 | u32 LE mask`; resp: `u8 status | u32 LE mask` [V] |
| 5103 | phone→watch / reply | Passkey mode | reply `u16 LE timeout | … | u8 mode at [5]`; modes 0=visible, 1=just-works, 2=OOB [V] |
| 5104 | phone→watch | STK confirm | `F(passkey, r)`; reply 16-byte watch value [V] |
| 5105 | phone→watch | STK random check | `r`; reply 16-byte value [V] |
| 5106 | phone→watch | STK result | `u8 0` ok / `1` fail [V] |
| 5107 | phone→watch | LTK distribution | encrypted 32-byte blob → `ltk[16] | ediv[2] | rand[8]` [V] |
| 5108 | phone→watch | Session-key diversifier | encrypted 8-byte value + 8 random bytes → session key; ACK `0 | rnd[8]` [V] |
| 5109 | phone→watch | Session-key verification | encrypted 24-byte blob, compare decrypted[0..15] to session key [V] |
| 5111 | phone→watch | Secure session open | encrypted 16-byte blob; reply is XXTEA of a 16-byte block, then session cipher starts [V] |
| 5112 | registered | no handler arm in decompiled `onMessageReceived` | [uncertain] |

## 2. Handshake (exact order)

Source: `ss2/c.java` (`a`, `e`, `f`, `g`, `onMessageReceived`).

1. `g()` → **5101** `[0x00][0x01,0x00,0x00,0x00]` (mask = bit 0 = XXTEA).
2. Watch replies **5101**: `status[0]` then `u32 LE supportedMask` at offset 1. If `(mask & 1) == 0` → fail.
   Reply ACK frame: `[0/1][u32 LE mask]`, second byte = 1 iff LTK+ediv+rand exist in `AuthRegistry`.
   - If no stored LTK: ACK `[1][mask]` and wait for passkey flow.
   - If stored LTK: ACK `[0][mask]`, then send **5104** with `ediv || rand` (encrypted diversifier +
     random number from `AuthRegistry`); watch answers with a 16-byte value → this is the *fast reconnect*
     path that skips passkey entry [V].
3. **5103** arrives (passkey mode): ACK `[0][mode]` (or `[0][255]` for unsupported mode).
   - mode 0: watch shows a passkey; app calls `onDevicePairingPasskeyRequired(mac, timeoutSec)`;
     default timeout 30 s (`DEFAULT_PASSKEY_TIMEOUT_SECONDS`). `AuthRegistry.setPasskey` feeds the
     6-digit code back into the state machine [V].
   - mode 1: just-works → `h(zeros16)` immediately [V].
   - mode 2: OOB passkey via `AuthRegistry.setOutOfBandPasskey` [V].
4. STK derivation (`a()` static):
   - `r = random16()`
   - `c1 = F(passkey, r)` → **5104** → watch returns 16-byte `w4`
   - **5105** with `r` → watch returns 16-byte `w5`
   - require `w4 == F(passkey, w5)` (symmetric challenge check) [V]
   - `block = r[0..7] || w5[0..7]`; **STK = XXTEA(block, passkey)** [V]
   - **5106** `[0]` on success, `[1]` on failure [V]
5. **5107** LTK distribution: 32-byte payload decrypted with STK → `ltk(16) || ediv(2) || rand(8)`,
   saved via `saveAuthenticationInfo` into `AuthRegistry` (`da2.a`) and persisted as `AuthInfo` [V].
6. **5108**: payload 8 bytes; `sessionKey = XXTEA( payload[0..7] || random8 , ltk )`; ACK `[0] || random8` [V].
7. **5109**: 24-byte payload decrypted with sessionKey; accept iff `decrypted[0..15] == sessionKey` [V].
8. **5111**: 16-byte payload decrypted with sessionKey → `b`; `deviceIV = b[8..11]`;
   reply block `[b[0], …, hostSeed(4) at 8..11, random(4) at 12..15]` encrypted with sessionKey;
   then `x(sessionKey, deviceIV, hostSeed)` activates the traffic cipher [V, some byte offsets inferred
   from the smali-level arg order of `p13.s.e` → [I]].

## 3. Traffic encryption (`ss2/p`)

`ss2.p(sessionKey, hostIV).encrypt(plain)`:

```
plainBlock = counter_u32_LE || hostIV[0..3] || plain || zero-padding-to-4
cipher     = XXTEA(plainBlock, sessionKey)
frame      = u16_LE(cipher.length + 2) || cipher
counter   += 1
```

Byte order verified: `jg.b.T` writes u16 LE, `jg.b.U` writes u32 LE, and the encrypted buffer is
prefixed with `u16 LE (len+2)` (`ss2/p.java:30-42`, `jg/b.java:613-623`) [V]. This is the wrapping
applied to GFDI frames when the link is not OS-bonded.

## 4. Key provenance — no vendor secret required

- The passkey comes from the **watch/user** (displayed PIN, just-works zeros, OOB), not from Garmin's
  servers [V].
- LTK/EDIV/RAND are generated by the watch during 5107 and stored in `AuthRegistry`; no Garmin cloud
  material is involved in the BLE auth itself [V].
- `registerDevice` (cloud) is a separate provisioning step in Garmin Connect and is not part of this
  cipher suite. It may still be required by firmware to mark the client as paired [I].

Conclusion: this layer is implementable in Kotlin from public algorithm definitions + the flow above,
using only values exchanged with the user's own watch. No secret constants are extracted.

## 5. What it would take in `driver/garmin`

1. `codec/Xxtea.kt` — stock XXTEA (encrypt/decrypt), byte-vector tests from `ss2/n` semantics.
2. `auth/GarminAuthSession.kt` — state machine for 5101→5103→5104/5105→5106→5107→5108→5109→5111,
   with 30 s passkey timeout and retry on `Confirm value failed` (mode 2 restart) [V].
3. Passkey UI hook — the UI must be able to display/enter the 6-digit code
   (`AuthRegistry.Callback.onPasskeyRequired`).
4. `transport/SecureGfdiStream.kt` — `ss2.p` frame cipher; counter starts at 0 per session [V].
5. Store `AuthInfo(ltk, ediv, rand)` per MAC (DataStore/Room) for the fast reconnect path 5104.
6. Keep OS-bond path first; only fall back to Garmin Auth when bond is absent/rejected (matches vendor
   `isGarminAuthAllowed`).

Risks / unknowns:
- Firmware may require Garmin Connect's cloud `registerDevice` before accepting app-level pairing [I] —
  needs a real-watch HCI capture.
- Custom Multi-Link clientId `0x554845414c544801` may be rejected [uncertain].
- 5112 and the exact `[b[0],seed,random]` layout in 5111 need byte-level confirmation.
- Garmin may change the algorithm set in future firmware; the enum already contains AES-128.

## 6. Evidence index

| Fact | Evidence |
|---|---|
| XXTEA implementation, delta/rounds | `.../garmin/jadx-base/sources/ss2/n.java` |
| Confirm function, MAC reversal | `.../sources/ss2/a.java` |
| Auth state machine + message IDs | `.../sources/ss2/c.java` |
| Session cipher frame layout | `.../sources/ss2/p.java`, `.../sources/jg/b.java` |
| Delegate contract (LTK persistence) | `.../sources/ss2/b.java` |
| AuthInfo fields (ltk/ediv/rand) | `.../sources/da2/a.java` |
| Per-device registry | `.../sources/com/garmin/android/gfdi/AuthRegistry.java` |
