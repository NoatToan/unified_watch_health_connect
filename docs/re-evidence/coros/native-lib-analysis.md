# Phân tích native lib COROS 4.11.8 — `libPbSource.so` và `libw4-jni.so`

Đây là bằng chứng bổ sung thu được từ native library **nằm ngoài DEX đóng gói**, thực hiện
2026-11-06. Các lib trích từ `lib/arm64-v8a/` trong APK bằng:
```bash
unzip -o coros-4.11.8.apk "lib/arm64-v8a/libPbSource.so" "lib/arm64-v8a/libw4-jni.so" -d ./native_libs/
```

---

## 1. `libPbSource.so` — thư viện xử lý dữ liệu thể thao (C++ / Protobuf)

Kích thước: **7,2 MB** arm64-v8a. Bao gồm Protobuf runtime cùng toàn bộ message class cho dữ liệu
sport và daily health được xử lý **sau khi** nhận qua BLE (tầng "parse" phía trên tầng BLE command).
Không chứa code BLE transport.

### 1.1 Danh sách file `.proto` được compile vào lib (từ `descriptor_table_*` symbol) [V]

Trích bằng:
```bash
strings -n 6 libPbSource.so | grep "descriptor_table_"
```

| Proto file (giải mã từ symbol `_2eproto` = `.proto`) | Nội dung suy luận |
|---|---|
| `CRSLDailySleep.proto` | Dữ liệu ngủ theo ngày |
| `CRSLDaily.proto` | Dữ liệu sức khoẻ hàng ngày (bước, HR, stress…) |
| `CRSLSportDataCommonPb.proto` | Protobuf dùng chung cho dữ liệu tập |
| `CRSLTrackInfo.proto` | Dữ liệu track GPS |
| `CRSLEnvironment.proto` | Môi trường/vùng tần số (HR zone, pace zone) |
| `CRSLJni.proto` | Interface JNI giữa Java và native |
| `CRSLUnParseDeviceData.proto` | Dữ liệu thiết bị chưa parse (raw binary từ BLE) |
| `CRSLNoneSportInfo.proto` | Dữ liệu ngoài buổi tập (daily health) |
| `syn_info.proto` | **Thông tin đồng bộ** — tên file này rất quan trọng, xác nhận có cấu trúc proto riêng cho sync metadata |
| `watch_settings.proto` / `watch_settings_v1.proto` | Cài đặt đồng hồ — 2 version, v1 cũ hơn |
| `CRSLEnumDefine.proto` | Bảng enum chung |
| `WebProtocol.proto` | Giao thức web/cloud (không phải BLE) |
| `sportinfo.proto` | Thông tin buổi tập |
| `userdata.proto` | Dữ liệu người dùng |
| `recovery_hr.proto` | Nhịp tim hồi phục |
| `sport_custom.proto` | Cài đặt tập luyện tuỳ chỉnh |
| `interactive.proto` / `sport_interactive.proto` | Tương tác trong tập (workout interactivity) |

### 1.2 Tên message class quan trọng (trích từ C++ mangled symbols) [V]

Trích bằng:
```bash
strings -n 6 libPbSource.so | grep "^_ZN11SportDataPB" | ...
```

Các message class thuộc namespace `SportDataPB` (namespace C++ biên dịch từ proto package):

```
DailySleep, DailySleepAnalysisParam, DailySleepOperation, DailySleepOverview
DailyStress, DailyStressUIInfo
DailyHrmInfo, DailyHrmInfoUI, DailyRhm
DailyInfo, DailyHappenDayInfo, DailySummaryInfo, DailyTimeItem, DailyTimeSegment
DailyOriginInfo, DailyDeviceInfo, DailyDeviceSummary
HrvInfo, HrvItem, PPGHrvInfo        ← HRV data types (rất quan trọng!)
SleepAnalysis, SleepSummary, DaySleepSummary, NewAlgoSleepSummary
SleepRange, SleepTimeRange, SleepSurveySlot, NapSurveySlot
SportSummaryPb, SportItemPb, SportLapPb, SportLapCacheInfo
FitnessBase, FitnessModel, FitnessRunModel, FitnessCycle, FitnessIndexUI
WeatherAppCache, WeatherForecastUI, WeatherSummary   ← app gửi thời tiết xuống đồng hồ
```

Ngoài ra:
- `SynStatsBatteryDaily` — message riêng cho thống kê pin theo ngày trong chuỗi sync
- `SynNetEaseLog` — analytics log (không liên quan giao thức BLE người dùng)
- `EnumSportType`, `EnumSportKind` — bảng enum loại thể thao
- `YFDeviceType`, `YFSportDataType` — enum loại thiết bị và loại dữ liệu tập

**Ý nghĩa đối với driver:** Message `HrvInfo`/`HrvItem`/`PPGHrvInfo` xác nhận có dữ liệu HRV rời rạc
(PPG-based) không phải chỉ trong daily summary mà có thể là từng sample. `DailySleep` / `SleepSummary`
/ `DaySleepSummary` có cả cấu trúc "deprecated" lẫn "new algo" → app đã nâng cấp thuật toán phân tích
giấc ngủ ít nhất một lần, có message proto riêng cho cả hai phiên bản.

---

## 2. `libw4-jni.so` — JNI bridge cho "WeLoop4" (C++ → Java/Kotlin)

Kích thước: **11,4 MB** arm64-v8a. Tên lib ("w4" = WeLoop4, thế hệ 4 của nền tảng WeLoop/COROS) xác
nhận đây là lớp JNI chính kết nối logic native C++ với tầng Kotlin/Java phía trên.

Lib này cũng link `CRSLDailySleep.proto` và `sportinfo.proto` (qua `descriptor_table_*` symbols), khớp
với `libPbSource.so`. Không chứa code BLE transport.

Hàm JNI quan trọng tìm thấy:
```
Java_com_yf_lib_w4_sport_converter_CRSLAudioProcessor_readOpusInfoNative
```
→ Có xử lý file âm thanh Opus (ghi âm giọng nói — khớp `SYN_FILE_TYPE_VOICE_NOTE`).

Hàm `generate_sport_uuid_from_summary` → UUID của buổi tập được sinh từ summary data, không phải UUID
ngẫu nhiên từ thiết bị.

---

## 3. Hằng số đồng bộ file tìm thấy trong `classes.dex` (bổ sung từ lần phân tích trước) [V]

```
SYN_FILE_TYPE_DAILY_RECORD        SYN_FILE_TYPE_DAILY_RECORD_VALUE
SYN_FILE_TYPE_SPORT               SYN_FILE_TYPE_SPORT_VALUE
SYN_FILE_TYPE_SYSINFO_RECORD      SYN_FILE_TYPE_SYSINFO_RECORD_VALUE
SYN_FILE_TYPE_SYSLOG_RECORD       SYN_FILE_TYPE_SYSLOG_RECORD_VALUE
SYN_FILE_TYPE_VOICE_NOTE          SYN_FILE_TYPE_VOICE_NOTE_VALUE
SYN_FILE_TYPE_VOICE_NOTE_INDEX    SYN_FILE_TYPE_VOICE_NOTE_INDEX_VALUE
```
Mẫu `FOO` / `FOO_VALUE` là quy ước tên hằng của Protobuf enum
(`FOO` = tên enum literal, `FOO_VALUE` = giá trị số int của nó được biên dịch dưới dạng hằng riêng).
Vì giá trị `_VALUE` là int trong bytecode, không phải chuỗi, nên **không đọc được con số thực**.
Tuy nhiên sự tồn tại của hai hằng `FOO` + `FOO_VALUE` xác nhận đây là **proto enum** (không phải
hằng Java thông thường).

---

## 4. Luồng đồng bộ daily data — bằng chứng chuỗi log [V]

Hai chuỗi log sau tồn tại liền kề trong `classes.dex`:
```
getDailyData, onReadDataSuccess, is old protocol, onYfBtRequestStop
getDailyData, onReadDataSuccess, is new protocol! prepare to getDynamicHeartRate
```
→ **Phân nhánh "old" vs "new" protocol** trong luồng đọc daily data:
- "old protocol": sau khi đọc daily data xong → dừng (`onYfBtRequestStop`)
- "new protocol": sau khi đọc daily data xong → gọi tiếp `getDynamicHeartRate`

→ Điều này xác nhận **thứ tự sync**: daily data trước, sau đó (nếu protocol mới) là HR
động/chi tiết. Giải thích vì sao bản ghi mẫu JSON (§2.3 protocol doc) có cả `hr`/`hrRest`/`hrvValue`
gộp vào daily summary.

Lỗi: `getDailyData, onReadDataFail, yfBtStopCode =` → dùng `YfBtStopCode` (enum lỗi BLE của thư viện)
cho error reporting.

Các hàm sync khác tìm thấy: `getSleepData`, `getHrvStatus`, `getHrvsCount`, `getStartTime`
(gợi ý có tham số "từ thời điểm nào" trong request).

---

## 5. ACK frame structure constants (bổ sung) [V]

Ngoài các hằng đã biết, lần phân tích này tìm thêm:
```
PACTYP_CRC16    ← packet type có CRC16
PACTYP_CRC32    ← packet type có CRC32
```
→ Giao thức hỗ trợ **hai loại checksum** khác nhau cho các loại packet khác nhau (hoặc thiết bị khác
nhau). Tên `PACTYP_*` gợi ý đây là giá trị trong trường "packet type" của frame header, không phải cờ
độc lập.

---

## 6. Lệnh tái lập

```bash
# Trích proto file names từ libPbSource.so
strings -n 6 lib/arm64-v8a/libPbSource.so | grep "descriptor_table_"

# Trích message class names từ libPbSource.so  
strings -n 6 lib/arm64-v8a/libPbSource.so | grep "^_ZN11SportDataPB" | \
  python3 -c "import sys,re; [print(re.sub(r'[0-9]','_', m.group(2))[:30]) \
  for line in sys.stdin for m in [re.match(r'_ZN11SportDataPB(\d+)(\w+)', line.strip())] if m]" | \
  sort -u

# Trích sync file type constants từ strings_classes.txt
grep "SYN_FILE_TYPE" strings_classes.txt | sort -u

# Trích daily data flow strings
grep "getDailyData\|getSleepData\|getHrvsCount\|getDynamicHeartRate" strings_classes.txt
```
