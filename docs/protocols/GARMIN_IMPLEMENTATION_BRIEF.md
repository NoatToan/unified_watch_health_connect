# Garmin Driver – Implementation Brief

**Mục đích:** checklist kỹ sư để giải quyết toàn bộ `TODO(garmin-protocol)` trong `driver/garmin/src/`.  
**Dựa trên:** `docs/protocols/GARMIN_DEVICE_PROTOCOL.md` + RE đợt 2 (2026-11-06).  
**Trạng thái:** RESOLVED = có đủ bằng chứng để implement ngay; PARTIAL = có hướng nhưng thiếu một mảnh; NEEDS-REAL-WATCH = cần HCI snoop log hoặc đồng hồ thật.

> **Cập nhật 2026-11-08:** theo `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md`: service-4 info-page
> query chạy đầu tiên trên **mọi** kết nối (6 page, 1 s/trang ×5, tổng 20 s); 5023 layout là
> `payload[0] & 0x70` + `payload[2]`, poll 10 phút; time sync 5030 `TIME_UPDATED` → chờ 5 s → 5052
> (bit 71) hoặc 5026 TLV khi bit 71 tắt; `maxPacketSize` là link budget.

---

## TODO-1 · Registration service 4 info pages

**File:** `driver/garmin/src/.../transport/MultiLink.kt:34`  
**Trạng thái:** RESOLVED [V] (thứ tự); vẫn cần real-watch xác nhận firmware  
**Mô tả:** `MultiLinkConnector.openGfdi()` hiện bỏ qua service 4 (REGISTRATION) và nhảy thẳng vào `REGISTER(1, GFDI)`. App Garmin Connect **luôn** đăng ký service 4 và query 6 info page **trước** `REGISTER(1)` trên mọi kết nối — không phải chỉ sau khi `REGISTER(1)` trả REJECTED. Timeout 1 s/trang, 5 lần thử, tổng 20 s (`ml2/h0.java:101-140`).  
**Bằng chứng:** `docs/re-evidence/garmin/registration_service4.md`; `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md` §1.6 [V]  

**Thêm trước `REGISTER(1)` (luôn chạy, không điều kiện):**

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

**Bước kiểm tra:** Pair một đồng hồ Garmin thật; xác nhận firmware cụ thể chấp nhận flow service-4 trước `REGISTER(1)`. Vendor luôn chạy flow này, nên không còn nhánh "chỉ thêm khi REJECTED".

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

**Bit 71 (CURRENT_TIME_REQUEST_SUPPORT):** khi bit này bật, host gửi 5030 `TIME_UPDATED` rồi chờ 5 s để watch gửi 5052; khi tắt, host gửi 5026 TLV. `GarminSession` hiện chỉ trả lời 5052 (`vs2.a.java:333-347`), nên giữ bit 71 là đúng nhưng cần thêm trigger 5030/5026.

---

## TODO-3 · 5023 Battery Status layout

**File:** `driver/garmin/src/.../GarminSession.kt:163`  
**Trạng thái:** RESOLVED [V] (layout) / NEEDS-REAL-WATCH (notification vs response identity)  
**Mô tả:** layout 5023 đã xác minh (`ha2/a.java:161-215`, `ha2/b.java:59-77`;
`docs/analysis/GARMIN_CONNECTION_ANALYSIS.md` §3):

```
payload[0] & 0x70 = status (mask/offset [V]; labels [I]: 0x10 new, 0x20 good, 0x30 ok,
                    0x40 low, 0x50 critical, 0x70 invalid)
payload[2]        = battery percent [V]
```

Vendor **poll mỗi 10 phút** (`scheduleAtFixedRate(..., 0, 600000)`) bằng request
`FF 00 <level> FF FF FF`.

**Sửa parser:** driver hiện dùng `[0]=percent, [1]=status` — không khớp vendor. Thay bằng layout
trên; có thể giữ SIG Battery (0x180F) làm nguồn chính/fallback. HCI log chỉ còn cần để xác nhận
notification vs response identity.

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
| 1 | Service 4 info pages | **RESOLVED [V]** | Luôn REGISTER(4) + 6 page trước REGISTER(1); 1 s/trang ×5, tổng 20 s |
| 2 | 5050 host bitmask | **RESOLVED** | Thay mirror bằng HOST_CAPABILITIES cố định (bits 0,3,4,5,29,71) |
| 3 | 5023 battery layout | **RESOLVED [V]** / NEEDS-REAL-WATCH (identity) | `status=[0]&0x70`, `percent=[2]`, poll 10 phút |
| 4 | FIT message numbers | **RESOLVED** | Số đúng per FIT SDK; chỉ cần xác nhận trên file thật |

**Top 5 việc driver engineer phải làm:**
1. **Thay host bitmask 5050** (fix TODO-2, 10 dòng code, không cần hardware)
2. **Thêm service-4 info pages trước REGISTER(1)** theo vendor (TODO-1); test firmware thật
3. **Sửa parser 5023** theo layout `status=[0]&0x70`, `percent=[2]` (TODO-3); HCI log chỉ để xác nhận identity
4. **Dump 1 file MONITORING_B** (FIT type 32) từ đồng hồ thật → verify FIT message numbers và field behavior
5. **Xóa các TODO(garmin-protocol)** còn lại trong `FitHealthMapper.kt` sau khi xác nhận (1) và (4)

---

## Đính chính 2026-11-08 — time sync + maxPacketSize

Nguồn: `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md` §2-3.

- **Time sync:** nếu 5050 bit 71 bật, host gửi 5030 `TIME_UPDATED` rồi chờ 5 s cho 5052; nếu tắt, host gửi 5026 TLV (`vs2/a.java:206-347`). Status: **RESOLVED [V]**; độ chấp nhận 5026 vẫn **NEEDS-REAL-WATCH**.
- **maxPacketSize:** là link budget, không phải payload. `usable = n - ceil(n/254) - 8`; nếu mã hoá XXTEA trừ 18 rồi làm tròn xuống bội số 4 (`us2/b.java:221-235`). Status: **RESOLVED [V]**; test LENGTH_ERROR gần giới hạn vẫn **NEEDS-REAL-WATCH**.
