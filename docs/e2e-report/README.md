# Unified Health — E2E report

Generated 2026-11-06 23:25:26 +07 · Google sdk_gphone64_arm64, Android 16 (API 36) · serial `emulator-5554` · AVD `hc_api36`

**19 flows · 98/98 steps passed**

## 01. Onboarding → permissions

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-welcome<br>![01-welcome](01-onboarding/01-welcome.png) | Launch the app on a fresh install → Welcome screen with "Get started" | PASS |
| 2 | 02-permissions<br>![02-permissions](01-onboarding/02-permissions.png) | Tap "Get started" → Permissions list: Bluetooth, notifications, Health Connect, background | PASS |
| 3 | 03-bluetooth-system-dialog<br>![03-bluetooth-system-dialog](01-onboarding/03-bluetooth-system-dialog.png) | Tap "Allow" on Nearby devices → Android shows its runtime-permission dialog | PASS |
| 4 | 04-bluetooth-granted<br>![04-bluetooth-granted](01-onboarding/04-bluetooth-granted.png) | Tap "Allow" in the system dialog → Nearby devices row shows a granted check mark | PASS |
| 5 | 05-summary-empty<br>![05-summary-empty](01-onboarding/05-summary-empty.png) | Tap "Continue" → Summary opens with "No device paired" | PASS |

## 02. Devices → scan → pair → sync

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-devices-empty<br>![01-devices-empty](02-pair-mock-watch/01-devices-empty.png) | Open the Devices tab → "No device paired yet" card | PASS |
| 2 | 02-scanning<br>![02-scanning](02-pair-mock-watch/02-scanning.png) | Tap "Scan" → Scan runs and the simulated watch is listed with its brand | PASS |
| 3 | 03-connected<br>![03-connected](02-pair-mock-watch/03-connected.png) | Tap "Pair" on UH Demo Watch → Device moves to My devices, status Connected, battery and firmware read | PASS |
| 4 | 04-synced<br>![04-synced](02-pair-mock-watch/04-synced.png) | Tap "Sync now" → Sync completes; "Last sync" shows a time instead of "never" | PASS |

## 03. Summary

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-pinned<br>![01-pinned](03-summary/01-pinned.png) | Open the Summary tab → Pinned cards show synced values (steps, heart rate, sleep…) | PASS |
| 2 | 02-rings-and-highlights<br>![02-rings-and-highlights](03-summary/02-rings-and-highlights.png) | Scroll down → Activity rings and Highlights comparing the last 7 days | PASS |
| 3 | 03-edit-pinned<br>![03-edit-pinned](03-summary/03-edit-pinned.png) | Tap Edit, pin Heart rate variability, Done → A new pinned card for HRV appears | PASS |

## 04. Metric detail: D / W / M / 6M / Y

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-steps-week<br>![01-steps-week](04-metric-detail/01-steps-week.png) | Tap the Steps card → Steps page, W selected, daily average + bar chart | PASS |
| 2 | 02-steps-d<br>![02-steps-d](04-metric-detail/02-steps-d.png) | Tap D → D selected, header TOTAL, chart has data | PASS |
| 3 | 03-steps-m<br>![03-steps-m](04-metric-detail/03-steps-m.png) | Tap M → M selected, header DAILY AVERAGE, chart has data | PASS |
| 4 | 04-steps-6m<br>![04-steps-6m](04-metric-detail/04-steps-6m.png) | Tap 6M → 6M selected, header DAILY AVERAGE, chart has data | PASS |
| 5 | 05-steps-y<br>![05-steps-y](04-metric-detail/05-steps-y.png) | Tap Y → Y selected, header DAILY AVERAGE, chart has data | PASS |
| 6 | 06-show-all-data<br>![06-show-all-data](04-metric-detail/06-show-all-data.png) | Tap "Show all data" → Daily totals listed newest first with the source watch | PASS |
| 7 | 07-heart-rate-range<br>![07-heart-rate-range](04-metric-detail/07-heart-rate-range.png) | Back to Summary, open Heart rate → Range header (min–max bpm) and range chart | PASS |
| 8 | 08-sleep-stages<br>![08-sleep-stages](04-metric-detail/08-sleep-stages.png) | Back, open Sleep, tap D → Last night's sleep stage chart with Awake/REM/Core/Deep | PASS |

## 05. Browse: categories → metrics

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-categories<br>![01-categories](05-browse/01-categories.png) | Back to Summary, open the Browse tab → Health categories: Activity, Heart, Respiratory, Sleep… | PASS |
| 2 | 02-heart-category<br>![02-heart-category](05-browse/02-heart-category.png) | Tap Heart → Heart rate, Resting heart rate and HRV listed | PASS |
| 3 | 03-resting-heart-rate<br>![03-resting-heart-rate](05-browse/03-resting-heart-rate.png) | Tap Resting heart rate → Average resting heart rate with a daily chart | PASS |
| 4 | 04-search<br>![04-search](05-browse/04-search.png) | Back, search "oxygen" → Blood oxygen is the only match | PASS |

## 06. Devices → unpair

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-device-menu<br>![01-device-menu](06-unpair/01-device-menu.png) | Open Devices, tap ⋮ on the watch → Menu with Unpair | PASS |
| 2 | 02-confirm<br>![02-confirm](06-unpair/02-confirm.png) | Tap Unpair → Confirmation dialog explains synced data is kept | PASS |
| 3 | 03-unpaired<br>![03-unpaired](06-unpair/03-unpaired.png) | Confirm → Watch removed; "No device paired yet" again | PASS |
| 4 | 04-data-kept<br>![04-data-kept](06-unpair/04-data-kept.png) | Open Summary → Synced history is still shown without a device | PASS |

## 07. Profile › Developer: seed demo data

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-profile-developer<br>![01-profile-developer](07-debug-seed/01-profile-developer.png) | Finish onboarding, open Profile → Developer section (debug only) with Seed / Clear | PASS |
| 2 | 02-seeded<br>![02-seeded](07-debug-seed/02-seeded.png) | Tap "Seed demo data" → Status reports the records written | PASS |
| 3 | 03-summary<br>![03-summary](07-debug-seed/03-summary.png) | Open Summary → Pinned metrics show seeded values | PASS |

## 08. Every metric chart after seeding

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-steps<br>![01-steps](08-all-charts/01-steps.png) | Browse › search "Steps" › open › M → Header has a value and the chart has data | PASS |
| 2 | 02-heart-rate<br>![02-heart-rate](08-all-charts/02-heart-rate.png) | Browse › search "Heart rate" › open › M → Header has a value and the chart has data | PASS |
| 3 | 03-sleep<br>![03-sleep](08-all-charts/03-sleep.png) | Browse › search "Sleep" › open › D → Header has a value and the chart has data | PASS |
| 4 | 04-spo2<br>![04-spo2](08-all-charts/04-spo2.png) | Browse › search "Blood oxygen" › open › M → Header has a value and the chart has data | PASS |
| 5 | 05-stress<br>![05-stress](08-all-charts/05-stress.png) | Browse › search "Stress" › open › M → Header has a value and the chart has data | PASS |
| 6 | 06-calories<br>![06-calories](08-all-charts/06-calories.png) | Browse › search "Active energy" › open › M → Header has a value and the chart has data | PASS |
| 7 | 07-distance<br>![07-distance](08-all-charts/07-distance.png) | Browse › search "Walking + running distance" › open › M → Header has a value and the chart has data | PASS |
| 8 | 08-exercise-minutes<br>![08-exercise-minutes](08-all-charts/08-exercise-minutes.png) | Browse › search "Exercise minutes" › open › M → Header has a value and the chart has data | PASS |
| 9 | 09-resting-heart-rate<br>![09-resting-heart-rate](08-all-charts/09-resting-heart-rate.png) | Browse › search "Resting heart rate" › open › M → Header has a value and the chart has data | PASS |
| 10 | 10-hrv<br>![10-hrv](08-all-charts/10-hrv.png) | Browse › search "Heart rate variability" › open › M → Header has a value and the chart has data | PASS |
| 11 | 11-year-heart-rate<br>![11-year-heart-rate](08-all-charts/11-year-heart-rate.png) | Open Heart rate › Y → Twelve monthly min–max ranges | PASS |

## 09. Profile › Developer: clear health data

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-cleared<br>![01-cleared](09-clear-data/01-cleared.png) | Profile › "Clear health data" → Status confirms the wipe | PASS |
| 2 | 02-summary-empty<br>![02-summary-empty](09-clear-data/02-summary-empty.png) | Open Summary → Pinned cards show "No data" | PASS |

## 10. Devices → scan → pair → sync → unpair (Huawei)

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-onboarding<br>![01-onboarding](10-huawei-watch/01-onboarding.png) | Finish onboarding with Bluetooth granted → Summary opens with "No device paired" | PASS |
| 2 | 02-scanning<br>![02-scanning](10-huawei-watch/02-scanning.png) | Open Devices, tap "Scan" → The simulated Huawei watch is listed with its brand | PASS |
| 3 | 03-connected<br>![03-connected](10-huawei-watch/03-connected.png) | Tap "Pair" → Real 0x5A/TLV/AES-CBC handshake completes: Connected, battery and firmware from 0x0107, attributed to Huawei | PASS |
| 4 | 04-synced<br>![04-synced](10-huawei-watch/04-synced.png) | Tap "Sync now" → The real sweep (link nego → time sync → service 7 probes) completes without error | PASS |
| 5 | 05-device-menu<br>![05-device-menu](10-huawei-watch/05-device-menu.png) | Tap ⋮ on the watch → Menu with Unpair | PASS |
| 6 | 06-confirm<br>![06-confirm](10-huawei-watch/06-confirm.png) | Tap Unpair → Confirmation dialog explains synced data is kept | PASS |
| 7 | 07-unpaired<br>![07-unpaired](10-huawei-watch/07-unpaired.png) | Confirm → Watch removed; "No device paired yet" again | PASS |

## 13. Activity: weekly load → workouts → workout detail

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-activity-empty<br>![01-activity-empty](13-workouts/01-activity-empty.png) | Finish onboarding, open the Activity tab → "No workouts yet" empty state | PASS |
| 2 | 02-seeded<br>![02-seeded](13-workouts/02-seeded.png) | Profile › Developer › "Seed demo data" → 90 days of data written, including ~4 workouts a week | PASS |
| 3 | 03-activity-load<br>![03-activity-load](13-workouts/03-activity-load.png) | Open the Activity tab → Weekly activity load card: value, trend vs. the last 4 weeks, 8-week chart | PASS |
| 4 | 04-workout-list<br>![04-workout-list](13-workouts/04-workout-list.png) | Scroll to the workouts → Workouts grouped by month, newest first, with duration/distance/kcal | PASS |
| 5 | 05-workout-detail<br>![05-workout-detail](13-workouts/05-workout-detail.png) | Tap the newest workout → Detail: workout time, distance, energy, pace, avg/max heart rate | PASS |
| 6 | 06-workout-heart-rate<br>![06-workout-heart-rate](13-workouts/06-workout-heart-rate.png) | Scroll to Heart rate and Source → Heart rate over the workout and the recording watch | PASS |
| 7 | 07-back-to-list<br>![07-back-to-list](13-workouts/07-back-to-list.png) | Tap Back → Back on the Activity tab | PASS |

## 14. Devices › Device settings (About this device)

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-paired<br>![01-paired](14-device-settings/01-paired.png) | Pair the simulated watch from Devices → Watch connected in My devices | PASS |
| 2 | 02-menu<br>![02-menu](14-device-settings/02-menu.png) | Tap ⋮ on the watch → Menu offers "Device settings" (no longer "coming soon") | PASS |
| 3 | 03-about<br>![03-about](14-device-settings/03-about.png) | Tap "Device settings" → Name, brand, model, firmware, battery and Bluetooth address | PASS |
| 4 | 04-capabilities<br>![04-capabilities](14-device-settings/04-capabilities.png) | Scroll to Capabilities → History sync, live heart rate and battery level are supported | PASS |
| 5 | 05-synced<br>![05-synced](14-device-settings/05-synced.png) | Scroll up, tap "Sync now" → Sync completes; Last sync shows a time instead of "Never" | PASS |
| 6 | 06-confirm-unpair<br>![06-confirm-unpair](14-device-settings/06-confirm-unpair.png) | Scroll down, tap "Unpair this device" → Confirmation dialog: synced data is kept | PASS |
| 7 | 07-unpaired<br>![07-unpaired](14-device-settings/07-unpaired.png) | Confirm → Back on Devices with no paired watch | PASS |

## 15. Profile › Notifications

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-settings<br>![01-settings](15-notifications/01-settings.png) | Finish onboarding, Profile › Notifications → Goal achieved and low battery on, sync reminders off | PASS |
| 2 | 02-permission-needed<br>![02-permission-needed](15-notifications/02-permission-needed.png) | (Android 13+) notifications not yet allowed, tap "Allow" → Card explains alerts are blocked; Android asks for permission | PASS |
| 3 | 03-permission-granted<br>![03-permission-granted](15-notifications/03-permission-granted.png) | Tap "Allow" in the system dialog → The blocked-notifications card disappears | PASS |
| 4 | 04-toggled<br>![04-toggled](15-notifications/04-toggled.png) | Turn off Goal achieved, turn on Sync reminders → Switches reflect the new choice | PASS |
| 5 | 05-persisted<br>![05-persisted](15-notifications/05-persisted.png) | Back, open Notifications again → Choices were saved (DataStore) | PASS |

## 20. Devices → scan → pair → generate key → bind → connected

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-onboarding<br>![01-onboarding](20-zepp-pair/01-onboarding.png) | Finish onboarding, grant Bluetooth → Summary opens with no device paired | PASS |
| 2 | 02-scanning<br>![02-scanning](20-zepp-pair/02-scanning.png) | Open Devices, tap Scan → The simulated Zepp watch is listed with its brand | PASS |
| 3 | 03-paired-needs-key<br>![03-paired-needs-key](20-zepp-pair/03-paired-needs-key.png) | Tap "Pair" → Device moves to My devices and asks for its auth key (no credential yet) | PASS |
| 4 | 04-generate-key<br>![04-generate-key](20-zepp-pair/04-generate-key.png) | Tap "Enter Zepp auth key" then "Create a new key and bind this watch" → A key is generated and shown once, to back up | PASS |
| 5 | 05-connected<br>![05-connected](20-zepp-pair/05-connected.png) | Tap "Done" → The watch accepts the local bind; the device becomes Connected with battery and firmware read | PASS |

## 21. Sync now: steps, heart rate, SpO2 and stress over GDSP

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-synced<br>![01-synced](21-zepp-sync/01-synced.png) | Tap "Sync now" → Sync completes; "Last sync" shows a time instead of "never" | PASS |

## 22. Summary and Browse show the synced data with Zepp source attribution

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-summary<br>![01-summary](22-zepp-summary/01-summary.png) | Open Summary → Pinned heart rate and steps cards show synced values | PASS |
| 2 | 02-show-all-data<br>![02-show-all-data](22-zepp-summary/02-show-all-data.png) | Open Steps, tap "Show all data" → A daily row is attributed to the Zepp watch by name and brand | PASS |
| 3 | 03-browse-spo2<br>![03-browse-spo2](22-zepp-summary/03-browse-spo2.png) | Back twice, Browse → search "oxygen" → open → Blood oxygen has a value from the synced SpO2 points | PASS |
| 4 | 04-browse-stress<br>![04-browse-stress](22-zepp-summary/04-browse-stress.png) | Back, search "stress" → open → Stress has a value from the synced all-day stress data | PASS |

## 23. Devices → unpair

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-device-menu<br>![01-device-menu](23-zepp-unpair/01-device-menu.png) | Open Devices, tap ⋮ on the watch → Menu with Unpair | PASS |
| 2 | 02-confirm<br>![02-confirm](23-zepp-unpair/02-confirm.png) | Tap Unpair, confirm → Watch removed; synced data from it is kept | PASS |

## 40. Garmin watch (driver:garmin, dedicated GFDI service)

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-scan<br>![01-scan](40-garmin-watch/01-scan.png) | Open Devices, tap Scan → Forerunner 965 is listed as Garmin | PASS |
| 2 | 02-connected<br>![02-connected](40-garmin-watch/02-connected.png) | Tap Pair → No credential asked; GFDI handshake completes with device info and battery | PASS |
| 3 | 03-synced<br>![03-synced](40-garmin-watch/03-synced.png) | Tap "Sync now" → Directory + two FIT files download; "Last sync" shows a time | PASS |
| 4 | 04-summary<br>![04-summary](40-garmin-watch/04-summary.png) | Open Summary → Pinned heart rate and steps cards show synced values | PASS |
| 5 | 05-steps-source<br>![05-steps-source](40-garmin-watch/05-steps-source.png) | Open Steps, tap "Show all data" → A daily row is attributed to the Garmin watch by name and brand | PASS |
| 6 | 06-resting-hr-and-hrv<br>![06-resting-hr-and-hrv](40-garmin-watch/06-resting-hr-and-hrv.png) | Back twice, Browse → Heart → Resting heart rate and HRV both have values from the synced FIT file | PASS |
| 7 | 07-sleep-and-workout<br>![07-sleep-and-workout](40-garmin-watch/07-sleep-and-workout.png) | Back, Browse → Sleep › D, then Activity › workout → Sleep stages and the synced running workout both show up | PASS |
| 8 | 08-unpair<br>![08-unpair](40-garmin-watch/08-unpair.png) | Devices › ⋮ › Unpair › confirm → Watch removed; synced data from it is kept | PASS |

## 60. Bluetooth SIG band (driver:standard)

| # | Step | Action → expected | Result |
|---|---|---|---|
| 1 | 01-scan<br>![01-scan](60-standard-watch/01-scan.png) | Open Devices, tap Scan → SIG Pulse Band is listed as Bluetooth standard | PASS |
| 2 | 02-connected<br>![02-connected](60-standard-watch/02-connected.png) | Tap Pair → Connected; battery and firmware read from the SIG Battery / Device Information services | PASS |
| 3 | 03-synced<br>![03-synced](60-standard-watch/03-synced.png) | Let the band stream ~5 s of heart rate, tap Sync now → Sync completes; "Last sync" shows a time | PASS |
| 4 | 04-summary-heart-rate<br>![04-summary-heart-rate](60-standard-watch/04-summary-heart-rate.png) | Open Summary → Heart rate card shows the streamed bpm | PASS |
| 5 | 05-heart-rate-source<br>![05-heart-rate-source](60-standard-watch/05-heart-rate-source.png) | Open Heart rate › Show all data → Readings attributed to SIG Pulse Band | PASS |
| 6 | 06-spo2-history<br>![06-spo2-history](60-standard-watch/06-spo2-history.png) | Back, Browse › Respiratory › Blood oxygen, W → SpO2 history from the band's stored spot-checks (RACP), clock set via CTS | PASS |
| 7 | 07-spo2-source<br>![07-spo2-source](60-standard-watch/07-spo2-source.png) | Tap Show all data → Stored readings listed with SIG Pulse Band as source | PASS |
| 8 | 08-unpair<br>![08-unpair](60-standard-watch/08-unpair.png) | Devices › ⋮ › Unpair › confirm → Band removed; synced data kept | PASS |

## Test cases

- PASS · com.unified.health.e2e.DemoDataE2ETest.seedEveryChartThenClear
- PASS · com.unified.health.e2e.DeviceSettingsE2ETest.aboutThisDevice
- PASS · com.unified.health.e2e.GarminWatchE2ETest.pairSyncAndUnpairGarminWatch
- PASS · com.unified.health.e2e.HuaweiWatchE2ETest.pairSyncAndUnpairTheSimulatedHuaweiWatch
- PASS · com.unified.health.e2e.NotificationSettingsE2ETest.notificationPreferencesPersist
- PASS · com.unified.health.e2e.StandardWatchE2ETest.standardWatchJourney
- PASS · com.unified.health.e2e.UserJourneyE2ETest.firstRunJourney
- PASS · com.unified.health.e2e.WorkoutsE2ETest.workoutListAndDetail
- PASS · com.unified.health.e2e.ZeppWatchE2ETest.pairSyncAndUnpairZeppWatch
