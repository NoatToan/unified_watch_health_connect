# Huawei Health — workout detail metrics for RUNNING (outdoor + treadmill)

Evidence distilled from `docs/re-evidence/huawei/jadx-out/sources` (jadx decompile of
Huawei Health 17.0.7.310) and from the APK resource table. Scope: the workout-detail
screens for Huawei sport types **258** (outdoor running), **264** (treadmill), and the
near-identical **227** (marathon race) / **257** (walk). Everything below is described
from code behavior; string literals are quoted only as short identifiers.

> **Resource note.** `docs/re-evidence/huawei/jadx-out/resources` is empty in this
> checkout, so display strings were resolved from the APK itself with
> `aapt2 dump resources docs/apks/huawei-health-17.0.7.310.apk`; the two config assets
> were read from `docs/apks/huawei-health-17.0.7.310.apk` with `unzip`
> (`assets/SportTypeConfig.json`, `assets/posture_judge.json`). Layout XML is not
> present in the decompile either; card order inside a tab is therefore reconstructed
> from view IDs and inflation calls, while the tab order itself is exact (code below).

## Source abbreviations used in citations

| Tag | File |
|---|---|
| `DF` | `sources/com/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag.java` |
| `HRF` | `sources/com/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag.java` |
| `CHF` | `sources/com/huawei/healthcloud/plugintrack/ui/fragment/TrackLineChartActivityChartFrag.java` |
| `PF` | `sources/com/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag.java` |
| `TDA` | `sources/com/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity.java` |
| `TD` | `sources/com/huawei/healthcloud/plugintrack/ui/fragmentutils/TrackDetailItemDrawer.java` |
| `PMA` | `sources/com/huawei/healthcloud/plugintrack/ui/fragmentutils/PaceMapRecyclerViewAdapter.java` |
| `HMT` | `sources/com/huawei/hihealth/data/model/HiTrackMetaData.java` |
| `MPS` | `sources/com/huawei/hwfoundationmodel/trackmodel/MotionPathSimplify.java` |
| `MP` | `sources/com/huawei/hwfoundationmodel/trackmodel/MotionPath.java` |
| `CSI` | `sources/com/huawei/hwdevice/phoneprocess/mgr/exercise/datatype/CommonSectionInfo.java` |
| `WRS` | `sources/com/huawei/hwdevice/phoneprocess/mgr/exercise/datatype/WorkoutRecordStatistic.java` |
| `GZV` | `sources/defpackage/gzv.java` |
| `GZU` | `sources/defpackage/gzu.java` |
| `JAH` | `sources/defpackage/jah.java` |
| `JPZ` | `sources/defpackage/jpz.java` |
| `GZZ` | `sources/defpackage/gzz.java` |
| `JPQ` | `sources/defpackage/jpq.java` |
| `IZN` | `sources/defpackage/izn.java` |
| `IZV` | `sources/defpackage/izv.java` |
| `HCC` | `sources/defpackage/hcc.java` |
| `HZC` | `sources/com/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf.java` |
| `HRZT` | `sources/com/huawei/hwcommonmodel/fitnessdatatype/HeartRateZoneThreshold.java` |
| `HAE` | `sources/defpackage/hae.java` |
| `QTM` | `sources/defpackage/qtm.java` |
| `QTF` | `sources/defpackage/qtf.java` |
| `TLS` | `sources/com/huawei/ui/commonui/view/trackview/TrackLineChartHolder.java` |
| `NJV` | `sources/defpackage/njv.java` |
| `NJJ` | `sources/defpackage/njj.java` |
| `NJT` | `sources/defpackage/njt.java` |
| `NJM` | `sources/defpackage/njm.java` |
| `NJL` | `sources/defpackage/njl.java` |
| `PMP` | `sources/com/huawei/health/sportservice/dataproducer/PaceMapProducer.java` |
| `IYZ` | `sources/defpackage/iyz.java` |
| `RPA/` | `sources/com/huawei/healthcloud/plugintrack/ui/runningpostureadvicemgr/` |

Origin codes used below:
`[D]` device-provided summary/sample; `[P]` computed on the phone; `[D/P]` either,
depending on whether the record came from a watch or was recorded on the phone;
`[C]` cloud/plan supplied; `[U]` not determinable from this decompile.

---

## 1. Screen structure

### 1.1 Top-level tabs (running)

The detail activity is a `HealthViewPager` with a sub-tab strip. Tabs are added in this
exact order and only when their fragment exists (`TDA:560-601`; labels at
`TDA:612-631`; hide flags at `JQP:251-320`):

| # | Tab label (EN / id) | Fragment | Shown when | Content |
|---|---|---|---|---|
| 1 | **Route** — `IDS_motiontrack_show_detail_locus` = "Route" (0x7f0209b4) | `TrackScreenFrag` | outdoor record with a usable track (`by()` false; `JQP:505-524`; hidden when `f38833b[0]`, `JQP:287-292`) | map with pace/speed-coloured polyline, km markers, start/end, bottom stats (calories, max speed, elevation, avg speed, avg pace) (`TrackScreenFrag.java:1090-1295`) |
| 2 | **Pace** — `IDS_motiontrack_show_map_sport_peisu_1` = "Pace" (0x7f021b7b); "Speed" (0x7f021b74) for speed-mode sports (`TDA:612-631`) | `PaceFrag` | a non-empty, valid split list (`bq()`; `JQP:556-560`) | split table + fastest/average pace + half/full-marathon times |
| 3 | **Segments** — `IDS_hwh_motiontrack_swim_segment` = "Segments" (0x7f0209f4) | `SegmentFrag` | `requestSegmentList()` non-empty and sport ≠ 264 (`ca()` false for 264; `JQP:526-531`) | device lap/segment table; **not** the per-km split table |
| 4 | **Charts** — `IDS_motiontrack_show_detail_chart` = "Charts" (0x7f0209b5) | `HeartRateFrag` | at least one chart series exists (`JQP:296-318`) | HR + zone ring, cadence, pace, altitude, posture charts, SpO₂, recovery HR |
| 5 | **Details** — `IDS_motiontrack_show_detail_detail` = "Details" (0x7f0209b6) | `DetailFrag` | always (`f38833b[3]` is never set) | summary grid, running posture, training results, lactate, sport-specific cards |
| 6 | **Events** — `IDS_motiontrack_show_detail_subsport` = "Events" (0x7f020a02) | `TriathlonSubDataFrag` | records with child sport items (triathlon etc.) | sub-sport breakdown; not running |
| 7 | **Jump rope** — `IDS_rope_performance_title` = "Jump rope" | `SkippingPerformanceFrag` | sport 283 with endurance rank | not running |

Running-specific consequences:
* **Treadmill (264)**: Route is hidden (no GPS points; `by()` returns true), Segments is
  explicitly hidden (`ca()` returns false for 264), so the visible tabs are
  **Pace → Charts → Details**.
* **Outdoor (258/227)**: Route is present when `hasTrackPoint` and ≥3 LBS points;
  Segments appears only when the workout contains a segment list.
* Pace tab is hidden when there is no valid per-km/per-mile split data.

Note on the tab-3 label: `jpq.a(Context,int,String)` returns `IDS_hwh_motiontrack_swim_segment`
("Segments") for ordinary segment lists, "Ski drop" for ski, "Swing" for golf, and
"Grouping" for rowing (`JPQ:963-975`).

### 1.2 Details tab (card order, approximate)

The layout XML is missing from the decompile, so the exact vertical order is
reconstructed from `DetailFrag.onCreateView` / `y()` (`DF:230-265`, `DF:830-860`) and
view IDs. In Huawei UI these cards appear top→bottom roughly as:

1. **Header / identity card** — date-time (`track_detail_showtime`), sport name, big
   chief number (normally distance) + unit, rank badge, third-party source line,
   AI-coach analysis card. (`DF:586-595`, `DF:830-859`, `DF:280-316`, `DF:336-345`,
   `DF:362-377`).
2. **Summary grid** — two-column `SportDetailItem` table built by
   `TrackDetailItemDrawer` (`DF:840-843`, `TD:126-165`, `TD:196-239`).
3. **Route / popular-route card** — map thumbnail with hot-path name and participant
   count (`DF:379-524`).
4. **Running posture card** — conditional, see §5 (`DF:1883-1914`).
5. **Training results card** — aerobic TE, anaerobic TE, VO2max, recovery time;
   the whole card is hidden if none exists (`DF:1517-1526`).
6. **Lactate-threshold card** — only when `recordFlag == "7"` (`DF:862-911`).
7. **Sport-specific cards** — swim (`DF:1338-1441`), golf (`DF:1361-1387`),
   basketball/jump (`DF:1193-1257`), indoor-equipment resistance (`DF:1153-1161`),
   jump-rope charts (`DF:967-1124`). Not used by running.
8. **Course / marketing action view** (`DF:318-330`), auto-track notice when
   `trackType == 1` (`DF:844-846`), third-party app source line (`DF:336-345`).

### 1.3 Charts tab

`HeartRateFrag` builds one card per series that exists (`HRF:259-340`); each card has a
title, the chart, and an expand button that opens `TrackLineChartActivity` where up to
three series can be overlaid (`CHF:269-358`, `CHF:360-450`). For running the possible
cards are:

| Card | Series / field | Unit | Label (id) | Condition |
|---|---|---|---|---|
| Heart rate | `MotionPath.requestHeartRateList()` (`MP:256-262`) | bpm | "Heart rate" (0x7f021121) | HR samples present |
| Heart-rate zone ring | 5 zone durations | min | "Zone" (0x7f0217b9) | any zone duration >0 (`HRF:1883-1928`) |
| Cadence | `requestStepRateList()` (`MP:272-280`) | steps/min | "Cadence" (0x7f021b73) | cadence samples present |
| Pace | `requestRealTimePaceList()` (`MP:1020-1022`; `njl` can also be derived from speed via `njt.a()`, `NJT:36-38`) | min/km (or /mi) | "Pace" (0x7f021b7b) | pace list present |
| Altitude | `requestAltitudeList()` (`MP:300-306`) | m / ft | "Altitude" (0x7f02157e) | outdoor config 258 includes it; 264 does not (`SportTypeConfig.json chartPage`) |
| Ground contact time | `requestRunningPostureList()` → `gzv.a()` | ms | "Avg ground contact time" (0x7f021620) | `isContractTimeValid()` (`CHF:310-313`) |
| Hang time / flight time | `gzv.l()` | ms | "Hang time" (0x7f0217d5) | `isHangTimeValid()` (`CHF:339-342`) |
| Flight ratio | `gzz.b(gzv.k())` | ratio (0–1) | "Flight ratio" (0x7f021a14) | `isImpactHangRateValid()` (`CHF:343-345`) |
| Landing impact | `gzv.d()` | g | "Avg landing impact" (0x7f021626) | `isGroundImpactAccelerationValid()` (`CHF:315-317`) |
| Vertical oscillation | `gzv.t()` | cm / in | "Vertical oscillation" (0x7f021fb8) | `isVerticalOscillationValid()` (`CHF:346-348`) |
| Vertical stride ratio | `gzv.q()` | % | "Vertical stride ratio" (0x7f021fea) | `isVerticalRatioValid()` (`CHF:349-351`) |
| Active peak | `gzv.o()` | BW | "Active peak" (0x7f021fc0) | `isActivePeakValid()` (`CHF:352-354`) |
| GC time balance | `gzv.n()` | % left | "Average balance" (0x7f021fc6) | `isGcBalanceValid()` (`CHF:355-357`) |
| SpO₂ | `requestSpo2List()` | % | "SpO₂" (0x7f02179a) | spo2 samples present |
| Heart-rate recovery | `requestHeartRecoveryRateList()` | bpm | "Heart rate recovery" (0x7f020a5b) | recovery samples present |

For 258/264 the config `chartPage` is
`["HEART_RATE","STEP_RATE","REALTIME_PACE","ALTITUDE","GROUND_CONTACT_TIME","GROUND_IMPACT_ACCELERATION"]`
(258; 264 omits `ALTITUDE` and has no altitude data). The runtime list is not limited to
that array: `TrackLineChartActivityChartFrag.d()` adds every posture/SpO₂/recovery series
whose data exists (`CHF:300-358`). A **Speed** chart is deliberately not offered for
running: `jpq.i(sportType)` is false for 258/264 (`JPQ:424-426`, `CHF:293-295`).

### 1.4 Pace (splits) tab

`PaceFrag` shows (details in §4):
* header: **Fastest** and **Avg pace** for the selected unit (`PMA:318-359`);
* optional **Half marathon time** / **Marathon time** rows — only when the workout
  actually reached 21.0975 / 42.195 km (`PF:89-100`, `IYZ:621-640`);
* per-km (or per-mile) split rows with a horizontal pace bar, a aggregate row after
  every 5 splits, and a final "Less than 1 km" row for the incomplete split
  (`PMA:101-133`, `PMA:446-533`, `PMA:610-621`);
* a tooltip explaining why average pace can appear faster than the fastest split
  (`IDS_hwh_track_detail_pace_fast_tip`, 0x7f02155d).

### 1.5 Route tab (outdoor only)

Map with the track coloured by pace (fastest/slowest gradient), km markers configurable
as "No markers" or every N km (`TrackScreenFrag.java:545-580`), and a bottom stats panel:
calories + kcal, **max speed** from extend key `bestSpeed`, elevation gain (same
`creepingWave/10` value), average speed, date/time, average pace
(`TrackScreenFrag.java:1105-1295`).

### 1.6 Share preview (not a detail tab)

`TrackShareAllDataFragment` builds the share image, not the workout-detail UI. It repeats
a subset of the same data: title with date/sport type, one chief value (distance,
calories, duration or rope count depending on `chiefSportDataType`), **fastest/slowest
pace** from the split list (or max/avg speed for speed sports), map and device name, and
the lactate-threshold card when present
(`TrackShareAllDataFragment.java:572-650,712-830,841-861`). It has no additional metrics
that are not covered by the tabs above.

---

## 2. Summary metrics (Details tab)

### 2.1 Chief number

The big number is chosen from the record's `chiefSportDataType` (`DF:1724-1759`):

| Chief type | Big value | Source |
|---|---|---|
| 1 or 2 | total calories | `DF:1848-1870` |
| 11 | total duration (HH:MM:SS, no unit) | `DF:1776-1786` |
| default (running) | **distance** in km/mi | `DF:1788-1809` |

For running the chief is distance; it is also pushed into the detail manager as the
`DISTANCE` item (`DF:1805-1807`), but `DISTANCE` is **not** in the running grid field
list (see 2.2), so it appears only as the big number, not in the 2-column grid.

### 2.2 Summary grid — exact field order

The grid is data-driven from `assets/SportTypeConfig.json` inside the APK
(`APK!/assets/SportTypeConfig.json`, sportTypeId 258/264; loaded by `jry.a()` and read in
`TD:327-342`). This array is the display order; rows are filled two per line
(`TD:211-235`). Items whose value is absent/zero are skipped.

**Outdoor running — 258 (and 227), `detailFieldWear`:**

```
TIME, CALORIES, ACTIVE_CALORIES, AVERAGE_PACE, AVERAGE_SPEED,
AVERAGE_STEP_RATE, STRIDE_ITEM, TOTAL_STEPS, RUNNING_ABILITY, HEART_RATE,
LOAD_PEAK, AVERAGE_POWER_ANALOG, TOTAL_CREEP, TOTAL_DESCENT, GOAL_DETAIL
```

**Treadmill — 264:**

* `detailFieldWear` (watch-recorded, data source ≠5): same list as 258 (including
  `RUNNING_ABILITY`).
* `detailFieldIndoor` (phone-recorded, `sportDataSource == 5`, selected by `jpq.f(5)`
  at `TD:338-339`): identical list **minus `RUNNING_ABILITY`**.

So the ordinary 2-column grid for an outdoor run is:

| Row | Left | Right |
|---|---|---|
| 1 | Duration | Total calories |
| 2 | Active calories | Avg pace |
| 3 | Avg speed | Avg cadence |
| 4 | Avg stride | Steps |
| 5 | Single RAI | Avg heart rate |
| 6 | Training load | Avg power |
| 7 | Elevation gain | Total descent |
| 8 | Goal reached | — |

(Empty cells collapse; treadmill-phone records omit Single RAI and shift the rest.)

### 2.3 Metric reference

Legend: `[D]` device summary, `[P]` phone computed, `[D/P]` either by record source,
`[C]` cloud/plan, `[U]` unknown. "Display" is the exact formatting found in the detail
renderer. For resource ids, `0x7f02…` are from the base `com.huawei.health` resource
table; the **VI column is intentionally absent** — see §10.

| Metric | Internal field(s) | Raw unit → display | Origin | Derivation / condition | EN label (resource id) |
|---|---|---|---|---|---|
| Duration | `HiTrackMetaData.totalTime` / `MotionPathSimplify.totalTime` (`HMT:56`, `MPS:147-148`) | ms → `HH:MM:SS` | D/P | elapsed time; formatted by `UnitUtil.e(seconds)` (`JPQ:269-271`; `UnitUtil.java:436-456`) | "Duration" (0x7f0209a8) |
| Distance | `totalDistance` (`HMT:53`, `MPS:138-139`) | m → km/mi, 2 decimals | D/P | GPS/indoor distance; distance formatter divides m by 1000 and converts to mi when imperial (`JPQ:264-267`, `DF:1800-1808`) | "Distance" (0x7f02098a; used on the route/share screens) |
| Total calories | `totalCalories` (`HMT:54`) | cal → kcal, 0 decimals | D/P | raw is stored as kcal ×1000 (`iwy.java:2804`); displayed /1000 (`JPQ:295-297`) | "Total calories" (0x7f02288e) |
| Active calories | `activeCalories` = extend `activeCalorie` (`MPS:327-335`) | cal → kcal, 0 decimals | D/P | raw saved as kcal ×1000 (`iwy.java:2805`); shown only when >0 and < total calories (`TD:1804-1819`) | "Active calories" (0x7f022913) |
| Avg pace | `avgPace` (`HMT:46`, `MPS:117-118`) | s/km → `m'ss''` with `/km` or `/mi` | D/P | for phone records `pace = elapsed_seconds × 1000 / distance_m` (`PMP:323-330`); for watch records the summary field is used. Imperial display multiplies by 1.609344 before formatting (`TD:1898-1912`, `PF:147-160`). Formatter `izn.a()`→`hcc.d()` (`IZN:77-79`, `HCC:103-125`), format string `"%1$s'%2$02d''"` (0x7f022d79) | "Avg pace" (0x7f0209a9); unit "/km" (0x7f021b7a) or "/mi" (0x7f021b79) |
| Avg speed | derived from `avgPace` | km/h or mph, 2 decimals | P | `3600 / pace_s_per_km` (`JPQ:246-252`); imperial multiplies pace by 1.609344 first (`JPQ:253-257`, `TD:1968-1985`) | "Avg speed" (0x7f0209ac); unit "km/h" (0x7f021b76) / "mph" (0x7f021b77) |
| Avg cadence | `avgStepRate` (`HMT:51`) | steps/min, 0 decimals | D/P | the grid row is shown only when `avgStepRate > 0` (`TD:2028-2044`); no fallback in this handler. Upstream, the phone can compute it as `floor((steps/2)/seconds×60)` (`JPQ:629-690`), but that path is used by the `AVERAGE_CADENCE` slot, not by `AVERAGE_STEP_RATE` | "Avg cadence" (0x7f0209ae); unit "steps/min" (plural 0x7f030104) |
| Avg stride | derived from `totalDistance` ÷ `totalSteps` | cm or in, 0 decimals | P | `distance_m / steps × 100`; hidden when stride >200 cm; special formula for phone data source 5 (`TD:2046-2073`); formatter converts cm→in when imperial (`JPQ:312-317`) | "Avg stride" (0x7f020a05); unit "cm" (0x7f0209b2) / "in" (0x7f0209b3) |
| Steps | `totalSteps` (`HMT:55`) | integer | D/P | device pedometer or phone step counter | "Steps" (0x7f0209b0); unit "steps" (0x7f021179) |
| Single RAI (Running Ability Index) | extend `runningAbility`, `runningAbilityDiff` (`TD:393-394`) | 1 decimal | C | shown only when `runningAbility > 0`; rating: diff >1 = Excellent, diff <−2 = Subpar, else Normal (`TD:396-424`). Formula is not in the APK | "Single RAI" (0x7f022c92); "Excellent"/"Normal"/"Subpar" (0x7f022c93/94/95) |
| Avg heart rate | `avgHeartRate` (`HMT:48`) | bpm, 0 decimals | D/P | renderer reads the summary field only (`TD:2118-2140`); for phone records the producer fills it with the arithmetic mean of HR samples (`IZN:203-213`) | "Avg heart rate" (0x7f0209ad); unit "bpm" (0x7f021122) |
| Training load | sportData `load_peak`; extend `loadPeakLevel`, `aerobicLoadPeak`, `anaerobicLoadPeak` | integer + Low/Medium/High | D | shown only if both load-peak strings exist and the level index is valid (`TD:1611-1640`). The displayed value is `load_peak`; the aerobic+anaerobic sum (`IZV:46-52`) is only a presence check. Level 0/1/2 → Low/Medium/High (0x7f022b4b/c/d) | "Training load" (0x7f022b4a) |
| Avg power (running) | extend `avgAnalogPower` | W, 0 decimals | D | shown only when >0; for sport types 258/264/227/221/280 the `AVERAGE_POWER_ANALOG` slot renders as **"Avg power"** (`TD:956-970`, `JPQ:109-111`) | "Avg power" (0x7f022468); unit "W" (0x7f02192d) |
| Elevation gain | `creepingWave` (`HMT:61`) | raw 0.1 m → m/ft, 1 decimal | D/P | phone records save `altitudeMgr.c()×10` (`iwy.java:2700`); displayed `/10` (`TD:2150-2175`). Shown when value >1 m, or when altitude samples exist and value ≥0 (`TD:2142-2148`) | "Elevation gain" (0x7f02149f); unit "m" or "ft" |
| Total descent | `totalDescent` (`HMT:41`) | raw 0.1 m → m/ft, 1 decimal | D/P | same scaling (`iwy.java:2701`, `TD:2177-2202`) | "Total descent" (0x7f02157b) |
| Goal reached | sportData `achieve_percent` | %, 1 decimal | D/P | shown only when >0 (`TD:2290-2298`) | "Goal reached" (0x7f0209bf) |
| Max/min HR | `maxHeartRate`, `minHeartRate` (`HMT:49-50`) | bpm | D/P | **stored but not displayed** in the detail screens found here; avg HR and the HR chart use the sample list | — |
| Best pace / best step rate | `bestPace`, `bestStepRate` (`HMT:47,52`) | s/km / spm | D/P | **stored but not displayed**; the Pace tab's "Fastest" is computed from splits, not from this field | — |

Formatting helpers for the units above: `UnitUtil.e(double,int,int)` (`UnitUtil.java:534-560`),
`UnitUtil.e(double,int)` for cm→in/ft/yd/mi (`UnitUtil.java:85-99`).

---

## 3. Heart-rate chart and zones (Charts tab)

### 3.1 Chart

Line chart of `HeartRateData {time ms, bpm}` (`HeartRateData.java:14-36`), with the
average-HR horizontal line and max/min markers. The chart's data layer is created in
`TLS:234-291`. The axis marker shows time and bpm; invalid HR samples are stored
separately (`MP:260-262`). Max/min HR used for the axis come from the sample series, not
from the unused summary fields.

### 3.2 Zone ring

The ring has **five** zones, filled from high to low; the labels depend on the record's
classify method (`HRF:1883-1962`).

| Classify method | Zone labels (high→low) | Resource ids |
|---|---|---|
| 0 — % of max HR | Extreme, Anaerobic, Aerobic, Fat-burning, Warm-up | 0x7f02129a, 0x7f02129b, 0x7f02129c, 0x7f0212f1, 0x7f02129d |
| 1 — heart-rate reserve (HRR) | Advanced anaerobic, Basic anaerobic, Lactate threshold, Advanced aerobic, Basic aerobic | 0x7f021604, 0x7f021605, 0x7f021606, 0x7f021607, 0x7f021608 |
| 3 — lactate-threshold (LTHR) zones | Anaerobic, Lactate threshold, Advanced aerobic, Basic aerobic, Warm-up | 0x7f02216a, 0x7f021606, 0x7f021607, 0x7f021608, 0x7f02216b |

Zone durations: if the watch supplied `hrZ1..hrZ5` (seconds), they are used as-is
(`GZZ:365-375`); if they are all zero/invalid, the phone recomputes them sample by
sample (`HRF:1848-1856`, `GZZ:395-480`). The sample interval used for accumulation is
**5 s** when samples are dense (<40 s apart) or when 1 min × sample-count exceeds the
workout duration, otherwise **60 s** (`GZZ:423-448`). Each sample adds the interval to
its zone (`GZZ:450-480`). Ring values are shown as minutes, or "<1 min" for 1–59 s
(`HRF:1965-1973`, string 0x7f020860).

Zone boundaries are `HeartZoneConf` thresholds (`HZC:216-263`):

| Method | Threshold formula | Source |
|---|---|---|
| 0 — max HR % | max = `220 − age`; boundaries at 50 / 60 / 70 / 80 / 90 / 100 % of max | `HRZT:42-50` |
| 1 — HRR | max = `220 − age`; reserve = `max − restingHR` (rest defaults to 60); boundaries = rest + 59 / 74 / 84 / 88 / 95 % of reserve | `HRZT:53-62`, `HZC:110-118` |
| 3 — LTHR | boundaries are the user's stored LTHR zone values (recovery, aerobic low/high, lactate threshold, anaerobic); no formula in the APK | `HZC:227-230,259-261`, `HAE:157-160` |

The classify method comes from the device record (`mHeartrateZoneType`) or the user's
heart-zone configuration (`HAE:82-87,122-160`). A classify value of `2` is handled
inconsistently: `gzz.e()` maps it to method `0` when building the config
(`GZZ:568-585`), while `HeartZoneConf.findRateRegion(v,2)` treats it as HRR
(`HZC:223-231`). Treat method 2 as ambiguous and use 0/1/3.

### 3.3 Heart-rate recovery

The recovery series (`requestHeartRecoveryRateList`) is plotted as "Heart rate recovery"
(0x7f020a5b). The only explicit computation found is the drop shown on the card:
`(first valid HR − last valid HR) / 2` with min/max markers (`DF:1071-1099`). No
recovery-time or TRIMP formula is applied to this chart.

---

## 4. Splits table (Pace tab)

### 4.1 Data model

Splits are `njj {distance: int metres, points: int track-point count, pace: float
seconds}` (`NJJ:12-53`). They come from:

* the device/phone `paceMap` (keys encode distance; values are split duration in
  seconds) — `PMP:265-273`; key decoding in `NJV:15-35`:
  `distance_m = (key / 100000) × 10`, `points = key % 100000`;
* or a newer `pacesV2` list stored as JSON in `MotionPathSimplify` (`MPS:644-664`).

Full splits are recorded every **1000 m** (running/walking) or **500 m** (swim)
(`PMP:185-192`). The imperial map uses one split per mile (`PMP:195-215`).

### 4.2 Layout and columns

| Element | Content | Formatting | Source |
|---|---|---|---|
| Top — fastest | fastest split duration | `m'ss''` + "/km" or "/mi" | `PMA:318-359` |
| Top — average | overall average pace | same | `PMA:318-359` |
| Top — half marathon | actual half-marathon split time, only if reached | `HH:MM:SS` | `PMA:624-652`, `PF:89-100` |
| Top — marathon | actual marathon split time, only if reached | `HH:MM:SS` | same |
| Split row | split distance (1, 2, 3 … km/mi) and split time | distance 0 decimals; time `m'ss''`; bar width proportional to pace | `PMA:446-533`, `PMA:654-682` |
| 5-split summary | "5 km  00:25:00" + "Split 00:05:00" | `IDS_hwh_motiontrack_show_use_time` 0x7f0214d5, `IDS_hwh_motiontrack_show_segment_time` 0x7f0214db | `PMA:101-133` |
| Partial last row | total distance + "Less than 1 km" + time | plural "km"/"mi" 0x7f0300d3 / 0x7f0300d4; time | `PMA:610-621` |
| Tooltip | explains average pace vs fastest split | 0x7f02155d | `PMA:403-427` |

Unit options: the split length follows the system unit setting — **1 km (metric) or
1 mile (imperial)**. There is no user-selectable custom split distance for running in
this screen; the only custom-distance control found is the map marker interval
("No markers" / every N km, `TrackScreenFrag.java:545-580`). Swim uses 100 m/100 yd
pace units and indoor rowing 500 m (`PMA:296-316`, `PMA:334-340`).

Fastest-split highlight: the row whose split duration equals the minimum duration is
the only row rendered with the "short pace progress" background
(`PMA:499-533`, `PMA:624-652`, `PMA:684-699`). The top card shows **Fastest** and
**Avg pace** side by side; if average pace is faster than the fastest complete split
(possible when the final partial km is excluded), a guide line is moved and the tooltip
is shown (`PMA:624-652`, `PMA:403-427`).

---

## 5. Running posture

### 5.1 Card and availability

The posture card is shown on the Details tab only when
`requestRunningPostureList()` is non-empty and not all posture aggregates are zero
(`DF:1883-1914`, `GZV:240-258`). Per-sample posture data is `gzv`; the judge code treats
each sample as **5 s** (`JPZ:213`), and samples are timestamped in seconds
(`GZV:86-92`).

Field map (`GZV`, `QTM:376-410`, `GZU:30-140`):

| Metric | `gzv` accessor | Unit | Aggregated field in `MotionPathSimplify` |
|---|---|---|---|
| Ground contact time | `a()` | ms | `mAvgGroundContactTime` (`HMT:30`) |
| Flight / hang time | `l()` | ms | `mAverageHangTime` (`HMT:27`) |
| Flight ratio | `k()` (raw 0–100) → `gzz.b()` (ratio) | ratio | `mGroundHangTimeRate` (`HMT:36`) |
| Landing impact / impact acceleration | `d()` | g | `mAvgGroundImpactAcceleration` (`HMT:31`) |
| Eversion excursion | `b()` | ° | `mAvgEversionExcursion` (`HMT:28`) |
| Swing angle | `j()` | ° | `mAvgSwingAngle` (`HMT:33`) |
| Foot-strike counts (fore / whole / hind) | `e()`, `i()`, `c()` | count | `mAvgForeFoot/Whole/HindStrikePattern` (`HMT:29,32,34`) |
| Stride length | `m()` | cm | used for vertical ratio |
| Vertical oscillation | `t()` | cm | extend `avg_v_osc` |
| Vertical stride ratio | `q()` | % | extend `avg_v_s_r`; computed as `vertical_oscillation / stride × 100` when absent (`RunningPostureSource.java:130-140`, `GZU:122-127`) |
| GC time balance | `n()` | % left | extend `avg_gc_tb` |
| Active peak / impact peak | `o()` | BW | extend `avg_i_p` |
| Impact loading rate | `f()` | BW/s | extend `avg_v_i_r` |

Naming caveat: the English label says "flight ratio", but both the bundled config and
the advice code treat the value as a **contact/hang rate where lower is better** (perfect
≈0–4.0, poor >8.1). Read it as ground-contact time ÷ flight time, not air time ÷ contact
time.

The phone aggregates the per-sample data (`GZU:55-140`) and saves the averages
(`JAH:176-205`); the watch may also send the summary values directly. The detail screen
reads the summary values (`HMT`, `DF:1944-2190`). Row labels and display formats:

| Detail row | EN label (resource id) | Display |
|---|---|---|
| Ground contact time | "Avg ground contact time" (0x7f021620) | integer ms (`DF:1983-2001`) |
| Flight time | "Average flight time" (0x7f0217e4) | integer ms (`DF:1944-1962`) |
| Flight ratio | "Average flight ratio" (0x7f021a17) | 1 decimal, ratio (`DF:1964-1981`) |
| Balance | "Average balance" (0x7f021fc6) | "Left: x, Right: y", 2 decimals, % (`DF:2052-2074`) |
| Vertical oscillation | "Average vertical oscillation" (0x7f021fb9) | 1 decimal cm / in (`DF:2087-2109`) |
| Vertical stride ratio | "Vertical stride ratio" (0x7f021fba) | 1 decimal % (`DF:2115-2134`) |
| Active peak | "Average active peak" (0x7f0222ec) | 1 decimal BW (`DF:2136-2151`) |
| Impact loading rate | "Average vertical loading rate" (0x7f021fc2) | 1 decimal BW/s (`DF:2153-2170`) |
| Landing impact | "Avg landing impact" (0x7f021626) | integer g (`DF:2172-2190`) |
| Eversion excursion | "Avg eversion excursion" (0x7f02162b) | integer degrees (`DF:2036-2050`) |
| Swing angle | "Avg swing angle" (0x7f02162c) | integer degrees (`DF:2020-2034`) |
| Foot strike | "Foot strike" (0x7f0221b2) | three percentages 0 decimals + proportional bar (`DF:1916-1941`) |

### 5.2 Normal ranges and rating thresholds

The rating engine has five levels: `-1` Poor, `0` Subpar, `1` Average/Normal, `2` Good,
`3` Excellent (`RPA/RunningPostureAdviceBase.java:11-20,91-111`). Some newer advice
classes use a different label set: `-1` Bad, `0` None, `1` Good, `2` Excellent,
`3` Excellence (`RPA/RunningPostureAdviceBase.java:113-129`). The level selects one of
the five posture color resources (poor/suboptimal/normal/good/excellent) in
`IZN:305-322`.

| Metric | Threshold (code) | Levels / tips and advice | Citation |
|---|---|---|---|
| Ground contact time | fallback ≤300 ms → level 1, >300 → −1; with a judge config the level comes from the **pace bucket** | new-version labels (Bad/None/Good/Excellent/Excellence); long tip "Improving ground contact time"; level 1 → "Top athletes have a ground contact time of N ms or under…", otherwise "Try to ensure your foot lands close to your body's centre of gravity…" | `RPA/GroundContactTimeAdvice.java:28,42-44,89-96`; `JPZ:234-245` |
| Flight time (hang time) | <100 ms → −1; 100–125 → 1; >125 → 3; pace-bucket override | new-version labels (Bad/None/Good/Excellent/Excellence); "Improving flight time"; deep squats / single-leg jumps / lunge jumps | `RPA/AverageHangTimeAdvice.java:28-29,46-50,79-83` |
| Flight ratio | fallback `ratio×100`: <150 → 2; 150–250 → 1; >250 → 0; pace-bucket override | new-version labels (Bad/None/Good/Excellent/Excellence); "Improving flight time ratio"; deep squats / lunge jumps / jump rope | `RPA/GroundHangTimeRateAdvice.java:29-31,46-50,79-83`; `DF:1973` |
| Landing impact (impact acceleration) | ≤20 g → 1; >20 g → 3 | level 1 "Normal", else "Large"; long tip "Improve foot strike"; advice lower-body strength / land softly | `RPA/GroundImpactAccelerationAdvice.java:33-35,72-82` |
| Eversion excursion | <5° → 0; 5–25° → 1; >25° → 3 | 0 "Subpar", 1 "Average", 3 "Excellent"; long tip "Fix pronation"; low → ankle exercises; normal → "normal range helps absorb impact"; high → stability shoes | `RPA/EversionExcursionAngleAdvice.java:34-39,89-101` |
| Swing angle | angle <70° **and** speed >10 km/h → 0; angle >140° **and** speed <14 km/h → 3; else 1; speed = `3600 / avgPace` | 0 "Subpar", 1 "Average", 3 "Excellent"; long tip "Improve stride angle"; low → bend leg; high → knee forward, avoid heel kick | `RPA/SwingAngleAdvice.java:36-38,56-66,88-101`; `DF:1900-1901` |
| Foot strike | fore ≥ whole and fore ≥ hind → 0; whole ≥ both → 1; else 3 | level 0 "Subpar", 1 "Average", 3 "Excellent"; long tip "Improve foot strike"; forefoot → cushioning advice; whole foot → landing advice; hind foot → improve landing | `RPA/StrikePatternAdvice.java:35-37,58-70,104-113`; `DF:1916-1941` |
| GC time balance (touchdown balance) | >51.5 or <48.5 → −1; 49.5–50.5 → 1; otherwise 0 | short tips "Poor/Fair symmetry – leaning left/right", "Good symmetry"; long tip "Improve balance" | `RPA/GroundTouchdownBalanceAdvice.java:53-58,79-102`; `DF:2052-2074` |
| Vertical oscillation | ≤5.5 → 3; ≤8 → 2; ≤12 → 1; ≤15 → 0; >15 → −1 (cm) | standard five labels; long tip "Improve vertical oscillation"; jump in place / high knees | `RPA/GroundVerticalAmplitudeAdvice.java:53-64,84-89`; `DF:2087-2109` |
| Vertical stride ratio | ≤6 → 3; ≤8.5 → 2; ≤11 → 1; ≤13 → 0; >13 → −1 (%) | standard five labels; long tip "Improve vertical stride ratio"; jump in place / lunge jumps | `RPA/GroundVerticalAmplitudeRatioAdvice.java:53-64,84-89`; `DF:2115-2134` |
| Active peak (shock peak) | <2 BW → 3; 2–3 → 1; >3 → 0 | standard five labels; long tip "Improve active peak"; lower-body strength | `RPA/GroundShockPeakAdvice.java:59-64,85-89`; `DF:2136-2151` |
| Impact loading rate | <50 BW/s → 3; 50–150 → 1; >150 → 0 | standard five labels; long tip "Improve impact loading rate"; calf raises / softer shoes | `RPA/GroundImpactLoadRateAdvice.java:66-71,59-63`; `DF:2153-2170` |

### 5.2.1 Pace-bucket thresholds from the bundled judge config

Ground contact time, flight time and flight ratio are **not** judged by the fallback
constants when a judge config is present: `jpz.c(value, avgPaceSeconds, judgeList, type)`
picks the pace bucket and then maps the value into perfect/good/normal/suboptimal/poor
(`JPZ:234-323`). The default config is bundled in the APK as
`assets/posture_judge.json` (version 1.0, updated 2019-06-29); a cloud copy
(`com.huawei.health_Sport_Common/posture_judge_update`) overrides it when present
(`JPZ:337-390`). The bundled bands are:

**Ground contact time (ms), lower is better.** Pace buckets are seconds/km.

| Pace bucket | Perfect | Good | Normal | Suboptimal | Poor |
|---|---|---|---|---|---|
| 540–∞ (slow) | 0–280 | 281–325 | 326–365 | 366–380 | 381+ |
| 480–540 | 0–270 | 271–320 | 321–359 | 360–375 | 376+ |
| 420–480 | 0–260 | 261–305 | 306–349 | 350–373 | 374+ |
| 360–420 | 0–245 | 246–284 | 285–318 | 319–348 | 349+ |
| 300–360 | 0–235 | 236–268 | 269–292 | 293–311 | 312+ |
| 240–300 | 0–210 | 211–240 | 241–260 | 261–276 | 277+ |
| 180–240 | 0–195 | 196–215 | 216–235 | 236–260 | 261+ |
| 0–180 (fast) | 0–180 | 181–200 | 201–220 | 221–240 | 241+ |

**Flight time / hang time (ms), higher is better.**

| Pace bucket | Perfect | Good | Normal | Suboptimal | Poor |
|---|---|---|---|---|---|
| 540–∞ (slow) | 70+ | 50–69 | 25–49 | 10–24 | 0–9 |
| 480–540 | 80+ | 58–79 | 29–57 | 14–28 | 0–13 |
| 420–480 | 90+ | 66–89 | 34–65 | 16–33 | 0–15 |
| 360–420 | 100+ | 70–99 | 43–69 | 20–42 | 0–19 |
| 300–360 | 115+ | 80–114 | 62–79 | 41–61 | 0–40 |
| 240–300 | 130+ | 103–129 | 87–102 | 54–86 | 0–53 |
| 180–240 | 145+ | 122–144 | 100–121 | 70–99 | 0–69 |
| 0–180 (fast) | 160+ | 135–159 | 120–134 | 80–119 | 0–79 |

**Contact/hang time rate (config key `contact_hang_time_rate`), lower is better.**
The config values are on a 0–8+ scale (e.g. 4.0, 4.4, 7.3). The per-sample `gzv.k()` is
a raw integer in hundredths; the chart/average code converts it with `gzz.b()`
(`GZZ:344-352`), so raw 400 becomes 4.0.

| Pace bucket | Perfect | Good | Normal | Suboptimal | Poor |
|---|---|---|---|---|---|
| 540–∞ (slow) | 0–4.0 | 4.0–4.4 | 4.4–7.3 | 7.3–8.1 | 8.1+ |
| 480–540 | 0–3.6 | 3.6–4.2 | 4.2–7.1 | 7.1–7.9 | 7.9+ |
| 420–480 | 0–2.8 | 2.8–4.2 | 4.2–6.2 | 6.2–7.5 | 7.5+ |
| 360–420 | 0–2.4 | 2.4–3.7 | 3.7–5.4 | 5.4–7.0 | 7.0+ |
| 300–360 | 0–2.0 | 2.0–3.4 | 3.4–4.9 | 4.9–6.3 | 6.3+ |
| 240–300 | 0–1.8 | 1.8–2.4 | 2.4–3.0 | 3.0–5.5 | 5.5+ |
| 180–240 | 0–1.4 | 1.4–1.9 | 1.9–2.5 | 2.5–5.0 | 5.0+ |
| 0–180 (fast) | 0–1.2 | 1.2–1.5 | 1.5–2.0 | 2.0–4.5 | 4.5+ |

Boundary values are repeated in adjacent bands in the JSON (e.g. 4.0 is both the top of
"perfect" and the bottom of "good"); the code resolves them through the sorted-boundary
list described below.

Mapping to UI levels: perfect → 3, good → 2, normal → 1, suboptimal → 0, poor → −1
(the code uses `3 − index` for the two lower-is-better metrics and `index − 1` for hang
time; `JPZ:309-323`). The new-version short tips then read Excellence / Excellent /
Good / None / Bad (`RPA/RunningPostureAdviceBase.java:113-129`).

Caveat: the fallback constants in the advice classes (≤300 ms, 100/125 ms, 150/250) only
apply when `postureJudgeBeanList` is empty. Also note the scale inconsistency for
`contact_hang_time_rate`: the advice class compares `ratio×100` against 150/250, while
the bundled config uses a 0–8+ scale (`RPA/GroundHangTimeRateAdvice.java:46-50` vs the
table above). Treat the bundled config as Huawei's current rating source and the
advice-class numbers as legacy fallbacks.

The chart deep-dive also groups samples into 5 s pace buckets (`JPZ:198-225`).

### 5.3 Advice categories and deep-dive screen

Tapping any posture row opens `RuninPostureSuggestActivity` with the list of
`RunningPostureAdviceBase` objects and a per-pace-bucket judge map for ground contact
time, hang time and flight ratio (`DF:2201-2257`). Each advice carries:

* `postureId` (0..11) — identifies the metric (`RPA/*.java`, constructors);
* `level` and short tip (label above);
* long tip ("Improving …", "Fix pronation", "Improve stride angle", …);
* improvement advice text (exercise/technique recommendation);
* action-list codes such as `002B`, `004B`, `030B` — these are handed to the
  suggestion module; their meaning is **[U]** (not decoded in this decompile).

The foot-strike advice is classification-based rather than a pure quality scale; note
the code contradiction: hind-foot-dominant strike maps to level 3 (which the base class
labels "Excellent"/teal) while its advice text says "Improve foot strike"
(`RPA/StrikePatternAdvice.java:58-70,104-113`; `RPA/RunningPostureAdviceBase.java:91-111`).

---

## 6. Training results card (TE, VO₂max, recovery time)

The card is titled **"Training results"** (0x7f0209c1) and is hidden if all four values
are absent (`DF:1517-1526`).

| Metric | Data | Display | Origin | Derivation / rating |
|---|---|---|---|---|
| Aerobic training effect | sportData `etraining_effect` (`DF:1669-1670`) | 1 decimal | D | raw integer ÷10. Shown if ≥1.0. Tips: ≤1.9 recovery, 2.0–2.9 maintaining, 3.0–3.9 improving, 4.0–4.9 highly improving, ≥5.0 overreaching (`DF:1672-1685`; strings 0x7f020a07..0x7f020a0b). Progress bar labels Recovery / Maintained / Improved / High impact / Excessive (0x7f020a55..0x7f020a59), value clamped to 1.05–5.5 (`JPQ:91-99,125-134`) |
| Anaerobic training effect | sportData `anaerobic_exercise_etraining_effect` (`DF:1703-1704`) | 1 decimal | D | same ÷10; shown if ≥1.0; labels Recovery / Maintained / Improved / Greatly improved / Excessive (0x7f021720, 0x7f021721, 0x7f021722, 0x7f021723, 0x7f02171f) |
| Title variant | extend `eteAlgoKey` (`DF:619-620`) | — | D | when non-zero the two titles become "Aerobic training stress" / "Anaerobic training stress" (0x7f021b80/0x7f021b81) instead of "…training effect" (0x7f021655/0x7f021634) (`DF:1686-1690,1713-1718`) |
| VO₂max | sportData `max_met` (`DF:1614-1617`) | integer ml/kg/min | D | `((int)(max_met × 3.5)) / 65536`; raw `max_met` is MET in Q16 fixed point, so this is `MET × 3.5`. Shown if >0. Unit 0x7f0213ba. Peer label from age/gender band: "%s among male/female/peers" (0x7f0213bb/bc/0x7f021a4e). Tap opens Vo2maxActivity (`DF:1639-1665`) |
| VO₂max rating | value vs age/gender cut points | Low / OK / Below average / Average / Good / Great / Excellent | P | 8 cut points per age band 0/25/30/35/40/45/50/55/60 for male and female (`JPQ:137-206`); label array `IDS_motiontrack_ox_ability_with_gender` = `["Low","OK","Below average","Average","Good","Great","Excellent"]` (`0x7f040033`); picked by `floor` into the cut-point array (`JPQ:208-224`) |
| Recovery time | sportData `recovery_time` (`DF:1542-1549`) | integer hours + "h" | D | value is **minutes**; `TimeUnit.MINUTES.toHours()` truncates, so <60 min is hidden (`DF:1542-1566`). Message: "You'll need a total of %d hours to recover based on your recent exercise." (plural 0x7f030069); description 0x7f021b7f. There is no formula in the APK — it is a device value |

VO₂max age/gender cut points (ml/kg/min). The rating is the number of cut points less
than or equal to the value, mapped to the seven labels above (`JPQ:137-224`):

| Age band | Male cut points (8) |
|---|---|
| 0–24 | 26, 32, 38, 44, 51, 57, 63, 69 |
| 25–29 | 26, 31, 36, 43, 49, 54, 60, 66 |
| 30–34 | 23, 29, 35, 41, 46, 52, 57, 62 |
| 35–39 | 23, 28, 33, 39, 44, 49, 55, 61 |
| 40–44 | 20, 26, 32, 36, 42, 47, 52, 57 |
| 45–49 | 20, 25, 30, 35, 40, 44, 49, 54 |
| 50–54 | 20, 24, 28, 33, 37, 42, 47, 52 |
| 55–59 | 17, 22, 27, 31, 35, 40, 44, 48 |
| 60+ | 17, 21, 25, 29, 33, 37, 41, 45 |

| Age band | Female cut points (8) |
|---|---|
| 0–24 | 22, 27, 32, 37, 42, 47, 52, 57 |
| 25–29 | 21, 26, 31, 36, 41, 45, 50, 55 |
| 30–34 | 20, 25, 30, 34, 38, 43, 47, 51 |
| 35–39 | 20, 24, 28, 32, 36, 41, 45, 49 |
| 40–44 | 18, 22, 26, 30, 34, 38, 42, 46 |
| 45–49 | 18, 21, 24, 28, 32, 36, 39, 42 |
| 50–54 | 14, 19, 23, 26, 30, 33, 37, 41 |
| 55–59 | 15, 18, 21, 24, 28, 31, 34, 37 |
| 60+ | 13, 16, 19, 22, 25, 28, 31, 34 |

TE/anaerobic TE/recovery time/VO₂max are all device-summary values; no TRIMP or
phone-side TE formula was found. In particular, `workout_Epoc` exists in the device
record (`WRS:25-26`) but is **not displayed** by the detail plugin.

`WorkoutRecordStatistic` (device sync model) carries the same family of fields:
`workoutEtrainingEffect`, `anaerobicTrainingEffect`, `workoutRecoveryTime` (minutes),
`workoutMaxMet` (Q16 MET), `workoutLoadPeak`, `workoutEpoc`, HR peak/min, recovery-HR
list, SpO₂ high/low, climb, half/full-marathon times (`WRS:18-110`).

---

## 7. Other conditional cards

| Card | Trigger | Content | Citation |
|---|---|---|---|
| Lactate threshold | extend `recordFlag == "7"` | LTHR heart rate (`lthrHr`) and LTHR pace (`lthrPace`), units bpm and `m'ss''/km` | `DF:862-950` |
| SpO₂ chart | `requestSpo2List()` non-empty | bar chart, min/max axis, label "SpO₂" (0x7f02179a) | `CHF:319-320`, `TLS:2078` |
| Swim summary | sport 266/262 | avg pace /100 m (or /100 yd), avg stroke rate, avg SWOLF | `DF:1338-1441` |
| Golf | sport 220 | swing count, back/down swing time, tempo, swing speed | `DF:1361-1387` |
| Basketball/jump | sport 271 + chief type 5 | jump count, average height, average flight time, radar score | `DF:1193-1257` |
| Resistance chart | indoor equipment with resistance list | speed percentage chart | `DF:1153-1161` |
| Auto-track notice | `trackType == 1` | inflates an auto-detected-workout banner | `DF:844-846` |
| Third-party source | extend `appName` present | "Source: %s" line (0x7f020bc2) | `DF:336-345` |
| AI-coach analysis | network call succeeds | server-generated coaching card | `DF:280-316` |
| Rank badge | sport 290 | absolute rank or percentile | `DF:362-377` |
| Course action | course workout | course summary/action card | `DF:318-330` |

---

## 8. Data-model reference

### 8.1 `HiTrackMetaData` summary fields (`HMT`)

| Field | Type / unit | Line |
|---|---|---|
| `avgPace`, `bestPace` | float, seconds per km | `HMT:46-47` |
| `avgHeartRate`, `maxHeartRate`, `minHeartRate` | int bpm | `HMT:48-50` |
| `avgStepRate`, `bestStepRate` | int steps/min | `HMT:51-52` |
| `totalDistance` | int metres | `HMT:53` |
| `totalCalories` | int calories (kcal×1000) | `HMT:54` |
| `totalSteps` | int | `HMT:55` |
| `totalTime` | long ms | `HMT:56` |
| `partTimeMap` | `Map<Double,Double>` distance-km → elapsed seconds at that distance | `HMT:57` |
| `britishPartTimeMap` | same for miles | `HMT:58` |
| `paceMap` | `Map<Integer,Float>` encoded split distance → split duration seconds | `HMT:59` |
| `britishPaceMap` | same for miles | `HMT:60` |
| `creepingWave` | float, 0.1 m elevation gain | `HMT:61` |
| `wearSportData` | `Map<String,Integer>` device sport data | `HMT:62` |
| `maxAlti`, `minAlti` | float metres | `HMT:72-73` |
| `totalDescent` | float, 0.1 m | `HMT:41` |
| `mAvgGroundContactTime` | int ms | `HMT:30` |
| `mAverageHangTime` | int ms | `HMT:27` |
| `mGroundHangTimeRate` | float ratio | `HMT:36` |
| `mAvgGroundImpactAcceleration` | int g | `HMT:31` |
| `mAvgEversionExcursion` | int ° | `HMT:28` |
| `mAvgSwingAngle` | int ° | `HMT:33` |
| `mAvgForeFoot/Whole/HindStrikePattern` | int % | `HMT:29,32,34` |
| `mMaxSpo2`, `mMinSpo2` | int % | `HMT:38-39` |

There are **two `MotionPathSimplify` copies** in the APK with the same JSON field names:

* `com/huawei/hwfoundationmodel/trackmodel/MotionPathSimplify.java` — the phone-side
  model used by the detail UI (`MPS:29-202`); `requestPaceList()` falls back from
  `pacesV2` to `paceMap` (`MPS:439-462`).
* `com/huawei/hwdevice/phoneprocess/mgr/exercise/datatype/MotionPathSimplify.java` —
  the device-sync model (`hwdevice/.../MotionPathSimplify.java:24-170`). It carries the
  same serialized summary/pace/posture fields plus `jsonString`, `targetPercent`,
  `exerciseLevel`, `exercise_time`, `mIsWorkout`, `mWorkoutTrajectories`, `mDivingEvent`
  and `dictTypeList`, and uses sentinel defaults: ground contact time `-1`, eversion
  excursion `-101`, average hang time `-1`, ground-hang rate `-1.0`, swing angle `-1`,
  strike patterns `-1` (`hwdevice/.../MotionPathSimplify.java:128-168`). The detail UI
  hides the corresponding row when it sees those sentinels.

### 8.2 Per-point lists (`MotionPath`, `MP:80-130`)

| List | Type | Unit |
|---|---|---|
| `mHeartRateList`, `mInvalidHeartRateList`, `mHeartRecoveryRateList` | `HeartRateData {time ms, heartRate bpm}` | bpm |
| `mStepRateList` | `StepRateData {time ms, stepRate}` | steps/min |
| `mSpeedList` | `njt {time ms, raw}` | raw/10 = m/s; `×3.6` = km/h; pace = `10000/raw` s/km (`NJT:20-40`) |
| `mRealTimePaceList` | `njl {time ms, pace}` | s/km |
| `mAltitudeList` | `njm {time ms, altitude}` | metres (`NJM:14-37`) |
| `mDistanceList` | `TrackDistanceData {time s, distance m}` | metres |
| `mRunningPostureList` | `gzv` at ~5 s | see §5.1 |
| `mPaceMap` / `mPaceV2` | `njj` split list | distance m / duration s |
| `mSegmentDataList` | `CommonSegment` | device laps |

### 8.3 `CommonSectionInfo` (device lap/segment record)

`CSI:14-64` defines per-section: number, time, distance, pace, heart rate, cadence,
step length, total rise/descent, ground contact time, impact acceleration, swing angle,
eversion excursion, golf swing fields, GPS point indices, slope degree/percent, action
id/type/result/target, average cadence, interval/strength fields, diving fields, golf
hole fields, and a free-form `commonFieldMap`. This struct is **not consumed by the
running detail plugin** in this build (no reference in
`com/huawei/healthcloud/plugintrack/`); the running splits UI is built from `paceMap`.
Do not model our splits from `CommonSectionInfo` unless we also need device lap data.

### 8.4 `WorkoutRecordStatistic` (device sync record)

See §6 note; notable fields: `workoutEtrainingEffect`, `anaerobicTrainingEffect`,
`workoutRecoveryTime` (min), `workoutMaxMet` (Q16 MET), `workoutLoadPeak`,
`workoutEpoc`, `highest/lowestBloodOxygen`, `recoveryHeartRateList`,
`workoutClimb`, `accumulativeDropHeight`, `highest/lowestAltitude`,
`half_marathon_time`, `total_marathon_time` (`WRS:18-110`).

---

## 9. Minimal implementable set from summary + per-second samples

Assume we have: summary (distance, total time, avg/max HR, avg cadence, total steps,
calories if device gave them), and samples of HR, speed, cadence, altitude, distance.

### Can compute ourselves

| Output | Formula / method | Notes |
|---|---|---|
| Duration, distance | direct | use elapsed time; no moving-time adjustment is visible in Huawei's detail code |
| Avg pace | `elapsed_seconds × 1000 / distance_m` | matches `PMP:323-330` |
| Avg speed | `3600 / pace_s_per_km` | `JPQ:246-252` |
| Max speed | max of speed samples | Huawei shows it only on the Route tab from extend `bestSpeed`; we can compute from samples |
| Splits (per km/mi) | integrate distance/time; emit a split each 1000 m (or 1609.344 m) | same model as `njj`; fastest split = min split duration |
| Fastest split | min split duration | highlight row; half/marathon rows only when distance actually reached |
| Avg/max/min HR | mean / max / min of HR samples | Huawei's avg is arithmetic mean, not time-weighted (`IZN:203-213`) |
| HR zone durations | classify each sample with `HeartZoneConf` and add the sample interval (5 s or 60 s) | exact thresholds in §3.2; can reproduce method 0/1 exactly, method 3 only if user supplies LTHR zones |
| HR recovery drop | `(first valid HR − last valid HR) / 2` | `DF:1071-1099` |
| Avg cadence | `floor((steps/2)/seconds × 60)` if no device cadence | `JPQ:629-690` |
| Avg stride | `distance_m / steps × 100` cm; hide if >200 cm | `TD:2046-2073` |
| Elevation gain/descent | sum positive/negative altitude deltas (Huawei uses a smoothed altitude manager; raw sum needs hysteresis) | Huawei stores 0.1 m units; `iwy.java:2700-2701` |
| Max/min altitude | from altitude samples | chart axis only in Huawei |
| HR/cadence/pace/altitude charts | direct series | pace = `10000/raw_speed` s/km (`NJT:31-37`) |
| SpO₂ min/max | from spo2 samples if present | chart only |

### Can only approximate (not device-identical)

| Output | Why | Possible approach |
|---|---|---|
| Calories | Huawei's phone algorithm is upstream (`iwy.java:2804`), not in the detail plugin | MET/HR-based estimate; needs user weight |
| Training effect / anaerobic TE / training stress | device-provided; no formula found | TRIMP or EPOC model, calibrated separately; do not label it as Huawei TE |
| Recovery time | device-provided minutes | estimate from TE/TRIMP; no formula in APK |
| VO₂max | device `max_met` (Q16 MET ×3.5) | Uth–Sørensen or similar estimate; cannot reproduce Huawei's number |
| Running Ability Index (RAI) | cloud/run-plan value (`runningAbility`, `runningAbilityDiff`) | not reconstructible from workout samples |
| Training load / load peak | device fields `aerobicLoadPeak`/`anaerobicLoadPeak`/`load_peak` (`TD:1611-1640`) | no formula in APK |
| VO₂max peer rating | phone table is known (§6) | can reproduce the table, but needs the same maxMET input |

### Cannot compute without device data

* Ground contact time, flight time, flight ratio.
* Vertical oscillation, vertical stride ratio.
* Landing impact (g), active peak (BW), impact loading rate (BW/s).
* GC time balance (left/right %).
* Eversion excursion, swing angle, foot-strike distribution.
* All posture ratings/advice (unless we implement our own thresholds).
* Lactate-threshold HR/pace.
* SWOLF, stroke rate/pull frequency, swim segments, golf/basketball/jump-rope metrics.

---

## 10. Vietnamese localization finding

The APK's `resources.arsc` contains **165 `vi` entries in total**, but **none of the
workout-detail strings traced in this document has a `vi` value**. Examples checked:
`IDS_motiontrack_show_detail_avragepace`, `IDS_track_average_heart_rate_with_unit`,
`IDS_running_posture_avg_ground_contact_time`, `IDS_hwh_health_vo2max`, all zone labels,
all posture labels. These labels therefore fall back to English in this build.
`docs/re-evidence/huawei/jadx-out/resources` does not contain `res/values/strings.xml`
or `values-vi`, so no VI strings could be extracted from the decompile itself. Some
layout-only strings could not be checked because the layout XML is absent, but every
label reachable from the detail code has no `vi` value.

### Proposed Vietnamese labels for our app (not Huawei evidence)

These are suggestions for Unified Health; they are not present in the Huawei APK.

| EN | Proposed VI |
|---|---|
| Duration | Thời gian |
| Distance | Quãng đường |
| Total calories | Tổng calo |
| Active calories | Calo vận động |
| Avg pace | Pace trung bình |
| Avg speed | Tốc độ trung bình |
| Avg cadence | Nhịp chân trung bình |
| Avg stride | Độ dài sải chân trung bình |
| Steps | Số bước |
| Single RAI | Chỉ số năng lực chạy (RAI) |
| Avg heart rate | Nhịp tim trung bình |
| Training load | Tải tập luyện |
| Avg power | Công suất trung bình |
| Elevation gain | Độ cao tăng |
| Total descent | Độ cao giảm |
| Goal reached | Hoàn thành mục tiêu |
| Training results | Kết quả tập luyện |
| Aerobic training effect | Hiệu quả tập luyện hiếu khí |
| Anaerobic training effect | Hiệu quả tập luyện kỵ khí |
| Recovery time | Thời gian hồi phục |
| VO₂Max | VO₂Max |
| Fastest | Nhanh nhất |
| Split | Đoạn |
| Half marathon time | Thời gian bán marathon |
| Marathon time | Thời gian marathon |
| Heart rate recovery | Nhịp tim hồi phục |
| Ground contact time | Thời gian tiếp đất |
| Flight time | Thời gian bay |
| Flight ratio | Tỷ lệ bay |
| Vertical oscillation | Dao động dọc |
| Vertical stride ratio | Tỷ lệ dao động dọc/sải chân |
| Landing impact | Lực tác động khi tiếp đất |
| Active peak | Đỉnh lực tác động |
| Impact loading rate | Tốc độ gia tải va chạm |
| GC time balance | Cân bằng thời gian tiếp đất |
| Eversion excursion | Biên độ lật bàn chân |
| Swing angle | Góc vung chân |
| Foot strike | Kiểu tiếp đất |
| Poor / Subpar / Average / Good / Excellent | Kém / Chưa tốt / Trung bình / Tốt / Xuất sắc |
| Zone | Vùng |
| Extreme / Anaerobic / Aerobic / Fat-burning / Warm-up | Cực đại / Kỵ khí / Hiếu khí / Đốt mỡ / Khởi động |

---

## 11. Explicit gaps / not found

* **No layout XML**: `jadx-out/resources` is empty; card order in §1.2 is approximate.
  Tab order and conditions are exact.
* **No VI translations** for any detail string in this APK build (§10).
* **Pace-bucket thresholds** for ground contact time / flight time / contact-hang rate
  are bundled in `assets/posture_judge.json` (v1.0) and reproduced in §5.2.1; a cloud
  copy can override them, so live values may differ (`JPZ:337-390`).
* **No TRIMP, calorie, recovery-time, load-peak, TE or RAI formulas** in the detail
  plugin. The UI only reads device/plan values.
* **Max/min HR and best pace/best step rate** are stored in `HiTrackMetaData` but are not
  rendered by the detail screens found here; max HR for the chart comes from the sample
  list.
* **No separate "best km" card**; the Pace tab's "Fastest" is the minimum split
  duration, and the average/fastest guide follows the partial-km rule (§4.2).
* **No custom split distance** for running; only km vs mile system units. Swim/rowing
  have their own fixed split distances.
* **No pace-zone section** in the running detail screens. The sport manager stores a
  `runPaceZoneConfig` extend value (`iwy.java:2817-2821`) but nothing in
  `com/huawei/healthcloud/plugintrack/` reads it. `PaceHorizontalFrag` is a
  "running pace range" distribution table, not coach-defined pace zones.
* **EPOC is not displayed** by the detail plugin (`WRS:25-26` only).
* **`CommonSectionInfo` is not used** by the running detail plugin; it is a device lap
  record, not the source of the split table.
* **Action-list codes** in posture advice (`002B`, `030B`, …) are not decoded.
* **Run-course / hot-path** cards and AI-coach text are server/route features, not
  metrics; only their presence is documented.
* **Cadence scale ambiguity**: `AVERAGE_STEP_RATE` uses the device `avgStepRate`
  unchanged, but the phone fallback divides total steps by 2 before converting to
  per-minute (`JPQ:684-690`). The two paths can therefore differ by roughly 2×; verify
  against a real record before choosing one convention.
* **Decompile ambiguity around distance formatting**: the km/mi formatter is
  `jpq.b(double)` (`JPQ:264-267`: metres ÷1000, ×0.621371 for miles, 2 decimals), but
  the call sites pass the `int` `requestTotalDistance()` (`DF:1805`, `TD:1752`) and the
  decompiled `jpq.b(int)` (`JPQ:308-310`) just formats the raw number. Most likely a
  lost `(double)` cast in decompilation; treat `jpq.b(double)` as the intended display
  formatter. `jpq.b(int)` is also used for step counts, where raw formatting is
  correct.

---

## 12. Quick mapping for implementation

If we want the same coverage with our own data model:

1. **Summary grid** — fields in §2.2 order; skip zero/absent values; two columns.
2. **Chief number** — distance (km/mi) unless the record's chief type says calories or
   duration.
3. **Charts** — HR, cadence, pace, altitude; add posture series only if a device supplies
   them; SpO₂/recovery-HR conditionally.
4. **Splits** — one split per km or mile; fastest split highlighted; 5-split aggregate
   row; partial final row with "Less than 1 km".
5. **Posture** — show only metrics with data; use the bundled pace-bucket table in
   §5.2.1, with Huawei's fallback constants as a last resort.
6. **Training results** — TE/anaerobic TE/recovery/VO₂max; reproduce thresholds and
   labels, but source values from device or our own estimators explicitly labelled.
