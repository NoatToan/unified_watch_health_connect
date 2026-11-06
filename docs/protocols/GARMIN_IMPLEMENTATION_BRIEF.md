# Garmin Driver – Implementation Brief

**Mục đích:** checklist kỹ sư để giải quyết toàn bộ `TODO(garmin-protocol)` trong `driver/garmin/src/`.  
**Dựa trên:** `docs/protocols/GARMIN_DEVICE_PROTOCOL.md` + RE đợt 2 (2026-11-06).  
**Trạng thái:** RESOLVED = có đủ bằng chứng để implement ngay; PARTIAL = có hướng nhưng thiếu một mảnh; NEEDS-REAL-WATCH = cần HCI snoop log hoặc đồng hồ thật.

---

## TODO-1 · Registration service 4 info pages

**File:** `driver/garmin/src/.../transport/MultiLink.kt:34`  
**Trạng thái:** PARTIAL  
**Mô tả:** `MultiLinkConnector.openGfdi()` hiện bỏ qua service 4 (REGISTRATION) và nhảy thẳng vào `REGISTER(1, GFDI)`. App Garmin Connect luôn thực hiện info-page query trước.  
**Bằng chứng:** `docs/re-evidence/garmin/registration_service4.md` [V]  

**Nếu đồng hồ thật trả REJECTED khi bỏ qua service 4**, thêm trước `REGISTER(1)`:

```kotlin
// 1. REGISTER service 4
val h4 = ml.register(serviceId = 4, flags = 0)

// 2. Query each info page (6 types)
val INFO_PAGES = listOf(0, 1, 3, 4, 2, 5)  // o.g, o.a, o.d, o.e, o.c, o.f
for (pageType in INFO_PAGES) {
    ml.writeAndAwait(handle = h4, payload = byteArrayOf(pageType.toByte()))
    // response: list of ML service entries this device supports
}

// 3. REGISTER service 1 as before
val h1 = ml.register(serviceId = 1, flags = reliableFlag)
```

**Bước kiểm tra:** Pair một đồng hồ Garmin thật với driver. Nếu `REGISTER(1)` trả status 0 (SUCCESS) mà không có service 4 trước → không cần thay đổi. Nếu trả 4 (REJECTED) → thêm đoạn trên.

---

## TODO-2 · 5050 host capability bitmask

**File:** `driver/garmin/src/.../GarminSession.kt:143`  
**Trạng thái:** RESOLVED  
**Mô tả:** `sendConfiguration(capabilities)` hiện sao chép bitmask của thiết bị, quảng cáo các tính năng như LIVETRACK, GNCS, Weather mà driver không xử lý. Khi đồng hồ gửi tin cho các tính năng đó, driver không có handler → watch có thể retry hoặc ngắt.  
**Bằng chứng:** `docs/re-evidence/garmin/config_capability_bits.md` [V]  

**Fix:** gửi bitmask cố định chỉ chứa các bit driver thực sự hỗ trợ:

```kotlin
private val HOST_CAPABILITIES: Set<Int> = setOf(
    0,   // CONNECT_MOBILE_FIT_LINK – FIT file transfer
    3,   // SYNC
    4,   // DEVICE_INITIATES_SYNC
    5,   // HOST_INITIATED_SYNC_REQUESTS
    29,  // EXPLICIT_ARCHIVE – mark files archived after download
    71,  // CURRENT_TIME_REQUEST_SUPPORT – watch sends 5052 for current time
)

private fun buildHostBitmask(): ByteArray {
    val maxBit = HOST_CAPABILITIES.max()
    val bytes = ByteArray(maxBit / 8 + 1)
    for (bit in HOST_CAPABILITIES) bytes[bit / 8] = bytes[bit / 8] or (1 shl (bit % 8)).toByte()
    return bytes
}

fun sendConfiguration(deviceBitmask: ByteArray) {
    val host = buildHostBitmask()
    val payload = ByteArray(1 + host.size)
    payload[0] = host.size.toByte()
    host.copyInto(payload, 1)
    send(5050, payload)
}
```

**Bit 71 (CURRENT_TIME_REQUEST_SUPPORT):** quando este bit está definido no host bitmask, o watch envia 5052 solicitando a hora atual. `GarminSession` já processa 5052 (`vs2.a.java:333-347`), então manter bit 71 é correto.

---

## TODO-3 · 5023 Battery Status layout

**File:** `driver/garmin/src/.../GarminSession.kt:163`  
**Trạng thái:** NEEDS-REAL-WATCH  
**Mô tả:** payload của 5023 chưa được xác nhận byte-level. Suy luận [I]:

```
[batteryPercent u8][batteryStatus u8][timestamp u32 LE FIT-epoch]
```

`batteryStatus`: 0=unknown, 1=new, 2=good, 3=ok, 4=low, 5=critical, 6=charging.

**Giữ nguyên:** fallback SIG Battery (0x180F) là chính xác và an toàn. Chỉ thêm 5023 parser sau khi xác nhận layout qua HCI snoop log.

**Capture HCI log:**
```bash
adb shell settings put global ble_snoop_log_mode full   # hoặc bật trong Developer options
# Pair + sync bằng Garmin Connect
adb bugreport /tmp/garmin_snoop.zip
# Mở trong Wireshark → filter: btatt.opcode == 0x1b && frame.len > 10
# Tìm GFDI frame bắt đầu bằng 00 (COBS) rồi decode theo §3.4; messageId = 0x9A13 (LE 5023)
```

---

## TODO-4 · FIT monitoring/sleep/HRV message numbers

**File:** `driver/garmin/src/.../codec/fit/FitHealthMapper.kt:14,154,169,196,232`  
**Trạng thái:** RESOLVED (public FIT SDK spec; không cần xác nhận APK)  
**Mô tả:** Các TODO đánh dấu rằng message/field numbers cần đối chiếu với file FIT thật. Tất cả đều dùng số từ FIT SDK profile công khai của Garmin (không phải từ APK).

| Constant | Value | Source |
|----------|-------|--------|
| MESG_MONITORING | 55 | FIT SDK Profile.xlsx |
| MESG_MONITORING_INFO | 103 | FIT SDK Profile.xlsx |
| MESG_STRESS_LEVEL | 227 | FIT SDK Profile.xlsx |
| MESG_SPO2_DATA | 269 | FIT SDK Profile.xlsx |
| MESG_SLEEP_LEVEL | 275 | FIT SDK Profile.xlsx |
| MESG_MONITORING_HR_DATA | 273 | FIT SDK Profile.xlsx |
| MESG_HRV_STATUS_SUMMARY | 389 | FIT SDK Profile.xlsx |

**Hành động:** Giữ các số này. Xóa TODO(garmin-protocol) ở `FitHealthMapper.kt:14` (class-level) và `FitHealthMapper.kt:154,169` (mapRestingHeartRate, mapHrv) sau khi xác nhận trên 1 file thật.

**Điều cần xác nhận bằng file thật:**
1. `monitoring_hr_data` (273): field 1 (`current_day_resting`) thực sự có trong file, và `max(field0, field1)` đúng hoặc nên dùng field1 khi có.
2. `hrv_status_summary` (389): scale 128 → ms đúng; `last_night_average` = field 4.
3. `DailyActivityAccumulator`: steps (MON_CYCLES) là per-activity-type, không phải global cumulative; giá trị max trong ngày = tổng ngày đúng.
4. `sleepIntervals`: sampling là mỗi lần thay đổi stage, không phải mỗi phút → `MAX_SLEEP_SEGMENT_SECONDS = 7200` hợp lý.

---

## Checklist tóm tắt

| # | TODO | Trạng thái | Action |
|---|------|-----------|--------|
| 1 | Service 4 info pages | PARTIAL | Test trên đồng hồ thật; thêm flow nếu REJECTED |
| 2 | 5050 host bitmask | **RESOLVED** | Thay mirror bằng HOST_CAPABILITIES cố định (bits 0,3,4,5,29,71) |
| 3 | 5023 battery layout | NEEDS-REAL-WATCH | Giữ SIG fallback; thêm parser sau HCI log |
| 4 | FIT message numbers | **RESOLVED** | Số đúng per FIT SDK; chỉ cần xác nhận trên file thật |

**Top 5 việc driver engineer phải làm:**
1. **Thay host bitmask 5050** (fix TODO-2, 10 dòng code, không cần hardware)
2. **Test REGISTER(1) trực tiếp** trên đồng hồ Garmin thật để xác nhận service 4 không bắt buộc (hoặc thêm nếu cần)
3. **Capture HCI snoop log** trong một session sync Garmin Connect thật → xác nhận 5023 layout → thêm parser
4. **Dump 1 file MONITORING_B** (FIT type 32) từ đồng hồ thật → verify FIT message numbers và field behavior
5. **Xóa các TODO(garmin-protocol)** còn lại trong `FitHealthMapper.kt` sau khi xác nhận (1) và (4)
