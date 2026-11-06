# TODO

Open work as of 2026-11-06. Decisions behind each item: [docs/DECISIONS.md](docs/DECISIONS.md).
Protocol gaps per brand: `docs/protocols/<BRAND>_IMPLEMENTATION_BRIEF.md` (items marked NEEDS-REAL-WATCH).

## Next: first real-device run

- [ ] Install the debug build on a physical phone and pair a real **Garmin** watch (the brand most likely to work as-is: once the phone is OS-bonded, GFDI has no app-layer crypto).
  - Before pairing: Developer options → *Enable Bluetooth HCI snoop log*, toggle Bluetooth once; force-stop Garmin Connect so it doesn't take the GFDI link.
  - Capture `adb logcat` during pair + sync; on failure collect `adb bugreport` (contains the HCI log).
  - Record the watch model: newer models use Multi-Link, which so far is covered by unit tests only (the simulator uses the dedicated GFDI service).
- [ ] Same run for a real **Zepp/Amazfit** watch (needs the user's auth key, or a fresh local bind).

## Needs a real watch or an HCI snoop log

- [ ] **Garmin:** whether pairing completes without the Garmin Connect cloud `registerDevice` step; whether firmware ever requires the service-4 registration path; 5023 battery layout; the four FIT checks in `FitHealthMapper` (resting HR 273, HRV 389, sampling scheme, per-activity counters); meaning of capability bit 29.
- [ ] **Zepp:** resting HR type 58 layout (inferred), sleep-stage enum, PAI/sport-summary/GPS layouts, `allowLocalBinding` on current firmware.
- [ ] **Huawei:** service-7 response layouts (steps, HR, sleep, SpO2, stress); 0x0103 response and 0x0132 TLV 0x01 layouts. Direct pairing needs Huawei's own keys, which we don't extract, so real Huawei data has to come through Health Connect.
- [ ] **COROS:** everything past recognition/bonding — command IDs (`BleCmdDefPb$CMD_E`), frame/ACK/CRC layout, which UUID family carries traffic, daily and workout (FIT) sync. The app is shell-protected; only a capture from a real watch can unblock this.
- [ ] **Standard SIG:** a brand watch recognised only by name may fall back to the SIG driver when it also exposes Heart Rate (D-602, provisional).

## App

- [ ] Two-way **Health Connect**: import (the path for Huawei/COROS today) and export, dedupe by `clientRecordId`, background sync with WorkManager.
- [ ] Sync-reminder notifications need a scheduler (WorkManager); the toggle is only persisted today (`TODO(notifications)`).
- [ ] Concurrent GATT links to several watches (today: many paired, one connected at a time, D-210).
- [ ] Charts: swipe to previous periods, tap a bar to inspect, a data-source priority screen.
- [ ] Device-native hourly distance/energy/exercise for the Day view (currently split by step share, D-207).
- [ ] Record types for blood pressure, temperature, weight and body composition (stored as raw payloads today).
- [ ] Imperial units; weight data source.
- [ ] Localization: move hard-coded UI strings to `strings.xml`, add `values-vi`.

## Release

- [ ] Release signing config, R8/ProGuard rules verified on a release build run on a device.
- [ ] Published privacy policy (required for Health Connect on Google Play) and the Play Data safety form.
- [ ] CI: `assembleDebug lint testDebugUnitTest` on every push; E2E on an emulator runner.
- [ ] Remove the debug-only *Developer* entries from screenshots used on the Play listing.

## Repo housekeeping

- [ ] `NoatToan/vibe-projects` history still contains the vendor APKs and decompiled sources from before the move; purge with `git filter-repo` + force-push when convenient.
- [ ] Refresh `docs/e2e-report/` after each full `scripts/e2e.sh` run.
