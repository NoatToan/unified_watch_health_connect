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

- **D-804** · 2026-11-06 · Danh sách + chi tiết bài tập (P0-1) — **Chốt**
  Tab Activity nhóm bài tập theo tháng (mới nhất trước), bấm vào mở `WorkoutDetailDestination(workoutId)`: môn, giờ bắt đầu–kết thúc, thời lượng, quãng đường, kcal, pace (chạy/đi bộ/bơi) hoặc tốc độ (đạp xe), nhịp tim TB/max, biểu đồ nhịp tim (tối đa 30 cột min–max, dùng lại `HealthRangeChart`), thiết bị nguồn. Id bài tập = khoá chính `<deviceId>@<startEpochMs>`; nhịp tim lấy đúng thiết bị đã ghi bài tập; TB/max của đồng hồ ưu tiên, thiếu thì tính từ mẫu. Thêm `Workout.sourceDeviceId`, `HealthDataRepository.observeWorkout/observeHeartRateSamples` (cộng thêm, không đổi schema Room). Bỏ nút "Start workout" (chỉ hiện snackbar "coming soon") — live workout vẫn là P2.
- **D-805** · 2026-11-06 · "Weekly activity load" chung, không thương hiệu (P0-2) — **Chốt**
  Mỗi bài tập: `load = phút × clamp(avgHR/100, 0.5, 2.0)` (không có HR → hệ số 1.0). Tuần = 7 ngày lăn kết thúc hôm nay; baseline = TB 4 tuần trước (tuần trống tính 0, cần ≥1 tuần có bài tập); ratio < 0.8 "thấp hơn", > 1.3 "cao hơn", còn lại "như thường lệ" (ngưỡng acute:chronic công khai). Logic thuần `ActivityLoadCalculator` (`:core:domain`, có unit test), thẻ đầu tab Activity + biểu đồ 8 tuần.
  Lý do: chỉ dùng dữ liệu driver đã có (start/end + avgHR); công thức minh bạch, không mượn tên/thuật toán độc quyền (D-803).
- **D-806** · 2026-11-06 · Màn "About this device" (P0-3) — **Chốt**
  Menu ⋮ của thẻ thiết bị: "Device settings" (thay mục disabled "coming soon") → `DeviceDetailDestination(deviceId)`: tên, hãng, model, firmware, pin, địa chỉ BT, ngày ghép đôi, lần sync cuối, khả năng (capabilities của phiên đang kết nối), trạng thái khoá xác thực, Connect/Sync now/Disconnect riêng thiết bị, Unpair (xác nhận, đóng màn). Thêm `WearableDevice.capabilities` + `pairedAt` (mặc định rỗng/null). Công tắc cảm biến (HR liên tục, theo dõi giấc ngủ) vẫn P1 vì cần lệnh ghi riêng từng hãng.
- **D-807** · 2026-11-06 · Cài đặt Thông báo (P0-4) — **Chốt**
  Profile › Notifications: 3 công tắc lưu DataStore (`notif_*` trong file `user_preferences`, repo riêng `NotificationPreferencesRepository` để không đổi `UserPreferencesRepository`) + thẻ xin quyền `POST_NOTIFICATIONS`. Có trigger thật: "Low watch battery" (≤ 20%, báo lại khi đã ≥ 30%) và "Goal achieved" (1 lần/ngày khi đạt mục tiêu bước) — `HealthAlertsMonitor` chạy trong `DeviceSyncService`, quy tắc thuần `WatchAlertRules`, trạng thái đã báo lưu DataStore. "Sync reminders" chỉ lưu lựa chọn, mặc định tắt, `TODO(notifications)` chờ WorkManager. Chuyển tiếp thông báo xuống đồng hồ vẫn P1.
- **D-808** · 2026-11-06 · Xoá `:feature:sleep` (P0-6) — **Chốt**
  Module `feature/sleep` (SleepScreen placeholder, không ai điều hướng tới) bị xoá khỏi `settings.gradle.kts`, `app` và NavHost. Giấc ngủ giữ ở Browse › Sleep (`MetricDetailScreen`: hypnogram D, xu hướng W/M/6M/Y, Show all data) theo D-208.
  Lý do: đã có màn đầy đủ hơn; giữ route mồ côi chỉ là nợ kỹ thuật.

- **D-014** · 2026-11-06 · Dùng chung emulator — **Chốt**
  Chỉ chạy 1 emulator (`emulator-5554`) để tiết kiệm RAM. Mọi lần chạy test instrumented, `adb install` hoặc `pm clear` phải đi qua
  khoá `emu-lock.sh` (dùng `mkdir` làm mutex), vì các agent chạy chồng nhau sẽ gỡ APK của nhau giữa chừng.
  Build cache Gradle từng bị hỏng khi nhiều agent build song song (`:driver:zepp` chỉ dex được 2/108 class) → gặp `NoClassDefFoundError` thì build lại với `--no-build-cache`.

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

- **D-109** · 2026-11-06 · Native lib COROS đã phân tích (`libPbSource.so`, `libw4-jni.so`) — **Chốt**
  `lib/arm64-v8a/libPbSource.so` (7,2 MB) và `libw4-jni.so` (11,4 MB) **không phải** code BLE transport —
  đây là lớp xử lý dữ liệu sport/health (parse protobuf sau khi nhận) và JNI bridge cho C++ parser "WeLoop4".
  Không chứa code tầng `BleCmdPb`/`BleCmdDefPb`. Vẫn hữu ích: xác nhận tên proto file (`CRSLDailySleep.proto`,
  `syn_info.proto`, `watch_settings.proto`…), tên message class (`HrvInfo`, `PPGHrvInfo`, `DailyStress`,
  `SportSummaryPb`…), và loại dữ liệu sync (`SYN_FILE_TYPE_DAILY_RECORD`, `SPORT`, `VOICE_NOTE`…).
  Bằng chứng chắt lọc vào `docs/re-evidence/coros/native-lib-analysis.md`, protocol doc cập nhật §6.
  Lý do: giữ D-102 (không commit file lớn, chỉ chắt lọc bằng chứng có ý nghĩa).

- **D-110** · 2026-11-06 · Luồng sync "new protocol" — **Tạm**
  Có phân nhánh "old protocol" (dừng sau `getDailyData`) và "new protocol" (gọi tiếp `getDynamicHeartRate`
  sau `getDailyData`) xác nhận bằng chuỗi log trong `classes.dex` [V]. Cơ chế phân biệt tại GATT layer
  (version byte? capability flag? service UUID?) chưa xác định. Giả thuyết: app kiểm tra `SUPPORT_COMMON_PB_CMD`
  trong capability negotiation và chọn nhánh theo đó. Driver giữ TODO(coros-protocol) cho cả hai nhánh; ghi nhận
  trong `COROS_IMPLEMENTATION_BRIEF.md §1.2`.
  Lý do: không tự bịa protocol version detection khi chưa có byte-level evidence.

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

- **D-301** · 2026-11-06 · Không ship authenticator thật — **Chốt**
  `HUAWEI_DEVICE_PROTOCOL.md` §6/§9 kết luận cả 3 cơ chế xác thực (legacy HMAC, HiChainLite, HiChain/
  HiChain3) đều cần bí mật của vendor (CAK trong white-box, hoặc native `libhichain_sdk_jni.so`) mà
  dự án không được trích xuất (D-004). `HuaweiDriverModule` (main source set) khai báo
  `Set<HuaweiAuthenticator>` rỗng (`@Multibinds`) — đúng và giữ nguyên. Hệ quả: `HuaweiSession.open`
  luôn dừng ở `UnsupportedDeviceException` với thông điệp rõ ràng trỏ người dùng sang Huawei Health +
  Health Connect (§9 Option A) khi gặp đồng hồ Huawei thật. Đây là hành vi "production-ready" đúng
  nghĩa cho một giao thức mà chính tài liệu RE khuyến cáo không nên tự làm cho sản phẩm thương mại.
  Lý do: tuân thủ pháp lý + "không suy đoán layout"; thà từ chối rõ ràng còn hơn giả vờ kết nối được.
- **D-302** · 2026-11-06 · `capabilities` không khai HISTORY_SYNC/LIVE_HEART_RATE — **Chốt**
  `HuaweiSession.capabilities` chỉ còn `BATTERY_LEVEL` (khi GATT Battery 0x180F có mặt). Bỏ
  `HISTORY_SYNC` (bản cũ khai cứng dù `sync()` chỉ lưu `RawPayload` không ai đọc được) theo đúng tiêu
  chí nhiệm vụ "chỉ khai những gì thật sự chạy được", cùng tinh thần D-103 (COROS). Không thêm
  `LIVE_HEART_RATE` qua SIG Heart Rate Service như COROS vì tài liệu RE không có bằng chứng Huawei
  watch lộ service 0x180D (chỉ thấy FE86/0x181C/0x1805, §3.1) — COROS có ít nhất bằng chứng gián tiếp
  (chest strap HR01/HR31), Huawei thì không, nên không suy đoán thêm.
  Lý do: "declare in capabilities only what really works" (chỉ dẫn nhiệm vụ) áp dụng chữ nghĩa.
- **D-303** · 2026-11-06 · `sync()` = full raw sweep, không bịa response layout — **Chốt**
  Viết lại `HuaweiSession.sync()`: gửi đủ 4 lệnh service 7 đã có REQUEST layout xác minh ([V] §7.2) —
  cmd 3 (today total), cmd 4/10/12 (đếm frame health/sample/status, đúng khung thời gian
  `SyncRequest.effectiveSince()..now`) — mỗi phản hồi được chấp nhận lưu nguyên dạng
  `HealthRecord.RawPayload` (khoá theo `kind`), lệnh bị watch từ chối (TLV lỗi 0x7F) chỉ log + bỏ qua
  (không huỷ cả lượt sync); chỉ lỗi transport (timeout/mất link) mới abort. KHÔNG parse TLV đếm số
  frame hay lặp `getXFrame(index)` vì đó là suy đoán layout phản hồi (tài liệu chỉ xác nhận REQUEST,
  không xác nhận RESPONSE, §7.2/§10 "[?] response payload chi tiết") — vi phạm "never invent a
  layout" của `wearable-driver-engineer.md`. `sync()` vẫn trả 0 bản ghi có kiểu (đúng vì không có).
  Lý do: tận dụng tối đa phần giao thức đã xác minh (request) mà không bịa phần chưa xác minh
  (response); `TODO(huawei-protocol)` giữ nguyên ở đúng chỗ còn thiếu bằng chứng (NEEDS-REAL-WATCH).
- **D-304** · 2026-11-06 · Giả lập E2E cần một "authenticator giả lập" debug-only — **Chốt**
  Để bài E2E đi qua pipeline thật (scan → `recognize` → `openSession` → encrypt → sync), cần ít nhất
  MỘT `HuaweiAuthenticator` hoàn tất bắt tay thật (framing/CRC/TLV/cipher) — nhưng production không
  được ship authenticator thật nào (D-301). Giải pháp: `HuaweiSimulatorAuthenticator` +
  `HuaweiSimulatorAuthModule` đặt ở **source set `src/debug`** của `driver/huawei` (không nằm trong
  biến thể release, AGP tách biến thể tự nhiên) — trao đổi 1 round-trip trên tag 0113 (y hệt hình
  dạng AccessValidityAuth thật) nhưng đổi một khoá test cố định công khai, không phải HMAC/CAK/
  HiChain thật. Chặn an toàn: chỉ chạy khi `LinkParameters.raw` có TLV đánh dấu riêng (tag 0x11 =
  "UHSIM") mà chỉ `HuaweiVirtualWatch` (giả lập) gửi — đồng hồ thật không có TLV này nên thất bại
  nhanh (`AuthenticationException`) thay vì tốn 10s timeout. `mode = LEGACY_HMAC` vì đó đúng là
  nhánh "else" thật của `HuaweiAuthMode.candidatesFor` cho authType lạ (§6.1), không phải ánh xạ bịa.
  Lý do: tối đa hoá coverage code thật (framing/CRC/TLV/transport/cipher) trong E2E mà không ship bất
  cứ thứ gì giống xác thực thật vào bản người dùng cài, và không đụng vào `HuaweiDriverModule` chính.
- **D-305** · 2026-11-06 · `HuaweiVirtualWatch` tự viết lại wire codec, không phụ thuộc `:driver:huawei` — **Chốt**
  `core/demo/.../virtual/huawei/HuaweiWireCodec.kt` viết lại độc lập CRC-16/XMODEM, TLV varint, khung
  0x5A (chỉ frame đơn, không cần slice vì mọi payload mô phỏng đều nhỏ hơn `maxFrame` tự công bố) và
  bọc AES-CBC/PKCS5 — KHÔNG thêm dependency `core/demo → driver/huawei` và KHÔNG đổi các lớp `internal`
  của `driver/huawei` thành `public`. Lý do kỹ thuật: `internal` trong Kotlin chỉ hiện trong cùng
  module Gradle, không hiện qua dependency; đổi thành public chỉ để tiện demo sẽ làm lộ chi tiết triển
  khai của driver ra ngoài module nó, trái kiến trúc "driver tự khép kín" của mọi driver khác (Garmin/
  Zepp cũng không ai phụ thuộc ngược). CRC16/TLV/AES-CBC là thuật toán công khai, viết lại không phải
  "bịa giao thức" — chỉ `HuaweiWireCodec.TEST_WORK_KEY` (hằng số test cố định) là phần "bí mật" duy
  nhất, không liên quan CAK/HiChain thật (không vi phạm D-004).
- **D-306** · 2026-11-06 · Phạm vi assert của `HuaweiWatchE2ETest` — **Tạm**
  Flow `10-huawei-watch` chỉ assert: nhận diện đúng brand, bắt tay thật hoàn tất (Connected, pin/
  firmware đọc qua GATT chuẩn, gắn nhãn "Huawei"), sync chạy xong không lỗi, rồi unpair. KHÔNG assert
  "Summary hiện dữ liệu Huawei kèm nguồn" như mẫu `UserJourneyE2ETest` (đồng hồ demo) vì `sync()`
  không tạo được bản ghi có kiểu nào (D-303) — Summary/Show-all-data sẽ không có dòng nào gắn nguồn
  Huawei cho tới khi có HCI snoop log thật giải được layout phản hồi service 7. Ghi nhận **Tạm** để
  đợt sau (khi có bằng chứng response layout) mở rộng assert sang Summary thật.
  Lý do: assert đúng cái driver THẬT SỰ làm được, không viết test xanh giả bằng cách bịa decode trong
  giả lập (sẽ che mất giới hạn thật của driver, trái tinh thần trung thực của toàn bộ quyết định trên).
- **D-307** · 2026-11-06 · Đụng địa chỉ MAC ảo với Garmin — **Chốt**
  `HuaweiVirtualDevice.ADDRESS` ban đầu đặt `02:DE:30:00:00:02`, trùng hệt `GarminVirtualWatch.ADDRESS`
  (agent Garmin chọn độc lập cùng lúc) — phát hiện khi chạy thật trên `emulator-5554`: "discovered_…"
  không bao giờ xuất hiện (danh sách thiết bị dedupe theo địa chỉ, chỉ 1 trong 2 bản ghi còn lại).
  Đổi sang `02:DE:30:00:00:05` (không đụng `GarminVirtualWatch.kt`, `ZeppVirtualWatch.kt`
  `D4:F5:13:00:00:09`, `StandardVirtualWatch.kt` `02:5D:00:00:18:0D`, đã rà trước khi chọn số mới).
  Lý do: mỗi agent brand chọn địa chỉ độc lập trong cùng dải `02:DE:30:00:00:xx` nên va chạm là rủi ro
  thật, không phải lý thuyết; sửa ở phía mình (được phép), không sửa file của agent khác.

## Garmin driver (D-4xx)

- **D-401** · 2026-11-06 · Resting HR và HRV trong lịch sử — **Tạm**
  `FitHealthMapper` thêm map `monitoring_hr_data` (273, field 0/1) → `HealthRecord.RestingHeartRate` và
  `hrv_status_summary` (389, field 4, scale 128) → `HealthRecord.HeartRateVariability`. Hai message này
  không nằm trong `GARMIN_DEVICE_PROTOCOL.md` (tài liệu chỉ phủ app Garmin Connect, không phủ định dạng
  file FIT — đó là spec công khai riêng của Garmin). Số message/field lấy từ kiến thức FIT SDK công khai
  ([Ext], không phải APK), chưa đối chiếu với file thật. Lý do: 2 chỉ số này nằm trong checklist tính năng
  bắt buộc của nhiệm vụ; không làm thì driver thiếu hẳn "resting HR"/"HRV" dù storage (D-204) đã sẵn sàng.
  Giữ TODO(garmin-protocol) tại chỗ map vì cần xác nhận trên đồng hồ thật.
- **D-402** · 2026-11-06 · `FitDecoder` vẫn không đọc field kiểu float — **Chốt**
  Không mở rộng `FitDecoder`/`FitBaseType` để đọc FLOAT32/64 (cần cho RR-interval thô ở message `hrv`
  global 78) vì rủi ro suy đoán sai layout (không có bằng chứng, không public mẫu rõ ràng về scale/sentinel
  của field đó). Chọn `hrv_status_summary` (toàn trường uint16/enum, bộ giải mã hiện có đã đọc được) thay
  vì tự tính RMSSD từ nhịp tim thô. An toàn hơn, đúng tinh thần "không suy đoán byte-layout".
- **D-403** · 2026-11-06 · Giả lập Garmin trong `:core:demo` dùng GFDI dedicated, không Multi-Link — **Tạm**
  `GarminVirtualWatch` chỉ lộ service GFDI "dedicated" (`6A4E2401`/`CD28`/`4C80`), không lộ `6A4E2800`
  (Multi-Link) — `GarminDriver` ưu tiên dedicated khi cả hai có mặt (§2.4), nên nhánh này chắc chắn được
  thực thi khi pair giả lập. Nhánh Multi-Link (REGISTER/CLOSE_ALL/handle routing) đã có JVM test riêng
  (`GarminSessionTest` + `FakeGarminWatch`, không đụng tới ở đây) nên E2E không cần lặp lại nó qua giả lập
  thứ hai; đổi lại giảm hẳn độ phức tạp của giả lập (không cần mô phỏng registration/handle multiplexing).
  Lý do: cân bằng giữa "exercising pipeline thật" (mục tiêu E2E) và effort/rủi ro của việc viết đúng khung
  Multi-Link lần hai trong module khác.
- **D-404** · 2026-11-06 · Giao thức GFDI của giả lập viết độc lập với `driver/garmin`, không dùng chung code — **Chốt**
  `core/demo/.../virtual/{GarminWire,GarminFitFileWriter,GarminSimulatedFiles,GarminVirtualWatch}.kt` tự
  cài lại COBS/CRC16/khung GFDI/khung FIT thay vì gọi `driver/garmin`'s codec (`internal`, module khác,
  Kotlin `internal` không lộ qua Gradle module boundary). Lựa chọn thay thế (nới `internal` → public trong
  driver/garmin để tái dùng) bị bỏ vì sẽ biến các lớp giao thức nội bộ của driver sản xuất thành API công
  khai chỉ để phục vụ một bộ giả lập debug — không hợp lý về mặt kiến trúc. Rủi ro hai bản lệch nhau được
  giảm bằng cách trích dẫn đúng số §section của `GARMIN_DEVICE_PROTOCOL.md` ở cả hai nơi.
- **D-405** · 2026-11-06 · Dữ liệu giả lập: 2 file FIT (MONITORING + ACTIVITY), không Multi-Link reliable — **Chốt**
  `GarminSimulatedFiles` dựng 1 file `MONITORING_B` (steps/distance/calories/HR theo giờ, stress, SpO2,
  sleep stages, resting HR, HRV) + 1 file `ACTIVITY` (1 workout `session` chạy bộ) thay vì bắt chước toàn
  bộ các loại file FIT liệt kê ở §6.1. Đủ để mọi `HealthRecord` mà `FitHealthMapper` tạo ra được một lượt
  qua pipeline thật (file → FIT decode → Room); không mô phỏng `libreliable-ml.so` (MLR), không mô phỏng
  Garmin Auth (phone luôn "đã bond" trong giả lập, đúng nhánh §5.1 không-mã-hoá mà driver triển khai).

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
