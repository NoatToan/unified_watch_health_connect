# COROS Android 4.11.8: cách app tìm, ghép đôi và đồng bộ với đồng hồ

> Mục đích: phân tích để bạn **kết nối đồng hồ COROS của chính mình** với app sức khoẻ Android tự viết
> (`unified_health_app`), vì mục đích interoperability.
> Nguồn: `com.yf.smart.coros.dist` 4.11.8 (versionCode 411080300, minSdk 24, targetSdk 36), file APK do
> người dùng cung cấp (`docs/apks/coros-4.11.8.apk.part-*`).
> Ngày phân tích: 2026-11-06.

---

## 0. Phương pháp, công cụ và giới hạn — ĐỌC TRƯỚC

**Khác với Garmin/Huawei/Zepp: bản APK này bị đóng gói (app hardening / "shell") bởi một SDK bảo vệ
thương mại của bên thứ ba, nên KHÔNG decompile được code Java/Kotlin thật.** Đây là giới hạn kỹ
thuật cứng, không phải do thiếu công cụ.

| Hạng mục | Chi tiết |
|---|---|
| Giải nén | `docs/apks/coros-4.11.8.apk.part-*` ghép bằng `scripts/restore-apks.sh` → `coros-4.11.8.apk` (xác minh SHA-256). Copy ra `../rea-output/coros/` (ngoài git) |
| REA CLI 6.8.0 | `rea inspect-android-package` chạy được (đọc manifest/permission bằng jadx-headless-mcp 0.7.1, `REA_JADX_MCP_JAR` trỏ tới `~/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar`), nhưng **`rea search-android-classes` / decompile chỉ thấy 32 class** trong toàn bộ `classes.dex` (89 MB) |
| **Phát hiện đóng gói (shell)** | Phân tích header DEX bằng tay (`struct` Python, xem `docs/re-evidence/coros/00-methodology.md`): `class_defs_size = 30`, tự nhất quán với `map_list` ở cuối file (tổng kích thước vùng có cấu trúc ≈ 70 KB). Phần dư ~89,6 MB sau đó **không có header DEX hợp lệ** nên jadx/rea không nạp được. 32 class duy nhất đọc được là lớp vỏ bọc `com.zgpgarg.zmr.kcaqqgc.*` (`Entry`, `MyApplication`, `MyJni`, `InstrumentationProxy`, `NEDialog`…) — đúng khuôn mẫu một SDK "gia cố" (app hardening) Android phổ biến của Trung Quốc: tách `classes.dex` thật ra khỏi APK, native `MyJni` giải mã/nạp lại bằng `ClassLoader`/`Instrumentation` tuỳ biến lúc runtime. Hai file `.so` có timestamp khác hẳn phần còn lại (`lib/*/libzgrge*.so`, sửa 2026-10-27 so với các `.so` khác đều mang timestamp mặc định của zip 1981) củng cố giả thuyết này |
| **Quyết định phạm vi** | **Không** viết công cụ bóc gỡ (unpack) riêng cho SDK bảo vệ thương mại này — nằm ngoài phạm vi "RE giao thức kết nối thiết bị", tốn effort lớn, không chắc hợp pháp/khả thi, và không cần thiết (xem D-101 trong `docs/DECISIONS.md`) |
| **Vẫn trích xuất được gì** | Dù không decompile được, phần lớn **tên lớp, tên gói, hằng chuỗi (string constant), tên enum, UUID literal vẫn nằm ở dạng văn bản thuần (cleartext) ngay trong `classes.dex`** (không bị nén/mã hoá ở mức byte — entropy đo được ≈5-6 bit/byte, không phải ~8 bit/byte như AES). Dùng `strings -n 6 classes.dex` trích được **~650.000 dòng**, trong đó có hàng chục nghìn lần xuất hiện của `com/yf/smart/weloopx/...`, `com/yf/lib/bluetooth/...`, `com/yf/coros/blecmd/...` — đủ để dựng lại **kiến trúc** (tên lớp, gói, enum, UUID) nhưng **không đủ để biết byte-layout thật** (không có method body, không có số lệnh cụ thể, không có thứ tự gọi hàm) |
| `assets/` | Không chứa code hay `.proto` biên dịch sẵn hữu ích cho giao thức — `assets/resources/res_*` là các gói zip model AI (nhận diện giọng nói/ý định, ONNX) và watchface, không liên quan BLE. `assets/modules.json` liệt kê dependency JS của lớp UI React Native (app dùng React Native 0.77 cho giao diện, nhưng **không có thư viện BLE nào trong danh sách** — xác nhận toàn bộ logic BLE nằm ở tầng Java/Kotlin gốc `com.yf.lib.bluetooth`/`com.yf.coros.blecmd`, kế thừa từ app "WeLoop" cũ, được bọc trong lớp UI RN mới) |
| Native lib | `lib/arm64-v8a/*.so`: không có thư viện mã hoá/BLE riêng đáng chú ý ngoài `libcrypto.so` (OpenSSL chuẩn) và cặp `libzgrge*.so` (shell, không liên quan giao thức thiết bị). Chưa disassemble (không có Ghidra/IDA cấu hình trong `rea doctor`) |
| Giới hạn | **Không có thiết bị COROS thật, không có HCI snoop log.** Tài liệu này ở mức "kiến trúc suy luận từ tên lớp/hằng số còn đọc được", KHÔNG có byte-layout đã xác minh. Driver đi kèm cố tình chỉ triển khai phần an toàn (xem §8) |

**Quy ước:**
- **[V] Đã xác minh:** chuỗi/tên lớp tìm thấy trực tiếp dưới dạng chuỗi trong `classes.dex` của chính APK này (không phải suy luận), trích bằng `strings -n 6 classes.dex | grep …`. Vì không decompile được, đây **không phải** trích dẫn `file:line` như các vendor khác — là trích dẫn "chuỗi tồn tại trong binary".
- **[I] Suy luận:** chưa thấy trực tiếp, hoặc chỉ thấy tên không thấy ngữ nghĩa/logic, độ tin cậy ghi kèm.
- **[Ext] Kiến thức ngoài code:** lấy từ hiểu biết công khai (chuẩn Bluetooth SIG, Nordic Semiconductor UART/DFU service…), không kiểm chứng trong APK này.

Chi tiết phương pháp đầy đủ (lệnh `rea`, script Python phân tích header DEX, lệnh `strings`/`grep` để tái lập) nằm ở `docs/re-evidence/coros/00-methodology.md` để ai cũng chạy lại được.

---

## 1. Kiến trúc tổng thể (suy luận từ tên lớp — [I])

```
UI (React Native 0.77, "COROS" app mới — modules.json không có lib BLE nào)
  │  (các màn hình bind/pairing gọi xuống native qua TurboModule — chưa xác định tên module JSI)
  ▼
com.yf.smart.weloopx.module.device.*  (ViewModel kết nối: ConnectViewModel.connectBle, ConnectDeviceViewModel)
  │
  ▼
com.yf.lib.bluetooth.connector.*      (kết nối GATT, bonding, state machine khôi phục lỗi —
  │                                     gói con "recovery.domain.model": GattState, FailureClass,
  │                                     ManualRebindReason, ProbeResult… [V] tên lớp)
  ▼
com.yf.lib.bluetooth.protocol.*       (khung giao thức — version0 "legacy", version1, version2)
  │  protocol/version2/GattCallbackV2, YfBtProtocolV2, DeviceWriteScheduler,
  │  GattWriteRecoveryPolicy, transaction/syncdata/{HeaderSrc,ForceOverrideState} [V] tên lớp
  ├─► com.yf.lib.bluetooth.socket.*   ("BLE socket" — BLESocketCmd, BLESocketTransaction,
  │                                     BLEClientSocketProxy — lớp framing/transaction mức cao) [V]
  ├─► com.yf.lib.bluetooth.scanner.*  (BleAdvertisedData, ScannedDevice — parse gói quảng bá) [V]
  └─► com.yf.coros.blecmd.*           (lệnh LÀ Protobuf: BleCmdPb{MasterSend,SlaveAck,SlaveNotify},
                                        BleCmdDefPb$CMD_E (bảng mã lệnh, enum, KHÔNG đọc được giá trị),
                                        BleCmdPayloadPb (payload theo lệnh, vd HrSample,
                                        HrmBroadcastSwitch), BleSdkCommonPb (SdkErrorCode,
                                        ServerEnvironmentType)) [V] tên lớp/message, [I] layout thật

com.yf.smart.weloopx.module.partnersdk.*  (API "Partner BLE" CHÍNH THỨC, độc lập — xem §7)
com.yf.smart.weloopx.module.firmware.*    (FirmwareUpgradeBleRunner — OTA qua BLE, state machine
                                            riêng: preSync, startTransferFirmware, markFailed…) [V]
com.yf.smart.weloopx.module.livetrack.*   (BleLiveTrackDeviceController — gửi vị trí LiveTrack
                                            qua BLE khi đang tập) [V]
```

Bằng chứng chính (xem `docs/re-evidence/coros/ble-architecture-strings.md` để có đầy đủ danh sách lớp):
- [V] Có đúng 3 "thế hệ" giao thức: `com.yf.lib.bluetooth.protocol.version0` (exception `ErrorParamException`
  duy nhất còn sót — gần như không còn dùng), `version1` (`DeviceTransactionException`, `GattException`,
  `ErrorParamException`), `version2` (`GattCallbackV2`, `YfBtProtocolV2`, hàng trăm lớp `a0`..`z2` bị rút
  gọn tên — đang dùng cho thiết bị hiện tại, theo số lượng lớp áp đảo).
- [V] `com.yf.lib.bluetooth.protocol.cache.BtCacheDatabase` là **Room database cục bộ** lưu cache lệnh/
  dữ liệu BLE theo `deviceKey` (bảng `bt_cache`: `cmd`, `dataIndex`, `dataGroup`, `stopCode`,
  `receivedCmdBytes`, `receivedDataBytes`, `cacheTtlMs`…) — cho thấy giao thức có khái niệm "lệnh +
  nhóm dữ liệu trả về theo từng phần, có thể cache lại khi App bị kill giữa chừng".
- [I] App dùng chung tầng `com.yf.lib.bluetooth` này để nói chuyện với nhiều loại thiết bị: đồng hồ GPS
  chính (APEX/PACE/VERTIX…), dây đo nhịp tim rời (HR01/HR31/Heart Rate — khả năng cao dùng chuẩn
  GATT Heart Rate 0x180D/0x2A37 thay vì kênh riêng, xem §3), cảm biến tốc độ/nhịp đạp (Speed/Cadence),
  loa an toàn (SAFESOUND), mũ bảo hiểm (HELMET), pod GPS rời (POD). Enum
  `com.yf.lib.bluetooth.request.type.YfBtSportType`, `DeviceColor`, `WatchfaceType`… cho thấy tầng
  lệnh dùng chung cho tất cả model, phân biệt bằng `YfBtDeviceType` (model id).

---

## 2. Quét và nhận diện thiết bị

### 2.1 Tên quảng bá (danh sách model) [V]

Toàn bộ chuỗi sau tồn tại trực tiếp trong `classes.dex` (một cụm liên tiếp trong string pool, rất có
khả năng là bảng ánh xạ "tên quảng bá → `YfBtDeviceType`" dùng khi quét/nhận diện model). Danh sách đầy
đủ ở `docs/re-evidence/coros/device-names.md`; rút gọn:

```
COROS APEX, COROS APEX 2, COROS APEX 2 Pro, COROS APEX 42mm, COROS APEX 46mm, COROS APEX PRO, COROS APEXs
COROS PACE, COROS PACE 2, COROS PACE Pro (thấy trong dữ liệu mẫu nhúng, §2.3)
COROS VERTIX, COROS VERTIX 2, COROS VERTIX R, COROS VERTIX2
COROS DURA, COROS M1, COROS M1D, COROS M1D_4R9, COROS OMNI, COROS OMNI BLE
COROS HR01, COROS HR31, COROS Heart Rate        ← dây đo nhịp tim rời
COROS POD, COROS POD 2                          ← pod GPS rời
COROS Cadence, COROS Speed                      ← cảm biến đạp xe
COROS SAFESOUND-M/R/U(+ " BLE")                 ← loa an toàn xe đạp
COROS HELMET, COROS HELMET BLE                  ← mũ bảo hiểm thông minh
COROS B13, B15, B15D, B16, B17, B18, B19, B20, B21   ← có thể là model nội bộ/thử nghiệm
COROS BY01, FD01, FD02, FD03, FD05, HA05, HA06, HA07, HYDROP, LINX/LYNX, S501
```

- [V] Hằng `CONFIG_DEVICE_COROS_WATCH` và `COROS_COMMON` tồn tại cùng khu vực — có thể là nhóm/loại
  thiết bị dùng khi không khớp tên cụ thể.
- [I] Chưa xác nhận đây là **so khớp tiền tố tên quảng bá (advertised name)** hay chỉ là nhãn hiển
  thị UI/danh mục thiết bị hỗ trợ (vì không decompile được hàm quét thật). Tin cậy trung bình-cao vì các
  app WeLoop/COROS đời trước (cùng gốc `com.yf.*`, tư liệu công khai cộng đồng thể thao) đều lọc theo
  tên quảng bá bắt đầu bằng "COROS " hoặc tên model.

### 2.2 Company ID / manufacturer data

- Không tìm thấy mã company ID (Bluetooth SIG) nào được tham chiếu trong các chuỗi còn đọc được gần
  gói `bluetooth.scanner`. **Không khẳng định được** COROS có dùng Manufacturer Specific Data để lọc
  hay không (khác Garmin `0x0087` đã xác minh, Zepp xác nhận KHÔNG dùng). Coi là chưa xác định — driver
  không dựa vào manufacturer data.
- [V] `com/yf/lib/bluetooth/scanner/BleAdvertisedData.java` tồn tại với 2 lớp phụ `$a`/`$b` (parser nội
  bộ) — xác nhận app có tự parse gói quảng bá thô, không chỉ dùng `android.bluetooth.le.ScanFilter` của
  OS. `android/bluetooth/le/ScanFilter$Builder` cũng có mặt trong chuỗi → có khả năng dùng **cả hai**
  (OS ScanFilter sơ bộ + parse tay để tinh lọc), giống mô hình Zepp.

### 2.3 Dữ liệu mẫu nhúng trong app (gián tiếp, [I])

Một payload JSON mẫu (có vẻ dùng cho test/demo nội bộ, còn sót trong `classes.dex`) cho thấy hình dạng
bản ghi sức khoẻ hằng ngày mà app lưu sau khi đồng bộ:
```json
{"br":16,"createTime":"2024-10-26 12:09:13","dataSource":"COROS PACE Pro","deviceName":"COROS PACE Pro B74E22",
 "happenDay":20241026,"healthNote":"","hr":77,"hrRest":47,"hrvValue":28,"id":464370724216422401,
 "spo2":95,"stress":63,"stressLevel":3,"timestamp":1729913410,"timezone":32,"updateTime":"","userId":...}
```
→ xác nhận các chỉ số COROS đồng bộ về điện thoại gồm **nhịp thở (`br`), HR, resting HR, HRV, SpO2,
stress/stressLevel**, gắn theo "ngày" (`happenDay`) chứ không phải theo mẫu liên tục — khớp với mô hình
"bản tóm tắt theo ngày" các vendor khác cũng dùng (Zepp GDSP, Garmin MONITORING_B).

### 2.4 Bonding hệ điều hành [V]

- Chuỗi `ACTION_BOND_STATE_CHANGED device:` và `ACTION_BOND_STATE_CHANGED with no EXTRA_DEVICE` tồn
  tại trong `classes.dex` → app có đăng ký `BroadcastReceiver` lắng nghe
  `BluetoothDevice.ACTION_BOND_STATE_CHANGED`, tức **OS-level SMP bonding được dùng** (giống Garmin),
  khác Zepp (khoá ở tầng ứng dụng, không bond OS). [I] Thứ tự bond trước/sau handshake GATT không xác
  định được (không có log trình tự như Garmin).

---

## 3. Lớp truyền (transport) — UUID GATT

### 3.1 UUID chuẩn Bluetooth SIG dùng chung cho mọi thiết bị phụ kiện [V]

Danh sách UUID 16-bit sau nằm liền nhau trong string pool của `classes.dex` (rất giống một bảng hằng
UUID SIG dùng chung cho toàn bộ thư viện `com.yf.lib.bluetooth`, không riêng cho đồng hồ GPS):

| UUID | Vai trò chuẩn SIG |
|---|---|
| `00001800-…` / `00001801-…` | Generic Access / Generic Attribute |
| `00001805-…` | Current Time Service |
| `0000180a-…` | Device Information (model/serial/HW/FW/SW ở `2a24/2a25/2a27/2a26/2a28`, manufacturer `2a29`) |
| `0000180d-…` | Heart Rate Service |
| `0000180f-…` | Battery Service |
| `00002902-…` / `00002904-…` | Client Characteristic Config / Presentation Format |
| `00002a00-…` | Device Name |
| `00002a05-…` | Service Changed |
| `00002a19-…` | Battery Level |
| `00002a37-…` | Heart Rate Measurement |
| `00002a2b-…` | Current Time |

[I] Đây là bảng hằng "biết mọi UUID chuẩn" của thư viện BLE dùng chung (giống Garmin/Zepp đều có bảng
tương tự) — không chứng minh chính đồng hồ GPS chính (APEX/PACE/VERTIX) có bật các service này, chỉ
chứng minh **thư viện có khả năng đọc chúng khi thiết bị có** (nhiều khả năng dùng cho phụ kiện: dây đo
nhịp tim rời `COROS HR01/HR31` gần như chắc chắn expose `180D`/`2A37` chuẩn vì tên gọi "chuẩn thị
trường" của dòng dây đeo ngực rẻ tiền; đồng hồ GPS chính nhiều khả năng dùng kênh riêng `blecmd` cho
HR thời gian thực, giống Garmin/Zepp).

### 3.2 UUID tuỳ biến (custom) — bằng chứng chuỗi trực tiếp [V]

Ba họ UUID 128-bit sau xuất hiện dưới dạng chuỗi literal, cụm liền kề trong `classes.dex`:

```
00001530-1212-efde-1523-785feabcd123   ┐
00001531-1212-efde-1523-785feabcd123   ├ Nordic Semiconductor Legacy DFU service/control/packet [Ext]
00001532-1212-efde-1523-785feabcd123   ┘ (service/control point/packet — thứ tự chuẩn Nordic)

6E400001-B5A3-F393-E0A9-77656C6F6F70   ┐ "Nordic UART Service" (NUS) — biến thể hậu tố
6E400002-B5A3-F393-E0A9-77656C6F6F70   ├ tuỳ biến: 6 byte cuối `77 65 6C 6F 6F 70` = ASCII "weloop"
6E400003-B5A3-F393-E0A9-77656C6F6F70   ┘ (thương hiệu tiền thân của COROS) [V] giải mã ASCII, [I] vai trò TX/RX

6E400001-B5A3-F393-E0A9-77757C7F7F70   ┐ biến thể thứ hai, hậu tố `77 75 7C 7F 7F 70` — KHÔNG phải ASCII
6E400002-B5A3-F393-E0A9-77757C7F7F70   ├ sạch (có byte 0x7F/DEL) → có thể là hậu tố riêng cho dòng sản
6E400003-B5A3-F393-E0A9-77757C7F7F70   ┘ phẩm/thế hệ phần cứng khác. [I] chưa rõ ý nghĩa

6E400001-B5A3-F393-E0A9-E50E24DCCA9E   ┐ hậu tố CHUẨN của Nordic UART Service thật
6E400002-B5A3-F393-E0A9-E50E24DCCA9E   ├ (`6E400001-B5A3-F393-E0A9-E50E24DCCA9E` = NUS service UUID
6E400003-B5A3-F393-E0A9-E50E24DCCA9E   ┘ công khai của Nordic) [Ext] — có thể dùng cho model chạy SDK Nordic mặc định

ADF70001-6B99-45E9-98E6-DF67A4C3D291   ┐ họ UUID tuỳ biến thứ ba, không theo mẫu Nordic UART,
ADF70002-6B99-45E9-98E6-DF67A4C3D291   ├ 3 characteristic (giống mẫu service/control/data hoặc
ADF70003-6B99-45E9-98E6-DF67A4C3D291   ┘ service/write/notify) — vai trò từng char chưa xác định [I]
```

- [V] Toàn bộ 15 UUID trên được xác minh **tồn tại dưới dạng chuỗi trực tiếp** trong `classes.dex`
  (`docs/re-evidence/coros/uuid-strings.md`), các UUID theo mẫu `6E4000xx-B5A3-F393-E0A9-…` đứng liền
  kề theo nhóm 3-3-3 → gần như chắc chắn là 3 **phiên bản/model khác nhau của cùng một service transport**
  dạng "UART-over-BLE" (characteristic 1 = service, 2 = ghi/RX, 3 = notify/TX, hoặc hoán đổi — thứ tự
  chưa xác nhận [I]).
- [I] Giả thuyết hợp lý nhất: COROS build phần cứng BLE của họ trên module Nordic nRF, dùng dịch vụ UART
  tuỳ biến ("weloop" hậu tố — kế thừa từ thời công ty còn tên **WeLoop**, trước khi đổi thương hiệu
  thành COROS) làm kênh truyền chính cho Protobuf command (`com.yf.coros.blecmd.BleCmdPb`), và dịch vụ
  DFU Nordic chuẩn cho OTA firmware. Độ tin cậy: trung bình (khớp tên gói `com.yf.lib.bluetooth`,
  `WeLoopApplication` — tên lớp Application gốc vẫn còn là `com.yf.smart.weloopx.app.WeLoopApplication`
  [V] — và chuỗi ASCII "weloop" ẩn trong chính UUID, khó là trùng hợp ngẫu nhiên).
- [I] Chưa xác nhận UUID nào trong 3 họ trên thực sự **xuất hiện trong gói quảng bá BLE** (advertisement/
  scan response) hay chỉ lộ diện sau khi `connectGatt` + `discoverServices`. Driver coi đây là tín hiệu
  nhận diện tuỳ chọn (dùng `Advertisement.hasService()`, không bắt buộc).

### 3.3 MTU

Không tìm thấy giá trị MTU cụ thể app yêu cầu (`requestMtu(…)`) trong các chuỗi còn đọc được. [I] Dùng
giá trị mặc định an toàn (247, như Zepp) cho tới khi có log thật.

---

## 4. Trình tự kết nối — những gì suy luận được (không có log thật)

| # | Bước | Bằng chứng |
|---|---|---|
| 1 | Quét, lọc theo tên quảng bá "COROS …" (§2.1) và/hoặc UUID service tuỳ biến (§3.2) | [I], tên lớp `BleAdvertisedData`/`ScannedDevice` [V] |
| 2 | `connectGatt`, `createBond()` nếu chưa bond (`ACTION_BOND_STATE_CHANGED` lắng nghe) | [V] có lắng nghe bond state; [I] gọi `createBond` chủ động |
| 3 | `discoverServices`, dò `YfBtProtocolV2`/`GattCallbackV2` chọn phiên bản giao thức (version1 vs version2) | [V] tên lớp; [I] cơ chế chọn |
| 4 | Mở kênh truyền trên dịch vụ UART tuỳ biến (§3.2), đăng ký notify | [I] suy từ tên lớp `com.yf.lib.bluetooth.socket.BLESocketTransaction`, `GattCallbackV2$DeviceWriteScheduler` |
| 5 | Trao đổi lệnh Protobuf qua `BleCmdPb.MasterSend` (điện thoại → đồng hồ) / `SlaveAck`, `SlaveNotify` (đồng hồ → điện thoại) | [V] tên message protobuf; [I] layout byte thật của frame bọc ngoài protobuf |
| 6 | Đọc Device Information (`180A`) / Battery (`180F`) nếu đồng hồ expose (không chắc) | [I] |
| 7 | Đồng bộ dữ liệu (xem §6) | [I] kiến trúc; không có command ID cụ thể |

**Không có** bằng chứng về:
- Thứ tự bond trước/sau bước nào trong handshake giao thức (Garmin bond trước handshake GFDI; Zepp
  không bond OS mà tự mã hoá kênh — COROS chưa rõ thuộc nhóm nào dù có bằng chứng nghe bond state).
- Giá trị byte thật của bất kỳ lệnh nào trong `BleCmdDefPb$CMD_E` (enum command ID) — tên enum tồn tại
  nhưng **giá trị số nguyên của từng hằng không đọc được** từ chuỗi (enum Kotlin/Java biên dịch giá trị
  int vào bytecode, không phải string pool).
- Framing cụ thể ngoài protobuf (header độ dài, cờ fragment, CRC). Có hằng `CRC16_FIELD_NUMBER`,
  `CRC_FIELD_NUMBER`, `ACK_HEADER_SIZE`, `ACK_MIN_SIZE`, `ACK_SIZE`, `ACK_TYPE_OFFSET`,
  `ACK_OPS_OFFSET` [V] tên hằng tồn tại → xác nhận CÓ CRC và có cấu trúc ACK với offset cố định, nhưng
  **không đọc được giá trị số** của các offset/kích thước này.

---

## 5. Xác thực và mã hoá — những gì suy luận được

- [V] Có các hàm đặt tên rõ ràng về AES: `AES128Decode`, `AES128Encode`, `AES128PaddingDecode`,
  `AESEncryptDecrypt`, và chuỗi thuật toán `AES/GCM/NoPadding` (java `Cipher` transform string chuẩn) —
  xác nhận **có dùng AES**, và ít nhất một chế độ là **AES-GCM** (có xác thực, khác AES-ECB "trần" mà
  Zepp dùng). [I] Không rõ đây là mã hoá cho kênh BLE handshake, hay chỉ dùng cho lưu trữ cục bộ
  (ví dụ mã hoá cache `BtCacheDatabase`, hoặc token tài khoản) — không có bằng chứng nối trực tiếp các
  hàm AES này với luồng GATT.
- [V] Chuỗi lỗi `"aes error"` tồn tại gần các chuỗi liên quan tới shell/loader (`com.zgpgarg...`), nên
  **có khả năng cao đây là AES của chính lớp bảo vệ ứng dụng (shell), không phải của giao thức BLE**.
  Không nên quy kết AES128* này cho giao thức kết nối đồng hồ mà chưa có thêm bằng chứng.
- [V] `com.yf.smart.weloopx.module.partnersdk.data.model.BizPublicKey(s)`, `NetAuthRequest`,
  `NetRevokeRequest` — xác thực khoá công khai cho **Partner SDK** (§7), không phải cho kết nối BLE
  trực tiếp tới đồng hồ.
- **Không tìm thấy** bằng chứng về ECDH (khác Zepp), không tìm thấy chữ ký cloud bắt buộc để bind thiết
  bị khi kết nối BLE trực tiếp (khác Zepp §5.1 của tài liệu đó). Dựa trên bằng chứng OS bonding (§2.4),
  giả thuyết có khả năng cao nhất: **bảo mật dựa chủ yếu vào BLE link-layer encryption sau khi bond**
  (giống Garmin khi đã bond), còn lớp Protobuf phía trên chỉ framing/CRC, không mã hoá riêng. Độ tin
  cậy: trung bình, cần log HCI thật để xác nhận.
- [V] Có 4 lớp riêng biệt tên liên quan "auth" trong framework lệnh:
  `com.yf.lib.bluetooth.request.type.device.{YfBtAuth, YfBtAuthState, YfBtSystemBondAuth}` và
  `request.param.YfBtParamAuth` (xem `docs/re-evidence/coros/ble-architecture-strings.md`). Tên
  **`YfBtSystemBondAuth`** ghép rõ "System Bond" + "Auth" → củng cố thêm giả thuyết trên: có một bước
  xác nhận/đồng bộ trạng thái chạy trên kênh `blecmd` ngay sau khi OS hoàn tất SMP bonding, không phải
  một handshake mã hoá độc lập kiểu Zepp. Vẫn [I]: không có method body nên không biết bước này gửi/
  nhận byte gì, có bắt buộc hay chỉ thông báo.

---

## 6. Đồng bộ dữ liệu — kiến trúc suy luận, KHÔNG có command ID

### 6.1 Lớp Protobuf command (tầng BLE, không đọc được layout) [V]

- [V] `BleCmdPayloadPb` có ít nhất các kiểu payload: `HrSample`, `HrmBroadcastSwitch` — xác nhận có
  bản ghi HR rời rạc kiểu "mẫu" (sample) và một cờ "bật/tắt phát HR". Field names không đọc được
  (protobuf lite dùng bytecode, không string literal).
- [V] `BleCmdPb` hierarchy đầy đủ hơn so với lần phân tích trước (xem `docs/re-evidence/coros/ble-
  architecture-strings.md`): `MasterSend`, `MasterSendCmd`, `MasterSendOrBuilder`, `MasterSend$Builder`
  (phone→watch); `SlaveAck`, `SlaveAckCmd`, `SlaveNotifyCmd`, `SlaveNotify` (watch→phone). Hai sub-
  class `$a` và `$Builder` xác nhận đây là **protobuf-lite** (không phải full protobuf).
- [V] `BleCmdDefPb$CMD_E` và `CMD_E$a` — enum command ID; giá trị số int **không đọc được** từ string.
- [V] `CMD_FIELD_NUMBER`, `CMD_INVALID`, `CMD_INVALID_VALUE` — xác nhận có trường `cmd` trong proto
  message và một giá trị "invalid" dùng làm sentinel.
- [V] `SUPPORT_COMMON_PB_CMD` — tên hằng xác nhận app kiểm tra "thiết bị có hỗ trợ common PB cmd không"
  trước khi gửi, gợi ý có cơ chế capability negotiation.
- [V] `parseMasterSendSummary$lambda$0$0` — tên lambda/closure Kotlin tìm thấy trong string pool: app
  có hàm `parseMasterSendSummary` parse dữ liệu tổng hợp từ gói `MasterSend`, dùng coroutine lambda.

### 6.2 Các loại file/dữ liệu sync (SYN_FILE_TYPE) [V]

```
SYN_FILE_TYPE_DAILY_RECORD        → bản ghi sức khoẻ hàng ngày (steps, HR, SpO2, HRV, stress, sleep)
SYN_FILE_TYPE_SPORT               → dữ liệu buổi tập (workout file, nhiều khả năng là FIT)
SYN_FILE_TYPE_SYSINFO_RECORD      → thông tin hệ thống / device info
SYN_FILE_TYPE_SYSLOG_RECORD       → log hệ thống thiết bị
SYN_FILE_TYPE_VOICE_NOTE          → ghi âm giọng nói
SYN_FILE_TYPE_VOICE_NOTE_INDEX    → chỉ mục danh sách ghi âm
```
Mẫu tên `FOO` / `FOO_VALUE` là quy ước protobuf enum → đây là các enum trong `syn_info.proto` (xem §6.4).
Giá trị số int của `_VALUE` **không đọc được** (bytecode int, không phải string).

### 6.3 Luồng đồng bộ daily data — phân nhánh "old" vs "new" protocol [V]

Hai chuỗi log liên tiếp trong `classes.dex`:
```
getDailyData, onReadDataSuccess, is old protocol, onYfBtRequestStop
getDailyData, onReadDataSuccess, is new protocol! prepare to getDynamicHeartRate
```
→ **Phân nhánh rõ ràng** dựa trên version giao thức:
- **Old protocol**: sau `getDailyData` → dừng ngay (`onYfBtRequestStop`)
- **New protocol**: sau `getDailyData` → gọi tiếp `getDynamicHeartRate` (chi tiết HR từng sample)

Hàm sync riêng được xác nhận: `getDailyData`, `getSleepData`, `getHrvStatus`, `getHrvsCount`,
`getDynamicHeartRate`. Hàm `getStartTime` gợi ý request có tham số thời gian bắt đầu.
Lỗi: `getDailyData, onReadDataFail, yfBtStopCode = …` (enum `YfBtStopCode`).

### 6.4 Protobuf data schema — tên message xác nhận trong native lib [V]

Từ phân tích `libPbSource.so` (xem `docs/re-evidence/coros/native-lib-analysis.md`):

```
Giấc ngủ:    DailySleep, DailySleepAnalysisParam, DailySleepOverview, DailySleepOperation,
             SleepAnalysis, SleepSummary, DaySleepSummary, NewAlgoSleepSummary
HRV:         HrvInfo, HrvItem, PPGHrvInfo        (sample-level HRV — không chỉ daily)
Stress:      DailyStress, DailyStressUIInfo
HR:          DailyHrmInfo, DailyRhm              (daily resting heart rate)
Daily:       DailyInfo, DailyHappenDayInfo, DailySummaryInfo, DailyTimeItem, DailyTimeSegment
Sport:       SportSummaryPb, SportItemPb, SportLapPb, SportLapCacheInfo
Fitness:     FitnessBase, FitnessRunModel, FitnessCycle, FitnessIndexUI
Thời tiết:  WeatherAppCache (gửi từ điện thoại xuống đồng hồ)
Sync meta:   SynStatsBatteryDaily (thống kê pin theo ngày trong chuỗi sync)
```

Proto files biên dịch vào `libPbSource.so` và `libw4-jni.so` (xác nhận tồn tại): `CRSLDailySleep.proto`,
`CRSLDaily.proto`, `syn_info.proto`, `watch_settings.proto` / `watch_settings_v1.proto`,
`CRSLSportDataCommonPb.proto`, `CRSLTrackInfo.proto`, `recovery_hr.proto`, `sport_custom.proto`.

### 6.5 FIT / TCX và file transfer [V/I]

- [V] `CREATE_SPORT_DATA_FILE_TYPE_FIT`, `CREATE_SPORT_DATA_FILE_TYPE_TCX` — đồng hồ/app tạo được FIT
  và TCX cho buổi tập.
- [I] File FIT/TCX nhiều khả năng được tải qua `SYN_FILE_TYPE_SPORT` kiểu "file transfer" (request có
  `YfBtGetFileRequest`, `YfBtParamTraining`, `FileHeaderStruct`) giống mô hình Garmin GFDI, không phải
  tính toán lại trên điện thoại từ sample thô.

### 6.6 Packet frame và CRC [V tên hằng, I giá trị]

Các hằng xác nhận tồn tại nhưng giá trị số KHÔNG đọc được:
```
ACK_HEADER_SIZE   ACK_MIN_SIZE    ACK_SIZE
ACK_TYPE_OFFSET   ACK_OPS_OFFSET
PACTYP_CRC16      PACTYP_CRC32
```
`PACTYP_CRC16` / `PACTYP_CRC32` → trường "packet type" trong frame header phân biệt loại checksum
(giao thức hỗ trợ cả CRC16 lẫn CRC32 cho các loại packet khác nhau hoặc thiết bị khác nhau).

### 6.7 Thời gian (time sync) [I]

Không tìm thấy UUID `2A2B`/`Current Time` được dùng chủ động cho đồng hồ GPS. Có lớp `YfBtParamTime`
trong framework request → time sync đi qua lệnh Protobuf riêng trong `blecmd`, không qua GATT chuẩn.

### 6.8 Những gì vẫn chưa biết

- Giá trị số nguyên thực của `BleCmdDefPb$CMD_E` (command IDs)
- Giá trị thực của `ACK_HEADER_SIZE`, `ACK_TYPE_OFFSET`, `ACK_OPS_OFFSET`
- Thứ tự byte thực của frame bọc ngoài protobuf
- Cách phân biệt "old" vs "new" protocol tại tầng GATT (version byte? service khác? capability flag?)
- Giá trị số của `SYN_FILE_TYPE_*_VALUE` enum constants

---

## 7. Lựa chọn chính thức: "COROS Partner SDK" (AIDL, độc lập với BLE trực tiếp)

Phát hiện quan trọng: COROS có một **API đối tác chính thức** hoàn toàn tách biệt khỏi việc tự cài giao
thức BLE, tương tự Garmin Health SDK / Huawei Wear Engine / Zepp Side Service:

- [V] Service được export: `com.yf.smart.weloopx.module.partnersdk.ui.service.CRSPartnerBleService`,
  `intent-filter` action `com.coros.partner.ble.BIND_SERVICE` (`exported=true`).
- [V] Activity "wake" đi kèm: `CRSPartnerBleWakeActivity`, action `com.coros.partner.ble.WAKE_SERVICE`.
- [V] Giao diện AIDL: `com.coros.partner.ble.ICRSPartnerBleService`,
  `com.coros.partner.ble.ICRSPartnerBleCallback` (tên theo đúng quy ước AIDL `I*Service`/`I*Callback`
  của Android → đây là **service kiểu bind + AIDL**, không phải REST).
- [V] Có cơ chế cấp quyền bằng khoá công khai: `BizPublicKey(s)`, `BizPartnerSdkAuthorizedDevice`,
  `BizPartnerSdkGrantRecord`, `PartnerAuthRepo` (gọi API `NetAuthRequest`/`NetRevokeRequest` lên cloud
  COROS để xin cấp quyền), và `PartnerBleBridgeRepo` với các hàm `sendMasterCommand`/
  `executeMasterCommand` (bắc cầu lệnh `BleCmdPb.MasterSend` từ app đối tác, qua app COROS, xuống đồng
  hồ đã ghép đôi với app COROS).

**Ý nghĩa cho `unified_health_app`:** nếu người dùng đã ghép đôi đồng hồ với app COROS chính chủ, có
khả năng (chưa kiểm chứng, cần đăng ký đối tác với COROS hoặc dịch ngược thêm giao thức AIDL)
**không cần tự nói BLE trực tiếp với đồng hồ** — chỉ cần bind vào `ICRSPartnerBleService` của app COROS
đã cài trên máy và xin quyền qua tài khoản. Đây là con đường ít rủi ro nhất về mặt giao thức (COROS tự
duy trì phần BLE), nhưng **phụ thuộc app COROS luôn chạy và đồng hồ đã ghép đôi với nó trước**, và cần
xin quyền đối tác (không công khai rộng, giống Garmin Health SDK). Không triển khai trong driver đợt
này (ngoài phạm vi driver BLE trực tiếp); ghi nhận làm phương án B trong tương lai.

---

## 8. Khuyến nghị triển khai cho `driver/coros`

Vì **không có bằng chứng byte-level** (không có command ID, không có frame layout xác nhận, không có
chuỗi bước handshake xác nhận), driver tuân thủ nguyên tắc "không suy đoán byte" của
`wearable-driver-engineer.md`:

1. **Nhận diện (`recognize`)**: so khớp tiền tố tên quảng bá với danh sách model đã xác minh (§2.1,
   `COROS `, `VERTIX`, `APEX`…) cho điểm `NAME`; nếu gói quảng bá có 1 trong các UUID service tuỳ biến
   đã xác minh tồn tại trong code (§3.2) thì cho điểm `VENDOR_SERVICE` cao hơn. Không dùng manufacturer
   data (chưa có bằng chứng).
2. **Link**: yêu cầu bond OS (`LinkRequirements(bond = true)`) dựa trên bằng chứng
   `ACTION_BOND_STATE_CHANGED` (§2.4); MTU mặc định 247 (chưa xác nhận, §3.3). Đánh dấu **Tạm** trong
   `docs/DECISIONS.md`.
3. **`openSession`**: không có handshake/auth riêng để chạy (không đủ bằng chứng) — chỉ dùng
   `StandardGattReader` đọc Device Information (`180A`) + Battery (`180F`) nếu đồng hồ expose (an toàn,
   không đụng tới kênh riêng chưa rõ). Không bật `HISTORY_SYNC`/`LIVE_HEART_RATE` trong `capabilities`
   vì driver chưa thực sự lấy được dữ liệu đó — tránh hứa hẹn sai với UI.
4. **`sync`**: trả về 0 bản ghi ngay, báo `progress.report(1f)`. Có `TODO(coros-protocol)` trỏ về §6 của
   tài liệu này, chờ: (a) log HCI snoop khi app COROS chính chủ đồng bộ với đúng model đồng hồ của
   người dùng, hoặc (b) một bản APK COROS cũ hơn/không bị đóng gói để decompile đầy đủ tầng
   `com.yf.lib.bluetooth.protocol.version2` và `com.yf.coros.blecmd`.
5. **Không** triển khai Partner SDK AIDL (§7) trong đợt này — ghi nhận là hướng mở rộng tương lai, cần
   quyết định sản phẩm riêng (có đăng ký đối tác COROS hay không).

---

## 9. Câu hỏi còn mở (cần đồng hồ thật / HCI snoop log / bản APK không bị đóng gói)

| # | Câu hỏi | Vì sao chưa trả lời được |
|---|---|---|
| 1 | Giá trị byte thật của `BleCmdDefPb$CMD_E` (bảng mã lệnh) | Enum Kotlin/Java không lưu giá trị số dạng string; cần decompile method body hoặc `inspect-android-method` trên dex đã bóc gỡ |
| 2 | Layout frame bọc ngoài protobuf (header, cờ fragment, offset ACK thật — chỉ có TÊN hằng `ACK_HEADER_SIZE` v.v., không có giá trị) | Cần method body |
| 3 | UUID nào trong 3 họ UUID tuỳ biến (§3.2) thực sự được dùng cho model đồng hồ cụ thể, và char nào là RX/TX | Cần `discoverServices` thật trên đồng hồ, hoặc decompile `GattCallbackV2` |
| 4 | Thứ tự bond trước/sau handshake protocol | Không có log trình tự như Garmin `pj2/v.java:514` |
| 5 | AES128Encode/Decode có dùng cho kênh BLE hay chỉ cho shell bảo vệ ứng dụng / lưu trữ cục bộ | Không nối được lời gọi hàm (không có method body) |
| 6 | COROS có đăng ký company ID Bluetooth SIG riêng và dùng trong manufacturer data không | Không tìm thấy tham chiếu trong chuỗi còn đọc được |
| 7 | Thiết bị GPS chính (APEX/PACE/VERTIX) có expose chuẩn `180D`/`2A37` hay chỉ phụ kiện (HR01/HR31) mới có | Chỉ có bảng hằng UUID dùng chung, không có bằng chứng model nào bật service nào |
| 8 | Partner SDK AIDL (§7) có nhận app bên thứ ba không đăng ký chính thức không | Cần thử bind service thật + xem phản hồi lỗi |

**Bước kiểm chứng đề xuất (giống các tài liệu khác):** bật *Bluetooth HCI snoop log* trên điện thoại
Android, cài app COROS chính chủ, ghép đôi và đồng bộ với đúng model đồng hồ của bạn một lần, mở bằng
Wireshark. Lọc theo ATT handle của 3 họ UUID ở §3.2 để xác nhận: UUID nào thật sự dùng, ai ghi ai notify,
có mã hoá ở tầng ứng dụng hay không (xem ngẫu nhiên byte đầu tiên của mỗi gói ghi — nếu luôn đồng nhất
dạng `[flags][...]` dễ đoán thì khả năng cao chưa mã hoá; nếu byte đầu trông ngẫu nhiên thì có mã hoá).
Việc này sẽ chuyển phần lớn mục [I] ở trên thành [V] mà không cần bóc gỡ lớp bảo vệ ứng dụng.
