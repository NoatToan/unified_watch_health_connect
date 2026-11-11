# TODO

Open work as of 2026-11-11. Decisions behind each item: [docs/DECISIONS.md](docs/DECISIONS.md).
Protocol gaps per brand: `docs/protocols/<BRAND>_IMPLEMENTATION_BRIEF.md` (items marked NEEDS-REAL-WATCH).

## Next: first real-device run

- [x] Install the debug build on a physical phone and pair a real **Garmin** watch — done 2026-11-11 by
  the user: pair + sync worked (GFDI had no app-layer crypto issue as expected). Found missing
  pre-processed workout data (lap/sample) on synced workouts; already fixed by the backfill mechanism
  from raw stored FIT payloads (D-1176/D-1179, commit `9399e4f`). User is continuing to check real-device
  behavior and will report more findings. No HCI snoop log / bugreport saved to the repo yet (will be
  added later to `docs/re-evidence/garmin/` or `docs/real-device-demo/` when available) — log here once
  it lands, with watch model and whether it uses Multi-Link (unit-tested only so far).
- [ ] Same run for a real **Zepp/Amazfit** watch (needs the user's auth key, or a fresh local bind).
- [ ] Garmin app-level auth (XXTEA 5101→5111) is implemented; verify on an unbonded watch that the
  soft-bond fallback lets the watch drive Garmin Auth, and confirm the 5111 frame-encryption switch.

## Needs a real watch or an HCI snoop log

- [ ] **Garmin:** whether pairing completes without the Garmin Connect cloud `registerDevice` step; whether firmware ever requires the service-4 registration path; 5023 battery layout; the four FIT checks in `FitHealthMapper` (resting HR 273, HRV 389, sampling scheme, per-activity counters); meaning of capability bit 29.
- [ ] **Zepp:** resting HR type 58 layout (inferred), sleep-stage enum, PAI/sport-summary/GPS layouts, `allowLocalBinding` on current firmware.
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
- [ ] Imperial units; weight data source. Partial: `UnitSystem.METRIC/IMPERIAL` enum + toggle exist in
  Profile (`UserPreferences.kt`), but nothing reads it yet — distance/weight display is still
  hardcoded km/kg everywhere (`MetricFormat.kt`, `MetricIcons.kt`, `WorkoutUi.kt`, `ActivityScreen.kt`,
  `WorkoutDetailScreen.kt`). Needs wiring, not just the data model.
- [ ] Localization: move hard-coded UI strings to `strings.xml`, add `values-vi`. D-1040 already decided
  the structure (shared strings in `core/designsystem`, per-screen in each `feature/*`, EN baseline +
  VI toggle via `AppCompatDelegate.setApplicationLocales`) and the module order (devices → home →
  profile → app/notifications → activity → onboarding), but it's not implemented: 0 `stringResource(`
  calls in the codebase, no `values-vi/` folder yet.

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
