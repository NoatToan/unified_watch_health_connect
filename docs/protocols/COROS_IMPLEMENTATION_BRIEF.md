# COROS Implementation Brief — `driver/coros`

> Mục đích: checklist ưu tiên cho engineer làm `driver/coros`, dựa trên phân tích
> `com.yf.smart.coros.dist` 4.11.8 (`COROS_DEVICE_PROTOCOL.md`).  
> Ngày: 2026-11-06.

> **Cập nhật 2026-11-08:** đính chính bằng chứng CRC theo `docs/analysis/COROS_CONNECTION_ANALYSIS.md`
> §4.8. `PACTYP_CRC16`/`PACTYP_CRC32` là enum packet-type của **Opus audio**, không phải framing BLE.
> Bằng chứng CRC thật là `block_crc32` trong `syn_info.proto`, `CRC16_FIELD_NUMBER` /
> `CRC_FIELD_NUMBER` và các log retry block. Xem thêm `COROS_DEVICE_PROTOCOL.md` §6.6.

---

## Tóm tắt tình trạng

| TODO | File trong driver | Trạng thái | Mức độ |
|---|---|---|---|
| Handshake / transport channel xác nhận | `CorosSession.kt:34` | NEEDS-REAL-WATCH | P0 |
| History sync (steps, HR, sleep, SpO2, HRV, workouts) | `CorosDriver.kt:26` | NEEDS-REAL-WATCH | P0 |
| Command ID (`BleCmdDefPb$CMD_E`) thực | — | NEEDS-REAL-WATCH | P0 |
| UUID service nào dùng cho model nào | `CorosUuids.kt` | PARTIAL | P1 |
| Thứ tự bond/handshake | `CorosDriver.kt` | PARTIAL | P1 |
| UUID 4 (`c7be000x`) có phải BLE service không | `CorosUuids.kt` | PARTIAL | P2 |
| Partner SDK AIDL (`ICRSPartnerBleService`) | — | RESOLVED (not to implement) | — |

**Counts: RESOLVED = 1 (xác nhận không làm), PARTIAL = 3, NEEDS-REAL-WATCH = 3**

---

## 1. NEEDS-REAL-WATCH — cần HCI snoop log hoặc thiết bị thật

### 1.1 BLE transport channel và handshake (P0)

**Trạng thái:** NEEDS-REAL-WATCH

**Những gì đã biết [V]:**
- Có 4 họ UUID service tuỳ biến:
  - `6E400001/02/03-B5A3-F393-E0A9-77656C6F6F70` ("weloop" NUS)
  - `6E400001/02/03-B5A3-F393-E0A9-77757C7F7F70` (hậu tố không rõ)
  - `6E400001/02/03-B5A3-F393-E0A9-E50E24DCCA9E` (NUS chuẩn Nordic)
  - `ADF70001/02/03-6B99-45E9-98E6-DF67A4C3D291` (tiền tố ADF7, không rõ nguồn gốc)
  - Nordic DFU: `00001530/31/32-1212-EFDE-1523-785FEABCD123` (OTA firmware)
- Có 4 UUID thứ 5 (`c7be000x`) nhưng không có bằng chứng là BLE GATT service → KHÔNG dùng
- App dùng `BleAdvertisedData` tự parse gói quảng bá (không chỉ dùng OS ScanFilter)
- Tên quảng bá bắt đầu "COROS " (đã xác minh đủ danh sách model — xem `device-names.md`)

**Chưa biết:**
- UUID nào trong 4 họ trên là service thực sự quảng bá trong advertisement (vs chỉ có sau discoverServices)
- Characteristic nào là RX (phone writes) vs TX (watch notifies) trong service 3-characteristic
- Giá trị MTU thực app yêu cầu (driver dùng 247 — đây là giá trị Zepp, có thể sai)
- Frame format của packet bọc ngoài protobuf (CRC16 vs CRC32 vẫn chưa rõ; `PACTYP_CRC16/32` không phải bằng chứng BLE — xem ghi chú 2026-11-08; offset của header fields)
- Trình tự bond: trước hay sau mở GATT channel; `YfBtSystemBondAuth` gửi/nhận byte gì

**Việc cần làm khi có HCI snoop log:**
1. Lọc ATT write (handle của từng service 3-characteristic) → xác định UUID service thật
2. Xem ai ghi (phone writes char 2 → watch) và ai notify (watch notifies char 3 → phone) → map RX/TX
3. Đo MTU negotiation packet
4. Xem 4-5 byte đầu của mỗi write/notify: nếu trông random thì có mã hoá ở tầng ứng dụng; nếu có
   pattern rõ (ví dụ byte đầu luôn 0x03/0x05, 2 byte tiếp = length) thì đây là frame header
5. Xem khoảng thời gian giữa write và notify tương ứng → thời gian round-trip, gợi ý ACK/no-ACK

**Ảnh hưởng tới driver:**
- `CorosSession.kt:34` — TODO chính cho toàn bộ transport channel
- `CorosUuids.kt` — cần cập nhật `VENDOR_SERVICES` và xác định RX/TX characteristic

---

### 1.2 History sync — command IDs và data format (P0)

**Trạng thái:** NEEDS-REAL-WATCH (command ID thực), PARTIAL (data schema)

**Những gì đã biết [V]:**
- Sync hàm: `getDailyData(startTime?)`, `getSleepData`, `getHrvStatus`, `getHrvsCount`,
  `getDynamicHeartRate` (gọi sau `getDailyData` nếu "new protocol")
- Data types synced: `SYN_FILE_TYPE_DAILY_RECORD`, `SYN_FILE_TYPE_SPORT`, `SYN_FILE_TYPE_SYSLOG_RECORD`
- Protobuf schemas (tên message): `DailySleep`, `DailyHrmInfo`, `DailySummaryInfo`, `HrvInfo`, `HrvItem`,
  `PPGHrvInfo`, `DailyStress`, `SportSummaryPb`, `SportItemPb`, `SportLapPb`
- Có cơ chế cache (Room `bt_cache`: `cmd`, `dataIndex`, `dataGroup`, `stopCode`, `receivedCmdBytes`)
- `BleCmdPb.MasterSend` = phone→watch, `SlaveAck`/`SlaveNotify` = watch→phone
- `SUPPORT_COMMON_PB_CMD` kiểm tra capability negotiation trước khi gửi
- `TransactionStopCode` có: `success2`, `errorDataFormat`, `YfBtStopCode.errorUnsupportedCmd`

**Phân nhánh "old" vs "new" protocol [V]:**
```
old: getDailyData → onYfBtRequestStop
new: getDailyData → getDynamicHeartRate → ...
```
Chưa biết cách phân biệt new/old tại GATT layer.

**Chưa biết:**
- Giá trị số nguyên của `BleCmdDefPb$CMD_E` cho từng lệnh (đây là thông tin tối thiểu cần có để
  gửi request lên đồng hồ)
- Layout byte thực của payload cho mỗi lệnh request
- Cách truyền tham số "từ ngày nào" cho `getDailyData`/`getSleepData` (timestamp int32? happenDay int?)
- Nghĩa thực của `SYN_FILE_TYPE_*_VALUE` (giá trị enum số)
- Phân trang: `dataIndex`/`dataGroup` trong `bt_cache` cho thấy dữ liệu có thể trả về nhiều phần — cơ
  chế "xin phần tiếp theo" chưa rõ

**Việc cần làm khi có HCI snoop log:**
1. Identify packet ngay sau bond/handshake — đây là request đầu tiên của sync flow
2. Decode protobuf bytes bằng `protoc --decode_raw` (không cần schema, chỉ cần raw protobuf bytes):
   field number và values tiết lộ command ID và tham số
3. Map `BleCmdDefPb.CMD_E` values từ field 1 (CMD field) của `MasterSend`
4. Đối chiếu với response `SlaveAck`/`SlaveNotify` để hiểu response schema

**Test byte vectors (khi có thực):** Để lại trống — điền bằng `protoc --decode_raw <hex>` trên log thực.

**Ảnh hưởng tới driver:**
- `CorosDriver.kt:26` — TODO chính cho sync
- `CorosSession.sync()` hiện tại trả 0 bản ghi

---

## 2. PARTIAL — có kiến trúc, thiếu giá trị thực

### 2.1 UUID service nào dùng cho model nào (P1)

**Trạng thái:** PARTIAL

**Đã biết:** 4 họ UUID tuỳ biến + DFU (xem §3.2 protocol doc), tất cả [V] tồn tại trong DEX.

**Giả thuyết hợp lý nhất [I]:**
- `6E400001/02/03-…-77656C6F6F70` ("weloop") — model thế hệ cũ hơn (APEX 42/46mm, PACE, VERTIX 1?)
- `6E400001/02/03-…-E50E24DCCA9E` (NUS chuẩn) — model dùng module Nordic mặc định
- `ADF70001/02/03-…-DF67A4C3D291` — model khác (APEX 2 Pro? VERTIX 2?) hoặc thiết bị phụ kiện
- DFU (`00001530/31/32`) — dùng khi OTA firmware (mọi model)
- `c7be000x-…` — không rõ, tạm thời không dùng

**Việc cần làm:**
1. `discoverServices` trên COROS PACE 2/APEX 2/VERTIX 2 → xem service nào xuất hiện
2. Xem gói quảng bá có Service UUIDs trong Complete List of 128-bit UUIDs (AD type 0x07) không

**Ảnh hưởng tới driver:** `CorosUuids.VENDOR_SERVICES` và nhận diện trong `CorosDriver.recognize()`

---

### 2.2 Thứ tự bond và handshake (P1)

**Trạng thái:** PARTIAL

**Đã biết [V]:**
- App lắng nghe `ACTION_BOND_STATE_CHANGED` → có bond OS
- `YfBtSystemBondAuth`, `YfBtAuth`, `YfBtAuthState`, `YfBtParamAuth` — 4 lớp liên quan auth
- `YfBtConnector.recovery.domain.model.{ManualRebindReason, GattState, ProbeResult}` → có recovery state machine
- Protocol version2 (`GattCallbackV2`) là version hiện tại

**Giả thuyết [I]:** Bond trước handshake GATT (giống Garmin), sau đó `YfBtSystemBondAuth` gửi một
confirmation command qua `blecmd` channel (không phải ECDH key exchange như Zepp).

**Chưa biết:** Bytes cụ thể mà `YfBtSystemBondAuth` gửi/nhận.

---

## 3. RESOLVED (không triển khai trong driver hiện tại)

### 3.1 COROS Partner SDK AIDL

**Trạng thái:** RESOLVED — quyết định không triển khai (xem D-106 trong `docs/DECISIONS.md`)

**Lý do:** Cần đăng ký đối tác với COROS, phụ thuộc app COROS luôn chạy, ngoài phạm vi driver BLE
trực tiếp. Ghi nhận làm phương án B tương lai nếu sản phẩm muốn tích hợp chính thức.

**Thông tin kỹ thuật đủ để implement khi cần:**
- Service: `com.yf.smart.weloopx.module.partnersdk.ui.service.CRSPartnerBleService`
- Intent action bind: `com.coros.partner.ble.BIND_SERVICE`
- Wake activity: `com.coros.partner.ble.WAKE_SERVICE`
- AIDL: `com.coros.partner.ble.ICRSPartnerBleService` / `ICRSPartnerBleCallback`
- Auth: `PartnerAuthRepo.NetAuthRequest`/`NetRevokeRequest` → cloud COROS API, cần `BizPublicKey`

---

## 4. Features app COROS hỗ trợ mà driver hiện KHÔNG có

### 4.1 OTA Firmware Update qua BLE (Nordic DFU)
- `FirmwareUpgradeBleRunner` với state machine: `preSync`, `startTransferFirmware`, `retrySendFirmware`
- UUID: Nordic DFU (`00001530/31/32`) đã có trong `CorosUuids.kt`
- Rủi ro cao (có thể brick thiết bị); không triển khai (D-803)

### 4.2 OTA qua WiFi
- `WifiOtaReadyResult`, `YfBtResultOtaStatus` → app cũng hỗ trợ firmware update qua WiFi
- Không liên quan BLE driver

### 4.3 Live Track GPS
- `BleLiveTrackDeviceController` — gửi vị trí live tracking qua BLE trong khi tập
- Cần biết command ID và payload format; không triển khai

### 4.4 Weather sync (phone→watch)
- `WeatherAppCache` với `DeviceSendTimestamp` map → app gửi dữ liệu thời tiết xuống đồng hồ
- Đây là phone→watch (downstream), không phải đồng bộ dữ liệu sức khoẻ

### 4.5 WiFi management
- `SUB_CMD_WIFI_CONNECT_STATE`, `SUB_CMD_GET_SAVED_WIFI_LIST`, `SUB_CMD_WIFI_SET_PWD` → quản lý WiFi
  đồng hồ qua BLE (thêm mạng WiFi, kết nối)
- Ngoài phạm vi sức khoẻ

### 4.6 Watch face transfer
- State machine: `SEND_WATCH_PANEL_META`, `STATE_WAITING_RESPONSE`, `STATE_WARTING_SEND_DATA`,
  `STATE_AFTER_SENDING_FRAME_META`, `TotalNumFrame`, `STATE_SENDING_OVER`
- Mô hình: header meta + N frames + ack từng frame + confirm kết thúc
- Không triển khai (D-803)

### 4.7 Voice notes sync
- `SYN_FILE_TYPE_VOICE_NOTE` — đồng bộ ghi âm giọng nói (Opus format, xem `libw4-jni.so`)
- Ngoài phạm vi sức khoẻ

---

## 5. Khuyến nghị cho engineer

### Thứ tự ưu tiên khi có HCI snoop log:

1. **P0**: Xác nhận UUID service (service nào, char nào RX/TX, có trong advertisement không)
   → Sửa `CorosUuids.kt` + `CorosDriver.recognize()`

2. **P0**: Parse 10-20 packet đầu để decode frame format và command IDs
   ```bash
   # Chạy trên máy local với bytes từ Wireshark
   printf '<hex bytes>' | xxd -r -p | protoc --decode_raw
   ```
   → Điền command ID vào implementation

3. **P0**: Implement transport channel trong `CorosSession`:
   ```kotlin
   // Khung tổng thể cần implement (layout thực chờ HCI log):
   // 1. Subscribe notify characteristic (UUID tuỳ)
   // 2. Gửi BleCmdPb.MasterSend với CMD_E = getDailyData, startTime = lastSync
   // 3. Nhận SlaveAck → extract payload → parse DailySummaryInfo proto
   // 4. Tiếp tục với getDynamicHeartRate nếu "new protocol"
   // 5. Lặp cho sleep, HRV
   ```

4. **P1**: Implement history sync cho `SYN_FILE_TYPE_DAILY_RECORD`:
   - Map `DailySummaryInfo` → `HealthRecord.{Steps, HeartRate, SpO2, Stress, HRV}`
   - Map `DailySleep` / `SleepSummary` → `HealthRecord.Sleep`

5. **P2**: Implement sport sync cho `SYN_FILE_TYPE_SPORT`:
   - Request FIT file, write to temp file, hand off to Garmin FIT SDK parser
   - Map `SportSummaryPb` / `SportItemPb` / `SportLapPb` → `WorkoutRecord`

### Hướng lấy HCI snoop log:

```
Android: Settings → Developer options → Bluetooth HCI snoop log → ON
  → Ghép đôi + sync COROS 1 lần → Settings → Developer options → Bluetooth HCI snoop log → OFF
  → adb bugreport → unzip → rar extract btsnoop_hci.log
  → Mở Wireshark, filter: btatt (ATT protocol)
  → Lọc theo ATT handle của service UUID → xem Write + Notify pairs
```

### Không làm (xác nhận):

- Không crack/unpack shell DEX (`libzgrge.so`) — D-101
- Không triển khai Partner SDK AIDL — D-106  
- Không làm OTA/firmware push — D-803
- Không làm watch face transfer — D-803
