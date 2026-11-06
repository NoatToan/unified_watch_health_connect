# UUID literal tồn tại trong `classes.dex` (bằng chứng [V])

Trích bằng:
```bash
grep -oE "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" strings_classes.txt | sort -u
```

Lưu ý phương pháp: `string_ids` của định dạng DEX **bắt buộc được sắp xếp theo thứ tự UTF-16 code
point** (đặc tả Dalvik Executable). Vì vậy hai chuỗi đứng cạnh nhau trong `strings_classes.txt`
**không chứng minh** chúng được khai báo trong cùng một lớp — chỉ chuỗi có tiền tố chung (ví dụ 3 UUID
`6E400001/0002/0003-...-<cùng hậu tố>`) mới là bằng chứng độc lập với thứ tự sắp xếp (vì bản thân mẫu
"service / char 1 / char 2" dùng chung hậu tố là quy ước đặt UUID BLE phổ biến, không phụ thuộc vị trí
file).

## Chuẩn Bluetooth SIG (16-bit, dùng chung cho thư viện `com.yf.lib.bluetooth`)

```
00001800-0000-1000-8000-00805f9b34fb  Generic Access
00001801-0000-1000-8000-00805f9b34fb  Generic Attribute
00001805-0000-1000-8000-00805f9b34fb  Current Time Service
0000180a-0000-1000-8000-00805f9b34fb  Device Information
0000180d-0000-1000-8000-00805f9b34fb  Heart Rate Service
0000180f-0000-1000-8000-00805f9b34fb  Battery Service
00002902-0000-1000-8000-00805f9b34fb  Client Characteristic Configuration (CCCD)
00002904-0000-1000-8000-00805f9b34fb  Characteristic Presentation Format
00002a00-0000-1000-8000-00805f9b34fb  Device Name
00002a05-0000-1000-8000-00805f9b34fb  Service Changed
00002a19-0000-1000-8000-00805f9b34fb  Battery Level
00002a24-0000-1000-8000-00805f9b34fb  Model Number String
00002a25-0000-1000-8000-00805f9b34fb  Serial Number String
00002a26-0000-1000-8000-00805f9b34fb  Firmware Revision String
00002a27-0000-1000-8000-00805f9b34fb  Hardware Revision String
00002a28-0000-1000-8000-00805f9b34fb  Software Revision String
00002a29-0000-1000-8000-00805f9b34fb  Manufacturer Name String
00002a2b-0000-1000-8000-00805f9b34fb  Current Time
00002a37-0000-1000-8000-00805f9b34fb  Heart Rate Measurement
```

## Nordic Semiconductor Legacy DFU (service/control/packet) [Ext] tên chuẩn

```
00001530-1212-efde-1523-785feabcd123
00001531-1212-efde-1523-785feabcd123
00001532-1212-efde-1523-785feabcd123
```

## Họ UUID tuỳ biến #1 — "Nordic UART Service" với hậu tố ASCII "weloop"

```
6E400001-B5A3-F393-E0A9-77656C6F6F70   (hậu tố 77 65 6C 6F 6F 70 = ASCII "weloop")
6E400002-B5A3-F393-E0A9-77656C6F6F70
6E400003-B5A3-F393-E0A9-77656C6F6F70
```
Đối chiếu: `com.yf.smart.weloopx.app.WeLoopApplication` [V] vẫn còn là tên lớp Application gốc của
app → "WeLoop" là tên công ty/sản phẩm tiền thân của thương hiệu COROS, khớp hậu tố UUID.

## Họ UUID tuỳ biến #2 — cùng tiền tố `6E4000xx-B5A3-F393-E0A9-`, hậu tố khác

```
6E400001-B5A3-F393-E0A9-77757C7F7F70   (hậu tố không giải mã ASCII sạch — chứa byte 0x7F)
6E400002-B5A3-F393-E0A9-77757C7F7F70
6E400003-B5A3-F393-E0A9-77757C7F7F70

6E400001-B5A3-F393-E0A9-E50E24DCCA9E   (= UUID Nordic UART Service CHUẨN công khai [Ext])
6E400002-B5A3-F393-E0A9-E50E24DCCA9E
6E400003-B5A3-F393-E0A9-E50E24DCCA9E
```

## Họ UUID tuỳ biến #3 — tiền tố `ADF70xxx-6B99-45E9-98E6-DF67A4C3D291`

```
ADF70001-6B99-45E9-98E6-DF67A4C3D291
ADF70002-6B99-45E9-98E6-DF67A4C3D291
ADF70003-6B99-45E9-98E6-DF67A4C3D291
```

## Họ UUID tuỳ biến #4 — tiền tố `c7be000x-f019-749e-1c4f-0a8d000054f5`

```
c7be0001-f019-749e-1c4f-0a8d000054f5
c7be0002-f019-749e-1c4f-0a8d000054f5
c7be0003-f019-749e-1c4f-0a8d000054f5
```
Không có bằng chứng bổ sung quanh họ này (không thấy chuỗi liên quan "weloop"/"coros" ngay cạnh —
vị trí trong file chỉ là do thứ tự sắp xếp chữ cái). Có thể là service của thế hệ phần cứng khác, hoặc
không liên quan tới BLE (chưa loại trừ được là UUID của thư viện bên thứ ba khác dùng UUID ngẫu nhiên
cho mục đích không phải BLE). **Không dùng trong driver** cho tới khi có thêm bằng chứng.

## UUID ngẫu nhiên khác tìm thấy, KHÔNG dùng làm bằng chứng BLE

Các UUID sau cũng tồn tại trong `classes.dex` nhưng không có hậu tố/tiền tố lặp lại theo mẫu
service/char, không có từ khoá "ble"/"gatt"/"weloop"/"coros" liền kề, và app có rất nhiều SDK bên thứ 3
(Mapbox, Firebase, Sentry, Facebook, OkHttp…) thường tự sinh UUID ngẫu nhiên cho mục đích khác (cache
key, install id, session id…). Liệt kê để tránh người đọc sau nhầm là GATT UUID:

```
0997735B-B167-4A0B-BFB3-B971A4113EA9   258EAFA5-E914-47DA-95CA-C5AB0DC85B11
383F2407-53F9-475B-87BD-6D2F1CE12105   3DEB5DDB-C7E6-427D-95EE-118320BB385D
4c5f81a0-4728-476f-a57f-b46fa44f07d3   92A5F7A4-5E4B-4133-A06C-8010132EB798
95ed6082-b8e9-46e8-a73f-ff56f00f5d9d   9a04f079-9840-4286-ab92-e65be0885f95
B5114592-B4F0-4C72-B3B4-5DE55E04C856   DC522617-9A51-4BBF-B0E0-D3C538B30C60
F959DA97-CC05-4775-97AB-2D2BABEB85CD   cf61947c-a8fe-4fa3-aa7c-fbeb7f291352
d6880084-9937-4c04-a690-87c49087742a   e2719d58-a985-b3c9-781a-b030af78d30e
edef8ba9-79d6-4ace-a3c8-27dcd51d21ed   f6af99e2-2b64-4eb6-aba6-4d44fb935939
```
