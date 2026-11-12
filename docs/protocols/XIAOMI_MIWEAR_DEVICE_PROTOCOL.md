# Xiaomi MiWear device protocol — reverse-engineered from Mi Fitness 3.46.1

> Scope: direct Android → Xiaomi wearable connection for **MiWear BLE V2** devices
> (Xiaomi Smart Band 8/9/10, Redmi Watch, Xiaomi Watch S1/S2/S3/S4 non-Wear-OS), the
> **legacy V1** path, and the **cloud bind** APIs. Evidence: `com.mi.health` 3.46.1
> (`versionCode 346001`), decompiled in `docs/re-evidence/mi/jadx-base/`.
> Tags: **[V]** seen in decompiled code, **[I]** inferred, **[Ext]** public/Gadgetbridge
> cross-check, **[Gate]** requires a real-watch experiment before relying on it.

> **Wear OS devices are not covered by this protocol.** In this APK the Wear OS module is a
> stub (`WearOSUtilImpl` is empty and `isWearosRequirementNotPass()` returns `true`), so
> `Mi Watch (2019)` / `Xiaomi Watch 2` pairing cannot be derived from this APK. See §0.3.

---

## 0. Device families and transport matrix

| Family | Examples | Protocol | Pairing / auth | Status in this APK |
|---|---|---|---|---|
| MiWear BLE **V2** | Xiaomi Smart Band 8/9/10, Redmi Watch 3/4/5, Xiaomi Watch S1/S2/S3/S4 (non-Wear-OS), Mi Band 8 | GATT service `0xFE95`, notify `0x5E`, write `0x5F`, version char `0x50` | token + nonce handshake, **no OS bond required** | fully implemented, target path [V] |
| MiWear BLE **V1** | Mi Band 8 (some SKUs), Redmi Watch 2 Lite, Xiaomi Watch S1 Active (per Gadgetbridge) | product-specific UUIDs, often `0xFE95` chars `0x51/0x52/0x53/0x55` | OS bond + `CMD_SEND_USERID (5)`; bind key from cloud for first bind | implemented [V] |
| **Wear OS** | Mi Watch (2019), Xiaomi Watch 2 | Google Wear OS / Fast Pair / Data Layer | Wear OS companion flow | **stub in this build** — no implementation [V] |

### 0.1 Protocol version discovery (V1 vs V2)

After GATT service discovery, read **characteristic `0x0050`** in service `0xFE95`.
The value is 3 bytes little-endian:

```
p = b0 | (b1 << 8) | (b2 << 16)      // e7r.java H0()/b callback
versionName = "b0.b1.b2"
if (versionName starts with "0") -> V1 stack (private UUIDs / legacy chars)
else                             -> V2 stack (0x5E notify, 0x5F write)
```

[V] `defpackage/e7r.java` (read on `qf4.f31473b`, `k8q.a(0x50)`), `com/xiaomi/wearable/transport/queue/BleTaskQueueV2.java`
static UUIDs. Gadgetbridge cross-check: V2 service/characters are the same [Ext].

If `0x0050` is missing, fall back to probing `0x5E/0x5F` for V2 and the known V1 UUID
sets; do not guess a private UUID.

### 0.2 BLE UUIDs

| Role | UUID |
|---|---|
| Service | `0000fe95-0000-1000-8000-00805f9b34fb` |
| V2 notify (device → phone) | `0000005e-0000-1000-8000-00805f9b34fb` |
| V2 write (phone → device) | `0000005f-0000-1000-8000-00805f9b34fb` |
| Version read | `00000050-0000-1000-8000-00805f9b34fb` |
| V1 command read | `00000051-0000-1000-8000-00805f9b34fb` |
| V1 command write | `00000052-0000-1000-8000-00805f9b34fb` |
| V1 activity data | `00000053-0000-1000-8000-00805f9b34fb` |
| V1 upload | `00000055-0000-1000-8000-00805f9b34fb` |

The vendor also has `DeviceInfo.PrivateUUID` with `service/protoTX/protoRX/fitness/voice/mass/otaTX/otaRX`;
for the `0xFE95` V1 family these map to the table above. Some legacy products use
`16186f00-…`, `16187f00-…`, `1314f000-…`, `7495fe00-…` service families (Gadgetbridge
`XiaomiUuids.java`) [Ext]; the APK obtains these from product configuration, not from a
constant. Implement those only if a device is actually seen advertising them.

### 0.3 Wear OS

`WearOSDeviceBinder.bind()` delegates to `WearOSApi.bindDevice`, but the only
implementation in this APK (`WearOSUtilImpl`) is an empty stub and all methods return
default/`true` for "requirement not passed". Wear OS pairing is a Google stack
(CompanionDeviceManager / Wearable Data Layer / Fast Pair), not MiWear BLE. Supporting
Mi Watch (Wear OS) requires a separate module and cannot be derived from this APK. For a
health app the practical route is **Health Connect** on the watch/phone side. Keep it out
of the MiWear driver.

---

## 1. Discovery and connection

### 1.1 Scan

Mi Fitness scans by MiBeacon service data (product IDs from its product catalog) and by
name prefix (`ScanManager.searchBleByNamePrefixOrMiBeacon`). For an independent driver the
safe filter is:

- advertised service UUID `0xFE95`, **and/or**
- advertised name matching the Xiaomi/Redmi model list,
- drop RSSI > 0 or < −90; keep a list sorted by RSSI; connect on user selection.

The watch advertises a MiBeacon frame (service data under `0xFE95`) carrying a product ID,
frame counter and MAC. The vendor uses the product ID to look up model/capabilities; the
BLE link itself only needs the device address. Bonding is not required for V2.

### 1.2 GATT connect

```
connectGatt(context, autoConnect=false, callback, TRANSPORT_LE)
requestMtu(512)          // e7r.J(512); effective ATT MTU is reported by the stack
discoverServices()
read 0xFE95/0x0050 (3 bytes) -> version
enable notifications on 0xFE95/0x005E (CCCD 0x2902)
```

The vendor requests MTU 512 and uses `ATT_MTU - 3` as the L0 chunk size (default 244 when
MTU is 247). Writes are serialized; the transport does not depend on BLE-level ACKs (L1
has its own ACKs), but write-with-response is the conservative choice until a real-watch
capture proves write-without-response is stable.

The vendor also performs a GATT cache refresh trick on API ≥ 28 in some builds; our
`core/ble` already has `refreshGatt` support — use it if status 133 appears.

---

## 2. L0 — BLE chunking and reassembly

[V] `com/xiaomi/wearable/transport/layerl0/TransportL0.java`, `BleChannel.java`

- The complete L1 packet (8-byte header + payload) is split into chunks of
  `mtu = ATT_MTU - 3` and written sequentially to `0x5F`.
- On receive, append each notification to a ring/queue. Scan for the 2-byte magic
  `0xA5 0xA5`; drop bytes until it is found. When at least 8 header bytes are present,
  read `dataLength`; when `8 + dataLength` bytes are buffered, validate CRC and deliver the
  frame. Drop one byte and rescan after a bad CRC.
- No per-chunk sequence number: the reassembly is purely length/magic based, so writes
  must not interleave. Serialize all GATT writes.

---

## 3. L1 — framing, session start, ACK/window

[V] `com/xiaomi/wearable/transport/layerl1/{L1Packet,TransportL1,CMDPacket,ACKPacket,DataPacket}.java`

### 3.1 Header (8 bytes, little-endian)

| Offset | Size | Field | Notes |
|---:|---:|---|---|
| 0 | 2 | magic | `0xA5 0xA5` (`short -23131`) |
| 2 | 1 | type/frx | low nibble type, high nibble `frx` (0/1) |
| 3 | 1 | seq | uint8, wraps at 256 |
| 4 | 2 | dataLength | uint16 LE, payload length |
| 6 | 2 | crc16 | CRC-16/ARC over payload (init 0, poly 0xA001 reflected) |
| 8 | N | payload | see L2 |

Packet types: `0 = NAK`, `1 = ACK`, `2 = CMD`, `3 = DATA`.
`frx` is used for flow-control/handshake variants; DATA normally uses `frx=0`.
An ACK/NAK has no payload and `dataLength=0`, `crc=0`.

**CRC-16/ARC** (matches `CRCUtil.TABLE_16`, table[1]=0xC0C1):

```text
crc = 0
for byte b in payload: crc = table[(crc ^ b) & 0xFF] ^ (crc >> 8)
```

### 3.2 Session start (CMD exchange)

Immediately after notifications are enabled, send a CMD packet:

```
L1 type=2, seq=0, payload (22 bytes):
  01                          // CMD_L1START_REQ
  01 03 00 01 00 00           // CONFIG_TYPE_VERSION: len 3, 1.0.0
  02 02 00 00 FC              // CONFIG_TYPE_MPS: len 2, 64512
  03 02 00 20 00              // CONFIG_TYPE_TX_WIN: len 2, 32
  04 02 00 10 27              // CONFIG_TYPE_SEND_TIMEOUT: len 2, 10000 ms
```

Full frame (with CRC 0x1D4D):

```
a5 a5 02 00 16 00 1d 4d 01 01 03 00 01 00 00 02 02 00 00 fc
03 02 00 20 00 04 02 00 10 27
```

The device answers with a CMD packet (`CMD_L1START_RSP = 2`) carrying the same
type/length/value config list. Parse:
`CONFIG_TYPE_MPS (2)`, `CONFIG_TYPE_TX_WIN (3)`, `CONFIG_TYPE_SEND_TIMEOUT (4)`;
`CONFIG_TYPE_VERSION (1)` is informational. No DATA packet may be sent before the CMD
exchange completes (`isCmdExchanged`). A CMD start request from the device is answered
with a CMD start response carrying our config.

### 3.3 DATA sequence, ACK, window

- Sender assigns `seq` per DATA packet, starting at 0, modulo 256.
- Window = 32 outstanding unacknowledged DATA packets (local `SAR_DEFAULT_TX_WIN_LOCAL=32`);
  remote window from config (default 4). Do not send past the window.
- ACK is cumulative: receiving ACK with seq N releases all DATA with seq ≤ N.
- Timeout: 10 000 ms per outstanding packet; retransmit from the lowest unacked seq.
- Receiver:
  - `frx == 1` → accept, set `rxExpect = seq + 1`, **no ACK**.
  - `frx == 0` → require `seq == rxExpect`; on mismatch send NAK with `rxExpect` (reject
    stale/duplicate with a difference ≥ 128) and do not deliver.
  - ACK immediately when the L2 payload's first byte (channel) is `1` or `8`, or when the
    cumulative counter reaches ⅔ of the remote TX window; otherwise ACK cumulatively after
    ~500 ms (`SAR_CUM_ACK_TIMEOUT`).
- The vendor queues CMD/NAK ahead of DATA and ACKs ahead of everything; serialization is
  more important than these priorities for a first implementation.

### 3.4 Payload

The L1 payload is exactly the L2 packet (channel + opCode + protobuf).

---

## 4. L2 — channels, opcodes, encryption

[V] `com/xiaomi/wearable/transport/layerl2/L2Packet.java`, `TaskQueueV2.java`

L2 payload:

```
byte 0: channel
byte 1: opCode
byte 2..: payload (protobuf in most channels)
```

Channels:

| Byte | Name | Type value(s) after mapping | Use |
|---:|---|---|---|
| 1 | `TRANSPORT_CHANNEL_PB` | 100 (opCode 1), 101 (opCode 2) | auth + virtually all protobuf commands |
| 2 | `TRANSPORT_CHANNEL_MASS` | 104 | mass upload |
| 3 | `TRANSPORT_CHANNEL_MASS_VOICE` | 103 | voice |
| 4 | `TRANSPORT_CHANNEL_FILE_SENSOR` | 107 | sensor files |
| 5 | `TRANSPORT_CHANNEL_FILE_FITNESS` | 102 | **fitness data download** |
| 6 | `TRANSPORT_CHANNEL_OTA` | 105 | OTA |
| 7 | `TRANSPORT_CHANNEL_NETWORK` | 108 | network proxy |
| 8 | `TRANSPORT_CHANNEL_LYRA` | 112 | Lyra |
| 9 | `TRANSPORT_CHANNEL_RESEARCH` | 113 | research |

Opcodes: `1 = WRITE` (plaintext), `2 = WRITE_ENC` (encrypted), `3 = READ`.

- Outgoing `type 101` and `type 112` are encrypted; all other types are plaintext.
- Incoming `opCode == 2` is encrypted; decrypt before parsing.
- Session encryption (V2) is **AES-128-CTR/NoPadding** with **key = IV**:
  - outgoing: `key = appKey`, `IV = appKey`
  - incoming: `key = deviceKey`, `IV = deviceKey`
  - [V] `CipherApiCall.encryptDataV2/decryptDataV2` → `i0.b/i0.a`, `i0.java`.
- Responses are matched by the derived type (channel + opCode), not by a request id:
  `channel 1/opCode 1 → 100`, `channel 1/opCode 2 → 101`, `channel 5 → 102`, etc.
  The application layer then matches `s7r.e`/`s7r.f` (see §9).

---

## 5. Cryptographic primitives

[V] `defpackage/{iql,ucb,c9c,m83,o0,wq1,e6j,g6j,x24,c24,q34}.java`

### 5.1 HKDF-SHA256

`iql.i(label, ikm, saltInput)` implements:

```
PRK = HMAC-SHA256(key = saltInput, message = ikm)     // HKDF-Extract (salt = randoms)
OKM = HKDF-Expand(PRK, info = ASCII(label), L = 64)   // counter 1.., HMAC(PRK, prev||info||counter)
```

Note the argument order in the app: `iql.i("miwear-auth", token, appRandom||deviceRandom)`
means **IKM = token**, **salt = the concatenated randoms**.

### 5.2 HMAC

`ucb.a(key, message) = HMAC-SHA256(key, message)`, raw 32 bytes.

### 5.3 AES-CCM with 4-byte tag

`iql.d(key, nonce, plaintext, aad?)` = AES-CCM **encrypt**, returns `ciphertext || tag(4)`.
`iql.a(key, nonce, ciphertext, aad?)` = decrypt.

- 32-bit MAC (`f0` length `32` passed to `m83.f`).
- Nonce length 7..13; the app uses 12 bytes.
- Session auth device-info nonce: `appIV(4) || 00 00 00 00 || 00 00 00 00`.
- Bind result nonce: `10 11 12 13 14 15 16 17 18 19 1A 1B`.
- AAD: `"bind-data"` for the bind result; absent for the session device-info.

### 5.4 AES-128-CTR

`i0.b(key, iv, data)` / `i0.a(key, iv, data)` = `AES/CTR/NoPadding`; caller passes the
same 16-byte key as IV (§4).

### 5.5 Encoding conventions

- Device tokens are 16 bytes; the vendor stores/transports them as **uppercase hex**
  (`ByteUtil.byteToString`), and `stringToBytes` parses hex pairs. The Mi Fitness log
  token is the same 16 bytes (32 hex chars) used by Gadgetbridge [Ext].
- Device-level `bytes` protobuf fields are raw bytes (Base64 only where the cloud JSON
  requires it).
- Cloud signatures use **Base64**, not hex (`q12.i` = Base64 encode, `q12.e` = decode).

### 5.6 Reference test vectors

Generated by `docs/re-evidence/mi/tools/gen_vectors.js` (Node, standard crypto) and stored
in `docs/protocols/XIAOMI_TEST_VECTORS.json`. Use these as unit-test fixtures.

**Auth HKDF/HMAC** — token `000102…0F`, appRandom `A0…AF`, deviceRandom `B0…BF`:

```
OKM64        = e056f56a92e2e5310b681165b043a8b896d98ddbd7e59381ccf81334d7fe6215
               5cf69b67831425513eaa4017c360e676ba96ded7c4194fcc6309e3e57e815de0
deviceKey    = e056f56a92e2e5310b681165b043a8b8
appKey       = 96d98ddbd7e59381ccf81334d7fe6215
deviceIV     = 5cf69b67
appIV        = 83142551
deviceSign   = HMAC(deviceKey, deviceRandom||appRandom)
             = 901134d0b9b5890d02e0f92db264e8bb956de03ca9a7f5343e992e9e84a2fe5c
appSign      = HMAC(appKey, appRandom||deviceRandom)
             = 3137d4f6a3e822a9f9381973f20a38734b3457e0aae03b40dc3e4e4d294baf32
```

**AES-CCM device-info** — `dc0` example bytes
`08001500000c421a07506978656c20392a02564e`, key = appKey, nonce =
`831425510000000000000000`, tag 4 → ciphertext+tag =
`4d6daa007f881ae828d8107de55e8e8f93ac79d42c3afed1`.

**AES-CTR L2** — time-sync protobuf
`080210032230222e0a0708ea0f100b180c12090813101e180020fa011a16083810001a10417369612f486f5f4368695f4d696e682001`
with key=IV `96d98ddbd7e59381ccf81334d7fe6215` → ciphertext
`0a5df840493f4b7804eef1b2927e0a52e74e220f1095ac05434128ec5efd5224c1e52279ee819a9b20f466add348adf585b48e636e38`.

---

## 6. Session authentication

### 6.1 V2 (`WearAuthV2` / `x6r`) — protocol version ≠ 0

[V] `com/xiaomi/wearable/wear/api/WearAuthV2.java`, `x6r.java`, `BleConnection.java`

No OS bond is required unless `DeviceInfo.requestBond` is set. If `requestBond` is true,
create the bond first, then enable notifications; otherwise go straight to the nonce
handshake.

Envelope `t7r` (WearPacket) over L2 channel 1, **type 100 / opCode 1 (plaintext)**:

```
field 1 (varint) = 1
field 2 (varint) = 26 (CMD_NONCE) or 27 (CMD_AUTH)
field 3 (message) = q90 payload
```

`q90` oneof field numbers used here: 30 = AppVerify (`w90`), 31 = DeviceVerify (`ca0`),
32 = AppConfirm (`t90`), 33 = DeviceConfirm (`z90`); field 3 = error code.

**Step 1 — sendAppVerify (msg 26)**

```
w90 {
  1: bytes  appRandom(16)
  2: string appDeviceId        // optional; required by Wear OS watches, optional for bands
  3: bool   hasOob             // true iff DeviceInfo.oob is non-empty
}
```

Response is a `t7r` whose `q90` is either:
- field 31 `ca0`: `{1: bytes deviceRandom(16), 2: bytes deviceSign(32)}` → continue;
- field 3 error code: `4` = device not bound / wrong app identity.

**Step 2 — verify device**

```
keys = HKDF-SHA256(ikm = token, salt = appRandom||deviceRandom,
                   info = "miwear-auth", L = 64)
deviceKey = bytes 0..15
appKey    = bytes 16..31
deviceIV  = bytes 32..35
appIV     = bytes 36..39

expected = HMAC-SHA256(deviceKey, deviceRandom || appRandom)
```

If `DeviceInfo.oob` is non-empty, the vendor message becomes
`deviceRandom || appRandom || oob` (UTF-8) [V] `WearAuthV2.j()`. For local-bind mode the
oob is normally empty. Compare with `deviceSign`; abort on mismatch.

**Step 3 — sendAppConfirm (msg 27)**

```
appSign = HMAC-SHA256(appKey, appRandom || deviceRandom)

dc0 {
  1: int32 0
  2: float SDK_INT
  3: string Build.MODEL
  4: uint32 appCapability        // 0 is valid; CapabilityManager default is 0
  5: string region               // e.g. "VN"/"CN"; may be empty
  6: string ""                   // unused
}
encryptedInfo = AES-CCM(appKey, nonce = appIV||00 00 00 00||00 00 00 00,
                        plaintext = dc0, aad = none)   // ciphertext||tag(4)

t90 { 1: bytes appSign, 2: bytes encryptedInfo }
```

Response `q90` field 33 `z90`:

```
z90 { 1: bool confirmed, 2: int32 deviceCapability, 3: int32 deviceCapabilityV2 }
```

On `confirmed == true`, install the four session keys (`deviceKey, appKey, deviceIV,
appIV`) and mark the link authenticated (state `AUTH_SUCCESS`, equivalent). Store
capabilities for feature gating.

**Capability handling:** the vendor stores `deviceCapability`/`deviceCapabilityV2` and
passes them to the app. A third-party app can set its own app capability to 0 and still
use the core time/battery/health commands; capability bits only gate optional features
(we found no mandatory bit for auth).

### 6.2 V1 (`WearAuthV1`) — protocol version 0

[V] `com/xiaomi/wearable/wear/api/WearAuthV1.java`, `WearBinderV1.java`

1. `createBond()` (OS pairing dialog / PIN). This is mandatory.
2. Enable notifications / start L1.
3. Send `t7r` envelope: field 1 = 1, field 2 = **5** (`CMD_SEND_USERID`), field 3 `q90`
   field 7 = string `userId`.
4. Success is a `q90` field 8 bool (`r()` true) or a field 3 error code; code 4 = not
   bound. There is no token/HKDF/AES exchange on the version-0 path; traffic remains
   plaintext after the OS bond. [V]
5. V1 bind (`WearBinderV1`) obtains a `bindkey` from the cloud, sends `s7r e=1 f=1` with
   `p90` field 2 = bindkey, calls `device/bind_with_devicesign`, then sends
   `s7r e=1 f=2` with `p90` field 5 = `mb0{1:userId,2:token,3:cc0}` **plaintext**.

A `token` is still generated locally for the cloud record: 12 bytes =
`MD5("token.<currentMillis>.<randomDouble>")[6..18]`, hex string [V]
`WearBinderV1.Companion.generateToken()`.

---

## 7. Binding

### 7.1 Probe: which bind mode does the watch offer?

Connect (unauthenticated), start L1, then send over channel 1/type 100:

```
s7r { 1: 1, 2: 17, 3: p90 { 11: sb0 {
    1: bool false,                 // "dynamic code" flag (vendor passes false)
    2: bytes MD5(userId)           // 16 bytes; user identity hint
    // 3 string and 4 int are normally empty/0
} } }
```

Response payload `p90` field 12 = `ha0`:

| Field | Type | Meaning |
|---:|---|---|
| 1 | int32 | **verifyMode**: `1` = PSK/cloud, `2` = local ECDH |
| 2 | string | SN |
| 3 | string | MAC (uppercase, used as BLE address) |
| 4 | string | model |
| 5 | int32 | **oobMode**: `0`, `2`, `3` (3 = button confirm on watch) |
| 6 | enum/varint | reserved |
| 7 | string | DID |

Error field 100 / `p90` field 3 code `1` means "device already bound".

Decision tree [V] `WearBinderV2.h()`:

```
verifyMode == 2 && oobMode in {0,2,3} -> LocalWearBinderV2 (no cloud; §7.2)
verifyMode == 1                       -> PSKWearBinderV2  (cloud; §7.3)
otherwise                             -> unsupported / fail
```

> **Gate 0:** this probe is the single most important real-watch experiment. If the
> target reports `verifyMode == 2`, the app can bind with no Xiaomi account and no cloud.
> If it reports `1`, the no-cloud route is not available (see §8.5).

### 7.2 V2 local bind (no cloud) — `LocalWearBinderV2`

[V] `com/xiaomi/fit/device/bind/LocalWearBinderV2.java`

All packets use `s7r e=1` over channel 1/type 100 (plaintext).

1. Generate an **EC P-256 keypair**. `appPub = X||Y` (64 bytes, uncompressed without the
   `0x04` prefix).
2. `appDeviceId` = `MD5(deviceId + MAC_upper + userId)`, uppercase MAC, hex digest
   (`LocalBindTool.generateAppDeviceIdWithPhoneId`; `deviceId` comes from the vendor
   `DeviceUtil.getDeviceID()`, Android-ID-like — its exact source is not expanded [I]).
   Any stable string is probably accepted for a local bind; matching the vendor algorithm
   is the safe choice.
3. Send `s7r {1:1, 2:18, 3:p90{17: na0{1:string appDeviceId, 2:bytes appPub}}}`.
4. Response `p90` field 18 = `ta0 {1: bytes devicePub(64), 2: bytes deviceSign(32),
   3: bytes deviceRandom(16)}`.
5. `sharedKey = ECDH-P256(appPriv, devicePub)` (32-byte X coordinate; Java
   `KeyAgreement` with secp256r1).
6. Verify `deviceSign == HMAC-SHA256(sharedKey, deviceRandom)` (append OOB UTF-8 only if
   the app has a non-empty OOB string; the vendor passes empty).
7. Generate `appRandom` (16 bytes).
8. Derive:

```
OKM = HKDF-SHA256(ikm = sharedKey, salt = appRandom||deviceRandom,
                  info = "miwear-bind", L = 64)
deviceKey = OKM[0..15]     // bytes 0..15
appKey    = OKM[16..31]
deviceIV  = OKM[32..35]
appIV     = OKM[36..39]
token     = OKM[40..55]    // 16-byte permanent credential
```

9. Send `s7r {1:1, 2:19, 3:p90{19: ka0{1:bytes appRandom,
   2:bytes HMAC-SHA256(sharedKey, appRandom)}}}`. (If an OOB string exists, the HMAC input
   is `appRandom || oob`.)
10. Response `p90` field 20 = `qa0 {1: bool confirmed}`. The user may need to confirm on
    the watch (oobMode 3); code 6 = device cancelled. For oobMode 0/2 the watch may
    confirm automatically.
11. Send `s7r {1:1, 2:25, 3:p90{29: pb0{1: bytes encryptedBindResult}}}` where:

```
bindResult = wa0 { 1: string userId,
                   2: cc0 { 1:int32 0, 2:float SDK_INT, 3:string Build.MODEL,
                            4:uint32 appCapability, 5:string region, 6:string "" } }
encryptedBindResult = AES-CCM(appKey, nonce = 10 11 12 13 14 15 16 17 18 19 1A 1B,
                              plaintext = bindResult, aad = "bind-data")  // || tag(4)
```

12. Success: response carries the `p90` payload (field 3) with no error code/string, or an
    empty result. The vendor then calls `onLocalBindSuccess(model, did, mac, sn,
    appDeviceId, token)` and tries `source/record_source` in the cloud asynchronously
    (failure is ignored; the local bind remains valid). Persist:
    `token (16 bytes, hex)`, `appDeviceId`, `userId`, `mac`, `did`, `model`, `sn`,
    `accessType = 1` (localBindMode).

**Reconnect after local bind:** §6.1 with `token`, `appDeviceId` (optional for bands),
empty oob. The watch must still be bound to this app; a factory reset/unbind wipes the
token and requires a new bind.

### 7.3 V2 PSK/cloud bind — `PSKWearBinderV2`

[V] `PSKWearBinderV2.java`, `DeviceRequest`, `DeviceBindService`

This path is chosen when `verifyMode == 1`. It requires a logged-in Xiaomi account and the
`miothealth` cloud authorization (§8). Sequence:

1. Probe `getBindInfo` (§7.1); get `verifyMode=1`, `oobMode`, model/MAC/SN/DID, and the
   device random (the vendor passes the `ha0` fields into `BindHelloInfo`; the exact
   `deviceRandom` source is the `ha0` payload/`getBindInfo` exchange — capture and log all
   `ha0` bytes on a real watch).
2. `POST https://hlth.io.mi.com/healthapp/bind/hello` with `data=<json>`:

```json
{
  "mode": 1,                 // verifyMode
  "model": "M2457B1",
  "mac": "AA:BB:CC:DD:EE:FF",
  "random_mac": null,
  "phone_id": "<device unique id>",
  "node_id": "<node id / third-party node>",
  "sn": "<serial>",
  "did": "<did>",
  "random_d": "<Base64 device random>"
}
```

Response `result` = `ApplyBindInfo { bind_did, bind_index, pub_s (Base64 64-byte server
P-256 public key), random_s (Base64), sign_s (Base64) }`.

3. Send `s7r {1:1, 2:18, 3:p90{13: jb0{1:bytes serverPub, 2:bytes serverSign,
   3:bytes serverRandom}}}`. Response `p90` field 14 = `eb0 {1: bytes devicePub,
   2: bytes deviceSign}`.
4. `POST .../bind/ecdh` with `data=<json>`:

```json
{ "bind_index": "...", "bind_did": "...",
  "pub_d": "<Base64 devicePub>", "sign_d": "<Base64 deviceSign>" }
```

Response `result` = `VerifyBindInfo { bind_key, device_key (Base64 16 bytes?),
oob_code (int), enc_share_data, sign_share_data, sha_token_key }`.
5. The watch displays/uses a 6-digit OOB code (`String.format("%06d", oob_code)`).
   Send `s7r {1:1, 2:19, 3:p90{15: ya0{1: bytes random16,
   2: bytes HMAC-SHA256(device_key, random16 || oobCode),
   3: bytes bind_key_bytes}}}`.
6. Response `p90` field 16 = `bb0 {1: bytes c, 2: bytes d, 3: bytes e(token)}`.
   Verify `HMAC-SHA256(device_key, c || oobCode) == d`; `e` is the **bind token**.
7. `POST .../bind/bind` with locale + `data=<json>`:

```json
{ "bind_index": "...", "bind_did": "...", "bind_sign": "<Base64 token>" }
```

Response `result` = `BindResult { ret, success }`.
8. Send `s7r {1:1, 2:25, 3:p90{29: pb0{1: AES-CCM(device_key, nonce 10..1B,
   plaintext = hb0{1:userId, 2:cc0}, aad = "bind-data")}}}`. The vendor uses
   `hb0` here (userId + device info); `cc0` is as in §7.2.
9. Persist the same fields plus the token, with the cloud bind identity; reconnect uses
   §6.1.

> The exact `ha0` → `BindHelloInfo` mapping for `random_d`, `node_id`, `phone_id` is only
> partly visible in the decompiled binder (`PSKWearBinderV2.x()`); capture a Mi Fitness
> bind on a real band with an HCI snoop log if cloud bind is required.

### 7.4 V1 cloud bind — `WearBinderV1`

[V] `WearBinderV1.java`

1. `s7r e=1 f=0` (empty) → response `p90` field 1 bool (`q()`): `true` means already bound.
2. `GET .../user/get_bindkey` → `BindKey { bindkey, ret }`.
3. `s7r {1:1, 2:1, 3:p90{2: bindkey}}` → response `p90` field 4 = `ea0`
   `{1:bindKey, 2:did, 3:model, 4:mac, 5:sign, 6:sn}`.
4. `POST .../device/bind_with_devicesign` with locale + `data=<json>`:

```json
{ "bind_key": "...", "did": "...", "model": "...", "mac": "...", "sign": "...",
  "token": "<12-byte token hex>",
  "extra_values": { "sn": "...", "third_node_id": "..." } }
```

5. `s7r {1:1, 2:2, 3:p90{5: mb0{1:userId, 2:token, 3:cc0}}}` (plaintext) → success.
6. Reconnect: §6.2 (OS bond + `CMD_SEND_USERID`).

### 7.5 Bind error codes (vendor callbacks)

| Code | Meaning |
|---:|---|
| 1002 | bind status API failed |
| 1003 | device already bound |
| 1005 | get bind info / get bind key failed |
| 1006 | unsupported OOB mode |
| 1007 | unsupported verify mode |
| 1008 | cloud bind_with_sign failed |
| 1009 | send bind result failed |
| 1010 | app verify / ECDH start failed |
| 1011 | server verify failed |
| 1012 | device verify failed |
| 1013 | OOB confirm failed/cancelled |
| 1014 | local bind final step failed |

---

## 8. Cloud API (Xiaomi health) — auth, signing, endpoints

> **Read §8.5 first.** This section documents the vendor's cloud path for completeness.
> It is not freely usable by an independent third-party app.

[V] `DeviceBindService.java`, `BaseRequest.java`, `CloudInterceptor.java`, `x24.java`,
`c24.java`, `g6j.java`, `TokenManagerImpl.java`, `MiAccountInternalManager.java`.

Base host: `https://hlth.io.mi.com/`; path prefix: `healthapp/`.
All bind APIs are annotated `@Secret(pathPrefix="healthapp/", encryptResponse=true,
filterSignatureKeys={"data"}, loginPolicy=required)`.

### 8.1 Login material

The health API is authenticated by a Xiaomi Passport **service token** for SID
`miothealth`:

```
MiAccessToken { userId, cUserId, serviceToken, security, timeDiff }
Cookie: cUserId=<cUserId>; serviceToken=<serviceToken>; locale=<locale>
User-Agent: Android-<release>-<versionName>-<brand>-<model>-<md5(androidId)>-<md5(userId)>
```

`MiAccountInternalManager.getServiceToken()` calls
`XiaomiAccountManager.getServiceToken(account, "miothealth", null)`. The account
authenticator is `com.xiaomi.passport.accountmanager.OwnAppXiaomiAccountAuthenticatorService`
declared by Mi Fitness together with `com.xiaomi.permission.AUTH_SERVICE` [V manifest].
The `security` key and service token are issued by Xiaomi's account service.

### 8.2 Request signing / response encryption (`CloudInterceptor` + `x24`)

For every `@Secret` request, with `nonce` = Base64(8 random bytes || 4-byte minute
timestamp) and `security` = service-token security:

```
keyString = Base64( SHA-256( Base64Decode(security) || Base64Decode(nonce) ) )
keyBytes  = Base64Decode(keyString)
```

**POST** (params in `filterSignatureKeys`, normally only `data`):

```
tree = { k: v }                       // non-empty values, sorted by key
rc4_hash_raw = Base64(SHA1(canonical(tree)))
tree["rc4_hash__"] = rc4_hash_raw
rc4 = RC4(keyBytes)                   // fresh state, discard 1024 bytes
for k in sorted(tree): enc[k] = Base64(rc4.crypt(UTF8(tree[k])))   // stateful!
signature = Base64(SHA1(canonical(enc)))
form body: enc["data"], enc["rc4_hash__"], signature, _nonce=<nonce>
canonical(map) = METHOD.toUpperCase() & path & "k=v" sorted & keyString
```

`path` is the URL-encoded path with the `healthapp/` prefix removed, e.g. `/bind/hello`.

**GET**:

```
canonical = "GET" & keyString & nonce & ("data=" if no params else sorted k=v...)
signature = Base64(HMAC-SHA256(keyBytes, canonical))
query: original params + signature + _nonce=<nonce>    // values NOT RC4-encrypted
```

**Response** (both): body is `Base64(RC4(JSON))`; decrypt with a fresh RC4 state
(discard 1024), keyBytes as above. JSON envelope:

```json
{ "code": 0, "msg": "", "result": { ... } }   // success: code 0 or 200
```

Reference vector (`docs/protocols/XIAOMI_TEST_VECTORS.json`, `cloudPost`/`cloudGet`):
security = 32×0x11, nonce = `IiIiIiIiIiLgPMgB`; verify your implementation against the
`key_b64`, `rc4_hash_encrypted_b64`, `signature_b64` fields before testing against the
real API.

### 8.3 Endpoints

| Method | Path (under `https://hlth.io.mi.com/healthapp/`) | Request `data` | Response `result` |
|---|---|---|---|
| POST | `bind/hello` | `BindHelloInfo` | `ApplyBindInfo` |
| POST | `bind/ecdh` | `BindECDHInfo` | `VerifyBindInfo` |
| POST | `bind/bind` (+`locale`) | `ConfirmBindInfo` | `BindResult` |
| POST | `device/bind_with_devicesign` (+`locale`) | `BindSignInfo` | `BindStatus` |
| GET | `user/get_bindkey` | — | `BindKey` |
| POST | `source/record_source` | `LocalBindInfo {sn,did,model}` | `LocalBindResult` |
| POST | `home/unbind` | `UnbindInfo` | `BindResult` |
| POST | `bind/update_device_info` | `{did, phone_id}` | `UpdateDeviceInfoResult` |

JSON models (field names are `@SerializedName`):

```
BindHelloInfo  { mode:int, model, mac, random_mac?, phone_id, node_id, sn, did,
                 random_d }
BindECDHInfo   { bind_index, bind_did, pub_d, sign_d }
ConfirmBindInfo{ bind_index, bind_did, bind_sign }
BindSignInfo   { bind_key, did, model, mac, sign, token, extra_values? }
BindKey        { bindkey, ret }
ApplyBindInfo  { bind_did, bind_index, pub_s, random_s, sign_s }
VerifyBindInfo { bind_key, device_key, enc_share_data, oob_code:int,
                 sha_token_key, sign_share_data }
BindResult     { ret, success }
LocalBindInfo  { sn, did, model }
LocalBindResult{ source_id }
```

### 8.4 Cloud bind sequences

- **V2 PSK**: §7.3 (hello → device verifyServer → cloud ecdh → device confirmOOB →
  cloud bind → device sendBindResult).
- **V1**: §7.4 (get_bindkey → device getBindInfo → device/bind_with_devicesign → device
  sendBindResult).
- **Local**: §7.2 (no cloud for the bind itself; optional `source/record_source`).

### 8.5 Feasibility / blocker

The cloud endpoints are protected by a **Xiaomi Passport service token for SID
`miothealth`**, issued to Mi Fitness's account authenticator/package and signed requests
(`security`). A normal third-party app:

- can declare `AUTH_SERVICE` and instantiate the Passport SDK, but it cannot register or
  impersonate the `miothealth` service identity;
- cannot obtain `serviceToken`/`security` for `miothealth` without Xiaomi's authorization
  (partner/client registration) or Mi Fitness's signing identity;
- extracting Mi Fitness's token/security from logs or app storage is fragile (tokens
  expire), device-dependent, and not a shippable path.

Therefore, for an independent app the viable no-blocker paths are:

1. **V2 local bind** if the watch reports `verifyMode == 2` (§7.2) — no account/cloud.
2. **Token import**: bind in Mi Fitness once, extract the 16-byte token from
   `Android/data/com.xiaomi.wearable/files/log/Transfer.device.log` (or
   `XiaomiFit*.log`; the field is `token`/`encryptKey`/`authKey` depending on version) via
   `adb` (no root needed per public reports), then connect with §6.1. This is the route
   used by Gadgetbridge users for the Smart Band 10 [Ext].
3. **Cloud self-bind** only if the project has a Xiaomi partnership/authorization. The
   spec above is complete enough to implement once credentials are available.

Do not ship an APK that scrapes Mi Fitness credentials or bypasses account authorization.
Put the cloud module behind a build flag and a startup feasibility check; keep the local
bind/token-import path as the default.

---

## 9. Device protocol after auth (s7r)

[V] `s7r.java`, `p90.java`, `ContactTaskQueue.java`, `DeviceContactEngineImpl.java`

All post-auth device commands are sent as L2 channel 1 / **type 101** (AES-CTR), payload =
protobuf `s7r`. Responses are matched by `s7r.e` (device/message class) and `s7r.f`
(command id); a response may also carry an error in field 100.

### 9.1 `s7r` envelope

```
field 1 (varint) e   // device/message class: 1 bind, 2 system/watch, 8 fitness, 22 mass
field 2 (varint) f   // command id inside the class
oneof payload:
  3  p90   (binding, generic)
  4  txo   (system: watch info, battery, time)
  6  v5r
  7  csg
  9  qxg
  10 ur9   (fitness)
  11 ive
  12 e9r
  13 xgo
  14 z93
  15 x69
  16 m01
  17 m5f
  18 x0b
  19 k14
  20 vkf
  21 udd
  22 jcp
  23 dg4
  24 f6f
  25 ude
field 100 (varint) error code (non-zero = failure)
```

Response matching in `ContactTaskQueue`: same `e`/`f`; an error is `field 100 != 0`
(`s7r.J()` / `s7r.s()`). If the response has no payload but no error, treat as success.

### 9.2 System commands (`e = 2`)

| `f` | Direction | Payload | Response | Notes |
|---:|---|---|---|---|
| 1 | app → watch | none | `txo` field 2 = `vwo` | battery, timeout 6 s |
| 2 | app → watch | none | `txo` field 3 = `swo` | watch info (serial, firmware, model) |
| 3 | app → watch | `txo` field 4 = `wxo` | none (needResponse=false) | set time/date/timezone, timeout 3 s |

**Battery (`vwo`)**:

```
vwo { 1: a }                          // field 1
a   { 1: uint32 batteryPercent,
      2: uint32 chargeStatus,
      3: ChargeInfo { 1: uint32 state, 2: uint32 timestamp } }
```

Vendor mapping: `battery = a.c`, `chargeStatus = a.d`,
`chargeInfo.state = a.e.c`, `chargeInfo.timestamp = a.e.d` (seconds).

**Watch info (`swo`)**:

```
swo { 1: string serialNumber,
      2: string firmwareVersion,
      3: string (unused/empty),
      4: string model,
      5: string (unused/empty) }
```

Vendor uses `swo.c` serial, `swo.d` firmware, `swo.f` model.

**Time (`wxo`)**:

```
wxo { 1: n64 {1:uint32 year, 2:uint32 month, 3:uint32 day},
      2: t64 {1:uint32 hour, 2:uint32 minute, 3:uint32 second, 4:uint32 millis},
      3: v64 {1:sint32 utcOffset15min, 2:sint32 dstOffset15min, 3:string tzId,
              4:string unknown},
      4: bool is24HourFormat }
```

Offsets are `TimeZone.getRawOffset()/15min` and `getDSTSavings()/15min`, encoded as
zigzag sint32 (`v64` field 1/2 use `i0`/`x`). Example vector in §5.6 / §10.5.

### 9.3 Fitness ID sync (`e = 8`)

| `f` | Request | Response |
|---:|---|---|
| 1 | get today data IDs: `ur9 {5: nu9 {1: isAutoSync?1:0}}` | `ur9` with field 2 or 3 raw IDs |
| 2 | get history data IDs: no payload | same |
| 3 | request data for multiple IDs: `ur9 {2: bytes concatenated 7-byte IDs}` | data arrives on channel 5 |
| 4 | request data for one ID: `ur9 {3: bytes 7-byte ID}` | data arrives on channel 5 |
| 5 | confirm data ID: `ur9 {3: bytes 7-byte ID}` | empty/ok |

Response `ur9`: field 2 = `getId` (one raw ID), field 3 = `getIds` (concatenated raw IDs).
The vendor accepts either (`ur9.d0()/e0()`).

The 7-byte `FitnessDataId` (little-endian):

```
bytes 0..3 : uint32 timestamp (seconds)
byte  4    : int8   timezone in 15-minute units (signed)
byte  5    : uint8  version
byte  6    : uint8  typeByte = (dataType << 7) | ((sportType or dailyType) << 2) | fileType
```

`dataType 0` = daily data (`dailyType` in bits 6..2), `dataType 1` = sport
(`sportType` in bits 6..2); `fileType` in bits 1..0. The server-ID variant drops the
type byte for daily data (6 bytes) and keeps 7 for sport.

### 9.4 Fitness data transfer (channel 5 / type 102)

[V] `FitnessReceiverHandler.java`, `FitnessDataReceiver.java`

After `f=3/4`, the watch sends one or more L2 packets on **channel 5** (type 102). Each
packet payload:

```
u16 LE totalSegments
u16 LE sequence          // 1-based; must arrive 1..total
bytes  segmentData
```

The app concatenates segmentData in sequence order. The merged buffer:

```
[0..7)  7-byte FitnessDataId
[7..]   payload
```

with an optional CRC32 as the last 4 bytes of the merged data (the vendor's
`crc32Verify=true` path verifies then strips it; the CRC is computed over everything
before it). On completion, parse by `FitnessDataId`, then confirm with `f=5`.

Channels may use opCode 1 (plaintext) or 2 (AES-CTR); handle both. The segment framing has
no file name/path; association is solely by the 7-byte data ID.

### 9.5 Fitness payload parsing

The payload is a vendor-specific bit-packed record format, not FIT and not protobuf.
`FitnessDataParser` maps `(dataType, dailyType/fileType/sportType)` to a parser:

- dailyType 0 / fileType 0 → `DailyRecordParser` (daily minute records)
- dailyType 0 / fileType 1 → `DailyReportParser` (daily summary)
- dailyType 2 → `DaytimeSleepParser`
- dailyType 3 → `NightSleepParser`
- dailyType 5 → `UserProfileParser`
- dailyType 6 → `ManualMeasureParser`
- dailyType 8 → `AllDaySleepParser`
- dailyType 9 → `AbnormalRecordParser`
- dailyType 10 → `WeightRecordParser`
- dailyType 11 → `EcgMeasureParser`
- dailyType 12 → `TemperatureMeasureParser`
- dataType 1 / fileType 0 → sport record parser by `sportType` (outdoor/indoor run/bike,
  swim, free training, etc.)
- dataType 1 / fileType 1 → sport report parser
- dataType 1 / fileType 2 → GPS
- dataType 1 / fileType 3 → recovery-rate record

**DailyRecordParser layout** [V] `com/xiaomi/fit/fitness/parser/daily/DailyRecordParser.java`:

Bit-packed `FourDimenDataInfo` arrays. The `dataValid` bitmap (nibble per field group)
says which fields are present; each record's byte length is the sum of present field
byte sizes; fields are extracted from little-endian bytes with
`value = (raw & ((2^bitSize - 1) << startBit)) >>> startBit`.
The parser has three layouts by `dataId.version` (v1/v2/v3). Data item types:

| type | metric | type | metric |
|---:|---|---:|---|
| 0 | includeSleep | 9 | energy |
| 1 | includeAbHr | 10 | sleepMode |
| 2 | steps | 11 | totalCal |
| 3 | activityType | 12 | energyState |
| 4 | calories | 13 | energyStateValue |
| 5 | activityHILevel (v3+) | 14 | spo2 |
| 6 | sportType | 15 | pressure (stress) |
| 7 | distance | 16 | hrPreAbnormal |
| 8 | hr | 17 | lightValue |
|   |   | 18 | bodyMomentum |

The v2 data-info array in the source defines the byte/bit layout for each group; port it
verbatim from the evidence for a first working parser. `DailyRecordParser` emits one
`ParsedDailyRecord` per minute starting at `dataId.timestamp` (rounded down to a minute)
for `DateTimeHelper.sDayInMinutes` records.

`DailyReportParser` exposes: steps, calories, restHr, curHr, maxHr/minHr (+times),
recoveryTime, spo2 (cur/max/min + times), stress (avg/max/min), stand, totalCalories,
training load/level, vitality, physical fitness/status, fatigue, suggested activity.
`NightSleepParser` exposes: total score, quality/duration/recovery/nervous scores,
summary/advice, sleep duration, bed/wakeup time, light/deep/REM/awake durations and
counts, sleep state/time.
`AllDaySleepParser` exposes: bed/wakeup, sleep quality, HR, SpO2, snore dB, efficiency,
in-bed/sleep durations, go-bed/leave-bed times.

For sport payloads, port the `sport/record/*` + `sport/report/*` parsers only for the
sport types you need; the report parser table in
`FreeTrainingReportParser.java` shows a representative `OneDimenDataType` layout
(type, byteSize, valueType, repeat, flags, 120/112 samples). GPS files are a separate
`SportGpsParser` format.

### 9.6 Error / status codes seen at the device layer

Device responses use `s7r` field 100 for errors and `p90` field 3 for bind errors.
Common bind codes are in §7.5. Transport errors: API code `-1` send failed, `-2`/`-4`
timeout, `-3` disconnected, `-6` response timeout; app-level `2001..2016` for connection /
auth stages (`BleConnection` status). Treat any unknown nonzero as a retryable failure
except `4` (not bound) and the bind error codes.

---

## 10. Connection lifecycle, reconnect, foreground service

### 10.1 State machine

```
IDLE
 └─ scan → CONNECTING (connectGatt, 45 s timeout)
      └─ DISCOVERING (30 s)
           └─ VERSION_READ (0x50)
                └─ LINK_OPEN (notifications + L1 START, 10 s)
                     └─ AUTHENTICATING (bind probe or session auth, 15 s)
                          └─ READY (time sync, battery, watch info)
                               └─ SYNCING (fitness IDs/data)
                                    └─ READY
```

The vendor arms per-step timeouts and a 20 s service-discovery timeout; a link that is not
`READY` within ~120 s should be torn down. After `READY`, run a foreground service and
reconnect on link loss.

### 10.2 Reconnect / backoff

- Local-bind devices: `TimeDurationStrategy(10, 2, 1, 256)` — 10 s first retry, then a
  duration-based strategy.
- Cloud/token devices: `ExponentialBackoffStrategy(2, 1, 256)` — start 2 s, double,
  cap 256 s.
- The vendor treats BT-off, app-inactive, sleep mode and binding as "do not reconnect"
  states; keep a similar guard.
- On reconnect, repeat discovery/version/L1/auth; do not cache GATT handles. Optionally
  refresh the GATT cache if Android returns status 133.

### 10.3 Contention with Mi Fitness

Only one app can hold the link. If Mi Fitness is installed and running:
`adb shell am force-stop com.mi.health` (or disable it) during development. The watch may
require **"Connect new phone"** mode before it accepts a new bond/identity; enable it in
the watch settings / Mi Fitness if pairing fails. For V2 token auth there is no OS bond to
remove, but the watch may still prefer its last companion.

### 10.4 Unbind / factory reset

The local binder's `unbind()` only removes the local record; the watch may still consider
itself bound. To start over, factory-reset the watch or remove the device from Mi Fitness
and confirm on the watch. A watch that reports "already bound" on `getBindInfo` must be
reset before a new bind.

### 10.5 Time-sync example bytes

For 2026-11-12 19:30:00.250, UTC+7, 24-hour, the `s7r` protobuf is:

```
080210032230222e0a0708ea0f100b180c12090813101e180020fa011a16083810001a10
417369612f486f5f4368695f4d696e682001
```

(see `XIAOMI_TEST_VECTORS.json` → `timeSync`). Wrap in L2 `01 02` + AES-CTR for type 101; the plaintext
L2 is `01 01` + the above for a type-100 test.

---

## 11. Evidence index

All paths relative to `docs/re-evidence/mi/jadx-base/sources/`.

| Topic | Files |
|---|---|
| transport L0/L1/L2 | `com/xiaomi/wearable/transport/layerl0/{TransportL0,BleChannel}.java`, `layerl1/{L1Packet,TransportL1,CMDPacket,ACKPacket,DataPacket}.java`, `layerl2/L2Packet.java`, `TransportV2.java`, `queue/{TaskQueueV2,BleTaskQueueV2,BleTaskQueueV1}.java` |
| UUIDs / version | `defpackage/qf4.java`, `defpackage/k8q.java`, `defpackage/e7r.java`, `defpackage/x82.java` |
| auth | `com/xiaomi/wearable/wear/api/{WearAuthV1,WearAuthV2,CipherApiCall}.java`, `defpackage/{x6r,z6r,lq2}.java`, `BleConnection.java` |
| crypto | `defpackage/{iql,ucb,c9c,m83,o0,wq1,i0}.java` |
| bind | `com/xiaomi/fit/device/bind/{WearBinderV1,WearBinderV2,LocalWearBinderV2,PSKWearBinderV2,WearOSDeviceBinder}.java`, `com/xiaomi/fitness/device/manager/api/DeviceBindService.java` |
| cloud auth/signing | `com/xiaomi/fitness/app/{CloudInterceptor,UAInterceptor}.java`, `com/xiaomi/fitness/account/{ParameterInterceptor,SIDs}.java`, `com/xiaomi/fitness/account/token/{TokenManagerImpl,MiAccessToken}.java`, `defpackage/{x24,c24,q34,g6j,e6j}.java` |
| device commands | `com/xiaomi/fitness/device/contact/syncer/{TimeSyncer,BatterySyncer}.java`, `com/xiaomi/fit/device/model/BluetoothDeviceModel.java`, `com/xiaomi/fit/fitness/device/mi/send/FitnessWearPbImpl.java`, `defpackage/{s7r,p90,txo,wxo,n64,t64,v64,vwo,swo,ur9,nu9}.java` |
| fitness transfer/parsing | `com/xiaomi/fit/fitness/device/mi/receive/{FitnessReceiverHandler,FitnessDataReceiver}.java`, `com/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager.java`, `FitnessDataParser.java`, `parser/daily/*.java`, `parser/base/{FourDimenDataParser,FitnessDataBaseParser}.java` |
| protobuf schemas | `docs/re-evidence/mi/proto/` (bundled `.proto` files, not the MiWear internal schema) |
| test vectors | `docs/re-evidence/mi/tools/gen_vectors.js`, `docs/protocols/XIAOMI_TEST_VECTORS.json` |

Cross-check [Ext]: Gadgetbridge `service/devices/xiaomi/XiaomiAuthService.java`,
`XiaomiBleProtocolV2.java`, `XiaomiUuids.java`; Gadgetbridge pairing docs for Xiaomi
token extraction. These agree with the APK on UUID `FE95/5E/5F`, CMD 26/27, HKDF label
`miwear-auth`, AES-CCM tag 4 and AES-CTR key=IV.

---

## 12. Open questions / real-watch gates

1. **Bind mode Gate 0**: does the target report `verifyMode == 2` (local) or `1` (cloud)?
   Without this, the no-cloud path is unproven. Run §7.1 and log `ha0` all fields.
2. **`ha0` field semantics for PSK bind** (`random_d`, `node_id`, `phone_id`, oob mode):
   capture a Mi Fitness bind with an HCI snoop log.
3. **`appDeviceId` necessity on non-Wear-OS V2**: Gadgetbridge sends it only for Wear OS
   watches [Ext]; the vendor always sends it for local bind. Try empty and vendor-style
   values on the real watch, log the `sendAppVerify` error (4 = not bound).
4. **Notifications/write type**: verify write-with-response vs without-response and the
   negotiated MTU on the real band.
5. **`swo`/`vwo` optional fields** (firmware/model/charge info) may differ per model; log
   the raw protobuf and tolerate missing fields.
6. **Fitness payload versions**: `dataId.version` selects v1/v2/v3 layouts; start with the
   exact parser layout for the observed version and validate one day of data.
7. **CRC32 on fitness files**: confirm whether the watch includes it per firmware.
8. **Local-bind OOB modes 0/2**: what user interaction is required; mode 3 is button
   confirm. Log `qa0` and any watch UI prompt.
9. **Cloud service-token authorization**: if cloud self-bind is mandatory, run the
   Passport feasibility test; otherwise ship local bind/token import.
