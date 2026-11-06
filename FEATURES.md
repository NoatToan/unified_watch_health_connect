# Unified Health: Đặc tả tính năng & UI (Material Design 3)

> Tài liệu sản phẩm cho ứng dụng **Unified Health**: app Android native để đọc và hiển thị dữ liệu sức khỏe từ **đồng hồ/vòng đeo Huawei của chính người dùng** qua BLE, đồng bộ hai chiều với Health Connect.
>
> Ký hiệu giai đoạn: **[MVP]** làm trong bản đầu tiên · **[P2]** giai đoạn 2 · **[P3]** về sau.
> Trạng thái skeleton hiện tại: ✅ đã có UI (dữ liệu giả) · 🟡 placeholder · ⬜ chưa làm.

---

## 0. Nguyên tắc chung

- **Material 3 / Material You**: dynamic color trên Android 12+ (tắt được trong Hồ sơ), fallback về bảng màu thương hiệu teal. Hỗ trợ sáng/tối theo hệ thống hoặc chọn tay.
- **Single-activity**, Navigation Compose type-safe, edge-to-edge.
- **Mọi màn hình có đủ 4 trạng thái**: `Loading` (skeleton/progress), `Empty` (minh họa + CTA), `Error` (thông điệp + Thử lại), `Disconnected` (banner "Thiết bị chưa kết nối" + nút Kết nối, vẫn hiện dữ liệu đã đồng bộ gần nhất kèm thời điểm).
- **Dữ liệu chỉ nằm trên máy**, không có backend. Không sao lưu cloud (đã cấu hình `dataExtractionRules`).
- **Không phải thiết bị y tế**: mọi cảnh báo nhịp tim / SpO2 đều kèm câu "Không dùng để chẩn đoán".

---

## 1. Sơ đồ điều hướng

```
                        ┌──────────────────────┐
  Mở app lần đầu ──────▶│ Onboarding           │
                        │  Welcome → Quyền     │
                        └──────────┬───────────┘
                                   │ hoàn tất / bỏ qua
                                   ▼
┌───────────────────── NavigationBar (5 tab) ──────────────────────┐
│  Trang chủ      Hoạt động       Giấc ngủ       Thiết bị    Hồ sơ  │
└──┬──────────────┬───────────────┬──────────────┬───────────┬─────┘
   │              │               │              │           │
   ├─▶ Chi tiết chỉ số            ├─▶ Chi tiết   ├─▶ Ghép đôi├─▶ Mục tiêu & nhắc nhở
   │   (Bước, Nhịp tim, SpO2,     │   1 đêm      │   (sheet) ├─▶ Đơn vị
   │    Căng thẳng, Calo,         │              ├─▶ Cài đặt ├─▶ Thông báo
   │    Cân nặng)                 │              │   thiết bị├─▶ Health Connect
   │     └─▶ Ngày / Tuần / Tháng  │              ├─▶ Firmware├─▶ Quyền riêng tư
   │                              │              └─▶ Đồng bộ ├─▶ Xuất / Xóa dữ liệu
   │                              │                  thông báo└─▶ Giới thiệu
   ├─▶ Thiết bị (từ banner)       │
   └─▶ Bài tập trực tiếp ◀────────┘ (FAB "Bắt đầu tập")
           └─▶ Tổng kết bài tập ─▶ Lịch sử
```

- Tab gốc giữ trạng thái khi chuyển tab (`saveState/restoreState`).
- Màn chi tiết ẩn NavigationBar, có nút Back trên TopAppBar.
- Deep link (P2): `unifiedhealth://metric/{type}`, `unifiedhealth://device`.

---

## 2. Design tokens

### 2.1 Màu (`core/designsystem/theme/Color.kt`, `MetricColors.kt`)

| Vai trò M3 | Light | Dark | Ghi chú |
|---|---|---|---|
| primary | `#006A60` | `#53DBC9` | Teal, seed `#00897B` |
| secondary | `#40637D` | `#A8CBEA` | Xanh dương dịu |
| tertiary | `#9A453D` | `#FFB4AA` | Coral |
| error | `#BA1A1A` | `#FFB4AB` | |
| surface / background | `#F4FBF8` | `#0E1513` | Đủ 5 mức surfaceContainer* |

**Màu ngữ nghĩa theo chỉ số** (giữ nguyên khi bật dynamic color để người dùng nhận diện):

| Chỉ số | Light | Dark | Icon |
|---|---|---|---|
| Bước chân | `#2E7D32` | `#81C995` | DirectionsWalk |
| Nhịp tim | `#C62828` | `#FF8A80` | FavoriteBorder |
| Giấc ngủ | `#4F45B5` | `#B4ABFF` | Bedtime |
| SpO2 | `#00838F` | `#80DEEA` | Air |
| Căng thẳng | `#B26A00` | `#FFCC80` | SelfImprovement |
| Calo | `#D84315` | `#FFAB91` | LocalFireDepartment |
| Cân nặng | `#6A4C93` | `#CFB8F0` | MonitorWeight |

Màu giai đoạn ngủ (P2): Thức `#FF8A65`, REM `#7E57C2`, Nông `#64B5F6`, Sâu `#283593`.
Vùng nhịp tim (P2): Z1 xám, Z2 xanh dương, Z3 xanh lá, Z4 cam, Z5 đỏ.

### 2.2 Typography (`Type.kt`)
Thang M3 chuẩn, font hệ thống (hiển thị dấu tiếng Việt đúng, không cần bundle font). Headline dùng SemiBold. Riêng giá trị số trên card dùng `MetricValueTextStyle` (28sp SemiBold, `tnum` để chữ số thẳng cột). Mọi cỡ chữ dùng `sp`, hỗ trợ font scale tới 200%.

### 2.3 Shape (`Shape.kt`)
XS 4dp · S 8dp (chip) · M 12dp (text field, dialog nhỏ) · **L 16dp (card chỉ số)** · XL 28dp (bottom sheet, dialog).

### 2.4 Spacing (`Spacing.kt`)
Lưới 4dp: 2 / 4 / 8 / 12 / **16 (lề màn hình)** / 24 / 32. Vùng chạm tối thiểu 48dp.

### 2.5 Elevation & motion
Card chỉ số: `ElevatedCard` (level 1). Banner thiết bị: `Card` màu `secondaryContainer`. Chuyển màn: mặc định Navigation Compose (fade-through); FAB Scan ↔ Stop đổi nội dung tại chỗ.

---

## 3. Tính năng theo màn hình

### 3.1 Onboarding & quyền: **[MVP]** ✅

**Màn hình**
1. Welcome: logo, tên app, mô tả 1 câu, nút `Bắt đầu`.
2. Quyền: danh sách thẻ quyền, mỗi thẻ có icon, tiêu đề, lý do, nút `Cho phép` hoặc dấu ✓.
3. (P2) Ghép đôi nhanh: mời quét thiết bị ngay.
4. (P2) Hồ sơ cơ bản: giới tính, năm sinh, chiều cao, cân nặng (để tính calo, vùng nhịp tim).

**Quyền & logic theo API**

| Nhóm | API ≥ 31 | API ≤ 30 | Ghi chú |
|---|---|---|---|
| Bluetooth | `BLUETOOTH_SCAN` (neverForLocation) + `BLUETOOTH_CONNECT` | `ACCESS_FINE_LOCATION` (+ BLUETOOTH/ADMIN trong manifest) | Bắt buộc để ghép đôi |
| Thông báo | `POST_NOTIFICATIONS` (API 33+) | không cần | Trạng thái đồng bộ, cảnh báo |
| Health Connect | `PermissionController.createRequestPermissionResultContract()` | như bên trái | Ẩn nút nếu HC không khả dụng; hướng dẫn cài/cập nhật |
| Chạy nền | Mở `ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS` | như bên trái | Không dùng `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` (Play hạn chế) |
| Foreground service | `FOREGROUND_SERVICE_CONNECTED_DEVICE` | `FOREGROUND_SERVICE` | Không cần hỏi runtime |

**Components**: `Card` cho từng quyền, `FilledTonalButton`, `Button` (Tiếp tục), `TextButton` (Bỏ qua).
**States**: quyền bị từ chối vĩnh viễn → nút đổi thành `Mở cài đặt`; HC chưa cài → mô tả + link Play Store (P2).
**Ghi chú**: trạng thái quyền được đọc lại mỗi lần màn hình `onResume` (người dùng quay lại từ Settings).

### 3.2 Trang chủ (Dashboard): **[MVP]** ✅

**Màn hình**: `Hôm nay`, cuộn dọc, kéo để làm mới (= đồng bộ ngay nếu thiết bị đang kết nối).

**Bố cục** (`LazyVerticalGrid`, `GridCells.Adaptive(160dp)`: 2 cột trên điện thoại, 3–4 cột trên tablet/gập):
1. **Banner thiết bị** (full width): tên thiết bị, pin, chip trạng thái kết nối; nếu chưa ghép đôi thì hiện "Chưa có thiết bị · Đang xem dữ liệu demo" + nút `Ghép đôi`.
2. **Vòng hoạt động** (full width): 3 vòng đồng tâm Bước / Phút vận động / Calo + chú thích số liệu.
3. **Card chỉ số**: Bước chân (progress), Nhịp tim (hiện tại + nghỉ), Giấc ngủ (tổng + điểm), SpO2, Căng thẳng (điểm + mức), Calo (progress).
4. (P2) Card Bài tập gần nhất, card Cân nặng, card "Mẹo hôm nay".
5. (P2) Tùy biến thứ tự/ẩn card (long-press → chế độ sắp xếp).

**Components**: `TopAppBar` (enterAlways scroll), `PullToRefreshBox`, `ElevatedCard`, `LinearProgressIndicator`, `AssistChip` (trạng thái), canvas `ActivityRings`.
**States**: Loading → `CircularProgressIndicator`; Error → `ErrorState` + Thử lại; Disconnected → banner vẫn hiện, card hiện dữ liệu cũ + "Cập nhật lúc HH:mm"; Empty (chưa có dữ liệu ngày) → giá trị `--`.

### 3.3 Chi tiết chỉ số (dùng chung): **[MVP]** ✅ (bản đơn giản)

**Màn hình**: một template cho Bước, Nhịp tim, SpO2, Căng thẳng, Calo, Cân nặng.
- `TopAppBar` + Back, `SingleChoiceSegmentedButtonRow` **Ngày / Tuần / Tháng**.
- Biểu đồ: cột (bước, calo), đường + vùng min–max (nhịp tim, SpO2, căng thẳng), điểm (cân nặng).
- Hàng thống kê: Trung bình / Thấp nhất / Cao nhất (+ tổng với bước & calo).
- (P2) Kéo ngang để lùi ngày/tuần; chạm biểu đồ để xem tooltip; danh sách bản ghi bên dưới.
- (P2) Thay biểu đồ Canvas tạm bằng thư viện (Vico).

**States**: Loading; Empty ("Chưa có dữ liệu cho khoảng thời gian này"); Error.

### 3.4 Hoạt động / Bài tập: **[MVP]** danh sách 🟡 · **[P2]** live workout ⬜

**Màn hình**
1. **Danh sách bài tập** (tab Hoạt động): nhóm theo tháng, mỗi item `ListItem` gồm icon môn, tên, ngày, thời lượng, quãng đường, kcal, nhịp tim TB; thẻ "Weekly activity load" ở đầu (D-805). ✅ (dữ liệu Room)
2. **Chọn môn** (`ModalBottomSheet` với lưới môn: Đi bộ, Chạy, Đạp xe, Bơi, Sức mạnh, Yoga, Khác). [P2]
3. **Bài tập trực tiếp**: thời gian lớn, nhịp tim realtime + vùng, quãng đường, pace, nút Tạm dừng / Kết thúc (giữ để kết thúc). Chạy trong foreground service, hiện thông báo ongoing. [P2]
4. **Tổng kết bài tập**: bản đồ (nếu có GPS, P3), biểu đồ nhịp tim theo vùng, splits, nút Lưu / Xóa. [P2]
5. **Chi tiết lịch sử**: read-only — thời lượng, quãng đường, kcal, pace/tốc độ, nhịp tim TB/max, biểu đồ nhịp tim theo thời gian bài tập, thiết bị nguồn (D-804). ✅

**Components**: `ExtendedFloatingActionButton` "Bắt đầu tập", `ListItem` trong `ElevatedCard`, `FilterChip` (lọc môn), `ModalBottomSheet`.
**States**: Empty ("Chưa có bài tập"); Disconnected khi đang tập → snackbar "Mất kết nối đồng hồ, đang thử lại…" và tiếp tục ghi bằng điện thoại.

### 3.5 Giấc ngủ: **[MVP]** 🟡 · **[P2]** phân tích đầy đủ

**Màn hình**
1. **Đêm qua**: điểm giấc ngủ (vòng lớn), tổng thời gian, giờ đi ngủ/thức dậy.
2. **Hypnogram**: biểu đồ bậc thang 4 giai đoạn (Thức / REM / Nông / Sâu) theo thời gian.
3. **Phân bổ giai đoạn**: thanh ngang % + phút, so với khoảng tham chiếu.
4. **Xu hướng tuần/tháng**: cột tổng thời lượng + đường điểm.
5. (P3) Nhịp thở, SpO2 khi ngủ, ngủ trưa.

**Components**: `Card`, `SegmentedButton` (Đêm / Tuần / Tháng), canvas hypnogram, `AssistChip` cho nhận xét.
**States**: Empty ("Đeo đồng hồ khi ngủ để xem phân tích"); Loading; Error.

### 3.6 Nhịp tim: **[MVP]** card + chi tiết ✅ · **[P2]** vùng & cảnh báo

- Chi tiết: nhịp hiện tại, nghỉ, min/max ngày, biểu đồ theo giờ.
- **Vùng nhịp tim** (P2): tính theo `220 − tuổi` hoặc HRR; hiển thị thời gian ở mỗi vùng.
- **Cảnh báo** (P2): nhịp cao/thấp khi nghỉ (ngưỡng tùy chỉnh, mặc định > 120 / < 45 bpm trong 10 phút) → notification kênh "Cảnh báo sức khỏe" + disclaimer.
- (P3) Đo thủ công từ app, HRV.

### 3.7 SpO2: **[MVP]** card + chi tiết ✅ · **[P2]** cảnh báo
- Giá trị gần nhất, min/TB theo ngày, biểu đồ; cảnh báo < 90% (P2) kèm disclaimer.

### 3.8 Căng thẳng: **[MVP]** card + chi tiết ✅ · **[P2]** bài thở
- Điểm 0–100, mức (Thư giãn 0–29 / Bình thường 30–59 / Trung bình 60–79 / Cao 80+), biểu đồ theo giờ, phân bổ % theo mức.
- (P2) Bài tập thở có hướng dẫn (animation vòng tròn), gợi ý khi căng thẳng cao kéo dài.

### 3.9 Cân nặng & cơ thể: **[P2]** ⬜
- Nhập tay (`ModalBottomSheet` + number field), đọc/ghi Health Connect `WeightRecord`, BMI, % mỡ (nếu có cân thông minh).
- Biểu đồ điểm + đường xu hướng, mục tiêu cân nặng.

### 3.10 Thiết bị: **[MVP]** ✅

**Màn hình**
1. **Danh sách thiết bị**: section "Thiết bị của tôi" + section "Thiết bị gần đây" (kết quả quét).
2. **Ghép đôi**: quét → chọn → (P2) `ModalBottomSheet` hướng dẫn xác nhận trên đồng hồ → kết nối → xác thực → xong.
3. **Cài đặt thiết bị** [P2]: mặt đồng hồ, đo nhịp tim liên tục, theo dõi giấc ngủ, nâng tay sáng màn hình, không làm phiền, tìm đồng hồ.
4. **Firmware** [P3]: phiên bản hiện tại; cập nhật (nếu giao thức cho phép).
5. **Đồng bộ thông báo** [P3]: xem 3.11.

**Card thiết bị đã ghép đôi**: tên, MAC, chip trạng thái (Đã kết nối / Đang kết nối… / Đang xác thực… / Mất kết nối / Lỗi), pin %, firmware, lần đồng bộ cuối, thanh tiến độ khi đang đồng bộ, nút `Đồng bộ ngay` / `Ngắt kết nối` hoặc `Kết nối`, menu ⋮ → `Cài đặt thiết bị`, `Bỏ ghép đôi` (có `AlertDialog` xác nhận).

**Quét**: `ExtendedFloatingActionButton` Quét ↔ Dừng, `LinearProgressIndicator` khi đang quét, tự dừng sau 15s; mỗi kết quả là `ListItem` trong `OutlinedCard` với tên, MAC, cường độ tín hiệu (Mạnh/Tốt/Yếu + dBm), nút `Ghép đôi`.

**States**
- Chưa có quyền Nearby devices → yêu cầu khi bấm Quét; bị từ chối → card "Cần quyền" + `Mở cài đặt`.
- Bluetooth tắt (P2) → card + nút bật (`ACTION_REQUEST_ENABLE`).
- Không tìm thấy thiết bị → hướng dẫn "Để đồng hồ gần điện thoại, mở màn hình ghép đôi trên đồng hồ".
- Lỗi kết nối/xác thực → hiện lý do trên card + nút thử lại.
- Snackbar cho kết quả thao tác (ghép đôi thành công, đồng bộ xong, lỗi).

**Kiến trúc**: UI chỉ biết `WearableDeviceRepository` (domain). Repository dùng `DeviceScanner`, `DeviceConnection`, `HealthDataSync` (`:core:ble`). Hiện đang bind bản **Fake**; giao thức Huawei sẽ cắm vào sau.

### 3.11 Đồng bộ thông báo sang đồng hồ: **[P3]** ⬜
- `NotificationListenerService` (người dùng tự bật trong Settings), chọn app được chuyển tiếp, lọc theo giờ (không làm phiền), xem trước.
- Cuộc gọi đến: tên người gọi (cần `READ_PHONE_STATE`/`READ_CALL_LOG` tùy tính năng, cân nhắc chính sách Play).
- Chỉ bật khi giao thức đã hỗ trợ lệnh push notification.

### 3.12 Mục tiêu & nhắc nhở: **[MVP]** mục tiêu bước 🟡 · **[P2]** đầy đủ
- Mục tiêu: bước/ngày, phút vận động, calo, giờ ngủ, cân nặng. Chỉnh bằng `Slider` hoặc stepper trong bottom sheet.
- Nhắc nhở: vận động mỗi giờ khi ngồi lâu, uống nước, đi ngủ; dùng WorkManager + notification channel riêng.
- Huy hiệu/streak (P3).

### 3.13 Hồ sơ & cài đặt: **[MVP]** 🟡

| Mục | Nội dung | Giai đoạn |
|---|---|---|
| Thông tin cá nhân | Giới tính, năm sinh, chiều cao, cân nặng | P2 |
| Mục tiêu & nhắc nhở | Xem 3.12 | MVP (bước) |
| Đơn vị | Hệ mét / Anh (km–mi, kg–lb, °C–°F) | MVP ✅ (toggle) |
| Giao diện | Sáng / Tối / Theo hệ thống, Dynamic color | MVP ✅ (dynamic color) |
| Thông báo | Bật/tắt từng kênh | P2 |
| Health Connect | Trạng thái, mở quản lý quyền, chọn loại dữ liệu đồng bộ | P2 |
| Quyền riêng tư | Chính sách, giải thích dữ liệu nằm trên máy | MVP (màn privacy cho HC ✅) |
| Xuất dữ liệu | CSV/JSON qua Storage Access Framework | P2 |
| Xóa dữ liệu | Xóa toàn bộ DB + DataStore, `AlertDialog` gõ "XÓA" để xác nhận | P2 |
| Giới thiệu | Phiên bản, giấy phép mã nguồn mở | P2 |

**Components**: `ListItem` + `Switch`, `HorizontalDivider`, `AlertDialog`, `ModalBottomSheet` cho lựa chọn.

### 3.14 Đồng bộ Health Connect: **[MVP]** xin quyền đọc ✅ · **[P2]** đồng bộ hai chiều
- MVP: kiểm tra `getSdkStatus`, xin quyền đọc: Steps, HeartRate, SleepSession, OxygenSaturation, ExerciseSession, ActiveCaloriesBurned, Weight. Có activity chính sách quyền riêng tư + `activity-alias` `VIEW_PERMISSION_USAGE` (Android 14+).
- P2: **ghi** dữ liệu từ đồng hồ vào HC (cần thêm quyền WRITE_*), dedupe bằng `clientRecordId`; **đọc** từ HC để bổ sung (ví dụ cân nặng từ app khác); đồng bộ nền định kỳ bằng WorkManager; xử lý thu hồi quyền.
- P3: đọc lịch sử > 30 ngày (`READ_HEALTH_DATA_HISTORY`), đọc nền (`READ_HEALTH_DATA_IN_BACKGROUND`).

---

## 4. Trạng thái kết nối & đồng bộ (dùng chung)

```
Disconnected ──connect()──▶ Connecting ──GATT ok──▶ Authenticating ──handshake ok──▶ Connected
     ▲                          │                         │                             │
     └────────── lỗi / timeout ─┴──────── Error(reason) ◀─┘                 mất link ───┘ (tự kết nối lại có back-off, P2)
```

- `SyncState`: `Idle` → `InProgress(progress)` → `Done(result)` | `Failed(reason)`.
- Kết nối lâu dài chạy trong foreground service `connectedDevice` (đã khai báo `DeviceSyncService`, chưa dùng).

---

## 5. Khả năng tiếp cận (Accessibility)

- Mỗi card chỉ số là **một node** TalkBack (`mergeDescendants`) với mô tả đầy đủ, ví dụ "Bước chân, 6.240 bước, mục tiêu 8.000".
- Trạng thái **không chỉ dùng màu**: chip kết nối có chữ + chấm màu; vòng hoạt động có `contentDescription` liệt kê %.
- Biểu đồ có `contentDescription` tóm tắt dữ liệu; P2: bảng dữ liệu thay thế có thể đọc được.
- Vùng chạm ≥ 48dp; tương phản ≥ 4.5:1 cho văn bản (bảng màu M3 đảm bảo); hỗ trợ font scale 200% (dùng `sp`, không cố định chiều cao text).
- Tiêu đề màn hình đánh dấu `heading()` để điều hướng nhanh.
- Không truyền đạt thông tin chỉ bằng animation; tôn trọng "Remove animations" của hệ thống (P2).
- Hỗ trợ RTL (`supportsRtl`, icon AutoMirrored).

## 6. Bản địa hóa
- Ngôn ngữ: Tiếng Việt (mặc định cho thị trường VN) + English. **TODO**: chuỗi UI hiện viết cứng bằng tiếng Anh trong skeleton, cần đưa vào `strings.xml` và thêm `values-vi`.
- Định dạng số/ngày theo `Locale` (đã dùng `NumberFormat`, `DateTimeFormatter.ofLocalizedDate`).

## 7. Quyền riêng tư & bảo mật
- Dữ liệu sức khỏe chỉ lưu cục bộ (Room + DataStore), loại khỏi backup.
- P2: mã hóa DB (SQLCipher) và khóa app bằng sinh trắc học (tùy chọn).
- Khóa/khóa phiên với đồng hồ (từ giao thức Huawei) lưu bằng Android Keystore.

## 8. Lộ trình tóm tắt

| Giai đoạn | Phạm vi |
|---|---|
| **MVP** | Onboarding + quyền, Dashboard, chi tiết chỉ số (Ngày/Tuần/Tháng), Thiết bị (quét/ghép đôi/kết nối/pin/firmware/đồng bộ/bỏ ghép đôi) với **giao thức Huawei thật**, lưu Room, xin quyền đọc Health Connect, mục tiêu bước, đơn vị, dynamic color |
| **P2** | Live workout + lịch sử chi tiết, phân tích giấc ngủ đầy đủ, vùng & cảnh báo nhịp tim, SpO2/stress alerts, bài thở, cân nặng, ghi Health Connect, nhắc nhở, xuất/xóa dữ liệu, cài đặt thiết bị, tự kết nối lại, bản địa hóa vi |
| **P3** | Đồng bộ thông báo/cuộc gọi, firmware update, GPS route, HRV, huy hiệu, widget màn hình chính, Wear tile (nếu cần) |
