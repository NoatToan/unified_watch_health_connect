# COROS auth — evidence-limited analysis

Status: 2026-11-08. Scope: COROS 4.11.8 Android app (shell-wrapped APK). Evidence is **strings/class
inventory only** — no method bodies, no jadx sources, no native BLE lib.
Tags: [V] observed string/class, [I] inferred, [uncertain] unresolved.

## 1. What the evidence shows

Auth-related classes in `com.yf.lib.bluetooth.request.*` (the BLE SDK namespace):

| Class | Kind | Meaning |
|---|---|---|
| `YfBtAuth` | type | auth request marker |
| `YfBtAuthState` | type | auth state enum/values |
| `YfBtParamAuth` | param | auth request parameter |
| `YfBtSystemBond` / `YfBtSystemBondAuth` / `YfBtSystemBondPod2` | types | OS bond (system pairing) requests |
| `YfBtParamSystemBond` | param | bond request parameter |
| `YfBtResultSystemBond`, `YfBtResultSystemBondKt`, `YfBtResultSystemBondPod` | result | bond result |
| `Lcom/yf/lib/bluetooth/request/result/YfBtResultSystemBondPod;` | result | bond result POD |

Strings: `createSystemBond error-only response, errorCode=0x%02X, data=%s` and `createSystemBond error`
[V, `strings_classes.txt` lines 112630, 456734].

Interpretation: COROS uses **OS-level BLE bonding** (`createSystemBond` + bond-state result) as the
security step; `YfBtAuth`/`YfBtAuthState` appear to track that bond/auth state. There is no evidence of an
application-level ECDH/key-exchange handshake in the BLE SDK strings [I, medium confidence].

## 2. Crypto provenance checks

- **No AES class inside `com.yf.lib.bluetooth`** — a class-inventory grep for
  `Lcom/yf/.../*AES*;` returns nothing [V].
- `AES128Encode` / `AES128Decode` / `AES128PaddingDecode` / `AESEncryptDecrypt` strings exist in the APK,
  but `AESEncryptDecrypt` is `com.snap.corekit.security.AESEncryptDecrypt` (Snapchat SDK). The others
  have no `com.yf` class reference nearby [V]; likely local storage / third-party SDK, not the BLE link
  [I].
- `BizPublicKey`, `BizPublicKeys`, `NetAuthRequest`, `NetAuthRequest$Content`,
  `NetAuthRequest$AuthorizedDevice` are in `com.yf.smart.weloopx.module.partnersdk.data.model` — the
  **official Partner SDK cloud/AIDL integration**, a separate path from direct BLE [V].

Conclusion: no COROS BLE app-layer cipher material is identifiable from strings alone. The working
assumption is BLE link-layer encryption after OS bond [I], matching `driver/coros`'s current design.

## 3. Implementability in `driver/coros`

Current driver: recognition → require OS bond → SIG DIS `0x180A` + Battery `0x180F` + Heart Rate `0x2A37`
when present; no vendor handshake or history sync (`CorosDriver.kt`, `CorosSession.kt`).

For auth specifically, nothing further is implementable from the available artifacts. The remaining
unknowns are all byte-level:

- bond-before-GATT vs GATT-before-bond ordering,
- whether `YfBtAuth` sends a token after the bond (and its layout),
- command IDs / frame layout for the vendor protocol (`BleCmdDefPb$CMD_E` values were lost to the
  shell wrapper),
- whether any payload encryption exists beyond the BLE link.

## 4. Cheapest unblock path

1. **Real-watch HCI snoop log** (Android Developer options → Bluetooth HCI snoop log; pair + sync with
   the vendor app once). This alone resolves bond ordering and whether post-bond app crypto runs.
2. If the log shows app-layer payloads that look encrypted, obtain a **non-shelled APK** (older version,
   or a build without the packer) and re-run jadx on the `com.yf.lib.bluetooth` package.
3. The **official COROS Partner SDK** (AIDL, cloud-auth via `NetAuthRequest`) is a sanctioned alternative
   but is out of scope for a local-only app (decision D-106).

No vendor secrets are extracted or embedded; there is nothing to extract from the available material.

## 5. Evidence index

| Fact | Evidence |
|---|---|
| Bond/auth class inventory | `rea-output/coros/strings_classes.txt` (lines ~441046-441380) |
| `createSystemBond` error string | `rea-output/coros/strings_classes.txt` (lines ~112630, ~456734) |
| Partner SDK models | `rea-output/coros/strings_classes.txt` (lines ~246161, ~592196, ~608175) |
| Curated notes | `unified_health_app/docs/re-evidence/coros/ble-architecture-strings.md`, `native-lib-analysis.md`, `uuid-strings.md` |
| Driver state | `unified_health_app/driver/coros/src/main/kotlin/com/unified/health/driver/coros/CorosSession.kt` |
