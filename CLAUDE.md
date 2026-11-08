# Unified Health — Claude Code guide

One Android app that connects directly over BLE to watches of every supported brand (Garmin,
Huawei/Honor, Zepp/Amazfit/Xiaomi, Coros, plus Bluetooth SIG standard devices) and syncs health
data locally. Kotlin, Jetpack Compose (Material 3), Hilt, Room, Health Connect. Replies to the user
are in Vietnamese; code, comments and commit messages are in English.

## Working model
- **Coding is delegated to Sonnet subagents.** The main session researches, plans, splits the work,
  reviews the diff and records decisions; it does not write feature code itself.
  - `android-coder` — features, UI, refactors, bug fixes in `core/*`, `feature/*`, `app/`, `scripts/`
  - `wearable-driver-engineer` — one `:driver:<brand>` module against the `core:ble` contract
  - `device-protocol-re` — reverse-engineer a vendor APK, then implement its driver
  - `e2e-flows` — E2E UI flows, mock devices, seeded data, screenshot report
  Give each agent a self-contained brief (goal, files, constraints, how to verify). Independent
  tasks run in parallel; tasks touching the same files run one after another.
- After an agent finishes, review its diff and re-run the checks below before reporting done.
- Decide autonomously and log each decision in `docs/DECISIONS.md` (`D-<area><nn>`, date,
  **Chốt** = settled / **Tạm** = provisional, then the reasoning).
- **Never guess a vendor protocol/message/field number and tag it `[Ext]` without checking
  `docs/re-evidence/<brand>/` first.** Every vendor's own companion app (Garmin Connect, Huawei
  Health, Zepp, …) bundles its full FIT/protocol profile inside the APK, so the real answer is
  almost always already sitting in `docs/re-evidence/<brand>/jadx-base/` — read it (via
  `claude-personal -p`, D-003) before inventing a field number from memory or general docs. D-1082
  is the cautionary example: three FIT message/field numbers were guessed `[Ext]` and two of three
  turned out wrong, discoverable by grepping evidence already on disk.

## Build & test
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21   # JDK 27 is not supported by AGP; the system x86 JDK cannot run here
./gradlew testDebugUnitTest          # all unit tests (JVM modules: :core:model:test, :core:domain:test)
./gradlew assembleDebug
scripts/e2e.sh                       # E2E flows + build/e2e-report/index.html (needs emulator/device)
```
Check the result: a quiet Gradle run that produced no test-result XML did not run.

## Layout
- `core/model` (pure JVM types) · `core/domain` (repositories, use cases) · `core/data` (Room,
  DataStore, Health Connect, repository impls) · `core/ble` (scanner, GATT, `WearableDriver` contract)
  · `core/designsystem` (theme, components) · `core/demo` (virtual watches for debug/E2E) · `core/testing`
- `driver/<brand>` — one module per vendor protocol; specs in `docs/protocols/`, evidence in `docs/re-evidence/`
- `feature/{onboarding,home,activity,devices,profile}` — screens + ViewModels; depend on domain/designsystem only
- Watch model recognition: `core/model/.../WatchModel.kt` (regex matcher) + generated `WatchCatalog.kt`;
  product images `core/designsystem/src/main/res/drawable-nodpi/watch_<id>.webp` via `scripts/gen_watch_catalog.py`
