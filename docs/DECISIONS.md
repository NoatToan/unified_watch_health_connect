# Decision log — Unified Health

Các quyết định đã chốt khi làm việc tự động. Muốn đổi điểm nào thì báo, sẽ cập nhật lại ở đây.
Format: `D-<số>` · ngày · phạm vi · quyết định · lý do. Trạng thái: **Chốt** / **Tạm** (chờ xác nhận trên thiết bị thật).

## Mục tiêu sản phẩm

- **D-001** · 2026-11-06 · Sản phẩm — **Chốt**
  Mục tiêu: release app **Unified Health** (`com.unified.health`), một app duy nhất kết nối được mọi brand đã có driver
  (Standard BLE, Garmin, Huawei, Zepp, + COROS đang làm), để người dùng không phải cài mỗi brand một app.
  Mỗi brand là một module `:driver:<brand>` cắm vào qua Hilt `@IntoSet WearableDriver`; app tự nhận diện brand khi quét.

## Tooling / quy trình

- **D-002** · 2026-11-06 · Model — **Chốt**
  Tác vụ reverse-engineering / tái hiện cơ chế kết nối chạy bằng `model: sonnet` (= Claude Sonnet 5, `claude-sonnet-5`;
  không tồn tại `claude-sonnet-5-5`). Áp dụng cho `.claude/agents/device-protocol-re.md` và `wearable-driver-engineer.md`.
  Muốn pin Sonnet 4.6: đổi `model:` thành `claude-sonnet-4-6`.
- **D-003** · 2026-11-06 · rea — **Chốt**
  Dùng `rea` đã cài sẵn (`~/.volta/bin/rea`), không clone repo. Mọi việc liên quan rea chạy trong sub-agent (lỗi không ảnh hưởng session chính).
  Output thô (APK ghép lại, dump decompile) để ngoài git ở `../rea-output/<brand>/`; chỉ bằng chứng đã chắt lọc vào `docs/re-evidence/<brand>/`.
- **D-004** · 2026-11-06 · Pháp lý — **Chốt**
  Không copy code GPL (Gadgetbridge…), không trích xuất/nhúng key bí mật của vendor; credential chỉ đến từ người dùng (`SessionContext.credentials`).
  Chỉ phục vụ kết nối đồng hồ của chính người dùng.
- **D-005** · 2026-11-06 · Làm việc trực tiếp — **Chốt**
  Các agent làm thẳng trong `unified_health_app` (không worktree), chưa commit; commit khi bạn yêu cầu.

## E2E / demo

- **D-006** · 2026-11-06 · Mock provider — **Chốt**
  Có driver "Demo watch" giả lập: quét/ghép đôi/kết nối/đồng bộ luôn thành công, chạy qua pipeline sync thật.
  Chỉ bật ở debug + test, **không có trong bản release**.
- **D-007** · 2026-11-06 · Seed data — **Chốt**
  Seed cố định (fixed random seed), ~90 ngày, ghi vào storage thật (Room/DataStore) để mọi biểu đồ có dữ liệu.
  Menu "Seed demo data / Clear data" chỉ có ở debug.
- **D-008** · 2026-11-06 · UI chuẩn — **Chốt**
  Lấy Apple Health làm chuẩn về cấu trúc màn hình (Summary, Browse, Metric detail D/W/M/6M/Y, "Show All Data"),
  nhưng giữ design system Material 3 của app (không bắt chước giao diện iOS).

- **D-009** · 2026-11-06 · Emulator — **Chốt**
  E2E chạy lặp trên `emulator-5554` (hc_api36, headless); lần chạy cuối sinh `build/e2e-report` chạy trên `emulator-5556`
  (hc_research_api36, Pixel 6 API 36, có cửa sổ) để bạn xem trực tiếp. Mọi lệnh adb/gradle chỉ định serial rõ ràng.

- **D-010** · 2026-11-06 · Repo hygiene — **Chốt**
  `docs/re-evidence/zepp/jadx-base` (627 MB, 49k file decompile) đang được track trong git, trái D-003/D-004.
  Đã `git rm -r --cached` + thêm `docs/re-evidence/*/jadx-base/` vào `.gitignore`; file vẫn còn trên đĩa (bị ignore).
  Không viết lại lịch sử git (thao tác phá huỷ) trừ khi bạn yêu cầu.

<!-- Các agent thêm quyết định mới bên dưới, đánh số tiếp D-1xx (COROS) và D-2xx (E2E/UI). -->

## COROS driver

- **D-101** · 2026-11-06 · Phân tích bị chặn bởi đóng gói (shell) — **Chốt**
  `coros-4.11.8.apk` bị một SDK gia cố (app hardening) thương mại bọc: `classes.dex` 89 MB nhưng header
  DEX tự nhất quán chỉ khai báo 30 class thật (lớp vỏ `com.zgpgarg.zmr.kcaqqgc.*`), phần còn lại không
  có header DEX hợp lệ nên jadx/rea không decompile được. Quyết định **không viết công cụ unpack riêng**
  cho SDK bảo vệ bên thứ ba (ngoài phạm vi "RE giao thức thiết bị", tốn effort lớn, không chắc khả thi).
  Lý do: phạm vi nhiệm vụ là giao thức BLE với đồng hồ, không phải phá lớp chống dịch ngược của app.
- **D-102** · 2026-11-06 · Nguồn bằng chứng thay thế — **Chốt**
  Dùng `strings -n 6 classes.dex` (tên lớp/hằng số/UUID vẫn ở dạng cleartext, entropy ~5-6 bit/byte,
  không phải ciphertext) làm bằng chứng [V] thay cho trích dẫn `file:line` thật. Mọi bằng chứng đã chắt
  lọc vào `docs/re-evidence/coros/*.md` (không commit file strings đầy đủ 648K dòng, chỉ trích đoạn +
  lệnh `grep` để tái lập). Lý do: minh bạch, tránh lặp lỗi commit `jadx-base` đầy đủ như
  `docs/re-evidence/zepp/jadx-base` (627 MB, vi phạm "never commit decompiled sources" — phát hiện
  trong lúc làm, không sửa vì thuộc vendor khác, agent khác phụ trách).
- **D-103** · 2026-11-06 · Phạm vi triển khai `driver/coros` — **Chốt**
  Vì không có bằng chứng byte-level (command ID, frame layout, bước handshake cụ thể), driver chỉ làm:
  nhận diện (tên quảng bá + UUID service tuỳ biến), bond OS, đọc Device Information (0x180A) + Battery
  (0x180F) chuẩn SIG qua `StandardGattReader`. KHÔNG khai báo `HISTORY_SYNC`/`LIVE_HEART_RATE` trong
  `capabilities` (driver chưa thực sự lấy được dữ liệu đó) — tránh hứa sai với UI. `sync()` trả 0 bản
  ghi, có `TODO(coros-protocol)` trỏ `docs/protocols/COROS_DEVICE_PROTOCOL.md` §6.
  Lý do: tuân thủ "không suy đoán byte-layout" của `wearable-driver-engineer.md`.
- **D-104** · 2026-11-06 · UUID dùng để nhận diện — **Tạm**
  Dùng 2 họ UUID tuỳ biến có mẫu service+2 characteristic cùng base (biến thể "weloop" của Nordic UART,
  họ `ADF70001/2/3-6B99-45E9-98E6-DF67A4C3D291`) cộng DFU Nordic chuẩn (`1530/1531/1532`) làm tín hiệu
  `VENDOR_SERVICE` khi có mặt trong `Advertisement`; không chặn khi thiếu (tên quảng bá vẫn đủ điểm
  `NAME`). Chưa xác nhận các UUID này có thực sự xuất hiện trong gói quảng bá hay chỉ sau khi connect.
  Cần xác nhận bằng HCI snoop log thật.
- **D-105** · 2026-11-06 · Bonding — **Tạm**
  `LinkRequirements(bond = true)` dựa trên bằng chứng app có lắng nghe `ACTION_BOND_STATE_CHANGED` và có
  lớp `YfBtSystemBondAuth` (tên ghép rõ "System Bond" + "Auth"). Chưa xác nhận thứ tự bond trước/sau
  handshake giao thức trên đồng hồ thật.
- **D-106** · 2026-11-06 · Credential — **Chốt**
  Không thêm `CredentialRequirement` nào cho COROS: không có bằng chứng cần khoá cấp từ cloud để pair
  qua BLE trực tiếp (khác Zepp). "COROS Partner SDK" (AIDL `ICRSPartnerBleService`, xác thực bằng
  `BizPublicKey`/`NetAuthRequest`) là một con đường tích hợp CHÍNH THỨC khác, độc lập với BLE trực tiếp
  tới đồng hồ — không triển khai trong driver này (ghi nhận làm hướng mở rộng tương lai nếu sản phẩm
  muốn đăng ký đối tác COROS).
- **D-107** · 2026-11-06 · `WearableVendor.COROS` — **Chốt**
  `core/model/.../Device.kt` chưa có `COROS` → bắt buộc phải thêm (đúng điều kiện "chỉ thêm khi thực sự
  cần" trong chỉ dẫn nhiệm vụ). Đây là thay đổi duy nhất chạm tới `core/*`; không sửa gì khác trong
  `core/ble`, `core/data`, `feature/*`.

- **D-108** · 2026-11-06 · Hướng tiếp theo cho dữ liệu COROS — **Tạm** (main session)
  Vì APK 4.11.8 bị gia cố, thứ tự ưu tiên: (1) HCI snoop log từ đồng hồ COROS thật của bạn (Developer options →
  Bluetooth HCI snoop log, pair + sync bằng app COROS, `adb bugreport`) — nguồn sạch nhất cho byte-level;
  (2) thử APK COROS bản cũ không bị gia cố để đối chiếu; (3) trong lúc chờ, bản release lấy dữ liệu COROS qua
  Health Connect (app đã có) nếu app COROS ghi vào Health Connect, driver BLE chỉ làm nhận diện/pin/thông tin máy.
  Không unpack lớp bảo vệ của app (giữ D-101).

## E2E / UI

- **D-201** · 2026-11-06 · Mock provider / build — **Chốt**
  Toàn bộ code mock/demo (driver "Demo watch", GATT giả, generator dữ liệu, seeder) nằm trong module mới `:core:demo`, app chỉ khai báo `debugImplementation(projects.core.demo)`.
  Lý do: bản release không chứa class mock nào (D-006), không cần cờ runtime; Hilt tự gom module Hilt của `:core:demo` chỉ ở biến thể debug/androidTest.
- **D-202** · 2026-11-06 · Fake BLE cũ — **Chốt**
  Xoá stack giả cũ (`FakeDeviceScanner/Connection/HealthDataSync`, `FakeHealthDataRepository`, qualifier `UseFakeBle`, cờ `-PunifiedHealth.fakeBle`). Release luôn dùng stack multi-vendor thật + Room.
  Lý do: stack cũ được bật trong release khi máy không có BLE và không đi qua pipeline sync thật; mock watch mới thay thế hoàn toàn (đi qua driver → session → sink → Room).
- **D-203** · 2026-11-06 · Cơ chế mock — **Chốt**
  Thêm `WearableVendor.DEMO` và điểm cắm `VirtualDevice` (Hilt `@Multibinds`, rỗng ở release) trong `:core:ble`: scanner gộp quảng bá ảo + BLE thật, connector trả GATT trong bộ nhớ cho địa chỉ ảo. Tắt mock ở debug: `-PunifiedHealth.mockDevice=false`.
  Lý do: mock dùng đúng `MultiVendorDeviceConnection` / `DriverRegistry` / `MultiVendorHealthDataSync` như đồng hồ thật, nên E2E kiểm được pipeline thật; lỗi BLE thật (emulator không có adapter) bị nuốt khi có thiết bị ảo.
- **D-204** · 2026-11-06 · Storage schema — **Chốt**
  Giữ bảng Room `health_samples` (type text + value) và `workouts`, không tăng version DB; thêm type mới `resting_heart_rate`, `hrv_ms`, `daily_exercise_min` và `HealthRecord.RestingHeartRate` / `HeartRateVariability` / `DailyActivity.exerciseMinutes`.
  Lý do: bảng generic đã đủ, thêm type là chuỗi mới nên không cần migration; driver cũ không bị ảnh hưởng (tham số mặc định).
- **D-205** · 2026-11-06 · Seed data — **Chốt**
  `DemoHealthDataGenerator` seed cố định 42, 90 ngày đến "bây giờ" (hôm nay tính đến giờ hiện tại), ghi qua `HealthRecordSinkFactory` với deviceId = địa chỉ mock watch (`02:DE:30:00:00:01`).
  Lý do: seed và sync của mock watch sinh cùng một dữ liệu và cùng khoá (device, type, start) nên ghi đè thay vì nhân đôi; idempotent khi seed lại.
- **D-206** · 2026-11-06 · Quy tắc tổng hợp — **Chốt**
  D = 24 cột theo giờ (ngủ: 1 đêm); W/M = 7/30 ngày; 6M = 26 tuần (bắt đầu thứ Hai); Y = 12 tháng. Chỉ số cộng dồn (bước, quãng đường, năng lượng, phút tập): D/W/M là tổng, 6M/Y là trung bình tổng-ngày của các ngày có dữ liệu; header D = TOTAL, còn lại = AVERAGE. Chỉ số rời rạc (HR, HR nghỉ, HRV, SpO2, stress): trung bình + min/max mỗi cột; header HR = RANGE, còn lại = AVERAGE. Ngủ: phút ngủ (trừ AWAKE) mỗi đêm, đêm thuộc về buổi sáng nó kết thúc (18:00 → 18:00).
  Lý do: khớp ngữ nghĩa Apple Health; cột trống không kéo trung bình/min xuống; nhiều thiết bị cùng ngày lấy max (không cộng). Logic thuần ở `MetricSeriesBuilder` / `MetricStatsCalculator` để test JVM.
- **D-207** · 2026-11-06 · Biểu đồ theo giờ của chỉ số chỉ có tổng ngày — **Tạm**
  Quãng đường / năng lượng / phút tập ở chế độ D được chia theo tỉ lệ bước chân từng giờ (thiết bị hiện chỉ báo tổng ngày).
  Lý do: tránh biểu đồ D trống; thay bằng dữ liệu theo giờ thật khi driver cung cấp.
