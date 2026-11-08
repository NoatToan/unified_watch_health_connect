# Samsung Health 7.1.2.001 — watch connection analysis

Status: 2026-11-08. Source: `docs/re-analysis/rea-output/samsung/` (rea 6.8.0 + jadx 0.7.1).
APK: `com.sec.android.app.shealth` 7.1.2.001 (7012001), SHA-256
`05edd28534000aafa20693bf72503ce30b0831c822a1b7acac11093e8d651ebb`, 68,567 classes, 9 dex.
Tags: [V] verified in decompiled code/manifest, [I] inferred, [Ext] public platform behaviour.

## 0. TL;DR

Samsung Health does **not** open a vendor BLE/GATT link to the watch itself and does **not** bundle the
classic Samsung Accessory Protocol (`SAAgent`/`SASocket`/`SAPService` — 0 classes) [V]. It uses two
modern paths, and delegates discovery/pairing to the platform:

| Watch family | Path | Pairing/discovery owner |
|---|---|---|
| Galaxy Watch 4/5/6/7 (Wear OS) | **Wear OS Data Layer** (`WearOsListenerService`, DataClient/MessageClient/Channel/Capability) | Wear OS / Google Play Services + Watch Manager |
| Galaxy/Tizen watches (Gear S2/S3, Watch/Active, Watch3) | **Samsung HealthConnectivity + WearableComm** (`IWearableHealth` binder, LocalSocket, MCF provider) | Samsung MCF / Galaxy Wearable / Watch Manager |
| Fitness sensors (chest straps, power meters, scales) | RFCOMM/SPP + BLE GATT (`sensor.sdk.fitness.*`) | The app itself |

Consequence for Unified Health: **there is no Samsung BLE driver to write** in the Garmin/Zepp sense.
The usable integrations are (a) Health Connect import (Samsung Health exports there on supported
devices) and (b) our own Wear OS companion app using Wear Health Services + Data Layer. The Samsung
private socket/MCF/binder paths are signature/privilege gated.

## 1. Discovery and pairing

### 1.1 Wear OS watches

`com.samsung.android.app.shealth.wearable.service.WearOsListenerService` extends
`WearableListenerService` (manifest: exported, process `:remote`) and implements
`onDataChanged`, `onMessageReceived`, `onChannelOpened/Closed`, `onInputClosed`, `onOutputClosed`,
`onPeerConnected/Disconnected`, `onCapabilityChanged`, `onConnectedNodes` [V].

Manifest filters:

- `com.google.android.gms.wearable.DATA_CHANGED`, scheme `wear`, pathPrefixes
  `/samsung_health/wearable_message/wearable_to_mobile` and
  `/samsung_health/capability/wearable_to_mobile`
- `MESSAGE_RECEIVED`, `CHANNEL_EVENT`, pathPrefix `/samsung_health/`
- `CAPABILITY_CHANGED`

Data contract from `onDataChanged` [V]: DataMap keys `data_payload_key`, `data_asset_key`,
`is_support_data_asset_key`, `data_time_key`; large payloads arrive as Wear `Asset` and are decoded
with `nmd.b(context).a(asset)`; text messages are dispatched to `WearOsClientManager` as UTF-8
JSON/text (`b.i.a(nodeId, path, data)`).

Pairing itself is not in this app: node connection and capability are reported by Play Services.

### 1.2 Galaxy/Tizen watches (Samsung proprietary stack)

Discovery and pairing are delegated to MCF / Watch Manager:

- `com.samsung.android.app.shealth.sensor.sdk.fitness.mcf.McfMsgContentProvider` — **exported**
  ContentProvider, authority `com.samsung.android.app.shealth.sensor.sdk.fitness.mcf`, guarded by
  `com.samsung.android.mcfds.permission.ACCESS_SERVICE`, process `:remote` [V manifest].
  Request surface includes `handleForActivateMcfFeature`, `handleForGetConnectedWatch`,
  `handleTriggerSync`, `requestToActivateBtDiscoveryModeForWatch`,
  `requestWearableMessage(WithResponse)` [V].
- `McfSimpleMessageManager` builds outbound MCF messages and `METHOD_GET_NEARBY_DEVICES` [V].
- Manifest `<queries>` references `com.samsung.android.mcfds`, `com.samsung.android.app.watchmanager`,
  `com.samsung.android.app.watchmanager2`, `com.samsung.android.wms` [V].
- Exported legacy receivers still exist: `WearableSyncReceiver` (WINGTIP/GEAR2/GEAR/SBAND sync actions)
  and `WearableMessageReceiver` (`REMOTE_REQ_NONCE`, `REMOTE_ERROR`) [V manifest].

There is no `SAAgent`/`SASocket`/`SAPService` class and no `com.samsung.android.sdk.accessory` package
in this APK [V]. The `com.sec.spp.permission.*` entries are Samsung Push Service (SPP), not Bluetooth
Serial Port Profile.

## 2. Transport

### 2.1 Wear OS Data Layer

Standard Play Services Wearable client library (`com.google.android.gms.wearable`, 214 classes) [V].
Data, messages, channels and capabilities flow through the paths above. There is no Samsung payload
cipher in this path; security is the Wear OS node/capability model plus the OS/Play Services transport
[I].

### 2.2 Samsung WearableComm (LocalSocket)

Entry points and mechanics [V unless noted]:

- `WearableMessageLibCommunicator.sendData` serialises a `WearableMessageLibHeader` with Gson to UTF-8
  and calls `WearableMessageLibSocketManager.wearableSocketInit`.
- `WearableMessageLibSocketManager` owns `mGearByteDataQueue`, socket init, `transferData`, timers.
  If `WearableMessageLibVariables.getNonceNumber() == 0`, it calls
  `WearableMessageLibBroadcastManager.requestNonce()`; otherwise it opens the socket.
- `requestNonce()` broadcasts `WearableConstants.Message.TYPE_REQ_NONCE_PROVIDER` with
  `EXTRA_DEVICE_TYPE` (throttled to one per 500 ms).
- `WearableMessageReceiver.onReceive` handles `REMOTE_REQ_NONCE`, resolves the device type and calls
  the nonce provider; `REMOTE_ERROR` rebuilds a `WearableMessageData` from the `"message"` bundle.
- `WearableCommClientSocket` connects a `LocalSocket` to
  `HEALTH_SERVICE_SOCKET_2WAY<nonce>` (address = `SERVER_ADDRESS_2WAY + decimal nonce`), sets the send
  buffer to 65536, and writes the **8-byte long nonce** as the first frame
  ("Certification DATA SENT FROM CLIENT SOCKET"). Socket type 2 = two-way (read thread); status
  187000 = connected, 187002 = connecting.
- `WearableCommServerSocket` is the accept side of the same protocol (read loop, timeouts, nonce).
- Frame envelope `WearableMessageLibHeader`: `message`, `sequence_num` (int), `sender`, `receiver`,
  `device`, `version` (double), `type`, `body`, `result`. `transferData` drops duplicate
  `sequence_num` and drains the queue.
- Constants: `SERVER_ADDRESS = "HEALTH_SERVICE_SOCKET"`,
  `SERVER_ADDRESS_2WAY = "HEALTH_SERVICE_SOCKET_2WAY"`, `CHUNK_SIZE = 65536`,
  `STRING_DATA_SEND_COMPLETE = "END_OF_DATA"`, `SOCKET_LIB_VERSION = 170614044`.

The owner of the `HEALTH_SERVICE_SOCKET*` server is not in this APK; evidence points to the Samsung
watch stack (Watch Manager/WMS) [I].

### 2.3 MCF provider

`McfMsgContentProvider.call()` implements request/response and message methods used by the Samsung
sensor SDK: activate MCF, get connected watch (`McfConnectedDeviceInfo`), trigger sync, ask Watch
Manager to enable BT discovery for the watch, and relay `WearableMessage` requests [V]. The provider is
protected by the MCF signature permission [V manifest; protection level defined outside this APK — [I]].

### 2.4 RFCOMM/SPP is for sensors, not the watch

`com.samsung.android.app.shealth.sensor.sdk.fitness.rfcomm` (45 classes) contains
`DeviceConnectorImpl` (`startBtScan`, `startMcfDiscovery`, `mBondReceiver`), `SppClient`,
`MessageSppClient`, `HealthConnector`, `HeartRateConnectorImpl`, `FitnessProgramConnectorImpl` [V].
These handle chest straps/power meters/scales. They are not the watch sync path.

## 3. Context holding / session state

- **Wearable identity:** `WearableRegistrationInfo` (Parcelable: ids, register status, BT type,
  extra string), `WearableDevice` (id, manufacturer, name, power-saving mode, capability),
  `WearIdMap` (BT MAC ↔ Wear node id) [V].
- **WearableComm session:** per-socket nonce, socket id/type/status, sequence numbers, data queue,
  read thread, timers [V].
- **Wear OS session:** node id, capability set, Data Layer events; no app-held socket [V].
- **Sync:** `WearableSyncReceiver` legacy/exported entry points; `wearable.sync.*` and
  `wearable.data.aggregator.*` persist synced data; `wearablecomm.jdata.*` carries the payload schema
  (`JHeartRateMonitor`, `JPedometer`, `JSleep`, `JStress`, `JUvRay`, `JExercise`, …) [V].
- **Phone-side sharing:** Health Connect client and `android.permission.health.*` permissions exist;
  Samsung Health can export to Health Connect on supported devices [I].

## 4. Implementability for Unified Health

| Option | Verdict | Why |
|---|---|---|
| `driver/samsung` over BLE (Garmin/Zepp style) | **Not possible** | Samsung Health has no vendor GATT watch protocol in this APK; classic SAP is absent; pairing is owned by Watch Manager/Wear OS [V]. |
| Samsung HealthConnectivity `IWearableHealth` binder | **Blocked** | Exported, but `WearableService.a` accepts only `com.sec.android.app.shealth` or callers whose package signature SHA-256 is in the server allowlist (`WearableService.c`), else `qxx.a`; third-party apps are rejected [V]. |
| WearableComm LocalSocket | **Not a public API / do not rely** | Nonce bootstrap + `WearableMessageLibSignatureCheckerLib` signature allowlist; server owner outside the APK. Treat as private Samsung plumbing [V/[I]]. |
| MCF ContentProvider | **Blocked** | Guarded by `com.samsung.android.mcfds.permission.ACCESS_SERVICE`; MCF/Watch Manager are Samsung system components [V]. |
| **Wear OS companion app** | **Recommended for Wear OS watches** | Build our own Wear OS app using Wear Health Services + Data Layer/MessageClient; no Samsung Health impersonation. Samsung privileged sensors (ECG/BIA) still need Samsung's Privileged Health SDK partnership [Ext]. |
| **Health Connect import** | **Recommended fallback** | Read Samsung Health's exported records via Health Connect; importer still TODO in this repo (analysis README §5 of 01-app-architecture). |
| Tizen-era Galaxy watches | **No third-party transport** | They sync only through Samsung Health/Watch Manager; use Health Connect or manual export [I]. |

## 5. Open questions (need a real device / HCI or vendor docs)

- Which process owns `HEALTH_SERVICE_SOCKET*` (Watch Manager/WMS vs a Samsung Health service).
- Nonce generation/validation and the final signature-check policy for socket callers; the call site
  of `WearableMessageLibSignatureCheckerLib` sampled so far is the nonce broadcast manager.
- Per-device runtime selection: WMS/socket vs Wear OS Data Layer (capability dependent).
- Whether Samsung Health exports all relevant record types to Health Connect on each watch model.
- Wear OS watch-side capabilities available to a third-party companion app (Health Services vs
  Samsung privileged SDK).

## 6. Evidence index

All under `docs/re-analysis/rea-output/samsung/`:

| Fact | Artifact |
|---|---|
| Package/manifest/components | `AndroidManifest.xml`, `package.json` |
| Wear OS listener/paths | `class_WearOsListenerService.json`, `method_WearOsListenerService.onDataChanged.json`, `onMessageReceived.json` |
| WearableComm socket/nonce | `class_WearableCommClientSocket*.json`, `class_WearableCommServerSocket.json`, `method_*SocketHandler.connect/initalize*.json`, `method_WearableMessageLibSocketManager.*.json` |
| Nonce broadcast | `class_WearableMessageLibBroadcastManager.json`, `method_WearableMessageLibBroadcastManager.requestNonce.json`, `method_BroadcastManager_*.json`, `method_WearableMessageReceiver.onReceive.json` |
| Signature/caller validation | `class_WearableMessageLibSignatureCheckerLib.json`, `method_SignatureChecker.checkSignature.json`, `class_WearableService.json`, `method_WearableService_a.json`, `method_WearableService_c.json`, `class_kwa0.json`, `method_kwa0.F3.json` |
| MCF provider | `class_McfMsgContentProvider.json`, `method_McfMsgContentProvider.*.json`, `class_McfSimpleMessageManager.json` |
| Envelope/identity | `class_WearableMessageLibHeader.json`, `class_WearableRegistrationInfo.json`, `class_WearableDevice.json`, `class_WearIdMap.json` |
| Full inventory | `INDEX.md`, `classes_all.txt`, `wearable_classes.txt`, `mcf_classes.txt`, `rfcomm_classes.txt` |
