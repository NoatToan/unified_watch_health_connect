# Implementation plan — build out from the RE outputs

Date: 2026-11-08. Source of truth: `docs/analysis/*` (connection + auth dossiers, merged from the local
RE trees). Execution model: **Sonnet agents** do the implementation; the lead (deepseek) owns the
auth/crypto core and reviews every diff. No vendor secret keys are extracted or embedded.

## 0. Already in flight (Wave 0 — corrections)

| Task | Owner | Scope |
|---|---|---|
| W0-DOC | Sonnet | Apply verified corrections to `docs/protocols/*` + briefs |
| W0-HW | Sonnet | Huawei 0x0101 diagnostic, 0x0107/0x0132/0x0103 parsers, handshake order, tests |
| W0-GA | Sonnet | Garmin time sync, 5023, service-4 order, MTU budget, tests |
| W0-ZP | Sonnet | Zepp 0x80 local bind, v1 gating, FEE0 time sync, battery, tests |

## 1. Garmin (highest chance of working with a real watch)

| ID | Owner | Task | Evidence |
|---|---|---|---|
| G5 | **deepseek** | **Garmin Auth core**: XXTEA codec, 5101→5103→5104/5105→5106→5107→5108→5109→5111 state machine, `ss2.p` session frame cipher, `AuthInfo(ltk/ediv/rand)` persistence | `docs/analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md` |
| G5-UI | Sonnet | Passkey prompt (6-digit) + OOB hook wired to the auth session; UI never blocks the main thread | G5 API |
| G6 | Sonnet | Robustness: 30 s handshake watchdog, KEY_MISSING → tear down + re-bond hint, retry/backoff around connect, tests | `GARMIN_CONNECTION_ANALYSIS.md` §2/§4 |
| G7 | Sonnet | Simulator support: scripted 5101–5111 exchange + encrypted GFDI frame so the auth path is unit/E2E tested without hardware | G5 |
| G8 | Sonnet | Wire auth into `GarminSession`: OS bond first; fall back to Garmin Auth only when bond is absent/rejected (`isGarminAuthAllowed`), matching vendor behavior | `GARMIN_AUTH_CRYPTO_ANALYSIS.md` §5 |

Definition of done: unit tests with byte vectors for XXTEA and the state machine; simulator E2E pair+sync;
real-watch TODO remains only for cloud `registerDevice` and firmware acceptance.

## 2. Zepp / Amazfit

| ID | Owner | Task | Evidence |
|---|---|---|---|
| Z5 | Sonnet | Robustness: 120 s whole-handshake watchdog, GATT cache refresh on API 28+, GDSP 3× sync retry, v2 ACK retry semantics (NEED_REPLY every 16th + last packet), tests | `ZEPP_CONNECTION_ANALYSIS.md` §4 |
| Z6 | Sonnet | Simulator: cover 0x80 local bind + v1 legacy path + FEE0 time sync + module 0x29 battery | Wave 0 code |
| Z7 | Sonnet | Local-bind UX: when the watch reports `allowLocalBinding=1`, offer "use my key" instead of failing; never attempt cloud bind | `ZEPP_AUTH_CRYPTO_ANALYSIS.md` §3.2 |

Definition of done: both 0x80 and 0x82 local bind covered by tests; v1 watches skip module queries; real
watch still needs `allowLocalBinding` confirmation.

## 3. Huawei

| ID | Owner | Task | Evidence |
|---|---|---|---|
| H2 | Sonnet | **No-auth path**: when 0x0101 reports `authenticVersion == 0`, skip auth and continue `0107→0105→0102→0103→…`; guard it behind the parsed flag, with a simulator test. Auth type comes from 0x0101 **TLV 7** (not TLV 17) | `HUAWEI_AUTH_CRYPTO_ANALYSIS.md` §1.1, `HUAWEI_CONNECTION_ANALYSIS.md` |
| H3 | **deepseek** | Auth feasibility boundary: document that HiChainLite/HiChain/legacy require Huawei white-box CAK; no implementation, no key extraction. Add the decision record | `HUAWEI_AUTH_CRYPTO_ANALYSIS.md` §6 |
| H4 | Sonnet | If `authType != 0` and no auth: fail fast with a precise capability message ("direct BLE not available; use Health Connect") instead of a generic `UnsupportedDeviceException` | H2/H3 |
| H5 | Sonnet | Health Connect import (app-level, not RE): pull Huawei-exported records, dedupe by `clientRecordId`, map to existing models. Implement behind a feature flag | `TODO.md` |

Definition of done: Huawei watch with `authenticVersion=0` can complete transport + basic ops in the
simulator; modern watches produce a clear, honest error; Health Connect import works when enabled.

## 4. COROS

| ID | Owner | Task | Evidence |
|---|---|---|---|
| C2 | Sonnet | Keep the verified basics (bond, DIS/battery/HR). Do **not** invent command IDs; add the protocol state-machine skeleton only where names are verified | `COROS_CONNECTION_ANALYSIS.md` |
| C3 | Sonnet | Add a "capture needed" diagnostic screen: record HCI hint + advertise name/UUIDs to make the next real-watch session productive | C2 |
| C4 | **deepseek** | When a capture/non-shelled APK arrives, decode the command layer; otherwise mark blocked | `COROS_AUTH_CRYPTO_ANALYSIS.md` |

Definition of done: no fabricated protocol; blockers are explicit; one capture unblocks the next wave.

## 5. Cross-cutting

| ID | Owner | Task |
|---|---|---|
| X1 | Sonnet | Run `./gradlew testDebugUnitTest lint assembleDebug`; fix regressions; produce a debug APK |
| X2 | Sonnet | Extend simulator/E2E flows for Garmin Auth, Zepp local bind, Huawei no-auth; keep screenshots report current |
| X3 | Sonnet | Update `docs/analysis/IMPLEMENTATION_PLAN.md` status + `TODO.md` after each wave |
| X4 | deepseek | Review every security-adjacent diff (Garmin Auth, Zepp bind, Huawei auth boundary) |

## 6. Security boundary (non-negotiable)

- Garmin Auth uses only values exchanged with the user's own watch (passkey, STK, LTK, session key).
- Zepp uses the user-supplied key; cloud first-bind signature is not implemented.
- Huawei: only the `authenticVersion == 0` no-auth branch is implemented. CAK/white-box/HiChain are not
  extracted, emulated or embedded; modern watches get an honest capability message.
- COROS: no protocol invention; capture-driven only.

## 7. Execution order

1. Finish Wave 0 (corrections + tests green).
2. G5 (deepseek) in parallel with Z5/G6 (Sonnet).
3. G5-UI/G7/G8 + Z6/Z7 + H2/H4 (Sonnet).
4. X1–X3 build/E2E/docs.
5. Real-watch runs: Garmin → Zepp → COROS capture → Huawei diagnostic.

## 8. Status — 2026-11-08

Done:
- W0-DOC, W0-HW, W0-GA, W0-ZP — protocol docs and driver corrections applied; per-brand unit suites green.
- G5/G5-UI/G8 — Garmin Auth core + state machine + passkey hook + secure frame cipher + soft-bond
  fallback; vendor XXTEA vector and state-machine tests pass.
- Z5/Z6 — Zepp watchdog, GATT cache refresh (opt-in), GDSP retry, channel ACK retry, pushed battery.
- H2/H4 — Huawei no-auth path (`authVersion == 0`) + clear error for auth-required watches.
- H5 — Huawei live HR (service 23 cmd 18 + notify cmd 3 TLV 3, 1-byte TLV 4 fallback).
- H3 — Huawei auth boundary recorded (D-322); no CAK/HiChain extraction.
- C2/C3 — COROS connection state machine + capture diagnostics; no invented commands.

Remaining:
- G6 — Garmin handshake watchdog / KEY_MISSING teardown (partially covered by timeouts; not a full
  vendor-style watchdog).
- G7 — Garmin Auth simulator (watch side of 5101–5111) for E2E; the state machine is unit-tested.
- X1 — full build/test/lint/APK (in progress).
- X2 — extend E2E flows for Garmin Auth / Zepp local bind / Huawei no-auth beyond JVM simulators.
- Real-watch runs for every brand (no HCI captures yet).
