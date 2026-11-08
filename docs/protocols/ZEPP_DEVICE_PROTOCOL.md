# Zepp (Huami/Amazfit) Android 6.10.1: cách app tìm, ghép đôi, xác thực và đồng bộ với đồng hồ

> Mục đích: phân tích để bạn **kết nối đồng hồ Amazfit/Zepp của chính mình** với app sức khoẻ Android tự viết (`unified_health_app`), vì mục đích interoperability.
> Nguồn: `com.huami.watch.hmwatchmanager` 6.10.1-play (versionCode 100770, minSdk 21, targetSdk 31), bản APKM của APKMirror (đăng ngày 2022-07-04).
> Ngày phân tích: 2026-11-01.

---

## 0. Phương pháp, công cụ và giới hạn

| Hạng mục | Chi tiết |
|---|---|
| Giải nén | APKM **không mã hoá**: là file zip thường. `zepp-analysis/bundle/` chứa `base.apk` (111 MB, 48 file dex), `split_config.arm64_v8a.apk`, `split_config.armeabi_v7a.apk`, `info.json` |
| jadx | `zepp-analysis/jadx-base/` (chạy `jadx -j 8 --show-bad-code`, JAVA_HOME = openjdk@21). Có **39.612 file .java**. jadx kết thúc với `finished with errors, count: 385`; **147 file** còn phương thức `Method not decompiled`. Hai chỗ liên quan: `BleChannelImpl2.sendData` và `BaseChannelApiImpl$j.invokeSuspend` (đường gửi gói). Phần còn lại của giao thức đọc được đầy đủ |
| REA CLI 6.8.0 | `zepp-analysis/rea-output/`: `package.json` (manifest, 39.999 class), `permissions.txt`, `class_AuthModule2.json`, `class_ChannelDataPacket.json`, `class_EncryptKeyStore.json`, `class_GattUtils.json`, `method_DeviceAuthorizationImpl2.a.json`, `method_EncryptApiImpl.encryptData.json`, `method_HMDeviceWebAPI.getSign.json`. Chạy với `REA_JADX_MCP_JAR=~/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar`. Kết quả REA khớp với jadx |
| Native | `zepp-analysis/native/lib/arm64-v8a/` (47 file `.so`). Đọc bằng `strings`, `nm -D` và dò hằng số trong `.rodata` (chưa disassemble) |
| Obfuscation | **Nhẹ.** Lõi Bluetooth (`com.xiaomi.hm.health.bt.*`, `com.huami.bluetooth.*`) **giữ nguyên tên lớp và phương thức public**. R8 chỉ đổi tên phương thức/field private thành `a`, `b`, `c`… Tên gốc khôi phục qua metadata Kotlin (`renamed from: … reason: from kotlin metadata`), `@DebugMetadata(c="…AuthModule$verifySignature$1", f="AuthModule.kt")` và chuỗi log |
| Giới hạn | Bản app là **năm 2022** (Zepp OS 1.x, GTR 3/GTS 3, Band 7). Firmware và app mới hơn có thể đã thêm module hoặc đổi chi tiết. Không có thiết bị thật, không có HCI snoop log. Mọi thứ dưới đây là phân tích tĩnh |

**Quy ước:** Đường dẫn `pkg/X.java:NN` tính từ `zepp-analysis/jadx-base/sources/`.
- **[V] Đã xác minh:** thấy trực tiếp trong code.
- **[I] Suy luận:** chưa thấy trực tiếp, độ tin cậy ghi kèm.
- **[Ext] Kiến thức ngoài code:** lấy từ hiểu biết công khai (chủ yếu dự án Gadgetbridge), **không** kiểm chứng trong APK này.

Bảng đối chiếu tên (tên lớp ít bị làm rối, cột "tên gốc" là vai trò lấy từ metadata/log):

| Lớp / package | Vai trò | Ghi chú |
|---|---|---|
| `com.xiaomi.hm.health.bt.gatt.GattUtils`, `a0`, `GattPeripheral` | GATT: base UUID Huami, `requestMtu`, CRC16, LE helpers | `a0` = lớp `BluetoothGattCallback` bị đổi tên |
| `com.xiaomi.hm.health.bt.scan.*` (`BleScanCenter`, `AdvData`, `filter/*`) | Quét BLE, parse gói quảng bá | Lọc bằng phần mềm, không dùng `ScanFilter` của OS |
| `com.xiaomi.hm.health.device.bind.*` (`HMBindMiLiLogic`, `HMBindBaseLogic`) | Luồng bind trong UI | Tạo auth info, gửi key lên cloud |
| `com.xiaomi.hm.health.device.capturedevice.CaptureQRResultKt` | Bind bằng mã QR | QR chỉ chứa MAC + PnP |
| `com.xiaomi.hm.health.bt.profile.auth.*` | Xác thực: `HMProAuthProfile` (cũ, 0x0009), `DeviceAuthorizationImpl1/2` (mới, qua channel), `DeviceAuthorizationFactory`, `AuthUtilsKt` (AES) | |
| `com.huami.bluetooth.profile.channel.*` | **"Channel"**, tức giao thức chunked trên 0x0016/0x0017 (Gadgetbridge gọi là "Huami 2021 chunked") | `ChannelApiImpl` (v1), `ChannelApiImpl2` (v2, Huami OS/Zepp OS) |
| `com.huami.bluetooth.profile.channel.module.*` | Các "module" = endpoint của Zepp OS (`@ChannelModule(id=…)`) | `AuthModule` (0x80), `AuthModule2` (0x82), `BuiltInModule` (0x00)… |
| `com.huami.bluetooth.profile.channel.encrypt.*` | Mã hoá payload channel (AES-ECB + CRC32 + nonce) | `EncryptApiImpl`, `EncryptKeyStore`, `KeyStoreManager` |
| `com.huami.core.device.feature.encrypt.impl.KeyShareApiImpl` + `libdevice-encrypt.so` | ECDH (native, curve **sect163r2/B-163**) | |
| `com.xiaomi.hm.health.bt.profile.gdsp.*` | **GDSP** ("General Data Sensing Procedure") = fetch dữ liệu lịch sử trên 0x0004/0x0005 | activity, HR, SpO2, stress, PAI, GPS… |
| `com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI` | API cloud bind thiết bị (`v1/device/binds.json`) | Nơi auth key được **upload** và nơi xin **chữ ký** server |
| `com.huami.network.hmnetwork.server.HMServerDef` | Host API (`https://api-mifit.huami.com/`, `https://api-watch.huami.com/`) | |

---

## 1. Kiến trúc tổng thể

```
UI bind (HMBindMiLiLogic / QR HMCaptureWatchQRActivity)
  │  quét FEE0 + tên, RSSI; hoặc QR → MAC
  ▼
HMMiLiProDevice / HMBaseBleDevice (state machine, Handler)
  │  connectGatt → discoverServices
  │  initChannel(): version query trên 0x0016 → v1 hoặc v2 (Huami OS)
  ▼
BaseProfile ──► BleChannelLink(0x0016 down/0x0017 up) ──► BleChannelImpl/BleChannelImpl2
  │                                                   └─► ChannelApiImpl/ChannelApiImpl2 (chia gói, ACK, mã hoá)
  │                                                          └─► Module: 0x00 BuiltIn, 0x82 Auth2, 0x0A Settings,
  │                                                              0x1E Notification, 0x16 Realtime activity, 0x32 Sleep…
  ├─► Auth: DeviceAuthorizationFactory → Traditional (0x0009) | Impl1 (module 0x80) | Impl2 (module 0x82, ECDH)
  │     (module list và 0x80/0x82 chỉ có ở channel v2; v1 ⇒ danh sách rỗng ⇒ 0x0009)
  ├─► setDateTime (0x2A2B), đọc Device Information (0x180A)
  └─► GDSP fetch (0x0004 control / 0x0005 data) → activity, HR, SpO2, stress, PAI, GPS…
        └─► libdataProcess.so (thuật toán ngủ/hoạt động trên điện thoại) → DB → cloud Huami, Google Fit, Strava…
```

Bằng chứng chính:
- [V] Trình tự kết nối: `initChannel` rồi auth rồi set time rồi đọc device info: `com/xiaomi/hm/health/bt/device/HMBaseBleDevice.java:150, 178, 186, 196`.
- [V] `initChannel` thất bại thì ngắt nếu là Huami OS: `HMBaseBleDevice.java:903-926`.
- [V] Phân nhánh Huami OS bằng phiên bản channel ≥ 2: `com/huami/bluetooth/profile/channel/model/BleChannelLink.java:205-207`.

---

## 2. Quét và ghép đôi

### 2.1 Quét BLE [V]

| Tiêu chí | Giá trị | Bằng chứng |
|---|---|---|
| Service UUID | `0000FEE0-0000-1000-8000-00805F9B34FB` (Mili service) | `com/xiaomi/hm/health/device/bind/HMBindMiLiLogic.java:595, 828, 956` (`filterUUID(UUID_SERVICE_MILI_SERVICE)`); hằng ở `com/xiaomi/hm/health/bt/profile/base/HMBaseProfile.java:24` |
| Tên thiết bị | Danh sách tên từ `SupportNameApi` (cấu hình theo model) | `HMBindMiLiLogic.java:396, 808, 828` |
| RSSI | Bỏ nếu `rssi > 0` hoặc `< -90`. Dừng quét sớm khi `≥ -45`. Cần `≥ -60` cho vòng quét đầu | `HMBindMiLiLogic.java:1118, 1143-1150, 1164` |
| Cờ quảng bá | Bỏ gói không ở chế độ General/Limited Discoverable ("connected adv") | `HMBindMiLiLogic.java` (cạnh dòng 1150) |
| ScanFilter của OS | **Không dùng**. `startScan((List<ScanFilter>) null, …)`, rồi lọc bằng phần mềm | `com/xiaomi/hm/health/bt/scan/BleScanCenter.java:307` |
| Manufacturer data | Chỉ lưu dạng hex (`AdvData.manufact`), **không** dùng để lọc. **Không tìm thấy** company ID `0x0157` (343) trong `bt/scan/*` hay `device/bind/*` | `com/xiaomi/hm/health/bt/scan/AdvData.java:40, 93` |

- [Ext] Huami đăng ký company ID Bluetooth SIG `0x0157`. Gadgetbridge nhận diện đồng hồ chủ yếu bằng **tên quảng bá** ("Amazfit GTR 3"…). Với app riêng, cách đơn giản nhất là lọc service `FEE0` (hoặc `FEE1`) **và** khớp đúng MAC đồng hồ của bạn.

### 2.2 Bind bằng mã QR (đồng hồ Zepp OS hiện QR) [V]
- QR là URL `https://api.amazfit.com/app.json?macAddress=XXXXXXXXXXXX&pnpNumber=…&pnpVersion=…`. App lấy MAC 12 hex rồi chuyển thành `XX:XX:…`, sau đó quét theo địa chỉ: `com/xiaomi/hm/health/device/capturedevice/CaptureQRResultKt.java:15-24, 77`; `HMBindMiLiLogic.java:797-801` (`filterAddress`).
- **QR không chứa khoá.** Khoá được tạo trong lúc auth (mục 5).

### 2.3 Bonding hệ điều hành
- [I] Không thấy app gọi `createBond()` trên đường bind chính của đồng hồ. Bảo mật nằm ở tầng ứng dụng (auth key + mã hoá channel). Độ tin cậy trung bình: chưa rà hết `HMBaseBleDevice`.

### 2.4 Nhận diện model [V]
- Đọc Device Information `0x180A`: serial `2A25`, HW `2A27`, SW `2A28`, PnP `2A50` (7 byte: vendorSource, vendorId LE, productId LE, productVersion LE): `com/xiaomi/hm/health/bt/profile/base/BaseProfile.java:406-420`; UUID ở `profile/base/IBaseProfile.java:9-18`.
- **PnP ID layout xác nhận** (`BaseProfile.setPnpInfo()`, lines 406-430) [V]:
  ```
  [0]     vendorSource u8   (1=Bluetooth SIG, 2=USB-IF)
  [1..2]  vendorId u16 LE   (Huami = 0x0157, đăng ký SIG)
  [3..4]  productId u16 LE
  [5..6]  productVersion u16 LE  ([5] | ([6] << 8) — LE thuần)
  ```
  Đây là Bluetooth Assigned Numbers §6.5 chuẩn. `productId` / `productVersion` khớp `HMDeviceWebAPI.java:340-341`.
- `productId`/`productVersion` được gửi lên cloud khi bind: `HMDeviceWebAPI.java:340-341` (`productId`, `productVersion`).

---

## 3. Lớp truyền (transport)

### 3.1 UUID GATT

Base UUID riêng của Huami: `0000xxxx-0000-3512-2118-0009af100700` (`new UUID(13586, 2384656044284446464L)` và hàm thay 16 bit): `com/xiaomi/hm/health/bt/gatt/GattUtils.java:39-41, 134-136, 437-439` [V]. Đã tính lại bằng Python.

| UUID | Tên trong code | Vai trò | Bằng chứng |
|---|---|---|---|
| `FEE0` (SIG base) | `UUID_SERVICE_MILI_SERVICE` | Service chính chứa các char 0x0001… | `HMBaseProfile.java:24` [V] |
| `FEE1` | `UUID_SERVICE_MILI_SECONDARY_SERVICE` | Service chứa char auth 0x0009 | `HMBaseProfile.java:26`; `HMProAuthProfile.java:327-330` [V] |
| `FEE7` | `UUID_SERVICE_WEIXIN_SERVICE` | WeChat (Trung Quốc) | `HMBaseProfile.java:25` [V] |
| `00000001-…0009af100700` | `SENSOR_DATA_CONTROL_POINT` | Raw sensor control | `profile/milipro/IMiLiProProfile.java:8` [V] |
| `00000002-…` | `SENSOR_DATA` | Raw sensor data | `IMiLiProProfile.java:9` [V] |
| `00000003-…` | `CONTROL_POINT` | Lệnh cấu hình cũ ("ECF") | `IMiLiProProfile.java:10` [V] |
| `00000004-…` | `ACTIVITY_DATA_CONTROL_POINT` | **GDSP control** (fetch) | `IMiLiProProfile.java:11`; `HMProSyncDataBaseProfile.java:128` [V] |
| `00000005-…` | `ACTIVITY_DATA` | **GDSP data** | `IMiLiProProfile.java:12`; `HMProSyncDataBaseProfile.java:129` [V] |
| `00000006-…` | `BATTERY` | Pin | `IMiLiProProfile.java:13` [V] |
| `00000007-…` | `REALTIME_STEPS` | Bước realtime | `IMiLiProProfile.java:14` [V] |
| `00000008-…` | (user) | Thông tin người dùng | `profile/user/HMUserProfile.java:29` [V] |
| `00000009-…` | `UUID_CHARACTERISTIC_AUTH_CONTROL_POINT` | **Auth cũ** | `profile/auth/HMProAuthProfile.java:38` [V] |
| `0000000e-…` | weather | Thời tiết | `profile/weather/HMWeatherProfile.java:20` [V] |
| `0000000f-…` | sport | Thể thao | `profile/sport/HMSportProfile.java:18` [V] |
| `00000011-…`, `00000012/13-…`, `00000014-…`, `00000018-…`, `00000020-…` | NFC, speech, feature, temperature, piece | Phụ | các file `profile/*` (xem `grep uuid128(`) [V] |
| `00000016-…` | `ChannelDown` (`defaultDownLinkUUID`) | **Channel: điện thoại ghi** (write no response). Đồng hồ gửi **ACK/version reply** bằng notify trên chính char này | `channel/model/BleChannelLink.java:32`; `ChannelTransferMethod.java:13`; `BleChannelImpl.java:134-139` [V] |
| `00000017-…` | `ChannelUp` | **Channel: đồng hồ notify dữ liệu**. Điện thoại ghi ACK lên đây | `BleChannelLink.java:35`; `BleChannelImpl.java:109, 181-184` [V] |
| `00001530/1531/1532-…` (base Huami) | DFU | Firmware cũ (nRF-style) | `profile/dfu/NewDfuProfile.java:105-107` [V] |
| `0000fed0-…`, `00000010/11-…` | SmartWatch transport | Đồng hồ Amazfit Pace/Stratos đời cũ | `profile/smartwatch/transport/HMSmartWatchTransportProfile.java:29-31` [V] |
| `180D` / `2A37` / `2A39` | HR service chuẩn | HR realtime (notify `2A37`, control `2A39`) | `profile/hr/HMHeartRateProfile.java:24-26` [V]; lệnh trên `2A39`: `[0x15, mode, op]` (mode Continuous=1, op Open=1/Close=0) và heartbeat `[0x16]`, ghi no-response: `HeartRateCommand.java` (SetWorkMode=21, Heartbeat=22), `HeartRateControl.java` (Mode/Operation), `HeartRateControlImpl.java` (`sendCommandNoResponse`) [V]; heartbeat re-arm mỗi 10 000 ms: `HMHeartRateController.java:160,201` [V] |
| `180A` / `2A23-2A29`, `2A50` | Device Information | Model, serial, firmware, PnP | `IBaseProfile.java:9-16` [V] |
| `2A2B` | Current Time | Đặt giờ; vendor tìm dưới `FEE0` (không chỉ `0x1805`) | `IBaseProfile.java:17`; `BaseProfile.java:293-301,387-395` [V] |
| `1811` / `2A46`, `2A44` | Alert Notification | Thông báo cũ | `profile/alert/HMAlertServiceProfile.java:38-40` [V] |
| `1802` / `2A06` | Immediate Alert | Rung, tìm thiết bị | `profile/alert/HMAlertProfile.java:31-32` [V] |

CCCD: `2902`: `GattUtils.java:33` [V].

### 3.2 MTU [V]
- `Mtu`: mặc định payload 20 byte, ATT tối đa **247**, payload = ATT − 3 (tối đa 244): `com/xiaomi/hm/health/bt/profile/base/Mtu.java:5-31`.
- App **không** chủ động gọi `requestMtu` trong luồng chính (chỉ có API `requestMtu` ở `gatt/a0.java:1066-1085`). App **hỏi đồng hồ** MTU đã đàm phán: qua module `ConnectModule` (id 0x15) `queryConnectParam()`, hoặc lệnh cũ `0x13` trên control point, trả 2 byte LE. Rồi gọi `setAttMtuSize`: `profile/milipro/MiLiProProfile.java:369-403, 2053-2056`.
- [I] Đồng hồ là bên khởi tạo MTU exchange. App riêng nên tự gọi `requestMtu(247)` sau khi kết nối. Kích thước gói channel = `mtu.size()` (`BaseChannelApiImpl.java:741-765`).

### 3.3 Channel (giao thức chunked 0x0016/0x0017) [V]

**Truy vấn phiên bản** (bước đầu tiên sau khi bật notify):
- Ghi `0x01` lên 0x0016 và chờ notify trên 0x0016: `[0x02, version, encryptEnable?]`: `BleChannelLink.java:252-267`; parse `ChannelVersion.java:37-46` (byte version, tuỳ chọn 1 byte boolean "encryptEnable").
- `version == 1` → `BleChannelImpl` + `ChannelApiImpl` (header ngắn). `version == 2` → `BleChannelImpl2` + `ChannelApiImpl2` (có appId). Khác → không hỗ trợ: `BleChannelFactory.java:53-66`, `ChannelFactory.java:26-33`.
- `isBaseOnHuamiOS()` = version ≥ 2: `BleChannelLink.java:205-207`.
- Nếu đồng hồ hỏi phiên bản phía app, app trả `[0x02, 0x01]`: `BaseChannelApiImpl.java:660-663`.

**Loại gói** (`byte[0]`): `1` VERSION_QUERY, `2` VERSION_REPLY, `3` DATA, `4` DATA_REPLY (ACK): `channel/model/ChannelPacketType.java:11-15`.

**Gói DATA** (`ChannelDataPacket.java:21-33, 150-162`; `FirstPacket.java:40-53`; số nguyên **little-endian**, `GattUtils.java:319-325`):

```
v2 (Zepp OS / Huami OS), gói đầu (header 11 byte, ChannelApiImpl2.java:151-152):
  [0]   0x03                    type DATA
  [1]   flags                   bit0 FIRST(1) | bit1 LAST(2) | bit2 NEED_REPLY(4) | bit3 ENCRYPTED(8)
  [2]   appId                   HMBleConfig.APP_ID (mặc định 0)
  [3]   sessionId (handle)      1 byte
  [4]   index                   bộ đếm gói, mod 256
  [5..8]  totalSize  uint32 LE  độ dài payload GỐC (trước mã hoá)
  [9..10] module     uint16 LE  endpoint (vd 0x0082 auth)
  [11..]  dữ liệu
v2, gói tiếp theo (header 5 byte, ChannelApiImpl2.java:210-211):
  [0]0x03 [1]flags [2]appId [3]sessionId [4]index [5..] dữ liệu
v1 (ChannelApiImpl.java:34-35, 51-52): giống trên nhưng KHÔNG có byte appId (header 10/4 byte)
```

- Chia gói: mỗi gói ≤ `mtu.size()`. Gói cuối có cờ LAST, thêm NEED_REPLY nếu cần ACK cuối; cứ `replyFreq` gói thì bật NEED_REPLY: `BaseChannelApiImpl.java:741-765`.
- Nhận: gói FIRST tạo buffer (module, session, totalSize). Module không đăng ký thì trả lỗi code 5. Ghép lỗi thì trả mã lỗi. NEED_REPLY thì ACK code 1: `BaseChannelApiImpl.java:629-660`.
- **ACK (DATA_REPLY)** ghi lên 0x0017:
  - v2: `[0x04, appId, sessionId, code, index]`: `ChannelApiImpl2.java:185`; parse `impl/ReplyParseV2Impl.java:15-20`.
  - v1: `[0x04, sessionId, code, index]`: `model/ChannelReplyPacket.java:70`, `impl/ReplyParseV1Impl.java:14-18`.
- v2 lọc gói theo appId (byte[2]): `ChannelApiImpl2.java:192-197`.
- **CRC:** khung channel **không** có CRC riêng. CRC32 chỉ nằm **bên trong payload đã mã hoá** (mục 5.4). GDSP có CRC32 toàn luồng (mục 6.1).

**Payload theo module** (`BaseModule`, `AuthModule.java:169-182`): phần lớn module dùng dạng lệnh `[cmd, …]`; phản hồi `[0x10, cmd, code(1=OK), data…]` (cùng định dạng với `HMNotifyResponse`, `profile/base/HMNotifyResponse.java:49-71`).

### 3.4 Danh sách module (endpoint) [V]

Lấy từ `@ChannelModule(id=…)` và `getModule()`:

| ID | Module | | ID | Module |
|---|---|---|---|---|
| 0x00 | `BuiltInModule` (liệt kê module, echo) | | 0x1D | `OpenAppModule` |
| 0x01 | `ProxyModule` | | 0x1E | `NotificationModule` |
| 0x02 | `EsimModule` | | 0x21 | `HearingAidModule` |
| 0x03 | `WiFiControllerModule` | | 0x23 | `DialModule` (mặt đồng hồ) |
| 0x04 | `MediaModule` | | 0x24 | `NFCModule` |
| 0x05 | `MenstruationModule` | | 0x26 | `DisplayListSettingModule` |
| 0x06 | `WifiFtpModule` | | 0x28 | `DeviceFeatureModule` |
| 0x08 | `WorldClockModule` | | 0x29 | `BatteryModule` |
| 0x09 | `AssistantModule` | | 0x30 | `TestModule` |
| 0x0A | `SettingsModule` | | 0x31 | `VirtualSensorModule` |
| 0x0C | `OtaModule` | | 0x32 | `SleepDataModule` |
| 0x0D | `FileTransferModule` | | 0x33 | `RecordModule` |
| 0x0E | `WeatherModule` | | 0x35 | `HearingBatteryModule` |
| 0x0F | `AlarmModule` | | 0x38 | `EventReminderModule` |
| 0x12 | `TodoModule` | | 0x39 | `HeadPhoneModule` |
| 0x14 | `ContactModule` | | 0x3A | `LaumberjackModule` (log) |
| 0x15 | `ConnectModule` (MTU, tham số kết nối) | | 0x3B | `PhoneMuteModule` |
| 0x16 | `RealtimeActivityModule` (bước/realtime) | | 0x3C | `MemberCardModule` |
| 0x18 | `MotorVibrateModule` | | 0x3D | `GestureProtocolApiImpl` |
| 0x1A | `FindDeviceModule` | | **0x80** | `AuthModule` (auth channel v2, không encrypt byte) |
| 0x1C | `PersonalBestModule` | | 0x81 | `EncryptEchoModule` |
| | | | **0x82** | `AuthModule2` (auth Zepp OS, ECDH) |
| | | | 0x90 | `ObsoleteModule` |

- `BuiltInModule` (0x00): lệnh `0x00` → `[0x01, count u16le, id u8…]`; lệnh `0x03` → `[0x04, count u16le, (id u16le, requireEncryption u8)…]`. Byte đầu của phản hồi là lệnh + 1 và được tách ra trước khi parse (`BuiltInModule.java:186-196, 461`). Còn byte thừa thì cả danh sách bị coi là rỗng (`:373-430`). Dùng lệnh `0x03` khi phản hồi version có byte encrypt, ngược lại `0x00` (`:365-368`). Số nguyên little-endian (`utils/BufByteDecoder.java:133-149`) [V]. **Đồng hồ khai báo module nào bắt buộc mã hoá.** App chỉ mã hoá gói gửi khi `encryptEnable == true` **và** danh sách đánh dấu module đó (`ChannelApiImpl2.java:126-141`) [V].
- **Đính chính 2026-11-08 — module list chỉ có ở channel v2.** Vendor không hỏi module list trên channel v1; `BaseProfile.supportModule()` trả `false` trừ khi channel version == 2 (`BaseProfile.java:486-499`; `BuiltInModule.java:365-368`) [V]. Vì vậy v1 luôn có danh sách rỗng và đi auth legacy 0x0009 (§5.6); module 0x80/0x82 chỉ đạt được trên v2. Nguồn: `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` §1. Driver: `ChannelTransport.loadModuleList()` chạy sau auth; lỗi hoặc timeout (5 s, [I]) thì coi như danh sách rỗng.
- [Ext] Gadgetbridge đặt tên endpoint Zepp OS gần như trùng (0x0082 auth, 0x0016 steps, 0x000A settings…). Bảng trên lấy từ code, không lấy từ Gadgetbridge.
- Không tìm thấy module ID "0x0013 steps" trong APK này (đã tìm `@ChannelModule` và `getModule()`); bước realtime là **0x16**.

### 3.5 Pin (battery) [V]

- **Zepp OS — module 0x29 (`BatteryModule`)**: query-version `0x01`, query-battery `0x03`, notify `0x04`. Payload sau byte lệnh dùng layout chung `BatteryInfo.parseBatteryInfo` (`BatteryCommand.java:17-70`, `BatteryCodec.java:53-62`).
- **Legacy — char 0x0006 trong FEE0**: đọc trực tiếp. Byte flags quyết định các trường phụ: bit 0 = DC status (+1 byte), bit 1 = last-charge-full (+8 byte), bit 2 = last-charge (+8 byte), bit 3 = last-charge-level (+1 byte); sau các trường phụ là `level %` (`BatteryInfo.java:54-90`; `MiLiProProfile.java:732-739,1258-1261`).
- Driver hiện chỉ đọc SIG `0x180F`; hai đường vendor trên chưa implement (`ZeppSession.kt:76-83`). Nguồn: `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` §3.

---

## 4. Trình tự bắt tay sau khi kết nối (có thứ tự)

| # | Bước | Chi tiết | Bằng chứng |
|---|---|---|---|
| 1 | `connectGatt`, `discoverServices` | | `gatt/a0.java` [V] |
| 2 | Bật notify 0x0017 (và 0x0016 với v2) | | `BleChannelImpl.java:109`, `BleChannelImpl2.java:122` [V] |
| 3 | Version query `0x01` trên 0x0016 → `0x02 ver [enc]` | Chọn channel v1/v2 | `BleChannelLink.java:252-267` [V] |
| 4 | (v2) Hỏi danh sách module (module 0x00, lệnh `0x03`) | Biết module nào cần mã hoá | `BuiltInModule.java:402-420` [V] |
| 5 | Chọn cơ chế auth | **Channel v2:** dựa trên danh sách module (bước 4). `supportModule(0x80) \|\| supportModule(0x82)` → channel-based: `encryptEnable == null` → `DeviceAuthorizationImpl1` (module 0x80, APP_API_LEVEL=1); có `encryptEnable` byte → `DeviceAuthorizationImpl2` (module 0x82, ECDH). Không có cả hai → `TraditionalDeviceAuthorizationImpl` (char 0x0009). **Channel v1 không hỏi module list** (`supportModule()` luôn false), nên v1 luôn đi 0x0009; module 0x80 chỉ đạt được trên v2. | `profile/auth/DeviceAuthorizationFactory.java:88-94`; `BaseProfile.java:486-499` [V] |
| 6 | Auth (mục 5) | Thành công thì lưu `EncryptKeyStore` (session key, nonce) | `DeviceAuthorizationImpl2.java:113-160` [V] |
| 7 | Đặt giờ: ghi `2A2B` | `[year u16 LE, month, day, hour, min, sec, dayOfWeek(0=CN), ms/4, adjustReason, tzKey]`; vendor tìm `2A2B` dưới `FEE0`, không chỉ `0x1805` | `HMBaseBleDevice.java:186`; `BaseProfile.java:293-301,387-395`; `profile/base/ProfileUtils.java:42-58` [V] |
| 8 | Đọc device info `180A` | | `HMBaseBleDevice.java:196` [V] |
| 9 | Hỏi MTU (ConnectModule 0x15) và cấu hình | | `MiLiProProfile.java:2053-2056` [V] |
| 10 | Sync GDSP (mục 6) | | `HMProSyncDataTask.java:80-135` [V] |

---

## 5. Xác thực và mã hoá

### 5.1 Auth key đến từ đâu (điểm quyết định) [V]

**Auth key (16 byte) được tạo TRÊN ĐIỆN THOẠI rồi upload lên cloud Zepp. Cloud KHÔNG cấp key.** Có 3 cách tạo:

| Thế hệ | Cách tạo key | Bằng chứng |
|---|---|---|
| Band cũ (local bind, auth 0x0009) | `randomKey()` = `MD5(UUID.randomUUID())` dạng hex; ghi xuống đồng hồ bằng lệnh `0x01` | `device/bind/HMBindBaseLogic.java:930-932`; `HMBindMiLiLogic.java:303`; `HMProAuthProfile.java:165-176` |
| Band/đồng hồ có "server sign" (0x0009 + chữ ký) | key = `SHA256(MAC 6 byte ‖ random 16 byte của đồng hồ)[0:16]` | `profile/auth/HMProAuthController.java:29-94`; `HMProAuthProfile.java:95-108, 199-208` |
| **Zepp OS / Huami OS (module 0x82, ECDH)** | key = **16 byte đầu của khoá chung ECDH** (sect163r2) giữa khoá tạm của điện thoại và khoá công khai đồng hồ gửi khi bind | `DeviceAuthorizationImpl2.java:162-245` (dòng 243-245: `arraycopy(shared, 0, key, 0, 16)`, `info.setKey(hex)`) |

Sau khi bind, key được gửi lên cloud bằng `POST v1/device/binds.json` (host `https://api-mifit.huami.com/`) với tham số `auth_key`:
- `HMBindBaseLogic.java:716-720` (`hMWebBindInfoP.setAuthKey(authInfo.getKey())`).
- `webapi/device/HMDeviceWebAPI.java:84, 112, 336, 345-353` (bindDevice, `bindType==0` → POST, `1` → DELETE).
- Lần sau (cài lại app, máy mới), app **tải key về** từ danh sách thiết bị: `additionalInfo.auth_key`: `HMDeviceWebAPI.java:637, 756` (`device.setAuthkey(jSONObject2.optString("auth_key"))`). Host: `com/huami/network/hmnetwork/server/HMServerDef.java:10-15`.

**Vai trò thật của cloud khi bind là KÝ.** Khi bind lần đầu, đồng hồ đòi chữ ký của server Huami:
- App gọi `GET v1/device/binds.json?device_type=…&random=<base64(sha256)>&publickeyhash=SHA1:<hex>` và nhận chữ ký base64: `HMDeviceWebAPI.java:500-528`; callback `device/callback/MyAuthCallback.java:28-30`.
- `sha256 = SHA256(MAC ‖ khoá công khai 48 byte của đồng hồ)` (Zepp OS) hoặc `SHA256(MAC ‖ random)` (thế hệ trước): `DeviceAuthorizationImpl2.java:177-189`; `HMProAuthController.java:36-50`.
- Đồng hồ kiểm chữ ký bằng khoá công khai của Huami (đồng hồ chỉ gửi `publicKeyHash` 16 byte). [I] Thuật toán chữ ký không thấy trong app vì app chỉ chuyển tiếp. Độ tin cậy cao rằng bên thứ ba **không thể tự tạo chữ ký** này.

**Hệ quả cho app bên thứ ba:**
1. **Không thể bind một đồng hồ Zepp OS từ đầu mà không có server Huami** (cần chữ ký). Trừ khi firmware cho phép "local binding" (mục 5.3).
2. **Có thể dùng lại key sẵn có**: bind một lần bằng app Zepp, lấy `auth_key` (từ cloud bằng tài khoản của bạn, xem `HMDeviceWebAPI.java:637`, hoặc từ DB app trên máy đã root), rồi app của bạn chỉ chạy **session auth** (mục 5.2), vốn hoàn toàn cục bộ. [Ext] Đây chính là cách Gadgetbridge yêu cầu người dùng nhập "auth key".

### 5.2 Session auth Zepp OS (module 0x82), chạy mỗi lần kết nối [V]

Hàm `DeviceAuthorizationImpl2.a(keyBytes)`: `DeviceAuthorizationImpl2.java:113-160` (REA: `rea-output/method_DeviceAuthorizationImpl2.a.json`).

```
0. (tuỳ chọn) getAuthorizationInfo: gửi [0x00] → [0x10 0x00 0x01, version u8, apiLevel u16, allowLocalBinding u8]
     AuthModule.java:425-435; AuthorizationProtocolInfo.java:42
1. privPhone = 24 byte ngẫu nhiên (SecureRandom); pubPhone = ECDH_pub(privPhone) (48 byte)
     KeyShareApiImpl.java:12, 23-29, 46-50 → libdevice-encrypt.so ecdh_generate_keys
2. Gửi module 0x0082: [0x04, apiLevel=0x02 0x00, 0x02, pubPhone(48)]
     AuthModule2.java:153-154 (APP_API_LEVEL=2 ở DeviceAuthorizationImpl2.java:51)
3. Nhận: [0x10, 0x04, 0x01, random(16), pubWatch(48)]       AuthModule2.java:160-162
4. shared = ECDH(privPhone, pubWatch)  (24 byte)             DeviceAuthorizationImpl2.java:122; libdevice-encrypt ecdh_shared_secret
5. sessionKey[i] = shared[8+i] XOR authKey[i], i=0..15       DeviceAuthorizationImpl2.java:135-144
6. Gửi: [0x05, AES_ECB(authKey, random), AES_ECB(sessionKey, random)]  (1+16+16 byte)
     AuthUtilsKt.encrypt(data, key) = AES/ECB/NoPadding: AuthUtilsKt.java:55-63; AuthModule.java:401-411
7. Nhận: [0x10, 0x05, 0x01] = thành công
8. Lưu EncryptKeyStore(shared, authKey):
     r0 = shared[0..3] (u32 LE, nonce gửi), r1 = shared[4..7] (nonce nhận),
     key = shared[8..23] XOR authKey (= sessionKey)           channel/encrypt/EncryptKeyStore.java:28-44
```

Thông số ECDH: khoá riêng 24 byte, khoá công khai 48 byte (`PRV_KEY_SIZE=24`, `ECDH_PUB_KEY_LEN=48`: `KeyShareApiImpl.java:12`, `AuthModule.java:56`). Native `libdevice-encrypt.so` export `ecdh_generate_keys`/`ecdh_shared_secret` (giao diện của thư viện tiny-ECDH-c). Trong `.rodata` có **đúng các hằng của NIST B-163 (sect163r2)**:
- Gx `…e8343e36` tại offset `0x2A170`.
- b `…4a3205fd` tại `0x2A1C8`.
- Gy `…797324f1` tại `0x2A188`.
- order `…a4234c33` tại `0x2A210`.
- **Không** có hằng của K-163 (sect163k1).

[V] cho việc khớp hằng số. [Ext] Gadgetbridge cũng dùng B-163 (`ECDH_B163`).

### 5.3 Bind lần đầu Zepp OS (module 0x82) [V]

`DeviceAuthorizationImpl2.b()`, `DeviceAuthorizationImpl2.java:162-264`:
1. Chọn đường: nếu không đọc được `AuthorizationProtocolInfo`, **hoặc** (`allowLocalBind()` **và** `!HMBleConfig.SUPPORT_NEW_AUTH`) thì đi local bind; ngược lại đi cloud bind: `DeviceAuthorizationImpl2.java:318-321`. `SUPPORT_NEW_AUTH` mặc định `true` (`HMBleConfig.java:11`, đổi qua `HMBleModule.setServerSign`, `HMBleModule.java:61-62`).
2. **Cloud bind:** gửi `[0x02, 0x02 0x00, pubPhone(48)]`, nhận `[code=1, publicKeyHash(16), pubWatch(48)]` (65 byte): `AuthModule2.java:183-196`.
3. `sha = SHA256(MAC(6) ‖ pubWatch(48))`. Xin chữ ký server (`GET binds.json`, mục 5.1). Gửi `[0x03, signature…]` rồi chờ tối đa 30 s (đồng hồ có thể yêu cầu người dùng xác nhận): `AuthModule.java:349-364`; `DeviceAuthorizationImpl2.java:189-200`.
4. `authKey = ECDH(privPhone, pubWatch)[0:16]`. Chạy tiếp session auth (5.2), rồi upload `auth_key` lên cloud.
5. **Local bind** (`d()`): gửi `[0x01, 0x02 0x00, key(16)]`. Code `1` = OK, `2` = người dùng từ chối. Key lấy từ `localKeyFromString` (hex hoặc MD5 của chuỗi): `DeviceAuthorizationImpl2.java:270-314`; `AuthModule.java:569-578`; `AuthUtilsKt.java:79-95`.
   [I] Nếu firmware báo `allowLocalBinding = 1`, đường này **không cần server**. Nhưng app chính thức luôn đi cloud vì `SUPPORT_NEW_AUTH=true`. **Chưa rõ** firmware Zepp OS hiện nay có bật `allowLocalBinding` không (câu hỏi mở số 1).
   **Trạng thái trong driver (`driver/zepp`):** khi app tự sinh key (credential `zepp.auth_key` kèm cờ `zepp.auth_key.unbound`), driver bind cục bộ TRƯỚC session auth, chỉ xoá cờ sau khi đồng hồ chấp nhận. Zepp OS: đọc `[0x00]`, chỉ gửi `[0x01, 0x02 0x00, key(16)]` khi `allowLocalBinding == 1` (mã 1 OK, 2 người dùng từ chối); nếu không, báo lỗi giải thích cần chữ ký server Huami và yêu cầu bind bằng app Zepp rồi dán key. Band đời cũ (0x0009): ghi `[0x01, appId, key(16)]` (§5.5), chờ tối đa 30 s (đồng hồ có thể đòi chạm xác nhận). Không bao giờ gọi mạng. **Chưa thử trên phần cứng thật** (chỉ test JVM với `FakeZeppWatch`); mã trạng thái từ chối của band đời cũ ngoài `1` = OK là [I].
6. Unbind: `[0x06]` (0x80) hoặc `[0x07]` (0x82) kèm `AES(random, key) ‖ AES(random, sessionKey)`: `AuthModule2.java:134-144`; `DeviceAuthorizationImpl2.java:324-356`.

### 5.4 Mã hoá payload channel (sau auth) [V]

`channel/encrypt/impl/EncryptApiImpl.java:38-103` (REA: `method_EncryptApiImpl.encryptData.json`):

```
khoá gói   = sessionKey XOR sessionId (mỗi byte XOR với byte handle)       :52-63
plaintext  = data ‖ r0 (u32 LE) ‖ CRC32(data ‖ r0) (u32 LE)  (java.util.zip.CRC32)
            đệm 0x00 tới bội số 16
ciphertext = AES/ECB/NoPadding(khoá gói, plaintext)                           :93-103
gói channel: flags có bit 0x08, totalSize = độ dài data GỐC; sau mỗi lần gửi r0++ (mod 2^32-1)
nhận: giải AES → data(totalSize) ‖ nonce ‖ crc; kiểm CRC32; nonce phải nằm trong (r1, r1+100000]  :71-89
```
- Module nào cần mã hoá do đồng hồ khai báo (BuiltInModule lệnh 0x03). Auth (0x82) thì **không** mã hoá.
- `CRCUtilsKt.getCRC32` = `java.util.zip.CRC32` chuẩn: `com/xiaomi/hm/health/bt/utils/CRCUtilsKt.java:37-39`.

### 5.5 Session auth module 0x80 (channel v2 không có byte encryptEnable, không ECDH) [V]

> **Đính chính 2026-11-08:** tiêu đề cũ gán module 0x80 cho "channel v1" và bỏ sót local bind.
> Module 0x80 chỉ đạt được trên channel v2 (v1 không có module list — §3.4); bind cục bộ có trong
> `DeviceAuthorizationImpl1`/`AuthModule.startLocalBinding`. Nguồn:
> `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` §1.

`AuthModule.java` (APP_API_LEVEL = 1 cho Impl1). Giao thức gần như giống §5.2 nhưng **không có ECDH**:

| Bước | Gửi (module 0x80) | Nhận |
|---|---|---|
| 1 | `[0x00]` getAuthorizationInfo | `[code=1, version_u8, apiLevel_low, apiLevel_high, allowLocalBind_u8]` |
| 2 | `[0x04, 0x01, 0x00, 0x02]` requestRandomNumber | `[code=1, random(16)]` |
| 3 | `[0x05, AES_ECB(random, authKey)(16)]` authorize | `[code]` (1=OK) |

- Không session key, không encryption keystore. Module 0x80 watches **không mã hoá channel**.
- **Local bind được hỗ trợ**: `DeviceAuthorizationImpl1` → `startLocalBinding`, gửi `[0x01, 0x01, 0x00, key(16)]` → `[code]` (1=OK, 2=người dùng từ chối), timeout 30 s. Module 0x80 không chỉ có session auth; nó còn bind cục bộ được.
- Cloud bind: `[0x02, 0x01, 0x00, pubPhone...]` → `[code, pubKeyHash(16), random(16)]`.
- Bằng chứng: `AuthModule.java:401-411, 424-435, 512-538, 569-578`; `DeviceAuthorizationImpl1.java:158-162`.
- Chỉ áp dụng cho channel v2 (không có byte `encryptEnable`); v1 đi 0x0009 (§5.6).

### 5.6 Auth cũ trên char 0x0009 (Mi Band 2/3/4/5, Amazfit Bip…) [V]

`profile/auth/HMProAuthProfile.java`:
- Đăng ký notify 0x0009 trong service `FEE1` (fallback `FEE0`): `:326-330`.
- Ghi key (pair): `[0x01, appId, key(16)]`: `:165-176`.
- Xin random: `[0x02|flag, appId, 0x02]` hoặc `[0x02|flag, appId, 0x02, apiLevel u16]`. Phản hồi `[0x10, 0x02, 0x01, random(16)]`: `:293-312`. `flag` mặc định 0; hằng `0x80` có ở `:40`.
- Gửi `[0x03|flag, appId, AES_ECB(key, random)]` → `[0x10, 0x03, 0x01]`: `:110-121, 234-250`.
- Biến thể có chữ ký server: `[0x01, appId]` trả `version`/`algorithm`/`publicKeyHash`: `:258-275`. Rồi `p(sign, flags)`. Luồng ở `HMProAuthController.java:25-113`.

---

## 6. Đồng bộ dữ liệu

### 6.1 GDSP: fetch lịch sử trên 0x0004 (control) / 0x0005 (data) [V]

Áp dụng **cả cho Zepp OS**: `GdspSyncProfileImpl` luôn tạo `HMProSyncDataBaseProfile` trên 0x0004/0x0005 (`gdsp/common/profile/GdspSyncProfileImpl.java:234-243`). [I] Trên Zepp OS cần auth xong trước.

Lệnh (`gdsp/activity/HMProSyncDataBaseProfile.java`):

| Bước | Ghi lên 0x0004 | Phản hồi notify 0x0004 | Bằng chứng |
|---|---|---|---|
| Hỏi phiên bản GDSP | `[0x00]` | `[0x10,0x00,0x01, ver]` | `:277-291`; `gdsp/base/GDSPCommand.java:13-16` |
| Xin header (fetch từ thời điểm) | `[0x01, type, year u16 LE, month, day, hour, min, sec, tzKey]` (+ `, compress(0/1)` nếu GDSP v2) | `[0x10,0x01,0x01, count u32 LE, year u16 LE, mon, day, h, m, s, tz, (expansion…)]` | `:470-485`, `:381-399`, `GdspSyncProfileImpl.java:602, 641-647` |
| Bắt đầu truyền | `[0x02]` | dữ liệu đến trên **0x0005**: `[seq(1), payload…]`, seq tăng mod 256 | `:421-423`, `:160-178` |
| Kết thúc | notify 0x0004 `[0x10,0x02,code, crc32 u32 LE]`; app so CRC32 của toàn bộ payload (bỏ byte seq) | | `gdsp/base/GDSPApiImpl.java:52-78, 88-94, 111-151` |
| Xác nhận/dừng | `[0x03]` hoặc `[0x03, code]` (code 1 = thành công) | `[0x10,0x03,0x01]` | `:425-428, 477-480`; `GDSPSyncTask.java:116-118` |

- `count` của header activity = **số phút** (tối đa 129.600 = 90 ngày). App cộng `count` phút vào mốc thời gian để fetch tiếp: `gdsp/activity/HMProSyncDataTask.java:80-135` (dòng 88, 135: `Calendar.add(MINUTE, size)`).
- Phản hồi chung `[0x10, cmd, code, data…]`: `profile/base/HMNotifyResponse.java:49-71`.

**Mã `type`** (`HMProSyncDataBaseProfile.java:32-74`, `gdsp/HMGDSPType.java:7-19`):

| type | Dữ liệu | | type | Dữ liệu |
|---|---|---|---|---|
| 0x01 | Activity (theo phút) | | 0x25 (37) | SpO2 điểm |
| 0x02 | HR thủ công | | 0x26/0x27/0x28/0x2B | SpO2 OSA / OSA event / ODI / OSA York |
| 0x03 | ECG | | 0x29 (41) | Giờ đứng |
| 0x04 | Nhiệt độ | | 0x2A (42) | Tóm tắt ECG |
| 0x05 / 0x0E | GPS/sport summary (0x0E "coaching" khi hỗ trợ) | | 0x2C (44) | Thống kê v2 |
| 0x06 | GPS/sport detail (track) | | 0x2E/0x2F/0x30 | Thân nhiệt cả ngày / đơn lẻ / 80s |
| 0x07 | Log | | 0x32 (50) | HR cao/thấp |
| 0x08 | PPG RR | | 0x34–0x37 | Huyết áp (PPG, đặc trưng, kết quả) |
| 0x0A/0x0B/0x11 | AF (rung nhĩ) | | 0x38/0x39 | Nhịp thở khi ngủ (data/event) |
| 0x0D (13) | **PAI** | | 0x3A (58) | **Nhịp tim nghỉ** |
| 0x10 | PPG | | 0x3E (62) | Huyết áp khi ngủ |
| 0x12 (18) | **Stress đơn lẻ** | | 0x3F (63) | Activity hôm nay |
| 0x13 (19) | **Stress cả ngày** | | 0x40/0x41 | Thông báo HR cao/thấp, OSA |
| 0x1D (29), 0x1E (30) | HR cao/thấp (cũ), AF ACC | | 0x23/0x24 | Firstbeat detail/simple |

### 6.2 Định dạng bản ghi (layout byte) [V trừ khi ghi khác]

**Activity (type 0x01)**: `HMProSyncDataBaseProfile.java:345-378`
- Byte đầu của khối dữ liệu ghép được **bỏ qua** (vòng lặp bắt đầu từ index 1; kiểm `(len-1) % recordSize == 0`, `:139-143`). [I] Có thể là byte phiên bản/cờ.
- Kích thước bản ghi = `feature.get(0)` nếu thiết bị khai báo (> 4), ngược lại 4 byte. Mỗi bản ghi = 1 phút.

```
4 byte (ActivityHrData.java:10-18):  [0] kind/category  [1] intensity  [2] steps  [3] heartRate (0xFF/0xFE = không đo [Ext])
8 byte (ActivityDataExtend.java:11-26):
  [0] kind [1] intensity [2] steps [3] HR
  [4] retain  [5] sleepProbabilityAndPosture  [6] sleepProbabilityDeep  [7] sleepProbabilityRem
```
- Giai đoạn ngủ **được tính trên điện thoại** bởi `libdataProcess.so` (`Java_com_xiaomi_hm_health_dataprocess_DataAnalysis_processData`, `set24HoursSleepDetectionStatus`…) từ chuỗi activity. [I] Nghĩa của `kind` (ngủ nông/sâu/không đeo…) nằm trong native, **không tìm thấy** bảng mã trong Java.

**SpO2 điểm (type 37)** [V]: `HMSyncSpo2Profile.java:63-77` chọn parser theo byte version trong frame đầu (khi `supportVersion == true`):

| Version | Kích thước bản ghi | Layout | Nguồn |
|---|---|---|---|
| v1 (hoặc `supportVersion==false`) | 5 byte | `[0..3] timestamp u32 LE (giây UTC), [4] spo2 u8` | `Spo2PointData.java:34-38` |
| v2 | **65 byte** | `[0..3] timestamp u32 LE, [4] spo2 u8 (điểm hiện tại), [5..64] spo2History byte[60]` (60 phút lịch sử, từ cũ đến mới, 1 byte/phút) | `Spo2PointDataExtends.java:41-51` |

Byte version ở `payload[1]` của chunk đầu (payload[0] = seq); data thực bắt đầu từ payload[2]. Parse loop v2: `i += 65`. Giá trị `other` → log "not support", trả null.

**Stress cả ngày (type 19)** [V]: `HMProSyncDataProfile.M()` + `HMSyncPressureTask.a()`:
- Payload: byte[0] bỏ qua; byte[1], byte[2], … mỗi byte = 1 giá trị stress (u8, 0-255) cho 1 phút.
- Timestamp index i: `header.start_ms + DST_offset_ms + i × 60_000`

**Stress đơn lẻ (type 18)** [V]: `HMProSyncDataProfile.parsePressureSingleData()`:
- Payload: byte[0] bỏ qua; bản ghi 5 byte bắt đầu từ byte[1]:
  `[0..3] timestamp u32 LE (giây UTC), [4] stress u8`
- Validation: `(length - 1) % 5 == 0`

**PAI (13)**, **resting HR (58)**, **GPS (5/6)**: có lớp riêng (`gdsp/pai/HMPaiData.java`, `gdsp/gps/*`, proto `com/xiaomi/hm/health/bt/proto/SportSummary2.java`). Workout summary dùng **protobuf** `SportSummary2`. Detail GPS là luồng node có tag (`gdsp/gps/sport800/DetailNodeType.java`, ví dụ `NODE_TAG_RT_SPO2 = 9`). **Chưa trích layout chi tiết** (câu hỏi mở số 4).

**Sleep module 0x32 — WriteData payload (phone → watch, lệnh 0x07)** [V]: `SleepDataCodec.encode()`:
```
[0..3]   timestamp u32 LE          (giây UTC, bắt đầu phiên ngủ)
[4..7]   updateTimestamp u32 LE    (giây UTC, lần cập nhật cuối)
[8]      timezoneKey u8
[9..12]  dataFlag u32 LE           (bitmask: 0x01=SleepScore, 0x02=RestingHr, 0x04=SleepStage)
[13..14] start u16 LE              (bắt đầu ngủ, [I] phút từ 00:00)
[15..16] stop u16 LE               (kết thúc ngủ, phút)
[17..18] sleepDuration u16 LE      (phút)
-- optional (theo thứ tự xuất hiện trong code, kiểm dataFlag) --
if dataFlag & 0x01: sleepScore u8
if dataFlag & 0x02: restingHr u8
if dataFlag & 0x04: stageCount u16 LE, rồi N×6 byte mỗi stage: (start u16 LE, stop u16 LE, status u16 LE)
```
SleepStage.status values [I/Ext]: 0=light, 1=deep, 2=REM, 3=awake. **Không tìm thấy enum trong Java** — lấy từ [Ext] Gadgetbridge pattern.
Module 0x32 là **phone → watch only**: `SleepDataCodec.decode()` = `throw NotImplementedError`. Để ĐỌC ngủ từ Zepp OS, dùng GDSP type 0x08 (PPG/RR) hoặc activity heuristic (`libdataProcess.so`), không phải module này.

**Realtime**: bước qua module 0x16 (`RealtimeActivityModule`) hoặc char 0x0007. HR luôn đến qua notify `2A37`: byte `[1]` là bpm (`profile/hr/HMHeartRateProfile.java:53, 62`). Có hai cách bật cảm biến [V]:

| | Đồng hồ có `OpenAppModule` (29 = 0x1D) trong danh sách module | Không có |
|---|---|---|
| Chọn đường | `HMHeartRateController.java:142` (`supportModule(29)`). App **ưu tiên** module 29 kể cả khi có `2A39` | `2A39` |
| Khởi tạo | Chỉ đăng ký `2A37` (`HMHeartRateProfile.initZeppOs`, `:131-148`), không đụng `2A39` | `2A39` + `2A37` (`:111-128`) |
| Bật | Gửi module 29 `[0x04, 0x01]` (`OpenAppModule.java:489`; `OpenAppCommand.java:67`; `RealtimeHrState.java:10-12`) | `15 01 01` |
| Giữ | `[0x04, 0x02]` mỗi 10 000 ms (`HMHeartRateController.java:160, 197, 201`). Lỗi chỉ log, không dừng | `16` |
| Tắt | `[0x04, 0x00]` rồi gỡ đăng ký `2A37` (`:179-190`) | `15 01 00` |
| Kết quả | Đồng hồ trả `[0x05, status]`, status `0` = OK (`OpenAppModule.java:142-146`; `OpenAppCommand.java:78`). App chờ tối đa 15 000 ms (`:500`). Không có bpm trong module này | Không có phản hồi |

Mã hoá gói module 29 theo bảng `BuiltInModule` (§3.4). Driver: `ZeppSession` chọn `ZeppOsLiveHeartRate` khi danh sách module có 29, ngược lại `ZeppLiveHeartRate` (`2A39`). Cả hai chỉ chạy khi flow được collect, lọc bpm 1..250, và khi dừng thì tắt cảm biến rồi `unsubscribe(2A37)` trong `NonCancellable`. Chỉ khai báo `LIVE_HEART_RATE` khi có `2A37` và ít nhất một trong hai đường. Cả hai **chưa thử trên đồng hồ thật**.

### 6.3 Health Connect / Google Fit [V]
- **Không dùng Health Connect.** Không có `androidx.health.connect`, không có quyền `android.permission.health.*` (`rea-output/permissions.txt`, 46 quyền, 0 quyền health).
- **Có ghi Google Fit** (Fitness API cũ): `TYPE_STEP_COUNT_DELTA`, `TYPE_DISTANCE_DELTA`, `TYPE_CALORIES_EXPENDED`, `TYPE_ACTIVITY_SEGMENT`, `TYPE_SLEEP_SEGMENT`, `TYPE_HEART_RATE_BPM`, `TYPE_WEIGHT`: `com/xiaomi/hm/health/thirdbind/googlefit/GoogleFitSyncHelper.java:3315-3991`.
- Có tích hợp chia sẻ sang Strava, Runkeeper, Relive (chuỗi `"strava"`, `"runkeeper"`, `"relive"` trong `thirdbind/*`).
- [Ext] Các bản Zepp mới hơn (2023+) đã thêm đồng bộ Health Connect. Cần kiểm lại trên bản hiện tại.

---

## 7. Các lựa chọn chính thức

| Lựa chọn | Có gì | Nguồn |
|---|---|---|
| **Health Connect** | Bản 6.10.1 **không có**. [Ext] Bản mới có (bước, HR, ngủ, bài tập, cân nặng…) | [V] vắng mặt; [Ext] |
| **Google Fit** | Có trong bản này (Fitness API sắp bị Google ngừng) | [V] `GoogleFitSyncHelper.java` |
| **Zepp OS SDK** (mini-app JS chạy trên đồng hồ + "Side Service" chạy trong app Zepp) | Đọc cảm biến (HR, bước, SpO2, stress, ngủ…) trên đồng hồ, gửi qua `messaging` sang Side Service, rồi `fetch` HTTP ra ngoài. Không cho app Android khác nói BLE trực tiếp. App có module `applet_*` và channel module `js` | [V] tên module `applet_*`, `channel/module/js`; [Ext] tài liệu docs.zepp.com |
| **Zepp Health / Huami cloud API cho đối tác** | [Ext] Có chương trình đối tác (OAuth, REST) nhưng không công khai rộng. Trong app chỉ thấy OAuth **chiều ngược lại** (Zepp đăng nhập vào Aqara/Lumi/Alexa): `thirdparty-us-v2.huami.com`, `oauth-connect-cn.huami.com` (`com/huami/thirdparty/webauth/Api.java:29`, `com/huami/watch/companion/config/LvMiConfig.java:22-36`) | [V]/[Ext] |
| **Strava/Google Fit làm trung gian** | Đọc lại từ Strava API (chỉ workout) | [V] có tích hợp |

---

## 8. Khuyến nghị cho app Android của bạn

### Phương án A: chính thống (khuyến nghị)
1. **Health Connect**: cập nhật Zepp lên bản mới và bật Health Connect trong Zepp ([Ext], bản 6.10.1 chưa có). `unified_health_app` đọc `Steps`, `HeartRate`, `SleepSession`, `ExerciseSession`, `OxygenSaturation`… Cách này ít rủi ro nhất và dùng chung pipeline với Garmin/Huawei.
2. **Cần chỉ số Health Connect không có** (stress, PAI): viết mini-app **Zepp OS** đọc sensor trên đồng hồ. Side Service gửi về backend của bạn (HTTP) hoặc qua một server trung gian. App Zepp vẫn phải chạy.
3. Tránh dựa vào Google Fit API (đang bị Google khai tử).

### Phương án B: tự cài BLE (chỉ cho đồng hồ của bạn, mục đích interoperability)

**Khả thi về kỹ thuật: CÓ, với điều kiện có auth key.** Không thể tự bind từ đầu nếu không có chữ ký server (mục 5.1).

1. **Lấy auth key**: bind bằng app Zepp một lần. Lấy `auth_key` (32 ký tự hex) từ danh sách thiết bị trên cloud bằng tài khoản của bạn (`HMDeviceWebAPI.java:637`, `additionalInfo.auth_key`), hoặc từ DB app trên máy root. [Ext] Gadgetbridge có hướng dẫn và script cộng đồng cho việc này. **Không** unbind trong app Zepp: unbind/factory reset sẽ huỷ key. Sau đó tắt hoặc gỡ app Zepp để hai app không tranh kết nối.
2. **Quét**: lọc service `FEE0` + đúng MAC (hoặc quét QR trên đồng hồ để lấy MAC). `connectGatt(TRANSPORT_LE)`, `requestMtu(247)`, `discoverServices`.
3. **Channel**: bật notify `0x0016` và `0x0017`. Ghi `0x01` lên `0x0016`, đọc `0x02 ver [enc]`. Với Zepp OS, `ver = 2` → header v2 (có byte appId = 0).
4. **Module list**: chỉ channel v2 mới gửi module 0x0000 lệnh `0x03`, lưu cờ `requireEncryption` cho từng module. Channel v1 bỏ qua bước này (danh sách rỗng) và dùng auth 0x0009 ở bước 5.
5. **Session auth** (module 0x0082): ECDH **sect163r2** (BouncyCastle `SECNamedCurves.getByName("sect163r2")`). Khoá công khai 48 byte = X‖Y, mỗi phần 24 byte. [I] Thứ tự byte và cách đệm của tiny-ECDH (mảng `uint32` little-endian) phải kiểm bằng thử nghiệm; [Ext] Gadgetbridge có sẵn `ECDH_B163.java` port từ tiny-ECDH. Gửi `04 02 00 02 ‖ pub`, nhận `random ‖ pubWatch`, tính `sessionKey`, gửi `05 ‖ AES(authKey,random) ‖ AES(sessionKey,random)`, chờ `10 05 01`.
6. **Khởi tạo nonce/khoá** theo `EncryptKeyStore` (r0, r1, key). Mã hoá payload cho module cần mã hoá (mục 5.4). ACK mọi gói có cờ NEED_REPLY bằng `[04, 00, session, 01, index]` lên `0x0017`.
7. **Đặt giờ** (`2A2B`, mục 4 bước 7).
8. **Fetch lịch sử** qua GDSP 0x0004/0x0005: activity (0x01), stress (0x13), SpO2 (0x25), PAI (0x0D), resting HR (0x3A), sport summary/detail (0x05/0x06). Kiểm CRC32. Gửi `03 01` để xác nhận. Lưu mốc thời gian cuối cho lần fetch sau. Parse activity theo phút (mục 6.2). Ngủ: tự viết heuristic từ `kind`/xác suất ngủ, hoặc đọc module 0x32.
9. **Ghi Health Connect** từ dữ liệu đã parse. `unified_health_app` đã có `core/ble`, nên thêm `ZeppTransport` (channel v2 + crypto), `ZeppAuth`, `GdspFetcher`.

**Rủi ro**
- Mất key nếu đồng hồ bị reset hoặc unbind. Khi đó phải bind lại bằng app Zepp.
- Xác nhận "đã đọc" (`03 01`) có thể khiến đồng hồ coi dữ liệu là đã đồng bộ, nên **app Zepp sẽ không thấy lại** dữ liệu đó. [I] Chưa kiểm chứng.
- Firmware Zepp OS mới (2.x/3.x/4.x) có thể thêm module hoặc đổi định dạng. Phân tích này dựa trên app 2022.
- Pháp lý: reverse engineering để interoperability với **thiết bị của chính bạn** thường được phép ở nhiều nơi. **Không** phân phối mã/khoá của Huami. Không giả mạo server Huami để lấy chữ ký.

---

## 9. Câu hỏi còn mở và mức độ tin cậy

| # | Câu hỏi | Tin cậy hiện tại / cách kiểm |
|---|---|---|
| 1 | Firmware Zepp OS có trả `allowLocalBinding = 1` không? Nếu có, local bind `[01 02 00 key16]` cho phép bind **không cần server** | Thấp. Code hỗ trợ ([V] `AuthModule.java:569-578`) nhưng app luôn ép cloud. Kiểm: gửi `[0x00]` tới module 0x82 trên đồng hồ của bạn |
| 2 | Định dạng byte chính xác của khoá công khai 48 byte (thứ tự từ, endianness, padding 163→192 bit) trong `libdevice-encrypt.so` | Trung bình. Hằng B-163 đã khớp [V]. Cần disassemble `ecdh_generate_keys` hoặc so với Gadgetbridge |
| 3 | `BleChannelImpl2.sendData` (không dịch được): v2 có chờ ACK trên 0x0016 cho từng nhóm gói như v1 không | Trung bình. Dùng `jadx --comments-level debug` hoặc REA `inspect-android-method` để xem bytecode |
| 4 | Layout PAI, resting HR (type 58), sport summary/detail, SpO2 v2, sleep module 0x32 | **Một phần giải quyết** (2026-11-06): SpO2 v2 [V], Stress type 18/19 [V], Sleep module 0x32 codec [V], PnP ID [V] — xem §6.2 và §5.5. **Còn mở**: resting HR type 58 — hằng `DATA_TYPE_RESTING_HEART_RATE=58` tại `HMProSyncDataBaseProfile.java:71` nhưng **không tìm thấy parse method** (có thể bị R8 obfuscate hoặc nằm trong class bị decompile lỗi); [I] bản ghi 5 byte `[timestamp u32 LE, bpm u8]` theo mẫu type 18/SpO2 v1. PAI layout và sport protobuf vẫn chưa trích. Cần HCI snoop log. |
| 5 | Bảng mã `kind` của activity và thuật toán ngủ | Nằm trong `libdataProcess.so` (native). [Ext] Gadgetbridge có bảng kind cho Huami |
| 6 | ~~Lệnh control point HR realtime (`2A39`)~~ — đã giải quyết [V] từ jadx: start `15 01 01`, stop `15 01 00`, heartbeat `16` mỗi 10 s (xem §3.1). Đường Zepp OS qua `OpenAppModule` (29) cũng đã giải quyết [V]: `[0x04, state]` → `[0x05, status]`, bpm vẫn qua `2A37` (xem §6.2 "Realtime"). Còn mở: chưa thử trên đồng hồ thật; chưa đọc timeout phía app cho lệnh danh sách module (driver dùng 5 s) |
| 7 | API cloud tải `auth_key` (`v1/device/lists.json` / `users/{id}/devices`) cần token gì | `HMDeviceWebAPI.java:110, 114, 497`. Token lấy từ `HMWebUtil.getSystemParams()` (chưa đọc) |
| 8 | Ack `03 01` có xoá dữ liệu trên đồng hồ không | Chưa rõ. Kiểm bằng thử nghiệm |
| 9 | Bản Zepp hiện tại (2025-2026) còn dùng y nguyên giao thức này không | [Ext] Gadgetbridge vẫn hỗ trợ Zepp OS bằng cùng mô hình (0x0016/0x0017, 0x0082, B-163). Nên tải APK mới để đối chiếu |

**Bước kiểm chứng đề xuất:** bật *Bluetooth HCI snoop log* trên điện thoại, cho app Zepp kết nối và sync một lần. Mở bằng Wireshark, lọc ATT handle của 0x0016/0x0017/0x0004/0x0005. So với mục 3–6: version `01`/`02 02 01`, `04 02 00 02 …`, `05 …`, `01 01 <time>`, `02`. Cách này chuyển nhanh các mục [I] thành [V] cho đúng model đồng hồ của bạn.
