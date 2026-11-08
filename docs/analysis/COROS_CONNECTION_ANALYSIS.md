# COROS connection/session analysis — 4.11.8 (shell-blocked evidence)

Scope: `com.yf.smart.coros.dist` 4.11.8 (`rea-output/coros/coros-4.11.8.apk`). The real DEX is stripped from `classes.dex` (30 shell classes), so there are **no method bodies, byte layouts or
numeric command IDs**. Tags: **[V]** = literal string/class in `rea-output/coros/strings_classes.txt` or repo code; **[I]** = inference; **[uncertain]** = weak/conflicting. Line numbers are from
that dump; curated evidence is in `unified_health_app/docs/re-evidence/coros/*.md`; prior analysis is cited as "protocol doc" (`unified_health_app/docs/protocols/COROS_DEVICE_PROTOCOL.md`).

## 1. Connection lifecycle (best reconstruction)

Only state *names* are verified; arrows/order are inference. The GATT session machine has surviving `toString()` names: `OpenFreshGatt(gattRef=…)`, `Connecting(gattRef=…)`,
`DiscoverServices(gattRef=…)` / `DiscoveringServices(gattRef=…)`, `InitializeProtocol(gattRef=…)` / `InitializingProtocol(gattRef=…)`, `Ready(gattRef=…)`, `PrepareServiceRediscovery(gattRef=…)`
(445213, 432611, 433849-433850, 435028-435029, 446069, 445736) **[V names]**. Recovery-layer names: `AttemptProtocol(token=…)`, `ProtocolAttemptToken(connectorInstanceId=…)`,
`DeviceInfoReadCandidate(attemptToken=…)`, `GattRef(token=…)`, `GattStateChanged(token=…)`, `InternalGattPhysicalFailure(token=…)`, `ConnectionRequested(reason=…)`,
`ConnectionSession(deviceKey=…)`, `ConnectionTransition(session=…)`, `Available(cooldownUntilElapsedMs=…)`, `ProbingPresence(pulseId=…)`, `Probe(result=…)`, `Recovering(step=…)` (430976, 445844,
433795, 434619-434620, 435053, 432613-432615, 430985, 445744-445745, 446084) **[V names]**.

**1.1 Scan/name match. [V/I]** Scanner classes `com.yf.lib.bluetooth.scanner.BleAdvertisedData` (+`$a/$b`) and `ScannedDevice`; Android `ScanFilter`/`ScanSettings`/`ScanRecord` also referenced
**[V]**. Per-model prefixes look server-config driven: `DeviceConfigInfo.proto` has `ble_name_prefix`, plus `BleNamePrefix`, `fromDeviceNamePrefix`, `getDevicePrefixes` (427420-427535, 431609,
458744, 460077-460084) **[V names]**. A static model list also exists (431997-432066; `docs/re-evidence/coros/device-names.md`) **[V]**, and `YfBtDeviceType(_models=…)` maps models to a type
**[V]**. Scan end: `BluetoothFoundReceiver.stopScanningRunnable, ACTION_DISCOVERY_FINISHED` (431620) and `device discovery timeout: targetType=` (40997) **[V]**. Exact predicate, service-UUID
filtering and manufacturer-data use are unverified **[uncertain]**; no COROS company ID was found (protocol doc §2.2).

**1.2 `connectGatt`. [V/I]** `connectGatt` (456369), `connectGatt failed
token=` (193046), `connectRemoteFailed`, `open connection failed.`, and class `BleConnectionCompat` (431608) **[V]**. That class is the AOSP-style `connectGatt(..., TRANSPORT_LE)` wrapper, so LE
transport and `autoConnect=false` are likely but indirect **[I, medium]**; the actual arguments are not recoverable **[uncertain]**.

**1.3 Service discovery. [V]** `discoverServices`,
`onServicesDiscovered`, `cannot find service`, `cannot find descriptor of`, `enable notification error`, `write descriptor error` (428210, 470592-470597) **[V]**; discovery precedes
`InitializeProtocol` in the state names.

**1.4 OS bond vs protocol handshake — order unknown.** OS SMP is used: `ACTION_BOND_STATE_CHANGED device:` / `… with no EXTRA_DEVICE` (430428-430429), framework `android.bluetooth.device.action.
BOND_STATE_CHANGED`, `…PAIRING_REQUEST`, `EXTRA_PAIRING_VARIANT`, and `createBond`, `removeBond`, `cancelBondProcess`, `cancelPairingUserInput` (452978-452985, 456681, 471887, 454409, 454412)
**[V]**. Pairing is queued: `BluetoothPairingRequest` + `processNextDevice`, `PairingRequestData(device=…)`, `PairingTask(device=…)`, `pairingTimeout=`, `pairingVariant=`, `waitPairingCount=`
(441421-441423, 445612-445613, 429494-429495, 524831) **[V names]**; `maxNotPairBspVersion disable pairing` is a firmware-version gate (560212) **[V, semantics I]**. Bond errors: `BOND_BY_OTHER`,
`BOND_CONFLICT`, `BOND_COUNT`, `BOUND_ADDRESS_MISSING_OR_MALFORMED` (431172-431186) **[V names]**. Protocol-level call points: `YfBtSystemBond`, `YfBtSystemBondAuth`, `YfBtParamSystemBond`,
`YfBtResultSystemBond`, `YfBtSystemBondPod2`, `YfBtAuth`, `YfBtAuthState`, `YfBtParamAuth`, `SystemBindHelper`, `DeviceBindState` (441378-441380, 441350-441351, 441091, 441222, 447960, 441278)
**[V names]**; `createSystemBond error-only response, errorCode=0x%02X, data=%s` (112630), `is busy, finishedBondCmd=false` (428159) **[V]**, `CONNECT_BOND` (431958), and serialized command names
`REMOVE_BOND` ("Command sent successfully:REMOVE_BOND", "Framework rejected command immediately:REMOVE_BOND"; 432580, 434512) **[V]**. **Order is genuinely unknown** **[uncertain]**:
`finishedBondCmd` implies a bond command runs in the transaction queue after protocol is up **[I, medium]**, while OS SMP may be triggered earlier by an encrypted attribute access **[I]**.
`needAuth`, `onAuthFinish, errCode=` are call points only; no crypto is analyzed here (protocol doc §5).

**1.5 Protocol version selection (v1/v2). [V names, I mechanism]** Four names survive: `YfBtProtocolV0`, `YfBtProtocolV1`, `YfBtProtocolV2`, `YfBtProtocolV3` (450856-450860) **[V]**. Only
`protocol/version2` survives in full (`GattCallbackV2`, `YfBtProtocolV2`, `GattWriteRecoveryPolicy`, `DeviceWriteScheduler`); version0/1 retain only exceptions (440715-440719, 440728-440734)
**[V]**. Supporting names: `YfBtProtocolUtil`, `protocolSelected`, `onDeviceProtocolCheck`, `protocolVersion`, `protocolConfig`, `supportProtocolVersion`, `convertV0toV2`, `convertV2toV0`,
`device protocol version ` (450856, 565381, 470412, 471470-471473, 476868, 456553-456554, 457333) **[V]**. Best reading: after discovery + `DeviceInfoReadCandidate`, the app reads a
device-reported version/capability and selects a V0–V3 implementation, with V2↔V0 adapters; the exact rule is unrecoverable **[I/uncertain]**. The later old/new daily branch ("is old protocol" /
"is new protocol! prepare to getDynamicHeartRate", 459878-459879) is a separate behavioral branch **[V]**, not necessarily the same selector.

**1.6 Command layer. [V architecture, uncertain bytes]** Transport is a virtual socket: `BLEClientSocket`, `BLEClientSocketManager`, `BLESocketTransaction`, `BLEClientSocketProxy`,
`SocketInfo$startReading`, `resolveHostAddress`, `socketId=` logs, and the guard `Device already has socket connection, closing old one` (431145-431149, 441411-441412, 433768, 456380) **[V]**;
one socket per device at a time **[V log, I semantics]**. UUID roles are split between command and data: `cmdSendUuid`, `cmdReceiveUuid`, `dataSendUuid`, `dataReceiveUuid`, `dfuServiceUuid`,
`transferServiceUuid` (455850-455852, 456967-456976, 457405, 477776) **[V]**, implying at least two logical channels (cmd + data) each with TX/RX plus a separate DFU service; the curated
"3-characteristic service" model in protocol doc §3.2 is probably incomplete **[I/uncertain]**. Envelope is Protobuf-lite `BleCmdPb`: `MasterSend{send_list}` / `MasterSendCmd{extra_data}`
(phone→watch), `SlaveAck{ack_list}` / `SlaveAckCmd{protocol_ret, extra_data}`, `SlaveNotify{notify_list}` / `SlaveNotifyCmd{extra_data}` (425620-425637) **[V field names]**. `ble_cmd_def.proto`,
`BleCmdDefPb$CMD_E`, `CMD_FIELD_NUMBER`, `CMD_INVALID`/`CMD_INVALID_VALUE` confirm a numeric `cmd` enum (426533-426537, 431845-431847) **[V]**, but **no numeric CMD values are readable**
**[absence]**. `ACK_HEADER_SIZE`, `ACK_MIN_SIZE`, `ACK_SIZE`, `ACK_TYPE_OFFSET`, `ACK_OPS_OFFSET` exist (430422-430427) **[V names]**, values unknown **[uncertain]**. Dispatch/buffering:
`GattCallbackV2$DeviceWriteScheduler`, `$notificationBuffer$1/$2`, `ReceivedNotification(gatt=…)`, `dispatchNotification` (440720-440730, 446077, 457465-457466) **[V]**.

**1.7 Ready. [V]** `Ready(gattRef=…)` (446069), analytics `ble_ready` (454024); then app-level `DeviceBindState` / `YfBtResultConfigCoros{bindState=…}` become meaningful **[I]**.

## 2. Context holding / session state

**Per-device context.** `YfBtDeviceContext{yfBtGattProtocol=…}` (450824) holds the protocol instance; fields `protocolCallback`, `protocolChecker`, `protocolConfig`, `protocolGattCallback`,
`protocolVersion`, `protocolRet_` (471468-471473) **[V names; association I]**; `loadInfo`/`saveInfo` coroutines (440617-440618) imply per-device persistence **[I]**. Stack: `YfBtConnectManager`,
`YfBtConnector`, `YfBtManager`, `YfBtDevice`, `YfBtDeviceInfoLoader` (450818-450825) **[V]**; `initBtConnectManager` (554803) **[V]**.

**`bt_cache` (Room). [V schema; I semantics]** Exact DDL (432092): `bt_cache(deviceKey TEXT, cacheKey TEXT, extraCacheParam TEXT, cmd INTEGER, dataIndex INTEGER, dataGroup TEXT, stopCode INTEGER,
receivedCmdBytes BLOB, receivedDataBytes BLOB, cacheTtlMs INTEGER, timestamp INTEGER, deviceVersion TEXT, appVersion TEXT, PRIMARY KEY(deviceKey, cacheKey))`. `cmd` = command id;
`dataIndex`/`dataGroup` = page index/group of a multi-part response; `stopCode` = terminal transaction code; `receivedCmdBytes` = request echo/correlation; `receivedDataBytes` = payload;
`cacheTtlMs` = TTL. Cache-hit/transfer logs `onCacheHit dataIndex:0x…`, `onStart dataIndex:`, `onStop dataIndex:`, `onStop stopCode:=` (470359-470361, 470610-470622) **[V]** confirm paged resume.
Invalidation SQL (433589-433595) **[V]**: delete expired (`timestamp + cacheTtlMs < now`), delete all when `appVersion` changes, delete all for a `deviceKey`, delete where `deviceVersion` differs
— so app or firmware upgrades flush the cache. Types `BtCacheDatabase`, `CacheType`, `PersistentCacheStorage` (440635-440641) **[V]**.

**Paged/cached sync state. [V field names, I semantics]** `syn_info.proto` (425660-425744): `SynBlockHeader{start_utc, sport_type, random_flag, device_type, block_exsit, device_id, block_id,
block_crc32, block_size, file_type, file_index, file_name}`; `SynRecordInfo{remain_size, header}`; `SynFileInfo{file_type, file_total_size, file_id_arr}`; `LastSyncHeader{firmware_type,
device_id, header map, force_override_mark}`; `ForceOverrideMark{file_index, force_key, device_id, firmware_type}`; `UserSyncHeader{last_sync_header}`; `SynStopType{NORMAL, INTERRUPT, ERROR,
UI}`; `SynStatsBatteryDaily`. Reading: sync is named files (`SYN_FILE_TYPE_DAILY_RECORD/SPORT/SYSINFO_RECORD/SYSLOG_RECORD/VOICE_NOTE…`) transferred as size/CRC-tagged blocks with an existence
map (`block_exsit`) and per-block CRC32, allowing skip/resume and forced override. App-level `SyncHeaderCachePolicy(validDurationMillis=…)`, `SyncDataCache`, `SyncDataTransaction`, `SyncHeader`,
`SyncMtd` (104824, 447945-447958) **[V names]**. Block logs: `blockRemainingBytes=`, `next block header`, `current block header`, `after sending a block successfully, file remaining:`, `detect
crc, skip one block, file remaining:`, `after sending a block crc error, blockRetryCount:` (429416, 452859-452860, 457324, 77974, 456838) **[V]**.

**Bond/bind state. [V names]** Two layers: OS bond (above) and app-level bind (`DeviceBindState`, `YfBtResultConfigCoros{bindState=…}`, `watch bond state=`, `pod bond state=`,
`saveWatchBondResult unknown bind state=`, `savePodBondResult unknown bind state=`; 441278, 450862, 478457, 471195, 472707, 58220). `sync_bond_count` is a `DeviceFunctionInfo` capability (427438)
and `SyncBondCount` a message (447945) **[V]**; `bond_count` is a `userdata.proto` `DeviceInfo` field for bonded peripherals (426575, 427405-427420) **[V]** — bond count refers to the watch's
sensor peripherals, not the phone. No session key/ECDH evidence was found **[absence]**; link security is OS-bond-dependent **[I]**; YfBt*Auth classes are call points only.

**Protocol version per device.** `protocolSelected`, `protocolVersion`, `protocolConfig` plus `YfBtDeviceContext.loadInfo/saveInfo` suggest the chosen version is held/persisted with the device
context **[I/uncertain]**; `supportProtocolVersion` (476868) looks like the device-reported input **[I, medium]**, but no enum/field value is readable. **Reconnect. [V names; uncertain timing]**
Evidence: `ConnectionRequested(reason=)`, `ConnectionSession(deviceKey=)`, `ConnectionTransition(session=)`, `Available(cooldownUntilElapsedMs=)`, `ProbingPresence(pulseId=)`, `Probe(result=)`,
`Recovering(step=)`, `reconnectAttempts=`, `connectCount=`, `physicalConnectFailureCount=` (432613-432615, 430985, 445744-445745, 446084, 525300, 428863, 429518) **[V]**, plus
`YfBtConnectionState` values `CONNECT_STATE_{CONNECTED,CONNECTING,DISCONNECTED,DISCONNECTING,SUSPENDED}` (10353-10357) **[V names; association I]**. Write-path failures trigger reconnect:
`bt_write_callback_order_invalid reconnect ch=`, `bt_write_callback_status_non_success reconnect id=`, `bt_write_callback_stuck_global reconnect device=` (454139-454143) **[V]**. Backoff
schedule/connect timeout/retry count are unrecoverable **[uncertain]**; no keepalive/watchdog strings were found (not proof of absence).

**Multi-device.** Server config `DeviceConnectConfig{support_device_list, max_connect_count}` and `SelectDeviceList{device_type_list}` (427526-427531) **[V]**; `connected devices:` /
`connectedDevices error` (456378-456379) **[V]**; `LiveTrackMultiDeviceHandoffUseCase` (606760) **[V]**. Everything is keyed by `deviceKey` (cache PK, sessions, logs) **[V]**. Simultaneous links
are supported up to a server limit **[I, medium]**; arbitration policy is not visible.

## 3. Basic operations after connect

**Driver (repo, [V code]).** `CorosDriver.kt`: recognize by `VENDOR_SERVICES` or prefix `COROS`; `LinkRequirements(bond = true, mtu = 247)` (both unverified; D-104/D-105). `CorosSession.kt`:
`readDeviceInfo()` → `StandardGattReader.readDeviceInfo` (DIS `0x180A` model/firmware/serial + battery percent from `0x180F/0x2A19`); subscribes to `0x2A37` when present, buffers 10,000 samples
and serves them on `sync`; advertises `BATTERY_LEVEL`, and `LIVE_HEART_RATE` + `HISTORY_SYNC` whenever `0x2A37` exists. `HISTORY_SYNC` overstates the implementation — `sync()` only drains the
live-HR buffer **[V code]**. `CorosUuids.kt` lists weloop NUS, standard NUS, ADF7 and Nordic DFU but assigns no RX/TX roles. Missing entirely: vendor time sync, daily/history (steps, sleep, SpO2,
HRV, stress), workouts/FIT, vendor battery/charging, vendor device info/config, DFU.

**Standard GATT in the app.** `0000180a`, `0000180f`, `00002a19`, `0000180d`, `00002a37`, `00002a2b` all appear (430235-430260) **[V]**, but that only proves the shared library knows them, not
that GPS watches expose them (protocol doc §3.1, open issue #7) **[uncertain]**. Battery is partly vendor-side: `GET_BATTERY_LEVEL`, `GET_CHARGING_STATE`, `BatteryStatus`,
`RequestBatteryStatusInteractiveDataParam`, `Read battery power call back success`, `Receive charging state change`, `Error getting device charging state` (434540-434541, 441014, 446065-446073,
83041) **[V]**. Device info: `device info read status != GATT_SUCCESS`, `onGetProductName`, `getDeviceNamePrefix :`, `YfBtDeviceInfoLoader` (457330, 470433, 460077, 450825) **[V]**.

**Vendor operations present in the app but absent from the driver. [V names]** Time sync: `YfBtParamTime` (441098), `SyncTimeTrancation` (typo, 447958), `SYNC_TIME`,
`SWITCH_TIME_SYNC_AUTO_FIELD_NUMBER` (447111, 500790); no evidence the GPS watch uses SIG `2A2B` **[uncertain]**, protocol doc §6.7 expects the vendor command. History: `GET_DAILY_DATA`,
`GET_SPORT_DATA`, `GET_SPORT_SUM`, `GET_DEVICE_FILE`, `GET_DEVICE_STORAGE_FILE`, `GET_DEVICE_LOG` (434540-434550); `getDailyData`, `getSleepData`, `getHrvStatus`, `getHrvsCount`,
`getDynamicHeartRate`, `getStartTime` (459873-460224, 118237). Embedded sample confirms daily fields `br, hr, hrRest, hrvValue, spo2, stress, stressLevel` per `happenDay` (133145) **[V sample]**.
Live HR over vendor: `HRM_BROADCAST`/`HRM_BROADCAST_VALUE`, `BleCmdPayloadPb$HrmBroadcastSwitch`, `HrSample`, `HeartRateBroadcastRequest` (434754, 438994-439001) **[V]**; main watches likely use
this instead of `0x2A37` **[I, medium]**. File/workout: `YfBtGetFileRequest`, `YfBtSendFileRequest`, `FileHeaderStruct`, `GetDeviceFileResult(count=…)`, `SendFileTransaction stopCode=`,
`Successful File Transfer Validation!` (440939-440990, 447257, 447813-447814); FIT/TCX (`CREATE_SPORT_DATA_FILE_TYPE_FIT/TCX`, 432099-432100). OTA: `DFU Service found!`, `DfuManager`, `StartDFU`,
`TO_DFU_MODE`, `C_DFU_CONTROL_POINT`, `C_DFU_PACKET`, `successfully written startDFU and now writing file size` (433644, 433836, 446076, 448134, 476793, 477523, 526872-526873) **[V]**.

## 4. Robustness behaviors worth copying

1. **Global GATT write serializer + callback validation.** `GattCallbackV2$DeviceWriteScheduler`, `GattSubmitException`, `GattWriteRecoveryPolicy`; telemetry `bt_write_before_global`,
`bt_write_enqueue_global`, `bt_write_busy_retry_global`, `bt_write_send_timeout`, `bt_write_submit_exception`, `bt_write_submit_false_global`, `bt_write_callback_global`,
`bt_write_callback_order_invalid reconnect`, `bt_write_callback_status_non_success reconnect`, `bt_write_callback_stuck_global reconnect`, `bt_write_callback_slow_global`,
`bt_write_callback_stale ignored`, `bt_write_callback_after_stop ignored`, `bt_write_data_expired` (454124-454155) **[V names, I semantics]**. Pattern: one in-flight write, ids/order enforced,
stale/after-stop callbacks ignored, stuck/slow/out-of-order → reconnect. Most copyable piece.

2. **Write-window adaptation. [V names, weak]** `bt_write_window_init/downgrade/restore`,
`gatt_write_window_stable generation=`, `gatt_write_window_unstable reason=` (454150-454152, 458800-458801) — throughput window widened/narrowed by callback stability; algorithm unknown.

3. **GATT generation/token guarding. [V]** `GattRef(token=…)`, `GattStateChanged(token=…)`, `oldGattRef=`, `currentGattHash=`, `gatt_callback_rejected gattId=`, `gatt_not_registered` (434619-434620,
429446, 428895, 458798-458799) — stale callbacks from a closed GATT are rejected rather than corrupting the new session. Copy this.

4. **Service-cache recovery. [V]**
`PrepareServiceRediscovery(gattRef=…)`, `refresh GATT before close token=`, `refreshGatt error`, `OpenFreshGatt while another GATT is active` (445736, 57172, 471800, 445212): calls hidden
`BluetoothGatt.refresh()` before close and refuses a second fresh GATT. Copy the guard; `refresh()` is a known Android workaround **[I]**.

5. **Block-level retry/CRC. [V strings; I meaning]**
`send data timeout, blockRetryCount=` (58502), `after sending a block crc error, blockRetryCount:` (452859), `blockRetry =` (454039), `mTimeoutChecker transfer timeout!!!` (629028), `transher
timeout` (477778, likely "transfer"), and `configuredDelayMs=3000, retryCountRemaining=` (112318). Reading: per-block CRC, bounded retry with a 3 s delay; the 3 s string is not provably BLE
**[uncertain]**. No connection-level backoff curve.

6. **MTU. [V observation; uncertain value]** `onMtuChanged mtu=` (470479), `, mtu=` (429400), `ble_mtu` (454022) prove an MTU exchange happens
(the callback only fires after one) **[I]**; the requested value is unrecoverable and `requestMtu` never appears **[absence]**. Driver's 247 is unverified.

7. **Pairing serialization. [V]**
`BluetoothPairingRequest.processNextDevice` + `PairingTask` + `waitPairingCount` suggest queued pairing with PIN/passkey variants and a timeout; copy queueing, not the exact policy **[I]**.

8. **Evidence correction. [V adjacency; uncertain, strong]** Protocol doc §6.6 and `native-lib-analysis.md` §5 cite `PACTYP_CRC16`/`PACTYP_CRC32` as BLE frame types, but they sit in the Opus audio
packet-type enum beside `PACTYP_AUDIOSCENEINFO`, `PACTYP_LOUDNESS`, `PACTYP_MPEGH3DACFG` (248992-249012) — that citation is likely wrong. Genuine BLE CRC evidence remains `CRC16_FIELD_NUMBER`,
`CRC_FIELD_NUMBER`, `BLOCK_CRC32_FIELD_NUMBER`, `block_crc32`, `crc16=`, `check Sum Crc indexArea =` (432090-432091, 431159, 425680, 428890) **[V]**.

## 5. Gaps + concrete unblock plan

| # | Gap | Why blocked | Cheapest unblock |
|---|-----|-------------|------------------|
| 1 | Which UUID family/model is used; which characteristic is RX vs TX | Shell hides `discoverServices` mapping; no device | nRF Connect GATT dump of the user's watch (minutes); then HCI log to confirm ATT handles |
| 2 | Numeric `BleCmdDefPb$CMD_E` values | R8/bytecode enum values, no method bodies | HCI snoop log of one official-app daily sync; decode `MasterSend` with `protoc --decode_raw` |
| 3 | Outer frame (length/flags, CRC16 vs CRC32, real ACK offsets) | Values in bytecode; only constant names survive | Same HCI log; first 4–8 bytes of each write/notify |
| 4 | Bond vs handshake order; what `YfBtSystemBondAuth` sends | No call graph; `createSystemBond` response is error-only | HCI log of first-time pairing; order SMP events vs ATT writes |
| 5 | Protocol version selection rule (V0–V3, `protocolSelected`) | Selector body stripped | HCI log + compare device-info/config exchanges; non-shelled older APK as fallback |
| 6 | MTU requested value | `requestMtu` string absent; only `onMtuChanged` | HCI log `ATT_EXCHANGE_MTU_REQ` |
| 7 | History paging (`dataIndex`, `dataGroup`, `block_exsit`, next-block request) | `bt_cache` schema known, protocol bytes unknown | HCI log of a multi-page daily sync; correlate with `bt_cache` rows |
| 8 | `c7be000x` UUID family role | No surrounding keywords; may be non-BLE | GATT dump + non-shelled APK; drop if it never appears |
| 9 | Whether GPS watches expose SIG `180D`/`2A37` | Only a shared UUID table exists | nRF Connect service dump (same as #1) |
| 10 | Partner SDK AIDL acceptance/auth path | Needs registered partner + grant; not BLE RE | Official COROS Partner SDK registration (only if the product chooses that route; D-106) |

**Single cheapest high-value step:** capture one **Bluetooth HCI snoop log** while the official COROS app pairs and syncs once with the user's watch (`adb bugreport` → `btsnoop_hci.log` →
Wireshark, filter `btatt`). It converts gaps 1–7 and 9 from [I]/[uncertain] to [V] without unpacking the shell; use nRF Connect beforehand only for a quick service/characteristic map. Command
bodies and native parser internals are unnecessary for the connection/session layer.
