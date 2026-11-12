# TODO

Open work as of 2026-11-11. Decisions behind each item: [docs/DECISIONS.md](docs/DECISIONS.md).
Protocol gaps per brand: `docs/protocols/<BRAND>_IMPLEMENTATION_BRIEF.md` (items marked NEEDS-REAL-WATCH).

## Next: test stages for the 2026-11-12 UI batch (D-1194 … D-1215)

Built and unit-tested; only partly checked on the emulator. Run these on the emulator (and one
real phone) before calling the batch done. Pass/fail notes go into the matching D- entry.

- [x] **Pill nav (critical):** tabs not switching — fixed by D-1216 (`onMainPager` was false while the
  back-stack entry was still null at startup). Checked on the emulator 2026-11-12: all 4 tabs switch,
  and Activity → workout detail → BACK lands on Activity with tabs still tappable. Re-check on a real phone.
- [ ] Pill hidden on scroll is not tappable, taps fall through to content (D-1195); scroll up → tappable.
- [ ] Home week rings (D-1205/D-1215): 2 rows, ~50dp, labels on one baseline; tap a past day →
  big ring + Move/Exercise/Steps switch, date label + "Hôm nay" shown; tap again / "Hôm nay" →
  back to today; future days not tappable; selection survives process death, resets on a new day.
- [ ] Home highlights read "… steps a day" / "… mỗi ngày" (D-1205); Metrics grid rows equal height.
- [ ] Workout detail (D-1201/D-1202/D-1206): split times vary and match the pace chart, every split
  row has a bar, fastest highlighted, "< 1 km" row; one HR line chart with zone bands; avg/max HR
  identical in grid and HR card; source reads "Đồng hồ demo" (no raw MAC, not in header); zero-minute
  zones show an empty track; vertical swipe starting on a chart scrolls the page.
- [ ] Gear (D-1203/D-1207/D-1209–1214): one merged ChipRow (categories | active filters), small gaps;
  filter sheet price/colour/gender (Nam/Nữ/Trẻ em), "Áp dụng" is the primary button; colour filter
  swaps card image to the matching variant and opens detail preselected; blur backdrop on
  mismatched-ratio photos (API 31+) / average-colour fill (API ≤30); smooth scroll over ~485 items.
- [ ] Devices (D-1200/D-1209–1214): no-device state shows only the onboarding card (no Scan FAB);
  with a paired device the "Add device" menu works and the FAB sits above the pill.
- [ ] RaceCard (D-1198): Ironman 70.3 card and a card with many distance chips at font scale 1.0 and
  1.3 — CTA never clipped, 70/30 header, "+N" chip.
- [ ] Activity list sticky month headers (D-1208); edge-to-edge on every screen (D-1194);
  spacing tokens look right everywhere (D-1204).
- [ ] Whole-app pass at font scale 1.3 and in dark mode.
- [ ] `scripts/e2e.sh` on the emulator (E2E selectors changed: `onboarding_scan_button`,
  `WorkoutsE2ETest` source text) + `./gradlew :app:compileReleaseKotlin` (release has no demo
  synthetic workout detail).
- [ ] Gear feed after the service push: app shows Li-Ning/Coolmate items and feed-provided gender.

## Next: first real-device run

- [x] Install the debug build on a physical phone and pair a real **Garmin** watch — done 2026-11-11 by
  the user: pair + sync worked (GFDI had no app-layer crypto issue as expected). Found missing
  pre-processed workout data (lap/sample) on synced workouts; already fixed by the backfill mechanism
  from raw stored FIT payloads (D-1176/D-1179, commit `9399e4f`). User is continuing to check real-device
  behavior and will report more findings. No HCI snoop log / bugreport saved to the repo yet (will be
  added later to `docs/re-evidence/garmin/` or `docs/real-device-demo/` when available) — log here once
  it lands, with watch model and whether it uses Multi-Link (unit-tested only so far).
- [ ] Same run for a real **Zepp/Amazfit** watch (needs the user's auth key, or a fresh local bind).
  Done 2026-11-12 for a **Xiaomi Smart Band 10** instead: confirmed (D-804/D-1188) it does NOT speak
  the Zepp/Huami protocol at all — no matching GATT service found, `UnsupportedDeviceException` as
  designed. Xiaomi's own (non-Huami) protocol is a completely separate, un-started reverse-engineering
  project (needs the Xiaomi Wear/Mi Fitness APK + `device-protocol-re`) — not a `:driver:zepp` bug.
- [ ] Garmin app-level auth (XXTEA 5101→5111) is implemented; verify on an unbonded watch that the
  soft-bond fallback lets the watch drive Garmin Auth, and confirm the 5111 frame-encryption switch.

## Needs a real watch or an HCI snoop log

- [ ] **Garmin:** whether pairing completes without the Garmin Connect cloud `registerDevice` step; whether firmware ever requires the service-4 registration path; 5023 battery layout; the four FIT checks in `FitHealthMapper` (resting HR 273, HRV 389, sampling scheme, per-activity counters); meaning of capability bit 29.
- [ ] **Zepp:** resting HR type 58 layout (inferred), sleep-stage enum, PAI/sport-summary/GPS layouts, `allowLocalBinding` on current firmware.
- [ ] **Xiaomi (non-Huami) driver — RE complete 2026-11-12, implementation not started.** Mi Fitness
  3.46.1 (`docs/apks/com.mi.health_…apk`) was analysed; the protocol is written up in
  `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` + `XIAOMI_IMPLEMENTATION_BRIEF.md` (evidence
  `docs/re-evidence/mi/`, local-only jadx tree). Next: Gate 0 on the real Smart Band 10 — probe
  `getBindInfo` (`verifyMode == 2` → local ECDH bind with no Xiaomi account; `== 1` → import the
  16-byte token from Mi Fitness logs, the Gadgetbridge-proven path). Cloud self-bind is blocked by
  Xiaomi's `miothealth` service token (see D-1193); Wear OS Mi Watch is out of scope (stub in APK).
- [ ] **Huawei:** direct BLE now works only for watches that report `authenticVersion == 0`; all other
  watches fail fast with a clear message (no CAK/HiChain extraction). Still open: service-7 response
  layouts, 0x0132 zone/IANA real-watch echo, 0x0103 support-vector edge cases, live-HR nesting/periodic
  re-open. Modern Huawei data has to come through Health Connect (import still TODO).
- [ ] **COROS:** connection state machine + capture diagnostics are in place; command IDs (`BleCmdDefPb$CMD_E`), frame/ACK/CRC layout, UUID roles and bond order still need one real-watch HCI snoop log.
- [ ] **Standard SIG:** a brand watch recognised only by name may fall back to the SIG driver when it also exposes Heart Rate (D-602, provisional).

## App

- [ ] Two-way **Health Connect**: import (the path for Huawei/COROS today) and export, dedupe by `clientRecordId`, background sync with WorkManager.
- [ ] Sync-reminder notifications need a scheduler (WorkManager); the toggle is only persisted today (`TODO(notifications)`).
- [ ] Concurrent GATT links to several watches (today: many paired, one connected at a time, D-210).
- [ ] Charts: swipe to previous periods, tap a bar to inspect, a data-source priority screen.
- [ ] Device-native hourly distance/energy/exercise for the Day view (currently split by step share, D-207).
- [ ] Record types for blood pressure, temperature, weight and body composition (stored as raw payloads today).
- [ ] Training mode (D-1185 static guide; D-1191 added picking one of the 4 Hal Higdon Novice plans,
  a generated day-by-day calendar, and check-in from the calendar or Home) — still open: the other
  plans (Couch to 5K, Galloway, Daniels VDOT, Hanson's, Pfitzinger, Intermediate 10K) aren't selectable,
  only described; and check-in is independent bookkeeping, not linked to the user's actual recorded
  workouts/activities yet (tapping "done" doesn't check whether a matching real run was synced).
- [ ] Weight data source (manual entry as its own record type; D-1183 wired Imperial/Metric *display*
  for distance/weight across Home + Activity — this item is now just about where weight values
  themselves come from, not units).
- [ ] Localization — D-1184 did `core/designsystem`/`feature/devices`/`feature/home`; D-1192 fixed the
  language-control bug (it always read "English" even when correctly following a Vietnamese system
  locale — now a real tri-state System/English/Tiếng Việt picker) and finished `feature/profile`,
  `feature/activity`, `feature/onboarding`, `app/.../notifications`. Still open:
  **`feature/races`/`feature/training`/`feature/gear`** — Vietnamese-only, no English version at all
  (~176 lines of editorial/marketing content: training-plan day text, race listings, gear copy) —
  needs natural translation, not mechanical extraction; its own dedicated task. Also still open, D-1184's
  original known gaps: ViewModel-built snackbar/toast text (needs `@ApplicationContext Context`
  injected into several ViewModels), `compactLabel()`'s 6-char layout constraint, chart a11y
  descriptions inside `Canvas` `DrawScope` lambdas in `HealthCharts.kt`. Also not yet confirmed on a
  real device: system-locale-follow and override-persists-across-restart actually work end to end.
- [ ] "Tủ đồ" (wardrobe) follow-up to D-1186's gear catalog (`feature/gear`, Profile entry, read-only
  browse + color picker, live): let the user add a product + the color variant they own, light
  gamification to encourage engagement (needs a new Room entity, e.g. `OwnedGear`, referencing the
  catalog item id + chosen color). Further out: a community feature to show off owned gear. Neither is
  built yet.

## Release

- [ ] Release signing config, R8/ProGuard rules verified on a release build run on a device.
- [ ] Published privacy policy (required for Health Connect on Google Play) and the Play Data safety form.
- [x] CI: `testDebugUnitTest`, `lintDebug`, `assembleDebug`, `assembleRelease` on every push/PR
  (`.github/workflows/ci.yml`), uploading the test/lint reports + both APKs as artifacts. Release APK is
  **unsigned** (no signing config yet — see the item above).
- [ ] CI: E2E on an emulator runner (`scripts/e2e.sh`) — not wired in yet, needs an Android emulator step.
- [ ] Remove the debug-only *Developer* entries from screenshots used on the Play listing.

## Repo housekeeping

- [ ] `NoatToan/vibe-projects` history still contains the vendor APKs and decompiled sources from before the move; purge with `git filter-repo` + force-push when convenient.
- [ ] Refresh `docs/e2e-report/` after each full `scripts/e2e.sh` run.
