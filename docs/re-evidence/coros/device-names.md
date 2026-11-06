# Danh sách tên thiết bị COROS tồn tại trong `classes.dex` (bằng chứng [V])

Trích bằng (cụm liên tục trong string pool — dòng 431997–432066 của `strings_classes.txt`):
```bash
grep -n "^COROS APEX$\|^COROS_PACE$" strings_classes.txt    # định vị cụm
sed -n '431997,432066p' strings_classes.txt | grep -v "VALUE$"
```

```
COROS APEX           COROS APEX 2         COROS APEX 2 Pro     COROS APEX 42mm
COROS APEX 46mm      COROS APEX PRO       COROS APEXs
COROS B13  B15  B15D  B16  B17  B18  B19  B20  B21              (model nội bộ/thử nghiệm?)
COROS BY01           COROS Cadence        COROS DURA
COROS FD01 FD02 FD03 FD05
COROS HA05 HA06 HA07
COROS HELMET         COROS HELMET BLE
COROS HR01           COROS HR31           COROS Heart Rate     (dây đo nhịp tim rời)
COROS HYDROP
COROS LINX           COROS LYNX
COROS M1             COROS M1D            COROS M1D_4R9
COROS OMNI           COROS OMNI BLE
COROS PACE           COROS PACE 2
COROS POD            COROS POD 2
COROS S501
COROS SAFESOUND-M(+ " BLE")  COROS SAFESOUND-R(+ " BLE")  COROS SAFESOUND-U(+ " BLE")
COROS Speed
COROS VERTIX         COROS VERTIX 2       COROS VERTIX R       COROS VERTIX2

Hằng số nhóm: COROS_COMMON, COROS_LINX, COROS_OMNI, COROS_PACE
```

Ngoài ra, mẫu dữ liệu nhúng (JSON test/demo) nhắc tới `"COROS PACE Pro"` (dòng 133145 của
`strings_classes.txt`) — model không có trong danh sách tĩnh trên, có thể là model mới hơn bản build
này (app build 2026-10, model PACE Pro có thể ra sau danh sách tĩnh được biên dịch, hoặc chuỗi tới từ
dữ liệu demo không đại diện cho danh sách quét đầy đủ).

Bằng chứng tầng cầu nối React Native (xác nhận domain "COROSRNBridgeModule" làm cầu nối UI RN ↔ native,
phù hợp với nhận định ở `00-methodology.md` rằng BLE vẫn chạy ở tầng Kotlin/Java gốc):
```
COROSRNBridgeModule
COROSRNBridgeModule.kt
COROSRNRepo
COROSRNUtil
```

## Dùng trong driver

`CorosUuids`/`CorosDriver` dùng tập con **không mơ hồ** của danh sách trên để so khớp tiền tố tên quảng
bá: mọi tên bắt đầu bằng `COROS ` hoặc `COROS_` (tiền tố chung, bao trùm toàn bộ danh sách), cộng thêm
`VERTIX`/`APEX` không tiền tố (phòng trường hợp tên quảng bá rút gọn, ví dụ Garmin driver cũng chấp
nhận tên model không kèm "Garmin"). Không dùng các mã ngắn mơ hồ một mình (`B13`, `M1`, `S501`…) vì dễ
trùng với thiết bị hãng khác.
