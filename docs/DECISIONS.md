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

- **D-011** · 2026-11-06 · APK & dữ liệu phân tích — **Chốt**
  `docs/apks/*.part-*` (APK app hãng: Garmin Connect, Huawei Health, Zepp, COROS) và `docs/re-evidence/*` chỉ là đầu vào
  phân tích, không nằm trong build/release của app. Giữ nguyên trong git (kể cả lịch sử) cho tới khi xong hết; bạn sẽ báo lúc nào xoá/purge.

- **D-012** · 2026-11-06 · Phân công model — **Chốt**
  Phân tích app cũ (rea/jadx, lấp chỗ trống giao thức): mỗi hãng 1 tiến trình `claude -p --model claude-sonnet-4-6` riêng
  (lỗi không ảnh hưởng session chính), chỉ viết docs. Viết code driver: agent riêng mỗi hãng, chỉ sửa `driver/<hãng>`.
  Làm xong hãng nào: unit test + E2E hãng đó → commit + push.

## Gộp màn hình từ Garmin/Huawei/Zepp (D-8xx)

- **D-013** · 2026-11-06 · Cách tiếp cận gộp UI — **Chốt**
  Máy đang full RAM (còn ~115 MB, 5 agent + 2 emulator đang chạy) nên KHÔNG mở thêm app/emulator để chụp màn hình sống.
  Thay vào đó: 1 agent riêng, phân tích tĩnh resource đã decompile sẵn (garmin-analysis/, docs/re-evidence/zepp/jadx-base/,
  rea-output/ của Huawei — strings.xml, tên activity/fragment, nav-graph, menu) để liệt kê toàn bộ màn hình/tính năng
  3 app, viết docs/SCREEN_INVENTORY.md (bảng hãng × màn hình × tương đương trong Unified Health × còn thiếu),
  rồi log quyết định nên làm ngay / để sau dưới mục này. Agent đó CHỈ được sửa docs/ ở lượt này — không đụng feature/*,
  app/*, settings.gradle.kts vì agent driver + E2E đang sửa các file đó. Triển khai code các màn hình mới sẽ là đợt
  agent tiếp theo, chạy sau khi đợt hiện tại (driver + E2E) xong để tránh xung đột file và quá tải RAM.

- **D-801** · 2026-11-06 · Chất lượng bằng chứng & phạm vi `docs/SCREEN_INVENTORY.md` — **Chốt**
  Garmin và Huawei chỉ có `AndroidManifest.xml` + `permissions.txt` (không có `strings.xml`) nhưng tên class
  KHÔNG bị obfuscate (đọc được thẳng `com.garmin.android.apps.connectmobile.*` / `com.huawei.*`), nên liệt kê
  màn hình theo tên Activity, không trích được tiêu đề UI thật. Zepp có jadx đầy đủ (sources + resources +
  strings.xml 10.648 dòng) — bằng chứng tốt nhất, có cả copy UI thật. COROS không decompile được (shell đóng
  gói) nhưng `strings -n 6 classes.dex` (đã có sẵn ở `rea-output/coros/strings_classes.txt`) vẫn lộ ~300 tên
  class `Activity<Tên>Binding`/`Fragment<Tên>Binding` do ViewBinding sinh tự động lúc build — dùng làm bằng
  chứng gián tiến "màn hình này tồn tại" (không biết nội dung/copy). "Không tìm thấy" trong bảng KHÔNG đồng
  nghĩa "chắc chắn không có" — không nguồn nào là full UI tree.
  Lý do: tránh decompile/emulator thêm (RAM gần cạn, D-013); minh bạch mức độ tin cậy khác nhau giữa 4 hãng
  thay vì giả vờ bằng chứng đồng đều.

- **D-802** · 2026-11-06 · Ưu tiên P0 trong kế hoạch gộp màn hình — **Tạm**
  5 hạng mục P0 (khả thi ngay, không cần driver mới): (1) màn chi tiết bài tập (workout detail: thời lượng,
  quãng đường, calo, nhịp tim TB/max — Garmin driver đã map sẵn qua `FitHealthMapper.mapSession`), (2) tổng
  kết "training load" dạng chung chung (không đặt tên/thương hiệu) từ dữ liệu driver đã có, (3) màn "About
  this device" thay cho mục `"Device settings (coming soon)"` đang bị disable ở `DevicesScreen.kt:277`
  (model/battery/firmware đã có sẵn trong `WearableDevice`), (4) màn cài đặt Thông báo thay cho stub
  `"Notifications: Coming soon"` ở `ProfileScreen.kt` (chỉ phần UI chọn app forward, chưa cần đẩy xuống
  đồng hồ), (5) rà Browse category — hiện đã phủ hết `HealthMetricType` đang có, không thiếu category nào
  ở mức dữ liệu hiện tại. Phát hiện thêm (không phải gap, là nợ kỹ thuật): `feature/sleep/SleepScreen.kt`
  đã đăng ký trong `UnifiedHealthNavHost` nhưng không ai gọi `navigateToSleep` — màn hình mồ côi, Giấc ngủ
  thật ra hiện qua `MetricDetailScreen` dùng chung.
  Lý do: đúng tiêu chí "gap rõ, giá trị cao, khả thi không cần dữ liệu phần cứng mới" theo yêu cầu nhiệm vụ;
  **Tạm** vì đợt agent tiếp theo (code) mới là người quyết thứ tự làm thật và có thể điều chỉnh sau khi đọc
  toàn bộ `docs/SCREEN_INVENTORY.md`.

- **D-803** · 2026-11-06 · Những gì CỐ TÌNH không gộp (P2/out of scope) — **Chốt**
  Không tái tạo tên/thuật toán độc quyền của hãng khác: Garmin "Body Battery"/"Training Readiness"/"Race
  Predictor", Firstbeat VO2max/recovery-time (Garmin + Zepp dùng chung engine này), Zepp "PAI", Huawei
  "stress_and_relax" (TruRelax-style) — điểm số chung chung 0-100 ta đã có là đủ, không gắn tên/công thức
  của hãng khác. Không làm Social/Challenges/Groups và Account/cloud login vì cần backend, trái nguyên tắc
  "chỉ lưu trên máy, không backend" (D-001). Không làm watch face gallery (định dạng nhị phân riêng từng
  hãng/firmware, coi như một dự án RE riêng mỗi hãng, rủi ro bản quyền thiết kế mặt đồng hồ). Không làm
  firmware OTA push (rủi ro brick máy, không có byte-layout đã xác minh cho hãng nào, trái nguyên tắc "không
  tự bịa layout" của driver contract) — chỉ hiển thị version hiện tại (đã có, read-only) là đủ ở giai đoạn này.
  Lý do: giữ đúng tinh thần "app tôn trọng riêng tư, một app thay thế 4 app" chứ không phải sao chép tính
  năng mạng xã hội/tài khoản của hãng khác; tránh rủi ro pháp lý (thương hiệu/bằng sáng chế) và rủi ro an
  toàn thiết bị (OTA sai layout).

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
- **D-208** · 2026-11-06 · Cấu trúc màn hình — **Chốt**
  Thanh điều hướng: Summary · Browse · Activity · Devices · Profile. Summary = thẻ Pinned (chọn bằng Edit, lưu DataStore `pinned_metrics`), vòng Move/Exercise/Steps, Highlights (7 ngày gần nhất so với 7 ngày trước). Browse = danh mục (Activity, Heart, Respiratory, Sleep, Mental wellbeing, Body) + tìm kiếm → Metric detail (D/W/M/6M/Y, header TOTAL/AVERAGE/RANGE, biểu đồ, Show all data). Sleep rời thanh điều hướng, vào qua Browse › Sleep (màn Sleep cũ giữ route nhưng không còn lối vào).
  Lý do: giống cấu trúc Apple Health (D-008) mà vẫn ≤ 5 tab M3; tính năng Browse/Detail đặt trong `:feature:home` để khỏi thêm module.
- **D-209** · 2026-11-06 · Thư viện biểu đồ — **Chốt**
  Tự vẽ bằng Compose Canvas (`HealthBarChart`, `HealthRangeChart` min–max, `SleepStageChart` hypnogram + legend) trong `:core:designsystem`, không thêm Vico.
  Lý do: không thêm dependency, kiểm soát được kiểu Apple Health (lưới giá trị bên phải, nhãn trục không chồng nhau, đường trung bình), có contentDescription cho a11y và test.
- **D-210** · 2026-11-06 · Đa thương hiệu ở Devices — **Tạm**
  Ghép đôi được nhiều đồng hồ (mỗi thẻ hiện brand, trạng thái, pin, lần sync cuối, nút sync riêng); dữ liệu gộp theo D-206 và "Show all data" ghi nguồn (tên thiết bị · brand). Nhưng tại một thời điểm chỉ một liên kết GATT hoạt động (kiến trúc `MultiVendorDeviceConnection` hiện tại); kết nối máy thứ hai sẽ ngắt máy thứ nhất.
  Lý do: đủ cho D-001 ở mức UI/dữ liệu; kết nối đồng thời nhiều đồng hồ là việc của tầng `:core:ble` (để agent driver quyết).
- **D-211** · 2026-11-06 · Test runner E2E — **Chốt**
  `HiltTestRunner` (HiltTestApplication, graph thật + `:core:demo`), Android Test Orchestrator (mỗi test một process, không `clearPackageData`; test tự xoá DB/DataStore trước khi mở Activity), Compose `createEmptyComposeRule` + `ActivityScenario`, UiAutomator bấm hộp thoại quyền hệ thống. Ảnh chụp mỗi bước bằng `UiAutomation.takeScreenshot()` ghi qua TestStorage (`/sdcard/googletest/test_outputfiles/e2e-report/<NN-flow>/<NN-step>.png|.json`), AGP tự kéo về; `scripts/e2e.sh [serial]` gom vào `build/e2e-report/` và `scripts/e2e_report.py` sinh `index.html` + `README.md`.
  Lý do: orchestrator tránh lỗi "multiple DataStores" giữa các test Hilt; TestStorage sống sót sau khi AGP gỡ app; ảnh toàn màn hình chụp được cả hộp thoại hệ thống.
- **D-212** · 2026-11-06 · Fallback khi không có emulator — **Tạm**
  Không có thiết bị và không boot được AVD: `e2e.sh` vẫn chạy unit test JVM và sinh report ghi rõ "flow instrumented không chạy" kèm kết quả JUnit; không dùng Robolectric/Roborazzi.
  Lý do: máy này có AVD nên đường chính luôn là emulator thật; thêm Roborazzi tốn dependency/cấu hình mà ảnh JVM không phản ánh hộp thoại hệ thống. Xem lại nếu cần chạy trên CI không có emulator.

## Huawei driver (D-3xx)

## Garmin driver (D-4xx)

## Zepp driver (D-5xx)

- **D-501** · 2026-11-06 · Zepp giao thức — **Chốt**
  Auth decision KHÔNG dựa vào phiên bản channel (v1/v2) mà dựa vào danh sách module: `supportModule(0x80) || supportModule(0x82)` → channel-based; không có → char 0x0009.
  Hệ quả: `ZeppHandshake.kt:56` cần truy vấn BuiltInModule trước khi throw `UnsupportedDeviceException` cho channel v1; nếu danh sách có module 0x80 → auth qua module 0x80, không phải 0x0009. Nguồn: `DeviceAuthorizationFactory.java:88-94` [V].

- **D-502** · 2026-11-06 · Zepp giao thức — **Chốt**
  SpO2 v2 (`Spo2PointDataExtends`): bản ghi 65 byte `[timestamp u32 LE, spo2 u8, spo2History byte[60]]`. Selector: byte[1] của chunk đầu khi `supportVersion==true`. Driver hiện lưu v2 dưới dạng `RawPayload`; cần thêm parse 65-byte và tạo 60 bản ghi `HealthRecord.SpO2` lịch sử với timestamp tổng hợp. Nguồn: `Spo2PointDataExtends.java:41-51`, `HMSyncSpo2Profile.java:63-77` [V].

- **D-503** · 2026-11-06 · Zepp giao thức — **Chốt**
  Module 0x80 session auth (đồng hồ channel v1 không ECDH): 3 bước — getAuthorizationInfo `[0x00]`, requestRandomNumber `[0x04, 0x01, 0x00, 0x02]`, authorize `[0x05, AES_ECB(random, authKey)(16)]`. Không có session key, không mã hoá channel. API_LEVEL = 1. Nguồn: `AuthModule.java:401-411, 424-435, 512-538` [V].

- **D-504** · 2026-11-06 · Zepp giao thức — **Chốt**
  Sleep module 0x32 là **phone → watch** chỉ chiều. `SleepDataCodec.decode()` = `throw NotImplementedError`. Driver không cần implement đọc ngủ từ module này; ngủ đọc qua activity heuristic (libdataProcess) hoặc GDSP type 0x08. Nguồn: `SleepDataCodec.java` [V].

- **D-505** · 2026-11-06 · Zepp giao thức — **Chốt**
  Stress all-day (type 19): byte[1..N] = giá trị stress/phút (u8). Stress single (type 18): bản ghi 5 byte `[timestamp u32 LE, stress u8]`. Cả hai loại chưa có trong `ZeppSession.SYNC_TYPES`; cần thêm vào danh sách sync và parser. Nguồn: `HMProSyncDataProfile.M()`, `parsePressureSingleData()` [V].

- **D-506** · 2026-11-06 · Zepp giao thức — **Chốt**
  PnP ID (char 0x2A50) layout xác nhận: 7 byte `[vendorSource u8, vendorId u16 LE, productId u16 LE, productVersion u16 LE]`. Đây là chuẩn BT Assigned Numbers §6.5. Nguồn: `BaseProfile.setPnpInfo():406-430` [V].

- **D-507** · 2026-11-06 · Zepp giao thức — **Tạm**
  Resting HR (GDSP type 58): hằng số tìm thấy tại `HMProSyncDataBaseProfile.java:71` nhưng parse method không tìm thấy trong sources (bị R8 obfuscate hoặc nằm trong class decompile lỗi). [I] Suy luận bản ghi 5 byte `[timestamp u32 LE, bpm u8]` theo mẫu tương tự type 18. Cần xác nhận bằng HCI snoop log trên thiết bị thật.

## Standard BLE driver (D-6xx)

- **D-601** · 2026-11-06 · Phạm vi `driver/standard` — **Chốt**
  Nguồn duy nhất là spec công khai của Bluetooth SIG [Ext] (HRS, BAS, DIS, CTS, PLXS, RSCS, BLS, HTS, WSS, BCS); không có app hãng để RE nên không có mục NEEDS-REAL-WATCH. Bước/quãng đường/calo theo ngày, giấc ngủ, stress, workout **không tồn tại** trong các service SIG → không làm, không để `TODO(standard-protocol)`; đồng hồ có các dữ liệu đó sẽ đi qua driver hãng.
- **D-602** · 2026-11-06 · Nhận diện — **Tạm**
  Nhận khi quảng bá có một service sức khoẻ SIG (HR, PLX, RSC, BP, nhiệt kế, cân, body comp) với điểm `STANDARD_SERVICE` (20); chỉ Battery/DIS/CSC thì không nhận. Driver hãng có vendor service/manufacturer data (80/100) luôn thắng; đồng hồ hãng chỉ khớp theo tên (10) mà đang phát HR sẽ vào driver standard (ít nhất có HR live) — cần xem lại nếu driver hãng nào chỉ nhận diện được bằng tên.
- **D-603** · 2026-11-06 · Buffer & reconnect — **Chốt**
  Dữ liệu SIG chủ yếu là luồng live, nên driver (singleton) giữ buffer theo địa chỉ thiết bị (tối đa 20 000 bản ghi, bỏ cũ nhất); session mới sau mất kết nối dùng lại buffer. Bàn giao 2 pha: chỉ xoá khỏi buffer sau khi sink ghi thành công.
  Lý do: mất link hoặc sink lỗi không làm mất mẫu; Room upsert theo (device, type, start) nên giao lại là idempotent.
- **D-604** · 2026-11-06 · HRV — **Tạm**
  Tính RMSSD từ RR-interval của Heart Rate Measurement: cửa sổ 60 s, cần ≥ 20 hiệu số, bỏ RR ngoài 300–2000 ms và nhịp đổi > 20 % (ngoại tâm thu). Sync xả cửa sổ dở nếu đủ 20 hiệu số.
  Lý do: SIG chỉ truyền RR, không có HRV; RMSSD ngắn hạn là chuẩn phổ biến cho HRV đo bằng dây đeo.
- **D-605** · 2026-11-06 · Bước chân từ RSC — **Tạm**
  Tích phân cadence tức thời (coi là bước/phút) thành bucket bước theo phút; khoảng trống > 5 s không tính. Bucket dở được giao khi sync và ghi đè cùng khoá start khi hoàn tất. Chưa dùng tốc độ/quãng đường tổng của RSC (không có bản ghi quãng đường theo khoảng thời gian).
  Lý do: footpod/đồng hồ SIG không lưu lịch sử bước; đơn vị cadence "1/min" có thiết bị báo theo một chân — cần đối chiếu trên footpod thật.
- **D-606** · 2026-11-06 · CSC và User Data Service — **Chốt**
  Không giải mã CSC (0x1816): chỉ có số vòng bánh/đùi, cần chu vi bánh xe do người dùng nhập và model chưa có kiểu tốc độ/cadence. Không dùng UDS (0x181C): cần consent code + user index và ghi hồ sơ người dùng lên thiết bị — chưa có luồng UI.
- **D-607** · 2026-11-06 · Huyết áp / nhiệt độ / cân / body comp — **Tạm**
  `:core:model` chưa có kiểu bản ghi cho các đo này; driver vẫn bật indication, kiểm tra frame và lưu nguyên bản dưới dạng `HealthRecord.RawPayload` (`sig_blood_pressure`, `sig_temperature`, `sig_weight`, `sig_body_composition`, `createdAt` = timestamp của thiết bị). Không đổi core.
  Lý do: không mất dữ liệu, có thể import lại khi core thêm kiểu; không tính vào số bản ghi sync.
- **D-608** · 2026-11-06 · Pulse oximeter — **Chốt**
  Mỗi lần sync chạy RACP "Report stored records / All records" (PLXS không có bộ lọc theo thời gian/sequence), chờ Response Code tối đa 60 s (quá hạn thì gửi Abort), **không xoá** bản ghi trên máy. Bản ghi lưu không có timestamp hợp lệ (đồng hồ máy chưa đặt) bị bỏ. Continuous giữ tối đa 1 mẫu SpO2/10 s; bỏ mẫu có status invalid/unavailable/questionable/demo/test. Pulse rate của PLX chỉ lưu làm nhịp tim khi máy không có Heart Rate service (tránh trùng).
- **D-609** · 2026-11-06 · Đồng bộ giờ — **Chốt**
  Khi mở session, nếu Current Time (0x2A2B) / Local Time Information (0x2A0F) cho ghi thì ghi giờ điện thoại (adjust reason = manual); lỗi/timeout chỉ log, không chặn kết nối. CTS chỉ đọc thì để nguyên.
  Lý do: timestamp của bản ghi PLX/BP/cân phụ thuộc đồng hồ thiết bị.
- **D-610** · 2026-11-06 · Link — **Tạm**
  `LinkRequirements()` mặc định (không chủ động bond, không xin MTU): HRS/RSCS không yêu cầu bảo mật; thiết bị y tế cần mã hoá sẽ trả "insufficient authentication" và Android tự bật ghép đôi. Cần kiểm trên máy đo huyết áp/SpO2 thật.
- **D-611** · 2026-11-06 · E2E — **Chốt**
  `:core:demo` có `StandardVirtualWatch` ("SIG Pulse Band", `02:5D:00:00:18:0D`): GATT trong bộ nhớ chỉ nói các service SIG (HR 1 Hz + RR, Battery, DIS, CTS ghi được, PLX spot-check + RACP với 7 ngày × 3 lần đo, RSC), không có mock driver — được `:driver:standard` thật phục vụ. Module Hilt riêng (`StandardVirtualWatchModule`), tắt cùng cờ `MOCK_DEVICE`. E2E `StandardWatchE2ETest`, flow `60-standard-watch`.

## Release readiness (D-7xx)
