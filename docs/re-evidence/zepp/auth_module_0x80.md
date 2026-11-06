# Zepp Auth module 0x80 (AuthModule / DeviceAuthorizationImpl1) — Distilled evidence

Source: `AuthModule.java`, `DeviceAuthorizationImpl1.java`, `DeviceAuthorizationFactory.java`
Decompile base: `docs/re-evidence/zepp/jadx-base/`

## Decision logic: when is 0x0009 fallback used? [V]

`DeviceAuthorizationFactory.createAuthorization()` (line 89):
```java
if (device.supportModule(128) || device.supportModule(130)) {  // 0x80 || 0x82
    // Channel-based auth
    if (encryptEnable == null) return DeviceAuthorizationImpl1  // module 0x80
    else                       return DeviceAuthorizationImpl2  // module 0x82
} else {
    // No auth module listed → char 0x0009 auth
    return TraditionalDeviceAuthorizationImpl
}
```

**Consequence for driver:** `ZeppHandshake.kt:56` TODO is partly wrong in its framing.
The fallback to 0x0009 is NOT driven by channel version (v1 vs v2). It is driven by whether
the BuiltInModule list (CMD 0x00/0x03) declares module 0x80 or 0x82:
- v1 channel + module 0x80 listed → module 0x80 auth (Impl1)
- v2 channel + no encryptEnable byte → module 0x80 auth (Impl1)  
- v1 channel + neither 0x80 nor 0x82 listed → 0x0009
- no channel at all → 0x0009

## Module 0x80 command bytes (AuthModule.java) [V]

APP_API_LEVEL = 1 for Impl1 (Impl2 uses 2). apiLevel encoded as u16 LE.
`sendCommand` sends payload to channel module 0x80; response has standard module header
stripped by BaseModule (returns payload starting from code byte).

| CMD byte | Description | Request payload | Response payload |
|---|---|---|---|
| 0x00 | getAuthorizationInfo | `[0x00]` | `[code=1, version_u8, apiLevel_low, apiLevel_high, allowLocalBind_u8]` |
| 0x01 | startLocalBinding | `[0x01, 0x01, 0x00, key(16)]` | `[code]` (1=OK, 2=user rejected), 30 s timeout |
| 0x02 | startCloudBinding | `[0x02, apiLevel_u16_LE, pubKey...]` | `[code, pubKeyHash(16), random(16)]` = 33 bytes if code=1 |
| 0x03 | verifySignature | `[0x03, signature...]` | async via coroutines |
| 0x04 | requestRandomNumber | `[0x04, 0x01, 0x00, 0x02]` | `[code=1, random(16)]` |
| 0x05 | authorize | `[0x05, AES_ECB(random, key)(16)]` | `[code]` (1=OK) |
| 0x06 | deAuthorize | `[0x06, AES_ECB(random, key)(16)]` | `[code]` |

Evidence lines:
- getAuthorizationInfo: `AuthModule.java:424-435` (`sendCommand(0, ...)`, check `first==1`)
- requestRandomNumber: `AuthModule.java:512-538` (`[0x04, apiLevel_u16_LE, 0x02]`)
- authorize: `AuthModule.java:401-411` (`[0x05, cipher]`)
- startLocalBinding: `AuthModule.java:569-578` (timeout 30 000 ms, `[0x01, apiLevel_u16_LE, key]`)

## Module 0x80 session auth sequence (not bind) [V]

For a watch already bound (key known), session auth through module 0x80:
1. Send `[0x00]` → get `allowLocalBind` (also reveals `version`)
2. Send `[0x04, 0x01, 0x00, 0x02]` → get `random(16)`
3. `encrypted = AES/ECB/NoPadding(key, random)` (same cipher as 0x0009)
4. Send `[0x05, encrypted(16)]` → response `[0x01]` = success

No ECDH. No session key stored. Module 0x80 watches do NOT use channel encryption
(no `encryptEnable` byte in version reply → BuiltInModule CMD 0x03 not needed).

### Test byte vectors
Assuming key = `0102030405060708090a0b0c0d0e0f10` (16 bytes), random = `A0A1...AF` (16 bytes):
- getAuthInfo request: `00`
- requestRandom request: `04 01 00 02`
- random response: `01 A0 A1 A2 A3 A4 A5 A6 A7 A8 A9 AA AB AC AD AE AF`
- authorize request: `05` + AES_ECB(key, random) [compute offline for test]
- authorize success response: `01`

## Driver impact

`driver/zepp/src/main/kotlin/.../ZeppHandshake.kt:56-63`:
- Current: throw UnsupportedDeviceException for channel v1
- After this finding: query BuiltInModule (CMD 0x00 for v1); if module 0x80 listed → run
  `authenticateModule0x80(transport, authKey)` using the 3-step sequence above; if not listed
  → fall through to 0x0009 path already implemented.
- Module 0x80 watches have no channel encryption; skip `ChannelCipher` setup after auth.
