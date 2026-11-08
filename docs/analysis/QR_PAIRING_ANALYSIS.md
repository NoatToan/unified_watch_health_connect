# QR-code pairing across vendor companion apps

Scope: does the vendor's Android companion app bind/pair a watch by scanning a QR code (on the
watch screen, box or manual), what the QR encodes, and how the scanned payload feeds the
connection flow. Evidence: decompiled companion APKs under `docs/re-evidence/<vendor>/` and
`docs/re-analysis/`. Tags: **[V]** seen directly in decompiled code, **[I]** inferred from
adjacent code, **[Ext]** outside knowledge (no code evidence in this repo's dumps).

## Summary table

| Vendor | QR used for watch pairing? | Payload | Key fields | MAC in QR? | Secret in QR? |
|---|---|---|---|---|---|
| **Huawei/Honor** (Huawei Health) | **Yes** [V] | `t=<type>&n=<btName>&r=<PIN>` or `...&PIN=<PIN>` (bare key=value, `&`-joined, URL-decoded per field) | device type id, BT (classic) name, 6-digit PIN | **No** — resolved by classic-BT name discovery | **Yes** — 6-digit PIN used as a handshake secret, not just a BT confirm code |
| **Zepp/Amazfit/Xiaomi** (Zepp app) | **Yes** [V] | `https://api.amazfit.com/app.json?macAddress=XXXXXXXXXXXX&pnpNumber=…&pnpVersion=…` (host/path not actually checked; only query keys matter) | 12-hex MAC (`macAddress` or fallback `mac`), `pnpNumber`, `pnpVersion` (both **mandatory** ints) | **Yes**, raw 12-hex, no separators | **No** |
| **Coros** | **No** [V, absence] | zxing/mlkit QR libs exist but are wired to WeChat login QR and a route/altitude "share as QR" image export, never to device binding | — | — | — |
| **Garmin** | **Yes** [V] — *not* an in-app camera scanner; the watch's QR encodes an Android **App Link** (`https://connect.garmin.com/mobile-link/gcm/pair-device?...`) that any QR/camera app can open, which the OS routes straight into Garmin Connect | `https://{connect\|connecttest}.garmin.com/mobile-link/gcm/pair-device?deviceId=<unitId>&productNumber=<productNumber>&applicationKey=<applicationKey>` (plain URL query params, no custom encoding) | `deviceId` (GFDI unit ID, Long), `productNumber` (model/product number string), `applicationKey` (device-auth-scope string, reused later for Garmin's own OAuth-device-token exchange) | **No** — resolved by BLE-advertisement match on `unitId`+`productNumber` (both broadcast in BLE manufacturer-specific data pre-connect) | **No secret for BLE auth** — the normal GFDI 6-digit passkey (msg 5103, mode 0) is still required after the QR pre-selects the device; `applicationKey` is a Garmin-cloud OAuth scope identifier, not a BLE pairing secret |
| **Samsung** (Samsung Health) | **No** [V, absence] | zxing QR classes exist only under `social.together.*` (friend/challenge QR, "together" social feature); no QR class tied to watch add/pairing in S Health. Actual Galaxy Watch pairing happens in the separate **Galaxy Wearable** app/Wear OS pairing flow, not analyzed here [Ext] | — | — | — |

---

## 1. Huawei / Honor — Huawei Health

**QR path exists.** Classes: `com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity`
(scanner UI, 1072 lines), `QrCodeSchemeActivity`, `QrCodePretreatmentService` (deep-link
pre-validation, generic for all QR types, not device-specific), and the device-pairing handler
`defpackage/ssj.java` (`DeviceQrCodeHandle`, log tag `"DeviceQrCodeHandle"`) with its payload
parser `defpackage/ssn.java` (`DeviceQrCodeData`). Result screen:
`com.huawei.ui.homehealth.qrcode.activity.DeviceConnectTipsActivity`. All four are
`exported=false` (`docs/re-evidence/huawei/AndroidManifest.xml:2469-2489`) [V] — only reachable
from inside the app's own QR scanner / router, never from an external link.

### 1.1 Exact payload format [V]

`ssn.parser()` (`docs/re-evidence/huawei/jadx-out/sources/defpackage/ssn.java:47-100`):

```
raw := <segment0>&<segment1>&<segment2>
segment0 = "t=<int>"                      // device/product type id (lvi.c()/lvi.d() lookup table)
segment1 = "n=<btName>"  | "bt_name=<btName>"   // Bluetooth Classic advertised name
segment2 = "r=<PIN>"     | "PIN=<PIN>"          // only required if segment0/1 match ^.*&r=\d{6}.*$
                                                  // or ^.*&PIN=\d{6}.*$  (case-insensitive) [V]
```

- Each `key=value` is split on the first `=`; values are `URLDecoder.decode(..., "UTF-8")`
  (`ssn.java:177-191`, helper `b(String,List<String>)`).
- Accepted key aliases: type → `t`; name → `n` or `bt_name`; pin → `r` or `PIN`
  (`ssn.java:28-31`, static lists `f48637a/d/f48638b/f48639c`).
- If `strArrSplit.length < 1` or type isn't parseable as `int` → reject (`-3`/`-4`)
  (`ssn.java:51-59,98-100`).
- Special-case normalization: type `79` ("Huawei Band 8-series" / "Huawei Band ASK-series" by
  name prefix) is remapped to type `71` (`ssn.java:76-79`).
- No URL/host wrapper is required — the payload is the bare `t=…&n=…&r=…` string (confirmed by
  the top-level caller `QrCodePretreatmentService`/`AppRouter` only validating *other* QR types
  that look like `https://…` deep links — device-bind QR goes straight to `ssn.parser` via
  `"/HomeHealth/QrCodeSchemeActivity"` routing without a host check (`QrCodePretreatmentService.java:104-128`)).
- No raw example string was recoverable from strings/resources, but the regex and key names are
  explicit in code.

### 1.2 Fields that matter

| Field | Meaning | Used for |
|---|---|---|
| `t` | numeric product/device type id | looked up via `lvi.c()/lvi.d()` to a plugin UUID/profile; drives which pairing resource bundle to download |
| `n` / `bt_name` | **Bluetooth Classic device name** (not MAC!) | target for classic BT discovery name-match |
| `r` / `PIN` | 6-digit numeric PIN | handshake secret (see 1.4) |

No MAC address and no serial number appear in the Huawei device-bind QR format.

### 1.3 Connection flow after scanning [V]

1. `QrCodeScanningActivity` decodes the QR (likely HMS Scan Kit or zxing — not confirmed from the
   handler files read; `QrCodeScanningActivity` itself contains device-agnostic dispatch logic,
   1072 lines, and is paired with glucose-meter/NFC formats too, e.g. `RG01`, `VivaChek-VGM60-…`).
2. `ssj.parser()` builds a `ssn` (`DeviceQrCodeData`) from the decoded string; `ssj.verify()`
   rejects it if `type == 0` (empty/garbage) (`ssj.java:706-724`).
3. `ssj.execute()` resolves resources for that type, then checks Bluetooth is on
   (`rdp.b(Context)`) (`ssj.java:727-768`).
4. **Classic BT discovery, not a BLE/GATT scan**: `BTDeviceMgrUtil.c()` discovery callback
   `onDeviceDiscovered` compares each discovered `BluetoothDevice.getName()` (or
   `BluetoothDeviceNode.getRecordName()`) case-insensitively against the QR's `n`/`bt_name`
   (`ssj.java:180-196,341-372`). A 20 s timeout fires `showNoFindDevice` → "rescan" or "cancel"
   dialog (`ssj.java:1243-1252`, `ad()` at `:911-945`).
5. On a name match, the discovered `BluetoothDevice.getAddress()` becomes the working MAC
   (`this.o`, `ssj.java:383-384`) — **the MAC is obtained from the classic-BT discovery result,
   never from the QR**.
6. Depending on build flag `this.g`, either:
   - jump straight to `DeviceConnectTipsActivity` with extras `deviceName`, `MAC_ADDRESS` (from
     discovery), `deviceType` (= `t`), `pinCode` (= `r`/`PIN`), `bluetoothType`
     (`ssj.java:422-434`); or
   - call `pairBleDevice()`/`g()` directly, which starts `DevicePairGuideActivity` with
     `pairGuideSelectAddress` (MAC) and `pairGuideProductPin` (the QR PIN)
     (`ssj.java:473-504`).
7. `DeviceConnectTipsActivity.e()` (and the `ssj` twin) do the same thing: optionally call
   `cjk.d().startPair(StartPairOption.builder().c(mac)…)` (an H5/Wear-Engine style pair) or launch
   `DevicePairGuideActivity` with `pairGuideSelectAddress`/`pairGuideProductPin`
   (`DeviceConnectTipsActivity.java:195-217`).

### 1.4 What the PIN is actually for — more than a BT confirm code [V]

`DevicePairGuideActivity` reads `pairGuideProductPin` into field `de`
(`docs/re-evidence/huawei/jadx-out/sources/com/huawei/ui/device/activity/pairing/DevicePairGuideActivity.java:875`)
and stores it on `DeviceParameter.setProductPin()` (`DeviceParameter.java:106-111`). That
parameter flows into `defpackage/mkn.java:325-327`:

```java
cku.d(deviceParameter.getMac(), deviceParameter.getProductPin());   // setPin(mac, pin)
cku.b(deviceParameter.getMac(), deviceParameter.getProductPin());
```

`cku` is `HandshakeUtils` (log tag `"HandshakeUtils"`,
`docs/re-evidence/huawei/jadx-out/sources/defpackage/cku.java:91-125`): `setPin(deviceIdentify, pin)`
caches the PIN keyed by MAC (`cpv.e(mac, pin)` persists it, `f1689a`/`f1690c` are in-memory maps)
for retrieval during the device **handshake** — the same handshake family that uses
`HiChainCommandUtil`/`HiChain3GroupManager`/TLV parsing (`cqe`) noted in
`docs/protocols/HUAWEI_DEVICE_PROTOCOL.md:655`. The PIN is therefore read back during the
post-connect handshake as a pre-shared authentication value, not merely echoed into the Android
classic-BT pairing dialog. (Exact use inside the handshake — PAKE input vs. simple compare — is
**not** verified at the byte level here; flagging as [I] pending a deeper HiChain trace.)

### 1.5 Third-party usability

A third-party app scanning the same QR gets: product type id, BT classic name, and (sometimes) a
6-digit PIN. **No MAC.** To connect you must still run classic-BT discovery to resolve
name→address, exactly like the vendor app. If the device requires the PIN-based handshake (HiChain
style), you need to replicate that handshake — the PIN alone is not sufficient without knowing the
HiChain key-agreement protocol. Net: **QR saves you nothing over plain BT discovery** except the
convenience of pre-filling the target name and getting the device's declared "type" id and PIN;
legal/complexity risk is in re-implementing HiChain, not in the QR data itself.

---

## 2. Zepp / Amazfit / Xiaomi — Zepp app

**QR path exists**, previously documented in `docs/protocols/ZEPP_DEVICE_PROTOCOL.md` §2.2 and
`docs/analysis/ZEPP_CONNECTION_ANALYSIS.md:20-22`. This pass re-verified against source and adds
detail the earlier write-up omitted.

### 2.1 Exact payload + parser [V]

`CaptureQRResultKt.getDeviceQRInfo(String)`
(`docs/re-evidence/zepp/jadx-base/sources/com/xiaomi/hm/health/device/capturedevice/CaptureQRResultKt.java:70-94`):

```java
UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(rawResult);
value = urlQuerySanitizer.getValue("macAddress");       // primary key
if (!isHex12(value)) value = urlQuerySanitizer.getValue("mac");   // fallback key
if (!isHex12(value)) return null;                        // mac MUST be 12 hex chars [0-9A-Fa-f]
mac = groupsOf2(value, ":").toUpperCase();                // "AA:BB:CC:DD:EE:FF"
pnpNumber  = Integer.parseInt(urlQuerySanitizer.getValue("pnpNumber"));   // throws → null if absent/non-numeric
pnpVersion = Integer.parseInt(urlQuerySanitizer.getValue("pnpVersion"));  // same
return DeviceQRInfo(mac, pnpNumber, pnpVersion)
```

Important corrections/additions vs. the existing doc:
- **Host/path are never validated by this function.** `android.net.UrlQuerySanitizer` only parses
  query-string key/value pairs out of whatever string it's given; `CaptureQRResultKt` never checks
  scheme or host. The documented host `https://api.amazfit.com/app.json` is what the *watch*
  prints, not something the app enforces — a bare query string
  `macAddress=AABBCCDDEEFF&pnpNumber=1&pnpVersion=2` (no `https://…` prefix) would parse
  identically. [V for the parser; [I] that this is intentionally permissive vs. an oversight.]
- `pnpNumber`/`pnpVersion` are **mandatory**: `Integer.parseInt` on a null/absent value throws, is
  caught by the outer `try/catch (Exception)`, and the whole function returns `null` (treated as
  "invalid QR"). So a QR with only a MAC and no PnP numbers is rejected.
- `mac` must be exactly 12 case-insensitive hex characters (`a(String)` helper,
  `CaptureQRResultKt.java:29-48`); anything else (wrong length, non-hex) → try the `mac` fallback
  key, then fail.
- Scanner library: **zxing** (`com.google.zxing.Result`), confirmed by
  `HMCaptureWatchQRActivity.checkCaptureResult(Result rawResult)`
  (`docs/re-evidence/zepp/jadx-base/sources/com/xiaomi/hm/health/device/capturedevice/HMCaptureWatchQRActivity.java:199-208`),
  not MLKit.

### 2.2 Model/PnP validation and allow-list [V]

`HMCaptureWatchQRActivity.checkCaptureResult()`:

```java
DeviceQRInfo info = CaptureQRResultKt.getDeviceQRInfo(rawResult.getText());
HMDeviceSource src = HMDeviceSource.fromPnP(info.getPnpNum(), info.getPnpVersion());
return allowBindSource.contains(src);   // allowBindSource = E().getAllowBindSources(bindType)
```

So `pnpNumber`/`pnpVersion` are looked up through `HMDeviceSource.fromPnP(...)` into a known-model
enum, then checked against an allow-list for the current bind flow (`bindType` — e.g. "watch" vs
"shoe sensor" vs other accessory flows share this same QR capture base class,
`HMCaptureDeviceBaseActivity`). A QR for a device type outside the allow-list is rejected with
`getInvalidQrInfo()` → string `bind_shoes_invalid_qr_help` (shared string resource; name is a
historical artifact from the shoe-sensor flow, used for all device types via this base class).

### 2.3 Connection flow after scanning [V]

1. `checkCaptureResult` validates (format + PnP allow-list) as above.
2. `handleCaptureResult` → `deviceXNavigator.startBindDeviceActivityByQrCode(this, bindType,
   deviceQRInfo)` (`HMCaptureWatchQRActivity.java:255-261`) — hands off MAC + PnP pair to the
   normal bind-device activity, tagged as "came from QR".
3. From there the previously-documented flow applies: scan-by-address with `filterAddress`
   (`HMBindMiLiLogic.java:797-801`), **30 s timeout**
   (`docs/analysis/ZEPP_CONNECTION_ANALYSIS.md:20-22`), then normal `connectGatt`.
4. **"No QR on watch" fallback** [V]: `onNoQRCodeClick()` calls
   `deviceXNavigator.startBindWatch(this, null, bindType)` and finishes the QR activity
   (`HMCaptureWatchQRActivity.java:275-278`) — i.e. the QR path is a *shortcut* into the same
   bind flow that normal FEE0+name BLE scanning uses; it is never required.
5. What happens if the device isn't found after the address-filtered scan: not newly verified in
   this pass beyond the existing §2.2 timeout note; no distinct "QR device not found" dialog class
   was found separate from the generic bind-timeout handling already documented in
   `ZEPP_CONNECTION_ANALYSIS.md`.

### 2.4 Fields that matter / third-party usability

MAC + PnP (vendorId/productId/productVersion-style numeric pair, interpreted by
`HMDeviceSource.fromPnP`) — both required. **No key/secret in the QR.** Everything needed to
identify the model and connect by address is present; auth key for the GDSP/channel crypto still
has to come from elsewhere (cloud bind, §5 of `ZEPP_AUTH_CRYPTO_ANALYSIS.md`), unchanged from the
existing write-up. For Unified Health this is the most directly reusable QR path of the four.

---

## 3. Coros

**No QR pairing path.** `docs/re-analysis/rea-output/coros/strings_classes.txt` does contain
zxing/mlkit QR classes and `com.journeyapps.barcodescanner.*`, but every QR-shaped string resolves
to two unrelated features:
- WeChat-style OAuth QR login: `onAuthGotQrcode`, `onQrcodeScanned`, `_wxapi_scan_qrcode_result`
  (`strings_classes.txt:470348-470522,451438`) [V].
- A route/elevation **share-as-QR** image (`ivAltitudeQrcode`, `tvDistanceQrcode`,
  `tvDleGainQrcode`, `LayoutAltitudeQrcodeBinding` — `strings_classes.txt:533731,555783-575006`)
  [V] — this renders a QR *of* a route summary for sharing, not a scan-to-pair input.

Device discovery/pairing in Coros (`docs/re-analysis/rea-output/coros/CONNECTION_ANALYSIS.md`,
already in-repo) is: BLE scan with a per-model `ble_name_prefix`, then standard Android
`createBond()`/SMP, then a proprietary protobuf-lite handshake (`YfBtAuth`). No QR touches this
path **[V, absence]**. (The app's DEX is shell-obfuscated so method bodies are unavailable, but
the complete absence of any Qr/Scan/Capture class name tied to `device`/`bind`/`pair` strings is
itself informative — Coros ships zxing for a different feature, confirmed above.)

---

## 4. Garmin

**Correction (this pass): Garmin DOES have a QR pairing path.** The earlier conclusion ("no QR,
only MLKit nutrition scanner + 6-digit passkey") was wrong because it only searched for an *in-app
camera/QR-decoder* caller. Garmin doesn't need one: the watch's QR encodes a plain **HTTPS Android
App Link**, so *any* QR reader (stock Camera app, Google Lens, a third-party scanner) can decode
it and the OS hands the resulting URL straight to Garmin Connect via its verified deep-link
intent-filter — no camera code inside Connect itself. That is why grepping for
MLKit/zxing/CameraX callers found nothing: the "QR scanning" is done by whatever app the user
points at the watch screen, not by Garmin Connect.

### 4.1 Deep-link entry point [V]

`AndroidManifest.xml` declares an externally reachable `VIEW`/`BROWSABLE` intent-filter:

```xml
<intent-filter>
  <action android:name="android.intent.action.VIEW"/>
  <category android:name="android.intent.category.DEFAULT"/>
  <category android:name="android.intent.category.BROWSABLE"/>
  <data android:scheme="https"/>
  <data android:host="connecttest.garmin.com"/>
  <data android:host="connect.garmin.com"/>
  <data android:host="connectus.garmin.cn"/>
  <data android:host="connect.garmin.cn"/>
  <data android:pathPrefix="/mobile-link/gcm"/>
</intent-filter>
```
(`docs/re-evidence/garmin/AndroidManifest.xml:368-377`). This block itself has no
`android:autoVerify`, but other intent-filters in the same manifest *do* carry
`android:autoVerify="true"` for the same hosts (`connect.garmin.com` etc.,
`AndroidManifest.xml:681,691,700,710`), which is what makes Android treat Garmin Connect as the
verified default handler for `https://connect.garmin.com/...` links in general — consistent with
the user's real-device observation that scanning the watch's QR opens the Connect app directly
rather than a browser.

Dispatch happens in
`docs/re-evidence/garmin/jadx-base/sources/com/garmin/android/apps/connectmobile/GCMCommonDeepLinkHandler.java:975-1012`:
the handler matches path `/mobile-link/gcm/pair-device` and either (a) routes to
`DeviceDetailsActivity`/settings if the `deviceId` is already paired (local-DB check, no network),
or (b) launches
`com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity`
(`DeviceSetupActivity.java`) with the parsed QR payload in extra `EXTRA_DEVICE_SETUP_QR_CODE_INFO`
(`DeviceSetupActivity.java:208-210,321`).

### 4.2 Exact payload format + parser [V]

Parser: `y80.p0.a(Uri)` (`docs/re-evidence/garmin/jadx-base/sources/y80/p0.java:40-52`):

```java
public static l90.d a(Uri uri) {
    String productNumber = uri.getQueryParameter("productNumber");
    String applicationKey = uri.getQueryParameter("applicationKey");
    String deviceIdStr    = uri.getQueryParameter("deviceId");
    Long deviceId = TextUtils.isEmpty(deviceIdStr) ? null : Long.valueOf(Long.parseLong(deviceIdStr));
    return new l90.d(deviceId, productNumber, applicationKey, /* qrCodePairing = */ true);
}
```

So the literal URL form is:

```
https://connect.garmin.com/mobile-link/gcm/pair-device?deviceId=<long>&productNumber=<string>&applicationKey=<string>
```

(also matches hosts `connecttest.garmin.com`, `connectus.garmin.cn`, `connect.garmin.cn` under
pathPrefix `/mobile-link/gcm`). There is no extra encoding beyond standard URL query parameters —
each value is read with `Uri.getQueryParameter` and `deviceId` must parse as a `Long`
(`Long.parseLong`, no regex validation, so non-numeric `deviceId` throws rather than silently
failing — not caught locally in this function). No literal example string was recoverable from
`jadx-base`/`jadx-gcm` string/resource dumps; the three key names (`deviceId`, `productNumber`,
`applicationKey`) are explicit in code, but the exact values Garmin uses for `applicationKey`
format were not observed.

Result DTO: `l90.d` (named `DeviceFilterInfo` in Kotlin metadata,
`docs/re-evidence/garmin/jadx-base/sources/l90/d.java:10-43`):

```kotlin
data class DeviceFilterInfo(
    val deviceUnitId: Long?,        // f111537a — from "deviceId"
    val deviceProductNumber: String?, // f111538b — from "productNumber"
    val deviceApplicationKey: String?, // f111539c — from "applicationKey"
    val qrCodePairing: Boolean = false // f111540d — always true from this parser
)
```

The `qrCodePairing` boolean is set but, as far as this pass found, is **never read anywhere else**
in the decompiled sources (only appears in `equals()`/`hashCode()`/`toString()`) — it looks like a
flag intended for analytics/telemetry rather than branching pairing logic.

### 4.3 Fields that matter [V]

| Field | Meaning | MAC? | Secret? |
|---|---|---|---|
| `deviceId` | GFDI **unit ID** of the specific watch (Long) | No | No |
| `productNumber` | Product/model number string (identifies watch model/SKU) | No | No |
| `applicationKey` | A per-device application/auth-scope key string. Only other confirmed use in this codebase: as a URL path segment for Garmin's own **OAuth device-token exchange**, `https://{host}/oauth-service/oauth/tokens/device/<applicationKey>` (`docs/re-evidence/garmin/jadx-base/sources/cd2/a.java:120-140`) — a general mechanism used for *every* paired Garmin device's cloud/Connect IQ authorization, not something unique to the QR flow. It is **not** consumed anywhere as a BLE pairing secret. | No | **No** (cloud OAuth scope id, not a BLE/GFDI secret) |

No MAC address and no BLE passkey/PIN are present in the Garmin pairing QR.

### 4.4 Connection flow after scanning [V / I]

1. QR is decoded by *any* app (not Garmin Connect's own code) → resolves to the
   `https://connect.garmin.com/mobile-link/gcm/pair-device?...` App Link → OS opens Garmin
   Connect directly (verified domain, §4.1).
2. `GCMCommonDeepLinkHandler` parses the URL (`y80.p0.a`), checks the local device-pairing DB by
   `deviceId` for an existing pairing (`rd2.j.i(jLongValue, null)`, local lookup — **no network
   call** at this step) (`GCMCommonDeepLinkHandler.java:979-999`).
3. If not already paired, launches `DeviceSetupActivity` with the `DeviceFilterInfo` as
   `EXTRA_DEVICE_SETUP_QR_CODE_INFO` (`GCMCommonDeepLinkHandler.java:1006-1010`,
   `DeviceSetupActivity.java:321`).
4. `DeviceSetupActivity` runs the normal BLE **discovery scan** (same pipeline used for manual
   "add a device" with no QR) — it does **not** connect-by-MAC, because the QR doesn't carry a MAC.
   A discovery filter, `k90.b` (`docs/re-evidence/garmin/jadx-base/sources/k90/b.java:26-95`,
   log tag `"DeviceDiscoveryFilter"`), is applied to each scanned candidate (`dk2.d`) and accepts
   only devices whose discovered `unitId` (`dk2.d.f60244h`) and `productNumber`
   (`dk2.d.f60239c`) both match the QR's `deviceUnitId`/`deviceProductNumber`
   (`k90/b.java:58-70`) — i.e. the QR **auto-selects the exact watch** out of several nearby
   candidates and **pre-selects the model** (no manual "pick your device type" step needed),
   instead of skipping BLE discovery outright.
5. Crucially, `dk2.d`'s `unitId`/`productNumber` are populated straight from the **BLE
   advertisement's manufacturer-specific data** (`ScanRecord.getManufacturerSpecificData()`,
   `docs/re-evidence/garmin/jadx-base/sources/dk2/d.java:362-390` and onward) — **before any GATT
   connection**, i.e. before bonding. So the match-by-`unitId`/`productNumber` happens purely from
   passive BLE scanning.
6. No evidence was found that the QR skips the subsequent OS `createBond()` / GFDI passkey
   exchange (msg 5101–5112, passkey mode 0 = visible 6-digit code on the watch, as already
   documented in `docs/protocols/GARMIN_DEVICE_PROTOCOL.md:255`) — that step appears unchanged by
   the QR flow. `applicationKey` was not found wired into that handshake.
7. `applicationKey` resurfaces later only for Garmin's own account-level OAuth device-token
   exchange (`cd2.a`, §4.3) — a cloud call, but one that happens for every paired Garmin device
   (QR-paired or not) to authorize Connect IQ / cloud sync, not a "look up this device" catalog
   call gated specifically on the QR.

### 4.5 Third-party usability [I]

A third-party app (Unified Health) can realistically use this QR **offline, without a Garmin
account**, for everything except the Garmin-cloud OAuth step:
- Decode the QR with any standard library (zxing/MLKit) — it's a plain HTTPS URL, no vendor SDK
  needed.
- Parse `deviceId`, `productNumber`, `applicationKey` as ordinary query parameters.
- Run a normal BLE scan and read `unitId`/`productNumber` out of the manufacturer-specific
  advertisement data (same bytes Garmin Connect itself reads pre-connect, per §4.4.5) to identify
  which nearby advertiser is the scanned watch and resolve its **MAC** that way — the QR itself
  never carries a MAC, but it removes the need to show the user a device-picker list, since
  `unitId`+`productNumber` uniquely identify the right advertisement.
- The normal GFDI 6-digit passkey bonding step is still required afterward — the QR does not
  bypass or weaken BLE-level security. `applicationKey` is not needed for the BLE connection; it
  only matters if Unified Health ever wants to call Garmin's own cloud OAuth endpoints on the
  user's behalf (not needed for local-only BLE sync).

**Open item needing a real watch/QR capture**: no literal QR string was recoverable from the
decompiled resources. A real capture (e.g. via any QR reader's "show raw text") would confirm:
whether `applicationKey` is present for all watch models or only certain ones, the exact format of
`applicationKey` (looks like an opaque string, not observed), and whether `connect.garmin.cn` vs
`connect.garmin.com` is used depending on region/firmware. See also §6.3 below.

---

## 5. Samsung (Samsung Health)

Lower priority per task scope (Galaxy Watch pairing is normally owned by the separate **Galaxy
Wearable** app / Wear OS companion flow, not by Samsung Health itself, and that app isn't in this
evidence set — **[Ext]**). Within the Samsung Health evidence available
(`docs/re-analysis/rea-output/samsung/classes_all.txt`), the only QR/zxing classes are:

```
com.samsung.android.app.shealth.social.together.ui.activity.QrCameraActivity
com.samsung.android.app.shealth.social.together.ui.activity.QrImageActivity
com.samsung.android.app.shealth.social.together.util.QrUtil$QrCodeValidationResult
com.samsung.android.app.shealth.widget.qrcode.*
```

All under `social.together` — Samsung Health's friend/challenge-invite QR feature, not device
pairing **[V, absence]**. No class in this dump ties a QR scan to `WearableDevice`/`SppClient`/MCF
discovery. **Conclusion: no evidence Samsung uses QR to bind a watch; treat as [Ext] that the
Galaxy Wearable app pairs via its own BT Classic/BLE discovery + bond dialog (no QR), consistent
with public Samsung documentation**, but this was not verified against Galaxy Wearable's own APK.

---

## 6. Implementation spec for Unified Health

### 6.1 Unified parser rules

```
detectQrPairing(rawText: String): PairingHint? {
  // Try Zepp/Huami format first (URL or bare query string)
  val uq = parseQuery(rawText)   // tolerant: works with or without scheme/host
  val mac = uq["macAddress"] ?: uq["mac"]
  if (mac != null && mac.matches(Regex("^[0-9A-Fa-f]{12}$"))) {
    val pnpNumber  = uq["pnpNumber"]?.toIntOrNull()
    val pnpVersion = uq["pnpVersion"]?.toIntOrNull()
    if (pnpNumber != null && pnpVersion != null) {
      return PairingHint.Zepp(mac = colonize(mac).uppercase(), pnpNumber, pnpVersion)
    }
  }

  // Try Huawei format: "t=<int>&(n|bt_name)=<name>&(r|PIN)=<6digits>"
  val parts = rawText.split("&").associate { it.substringBefore("=") to urlDecode(it.substringAfter("=", "")) }
  val type = parts["t"]?.toIntOrNull()
  val name = parts["n"] ?: parts["bt_name"]
  val pin  = parts["r"] ?: parts["PIN"]
  if (type != null && name != null) {
    return PairingHint.Huawei(deviceType = type, btName = name, pin = pin)
  }

  // Try Garmin format: an App Link URL, host {connect,connecttest}.garmin.com /
  // {connect,connectus}.garmin.cn, path "/mobile-link/gcm/pair-device"
  val garminUri = runCatching { Uri.parse(rawText) }.getOrNull()
  if (garminUri != null && garminUri.host?.endsWith("garmin.com") == true || garminUri?.host?.endsWith("garmin.cn") == true) {
    if (garminUri.path?.contains("/mobile-link/gcm/pair-device") == true) {
      val deviceId      = garminUri.getQueryParameter("deviceId")?.toLongOrNull()
      val productNumber = garminUri.getQueryParameter("productNumber")
      val applicationKey = garminUri.getQueryParameter("applicationKey")
      if (deviceId != null || productNumber != null) {
        return PairingHint.Garmin(unitId = deviceId, productNumber = productNumber, applicationKey = applicationKey)
      }
    }
  }

  return null   // not a recognized vendor QR — fall back to manual scan picker
}
```

### 6.2 Post-decode flow per vendor

| Vendor | After decode | Scan strategy | Notes |
|---|---|---|---|
| **Zepp** | Prefill target MAC + `(pnpNumber, pnpVersion)` → map to a `WatchModel` via the same PnP layout as live-connected devices (`vendorSource, vendorId, productId, productVersion`, see `ZEPP_DEVICE_PROTOCOL.md` §2.4) | BLE address-filtered scan, **30 s timeout** (match vendor behavior), fall back to name/service scan if address scan times out | No secret in QR; auth key still comes from cloud bind or manual Gadgetbridge-style extraction — QR does not change our auth story |
| **Huawei** | Prefill target name + device-type id; **do not** expect a MAC | **Classic BT discovery** (not BLE scan) matching `BluetoothDevice.getName()` against the QR name, 20 s timeout, then resolve MAC from the discovery result | PIN (if present) should be stored keyed by the resolved MAC and supplied to whatever HiChain-equivalent handshake we implement for Huawei — do **not** assume it's just a UI-echo value; treat as a secret input to auth. This needs real-device validation before relying on it. |
| **Garmin** | Prefill target `unitId` + `productNumber` (model) → map `productNumber` to a `WatchModel` the same way a live-connected device is recognized; **do not** expect a MAC or a passkey | **BLE discovery scan**, filter candidates by reading `unitId`/`productNumber` out of each advertisement's **manufacturer-specific data** (pre-connect, no GATT needed) and accept only the one matching both QR fields — this both resolves the **MAC** (from the matching `ScanResult`) and auto-picks the model, replacing the manual device-type picker | QR does **not** replace the GFDI 6-digit on-watch passkey/OS-bond step — still required after the match. `applicationKey` is a Garmin-cloud OAuth-scope id (used only for Garmin's own `/oauth-service/oauth/tokens/device/<applicationKey>` account exchange, `cd2/a.java:120-140`); irrelevant to our local BLE/GFDI auth and safe to ignore unless we ever call Garmin's cloud APIs ourselves. Needs a real captured QR string to confirm `applicationKey` presence/format across models (see §6.3). |
| **Coros, Samsung** | No QR integration needed | N/A | Coros/Samsung: regular scan + name-prefix/bond flow only |

### 6.3 Open questions needing a real watch

1. **Huawei PIN semantics** — confirm whether the HiChain-style handshake actually consumes the
   QR PIN as a PAKE input/shared secret, or merely as a numeric-comparison confirm value shown to
   the user during OS bonding. This repo's evidence (`cku`/`HandshakeUtils`) strongly suggests the
   former (cached per-MAC, read back during handshake) but the byte-level consumption inside the
   HiChain exchange was not traced.
2. **Huawei QR content on real hardware** — no literal example QR string was recoverable from
   decompiled strings/resources; need a real Huawei/Honor band or watch to confirm actual `t=`
   values, whether `n=`/`bt_name=` always equals the live BLE/BT-classic advertised name exactly,
   and whether newer firmware adds fields (e.g. serial) beyond `t`/`n`/`r`.
3. **Zepp QR scheme tolerance** — confirm on a real Amazfit/Xiaomi band whether the printed QR is
   always the full `https://api.amazfit.com/app.json?...` URL, or whether some models print a bare
   query string (the parser accepts both, but we've only seen the documented URL form referenced
   in prior analysis, not a literal captured string).
4. **Samsung** — this analysis did not inspect the Galaxy Wearable app (only Samsung Health); if
   Unified Health ever needs Samsung pairing, Galaxy Wearable's APK should be pulled into
   `docs/re-evidence/samsung-wearable/` and checked the same way.
5. **Coros "Helmet" classic-scan classes** (`HelmetClassicScanActivity`,
   `BtScanActivity` under `com.yf.smart.weloopx`) were seen in passing while searching for QR
   strings; unrelated to this task but worth a follow-up note in the Coros protocol doc if not
   already covered — they suggest at least one Coros accessory (a smart helmet) pairs over
   Bluetooth Classic rather than BLE.
6. **Garmin literal QR capture** — no raw QR text was recoverable from decompiled
   strings/resources; the field names (`deviceId`, `productNumber`, `applicationKey`) and host/path
   are explicit in code (§4.2), but we have not seen an actual populated example. Since the task
   says a real watch displayed this QR during pairing, the single highest-value next step is to
   capture that literal string (any QR reader's "show raw text/copy" option) and confirm: (a) which
   host variant it uses (`connect.garmin.com` vs `.cn`), (b) whether `applicationKey` is always
   present or only for certain models/firmware, and (c) its exact format (opaque token vs.
   structured string) — none of which could be determined from code alone.
