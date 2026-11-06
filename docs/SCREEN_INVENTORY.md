# Screen / feature inventory: Garmin Connect, Huawei Health, Zepp, COROS vs. Unified Health

> Scope: **UI/feature inventory only**, not protocol RE. Built entirely from static evidence already
> on disk (manifests, resource strings, class/binding names) — no new decompiling, no emulators, no
> app installs were done for this doc (machine RAM was nearly exhausted: 5 other agents + 2 emulators
> running concurrently; see D-013 in `docs/DECISIONS.md`).
> Date: 2026-11-06.

## 0. Evidence sources and quality per brand

| Brand | Source on disk | What it actually contains | Evidence quality |
|---|---|---|---|
| **Garmin Connect** | `/Users/Apple/Documents/Projects/noattoan/garmin-analysis/rea-output/AndroidManifest.xml` (8,818 lines, 932 `<activity>` tags), `permissions.txt` | Full manifest with **unobfuscated, fully readable** `com.garmin.android.apps.connectmobile.*` activity class names (Garmin's R8 config keeps manifest component names readable even though internal logic classes are obfuscated, e.g. `ma2.h`, `ct2.f`). No `strings.xml`/resources were extracted — jadx was run (`jadx-base.log`, `jadx-gcm.log`) but no sources/resources tree was kept on disk, only the `rea`-queried protocol-class JSONs (`cls_device_ble.json`, `cls_gfdi.json`, etc., already the basis of `docs/protocols/GARMIN_DEVICE_PROTOCOL.md`). | **Good for screen names** (manifest is rich and readable), **no literal UI strings** — section titles below are inferred from class names, not quoted from `strings.xml`. |
| **Huawei Health** | `/Users/Apple/Documents/Projects/noattoan/rea-output/AndroidManifest.xml` (8,818 lines, ~979 distinct Activity names), `permissions.txt` (230 lines) | Same style: full manifest, readable `com.huawei.*` class names. No `strings.xml` extracted — "static manifest/strings only" per task brief actually means manifest + permissions, not resource strings. | **Good for screen names**, no literal UI strings, same caveat as Garmin. |
| **Zepp** | `docs/re-evidence/zepp/jadx-base/resources/{AndroidManifest.xml, res/values/strings.xml}` (full jadx decompile, 627 MB, untracked) | Full manifest (576 `<activity>` tags) **and** a 10,648-line `strings.xml` in readable English (default locale, no separate `values-en`) — the only brand where we have literal screen-title/menu strings, not just class names. | **Best evidence of the four** — class names + actual UI copy. |
| **COROS** | `/Users/Apple/Documents/Projects/noattoan/rea-output/coros/strings_classes.txt` (18 MB, `strings -n 6` dump of `classes.dex`), `docs/protocols/COROS_DEVICE_PROTOCOL.md`, `docs/re-evidence/coros/*.md` | The real APK is wrapped by a commercial app-hardening "shell" (see COROS protocol doc §0) — **no decompilation is possible**, only cleartext string/class-name fragments survive inside `classes.dex`. However, Android **ViewBinding auto-generates a class named `Activity<Name>Binding`/`Fragment<Name>Binding` for every XML layout** at compile time, and ~300 of these binding class names are directly readable in the string dump even though the shell blocks everything else. Each one is strong indirect evidence that a real screen (`activity_<name>.xml`) exists, even though we can't see its code or copy. | **Screen *names* only** — no strings.xml, no verified UI copy, no manifest (manifest reading was blocked, see COROS protocol doc). Treat every COROS row as "a screen by this name exists" rather than "here is what it does." |
| **Unified Health (this app)** | `FEATURES.md` (product spec, partly aspirational/未-built), actual Kotlin under `feature/*/src`, `core/model/src/main/kotlin/com/unified/health/core/model/HealthMetrics.kt`, `driver/*/src` | Read directly; "Unified Health today" column below reflects **actual shipped code**, not `FEATURES.md`'s plan — the two disagree in places (noted inline). | Ground truth (first-party). |

**Confidence legend** (this doc's own convention, distinct from the `[V]/[I]/[Ext]` byte-layout tags used in the protocol docs — here the axis is "did we find a screen name," not "is a byte layout verified"):
`✓` = found, strong (manifest/strings.xml hit, class name unambiguous) · `~` = found, weak (single hit, generic name, or data-field-only with no confirmed screen) · `—` = not found in the static evidence we have. **"Not found" never means "confirmed absent"** — none of these sources is a full UI tree; a feature can exist under an obfuscated/WebView/React-Native screen our keyword search can't see. Only Unified Health's own column is first-party ground truth.

---

## 1. Feature area × brand × Unified Health

### 1.1 Today / Dashboard

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `dashboard.presentation.DashboardActivity`, `home.MyDeviceActivity`, `gcplus.presentation.home.GCPlusHomeActivity` — `garmin-analysis/rea-output/AndroidManifest.xml` | ✓ |
| Huawei | `com.huawei.health.MainActivity`, `com.huawei.ui.homewear21.home.WearHomeActivity` — `rea-output/AndroidManifest.xml` | ✓ |
| Zepp | `homepage_item_card_*` series (steps, calorie, bmi, heart_rate, pai, body_indices, female_health, blood_pressure, blood_sugar, ecg, stress_level) — `jadx-base/resources/res/values/strings.xml:4369-4433` | ✓ |
| COROS | `ActivityHomePageBinding`, `ActivityMainBinding`, `ActivityCustomHomeBinding` — `rea-output/coros/strings_classes.txt` | ✓ |
| **Unified Health** | `HomeScreen.kt` ("Summary" tab): device banner, 3-ring activity summary, pinned metric cards, highlights — `feature/home/src/main/kotlin/com/unified/health/feature/home/HomeScreen.kt` | **Have.** Card reordering/hide (FEATURES.md §3.2 P2) not built — `EditPinnedDialog` only lets you choose *which* metrics are pinned, not a free layout. Minor gap. |

### 1.2 Activity rings / steps / distance / floors

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `activities.health.presentation.HealthSnapshotActivity`, `HealthFullScreenChartActivity`; permissions `health.WRITE_STEPS`, `WRITE_FLOORS_CLIMBED`, `WRITE_DISTANCE`, `WRITE_ELEVATION_GAINED` — `garmin-analysis/rea-output/{AndroidManifest.xml,permissions.txt}` | ✓ |
| Huawei | `...healthdata.RunningDataActivity`, `RunningDataSpecificationActivity`; permissions `ACTIVITY_RECOGNITION`, `android.permission.health.WRITE_STEPS` | ✓ |
| Zepp | `homepage_item_card_activity_consume` — `strings.xml:4370` | ✓ |
| COROS | `ActivityDailySummaryStatisticsBinding`, `ActivityStatisticsFitnessMainBinding` | ✓ |
| **Unified Health** | `HealthMetricType.STEPS/DISTANCE/CALORIES/EXERCISE_MINUTES` (`core/model/src/main/kotlin/com/unified/health/core/model/HealthMetrics.kt:12-25`), rings on Home, generic chart in `MetricDetailScreen.kt`, Browse "Activity" category (`feature/home/.../browse/BrowseScreen.kt:61-66`) | **Have steps/distance/calories/exercise-minutes.** **Gap: "floors climbed"/elevation gain has no `HealthMetricType` at all** — every brand tracks it, we don't model it. Needs a new metric type + driver mapping (Garmin's FIT monitoring messages already carry a floors field we don't currently parse in `FitHealthMapper.kt`) → **P1**. |

### 1.3 Heart rate (live + resting + HRV)

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `overnighthrv.OvernightHrvActivity`, `help.heartrate.HeartRateHelpActivity`; permissions `WRITE_HEART_RATE`, `WRITE_RESTING_HEART_RATE` | ✓ |
| Huawei | `heartrate.HeartRateDetailActivity`, `HorizontalHeartRateDayActivity`, `BradycardiaAlarmActivity`, `WarningHRActivity`, `HeartRateZoneSettingActivity`, `HeartRateSettingsActivity` | ✓ |
| Zepp | `com.xiaomi.hm.health.device.HMRestingHeartRateActivity`, `HeartRateAndStressSettingActivity`; string `ecg_hrv` "Heart rate variability(HRV)" — `strings.xml:3063` | ✓ |
| COROS | `ActivityHeartRateGuideBinding`, `ActivityStatisticsHrvBinding`, `FragmentHeartRateChartViewV3Binding`/`StatisticsV3Binding`/`DayItemV3Binding`/`DurationViewV3Binding` | ✓ |
| **Unified Health** | `HealthMetricType.HEART_RATE/RESTING_HEART_RATE/HRV` already modeled; `MetricDetailScreen.kt` charts all three. Garmin driver maps live HR from FIT monitoring messages (`driver/garmin/.../codec/fit/FitHealthMapper.kt:35,118` `MON_HEART_RATE`/`mapMonitoring`); `GarminLiveHeartRate.kt` for live BLE HR | **Have the metric + UI.** **Gap:** no driver currently emits `HRV` records (the enum case exists, nothing produces it) — data gap, not UI gap. HR zones (Z1–Z5) and high/low-at-rest alerts are FEATURES.md §3.6 P2, not built. |

### 1.4 Sleep (stages + score)

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `sleep.presentation.SleepReportsActivity`; permission `WRITE_SLEEP` | ✓ |
| Huawei | `coresleep.DaySleepActivity`, `SleepScoreTimesActivity`, `SleepDurationActivity`, `SleepRateActivity`, `SleepInstructionPageActivity`; wellness extras `KnitMindActivity`/`KnitRelaxActivity`/`KnitSleepTightActivity` | ✓ |
| Zepp | `com.huami.sleep.sleephome.ui.SleepHomeActivity`, `SleepEditedActivity`, `NapSleepDetailActivity`, `BreathQualityActivity`, `SleepAssistantActivity` (337 sleep-prefixed strings, e.g. `app_sleep_report_title` "Slept %1$dh %2$dm last night" — `strings.xml:1025`) | ✓ |
| COROS | `ActivitySleepEditEditorBinding`, `ActivitySleepEditEntryBinding`, `ActivitySleepFactorDetailBinding`, `ActivitySleepModeBinding`, `FragmentSleepChartViewBinding`/`V3Binding`, `FragmentSleepStatisticsBinding`/`NewBinding`, `FragmentSleepDayItemV3Binding` | ✓ |
| **Unified Health** | `HealthMetricType.SLEEP`; `MetricDetailScreen.kt:190` renders `SleepStageChart` (hypnogram, `core/designsystem/.../component/HealthCharts.kt`) for the SLEEP metric, reached via Browse → Sleep category | **Have hypnogram + score via the generic metric-detail screen.** **Finding (code hygiene, not a product gap):** a *separate* `feature/sleep/SleepScreen.kt` exists, registered in `UnifiedHealthNavHost.kt`, but **nothing navigates to it** (`navigateToSleep` has zero callers in `feature`/`app`) — it is dead/orphaned placeholder UI (just a bare `TopAppBar`). Flag for the next UI-implementation pass to either delete it or make it the real nightly-detail screen instead of routing Sleep through the generic template. Gaps vs. all 3 brands: nap detection, sleep breathing/SpO2-during-sleep, guided "sleep assistant" content — P2/P3 per FEATURES.md §3.5. |

### 1.5 SpO2 / respiration

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `pulseox.presentation.PulseOxActivity`, `acclimation.reports.presentation.activity.PulseOxAcclimationReportsActivity` | ✓ |
| Huawei | `bloodoxygen.BloodOxygenIntroducedActivity`, `BloodOxygenHistoryRecordActivity`, `HorizontalBloodOxygenDayActivity`; respiration `com.huawei.ui.device.activity.sleepbreathe.SleepBreatheActivity` | ✓ |
| Zepp | `com.huami.bloodoxygen.ui.activity.Spo2IntroDetailActivity`, `AddClickSpo2ManuallyActivity`, `ClickSpo2HistoryActivity`; also body temperature `bm_temperature_*` (`strings.xml:1566-1569`) | ✓ |
| COROS | Only data fields (`getSpo2`/`setSpo2`, `SportSpo2`, `SportSpo2Utc`) — no `Activity*Spo2*Binding` found | ~ |
| **Unified Health** | `HealthMetricType.SPO2`; `MetricDetailScreen.kt`. Zepp driver already parses `GdspDataType.SPO2_POINT` (`driver/zepp/.../ZeppSession.kt:153,177`); Garmin driver maps `mapSpo2` from FIT message 269 (`FitHealthMapper.kt:25,128`) | **Have metric + UI, 2 of 4 drivers produce it.** Gap: no dedicated respiration-rate metric; no sleep-specific SpO2 breakdown. P2. |

### 1.6 Stress / Body Battery / PAI-equivalent score

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `stress.presentation.view.StressReportsActivity`, `performance.stats.StressLevelScoresSummaryActivity`, **`bodybattery.presentation.BodyBatteryReportsActivity`** (literal "BodyBattery" package — this is Garmin's own trademarked score name/algorithm) | ✓ |
| Huawei | `fitness.activity.pressure.activity.PressureMeasureActivity`/`PressureMeasureResultActivity`, `pressurecalibrate.*`, `health.activity.healthdata.KnitPressureActivity`; intent action `com.huawei.bone.stress_and_relax_sync` confirms a "TruRelax"-style stress/relax sync (found via `grep` on `AndroidManifest.xml`, supplementing the sub-agent pass that missed it because it searched activity names only, not `<action>` tags) | ✓ |
| Zepp | `com.huami.pai.ui.uicase.PaiDetailActivity`; strings `homepage_item_card_pai`, `pai_title` "PAI活力指数" (`strings.xml:4427,4430-4431`), `homepage_item_card_stress_level_{high,medium,normal,relax}` (`strings.xml:4456-4459`) — **PAI is Zepp/Firstbeat's own trademarked score** | ✓ |
| COROS | `DailyStress`, `DailyStressUISummary`, `HomeStressItemEntity`/`HomeStressViewHolder` (home card), `StressStatisticsChartViewAdapter`, `SleepStressChartViewAdapterV3` — `rea-output/coros/strings_classes.txt` | ✓ |
| **Unified Health** | `HealthMetricType.STRESS`, generic 0–100 score, `MetricDetailScreen.kt`. Garmin driver maps `mapStress` from FIT message 227 (`FitHealthMapper.kt:24,122`); Zepp driver parses `GdspDataType.STRESS_ALL_DAY` (`ZeppSession.kt:152,193`) | **Have a generic stress score + UI, 2 of 4 drivers produce it.** Correctly **not** branded — see P2 note below: Body Battery / PAI / TruRelax are proprietary names+algorithms we should not reproduce, but the generic score we already have is the right shape. |

### 1.7 Training status / load / readiness / VO2max / race predictor

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `performance.stats.TrainingStatusDeviceActivity`, `improvement.TrainingStatusSummaryActivity`, `TrainingEffectDetailActivity`/`SummaryActivity`, `vo2.reports.presentation.activity.VO2MaxReportsActivity`, `race_time_prediction.presentation.RaceTimePredictionActivity`, `racepredictor.presentation.activity.RacePredictorTrendsActivity`, `trainingrediness.presentation.TrainingReadinessActivity` — the richest/most branded set of any brand | ✓ |
| Huawei | `com.huawei.health.suggestion.ui.TrainEventActivity`, `TrainReportActivity`; `healthdata.Vo2maxActivity`/`Vo2maxSpecificationActivity` | ✓ (no explicit "readiness"/"race predictor" found) |
| Zepp | `com.huami.watch.companion.firstbeat.SportLoadActivity` — **Zepp licenses the same Firstbeat engine Garmin uses**; strings `sports_firstbeat_current_maximum_oxygen` "Current VO₂ max", `sports_firstbeat_recovery_time_achieve` "Fully recovered" (`strings.xml:8577-8579`), `history_vo2max` "VO₂ max trend" (`strings.xml:4319`) | ✓ |
| COROS | `ActivityTrainingPlanAddBinding`, `ActivityTrainingProgramDetailBinding`, `ActivityPaceStrategyBinding`(+`ChartDetail`/`Detail`/`Landscape`), `FragmentCoachPlan/Competition/Mileage/Time*Binding` (in-app AI coach) | ✓ (training plans + pace strategy; no VO2max-named binding captured) |
| **Unified Health** | — | **Pure gap, biggest one in this table.** Nothing in `HealthMetricType` represents training load/readiness/VO2max at all. See §2 P1/P2 split below — a **generic** "training load trend" is buildable now from data Garmin's driver already maps (`FitHealthMapper.kt:134` `mapSession`: distance, calories, avg/max HR per workout), but the **named/branded** scores (Body Battery, Training Readiness, Race Predictor, Firstbeat's exact VO2max formula) are out of scope — see P2. |

### 1.8 Workouts / activities list + detail (map, splits, laps)

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `activities.history.presentation.ActivitiesListActivity`, `activity.details.presentation.ActivityDetailsActivity`, `activities.map.ActivityMapActivity`, `activities.stats.splits.EditActivityStatsSplitsActivity`, `activities.stats.climbs.ClimbListActivity`/`ClimbDetailActivity`, `activities.manual.ActivitiesCreateManualActivity` | ✓ |
| Huawei | `history.SportHistoryActivity`, `SportDataActivity`, `InputSportHistoryActivity`; route `plugintrack.ui.activity.RunningRouteListActivity`; pace/voice coaching `PaceRangeActivity`, `SportMetronomeActivity` | ✓ |
| Zepp | `com.huami.moving.sport.ui.activity.SportDetailPageActivity`, `SportDetailChartsLandscapeActivity`, `SportDetailSegmentEditActivity`, `GPSMainActivity`, `SportEndPageActivity`, `TrackVideoShareActivity`; courses `FeaturedCourseDetailActivity`/`PlayActivity` | ✓ |
| COROS | `ActivitySportDetailBinding`, `ActivitySportDetailLapBinding`, `ActivitySportDetailLocationBinding`, `ActivitySportDetailPhotoMapBindBinding`, `ActivitySportDetailPaceStrategyBinding`(+V2), `ActivitySportGalleryBinding`, `ActivityRunBinding`/`RunLapLandscapeBinding`, `ActivityLiveTrackBinding`/`CreateBinding`, `ActivityMyTrackBinding`, `ActivityClimbRouteDetailBinding` — richest of all four (COROS is a dedicated GPS sports-watch brand) | ✓ |
| **Unified Health** | `feature/activity/src/main/kotlin/com/unified/health/feature/activity/ActivityScreen.kt`: a flat demo-data workout **list** only (`WorkoutItem`), plus a non-wired "Start workout" FAB | **Have: list, barely.** **Gap: no workout detail screen at all** (no duration/distance/pace/avg-HR breakdown, no map, no splits/laps, no live-workout tracking). This is the single clearest, highest-value gap vs. all four brands — see **P0** below. |

### 1.9 Women's health / body metrics (weight, cycle)

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `menstrualcycle.presentation.details.MenstrualCycleCalendarActivity`/`DetailsActivity`/`v2.MenstrualCycleTrackingActivity`; `weighttracker.presentation.WeightReportsActivity`, `addweight.AddWeightActivity`; body comp `indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity` | ✓ |
| Huawei | `menstrualpredict.MenstrualPredictActivity` (only 1 hit); `WeightDetailActivity`/`WeightGoalActivity`/`WeightAiBodyDataActivity`; also blood pressure/sugar screens (outside our taxonomy) | ✓ weight/BP/sugar; ~ cycle |
| Zepp | `com.huami.femalehealth.uilib.ui.activity.FHSettingActivity`/`MenstruationHistoryActivity`/`EditMenstruationDetailActivity`/`FHPeriodSettingActivity`; `HMWeightingActivity`/`WeightGoalsSetActivity`/`BabyWeightActivity` | ✓ |
| COROS | `ActivityMenstrualCycleDetailBinding`/`HistoryBinding`/`RecordBinding`/`SettingsBinding`, `FragmentLastPeriodDateBinding`, `FragmentPeriodDurationBinding` (cycle); weight only in onboarding (`ActivityRegisterEditWeightBinding`) | ✓ cycle; ~ ongoing weight |
| **Unified Health** | `HealthMetricType.WEIGHT`, point-chart in `MetricDetailScreen.kt` | **Have weight (manual entry, per FEATURES.md §3.9 P2 — check current wiring before assuming it's live).** **Gap: no cycle tracking, no body composition (body-fat%/muscle mass).** See P2 — sensitive data, manual-entry-only even in the vendor apps (no watch sensor actually measures cycle phase), worth doing carefully but not device-protocol-blocked. |

### 1.10 Watch face gallery + settings sync

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `settings.devices.quartz.QuartzWatchFaceSettings`, `vivomove3.Vivomove3ClassicWatchFaceSettingsActivity`; 3rd-party store `connectiq.ConnectIQAppStoreActivity` | ✓ |
| Huawei | `watchface.plugingallery.GalleryActivity`, `KaleidoscopeActivity`, `WatchfaceUrlActivity`, `ClipImageActivity` (custom photo face) | ✓ |
| Zepp | `com.huami.watchfacesstore.ui.WatchFacesStoreActivity`, `WatchFaceDetailActivity`, `CategoryListActivity`, `XiHuWatchFaceEditActivity`/`ManagerActivity` | ✓ |
| COROS | `ActivityCorosWatchfaceAddBinding`/`DeleteBinding`/`DetailBinding`/`DisplayBinding`/`StorageBinding`, `ActivityMyWatchfaceBinding`, `ActivityDeviceStoreMainBinding` | ✓ |
| **Unified Health** | — | **Gap, but P2/out of scope** — see §2. Binary watch-face formats are vendor- and firmware-specific, effectively a second RE project per brand, and a hosted "gallery" risks reproducing vendor-copyrighted face designs. |

### 1.11 Notifications / smart notifications

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `notifications.NotificationsActivity`, `settings.devices.common.smartnotifications.SmartNotificationsActivity`/`PrivacyActivity`/`TimeoutActivity` | ✓ |
| Huawei | `notification.NotificationSettingActivity`, `NotificationSmartReminderDescriptionActivity`; manifest declares a `NotificationListenerService` filter (`AndroidManifest.xml:~2691`); permissions `READ_CONTACTS`, `READ_SMS`, `READ_CALENDAR`, `READ_PHONE_STATE`, `RECEIVE_SENSITIVE_NOTIFICATIONS` | ✓ |
| Zepp | `com.huami.watch.companion.ui.activity.NotificationSettingActivity`, `AppSettingActivity`, `WechatFriendMsgSettingActivity` | ✓ |
| COROS | `ActivityDeviceMsgNotifyManagerBinding`, `FragmentNotificationSettingsBinding` | ✓ |
| **Unified Health** | `ProfileScreen.kt:136`: `SettingRow(Notifications, "Coming soon")` — explicit stub, confirmed by our own code | **Confirmed gap** (not "not found", we have the stub). FEATURES.md §3.11 correctly scopes this P3. Split: the **settings UI** (choose which apps forward, enable `NotificationListenerService`) needs no new driver data → **P0**. Actually **pushing** a notification to the watch over BLE needs a per-vendor write command — grepped `driver/*` and `core/ble/*` for notification-push support, found none (only GATT-notify, i.e. receiving BLE indications, in `core/ble/.../GattClient.kt`) → that half is **P1**. |

### 1.12 Alarms / do-not-disturb / widgets config

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `settings.devices.AlarmsSettingsActivity`, `MultipleAlarmsSettingsActivity`, `CreateEditDeviceAlarmActivity`; widgets `common.DeviceCustomWidgetActivity`, per-model `ReOrderableWidgetActivity` | ✓ |
| Huawei | `alarm.AlarmActivity`, `eventalarm.EventAlarmClockActivity`, `smartalarm.SmartAlarmClockActivity`, `donotdisturb.NoDisturbSettingActivity` | ✓ |
| Zepp | `com.huami.assistant.ui.activity.AlarmListActivity`/`EditAlarmActivity`/`AlarmRepeatSettingActivity`; DND `ds_dnd_mode_smart` "Smart DND" (`strings.xml:2827-2834`); widgets `WidgetAndAppActivity` | ✓ |
| COROS | `ActivityAlarmClockBinding`/`EditBinding`/`RepeatBinding`, `ActivityDisturbBinding`, `ActivityDataScreenEditBinding`/`DatascreenSettingsBinding` (COROS calls widgets "data screens") | ✓ |
| **Unified Health** | — | **Gap. P1** — the whole point of alarms/DND/widget config is writing it *to* the watch; no driver implements any such write command today (grepped, none found), so the UI alone would have nothing to do. |

### 1.13 Music control

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `settings.devices.music.MusicSetupActivity`, `vivoactive3Music.*SettingActivity` | ✓ |
| Huawei | `music.MusicMainActivity`, `MusicSongsActivity`, `LocalMusicResourceActivity` | ✓ |
| Zepp | `com.xiaomi.hm.health.device.MusicManagerActivity`, `com.huami.sky.ui.realtime.SkyMusicListActivity`, `DeviceMusicActivity` | ✓ |
| COROS | `ActivityMusicEqacitivityBinding`, `ActivityHomeMusic163Binding`, `ActivityDeviceMusic163FileListBinding` | ✓ |
| **Unified Health** | — | **Gap. P1** — likely the lowest-effort P1 since AVRCP media control is partly an OS-level Android media-session feature, but confirming which vendors expose it over their custom BLE profile (vs. a separate BT Classic A2DP/AVRCP link) needs driver investigation first. |

### 1.14 Find my phone / find my watch

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `devices.FindDeviceMapActivity`, `settings.findmydevice.presentation.FindMyDeviceActivity` | ✓ |
| Huawei | `finddevice.FindDeviceActivity` | ✓ |
| Zepp | `com.huami.watch.companion.ui.activity.FindWatchActivity`; string `xihu_find_my_watch` (`strings.xml:10562`) | ✓ |
| COROS | `ActivityFindDeviceBinding`, `ActivityCantFindM1Binding` | ✓ |
| **Unified Health** | — | **Gap. P1, not P0** despite looking trivial: it needs one GATT write per vendor (possibly the standard BLE SIG **Immediate Alert Service** `0x1802`, common on fitness trackers — grepped `driver/*` and `core/ble/*` for `0x1802`/"immediate alert", found nothing implemented in any driver yet). Worth an early P1 pick since it may turn out to be a ~1-day job once one driver confirms the service. |

### 1.15 Firmware update

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity` (sensor-level only found by name; watch-level firmware sync is handled inside the GFDI protocol per `cls_gfdi.json`, no dedicated Activity) | ~ |
| Huawei | `update.BandUpdateDialogActivity`, `WearDeviceUpdateDialogActivity`, `WeightDeviceOtaActivity` | ✓ |
| Zepp | `com.xiaomi.hm.health.device.firmware.HMFwUpgradeActivity` (+5 state variants), `HMFwChangeLogActivity`, `AutoOtaAtNightSettingActivity` | ✓ |
| COROS | `ActivityFirmwareUpgradeBinding`, `ActivityPod2FirmwareUpgradeBinding`, `ActivityWifiUpgradeBinding` | ✓ |
| **Unified Health** | `WearableDevice.firmwareVersion` field exists and is *read* and shown on the paired-device card (`core/model/.../Device.kt:77`) | **Have: read-only version display.** **Gap: no OTA push flow anywhere** — and per `.claude/agents/device-protocol-re.md`'s "never invent a layout" rule plus the bricking risk of a wrong firmware write, this is **P2/out of scope for now**, same bucket as proprietary-algorithm reproduction: high risk, not core to "read my own health data," revisit only with real hardware + vendor OTA format confirmed. |

### 1.16 Social / challenges / groups

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `badges.redesign.BadgesActivity`, `connections.groups.GroupsActivity`, `connections.groups.challenges.GroupChallengeLeaderboardActivity` | ✓ |
| Huawei | `pluginachievement.ui.AchieveReportActivity`/`AchieveLevelMainActivity` (achievements only) | ~ |
| Zepp | only `small_tool_item_frient` "Relatives and friends" string — no dedicated challenge/community Activity found | ~ |
| COROS | `ActivityFriendsTeamListBinding`/`DetailBinding`, `ActivityAllMedalBinding`/`MedalDetailBinding` | ✓ |
| **Unified Health** | — | **Deliberate non-gap, P2/out of scope.** Social features need a cloud backend (accounts, leaderboards, friend graphs) and directly contradict this app's core local-only/no-backend principle (`FEATURES.md` §0, and the product goal decision in `docs/DECISIONS.md` D-001). This is exactly the "nice-to-have, out of scope for a privacy-respecting single app" bucket the task brief calls out. |

### 1.17 Account / cloud sync / login

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `bic.auth.SocialLoginActivity`, `familyaccounts.presentation.*`, Garmin Pay activities (out of taxonomy) | ✓ |
| Huawei | `com.huawei.health.HuaweiLoginActivity`, HMS account sign-in activities | ✓ |
| Zepp | `com.huami.account.ui.login.LoginActivity`/`register.RegisterActivity`; string `mi_account` "MIUI account" (`strings.xml:5138`) | ✓ |
| COROS | `ActivityLoginBinding`, `ActivityRegisterAccountBinding`, `ActivityAccountManagementBinding` | ✓ |
| **Unified Health** | — | **Deliberate non-gap, P2/out of scope** — same reasoning as §1.16: no account/backend by design. |

### 1.18 Device settings (per-connected-watch: battery, storage, sensors toggle)

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | Dozens of per-model classes, e.g. `settings.devices.DeviceSettings`, `DeviceSettingsActivityTracking` | ✓ |
| Huawei | `health.device.ui.DeviceMainActivity`; sensor toggles `bloodoxygen.CycleBloodOxygenSettingActivity`, `heartrate.HeartRateSettingsActivity`, `temperature.TemperatureMonitoringActivity` | ✓ |
| Zepp | `com.huami.watch.companion.ui.activity.DeviceStatusActivity`, `DeviceMoreSettingActivity`, `HealthSettingActivity`, `SportSettingActivity` | ✓ |
| COROS | `ActivityDeviceSettingsBinding`, `ActivityConnectSettingsBinding`, `ActivityBatteryDetailBinding`, `ActivityAboutDeviceBinding` | ✓ |
| **Unified Health** | `DevicesScreen.kt:277`: `DropdownMenuItem(text = { Text("Device settings (coming soon)") }, ..., enabled = false)` — **our own code has a disabled menu item for this exact feature** | **Confirmed gap by our own code**, not inference. `WearableDevice` already carries `model`, `batteryPercent`, `firmwareVersion`, `connectionState`, `lastSyncedAt` (`core/model/.../Device.kt:70-87`) — enough to build a read-only "About this device" screen with **zero new driver work** → **P0**. Per-vendor sensor on/off toggles (continuous HR, sleep tracking) would need new per-vendor write commands → **P1**. |

### 1.19 Help / support

| Brand | Evidence | Confidence |
|---|---|---|
| Garmin | `help.HelpActivity`, `help.HelpDetailsActivity`, `help.heartrate.HeartRateHelpActivity` | ✓ |
| Huawei | `phoneservice.feedback.ui.FeedListActivity`, `plugin.remotelog.activity.LogFaqHelpActivity` | ✓ |
| Zepp | No dedicated help-center Activity found; 158 `*_help` strings are mostly inline pairing-failure tips (e.g. `bind_get_help` "Tap to get help", `strings.xml:1270`), likely routed through `com.xiaomi.hm.health.discovery.WebActivity` (WebView) rather than a native screen | ~ |
| COROS | `ActivityCorosHelperCenterBinding`, `ActivityContactCustomServiceBinding`, `ActivityFeedbackBinding`, `ActivityAboutUsBinding` | ✓ |
| **Unified Health** | — | **Gap, P2** — low effort, low urgency; FEATURES.md §3.13 already scopes an "About" row as P2. Not device-protocol-blocked, purely a content/UI task. |

---

## 2. Prioritized merge plan

### P0 — clear gap, high value, feasible today without new driver/hardware data

1. **Workout detail screen** (duration, distance, calories, avg/max HR, pace) for `feature/activity`. All 4 brands have one; we only have a flat list (`ActivityScreen.kt`). Garmin's driver already maps per-session distance/calories/avgHR/maxHR (`FitHealthMapper.kt:134-146` `mapSession`) and stored workout entities already exist in `core/data` per the in-progress `MetricSeriesBui...` additions in this branch's git status — build the detail screen against what's already stored before waiting on richer driver data (map/splits/laps need GPS/lap-level data not yet parsed → P1, see below).
2. **Generic "training-load-style" summary** on the Activity or Home tab — a week-over-week trend of (workout duration × avg HR) or similar, built from data the Garmin driver already produces. Explicitly **not** named/branded like Body Battery, Training Readiness, Race Predictor, or Firstbeat's VO2max (see P2).
3. **Per-device "About this device" settings screen** replacing the disabled `"Device settings (coming soon)"` menu item in `DevicesScreen.kt:277`. Zero new driver work: `WearableDevice` already has `model`, `batteryPercent`, `firmwareVersion`, `connectionState`, `lastSyncedAt`.
4. **Notifications settings screen** (which apps forward, `NotificationListenerService` permission flow) in `ProfileScreen.kt` — replaces the `"Notifications: Coming soon"` stub. UI-only; does not require a driver to *push* to the watch yet (that half is P1).
5. **Browse category audit**: current categories (`BrowseScreen.kt:61-71` — Activity, Heart, Respiratory, Sleep, Mental wellbeing, Body measurements) already cover every `HealthMetricType` we have. No missing *category* was found given today's data model — new categories (Training, Women's health, Vitals) are blocked on new metric types, so they move to P1/P2 below rather than being a standalone P0 item.
6. **Fix or remove the orphaned `feature/sleep/SleepScreen.kt`** (§1.4) — not a brand-parity gap, but worth a line item since it's dead code sitting in the nav graph.

### P1 — valuable, but needs data/commands our drivers don't produce yet

- **Floors climbed / elevation gain** metric (§1.2) — needs a new `HealthMetricType` + parsing Garmin's FIT floors field (not currently read in `FitHealthMapper.kt`); cross-ref `TODO(garmin-protocol)` markers in `GarminSession.kt:143,163`.
- **HRV data production** — the metric type exists, no driver emits it yet.
- **Workout map / GPS route, splits, laps** — needs lap-boundary and GPS-point parsing; none of `driver/garmin/transport/MultiLink.kt`, `driver/huawei/transport/HuaweiTransport.kt`, or `driver/zepp` currently expose this (cross-ref `TODO(garmin-protocol)` in `MultiLink.kt:32`, `TODO(huawei-protocol)` in `HuaweiTransport.kt:174` and `FitnessCommands.kt:11` — "every RESPONSE layout of service 7 is unknown", confirming Huawei's driver today only emits `HealthRecord.RawPayload`, no typed records of any kind, per `HuaweiSession.kt:74`).
- **Find my watch** (§1.14) — looks P0-simple but needs a confirmed per-vendor (or standard Immediate Alert `0x1802`) GATT write; no driver implements it today.
- **Alarms / DND / widget config** (§1.12), **music control** (§1.13), **notification push-to-watch** (the other half of item P0-4) — all need new per-vendor write commands with no existing driver support.
- **Sensor on/off toggles** (continuous HR, sleep tracking) inside the new device-settings screen (§1.18) — the read-only "About" part is P0; the toggle-writing part is P1.
- **Cycle tracking / body composition** (§1.9) — valuable, privacy-sensitive, but not device-protocol-blocked (every vendor does this as manual entry too); do carefully, with explicit local-only storage and a clear opt-in, once P0 is done.
- **Respiration rate / sleep-specific SpO2** (§1.5) — needs new metric type, low urgency.

### P2 — nice-to-have / out of scope for a privacy-respecting single app

- **Branded/proprietary scores and algorithms**: Garmin's **Body Battery**, **Training Readiness**, **Race Predictor**, and the Firstbeat VO2max/recovery-time formulas (shared by Garmin and Zepp per §1.7); Zepp's **PAI**; Huawei's **TruRelax**-style stress/relax sync (`com.huawei.bone.stress_and_relax_sync`). We should **not** reproduce the trademarked names or the exact (likely patented) scoring algorithms. A **generic equivalent** — our existing plain 0–100 stress score, and a generic training-load trend (P0 item 2) — is the right amount of overlap.
- **Watch face gallery** (§1.10) — vendor- and firmware-specific binary formats, effectively a second RE project per brand; a hosted gallery also risks reproducing vendor-copyrighted designs.
- **Firmware OTA push** (§1.15) — bricking risk, no verified byte layout for any vendor, explicitly against the driver contract's "never invent a layout" rule. Read-only firmware version display is already P0-adjacent/done.
- **Social / challenges / groups** (§1.16) and **account / cloud sync / login** (§1.17) — both require a backend, directly contradicting the app's local-only, no-account design principle. Deliberate, not an oversight.
- **Help/support content screen** (§1.19) — fine to do eventually, genuinely low priority, not device-protocol-related at all.
- **Women's-health cycle tracking** could arguably sit here instead of P1 if the team decides it's out of scope for a device-sync app rather than a wellness app; left in P1 above pending a product decision, flagged here for visibility.

---

## 3. Appendix — raw evidence pointers

- Garmin: `garmin-analysis/rea-output/AndroidManifest.xml`, `garmin-analysis/rea-output/permissions.txt`. Protocol-only class dumps (`cls_device_ble.json`, `cls_gfdi.json`, `cls_AuthRegistry.json`, etc.) contain no UI strings — already consumed by `docs/protocols/GARMIN_DEVICE_PROTOCOL.md`, not reused here beyond confirming scope.
- Huawei: `rea-output/AndroidManifest.xml`, `rea-output/permissions.txt`.
- Zepp: `docs/re-evidence/zepp/jadx-base/resources/AndroidManifest.xml`, `docs/re-evidence/zepp/jadx-base/resources/res/values/strings.xml`.
- COROS: `rea-output/coros/strings_classes.txt` (ViewBinding class names as indirect screen evidence — methodology explained in §0); full BLE/protocol architecture already documented in `docs/protocols/COROS_DEVICE_PROTOCOL.md` and `docs/re-evidence/coros/*.md`.
- Unified Health: `FEATURES.md`; `feature/{home,activity,sleep,devices,profile}/src/main/kotlin/...`; `core/model/src/main/kotlin/com/unified/health/core/model/HealthMetrics.kt`; `core/model/src/main/kotlin/com/unified/health/core/model/Device.kt`; `driver/{garmin,huawei,zepp,coros}/src/main/kotlin/...` (TODO markers cited above via `grep -rn TODO driver`).
