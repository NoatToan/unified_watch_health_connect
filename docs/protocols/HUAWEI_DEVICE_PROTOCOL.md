# Phân tích giao thức kết nối thiết bị đeo Huawei Health Android v17.0.7.310

Mục đích: interoperability. Người dùng sở hữu thiết bị Huawei và muốn tích hợp vào app Android riêng.

Nguồn phân tích:
- jadx decompile tại `jadx-out/sources` (mọi đường dẫn file trong báo cáo là tương đối với thư mục này).
- Manifest và permissions tại `rea-output/`.
- `libhichain_sdk_jni.so` chỉ xem strings, không RE sâu.

Quy ước độ tin cậy:
- [V] Verified: đọc trực tiếp trong code, có file:line.
- [I] Inferred: suy luận từ tên/log/cấu trúc.
- [?] Câu hỏi mở.

Ghi chú bảo mật: báo cáo cố ý KHÔNG trích xuất các hằng số bí mật (CAK, root-key material) nằm trong `HealthWhiteBoxManager` (white-box crypto). Chỉ mô tả cơ chế.

---

## 0. Tóm tắt nhanh

| Hạng mục | Kết quả | Nguồn |
|---|---|---|
| GATT service | 0000fe86-0000-1000-8000-00805f9b34fb | [V] `defpackage/cmj.java:15` |
| Write char | 0000fe01-... | [V] `cmj.java:16`, `cld.java:789` |
| Notify char | 0000fe02-... (CCCD 0x2902 enable notify) | [V] `cmj.java:17`, `cld.java:790-811` |
| BR/EDR SPP UUID | 82ff3820-8411-400c-b85a-55bdb32cf060 | [V] `cli.java:508-518` |
| Frame magic | byte 0x5A | [V] `coa.java:113,144` |
| CRC | CRC-16/XMODEM poly 0x1021 init 0x0000 | [V] `cov.java:8-22` |
| TLV length | varint base-128 big-endian, tag bit 0x80 = nested | [V] `cph.java:132-143` |
| Mã hóa payload | TLV 0x7C/0x7D/0x7E, AES-CBC/PKCS5 hoặc AES-GCM | [V] `cjy.java:151-278` |
| Xác thực | Legacy HMAC, HiChainLite (PIN+PBKDF2), HiChain/HiChain3 (native deviceauth) | [V] |
| Đường chính thống | WearEngine SDK + Health Connect | [V] |

---

## 1. Kiến trúc tổng quan

### 1.1 Các lớp từ trên xuống

Lớp UI / feature managers (process chính): các manager như `com.huawei.hwdevice.*`, `defpackage/lxw` (Fitness), `mro`/`mrj` (CommonFile), `ylj` (WearEngine P2P). Mỗi lệnh được gói thành `DeviceCommand{serviceID, commandID, dataContent, needAck, encrypt}` và gửi qua `lvb.e().c(...)` hoặc `mkf...sendDeviceData(...)`.

Lớp proxy binder: `defpackage/xgv` ("UniteDeviceServiceProxy") gọi sang service qua AIDL (`CommandMessageParcel`, `UniteDevice`, `ScanFilterParcel`) [I].

Lớp service: `com/huawei/devicesdk/service/DevicesManagementService.java` chạy ở process `:PhoneService`, `exported=false` [V manifest `AndroidManifest.xml:4677-4680`]. API chính:
- `scanDevice(int, List<ScanFilterParcel>, ScanCallback)` tại `:138`
- `pairDevice(UniteDevice, int)` tại `:174`
- `connectDevice(UniteDevice, boolean, int, DeviceHandshakeCallback)` tại `:189`
- `sendCommand(UniteDevice, CommandMessageParcel)` tại `:255`
- `registerDeviceFrameListener` / `setCharacteristicNotify` / `getDeviceList` / `unpairDevice`.
Interface đầy đủ ở `com/huawei/devicesdk/api/DevicesManagementInterface.java`.

Lớp chiến lược (strategy), chọn runtime:
- Scan: `ScanStrategyBle` (BLE), `defpackage/cob` = ScanStrategyBr (BR).
- Connect: `defpackage/cnx` = ConnectStrategyGeneral (đồng hồ/vòng tay), `defpackage/cnt` = ConnectStrategyScale (cân, mode SIMPLE), `defpackage/cnv` = ConnectStrategyTransparent.
- Send: `defpackage/cnz` = SendStrategyInitial5A (giao thức 0x5A cho watch/band), `defpackage/cog` = SendStrategyInitialD (giao thức "D" cho cân), `defpackage/coe` = Direct, `defpackage/coh` = Fragment.

Lớp đóng gói/mã hóa:
- `defpackage/cjy` = EncryptStrategyGeneral (AES + TLV 7C/7D/7E).
- `defpackage/coa` = DataParserInitial5A (đóng/mở frame 0x5A, slicing, CRC16).

Lớp vật lý (physical), chọn tại `cll.java:85-97` theo ConnectMode + deviceBtType:
- `defpackage/cld` = InoperableBlePhysicalService (GENERAL, btType=2, BLE GATT FE86/FE01/FE02).
- `defpackage/cli` = InoperableBrPhysicalService (GENERAL, btType=1, BR/EDR RFCOMM SPP).
- `defpackage/clk` = InoperableSmartWatchPhysicalService (GENERAL, btType=0, host Wear OS / "AW").
- `defpackage/clm` = OperableBlePhysicalService (SIMPLE, cân, service 0x181C).
- `defpackage/cln` = TransparentBlePhysicalService (TRANSPARENT).

Enum liên quan:
- `ConnectMode` = GENERAL(0)/SIMPLE(1)/TRANSPARENT(2) [V] `entity/ConnectMode.java:5-7`.
- `SendMode` = PROTOCOL_TYPE_5A(0)/D(1)/DIRECT(2)/FRAGMENT(3) [V] `entity/SendMode.java:5-8`.
- `deviceBtType`: 2 = BLE, 1 = BR classic, 0 = "AW" SmartWatch host [V suy từ `cll.java:85-97` và log "device bt type is AW" `ckv.java:49`].

Lớp legacy song song: `defpackage/lob` ("BTDeviceBLEService", cùng FE86/FE01/FE02 tại `lob.java:178-188`) và `ohos/ace/plugin/bluetoothplugin/BluetoothGattClient.java` (GATT generic cho plugin ArkUI/JS, có `requestMtu` tại `:229`). Không thuộc đường chính nhưng xác nhận cùng bộ UUID.

### 1.2 Trình tự kết nối (mô tả tuần tự)

1. App gọi `connectDevice(...)`. ConnectStrategy chọn PhysicalLayer theo mode/btType (`cll.java:85-97`).
2. BLE (`cld`): `connectGatt(ctx, false, cb, TRANSPORT_LE=2)` (`cld.java:283`). Sau `onConnectionStateChange` CONNECTED, gọi `discoverServices`.
3. `onServicesDiscovered`: lấy service FE86, characteristic FE01 (write) và FE02 (notify) (`cld.java:780-790`), bật notify bằng cách ghi `ENABLE_NOTIFICATION_VALUE` vào descriptor 0x2902 (`cld.java:800-811`).
4. Khi channel sẵn sàng, ConnectStrategy khởi động chuỗi handshake (`startHandshake`). Mỗi lệnh handshake tạo frame 0x5A, gửi qua FE01, nhận phản hồi qua FE02.
5. Chuỗi handshake chạy tuần tự theo `mNextCommand` (chi tiết mục 5). Khi tới lệnh auth, nếu thiết bị hỗ trợ HiChain thì chuyển sang module native `deviceauth`.
6. Sau handshake thành công (time sync, capability negotiation), `DeviceHandshakeCallback` báo connected. App bắt đầu gửi lệnh nghiệp vụ (service 7 fitness, v.v.).

---

## 2. Quét thiết bị (scanning)

### 2.1 ScanStrategyBle

File `com/huawei/devicesdk/strategy/ScanStrategyBle.java`:
- `startScan` dùng `BluetoothLeScanner.startScan(filters, settings, cb)` với **một ScanFilter rỗng** `new ScanFilter.Builder().build()` và `ScanSettings.Builder().setScanMode(2)` tức SCAN_MODE_LOW_LATENCY (`ScanStrategyBle.java:138-143`).
- Nghĩa là lọc không nằm ở tầng BLE OS mà ở tầng app: mọi thiết bị được chuyển lên rồi so khớp theo tên.

### 2.2 Lọc theo tên (DeviceDiscoveryProcessor)

File `defpackage/cjs.java` (DeviceDiscoveryProcessor):
- `scanResult` gọi callback cho từng device; bộ lọc `cmy` được so khớp trong `a(cmy, name)` tại `cjs.java:151-177`:
  - type 0 = match-all; type 1 = equals; type 2 = startsWith; type 3 = endsWith; type 4 = contains; type 5 = so khớp MAC address (`d(cmy, mac)` tại `:182-190`).
- Nếu BLE không có tên, lấy tên từ manufacturer/scan record qua `cmq.e().a(bArr)` (`cjs.java:123-126`).
- `ScanFilterParcel{type, matcher}` được build từ `cmy` tại `defpackage/xgv.java:405-418`.

Bảng tiền tố tên thiết bị: `defpackage/lvi.java` chứa hàng trăm chuỗi như "HUAWEI WATCH GT-", "HUAWEI Band 3 Pro-", "honor band A2" (`lvi.java:282,322,390,517`). Đây là tập prefix dùng để nhận diện thiết bị Huawei/Honor.

### 2.3 Scan BR và reconnect

- `defpackage/cob` = ScanStrategyBr (quét classic Bluetooth).
- Service `PeriodScanService` (`AndroidManifest.xml:4699`) phục vụ reconnect định kỳ, điều phối bởi `defpackage/cno` (ReconnectManager) và `defpackage/cnr` (BleReconnectManager).
- `cnr.java:249-250` tạo `ScanFilter.Builder().setDeviceAddress(mac)` để quét lại đúng thiết bị đã bind; `startScan` với scanMode truyền vào (`:283-308`), dùng `PendingIntent` + `AlarmManager` để lập lịch (`cnr.java:3-4,57,346`). Chu kỳ reconnect thấy ở `cno.java:294` (300000 ms) và `:311` (5000 ms).

---

## 3. Kết nối (GATT / BR / bonding)

### 3.1 BLE GATT (cld = InoperableBlePhysicalService)

UUID (hằng số ở `defpackage/cmj.java`):
- Service: `0000fe86-0000-1000-8000-00805f9b34fb` (`cmj.java:15`).
- FE01 = `0000fe01-...` dùng cho write (`cmj.java:16`, gán `this.q` tại `cld.java:789`).
- FE02 = `0000fe02-...` dùng cho notify (`cmj.java:17`, gán `this.o` tại `cld.java:790`).
- CCCD descriptor = `cmj.f1778c` = BleConstants.CLIENT_CHARACTERISTIC_CONFIG_DESCRIPTOR_UUID = 0x2902 (`cmj.java:11`).
- Ngoài ra `0000181c-...` (service cân, `cmj.java:8`), `00001805-...` (Current Time, `cmj.java:14`).

Kết nối:
- `connectGatt(BaseApplication.b(), false, cb, 2)` với transport = LE (`cld.java:283`); nếu null thì thử lại (`:287-288`).
- Service discovery có retry; nếu không thấy service thì gửi message discover lại sau 1000 ms (`cld.java:751-770`).
- Bật notify: `setCharacteristicNotification(FE02, true)` rồi ghi `ENABLE_NOTIFICATION_VALUE` vào descriptor 0x2902 (`cld.java:799-811`).
- Ghi dữ liệu: `characteristic.setValue(bytes); gatt.writeCharacteristic(FE01)` với lock + chờ ack, timeout `ProfileExtendConstants.TIME_OUT = 1500` ms (`cld.java:405-440`, `com/huawei/profile/profile/ProfileExtendConstants.java:23`).

MTU:
- KHÔNG thấy `requestMtu` trong lớp physical chính (`cld`/`cli`/`clm`). MTU hiệu dụng được lấy từ thiết bị qua Link Parameter (TLV type 2/8/15, mục 5) và lưu trong `cml` (maxFrame/singleFrame), rồi dùng trong `coa` để cắt frame. `requestMtu` chỉ xuất hiện ở plugin generic `BluetoothGattClient.java:229` (không dùng cho watch) [V].
- Tức là chiến lược: không đàm phán MTU ATT, mà đàm phán kích thước frame ở tầng ứng dụng qua Link Param.

### 3.2 BR/EDR SPP (cli = InoperableBrPhysicalService)

- RFCOMM SPP qua `createRfcommSocketToServiceRecord(UUID)` (`cli.java:517`).
- UUID chính: `82ff3820-8411-400c-b85a-55bdb32cf060` (`cli.java:508,515`); nếu là emulator thì `00001101-0000-1000-8000-00805F9B34FB` (SPP chuẩn) (`cli.java:513`).
- Có fallback reflection `createRfcommSocket(channel)` tại `cli.java:688`.

### 3.3 SmartWatch host (clk)

- `clk` = InoperableSmartWatchPhysicalService dùng cho thiết bị btType=0 (Wear OS / "AW"), đi qua `SmartWatchHostPhysicalService` (`AndroidManifest.xml:4690`) và data-layer của Google (`BtDeviceAwHostService` lắng nghe `com.google.android.gms.wearable.*`, `AndroidManifest.xml:4681-4689`).

### 3.4 Bonding

- `pairDevice` / `createSystemBond` tại `DevicesManagementService.java:174-191`.
- Trong Link Negotiation, nếu phát hiện key-miss (bondState 12 nhưng device báo cần re-pair) thì gọi `physicalLayerBase.unPairDevice(...)` để gỡ bond rồi bond lại (`ckv.java:101-120`).
- Bonding BLE OS là tùy chọn; phần lớn bảo mật nằm ở tầng app (HiChain / HMAC), không phụ thuộc Just Works pairing.

---

## 4. Định dạng frame (giao thức 0x5A)

File chính: `defpackage/coa.java` (DataParserInitial5A), CRC: `defpackage/cov.java`, helper byte/TLV: `defpackage/cph.java`, `defpackage/cqe.java`.

### 4.1 Frame đơn (không slice)

Dựng tại `coa.java:104-121` (`d(int,byte[],ArrayList)`):

```
offset 0      : 0x5A                      (magic)
offset 1..2   : length = len(payload)+1   (2 byte, big-endian, qua cph.d(cph.d(n)))
offset 3      : 0x00                       (flag = single frame / no-slice)
offset 4..    : payload = serviceId|commandId|TLV...
cuối (2 byte) : CRC16 (big-endian) tính trên [0x5A | len | flag | payload]
```

Điều kiện dùng frame đơn: `payload.length + 6 <= maxFrame` (`coa.java:62-66`).

### 4.2 Frame có slice (payload lớn hơn MTU)

Dựng tại `coa.java:123-160` (`a(int,byte[],ArrayList)`), mỗi mảnh:

```
offset 0      : 0x5A
offset 1..2   : length = sliceLen + 2 (big-endian)
offset 3      : slice flag: 0x01 = mảnh đầu, 0x02 = giữa, 0x03 = cuối
offset 4      : slice index (byte, (byte) i)
offset 5..    : slice payload
cuối (2 byte) : CRC16
```

Kích thước slice tối đa = `maxFrame - 7` (`coa.java:127`). Ghép lại (reassembly) ở phía nhận trong `coa.java:200-520` (`spliceMTUPackage`, `dealMultiPackage`, `parseResponsePacket`), dựa vào magic 0x5A, length và slice flag.

### 4.3 CRC16

File `defpackage/cov.java:8-22`:
- Bảng tra 256 phần tử, thuật toán: `s = (s << 8) ^ table[(b ^ (s >> 8)) & 0xFF]`, khởi tạo `s = 0`.
- Bảng bắt đầu `{0, 4129, 8258, 12387, ...}` tức 0x1021, 0x2042, 0x3063 -> đây là **CRC-16/XMODEM (CCITT false family)**: polynomial 0x1021, init 0x0000, không reflect input/output, không xorout. Kết quả 2 byte, big-endian (`bArr2[0]=s>>8; bArr2[1]=s`).

### 4.4 Payload serviceId/commandId + TLV

- Byte 0 = serviceId, byte 1 = commandId (thấy khắp nơi: `setServiceID`/`setCommandID`, và parse ở `coa.java:732-746`).
- Sau đó là danh sách TLV. Mã hóa length (`cph.java:132-143`):
  - `< 128`: 1 byte `(len & 0x7F)`.
  - `< 16384`: 2 byte `((len>>7)&0x7F)|0x80, len&0x7F`.
  - `< 2097152`: 3 byte (varint base-128 big-endian, bit cao 0x80 = "còn byte tiếp").
- Tag: giá trị >= 0x80 (ví dụ 129 = 0x81) biểu thị TLV lồng (nested/father), parse trong `cqe.java` (`a(...)` dùng mask `& 127`, `cqe.java:92,120`) và `cqb`/`cqa` (father/child TLV). Thấy rõ ở payload fitness: `eeq.d(129)` mở TLV cha (`lxp.java:181,187,197`).
- Helper `eeq.d(n)` = 1 byte hex, `eeq.c(str)` = hexString -> byte[], `eeq.e(n)`/`cph.e(n)` = length varint. TLV được build như chuỗi hex rồi convert.

### 4.5 SendMode / SendStrategy / slice-at-send / retry / priority

- `SendStrategy` (abstract) `getSendFrames(cmg, DeviceInfo)` + `parseReceiveFrames(...)` (`strategy/SendStrategy.java`).
- `cnz` (SendStrategyInitial5A): nếu `cmg.k()` (needEncrypt) và thiết bị cần mã hóa thì gọi `cjy.a(...)` để mã hóa trước khi cắt frame (`cnz.java:73-80`); sau đó `coa.d(payload)` cắt thành frames và `coa.a(frame)` cắt tiếp theo `singleFrame` (TX unit) thành các `cmb` (`cnz.java:81-95`, `coa.java:70-101`). Có 2 mức cắt: mức frame 5A (`maxFrame`) và mức ghi BLE (`singleFrame`/`j`).
- Resend: `CommandTimerTask` (`strategy/CommandTimerTask.java`) với `MAX` resend, `HandshakeGeneralCommandBase.MAX_RESEND_NUM = 3` (`connect/handshake/HandshakeGeneralCommandBase.java:12`).
- Priority / slow command: `connect/retry/CommandPriorAdapter.java` (map ưu tiên, file transfer type 2/6 ưu tiên cao `:20-22`), `connect/retry/CommandSlowManager.java` (COMMAND_DELAY=500ms, PACKAGE_INTERVAL=20ms `:44-47`).
- `needAck`: `cmg.d` mặc định true (`cmg.java:18`); ack điều khiển resend.

---

## 5. Trình tự handshake

Mỗi lệnh kế thừa `HandshakeCommandBase` (`getDeviceCommand` dựng frame, `processReceivedData` xử lý phản hồi, trả `cmh` với mã trạng thái, `mNextCommand` là lệnh tiếp theo). Base:
- `HandshakeGeneralCommandBase`: dùng `SendMode.PROTOCOL_TYPE_5A`, header `cmg.b().d(3)` (`connect/handshake/HandshakeGeneralCommandBase.java:16-47`). `getUnencryptedDeviceCommand` đặt encrypt=false.
- `HandshakeSimpleCommandBase`: dùng cho cân, `SendMode.PROTOCOL_TYPE_D`, service UUID `0000181c-...`, write + dataHead DB/DC/BD/CD (`connect/handshake/HandshakeSimpleCommandBase.java:16-66`).

`getTag()` trả chuỗi 4 hex = serviceId(2) + commandId(2). Hàm `cku.d(tag)` log "ServiceID=.., CommandId=.." (`cku.java:339-344`), xác nhận cách đọc tag.

### 5.1 Chuỗi lệnh (service 0x01 = DeviceConfig) theo thứ tự thực thi

Dựa vào `getTag()` và `mNextCommand`:

| Thứ tự | Lớp | Tag (svc.cmd) | Tên (từ log) | Ghi chú |
|---|---|---|---|---|
| 1 | `ckv` | 0101 | LinkNegotiationCommand (Link Param) | TLV type 1..17; lấy MTU/interval/randA/authVersion |
| 2 | `ckr` (ext `ckt`) | 0116 | QueryAvailableCommand | hỏi device available; nhánh tới cke/HiChain |
| - | `cke` | (helper) | DealWithHiChain | chọn HiChain / HiChainLite / legacy |
| 3a | `ckx` | 0133 | SecurityNegotiationCommand | đàm phán chế độ auth (1/2/4), gửi phone info |
| 3b | `ckp` | 012C | GetDevicePinCodeCommand (5.1.44) | lấy/giải mã PIN |
| 3c | `ckd` | 0113 | AccessValidityAuthCommand (5.1.19) | challenge-response HMAC token |
| 3d | `ckc` | 010E | BindRequestCommand (5.1.14) | bind, trao đổi key material |
| 3e | `cla` | 010F | QueryBtBindStatusCommand (5.1.15) | |
| 3f | `clb` | 012D | UpdateDeviceKeyCommand (5.1.45) | cập nhật secret key |
| 4 | `ckq` | 0107 | GetDeviceVersionCommand | lấy version/capability bitmap |
| 5 | `ckz` | 0105 | SetDeviceDateAndTimeCommand | time sync (TLV 1=time, 2=zone) |
| 6 | `ckw` | 0132 | SetDeviceTimeZoneIdCommand | tz id |
| 7 | `ckn` | 0102 | DeviceServiceCapabilityConsultCommand | đàm phán service được hỗ trợ |
| 8 | `cki` | 0103 | DeviceCommandCapabilityConsultCommand | đàm phán command per-service |
| - | `cks` | 0128 | HiChainDataTransmitCommand (5.1.40) | kênh truyền dữ liệu HiChain |
| - | `ckh` | (0101 family) | DeviceAvailableNotifyCommand | |
| - | `ckj` | 0137 | DeviceExpandCapabilitySimpleCommand | |
| - | `cko` | 0112 | DeviceSupportActivityTypeCommand | |
| - | `ckk/ckl` | 013C | DeviceCreateDualChannelCommand | tạo kênh thứ 2 (BR) |

Các lệnh cân (HandshakeSimpleCommandBase): `cky` 40101 RequestAuthenticCommand, `ckf` 40102 AccessAuthenticCommand, `ckm` 40103 EncryptNegotiationCommand (chuỗi `cky -> ckf -> ckm -> ckj`).

### 5.2 Chi tiết Link Negotiation (ckv, tag 0101)

`ckv.java:25-61` (`getDeviceCommand`): payload bắt đầu `0x01 0x01` rồi các cặp `(type, len=0)` yêu cầu: type 1,2,3,4 (và type 16 nếu không phải demo phone). Đây là request các tham số link.

`ckv.java:148-256` (`a(byte[], DeviceInfo)`) parse TLV phản hồi vào `cml` (DeviceLinkParameter):
- type 1 -> `cml.a()` (bondState/ability)
- type 2 -> `cml.f()` = maxFrame (c = max transmission) [V `coa.java:51` dùng `cml.c()`]
- type 3 -> `cml.h()` = singleFrame (i)
- type 4 -> `cml.g()` = interval (d)
- type 5 -> `d(cqa,cml)`: 36 hex = 4 hex authVersion + 32 hex randA (`ckv.java:258-267`)
- type 15 -> singleFrameDevice (`cml.i()`)
- type 7,8,9,12,17 -> các cờ khác (`ckv.java:211-237`)

`cml` getter/setter tại `defpackage/cml.java:26-124` (c=maxFrame, d=interval, h=singleFrame, i=singleFrameDevice, b=authVersion, g=randA, j=encType...). Lưu vào cache `cnk` theo MAC (`ckv.java:92`).

### 5.3 Thời gian (cku)

`cku.c()` dựng payload time: TLV type 1 len 4 = epoch seconds (big-endian), TLV type 2 len 2 = zone offset (giờ<<8 + phút, bù 128 cho âm) (`cku.java:154-204`).

---

## 6. Xác thực và mã hóa

Có 3 cơ chế, chọn trong `cke.d(...)` và `ckx` dựa vào capability device:

### 6.1 Legacy HMAC challenge-response (CAK nhúng app)

- Dùng khi device KHÔNG hỗ trợ HiChain (`cke.java:44-83`).
- randA (từ device, TLV type 5), randB (phone sinh ngẫu nhiên 16 byte `ckg.b(16)`, `cke.java:85-96`).
- Token = HMAC-SHA256 hai lớp trên `CAK || "0100"` với key = randA||randB (16+16=32 byte): `cku.c(cml, randB, "0100")` tại `cku.java:231-257`, dùng `ckg.c(data,key)` = HmacSHA256 (`ckg.java` dòng ~160, "HmacSHA256").
- CAK ("secret key") lấy từ `cku.a(authVersion)` (`cku.java:259-283`): version 1/2 ghép chuỗi từ `HealthWhiteBoxManager.c(...).c(1,n)` (white-box), version 3 còn AES giải mã thêm. KHÔNG trích dẫn giá trị tại đây theo ghi chú bảo mật.
- `ckd` (0113, AccessValidityAuth) gửi token, nhận lại token của device và so khớp (`ckd.java:34-43, 153-174`). Dùng `AgdConstant.INSTALL_TYPE_AUTO = "0110"` làm nhãn trong HMAC (`ckd.java:159,164`, `com/huawei/appgallery/agd/api/AgdConstant.java:5`).

### 6.2 HiChainLite (PIN + PBKDF2)

- Dùng khi `cni.b(mac)` true. Util `defpackage/cni.java` ("HiChainLiteCommandUtil"):
  - `getPbkToken` (`cni.java:70-88`): `SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(pin.toCharArray(), mac.getBytes("utf-8"), 1000, 256))` -> dẫn xuất khóa 256-bit từ PIN, salt = deviceMac, 1000 vòng lặp.
  - Fallback nếu không có PBKDF2: HMAC-SHA256 (`b(...)` tại `:90-94`, `d(str,str2)` tại `:96-109` dùng `ckg.c`).
  - `e(key, idx, randSuffix, mac)` (`cni.java:128-143`): tính Kn = HMAC(mac, derivedKey) rồi HMAC lồng với CAK XOR SHA256(PIN per-device); lưu secretKey per-device (`cnh.d().e(...)`).
- PIN: hiển thị trên màn hình watch, nhập ở app. `GetDevicePinCodeCommand` (ckp, 012C) lấy PIN đã mã hóa từ device, giải mã trong `cnc.c(data, CAK, mac)` (`cnc.java:158-188`): TLV type 1 = plain, type 2 = encrypted PIN giải bằng AES-GCM hoặc AES-CBC/PKCS5 với key = CAK, IV trong TLV type 2.
- secretKey lưu qua `cpv` (SharePreferenceUtil) với KeyStore (AES/CBC/PKCS7, `cqo.java:55`), các key SharedPreferences: `share_preference_order_one/two`, `btsdk_sharedpreferences_identify_key`, `..._bindid`, `..._update_key_label` (`cpv.java:17-115`).

### 6.3 HiChain / HiChain3 (OpenHarmony deviceauth, native)

- Hỗ trợ khi `cnc.b(type)` (type 3/1, `cnc.java:16-18`) hoặc `cmz.c(type)` (type 4 = HiChain3, `cmz.java:9`). Kiểm tra `cnc.d()` yêu cầu EMUI >= 25 và không phải g() (`cnc.java:46-48`).
- `ckx` (0133 SecurityNegotiation) sau khi nhận 100000 gọi `HiChainAuthManager.c(mac, cml)` -> trả về command HiChain (`ckx.java:214-232`).
- `com/huawei/devicesdk/hichain/HiChainClient.java`: dùng API `com.huawei.security.deviceauth.HwDeviceAuthManager` (`HiChainClient.java:5-10`):
  - `OperationParameter`/`UserInfo` với `setServiceType("HwSmartWatch")`, group "HwSmartWatchGroup" (`HiChainClient.java:51-66, 350`).
  - `authenticatePeer` (first/second auth, `:215-268`), `bindPeer(params, pin, 32)` khi auth đầu thất bại -> bind bằng PIN (`:333-345`).
  - `registerGroup`/`addTrustedDevice` qua reflection (`:350-392`).
  - Callback `onSessionKeyReturned(sessionId, byte[] key)` nhận session key, `onTransmit`/`onReceiveRequest` để chuyển TLV HiChain qua lệnh `cks` (0128 HiChainDataTransmitCommand) (`HiChainClient.java:143-172`, `cks.java:46-60`).
- HiChain3: `defpackage/cnd.java` ("HiChain3GroupManager") dùng `ohos.security.deviceauth.sdk.DeviceAuthCallback` + JSON params: `groupType=256`, `deviceId`, `userType=0`, `groupVisibility=-1`, `isClient`, `pinCode` (`cnd.java:463-523`). Native binding `ohos/security/deviceauth/sdk/NativeDas.java`: `System.loadLibrary("hichain_sdk_jni")` (`NativeDas.java:44`), methods `authDevice`, `bindPeer`, `createGroup`, `addMemberToGroup`, `processData`...
- Native lib strings (từ `libhichain_sdk_jni.so`): `hichain_iso_exchange`, `hichain_iso_session_key`, `mbedtls_gcm_*`, `mbedtls_hkdf`, `sha256`, "Create client bind session", "process client authSession". -> HiChain dùng giao thức ISO (STS-like / SPEKE-PAKE) qua mbedTLS, key derivation bằng HKDF, mã hóa phiên bằng AES-GCM. Đây là PAKE dựa PIN (bind) + đối xứng (auth lần sau). [I từ strings, không RE sâu]

### 6.4 Mã hóa payload lệnh nghiệp vụ (cjy = EncryptStrategyGeneral)

File `defpackage/cjy.java`:
- Khi gửi, `a(cmg, mac, authVersion)` (`cjy.java:80-123`): tách serviceId+commandId (2 byte đầu, giữ nguyên), mã hóa phần còn lại.
- Thuật toán (`a(data, iv, mac, ver)` tại `:183-199`): nếu HiChain3 hoặc `cml.e()==1` thì **AES/GCM/NoPadding** (tag 128-bit), ngược lại **AES/CBC/PKCS5Padding**. IV = 16 byte random (`e()` = `ckg.b(16)`), có counter nhúng 4 byte cuối IV (`cjy.java:93-112`).
- Khóa làm việc (work key) lấy theo cơ chế auth (`b(mac, ver)` tại `:649-660`):
  - HiChain: `HiChainAuthManager.e().d(mac)` (session key).
  - HiChainLite: `cni.a(mac)`.
  - HiChain3: `cnd.a().e(mac)`.
  - Legacy: `c(mac, ver)` dẫn xuất từ work key lưu trong SharedPreferences (giải bằng AES-CBC, root-key từ white-box `cqh.c(1,n)` XOR/SHA256, `cjy.java:280-321, 373-386`).
- Frame đã mã hóa được gói lại dưới dạng 3 TLV (`cjy.java:151-161, 256-278`):
  - tag 0x7C (124), len 1, value 0x01 = "đã mã hóa".
  - tag 0x7D (125), len, value = IV (16 byte).
  - tag 0x7E (126), len, value = ciphertext.
  - Khi giải mã (`a(bytes, mac, ver)` tại `:573-647`), parse 3 TLV này (`cql` whitelist {124,125,126}) và giải AES-GCM/CBC tương ứng.
- Chỉ phần payload sau serviceId+commandId được mã hóa; 2 byte đầu (service/command) ở dạng rõ.
- Lệnh cân (ScaleEncryptStrategy `defpackage/cjz`, EncryptBase) dùng **AES/CTR/NoPadding**, IV 16 byte prepend ciphertext (`cjz.java:24-71`), root key dẫn xuất từ MAC + white-box.

### 6.5 Thuật toán crypto (ckg = EncryptUtil)

`defpackage/ckg.java`:
- AES-CBC/CTR: `d(alg, data, key, iv)` encrypt, `a(...)` decrypt (`:25-87`).
- AES-GCM (128-bit tag): `e(...)` encrypt, `b(...)` decrypt (`:89-150`).
- `b(16)` = KeyGenerator AES sinh 16 byte random (dùng làm IV/nonce/randB).
- `c(key, data)` = HmacSHA256 (`:160`).
- `d(data)` = SHA-256 lấy 16 byte đầu (`:191`).

---

## 7. Đồng bộ dữ liệu sức khỏe

### 7.1 Service IDs chính (histogram usage)

Số lần `setServiceID(n)` xuất hiện (ước lượng mức dùng):
- 7 (Fitness/health core, 64), 1 (DeviceConfig/handshake, 31), 23 (Workout/HR, 26), 39 (WatchFace, 23), 27 (Pay, 23), 10 (Sleep/DFX file, 20), 9 (OTA, 18), 37 (Music, 17), 2 (Notify, 14), 28 (FileService, 13), 15 (Weather, 11), 50 (Menstrual, 10), 8 (Alarm, 9), 40 (CommonFile report, 9), 26 (Wearable mgr, 9), 22 (ExerciseAdvice, 9), 35 (RRI, 8), 29 (MultiSim, 8), 44 (CommonFile request, 7), 24 (GPS location, 7), 43, 46, 32 (Stress), 31, 53/52 (WearEngine), 3, 12...

### 7.2 Service 7 (Fitness) – bước/HR/sleep/SpO2

File chính: `defpackage/lxw.java` (FitnessSendCommandUtil), payload builder `defpackage/lxp.java`:
- cmd 1 setMotionGoal (`lxw.java:25-26`)
- cmd 2 setUserInfo / queryStudentInfo (`:56,77`)
- cmd 3 getTodayTotal (bước/calo hôm nay), payload TLV `01 01 | 02 00` qua `lxp.d()` (`lxw.java:96-97`, `lxp.java:163-165`)
- cmd 4 getHealthDataByFrameCount(start,end) – đếm số frame dữ liệu trong khoảng thời gian; payload TLV type1=1, type3=start(4B), type4=end(4B) (`lxw.java:112-113`, `lxp.java:167-178`)
- cmd 5 getHealthDataByFrameCompressed(index) (`lxw.java:127-128`, `lxp.java:180-182`)
- cmd 8 getHealthDataByFrame(index) (`lxw.java:142-143`)
- cmd 10 getSampleFrameCount(start,end) / cmd 11 getSampleFrame(index) – dữ liệu mẫu (HR/SpO2 liên tục) (`lxw.java:157-170`)
- cmd 12 getStatusFrameCount / cmd 13 getStatusFrame (`lxw.java:184-197`)
- cmd 14 setDeviceReportThreshold, cmd 16 setCloudSummaryEnable, cmd 19 setHeartZoneConfig (`lxw.java:211-251`)
- cmd 21 (query), cmd 24 setSleepState, cmd 25/26 remind, cmd 31/32 getDesFrameCount/getDesFrame (dữ liệu nén), cmd 33 heartZone, cmd 40 runPaceConfig (`lxw.java:271-520`)
- Các switch: continuous HR enable, SpO2 cycle enable, core sleep enable (`lxw.java:320-438`) – đây là cách bật đo liên tục HR/SpO2/sleep.

Mẫu truy vấn dữ liệu lịch sử: gửi "count" command (cmd 4/10/12/31) để biết tổng số frame, rồi lặp gửi "get frame by index" (cmd 5/8/11/13/32) để tải từng frame. [V]

Aw70 variants: `defpackage/mpl`, `mps`, `lyv`, `myn` (FitnessSendCommandAw70Util / HwBasicDataCommandUtil) cho thiết bị đời mới.

### 7.3 Service 23 (Workout/HR nâng cao)

`com/huawei/hwdevice/phoneprocess/mgr/exercise/utils/HwExerciseCommandUtil.java`, `HwWorkoutServiceAw70Manager.java`, `HwHeartRateManager.java` (cmd 15/18). Dữ liệu tập luyện chi tiết.

### 7.4 Truyền file lớn (Service 28/40/44 – CommonFile, Service 10 – Sleep/DFX)

Hai thế hệ cơ chế file transfer:
- Service 28 (FileService): `defpackage/mnz` (FileServiceUtil), `mnx` (consult), `moa` (application). cmd 1 consult, 2/3 info, 4/5 transfer.
- Service 44 (CommonFile request, watch->phone) + Service 40 (CommonFile report, phone->watch): `defpackage/mrj` (CommonFileRequestManager), `mro` (HwCommonFileMgr), `mrs` (command utils).
  - Protocol sections (từ log): 5.44.1 handleRequest, 5.44.2 handleRequestHash, 5.44.3 handleConsult (fileId, psnMax=packet số lớn nhất), 5.44.5 handleDeviceDataReceived (nhận data theo packet), 5.44.6 status report, 5.44.7 notice (`mrj.java`, `mro.java`).
  - cmd 2 fileCheck TLV `01 01 <fileId> | 02 01 <x>` (`mrj.java:883-895`), cmd 3 requestParameter (`mrj.java:959-969`).
  - fileType/fileName/hash để chọn file; packet-based với số thứ tự (psn). Dùng cho đồng bộ dữ liệu lớn (sleep detail, DFX log, GPS track).
- Service 10 (Sleep/DFX file): `defpackage/moe`, `mnr`, `mjg`, `lws` – sections 5.10.2 maintenance params, 5.10.3 query file info, 5.10.4 transfer (`log strings`).

### 7.5 Service khác

Service 9 OTA (`mbc` HwOtaV2Mgr), 37 Music (`lzl`), 39 WatchFace (`mbz`), 27 Pay (HwPayManager), 24 GPS (`mvx`), 50 Menstrual (`mwt`), 32 Stress (`myh`), 35 RRI (`mxd`), 2 Notify (`ncl`), 8 Alarm (`lvv`), 15 Weather (`nee`).

### 7.6 Health Connect (xuất dữ liệu sang hệ sinh thái Android)

- App có `androidx.health.connect.client` (`androidx/health/connect/client/HealthConnectClient.java`) và `com/huawei/ui/thirdpartservice/activity/healthconnect/HealthConnectActivity.java`.
- Permissions manifest: `android.permission.health.WRITE_STEPS`, `WRITE_SLEEP`, `WRITE_ACTIVE_CALORIES_BURNED` (`rea-output/permissions.txt`). -> Huawei Health GHI dữ liệu steps/sleep/calories vào Health Connect. Đây là đường lấy dữ liệu dễ nhất cho app bên thứ ba (đọc từ Health Connect).

---

## 8. WearEngine (đường chính thống cho app bên thứ ba)

### 8.1 Thành phần (trong APK, phía Huawei Health đóng vai service)

Package `com/huawei/wearengine/`:
- Service manifest: `WearEngineService` (exported=true, process `:DaemonService`, action `com.huawei.wearengine.action.REGISTER_CALLBACK_MANAGER`), `WearEngineExtendService` (exported=true, `:PhoneService`) (`AndroidManifest.xml:5477-5493`). Meta `api_level=14` (`:5494`). Permission `com.huawei.wearengine.permission.DEFAULT` (`:207`).
- Clients: `P2pManager`, `MonitorManager`, `SensorManager`, `AuthManager`, `DeviceManager`, `NotifyManager`, `OtaManager` (AIDL Stub/Proxy).

### 8.2 P2P (gửi/nhận message và file với app trên watch)

`com/huawei/wearengine/P2pManager.java` (AIDL):
- `ping`, `send(Device, MessageParcel, srcIdentity, destIdentity, SendCallback)`, `registerReceiver`, `sendExtra`, `getDeviceAppVersionCode`, `cancelFileTransfer`, `startTransferFile` (`P2pManager.java:147-324`).
- Bên trong map sang DeviceCommand service 52 cmd 1 (`defpackage/ylj.java:288-294` WearEngine_P2pCommandUtil). Service 53 = Monitor/Notify (`yli`, `ylf`).
- Yêu cầu app watch và app phone khai báo `IdentityInfo{packageName, fingerprint}` khớp nhau (`ylj.java:275-285`).

### 8.3 Monitor, Sensor, Auth, Notify

- Monitor (`com/huawei/wearengine/monitor/MonitorItem.java`): connectionStatus, wearStatus, lowPower, sportStatus, powerStatus, chargeStatus, heartRateAlarm, userAvailableKbytes, powerMode (`MonitorItem.java:10-19`). Dùng để nhận trạng thái đeo/pin/thể thao.
- Sensor (`com/huawei/wearengine/sensor/Sensor.java`): TYPE_ECG=0, PPG=1, ACC=2, GYRO=3, MAG=4, PRESSURE=5, HR=6 (`Sensor.java:54-60`). SensorClient cho phép đọc sensor realtime (cần device hỗ trợ).
- Auth (`com/huawei/wearengine/auth/Permission.java`): DEVICE_MANAGER, NOTIFY, SENSOR, MOTION_SENSOR, WEAR_USER_STATUS, DEVICE_SN (`Permission.java:29-34`). AuthClient.requestPermission hiển thị UI xin quyền.
- Scope: `com/huawei/wearengine/scope/ScopeManager.java` xác thực app bên thứ ba qua scope server (`nsp.scope.app.get`, `ScopeServerRequest.java:9`), kiểm tra appId + fingerprint + URL hợp lệ.

### 8.4 Khả năng và giới hạn của WearEngine cho bên thứ ba

Có thể làm (SDK chính thức `com.huawei.wearengine`, tải từ Huawei AppGallery Connect):
- Liệt kê thiết bị đã kết nối, nhận trạng thái (connection/wear/battery/sport).
- Gửi/nhận message và file P2P tới app chạy trên watch (cần phát triển app watch Lite/HarmonyOS riêng).
- Đọc một số sensor realtime (HR/PPG/ACC...) nếu được cấp quyền và device hỗ trợ.
- Đẩy notification tới watch.

Giới hạn:
- Cần đăng ký app trên Huawei Developer (AppGallery Connect) để lấy appId + fingerprint; WearEngine kiểm tra scope qua server (`ScopeManager`).
- Cần cài Huawei Health (app này đóng vai host/daemon). Không có Huawei Health thì WearEngine không hoạt động.
- P2P cần app phía watch. Không truy cập trực tiếp dữ liệu lịch sử steps/HR của hệ thống trừ khi qua Health Kit / Health Connect.
- Chủ yếu hỗ trợ trên điện thoại/Huawei ecosystem; trên điện thoại non-Huawei cần HMS Core + Huawei Health.

---

## 9. Khuyến nghị tích hợp cho app Android riêng

### Option A – Chính thống (khuyến nghị)

1. Health Connect (dễ nhất, không cần watch app):
   - Huawei Health ghi Steps/Sleep/ActiveCalories vào Health Connect (mục 7.6).
   - App của bạn chỉ cần dùng `androidx.health.connect.client`, xin read permission StepsRecord/SleepSessionRecord/... và đọc. Không chạm giao thức BLE.
   - Hạn chế: chỉ các loại dữ liệu Huawei Health chịu ghi; độ trễ phụ thuộc chu kỳ sync của Huawei Health; cần user cài Huawei Health + Health Connect.
2. Huawei Health Kit (REST/cloud) nếu cần dữ liệu phong phú hơn (HR, SpO2, workout): đăng ký trên Huawei Developer, OAuth, gọi Health Kit API. Không cần BLE.
3. WearEngine (nếu cần tương tác realtime/P2P với watch): đăng ký app, phát triển app watch, dùng SDK `com.huawei.wearengine` (mục 8). Dùng Context7 doc `wearEngine.getP2pClient/getSensorClient/getMonitorClient/getAuthClient`.

Khuyến nghị: nếu chỉ cần steps/sleep/HR lịch sử -> Health Connect hoặc Health Kit. Nếu cần điều khiển/realtime -> WearEngine.

### Option B – Tự implement giao thức BLE trực tiếp

Khả thi tới đâu:
- Lớp vận chuyển (frame 0x5A, CRC16/XMODEM, TLV, slicing, GATT FE86/FE01/FE02) ĐÃ giải mã đầy đủ trong báo cáo này -> có thể tái hiện (mục 3,4,5.2,5.3). Các lệnh đọc-only không mã hóa (link param, version, time) có thể gửi được.
- Blocker chính là AUTHENTICATION:
  - Legacy HMAC cần CAK nhúng trong app (white-box `HealthWhiteBoxManager`, `cqh`) -> phải trích xuất hằng số từ white-box; vi phạm bản quyền và mong manh.
  - HiChainLite cần PIN (hiện trên watch) + PBKDF2; khả thi hơn nhưng vẫn cần CAK trong bước Kn (`cni.e`).
  - HiChain/HiChain3 cần native `libhichain_sdk_jni.so` + framework `deviceauth` (OpenHarmony/EMUI). Thiết bị đời mới gần như bắt buộc HiChain -> khó tái hiện ngoài hệ sinh thái Huawei.
- Nếu không qua được auth, hầu hết lệnh nghiệp vụ (service 7...) đều bị device từ chối hoặc không giải mã được payload.

Kết luận Option B: khả thi cho vòng tay/đồng hồ ĐỜI CŨ dùng HiChainLite + PIN (nếu chấp nhận rủi ro về CAK), KHÔNG khả thi thực tế cho thiết bị mới bắt buộc HiChain native. Không khuyến nghị cho sản phẩm thương mại.

### Kế hoạch từng bước (nếu vẫn chọn B để nghiên cứu, thiết bị cũ)

1. BLE: scan, connect FE86, lấy FE01 (write) + FE02 (notify), bật CCCD 0x2902.
2. Vận chuyển: implement đóng/mở frame 0x5A (mục 4), CRC16/XMODEM (`cov`), TLV encode/decode (`cph`/`cqe`), slicing theo maxFrame/singleFrame.
3. Handshake tối thiểu: gửi 0101 (link param) -> parse MTU/randA/authVersion; 0107 (version); 0105 (time).
4. Auth: xác định cơ chế từ 0116/0133; nếu HiChainLite, lấy PIN user nhập (0x012C flow), PBKDF2 (`cni`), tính token (0x0113), bind (0x010E).
5. Nghiệp vụ: service 7 cmd 3 (today total), cmd 4+5/8 (history frames), cmd 10+11 (samples HR/SpO2). Mã hóa payload bằng work key = session/secret key (mục 6.4, TLV 7C/7D/7E, AES-CBC hoặc GCM).

Bộ lớp/ID tối thiểu cần tham chiếu: `cmj` (UUID), `coa`+`cov`+`cph`+`cqe` (frame/TLV/CRC), `ckv`/`cml` (link param), `ckq` (version), `ckz` (time), `cke`/`cni`/`ckp`/`ckd`/`ckc` (auth HiChainLite), `cjy`+`ckg` (mã hóa), `lxw`+`lxp` (fitness).

---

## 10. Câu hỏi mở và mức độ tin cậy

- [?] Thứ tự chính xác và nhánh điều kiện của toàn bộ chuỗi handshake phụ thuộc capability từng model; báo cáo đã trace các nhánh chính nhưng chưa vét hết mọi device type (bảng 5.1 là [V] về tag/next, [I] về thứ tự tuyệt đối).
- [?] Chi tiết protocol HiChain ISO/PAKE nằm trong native `.so` (chỉ xem strings, [I]). Chưa RE sâu trao đổi khóa.
- [?] Các hằng số CAK/root-key trong white-box: xác nhận tồn tại và cách gọi [V], KHÔNG trích giá trị (ghi chú bảo mật).
- [?] Cấu trúc nội dung từng frame dữ liệu health (layout byte của sample HR/SpO2/sleep) chưa giải mã ở tầng nội dung; mới xác định được lệnh và khung TLV request ([V] cho request, [?] cho response payload chi tiết).
- [V] Toàn bộ: UUID, frame 0x5A, CRC16, TLV encoding, 3 cơ chế auth, cơ chế mã hóa AES-CBC/GCM/CTR + TLV 7C/7D/7E, WearEngine surface, Health Connect write permissions.

---

## 11. Layout chi tiết – kết quả RE vòng 2 (2026-11-06)

Phần này bổ sung các mục còn thiếu được xác định trong vòng RE thứ hai phân tích
`defpackage/ckq`, `ckw`, `ckn`, `cki`, `coa`. Bằng chứng ngắn gọn tại
`docs/re-evidence/huawei/`.

### 11.1 0x0107 GetDeviceVersion – layout response TLV

Request payload: `{0x01, 0x07, type1_lo, type1_hi, type2_lo, type2_hi, ...}` – danh sách
type ID muốn hỏi, mỗi type là uint16-LE (giá trị < 128 nên byte cao = 0). [V]

Response: outer TLV container parse bởi `cku.e(bArr)`, sau đó mỗi child TLV được dispatch:

| Nhóm sub-handler | Type IDs (decimal) | Ghi chú |
|---|---|---|
| `ckq.d` | 1, 3, 7, 25, 36, 37, 38, 39, 40, 41 | firmwareVersion, productModel, healthFw, bleVersion, extended meta [I semantic] |
| `ckq.b` | 2, 10, 14, 17, 18, 22, 26 | hwVersion, sdkVersion, sysVersion, bootVersion, modemVersion, **capabilityBitmap**, configVersion [I semantic] |
| `ckq.c` | 9, 12, 15, 20, 21, 27, 29, 30, 31, 32, 33, 34, 35 | SN, **batteryLevel**, alias, productModel, screen, country/lang/region, factory info [I semantic] |

type 22 = capability bitmap là trường quan trọng nhất – quyết định service nào device hỗ trợ.
type 12 = batteryLevel (int, 0-100). Semantic của các type còn lại là [I] (suy từ tên field DeviceInfo).

### 11.2 0x0132 SetDeviceTimeZoneId – layout request

```
Frame body:
  TLV type=0x01, len=50, value = cku.c() output (50 byte, layout chưa xác định) [I]
  TLV type=0x03, len=N,  value = IANA timezone ID UTF-8 (vd "Asia/Ho_Chi_Minh")  [V]
```

`cku.c()` không tham số (overload 3) trả `byte[]` 50 byte; nội dung bên trong chưa decompile
được trong đợt RE này. Có thể chứa epoch + offset + regional flags. NEEDS-REAL-WATCH để xác minh.

### 11.3 0x0102 ServiceCapabilityConsult – layout đầy đủ

**Request** (`ckn.b(DeviceInfo)`) [V]:
```
TLV type=0x01, len=N:
  byte[0]  = serviceCount - 1
  byte[1+] = serviceId_1, serviceId_2, ...  (từ cor.e())
TLV type=0x03, len=1, value=deviceType    (tuỳ chọn)
```

**Response** (`ckn.d(DeviceInfo, byte[], List<Integer>)`) [V]:
```
Outer TLV container
  child[0]: hex ASCII bitmap string
            charIndex i*2 .. i*2+1 = hex byte tại vị trí i (serviceId_i+1)
            bit 0 (LSB) của byte đó = 1 → service (i+1) được device hỗ trợ
```

Sau khi parse, `ckn.processReceivedData` tạo `new cki(supportedServices)` làm lệnh tiếp theo. [V]

### 11.4 0x0103 CommandCapabilityConsult – layout đầy đủ

**Request** (`cki.a(DeviceInfo)`) [V]:
```
Header: {0x01, 0x03, 0x81, <varint totalSize>}
Per supported service (từ danh sách 0x0102 response):
  TLV type=0x02, len=1, value=serviceId
  TLV type=0x03, len=M, value={cmdCount, cmdId_1, cmdId_2, ..., cmdId_M}
```
`cmdId` list lấy từ `cor.d(flag)` → `Map<Integer,List<Integer>>`.

**Response** (xử lý trong `cki.processReceivedData`) [V]:
Gọi theo thứ tự:
1. `d(bArrD, deviceCapability)` – parse response, điền DeviceCapability.
2. `b(map, deviceCapability)` – giao nhau phone-supported ∩ device-supported.
3. `a(deviceCapability, cmhVar)` – ghi kết quả vào session context, kết thúc handshake.

Cấu trúc byte response mirror request (nested TLV per-service capability bitmap) [I – chưa
trace đến byte-level phía response, chỉ trace qua tên method].

### 11.5 Watch-initiated command routing

Phương thức dispatcher chính: `coa.d(DeviceInfo, String tag, cml, List<cmi>, MessageReceiveCallback)`.

`tag` = 4 hex chars = `serviceId(2) + commandId(2)` (định dạng giống `getTag()` trong các lệnh).
Watch gửi unsolicited frames cho: HR alert (svc 7), file transfer request (svc 44), notify confirm
(svc 2), exercise event (svc 23), battery low (svc 1). [I – từ service IDs trong log strings]

Driver hiện tại (`HuaweiTransport.kt:174`) bỏ qua frame không có pending request. Cần thêm
`WatchInitiatedHandler` interface và inject vào `onPayload()` (xem re-evidence/watch_initiated_routing.md).

### 11.6 Service 7 response – data model (NEEDS-REAL-WATCH)

`defpackage/mqj.java` (FitnessDataContainer) [V]:
- field `f108760b: List<DataTotalMotion>` – danh sách bản ghi fitness
- field `f108762e: HeartRateDetect` – dữ liệu HR

`DataTotalMotion` fields: `motion_type`, `step`, `calorie`, `distance`, `height`,
`sleep_time`, `pushes`. [V – class đọc được trong jadx]

TLV type IDs dùng để populate từng field từ service 7 response frame: **KHÔNG tìm thấy trong
đợt RE này** (lớp parser `lxp` / frame decoder không decompile được với phần jadx hiện có).
Cần chụp HCI snoop log khi Huawei Health sync với đồng hồ thật để xác minh.

---

## Phụ lục – Bản đồ lớp obfuscated -> vai trò

- cjs DeviceDiscoveryProcessor | cjy EncryptStrategyGeneral | cjz ScaleEncryptStrategy(EncryptBase) | lmt EncryptionBase impl
- cke DealWithHiChain | ckd AccessValidityAuth(0113) | ckc BindRequest(010E) | cla QueryBtBindStatus(010F) | clb UpdateDeviceKey(012D)
- ckg EncryptUtil(AES/HMAC/SHA) | ckp GetDevicePinCode(012C) | ckq GetDeviceVersion(0107) | ckn ServiceCapabilityConsult(0102) | cki CommandCapabilityConsult(0103)
- ckr QueryAvailable(0116) | ckt base(0116) | ckv LinkNegotiation(0101) | ckw SetTimeZoneId(0132) | ckx SecurityNegotiation(0133) | ckz SetDateAndTime(0105)
- ckh DeviceAvailableNotify | ckj DeviceExpandCapability(0137) | cko DeviceSupportActivityType(0112) | cks HiChainDataTransmit(0128) | ckl DeviceCreateDualChannel(013C)
- cky RequestAuthentic(40101) | ckf AccessAuthentic(40102) | ckm EncryptNegotiation(40103)
- cll PhysicalLayer factory | cld BLE | cli BR/EDR | clk SmartWatch host | clm Operable BLE(scale) | cln Transparent BLE
- cml DeviceLinkParameter | cmj UUID constants | cnz SendStrategyInitial5A | coa DataParserInitial5A | cov CRC16 | cph byte/TLV util | cqe TLV parser
- cnc HiChainCommandUtil | cni HiChainLiteCommandUtil | cnd HiChain3GroupManager | cnh HiChainLite store | cpv SharePreferenceUtil | cqo KeyStoreUtils | cqh HealthWhiteBoxManager wrapper | cqr HwEncryptUtil
- cnx ConnectStrategyGeneral | cnt ConnectStrategyScale | cnv ConnectStrategyTransparent | cno ReconnectManager | cnr BleReconnectManager
- lxw FitnessSendCommandUtil | lxp FitnessPackage(TLV) | mro/mrj/mrs CommonFile(40/44) | mnz/mnx/moa FileService(28) | ylj WearEngine P2pCommandUtil(52)
