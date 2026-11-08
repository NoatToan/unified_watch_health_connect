# Samsung Health — auth & crypto analysis

Status: 2026-11-08. Companion to `SAMSUNG_CONNECTION_ANALYSIS.md`; evidence in
`docs/re-analysis/rea-output/samsung/`. No key material was extracted. Tags [V]/[I]/[Ext] as usual.

## 1. There is no classic Samsung Accessory crypto in this APK

- 0 classes in `com.samsung.android.sdk.accessory`, 0 `SAAgent`/`SASocket`/`SAPService` [V].
- The only RFCOMM/SPP code is the fitness-sensor module (`sensor.sdk.fitness.rfcomm`), not the watch
  path [V].
- Therefore there is no SAP certificate/TLS handshake to reimplement for a watch.

## 2. Wear OS Data Layer

- Authentication is the Play Services Wearable node/capability model: node ids, capabilities and the
  Play Services transport [Ext]. Samsung Health does not add an app-layer handshake in the sampled
  listener (`WearOsListenerService.onDataChanged/onMessageReceived`) [V].
- A third-party app cannot impersonate Samsung Health's node or subscribe to its private paths; it can
  only use its own Wear OS app/package and the standard Data Layer APIs [Ext].

## 3. Samsung WearableComm (Galaxy/Tizen path)

### 3.1 Nonce bootstrap

1. `WearableMessageLibSocketManager.wearableSocketInit` queues the payload. If
   `WearableMessageLibVariables.getNonceNumber()` is 0 it calls
   `WearableMessageLibBroadcastManager.requestNonce()` [V].
2. `requestNonce()` broadcasts `com.samsung.provider.shealth.REMOTE_REQ_NONCE` with
   `EXTRA_DEVICE_TYPE`, throttled to once per 500 ms [V].
3. `WearableMessageReceiver` (exported, process `:remote`) handles the request and invokes the nonce
   provider; the response action is `com.samsung.android.shealth.REMOTE_RESP_NONCE` [V constants].
4. `WearableCommClientSocket` connects to `HEALTH_SERVICE_SOCKET_2WAY<decimal nonce>` and writes the
   **8-byte long nonce** as the first frame; the server side is `WearableCommServerSocket` [V].

The nonce is a socket-address suffix plus first-frame value, not a cryptographic key [V]. It is
delivered out-of-band via broadcast.

### 3.2 Signature / caller checks

- `WearableMessageLibSignatureCheckerLib.checkSignature(context, packageName)` compares the target
  package signature against an allowlist: `SIGNATURE_USER_RELEASEKEY`, `SIGNATURE_DOWNLOADABLE`
  (user builds), plus `SIGNATURE_DEBUGKEYSTORE`, `SIGNATURE_ENG_RELEASKEY`,
  `SIGNATURE_ENG_PLATFORMKEY` on eng/userdebug builds [V, method body]. Non-matching packages return
  false.
- `WearableService.a(WearableService)` (the `IWearableHealth` binder gate) accepts:
  1. caller package `com.sec.android.app.shealth`, or
  2. a caller whose package signature SHA-256 is in the server-provided signature list
     (`WearableService.c`), or
  3. the result of `qxx.a(...)` (unresolved helper).
  Otherwise it logs "invalid caller" and `kwa0.F3` throws `RemoteException` [V].
- The exported service/binder is therefore not an open API: a third-party app without a Samsung
  release/downloadable signature cannot create a session [V structure; the actual allowlist is
  server-supplied — [I]].

### 3.3 Message path

- `WearableMessageLibHeader` is a plain Gson JSON envelope:
  `message, sequence_num, sender, receiver, device, version, type, body, result` [V].
- `WearableMessageLibCommunicator.sendData` serialises it to UTF-8 and writes it over the socket [V].
- `WearableMessageLibUtil` provides base64 encode/decode and string compress/decompress, not a payload
  cipher [V].
- Sampled methods show no AES/RSA/TLS layer on the message path; integrity/authorization relies on the
  nonce handshake + package signature checks at the endpoints [I — limited sample, not a proof for
  every path].
- `assets/wearable/publickey/wearableDumpLog.pub` exists in the APK but was deliberately not extracted
  or analysed (key material policy).

### 3.4 MCF provider

- `McfMsgContentProvider` is guarded by
  `com.samsung.android.mcfds.permission.ACCESS_SERVICE` [V manifest]. MCF/Watch Manager are Samsung
  system components; the permission's protection level is defined outside this APK [I, almost certainly
  signature-level].
- The provider exposes activation, connected-watch, sync-trigger and BT-discovery requests, but only to
  the MCF stack [V].

## 4. Implementability / boundary

| Path | Auth mechanism | Third-party verdict |
|---|---|---|
| Wear OS Data Layer | Play Services node/capability | Usable only with our own Wear OS app, not by impersonating Samsung Health [Ext] |
| `IWearableHealth` binder | `WearableService.a` package/signature allowlist | Blocked for third-party callers [V] |
| WearableComm LocalSocket | 8-byte nonce + signature allowlist + private server | Not a public API; do not rely [V/[I]] |
| MCF ContentProvider | `com.samsung.android.mcfds.permission.ACCESS_SERVICE` | Blocked for third-party apps [V] |
| Health Connect | Android platform permissions | Usable (importer still TODO) [Ext] |

Conclusion: there is nothing to "crack" and no vendor key to extract for a clean integration. Samsung's
private paths are signature-gated by design. The supported integrations are a Wear OS companion app and
Health Connect.

## 5. Open questions

- Actual call sites of `WearableMessageLibSignatureCheckerLib` (sampled reference: nonce broadcast
  manager; the socket server may check separately).
- Whether the `qxx.a` fallback in `WearableService.a` widens the allowlist (unresolved helper).
- Protection level of `com.samsung.android.mcfds.permission.ACCESS_SERVICE` (defined by the MCF app).
- Whether any WearableComm payload path applies encryption beyond the socket/nonce model.

## 6. Evidence index

| Fact | Artifact |
|---|---|
| Signature allowlist body | `method_SignatureChecker.checkSignature.json` |
| Binder caller validation | `method_WearableService_a.json`, `method_WearableService_c.json`, `method_kwa0.F3.json` |
| Nonce bootstrap/socket | `method_WearableMessageLibBroadcastManager.requestNonce.json`, `method_BroadcastManager_*.json`, `method_WearableMessageReceiver.onReceive.json`, `method_*SocketHandler.connect/initalize*.json` |
| Envelope | `class_WearableMessageLibHeader.json`, `method_WearableMessageLibCommunicator.sendData.json` |
| MCF permission | `AndroidManifest.xml` (`McfMsgContentProvider`) |
| Absence of SAP | `INDEX.md` §2 (0 classes in `com.samsung.android.sdk.accessory`) |
