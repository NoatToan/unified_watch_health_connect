# Huawei connection/session analysis — Health 17.0.7.310

Date 2026-11-08. Scope: scan → connect → handshake → ready, per-MAC session state, basic
post-connect operations, robustness, gaps. Crypto internals are out of scope (see
`rea-output/huawei/AUTH_CRYPTO_ANALYSIS.md`); HiChain/crypto classes appear only as call points.

Tags: **[V]** read directly in decompiled source, **[I]** inferred from names/structure/logs,
**[Ext]** public/external. jadx root: `unified_health_app/docs/re-evidence/huawei/jadx-out/sources`
(all `defpackage/...`, `com/...` paths below are relative to it; the older `rea-output` copy has no
`defpackage/` classes and was not used). Driver root:
`unified_health_app/driver/huawei/src/main/kotlin/com/unified/health/driver/huawei`.

## 1. Connection lifecycle end-to-end

### 1.1 Scan (BLE and BR)

1. `ScanStrategyBle.scan()` uses one **empty** `ScanFilter` and `SCAN_MODE_LOW_LATENCY` (2); every result is matched in app code by `DeviceDiscoveryProcessor` (`cjs`) with filter type 0 match-all / 1 equals / 2 startsWith / 3 endsWith / 4 contains / 5 MAC, case-insensitively, back-filling a missing name from the scan record [V] `com/huawei/devicesdk/strategy/ScanStrategyBle.java:43-143`, `defpackage/cjs.java:83-126,151-190`. The Huawei/Honor name table is `defpackage/lvi.java`; the driver's four prefixes are the practical subset [V] `HuaweiDriver.kt:94-102`.
2. BR uses `cob`; periodic reconnect uses a MAC-filtered scan (`ScanFilter.Builder().setDeviceAddress(mac)`), not the name scan [V] `defpackage/cnr.java:241-288`.
3. Scan results are only reported upward (`scanResult(...,20)`); no auto-connect in the discovery processor [V] `cjs.java:102-116` — the app/UI chooses the device [I].

### 1.2 Connect, GATT setup, bonding

1. `DevicesManagementService.connectDevice` → `cju` → `DeviceConnectManager` `cnf.c`; `cnf` keeps one `ConnectStrategy` per MAC, `cll` one physical layer per MAC (`Map f1732a`), selected by `ConnectMode`+`deviceBtType`: btType 2 → `cld` BLE, 1 → `cli` BR/EDR SPP, 0 → `clk` Wear OS host; SIMPLE → `clm`, TRANSPARENT → `cln` [V] `defpackage/cnf.java:117-163`, `defpackage/cll.java:72-105,126-143`.
2. BLE `connectGatt(ctx,false,cb,TRANSPORT_LE=2)`; null result → 1 s sleep + one retry; an 8 s GATT timeout is armed first, and a 7 s service-discovery timeout after CONNECTED with discovery posted 1 s later [V] `defpackage/cld.java:264-297,702-707`, `com/huawei/devicesdk/connect/physical/PhysicalLayerBase.java:154-178`.
3. On discovery: FE86 + FE01 write + FE02 notify + CCCD 0x2902; descriptor-write status 0 moves to state 2 and starts the handshake [V] `cld.java:604-619,776-820`, `defpackage/cmj.java:15-17`, `cnf.java:306-324`. Retries: 133 up to 3 (disconnect, 5 s, close, 1 s, reconnect); discovery timeout twice after reflective `BluetoothGatt.refresh()`; descriptor failure rediscovery twice; final errors `cpi.c(6,133)`, `cpi.c(2,301/302)` [V] `cld.java:84-112,687-728,731-774`.
4. BR: RFCOMM UUID `82ff3820-8411-400c-b85a-55bdb32cf060` (emulator uses standard SPP); connect thread sleeps 500 ms (1 s in one mode); “Connect refused” sleeps 5 s, retries twice; reflected `createRfcommSocket(channel)` fallback exists [V] `defpackage/cli.java:492-523,535-605,634-643,663-700`. AW/`clk` uses Google’s Wearable data layer, not GATT [V] `defpackage/clk.java:47-86`.
5. Bonding has two entries. UI `pairDevice`/`createSystemBond` → `PhysicalLayerBase.pairDevice` → `coi.c` → reflective `createBond()` only when BOND_NONE; results via `ACTION_BOND_STATE_CHANGED` reported as 30/31/32 [V] `PhysicalLayerBase.java:154-190`, `defpackage/coi.java:413-438,576-605`, `defpackage/coj.java:53-70`. Independently, after 0x0101 the watch’s TLV 9 decides bonding: 0 = none, 1/2 = bond if BOND_NONE [V] `coi.java:576-605`, `defpackage/ckv.java:121`. TLV 9 = 2 while phone is bonded (12) is **key-miss**: remove bond, status 56, disconnect; `cnf.g` then reconnects with `reconnect=true` to re-pair [V] `ckv.java:101-120`, `cnf.java:606-622`. Bonding is watch-parameter-driven, not a fixed precondition [V/I].
6. No ATT `requestMtu` in the watch path; only the generic ArkUI plugin calls it [V] `ohos/ace/plugin/bluetoothplugin/BluetoothGattClient.java:229`. Frame sizes are negotiated in 0x0101 instead.

### 1.3 0x0101 link negotiation

1. Request is clear text `01 01 | 01 00 02 00 03 00 04 00 10 00` (empty TLVs 1,2,3,4,16; 16 omitted on Huawei demo phones) [V] `ckv.java:25-61`.
2. Response TLVs: 1 bond/ability, 2 maxFrame, 3 singleFrame, 4 interval, 5 authVersion(2 B)+randA (16 B), 7 authType, 9 bondStatus (2 = key-miss), 12 encryption (1 = AES-GCM), 15 singleFrameDevice (display only), 16 demo flag [V] `ckv.java:148-269`, `defpackage/cml.java`. The 2698-byte single-frame quirk is rewritten to 990/990/10 ms [V] `ckv.java:202-208`.
3. The previous per-MAC link-parameter object is removed before the request and the new one stored afterwards in `cka.f1666b` via `cnk` [V] `ckv.java:55-58,92`, `defpackage/cnk.java:221-227`, `defpackage/cka.java:148-170`.
4. Next command: BLE goes directly to auth selection (`cke`); BR first runs **0x0116 QueryAvailableCommand** [V] `ckv.java:131-141`. **0x0116 is skipped on BLE**, contrary to a plain reading of the handshake table [V].
5. Timeout: 10 000 ms ack timer, 2 resends / 3 sends total; it is cancelled if the 0x0101 response has already populated the link cache [V] `defpackage/cnx.java:437-448`, `com/huawei/devicesdk/strategy/CommandTimerTask.java:31-47`, `HandshakeGeneralCommandBase.java:12`.

### 1.4 Authentication branch and order

`cke.d` selects by authType: 1/3 → HiChain (fallback HiChainLite), 2/8 → HiChainLite, 4 → HiChain3,
else legacy HMAC [V] `defpackage/cke.java:26-50`, `defpackage/cnc.java:16-18`,
`defpackage/cni.java:18-20`, `defpackage/cmz.java:9-11`.

* **Capability auth (1/2/3/4/8)**: clear-text **0x0133 SecurityNegotiation** carries auth mode, reconnect flag, phone identity/EMUI/model/MAC/device-type; the derived token itself is sent in 0x0113, not 0x0133 [V] `defpackage/ckx.java:48-163`. Outcomes: `100000` → native HiChain (`HiChainAuthManager.c` → `HiChainClient`, PAKE data relayed over **0x0128** `cks`, final next command **0x0107**) [V] `ckx.java:214-232`, `com/huawei/devicesdk/hichain/HiChainClient.java:139`, `defpackage/cks.java:46-92`; HiChain3 codes 5/6 → `cnd` group manager [V] `ckx.java:27-29,249-259`; HiChainLite 1/2 → per-device secret key derived, and if reconnecting with a stored key goes straight to **0x0113**, else if no PIN is cached inserts **0x012C GetDevicePinCode** (watch-displayed PIN) then **0x0113** [V] `ckx.java:266-302`, `defpackage/ckp.java:94-118`.
* **Legacy** exits `cke` directly to **0x0113 AccessValidityAuth** (HMAC challenge using randA from TLV 5 and a fresh randB; CAK call point only) [V] `cke.java:67-83`, `defpackage/ckd.java`.
* After 0x0113 success: **0x010F QueryBtBindStatus** for BLE/HiChainLite; then either **0x012D UpdateDeviceKey** (stored key) or **0x010E BindRequest** (first bind); legacy non-BLE may skip to 0x0107 [V] `ckd.java:127-151`, `defpackage/cla.java:169-247`, `defpackage/ckc.java:89-120`, `defpackage/clb.java:73`. 0x010E success → **0x0107**; a bind rejection (status 55) disconnects [V] `ckc.java:99-120`, `cnx.java:233-238`.
* Status codes seen: 13 command failure, 14 key lost/re-pair, 55 bind not allowed → disconnect, 56 key-miss → re-pair [V] `ckd.java:85-150`, `ckc.java:108-119`, `ckv.java:112-118`, `cnx.java:217-241`.
* Timing: normal auth commands use 10 s/3 sends; **0x010E and first 0x0128 use 30 s/3 sends** [V] `cnx.java:464-485`. `cnf` also arms a **60 s whole-handshake watchdog at physical connect**, failing with `cpi.c(5,306)` unless the handshake finishes or enters OOBE [V] `cnf.java:320-324,631-662`; this cap overlaps long 0x010E/0x0128 exchanges [I].

### 1.5 Post-auth configuration → ready

Actual app order: **0x0107 → 0x0105 → 0x0102 → 0x0103 → optional 0x0137 → optional 0x013C →
optional 0x0132 → optional 0x0112 → status 53 → OOBE custom chain → status 10**, not the order our
driver uses [V] `ckq.java:101-107`, `ckz.java:84-91`, `ckn.java:50-54`, `cki.java:100-118`,
`defpackage/ckk.java:13-52`, `defpackage/ckl.java:285-294`, `defpackage/ckw.java:58-88`,
`defpackage/cko.java:60-68`.

1. **0x0107 GetDeviceVersion**: command header + fixed type list (1,2,7,9,10,17,18,22,26,29-35) as empty TLVs [V] `ckq.java:135-137`.
2. **0x0105 SetDateAndTime**: `01 05 | 01 04 <epoch u32 BE> | 02 02 <zone>`; zone is `hours<<8 | minutes` with 0x80 added for negative offsets; epoch is rounded to the nearest second [V] `ckz.java:45-67`, `defpackage/cku.java:154-225`. Response epoch is compared to phone time; a drift ≥1 s triggers one resend, using network time if available [V] `ckz.java:103-117`.
3. **0x0102 ServiceCapabilityConsult**: request TLV 1 = `[count-1, svcId...]`, optional TLV 3 = phone device type; response first child = ASCII hex bitmap, bit 0 of byte i = service i+1 supported [V] `ckn.java:62-136`; also `docs/re-evidence/huawei/capability_consult.md`.
4. **0x0103 CommandCapabilityConsult**: request nested TLV 0x81 with per-service TLV 2 = serviceId and TLV 3 = `[cmdCount, cmdIds...]` [V] `cki.java:125-163`. Response layout is now **verified** (was [I]): a list of nested TLVs, each with child TLV 2 = serviceId and child TLV 4 = ASCII hex support vector, two hex chars per command (0x01 supported / 0x00 not); the app builds `"service.command"` booleans and `cle.a` maps them to `DeviceCapability` [V] `cki.java:165-249`, `defpackage/cle.java:33-60`.
5. **0x0137** runs only when `isSupportExpandCapability`; then **0x013C** (`01 3C` + TLVs 1,2[,3,4]) only when dual-socket capability is reported [V] `cki.java:32-43`, `ckk.java:54-78`, `ckl.java:255-294`.
6. **0x0132** runs only when `isSupportZoneId`; **0x0112** only when `isSupportActivityType`; else the chain ends [V] `ckl.java:285-294`, `ckw.java:66-88,135-144`. Status 53 starts the app’s OOBE/customization filter, which may run 0130/0131/2601/1A05/1A06 before status 10 [V] `cnx.java:51-59,124-133`, `defpackage/mkz.java:109`, `defpackage/mkr.java:103`.
7. Driver comparison: `DeviceConfigurator.configure` runs 0107 → 0105 → 0132 → 0102 → 0103, so 0132 is early/unconditional, 0137/013C/0112/OOBE are absent and 0x0103 is kept raw [V] `DeviceConfigurator.kt:66-93`.

## 2. Context holding / session state

### 2.1 Per-MAC caches and lifecycle

| State | Holder | Lifetime |
|---|---|---|
| DeviceInfo (state 1/2/3/4, `using`, `reconnect`, last-connected, udid) | `cka.f1665a/e` via `cnk`; cache/active pair [V] `cka.java:20-84`, `cnk.java:26-39` | process (+ `clw` persistence [I]) |
| Link params: maxFrame, singleFrame, interval, authVersion, randA, authType, bondStatus, encryption | `cka.f1666b` (`cml`) via `cnk` [V] `cka.java:148-170` | memory only; removed at the start of every 0x0101 (`ckv`), not by `clearDeviceCache`; no `cml` serializer [V] |
| Device/external capability | `cka.d` (`ExternalDeviceCapability` holding `DeviceCapability`) via `cnk.b/c` [V] `cka.java:136-146,193-235` | memory + `clw` persistence [V] `clw.java:243` |
| Connect mode + handshake-running flag | `cka.j` (`cmo`) [V] `cka.java:114-134`, `cnk.java:162-219` | process |
| Per-device command queue | `cnm.f1852a` (`cls` thread + `PriorityBlockingQueue`) [V] `cnm.java:23-26,140-151`, `defpackage/cls.java:34-100` | process |

`cnk` is a singleton facade over singleton `cka`; all maps are `ConcurrentHashMap` keyed by MAC
[V] `cka.java:20-38`, `cnk.java:282-284`. Link parameters are re-negotiated on every connection, so
a stale cache cannot cross a reconnect [V].

### 2.2 Secrets, randA, session-key lifecycle (call points only)

* Persistent device secrets: SharedPreferences files `share_preference_order_one/two`, `btsdk_sharedpreferences_identify_key`, `..._bindid`, `..._update_key_label`, `..._identify_pin_codeMACA`; preference keys are a hash of the MAC (`ckg.b(mac)`), values encrypted with an Android-KeyStore AES/CBC/PKCS7 key (`cqo`) [V] `defpackage/cpv.java:15-146`, `defpackage/cqo.java:30-70`.
* HiChainLite per-MAC working state (PIN token, first/reconnect/current keys, algorithm) is an in-memory map in `cnh`, re-derived from the persisted secret after process death [V] `defpackage/cnh.java:1-150`. HiChain session key is held per MAC by `HiChainClient` and exposed by `HiChainAuthManager.e().d(mac)`; HiChain3 group/key state is in `cnd` [V] `com/huawei/devicesdk/hichain/HiChainAuthManager.java:106-175,228-260`, `defpackage/cnd.java:194-267`.
* Per-MAC payload work key and IV counter are cached by `cjy` (`Map i` key, `Map g` counter); 0x010F TLV 9 seeds the counter via `cjy.c(mac,value)` [V] `defpackage/cjy.java:28-38,565-571`, `cla.java:156-160`. randA/authVersion live only in `cml` for the current link; randB is a fresh 16-byte random per auth attempt [V] `cke.java:85-96`. No other key material is persisted by the link layer.
* Teardown: `cnx.destroy` clears the `cjy` key/counter caches, `cnh` HiChainLite state and the HiChain client; `unPairDevice` also clears the stored secret and HiChain3 group [V] `cnx.java:79-97`.

### 2.3 GATT ownership, state machine, reconnect, keepalive

* One `BluetoothGatt` per MAC is owned by the `cld` instance (`field e`), created lazily and closed on release; FE01/FE02 handles are cached (`q`/`o`). Writes are serialized by `ReentrantLock` and wait for `onCharacteristicWrite` up to `ProfileExtendConstants.TIME_OUT = 1500 ms` [V] `cld.java:30-56,405-451`.
* State machine (`DeviceInfo.deviceConnectState`): **1** connecting, **2** connected/ready (only after handshake), **3** disconnected, **4** failed; transitions are reported by `cnf.onPhysicalLayer*`/`onHandshake*` [V] `cnf.java:191-230,306-426`, `cld.java:196-212`. Values 9-11 are set by the OTA/upgrade manager [V] `defpackage/mkc.java:843-908` (semantics [I]); 13/14 likewise appear only as in-progress guards and reconnect treats the whole set as “in progress” [V] `cnf.java:217`.
* Reconnect: on disconnect/handshake failure `cno.d(device,reason)` schedules a retry only for a `using` BLE device. Reason ending 133 → **300 s** delay; 304 (GATT timeout) takes the default reconnect path and records the MAC for a scan-found report [V] `cno.java:282-316`. The scan delay is stateful: after a reset it starts at 4 s and doubles to 64 s (256 s on Harmony 3), resetting at most once per 30 min; one branch toggles 4 s ↔ 20 min [V] `defpackage/cns.java:15-54`. On Harmony (`cop.f()`) main-relationship / multi-link / product type 275 devices get a fast 5 s scan [V] `cno.java:302-315`. Reconnect scans use `setExactAndAllowWhileIdle` alarms to `PeriodScanService`, a plain service in `:PhoneService` (not foreground) [V] `cnr.java:341-417`, `com/huawei/health/manager/reconnect/PeriodScanService.java:1-52`, `docs/re-evidence/huawei/AndroidManifest.xml:4699-4701`.
* Triggers: Bluetooth-on → reconnect BR after 10 s; HFP/ACL connect events can trigger reconnection; app-foreground broadcast starts all reconnects, throttled to once per 60 s [V] `cno.java:62-126,127-167`.
* Keepalive/watchdog: no application-level heartbeat/ping in the device SDK; liveness relies on the 60 s handshake watchdog, OS GATT disconnect callbacks and reconnect alarms [V absence in `com/huawei/devicesdk/**`; `PhoneService` “HEARTBEAT_INFO” is app process telemetry, not a device heartbeat, `com/huawei/hwservicesmgr/PhoneService.java:494-536`].
* No foreground service for the wearable link; `DevicesManagementService` and `PeriodScanService` are non-exported `:PhoneService` services [V] `docs/re-evidence/huawei/AndroidManifest.xml:4677-4701`.

### 2.4 Multi-device concurrency

* Every layer is keyed by MAC: physical layer (`cll.f1732a`), strategy (`cnf.d`), command thread and priority queue (`cnm`/`cls`), device/link/capability maps (`cka`), so the SDK structurally supports concurrent links with one sender thread per device [V] `cll.java:72-105`, `cnf.java:269-289`, `cls.java:34-100`.
* `cnf.j` only blocks a duplicate connect of the *same* MAC; it does not cap connected devices [V] `cnf.java:205-230`. Reconnect ordering puts `main_relationship` first, then sorts by last-connected time; other devices auto-reconnect only when the relation allows [V] `cno.java:250-273,338-366`. Simultaneous watches depend on multi-link/dual-socket capability [I] (flags 56/142, `ckk.java:63-77`).

## 3. Basic operations after connect

| Operation | Vendor flow (class/method) | Our driver |
|---|---|---|
| Time sync | Service 1 cmd 5 in handshake; TLV 1 epoch u32 BE, TLV 2 zone; echo checked, one resend with network time [V] `ckz.java:45-117`, `cku.java:154-225` | Implemented (`DeviceConfigCommands.setDateTime`); no echo check/resend/network time [V] |
| Time zone | Service 1 cmd 0x32; payload **`01 32` header** + TLV 1/4 epoch + TLV 2/2 zone + TLV 3 IANA; capability-gated; echo + one resend [V] `ckw.java:30-133`, `cku.java:154-225` | Implemented as TLV 3 only, sent early; “50-byte TLV 0x01” in `timezone_command.md` misreads the `01 32` header [V] |
| Battery | Service 1 cmd 8 query (`01 08` + `01 00`, or TLV 2/3 for earbuds when capability 112) [V] `mev.java:155-179`; response protocol 0 → raw byte 14, newer → TLV 1 level 0-100, TLV 2/3 earbud levels/status [V] `mer.java:240-346` | **Missing**; driver infers battery from 0x0107 “type 12” (actually device name) or SIG `0x180F` [V] `HuaweiSession.kt:62-65`, `DeviceVersion.kt:18,45,78` |
| Device info/version | 0x0107 fields: 1 btVersion, 2 deviceType, 3 deviceVersion, 7 soft version, 9 SN, 10 deviceMode, 12 **deviceName**, 15 OTA package, 20 OTA area type, 21 hilinkId, 22 **deviceBtMode**, 25 subProdId, 27 sportVersion, 32 country, 33 EMUI, 34 multiLinkBleMac, 35 field list, 36-41 extended, 42-45 OS/API/ABI [V] `ckq.java:139-298` | Implemented but **mis-mapped**: 12→battery, 22→capability bitmap, 20→product model [V] `DeviceVersion.kt:14-20,44-48,73-81`; 0x0107 has neither battery nor capability bitmap [V] |
| Live HR | Service 23 cmd 18 open/close report (`01 01 <op>`), notifications cmd 3 with TLV 4 = HR; tags 3 speed, 6 calories, 7 distance [V] `com/huawei/hwdevice/phoneprocess/mgr/heartrate/HwHeartRateManager.java:248-271`, `com/huawei/hwdevice/phoneprocess/mgr/exercise/HwWorkoutServiceManager.java:386-425`. Continuous samples: service 7 cmd 10 count / cmd 11 frames [V] `lxw.java:154-179` | **Missing**: no `LIVE_HEART_RATE`; service 23/7 traffic only raw-routed [V] `HuaweiSession.kt:54-65`, `WatchInitiatedRouter.kt:56-76` |
| Today/history | Service 7 cmd 3 totals; cmd 4 count → 5/8 frames; cmd 10/11 samples; cmd 12/13 status [V] `lxw.java:93-206` | Requests implemented, responses opaque `RawPayload`; no typed decoding [V] `HuaweiSession.kt:99-126` |

## 4. Robustness behaviours worth copying

1. **Layered deadlines**: 8 s GATT connect, 7 s discovery (+2 retries), 1.5 s write ack, 10 s/3-send handshake timer, 30 s/3-send for 0x010E/0x0128, 60 s whole-handshake watchdog [V] `cld.java:264-266`, `com/huawei/devicesdk/connect/physical/PhysicalLayerBase.java:154-178`, `cnx.java:437-540`, `cnf.java:631-662`. Our transport has only 10 s × 3 per request [V] `HuaweiTransport.kt:51-58,117-139`.
2. **Key-miss auto-repair**: TLV 9 = 2 while bonded → unpair, status 56, reconnect flagged for re-pairing [V] `ckv.java:101-120`, `cnf.java:606-622`.
3. **133/backoff**: three immediate 133 retries, then 300 s reconnect delay; 304 (GATT timeout) takes the default fast-reconnect path [V] `cld.java:687-728`, `cno.java:292-301`.
4. **Serialized, acknowledged writes**: lock + 1.5 s condition wait; per-chunk retry delays 100 ms then 300 ms; on failure remaining chunks are dropped and the upper layer notified [V] `cld.java:344-389,405-451,498-507`.
5. **Two-stage slicing + pacing**: frames are `5A | len u16 BE | flag | [slice index] | serviceId | commandId | TLV... | CRC16/XMODEM`, cut at maxFrame then at singleFrame; the negotiated interval follows the last chunk of each frame; TLV lengths are base-128 varint and tags ≥0x80 are nested; reassembly is capped at 102 400 bytes [V] `coa.java:25-101,105-167,692-698`, `cnz.java:57-95`, `defpackage/cov.java:8-22`, `defpackage/cph.java:128-149`.
6. **Per-device priority queue**: `PriorityBlockingQueue(10000)` ordered by priority then FIFO, one sender thread per MAC, 60 s wake lock; an externally triggered slow mode adds 500 ms/command and 20 ms/package; file-transfer types 2/6 get priority 0 [V] `cls.java:34-160`, `com/huawei/devicesdk/connect/retry/CommandSlowManager.java:31-47,110-160`, `.../CommandPriorAdapter.java:20-24`.
7. **Time echo verification**: 0x0105 and 0x0132 compare the watch’s echoed epoch and resend once on ≥1 s drift (0x0105 retries with network time) [V] `ckz.java:103-117`, `ckw.java:105-121`.
8. **Environment-aware reconnect**: 4 s → 64/256 s backoff, 30 min reset, Bluetooth-on and app-foreground triggers, exact-and-allow-while-idle alarms [V] `cns.java:15-54`, `cno.java:62-126`, `cnr.java:341-417`.
9. **Uniform error taxonomy**: `cpi.c(category,subcode)` = category×10000+subcode (10304, 20304, 50306, 60133, 70303); handshake commands return 501xx codes; 0x7F TLV value 100000 = success [V] `defpackage/cpi.java:1-11`, `cku.java:30-67`, `ckd.java:85-150`.

## 5. Gaps and next RE steps

| Gap | Evidence path | What is needed |
|---|---|---|
| No production authenticator; real watch always throws `UnsupportedDeviceException` | `HuaweiSession.kt:165-166,191-199`, `di/HuaweiDriverModule.kt`, D-301 | Source: flows yes, secrets/native no (CAK white-box `HealthWhiteBoxManager`, `libhichain_sdk_jni.so` absent). Not solvable by RE; authorized SDK or Health Connect |
| 0x0107 semantics wrong in driver and `version_tlv_types.md` (12 = deviceName, 22 = deviceBtMode, no battery/capability bitmap) | `ckq.java:227-281` vs `DeviceVersion.kt:44-81` | Source: yes. Remap fields (model from type 10 [I]); stop using 0x0107 for battery/capability. No capture |
| 0x0132 request wrong and sent out of order; “50-byte TLV 1” is the `01 32` header | `ckw.java:30-133`, `cku.java:154-225` | Source: yes. Rebuild TLV 1/4 epoch + TLV 2/2 zone + TLV 3 IANA; move after 0103/013C; add echo/resend |
| Battery op missing; driver battery source bogus | `mev.java:155-179`, `mer.java:240-346` | Source: yes both directions; validate protocol-0 byte 14 and earbud TLVs on a real watch |
| Live HR missing (service 23 cmd 18 + notify cmd 3 TLV 4) | `com/huawei/hwdevice/phoneprocess/mgr/heartrate/HwHeartRateManager.java:248-271`, `com/huawei/hwdevice/phoneprocess/mgr/exercise/HwWorkoutServiceManager.java:386-425` | Source: yes request/notification; real-watch capture for nesting, operator values, intervals |
| 0x0103 response known but unparsed; capability mapping needs `cor.d`/`cle` semantics | `cki.java:165-249`, `cle.java:33-60` | Source: yes. Parse nested TLV 2 = service, 4 = ASCII hex vector; port command map/capability keys |
| 0x0137/0x013C/0x0112/OOBE (0130/0131/2601/1A05/1A06) unimplemented | `ckk.java:13-78`, `ckl.java:255-294`, `cko.java:22-68`, `cnx.java:51-59` | Source: partial. Determine which steps a third-party connection needs; real-watch capture |
| TLV 9 bond requirement ignored by fixed `LinkRequirements(bond=true)` | `ckv.java:101-121`, `coi.java:576-605`, `HuaweiDriver.kt:83` | Source: yes. Gate bonding on TLV 9; keep key-miss re-pair recovery |
| 60 s handshake deadline, 30 s auth timers, 133 retry/backoff absent | `cnf.java:631-662`, `cnx.java:464-540`, `cld.java:687-728` | Source: yes. Add whole-open deadline and 133/backoff policy; device tests |
| Service-7 response bodies (counts, frames 5/8/11/13) undecoded | `lxw.java:93-206`, protocol doc §7/§11.6 | Source: no (parser missing/obfuscated). HCI snoop capture while Health syncs |
| Watch-initiated ACK expectation unknown; router stores raw only | `WatchInitiatedRouter.kt:11-23`, `coa.java:675-721` | Source: partial. Capture HR alert/file request to see whether an ACK is required |
| BR/dual-channel path (0x013C, 0x012D, SPP) not implemented; driver is BLE-only | `cli.java`, `ckl.java`, `clb.java` | Source: yes transport; verify on a BR-only model |
