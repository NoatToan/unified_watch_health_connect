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
- **D-003** · 2026-11-06 · rea — **Chốt** (cập nhật 2026-11-08)
  Dùng `rea` đã cài sẵn (`~/.volta/bin/rea`), không clone repo. Mọi việc liên quan rea chạy trong sub-agent (lỗi không ảnh hưởng session chính).
  Output thô (APK ghép lại, dump decompile) để ngoài git ở `../rea-output/<brand>/`; chỉ bằng chứng đã chắt lọc vào `docs/re-evidence/<brand>/`.
  **Cập nhật 2026-11-08:** việc đọc output thô của rea/jadx (`../rea-output/<brand>/`, `docs/re-evidence/<brand>/`) để chắt lọc bằng chứng không giao cho agent Sonnet đọc trực tiếp — chạy `claude-personal -p "<prompt>"` (model DeepSeek) để đọc/tóm tắt dump trước, agent Sonnet chỉ nhận lại phần đã chắt lọc. Lý do: dump rea/jadx rất lớn, dùng model rẻ hơn (DeepSeek) để nhai thô, giữ ngữ cảnh/chi phí của Sonnet cho việc viết code và ra quyết định.
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
  E2E: flow `13-workouts`, `14-device-settings`, `15-notifications` (số 10 đã được flow Huawei dùng).
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

- **D-809** · 2026-11-08 · Thay Browse (category → metric) bằng feed dẹt "Health" (tham chiếu Huawei Health) — **Chốt**
  Người dùng phản hồi Browse (category list) khó dùng. Xoá `feature/home/browse/BrowseScreen.kt` và
  `BrowseDestination`; tab đáy đổi `BROWSE` → `HEALTH` (`FeedDestination`, nhãn "Health", icon Dashboard),
  nội dung là `feature/home/feed/FeedScreen.kt`: một `LazyColumn` dẹt duy nhất, mỗi `HealthMetricType` một
  card (`card_<METRIC>`) gồm icon/nhãn/giờ đọc, mini chart (tái dùng `HealthBarChart`/`HealthRangeChart`,
  stage bar tái dùng `SleepStageChart` thu nhỏ cho Sleep) và một dòng phân tích (`metricInsightLine`,
  `feature/home/insight/MetricInsightText.kt` — thuần Kotlin, có unit test), cộng card Activity rings và
  card Workouts (3 bài gần nhất). Metric chưa có dữ liệu vẫn hiện (không ẩn) nhưng dạng gọn
  (`ListItem` một dòng "No data yet") thay vì card to trống. Thứ tự/ẩn-hiện card ("Edit cards": tăng/giảm
  bằng mũi tên lên-xuống + checkbox, không dùng drag-drop) lưu qua `UserPreferences.feedCardOrder` /
  `hiddenFeedCards` (DataStore, `UserPreferencesRepository.setFeedCards`, giống cơ chế `pinnedMetrics` sẵn
  có). `MetricDetailScreen` (D/W/M/6M/Y) thêm thẻ "Insight" dùng lại `HighlightCalculator`/`MetricStatsCalculator`
  đã có, không thêm calculator domain mới (phân tích là ghép chữ ở tầng feature, không phải logic domain mới).
  Các E2E dùng `nav_BROWSE`/`browse_search`/`category_*`/`browse_metric_*` (Demo/Garmin/Standard/Zepp/UserJourney)
  đổi sang `nav_HEALTH` + cuộn `feed_list` tới `card_<METRIC>`, không còn tìm bằng ô search (feed không có ô tìm,
  giống tham chiếu Huawei).
  Lý do: tôn trọng layering `feature` chỉ phụ thuộc `domain`/`designsystem` — không để `feature/home` phụ
  thuộc `feature/activity` (icon/label bài tập được chép cục bộ trong `feed/WorkoutFeedUi.kt`). Không chọn
  drag-drop để tránh thêm thư viện/độ phức tạp test khi mũi tên lên/xuống đã đủ đạt yêu cầu "editable order".

- **D-014** · 2026-11-06 · Dùng chung emulator — **Chốt**
  Chỉ chạy 1 emulator (`emulator-5554`) để tiết kiệm RAM. Mọi lần chạy test instrumented, `adb install` hoặc `pm clear` phải đi qua
  khoá `emu-lock.sh` (dùng `mkdir` làm mutex), vì các agent chạy chồng nhau sẽ gỡ APK của nhau giữa chừng.
  Build cache Gradle từng bị hỏng khi nhiều agent build song song (`:driver:zepp` chỉ dex được 2/108 class) → gặp `NoClassDefFoundError` thì build lại với `--no-build-cache`.

- **D-015** · 2026-11-06 · README portfolio — **Chốt**
  README viết bằng tiếng Anh (đối tượng là nhà tuyển dụng/khách hàng quốc tế). Report E2E được chép từ `build/e2e-report/`
  (bị gitignore) sang `docs/e2e-report/` để README nhúng ảnh và link hiển thị được trên GitHub.

- **D-016** · 2026-11-06 · Repo riêng, public — **Chốt**
  App tách khỏi `NoatToan/vibe-projects` thành repo public `NoatToan/unified_watch_health_connect`, giữ lịch sử commit
  (`git filter-repo --subdirectory-filter`) nhưng lọc hẳn khỏi lịch sử: APK của hãng, cây mã dịch ngược `jadx-*`,
  dump thô của rea (`*.json`, `*.txt`) và manifest của hãng. Lý do: đó là nội dung có bản quyền của hãng, không được
  phát tán công khai (D-004). Chỉ giữ tài liệu giao thức và bằng chứng `.md` đã chắt lọc; `scripts/restore-apks.sh` bị bỏ.

- **D-017** · 2026-11-08 · Gom raw RE artifacts vào `docs/re-analysis/` — **Chốt**
  Toàn bộ cây phân tích thô (`garmin-analysis/`, `zepp-analysis/`, `rea-output/`, `jadx-out.log`) được chuyển từ
  workspace root vào `docs/re-analysis/` để chỉ còn một chỗ tra cứu. Thư mục này **gitignored** và không bao giờ
  commit (APK/decompile/dump thô vẫn là nội dung có bản quyền, D-004/D-016). Tài liệu chắt lọc vẫn ở
  `docs/analysis/`, `docs/protocols/`, `docs/re-evidence/`; các citation `rea-output/...`,
  `garmin-analysis/...`, `zepp-analysis/...` trong dossier được hiểu là tương đối với workspace cũ và resolve
  dưới `docs/re-analysis/`.

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
- **D-308** · 2026-11-06 · 0x0107 response – 29 TLV type IDs đã xác định — **Chốt**
  RE vòng 2 (`defpackage/ckq.d/b/c`) ánh xạ 29 type ID trong phản hồi GetDeviceVersion (§11.1):
  nhóm `ckq.d` {1,3,7,25,36-41}, `ckq.b` {2,10,14,17,18,22,26}, `ckq.c` {9,12,15,20,21,27,29-35}.
  Semantic từng type là [I] (suy từ tên field DeviceInfo); type 22 = capabilityBitmap, type 12 = batteryLevel [I].
  Quyết định: ghi bằng chứng vào `docs/re-evidence/huawei/version_tlv_types.md`, cập nhật §11.1 protocol.
  Chưa implement parse trong driver (chờ xác nhận semantic qua thiết bị thật); giữ TODO(huawei-protocol).
- **D-309** · 2026-11-06 · 0x0102/0x0103 layout đã giải – implement request trước — **Chốt**
  Request layout của cả hai lệnh capability consult đã xác minh [V] (ckn.b, cki.a – §11.3/11.4).
  Response 0x0102 (hex bitmap) đã xác minh [V]. Response 0x0103 (nested TLV) là [I] – trace qua tên
  method `d/b/a` nhưng chưa đến byte-level.
  Quyết định: có thể implement phần request + parse response 0x0102 ngay; response 0x0103 lưu raw TLV
  và log cho đến khi xác minh bằng thiết bị. Ghi vào TODO(huawei-protocol) ở HuaweiSession.
- **D-310** · 2026-11-06 · 0x0132 – TLV(0x01) 50 byte chưa xác định — **Tạm**
  TLV(0x03) IANA timezone ID đã xác minh [V]. TLV(0x01) = 50 byte từ `cku.c()` (no-arg overload) chưa
  decompile được trong đợt RE này. Không tự bịa layout 50 byte.
  Quyết định: driver gửi TLV(0x03) với IANA ID; bỏ TLV(0x01) hoặc gửi 50 zero byte và đánh dấu
  `TODO(huawei-protocol): confirm cku.c() 50-byte layout via HCI snoop log`. NEEDS-REAL-WATCH.
- **D-311** · 2026-11-06 · Watch-initiated routing – thêm interface, không coupling — **Chốt**
  `coa.d(DeviceInfo, String, cml, List<cmi>, MessageReceiveCallback)` xác nhận [V] là dispatcher chính
  cho frame không solicited. Driver cần `WatchInitiatedHandler` interface inject vào `HuaweiTransport`;
  `HuaweiSession` đăng ký và route theo serviceId/commandId.
  Quyết định: thêm interface + hook trong `HuaweiTransport.onPayload()` (TODO:174); không implement
  handler cụ thể cho từng event (vì layout payload của event chưa xác minh) – chỉ log có cấu trúc.
- **D-312** · 2026-11-06 · Service 7 response – vẫn NEEDS-REAL-WATCH — **Tạm**
  `DataTotalMotion` và `HeartRateDetect` data model đã xác minh [V] qua jadx (`defpackage/mqj.java`,
  `com/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion.java`). TLV type IDs để populate từng field
  trong response frame của cmd 3/4/5/8/10/11/12/13 không tìm thấy trong đợt này (parser lxp chưa
  decompile được). Giữ D-303 và TODO(huawei-protocol) trong FitnessCommands.kt.
  Lý do: không suy đoán layout; cần HCI snoop log thật (hướng dẫn capture ghi vào
  `docs/protocols/HUAWEI_IMPLEMENTATION_BRIEF.md §Priority 1 – TODO 3`).
- **D-313** · 2026-11-06 · Driver vòng 2: thứ tự bắt tay sau xác thực — **Chốt**
  `DeviceConfigurator` chạy đúng thứ tự app (§5.1): 0x0107 → 0x0105 → 0x0132 → 0x0102 → 0x0103, tất cả
  gửi mã hoá như 0x0105 [I]. Chỉ 0x0105 bắt buộc (bị từ chối = lỗi kết nối như trước); 0x0107/0x0132/
  0x0102/0x0103 bị watch từ chối (TLV 0x7F) thì log và đi tiếp; lỗi transport (timeout/mất link) luôn
  ném ra. 0x0103 chỉ gửi cho các service mà 0x0102 báo hỗ trợ (app cũng chuyển kết quả 0102 sang `cki`).
  Lý do: các bước này chỉ mang tính thông tin với driver; không để một lệnh tuỳ chọn làm hỏng kết nối.
- **D-314** · 2026-11-06 · 0x0107: map trường nào, giữ gì ở dạng raw — **Chốt**
  Request chỉ hỏi các type driver dùng {1,2,3,7,9,12,15,20,22} (app cũng hỏi một tập con). Map: 1 =
  firmware, 20 (fallback 3) = model, 9 = serial, 12 = pin 0..100 (ngoài khoảng thì bỏ), giá trị chuỗi đọc
  UTF-8 [I]. `readDeviceInfo()` gọi 0x0107 mới mỗi lần, GATT chuẩn chỉ lấp chỗ thiếu. Type 22 (bitmap)
  giữ dạng byte, KHÔNG dịch sang `DeviceCapability` (nghĩa từng bit chưa có bằng chứng); `BATTERY_LEVEL`
  bật khi có type 12 hoặc GATT Battery. Brief ghi "29 type" nhưng 3 danh sách switch thực ra liệt kê 30
  id — code giữ đủ 30. Brief đề xuất `HealthRecord.DeviceStatus` — không tồn tại trong `core/model`; không
  thêm (pin đã đi qua `DeviceInfo.batteryPercent`, đủ cho UI), tránh sửa `core/*`.
- **D-315** · 2026-11-06 · 0x0132 bỏ TLV 0x01, chỉ gửi IANA id — **Tạm**
  Chọn phương án "bỏ TLV 0x01" thay vì "50 byte 0": gửi nội dung bịa còn tệ hơn thiếu trường; watch cần
  trường đó sẽ trả 0x7F và D-313 cho phép đi tiếp. Zone dạng offset cố định (`+07:00`) không có tên IANA
  nên không gửi 0x0132 (0x0105 đã đặt offset); offset 0 gửi `Etc/UTC`. Chờ HCI log để xác nhận.
- **D-316** · 2026-11-06 · 0x0102 bitmap đọc theo byte thô, theo code chứ không theo ví dụ của brief — **Chốt**
  Byte `i` của TLV con đầu tiên ↔ service thứ `i` trong danh sách đã gửi, bit 0 = hỗ trợ ([V] `ckn.e`).
  "hex ASCII" trong ghi chú RE là do app luôn xử lý giá trị TLV dưới dạng chuỗi hex (§4.4) nên
  `hex[i*2..]` chính là byte thô `i` [I]. Ví dụ `"0100"` trong brief mâu thuẫn với quy tắc của chính nó
  (byte 0 = 0x01 có bit 0) — làm theo code đã decompile.
- **D-317** · 2026-11-06 · Watch-initiated: route + giữ raw, không decode — **Chốt**
  `WatchInitiatedHandler` (fun interface) trong `HuaweiTransport`, đăng ký TRƯỚC `start()` để không rơi
  frame nào; lỗi handler bị bắt để không giết vòng đọc. `WatchInitiatedRouter` phân loại theo service
  (1 device_status, 2 notification, 7 fitness, 23 exercise, 44 file_request) và giữ tối đa 256 tin, lần
  sync sau giao dưới dạng `RawPayload` kind `huawei_watch_<loại>_<sscc>`. Không phát `HeartRate`/pin từ
  các tin này và không gửi ACK — layout payload và yêu cầu ACK đều chưa có bằng chứng. Giả lập đẩy một
  tin `0108` sau 0x0103 để E2E đi qua đường này.
- **D-318** · 2026-11-06 · Giả lập vòng 2: giá trị GATT khác 0x0107 có chủ đích — **Chốt**
  `HuaweiVirtualGattClient` trả lời 0x0107/0x0132/0x0102/0x0103 theo layout §11; GATT Device Info/
  Battery trả giá trị khác (`gatt-fallback-*`, pin 50) nên khi E2E thấy pin 64 % và firmware
  `17.0.7-uhsim` là bằng chứng driver đang dùng parser 0x0107 chứ không phải GATT.

- **D-319** · 2026-11-08 · 0x0107 đính chính — **Chốt** (thay D-314)
  Type 12 = **deviceName**, type 22 = **deviceBtMode**; 0x0107 **không** chứa pin và **không** có
  capability bitmap. Bỏ suy luận pin từ 0x0107; pin lấy từ service 1 cmd 8 (hai format response) hoặc
  GATT 0x180F. Nguồn: `docs/analysis/HUAWEI_CONNECTION_ANALYSIS.md`, `ckq.java:139-298` [V].
- **D-320** · 2026-11-08 · 0x0132 đính chính — **Chốt** (thay D-315)
  `01 32` là header service/command, không phải TLV; payload thật là TLV1 epoch + TLV2 zone + TLV3 IANA.
  App kiểm tra thời gian echo và gửi lại đúng một lần nếu lệch (`ckw.java`, `cku.java`). Nguồn:
  `docs/analysis/HUAWEI_CONNECTION_ANALYSIS.md` [V].
- **D-321** · 2026-11-08 · 0x0103 response + thứ tự bắt tay BLE — **Chốt**
  Response 0x0103: TLV con 2 = serviceId, TLV 4 = ASCII hex support vector (0/1 từng command) → nạp
  `DeviceCapability`. Thứ tự BLE: `0107→0105→0102→0103→0137→013C→0132→0112`; 0x0116 chỉ dùng cho BR.
  Nguồn: `docs/analysis/HUAWEI_CONNECTION_ANALYSIS.md`, `cki.java:165-249` [V].
- **D-322** · 2026-11-08 · Auth Huawei: chỉ diagnostic + nhánh no-auth; không extract CAK — **Chốt**
  0x0101 TLV5 = `authenticVersion u16 + RandA[16]`, TLV17 = `authType`. `authenticVersion == 0` → watch
  không cần app auth, đi thẳng 0x0107. Các nhánh còn lại (HiChain/HiChainLite/HiChain3/legacy HMAC) đều
  cần CAK từ white-box native hoặc `libhichain_sdk_jni.so`; **không extract, không nhúng, không bypass**.
  Watch cần auth sẽ nhận lỗi capability rõ ràng; dữ liệu lịch sử đi Health Connect. Nguồn:
  `docs/analysis/HUAWEI_AUTH_CRYPTO_ANALYSIS.md` §1.1/§6 [V].

- **D-323** · 2026-11-08 · Huawei direct BLE cho watch `authVersion == 0` — **Chốt**
  Sau 0x0101, nếu `authenticVersion == 0` thì bỏ qua auth và chạy `0107→0105→0102→0103→0137→013C→
  0132→0112` ở dạng rõ. Mọi auth version khác fail nhanh bằng `UnsupportedDeviceException` với thông
  điệp chỉ rõ "direct BLE requires Huawei app-level authentication" — không CAK/HiChain. D-301 vẫn
  đúng cho watch cần auth. Nguồn: `docs/analysis/HUAWEI_AUTH_CRYPTO_ANALYSIS.md` §1.1.
- **D-324** · 2026-11-08 · Live HR Huawei + capability — **Chốt** (thay D-302)
  Live HR = service 23 command 18 (open/close) + notify command 3; TLV 3 là HR, TLV 4 là epoch time
  (bản phân tích trước ghi nhầm TLV 4; `HwHeartRateManager.java:1063-1108,1255`). Chỉ khai
  `LIVE_HEART_RATE` khi 0x0103 báo hỗ trợ cặp 23/18. GATT 0x180D vẫn không được giả định.
- **D-325** · 2026-11-08 · Giả lập Huawei theo nhánh mới — **Chốt** (thay D-304)
  Bỏ `HuaweiSimulatorAuthenticator` debug: giả lập có hai watch — một `authVersion=0` chạy đầy đủ
  connect/handshake/battery/device info/live-HR, một `authVersion=3/authType=2` để test lỗi rõ ràng.
  Không còn đường bypass auth trong bất kỳ build nào.

- **D-326** · 2026-11-08 · Huawei bond theo TLV 9 — **Tạm**
  `HuaweiDriver.linkRequirements` đổi `bond=true` → `bond=false`; vendor quyết định bond **sau** 0x0101
  theo TLV 9 (0 = không bond, 1/2 = bond khi BOND_NONE; `ckv.java:101-121`, `coi.java:576-605`). Nhánh
  bond sau 0x0101 chưa implement được vì `GattClient` không có API bond (chỉ có `ensureBonded` trước
  session) → `TODO(huawei-bond)`. Cần thêm bond API vào session/GattClient rồi xác minh trên watch.

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
- **D-406** · 2026-11-06 · Sửa deadlock khi giả lập trả file (5002/5004) — **Chốt**
  Bug thật tìm thấy qua E2E trên `emulator-5554`: `GarminWatchLink.answer()` chạy trong vòng lặp
  `for (frame in inbox)` duy nhất đọc `inbox`; xử lý 5002 gọi thẳng (không `scope.launch`) `streamFile()`,
  mà `streamFile` lại `request(FILE_DATA, …)` rồi `await` ACK của chính host — ACK đó chỉ tới được
  `pendingAcks` khi vòng lặp kia tiếp tục đọc `inbox`, nhưng vòng lặp đang bị chặn ngay trong lệnh gọi đó
  → tự deadlock. Sửa: đổi `streamFile` sang `scope.launch { streamFile(file) }` (giống hệt cách
  `GfdiDispatcher.answer()` thật trong `driver/garmin` chạy `afterAck` trên `scope.launch` vì đúng lý do
  này). Sau khi sửa: `GarminWatchE2ETest` pass trọn vẹn 8 bước (scan → pair → sync → Summary → nguồn dữ
  liệu → resting HR/HRV → sleep/workout → unpair), 14 s, không còn treo ở bước "Sync now".
- **D-407** · 2026-11-06 · Giờ ngủ giả lập phải neo theo cửa sổ "đêm", không theo "now − 8h" — **Chốt**
  `GarminSimulatedFiles` ban đầu đặt sleep_level ở `now − 8h`; nếu sync chạy buổi chiều/tối, khoảng đó rơi
  ra ngoài cửa sổ "đêm của hôm nay" mà `LocalHealthDataRepository` dùng (`[hôm qua 18:00, hôm nay 12:00]`,
  D-206), nên `observeSleep(today)` rỗng và `sleep_stage_chart` không hiện (bắt được qua E2E, không phải
  suy luận). Sửa: trước 12:00 trưa thì vẫn dùng `now − 8h` (luôn rơi trong cửa sổ và luôn ở quá khứ); từ
  12:00 trưa trở đi thì neo cứng vào "hôm qua 23:00" (luôn rơi trong cửa sổ, luôn ở quá khứ bất kể giờ sync).

- **D-408** · 2026-11-06 · Bảng bit 5050 (SupportedCapability) đã xác minh đầy đủ — **Chốt**
  94 bit được trích xuất từ smali `<clinit>` của `com.garmin.android.gfdi.configuration.SupportedCapability`
  trong `base.apk` 5.30.1 [V]. Bit N = `ordinal()` = N; `bitmask[N/8] & (1<<(N%8))`. Danh sách đầy đủ
  trong `docs/re-evidence/garmin/config_capability_bits.md`. Bit quan trọng nhất cho driver: 0 (FIT_LINK),
  3 (SYNC), 4 (DEVICE_INITIATES_SYNC), 5 (HOST_INITIATED_SYNC_REQUESTS), 29 (EXPLICIT_ARCHIVE),
  71 (CURRENT_TIME_REQUEST_SUPPORT). `client_config.xml` xác nhận `clientId=0x01`, `keep_alive=25s`.
  Lý do: giải hoàn toàn câu hỏi còn mở §9 mục 3 trong GARMIN_DEVICE_PROTOCOL.md.

- **D-409** · 2026-11-06 · Host bitmask 5050 phải là tập cố định, không sao chép thiết bị — **Chốt**
  `GarminSession.sendConfiguration()` hiện gương bitmask của thiết bị, dẫn tới quảng cáo LIVETRACK/GNCS/
  Weather/music mà driver không có handler. Driver cần gửi chỉ bits {0,3,4,5,29,71}. Xem
  `docs/protocols/GARMIN_IMPLEMENTATION_BRIEF.md §TODO-2` để implement ngay (không cần thiết bị).
  Lý do: watch gửi tin cho capabilities host "nhận" nhưng không xử lý → watch retry → có thể ngắt kết nối.

- **D-410** · 2026-11-06 · Service 4 info pages và 5023 vẫn NEEDS-REAL-WATCH — **Tạm**
  Registration service 4 (flow info pages trước REGISTER GFDI): `eh2.f.initialize` xác nhận app Garmin
  Connect luôn làm bước này [V] nhưng firmware có enforce không thì chưa biết — driver bỏ qua bước này,
  không break trên giả lập, cần kiểm trên đồng hồ thật (nếu REGISTER(1) trả REJECTED → thêm). Xem
  `docs/re-evidence/garmin/registration_service4.md`. 5023 Battery Status: strings DEX xác nhận tên
  field `batteryPercentage`, `isCharging`, `batteryStatusTimeStamp` [I] nhưng byte-layout chưa decompile
  được; giữ SIG Battery Service (0x180F) làm nguồn chính cho đến khi HCI log xác nhận. Xem
  `docs/re-evidence/garmin/battery_status_5023.md`.
  Lý do: không suy đoán layout; fallback SIG Battery đã hoạt động và an toàn.

- **D-411** · 2026-11-06 · Driver gửi 5050 cố định {0,3,4,5,29,71} (thực thi D-409) — **Chốt**
  `GfdiPayloads.HOST_CAPABILITIES` + `capabilityBitmask()` → payload `09 39 00 00 20 00 00 00 00 80`
  (test byte-vector). Bitmask của đồng hồ chỉ còn được log, không gửi ngược lại. Giữ bit 29
  EXPLICIT_ARCHIVE theo brief: hiểu [I] là "host tự archive" nên đồng hồ không tự archive sau khi tải;
  driver không bao giờ gửi 5008 → file vẫn còn cho Garmin Connect (đúng chính sách không phá dữ liệu).
- **D-412** · 2026-11-06 · Service 4 chỉ chạy khi REGISTER(GFDI) bị REJECTED, thử lại 1 lần — **Tạm**
  Không bắt buộc chạy service 4 mọi lần (giữ đường ngắn đã chạy được); khi status 4: REGISTER(4) → hỏi
  6 info page theo thứ tự `eh2/f` (0,1,3,4,2,5), mỗi trang tối đa 5 lần × 1 s (§4.B.7), chỉ chờ có trả
  lời chứ không giải mã nội dung (layout chưa có) → REGISTER(GFDI) lại. Service 4 bị từ chối → giữ lỗi
  REJECTED gốc. Lý do: đúng TODO-1 của brief, không đổi hành vi với đồng hồ không cần service 4;
  kiểm bằng `FakeGarminWatch.requireRegistrationService`. Giả lập E2E (GFDI dedicated) không đổi.
- **D-413** · 2026-11-06 · 5023 parse tạm, SIG Battery vẫn là nguồn chính — **Tạm**
  `BatteryStatus.decode` theo layout suy luận §10.3 (`u8 % | u8 status | u32 FIT-time`), loại bỏ nếu
  < 6 byte, % ngoài 0..100 hoặc status ngoài 0..7. `readDeviceInfo` = SIG 0x180F, chỉ khi không có SIG
  mới dùng giá trị 5023 hợp lệ gần nhất; capability `BATTERY_LEVEL` vẫn chỉ báo khi có SIG (không hứa
  dựa trên layout chưa kiểm). Lý do: yêu cầu vòng 2, an toàn khi layout sai (rơi về null/SIG).

- **D-414** · 2026-11-08 · 5023 đính chính — **Chốt** (thay D-413)
  Layout đã xác minh: `status = payload[0] & 0x70`, `percent = payload[2]`; vendor poll mỗi 10 phút.
  SIG 0x180F vẫn là nguồn chính; 5023 là fallback khi không có SIG. Nguồn:
  `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md`, `ha2/a.java:161-215` [V].
- **D-415** · 2026-11-08 · Time sync chủ động + service 4 mọi lần + MTU budget — **Chốt** (thay D-412)
  Driver gửi 5030 TIME_UPDATED và chờ 5052 tối đa 5 s; khi capability bit 71 clear thì gửi 5026 TLV.
  Service 4 info-page được hỏi **đầu mỗi lần kết nối** (6 trang, 1 s ×5, tổng 20 s), không chỉ sau
  REGISTER(1) REJECTED. `maxPacketSize` là link budget: trừ COBS `ceil(n/254)` + 8/18 byte và align
  payload mã hoá. Nguồn: `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md` [V].

- **D-416** · 2026-11-08 · Garmin Auth tầng app đã triển khai — **Chốt**
  `auth/` gồm XXTEA (đối chiếu vector từ `ss2/n.java`), confirm/STK/session key, state machine
  5101→5103→5104/5105→5106→5107→5108→5109→5111, lưu `ltk/ediv/rand` vào credential store. Passkey
  visible dùng `PairingCodeRequester` sẵn có; just-works dùng passkey 0. Sau 5111, `GfdiDispatcher`
  XXTEA-wrap toàn bộ frame; ACK 5111 gửi plain đúng `ct2/f.java:84`. Không dùng/nhúng secret của Garmin:
  mọi giá trị đến từ watch và người dùng. Fast path 5104 với LTK đã lưu **chưa** làm (chưa xác minh đủ
  chuỗi follow-up). Nguồn: `docs/analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md`.
- **D-417** · 2026-11-08 · Bond mềm cho Garmin — **Chốt**
  `LinkRequirements.bondOptional`: nếu OS bond thất bại, link tiếp tục unbonded để watch khởi động
  Garmin Auth (5101) thay vì đóng kết nối. Các brand khác giữ mặc định `false`. Đây là điều kiện để
  fallback auth thực sự chạy trên đồng hồ; vẫn cần kiểm trên watch thật.

- **D-418** · 2026-11-08 · Root cause "không có activity Garmin nào": cửa sổ sync, không phải FIT decoder — **Chốt**
  Điều tra "không thấy workout Garmin" (real watch): `GarminFileSync.sync()` lọc mọi loại file FIT bằng
  một `since` duy nhất = `SyncRequest.effectiveSince()` (mặc định `now − 7 ngày` ở lần sync đầu,
  `core/ble/.../driver/WearableSession.kt`), rồi `since` tiến dần theo mỗi lần sync thành công
  (`DefaultWearableDeviceRepository.syncNow` dùng `lastSyncedAtEpochMs`). ACTIVITY (FIT_TYPE_4) là file
  hiếm — một buổi tập có thể cách lần "lần đầu mở app" hơn 7 ngày (rất phổ biến: người dùng đã đeo đồng
  hồ một thời gian trước khi cài app) → bị bỏ qua ngay từ sync đầu tiên, và vì `since` chỉ tiến về phía
  trước, activity đó **không bao giờ được thử lại**. Đã tải 3 file FIT ACTIVITY thật từ FIT SDK công khai
  của Garmin (`garmin/fit-python-sdk`, `driver/garmin/src/test/resources/fit-samples/`, xem `SOURCE.txt`)
  và decode bằng `FitDecoder`/`FitHealthMapper` hiện có (`RealFitSampleDecodeTest`): cả 3 decode thành
  công, 2 file có session (18) ra đúng Workout (sport/distance/calories/HR hợp lý). Vậy `FitDecoder`
  (H2) và field mapping của session 18 (H3: start_time=2, sport=5, total_elapsed_time=7 scale 1000,
  total_distance=9 scale 100, total_calories=11, avg_hr=16, max_hr=17 — đối chiếu đúng FIT profile công
  khai) đều đúng trên dữ liệu thật; root cause là cửa sổ thời gian (H1), không phải decoder.

- **D-419** · 2026-11-08 · ACTIVITY dùng cửa sổ riêng 365 ngày, không phụ thuộc `since` — **Chốt** (sửa D-418;
  **đã sửa tiếp bởi D-422** — xem đó để biết cơ chế chống tải lại mỗi lần sync)
  `GarminFileSync.sync()` tách cutoff theo loại file: MONITORING/METRICS/WELLNESS_49 vẫn dùng
  `request.effectiveSince()` (không đổi hành vi); riêng ACTIVITY dùng `request.now − ACTIVITY_LOOKBACK_DAYS`
  (365 ngày) **mọi lần sync**, không chỉ lần đầu. Lý do chọn "mọi lần" thay vì chỉ "lần sync đầu" (dù §H1
  gợi ý vậy): nếu chỉ sửa lần-đầu, người dùng **đã** pair trước khi có bản sửa này (since đã trôi qua) sẽ
  không bao giờ được cứu lại — cửa sổ phụ thuộc "mọi lần" tự sửa luôn cho cả hai trường hợp, không cần
  thêm hành động thủ công. Thêm test hồi quy `GarminSessionTest."activity files far outside the wellness
  window are still synced, unlike monitoring"` và `Log.i` tổng kết (file theo loại được liệt kê/tải/decode,
  số workout) để đọc logcat thật xác nhận.
  ⚠️ Bản đầu của entry này từng nói "tải lại file ACTIVITY đã tải mỗi lần sync là chấp nhận được" — review
  trước khi merge chỉ ra điều đó không ổn trên đồng hồ thật (vài trăm activity × 50–500 KB → vài phút
  truyền BLE + hao pin mỗi lần sync). D-422 thêm cơ chế chống tải lại; mục này giữ lại phần "cửa sổ 365
  ngày, áp dụng mọi lần" vì phần đó vẫn đúng, chỉ phần "tải lại" là sai và đã được D-422 thay.

- **D-420** · 2026-11-08 · Thêm `WearableDriver.reprocess()` để tái decode raw payload ngoại tuyến — **Chốt**
  `core/ble/.../driver/WearableDriver.kt` thêm method mới với default `= emptyList()` (tương thích
  ngược 100% — Huawei/Zepp/Coros/Standard không cần đổi gì). `GarminDriver.reprocess()` chỉ xử lý kind
  `fit_activity` (bỏ qua monitoring/metrics/wellness vì các loại đó cần gộp nhiều file theo ngày —
  `DailyActivityAccumulator` — nên chỉ an toàn tái decode trong một `sync()` thật, không tái decode đơn
  lẻ). Mục đích: nếu một bug decode FIT khác xuất hiện trên đồng hồ thật sau khi phát hành (khác D-418,
  vì 3 file mẫu thật decode được), bản sửa decoder sau này có thể phục hồi dữ liệu đã tải mà không cần
  người dùng pair/sync lại — raw payload đã lưu sẵn đúng với mục đích ghi trong doc comment của
  `HealthRecord.RawPayload` ("kept so it can be re-decoded when a parser improves").
- **D-421** · 2026-11-08 · "Reprocess downloaded files": quy ước tên file làm chỉ mục, không thêm bảng Room — **Chốt**
  `RawPayloadStore.list()` (core/data) liệt kê lại file dưới `files/wearable_raw/<device>/` bằng quy ước
  tên đã có sẵn (`<vendor>_<kind>_<epochMs>.bin`, tách ra `RawPayloadFileNaming` để test được mà không
  cần Android `Context`), thay vì thêm bảng Room mới + migration. `RawPayloadStore` là nơi viết file duy
  nhất nên tự đọc lại tên là an toàn; đổi lại tránh rủi ro migration cho một tính năng khôi phục dữ liệu
  phụ. `WearableDeviceRepository.reprocessRawPayloads(deviceId)` (mới trong `core/domain`, implement ở
  `DefaultWearableDeviceRepository`) duyệt file đã lưu → `DriverRegistry[vendor].reprocess(...)` → ghi
  record mới qua `HealthRecordSinkFactory`, không cần thiết bị đang kết nối. UI: nút "Reprocess downloaded
  files" trong `feature/devices/.../DeviceDetailScreen.kt`, chỉ hiện khi `device.vendor == GARMIN` (vendor
  duy nhất có `reprocess()` hiện thực), `testTag("detail_reprocess")`, không đụng `feature/home`/`feature/activity`.

- **D-422** · 2026-11-08 · Chống tải lại ACTIVITY mỗi sync: dedup theo timestamp + cap "bắt kịp" 50 file/lần — **Chốt**
  (sửa phần "tải lại là chấp nhận được" của D-419, theo review trước khi merge)
  Vấn đề: D-419 giữ cửa sổ 365 ngày cho ACTIVITY nhưng không nhớ file nào đã tải — mỗi sync lại tải lại
  **toàn bộ** file ACTIVITY còn trong cửa sổ, kể cả khi đã tải hôm qua. Trên đồng hồ thật giữ vài trăm
  activity chưa archive (bình thường nếu người dùng không gỡ Garmin Connect), mỗi file 50–500 KB → vài
  phút truyền BLE + hao pin **mỗi lần sync**, không chấp nhận được cho production.
  Sửa: `SyncRequest` (core/ble, `WearableSession.kt`) thêm field `knownRawPayloadTimestamps: Set<Instant> =
  emptySet()` — tương thích ngược vì có default; `HealthDataSync.sync()` (core/ble) thêm tham số cùng tên,
  cùng default, driver duy nhất implement interface này (`MultiVendorHealthDataSync`) được sửa theo.
  `DefaultWearableDeviceRepository.syncNow()` tính set này từ `RawPayloadStore.list(deviceId)` (đã có từ
  D-421, không filter theo `kind` để không rò thêm tên hằng số riêng của Garmin lên core/data — rủi ro
  trùng timestamp giữa hai *loại file khác nhau của cùng một thiết bị* là không đáng kể) và truyền xuống.
  `GarminFileSync.sync()`: với mỗi ACTIVITY entry trong cửa sổ 365 ngày, bỏ qua nếu
  `entry.timestamp in request.knownRawPayloadTimestamps` (đã có raw payload trên máy cho đúng file đó,
  theo tên file `RawPayloadFileNaming` đã lưu khi download lần trước — xem D-421). Phần còn lại ("file mới,
  chưa từng tải") giới hạn `ACTIVITY_CATCH_UP_CAP = 50` file/lần, ưu tiên mới nhất trước
  (`sortedByDescending { timestamp }.take(50)`) — hợp lý vì lần "bắt kịp" đầu tiên (ngay sau khi bản vá
  này lên, hoặc lần đầu pair một đồng hồ có sẵn nhiều lịch sử) không nên dồn hết vào một lần sync; phần dư
  vẫn "chưa từng tải" và tự được xét lại ở lần sync kế tiếp cho tới khi bắt kịp hết. `Log.i` tổng kết thêm
  `alreadyDownloaded`/`new`/`thisSync`/`deferredToNextSync` để đọc logcat thật xác nhận tốc độ bắt kịp.
  Idempotent/an toàn: `WorkoutEntity` vẫn `@Upsert` trên `(deviceId, startEpochMs)` nên nếu dedup lệch
  (vd. do giờ hệ thống đổi) thì tải lại cũng không tạo dữ liệu trùng, chỉ tốn băng thông — dedup là tối ưu
  hiệu năng, không phải điều kiện đúng/sai của dữ liệu.
  Test: `GarminSessionTest` — "second sync skips an activity already known…", "a newly appeared old
  activity is still fetched…" (một file cũ đã biết bị bỏ, một file cũ khác chưa biết vẫn được tải, cùng
  cửa sổ), "activity catch-up is capped per sync, newest first, continuing next sync" (55 file mới, lần 1
  tải đúng 50 file mới nhất, 5 file cũ nhất bị trễ; lần 2 tải đúng 5 file còn lại).
  Ghi chú kỹ thuật phụ phát hiện khi viết test: `GarminFileSync.sync()` sắp xếp `wanted` theo timestamp
  **tăng dần** (cũ nhất trước) trước khi tải — bài test đầu viết sai thứ tự kỳ vọng (tưởng tải theo thứ tự
  liệt kê trong `directory`), khiến `assertEquals` sai lệch ném `AssertionError` **trước** khi gọi
  `session.close()`; vì scope polling pin (`startBatteryPolling`, D-411) không phải con cấu trúc của
  `runTest`, nó bị "rò" sống trên `TestCoroutineScheduler` dùng chung và vòng lặp tự-lên-lịch lại của nó
  (`delay` 10 phút) khiến `advanceUntilIdle` của `runTest` chạy mãi không dừng — test "treo" (CPU 100%,
  nhiều phút) trông giống deadlock dù bug thật chỉ là thứ tự assert sai. Đã sửa assert và bọc mọi
  `session.sync()`/assert trong `try { … } finally { session.close() }` ở 3 test này để một assertion sai
  trong tương lai thất bại nhanh, không treo CI.

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

- **D-508** · 2026-11-06 · Zepp simulator / E2E — **Chốt**
  `ZeppVirtualWatch` lưu key đã bind ở cấp đồng hồ (`ZeppVirtualWatchStorage`, dùng chung mọi link), không theo từng `GattClient`: đồng hồ thật giữ key tới khi reset/unbind (§5.5, §7), nên lần kết nối lại sau local bind phải auth được bằng key đó. Lỗi cũ "Watch rejected the auth key (status 4)" là do simulator sai, driver giữ nguyên; regression: `core/demo` `ZeppVirtualWatchDriverTest` (ZeppDriver thật + simulator, bind → reconnect ×3).
  Kèm theo: "Show all data" của Steps cộng bước theo phút cho ngày không có tổng ngày từ thiết bị (như thẻ Summary), vì GDSP của Zepp chỉ trả bước theo phút (`MetricSeriesBuilder.readings`).

- **D-509** · 2026-11-08 · Module 0x80 local bind — **Chốt** (đính chính D-501)
  `DeviceAuthorizationImpl1` (legacy 0x80) **cũng** gọi `startLocalBinding(apiLevel, key)` khi
  `allowLocalBinding=1 && !SUPPORT_NEW_AUTH`; driver không được throw cho 0x80 nữa. Cloud bind vẫn
  không làm (cần chữ ký Huami). Nguồn: `docs/analysis/ZEPP_AUTH_CRYPTO_ANALYSIS.md` §3.2,
  `DeviceAuthorizationImpl1.java:210-213,162` [V].
- **D-510** · 2026-11-08 · v1 module-list + time sync FEE0 + battery — **Chốt**
  Module list/auth chỉ có ở channel v2; v1 luôn dùng 0x0009 và bỏ module query (tránh mất tới 5 s).
  2A2B tìm dưới FEE0 trước, sau đó 0x1805; payload gửi ms/4 + DST reason. Battery: module 0x29
  (version 0x01, query 0x03, notify 0x04) → FEE0 0x0006 bit-flagged → SIG 0x180F. Nguồn:
  `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` [V].

- **D-511** · 2026-11-08 · Zepp robustness + GATT options — **Chốt**
  Watchdog toàn handshake 120 s; timeout GATT 45/30/30 s và refresh GATT cache trước discovery trên
  API 28+ (opt-in qua `LinkRequirements`, mặc định cũ giữ nguyên cho brand khác); GDSP retry 3 lần từ
  cursor cuối, không retry lỗi protocol; channel v2 ACK retry 3 lần (NEED_REPLY mỗi packet 16 và packet
  cuối); battery notify module 0x29 (0x04) được cache và ưu tiên hơn query một lần. Nguồn:
  `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` §4.

- **D-512** · 2026-11-08 · Zepp MTU align vendor — **Chốt**
  Bỏ `requestMtu` upfront (`LinkRequirements.mtu = null`); sau auth, nếu module list có 0x15 thì gửi
  `queryConnectParam`, parse `skip u8 | payload u16 LE`, ATT MTU = `min(payload+3, 247)`, chunk =
  `MTU-3` (cap 244 như vendor `Mtu`), fallback GATT MTU khi module vắng/im lặng/lỗi. Nguồn:
  `docs/analysis/ZEPP_CONNECTION_ANALYSIS.md` §2/§4, `MiLiProProfile.java:2053-2056`.

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

- **D-710** · 2026-11-08 · Demo mode — runtime switch — **Chốt**
  Thêm `DemoModeController` (interface ở `:core:domain`, `enabled: StateFlow<Boolean>` + `setEnabled`), implement + bind ở `:core:demo` (`DemoModeControllerImpl`, DataStore key `demo_mode_enabled`, mặc định **false**), optional-bind ở `:core:data` (`@BindsOptionalOf`, giống `DemoDataController`). UI: Profile › Developer (debug only) có switch "Demo mode" (`feature/profile`), ẩn hẳn khi `Optional` rỗng (release).
  Lý do: yêu cầu "mock chỉ bật khi tôi bật trong Settings" — thay cờ build-time mặc định bật bằng switch runtime mặc định tắt. Supersede phần "mặc định bật ở debug" của D-006/D-201/D-203 (các quyết định đó về việc code mock không có trong release vẫn giữ nguyên).
- **D-711** · 2026-11-08 · Demo mode — cơ chế tắt/mở khi đang chạy — **Chốt**
  Thêm `VirtualDevice.isActive` (default `true`) vào `:core:ble`; `VirtualAwareBleScanner`/`VirtualAwareGattConnector` lọc theo nó mỗi lần quét/connect. `:core:demo` bọc mọi `VirtualDevice` bằng `GatedVirtualDevice` (đọc `DemoModeController.enabled.value`) trước khi `@ElementsIntoSet`; xoá hẳn `BuildConfig.MOCK_DEVICE`/`-PunifiedHealth.mockDevice` (build-time).
  Lý do: `:core:ble` không cần biết gì về demo (chỉ thêm một thuộc tính generic); đổi switch có hiệu lực ngay khi đang chạy (không cần khởi động lại) vì `isActive` được đọc lại ở mỗi vòng quét. `MockWatchDriver.recognize()` không cần gate riêng: quảng bá của nó không còn được emit khi tắt nên driver không bao giờ thấy nó.
- **D-712** · 2026-11-08 · Demo mode — tách dữ liệu demo khỏi dữ liệu thật — **Chốt**
  `DemoDataController.clearHealthData()` (xoá hết `health_samples`/`workouts`) đổi thành `clearDemoData()`: chỉ xoá theo `deviceId` nằm trong `DemoDeviceIds.ALL` (địa chỉ của 6 đồng hồ ảo: demo watch, Garmin/Zepp/Huawei ×2/SIG band). Thêm `HealthRecordDao.deleteSamplesForDevices`/`deleteWorkoutsForDevices` (`:core:data`).
  Lý do: yêu cầu "không bao giờ xoá dữ liệu đồng hồ thật" — bảng `health_samples`/`workouts` đã có cột `deviceId` nên tag theo thiết bị ảo là đủ, không cần thêm cột/migration. Test `DemoDataSeederTest` kiểm tra dữ liệu của một "đồng hồ thật" giả định sống sót qua `clearDemoData()`.
- **D-713** · 2026-11-08 · Demo mode — UI xác nhận và luồng E2E — **Chốt**
  Profile › Developer: bật "Demo mode" là tức thì; tắt luôn hỏi trước (dialog "Turn off, keep data" / "Turn off and clear data"); "Fill demo data" (90 ngày, mọi metric) và "Clear demo data" đều chỉ hiện khi đang bật; Clear có dialog xác nhận riêng. E2E: `E2EBase` tự `setEnabled(true)` qua `Optional<DemoModeController>` thật (field inject) trước khi mở `MainActivity`, nên các test ghép đồng hồ ảo không cần bấm switch; `DemoDataE2ETest`/`WorkoutsE2ETest` đổi tag `seed_demo_data`→`fill_demo_data`, `clear_health_data`→`clear_demo_data` (+ tap `confirm_clear_demo_data`). `scripts/e2e.sh` không đổi.
  Lý do: "Show confirmations; never delete real watch data" cho hành động phá hủy; E2E dùng đúng cơ chế production (`DemoModeController`) thay vì cờ test riêng, nên bản thân cơ chế bật demo cũng được test qua CI.

## Watch model images (D-8xx)

- **D-801** · 2026-11-08 · Ảnh sản phẩm official đóng gói WebP trong `:core:designsystem` — **Chốt**
  Đóng gói trực tiếp (`drawable-nodpi/watch_<id>.webp`, trong suốt, ≤ 512px) thay vì tải qua mạng, vì app không xin quyền INTERNET (offline, riêng tư cho app sức khoẻ).
  Lý do: bản quyền ảnh thuộc hãng sản xuất; chỉ dùng để giúp người dùng nhận diện thiết bị của chính họ, không dùng cho mục đích thương mại/quảng cáo. Nguồn từng ảnh liệt kê ở `docs/watch-catalog.md`.
- **D-802** · 2026-11-08 · Nhận diện model: regex DIS rồi BLE name — **Tạm**
  Mỗi `WatchModel` có một `namePattern` khớp (không phân biệt hoa/thường) trước tiên vào chuỗi model đọc từ Device Information Service, sau đó vào tên quảng bá BLE; pattern lấy từ tên thiết bị trong Gadgetbridge (codeberg.org/Freeyourgadget/Gadgetbridge, chỉ lấy pattern tên, không copy code) kết hợp RE của project cho vendor service/manufacturer data.
  Lý do: một số pattern độ tin cậy thấp vì suy luận chứ chưa có bằng chứng xác nhận trực tiếp — đánh dấu `bleNameConfidence: "low"` trong `docs/research/watch_catalog.json` cho COROS PACE 4 / PACE 4 Pro / APEX 4 / NOMAD / VERTIX 2S và Wahoo TICKR; cần xác minh trên máy thật.
- **D-803** · 2026-11-08 · Hiệu ứng 3D giả lập trong `WatchImage` — **Chốt**
  Không hãng nào (Garmin, Huawei, Honor, Amazfit/Zepp, Xiaomi, COROS, Polar) công bố asset 3D official (GLB/GLTF/USDZ) hay bộ ảnh xoay 360° cho sản phẩm của họ, nên `WatchImage` giả 3D trên ảnh 2D phẳng: nghiêng phối cảnh (`graphicsLayer` rotationX/Y) khi kéo, lật vào (`rotationY` từ -90°) khi `revealKey` đổi (lúc kết nối), và một vệt sáng chạy theo hướng nghiêng.
  Lý do: vẫn cho cảm giác sản phẩm "sống" mà không cần tải model 3D (giữ offline, không quyền INTERNET) hay tự dựng model trái phép.
- **D-804** · 2026-11-08 · Xiaomi Smart Band 8/9/10 (và 7 Pro) giữ trong catalog chỉ để hiển thị — **Tạm**
  Các model này dùng giao thức riêng của Xiaomi, không phải Huami/Zepp (chỉ Mi Band 5/6 và Xiaomi Smart Band 7 là Huami/Zepp thật); vẫn giữ trong `WatchCatalog` (vendor `ZEPP`) để hiện đúng tên và ảnh khi nhận ra tên quảng bá.
  Lý do: driver `:driver:zepp` (giao thức Huami) nhiều khả năng không nói chuyện được với các model này dù nhận diện được tên; cần driver Xiaomi riêng hoặc xác nhận trên máy thật trước khi coi là hỗ trợ đầy đủ.

## Pair with QR code (D-9xx)

- **D-900** · 2026-11-08 · Camera/scanner stack — **Chốt**
  Quét QR dùng CameraX (`camera-core/camera2/lifecycle/view` 1.6.1) + ZXing `core` 3.5.3, không
  dùng MLKit/Barcode Scanning API — MLKit cần Google Play Services, Huawei không có GMS. ZXing
  decode trực tiếp trên Y-plane của `ImageAnalysis` (`PlanarYUVLuminanceSource`), không cần
  chuyển YUV→RGB. `feature/devices/.../qr/QrCodeAnalyzer.kt`, `QrScannerScreen.kt`. Nguồn:
  `docs/analysis/QR_PAIRING_ANALYSIS.md` §1.1, §2.1 (cả Huawei Health và Zepp dùng camera scan
  QR nội bộ app, không qua hệ thống).
- **D-901** · 2026-11-08 · Phạm vi parser (`QrPairingParser`) — **Chốt**
  `core/model/QrPairingHint.kt` + `QrPairingParser.kt`: 3 sub-parser theo thứ tự Zepp → Huawei →
  Garmin, thuần Kotlin/JVM (dùng `java.net.URI`/`URLDecoder`, không Android). Zepp: MAC 12-hex bắt
  buộc, `pnpNumber`/`pnpVersion` coi là optional cho app này (khác app Zepp gốc bắt buộc cả 3).
  Huawei: `t`/`n`|`bt_name`/`r`|`PIN`, bare `key=value` hoặc URL, giá trị URL-decode. Garmin: App
  Link `{connect,connecttest}.garmin.{com,cn}/mobile-link/gcm/pair-device`, lấy `deviceId` +
  `productNumber`; `applicationKey` **luôn bị bỏ qua** — không parse vào hint, không lưu, không
  log (đây là OAuth scope id trên cloud Garmin, không phải secret BLE). Nguồn: §6.1, §4.3.
- **D-902** · 2026-11-08 · Huawei PIN — **Tạm**
  Vai trò PIN trong handshake Huawei (HiChain) chưa xác nhận được ở mức byte (§1.4, §6.3.1 của
  research doc nói PIN có thể là input PAKE, không chỉ mã xác nhận BT). Driver `driver/huawei`
  hiện KHÔNG dùng PIN trong handshake, nên PIN từ QR chỉ giữ trong `QrFindUiState.huaweiPin`
  (state trong RAM của `DevicesViewModel`) để hiển thị "Code on the watch: 123456" cho người
  dùng tự nhập vào máy nếu được hỏi — không ghi Room/DataStore, không log. Khi driver Huawei cần
  PIN thật cho handshake, phải nối lại pipeline này (xem `docs/DECISIONS.md` D-3xx khi đó).
- **D-903** · 2026-11-08 · Garmin match bằng unitId/productNumber — **Tạm**
  Layout byte của manufacturer-specific data Garmin (`dk2/d.java:362-520`) bị jadx làm hỏng (nhiều
  block trùng/inline do lỗi decompile) ngay sau đoạn đọc company id — chỉ phần đọc company id +
  2 byte đầu (big-endian u16) là tin được. `GarminUuids.productNumberFrom()` trả về **thập phân
  của 2 byte đó**, không phải bảng tra `productNumber` thật của Garmin Connect (bảng tra đó không
  có trong dump). Dùng giá trị này làm `DiscoveredDevice.vendorIdentifiers["garmin.productNumber"]`
  để so khớp "tốt nhất có thể"; `DevicesViewModel.selectMatch` chỉ coi là khớp chắc khi giá trị
  này bằng `productNumber` trong QR, còn không thì rơi về "đúng 1 candidate Garmin gần đó" — nhiều
  candidate không xác định được thì chờ timeout và để người dùng "Choose from list", **không đoán
  bừa**. Cần xác nhận lại bằng QR thật + HCI snoop log trên đồng hồ Garmin thật (xem §6.3.6 trong
  research doc).
- **D-904** · 2026-11-08 · `WearableDriver.identifiers()` — **Chốt**
  Thêm method mặc định `identifiers(Advertisement): Map<String, String> = emptyMap()` vào
  `core/ble/driver/WearableDriver` + field `DiscoveredDevice.vendorIdentifiers` (mặc định rỗng) —
  không phá driver khác (Huawei/Zepp/Coros/Standard không override). `MultiVendorDeviceScanner`
  gọi `registry[vendor]?.identifiers(advertisement)` khi gộp kết quả scan, giữ giá trị cũ nếu bản
  quảng bá mới (ví dụ từ bond list) không có manufacturer data. Chỉ `GarminDriver` override hiện
  tại.
- **D-905** · 2026-11-08 · Luồng tìm theo hint + timeout — **Chốt**
  `DevicesViewModel.startFind()`: dừng scan thường, chạy `repository.scan()` với
  `withTimeoutOrNull(30_000)` (giống timeout address-filtered scan 30s của vendor Zepp, §2.3/§6.2),
  khớp đầu tiên theo `selectMatch()` thì gọi lại đúng `pair()` hiện có (đã tự `connect()` khi không
  thiếu credential) — không viết lại luồng pair/connect. Hết giờ → sheet "Looking for …" chuyển
  sang trạng thái `TIMED_OUT` với "Try again" (gọi lại cùng hint) / "Choose from list" (đóng sheet,
  chạy scan thường). "Enter MAC address" dùng chung `startFind()` với bộ so khớp theo địa chỉ
  chính xác, validate qua `MacAddressFormat.normalizeOrNull` (chấp nhận có/không dấu `:`/`-`).
- **D-906** · 2026-11-08 · Không có ảnh/model watch trong sheet — **Tạm**
  `WatchModel`/`WatchModelMatcher`/`WatchImage` (nhánh `feat/watch-model-images`, chưa merge vào
  `main` lúc làm task này) chưa có trên worktree này → sheet "Looking for …" chỉ hiện icon
  `Icons.Outlined.Watch` + tên vendor/mac/btName/productNumber dạng text, không có ảnh sản phẩm
  thật. Khi nhánh đó merge, nối `WatchModelMatcher` vào `DevicesViewModel.labelFor()`/`QrFindSheet`
  (map `productNumber`→model cho Garmin, `pnpNumber/pnpVersion`→model cho Zepp) là việc còn lại,
  không cần đổi kiến trúc đã làm ở đây.

## Garmin sync gaps, Summary/Health UI, ngưỡng chỉ số, tiếng Việt (D-10xx)

Batch quyết định 2026-11-08 từ yêu cầu "check Garmin + UI + config + tiếng Việt" của user. Dùng ID
4 chữ số (D-10xx) thay vì tái dùng một prefix 1 chữ số đã có (ví dụ `D-8xx` đã bị dùng trùng cho 2
batch khác nhau ở trên — "Gộp màn hình" và "Watch model images" — để tránh gây nhầm thêm lần nữa.

- **D-1000** · 2026-11-08 · Garmin VO2 max — đọc giá trị thiết bị đã tính, không tái tạo thuật toán — **Chốt**
  Thêm mapper đọc field `vo2_max` trong FIT message 140 (`user_metrics`, kiểm tra thêm msg 42
  `user_profile` tùy firmware) tại `FitHealthMapper` (`driver/garmin`), thêm biến thể mới trong
  `core/model/.../HealthRecord.kt` (ví dụ `HealthRecord.Vo2Max`). D-803 (2026-11-06) chỉ cấm tái
  tạo thuật toán Firstbeat độc quyền (không có trong FIT dump) — đây là đọc số watch đã tự tính và
  xuất sẵn trong file FIT, không vi phạm D-803. Hiện tại không có record VO2max nào được map — đây
  là khoảng trống thật, không phải lỗi parse. Nguồn: fork investigation 2026-11-08, `docs/protocols/GARMIN_DEVICE_PROTOCOL.md`.
- **D-1001** · 2026-11-08 · Garmin pin bị cũ sau lần connect đầu — ghi lại mỗi lần poll vào Room — **Chốt**
  `GarminSession.startBatteryPolling()` (SIG `0x180F` + fallback 5023, mỗi 10 phút) hiện chỉ cập
  nhật `provisionalBattery` trong RAM của session; `DefaultWearableDeviceRepository.connect()` chỉ
  gọi `dao.updateInfo(...)` đúng 1 lần lúc connect. Sửa: mỗi lần poll có giá trị mới phải ghi luôn
  xuống `PairedDeviceDao`; nếu lần đọc lúc connect fail/null (hay gặp ngay sau khi pair) thì giá trị
  được điền ở lần poll kế tiếp thay vì treo `null` tới khi disconnect/reconnect lại. Nguồn: fork
  investigation 2026-11-08 — `GarminSession.kt`, `DefaultWearableDeviceRepository.kt`.
- **D-1002** · 2026-11-08 · Xác minh lại việc dọn `feature/sleep` theo D-808 — **Tạm**
  D-808 (2026-11-06) ghi là đã xoá `feature/sleep` khỏi `settings.gradle.kts`/`app`/NavHost, nhưng
  fork UI đợt này vẫn thấy `feature/sleep/SleepScreen.kt` còn đăng ký trong nav host, không ai gọi
  `navigateToSleep` tới. Cần agent implement kiểm tra lại trạng thái thật (có thể bị merge revert
  hoặc D-808 chưa áp dụng hết) và hoàn tất xoá nếu đúng là mồ côi — không phải việc mới, chỉ là
  đóng nốt D-808.
- **D-1010** · 2026-11-08 · Gộp Summary + Health thành 1 destination — **Chốt**
  Giữ `TopLevelDestination.HOME`, xoá `HEALTH` (`FeedDestination`, được tạo ở D-809 2026-11-08 cùng
  ngày — đổi ý trong cùng phiên làm việc vì lý do khác: trùng lặp ring + user muốn gộp lại 1 màn).
  Gộp nội dung `FeedScreen` (feature/home/feed) vào `HomeScreen` thành 1 list cuộn: DeviceBanner →
  RingsCard (dời lên ngay sau DeviceBanner, xem D-1011) → pinned metrics → full metric feed (từ
  FeedScreen) → highlights/workouts. Xoá `ActivityRingsFeedCard` (trùng lặp hoàn toàn với
  `RingsCard`, cùng dựng `RingSpec` từ `DailyHealthSummary`). Chỉ ảnh hưởng `feature/home`; cập nhật
  `UnifiedHealthNavHost.kt` bỏ route `feedScreen`. Nguồn: fork investigation 2026-11-08 —
  `HomeScreen.kt`, `FeedScreen.kt`, `TopLevelDestination.kt`, `UnifiedHealthNavHost.kt`.
- **D-1011** · 2026-11-08 · Vị trí Activity Rings trong Summary — **Chốt**
  Dời `RingsCard` lên ngay sau `DeviceBanner` trong list của Home (trước "Pinned"), thay vì nằm
  dưới section Pinned như hiện tại — khớp phản hồi "ring bị đẩy xuống dưới device". Data binding
  của ring (đọc `DailyHealthSummary` qua `HomeViewModel`) đã đúng, không cần sửa; ring trống chỉ do
  thiết bị Garmin chưa sync đủ (xem D-1000/D-1001 và phần activities/calories/sleep ở trên).
- **D-1020** · 2026-11-08 · Thanh scrub cho chart — **Chốt**
  Thêm gesture kéo-xem-giá-trị (`detectDragGestures`/`detectTapGestures` qua `pointerInput`) vào
  `HealthBarChart`/`HealthRangeChart` trong `core/designsystem/.../HealthCharts.kt` (chart dùng ở
  `MetricDetailScreen` — không làm cho mini-card trong feed vì quá nhỏ để scrub). Map tọa độ x →
  điểm dữ liệu gần nhất bằng đúng hàm `slot`/`plot` đã có sẵn trong `ChartFrame.drawAxes`; vẽ thêm
  vạch dọc + nhãn giá trị tại điểm đang chọn. Xoá `SimpleBarChart.kt` (dead code, tự có TODO
  "replace with Vico") sau khi agent tự grep xác nhận không còn nơi nào dùng.
- **D-1030** · 2026-11-08 · Config ngưỡng "bình thường" cho các chỉ số sức khỏe — **Chốt**
  Thêm `core/domain/model/MetricThresholds.kt` + `DefaultMetricThresholds`: resting HR 60-100, 5
  vùng nhịp tim theo %HRmax (Z1 50-60% khởi động, Z2 60-70% đốt mỡ, Z3 70-80% hiếu khí, Z4 80-90%
  yếm khí, Z5 90-100% tối đa), bước chân mặc định giữ nguyên `dailyStepGoal` đã có, ngủ 7-9h, SpO2
  95-100% (báo động <90%), VO2max theo bảng band tuổi/giới (không có công thức chuẩn chung — chỉ
  categorize, không tính điểm — tránh đụng D-803), calorie dựa trên BMR×hệ số hoạt động thay vì
  hằng số cố định. `UserPreferences` thêm field override nullable theo đúng pattern `dailyStepGoal`
  đã dùng (mặc định dùng `DefaultMetricThresholds`, user có thể ghi đè). Dời `StressLevel` band
  (hiện hardcode trong `HealthMetrics.kt`) và các hằng số `DEFAULT_ACTIVE_KCAL_GOAL`/
  `DEFAULT_ACTIVE_MINUTES_GOAL` (`LocalHealthDataRepository.kt`) vào config mới này.
  `HealthAlertsMonitor`/`WatchAlertRules` đọc threshold từ config thay vì hardcode. Vòng đầu: Profile
  chỉ cần xem được tất cả threshold + chỉnh được step/calorie/sleep goal (đã có pattern); HR
  zone/SpO2/VO2max band hiển thị read-only, chưa cần UI chỉnh — mở rộng sau nếu cần. Nguồn: fork
  investigation 2026-11-08 — `UserPreferences.kt`, `HealthMetrics.kt`, `LocalHealthDataRepository.kt`.
- **D-1040** · 2026-11-08 · Giao diện tiếng Việt — locale mặc định + cấu trúc resource — **Chốt**
  `values/` (mặc định) = tiếng Anh, thêm `values-vi/` = tiếng Việt (thêm, không thay thế — khớp
  CLAUDE.md "code/comment tiếng Anh", string UI tiếng Anh làm baseline nhất quán). String dùng
  chung nhiều màn (OK/Cancel/Retry/Connect/Disconnect/Try again...) đặt ở
  `core/designsystem/src/main/res/values(-vi)/strings.xml` — mọi feature module đã phụ thuộc
  designsystem sẵn. String đặc thù từng màn hình đặt trong `res/` riêng của mỗi module `feature/*`
  (devices, home, profile, activity, onboarding — đều dùng `AndroidFeatureConventionPlugin` nên tự
  thêm `res/` được). String cấp app/notification ở `app/src/main/res/values(-vi)/strings.xml`
  (hiện chỉ có `app_name`). Thứ tự triển khai theo khối lượng + mức độ người dùng thấy:
  `feature/devices` (58 chỗ `Text("...")` hardcode) → `feature/home` (27) → `feature/profile` (21)
  → `app/.../notifications/` (1, nhưng là text hệ thống luôn hiển thị) → `feature/activity` (6) →
  `feature/onboarding` (4). Cơ chế chuyển locale: `AppCompatDelegate.setApplicationLocales` + toggle
  EN/VI trong Profile (không theo system locale mặc định) — vì user Việt Nam hay để máy ở English
  nhưng muốn riêng app này tiếng Việt. Nguồn: fork investigation 2026-11-08 (0 `stringResource` nào
  trong code thật trước khi có quyết định này, chỉ có `app/src/main/res/values/strings.xml` với
  đúng 1 string).
