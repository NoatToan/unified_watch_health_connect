# Garmin Connect Android 5.30.1: cách app tìm, ghép đôi và đồng bộ với thiết bị Garmin

> Mục đích: phân tích để bạn **kết nối đồng hồ Garmin của chính mình** với app sức khoẻ Android tự viết (interoperability).
> Nguồn: `com.garmin.android.apps.connectmobile` 5.30.1 (versionCode 11657, minSdk 32, targetSdk 36), bản APKM của APKMirror.
> Ngày phân tích: 2026-10-31.

---

## 0. Phương pháp, công cụ và giới hạn

| Hạng mục | Chi tiết |
|---|---|
| Giải nén | `garmin-analysis/bundle/`: base.apk (14 file dex), 4 split ABI (mỗi split có 24 file `.so`), split mật độ/ngôn ngữ, `split_gcm_on_demand_resources.apk` (có 1 dex nhưng chỉ chứa 2 class tài nguyên) |
| jadx | `garmin-analysis/jadx-base/` có **62.048 file .java**. jadx kết thúc với `finished with errors, count: 1024`; có **500 file** chứa ít nhất một phương thức `Method not decompiled` (ví dụ `ml2/s.java` phương thức `e`/`i`, `ss2/c.java` phương thức `b`). Phần cốt lõi của giao thức vẫn đọc được. Split tính năng: `garmin-analysis/jadx-gcm/` |
| REA CLI 6.8.0 | `garmin-analysis/rea-output/` có: `package.json`, `permissions.txt`, `AndroidManifest.xml`, `signature.json`, `cls_*.json` (tìm class), `class_*.json` (danh mục thành viên), `method_*.json` (dịch ngược từng phương thức). REA nạp được 62.204 class. Lần chạy đầu thất bại vì chưa đặt `REA_JADX_MCP_JAR`; đã chạy lại với `~/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar` |
| Native | `garmin-analysis/native/lib/arm64-v8a/`. Chỉ có `libreliable-ml.so` liên quan tới giao tiếp thiết bị (đọc bằng `strings`, chưa disassemble) |
| Obfuscation | R8 đổi tên phần lớn package lõi thành tên ngắn (`ml2`, `nl2`, `ct2`, `ss2`…). Tên gốc khôi phục được nhờ annotation coroutine của Kotlin (`@v13.e(c="com.garmin.gfdi.core.Dispatcher", f="Dispatcher.kt")`) và metadata Kotlin |

**Quy ước:** Đường dẫn `pkg/X.java:NN` tính từ `garmin-analysis/jadx-base/sources/`.
- **[V] Đã xác minh:** thấy trực tiếp trong code.
- **[I] Suy luận:** chưa thấy trực tiếp, độ tin cậy ghi kèm.

Bảng đối chiếu tên bị làm rối (tất cả [V]):

| Package bị rối | Tên gốc (lấy từ annotation/metadata) | Vai trò |
|---|---|---|
| `ma2`, `pj2`, `la2`, `da2` | `com.garmin.android.gfdi.*` / lớp GATT `com.garmin.device.ble` | quản lý kết nối BLE, hằng UUID, `requestMtu`, bonding |
| `ik2`, `dk2` | `com.garmin.device.discovery.scan.DiscoveryScanner` | quét BLE, đọc gói quảng bá (advertising) |
| `ml2`, `nl2` | `com.garmin.device.multilink` (`MultiLinkCommunicator`, `MultiLinkService`, `CommandManager`, `RegisterCharacteristicTask`) | Multi-Link (ML) |
| `com.garmin.device.multilink.reliable` + `libreliable-ml.so` | MLR (Multi-Link Reliable) | lớp truyền tin cậy (native) |
| `eh2` | `MultiLinkServiceAgentImpl` | đưa GFDI và các dịch vụ khác lên ML |
| `it2` | `com.garmin.io.cobs` | mã hoá/giải mã COBS |
| `ct2` | `com.garmin.gfdi.messages.MessageWriter/Reader` | khung tin GFDI + CRC |
| `us2` | `com.garmin.gfdi.core.Dispatcher`, `QueuingOutgoingStrategy`, `TransactionIdOutgoingStrategy` | điều phối request/response |
| `rs2` | `com.garmin.gfdi.GfdiDevice`, `GfdiWatchdog` | dựng phiên GFDI |
| `at2` | `com.garmin.gfdi.handshake.HandshakeHandler` | bắt tay |
| `ss2` | `com.garmin.gfdi.auth.AuthHandler`, XXTEA | Garmin Auth + mã hoá |
| `zs2` | `com.garmin.gfdi.fit.FITHandler` | tin FIT 5011/5012 |
| `vs2` | `com.garmin.gfdi.event.CurrentTimeManager`, `SyncMessageManager`, System event | thời gian, đồng bộ, sự kiện |
| `ws2`, `xs2`, `com.garmin.gfdi.file` | `FileManager`, `ReadFileFromDeviceTask` | truyền file |
| `dt2` | `com.garmin.gfdi.protobuf.ProtobufHandler` | protobuf 5043/5044 |
| `com.garmin.proto.generated.*` | "Smart proto" (GDI*.proto) | khoảng 100 dịch vụ protobuf |
| `fm2`, `qm2`, `sm2` | `com.garmin.device.pairing.*` (`PairingGdiAdapter`, `BluetoothClassicDeviceStrategy`, `ConfigurePermissionsUtil`) | luồng ghép đôi |
| `il2`, `ll2`, `gl2` | `com.garmin.device.filetransfer.legacy.LegacySyncManager`, `mlr.MLRTransportPipe`, `CoreTransferManager` | đồng bộ và tải lên |

Bằng chứng REA (ví dụ):
- `rea-output/method_ct2.f.a.json` khớp với `ct2/f.java:59-85` (khung tin và CRC).
- `method_nl2.d.f.json` khớp với `nl2/d.java:211` (lệnh ML Register).
- `method_ss2.c.onMessageReceived.json` khớp với `ss2/c.java:637+`.
- `class_ma2.h.json` (hằng UUID), `class_ml2.q.json` (ID dịch vụ ML), `cls_device_multilink.json` (liệt kê `MLRConnectionHelper`, `MLRInitializer`…).

---

## 1. Kiến trúc tổng thể

```
UI (connectmobile.*: devices, pairing wizard, sync)
  │
  ▼
Device manager / service
  GarminDeviceWakefulService, DeviceSyncService, GCMCompanionDeviceService (CompanionDeviceManager)
  da2.d (khởi tạo, đọc assets/client_config.xml), la2.e (ConnectionManager)
  │
  ▼
BLE transport (pj2.*)
  BluetoothGatt, requestMtu(515), createBond(), subscribe Service Changed
  │
  ├── (máy mới)  Multi-Link: dịch vụ 6A4E2800, characteristic 6A4E281x/282x
  │                 handle 0 = kênh lệnh ML; mỗi gói = [1 byte handle][payload]
  │                 tuỳ chọn MLR (libreliable-ml.so): truyền tin cậy, có sequence/ack
  │
  └── (máy cũ)   GFDI "dedicated": dịch vụ 6A4E2401 / 9B012401…
                  một characteristic đọc (notify) + một characteristic ghi
  │
  ▼
GFDI (com.garmin.gfdi)
  COBS frame → [len16][msgId16 | compact id+txid][payload][CRC16]
  (tuỳ chọn) XXTEA nếu dùng "Garmin Auth"
  Dispatcher, HandshakeHandler, AuthHandler, FITHandler, FileManager, ProtobufHandler (Smart proto)
  │
  ▼
Sync / upload (com.garmin.device.filetransfer, connectdevicesync)
  Đọc thư mục (file index 0) → tải file FIT (5002/5004) → lưu cục bộ
  → upload lên Garmin Connect (cloud) → (tuỳ chọn) ghi sang Health Connect
```

Native lib:
- `libreliable-ml.so` chứa JNI `MLRConnectionHelper_mlrOpenConnection/SendDataBlob/ReceiveRawPacket/ReliableRunProtocol` và `MLRInitializer_performValidation/powerUp`, cùng các hàm `mlr_format_build_raw_packet`, `mlr_format_parse_raw_packet`. [V]
- Các lib còn lại (`libsr`, `libwhp` hiệu chỉnh kim đồng hồ, `libgolf-swing`, `libpacepro`, `libPowerGuidance`, ffmpeg, opencv, mapbox…) không thuộc giao thức thiết bị.

---

## 2. Quét và ghép đôi

### 2.1 Quét BLE [V]
- `ik2/a.java:172-192`: `startScan` dùng danh sách `ScanFilter` do caller truyền vào, `ScanSettings.setScanMode(...)`.
- Nhận diện thiết bị Garmin ở `dk2/d.java:384-520`:
  - **Manufacturer Specific Data, company ID 135 (0x0087, Garmin)** (`dk2/d.java:387`; hằng `TsExtractor.TS_STREAM_TYPE_E_AC3` = 135). Nếu không có thì thử ID 34560 = 0x8700, tức 0x0087 bị đảo byte (`:391`).
  - **2 byte đầu (big-endian) = product number**. Product number được tra sang tên model.
  - Service Data theo các UUID 16-bit **0x2401**, **0x3E10**, **0xFE1F** (UUID thành viên SIG của Garmin) (`ik2/c.java:29-35`). Định dạng TLV: tag 0 là u16 LE; tag 1 là chuỗi "%04d"; tag 2 là "%04X"; tag 3 bỏ qua 6 byte; tag 4 là số 24-bit… Đây là "GarminGenericServiceData" (đơn vị, mã ghép đôi, v.v.). Ý nghĩa từng tag là [I], độ tin cậy trung bình.
- Khi kết nối lại thiết bị đã biết: `pj2/v.java:551` lọc theo `setDeviceAddress(mac)`.

### 2.2 Bonding (ghép đôi BLE ở mức hệ điều hành) [V]
- `pj2/v.java:514-519`: nếu `getBondState()==BOND_NONE` thì gọi `createBond()`, chờ tối đa 45 giây.
- Người dùng xác nhận passkey hoặc số so sánh hiện trên đồng hồ (SMP chuẩn của Android).
- Log trong `fm2`/`qm2`/`sm2`: "Bond state changed to BONDED", "connectDevice: already bonded".
- Có `removeBond` qua reflection (`qm2/g.java:31`) khi cần ghép lại.

### 2.3 Luồng ghép đôi của app (theo log trong `qm2`, `sm2`, `fm2`) [V cho thứ tự log; I cho chi tiết bên trong]
1. Quét, kết nối GATT, `createBond`.
2. Bắt tay GFDI (mục 4). Nếu điện thoại **chưa bond** thì chạy **Garmin Auth** (mục 5).
3. `handleHandshakeCompleted: sending milestone STARTED`: gửi System Event **5030 PAIR_START (3)**.
4. `readGarminDeviceXml` / `retrieveDeviceXML`: tải `GarminDevice.xml` qua file transfer. Nếu file transfer chưa cấu hình thì "fallback directly to legacy xml read".
5. `registerDevice()` lên **cloud Garmin Connect**: gắn unitId vào tài khoản, xử lý lỗi `409 conflict` và `invalid unit ID`.
6. `checkForFirmwareUpdate`, lưu thiết bị vào DB, các quyền (auto upload, weather, LiveTrack…).
7. `onCompleteFlow -- sending milestone PAIRING FINISHED SUCCESS`: gửi **5030 PAIR_COMPLETE (4)**. Nếu lỗi thì gửi PAIR_FAIL (5) ("GFDI #5030 option 5").
8. "start first sync".

### 2.4 Nhận diện loại thiết bị [V]
- **Product number** lấy từ quảng bá và từ tin 5024 Device Information.
- Kèm theo **service UUID** tìm thấy khi discover GATT (`ma2/a.java:342-397`):
  - Lọc mọi UUID dạng `6A4E????-667B-11E3-949A-0800200C9A66`, cộng thêm `9B012401-…` và `16AA8022-…`.
  - Ưu tiên dịch vụ GFDI "dedicated". Nếu không có thì dùng **Multi-Link 6A4E2800**.
- `assets/client_config.xml`: `dedicated_gfdi_service=CONNECT_MOBILE` tương ứng với `9B012401-BC30-CE9A-E111-0F67E491ABDE` và `6A4E2401-…` (`GdiClientConfigurationUtil.java:166`).

---

## 3. Lớp truyền (transport)

### 3.1 UUID GATT

| UUID | Vai trò | Nguồn | Trạng thái |
|---|---|---|---|
| `6A4E2800-667B-11E3-949A-0800200C9A66` | **Dịch vụ Multi-Link** (máy đời mới) | `ml2/m.java:11` | [V] |
| `6A4E2810…2819-667B-11E3-949A-0800200C9A66` | Characteristic **notify** (đọc) của ML; app chọn ngẫu nhiên một cái mà thiết bị có | `eh2/f.java:281-288` (`0x2810 + i`, i=0..9) | [V] |
| `6A4E2820…2829-…` | Characteristic **ghi** tương ứng: thay ký tự '1' đầu tiên bằng '2' (2810→2820) | `ml2/e0.java:52-56` | [V]. Nếu thiết bị không có 282x thì đọc/ghi chung 281x |
| `6A4E2803-…` | characteristic "legacy info" của ML (cách cũ để hỏi danh sách dịch vụ) | `ml2/m.java:14`, `ml2/c` | [V tên], [I vai trò] |
| `9B012401-BC30-CE9A-E111-0F67E491ABDE` | Dịch vụ GFDI dedicated (Connect Mobile, đời cũ) | `ma2/h.java:66` | [V] |
| `4ACBCD28-7425-868E-F447-915C8F00D0CB` | đọc/notify cho 9B012401 | `ma2/h.java:70`, `da2/d.java:52` | [V] |
| `DF334C80-E6A7-D082-274D-78FC66F85E16` | ghi cho 9B012401 | `ma2/h.java:69` | [V] |
| `6A4E2401-…` (và `6A4E4350` MARINE, `6A4E2403` GOLF, `6A4E564B` VIVOFIT_JR) | Dịch vụ GFDI dedicated khác | `ma2/h.java:65-75` | [V] |
| `6A4ECD28-…` / `6A4E4C80-…` | đọc / ghi cho các dịch vụ 6A4E24xx ở trên | `ma2/h.java:71-72`, `GfdiServiceSubscriber.java:239-240` | [V] |
| `6A4E2500-…` (2501 HR, 2502 steps, 2503 calories, 2504 ascent, 2505 intensity, 2507 HRV, 2508 stress, 2509 accel, 250C SpO2, 250D body battery) | Dịch vụ dữ liệu thời gian thực (kiểu Health SDK, dạng dedicated characteristic) | `zm2/a.java:12-160` | [V] |
| `00001818`/`00002A66` (Cycling Power), `0x1810`, `0x180A` (Device Info), `0x180F` (Battery), `0x1801`+`0x2A05` (Service Changed) | GATT chuẩn | `ma2/h.java:88-90`, `pj2/v.java:500-507` | [V] |

### 3.2 MTU [V]
- `pj2/g.java:18`: `requestMtu(515)`.
- Payload tối đa của một gói ML là `MTU_payload − 1` (trừ 1 byte handle), hoặc `−2` nếu dùng chế độ reliable (`ml2/l.java:210-212`).
- GFDI tự chia khung theo `maxPacketSize` mà thiết bị báo trong 5024 (`at2/a.java:481`, `us2/b.java:e()`).

### 3.3 Multi-Link (ML): kênh lệnh trên handle 0 [V]
Mọi lệnh ML là little-endian. `clientId` là u64, Garmin Connect dùng **`client_uuid = 0x01`** (`assets/client_config.xml`).

| Lệnh (byte[1]) | Hướng | Bố cục | Nguồn |
|---|---|---|---|
| `0x00` REGISTER | app → TB | `00 00 \| clientId u64 \| serviceId u16 \| flags u8` (flags: `2` = yêu cầu reliable/MLR) | `nl2/d.java:211-236` |
| `0x01` REGISTER_RESP | TB → app | `00 01 \| clientId u64 \| serviceId u16 \| status u8 \| handle u8 \| reliableFlags u8 \| version u8`; nếu status=3 (ALREADY_IN_USE) thì kèm u16 → UUID `6A4E%04X` để thử lại | `nl2/h.java:17-55` |
| `0x02` CLOSE_HANDLE | app → TB | `00 02 \| clientId \| serviceId u16 \| handle u8`; resp `0x03`: status 0 SUCCESS, 1 INVALID_HANDLE, 2 NO_CONNECTION | `ml2/l.java:128-157` |
| `0x04` | TB → app | handle không hợp lệ (handle nằm ở byte 12) | `nl2/d.java:72-80` |
| `0x05` CLOSE_ALL | app → TB | `00 05 \| clientId \| 0000`; resp `0x06` | `nl2/d.java:172-178` |

- Status của REGISTER: 0 SUCCESS, 1 INVALID_SERVICE_ID, **2 PENDING_AUTH** (app tiếp tục chờ), 3 ALREADY_IN_USE, **4 REJECTED** (`nl2/h.java:79-92`, `nl2/d.java:224-229`).
- **ID dịch vụ ML** (`ml2/q.java`): 1 GFDI, 2 NFC, 3 HEALTH_SDK, 4 REGISTRATION, 5 CONNEXT, 6 REAL_TIME_HR, 7 STEPS, 8 CALORIES, 9 FLOORS, 10 INTENSITY, 12 HRV, 13 STRESS, 14 AUTH_STATUS, 15 ECHO, 16 ACCELEROMETER, 17 SPAM, 18 BMX_RAW, 19 SPO2, 20 BODY_BATTERY, 21 RESPIRATION, 22 KEEP_ALIVE, 26 ACTIVE_TIME (xm2/h còn có 25 TRAINING_READINESS, 29 PUSHES).
- **Gói dữ liệu**: `[handle u8][payload…]`, chia theo MTU (`ml2/s.java:427-458`, dạng smali: `r4[0]=(byte)handle`). Thiết bị gửi notify với byte đầu là handle; `ml2/l.java:179` định tuyến theo handle.
- **MLR (reliable)**: nếu thiết bị đặt `reliableFlags & 1`, app mở `MLRConnectionHelper.onOpenHandle(handle, serviceId, mtu)` và dữ liệu đi qua thư viện native (`ml2/l.java:66`, `ml2/s.java:282-300`). **Định dạng gói MLR nằm trong `libreliable-ml.so`, chưa giải mã.** [I: có sequence number/ack/timer, theo tên hàm `mlr_format_get_sequence_number_count`, `mlr_os_timer_*`; tin cậy trung bình]

### 3.4 Khung tin GFDI [V]
1. **COBS**: `0x00 | COBS(message) | 0x00` (`it2/e.java:27-98`, encoder; `it2/b.java:37-121`, decoder).
2. **Message** (little-endian):
   ```
   [0..1] length u16 (tính cả CRC)
   [2..3] messageId u16                      ← dạng thường
          hoặc [2]=messageId-5000, [3]=txId|0x80   ← dạng "compact", khi protocol ≥150 và cờ bật
   [4..n-3] payload
   [n-2..n-1] CRC16
   ```
   Nguồn: `ct2/f.java:59-85` (ghi), `cd0/h0.java:207-238` (đọc). Đã đối chiếu với `rea-output/method_ct2.f.a.json`.
3. **CRC16**: bảng nibble `{0x0000,0xCC01,0xD801,0x1400,0xF001,0x3C00,0x2800,0xE401,0xA001,0x6C00,0x7800,0xB401,0x5000,0x9C01,0x8801,0x4400}` (`bs2/q4.java:11`). Đây là **CRC-16 của FIT/ANSI (poly 0xA001 phản xạ), seed 0**, tính trên toàn bộ byte trừ 2 byte CRC.
4. **Response (5000 = Acknowledgement)**: payload = `origMsgId u16 | status u8 | data…`. Status: 0 ACK, 1 NAK, 2 UNKNOWN_OR_NOT_SUPPORTED, 3 COBS_DECODER_ERROR, 4 CRC_ERROR, 5 LENGTH_ERROR (`cd0/h0.java:277-292`, `ct2/e.java:83-85`).
5. **Bảng messageId** (`ct2/c.java:20-200`):

| ID | Tên | ID | Tên |
|---|---|---|---|
| 5000 | Acknowledgement | 5030 | System Event |
| 5002 | Download File | 5031 | Supported File Types |
| 5003 | Upload File | 5033–5036 | GNCS (thông báo kiểu ANCS) |
| 5004 | File Data | 5037 | Sync Request |
| 5005 | Create File | 5039/5040 | Find My Phone / Cancel |
| 5006 | Delete File | 5041/5042/5049 | Music control |
| 5007 | Directory Filter | **5043** | **Protobuf Request** |
| 5008 | Set File Flags | **5044** | **Protobuf Response** |
| 5009 | File Ready | 5045 | Cancel Protobuf |
| 5011/5012 | FIT Definition / FIT Data | 5046–5048 | LiveTrack auto start |
| 5014/5015 | Weather Request/Alert | **5050** | **Configuration** |
| 5016/5025 | LiveTrack | **5052** | **Current Time** |
| 5019/5020/5028/5029 | Ephemeris | 5054 | Compressed File Data |
| 5022 | Cancel File Transfer | 5101–5112 | Garmin Auth (mục 5) |
| 5023 | Battery Status | | |
| **5024** | **Device Information** | | |
| 5026 | Set Device Settings | | |
| 5027 | Queued Download | | |

---

## 4. Trình tự bắt tay sau khi kết nối (có thứ tự)

**A. Tầng BLE** [V]
1. `connectGatt`, rồi `createBond` nếu chưa bond (`pj2/v.java:514`).
2. `requestMtu(515)`.
3. Discover services. Bật notify cho Service Changed 0x2A05 nếu có.

**B. Multi-Link** (chỉ với thiết bị có 6A4E2800) [V] (`eh2/f.java:250-330`, `ml2/e0.java`, `ml2/h0.java`, `jn2/j.java:80-102`)

4. Bật notify (ghi CCCD) cho `6A4E281x`.
5. Ghi `CLOSE_ALL` (`00 05 clientId 0000`), chờ resp `0x06`.
6. `REGISTER` serviceId **4 (REGISTRATION)**, flags 0, nhận handle của registration service.
7. Hỏi "info pages" qua handle đó: ghi `[handle][pageType]`, với pageType 0..5 (`ml2/o.java`), để biết danh sách dịch vụ thiết bị hỗ trợ. Có retry 5 lần, timeout 1 giây/trang.
8. `REGISTER` serviceId **1 (GFDI)**, flags `2` nếu có MLR. Nếu status=2 (PENDING_AUTH) thì chờ tối đa 30 giây (`nl2/d.java:224-231`).
9. Mở stream GFDI trên handle được cấp.

**C. GFDI** [V] (`at2/a.java`, `rs2/i.java:850-1000`)

10. **Thiết bị → 5024 Device Information**: `protocolVersion u16, productNumber u16, unitId u32, softwareVersion u16, maxPacketSize u16, btFriendlyName (str), deviceName (str), deviceModel (str)` (chuỗi có tiền tố 1 byte độ dài). Phần tuỳ chọn: `dualBT u8 (=1 thì kèm btClassicMac[6] và bleMac[6], đảo byte), một byte nữa` (`at2/a.java:472-540`).
    **App trả lời ACK** với payload (`at2/a.java:350-376`):
    `protocol u16 (113, hoặc 150 nếu thiết bị ≥150) | productNumber=0xFFFF | unitId=0xFFFFFFFF | appVersion u16 | maxPacket=0xFFFF | friendlyName | Build.MANUFACTURER | Build.MODEL | 0x01`.
    Nếu protocol ≥150 thì chuyển sang header compact có txId (`us2/b.a()`).
11. **(Nếu điện thoại chưa bond, hoặc hãng máy là VIVO) Garmin Auth** (mục 5). `GfdiDevice` chạy song song `AuthHandler` (hoặc `ss2.y`) và `HandshakeHandler` (`rs2/i.java:855-866`).
12. **Thiết bị → 5050 Configuration**: `len u8 | bitmask`. Mỗi bit là một capability. **App ACK, rồi gửi 5050 của host** với bitmask capability mà app hỗ trợ (`at2/a.java:429-458`, `at2/b.java:68`).
13. **Thiết bị → 5011/5012 FIT** (connectivity/sport/audio/segment capabilities). App phản hồi FIT capabilities và đặt thêm bit 6, 8, 52 (`at2/a.java:283-342`, `zs2.h.b`).
    Khi xong thì log "Handshake complete".
14. **Protobuf 5043**: `Smart{ core_service(13) { FeatureCapabilitiesRequest } }`, nhận `FeatureCapabilitiesResponse` (`rs2/i.java:186-231`).
15. Khởi động các data handler: CurrentTime, Sync, File, Protobuf, Battery… **Thiết bị → 5052 Current Time request**. App trả `4 byte đầu của request (lặp lại) | now−631065600 (giây FIT epoch 1989-12-31) | tzOffset s | nextDST transition…` (`vs2/a.java:333-347`). Hoặc app chủ động gửi **5026 Set Device Settings** dạng TLV (tag 1 thời gian, 2 DST, 3 tzOffset, 4/5 DST transitions) (`vs2/a.java:237-270`).
16. App gửi **5030 System Event** `[eventId, 0]` (`vs2/l.java:96-100`), ví dụ `HANDSHAKE_COMPLETE (8)`, `SYNC_COMPLETE (0)`, `PAIR_START (3)`, `PAIR_COMPLETE (4)`, `TIME_UPDATED (16)`, `HOST_DID_ENTER_FOREGROUND (6)` (`vs2/k.java`).
17. **Thiết bị → 5037 Sync Request** (`type u8: 0 MANUAL, 1 INVISIBLE, …; len u8; bitmask kiểu file`), hoặc 5027 Queued Download, hoặc 5009 File Ready. App bắt đầu đồng bộ (`vs2/i.java:200-300`).

---

## 5. Xác thực và mã hoá

### 5.1 Trường hợp bình thường: BLE bonding của hệ điều hành
- `DefaultAuthDelegate.isGarminAuthAllowed()` trả `true` **chỉ khi điện thoại chưa bond (`getBondState()!=12`) hoặc hãng máy là "VIVO"** (`com/garmin/android/gfdi/DefaultAuthDelegate.java:58`). [V]
- Nghĩa là khi đã bond qua SMP chuẩn, **GFDI chạy không mã hoá ở tầng ứng dụng**; bảo mật dựa vào mã hoá link BLE.
- Nếu đã bond mà thiết bị vẫn khởi xướng Garmin Auth, app ném `GarminAuthNotAllowedException("Device initiated Garmin Auth when not allowed")` (`ss2/y.java:51`). [V]

### 5.2 "Garmin Auth": ghép đôi ở tầng ứng dụng khi không bond được [V]
Bộ tin 5101–5112 (`ss2/c.java:152-158`, `:637-845`). Cơ chế mô phỏng lại SMP legacy (STK → LTK/EDIV/Rand → session key):

| Bước | Tin | Nội dung |
|---|---|---|
| 1 | 5101 Auth Negotiation Begin | Bitmask thuật toán: chỉ có **XXTEA (0)**; AES_128 chỉ là "fake field" (`ss2/a.java:21-23`). App trả về: có/không có LTK đã lưu |
| 2 | 5102 LTK Reconnect | (khi đã có LTK) |
| 3 | 5103 STK Begin Generation | chế độ passkey: 0 = hiển thị (người dùng nhập mã trên đồng hồ, timeout lấy từ tin, mặc định 30 s), **1 = passkey 16 byte toàn số 0 ("just works")** (`ss2/c.java:130-133, 725`), 2 = out-of-band |
| 4 | 5104 Confirm, 5105 Rand, 5106 Status | confirm = XXTEA(key=passkey, …XOR MAC…), theo `ss2/a.a()` |
| 5 | 5107 LTK Key Distribution | 32 byte giải XXTEA bằng STK, ra `ltk(16) ediv(2) rand(8)`, lưu vào `AuthRegistry` |
| 6 | 5108 Session Key SKD | sessionKey = XXTEA_enc(key=LTK, skd_dev(8)‖skd_host(8)) |
| 7 | 5109 Session Key Verification | |
| 8 | 5111 Secure Session | Hai bên trao nonce. Sau đó Dispatcher bật `GarminAuthMessageEncryptor/Decryptor` (`us2/b.java:245-255`) |

- **Mã hoá sau auth** (`ss2/p.java`, `ss2/o.java`, `ss2/n.java`): `len u16 | XXTEA_enc(key=sessionKey, counter u32 ‖ div[4] ‖ GFDI message ‖ pad tới bội số 4)`. Thuật toán là XXTEA (Corrected Block TEA, delta 0x9E3779B9, `ss2/n.java:29`).
- Ngoại lệ: ACK cho 5111 không mã hoá (`ct2/f.java:84`).

### 5.3 Điều gì cản app bên thứ ba
- **Về mặt giao thức** [V]: không thấy chữ ký số, chứng chỉ hay token cloud nào được kiểm tra khi bắt tay GFDI. Device Information của host chỉ chứa tên/hãng/model. Không có OAuth gắn với thiết bị trong pha BLE. OAuth và đăng ký thiết bị chỉ diễn ra ở bước **cloud** (`registerDevice`), sau bắt tay.
- **Về Multi-Link** [V cho cơ chế, I cho chính sách]: `clientId` của Connect là `0x01`. Firmware **có thể** trả `REJECTED (4)` hoặc `PENDING_AUTH (2)` cho client lạ. Chưa thấy danh sách trắng phía app (nó nằm trong firmware). Comment trong `client_config.xml` trỏ tới "confluence.garmin.com/display/OUTDOOR/Multi-link+App+UUIDs", nghĩa là Garmin **cấp phát** client UUID cho từng app (Connect, Health SDK, Connect IQ…). Rủi ro bị từ chối: **trung bình–cao, chưa kiểm chứng**.
- **Xung đột với Garmin Connect** [I, tin cậy cao]: chỉ một bond cho mỗi cặp điện thoại–đồng hồ. Nếu Garmin Connect cũng chạy, nó sẽ giữ kết nối GATT và đăng ký dịch vụ GFDI. Status `ALREADY_IN_USE` có thể xảy ra nếu hai app cùng xin GFDI. Garmin Connect còn tự kết nối lại qua CompanionDeviceManager. Dùng song song đòi hỏi Multi-Link với **clientId khác**, đúng cơ chế Health SDK dùng.
- **Phía cloud**: nếu đồng hồ chưa từng được "đăng ký" với tài khoản Garmin thì vẫn kết nối BLE được, nhưng một số tính năng (firmware update, setup wizard) có thể không hoàn tất. [I]

---

## 6. Đồng bộ dữ liệu

### 6.1 File FIT qua GFDI [V]
- **Danh sách file**: tải **file index 0** (thư mục). Mỗi entry 16 byte, bắt đầu từ offset 16 (`com/garmin/gfdi/file/a.java:418-455`): `fileIndex u16 | dataType u8 | subType u8 | fileNumber u16 | specificFlags u8 | fileFlags u8 | size u32 | timestamp u32 (FIT epoch)`.
- **Kiểu file hỗ trợ**: 5031 trả `count u8` và các bộ `{dataType u8, subType u8, name str}`. Mặc định khi thiết bị không hỗ trợ là `(128,4) FIT_TYPE_4` và `(128,36)` (`file/a.java:291-318`).
- **Lọc**: 5007 Directory Filter, 5008 Set File Flags (đánh dấu đã lưu trữ).
- **Tải file**: **5002** `fileIndex u16 | offset u32=0 | type u8=1 | crcSeed u16=0 | size u32=0 | compressed u8` (`xs2/c.java:209-222`). Resp: `status u8 (0 OK, 1 index không tồn tại…) | fileSize u32`.
  Thiết bị đẩy **5004 File Data** (hoặc **5054** khi nén): `flags u8 | crc u16 | offset u32 | data`. App kiểm tra CRC16 luỹ tiến và offset, rồi ACK `status u8 | nextOffset u32` (`xs2/i.java:51-120`).
- **Kiểu FIT đáng quan tâm** (`yr1/o.java`, `gl2/a.java:309-335`):

| Kiểu | Nội dung |
|---|---|
| FIT_TYPE_4 | ACTIVITY |
| FIT_TYPE_32 | MONITORING_B (bước chân, nhịp tim cả ngày, stress…) |
| FIT_TYPE_49 | được đồng bộ cùng nhóm với 32, [I] nhiều khả năng là sleep/wellness |
| FIT_TYPE_44 | METRICS (VO2max…) |
| FIT_TYPE_20 | ACTIVITY_SUMMARY |
| FIT_TYPE_41 | SETTINGS_CHANGE_LOG |
| FIT_TYPE_2 | SETTINGS |
| FIT_TYPE_5/6/7 | WORKOUTS/COURSES/SCHEDULES |
| FIT_TYPE_88 | thuộc nhóm activity |

- **Máy đời mới** còn có đường truyền file riêng trên MLR (`com.garmin.device.filetransfer.mlr.MLRTransportPipe`) và proto `DataTransferService (7)` / `FileAccessService (43)`. [V tên class, I chi tiết]

### 6.2 Protobuf "Smart" [V]
- Tin **5043/5044**: `requestId u16 | dataOffset u32 | totalLen u32 | chunkLen u32 | protobuf bytes` (`dt2/d.java:1137-1147`). ACK: `requestId u16 | offset u32 | 0/1 | errorCode u8`.
- Message gốc là `GDI.Proto.Smart.Smart` (extendable). Mỗi dịch vụ là một extension field. Một số field (`com/garmin/proto/generated/*Extension.java`):

| Field | Dịch vụ | Field | Dịch vụ |
|---|---|---|---|
| 1 | calendar | 21 | live_track |
| 2 | connect_iq_http | 24 | device_message |
| 3 | connect_iq_installed_apps | 27 | credentials |
| 7 | data_transfer | 42 | realtime_settings (cài đặt thiết bị) |
| 8 | device_status | 43 | file_access |
| 10 | audio_prompts | 49 | gncs (thông báo) |
| 12 | find_my_watch | 61 | heart_rate_service |
| **13** | **core_service** | 67 | connection_management |
| 75 | remote_device_management | 87 | rich_notifications |
| 92 | rich_notification_encryption_management | 97 | diagnostics |

  `realtime_settings`: `GDIRealtimeSettingsProto`.
- **Nhịp tim thời gian thực trong Connect** [V]: qua dịch vụ ML `REAL_TIME_HR (6)` (và STEPS 7, STRESS 13, SPO2 19, BODY_BATTERY 20…) hoặc characteristic dedicated `6A4E2501…`. Mapping ở `zm2/a.java:120-160`.

#### 6.2.1 Realtime HEART_RATE (đã giải mã) [V]

**Chọn đường truyền:**
- Service dedicated `6A4E2500`, characteristic HEART_RATE `6A4E2501` (`ma2/h.java:81`, `zm2/a.java:12, 15, 138-139`). Nếu đồng hồ có service `6A4E2500` thì app **không** dùng realtime qua Multi-Link (`eh2/f.java:183-184`).
- Ngược lại, app ánh xạ cặp (`6A4E2500`, `6A4E2501`) sang **ML service 6** (`eh2/d.java:140-149`; `xm2/h.java:11` HEART_RATE(6)).
- Danh sách service ML mà đồng hồ hỗ trợ lấy từ info pages của REGISTRATION (`eh2/f.java:94, 128-131`). Driver không đọc info pages, nên coi INVALID_SERVICE_ID là "không hỗ trợ".

**Bật / tắt:**
- Bật = enable notification trên characteristic (`fh2/d.java:206-215`). Qua Multi-Link, việc này là `REGISTER` service 6 với flags 0, vì MLR chỉ dành cho GFDI (`eh2/d.java:312-334`, `ml2/l.java:297-312`).
- Tắt = disable notification. Qua Multi-Link là `CLOSE_HANDLE` (`fh2/d.java:198-204`, `eh2/d.java:335-344`).
- **Không ghi byte cấu hình nào**: map cấu hình `f191533b` không bao giờ được gán (`xm2/g.java:38, 77`). Không có lệnh GFDI nào đi kèm.
- App dồn các lệnh bật/tắt cách nhau ≥ 500 ms (`fh2/d.java:161-196`).

**Khung dữ liệu:** mỗi notification qua Multi-Link có dạng `[handle][payload]`. Payload được chuyển nguyên cho parser (`ml2/g.java:45`, `ml2/l.java:230-258`, `fh2/d.java:72-158`). Parser là `xm2/i.java:28-49`, little-endian, tối thiểu 5 byte; ngắn hơn thì ném lỗi và bị bỏ (`fh2/d.java:147`):

| byte | Trường | Ghi chú |
|---|---|---|
| 0 | source | 0 NO_SOURCE, 1 HR_STRAP, 2 OHR_NO_LOCK, 3 OHR_LOCKED (`xm2/j.java`); giá trị ngoài dải → NO_SOURCE |
| 1 | Heart_Rate (bpm) | `0xFF` = không có (-1) |
| 2 | Resting_Heart_Rate | `0xFF` = không có |
| 3 | Low_Heart_Rate | `0xFF` = không có |
| 4 | High_Heart_Rate | `0xFF` = không có |

- Tên trường lấy từ màn debug `TestRealTimeDataActivity.java:140, 242-247`. Thời điểm là giờ điện thoại lúc nhận (`xm2/i.java:49`), payload không có timestamp.
- Không có RR/HRV trong khung này; HRV là service 12 riêng (`xm2/h.java`).

**Driver** (`GarminLiveHeartRate`, `codec/RealtimeHeartRateCodec.kt`):
- Thứ tự ưu tiên: `6A4E2501` dedicated → ML service 6 → HR Profile chuẩn `0x2A37` (chỉ có khi bật "Broadcast Heart Rate").
- Flow cold, đếm người xem: người đầu bật, người cuối tắt (`CLOSE_HANDLE`/CCCD off) trong `NonCancellable`.
- Nguồn bị đồng hồ từ chối (status ≠ SUCCESS, không trả lời trong 10 s, hoặc đòi MLR) bị bỏ qua cho phần còn lại của phiên.
- Đồng hồ Multi-Link luôn được báo `LIVE_HEART_RATE`, vì không đọc info pages nên không biết trước có hỗ trợ không.
- **Chưa thử trên đồng hồ thật.** Timeout 10 s là lựa chọn của driver, không lấy từ APK.
- **Thời tiết**: thiết bị gửi 5014 Weather Request, app trả dữ liệu. [V cho ID]
- **Thông báo**: GNCS 5033–5036 (mô phỏng ANCS), cùng rich_notifications (87). [V cho ID]

### 6.3 Đẩy sang Health Connect [V]
- `permissions.txt` có `android.permission.health.WRITE_STEPS/HEART_RATE/RESTING_HEART_RATE/SLEEP/EXERCISE/DISTANCE/ACTIVE_CALORIES_BURNED/TOTAL_CALORIES_BURNED/FLOORS_CLIMBED/ELEVATION_GAINED/SPEED/WEIGHT/BODY_FAT`.
- Garmin Connect **chỉ ghi** vào Health Connect, không đọc.

---

## 7. Các lựa chọn chính thức

| Lựa chọn | Cho phép | Giới hạn | Độ tin cậy |
|---|---|---|---|
| **Health Connect** | App của bạn đọc steps, HR, resting HR, sleep, exercise, calories, distance, floors, weight… mà Garmin Connect ghi vào. Không cần ký hợp đồng | Phụ thuộc Garmin Connect bật đồng bộ Health Connect. Độ trễ = chu kỳ sync của Garmin (không realtime). Không có stress, Body Battery, HRV chi tiết, file FIT gốc | [V] quyền ghi trong manifest; danh sách bản ghi lấy từ quyền |
| **Garmin Health API / Activity API (cloud, OAuth)** | Server của bạn nhận push/ping các bản tóm tắt hằng ngày, epochs 15 phút, sleep, stress, Body Battery, HRV, activity details/FIT, kèm webhook | Phải đăng ký Garmin Connect Developer Program và được duyệt (miễn phí cho mục đích hợp lệ, có thoả thuận). Dữ liệu đi qua cloud Garmin; vẫn cần Garmin Connect để sync | [I] theo kiến thức chung, cần kiểm tra lại tài liệu developer.garmin.com |
| **Garmin Health SDK** (Standard / Companion, Android) | Kết nối BLE **trực tiếp** từ app của bạn: realtime HR/steps/stress/SpO2…, sync log, có thể **chạy song song với Garmin Connect** (Companion SDK) qua Multi-Link với client UUID riêng | **Có license thương mại**, phải ký hợp đồng với Garmin Health; chỉ cho đối tác doanh nghiệp. APK này có dấu vết hạ tầng tương ứng: ML service `HEALTH_SDK(3)`, realtime 6A4E25xx | [V] dấu vết trong code; [I] điều khoản license |
| **Connect IQ Mobile SDK** (Android) + app Connect IQ trên đồng hồ | App Android ↔ app Monkey C trên đồng hồ trao đổi message tự định nghĩa (`sendMessage`, `registerForAppEvents`). App trên đồng hồ đọc sensor (HR realtime, steps, SensorHistory…) rồi gửi lên | Theo tài liệu Garmin: "All communication for companion applications running on Android goes through a Garmin Connect Mobile service"; init thất bại nếu không cài Garmin Connect. Phải viết và cài app Connect IQ; giới hạn băng thông, pin, thời gian chạy nền. GCM export `IQGarminBindingService` (action `com.garmin.android.connectiq.GARMIN_BINDING_SERVICE_ACTION`) và `ConnectIQService` | [V] tài liệu Context7 + manifest |

---

## 8. Khuyến nghị cho app Android của bạn

### Phương án A: chính thức (khuyến nghị)
1. **Ngắn hạn, gần như không rủi ro**: đọc **Health Connect**. Bật trong Garmin Connect: Settings → Connected Apps → Health Connect. App của bạn xin quyền `READ_STEPS/HEART_RATE/SLEEP/EXERCISE…`.
2. **Cần realtime hoặc chỉ số riêng** (HR từng giây, stress, SpO2): viết **app Connect IQ** (data field, widget hoặc background service) dùng `Toybox.Sensor`/`SensorHistory`, rồi đẩy sang app Android bằng **Connect IQ Mobile SDK**. Garmin Connect vẫn phải cài và chạy.
3. **Cần dữ liệu đầy đủ, lâu dài, có server**: đăng ký **Garmin Health API** (OAuth) và nhận webhook về backend.
4. **Sản phẩm thương mại cần BLE trực tiếp**: liên hệ Garmin Health để lấy **Health SDK** (Companion).

### Phương án B: tự cài đặt lại giao thức BLE (chỉ cho thiết bị của bạn, mục đích interoperability)
**Khả thi về kỹ thuật: CÓ** với thiết bị dùng GFDI dedicated hoặc Multi-Link không bật MLR. Tham khảo thêm dự án mã nguồn mở **Gadgetbridge**, vốn đã cài đặt GFDI/ML cho nhiều đồng hồ Garmin ([I], kiến thức chung, nên đối chiếu).

**Kế hoạch từng bước**
1. **Gỡ ghép đôi đồng hồ khỏi Garmin Connect** (hoặc gỡ app), xoá bond trong Bluetooth của Android. Tránh hai app tranh nhau kết nối.
2. Quét: lọc manufacturer ID `0x0087`, đọc product number (2 byte BE).
3. `connectGatt(autoConnect=false, TRANSPORT_LE)`, `createBond()` (người dùng xác nhận passkey trên đồng hồ), `requestMtu(515)`, `discoverServices`.
4. Chọn đường:
   - Có `6A4E2800`: dùng Multi-Link. Notify `6A4E281x`, ghi `6A4E282x`. Gửi `CLOSE_ALL`, rồi `REGISTER(4)` và đọc info pages, rồi `REGISTER(1, flags=0)` (**không xin reliable**, để né MLR). Lấy handle.
   - Ngược lại: dùng dịch vụ GFDI dedicated (`6A4E2401`+`6A4ECD28`/`6A4E4C80`, hoặc `9B012401`+`4ACBCD28`/`DF334C80`).
5. Cài COBS, khung `len|id|payload|crc16(FIT)`, ACK 5000. Mọi request từ thiết bị **phải được ACK**, nếu không thiết bị sẽ retry rồi ngắt.
6. Bắt tay: nhận 5024 → ACK + host info (protocol 113 cho an toàn); nhận 5050 → ACK + gửi 5050 bitmask; trả FIT capabilities (5011/5012); trả lời 5052 thời gian; gửi 5030 `HANDSHAKE_COMPLETE (8)`. Trả `UNKNOWN_OR_NOT_SUPPORTED (2)` cho mọi tin chưa hỗ trợ.
7. Đồng bộ: gửi 5030 hoặc chờ 5037; tải file index 0 → parse thư mục → 5002 từng file FIT_TYPE_4/32/49/44 → nhận 5004 → ghép file → parse bằng **FIT SDK** (Garmin, công khai) → ghi vào DB và/hoặc Health Connect. Đặt cờ archive (5008) **chỉ khi** bạn chắc không cần Garmin Connect nữa.
8. Realtime HR (tuỳ chọn): characteristic dedicated `6A4E2501`, hoặc ML service 6 (REAL_TIME_HR), hoặc bật trên đồng hồ "Broadcast Heart Rate" rồi dùng **Heart Rate Profile chuẩn (0x180D)**. Chi tiết ở §6.2.1.
   - **Đã triển khai trong driver** (`GarminLiveHeartRate`): thử lần lượt `6A4E2501` → ML service 6 → `0x2A37`, tắt nguồn khi không còn ai xem (§6.2.1). Payload realtime HR đã giải mã [V]; **chưa kiểm chứng trên đồng hồ thật**.

**UUID và message ID tối thiểu**
- [V] Multi-Link: `6A4E2800-667B-11E3-949A-0800200C9A66`, `6A4E2810..2819` (notify), `6A4E2820..2829` (write). Lệnh ML 0x00/0x01/0x05/0x06; service ID 1 (GFDI), 4 (REGISTRATION).
- [V] GFDI dedicated: `6A4E2401` + `6A4ECD28`/`6A4E4C80`; `9B012401-BC30-CE9A-E111-0F67E491ABDE` + `4ACBCD28-7425-868E-F447-915C8F00D0CB`/`DF334C80-E6A7-D082-274D-78FC66F85E16`.
- [V] Tin: 5000, 5024, 5050, 5011/5012, 5052, 5030, 5037, 5031, 5002, 5004, 5054, 5008, 5043/5044 (FeatureCapabilities qua core_service=13).
- [I] Cần thêm trong thực tế: 5023 (pin), 5026 (set time), 5009/5027 (file ready, queued download).

**Rủi ro**
- Firmware từ chối `clientId` lạ trên ML (REJECTED/PENDING_AUTH). **Chưa kiểm chứng.** Có thể thử `clientId=0x01` (giả làm Garmin Connect, chỉ trên thiết bị của bạn) hoặc một ID khác.
- Thiết bị đời mới có thể **bắt buộc MLR**. Khi đó phải dịch ngược `libreliable-ml.so` (định dạng gói chưa được giải).
- Mất tính năng Garmin (firmware update, ephemeris GPS, cài app Connect IQ, đồng bộ cloud) nếu bỏ Garmin Connect.
- Firmware cập nhật có thể đổi giao thức. Header compact (protocol ≥150) và capability bit thay đổi theo đời máy.
- Điều khoản sử dụng: reverse engineering cho interoperability với **thiết bị của chính bạn** thường được pháp luật nhiều nơi cho phép, nhưng **không** phân phối mã của Garmin, không dùng key/ID cấp cho Garmin trong sản phẩm phát hành. Nên hỏi tư vấn pháp lý nếu định phát hành.

---

## 9. Câu hỏi còn mở và mức độ tin cậy

| # | Câu hỏi | Tin cậy hiện tại |
|---|---|---|
| 1 | Firmware có kiểm tra/whitelist `clientId` trên Multi-Link không? | Thấp (không thấy được từ phía app) |
| 2 | Định dạng gói MLR trong `libreliable-ml.so` (seq/ack/window) | Chưa phân tích; cần Ghidra/IDA (REA doctor báo chưa cấu hình Ghidra/IDA) |
| 3 | Ý nghĩa từng bit capability của 5050 và bitmask kiểu file trong 5037 | Trung bình (có bit 3/4/90, 6/8/52, 35–47 trong code; thiếu bảng tên) |
| 4 | Payload realtime **HR đã giải mã** (§6.2.1). Còn steps/stress/SpO2… trên ML service 7..26 chưa làm (parser ở `xm2/*`, dispatch ở `fh2/d.java:91-140`) | HR: cao [V]; phần còn lại: chưa đọc |
| 5 | Ý nghĩa đầy đủ các tag GarminGenericServiceData (0x2401/0x3E10/0xFE1F) | Trung bình |
| 6 | Thiết bị có chấp nhận host không đăng ký cloud (bỏ qua `registerDevice`) mà vẫn sync bình thường không? | Trung bình–cao là có ([I]); cần thử thực tế |
| 7 | FIT_TYPE_49 chính xác là gì | Trung bình (đi cùng monitoring) |
| 8 | Khoảng 1024 lỗi jadx / 500 file thiếu phương thức: có phương thức quan trọng nào bị thiếu? | `ml2.s.e/i` (gửi ML, đã đọc được qua smali), `ss2.c.b` (vòng auth). Dùng `rea inspect-android-method` hoặc `jadx --comments-level debug` để xem bytecode |

**Bước kiểm chứng đề xuất:** bật *Bluetooth HCI snoop log* (Developer options) trên điện thoại khi Garmin Connect ghép đôi và sync. Mở bằng Wireshark và đối chiếu với các mục 3–6 (ghi ra ML register, 5024/5050, 5002/5004). Đây là cách nhanh nhất để chuyển các mục [I] thành [V] cho đúng model đồng hồ của bạn.

---

## 10. Bổ sung RE vòng 2 (2026-11-06)

### 10.1 Bảng bit 5050 SupportedCapability [V]

Nguồn: `rea inspect-android-method base.apk com.garmin.android.gfdi.configuration.SupportedCapability '<clinit>'` → smali `<clinit>` 41 264 byte, status=complete. Chi tiết: `docs/re-evidence/garmin/config_capability_bits.md`.

Mã hoá: `bitmask[ordinal/8] |= (1 << (ordinal%8))`. Thiết bị gửi `[byteCount u8][bitmask]`; host trả `[byteCount u8][bitmask host]`. Bit = 1 nghĩa là hai bên hỗ trợ.

| Bit | Tên | Bit | Tên |
|-----|-----|-----|-----|
| 0 | CONNECT_MOBILE_FIT_LINK | 48 | STOP_SYNC_AFTER_SOFTWARE_UPDATE |
| 3 | SYNC | 49 | CALENDAR |
| 4 | DEVICE_INITIATES_SYNC | 50 | WIFI_SETUP |
| 5 | HOST_INITIATED_SYNC_REQUESTS | 51 | SMS_NOTIFICATIONS |
| 6 | GNCS | 52 | BASIC_MUSIC_CONTROLS |
| 7 | ADVANCED_MUSIC_CONTROLS | 53 | AUDIO_PROMPTS_SPEECH |
| 8 | FIND_MY_PHONE | 54 | DELTA_SOFTWARE_UPDATES |
| 9 | FIND_MY_WATCH | 55 | GARMIN_DEVICE_INFO_FILE_TYPE |
| 10–16 | CONNECTIQ_* (HTTP…APP_MGMT) | 56 | SPORT_PROFILE_SETUP |
| 17 | COURSE_DOWNLOAD | 57 | HSA_SUPPORT |
| 18 | WORKOUT_DOWNLOAD | 58 | SPORT_STRENGTH |
| 19 | GOLF_COURSE_DOWNLOAD | 59 | SPORT_CARDIO |
| 20 | DELTA_SOFTWARE_UPDATE_FILES | 60 | UNION_PAY |
| 21 | FITPAY | 61 | IPASS |
| 22 | LIVETRACK | 62 | CIQ_AUDIO_CONTENT_PROVIDER |
| 23 | LIVETRACK_AUTO_START | 63 | UNION_PAY_INTERNATIONAL |
| 24 | LIVETRACK_MESSAGING | 64 | REQUEST_PAIR_FLOW |
| 25 | GROUP_LIVETRACK | 65 | LOCATION_UPDATE |
| 26 | WEATHER_CONDITIONS | 66 | LTE_SUPPORT |
| 27 | WEATHER_ALERTS | 67 | DEVICE_DRIVEN_LIVETRACK_SUPPORT |
| 28 | GPS_EPHEMERIS_DOWNLOAD | 68 | CUSTOM_CANNED_TEXT_LIST_SUPPORT |
| 29 | EXPLICIT_ARCHIVE | 69 | EXPLORE_SYNC |
| 30 | SWING_SENSOR | 70 | INCIDENT_DETECT_AND_ASSISTANCE |
| 31 | SWING_SENSOR_REMOTE | **71** | **CURRENT_TIME_REQUEST_SUPPORT** |
| 32 | INCIDENT_DETECTION | 72 | CONTACTS_SUPPORT |
| 33 | TRUEUP | 73 | LAUNCH_REMOTE_CIQ_APP_SUPPORT |
| 34 | INSTANT_INPUT | 74 | DEVICE_MESSAGES |
| 35 | SEGMENTS | 75 | WAYPOINT_TRANSFER |
| 36–41 | AUDIO_PROMPT_* | 76 | MULTI_LINK_SERVICE |
| 42 | SPORT_GENERIC | 77 | OAUTH_CREDENTIALS |
| 43 | SPORT_RUNNING | 78–80 | GOLF_9+9, ANTI_THEFT, INREACH |
| 44 | SPORT_CYCLING | 81 | EVENT_SHARING |
| 45 | SPORT_TRANSITION | 82–87 | HSA_FEATURE…WIND_DATA |
| 46 | SPORT_FITNESS_EQUIPMENT | 88 | HTTP_RAW_RESOURCE_REQUEST |
| 47 | SPORT_SWIMMING | 89–93 | SAMD, SYNC_2, NAV_SYNC, RT_SETTINGS, HAND_CALIB |

**Bit 71 (CURRENT_TIME_REQUEST_SUPPORT):** `vs2.a.getConfiguration()` trả `a1.b(71)` [V] — khi host đặt bit này, thiết bị gửi 5052 để xin thời gian; nếu không đặt thì host phải chủ động gửi 5026.

**Tập tối thiểu cho driver health-only:** bits 0, 3, 4, 5, 29, 71. Hiện tại driver sao chép bitmask của thiết bị, dẫn tới quảng cáo LIVETRACK/GNCS/Weather mà không xử lý được — cần sửa (xem `docs/protocols/GARMIN_IMPLEMENTATION_BRIEF.md §TODO-2`).

### 10.2 Registration service 4 – info pages [V]

Nguồn: `rea inspect-android-method base.apk ... eh2.f initialize`. Chi tiết: `docs/re-evidence/garmin/registration_service4.md`.

App Garmin Connect **luôn** đăng ký service 4 (REGISTRATION) và hỏi 6 loại info page trước khi đăng ký service 1 (GFDI). Flow:

1. `CLOSE_ALL` → resp `0x06`
2. `REGISTER(4)` → handle H4
3. Với mỗi pageType trong `{o.g, o.a, o.d, o.e, o.c, o.f(NFC)}`: ghi `[H4][pageType]`, nhận danh sách dịch vụ.
4. Nếu `o.g` (GFDI service list) rỗng → ném `MultiLinkException("No supported services.")`
5. `REGISTER(1, reliableFlag)` → handle H1 → mở GFDI

**Driver hiện tại:** bỏ qua bước 2–4, nhảy thẳng vào `REGISTER(1)`. Nếu đồng hồ thật yêu cầu info pages (status REJECTED khi bỏ qua), thêm đoạn 2–4 trước `REGISTER(1)`. Xem `MultiLink.kt:34` TODO(garmin-protocol). **NEEDS-REAL-WATCH.**

### 10.3 5023 Battery Status – suy luận [I]

Nguồn: `strings` trong `classes7.dex`, `classes11.dex` tìm thấy `BatteryStatusDataHandler`, `BatteryStatusOptions(isCharging=`, `batteryPercentage=`, `batteryStatusTimeStamp=`. Chi tiết: `docs/re-evidence/garmin/battery_status_5023.md`.

Cấu trúc suy luận (chưa xác nhận byte-level):

```
[batteryPercent u8][batteryStatus u8][timestamp u32 LE FIT-epoch]
```

`batteryStatus` enum [I]: 0=unknown, 1=new, 2=good, 3=ok, 4=low, 5=critical, 6=charging.

**Driver:** giữ fallback SIG Battery (0x180F) làm nguồn chính cho đến khi 5023 được xác minh trên thiết bị thật. **NEEDS-REAL-WATCH.**

### 10.4 Cập nhật §9 (câu hỏi còn mở)

Câu hỏi 3 trong §9 ("ý nghĩa từng bit capability của 5050") đã được giải hoàn toàn [V] bởi đợt RE này — bảng 94 bit đầy đủ ở §10.1. Hai câu hỏi còn lại liên quan tới driver: service 4 bắt buộc không (§10.2) và 5023 layout (§10.3) vẫn NEEDS-REAL-WATCH.
