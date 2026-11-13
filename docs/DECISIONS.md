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
  **Cập nhật 2026-11-12:** DeepSeek chạy qua lệnh riêng `claude-deepseek -p "<prompt>"` (script `~/bin/claude-deepseek`, config tách riêng `~/.claude-deepseek/settings.json`, model `deepseek-flash[1m]`), không còn dùng `claude-personal` cho DeepSeek. Mọi chỗ ghi "`claude-personal -p` (DeepSeek)" trong log cũ hiểu là `claude-deepseek -p`. `claude-personal` chỉ còn là gói Claude (Sonnet) cho coding. Lý do: tách hẳn endpoint/key DeepSeek khỏi login Claude subscription, gọi được cả từ shell non-interactive (không phụ thuộc alias zsh).
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
- **D-804** · 2026-11-08, xác nhận 2026-11-12 · Xiaomi Smart Band 8/9/10 (và 7 Pro) giữ trong catalog chỉ để hiển thị — **Chốt**
  Các model này dùng giao thức riêng của Xiaomi, không phải Huami/Zepp (chỉ Mi Band 5/6 và Xiaomi Smart Band 7 là Huami/Zepp thật); vẫn giữ trong `WatchCatalog` (vendor `ZEPP`) để hiện đúng tên và ảnh khi nhận ra tên quảng bá.
  Lý do: driver `:driver:zepp` (giao thức Huami) nhiều khả năng không nói chuyện được với các model này dù nhận diện được tên; cần driver Xiaomi riêng hoặc xác nhận trên máy thật trước khi coi là hỗ trợ đầy đủ.
  **Xác nhận trên máy thật 2026-11-12** (D-1188): user pair **Xiaomi Smart Band 10** thật, driver `:driver:zepp`
  throw đúng như dự đoán — không tìm thấy service GATT nào của Zepp (`UnsupportedDeviceException` ở
  `ZeppHandshake.kt:97`, "Watch exposes neither a supported channel auth module nor the legacy auth
  characteristic", xem D-1188). Xiaomi (non-Huami) **chưa từng được triển khai** trong app này — đây
  là gap đã biết, không phải bug, và không có driver Xiaomi riêng nào đang làm dở.

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

## Giao diện Home sau khi gộp — grid card, bottom nav animation, swipe, live dot (D-105x)

User gửi 3 ảnh tham khảo (`~/Downloads/IMG_1001.png`, `IMG_1002.png`, `IMG_1003.jpg` — giao diện
Health của một app vendor khác) làm reference về layout/animation, **không** tham khảo tính năng
độc quyền của họ (Health Clovers, Emotional wellbeing... — những card này KHÔNG được copy, D-803
vẫn áp dụng: chỉ lấy pattern UI chung, không lấy tên/thuật toán/tính năng gamification riêng của
hãng khác). Việc implement các mục dưới đây **chờ** agent đang làm D-1010/1011/1020 (gộp
Summary+Health, dời ring, thêm chart scrub) xong trước, vì cùng đụng `HomeScreen.kt` và nav host —
tránh 2 agent sửa song song cùng file.

- **D-1050** · 2026-11-08 · Layout dạng grid 2 cột cho Home sau khi gộp — **Tạm**
  Khi có thiết bị đã kết nối: card ring full-width ở đầu (giữ `RingsCard` đã dời lên theo D-1011) +
  thanh "Today's steps"-style ngay dưới, rồi tới grid 2 cột các card metric (mỗi card: tên chỉ số,
  giá trị mới nhất to, 1 mini-visual nếu có — line chart nhỏ/route map/hypnogram thu nhỏ — giống bố
  cục ảnh tham khảo). **Chỉ map vào các chỉ số app này thực sự có** (steps/calo/active-minutes đã
  có trong ring, heart rate, sleep, SpO2, VO2max — mới thêm D-1000 —, workouts/exercise records);
  KHÔNG tạo card giả cho Weight/Emotional wellbeing/Blood pressure vì app chưa thu thập các dữ liệu
  này — để trống/không hiện card đó thay vì bịa. Agent implement tự quyết số cột/kích thước theo
  Material 3, tự chọn chỉ số nào lên card riêng vs gộp vào pinned/highlights đã có.
- **D-1051** · 2026-11-08 · Bottom navigation dạng pill, animation khi đổi tab — **Chốt**
  Đổi bottom nav hiện tại (Material 3 `NavigationBar` tiêu chuẩn) sang dạng pill nổi giống ảnh tham
  khảo: nền pill bo tròn cho toàn thanh, tab đang chọn có icon+label màu nhấn + nền pill nhỏ di
  chuyển mượt (animate) theo tab khi đổi, tab khác chỉ icon xám. 4 tab sau khi gộp D-1010: Home
  (Summary+Health), Activity, Devices, Profile.
- **D-1052** · 2026-11-08 · Vuốt ngang để chuyển tab — **Chốt**
  Bọc 4 màn hình top-level trong `HorizontalPager` (Compose Foundation), đồng bộ 2 chiều với bottom
  nav: vuốt đổi trang thì pill nhảy theo, bấm pill thì pager animate-scroll sang trang đó.
- **D-1053** · 2026-11-08 · Tắt gesture back-vuốt-cạnh mặc định của Android ở các tab cha — **Tạm**
  Vì vuốt ngang giờ dùng để đổi tab (D-1052), gesture back-vuốt-từ-cạnh-trái mặc định của Android
  (predictive back / gesture nav) phải bị vô hiệu hoá trên các màn top-level để khỏi đánh nhau với
  `HorizontalPager`, nhưng vẫn phải hoạt động bình thường ở các màn con (MetricDetailScreen,
  DeviceDetailScreen, WorkoutDetailDestination...). Cách làm gợi ý (agent tự xác nhận khi code):
  `View.setSystemGestureExclusionRects()` loại trừ vùng cạnh trái/phải khỏi gesture hệ thống ngay
  trên Compose host của 4 màn top-level; không ảnh hưởng máy dùng nút back 3-nút (không có edge
  gesture để tắt). Đánh dấu Tạm vì cần test trên máy thật ở cả 2 chế độ điều hướng.
- **D-1054** · 2026-11-08 · Dot xanh/xám cho dữ liệu đang live — **Chốt**
  Các chỉ số có "live mode" (đọc liên tục khi đang kết nối, ví dụ heart rate) hiện dot màu xanh lá
  cạnh tên khi đang thực sự nhận dữ liệu live từ thiết bị; dot màu xám khi không live (giá trị cũ/
  cache, không có live stream đang chạy cho đúng chỉ số đó — khác với "thiết bị có đang connect hay
  không" vì từng chỉ số có thể live độc lập nhau). Dùng lại `core/domain/repository/LiveHealthRepository.kt`
  + `core/data/.../live/DefaultLiveHealthRepository.kt` đã có sẵn khái niệm "live" trong kiến trúc —
  expose state live theo từng metric (không chỉ 1 cờ live chung) nếu repository hiện tại chưa làm
  vậy, rồi bind dot màu vào đúng state đó trên mỗi card Home.
- **D-1055** · 2026-11-08 · Hai quyết định nhỏ khi thực thi D-1010/1011/1020 — **Chốt**
  (1) Bỏ hẳn nút "Show all health data" (`onBrowseAll`) khỏi `HomeScreen.kt`/`HomeNavigation.kt`/
  `UnifiedHealthNavHost.kt` thay vì "repoint" sang Home — sau khi gộp, nút này nằm ngay trên màn
  Home và sẽ trỏ về chính nó (no-op gây rối UI), nên không còn lý do giữ. Grep xác nhận không có
  nơi nào khác (feature khác) tham chiếu `onBrowseAll`/`FeedDestination`/`TopLevelDestination.HEALTH`
  trước khi xoá. (2) Khi gộp `FeedViewModel` vào `HomeViewModel`, lọc bỏ id `FeedCardId.ACTIVITY_RINGS`
  khỏi danh sách hiển thị trong dialog "Edit cards" (`feature/home` only, filter tại chỗ dùng —
  không sửa schema `UserPreferences`/`FeedCardId` ở `core/model` vì D-1010 ghi rõ "chỉ ảnh hưởng
  feature/home"); card Activity rings giờ cố định ngay sau `DeviceBanner` (D-1011) nên không còn
  cần một vị trí trong `feedCardOrder` nữa — id cũ trong dữ liệu đã lưu của người dùng cũ chỉ bị bỏ
  qua (`mapNotNull`), không gây lỗi.
  Lưu ý cho người review: `app/src/androidTest/kotlin/com/unified/health/e2e/*.kt` (DemoDataE2ETest,
  StandardWatchE2ETest, ZeppWatchE2ETest, GarminWatchE2ETest, UserJourneyE2ETest) vẫn còn tham chiếu
  tag cũ (`nav_HEALTH`, `feed_list`, `card_ACTIVITY_RINGS`) từ trước khi gộp — ngoài phạm vi
  android-coder (chỉ build `testDebugUnitTest` + `assembleDebug`, không chạy `connectedAndroidTest`/
  `scripts/e2e.sh`); cần một lượt sửa riêng bởi `e2e-flows` theo quy ước CLAUDE.md trước khi chạy E2E.

## Garmin D-1000/D-1001/D-1002 — implementation (D-106x)

- **D-1060** · 2026-11-08 · VO2 max field number — **Tạm**
  Triển khai đúng theo D-1000: `FitHealthMapper.MESG_USER_METRICS = 140`, `MESG_USER_PROFILE = 42`,
  cả hai đọc field số 7 (`vo2_max`) dạng số nguyên thường (không scale), lọc theo khoảng hợp lý
  10..95 mL/kg/min để loại giá trị rác (không phải sentinel 0xFF — FIT đã tự lọc sentinel ở tầng
  decode). Record gắn timestamp bằng `lastTimestamp` của message trước đó trong file (hai message
  này thường không tự mang field 253). Field number 7 và việc `user_profile` (42) thực sự có mang
  `vo2_max` hay không là suy đoán [Ext] chưa có file FIT thật xác minh —
  `TODO(garmin-protocol): NEEDS-REAL-WATCH` giữ trong `FitHealthMapper.mapVo2Max`. Không cần đổi gì
  ở `GarminFileSync`/`GarminFitFileType`: METRICS (subType 44) đã được liệt kê và tải về từ trước,
  chỉ là chưa ai parse message 140/42 bên trong.
- **D-1061** · 2026-11-08 · Battery poll → Room qua `batteryUpdates` Flow — **Chốt**
  Thêm `WearableSession.batteryUpdates: Flow<Int>` (mặc định `emptyFlow()`, giống pattern
  `liveHeartRate` đã có) + `DeviceConnection.batteryUpdates` (mặc định rỗng) +
  `MultiVendorDeviceConnection.batteryUpdates` (flatMapLatest theo session đang active). Chỉ
  `GarminSession` override thật: mỗi tick 10 phút của `startBatteryPolling()` vẫn gửi 5023 như cũ
  (không đổi hành vi/test cũ) nhưng giờ cũng tự đọc SIG 0x180F ngay trong tick đó; giá trị đọc được
  (SIG hoặc 5023 giải mã được, qua `onMessage`) đều `tryEmit` vào `MutableSharedFlow<Int>(replay=1)`.
  `DefaultWearableDeviceRepository` collect flow này trong `init{}` (CoroutineScope riêng của
  repository, không cancel — cùng kiểu với scope nội bộ của `MultiVendorDeviceConnection`), ghi
  bằng `PairedDeviceDao.updateBattery(id, battery)` mới (chỉ update cột battery, không đụng
  firmware/model như `updateInfo`) với `deviceId = connection.activeAddress.value` (bằng
  `macAddress`, đúng bằng `entity.id` theo cách `pair()` tạo). Hệ quả: pin không còn treo `null`
  tới khi disconnect/reconnect nếu lần đọc lúc connect() thất bại — lần poll kế tiếp (tối đa 10
  phút sau) sẽ tự điền. Không sửa `Huawei/Standard/Zepp/Coros Session` vì `batteryUpdates` có default
  rỗng, không bắt buộc override.
- **D-1062** · 2026-11-08 · D-1002 (`feature/sleep`) — xác nhận đã dọn sạch — **Chốt**
  Kiểm tra lại: không còn thư mục `feature/sleep` nào trên đĩa (ngoài thư mục decompile Zepp không
  liên quan ở `docs/re-evidence/`), không có dòng nào nhắc `sleep` trong `settings.gradle.kts` hay
  `app/build.gradle.kts`, và `UnifiedHealthNavHost.kt` hiện tại không có route/import nào liên quan
  `SleepScreen`/`navigateToSleep`. D-808 đã áp dụng đầy đủ từ trước — không có gì để xoá thêm ở
  đợt này; nghi ngờ trong D-1002 (lo sợ bị merge revert) không xảy ra trên nhánh hiện tại.

- **D-1070** · 2026-11-08 · Chẩn đoán trực tiếp trên máy thật: sleep/resting HR/SpO2 vẫn trống — **Tạm**
  User báo sau khi cài APK thật và kết nối Garmin thật, 3 chỉ số sleep/resting HR/SpO2 vẫn chưa
  hiện. Đọc `adb logcat` trực tiếp: `GarminFileSync` log "Directory: 59 entries, ... {MONITORING=31,
  METRICS=23, WELLNESS_49=2}" — `WELLNESS_49` (2 file, theo `docs/protocols/GARMIN_DEVICE_PROTOCOL.md`
  §... ghi `[I]` là "nhiều khả năng sleep/wellness", chưa xác nhận) giữ nguyên số lượng qua nhiều vòng
  sync, cursor `wellness since` đã đi qua 2 file đó từ trước (giờ 10:5x cùng ngày) — nghĩa là 2 file
  này đã được tải/giải mã từ sớm hơn hôm nay, không phải đang bị bỏ qua. Đọc code xác nhận
  `GarminFileSync.sync()` cho MỌI loại file non-activity (kể cả `WELLNESS_49`) đi qua đúng 1 pipeline
  `FitHealthMapper.map()` — không có nhánh nào bỏ qua `SLEEP_LEVEL`(275)/`SPO2_DATA`(269)/
  `MONITORING_HR_DATA`(273) theo loại file; code không phải nguyên nhân thiếu dữ liệu. `decodeFailures=0`
  suốt log — không có file nào giải mã lỗi.
  **Kết luận tạm thời (chưa xác nhận 100%, cần quan sát thêm):** nhiều khả năng đây là giới hạn dữ
  liệu từ chính đồng hồ chứ không phải bug: (1) Sleep cần qua 1 đêm ngủ thật với đồng hồ đeo mới có
  file mới; test đang làm vào buổi chiều cùng ngày pairing nên chưa có gì để sync. (2) Resting HR
  Garmin thường tính 1 lần vào sáng sớm dựa trên đêm trước; pairing mới trong ngày chưa có giá trị
  này. (3) SpO2 "all-day"/Pulse Ox trên đa số đồng hồ Garmin **mặc định TẮT** để tiết kiệm pin — cần
  user tự bật trong cài đặt trên đồng hồ (Settings → Sensors → Pulse Ox → All-day) thì máy mới sinh
  ra message `SPO2_DATA`(269) để app đọc được.
  **Đã thêm ngay:** log `byKind=<map tên record → số lượng>` vào dòng "Sync finished" của
  `GarminFileSync.kt` (trước đây chỉ có tổng `totalRecords`) — lần sync tới (đặc biệt sau 1 đêm ngủ)
  sẽ thấy ngay chính xác loại nào có/không, không cần đoán nữa.

- **D-1071** · 2026-11-08 · VO2max vẫn không ra dù user nói đồng hồ đã có số — **Tạm**
  Log thật từ build có `byKind` (D-1070) cho thấy đã có 1 file `METRICS` được tải + giải mã thành
  công trong 1 lần sync (`downloaded 2/2 files {METRICS=1, MONITORING=1}, decoded=2 decodeFailures=0
  ... byKind={HeartRate=6, Stress=7}`) — **0 Vo2Max**, dù METRICS chính là loại file [Ext] mà
  `MESG_USER_METRICS`(140) được kỳ vọng nằm trong đó. Vì user xác nhận đồng hồ thật đang có số
  VO2max, nhiều khả năng field number 140/42/field-7 (`[Ext]`, đoán theo Profile.xlsx công khai,
  D-1000) sai, hoặc thứ tự message khiến `lastTimestamp` null lúc gặp msg 140 (dòng
  `lastTimestamp?.let { mapVo2Max(...) }` bỏ qua silent nếu null) — **chưa xác nhận được cái nào**.
  **Đã thêm log sâu hơn** (`decode()` trong `GarminFileSync.kt`): mỗi file giải mã giờ log toàn bộ
  histogram `globalNumbers` thật có trong file (trước khi `FitHealthMapper` lọc bớt), và log riêng
  bất kỳ message nào có `globalNumber` 140/42 kèm `value(field 7)` thật đọc được — lần sync tới sẽ
  thấy ngay: (a) msg 140/42 có xuất hiện trong file thật không, (b) nếu có thì field 7 đọc ra giá
  trị gì (đúng VO2max / sai field / không có field này). Không sửa mù field number khi chưa có bằng
  chứng — chờ log thật rồi vá đúng chỗ.

- **D-1072** · 2026-11-08 · Bỏ hẳn section "Pinned" khỏi Home — **Chốt**
  Không chỉ dời hay gộp — xoá hẳn section "Pinned" (card ghim) khỏi `HomeScreen.kt` sau khi gộp
  Summary+Health (D-1010). Lý do: user phản hồi trực tiếp; "All metrics"/full feed (gộp từ
  `FeedScreen` theo D-1010) đã hiển thị mọi chỉ số rồi, Pinned chỉ là tập con trùng lặp không cần
  thiết. Thứ tự Home còn lại: DeviceBanner → RingsCard → "All metrics" (xem D-1073/1074).
- **D-1073** · 2026-11-08 · Nút chuyển chế độ hiển thị cho "All metrics" — **Chốt**
  Thêm nút switch 2 chế độ hiển thị cho section "All metrics" (đặt cạnh tiêu đề section): **List**
  — mỗi metric chiếm 1 row full-width, có chart; **Grid** — 2 cột như hiện tại (D-1050), không có
  hoặc chart rất nhỏ, chỉ tên + giá trị. Áp dụng ngay tại chỗ, không cần màn riêng.
- **D-1074** · 2026-11-08 · Lưu chế độ hiển thị vào `UserPreferences` — **Chốt**
  Thêm field mới trong `UserPreferences`/DataStore (enum 2 giá trị, ví dụ `homeMetricsViewMode`:
  `LIST` | `GRID`), mặc định `GRID` (giữ hành vi hiện tại không đổi cho user cũ), lưu theo đúng
  pattern các preference khác (`dailyStepGoal`...) — đổi 1 lần, nhớ mãi, không hỏi lại mỗi lần mở
  app.
- **D-1075** · 2026-11-08 · Hiện "Last synced" luôn trên Home/Summary — **Chốt**
  Thêm dòng/label "Last synced: <thời điểm>" hiển thị thường trực trên màn Home (gần `DeviceBanner`,
  không phải chỉ trong Device Detail) — lấy từ `lastSyncedAt` đã có ở `PairedDeviceDao`/model, format
  tương đối ("2 phút trước") giống style cũ, cập nhật realtime khi có sync mới. Lý do: user muốn dễ
  nhìn trạng thái đồng bộ ngay trên Summary thay vì phải vào Device Detail mới thấy.
  Lưu ý: chưa implement trong đợt android-coder hiện tại (D-1076..1081 dưới đây) — quyết định này
  được log bởi agent/phiên khác trong lúc android-coder đang làm dở D-1050..1054, không nằm trong
  brief gửi cho android-coder lần này nên **không** động vào để tránh đụng việc của người khác; cần
  một lượt riêng để implement.

## Thực thi D-1050..1054 + D-1072..1074 (grid/list toggle, pill nav, pager, edge-swipe, live dot) — D-107x

- **D-1076** · 2026-11-08 · Kiến trúc gộp 4 tab top-level vào 1 `HorizontalPager` — **Chốt**
  Thay vì 4 `composable<>` NavHost destination riêng (Home/Activity/Devices/Profile), tạo 1 destination
  duy nhất `MainPagerDestination` (`app/.../navigation/MainPagerDestination.kt`) chứa `HorizontalPager`
  với 4 trang gọi thẳng composable của từng feature. Mỗi feature module thêm 1 wrapper public mới
  (`HomeTabContent`, `ActivityTabContent`, `DevicesTabContent`, `ProfileTabContent`) vì composable
  `...Route` gốc là `internal` (chỉ app module mới cần gọi xuyên module để nhúng vào pager — không
  đổi `internal` của `...Route` để giữ nguyên tắc encapsulation). Các destination con (MetricDetail,
  MetricData, WorkoutDetail, DeviceDetail, NotificationSettings) giữ nguyên, vẫn push/pop trên cùng
  `NavHost` như cũ — chỉ 4 destination top-level bị gộp. `PagerState` được hoist ở `UnifiedHealthApp`
  (phía trên `NavHost`), nên khi push/pop 1 màn con, tab đang chọn không bị mất — không cần thêm state
  riêng để nhớ tab trước đó. `TopLevelDestination` enum bỏ `route`/`routeClass` (không còn là NavHost
  destination riêng), `entries` order = thứ tự trang trong pager (index = `ordinal`).
- **D-1077** · 2026-11-08 · Pill indicator theo `PagerState` trực tiếp, không `animateDpAsState` thêm — **Chốt**
  D-1051 gợi ý `animateFloatAsState`/`animateDpAsState`; thực tế dùng trực tiếp
  `pagerState.currentPage + pagerState.currentPageOffsetFraction` (giá trị liên tục, cùng cách Google
  dùng cho pager indicator mẫu) làm vị trí pill, vì `pagerState` tự animate mượt khi tap
  (`animateScrollToPage`) và update 1:1 theo ngón tay khi vuốt — bọc thêm 1 lớp animate riêng sẽ làm
  pill trễ hơn ngón tay lúc đang vuốt thật. Tab được tô màu "đang chọn" = index gần vị trí liên tục
  nhất (`position.roundToInt()`), không phải tab đang hiển thị đầy đủ trên màn (khớp cảm giác "đang
  kéo sang tab nào" khi còn nửa chừng). Chiều cao thanh pill cố định 72dp (không least-size) vì pill
  indicator con dùng `fillMaxHeight()`, cần constraint hữu hạn từ cha.
- **D-1078** · 2026-11-08 · Chi tiết `View.systemGestureExclusionRects` cho D-1053 — **Tạm**
  `EdgeGestureExclusion` (`app/.../ui/EdgeGestureExclusion.kt`) chỉ bật khi `currentDestination` đang
  là `MainPagerDestination` (tự tắt + xoá rects ngay khi có màn con được push lên trên, nhờ
  `DisposableEffect(enabled, ...)`), 2 dải cạnh trái/phải rộng 32dp, cao full màn hình, tự tính lại khi
  `View.OnLayoutChangeListener` báo đổi kích thước (xoay máy, đổi inset), guard `Build.VERSION.SDK_INT
  >= Q` (API thấp hơn không có gesture nav để tắt). Vẫn **Tạm** như D-1053 đã đánh dấu — chưa có máy
  thật/emulator ở chế độ gesture-nav để xác nhận 32dp đủ thắng vùng edge-swipe mặc định của OEM (một số
  máy Samsung/OEM khác có vùng edge rộng hơn AOSP); 3-button nav không bị ảnh hưởng (không có gesture
  để exclude).
- **D-1079** · 2026-11-08 · `LiveHealthRepository.liveMetrics` tính theo độ mới (freshness), không theo trạng thái connect — **Chốt**
  `heartRate` (`StateFlow`) vốn giữ giá trị cuối ngay cả sau khi mất kết nối (theo đúng thiết kế đã có,
  "collector trễ vẫn thấy giá trị gần nhất") — nên KHÔNG thể dùng `heartRate.value != null` hay
  `connection.state == Connected` để suy ra "đang live", vì cả hai đều có thể true trong khi giá trị
  hiển thị thực ra đã cũ. Thêm `liveWhileFresh(maxAge)` (`DefaultLiveHealthRepository.kt`): true ngay
  khi có reading mới, tự chuyển false sau 15s (cùng hằng số `LIVE_MAX_AGE` mà `HomeScreen.freshBpm` đã
  dùng) nếu không có reading mới hơn — dùng `flatMapLatest` + `delay` 1-shot, không phải vòng lặp tick.
  Hiện chỉ `HEART_RATE` có live mode (driver chỉ expose `liveHeartRate`); thêm metric live khác sau này
  chỉ cần lặp lại pattern `liveWhileFresh` cho stream riêng của nó rồi `combine` vào `liveMetrics`.
  Giá trị bpm live cũng ghi đè lên value/time hiển thị của card heart-rate trong "All metrics" (cả List
  lẫn Grid) — hành vi này trước đây chỉ có ở card "Pinned" (đã xoá theo D-1072), nay chuyển sang card
  chính để không mất tính năng.
- **D-1080** · 2026-11-08 · Thêm `HealthMetricType.VO2_MAX` để có card VO2max (D-1050) — **Tạm**
  D-1050 yêu cầu card VO2max nhưng domain model chưa có `HealthMetricType.VO2_MAX` (mới chỉ có
  `HealthRecord.Vo2Max`/`SampleType.VO2_MAX` ở tầng lưu trữ theo D-1000/D-1060) — thêm entry mới
  (aggregation `DISCRETE`, icon/label/unit/màu riêng ở `core/designsystem`, `MetricSeriesBuilder.typesFor
  VO2_MAX -> [SampleType.VO2_MAX]`, thêm vào `UserPreferences.DEFAULT_FEED_CARD_ORDER`) — tự động có
  card trong "All metrics" vì `HomeViewModel.ALL_METRICS = HealthMetricType.entries` đã lặp hết mọi
  metric từ trước. `DemoHealthDataGenerator` seed thêm 1 reading VO2max/ngày (giá trị suy ra từ activity
  trend, không phải thuật toán thật — D-803) để demo data / `DemoDataSeederTest` có dữ liệu hiển thị.
  Đánh dấu Tạm vì field number/mapping FIT thật của VO2max (D-1060) vẫn còn `NEEDS-REAL-WATCH`; phần
  Tạm ở đây chỉ là việc thêm `HealthMetricType` mới, không phải lại nghi vấn field FIT.
- **D-1081** · 2026-11-08 · Card nào lên grid, card nào gộp — tái dùng nguyên hệ feed card cũ — **Chốt**
  Theo D-1050 "agent tự chọn chỉ số nào lên card riêng vs gộp vào pinned/highlights đã có": chọn tái
  dùng toàn bộ hệ `FeedCardData`/"All metrics" đã có (mọi `HealthMetricType` + Workouts, không lọc bớt)
  thay vì tạo 1 danh sách card con mới — đơn giản hơn, không trùng lặp code, và D-1072 vừa xoá "Pinned"
  nên feed này giờ là nơi duy nhất hiển thị từng metric. List mode = card đầy đủ hiện có (chart, dòng
  resting bpm/sleep score, insight 1 dòng). Grid mode (compact) = cùng card nhưng ẩn resting bpm/sleep
  score/insight, chart thu nhỏ còn 36–48dp (`MiniChart(tiny = true)`), theo đúng yêu cầu D-1073 "không
  có hoặc chart rất nhỏ, chỉ tên + giá trị". `WorkoutsFeedCard` compact tương tự: chỉ số lượng gần đây +
  1 dòng workout gần nhất, bỏ danh sách đầy đủ.

- **D-1082** · 2026-11-08 · Tìm ra field/message number SAI cho resting HR, HRV, VO2max qua jadx evidence đã có — **Chốt**
  (Đánh số lại từ D-1080 ban đầu vì trùng với D-1080 "thêm `HealthMetricType.VO2_MAX`" do agent
  redesign Home log song song cùng lúc — nội dung không đổi, chỉ đổi số để hết trùng.)
  Theo đúng feedback của user ("update rules không đoán, tất cả đã có trong docs/re-evidence") — đọc
  qua `claude-personal -p` (DeepSeek, D-003) các class FIT profile bundle sẵn trong Garmin Connect
  Mobile tại `docs/re-evidence/garmin/jadx-base/sources/bs2/*.java` (đã có từ trước, không cần RE
  thêm). Kết quả xác nhận **[V]** bằng source thật:
  - `monitoring_hr_data` = **211** (không phải 273 như đoán cũ) — `bs2/uk.java`: `new bk("monitoring_hr_data", 211)`.
  - `hrv_status_summary` = **370** (không phải 389) — `bs2/wg.java`; field `last_night_average` = **1** (không phải 4), scale 128.
  - VO2max **không nằm trong `user_metrics`(140)/`user_profile`(42)** như đoán cũ (2 message đó xác
    nhận KHÔNG BAO GIỜ xuất hiện trong 63 file sync thật từ đồng hồ — D-1071/D-1070) — mà nằm trong
    message riêng **`max_met_data` = 229** (`bs2/pj.java`), field **2** `vo2_max`, scale **10** (raw÷10
    → mL/kg/min, không phải "plain integer" như đoán cũ), và message này có field 0 `update_time`
    (date_time) riêng — không dùng field 253 chuẩn như các message khác.
  - Đối chiếu công khai: 5 class DTO của Garmin Connect app (`UserDailySummaryDTO`,
    `CurrentTrainingStatusDTO`, `TrainingStatusReportDTO`, `BiometricProfileDTO`,
    `VO2MaxReportsActivity`) xác nhận app Garmin Connect lấy các số này từ **REST cloud**
    (`usersummary-service`, `metrics-service`...), nhưng FIT profile bundle sẵn trong app vẫn có đủ
    `max_met_data`/`stress_level`/`sleep_level`/`monitoring_hr_data`/`hrv_status_summary` — nghĩa là
    **cùng dữ liệu khả dụng qua local BLE (GFDI file manager → FIT)**, không cần cloud/Garmin Connect
    Developer Program.
  - Đã sửa `FitHealthMapper.kt` theo đúng 3 giá trị trên + scale VO2max, cập nhật
    `FitHealthMapperTest.kt` theo field/scale mới, xoá nhánh `MESG_USER_METRICS`/`MESG_USER_PROFILE`.
  **Rule mới cho mọi việc RE Garmin/vendor khác sau này (áp dụng ngay, không chỉ lần này):** không
  được đoán message/field number FIT và gắn nhãn `[Ext]` khi chưa kiểm tra `docs/re-evidence/<brand>`
  trước — app Garmin Connect (và tương tự Huawei Health/Zepp/COROS) luôn bundle sẵn FIT profile đầy đủ
  của chính nó trong APK, nên gần như chắc chắn evidence thật đã nằm sẵn trong `docs/re-evidence/`
  (ở dạng jadx, đọc qua `claude-personal -p` theo D-003) trước khi phải đoán hoặc hỏi thêm. Xem CLAUDE.md.

- **D-1083** · 2026-11-08 · Animation thu nhỏ device row khi scroll trên Home/Summary — **Chốt**
  Khi scroll xuống: row thiết bị (`DeviceBanner`, full-size) co lại dần thành dạng nhỏ — chỉ tên
  đồng hồ + ảnh — rồi "nhảy" lên góc phải của top app bar/header (nếu header đang hiện khi đã scroll
  đủ xa). Ở đầu trang (chưa scroll): row thiết bị đầy đủ + header tách biệt như hiện tại, không đổi.
  Hiệu ứng liên tục theo % scroll (không phải bật/tắt đột ngột). Cùng nhóm việc Home với D-1075 (Last
  synced luôn hiện) — cả hai đều chưa làm, giao lại cho agent đã làm D-1050-1054/1072-1074 (đã có
  context `HomeScreen.kt`/`MainPagerDestination` mới nhất) tiếp tục thay vì agent mới.

- **D-1084** · 2026-11-08 · `PillBottomNavigation` chưa né navigation bar hệ thống của Android — **Chốt**
  User test thật thấy bottom nav mới (D-1051, pill nổi) không tính tới system navigation bar của
  Android (gesture-nav pill hoặc 3-nút) — cần padding/inset đúng (`WindowInsets.navigationBars`,
  giống cách `NavigationBar` Material 3 mặc định vẫn làm) để pill không bị đè/che bởi thanh điều
  hướng hệ thống, đúng trên cả 2 chế độ điều hướng (gesture và 3-nút). Không đụng tới phần né
  edge-swipe-back (D-1053/1078) — đó là vấn đề khác (cạnh trái/phải, không phải cạnh dưới).
- **D-1085** · 2026-11-08 · Grid mode (compact) xấu — bỏ hẳn chart, viết tắt tên chỉ số — **Chốt**
  Phản hồi trực tiếp sau khi thấy Grid mode compact (D-1050/1073, mini chart 36–48dp) trên máy thật:
  xấu, cần sửa lại. Grid mode: **bỏ hẳn** mini chart (không phải thu nhỏ nữa) — chỉ tên chỉ số
  (viết tắt gọn, ví dụ "Heart rate" → "HR", "Active calories" → "Cal", "Resting HR" → "RHR" — agent
  tự chọn viết tắt hợp lý, dễ nhận ra) + giá trị lớn, layout 2 cột đơn giản dễ nhìn. List mode (D-1073)
  giữ nguyên full chart + chi tiết như đã làm, không đổi.

- **D-1086** · 2026-11-08 · Kiểm lại `session`(18) cho activities/workout qua re-evidence — đúng, không cần sửa — **Chốt**
  User hỏi lại "activities thì sao, check lại re-evidence" sau khi D-1082 tìm ra 2/3 field number sai
  cho resting HR/HRV/VO2max — kiểm tra luôn `session` message (activities/workout, D-1086 mới) theo
  đúng quy trình mới (CLAUDE.md, không đoán). Đọc `docs/re-evidence/garmin/jadx-base/sources/bs2/fs.java`
  qua `claude-personal`: `session` = **18** (đúng), và cả 7 field ta đang dùng đều khớp 100% bằng chứng
  thật — `start_time`=2, `sport`=5, `total_elapsed_time`=7 (scale 1000), `total_distance`=9 (scale 100),
  `total_calories`=11 (không scale), `avg_heart_rate`=16, `max_heart_rate`=17. **Không có bug** ở phần
  field number cho activities — khác với resting HR/HRV/VO2max. Đổi comment trong `FitHealthMapper.kt`
  từ `[Ext]` sang `[V]` cho khối field này. Phần activities trước đó "chưa sync về" (báo cáo ban đầu
  của user) là do bug sync-window/dedup đã fix ở `a29ea95`/`22e81d2` (trước phiên này), không phải do
  field number sai.

## Thực thi D-1075/1083/1084/1085 (Last synced, collapsing device banner, pill nav insets, grid cleanup) — D-108x

- **D-1087** · 2026-11-08 · "Last synced" trên Home: label tương đối tự làm mới — **Chốt**
  Thêm dòng "Last synced ..." vào `DeviceBanner` (`HomeScreen.kt`), lấy thẳng từ `state.device.lastSyncedAt`
  đã có sẵn trong luồng dữ liệu hiện tại (không cần sửa ViewModel/repository — `observePrimaryDevice()`
  đã reactive theo Room). Không có formatter tương đối có sẵn nào trong code (Devices/Device Detail chỉ
  format tuyệt đối "Nov 8, 5:30 PM") nên viết mới `relativeTimeLabel`: "just now" / "N minute(s) ago" /
  "N hour(s) ago" / "N day(s) ago" / ngày tuyệt đối sau 7 ngày. `rememberRelativeSyncLabel` tự làm mới
  mỗi 30s (`LaunchedEffect` keyed theo `lastSyncedAt`, restart ngay khi có giá trị mới) để nhãn không bị
  cũ khi màn hình mở lâu mà không sync — đáp ứng "update realtime khi có sync mới" mà không cần tick mỗi
  giây (lãng phí, D-1075 không yêu cầu độ chính xác giây).
- **D-1088** · 2026-11-08 · Hiệu ứng thu nhỏ DeviceBanner: transform hình ảnh, không resize layout — **Chốt**
  Cách làm: `LazyListState` được hoist lên `HomeScreen` (trước đó chỉ tồn tại trong `Summary`), tính
  `deviceBannerCollapseFraction` (0..1) từ `firstVisibleItemScrollOffset / deviceBannerHeightPx` (đo qua
  `Modifier.onSizeChanged` ngay trên `DeviceBanner`) khi item 0 còn trong viewport, = 1 khi đã scroll
  qua. Áp fraction này vào `Modifier.graphicsLayer { scaleX/scaleY/alpha }` trên `DeviceBanner` — **chỉ
  biến đổi hình ảnh, không đổi kích thước layout thật sự** của item trong `LazyColumn`, để tránh vòng lặp
  phản hồi (kích thước phụ thuộc scroll, scroll lại phụ thuộc kích thước — anti-pattern Compose đã biết).
  Chip nhỏ (ảnh + tên) đặt thẳng trong `actions` của `TopAppBar` (fade theo cùng fraction qua
  `graphicsLayer { alpha }`) — nhờ nằm trong `TopAppBar` nên tự động chỉ hiện khi header đang hiện (đúng
  yêu cầu D-1083 "nếu header đang hiện"), không cần logic riêng theo dõi trạng thái ẩn/hiện của
  `enterAlwaysScrollBehavior`. Không làm shared-element transition thật (banner "biến hình" liền mạch
  thành chip) — độ phức tạp không tương xứng ở quy mô này, và bản thân D-1083 đã chủ động dùng từ "nhảy"
  (có ngoặc kép) khi mô tả bước chip xuất hiện ở header, ngụ ý chấp nhận một bước nhảy rời rạc miễn phần
  thu nhỏ chính (0→100%) mượt theo scroll — đúng những gì bản này làm.
- **D-1089** · 2026-11-08 · `PillBottomNavigation` né system navigation bar — **Chốt**
  Thêm `Modifier.windowInsetsPadding(WindowInsets.navigationBars.only(Horizontal + Bottom))` vào
  `Surface` ngoài cùng của pill nav, trước padding lề (`Spacing.lg`/`Spacing.md`) đã có — giống cách
  `NavigationBar` chuẩn của Material 3 tự né `NavigationBarDefaults.windowInsets`. `Scaffold` ở
  `UnifiedHealthApp.kt` đặt `contentWindowInsets = WindowInsets(0)` (để mỗi `TopAppBar` con tự quản insets
  riêng) nhưng không ảnh hưởng gì ở đây — `WindowInsets.navigationBars` đọc thẳng từ hệ thống qua
  `LocalView`, độc lập với tham số đó. Không đụng tới phần né edge-swipe-back trái/phải (D-1053/1078).
- **D-1090** · 2026-11-08 · Grid mode: bỏ hẳn chart, viết tắt theo bảng sau — **Chốt**
  Theo đúng D-1085: Grid card giờ chỉ có icon + tên viết tắt (+ dot live nếu có) + giá trị lớn, không
  còn gọi `MiniChart` (trước đó còn gọi với `tiny = true`, nay `MiniChart` bỏ hẳn tham số `tiny`, chỉ
  List mode mới gọi). Bảng viết tắt (`HealthMetricType.compactLabel()`, agent tự chọn theo gợi ý trong
  quyết định): Heart rate→**HR**, Active energy→**Cal**, Resting heart rate→**RHR**, Exercise
  minutes→**Exercise**; các chỉ số còn lại (Steps/Sleep/SpO2/Stress/Distance/HRV/VO2max) giữ nguyên tên
  đầy đủ vì đã đủ ngắn cho 2 cột. List mode không đổi gì (vẫn full chart + chi tiết).

- **D-1091** · 2026-11-08 · Tắt ripple trên `PillBottomNavigation` — **Chốt**
  `PillNavItem` dùng `Modifier.selectable(...)` mặc định có ripple từ `LocalIndication`; user phản hồi
  tắt đi vì đã có pill trượt làm feedback trực quan rồi, ripple thừa/xấu. Sửa: truyền
  `interactionSource = remember { MutableInteractionSource() }` + `indication = null` vào
  `selectable()`.
- **D-1092** · 2026-11-08 · Mở rộng lookback cho file METRICS (BIOMETRIC, chứa VO2max) giống ACTIVITY — **Tạm**
  User báo sync xong vẫn chưa thấy VO2max lẫn activities. Điều tra qua `claude-personal` đọc tiếp
  `docs/re-evidence/garmin` (theo đúng rule mới, D-1082): subtype 44 thật sự tên là **BIOMETRIC**
  trong Garmin Connect (`cl2/c.java:476-477`), chứa đúng họ message `metrics_info`(241)/
  `recovery_time`(284)/`race_predictions_run`(339)/`performance_capacity_results`(356) — **không bị
  gán nhãn sai**, và 229 (`max_met_data`) vẫn đúng thuộc họ này dù APK không có bảng tĩnh
  subtype→message (tên subtype lấy động từ phản hồi 5031 của chính đồng hồ). subtype 49 xác nhận
  đúng là **SLEEP_DATA** (hằng thật `bs2/ad.java:90`), không phải "wellness" chung chung như tên biến
  cũ `WELLNESS_49` gợi ý (đổi tên để sau, không gấp).
  **Activities = 0 vì đồng hồ hiện chưa có file ACTIVITY nào trong directory** (log thật: "FIT of
  interest {MONITORING=56, METRICS=24, WELLNESS_49=2}" — không có khoá `ACTIVITY` nào) — nghĩa là
  user chưa ghi nhận buổi tập nào trên đúng đồng hồ test này; không phải bug.
  **VO2max vẫn không thấy** dù 24 file METRICS(44) trong 7 ngày gần nhất đã sync đủ và không file nào
  chứa message 229 — giả thuyết hợp lý nhất: giá trị VO2max hiện có trên đồng hồ được tính từ **trước
  đó quá 7 ngày** (`wellnessSince` mặc định dùng chung `DEFAULT_FIRST_SYNC_WINDOW_DAYS=7`,
  `core/ble/.../WearableSession.kt`), nằm trong 1 file METRICS cũ hơn mà driver chưa từng tải vì nằm
  ngoài cửa sổ 7 ngày — cùng pattern bug đã từng xảy ra với ACTIVITY (fix bằng
  `ACTIVITY_LOOKBACK_DAYS=365` ở `a29ea95`/`22e81d2`). **Đã sửa:** `GarminFileSync.sync()` giờ cho
  `GarminFitFileType.METRICS` dùng cùng lookback dài 365 ngày như ACTIVITY (biến `metricsSince`),
  dedup qua `knownRawPayloadTimestamps` y hệt activity (vì lookback cố định, không theo cursor tăng
  dần, nếu không sẽ tải lại y hệt các file cũ mỗi lần sync mãi mãi). Đánh dấu Tạm vì chưa test trên
  máy thật có ra VO2max hay không sau khi mở rộng cửa sổ — nếu vẫn không ra nghĩa là giả thuyết sai,
  cần điều tra tiếp (có thể do `update_time` field 0 thay vì 253 khiến logic timestamp-từ-đâu có vấn
  đề khác, hoặc giá trị thật sự chưa từng được watch ghi vào bất kỳ file nào qua đường BLE này).

**Cập nhật 18:5x:** user xác nhận VO2max + workouts đã ra sau fix D-1092 — giả thuyết đúng, Tạm → Chốt.

## Workout detail chi tiết kiểu Huawei Health (D-1093+)

User thấy màn chi tiết workout hiện tại ("Workout detail" theo D-804) quá sơ sài so với Huawei Health.
Điều tra qua `claude-personal` theo đúng quy trình (không đoán):

- **`docs/re-evidence/huawei/jadx-out`**: Huawei Health model 1 workout rất giàu —
  `HiTrackMetaData.java` (avgPace/bestPace, avgStepRate, paceMap, **partTimeMap = split theo km**,
  max/min altitude, total descent, max/min SpO2, running dynamics: ground contact time, vertical
  oscillation/eversion/swing angle, strike pattern); `MotionData.java` (chuỗi theo giây: HR, pace,
  speed, altitude, cadence, power, SpO2 — nguồn vẽ graph); `WorkoutRecordPaceMap.java` (bảng split
  mỗi km: distance/pace/pointIndex); `MotionPathDetail.java` (route GPS: lat/long/altitude/timestamp);
  `WorkoutRecord.java` (`intensityZone` = HR zone breakdown). **Không có** field VO2max riêng theo
  từng workout, không có stride-length field thật (chỉ có string resource).
- **`docs/re-evidence/garmin/jadx-base`**: FIT `lap`(19, `bs2/ti.java`) có đủ `total_elapsed_time`(7,
  scale 1000)/`total_distance`(9, scale 100)/`total_calories`(11)/`avg_speed`(13)/`max_speed`(14,
  scale 1000)/`avg_heart_rate`(15)/`max_heart_rate`(16)/`avg_cadence`(17)/`max_cadence`(18)/
  `total_ascent`(21)/`total_descent`(22) — đủ để làm **bảng split theo lap/km** giống
  `WorkoutRecordPaceMap` của Huawei. FIT `record`(20, `bs2/zp.java`) có `timestamp`(253)/
  `position_lat`(0)/`position_long`(1)/`altitude`(2, scale 5 offset 500)/`heart_rate`(3)/`cadence`(4)/
  `distance`(5, accumulate)/`speed`(6, scale 1000)/`power`(7)/`temperature`(13) — đủ để vẽ **graph
  pace/HR/elevation theo thời gian** và **route GPS** giống `MotionData`/`MotionPathDetail`. Cả 2
  message này nằm chung file ACTIVITY (FIT_TYPE_4) đã tải sẵn — **chưa parse**, chỉ `FitHealthMapper`
  mới đọc `session`(18) cho tới giờ.

- **D-1093** · 2026-11-08 · Scope v1 cho workout detail chi tiết — **Chốt**
  Làm trong khả năng dữ liệu Garmin thật có (không bịa): (1) Parse `lap`(19) → bảng split mỗi lap/km
  (thời gian, pace, HR TB, cadence TB, độ cao lên/xuống) — thêm `HealthRecord.WorkoutLap` liên kết
  `workoutId`. (2) Parse `record`(20) → chuỗi theo giây cho pace/HR/elevation (route GPS CÓ parse
  luôn vì field rẻ, nhưng **render bản đồ route để P2** — cần thư viện map, không làm vòng này) —
  thêm `HealthRecord.WorkoutSample` (timestamp, lat?, long?, altitudeM?, heartRate?, cadence?, paceMps?).
  (3) `WorkoutDetailScreen` thêm: graph pace+HR+elevation theo thời gian (dùng lại `HealthCharts`),
  bảng split theo lap, HR zone breakdown thời gian (% mỗi zone, tính từ chuỗi HR + `MetricThresholds`
  đã có D-1030 — không cần field riêng), cadence TB/max, tổng lên/xuống dốc.
  **Không làm** (lý do): route map hiển thị (P2, cần map SDK); Training Effect/Load/Recovery/Running
  Score kiểu Huawei (tên + công thức độc quyền, D-803); running dynamics sâu (ground contact
  time/vertical oscillation...) vì Garmin FIT `record`/`lap` chuẩn không có các field này (Garmin có
  message riêng `event`/`length` cho running dynamics nhưng chưa xác nhận qua re-evidence — để P2 nếu
  cần).
- **D-1094** · 2026-11-08 · Trend line trên chart — **Chốt**
  Thêm optional trend line (hồi quy tuyến tính đơn giản, hoặc moving-average N điểm — agent tự chọn
  cái nào hợp với từng loại chart) overlay lên `HealthBarChart`/`HealthRangeChart` hiện có trong
  `HealthCharts.kt`, màu nhạt hơn data chính, bật mặc định ở chart xu hướng dài hạn (W/M/6M/Y), tắt ở
  D (chart ngày quá ngắn để có trend).
- **D-1095** · 2026-11-08 · Nghiên cứu chart chuẩn + mô tả ý nghĩa sức khỏe từng chỉ số — giao Opus — **Chốt**
  Theo yêu cầu "Opus research" của user — giao task cho agent model Opus (không phải Sonnet, khác quy
  ước coding thường của dự án) vì đây là nghiên cứu/tổng hợp, không phải code. Output: (a) design
  pattern chart chuẩn cho từng loại chỉ số sức khỏe (line/bar/range, có trend line hay không, có
  average/zone-shading hay không) tham khảo Apple Health/Garmin Connect/Huawei Health; (b) mô tả ngắn
  gọn ý nghĩa sức khỏe + ngưỡng bình thường cho mỗi chỉ số app có (đối chiếu lại `MetricThresholds`
  D-1030 đã có sẵn ngưỡng số, chỉ cần viết mô tả dễ hiểu bằng tiếng Việt để hiện trong UI, mỗi mục 2-3
  câu). Dùng cho `MetricDetailScreen` section mới "Về chỉ số này".
- **D-1096** · 2026-11-08 · Màn chọn ngôn ngữ (tiếng Việt) vẫn CHƯA làm — **Tạm**
  User nhận ra chưa thấy — đúng, D-1040 (locale EN/VI) mới chỉ ở mức quyết định/plan, chưa từng giao
  agent implement (bị trì hoãn nhiều lần vì ưu tiên các fix Garmin + redesign Home). Việc tiếp theo
  sau khi các task UI/workout đang chạy ổn định.

## Thực thi D-1093 (workout detail) + D-1094 (trend line) — D-1102

- **D-1102** · 2026-11-08 · Các điểm chưa chốt cụ thể khi implement D-1093/D-1094 — **Chốt**
  (Đánh số lại từ D-1097 ban đầu vì trùng với D-1097 "Kết quả nghiên cứu Opus" do agent khác log gần
  cùng lúc — nội dung không đổi, chỉ đổi số để hết trùng, giống cách đã xử lý D-1080/D-1082 trước đó.)
  D-1093/D-1094 đã chốt phạm vi; các điểm implementation cụ thể dưới đây agent tự quyết vì không có
  trong 2 quyết định gốc:
  1. **Khoá lap/sample vào workout cha**: `HealthRecord.WorkoutLap`/`WorkoutSample` mang
     `workoutStart: Instant` (= `Workout.start`) thay vì chuỗi id đầy đủ, vì `FitHealthMapper.map()`
     không biết `deviceId`. `RoomHealthRecordSink` ghép `deviceId` (đã có sẵn trong sink) +
     `workoutStart` thành khoá `(deviceId, workoutStartEpochMs, lapIndex/timeEpochMs)` — đúng cặp
     `(deviceId, startEpochMs)` đã là khoá chính của `WorkoutEntity` (D-804), không tạo quy ước id mới.
     Lap/record trong file FIT được buffer theo thứ tự xuất hiện và "flush" vào danh sách kết quả khi
     gặp `session`(18) đóng segment đó — khớp đúng thứ tự thật trong file ACTIVITY (record/lap trước,
     session tổng kết sau mỗi segment), nên cũng xử lý đúng file multi-sport nhiều session mà không
     cần field tham chiếu session rõ ràng (lap/record FIT chuẩn không có field đó).
  2. **Room schema**: bump `UnifiedHealthDatabase` version 2 → 3, thêm 2 bảng mới
     (`workout_laps`, `workout_samples`) thuần cộng thêm → dùng `AutoMigration(from = 2, to = 3)`,
     không cần `Migration` thủ công. `3.json` tự sinh khi build (KSP), không viết tay.
  3. **HR zone breakdown cần %HRmax nhưng app chưa thu thập tuổi** (`BodyProfile` chưa được
     onboarding thu thập — xem D-1030): thêm `MetricThresholds.estimatedMaxHeartRateBpm(profile)` =
     công thức Fox "220 − tuổi" phổ biến, dùng tuổi tham chiếu 35 khi không có `BodyProfile` — tái
     dùng đúng quy ước "người lớn tham chiếu" D-1030 đã dùng cho `activeCalorieGoal` mặc định, không
     bịa model mới.
  4. **Trend line (D-1094) chọn thuật toán khác nhau theo loại chart**: `HealthBarChart` (dữ liệu dạng
     cột, nhiều điểm rời rạc như bước chân/calo theo ngày) dùng **moving average** (mượt nhiễu ngày
     qua ngày dễ đọc hơn); `HealthRangeChart` (dữ liệu dạng min–max capsule, vốn nhiễu điểm-điểm hơn
     như nhịp tim/SpO2) dùng **hồi quy tuyến tính** (một đường thẳng thể hiện xu hướng tăng/giảm rõ
     hơn moving average khi dữ liệu đã nhiễu sẵn). Cả 2 vẽ nhạt hơn + nét liền để phân biệt với đường
     trung bình nét đứt (`average`) đã có sẵn trong `HealthBarChart`.
  5. **`WorkoutDetailScreen` không build chart-line component mới**: 3 mini chart pace/độ cao/nhịp tim
     theo giây (từ `record` D-1093) tái dùng `HealthRangeChart` (D-1093 yêu cầu "reuse HealthCharts
     components", app chưa có component line-chart riêng) — mỗi chỉ số một chart riêng vì đơn vị khác
     nhau (giây/km, mét, bpm) không chia sẻ chung 1 trục y được. Bảng split hiển thị dạng danh sách
     `ListItem` (lap # + thời gian ở headline, các chỉ số còn lại ở supporting text) thay vì bảng lưới
     thật — đủ cho 1 lap trên màn hình điện thoại hẹp mà không cần cuộn ngang.
  6. **Không mở rộng demo-data generator** (`DemoHealthDataGenerator`) để sinh lap/sample mẫu — ngoài
     phạm vi D-1093 (chỉ parse dữ liệu Garmin thật); `DemoDataSeeder.clearDemoData()` vẫn được cập
     nhật xoá 2 bảng mới cho vệ sinh dữ liệu dù demo generator chưa ghi vào đó.

- **D-1097** · 2026-11-08 · Kết quả nghiên cứu Opus (D-1095) — lưu vào `docs/analysis/CHART_DESIGN_AND_METRIC_COPY.md` — **Chốt**
  Agent Opus trả về report đầy đủ (chart pattern theo từng loại chỉ số + bảng trend-line-theo-range +
  12 đoạn mô tả tiếng Việt cho "Về chỉ số này"). Lưu nguyên văn vào
  `docs/analysis/CHART_DESIGN_AND_METRIC_COPY.md` thay vì nhét vào DECISIONS.md (quá dài). Lưu ý quan
  trọng từ report: 3 đoạn text (bước chân/calo/giấc ngủ) phải đọc goal **override của user** thay vì
  số mặc định nếu user đã tự đặt; số "830 kcal" là tính toán runtime chứ không phải hằng số; chưa có
  text cho Weight (ngoài phạm vi brief ban đầu, cần bổ sung sau). Việc implement (wire trend line theo
  bảng, thêm section "Về chỉ số này" vào `MetricDetailScreen`) để sau khi agent workout-detail (đang
  chạy, cũng đụng `HealthCharts.kt`) xong — tránh đụng file.

- **D-1098** · 2026-11-08 · Chip device trong header (D-1083) dùng hiệu ứng xoay-vào 3D giống `WatchImage` — **Chốt**
  User thấy hiệu ứng fade/scale hiện tại (D-1083/1088) của chip tên+ảnh thiết bị trong header (khi
  scroll) chưa đẹp — yêu cầu đổi sang hiệu ứng "xoay xoay" giống bên Devices. Đây chính là hiệu ứng 3D
  giả lập đã có sẵn ở `WatchImage` (D-803, 2026-11-08 — `rotationY` từ -90° khi "lật vào" lúc
  `revealKey` đổi + nghiêng phối cảnh khi kéo). Dùng lại đúng component/kiểu animation đó cho chip
  trong header thay vì tự viết fade/scale riêng — đồng bộ ngôn ngữ hình ảnh với Devices.

- **D-1099** · 2026-11-08 · Grid mode: title bị cắt giữa chữ + "No data yet" xuống 2 dòng — xấu, sửa ngay — **Chốt**
  Chụp màn hình thật qua `adb screencap` ngay trên máy xác nhận bug cụ thể (không phải suy đoán):
  title bị ellipsis giữa chữ ở nhiều card — "Blood ..." (Blood oxygen/SpO2), "Heart ..." (Heart rate
  variability/HRV), "Exerci..." (Exercise minutes — dù D-1090 đã rút gọn thành "Exercise" nhưng vẫn
  còn dài quá so với bề ngang cột + icon + chevron), "Walking + runnin..." (Distance) — nghĩa là bảng
  viết tắt ở D-1090 **chưa phủ hết mọi loại chỉ số**, chỉ có HR/Cal/RHR/Exercise. VO2max và Workouts
  đã **có data thật** (50 mL/kg/min, 1 workout "Last running: Nov 8") — xác nhận fix D-1092 hoạt động.
  **Fix cần làm:**
  1. Bổ sung đầy đủ bảng viết tắt cho MỌI loại chỉ số dùng trong Grid (không chỉ 4 cái cũ): Blood
     oxygen→**SpO2**, Heart rate variability→**HRV**, Walking+running distance→**Distance**, Exercise
     minutes→ rút ngắn hơn nữa (ví dụ **"Active"** hoặc bỏ hẳn chevron/icon-gap để còn chỗ) — tự đo lại
     xem "Exercise" có thực sự vừa không, nếu không thì rút ngắn tiếp.
  2. Text giá trị placeholder "No data yet" phải giới hạn `maxLines = 1` + `TextOverflow.Ellipsis`
     (hoặc đổi label ngắn hơn, ví dụ "No data"/"—") — tuyệt đối không để xuống 2 dòng làm card lệch
     cao thấp so với card bên cạnh trong cùng hàng.
  3. Ngày trong card Workouts ("Last running: Nov 8, 20...") cũng bị cắt xấu — rút ngắn format ngày
     (bỏ năm nếu là năm hiện tại, ví dụ chỉ "Nov 8") hoặc bỏ hẳn label "Last running:" chỉ còn ngày.

## Thực thi D-1098/D-1099 (chip flip-in 3D, grid truncation fixes) — D-110x

- **D-1100** · 2026-11-08 · Chip header dùng `WatchImage(interactive = true)` thay fade/scale — **Chốt**
  `DeviceChip` (`HomeScreen.kt`, D-1083/1088) giờ gọi `WatchImage(..., interactive = true, revealKey =
  isVisible)` thay vì chỉ có ảnh tĩnh — tái dùng đúng hiệu ứng flip rotationY-từ-(-90°) đã có sẵn ở
  `WatchImage.tilt3d()` (D-803, dùng ở Devices). `isVisible = alphaFraction > 0f` làm `revealKey`: vì
  `DeviceChip` `return` sớm khi `alphaFraction <= 0f` (ảnh/toàn bộ chip không được compose khi ẩn), mỗi
  lần chip thật sự xuất hiện trở lại là một lần compose mới của `WatchImage`, nên chỉ cần key = true là
  đủ kích hiệu ứng mỗi lần "xuất hiện" mà không chạy lại liên tục trong lúc chip đã hiện sẵn và người
  dùng còn đang scroll (fraction đổi liên tục nhưng component không bị remount). Phần còn lại của
  D-1083/1088 (thời điểm/tốc độ co lại, vị trí chip, label "Last synced") giữ nguyên không đổi — chỉ
  thay hiệu ứng vào của riêng ảnh đồng hồ.
- **D-1101** · 2026-11-08 · Mở rộng bảng viết tắt Grid mode đủ 12 metric, sửa "No data"/ngày Workouts — **Chốt**
  Theo đúng D-1099: (1) `compactLabel()` giờ liệt kê tường minh cả 12 `HealthMetricType` (trước chỉ 4,
  phần còn lại rơi về `label()` đầy đủ gây cắt chữ giữa từ) — SpO2/HRV/Dist theo đúng gợi ý của user,
  riêng "Distance" (8 ký tự, dài bằng "Exercise" vừa bị lỗi) **không** dùng như gợi ý ban đầu mà đổi
  thành "Dist" (4 ký tự) vì user tự nhắc "đừng chỉ đoán chuỗi ngắn hơn là vừa" — chọn theo độ dài tối đa
  đã biết là vừa ("Stress"/"SpO2", 6 ký tự) thay vì đoán; "Exercise"→"Active" (6 ký tự, cũng theo cùng
  giới hạn). (2) `EmptyMetricCard`: "No data yet" → "No data" + `maxLines = 1`/`Ellipsis` để không bao
  giờ wrap 2 dòng làm lệch chiều cao hàng. (3) `WorkoutsFeedCard` compact: bỏ hẳn prefix "Last
  <loại>: ", chỉ còn ngày — bỏ năm khi là năm hiện tại (`shortWorkoutDate`, ví dụ "Nov 8"), giữ năm khi
  khác năm hiện tại.

- **D-1103** · 2026-11-08 · Audit `docs/re-analysis/garmin-analysis` — không bỏ sót gì, không phải lỗ hổng pháp lý — **Chốt**
  User yêu cầu kiểm tra lại vì lo sợ bỏ sót thông tin. Kết quả kiểm tra bằng diff thật (không đoán):
  - `docs/re-analysis/garmin-analysis/` **không được track trong git** (`.gitignore:35`), chưa từng
    commit — không phải lỗ hổng vi phạm D-016 (không commit APK/dex vendor).
  - `CONNECTION_ANALYSIS.md`/`AUTH_CRYPTO_ANALYSIS.md` trong đó **byte-identical 100%** với
    `docs/analysis/GARMIN_CONNECTION_ANALYSIS.md`/`GARMIN_AUTH_CRYPTO_ANALYSIS.md` đã commit — không
    mất nội dung.
  - `docs/re-evidence/garmin/` là **superset** của `docs/re-analysis/garmin-analysis/rea-output/`:
    mọi file chung diff ra giống hệt (`cls_proto_generated.json`, `cls_gfdi.json`,
    `cls_device_filetransfer.json`, `cls_device_multilink.json`, `cls_AuthRegistry.json` — đã check
    5 file lớn nhất), và `re-evidence` có thêm `battery_status_5023.md`/`config_capability_bits.md`/
    `registration_service4.md`/`jadx-base`/`jadx-gcm` (bằng chứng được bổ sung SAU, không phải bị mất).
  - Đọc kỹ 2 file MD tìm các điểm `[I]` (suy luận, chưa xác nhận trực tiếp) được flag rõ — 2 điểm nghe
    có vẻ là gap thật đã **kiểm tra chéo với code hiện tại và xác nhận đã được xử lý đúng từ trước**:
    (a) "driver so trực tiếp encoded frame với maxPacketSize, có thể vượt giới hạn watch thật" —
    `GfdiPacketBudget.usablePayload()` (`GfdiPayloads.kt:300`) đã copy đúng công thức vendor
    (`us2/b.java:221-235`: trừ COBS overhead + 8/18 byte framing/encryption + align 4 byte) và
    `GfdiDispatcher.send()` so `payload.size` với budget này trước khi encode — đúng như khuyến nghị,
    không phải bug còn tồn tại. (b) "driver request MTU vô điều kiện, cần fail non-fatal" —
    `GattConnector.kt:106-107` đã `runCatching { requestMtu }.onFailure { Log.w(...) }`, không throw
    — đã non-fatal sẵn. **Kết luận: không có gap nào cần vá thêm từ `docs/re-analysis/garmin-analysis`.**

- **D-1104** · 2026-11-08 · Bật GitHub Pages cho repo (serve từ README) — **Chốt**
  Bật qua GitHub API (`POST /repos/NoatToan/unified_watch_health_connect/pages`, dùng token sẵn có
  trong credential helper `osxkeychain` của git, không cần cài `gh` CLI) — `source: {branch: main,
  path: /}`. GitHub Pages tự render `README.md` ở root bằng theme Jekyll mặc định thành trang chủ.
  URL: `https://noattoan.github.io/unified_watch_health_connect/`. Lần build đầu tiên mất vài phút
  sau khi bật, chưa verify live ngay lúc bật (API trả 201 xác nhận config đã lưu, nhưng
  `curl` tới URL vẫn 404 ngay sau đó — bình thường, GitHub Pages build bất đồng bộ).

## Màn "Giải chạy" — marketing-catchy, nguồn data từ unified_health_service (D-1105+)

Dự án riêng `NoatToan/unified_health_service` (repo mới, local
`/Users/Apple/Documents/Projects/noattoan/unified_health_service`) crawl giải chạy VN hằng ngày,
publish `docs/races/latest.json` qua GitHub Pages tại
`https://noattoan.github.io/unified_health_service/races/latest.json` (schema: xem
`unified_health_service/docs_research/RACE_SOURCES_RESEARCH.md` §3). App này giờ cần hiển thị data
đó, mục đích rõ ràng là **marketing cho giải chạy** (đẩy người dùng bấm đăng ký), không phải chỉ liệt
kê thông tin.

- **D-1105** · 2026-11-08 · Vị trí đặt trong app: card quảng bá trên Home + màn list riêng, KHÔNG thêm bottom-nav tab — **Chốt**
  Không thêm tab thứ 5 vào `PillBottomNavigation` (đã đủ 4 tab Home/Activity/Devices/Profile, thêm
  nữa chật). Thay vào đó: 1 card "Giải chạy sắp tới" dạng carousel ngang trên Home (ngay dưới
  RingsCard, trước "All metrics" — vị trí nổi bật, đúng tinh thần marketing/discovery), bấm "Xem tất
  cả" mở màn `RacesScreen` list đầy đủ (+ filter theo terrain/khoảng cách nếu có thời gian). Mỗi card
  bấm vào mở `registrationUrl` qua Chrome Custom Tabs (không rời hẳn app, không cần WebView tự viết).
- **D-1106** · 2026-11-08 · Thiết kế "catchy": fallback gradient theo terrain khi không có ảnh, đếm ngược ngày — **Chốt**
  Hầu hết race hiện chưa có `imageUrl` (theo schema, phần lớn null) — không để trống xấu: mỗi card có
  nền gradient riêng theo `terrain` (road/trail/ultra/triathlon/virtual — mỗi loại 1 cặp màu + icon
  lớn mờ phía sau), tên giải to, ngày + "Còn N ngày" đếm ngược nổi bật, badge khoảng cách
  (42km/21km/10km...), giá "Từ Xđ" nếu có, nút CTA rõ ràng "Đăng ký ngay". Nếu sau này có `imageUrl`
  thật thì ảnh thay gradient, layout giữ nguyên.
- **D-1107** · 2026-11-08 · Network + cache: fetch 1 lần/ngày, cache lại, không chặn UI nếu lỗi — **Chốt**
  Thêm client HTTP nhẹ (OkHttp, hoặc Ktor nếu dự án đã có sẵn — agent tự kiểm tra
  `gradle/libs.versions.toml` trước khi thêm dependency mới) gọi đúng URL JSON ở trên, parse bằng
  kotlinx.serialization, cache raw JSON + thời điểm fetch vào DataStore (giống pattern
  `UserPreferences` đã có) — chỉ fetch lại nếu cache quá 24h hoặc user pull-to-refresh. Nguồn data
  (`unified_health_service`) đang được dựng song song, có thể chưa live/chưa có race nào — màn hình
  phải xử lý đẹp cả 3 trạng thái: loading, có data, lỗi/rỗng (ẩn hẳn card quảng bá trên Home nếu rỗng,
  không hiện khung trống xấu).

## UI polish pass — dịch nguyên tắc từ skill "make-interfaces-feel-better" (D-1108+, hoãn tới sau Races)

User thấy UI "trông basic quá", đưa link `motionsites.ai` — kiểm tra thì đây là nền tảng prompt cho
web design (SaaS/portfolio/ecommerce), **không áp dụng được cho mobile/Compose** (không có UI
kit/design system nào tải về được). Thay vào đó dùng skill nội bộ `make-interfaces-feel-better`
(viết cho CSS/web) — dịch nguyên tắc sang Compose:

- **D-1108** · 2026-11-08 · Phạm vi polish pass — **Chốt**
  Áp cho `core/designsystem` (component dùng chung) trước, rồi lan ra các card/screen đang "basic":
  (1) **Concentric radius** — bo góc card lồng trong card (vd pill indicator trong `PillBottomNavigation`,
  mini card trong grid) phải = bo góc ngoài trừ padding, kiểm tra lại từng chỗ đang lệch. (2)
  **Tabular numbers** — mọi số liệu động (bước chân, bpm, kcal, đếm ngược ngày giải chạy) dùng
  `TextStyle(fontFeatureSettings = "tnum")` để không nhảy độ rộng khi số đổi. (3) **Motion có chủ
  đích** — card/button bấm vào co nhẹ (`scale(0.96f)` qua `Modifier.scale` + theo dõi
  `PressInteraction` qua `interactionSource`, không dùng ripple mặc định khi đã có press-scale, như
  đã làm cho `PillBottomNavigation` ở D-1091); enter animation chậm/êm hơn exit (`AnimatedVisibility`
  tách riêng `enter`/`exit`, exit ngắn ~150ms); đổi icon (vd nút Grid/List D-1073) dùng `Crossfade`
  thay vì nhảy tức thì. (4) **Hit area** — icon button tối thiểu 48dp, audit lại các nút nhỏ hiện có.
  (5) **Shadow/border có chủ đích** — card dùng `tonalElevation` HOẶC `BorderStroke`, không tuỳ tiện
  cả hai không lý do; ảnh (card race có `imageUrl` thật, D-1106) nên có outline mờ 1dp viền trong để
  không bị nhòe cạnh vào nền.
  **Hoãn tới khi agent Races (D-1105/1106/1107) xong** — cả hai đều đụng `core/designsystem` và
  `HomeScreen.kt`; làm polish pass song song dễ đụng diff. Thứ tự: Races xong trước (đang tạo card
  mới, cần polish áp dụng luôn từ đầu lên card đó thay vì làm 2 lần), polish pass sau.

## Thực thi D-1105/1106/1107 (màn "Giải chạy") — D-1109

- **D-1109** · 2026-11-08 · Các điểm chưa chốt cụ thể khi implement — **Chốt**
  D-1105/1106/1107 đã chốt phạm vi/vị trí/thiết kế/cache; các điểm implementation cụ thể dưới đây
  agent tự quyết vì không có trong 3 quyết định gốc:
  1. **Module mới `feature:races`** (không nhét vào `feature:activity`) — `feature:activity` hiện chỉ
     xử lý workout cá nhân (dữ liệu sync từ đồng hồ), còn Races là nội dung marketing từ nguồn ngoài,
     bản chất khác hẳn; tách module riêng đúng tinh thần "one module per feature" đã có, build.gradle.kts
     copy y hệt feature khác (`unifiedhealth.android.feature` convention plugin).
  2. **Dependency mới**: `OkHttp 4.12.0` (dự án chưa có client HTTP nào, kotlinx.serialization đã có
     sẵn version 1.12.0 nhưng plugin `kotlin-serialization` + lib `kotlinx-serialization-json` chưa
     được áp cho `core/data` — thêm cả hai), `Coil 2.7.0` (`coil-compose`, dự án chưa load ảnh remote
     bao giờ — chọn Coil vì là chuẩn de-facto cho Compose, nhẹ hơn Glide), `androidx.browser 1.8.0`
     (Custom Tabs, dự án chưa có). `RaceCard`/`launchInCustomTab` đặt ở `core/designsystem` (không
     phải từng feature module) vì cả Home lẫn `feature:races` đều cần y hệt — `core/designsystem` đã
     `api(projects.core.model)` sẵn nên không phát sinh dependency mới giữa 2 feature module.
  3. **`RaceCountdown` đặt ở `core/model`, không phải `core/domain`** — dù về bản chất giống style
     `HighlightCalculator`/usecase khác (phép tính thuần, không gọi repository), `core/designsystem`
     chỉ `api(projects.core.model)` chứ không phụ thuộc `core/domain` (feature mới được phép, xem
     `AndroidFeatureConventionPlugin`); đặt ở `core/model` để `RaceCard` (designsystem) gọi trực tiếp
     mà không phá quy ước "designsystem không biết domain".
  4. **Lọc bỏ giải đã qua ở tầng repository** (`endDate ?: startDate < today` → loại), áp dụng chung
     cho cả carousel Home lẫn `RacesScreen` đầy đủ — mục đích feature là đẩy đăng ký giải sắp/đang
     diễn ra, giải đã xong không còn actionable; D-1105 nói "list đầy đủ" nhưng không nói giữ cả giải
     cũ, nên hiểu "đầy đủ" = đầy đủ trong số giải còn liên quan. Nhờ lọc chung 1 chỗ, `RacesState`
     (`Loading`/`Success`/`Empty`/`Error`) dùng được y hệt cho cả 2 màn hình.
  5. **`registrationStatus`/`terrain` lạ hoặc thiếu** → mặc định `UNKNOWN`/`ROAD` (loại phổ biến nhất
     trong feed) thay vì crash/loại bỏ cả race; CTA khi `UNKNOWN` hiện "Xem chi tiết" (không phải
     "Đăng ký ngay" vì không chắc còn mở, cũng không phải "Đã đóng" vì không có bằng chứng đã đóng) —
     card vẫn bấm được (mở `registrationUrl`), chỉ nhãn khác.
  6. **Home pull-to-refresh refetch luôn cả Races** (không chỉ sync đồng hồ) — D-1107 nói "user pull-
     to-refresh" không chỉ rõ màn nào; Home có cử chỉ pull-to-refresh sẵn, hợp lý refetch luôn Races
     hiển thị ngay trên Home. `RacesScreen` riêng cũng có pull-to-refresh/nút "Thử lại" của chính nó.
  7. **Test `RemoteRacesRepositoryTest`**: constructor 4 tham số (`scope`/`ioDispatcher` tường minh,
     giống `DefaultLiveHealthRepository`) để test truyền `backgroundScope`/`Dispatchers.Unconfined`
     thay vì `Dispatchers.IO` thật — nếu không, `withContext(Dispatchers.IO)` bên trong sẽ "biến mất"
     khỏi `TestCoroutineScheduler` của `runTest`, khiến `advanceUntilIdle()`/`first{}` không bao giờ
     thấy state cập nhật (đã tự kiểm chứng bằng 1 test chẩn đoán độc lập trước khi sửa). Dùng
     `runCurrent()` chứ không phải `advanceUntilIdle()` để pump scheduler — thực nghiệm thấy
     `advanceUntilIdle()` không chạy coroutine `launch` từ `init{}` trên `backgroundScope` trong phiên
     bản coroutines-test của dự án (1.11.0), còn `runCurrent()` thì có (khớp với cách
     `DefaultLiveHealthRepositoryTest` đã làm sẵn trong repo, không phải suy đoán mới).
  8. **Test data xác nhận nguồn sống thật đã có data** lúc viết: `curl` trực tiếp
     `https://noattoan.github.io/unified_health_service/races/latest.json` lúc 2026-11-08 trả về 200,
     50 races (49 còn hạn), `imageUrl` null 100% — đúng như brief mô tả "most races currently have
     imageUrl: null" — xác nhận gradient-by-terrain thật sự là trường hợp phổ biến, không phải giả
     định.

- **D-1110** · 2026-11-08 · Dời "Giải chạy sắp tới" xuống cuối Home; đổi tên "Summary" → "Home" — **Chốt**
  User phản hồi sau khi xem bản cài thật: (1) carousel giải chạy đang nằm ngay sau `RingsCard` (đầu
  trang) — dời xuống **cuối** list Home (sau "All metrics"/feed, trước khoảng trống cuối trang), vì
  đây là nội dung marketing/khám phá, không phải data sức khỏe chính — không nên chiếm vị trí đầu màn
  hình. (2) Đổi nhãn **"Summary" → "Home"** ở mọi chỗ hiển thị cho user (tiêu đề màn, nhãn tab trong
  `PillBottomNavigation`/`TopLevelDestination`) vì "Home" thân thiện hơn — chỉ đổi label/string hiển
  thị, không đổi route/composable name nội bộ (`HomeScreen`, `HomeDestination`... giữ nguyên để không
  phải sửa lan man) trừ khi cấn.

- **D-1127** · 2026-11-08 · Thực thi D-1110 — **Chốt**
  (Đánh số lại từ D-1111 ban đầu vì trùng với D-1111 "crawler ảnh/mô tả/raceStatus" do agent khác log
  cùng lúc — nội dung không đổi, chỉ đổi số để hết trùng.)
  (1) Dời block `RacesCarousel` trong `Summary()` (`HomeScreen.kt`) từ ngay sau `item { RingsCard(...) }`
  xuống sau block `Highlights` (cuối `LazyColumn`, trước khi đóng) — logic hiển thị (chỉ render khi
  `RacesState.Success` non-empty) giữ nguyên nguyên văn, chỉ đổi vị trí. (2) Đổi đúng 2 chỗ string hiển
  thị: `TopLevelDestination.HOME` label `"Summary"` → `"Home"` (`app/.../navigation/TopLevelDestination.kt`,
  dùng chung bởi `PillBottomNavigation`) và `TopAppBar`'s `title = { Text("Summary") }` → `Text("Home")`
  trong `HomeScreen()`. Không đổi `app/src/androidTest/.../UserJourneyE2ETest.kt` (chuỗi `"summary"`/
  `"Summary"` ở đó chỉ là label bước báo cáo E2E, không phải assertion trên text màn hình — ngoài phạm
  vi android-coder theo quy ước CLAUDE.md, để `e2e-flows` xử lý nếu cần).

## Races đợt 2: ảnh thật, mô tả chi tiết, filter, màn detail trong app (D-1111+)

Mở rộng schema JSON của `unified_health_service` (repo riêng) — chốt ngay để 2 bên (crawler +
app) làm song song không lệch nhau. Field mới thêm vào mỗi race trong `docs/races/latest.json`:
```json
{
  "imageUrl": "https://.../banner.jpg",
  "description": "Đoạn mô tả/giới thiệu giải, trích từ trang chi tiết qua regex, null nếu không trích được",
  "raceStatus": "upcoming" | "past"
}
```
`raceStatus` do crawler tự tính từ `startDate` so với ngày crawl — **khác** `registrationStatus`
(open/closed/sold_out, nói về việc còn mua vé được không). Giữ **cả upcoming lẫn past** trong cùng
`latest.json` (không tách file riêng) — dataset còn nhỏ (50 giải), đơn giản hơn 2 endpoint; app lọc
phía client, mặc định chỉ hiện upcoming.

- **D-1111** · 2026-11-08 · Crawler: thêm ảnh chính thức + mô tả giải qua regex, tính `raceStatus` — **Chốt** (giao `unified_health_service`)
  Mỗi scraper cố lấy ảnh: ưu tiên ảnh thumbnail ngay trên trang listing nếu có, fallback sang
  `<meta property="og:image">` của trang chi tiết race (hầu hết site đều có, không cần biết cấu trúc
  riêng từng site) — cần 1 request thêm/race vào trang detail, vẫn tuân thủ rate-limit/robots.txt đã
  có. Cùng lúc lấy ln đoạn mô tả giải (đoạn giới thiệu/nội dung chính) qua regex/parse text từ trang
  detail đó luôn (đỡ phải crawl detail 2 lần). Field `raceStatus` tính tại bước merge/write, không
  cần network thêm. Crawl càng nhiều ảnh thật càng tốt — đây là ưu tiên chính của đợt này (carousel
  trong app dùng ảnh thật thay gradient).
- **D-1112** · 2026-11-08 · App: title auto-size không truncate tên giải — **Chốt** (giao `unified_health_app`)
  `RaceCard.kt` đổi tên giải sang auto-size text (API `BasicText`/`autoSize` nếu Compose BOM dự án đã
  hỗ trợ — kiểm tra `gradle/libs.versions.toml`; nếu chưa có thì tự viết logic đo-và-giảm cỡ chữ tới
  khi vừa khung, pattern phổ biến trước khi có API chính thức) — không bao giờ ellipsis/truncate tên
  giải, co chữ lại thay vì cắt.
- **D-1113** · 2026-11-08 · App: filter theo khu vực + tháng trên màn Races, filter thêm "đã diễn ra" — **Chốt** (giao `unified_health_app`)
  `RacesScreen` thêm UI filter: chip/dropdown theo `province`, và theo tháng (`startDate`). Mặc định
  chỉ hiện `raceStatus == "upcoming"`; thêm 1 toggle/filter riêng để user tự bật xem cả giải
  `raceStatus == "past"` nếu muốn (không bắt buộc hiện mặc định).
- **D-1114** · 2026-11-08 · App: màn Race Detail trong app trước khi mở webview đăng ký — **Chốt** (giao `unified_health_app`)
  Bấm vào race card (Home carousel hoặc `RacesScreen`) giờ mở 1 màn **`RaceDetailScreen` trong app**
  trước (ảnh lớn, tên, ngày, địa điểm, cự ly, giá, đoạn `description` crawl được) — **không** mở
  thẳng webview như hiện tại nữa. Trong màn detail đó mới có nút CTA "Đăng ký ngay" mở
  `registrationUrl` qua Chrome Custom Tabs (giữ đúng hành vi "đi vào detail hẳn mở webview" — chỉ là
  giờ có 1 bước trung gian thân thiện hơn trước khi rời app). Nếu `description` null (crawler chưa
  kịp lấy), vẫn hiện đủ thông tin cơ bản khác, không để trống xấu.

- **D-1115** · 2026-11-08 · `DeviceBanner` trên Home dùng lại đúng style + animation của card thiết bị bên Devices — **Chốt**
  User thấy `DeviceBanner` trên Home (box hiện thiết bị đang kết nối) khác với card thiết bị trong
  "My devices" ở màn Devices (`feature/devices/DevicesScreen.kt`) — cả về style box (ảnh đồng hồ,
  bo góc, elevation/border) lẫn hiệu ứng animation lúc xuất hiện (3D flip-in của `WatchImage`, đã
  dùng cho header chip ở D-1098). Đồng bộ lại: `DeviceBanner` tái dùng đúng composable/animation đã
  có ở Devices thay vì tự có style riêng — không viết lại từ đầu, chỉ gọi lại đúng component/style
  function đã tồn tại.

## Thực thi D-1112/1113/1114 (auto-size title, filter Races, Race Detail trong app) — D-1125

(Đánh số lại 2 lần vì nhiều agent chạy song song cùng log vào `docs/DECISIONS.md`: D-1116 ban đầu →
trùng với D-1116 "Crawler: phân loại marathon/trail..."; đổi sang D-1122 → lại trùng tiếp với D-1122
"`Modifier.fillBleed()`..." do một agent khác log ngay sau đó. Nội dung không đổi qua các lần đổi số,
chỉ đổi số để hết trùng — giống cách đã xử lý D-1080/D-1082/D-1097 trước đó. Số D-1125 chọn vì D-1124
là số cao nhất đã dùng tại thời điểm phát hiện trùng lần 2.)

- **D-1125** · 2026-11-08 · Các điểm chưa chốt cụ thể khi implement D-1112/D-1113/D-1114 — **Chốt**
  1. **Auto-size dùng `Text(..., autoSize = TextAutoSize.StepBased(...))` thẳng trên
     `androidx.compose.material3.Text`** (không cần `BasicText` riêng hay tự viết logic đo-giảm cỡ
     chữ) — kiểm tra qua Context7/doc chính thức xác nhận Compose BOM `2026.09.00` (đã có trong
     `gradle/libs.versions.toml`) có overload `Text(text: String, color: Color, autoSize:
     TextAutoSize?, ...)`, đúng API D-1112 đã dự đoán. `minFontSize = 13.sp`/`maxFontSize` =
     đúng cỡ chữ gốc của style truyền vào (`titleLarge` 22.sp cho card, `headlineMedium` 28.sp cho
     detail) để không bao giờ to hơn thiết kế cũ — chỉ co nhỏ khi tên quá dài, không bao giờ to lên.
     Giữ `maxLines = 2` (card)/`3` (detail), bỏ hẳn `overflow = TextOverflow.Ellipsis` cũ (mục tiêu
     D-1112 là "không bao giờ truncate/ellipsis" — co chữ tới `minFontSize` là nỗ lực cuối cùng, chấp
     nhận rủi ro lý thuyết text bị tràn nhẹ nếu tên giải cực dài vượt quá khả năng co, nhưng tên giải
     chạy thực tế trong feed luôn ngắn hơn nhiều so với giới hạn này).
  2. **Tách logic dùng chung giữa `RaceCard` và `RaceDetailScreen` vào `core/designsystem`** (đúng yêu
     cầu "reuse, don't duplicate" của D-1114): `RaceVisualBackground(race, modifier, terrainIconSize)`
     (ảnh thật qua Coil + scrim, hoặc gradient-theo-terrain + icon mờ khi `imageUrl` null — y hệt logic
     cũ của `RaceCard`), `RaceNameText(name, modifier, style, maxLines)` (auto-size dùng chung), và
     `RaceRegistrationStatus.ctaLabel()` (hàm thuần trả về đúng 4 nhãn tiếng Việt cũ: "Đăng ký
     ngay"/"Đã đóng đăng ký"/"Hết vé"/"Xem chi tiết") — tách **nhãn** ra hàm riêng thay vì tái dùng
     nguyên `RaceCallToAction` (vốn có màu/pill style chỉ hợp nền tối/gradient) cho nút CTA to ở
     detail, vì nút đó không nhất thiết nằm đè lên gradient; `RaceCard` giờ cũng gọi `ctaLabel()`
     thay vì hard-code lại chuỗi.
  3. **`RacesRepository`/`RemoteRacesRepository` bỏ hẳn filter ẩn giải đã qua theo ngày** (khác với
     D-1109 điểm 4) — giờ giữ **toàn bộ** race hợp lệ (chỉ loại record thật sự malformed), sắp theo
     `startDate` tăng dần như cũ, không lọc theo ngày nữa. Lý do: D-1113 cần cho user bật xem lại giải
     đã diễn ra (`raceStatus == past`) ở `RacesScreen`, nên tầng data không còn được phép âm thầm vứt
     bỏ giải quá khứ — việc lọc "mặc định chỉ hiện upcoming" chuyển xuống tầng UI (`RacesViewModel` cho
     `RacesScreen`, `Summary()`/`RacesCarousel` cho Home carousel — carousel Home **vẫn luôn** chỉ lọc
     `raceStatus == upcoming`, không có toggle, đúng tinh thần quảng bá giải sắp diễn ra của D-1105).
     `RacesState` (interface ở `core/domain`) giữ nguyên không đổi (`Empty` vẫn nghĩa là "feed không có
     race hợp lệ nào", không phải "không có race upcoming nào" — trường hợp feed chỉ toàn race quá khứ
     hiển thị `Success(races)` rỗng-sau-lọc ở UI, `RacesScreen` tự hiển thị thông báo "không có giải
     khớp bộ lọc" riêng, khác với `RacesState.Empty` gốc).
  4. **`raceStatus` thiếu/không nhận diện được → mặc định `RaceStatus.UPCOMING` ngay tại DTO mapper**
     (`RaceDto.toDomainOrNull()`), đúng yêu cầu brief — không tính lại từ `startDate` so với ngày hôm
     nay (khác cách cũ `RaceCountdown`/filter D-1109 vốn tự tính bằng ngày) vì field này giờ do crawler
     tính sẵn, tính lại ở app dễ lệch với ý "raceStatus do crawler tự tính từ ngày crawl" nêu trong
     brief — app chỉ cần fallback an toàn khi thiếu, không tự suy luận lại.
  5. **Filter state (`province`/`month`/`showPast`) sống trong `RacesViewModel`, không phải domain** —
     `RaceFilters`/`RacesUiState` mới (sealed interface riêng, không phải `RacesState` domain) định
     nghĩa ngay trong `feature/races`, danh sách `province`/`month` khả dụng tính từ chính danh sách
     race đã tải (`distinct().sorted()`) mỗi khi state đổi — không cache riêng, đơn giản vì dataset nhỏ
     (~50 race). UI filter dùng `FilterChip` (Material3, dự án chưa dùng chip này ở đâu khác) thành 1
     hàng cuộn ngang cho tỉnh/thành, 1 hàng cuộn ngang cho tháng (`"Tất cả"` + mỗi tháng dạng
     `"Th.11/2026"`), và 1 `FilterChip` riêng "Đã diễn ra" bật/tắt — không dùng dropdown (Compose
     `ExposedDropdownMenu` cồng kềnh hơn cho ít lựa chọn, chip row nhất quán với phong cách
     card/pill đã có ở `RaceCard`).
  6. **`RaceDetailScreen` tra race theo `raceId` bằng cách lọc `RacesRepository.races` hiện có**
     (giống hệt pattern `WorkoutDetailViewModel`/`MetricDetailViewModel` đã dùng cho `savedStateHandle
     .toRoute<...>()` + tra cứu list đã tải) — không thêm API/field `getRaceById` mới vào
     `RacesRepository` vì state đã luôn có đủ danh sách race trong bộ nhớ, tra bằng `firstOrNull { it.id
     == raceId }` là đủ, không cần network call riêng. `RacesState.Loading`/`Error` (chưa có cache) +
     race không tìm thấy trong `Success` đều gộp chung thành 1 trạng thái `RaceDetailUiState.NotFound`
     hiển thị `ErrorState` + nút quay lại — ca lỗi mạng ở đúng lúc user bấm sâu vào 1 race cụ thể hiếm
     và không đáng tách riêng thêm 1 trạng thái Error với message khác biệt.
  7. **Điều hướng xuyên suốt app**: thêm `RaceDetailDestination(raceId: String)` +
     `navigateToRaceDetail`/`raceDetailScreen` trong `feature/races` (cùng pattern
     `WorkoutDetailDestination`). Bấm card ở Home carousel giờ gọi `onOpenRaceDetail(race.id)` xuyên
     `HomeRoute → HomeTabContent → MainPagerDestination → UnifiedHealthNavHost` (y hệt cách
     `onOpenWorkoutClick` đã xuyên qua `ActivityTabContent`); bấm card ở `RacesScreen` gọi thẳng
     `onOpenRaceDetail` được truyền vào từ `racesScreen(...)` ở `UnifiedHealthNavHost`. `onOpenRaces`
     (nút "Xem tất cả" mở `RacesScreen`) giữ nguyên không đổi — chỉ hành vi bấm **card** đổi từ mở
     Custom Tabs trực tiếp sang mở `RaceDetailScreen`; CTA trong màn đó mới là nơi duy nhất còn gọi
     `launchInCustomTab`.

- **D-1116** · 2026-11-08 · Crawler: phân loại marathon/trail chắc chắn hơn + best-effort thứ hạng top runner cho giải đã diễn ra — **Tạm** (giao `unified_health_service`)
  Bổ sung cho D-1111 (đang chạy, gửi thêm yêu cầu cho cùng agent): (1) kiểm tra lại logic suy ra
  `terrain` (road/trail) từ tên/mô tả giải bằng keyword tiếng Việt, tránh mặc định hết về 1 loại. (2)
  Với giải `raceStatus == "past"`, tìm cách crawl thứ hạng top runner (iRace hoặc nền tảng
  timing/kết quả riêng nếu có) — **best-effort, không bắt buộc mọi giải có**. Schema thêm (nếu crawl
  được): `results: [{ "distance": "42km", "topFinishers": [{ "rank": 1, "name": "...",
  "timeSeconds": 9240 }] }]`, `null` nếu không có nguồn khả thi. Đánh dấu Tạm vì chưa biết nguồn kết
  quả thật có tồn tại/crawl được hay không cho tới khi agent báo cáo lại.

- **D-1117** · 2026-11-08 · Carousel "Giải chạy sắp tới" phải scroll edge-to-edge, không bị margin che — **Chốt**
  User thấy carousel hiện bị `Modifier.padding` ngang đối xứng che mất phần card kế tiếp khi scroll
  (padding áp lên cả `LazyRow`, giới hạn cả vùng scroll chứ không chỉ vị trí nghỉ). Sửa: dùng
  `contentPadding = PaddingValues(start = <lề content mặc định của Home>, end = <cùng giá trị>)` trên
  chính `LazyRow` đó thay vì bọc ngoài bằng `Modifier.padding` — card đầu tiên vẫn thẳng hàng với lề
  nội dung khác của Home lúc đứng yên, nhưng khi scroll ngang thì card có thể trượt ra sát mép màn
  hình (full width), không bị cắt bởi padding cố định.

- **D-1118** · 2026-11-08 · Crawler: `priceFromVnd` phải luôn là giá rẻ nhất trong các gói cự ly — **Chốt**
  `priceFromVnd` (hiện ở cả card Home lẫn `RacesScreen`/`RaceDetailScreen`) phải tính bằng
  `min(distances[].priceVnd)` sau bước merge nhiều nguồn cho cùng 1 giải — không lấy thẳng giá quảng
  cáo "Từ Xđ" của 1 nguồn đơn lẻ (có thể không phải gói rẻ nhất thật sự khi gộp thêm cự ly từ nguồn
  khác). Tính lại ở bước merge (`pipeline/merge.py`), bỏ qua gói có `priceVnd` null/0 khi lấy min.

- **D-1119** · 2026-11-08 · Home chỉ hiện metric có data; thêm màn "All metrics" riêng cho đủ cả empty — **Chốt**
  Section "All metrics" trên Home đổi tên còn **"Metrics"**, và chỉ render card của chỉ số **đang có
  data** (ẩn hẳn card "No data" khỏi Home — không phải mờ đi, bỏ hẳn khỏi danh sách) — Home gọn lại,
  chỉ hiện cái người dùng thực sự có. Thêm 1 CTA (ví dụ "All metrics" hoặc icon mũi tên cạnh tiêu đề
  "Metrics", theo đúng pattern "Show all data"/"Xem tất cả" đã dùng ở nơi khác) mở **màn riêng** liệt
  kê **toàn bộ** chỉ số kể cả chưa có data — màn này tái dùng đúng danh sách card hiện có (component
  card cũ), chỉ khác là không lọc theo có-data-hay-không.

- **D-1120** · 2026-11-08 · Nền container của bottom bar phải trong suốt, chỉ còn pill nổi — **Chốt**
  `PillBottomNavigation` (D-1051) đang nằm trong slot `bottomBar` của `Scaffold`, và container đó
  đang có nền trắng/surface mặc định bao quanh pill thành 1 dải ngang đặc — không phải pill nổi thật
  sự trên content. Sửa: container `bottomBar` (`Scaffold(bottomBar = {...})` ở
  `app/.../ui/UnifiedHealthApp.kt` hoặc nơi đặt `Scaffold`) phải trong suốt hoàn toàn
  (`containerColor = Color.Transparent` nếu dùng `Surface` bọc ngoài, hoặc bỏ hẳn `Surface`/background
  thừa quanh `PillBottomNavigation`) — chỉ còn đúng hình pill nổi, content phía sau scroll tràn hết
  xuống sát đáy màn hình (tối ưu diện tích hiển thị), không còn dải nền đặc phía sau pill.

- **D-1121** · 2026-11-08 · Hiện label trạng thái bên dưới progress bar khi sync (Devices) — **Chốt** (giao agent riêng, không phải agent Home)
  Kiểm tra: `SyncProgress` (`core/ble/.../WearableSession.kt`) hiện là `fun interface { fun
  report(fraction: Float) }` — **thuần số, không có label trạng thái** — và `SyncState.InProgress`
  (`core/model/Device.kt:136`) chỉ có `progress: Float`, không có field mô tả đang làm gì. Màn Devices
  hiện chỉ hiện % mà không hiện "đang làm gì" — khả thi để thêm, cần sửa xuyên suốt:
  1. `SyncProgress` thêm tham số `stage: String?` vào `report()` (vẫn giữ `fun interface`, SAM 1
     phương thức, chỉ thêm tham số).
  2. `SyncState.InProgress` thêm `val stage: String? = null`.
  3. Mỗi driver (`garmin`, `huawei`, `zepp`, `coros`, `standard`) tự báo stage ở các mốc có ý nghĩa
     trong `sync()` của mình — ví dụ Garmin: "Đang đọc danh sách file...", "Đang tải dữ liệu từ đồng
     hồ (x/y file)...", "Đang xử lý..."; driver khác tự đặt stage phù hợp luồng sync riêng của nó
     (không bắt buộc giống hệt nhau, miễn đúng thực tế đang làm gì ở bước đó). `core/demo/MockWatchDriver`
     cũng cập nhật cho đồng bộ.
  4. `DevicesViewModel`/`DevicesScreen.kt` hiện `stage` (nếu có) thành dòng text nhỏ ngay dưới progress
     bar lúc đang sync — null thì ẩn dòng đó, không hiện trống.
  Mục đích: user ngồi chờ sync biết app đang làm gì với đồng hồ, bớt cảm giác "treo máy".

## Thực thi D-1117/1119/1120 (carousel edge-to-edge, Metrics declutter + màn riêng, pill nền trong suốt) — D-112x

- **D-1122** · 2026-11-08 · `Modifier.fillBleed()` để carousel thoát `contentPadding` của `LazyColumn` cha — **Chốt**
  `Modifier.padding()` của Compose từ chối giá trị âm (`require >= 0`), nên không thể "trừ ngược" lề
  `Spacing.lg` của `LazyColumn` cha (`Summary`) bằng padding âm thông thường. Viết
  `Modifier.layout { measurable, constraints -> ... }` riêng (`fillBleed(amount)`): đo con với
  `maxWidth` rộng hơn `amount*2`, rồi `place()` lệch trái `amount` — đúng kỹ thuật "full-bleed row
  trong list có padding" chuẩn của Compose (Compose không hard-clamp kích thước `layout()` trả về theo
  constraint nhận vào, đây là pattern được dùng rộng rãi, không phải hack). `LazyRow` của
  `RacesCarousel` dùng `contentPadding = PaddingValues(horizontal = Spacing.lg)` + `.fillBleed(Spacing.lg)`
  đúng theo D-1117 — card đầu/cuối vẫn thẳng lề lúc đứng yên, nhưng scroll được tới sát mép màn hình
  thật. Không đổi `horizontalArrangement`/spacing giữa card (giữ `Spacing.md` như cũ).
- **D-1123** · 2026-11-08 · Tách `feedCardItems` dùng chung giữa Home và màn "All metrics" mới — **Chốt**
  Theo D-1119: đổi tên section "All metrics" → "Metrics"; thêm `FeedCardData.hasData()` (Metric dùng
  field `hasData` có sẵn, Workouts dùng `recent.isNotEmpty()`) lọc card trên Home — ẩn hẳn khỏi
  `LazyColumn`, không phải mờ/disable. Logic List/Grid cũ (`items`/`chunked(2)` + Row 2 cột) tách thành
  1 hàm `LazyListScope.feedCardItems(cards, viewMode, ...)` dùng chung bởi cả `Summary` (gọi với danh
  sách đã lọc `hasData`) lẫn `AllMetricsScreen` mới (gọi với `state.feedCards` nguyên văn, không lọc) —
  đúng yêu cầu "tái dùng đúng component/list cũ, chỉ bỏ filter". `AllMetricsScreen`/`AllMetricsRoute`
  đặt chung file `HomeScreen.kt` (để dùng được các composable `private` như `FeedCard`/`ViewModeToggle`
  mà không phải public hoá), route mới `AllMetricsDestination` đăng ký thêm trong
  `HomeNavigation.kt`/`UnifiedHealthNavHost.kt`, push lên trên `MainPagerDestination` như mọi màn con
  khác (MetricDetail, DeviceDetail...). CTA "Xem tất cả" cạnh header "Metrics" dùng đúng pattern
  `TextButton` đã dùng cho Races (D-1105). Thông báo rỗng khi Home không còn card nào qua lọc đổi
  thành "No metrics with data yet..." (trước chỉ nói về việc bị ẩn qua Edit, giờ cũng đúng cho trường
  hợp chưa có data).
- **D-1124** · 2026-11-08 · `Scaffold.containerColor = Color.Transparent` cho D-1120 — **Chốt**
  Đúng theo gợi ý trong quyết định: thêm `containerColor = Color.Transparent` vào `Scaffold` bao ngoài
  ở `UnifiedHealthApp.kt` (không có `Surface` bọc riêng quanh `PillBottomNavigation` để xoá — pill tự
  nó đã chỉ vẽ đúng hình pill, phần nền đặc là do `Scaffold` mặc định `containerColor =
  MaterialTheme.colorScheme.background`). Không đổi cấu trúc padding/content behind-the-bar (nội dung
  vẫn dừng đúng mép trên của `bottomBar` như cũ qua `padding` Scaffold tính sẵn) — chỉ đổi đúng 1 màu
  nền theo đúng phạm vi quyết định yêu cầu, tránh risk làm vỡ layout các màn khác nếu đổi luôn cơ chế
  padding/overlay.

- **D-1126** · 2026-11-08 · `SyncProgress.report(fraction, stage)` không có default value cho `stage` — **Chốt**
  D-1121 đặc tả chữ ký mới là `fun report(fraction: Float, stage: String? = null)`, nhưng Kotlin
  không cho phép default value trên abstract method của `fun interface` (lỗi compiler
  `FUN_INTERFACE_ABSTRACT_METHOD_WITH_DEFAULT_VALUE`) — xác nhận bằng cách build thật
  (`:core:ble:compileDebugKotlin` fail ngay). Sửa: bỏ `= null`, giữ `stage: String?` (vẫn nullable,
  chỉ không có default) — mọi call site trong `sync()` của từng driver (`garmin`, `huawei`, `zepp`,
  `coros`, `standard`), `core/demo/MockWatchDriver`, và `MultiVendorHealthDataSync` đều phải truyền
  tường minh cả 2 tham số. Cập nhật kèm theo: mọi lambda `SyncProgress` trong test (`core/demo`,
  `driver:*`) đổi từ 1 tham số/`{}` sang `{ fraction, stage -> ... }` hoặc `{ _, _ -> }` vì SAM lambda
  phải khớp đúng số tham số của method trừu tượng (default value trên interface không miễn trừ số
  tham số bắt buộc khi convert từ lambda).

- **D-1137** · 2026-11-08 · Thực thi D-1115 — `DeviceBanner` đồng bộ style/animation với Devices — **Chốt**
  Bỏ sót ở 2 commit trước (`fd11f99`/`609299c`) — làm lại ngay khi được nhắc. `DeviceBanner`
  (`HomeScreen.kt`) đổi từ `Card` (nền `secondaryContainer` tự đặt riêng) sang `ElevatedCard` không
  màu tuỳ chỉnh — đúng loại card + shape/elevation mặc định mà `PairedDeviceCard`
  (`feature/devices/DevicesScreen.kt`) đang dùng. `WatchImage` gọi đúng pattern của
  `PairedDeviceCard`: `interactive = connected`, `revealKey = connected` (bật hiệu ứng flip rotationY
  từ -90°, D-803/D-1098) và cùng 2 mức size `88.dp`/`56.dp` theo trạng thái connected — thay vì 48dp cố
  định, tĩnh, không animation như trước. Không tạo composable dùng chung mới giữa 2 màn (lý do: card ở
  Devices còn có menu/credentials/nút sync/connect mà banner trên Home không cần — gộp chung sẽ phải
  thêm nhiều tham số không dùng tới) — chỉ đồng bộ đúng phần `WatchImage`/kiểu `Card` theo đúng yêu cầu
  "gọi lại đúng component/style đã có, không viết riêng" (ở mức giá trị tham số, không bắt buộc 1 hàm
  Composable vật lý dùng chung).

- **D-1128** · 2026-11-08 · D-1117 (carousel edge-to-edge) vẫn chưa đúng — lề đầu lệch + vẫn còn margin ở cuối — **Chốt**
  User test bản cài thật: cách làm trước (`Modifier.fillBleed` tự viết + `contentPadding` trên
  `LazyRow`) chưa đạt — (1) lề trái lúc đứng yên của card đầu tiên **không khớp** với lề nội dung
  chuẩn của Home (các section khác như `RingsCard`/"Metrics" đang thẳng hàng với nhau, carousel giải
  chạy bị lệch khỏi hàng đó). (2) Cuộn hết tới card cuối vẫn còn 1 khoảng margin thừa ở mép phải,
  chưa thật sự "edge-to-edge". Yêu cầu agent: đo lại chính xác lề chuẩn Home đang dùng ở chỗ khác
  (padding của `LazyColumn`/item khác, không đoán lại từ đầu), đảm bảo card đầu carousel thẳng hàng
  pixel-perfect với mép trái của card "Metrics" ngay bên dưới nó lúc đứng yên, và card cuối cùng khi
  cuộn hết phải chạm sát mép phải màn hình (trừ đúng phần `contentPadding` cuối cùng = lề chuẩn, không
  thừa thêm margin nào khác chồng lên).

- **D-1129** · 2026-11-08 · Ảnh nền race card: `ContentScale.Contain` + tăng scrim để chữ dễ đọc — **Chốt**
  `RaceCard.kt` (`core/designsystem`) hiện vẽ `imageUrl` thật (khi có) kiểu fill/crop — đổi sang
  `ContentScale.Contain` (ảnh giữ nguyên tỉ lệ, không crop mất phần quan trọng của ảnh quảng bá chính
  thức) — gradient theo terrain vẫn làm nền phía sau để lấp khoảng trống khi ảnh không phủ hết card
  (không để trống/đen xấu). Tăng độ đậm lớp scrim tối phủ lên ảnh (gradient đen từ dưới lên hoặc phủ
  đều, agent tự chọn kiểu hợp với layout chữ hiện có) để tên giải/ngày/CTA luôn đọc được rõ trên nền
  ảnh thật, không chỉ đẹp trên nền gradient như trước.

- **D-1131** · 2026-11-08 · Sửa đúng D-1128 — bỏ `fillBleed` (hack constraint), chuyển inset ngang
  sang từng item thay vì `LazyColumn` cha — **Chốt** (đánh số lại từ D-1130 ban đầu vì trùng với
  D-1130 "ảnh đồng hồ to trên Devices" do agent/phiên khác log song song cùng lúc — nội dung không
  đổi, chỉ đổi số để hết trùng.)
  `fillBleed` (D-1122, `Modifier.layout{}` đo con rộng hơn rồi `place()` lệch âm) dựa vào việc Compose
  "không hard-clamp" kích thước `layout()` trả về so với constraint đã nhận — đúng về mặt lý thuyết
  compiler nhưng không đáng tin cậy trong thực tế trên máy thật (D-1128 xác nhận lại lệch cả 2 đầu).
  Bỏ hẳn cách này. Sửa đúng gốc: `Summary`'s `LazyColumn` (và `AllMetricsScreen`'s) đổi
  `contentPadding` chỉ còn `top`/`bottom` — bỏ `start`/`end` (`Spacing.lg`) từng áp chung cho mọi item.
  Mỗi item tự thêm `Modifier.padding(horizontal = Spacing.lg)` ở đúng chỗ (`DeviceBanner`, `RingsCard`
  — cả 2 giờ nhận `modifier` param mới —, header Row "Metrics"/"Highlights", `HighlightCard` — cũng
  thêm `modifier` param —, và `feedCardItems` dùng chung giữa Home/AllMetricsScreen). `RacesCarousel`
  là item DUY NHẤT không tự thêm padding ngang ở ngoài — nhờ vậy `LazyRow` của nó nhận được đúng
  constraint rộng = full màn hình (không bị cha giới hạn trước), rồi tự dùng
  `contentPadding = PaddingValues(horizontal = Spacing.lg)` của chính nó để card đầu/cuối thẳng hàng
  với mọi item khác lúc đứng yên, còn viewport cuộn thì rộng hết cỡ màn hình thật (không còn bị cha
  bóp hẹp trước khi tự nó có cơ hội thêm padding riêng). Cách này không cần bất kỳ `Modifier.layout`
  tự chế nào — mọi kích thước đều đi qua đúng luồng constraint cha→con chuẩn của Compose, giống hệt
  cách `DeviceBanner`/`RingsCard`/feed card đã luôn thẳng hàng đúng từ trước — nên tin cậy hơn hẳn.
  Lưu ý: không có thiết bị/emulator thật trong môi trường này để tự chụp màn hình kiểm chứng trực
  tiếp như yêu cầu — đã rà lại toán constraint/placement từng bước bằng tay (ghi trong code comment
  tại `RacesCarousel`/`Summary`) thay vì chỉ tin code compile được; nhờ người dùng xác nhận lại trên
  máy thật lần nữa.

- **D-1130** · 2026-11-08 · Ảnh đồng hồ trên màn Devices (list) phải to như ở "About this device" — **Chốt**
  Kiểm tra thật: `DeviceDetailScreen.kt:159` ("About this device") dùng `WatchImage(size = 180.dp)`
  to, giữa card; còn `DevicesScreen.kt:328` (card trong "My devices", màn Devices chính) chỉ dùng
  `size = if (connected) 88.dp else 56.dp` — nhỏ hơn nhiều. User chỉ ra: sau khi kết nối lần đầu,
  user hiếm khi mở lại "About this device" — màn Devices chính mới là nơi họ thực sự nhìn thấy
  thường xuyên, nên ảnh đồng hồ ở đó cần to, đập vào mắt, đúng như ở "About this device". Sửa: tăng
  size ảnh ở `DevicesScreen.kt` card "My devices" lên tương đương 180.dp (hoặc gần đó, agent tự cân
  đối lại layout Row/Column cho hợp — có thể cần đổi từ `Row` ngang ảnh+text sang `Column` ảnh lớn ở
  trên, text bên dưới, giống bố cục "About this device") khi `connected = true`. Việc này liên quan
  trực tiếp D-1115 (DeviceBanner Home copy style Devices) — làm xong cái này trước thì D-1115 copy
  theo sẽ tự động to theo, không cần sửa 2 lần.

- **D-1136** · 2026-11-08 · Bố cục lại race card: ảnh rõ nét ở trên, nền blur màu ảnh ở dưới thay vì overlay+scrim — **Chốt**
  (Đánh số lại 2 lần: D-1131 ban đầu → trùng D-1131 "Sửa đúng D-1128 — bỏ `fillBleed`" → đổi sang
  D-1132 → lại trùng tiếp D-1132 "Tắt scrub-theo-ngày trên mini chart ở Home" do một agent/phiên khác
  log gần như cùng lúc. Nội dung không đổi qua các lần đổi số — giống cách D-1130→D-1131 và D-1116→
  D-1122→D-1125 đã tự xử lý trước đó. D-1136 chọn vì D-1135 là số cao nhất thấy được tại thời điểm
  phát hiện trùng lần 2.)
  Sau khi thấy ảnh thật (D-1129) khá đẹp, user muốn đổi hướng bố cục thay vì ảnh làm nền full-bleed có
  scrim tối phủ chữ lên: (1) **Ảnh thật hiển thị rõ, không bị scrim**, nằm ở phần **trên** của card
  (dùng `ContentScale.Crop` cho gọn khung ảnh, không cần giữ nguyên tỉ lệ như D-1129 nữa vì giờ ảnh
  không phải nền chữ đè lên). (2) **Phần dưới** (tên giải, ngày, cự ly, giá, CTA) có nền là bản
  **blur** của chính ảnh đó (Compose `Modifier.blur(...)`, kèm 1 lớp scrim nhẹ nếu cần tương phản chữ
  — giờ dễ đảm bảo tương phản hơn hẳn vì không phải scrim cả ảnh gốc) — tạo hiệu ứng "ambient
  color/backdrop" lấy từ chính ảnh giải, đẹp và hiện đại hơn overlay cũ.
  Lưu ý kỹ thuật: `Modifier.blur()` chỉ chạy blur thật từ Android 12 (API 31) trở lên — dưới đó
  Compose tự fallback về không-blur (không crash), app minSdk 26 nên chấp nhận máy cũ không có hiệu
  ứng blur, không cần tự viết fallback thủ công. Race **chưa có ảnh thật** (gradient theo terrain) thì
  giữ nguyên cách hiển thị cũ (gradient làm cả nền, không áp dụng bố cục 2 phần này) — chỉ race có
  `imageUrl` thật mới dùng layout mới.

- **D-1132** · 2026-11-08 · Tắt scrub-theo-ngày trên mini chart ở Home, chỉ bật trong `MetricDetailScreen` — **Chốt**
  Chart nhúng trong card "Metrics" trên Home (List mode, D-1073/1090) tái dùng
  `HealthBarChart`/`HealthRangeChart` ở `core/designsystem/HealthCharts.kt` — cùng component đã có
  drag-to-scrub xem giá trị từng điểm (D-1020). User không muốn scrub theo từng ngày hoạt động ngay
  trên Home (chart quá nhỏ, dễ nhầm với thao tác bấm card để mở detail) — chỉ `MetricDetailScreen`
  (sau khi bấm vào 1 chỉ số cụ thể) mới cho scrub xem chi tiết từng ngày. Thêm tham số bật/tắt scrub
  (vd `scrubEnabled: Boolean = true`) vào `HealthBarChart`/`HealthRangeChart`, Home truyền `false`,
  `MetricDetailScreen` giữ `true`. Cần tìm cách báo cho user biết "chart này không xem chi tiết từng
  ngày được, bấm vào xem chi tiết đầy đủ" — agent tự chọn cách thể hiện hợp lý (có thể không cần thêm
  gì ngoài việc tắt hẳn phản hồi scrub, miễn thao tác kéo trên Home không làm gì cả thay vì giả vờ
  hoạt động rồi không hiện giá trị).

- **D-1138** · 2026-11-08 · Thực thi D-1130 — ảnh đồng hồ to (180dp) khi connected trên Devices + Home — **Chốt**
  (Số D-1130 "ảnh đồng hồ to" bị trùng với D-1131 bản gốc "sửa fillBleed" do 2 agent log song song —
  D-1131 đã tự đổi số; entry D-1130 "ảnh to" giữ nguyên số, đây chỉ là entry log việc *thực thi* nó.)
  `PairedDeviceCard` (`feature/devices/DevicesScreen.kt`): khi `connected`, đổi từ `Row` ngang (ảnh
  nhỏ bên cạnh text) sang `Column` dọc — `WatchImage(size = 180.dp, interactive = true, revealKey =
  connected)` to, canh giữa ở trên (đúng bố cục `DeviceDetailScreen.kt`'s "About this device"), tên +
  vendor/mac canh giữa bên dưới, nút "more options" (menu 3 chấm) nổi góc phải trên bằng `Box` overlay
  thay vì nằm trong `Row` cũ. Khi KHÔNG connected: giữ nguyên `Row` ngang + `size = 56.dp` như cũ
  (không đổi). Phần khác của card (battery, firmware, last sync, sync stage, nút Connect/Disconnect/
  Sync, menu Unpair/credentials) không đổi logic, chỉ tách `menuButton` thành 1 lambda cục bộ dùng lại
  được ở cả 2 nhánh bố cục.
  `DeviceBanner` (`feature/home/HomeScreen.kt`, D-1115 vừa làm trước đó với size cũ 88dp/56dp): cập
  nhật theo đúng size mới — khi có device và đang connected, cũng chuyển sang `Column` dọc với
  `WatchImage(size = 180.dp, ...)` + tên/subtitle/"Last synced"/`ConnectionStatusChip` canh giữa bên
  dưới, y hệt tinh thần layout của `PairedDeviceCard`; khi chưa pair hoặc có device nhưng chưa
  connected, giữ `Row` ngang nhỏ (56dp) như D-1115 đã làm. Làm theo đúng thứ tự user yêu cầu (D-1130
  trước, D-1115 kế thừa theo) thay vì phải sửa `DeviceBanner` 2 lần.

- **D-1139** · 2026-11-08 · Thực thi D-1132 — tắt scrub-theo-ngày trên mini chart ở Home — **Chốt**
  Thêm tham số `scrubEnabled: Boolean = true` vào `HealthBarChart`/`HealthRangeChart`
  (`core/designsystem/HealthCharts.kt`), truyền thẳng vào `chartScrubGestures(scrubEnabled &&
  points.isNotEmpty())` — khi `false`, `chartScrubGestures` trả về `Modifier` gốc không gắn
  `pointerInput` nào (đã có sẵn logic `if (!enabled) return this`), nên thao tác kéo trên Home không
  bị "giả vờ phản hồi rồi không hiện gì" mà chỉ đơn giản KHÔNG được xử lý ở đây — gesture rơi xuống
  đúng `ElevatedCard.onClick` của card để mở `MetricDetailScreen`, đúng tinh thần "bấm vào xem chi
  tiết đầy đủ" mà quyết định yêu cầu, không cần thêm text/hint nào khác. `HomeScreen.kt`'s `MiniChart`
  (dùng bởi card "Metrics" List mode, D-1073/1090) truyền `scrubEnabled = false` ở cả 2 nhánh
  (`HealthRangeChart`/`HealthBarChart`); `MetricDetailScreen.kt` không đổi gì, giữ mặc định `true`.
  Không đụng tới `ActivityScreen.kt`/`WorkoutDetailScreen.kt` (cũng gọi 2 chart này) — nằm ngoài phạm
  vi quyết định này (chỉ nói "Home's Metrics cards"), không tự ý mở rộng.

- **D-1133** · 2026-11-08 · Carousel giải chạy: snap paged scroll (1 item + 20% peek), cache ảnh, giới hạn compose ngoài khung nhìn — **Chốt**
  User lường trước data giải chạy sẽ nhiều lên theo thời gian — tối ưu carousel `RacesCarousel` ngay:
  1. **Kích thước item**: mỗi card rộng ~80% bề ngang khả dụng của `LazyRow`, sao cho lúc đứng yên
     thấy đủ 1 card + ~20% card kế tiếp (peek) — đúng tỉ lệ user chỉ định.
  2. **Snap/paged scroll**: dùng `rememberSnapFlingBehavior` (Compose Foundation, gắn vào
     `LazyListState` của `RacesCarousel`) để vuốt xong luôn dừng đúng khung 1 card, không dừng lưng
     chừng giữa 2 card.
  3. **Ảnh dùng cache**: xác nhận lại Coil load ảnh race qua 1 `ImageLoader` dùng chung (singleton/Hilt-
     provided, không tạo mới mỗi lần recompose) để tận dụng memory+disk cache mặc định của Coil, tránh
     tải lại ảnh khi cuộn qua lại.
  4. **Hạn chế compose ngoài khung nhìn**: `LazyRow` vốn đã lazy (chỉ compose item gần viewport) —
     không cần tự viết windowing riêng, chỉ cần đảm bảo không có gì phá vỡ tính lazy đó (ví dụ không
     dùng `Row` thường bọc ngoài danh sách dài). Không cần thêm thư viện/API phức tạp ngoài
     `LazyRow` chuẩn.

- **D-1134** · 2026-11-08 · `PillBottomNavigation`: fade ẩn/hiện theo scroll + style "liquid glass" — **Chốt**
  Đã đọc skill `liquid-glass-design` (viết cho iOS SwiftUI/UIKit, không áp code trực tiếp được) — dịch
  nguyên tắc sang Compose/Android:
  1. **Fade theo scroll**: đang cuộn (bất kỳ top-level screen nào trong `MainPagerDestination`) → pill
     fade out dần (animation có timing, không biến mất đột ngột) để tối đa khung nhìn content. Dừng
     cuộn (settle, có thể chờ ~300-500ms sau khi hết scroll để tránh nhấp nháy khi cuộn ngắt quãng) →
     fade in lại. Tham khảo cơ chế đọc trạng thái scroll đã có ở D-1083 (DeviceBanner collapse theo
     scroll của Home) — dùng pattern tương tự (`LazyListState.isScrollInProgress` hoặc
     `NestedScrollConnection` ở cấp `Scaffold`/`MainPagerDestination`) áp dụng chung cho mọi tab, không
     chỉ riêng Home.
  2. **"Liquid glass" style cho pill**: dịch từ nguyên tắc iOS (vật liệu trong suốt, blur nội dung phía
     sau, phản chiếu ánh sáng nhẹ ở viền, hình capsule — pill hiện tại đã đúng hình capsule) sang
     Android: nền pill đổi từ màu đặc `surfaceContainerHigh` sang **bán trong suốt** (alpha thấp) +
     **blur nội dung phía sau** bằng `Modifier.graphicsLayer { renderEffect =
     RenderEffect.createBlurEffect(...).asComposeRenderEffect() }` (chỉ chạy blur thật từ API 31 trở
     lên, dưới đó Compose tự bỏ qua blur — chấp nhận máy cũ chỉ thấy bán trong suốt không blur, không
     cần fallback thủ công, giống D-1131) + 1 viền sáng mờ (border 1dp alpha thấp) tạo cảm giác
     "ánh sáng viền kính" nhẹ. Giữ nguyên animation pill-slide-theo-tab (D-1077) và không-ripple
     (D-1091) đã có — chỉ đổi phần vật liệu/nền, không đổi hành vi chọn tab.

- **D-1135** · 2026-11-08 · Thực thi D-1133 — snap paging 80% + xác nhận Coil cache/lazy composition
  cho `RacesCarousel` — **Chốt**
  (1) Mỗi `RaceCard` đổi từ `Modifier.width(300.dp)` cố định sang `Modifier.fillParentMaxWidth(0.8f)`
  (API `LazyItemScope`, có sẵn trong lambda `items{}`, không cần import riêng) — card đứng yên chiếm
  80% viewport, hé lộ ~20% card kế tiếp. (2) Thêm `rememberLazyListState()` riêng cho carousel +
  `flingBehavior = rememberSnapFlingBehavior(listState)` trên `LazyRow` — fling giờ luôn dừng gọn ở
  đúng 1 card, không bao giờ dừng nửa chừng. (3) Xác nhận Coil cache: `RaceCard.kt` dùng
  `coil.compose.AsyncImage(model = imageUrl, ...)` — overload đơn giản này tự lấy
  `Context.imageLoader` (Coil extension), vốn là **singleton tự quản bởi Coil** cho cả vòng đời
  Application (trừ khi `Application` tự implement `ImageLoaderFactory` để tuỳ biến, mà app này không
  làm) — nghĩa là cache memory+disk của Coil đã hoạt động đúng qua các lần scroll/recompose từ trước
  đến giờ, không cần sửa gì (đã grep toàn repo, không có chỗ nào tự tạo `ImageLoader(...)` mới mỗi lần
  compose). (4) Xác nhận lazy composition: `items(races, key = { it.id })` bên trong `LazyRow` —
  không có `Row` thường nào bọc ngoài ép compose hết toàn bộ danh sách — đã đúng từ trước, không cần
  đổi gì thêm.

- **D-1140** · 2026-11-08 · Thực thi D-1134 (phần 1 fade-theo-scroll) — fade pill qua `NestedScrollConnection`
  dùng chung cho mọi tab — **Chốt**
  `UnifiedHealthApp.kt` tạo 1 `NestedScrollConnection` (chỉ override `onPreScroll`, luôn trả về
  `Offset.Zero` — chỉ quan sát, không "ăn" scroll của ai), gắn vào `Modifier.nestedScroll(...)` trên
  modifier của `UnifiedHealthNavHost` (bọc toàn bộ nội dung NavHost, không riêng 1 tab nào) — bất kỳ
  `LazyColumn`/`LazyRow`/scrollable nào bên trong (Home, Activity, Devices, Profile, kể cả màn con)
  dispatch scroll đều bật cờ `pillVisible = false` và restart đếm ngược 400ms qua coroutine; hết
  400ms không có scroll mới nào thì `pillVisible = true` lại. Vì `onPreScroll` tự nhiên được gọi liên
  tục trong lúc fling (không chỉ lúc kéo tay), timer tự restart suốt fling và chỉ thực sự đếm khi
  scroll dừng hẳn — không cần xử lý `onPreFling`/`onPostFling` riêng. `PillBottomNavigation` nhận
  tham số `visible: Boolean = true`, animate alpha bằng `animateFloatAsState` + `graphicsLayer { alpha
  = ... }` trên chính `Surface` ngoài cùng (220ms tween, đủ mượt, không giật).

- **D-1141** · 2026-11-08 · Thực thi D-1134 (phần 2 liquid-glass) — chỉ làm bán trong suốt + viền sáng,
  **không** làm blur nền thật — **Tạm**
  Đổi `color` của pill từ `surfaceContainerHigh` đặc sang `surfaceContainerHigh.copy(alpha = 0.62f)` +
  đổi border từ `outlineVariant` sang `Color.White.copy(alpha = 0.28f)` (viền sáng gợi "ánh sáng viền
  kính", không phụ thuộc theme sáng/tối). **Cờ cảnh báo theo đúng yêu cầu của quyết định**: KHÔNG áp
  dụng `RenderEffect.createBlurEffect` thật như gợi ý, vì xét đúng cách pill đang được layer hiện tại
  (`Scaffold`'s `bottomBar` slot — anh em cùng cấp, không nằm chồng lên `content` slot trong cùng 1
  draw stack) thì blur này **không có tác dụng thị giác nào** (hoặc tệ hơn, gây hiểu lầm): `graphicsLayer{
  renderEffect=...}` chỉ blur đúng nội dung tự vẽ của chính layer đó (nền pill + icon/text bên trong),
  không "nhìn xuyên" blur được nội dung đang cuộn PHÍA SAU nó trong window — vì 2 bên không chung 1
  layer để lấy mẫu. Blur 1 màu nền phẳng (không texture) thị giác giống hệt không-blur — lãng phí, có
  thể trông như bug trên API 31+ khi so với API thấp hơn (trông y hệt). Để có "kính mờ" thật (blur nội
  dung cuộn phía sau), cần: (1) dời pill ra khỏi `Scaffold.bottomBar`, đặt trong `Box` overlay chung
  với `NavHost` (content phải thật sự cuộn RA SAU vùng pill, không dừng trước nó như hiện tại), (2)
  dùng `GraphicsLayer` tường minh (`androidx.compose.ui.graphics.layer.GraphicsLayer`, API snapshot
  của Compose UI mới) để pill blur-sample đúng phần nội dung bên dưới vị trí nó — đổi kiến trúc
  layering/compositing, không còn là "chỉ đổi vật liệu/nền" như quyết định mô tả. Đánh dấu **Tạm** +
  báo lại rõ ràng theo đúng lời mời của quyết định ("flag clearly if impractical") thay vì tự ý đoán
  hoặc làm 1 bản blur vô nghĩa cho có. Bán trong suốt + viền sáng vẫn tạo được cảm giác "kính" ở mức
  chấp nhận được mà không cần đổi kiến trúc.

- **D-1142** · 2026-11-08 · Race card: ảnh thật quá nhiều tỉ lệ khác nhau — dời ảnh rõ nét vào góc trên-phải, giữ nguyên tỉ lệ gốc — **Chốt**
  D-1131/1136 (ảnh rõ nét full-width ở trên + blur làm nền phần text) gặp vấn đề thật: ảnh race crawl
  được (D-1111) có tỉ lệ khung hình rất khác nhau giữa các nguồn (poster dọc, banner ngang, ảnh vuông…)
  — ép vào 1 band ngang cố định ở trên làm ảnh bị crop/méo không đẹp. Sửa: **ảnh nền blur (ambient
  backdrop) phủ TOÀN BỘ card** (không chỉ phần dưới nữa) — xử lý tốt sẵn mọi tỉ lệ vì nó bị blur/phóng
  to che hết. **Ảnh rõ nét** dời thành 1 khối nhỏ ở **góc trên-phải** của card, kích thước giữ **đúng
  tỉ lệ gốc của ảnh** (`ContentScale.Fit`/`FillHeight` trong 1 khung bo góc giới hạn kích thước tối đa,
  không ép vuông/ép ngang) — giống kiểu thumbnail/badge, không còn là hero band full-width. Tên giải/
  ngày/cự ly/giá/CTA vẫn nằm trên nền blur, tránh đè lên góc có ảnh rõ nét. Race chưa có ảnh thật vẫn
  giữ gradient-theo-terrain full card như cũ (D-1131 đã quyết, không đổi).

- **D-1143** · 2026-11-08 · `DeviceBanner` to (180dp, D-1115/1137) chiếm quá nhiều chỗ trên Home — tự co lại sau khi vào màn — **Chốt**
  Sau khi D-1115 làm `DeviceBanner` trên Home copy style to (180dp) của Devices/"About this device",
  user thấy nó chiếm quá nhiều không gian dọc ngay khi mở Home — trước đây (trước D-1115) nó là banner
  gọn nhỏ. Yêu cầu: **lúc mới vào Home thì hiện to** (giữ hiệu ứng "đập vào mắt" D-1130 muốn), nhưng
  **tự động animate co lại về bố cục gọn (như trước D-1115)** sau một khoảng ngắn — không cần chờ user
  tự scroll như cơ chế collapse-theo-scroll đã có (D-1083/1088) — content bên dưới animate dồn lên lấp
  khoảng trống khi banner co lại. Có thể tái dùng chung animation/trigger với D-1083 (chỉ khác: tự
  trigger sau delay thay vì chờ scroll), agent tự quyết thời gian delay hợp lý (gợi ý: 1.5-2.5s) và
  cách phối hợp 2 cơ chế (tự co + co-theo-scroll) không xung đột nhau.

- **D-1144** · 2026-11-08 · Bottom nav vẫn còn box/nền đặc phía sau pill dù đã sửa D-1120/D-1134 — **Chốt**
  User xác nhận trên máy thật: vẫn thấy 1 khối nền màu riêng (dải màu khác content) ngay phía sau/
  dưới pill, dù `Scaffold(containerColor = Color.Transparent)` (D-1120) và pill bán trong suốt
  (D-1134/1141) đã làm. Nghi ngờ: còn 1 lớp `Surface`/`Box` nào đó (có thể từ phần
  `windowInsetsPadding(WindowInsets.navigationBars...)` ở D-1084) vẫn giữ màu nền riêng bao quanh
  pill, không phải do `Scaffold.containerColor`. Cần rà lại **toàn bộ cây view** từ `Scaffold` xuống
  tới `PillBottomNavigation` (không chỉ sửa đúng 1 chỗ đã nghi ngờ trước đó), đảm bảo **không còn bất
  kỳ lớp nào có màu nền đặc** ngoài chính hình pill — kiểm tra bằng Layout Inspector/đọc code kỹ từng
  modifier `background`/`Surface` trên đường đi, không đoán.
  **Nguyên nhân thật (tự điều tra code, xác nhận):** `UnifiedHealthApp.kt` dùng
  `Scaffold(bottomBar = {...})` chuẩn — `NavHost` được truyền `Modifier.padding(padding)` theo đúng
  `innerPadding` Scaffold cấp, nghĩa là **content dừng lại trước vùng pill, không hề vẽ xuống dưới
  đó** — pill/Scaffold trong suốt chỉ lộ ra nền app trơn (`background` theme), không phải content thật
  đang cuộn. Vì vậy "trong suốt" không tạo được cảm giác pill nổi trên content như mong muốn — đúng
  pattern mà agent trước đã cảnh báo khi từ chối làm blur thật (D-1141). **Sửa tận gốc**: bỏ hẳn
  `Scaffold(bottomBar=...)`, chuyển sang `Box` — `NavHost` vẽ full-screen (content thật sự cuộn ra
  sau vùng pill), `PillBottomNavigation` đặt đè lên trên bằng `Modifier.align(Alignment.BottomCenter)`
  trong cùng `Box`. Làm xong việc này thì D-1141 (blur thật) cũng khả thi luôn vì giờ pill mới thực sự
  là overlay trên content.

- **D-1145** · 2026-11-08 · Revert `DeviceBanner` trên Home về bản gọn cũ (trước D-1115) — **Chốt**
  User đổi ý sau khi thấy bản to+auto-collapse (D-1115/1143) trên Home — không cần nữa, muốn Home
  dùng lại đúng layout `DeviceBanner` gọn nhỏ như **trước khi có D-1115**. Giữ nguyên D-1130 (ảnh to
  180dp) ở màn Devices ("My devices") và "About this device" — chỉ revert riêng phần Home. Vì không
  còn banner to trên Home nữa, cơ chế auto-collapse D-1143 (`LaunchedEffect` scroll-by sau 2s) cũng
  hết tác dụng — xoá luôn phần code đó cho sạch thay vì để lại chết.

- **D-1146** · 2026-11-08 · Ảnh góc trong race card: dời xuống góc dưới-phải, to gấp đôi — **Chốt**
  D-1142 đặt ảnh rõ nét nhỏ ở góc trên-phải — user thấy nhỏ quá. Sửa: dời xuống **góc dưới-phải**, kích
  thước tăng **gấp đôi** so với hiện tại (`RaceThumbnailMaxSize` nhân đôi hoặc giá trị tương đương) —
  vẫn giữ `ContentScale.Fit` theo đúng tỉ lệ gốc ảnh (D-1142 không đổi), chỉ đổi vị trí + kích thước.
  Kiểm tra lại bố cục text (CTA/giá thường nằm dưới cùng) không bị đè bởi ảnh to hơn ở góc mới — nhường
  chỗ hợp lý.

- **D-1147** · 2026-11-08 · **Thay cho D-1145**: bỏ hẳn `DeviceBanner` khỏi Home, chỉ giữ chip ở header + dot trạng thái — **Chốt**
  User đổi ý thêm lần nữa ngay sau D-1145 — không revert về bản gọn cũ nữa, mà **bỏ hẳn** `DeviceBanner`
  khỏi nội dung chính của Home (không còn box thiết bị nào trong `LazyColumn` cả). Giữ nguyên chip nhỏ
  tên+ảnh thiết bị đã có sẵn ở góc phải `TopAppBar`/header (từ D-1083/1098) — user xác nhận chip đó
  "như hiện tại ổn rồi", không cần sửa style/animation của nó. Vì không còn banner trong body để
  collapse-theo-scroll nữa, chip ở header nên **luôn hiện sẵn** (bỏ logic ẩn/hiện theo scroll gắn với
  banner đã xoá — đơn giản hoá, không cần animation reveal phức tạp nữa, trừ khi muốn giữ fade-in nhẹ
  lúc Home mới mở).
  **Thêm dot trạng thái** lên chip đó: **xanh lá** khi thiết bị đang connected/đang sync (progress),
  **xám** cho các trạng thái còn lại (disconnected/idle) — tái dùng đúng component `LiveDot`/pattern
  dot đã có (D-1054), không tạo component dot mới.
  D-1130 (ảnh to 180dp ở "My devices"/"About this device") và D-1115's style-sync cho Devices **không
  đổi** — D-1147 chỉ ảnh hưởng Home. D-1143 (auto-collapse) giờ xoá hẳn vì không còn gì để collapse.

- **D-1148** · 2026-11-08 · Devices: tap ảnh thiết bị → mở fullscreen kiểu Android, kèm animation mời tap — **Chốt**
  User muốn ảnh thiết bị (180dp, D-1130) trên màn Devices/"About this device" tap được: tap vào thì mở
  lên dạng fullscreen (pattern Android quen thuộc: ảnh phóng to che toàn màn hình, nền tối lại, tap lần
  nữa/back để đóng — kiểu Material `Dialog`/overlay full-screen với ảnh zoom-able, không nhất thiết phải
  pinch-zoom phức tạp nếu không cần thiết, nhưng transition mở/đóng phải mượt, catchy). Vì ảnh giờ tap
  được nhưng không có gì gợi ý điều đó, **thêm 1 animation nhẹ, lặp lại (subtle pulse/breathing hoặc
  tương tự)** trên ảnh để gợi ý user nên tap vào — không được gây rối mắt, giữ tinh tế (gợi ý: scale nhẹ
  1.0↔1.03 hoặc elevation/shadow nhấp nháy nhẹ, chu kỳ vài giây, agent tự chọn kiểu phù hợp thẩm mỹ hiện
  tại). Mở fullscreen nên có hiệu ứng transition (shared-element kiểu ảnh phóng to từ đúng vị trí ban đầu
  nếu dễ làm với Compose hiện có, hoặc fade+scale đơn giản nếu shared-element phức tạp quá — ưu tiên làm
  đúng, không ép buộc shared-element bằng mọi giá).

- **D-1149** · 2026-11-08 · Bottom nav: không ẩn khi swipe đổi tab, chỉ ẩn khi scroll nội dung — **Chốt**
  Hiện tại pill bottom nav đang ẩn đi (fade out) ngay cả khi user **swipe ngang để đổi tab** (pager
  swipe) — không mong muốn. Chỉ nên ẩn/fade khi user **scroll dọc nội dung bên trong 1 tab** (để tối ưu
  diện tích xem, đúng mục đích ban đầu D-1134/1141); khi đang swipe ngang đổi trang (pager gesture) thì
  **giữ nguyên pill luôn hiện**, vì lúc đó user đang tương tác trực tiếp với điều hướng, ẩn đi là phản tác
  dụng. Cần rà lại logic đang điều khiển biến `visible`/`pillVisible` trong `UnifiedHealthApp.kt` — tách
  rõ 2 nguồn trigger (scroll nội dung vs. pager swipe) và chỉ cho nguồn đầu ảnh hưởng tới ẩn/hiện. Việc
  này thuộc cùng khu vực file với D-1144 (`UnifiedHealthApp.kt`, `PillBottomNavigation.kt`) — gộp chung
  vào agent đang xử lý D-1144/D-1147 thay vì agent riêng, tránh đụng file.

- **D-1150** · 2026-11-08 · Ảnh cover màn Race Detail: đọc đúng ratio ảnh gốc, ảnh vuông thì mặc định 16:9 + blur nền — **Chốt**
  `RaceDetailScreen` hiện đang hiển thị ảnh cover theo tỉ lệ cố định (không khớp ratio gốc ảnh crawl
  được, vốn rất đa dạng — như đã gặp ở `RaceCard`/D-1131/1136/1142). Sửa: **đọc kích thước gốc của ảnh**
  (qua Coil — ví dụ `AsyncImagePainter`/`SubcomposeAsyncImage` lấy `intrinsicSize`, hoặc decode bounds)
  và set container theo đúng tỉ lệ đó (`Modifier.aspectRatio(w/h)`), ảnh hiển thị full, không crop méo.
  **Trường hợp đặc biệt: ảnh vuông (ratio ~1:1)** — không hiển thị vuông thô, mà dùng khung mặc định
  **16:9** cho container, ảnh gốc đặt giữa theo đúng tỉ lệ thật của nó (`ContentScale.Fit`, không
  crop/méo), phần nền thừa trong khung 16:9 lấp bằng **backdrop blur** của chính ảnh đó (tái dùng pattern
  blur nền đã có từ `RaceCard`/`RaceImageBackdrop`, D-1131/1136, không viết lại blur mới). Trong lúc
  ảnh đang tải xong (chưa biết ratio), dùng placeholder 16:9 làm mặc định tạm — chuyển sang ratio thật
  ngay khi ảnh load xong.

- **D-1151** · 2026-11-08 · `RaceDetailScreen`: nội dung cuối bị che bởi system navigation bar — áp dụng chuẩn insets toàn app — **Chốt**
  User xác nhận trên máy thật: phần cuối màn Race Detail (CTA đăng ký/nút cuối) bị thanh điều hướng hệ
  thống (system navigation bar / gesture bar) của thiết bị che mất — màn hình thiếu
  `WindowInsets.navigationBars` padding ở đáy nội dung cuộn. Cùng agent đang làm D-1150 trên file này
  xử lý luôn (không tách agent riêng, tránh đụng file). **"tính toán để không gặp việc tương tự"** — agent
  cần kiểm tra thêm các màn full-screen/scrollable khác trong app (đặc biệt các màn mới thêm gần đây:
  Devices, Home, Races list) xem có thiếu padding đáy tương tự không, và áp dụng nhất quán — tham khảo
  pattern insets đã đúng ở `PillBottomNavigation` (D-1084, `windowInsetsPadding(WindowInsets.navigationBars...)`)
  làm chuẩn. Không cần sửa toàn bộ app trong 1 lần nếu phát hiện phạm vi quá rộng — ưu tiên `RaceDetailScreen`
  trước, agent tự quyết định mở rộng thêm bao nhiêu mà vẫn giữ an toàn/đúng phạm vi.

## Thực thi D-1144/D-1147 (Scaffold→Box cho pill nav, bỏ hẳn DeviceBanner khỏi Home) — D-115x

- **D-1152** · 2026-11-08 · Thực thi D-1147 (bỏ hẳn `DeviceBanner` khỏi Home) — **Chốt** (đánh số lại
  từ D-1148 ban đầu vì trùng với D-1148 "Devices: tap ảnh thiết bị → mở fullscreen" do một phiên khác
  log song song cùng lúc — nội dung không đổi, chỉ đổi số để hết trùng, giống cách D-1130→D-1131 đã
  tự xử lý trước đó.)
  `HomeScreen.kt` (`feature/home`): xoá hẳn `item { DeviceBanner(...) }` khỏi `Summary`'s `LazyColumn`
  (không còn box thiết bị nào trong body), xoá hẳn composable `DeviceBanner` (grep xác nhận không còn
  caller nào khác trong repo — an toàn xoá hẳn, không chỉ để lại unused), và xoá theo 2 helper chỉ
  phục vụ nó (`rememberRelativeSyncLabel`/`relativeTimeLabel`/`REFRESH_INTERVAL_MS`/`DATE_LABEL`, D-1075's
  "Last synced" label — không còn chỗ nào hiển thị nó nữa vì chip header không yêu cầu label này).
  Xoá hẳn luôn D-1083/1088's `deviceBannerCollapseFraction`/`deviceBannerHeightPx` (`derivedStateOf`
  theo scroll offset của item 0) và D-1143's `LaunchedEffect` auto-collapse (`listState.animateScrollBy`
  sau 2s) — đúng yêu cầu xoá hẳn thay vì để lại chết, vì không còn banner nào để co lại nữa.
  `DeviceChip` (header, trong `TopAppBar`'s `actions`): đổi tham số từ `alphaFraction: Float` (trước
  nhận trực tiếp `deviceBannerCollapseFraction`) sang `syncState: SyncState` — giờ **luôn hiện** (không
  còn early-return theo `alphaFraction <= 0f`), chỉ giữ 1 fade-in nhẹ một lần lúc Home mới compose
  (`remember { mutableStateOf(false) }` bật `true` trong `LaunchedEffect(Unit)`, animate qua
  `animateFloatAsState` + `graphicsLayer { alpha = ... }`) — đúng tinh thần "không cần dựng lại
  scroll-tracking phức tạp" của quyết định. `WatchImage`'s `revealKey` (hiệu ứng xoay-vào 3D, D-1098)
  giờ key theo chính biến `revealed` một-lần-khi-compose đó thay vì theo fraction cũ.
  **Dot trạng thái**: thêm `LiveDot(isLive = ...)` (tái dùng đúng component D-1054, không viết mới)
  vào cuối `DeviceChip`'s `Row`, `isLive = connected && syncState is SyncState.InProgress` — xanh khi
  vừa connected vừa đang sync, xám mọi trường hợp khác (disconnected/idle/done/failed), đúng yêu cầu.
  `SyncState` chưa có sẵn trong `HomeUiState`/`HomeViewModel` trước đó — thêm field
  `HomeUiState.Success.syncState: SyncState = SyncState.Idle` + combine thêm
  `deviceRepository.syncState` (cùng nguồn `WearableDeviceRepository.syncState` mà `DevicesViewModel`
  đã dùng — không có state per-device, dùng chung 1 global flow như Devices màn đang làm, không tự
  chế thêm per-device tracking mới cho task này). `onOpenDevices` param trong `Summary` giờ không còn
  nơi nào dùng nội bộ (trước chỉ dùng trong `DeviceBanner`) nhưng **giữ nguyên trong signature** thay
  vì dọn luôn — xoá nó sẽ kéo theo sửa cả `HomeScreen`/`HomeRoute`/`HomeNavigation.kt` (đổi signature
  công khai, rủi ro/phạm vi vượt quá yêu cầu D-1147 chỉ nói về `DeviceBanner`); Kotlin không coi tham
  số không dùng là lỗi biên dịch, và repo không bật detekt/ktlint/`-Werror` nên không ảnh hưởng build.

- **D-1153** · 2026-11-08 · Thực thi D-1144 (Scaffold→Box cho pill nav) — **Chốt** (đánh số lại từ
  D-1149 ban đầu vì trùng với D-1149 "Bottom nav: không ẩn khi swipe đổi tab" do cùng phiên khác ở
  trên log song song — nội dung không đổi, chỉ đổi số.)
  `UnifiedHealthApp.kt` (`app`): thay `Scaffold(bottomBar = { PillBottomNavigation(...) }, containerColor
  = Color.Transparent)` bằng `Box(Modifier.fillMaxSize())` chứa `UnifiedHealthNavHost` (`Modifier.fillMaxSize()`,
  không còn `.padding(padding)` nào bóp hẹp nó nữa) và `PillBottomNavigation(modifier =
  Modifier.align(Alignment.BottomCenter))` cùng cấp — đúng kiến trúc D-1144 đã xác định nguyên nhân
  gốc (Scaffold's `innerPadding` khiến content dừng hẳn trước vùng pill, nên pill trong suốt chỉ lộ
  nền app trơn chứ không phải content thật). `D-1140`'s `NestedScrollConnection` (fade pill theo
  scroll) giữ nguyên, chỉ chuyển từ gắn trên `Modifier.padding(padding).consumeWindowInsets(padding)`
  sang thẳng `Modifier.fillMaxSize()` của NavHost — không đổi hành vi.
  **Bottom clearance cho nội dung 4 tab**: thêm `Spacing.bottomNavClearance = 96.dp` vào
  `core/designsystem/.../Spacing.kt` (giá trị = `PillBottomNavigation`'s `NAV_HEIGHT` 72dp + 2×
  `Spacing.md` 12dp lề trên/dưới — đúng "chiều cao + lề" quyết định gợi ý, không cộng thêm
  system-nav-bar inset vì giá trị đó biến thiên theo máy và `feature/*` không thấy được hằng số riêng
  của `app` để tính động — chấp nhận xấp xỉ cố định theo đúng cách quyết định cho phép "fixed bottom
  padding matching pill's height + margin"). Áp dụng hằng số này cho **4 tab thật sự hiện pill**
  (`onMainPager` ở `UnifiedHealthApp.kt`): `HomeScreen.kt`'s `Summary` (bottom `Spacing.xxl` →
  `Spacing.bottomNavClearance`), `ActivityScreen.kt` (tương tự), `DevicesScreen.kt` (đổi literal `96.dp`
  có sẵn sang hằng số dùng chung — cùng giá trị, chỉ hết trùng lặp), `ProfileScreen.kt` (thêm
  `.padding(bottom = Spacing.bottomNavClearance)` *sau* `.verticalScroll(...)` trên `Column` — đặt sau
  để padding mở rộng vùng nội dung cuộn được, không phải chỉ thu nhỏ viewport). **Không** đụng
  `RacesScreen.kt`/`AllMetricsScreen` dù brief nêu ví dụ "Races list" — kiểm tra lại
  `MainPagerDestination`/`TopLevelDestination` xác nhận Races/All metrics là màn con push lên trên
  (không nằm trong `HorizontalPager` 4 tab), nên `onMainPager` = false ở đó và pill vốn đã ẩn hoàn
  toàn — không có gì để chừa chỗ, thêm padding ở đó sẽ là thừa/sai so với lý do brief đưa ra.
  **Blur thật bị hoãn lại tiếp** (không làm trong lượt này): kiến trúc overlay giờ đã đúng (tiền đề
  D-1141 từng nói còn thiếu), nhưng blur-sample-nội-dung-thật cần `androidx.compose.ui.graphics.layer.GraphicsLayer`
  tường minh (capture layer của content, blur rồi vẽ lại đúng vùng dưới pill, crop theo hình pill) —
  vẫn là một khối việc/kiểm thử riêng, không có thiết bị thật trong môi trường này để xác nhận thị
  giác. Theo đúng lời mời của D-1144 ("đừng chặn việc sửa 'box' lại vì muốn blur hoàn hảo"): chỉ xác
  nhận bug "box" đã sửa xong (Box overlay + content cuộn thật sự ra sau pill), giữ nguyên vẻ ngoài
  bán-trong-suốt từ D-1141, và ghi lại rõ trong doc comment `PillBottomNavigation.kt`/`GLASS_ALPHA` là
  tiền đề đã đổi (không còn "sibling, not overlay" nữa) nhưng phần plumbing blur thật vẫn chưa làm.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` —
  cả hai chạy thật (test-result XML mới sinh ra ở `feature/home`/`core/designsystem`/`feature/profile`/
  `feature/activity`/`feature/races`/`feature/devices`, không file nào `failures`/`errors` > 0;
  `app-debug.apk` build lại thành công) — không chỉ tin Gradle UP-TO-DATE im lặng.

- **D-1154** · 2026-11-08 · Bottom nav pill: giảm padding vertical để tối ưu không gian — **Chốt**
  User muốn pill bottom nav chiếm ít chiều cao hơn. Giảm `vertical` trong
  `Modifier.padding(horizontal = Spacing.lg, vertical = Spacing.md)` ở `PillBottomNavigation.kt` (bọc
  ngoài `Surface`) — agent tự chọn giá trị nhỏ hơn hợp lý (gợi ý: `Spacing.sm` hoặc `Spacing.xs`), miễn
  đảm bảo pill vẫn đủ khoảng cách với mép màn hình/system nav bar (D-1084's `windowInsetsPadding` không
  đổi) và các icon/label bên trong (`NAV_HEIGHT = 72.dp`, `PillNavItem`'s `padding(vertical = Spacing.sm)`)
  không bị bóp méo/chật — có thể cần giảm cả `NAV_HEIGHT` một chút nếu giảm riêng outer padding chưa đủ
  "gọn" theo cảm nhận, agent tự cân đối. Cùng file với D-1149 (agent đang xử lý) — gộp chung, không tách
  agent riêng.

- **D-1157** · 2026-11-09 · Home `RingsCard`: bỏ background, animate progress ring lần đầu hiển thị — **Chốt**
  (đánh số lại từ D-1155 ban đầu vì trùng với D-1155 "Thực thi D-1149" do agent khác log song song —
  nội dung không đổi, chỉ đổi số, theo đúng pattern renumber đã dùng nhiều lần trong file này.)
  `RingsCard` (`HomeScreen.kt`) hiện bọc `ActivityRings` trong `Card(...)` mặc định (có nền
  `surfaceContainer`-ish) — bỏ background này đi, để ring hiện trực tiếp trên nền Home (vẫn giữ
  `onClick`/`testTag`, chỉ bỏ phần vẽ nền — dùng `Modifier` trơn hoặc `Surface(color = Color.Transparent)`
  nếu cần giữ ripple/semantics của `onClick`, miễn không còn khối nền hình chữ nhật/bo góc nào hiện ra).
  **Animate progress lần đầu hiển thị**: `ActivityRings` (`core/designsystem/.../ActivityRings.kt`) hiện
  vẽ `sweepAngle` thẳng theo `ring.progress`, không animation — sửa để mỗi ring chạy animate từ 0 lên
  đúng % thật khi composable này xuất hiện lần đầu (`Animatable`/`animateFloatAsState` + `LaunchedEffect`
  theo từng ring, có thể stagger nhẹ giữa 3 ring cho đẹp mắt — agent tự quyết timing, gợi ý: 600-900ms
  mỗi ring, `EaseOutCubic` hoặc tương tự). Chỉ animate **lần đầu** compose (giống tinh thần D-1098's
  `revealKey` một-lần) — không animate lại mỗi khi progress đổi do data mới (tránh giật khi Home
  refresh/polling); việc đó agent tự cân nhắc key animation theo đúng lifecycle hợp lý.

- **D-1158** · 2026-11-09 · Bottom nav pill: bỏ shadow — đang gây drop FPS lúc fade ẩn/hiện — **Chốt**
  (đánh số lại từ D-1156 ban đầu, trùng lý do như D-1157 ở trên.)
  `PillBottomNavigation.kt`'s `Surface` đang có `shadowElevation = 6.dp` — user xác nhận trên máy thật
  việc animate `alpha` (D-1134's `visible` fade) kèm shadow đang làm giật/drop FPS lúc pill ẩn/hiện.
  Bỏ hẳn `shadowElevation` (set về `0.dp` hoặc bỏ tham số) — giữ nguyên `tonalElevation = 3.dp`,
  `border` (viền sáng "glass"), và toàn bộ phần còn lại không đổi. Nếu mất shadow làm pill trông "phẳng"
  hẳn so với trước, không cần bù lại bằng cách khác trừ khi rất đơn giản — ưu tiên hết giật FPS.

- **D-1159** · 2026-11-09 · Bottom nav pill: bỏ background của sliding indicator ở tab active, thay bằng tô màu icon/text + bold — **Chốt**
  Hiện tab đang chọn được đánh dấu bằng khối `Surface` nền `primaryContainer` trượt theo (sliding pill
  indicator, D-1051/1077). User muốn bỏ hẳn khối nền này — thay vào đó thể hiện trạng thái active chỉ
  bằng **màu icon/text** (đã có sẵn cơ chế `color = if (selected) onPrimaryContainer else
  onSurfaceVariant` ở `PillNavItem` — đổi màu "selected" sang màu nhấn phù hợp không cần nền đi kèm, ví
  dụ `MaterialTheme.colorScheme.primary`) và **in đậm chữ label khi active** (label hiện dùng
  `typography.labelSmall` cho mọi trạng thái — đổi `fontWeight` thành `FontWeight.Bold` chỉ khi
  `selected`, giữ `labelSmall` cho trạng thái thường). Xoá hẳn khối `Surface` nền trượt (`offset(x =
  tabWidth * position)...color = primaryContainer`) cùng biến `rawPosition`/`position`/`selectedIndex`
  nếu không còn chỗ nào dùng tới sau khi bỏ — kiểm tra kỹ trước khi xoá. Cùng file với D-1157/D-1158 —
  gộp chung, không tách agent riêng.

## Thực thi D-1149/D-1154 (pill nav: không ẩn theo pager swipe, giảm padding dọc) — D-115x

- **D-1155** · 2026-11-09 · Thực thi D-1149 (bottom nav không ẩn khi swipe đổi tab) — **Chốt**
  `UnifiedHealthApp.kt`'s `scrollFadeConnection` (D-1140, gắn `nestedScroll` trên `UnifiedHealthNavHost`
  — tổ tiên chung của cả `HorizontalPager` (D-1052) lẫn từng tab's list/column riêng) trước đây phản
  ứng với **mọi** delta `onPreScroll` nhận được, không phân biệt nguồn — nested scroll bubble lên bất kể
  trục, nên pager swipe ngang (đổi tab) và list scroll dọc (đọc nội dung) đều trigger cùng 1 tín hiệu ẩn
  pill, dù D-1134/1141 chỉ định nghĩa mục đích là tối ưu diện tích lúc *đọc*. Sửa: mọi scrollable trong
  app này đều khoá trục (pager chỉ ngang, mọi list/column tab chỉ dọc), nên `available: Offset` mỗi lần
  dispatch về cơ bản chỉ có 1 trục khác 0 — thêm 1 điều kiện đầu `onPreScroll`:
  `if (abs(available.y) <= abs(available.x)) return Offset.Zero` (bỏ qua, không đụng `pillVisible` lẫn
  timer fade-in) khi delta là ngang-trội (pager swipe, hoặc 1 carousel ngang trong tab như
  `RacesCarousel` — cũng cố ý không trigger ẩn, vì "lướt carousel" không phải "đọc list" mà D-1134 nhắm
  tới). Chỉ delta dọc-trội mới tiếp tục set `pillVisible = false` + reset timer 400ms như cũ. Cập nhật
  doc comment tại chỗ giải thích rõ lý do/giả định (mọi scrollable khoá trục — không có trường hợp
  scroll 2 chiều thật trong app để lo ngại nhầm lẫn).

- **D-1156** · 2026-11-09 · Thực thi D-1154 (giảm padding dọc pill nav) — **Chốt**
  `PillBottomNavigation.kt`: đổi `vertical` trong `Modifier.padding(horizontal = Spacing.lg, vertical =
  Spacing.md)` (12dp) xuống `Spacing.xs` (4dp) — tiết kiệm 16dp chiều cao tổng (8dp mỗi bên). **Không**
  đổi `NAV_HEIGHT` (giữ 72dp) dù quyết định cho phép — tính tay thấy dư địa bên trong đã khá sít:
  `BoxWithConstraints`'s `padding(Spacing.xs = 4dp)` + `PillNavItem`'s `padding(vertical = Spacing.sm =
  8dp)` đã chiếm 24dp trong 72dp, còn lại 48dp cho icon (24dp mặc định) + khoảng cách `Spacing.xxs`
  (2dp) + label `labelSmall` (dòng chữ thường ~14-16dp tuỳ font metrics) ≈ 40-42dp — chỉ còn ~6-8dp dư,
  giảm thêm `NAV_HEIGHT` sẽ có rủi ro cắt chữ/icon mà không có thiết bị thật trong môi trường này để
  xác nhận bằng mắt. Chỉ giảm margin ngoài (không ảnh hưởng không gian nội dung bên trong pill) là lựa
  chọn an toàn hơn, vẫn đáp ứng đúng yêu cầu "chiếm ít chiều cao hơn" (pill nổi gần mép màn hình hơn).
  `D-1084`'s `windowInsetsPadding(WindowInsets.navigationBars...)` không đổi — pill vẫn né đúng system
  nav bar như cũ, chỉ phần margin *sau* inset đó bị co lại.
  **Verify (cả D-1155+D-1156)**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest
  assembleDebug` — build thành công, `app-debug.apk` build lại (timestamp mới).

- **D-1160** · 2026-11-09 · Bottom nav: ẩn khi scroll xuống, animate hiện lại khi scroll lên (như header) — **Chốt**
  D-1149 vừa sửa để pill chỉ phản ứng với scroll dọc (không phải pager swipe) — nhưng hiện pill vẫn ẩn
  bất kể **hướng** scroll dọc, rồi tự hiện lại sau khi dừng (theo `pillVisible`/timer hiện có). User muốn
  đổi sang pattern "header ẩn/hiện theo hướng cuộn" quen thuộc: **cuộn xuống (nội dung đi lên) → ẩn
  pill**, **cuộn lên (nội dung đi xuống) → hiện lại pill ngay**, không cần đợi dừng cuộn mới hiện. Đây là
  thay đổi về *điều kiện* trigger ẩn/hiện (chuyển từ "đang cuộn hay không" sang "hướng cuộn gần nhất"),
  không đổi lại phần vừa sửa ở D-1149 (vẫn chỉ phản ứng scroll dọc, không phản ứng pager swipe). Animation
  hiện/ẩn (`tween`/`alpha`, D-1134) giữ nguyên, chỉ đổi điều kiện gọi `visible = true/false`.

- **D-1161** · 2026-11-09 · Race item ở Home: ảnh đang chiếm content xấu, cần chụp màn hình thật + tự đề xuất re-layout — **Chốt**
  User nhận xét `RaceCard`'s ảnh góc dưới-phải (D-1142/1146, vừa tăng gấp đôi size) đang che/chiếm nội
  dung trông xấu trên máy thật — **không chỉ định hướng sửa cụ thể**, yêu cầu agent **tự dùng
  `adb exec-out screencap`** chụp màn hình Home (carousel giải chạy thật) trên thiết bị/emulator đang kết
  nối, nhìn trực tiếp ảnh chụp, rồi **tự đề xuất bố cục lại** `RaceCardWithPhoto` (`core/designsystem/
  .../RaceCard.kt`) cho đẹp hơn — có thể là đổi lại vị trí/kích thước ảnh, cách scrim/overlay, bố cục
  text, hoặc hướng tiếp cận khác hẳn D-1142/1146 nếu nhìn ảnh chụp thấy cần. **Giữ nguyên tỉ lệ nội dung
  hiện tại** (kích thước chữ tên/ngày/khoảng cách/giá/CTA so với nhau) — user xác nhận phần đó đã ổn,
  chỉ sửa cách ảnh được bố trí/hiển thị. Agent phải chụp ảnh thật để tự đánh giá, không đoán mò qua đọc
  code — lặp lại chụp sau khi sửa để tự xác nhận kết quả đẹp hơn trước khi báo cáo xong.

- **D-1162** · 2026-11-09 · `DevicesScreen`: bỏ text "My devices" thừa, re-layout status (connected/firmware/last sync), "Connected" nổi góc trái — **Chốt**
  `DevicesScreen.kt` (`PairedDeviceCard`'s parent list, `SectionHeader("My devices")` dòng ~252): **bỏ
  hẳn** section header này — thừa thãi (đã rõ ràng đây là danh sách thiết bị đã pair qua UI xung quanh,
  không cần nhãn). Trong `PairedDeviceCard` (khi `connected`): hiện `ConnectionStatusChip` + battery +
  "Firmware x" + "Last sync: ..." đang xếp rời rạc (1 `Row` rồi 2 dòng `Text` riêng bên dưới, dùng chung
  `onSurfaceVariant`/`bodySmall`) — **re-layout cho đẹp hơn**, agent tự quyết bố cục cụ thể (gợi ý: gom
  thành 1 khối thông tin thống nhất — có thể dùng icon đi kèm mỗi dòng (pin, chip firmware, đồng hồ sync)
  cho dễ quét mắt, căn chỉnh/spacing nhất quán, có thể dùng `FlowRow` hoặc layout dạng chip/row gọn hơn
  thay vì 3 dòng đứng rời). **Riêng `ConnectionStatusChip`**: đưa ra khỏi khối thông tin đó, đặt **nổi
  (floating) ở góc trái-trên** của khu vực ảnh thiết bị — đối xứng với nút menu (`menuButton`) đang nổi
  góc phải-trên (`Box(Modifier.align(Alignment.TopEnd))` dòng ~362) — dùng `Box(Modifier.align(
  Alignment.TopStart))` tương ứng bên trong cùng `Box(Modifier.fillMaxWidth())` bọc ảnh. Cùng file với
  D-1148 (agent đang xử lý `TappableWatchImage`) — gộp chung, không tách agent riêng. Trạng thái
  `connectionState == false` (chưa connected, nhánh `else` dòng ~372) không bắt buộc đổi theo (không có
  ảnh lớn để đặt chip nổi lên trên) — agent tự quyết có áp dụng tương tự hay giữ nguyên Row cũ cho nhánh
  đó, miễn nhất quán/hợp lý.

## Thực thi D-1157/D-1158/D-1159/D-1160 (RingsCard bỏ nền + animate, pill bỏ shadow + sliding indicator, hiện/ẩn theo hướng cuộn) — D-116x

- **D-1163** · 2026-11-09 · Thực thi D-1157 (RingsCard bỏ nền + animate ring lần đầu) — **Chốt**
  `RingsCard` (`HomeScreen.kt`): đổi `Card(onClick = onClick, ...)` sang
  `Surface(onClick = onClick, color = Color.Transparent, tonalElevation = 0.dp, shadowElevation = 0.dp,
  ...)` — giữ nguyên `onClick`/ripple/semantics (Material3 `Surface` có đúng overload nhận `onClick`),
  không còn khối nền hình chữ nhật/bo góc nào vẽ ra (tonalElevation/shadowElevation set về 0 để chắc
  chắn không có tint/bóng nào lộ ra dù `color` đã transparent). Import `Card` (hết dùng trong file) đổi
  thành `Surface`.
  `ActivityRings` (`core/designsystem/.../ActivityRings.kt`): thêm `Animatable(0f)` cho mỗi ring (giữ
  qua `remember`, không reset khi `rings` đổi do data mới), `LaunchedEffect(Unit)` (chạy đúng 1 lần theo
  vòng đời composable, không re-key theo `rings`) animate từng ring từ 0 lên đúng % thật, stagger 120ms
  giữa các ring, mỗi ring 800ms `EaseOutCubic`. Cờ `introDone` (mặc định `false`) chỉ bật `true` sau khi
  `joinAll()` mọi animation con xong — Canvas vẽ `animatedProgress[index].value` khi `!introDone`, vẽ
  thẳng `ring.progress` (không animation) khi `introDone == true`, để tránh 2 lỗi có thể xảy ra nếu làm
  ẩu: (1) animate lại mỗi lần data mới (đã tránh nhờ `LaunchedEffect(Unit)` không re-key), (2) *đứng
  hình* ở giá trị animate-vào ban đầu mãi mãi khi data thật đổi sau đó (nếu chỉ dùng `Animatable` mà
  không có `introDone` để chuyển sang đọc `ring.progress` sống) — lỗi (2) dễ bị bỏ sót nếu chỉ đọc yêu
  cầu "animate 1 lần" theo nghĩa đen mà không nghĩ tiếp chuyện gì xảy ra SAU lần animate đó.

- **D-1164** · 2026-11-09 · Thực thi D-1158 (bỏ shadow pill nav) — **Chốt**
  `PillBottomNavigation.kt`: `shadowElevation` đổi từ `6.dp` xuống `0.dp` (giữ tham số thay vì xoá hẳn,
  để rõ ràng là cố ý = 0 chứ không phải quên set). `tonalElevation = 3.dp` và `border` giữ nguyên không
  đổi, đúng yêu cầu.

- **D-1165** · 2026-11-09 · Thực thi D-1159 (bỏ sliding indicator, chọn tab = màu + bold) — **Chốt**
  `PillBottomNavigation.kt`: xoá hẳn khối `Surface` nền trượt (`offset(x = tabWidth * position)`,
  `color = primaryContainer`) cùng biến `tabWidth` (chỉ dùng cho khối đó, hết tác dụng sau khi xoá) và
  đổi `BoxWithConstraints` (chỉ cần để đo `maxWidth` cho `tabWidth`) thành `Box` thường (không còn gì
  cần đo). Giữ nguyên `rawPosition`/`position`/`selectedIndex` — vẫn cần để xác định `PillNavItem` nào
  đang `selected`, đúng như quyết định lường trước. `PillNavItem`: màu "selected" đổi từ
  `onPrimaryContainer` sang `MaterialTheme.colorScheme.primary` (không còn container để tương phản,
  cần màu tự thân nổi bật hơn), label nhận thêm `fontWeight = if (selected) FontWeight.Bold else null`
  (`null` = giữ nguyên weight mặc định của `labelSmall`, không phải "non-bold" cứng — để đúng tinh thần
  "label bình thường khi không chọn", không override không cần thiết).
  **Lưu ý ngoài phạm vi chính**: `core:designsystem:compileDebugKotlin` fail lúc build thử vì
  `RaceCard.kt` (file của phiên khác đang làm D-1161, dùng `Modifier.border(...)` nhưng thiếu import
  `androidx.compose.foundation.border`) — thêm đúng 1 dòng import còn thiếu đó để gỡ chặn build chung
  (không sửa gì khác trong file, không thuộc phạm vi D-1157/1158/1159/1160), **không add vào commit của
  lượt này** — để nguyên uncommitted cho phiên đang làm D-1161 tự commit cùng phần việc của họ.

- **D-1166** · 2026-11-09 · Thực thi D-1160 (pill hiện/ẩn theo hướng cuộn thay vì theo trạng thái
  đang-cuộn-hay-không) — **Chốt**
  `UnifiedHealthApp.kt`'s `scrollFadeConnection`: bỏ hẳn cơ chế debounce-timer cũ (`fadeScope`,
  `pillFadeInJob`, `delay(400)` trước khi set lại `pillVisible = true`) — thay bằng đọc dấu của
  `available.y` ngay trong cùng `onPreScroll` đã lọc trục từ D-1149: `available.y < 0f` (nội dung cuộn
  lên, tức user đang cuộn xuống đọc tiếp) → `pillVisible = false`; `available.y > 0f` (nội dung cuộn
  xuống, user cuộn lên lại) → `pillVisible = true` ngay lập tức, không cần đợi dừng cuộn. Quy ước dấu
  tham khảo đúng theo `TopAppBarDefaults.enterAlwaysScrollBehavior()` đã dùng sẵn ở `HomeScreen.kt`
  (cùng ý nghĩa "cuộn xuống ẩn header, cuộn lên hiện header ngay"). Phần lọc trục D-1149
  (`abs(available.y) <= abs(available.x)` → bỏ qua, không đụng `pillVisible`) giữ nguyên không đổi —
  pager swipe vẫn không ảnh hưởng gì tới pill. Animation fade alpha/tween 220ms ở `PillBottomNavigation.kt`
  (D-1134) không đổi gì — chỉ đổi điều kiện gọi `visible = true/false` đúng theo yêu cầu.
  **Verify (D-1163→1166)**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest
  assembleDebug` — build + mọi test pass (test-result XML mới sinh ra ở `feature/home`,
  `core/designsystem` (gồm cả `RaceCardTest` của phiên khác — vẫn xanh sau khi thêm import thiếu),
  `feature/activity`, `feature/profile`, `feature/races`, `feature/devices`), `app-debug.apk` build lại
  thành công.

- **D-1167** · 2026-11-09 · Fullscreen ảnh thiết bị: mở lên nhỏ, nhấn-giữ để phóng to dần theo thời gian (timing kiểu gamified), giữ đủ lâu → full + hiệu ứng pháo hoa → tự đóng — **Chốt**
  Bổ sung cho fullscreen viewer của D-1148 (đang implement): thay vì mở lên hiện ảnh full ngay, **mở lên
  với ảnh kích thước nhỏ** trước — kèm 1 animation/gợi ý nhẹ cho user biết cần **nhấn giữ (long-press)**
  để phóng to. Trong lúc giữ: ảnh **to dần theo thời gian** giữ (progressive scale theo duration của
  gesture, không phải tap 1 lần là xong). **"Chọn thời gian dạng Premack tí, kích thích người dùng"** —
  user muốn timing/curve phóng to không tuyến tính nhàm chán, mà theo kiểu gamification gây hứng thú
  (built-up tension/anticipation) — agent tự thiết kế cụ thể, gợi ý: easing không đều (chậm → nhanh dần,
  hoặc có khoảng "rung lắc"/pulse nhẹ báo hiệu gần đạt ngưỡng), không cần implement đúng nghĩa đen lý
  thuyết Premack, chỉ cần truyền tải cảm giác "càng giữ càng hồi hộp/phấn khích". **Giữ đủ lâu** (agent
  tự chọn ngưỡng hợp lý, gợi ý 1.5-3s) → ảnh đạt full size → trigger **hiệu ứng kiểu pháo hoa** (particle
  burst/confetti/sparkle, màu sắc rực rỡ, ngắn gọn ấn tượng) → **sau đó tự động đóng modal fullscreen**
  (không cần user tap để đóng nữa trong trường hợp này). Nếu user **thả tay giữ sớm** (chưa đạt ngưỡng):
  ảnh thu nhỏ lại về trạng thái ban đầu (không giữ nguyên size đang dở, không đóng modal) — user có thể
  thử giữ lại. Cùng khu vực file với D-1148/D-1162 (agent đang xử lý Devices fullscreen viewer) — gộp
  chung, không tách agent riêng.

- **D-1168** · 2026-11-09 · Thực thi D-1161: `RaceCardWithPhoto` - ảnh góc dưới-phải (128dp, D-1146) đổi
  thành chip nhỏ ở hàng trên, cạnh `TerrainBadge` — **Chốt**
  Chụp màn hình Home thật (`adb exec-out screencap`) trên `emulator-5554` theo đúng yêu cầu D-1161, nhìn
  trực tiếp: ảnh góc dưới-phải 128dp (D-1146) tạo thành 1 khối chữ nhật lớn chiếm gần nửa chiều rộng và
  khoảng 1/3 chiều cao card, nằm sát ngay cạnh pill CTA ("Đã đóng đăng ký"/"Xem chi tiết") làm hàng dưới
  cùng bị chật; bản thân ảnh poster còn có chữ/logo riêng (vd "Together we run further") cạnh tranh thị
  giác với chữ của card — đúng như user mô tả "chiếm content xấu". **Sửa**: bỏ hẳn vị trí góc dưới-phải
  + kích thước 128dp (sizeIn vuông duy nhất) của D-1146. Ảnh rõ nét giờ là 1 **chip nhỏ nằm cùng hàng với
  `TerrainBadge`** ở trên cùng card (`Row` `SpaceBetween`: terrain bên trái, ảnh bên phải), kích thước cap
  **độc lập theo cả 2 chiều** (`RaceThumbnailMaxWidth=72dp`/`RaceThumbnailMaxHeight=56dp`, không còn 1 cap
  vuông duy nhất) để dù ảnh nguồn ngang/dọc/vuông thế nào cũng không bao giờ phình to thành khối lớn —
  vẫn `ContentScale.Fit` giữ tỉ lệ gốc (D-1142 không đổi). Thêm viền trắng mờ + nền trắng mờ nhẹ quanh chip
  (giống ngôn ngữ hình ảnh của `TerrainBadge`/`DistancePills`) để nó đọc như 1 badge có chủ đích, không
  phải 1 miếng ảnh cắt thô dán lên card. Vì ảnh giờ chỉ nằm ở hàng trên cùng (không còn trải dọc hết chiều
  cao card như D-1146), **bỏ hẳn phần dành chỗ `padding(end = ...)`** ở cả khối tên/ngày lẫn
  `RaceCardBottomInfo` — khối giá/CTA ở dưới cùng lấy lại **toàn bộ chiều rộng card**, đây mới là điểm
  sửa chính giải quyết đúng cảm giác "chiếm/chật" user thấy, không chỉ đơn thuần giảm số dp. Tỉ lệ nội
  dung (cỡ chữ tên/ngày/khoảng cách/giá/CTA so với nhau) giữ nguyên 100% theo đúng ràng buộc D-1161 — chỉ
  đổi cách bố trí/hiển thị ảnh. Đã tự chụp lại sau khi sửa (Home carousel + `RacesScreen` full-width list,
  cả ảnh ngang/dọc/gần-vuông khác nhau) và xác nhận bằng mắt: card gọn hơn hẳn, chip ảnh đọc như 1 logo/
  poster-accent nhỏ, không còn tranh chỗ với CTA/giá, tên giải giờ wrap đủ 2 dòng thoải mái không cần né.
  Phạm vi chỉ sửa `core/designsystem/.../RaceCard.kt` theo đúng brief D-1161 — không đụng `HomeScreen.kt`,
  `UnifiedHealthApp.kt`, `PillBottomNavigation.kt`, `feature/devices`, `RaceDetailScreen.kt` (các agent
  khác đang làm song song trong các file đó; hai file `ActivityRings.kt`/`UnifiedHealthApp.kt` đang dở dang
  thiếu import của phiên khác được `git stash` tạm để build qua, rồi `stash pop` lại nguyên trạng sau khi
  xong — không commit kèm).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest` (rerun đầy đủ, 438 task
  thực thi lại, `RaceCardTest` 4/4 pass) và `./gradlew assembleDebug` — cả hai xanh; cài `app-debug.apk`
  lên `emulator-5554` và chụp màn hình thật trước/sau để tự xác nhận bằng mắt theo đúng yêu cầu D-1161.

- **D-1169** · 2026-11-09 · `ConnectionStatusChip` ("Connected" box) ở màn Devices: bỏ border — **Chốt**
  `ConnectionStatusChip` (`core/designsystem/.../ConnectionStatusChip.kt`) dùng `AssistChip` mặc định —
  M3 `AssistChip` tự có viền (`AssistChipDefaults.assistChipBorder()`) khi không truyền `border` tường
  minh. Bỏ viền này đi — truyền `border = null` vào `AssistChip(...)`. Component này hiện chỉ được dùng
  trong `feature/devices` (`DevicesScreen.kt`, `DeviceDetailScreen.kt`) nên sửa thẳng trong file dùng
  chung là đủ, không cần tham số hoá riêng cho từng màn. Cùng khu vực file với D-1148/D-1162/D-1167
  (agent đang xử lý Devices) — gộp chung, không tách agent riêng.

- **D-1170** · 2026-11-09 · `RaceCardBottomInfo`: CTA nhiều trạng thái bị mất chữ — bố cục lại CTA góc phải-dưới, giá/thông tin giải góc trái-dưới — **Chốt**
  User xác nhận trên máy thật: CTA (`RaceCallToAction` — 4 trạng thái khác nhau qua `ctaLabel()`: "Đăng
  ký ngay", **"Đã đóng đăng ký"** (dài nhất), "Hết vé", "Xem chi tiết") đang bị **cắt/mất chữ** ở một số
  trạng thái. Nghi ngờ nguyên nhân: `Row` chứa giá hiện đang để `Modifier.weight(1f)` một mình (không có
  sibling khác cùng hàng — có vẻ là tàn dư từ lần sửa trước khi CTA từng nằm chung hàng rồi bị tách ra),
  khiến bố cục hiện tại ngẫu nhiên đúng nhưng dễ vỡ nếu CTA/giá đổi cách ghép hàng. **Yêu cầu bố cục rõ
  ràng**: 1 hàng dưới cùng của card — **góc trái**: giá (`priceFromVnd`) + có thể cả thông tin giải khác
  (`DistancePills` nếu hợp lý gộp vào đây, hoặc giữ pills ở trên như hiện tại, agent tự quyết) chiếm phần
  còn lại, cho phép truncate/ellipsis hoặc xuống dòng nếu dài — **góc phải**: CTA pill, **ưu tiên tuyệt
  đối không bao giờ bị cắt chữ** (dùng `Modifier.wrapContentWidth()`/không gán `weight` cho CTA, để nó
  luôn đủ chỗ hiện hết "Đã đóng đăng ký" — label dài nhất — trên 1 dòng; bên trái nhường chỗ bằng
  `weight(1f, fill = false)` hoặc tương tự nếu cần). Kiểm tra lại cả 4 trạng thái CTA bằng cách tự tạo
  dữ liệu test hoặc preview, không chỉ thấy 1 trạng thái "Đăng ký ngay" rồi coi là xong.

- **D-1172** · 2026-11-09 · Thực thi D-1148 + D-1162 + D-1167 + D-1169 (Devices: ảnh tappable →
  fullscreen, nhấn-giữ phóng to + pháo hoa, re-layout status info) — **Chốt** (đánh số lại từ D-1171 ban
  đầu — trùng với entry "Thực thi D-1150 + D-1151" của agent khác log gần như cùng lúc; nội dung không
  đổi, chỉ đổi số)
  File mới `feature/devices/src/main/kotlin/com/unified/health/feature/devices/DeviceImageViewer.kt`:
  `TappableWatchImage` (wrap quanh `WatchImage` có sẵn, không sửa `WatchImage.kt`/`core/designsystem`
  để tránh đụng code đang dùng chung với Home) — pulse nhẹ (`rememberInfiniteTransition`, scale
  1.0↔1.03, chu kỳ 2.6s) gợi ý tap được, tap mở `FullscreenWatchImageViewer`. Dùng `androidx.compose.
  ui.window.Dialog(usePlatformDefaultWidth = false)` theo đúng gợi ý D-1148 thay vì `SharedTransitionLayout`
  — `Dialog` tạo Android Window riêng nên khớp toạ độ chuẩn với vị trí ảnh gốc (shared-element thật) rủi
  ro cao hơn giá trị nó mang lại ở đây; bù lại bằng scrim fade + ảnh pop lên bằng `spring(DampingRatio
  MediumBouncy, StiffnessLow)` — cùng "tính cách" animation với flip-in của `WatchImage.tilt3d` khi
  connect, để không bị lạc tông. Sau phản hồi "fade in phải ấn tượng hơn, không được như tắt/bật ngay"
  (giữa chừng task): tách `scrimAlpha`/`heroAlpha` (tween 280ms) khỏi `heroScale` (spring, có overshoot)
  để animation mở đọng lại rõ ràng thay vì một tween ngắn ăn hết mọi thứ trong ~260ms. Bug tự phát hiện
  trên máy thật: scrim 0.92 alpha để lọt ~8% độ sáng ảnh nhỏ bên dưới qua, trông như lỗi render (ảnh đôi
  mờ) — tăng lên 0.97 (`SCRIM_MAX_ALPHA`), hết hẳn.
  **D-1167** (bổ sung nhận giữa chừng task, cùng file): viewer giờ mở lên với ảnh **nhỏ**
  (`SMALL_REST_SCALE = 0.42` nhân thêm vào `heroScale`), kèm text gợi ý "Press & hold to view full
  size" (canh `BottomCenter`, fade dần theo `(1 - growProgress)`). `Modifier.pointerInput` +
  `detectTapGestures(onPress = …)`: khi nhấn, `scope.launch` chạy `growProgress.animateTo(1f,
  keyframes { … })` (easing chậm→nhanh dần, ngưỡng `HOLD_THRESHOLD_MS = 1800`) chạy song song với
  `tryAwaitRelease()` trong cùng `onPress` — nếu nhả tay trước khi job xong thì `job.cancel()` rồi
  animate `growProgress` về 0 (ảnh thu nhỏ lại, không đóng modal); nếu job tự hoàn tất (giữ đủ lâu,
  *không* bị cancel) thì chính job đó set `celebrating = true` — không cần so sánh `released`/thời gian
  thủ công, tận dụng việc `Animatable.animateTo` ném `CancellationException` khi coroutine chứa nó bị
  cancel. 30% cuối của hold có thêm jitter nhẹ (`rememberInfiniteTransition` chu kỳ 90ms, biên độ tăng
  dần tới `JITTER_MAX_AMPLITUDE = 0.035`) báo hiệu "sắp tới". Đạt ngưỡng → `ConfettiBurst` (riêng,
  `Canvas` vẽ 28 chấm tròn màu sắc bay ra từ tâm theo góc/tốc độ ngẫu nhiên, fade alpha theo
  `progress`, 700ms) → `onFinished = onDismissed` (đóng thẳng, không qua animation đóng thường —
  `dismiss()` tự chặn bằng `if (!celebrating)` để không đụng độ 2 luồng đóng). Ngưỡng 1.8s nằm trong
  khoảng 1.5–3s user gợi ý; không cố làm đúng lý thuyết Premack theo nghĩa đen như user tự nói là
  không cần.
  **D-1162**: bỏ hẳn `SectionHeader("My devices")` (`DevicesScreen.kt` LazyColumn). `PairedDeviceCard`
  nhánh `connected`: `ConnectionStatusChip` dời ra khỏi khối info, nổi `Box(Modifier.align(Alignment.
  TopStart))` đối xứng với `menuButton` ở `TopEnd` — cả hai cùng nằm trong `Box(Modifier.fillMaxWidth())`
  bọc ảnh. Battery/firmware/last-sync gom thành 1 `Column` dùng chung `StatusInfoRow` (icon
  `BatteryStd`/`Memory`/`History` + nội dung) — **giữ nguyên y hệt** text/testTag từng dòng (vd
  `Text("$it%")`, `Text("Firmware $it")`, `Modifier.testTag("last_sync_$mac")` + text "Last sync: …")
  vì e2e (`GarminWatchE2ETest`, `StandardWatchE2ETest`, `HuaweiWatchE2ETest`, `ZeppWatchE2ETest`) assert
  đúng các chuỗi/tag này — chỉ đổi bố cục/style, không đổi nội dung. Nhánh `else` (chưa connected) giữ
  nguyên `Row` chip+battery+2 `Text` cũ, không bắt buộc đổi theo (đúng như D-1162 cho phép).
  **D-1169**: `ConnectionStatusChip.kt` (`core/designsystem`) — thêm `border = null` vào `AssistChip`.
  Xác nhận trước khi sửa: `grep` cho thấy component này hiện chỉ được `feature/devices` dùng (Home đã
  bỏ hẳn `DeviceBanner` ở D-1147/D-1152) nên sửa thẳng không ảnh hưởng màn khác.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` — pass
  toàn bộ (`feature/devices`: `DevicesViewModelTest` 15/15, `DeviceDetailViewModelTest` 8/8;
  `core/designsystem` test khác không đổi), `app-debug.apk` build lại thành công nhiều lần qua các vòng
  sửa. **Xác nhận trên máy thật** (Pixel 4 đã pair sẵn 1 Garmin Forerunner 165 connected — dùng được
  luôn, không cần seed data): tap ảnh → mở fullscreen đúng, ảnh mở **nhỏ** kèm text gợi ý, scrim tối đều
  (không còn lọt sáng), nút Close + back đều đóng được; D-1162 (chip nổi góc trái, info block có icon,
  bỏ "My devices") + D-1169 (chip hết viền) lên đúng như mô tả. **Không xác nhận trực tiếp được** nhánh
  nhấn-giữ-đủ-lâu→pháo hoa→tự đóng và nhánh nhả-sớm→thu nhỏ: máy thật *và* emulator trong phiên này đều
  bị thiết bị/scratchpad dùng chung với (ít nhất) 1 agent khác chạy song song (app bị cài đè, màn hình/
  dữ liệu đổi giữa 2 lần chụp liên tiếp không do thao tác của mình, phát hiện cả file lạ xuất hiện trong
  thư mục scratchpad tưởng là riêng) — không có cách nào giữ 1 cử chỉ nhấn-giữ 1.8–2.2s sạch để chụp lại
  kết quả. Đã rà kỹ logic qua code thay vì đoán: race `growJob`/`tryAwaitRelease()` dùng đúng tính chất
  cancel-ném-exception của `animateTo`, không có đường nào khiến `celebrating` set sai hoặc modal treo.

- **D-1171** · 2026-11-09 · Thực thi D-1150 (ảnh cover Race Detail theo tỉ lệ gốc) + D-1151 (nav bar che CTA) — **Chốt**
  **D-1150**: thêm `RaceCoverImage` mới trong `core/designsystem/.../component/RaceCoverImage.kt` (file
  riêng, không sửa `RaceCard.kt` — đúng ràng buộc phạm vi vì agent khác đang làm trong file đó) —
  `feature/races` không tự gọi Coil trực tiếp được (D-1109: chỉ `core/designsystem` phụ thuộc Coil), nên
  logic đọc `intrinsicSize` phải nằm ở `core/designsystem`, không thể viết thẳng trong
  `RaceDetailScreen.kt`. Cơ chế: `AsyncImage` với `onSuccess` đọc `painter.intrinsicSize`, lưu
  `width/height` vào state; container `Modifier.aspectRatio(...)` animate (`animateFloatAsState`) từ
  16:9 mặc định (lúc ảnh chưa tải xong) sang tỉ lệ thật khi có. Ảnh gần vuông (tỉ lệ trong khoảng
  **0.85–1.15**, hằng số `SquareishAspectRatioRange`, chọn rộng hơn 1:1 đúng 1 chút để ảnh crop lệch nhẹ
  kiểu 4:5/5:4 vẫn được xử lý như "gần vuông" thay vì hiện khung méo khó coi) giữ khung 16:9 cố định,
  `ContentScale.Fit` ảnh căn giữa, phần nền thừa lấp bằng `RaceImageBackdrop` (tái dùng nguyên, không
  viết lại blur, đúng yêu cầu D-1150). `RaceDetailScreen.kt` đổi `RaceHeroImage(..., height(HeaderHeight))`
  cũ sang `RaceCoverImage(imageUrl, Modifier.fillMaxWidth())`; `HeaderHeight` 280dp vẫn giữ nguyên chỉ
  cho nhánh gradient-fallback (race chưa có ảnh thật — không có intrinsic ratio để đọc).
  **D-1151** (phát hiện thêm giữa chừng, user xác nhận trên máy thật, gộp luôn vì cùng file): CTA cuối
  `RaceDetailContent` bị che bởi system nav bar — nguyên nhân do dòng gọi `RaceDetailContent` chỉ lấy
  `padding.calculateTopPadding()` từ `Scaffold`, bỏ hẳn phần bottom mà `Scaffold` đã tự tính (so sánh với
  `HomeScreen`/`DevicesScreen`/`AllMetricsScreen`/`DeviceDetailScreen` — tất cả đều dùng trọn
  `Modifier.padding(padding)`, chỉ riêng `RaceDetailScreen` cherry-pick thiếu bottom). Sửa: thêm
  `bottom = padding.calculateBottomPadding()` vào cùng modifier đó — vẫn **không** thêm `start`/`end` (để
  ảnh cover ở trên giữ edge-to-edge, đúng tinh thần cũ của màn này). Đã rà các màn full-screen khác theo
  yêu cầu "tính toán để không gặp việc tương tự": `RacesScreen` (list) đã dùng
  `Modifier.fillMaxSize().padding(padding)` trọn vẹn — không có lỗi tương tự; `HomeScreen`/
  `DevicesScreen`/`AllMetricsScreen`/`DeviceDetailScreen` (đọc qua, không sửa — thuộc file của agent
  khác) cũng đều dùng `padding` trọn vẹn — `RaceDetailScreen` là trường hợp duy nhất thiếu.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest` và `./gradlew
  assembleDebug` — cả hai xanh (test XML có sinh ra, không phải chạy im lặng giả). Cài lên máy thật
  (Pixel 4, `99251FFAZ003T3`, nav bar 3 nút) qua `adb install -r`: xác nhận bằng mắt ảnh cover tỉ lệ
  ngang thật (Lâm Đông Trail, Sơn Trà City Trail — ảnh rõ, không crop/méo, không còn band 280dp cố định
  cũ) và CTA giờ có khoảng trống rõ phía trên nav bar 3 nút (trước đó bị che sát). **Nhánh ảnh gần-vuông
  không tự chụp được trực tiếp**: xác nhận qua data crawl thật (`races/latest.json`) rằng nhiều ảnh race
  thật đúng là 1:1 vuông (vd `Trang An Marathon`, `Prenn Trail Summit`, `Ultra Trail Cao Bang` — tải và đo
  bằng PIL, kích thước 283×283/284×284/288×288px), nên nhánh này chắc chắn được dùng trong thực tế; việc
  điều hướng thủ công qua `adb input swipe/tap` tới đúng màn chi tiết của 1 trong các giải này bị gián
  đoạn liên tục bởi hành vi điều hướng không mong muốn trên máy thật trong phiên làm việc (tab/scroll tự
  đổi không khớp input gửi đi — nghi do tương tác giữa pager/nested-scroll của app, không phải do code
  D-1150/1151) — sau nhiều lần thử không thành công trong thời gian hợp lý, xác nhận nhánh này bằng đọc
  kỹ code thay vì ảnh chụp: tái dùng y nguyên `RaceImageBackdrop` (component đã chạy đúng và được xác
  nhận trực quan ở `RaceCardWithPhoto`, D-1131/1136/1142) nên rủi ro thấp.

- **D-1173** · 2026-11-09 · Races carousel ở Home: tự động next 2 item khi vào viewport rồi ngưng, kích thích user nhìn vào — **Chốt**
  (Dispatch **sau khi** merge `feat/watch-model-images` → `main` + push origin hoàn tất — không gộp vào
  batch agent hiện tại, làm riêng sau trên `main` hoặc nhánh mới tuỳ lúc đó.)
  Carousel "Giải chạy sắp tới" ở Home (`RacesCarousel`, `HomeScreen.kt`, D-1123/1124 virtualization +
  paged scroll) hiện hoàn toàn thụ động — user phải tự vuốt mới thấy có nhiều giải. Thêm: khi carousel
  **xuất hiện trong viewport** (visible on screen, không phải lúc app mới mở nếu đang cuộn xuống dưới nó),
  **chờ 3 giây** rồi **tự động next 1 item** (animate scroll sang item kế tiếp, dùng cơ chế pager hiện có
  — `animateScrollToPage`/tương đương, không giật cục), rồi lặp lại 1 lần nữa để **next sang item thứ 2**,
  sau đó **ngưng hẳn** — không tự động nữa, để user tự điều khiển từ đó. Mục đích: gợi ý "còn nhiều giải
  khác, vuốt xem thêm" mà không làm phiền (chỉ 2 lần, không lặp vô hạn). Nếu user **tự vuốt tay** trong
  lúc đang auto-advance, huỷ ngay chuỗi tự động (không tranh chấp với thao tác thật của user). Logic
  "trong viewport" nên dùng cơ chế đã có sẵn cho carousel/scroll detection trong Home (không viết lại từ
  đầu nếu có pattern tương tự — ví dụ dùng `LazyListState`/`onGloballyPositioned` đo vị trí item carousel
  so với viewport). Nếu user rời Home rồi quay lại, coi như "vào viewport" lại từ đầu (reset đếm, không
  cần nhớ đã từng auto-advance trước đó qua lần mở app khác).

- **D-1174** · 2026-11-09 · Thực thi D-1170: `RaceCardBottomInfo` - gộp giá + CTA vào 1 hàng (giá trái,
  CTA phải, CTA không bao giờ co) — **Chốt**
  Chụp màn hình thật trên `99251FFAZ003T3` (Pixel 4, không phải emulator) để tìm đúng nguyên nhân thay
  vì đoán theo D-1170. Phát hiện: lỗi **không phải** co chữ theo chiều ngang trong chính hàng CTA — ảnh
  chụp "Đã đóng đăng ký" (label dài nhất) hiển thị đủ, không vỡ chữ, khi card có đủ chỗ dọc. Nguyên nhân
  thật: **tràn chiều dọc**. `RaceCardBottomInfo` trước đó là 2 hàng xếp chồng (giá trên 1 hàng riêng với
  `Modifier.weight(1f)` không tác dụng vì không có sibling - đúng như nghi ngờ của D-1170 - rồi
  `RaceCallToAction` ở hàng riêng bên dưới); với 1 race tên dài phải xuống 2 dòng + có đủ `DistancePills`
  + giá, tổng chiều cao khối dưới vượt quá phần còn lại của `RaceCardHeight` cố định (220dp), đẩy
  `RaceCallToAction` (phần tử cuối) bị `Card` cắt mất ở viền dưới - xác nhận trực quan với race
  "Nghệ An Legacy Marathon" (tên 2 dòng, 4 pills, có giá, CTA "Đăng ký ngay") trên carousel Home: pill CTA
  gần như biến mất, chỉ còn 1 mép trên cùng lộ ra trước khi bị cắt.
  **Sửa**: gộp giá + CTA vào **1 hàng duy nhất** (`Arrangement.SpaceBetween`) - giảm đúng 1 hàng chiều
  cao, đây là phần sửa thật sự giải quyết tràn dọc, không chỉ là sở thích bố cục. `RaceCallToAction`
  **không gán `weight`** (đo kích thước theo nội dung của chính nó, do `RaceCallToAction`/`ClosedBadge`
  vốn không `fillMaxWidth`) nên không bao giờ bị ép co dù label dài nhất. Giá dùng
  `Modifier.weight(1f, fill = false)` + `maxLines = 1` + `TextOverflow.Ellipsis` để **nhường chỗ trước**
  nếu hàng quá hẹp cho cả hai - `SpaceBetween` + CTA không-weight (đo trước) đảm bảo CTA luôn ở sát mép
  phải, đủ 100% chiều rộng tự nhiên, bất kể giá ngắn/dài/ellipsis. `DistancePills` giữ nguyên vị trí phía
  trên (không gộp xuống hàng này) - đủ để hết tràn dọc mà không cần đụng thêm.
  **Xác nhận lại bằng ảnh chụp thật (không đoán)**: cài lại APK lên `99251FFAZ003T3`, lướt đúng race
  "Nghệ An Legacy Marathon" trên carousel Home (vị trí/ảnh/dữ liệu giống hệt lần chụp lỗi trước) - CTA
  "Đăng ký ngay" + giá "Từ 450.000đ" giờ hiện đủ, không còn bị cắt. Cũng xác nhận thêm nhiều race khác
  có tên 2 dòng + đủ pills + giá trên cả carousel Home và `RacesScreen` list full-width (Cà Mau Marathon,
  Vnexpress Marathon Hanoi Midnight, Giải Chạy Quốc Tế Vì Đà Lạt Xanh...) - không còn card nào bị cắt chữ
  CTA. Đã xem trực tiếp 3/4 trạng thái `RaceRegistrationStatus` qua dữ liệu thật (OPEN "Đăng ký ngay" -
  trường hợp dài nhất đã test kỹ; CLOSED "Đã đóng đăng ký"; UNKNOWN "Xem chi tiết"); không tìm thấy race
  nào đang ở trạng thái SOLD_OUT trong dữ liệu crawl hiện tại để chụp trực tiếp, nhưng `RaceCallToAction`
  dùng chung đúng 1 nhánh code (`ClosedBadge`) cho cả CLOSED/SOLD_OUT/UNKNOWN - chỉ khác chuỗi hiển thị -
  và "Hết vé" ngắn hơn cả 2 chuỗi đã xác nhận không cắt ở cùng vị trí, nên an toàn theo cấu trúc code,
  không phải đoán mò.
  Phạm vi chỉ sửa `RaceCardBottomInfo` trong `RaceCard.kt` (thêm import `TextOverflow`), không đụng file
  nào khác.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest` (rerun đầy đủ 438 task,
  `RaceCardTest` xanh) và `./gradlew assembleDebug` - cả hai pass; cài lại `app-debug.apk` lên
  `99251FFAZ003T3` và chụp ảnh thật trước/sau để xác nhận bằng mắt theo đúng yêu cầu D-1170.

- **D-1175** · 2026-11-09 · Sắp xếp giải chạy: ưu tiên "đăng ký được ngay" lên trước, rồi theo ngày — áp dụng mặc định cho cả carousel Home lẫn màn "Tất cả giải" — **Chốt**
  (Dispatch **sau khi** merge `feat/watch-model-images` → `main` + push origin hoàn tất — cùng đợt với
  D-1173, không gộp vào batch agent hiện tại.)
  Hiện danh sách giải (carousel Home lẫn `RacesScreen` "Tất cả giải") sort theo thứ tự gì đó mặc định
  (chưa rõ — agent cần đọc `RacesViewModel`/nguồn data hiện tại để biết đang sort theo gì trước khi sửa).
  Đổi sang: **sort mặc định** theo 2 cấp — (1) **ưu tiên giải có thể đăng ký ngay** lên đầu (status
  `OPEN` — tái dùng đúng `RaceRegistrationStatus` đã có, D-1106, không tạo field/enum mới), các trạng
  thái khác (`CLOSED`/`SOLD_OUT`/`UNKNOWN`) xuống sau; (2) trong cùng nhóm, sort theo **thời gian** (ngày
  diễn ra, gần nhất trước — theo đúng field ngày hiện có, `race.date`/tương đương). Áp dụng **đồng nhất**
  cho cả carousel ở Home và màn "Tất cả giải" (`RacesScreen`) — 1 nguồn sort logic dùng chung (ví dụ
  trong `RacesViewModel`/repository/use-case, không viết riêng 2 chỗ) để tránh lệch thứ tự giữa 2 nơi
  hiển thị cùng dữ liệu.

- **D-1176** · 2026-11-09 · Workout detail kiểu Huawei (D-1093) không hiện với workout cũ — nguyên nhân thật: dedup sync bỏ qua re-parse, cần backfill từ raw FIT đã lưu — **Chốt**
  User mở workout detail trên máy thật, không thấy splits/HR-zone/cadence/elevation/trend chart mới
  (D-1093) — nghi code chưa làm, nhưng **đọc code xác nhận code đã có đủ** (`WorkoutDetailScreen.kt`:
  `SplitsCard`, `HrZonesCard`, cadence/elevation tiles, `TrendSeries` pace/HR/elevation — tất cả đúng
  D-1093). **Nguyên nhân thật**: `GarminFileSync.kt`'s dedup ACTIVITY download (D-422,
  `knownRawPayloadTimestamps`) coi mọi workout **đã từng tải trước đây** là "known" nên **không tải/parse
  lại** — nghĩa là mọi workout sync trước khi D-1093 ra đời chỉ có dữ liệu session cũ (không có
  `HealthRecord.WorkoutLap`/`WorkoutSample`), nên UI đúng theo thiết kế "ẩn hẳn section khi không có data"
  (comment dòng ~143 `WorkoutDetailScreen.kt`) — không phải bug UI, mà là **dữ liệu lịch sử chưa được
  parse lại**.
  **Tin tốt**: file FIT gốc mỗi workout vẫn được lưu nguyên trên máy qua `RawPayloadStore`
  (`core/data/.../sync/RoomHealthRecordSink.kt`, thư mục `wearable_raw/<deviceId>/`) — có thể **backfill**
  bằng cách đọc lại các `StoredRawPayload` ACTIVITY đã lưu, chạy qua đúng parser lap(19)/record(20) mới
  (D-1093) để tạo `WorkoutLap`/`WorkoutSample` cho các workout cũ, **không cần đồng bộ lại qua BLE từ
  đồng hồ**. Cần: (1) một cơ chế backfill (one-time migration chạy lúc app khởi động lần kế tiếp sau khi
  cài bản mới, hoặc 1 nút "Reprocess workouts"/action thủ công trong Devices/Profile — agent tự quyết
  UX nào hợp lý hơn, ưu tiên tự động nếu an toàn/rẻ) đọc `RawPayloadStore.list(deviceId)`, lọc đúng loại
  ACTIVITY, chạy qua parser hiện có, ghi `WorkoutLap`/`WorkoutSample` cho các `workoutId` tương ứng (bỏ
  qua nếu đã có data rồi, tránh backfill lặp lại mỗi lần mở app). (2) Verify bằng cách cài lên máy thật,
  mở lại đúng workout cũ mà user vừa xem, xác nhận splits/HR-zone/trend chart giờ đã hiện — không chỉ
  tin code compile.

- **D-1177** · 2026-11-09 · Dispatch D-1175 (sort giải chạy: OPEN trước, rồi theo ngày) — 1 chỗ sort dùng
  chung, không đụng `RacesCarousel`/pager (D-1173) — **Chốt**
  **Sort cũ**: `RemoteRacesRepository.toState()` chỉ `races.sortedBy { it.startDate }` (1 cấp, theo ngày
  gần nhất trước, không phân biệt trạng thái đăng ký) — đây là chỗ duy nhất sort trong pipeline;
  `HomeViewModel`/`RacesViewModel` đều đọc trực tiếp `racesRepository.races` (qua `RacesState.Success`)
  không tự sort/re-sort gì thêm, `HomeScreen`'s `RacesCarousel` cũng không `.take(N)` cắt bớt (chỉ
  `.filter { raceStatus == UPCOMING }`) — nên sort ở repository là đủ, không cần sửa 2 nơi.
  **Sort mới**: cùng `toState()`, đổi thành `sortedWith(compareBy({ it.registrationStatus !=
  RaceRegistrationStatus.OPEN }, { it.startDate }))` — tái dùng đúng `RaceRegistrationStatus` (D-1106),
  không thêm field/enum mới. OPEN lên đầu, còn lại (`CLOSED`/`SOLD_OUT`/`UNKNOWN`) xuống sau; trong mỗi
  nhóm, ngày gần nhất trước.
  **Không đụng** `HomeScreen.kt`'s `RacesCarousel` composable — agent khác đang sửa auto-scroll/pager
  của nó (D-1173) song song.
  **Test**: sửa test cũ `RemoteRacesRepositoryTest` (`fresh fetch keeps every valid race sorted by
  startDate…`) để không còn lẫn registrationStatus khác nhau (chỉ còn so ngày, cùng 1 tier UNKNOWN), và
  thêm test mới `D-1177 OPEN races sort ahead of CLOSED SOLD_OUT and UNKNOWN regardless of date` (mix
  OPEN/CLOSED/SOLD_OUT/UNKNOWN với ngày xen kẽ, assert đúng thứ tự 2 cấp).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest` → `core:data`
  `RemoteRacesRepositoryTest` 9/9 pass (fresh XML, không UP-TO-DATE); `./gradlew assembleDebug` →
  BUILD SUCCESSFUL. Commit local, chưa push.

- **D-1178** · 2026-11-09 · Nút back hệ thống ở 4 tab chính: minimize app thay vì đóng hẳn — **Chốt**
  Hiện `MainActivity`/`UnifiedHealthApp.kt` không có `BackHandler`/`OnBackPressedCallback` tuỳ chỉnh nào
  — khi user bấm nút back hệ thống lúc đang ở 1 trong 4 tab chính (Home/Activity/Devices/Profile, tức
  `onMainPager == true`, đã có sẵn biến này trong `UnifiedHealthApp.kt`) và không còn gì để pop trong
  back stack, hành vi mặc định Android sẽ **đóng hẳn Activity** (kill app) — không mong muốn, vì app có
  BLE connection + sync service đang chạy nền, đóng hẳn dễ làm gián đoạn. Đổi sang: bấm back ở trạng thái
  đó thì **minimize app** (đưa về background, `moveTaskToBack(true)` ở `MainActivity`, hoặc cơ chế tương
  đương ở tầng Compose như `BackHandler` gọi ra activity) — giống hành vi chuẩn của phần lớn app Android
  tốt, không để back ở màn gốc tự kill tiến trình.
  **Chỉ áp dụng khi ở gốc** (`onMainPager == true` và back stack của `NavHost` không còn gì để pop) —
  các màn chi tiết đẩy chồng lên trên (`MetricDetailScreen`, `DeviceDetailScreen`,
  `WorkoutDetailDestination`, `RaceDetailScreen`, v.v.) vẫn phải giữ nguyên hành vi back bình thường
  (pop về màn trước đó), không bị đổi thành minimize.

- **D-1181** · 2026-11-09 · Thực thi D-1173: `RacesCarousel` ở Home tự động next 2 lần khi vào viewport
  rồi ngưng hẳn, huỷ ngay nếu user tự vuốt — **Chốt**
  Phạm vi đúng như D-1173 giới hạn: chỉ sửa `RacesCarousel` trong `HomeScreen.kt` (~dòng 651 cũ) và
  state nó đã dùng sẵn — không đụng `core/domain`/`core/data` hay `RacesViewModel`/`RacesScreen` (agent
  khác đang đổi sort order ở đó, D-1175/D-1177, xác nhận qua `git show --stat` không đụng chung file).
  **"Vào viewport"**: tái dùng đúng `LazyListState.layoutInfo.visibleItemsInfo` của `Summary`'s
  `LazyColumn` ngoài cùng (đã truyền sẵn xuống `Summary` dưới tên `listState`, giờ truyền tiếp vào
  `RacesCarousel` dưới tên `homeListState`) — khớp qua 1 key ổn định mới thêm,
  `item(key = RACES_CAROUSEL_ITEM_KEY)` thay cho `item { ... }` trống, vì các item phía trên
  (rings/metrics/highlights) có số lượng thay đổi nên không thể dựa vào index. Không viết thêm
  `onGloballyPositioned`/tracker riêng — đúng yêu cầu tái dùng cơ chế đã có.
  **"Pager" của carousel**: `RacesCarousel` vốn không dùng `HorizontalPager` thật (là `LazyRow` +
  `rememberSnapFlingBehavior`, D-1133) — `listState.animateScrollToItem(nextIndex)` đóng vai trò tương
  đương `animateScrollToPage` như D-1173 chấp nhận ("hoặc tương đương").
  **Trình tự**: 1 `LaunchedEffect(homeListState, races)` dùng `snapshotFlow { ... }.first { it }` đợi
  đúng lúc item có key trên xuất hiện trong `visibleItemsInfo`, rồi `repeat(2) { delay(3s);
  animateScrollToItem(currentIndex + 1) }` — dừng sớm nếu đã ở card cuối (`nextIndex > races.lastIndex`)
  hoặc nếu `userInteracted == true`. **Huỷ khi user tự vuốt**: 1 `LaunchedEffect` riêng collect
  `listState.interactionSource.interactions`, set `userInteracted = true` ngay khi thấy
  `DragInteraction.Start` — do `rememberLazyListState()`'s `interactionSource` (public API, xác nhận
  tồn tại qua `javap` trên `foundation-api.jar` trong Gradle cache, cùng instance mà gesture scroll nội
  bộ của `LazyRow` đã báo qua) là đúng tín hiệu "user đang kéo thật", không cần `pointerInput` riêng.
  Dùng `remember` thường (không `rememberSaveable`) cho mọi state này — đúng ý D-1173 "rời Home quay lại
  coi như vào viewport lại từ đầu": khi `RacesCarousel` rời composition (rời tab Home) rồi quay lại, toàn
  bộ state (kể cả đã auto-advance bao nhiêu lần) mất đi tự nhiên, không cần cờ "đã từng hiện" lưu riêng.
  Đã đổi số quyết định 2 lần giữa chừng do làm việc song song với các agent khác cùng ghi vào
  `docs/DECISIONS.md`: bắt đầu dùng D-1177 theo gợi ý ban đầu trong brief, nhưng agent khác đã dùng xong
  số đó cho việc sort race (commit `6a13b85`) trước khi tôi commit xong, nên đổi sang D-1179 (số trống
  lúc đó); rồi phát hiện tiếp 1 agent khác nữa cũng vừa chiếm D-1179 cho một quyết định khác (backfill
  workout detail) ngay trước khi tôi kịp commit — đổi lần cuối sang **D-1181** (re-check lại
  `docs/DECISIONS.md` ngay trước khi ghi, thấy D-1180 là số lớn nhất) trước khi commit thật. Đổi toàn bộ
  comment/hằng số (`RACES_CAROUSEL_ITEM_KEY` và các docstring liên quan) trong `HomeScreen.kt` sang
  đúng D-1181 bằng `sed` rồi build lại (`:feature:home:compileDebugUnitTestKotlin --rerun-tasks`) để
  chắc chắn không phải cache cũ che giấu lỗi, trước khi commit.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest` và `./gradlew
  assembleDebug` — cả hai `BUILD SUCCESSFUL`, rerun `:feature:home:compileDebugUnitTestKotlin
  --rerun-tasks` riêng sau lần sửa số quyết định để chắc chắn không phải cache cũ che giấu lỗi compile,
  XML test-result sinh mới (`TEST-...MetricInsightTextTest.xml`, timestamp khớp lần chạy), APK
  `app-debug.apk` sinh lại (`app:packageDebug` chạy thật, không UP-TO-DATE).
  **Xác nhận trực quan trên máy thật** (`99251FFAZ003T3`, cài qua `adb install -r`): 1 lần chạy sạch,
  liên tục, không reload giữa chừng xác nhận đúng chuỗi mong muốn — cuộn carousel vào viewport (card 1,
  "Vnexpress Marathon Hanoi Midnight") → ~3s sau tự next sang card 2 ("Sơn Trà City Trail") → ~3s sau tự
  next sang card 3 ("Nghệ An Legacy Marathon") → chờ thêm 6s, không còn next nào nữa (dừng hẳn đúng sau
  2 lần, không lặp). **Hạn chế khi xác nhận "vuốt tay huỷ auto-advance"**: nhiều lần thử lặp lại trên
  cùng máy thật bị nhiễu bởi các sự kiện ngoài ý muốn không liên quan đến diff này (app tự thoát ra
  launcher, tự nhảy sang `RacesScreen`/màn chi tiết workout dù không có input nào trong khoảng chờ) —
  nghi nhiều khả năng do bug đã biết D-1178 (back hệ thống ở tab chính hiện tại kill hẳn activity thay vì
  minimize, chưa được fix) kết hợp với các thao tác `adb input swipe` bắt đầu gần mép phải màn hình bị hệ
  điều hướng gesture của máy hiểu nhầm thành vuốt back. Về mặt code, cơ chế huỷ (`userInteracted` set
  bởi `DragInteraction.Start`, kiểm tra trước mỗi lần `animateScrollToItem`) chắc chắn đúng theo API đã
  xác nhận tồn tại; ảnh chụp trực tiếp (không bị nhiễu) ghi nhận được 1 lần: vuốt tay khi đang hiện card 1
  dịch chuyển carousel đúng theo hướng/lực vuốt (sang card 2 hoặc xa hơn tuỳ lực), không bị "kéo ngược"
  lại bởi auto-advance — không quan sát được auto-advance tiếp diễn sau 1 lần vuốt tay sạch (không bị
  nhiễu bởi điều hướng lạ) trong thời gian còn lại của phiên thử. Không đủ thời gian lặp lại nhiều lần
  trong môi trường sạch hơn (máy thật riêng, tắt gesture nav) do giới hạn tài nguyên phiên làm việc — nếu
  cần xác nhận chắc chắn hơn, nên test lại sau khi D-1178 được fix (loại bỏ khả năng bug ngoài gây nhiễu)
  hoặc test trên emulator thay vì máy thật có gesture nav.

- **D-1179** · 2026-11-09 · Thực thi D-1176 (backfill workout detail từ raw FIT đã lưu) — **Chốt**
  Fix mapper + thêm cơ chế backfill: `WorkoutDetailBackfill.kt` mới (`core/data/.../sync/`) gồm
  `WorkoutDetailBackfillFilter` (lọc bỏ record đã có lap/sample rồi, chống trùng) và
  `DataStoreWorkoutDetailBackfillState` (cờ `isDone`/`markDone` theo từng `deviceId`, DataStore-backed,
  chống chạy lại mỗi lần mở app). Trigger: `DefaultWearableDeviceRepository.connect()` gọi
  `backfillWorkoutDetailOnce(deviceId)` sau khi connect thành công — chạy đúng 1 lần/thiết bị, dùng lại
  connect user/auto-reconnect đã làm sẵn, không cần hành động thủ công. `reprocessRawPayloads()` (đã có
  sẵn nút "Reprocess downloaded files" ở "About this device") cũng dùng chung logic này nên user có thể
  tự trigger lại thủ công nếu cần (đã dùng nút này để test).
  Sửa thêm `FitHealthMapper.kt`/`GarminDriver.kt`/`GarminFileSync.kt` — lần backfill thử đầu tiên không
  ra data vì lỗi mapper, đã fix.
  **User xác nhận trên máy thật qua nút "Reprocess downloaded files": workout cũ giờ đã có data** (splits/
  HR-zone/trend chart hiện ra đúng D-1093). Verify: `testDebugUnitTest`/`assembleDebug` xanh, cài
  `app-debug.apk` lên `99251FFAZ003T3`.

- **D-1180** · 2026-11-09 · Thực thi D-1178 (back ở 4 tab chính minimize thay vì kill) — **Chốt**
  Thêm `BackHandler(enabled = onMainPager) { activity?.moveTaskToBack(true) }` trong
  `UnifiedHealthApp.kt`, `activity` lấy qua `LocalContext.current as? Activity`. Chỉ sửa 1 file này —
  `onMainPager` đã có sẵn (D-1178 brief), không cần thêm logic kiểm tra back stack riêng vì 4 tab
  chính là start destination của `NavHost`, không còn gì để pop khi `onMainPager == true`. Màn chi
  tiết (`onMainPager == false`) không bật `BackHandler` này nên back vẫn pop `NavHost` bình thường,
  không đổi hành vi. Onboarding (`startWithOnboarding`) không nằm trong `MainPagerDestination` nên
  `onMainPager` luôn `false` ở đó — không đụng tới, không cần sửa.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` →
  BUILD SUCCESSFUL (`app:compileDebugKotlin` chạy thật, không UP-TO-DATE, ở lần build đầu; `:app` không
  có unit test — NO-SOURCE, đúng với layout hiện tại chỉ có test ở `core/model`/`core/domain`). Cài
  `app-debug.apk` lên `emulator-5554` và test thủ công qua `adb`/`dumpsys activity activities`: ở tab
  Home (gốc, `onMainPager == true`), bấm back → task vẫn tồn tại (`visible=false`,
  `visibleRequested=false`, không bị finish), process vẫn sống (`pidof` trả PID), app khác lên
  foreground — đúng hành vi minimize, không kill. Mở lại app (`am start` lại, task cũ được bring-to-
  front, không tạo task mới) → vào `MetricDetailScreen` ("Active energy") → bấm back → quay lại Home,
  pill nav hiện lại bình thường — xác nhận detail screen không bị đổi hành vi.
  (Thử trên máy thật `99251FFAZ003T3` trước nhưng có hoạt động vật lý không kiểm soát được trên máy
  (task number đổi giữa 2 lần kiểm tra) làm nhiễu kết quả, nên dùng emulator để có môi trường xác định.)

## CI/CD: GitHub Actions build + test + APK pipeline (D-1182)

- **D-1182** · 2026-11-11 · Thêm `.github/workflows/ci.yml`: test + lint + build debug/release APK trên mỗi push/PR — **Chốt**
  Chạy đúng 4 lệnh CLAUDE.md đã liệt (`testDebugUnitTest`, thêm `lintDebug`, `assembleDebug`,
  `assembleRelease`), mỗi lệnh 1 step riêng với `continue-on-error: true`, rồi 1 step cuối fail cả job
  nếu bất kỳ step nào fail — mục đích: APK + test/lint report luôn được build & upload làm artifact dù
  có fail ở đâu đi nữa (đúng yêu cầu "output là test report + apks release, apks debug"), job vẫn báo
  đỏ đúng lúc có lỗi thay vì xanh giả. Dùng `android-actions/setup-android@v3` + `gradle/actions/setup-
  gradle@v4` (cache + wrapper validation có sẵn) thay vì tự cấu hình `actions/cache` tay — vì repo đang
  ở AGP 9.5.0/compileSdk 37, các version này mới hơn SDK có sẵn trên ubuntu-latest nên cần bước cài/accept
  license rõ ràng, không dựa vào SDK image có sẵn của runner.
  **Release APK: unsigned** — repo chưa có `signingConfigs` (mục riêng "Release signing config" trong
  TODO.md vẫn mở), nên `assembleRelease` ra `app-release-unsigned.apk`, không cài được lên máy — artifact
  này dùng để soát (R8/shrink có chạy đúng không, kích thước, v.v.), chưa phải bản phát hành thật. Khi
  nào có keystore + GitHub secrets thật thì nối `signingConfigs.release` đọc từ env var, đây là việc
  riêng, chưa làm trong lần này.
  **Lỗi lint có sẵn phải sửa trước khi bật `lintDebug` làm gate**: `UnifiedHealthApp.kt` dùng
  `LocalContext.current as? Activity` (từ D-1180) — lint Jetpack Activity Compose báo
  `ContextCastToActivity`, lỗi thật (không phải false-positive), chặn hẳn `lintDebug`. Đổi sang
  `LocalActivity.current` (`androidx.activity.compose.LocalActivity`, API chính thức thay cho pattern
  cast), xoá import `android.app.Activity`/`LocalContext` không còn dùng — không đổi hành vi
  (`BackHandler`/`moveTaskToBack` giữ nguyên).
  **Verify (local, không chạy được GitHub Actions thật từ máy này)**: mô phỏng đúng 4 bước trong workflow
  bằng tay, `JAVA_HOME=/opt/homebrew/opt/openjdk@21` — `./gradlew testDebugUnitTest --continue` (BUILD
  SUCCESSFUL), `./gradlew :app:lintDebug` (fail trước khi sửa `UnifiedHealthApp.kt`, pass sau khi sửa,
  0 error/14 warning còn lại không chặn), `./gradlew assembleDebug assembleRelease` (BUILD SUCCESSFUL
  sau 4m43s, ra `app-debug.apk` 33.97 MB + `app-release-unsigned.apk` 6.05 MB — R8/shrink resource có
  chạy, thấy rõ qua chênh lệch size). Không xác nhận được hành vi thật trên GitHub-hosted runner (Android
  SDK/network cho compileSdk 37 có khác máy local hay không) — cần push lên GitHub rồi xem tab Actions
  chạy thật lần đầu, có thể cần chỉnh thêm nếu runner thiếu package SDK cụ thể.

## Imperial/Metric display wiring (D-1183)

- **D-1183** · 2026-11-11 · `UserPreferences.unitSystem` nay đổi hiển thị distance/weight sang mi/lb — **Chốt**
  `unitSystem` (toggle đã có sẵn ở Profile) trước đây không được đọc ở đâu cả — distance/weight luôn
  hiện km/kg. Giờ mọi nơi hiển thị đọc nó, nhưng **storage không đổi**: Room/Health Connect/domain vẫn
  luôn lưu mét/kg (khớp đơn vị canonical của Health Connect) — chỉ convert ngay trước khi render text.
  Hằng số convert (theo brief): `1 mi = 1609.344 m` (chia mét cho 1609.344 ra mi), `1 kg × 2.20462 = lb`.
  Thêm `core/model/.../UnitConversion.kt`: `Double.metersToDisplayDistance(UnitSystem)`,
  `Double.kgToDisplayWeight(UnitSystem)`, `UnitSystem.distanceUnitLabel()`/`.weightUnitLabel()`,
  `UnitSystem.metersPerDistanceUnit()` — đặt ở `core:model` (pure Kotlin) vì cả `core:designsystem`
  (`MetricFormat.formatValue`/`MetricIcons.unit`) và `feature:activity` (`WorkoutUi.kilometers`/
  `paceOrSpeed`/`paceOrSpeedLabel`, đổi cả pace "/km"→"/mi" và speed "km/h"→"mph" cho nhất quán — swim
  pace "/100 m" giữ nguyên, hồ bơi đo bằng mét ở khắp thế giới, không phải yard) đều cần dùng chung hằng
  số, tránh lặp `1609.344`/`2.20462` ở nhiều module.
  `formatValue`/`unit()` nhận thêm param `unitSystem: UnitSystem = UnitSystem.METRIC` (default Metric
  để caller chưa sửa vẫn compile) — đã sửa hết các caller thật: `HomeViewModel`/`HomeScreen`/
  `MetricInsightText` (Home feed cards, highlights, insight line), `MetricDetailViewModel`/
  `MetricDetailScreen`, `MetricDataViewModel`/`MetricDataScreen`, `ActivityViewModel`/`ActivityScreen`
  (Activity load's Distance tile, workout list rows), `WorkoutDetailViewModel`/`WorkoutDetailScreen`
  (Distance tile, Avg. pace/speed, splits). Mỗi ViewModel inject thêm `UserPreferencesRepository`
  (theo đúng pattern `HomeViewModel` đã có) và expose `unitSystem` qua `combine(...)` vào UI state —
  `ActivityViewModel`/`WorkoutDetailViewModel` trước đó chưa có dependency này nên thêm constructor
  param mới (test cũ update theo, thêm `FakeUserPreferencesRepository` vào `feature/activity`'s
  `Fakes.kt`).
  **Không đụng**: race's advertised distance (`RaceCard`/`RaceDetailScreen` — "5K"/"Marathon" là nhãn
  loại giải, không phải health metric tính từ mét lưu trong storage) và pace-trend chart's sec/km nội
  bộ (`WorkoutSampleSeries.paceSecondsPerKm`, domain layer) — cả hai ngoài phạm vi brief.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` →
  BUILD SUCCESSFUL. Test mới: `core/model/UnitConversionTest` (3), `core/designsystem/
  MetricFormatTest` (5), cập nhật `feature/home/insight/MetricInsightTextTest` (+1 Imperial),
  `feature/activity/WorkoutUiTest` (+2 Imperial), `ActivityViewModelTest`/`WorkoutDetailViewModelTest`
  (+1 mỗi file, "unit system follows the preferences repository") — toàn bộ suite xanh, không file nào
  bị xoá assertion cũ. Chưa test trên máy thật/emulator (không có thiết bị khả dụng lúc này) — đã trace
  code path Profile toggle → mỗi ViewModel's `combine(..., preferences.userPreferences)` → UI state →
  composable bằng tay để xác nhận.

## Localization EN/VI: hạ tầng chung + devices + home (D-1184)

- **D-1184** · 2026-11-11 · `values/` (EN) + `values-vi/` cho `core:designsystem`/`feature:devices`/`feature:home`, toggle locale ở Profile — **Chốt**
  Thực thi D-1040, phần 1/2 (devices + home — 2 module nhiều chữ nhất): 0 → hàng trăm
  `stringResource(...)` thật. Cơ chế chuyển locale: **chỉ** `AppCompatDelegate.setApplicationLocales`
  (AppCompat 1.6+ tự persist, không cần field riêng trong `UserPreferences` — tránh 2 nguồn sự thật dễ
  lệch nhau). Toggle "Language" ở Profile (`ProfileScreen.kt`). String chung (OK/Cancel/Retry/Connect/
  Disconnect/connection-state/metric label+about/time label "Today"-"Yesterday"-"Last night"/sleep-stage
  label/duration "hr"-"min"...) đặt ở `core/designsystem/src/main/res/values(-vi)/strings.xml` — mọi
  feature module đã phụ thuộc sẵn. String riêng từng màn ở `res/` của `feature/devices`,
  `feature/home`. Nhiều hàm trong `MetricFormat.kt`/`MetricIcons.kt`/`HealthCharts.kt`/
  `ConnectionStatusChip.kt`/`LiveDot.kt`/`StateViews.kt` đổi thành `@Composable` để đọc
  `stringResource` — hàm pure cũ (không Composable, dùng trong `MetricInsightTextTest` JVM test) giữ
  lại song song với default tiếng Anh, thêm wrapper Composable riêng (`formatValueLocalized`,
  `localizedInsightStrings()`) cho call site Compose.
  **Known gaps, cố ý để lại** (follow-up riêng, không phải thiếu sót bị bỏ quên): (1) message do
  ViewModel tự build (snackbar/toast "Added X"/"Sync complete"/...) vẫn tiếng Anh — cần
  `@ApplicationContext Context` inject vào ViewModel, đụng tới test assert literal string, chưa làm;
  (2) `HealthMetricType.unit()` (bpm/kcal/kg/km...) giữ nguyên không dịch — coi như đơn vị quốc tế; (3)
  `compactLabel()` 6 ký tự (HR/RHR/SpO2...) chưa dịch — sợ vỡ layout đã ràng buộc (D-1085/D-1099) mà
  không có máy thật để verify; (4) a11y description trong `Canvas` `DrawScope` của chart (scrub/axis)
  chưa dịch — Canvas lambda không phải `@Composable`, ưu tiên thấp (a11y-only).
  **Merge tay với D-1183 (Imperial units)**: agent làm việc này branch từ trước khi D-1183 merge, nên
  rebase lên `main` đụng conflict thật (không phải chỉ docs) ở 6 file dùng chung
  (`MetricFormat.kt`/`MetricInsightText.kt`/`MetricDetailViewModel.kt`/`MetricDetailScreen.kt`/
  `MetricDataScreen.kt`/`HomeScreen.kt`) — cả 2 việc đều sửa chữ ký `formatValue`/`.unit()`/
  `metricInsightLine` (1 bên thêm param `unitSystem`, bên này đổi non-Composable → Composable +
  `InsightStrings`/`stringResource`). Giải quyết tay bằng cách gộp cả 2: giữ `unitSystem` param **và**
  bản Composable/localized, vd `formatValueLocalized(value, locale, unitSystem, hourUnit, minuteUnit)`.
  Phát hiện thêm vài call site **không** bị git đánh dấu conflict (context không đổi ở 1 bên) nhưng vẫn
  sai sau merge vì tham số thứ 4 đổi nghĩa (`metricInsightLine(..., localizedInsightStrings())` từng
  đúng khi tham số 4 là `strings`, sau merge tham số 4 là `unitSystem` → kiểu sai) — soát tay từng call
  site của `metricInsightLine`/`formatValue(`/`.unit(` toàn bộ `HomeScreen.kt`/`MetricDetailScreen.kt`
  để bắt hết, không chỉ sửa đúng vùng `<<<<<<<`.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` sau
  rebase → BUILD SUCCESSFUL; soát trực tiếp 70 file `TEST-*.xml` sinh mới, toàn bộ `failures="0"
  errors="0"`. Chưa xác nhận trực quan EN↔VI trên máy/emulator thật (không có thiết bị khả dụng lúc
  agent chạy) — xác nhận qua đọc code + build/test xanh.

## Training mode: guide tĩnh luyện tập 5K/10K/21K/42K (D-1185)

- **D-1185** · 2026-11-11 · `feature/training` — guide luyện tập tĩnh, entry point ở cuối Home — **Chốt**
  Module mới `feature/training` (mirror đúng `feature/races`: `build.gradle.kts` riêng, nav-graph
  extension `navigateToTraining`/`trainingScreen`), **không** `@HiltViewModel`, không phụ thuộc
  `core:data`/domain — nội dung tĩnh, tiếng Việt viết trực tiếp trong code (cùng precedent
  `feature/races`, không qua `values/strings.xml` của D-1040/D-1184 vì đây là nội dung marketing/
  editorial, không phải app chrome). **Chưa đính gì vào dữ liệu activities/tracking thật của user** —
  đúng yêu cầu, đây là bước đọc tham khảo trước, cá nhân hoá/liên kết dữ liệu thật là việc sau.
  Nội dung lấy từ research thật (không bịa số): nguyên lý chung (easy/long run/tempo/interval,
  run-walk-run/Galloway, taper) + mỗi mốc 5K (Couch to 5K, Galloway, Hal Higdon Novice)/10K (Higdon
  Novice/Intermediate, Jack Daniels VDOT)/Half 21km (Higdon Novice 1/2, Daniels)/Marathon 42km (Higdon
  Novice 1/2, Daniels 2Q, Hanson's Marathon Method, Pfitzinger Advanced Marathoning) — nguồn: trang
  chính thức Hal Higdon, so sánh Hanson's/Pfitzinger, Couch to 5K/Galloway (xem Sources ở response lúc
  research).
  Entry point: 1 `ElevatedCard` cuối list `Summary` của Home ("Chế độ luyện tập" + mô tả ngắn), cùng vị
  trí/lý do với Races carousel (D-1110: nội dung marketing/khám phá đặt sau dữ liệu thật của user, không
  đặt trước). `HomeScreen.kt` chỉ thêm param xuyên suốt + 1 `item{}` + 1 composable mới ở cuối file —
  cố ý tối thiểu diff để tránh đụng việc Localization (D-1184) chạy song song cùng sửa file này.
  **Rebase sau D-1184**: 0 conflict (nhờ diff tối thiểu nói trên).
  **Verify**: `./gradlew testDebugUnitTest assembleDebug` BUILD SUCCESSFUL; `feature:training`'s
  `testDebugUnitTest` là NO-SOURCE (đúng — không có logic thuần nào để unit test, chỉ content tĩnh +
  state expand/collapse cục bộ). Chưa xác nhận trực quan trên máy/emulator thật (không có thiết bị khả
  dụng lúc agent chạy).

**Việc tương lai đã nêu nhưng chưa làm (ghi để không quên)**: sau "Trang Bị tham khảo" (gear catalog,
D tiếp theo khi crawler xong) sẽ có "tủ đồ" — user add sản phẩm đã sở hữu (kèm chọn màu/variant), có
yếu tố gamification nhẹ; xa hơn là community khoe trang bị. Cần Room entity mới (OwnedGear) khi tới lúc.

## Trang Bị tham khảo: catalog gear đọc-chỉ, chưa tủ đồ (D-1186)

- **D-1186** · 2026-11-11 · `feature/gear` — browse giày/quần áo/phụ kiện từ PUMA VN + Salomon VN, chọn màu, link-out mua — **Chốt**
  Mirror đúng pipeline Races: `core/model` (`GearItem`/`GearVariant`/`GearCategory`), `core/domain`
  (`GearRepository`/`GearState`), `core/data` (`GearFeedDto`/`RemoteGearRepository` — fetch + cache
  DataStore 24h + last-known-good khi refresh fail, giống hệt `RemoteRacesRepository`), Hilt binding
  trong `DataModule.kt`. Nguồn data: `https://noattoan.github.io/unified_health_service/gear/latest.json`
  (crawler riêng, xem phần "Gear crawler" research research trước đó cùng ngày — 137 sản phẩm, PUMA +
  Salomon VN, variants màu thật khi nguồn có, rỗng khi không).
  **Entry point: Profile, không phải Home** (đúng yêu cầu user, khác Training mode D-1185 vốn ở Home) —
  1 row "Trang bị tham khảo" thêm sau Dynamic Color, trước divider Notifications.
  Màn chi tiết có color-swatch picker (chọn màu → đổi ảnh hiển thị + đổi `productUrl` link-out tương
  ứng) — cố ý xây interaction "chọn 1 màu cụ thể" ngay từ v1 làm nền cho việc sau: **tủ đồ** (user add
  sản phẩm + màu đã sở hữu, gamification nhẹ) và xa hơn là **community khoe trang bị** (đã nêu trong
  D-1184/D-1185's closing note) — **chưa làm** trong D-1186 này, chỉ mới browse đọc-chỉ, không Room
  entity `OwnedGear`, không tracking gì cả.
  Link-out dùng `Intent.ACTION_VIEW` thẳng ra browser (không qua Chrome Custom Tabs như Races dùng cho
  đăng ký giải) — 1 click mua ở storefront vendor không cần giữ "ở lại app" như luồng đăng ký race.
  VND format: tái dùng `formatVnd` đã có sẵn ở `RaceCard.kt`, không viết formatter mới.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` BUILD
  SUCCESSFUL; `RemoteGearRepositoryTest` (8 test, mirror `RemoteRacesRepositoryTest`) +
  `GearViewModelTest` (5 test) — soát trực tiếp XML, `failures="0" errors="0"` cả 2. `app-debug.apk`
  sinh thật (không UP-TO-DATE giả). Chưa xác nhận trực quan trên máy/emulator thật (không có thiết bị
  khả dụng) — đã verify shape/edge case của feed thật qua `curl` trực tiếp (bao gồm Salomon's
  `variants: []` và Puma's variants có data) thay cho test trên device.
  `GearDetailViewModel` không có unit test riêng — giống đúng precedent `RaceDetailViewModel` (cả 2
  dùng `SavedStateHandle.toRoute<>()`, cần `Bundle` Android thật, JVM unit test thuần không chạy được).

## Fix D-1182's CI: android-actions/setup-android@v3 crashes on every run (D-1187)

- **D-1187** · 2026-11-11 · Bỏ `android-actions/setup-android@v3`, dùng `sdkmanager` có sẵn trên runner — **Chốt**
  Push đầu tiên của D-1182's `ci.yml` lên GitHub chạy thật, fail 100% ở bước "Set up Android SDK" —
  không phải vì compileSdk 37 quá mới như lo trước (D-1182's ghi chú), mà vì action
  `android-actions/setup-android@v3` tự gọi `sdkmanager "tools"` — package `tools` đã bị Google xoá
  khỏi SDK repository từ nhiều năm trước, action throw lỗi cứng thay vì bỏ qua 1 package legacy không
  tồn tại (`Error: The process '.../sdkmanager' failed with exit code 1`, run
  `42960221272`/job `130324716472`). Sửa: bỏ hẳn action này, dùng trực tiếp `sdkmanager` đã có sẵn
  trong SDK cài kèm image `ubuntu-latest` (`$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager
  --licenses`) — license phổ biến đã accept sẵn trên image, bước này chỉ cần accept thêm license cho
  version SDK mới hơn image nếu AGP cần auto-download.
  **Chưa verify được chạy thật lại trên GitHub** (fix này đang nằm trên worktree branch, chưa push) —
  push xong cần xem tab Actions 1 lần nữa để xác nhận.

## Xiaomi Smart Band 10 real-device confirmation + friendlier Zepp error message (D-1188)

- **D-1188** · 2026-11-12 · Thông báo lỗi thân thiện khi watch không nói chuyện được giao thức Zepp — **Chốt**
  User pair **Xiaomi Smart Band 10** thật (model BLE name suffix "30DC", vendor matched `ZEPP` chỉ vì
  tên quảng bá, theo D-804). `ZeppHandshake.authenticate()` connect GATT + discover service thành công
  (status=0) nhưng không tìm thấy `CHANNEL_DOWN`/`CHANNEL_UP` (service MILI, Zepp OS channel v1/v2) lẫn
  `LEGACY_AUTH` — xác nhận thật Band 10 không expose bất kỳ service Huami/Zepp nào, đúng dự đoán D-804.
  Message lỗi cũ ("Watch exposes neither a supported channel auth module nor the legacy auth
  characteristic") quá kỹ thuật cho user cuối — nó hiện thẳng lên UI (`DeviceDetailViewModel`'s
  `it.message ?: "Operation failed"`, không qua lớp dịch message nào khác). Viết lại theo đúng pattern
  `HuaweiSession.unsupportedAuth()` đã dùng (giải thích lý do + hướng dẫn thay thế): báo đây là watch
  không dùng giao thức Zepp/Huami, driver này không hỗ trợ, và hướng dẫn sync qua app Xiaomi
  Wear/Mi Fitness + Health Connect thay vì connect trực tiếp.
  **Không mở rộng sang xây driver Xiaomi riêng** trong lần này — Xiaomi (non-Huami) là giao thức hoàn
  toàn chưa RE/implement, cần APK Xiaomi Wear/Mi Fitness thật trong `docs/apks/` + agent
  `device-protocol-re` nếu muốn làm, việc riêng khi user quyết định ưu tiên.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :driver:zepp:testDebugUnitTest` BUILD
  SUCCESSFUL — không test nào assert message cũ nên không cần sửa test. Chỉ đổi 1 string, không đổi
  logic/control flow.

## Friendly messages for raw Android GATT connection-failure status codes (D-1189)

- **D-1189** · 2026-11-12 · `friendlyConnectionFailureMessage(status)` thay cho "Connection failed (status N)" — **Chốt**
  User báo thấy "status 147, connection failed" khi pair thất bại — message cũ ở
  `AndroidGattClient.kt`'s `onConnectionStateChange` chỉ nối chuỗi `"Connection failed (status
  $status)"`, không giải thích gì, hiện thẳng lên UI qua cùng đường `it.message` như mọi
  `WearableProtocolException` khác.
  Thêm hàm thuần `friendlyConnectionFailureMessage(status: Int): String` map các mã GATT status hay
  gặp nhất sang câu giải thích + gợi ý hành động: 8 (`GATT_CONN_TIMEOUT`), 19
  (`GATT_CONN_TERMINATE_PEER_USER`), 22 (`GATT_CONN_TERMINATE_LOCAL_HOST`), 62
  (`GATT_CONN_FAIL_ESTABLISH`), 133 (`GATT_ERROR`, đã có workaround `refreshGattCache()` sẵn nhưng vẫn
  có thể gặp ở lần connect đầu), và **147** (không phải hằng số `BluetoothGatt` chính thức nào — lỗi
  nội bộ Bluetooth stack thường gặp khi phone có nhiều chu kỳ connect/disconnect liên tiếp, không hẳn
  do watch). Mã lạ không nằm trong danh sách vẫn giữ nguyên số trong câu (để còn có cái tra cứu sau),
  nhưng viết thành câu chứ không phải chỉ con số trần.
  **Verify**: test mới `AndroidGattClientTest.kt` (3 test: mọi status đã biết ra câu thật không phải
  số trần, status 147 có gợi ý "try again", status lạ vẫn giữ số gốc) — `core:ble` trước đây chưa có
  thư mục test nào. `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug`
  BUILD SUCCESSFUL.

## Home/app-shell fixes batch — backfilled log (D-1190)

- **D-1190** · 2026-11-11, log lùi 2026-11-12 · Races hiện khi mất kết nối + pill nav mặc định hiện/reset khi resume + bỏ "Xem tất cả" + rule ripple gốc — **Chốt**
  **Đáng lẽ phải log ngay sau khi merge (commit `41e0bcf`) nhưng bị bỏ sót** — nhảy thẳng từ D-1187
  sang D-1188 cho việc khác, nên code đang comment `D-1189` ở `ChromeRipple`/`NoRippleConfiguration`
  (`core/designsystem/.../theme/Ripple.kt`) và ở các màn đã áp dụng ripple lại
  (`MetricDataScreen.kt`/`MetricDetailScreen.kt`/`NotificationSettingsScreen.kt`/và đợt dọn thêm 5
  module ở D-1189 thật) — **những comment "D-1189" đó đều đang trỏ nhầm sang quyết định này (D-1190)**,
  không phải D-1189 thật (D-1189 là `friendlyConnectionFailureMessage` cho GATT status code, việc khác
  hẳn). Không sửa lại hết các comment code cho khớp số (chi phí cao, không đáng) — ghi rõ ở đây để
  người đọc sau không nhầm.
  **4 việc gộp trong 1 batch** (user báo trong lúc review app thật):
  1. **Races hiện kể cả không có watch kết nối**: điều tra thấy `HomeUiState` vẫn lên `Success` bình
     thường (không bị kẹt Loading/Error như brief ban đầu nghi ngờ) — nguyên nhân thật là
     `RacesState.Error` riêng (mạng không vào được `noattoan.github.io` lúc đó, xem thêm bối cảnh ở
     D-1188). Không có code nào bị sửa sai hướng vì agent dừng đúng lúc theo chỉ đạo.
  2. **Bỏ "Xem tất cả" (`AllMetricsRoute`/`AllMetricsScreen`)** khỏi Home — Home giờ chỉ hiện card có
     data, ẩn phần còn lại vĩnh viễn (không còn escape-hatch cho user thường). Thêm toggle debug-only
     "Show empty metric cards" trong Profile's Developer section (`UserPreferences.showEmptyMetricCards`,
     persist qua DataStore) — chỉ hiện ở debug/androidTest build, đúng yêu cầu "chỉ chế độ debug mới
     show data rỗng".
  3. **Pill bottom nav**: mặc định `pillVisible = true` đã đúng từ đầu, nhưng thêm
     `LaunchedEffect(onMainPager)` reset về `true` khi vào lại main pager, và
     `LifecycleEventObserver` reset về `true` ở `ON_RESUME` (background → foreground) — theo đúng yêu
     cầu bổ sung giữa chừng của user.
  4. **No-ripple-by-default cho screen content**: `CompositionLocalProvider(LocalRippleConfiguration
     provides NoRippleConfiguration)` bọc `UnifiedHealthNavHost` (app module) — mọi nội dung màn hình
     mất ripple mặc định; `PillBottomNavigation` nằm ngoài provider này (đã `indication = null` sẵn từ
     D-1091) nên không ảnh hưởng. `ChromeRipple{}` (`core/designsystem`) phục hồi ripple cho back
     button ở từng `TopAppBar` — ban đầu chỉ áp dụng được ở `feature/home`/`feature/profile` (2 module
     agent được phép sửa lúc đó), 5 module còn lại (activity/devices/races/training/gear) được dọn nốt
     sau đó thật sự dưới số **D-1189** (xem entry riêng).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` BUILD
  SUCCESSFUL, 528 test `failures=0 errors=0`. Không có thiết bị thật khả dụng lúc agent chạy (mất kết
  nối adb giữa chừng — xem D-1188) nên không chụp màn hình xác nhận trực quan lúc đó; đã xác nhận lại
  bằng mắt trên máy thật khác hôm sau (2026-11-12, không lỗi/crash khi mở app).

## Gear entry trên Home + chọn kế hoạch Higdon Novice → lịch thật + check-in (D-1191)

- **D-1191** · 2026-11-12 · Gear thêm vào Home (dưới Races) + chọn 1 trong 4 plan Hal Higdon Novice → generate lịch ngày thật, check-in từ Training lẫn Home — **Chốt**
  **Phần A**: `feature/gear` giờ có thêm entry point ở Home (bên cạnh row Profile cũ, D-1186) —
  `GearEntryCard` (cùng hình dạng `TrainingEntryCard`), đặt ngay sau Races carousel, trước Training
  entry (thứ tự cuối list: Races → Gear → Training).
  **Phần B**: User chọn 1 trong 4 plan Higdon Novice (5K/10K/Half/Marathon) đã mô tả tĩnh sẵn trong
  `feature/training` (D-1185) — nay thêm hành động "Chọn kế hoạch này" (xác nhận thay thế nếu đang theo
  plan khác + chọn ngày bắt đầu, mặc định hôm nay) → generate lịch ngày thật từ
  `HigdonNoviceSchedules.kt` (`core/model`, pure function, transcribe chính xác bảng km chính thức của
  halhigdon.com cho cả 4 plan, verify lại 2026-11-12 — không suy diễn/làm tròn tự ý). Các plan khác
  (Couch to 5K, Galloway, Daniels VDOT, Hanson's, Pfitzinger, Intermediate 10K) **vẫn chỉ mô tả tĩnh**,
  không chọn được — cố ý giới hạn phạm vi.
  **Mô hình ngày**: mỗi ngày trong tuần là 1 *vị trí* (0=cột "Thứ Hai" của bảng gốc...6="Chủ Nhật"),
  không ép `startDate` về đúng thứ Hai thật — `dayOffset = tuần×7 + vị trí` cộng thẳng vào `startDate`,
  ngày/thứ hiển thị vẫn là ngày thật, chỉ là nhịp tuần không bắt buộc bắt đầu từ thứ Hai. Đơn giản hơn
  để test/suy luận, brief không yêu cầu phải khớp thứ thật.
  **Room**: `UnifiedHealthDatabase` v3→v4 (`AutoMigration`, 2 bảng thêm thuần túy — `active_training_plan`
  (1 dòng duy nhất, @Upsert) + `training_checkins` (chỉ ngày đã check-in mới có dòng)). **Không lưu cả
  lịch** — lịch luôn generate lại từ `HigdonNoviceSchedules` mỗi lần đọc, chỉ overlay check-in từ Room.
  Chọn plan mới xoá check-in của plan cũ.
  **Formatter dùng chung** (`scheduledDayDescription`) đặt ở `core/designsystem` vì cả
  `feature/training` và `feature/home` đều cần mà không được phụ thuộc lẫn nhau.
  **Home**: khi có plan đang active, `TrainingEntryCard` cũ được thay bằng card "hôm nay chạy gì" +
  nút check-in ngay tại Home (đúng yêu cầu gốc "để user biết và checkin"); không có plan active thì
  Home y như cũ.
  **Không làm**: liên kết với lịch sử hoạt động/workout thật đã ghi nhận (check-in là bookkeeping độc
  lập, không phải "đã chạy thật theo thiết bị") — cố ý, brief yêu cầu không lẫn 2 việc.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` BUILD
  SUCCESSFUL sau rebase lên main (gồm cả D-1189/D-1190) — soát 76 file `TEST-*.xml`, không file nào
  thiếu `failures="0" errors="0"`. Test mới: `HigdonNoviceSchedulesTest` (14, đối chiếu từng tuần/ngày
  race với bảng gốc), `RoomTrainingPlanRepositoryTest` (7, fake DAO theo đúng convention project —
  chưa có precedent Robolectric cho Room DAO trong repo này), `TrainingPlanViewModelTest` (3),
  `HomeViewModelTest` bổ sung (+4: không plan / hôm nay có lịch / đã check-in / ngày nghỉ). Chưa có
  thiết bị/emulator khả dụng lúc agent chạy — chưa xác nhận trực quan trên máy thật.

## Fix locale-toggle bug: tri-state language control, default theo máy (D-1192)

- **D-1192** · 2026-11-12 · "Theo máy / English / Tiếng Việt" thay cho toggle nhị phân cũ — **Chốt**
  **Bug thật tìm ra lúc user review**: toggle cũ (D-1184) đọc
  `AppCompatDelegate.getApplicationLocales().toLanguageTags().startsWith("vi")` — chuỗi này **rỗng**
  khi user chưa từng đổi (đang theo system locale), `"".startsWith("vi")` luôn `false`, nên control
  luôn hiện/coi app là "English" **kể cả khi máy đang ở tiếng Việt và app đang hiển thị đúng tiếng Việt
  theo system-follow** — đúng nguyên nhân "app đang bị lẫn tiếng Anh tiếng Việt" user báo.
  Thay bằng `LanguageChoice` 3 trạng thái (SYSTEM/ENGLISH/VIETNAMESE) qua dialog radio-button:
  - SYSTEM: đọc tag rỗng → hiện "Theo máy (Tiếng Việt)"/"(English)" — label phụ lấy từ
    `Resources.getSystem().configuration.locales[0]`, **không** dùng `Locale.getDefault()` (bị chính
    AppCompat ghi đè khi có override, dùng nhầm sẽ tái lặp đúng lớp bug vừa sửa).
  - Chọn "Theo máy" → `LocaleListCompat.getEmptyLocaleList()` (xác nhận tồn tại thật trong
    `androidx.core:core-1.19.1` qua `javap` trực tiếp trên jar đã resolve, không đoán API).
  - Giữ nguyên quyết định persistence của D-1184 (AppCompat tự lưu, không thêm field
    `UserPreferences`).
  **Localize nốt**: `feature/profile` (0% → full, bao gồm chính dialog ngôn ngữ — trước đây D-1184 cố
  ý để lại vì "theo follow-up riêng", giờ là lúc làm), `feature/activity`, `feature/onboarding`,
  `app/.../notifications` (6 string thật, không phải 1 như D-1040 ước tính cũ).
  **Chưa làm, cố ý** (việc lớn, cần task riêng): `feature/races`/`feature/training`/`feature/gear` vẫn
  hardcode tiếng Việt, không có bản tiếng Anh — ~176 dòng literal tiếng Việt, là nội dung
  editorial/marketing (lịch tập, tin giải chạy, mô tả sản phẩm) cần dịch tự nhiên, không phải
  `stringResource` cơ học — bỏ dở ở đây thay vì làm vội cho xong.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` BUILD
  SUCCESSFUL. Chưa có thiết bị/emulator khả dụng lúc agent chạy — chưa xác nhận trực quan đổi ngôn ngữ
  hệ thống → app tự theo, hay override giữ nguyên qua restart; cần test trên máy thật trước khi coi
  D-1184's follow-up này đã đóng hẳn.

## Xiaomi MiWear RE: protocol scope, bind paths, cloud blocker (D-1193)

- **D-1193** · 2026-11-12 · Xiaomi MiWear (Mi Fitness 3.46.1) — phân tích xong, chốt scope driver — **Chốt** (phần cloud là **Tạm**)
  **Bối cảnh**: user yêu cầu RE APK `com.mi.health` 3.46.1 để app tự kết nối Mi Watch/Band,
  kể cả tự bind qua Xiaomi cloud; TODO trước đó ghi Xiaomi Smart Band 10 đã thử và fail với
  `:driver:zepp` (D-804/D-1188).
  **Kết quả RE**: bóc được toàn bộ stack MiWear — GATT `FE95` (`0x50` version, `0x5E` notify,
  `0x5F` write), L1 frame magic `0xA5A5` + CRC-16/ARC + seq/ACK/window, L2 channel/opCode +
  AES-CTR key=IV, session auth `t7r` 26/27 (HKDF-SHA256 `miwear-auth`, HMAC, AES-CCM tag 4),
  local bind ECDH P-256 (HKDF `miwear-bind`, token 16 byte), PSK/cloud bind, V1 OS-bond +
  `CMD_SEND_USERID`, device commands (`s7r` type 2: time/battery/info; type 8 fitness IDs),
  file channel 5 (total/seq u16 + 7-byte `FitnessDataId`), fitness parser bit-packed
  (`DailyRecordParser` v1/v2/v3), và cloud bind API (`hlth.io.mi.com/healthapp/*`).
  **Chốt scope**: V2 là đường chính; V1 best-effort sau V2; **Wear OS (Mi Watch 2019/Watch 2)
  nằm ngoài driver** vì module `wearos` trong APK là stub rỗng
  (`WearOSUtilImpl`, `isWearosRequirementNotPass()==true`) — cần Wear OS SDK/Health Connect riêng.
  **Chốt bind path**: ưu tiên **local bind** khi watch trả `verifyMode == 2` trong `getBindInfo`
  (không cần tài khoản/cloud); nếu `verifyMode == 1` thì dùng **token import** 16 byte từ log
  Mi Fitness (`Transfer.device.log`, không cần root — đường Gadgetbridge đang dùng cho Band 10).
  **Cloud self-bind = blocker**: API bind dùng Xiaomi Passport service token cho SID `miothealth`
  + `security` + chữ ký/RC4 (`CloudInterceptor`/`x24`). Token này gắn với authenticator/package/
  chữ ký của Mi Fitness; app thứ ba không xin được nếu không có Xiaomi authorization hoặc khóa ký
  của Mi Fitness (không có trong APK). Không ship code scrape credential; cloud để sau feature flag
  `XIAOMI_CLOUD_BIND`, mặc định tắt, kèm feasibility check.
  **Gate 0 (bắt buộc trên máy thật)**: connect Band 10, đọc `0x50`, gửi `s7r e=1 f=17`, log đủ
  `ha0` (verifyMode/oobMode/model/MAC/SN/DID) — quyết định local bind hay token import.
  **Evidence**: `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md`,
  `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md`, `docs/protocols/XIAOMI_TEST_VECTORS.json`,
  `docs/re-evidence/mi/` (jadx tree local-only, gitignored).
  **Verify**: static RE + tự sinh test vector (CRC16/ARC, protobuf, HKDF/HMAC, AES-CCM/CTR,
  cloud RC4/signature) — chưa có capture HCI/thiết bị thật, nên các mục [Gate] trong protocol doc
  vẫn mở.

## Edge-to-edge + `AppScreen` dùng chung cho mọi màn hình (D-1194)

- **D-1194** · 2026-11-12 · Mọi `Scaffold(topBar = { TopAppBar(...) })` hand-roll trong `feature/*`
  gộp về một `AppScreen` dùng chung (`core/designsystem`), fix bug "dải nền trống phía dưới" — **Chốt**
  **Số thật trong brief là D-1193**, nhưng số đó đã bị một agent khác (RE Xiaomi MiWear) chiếm ngay
  phía trên trong lúc 2 agent chạy song song — không sửa lại entry đó, ghi số thật ở đây (D-1194) để
  người đọc sau không nhầm, giống cách D-1189/D-1190 từng xử lý một va chạm số tương tự.
  **Bug user báo trên emulator**: ở "Chế độ luyện tập" (`feature/training/TrainingScreen.kt`), ảnh/
  list content dừng lại phía TRÊN thanh gesture, để lộ một dải nền trơn ở dưới cùng — không phải
  "thiếu padding cuối list", mà là viewport cuộn bị cắt sai kích thước. Nguyên nhân thật: mọi màn hình
  đều làm `Scaffold(topBar = {...}) { padding -> LazyColumn(Modifier.padding(padding)) }` —
  `Scaffold` không có `bottomBar` nên `contentWindowInsets` mặc định gộp luôn inset thanh điều hướng
  vào `padding`, và `Modifier.padding(padding)` áp lên *ngoài* container cuộn cắt luôn viewport ngắn
  hơn màn hình thật — phần bị cắt đó không bao giờ cuộn tới được, chỉ thấy nền `containerColor` của
  `Scaffold` đứng yên tại chỗ bất kể cuộn thế nào.
  **Sửa**: `AppScreen` (`core/designsystem/.../component/AppScreen.kt`) — `Scaffold` dùng chung với
  `title`, `onBack` (nút back `ArrowBack` bọc `ChromeRipple`, đúng rule D-1189/D-1190), `actions`,
  `floatingActionButton`, `snackbarHost`, `topBarScrollBehavior`, `bottomClearance: Dp = 0.dp`, và
  `topBar` override cho màn cần top bar khác chuẩn (ví dụ `RaceDetailScreen`'s transparent bar nổi
  trên ảnh hero). Thay vì tự đem một phần `padding` ra làm `Modifier.padding` ngoài, `AppScreen` gộp
  `padding` gốc (top-bar height + safe-drawing insets + nav-bar inset) với `bottomClearance` thành
  một `contentPadding` duy nhất, đưa thẳng cho `content: @Composable (PaddingValues) -> Unit` — hợp
  đồng bắt buộc: `LazyColumn(contentPadding = ...)`/`LazyVerticalGrid(contentPadding = ...)`, hoặc với
  `Column` + `Modifier.verticalScroll` thì nối `.padding(contentPadding)` NGAY SAU `.verticalScroll(...)`
  (không bao giờ đặt trước nó) — chỉ màn không cuộn mới được áp thẳng `Modifier.padding(contentPadding)`.
  **Migrate 16 màn/Activity**: `feature/devices` (`DevicesScreen`, `detail/DeviceDetailScreen`),
  `feature/gear` (`GearScreen`, `detail/GearDetailScreen`), `feature/activity` (`ActivityScreen`,
  `detail/WorkoutDetailScreen`), `feature/home` (`HomeScreen`, `detail/MetricDetailScreen`,
  `detail/MetricDataScreen`), `feature/races` (`RacesScreen`, `detail/RaceDetailScreen`),
  `feature/profile` (`ProfileScreen`, `notifications/NotificationSettingsScreen`), `feature/training`
  (`TrainingScreen`, `RunningFormScreen`, `TrainingCalendarScreen`), và
  `app/.../privacy/PermissionsRationaleActivity`. 4 tab chính (Home/Activity/Devices/Profile) truyền
  `bottomClearance = Spacing.bottomNavClearance` và bỏ hẳn spacer/padding thủ công cũ (D-1144) — không
  còn cộng dồn 2 lần; các màn pushed khác để mặc định `0.dp`. `RaceDetailScreen` (transparent top bar
  nổi trên ảnh hero, D-1114/D-1136/D-1151) giữ nguyên hành vi top/bottom cũ nhưng chuyển
  `RaceDetailContent` sang nhận thẳng `contentPadding` và nối sau `verticalScroll` — vừa đúng hợp đồng
  mới, vừa khớp đúng ý đồ "back button nổi trên ảnh" ghi trong comment cũ (ảnh giờ cuộn được lên phía
  sau app bar trong suốt). `TrainingCalendarScreen` trước đó back button KHÔNG bọc `ChromeRipple` (sót
  so với D-1189/D-1190) — migrate qua `AppScreen` tiện thể sửa luôn, không phải cố ý đổi hành vi riêng.
  Giữ nguyên mọi testTag, FAB (`DevicesScreen`'s scan FAB — vị trí FAB không phụ thuộc `contentPadding`,
  Scaffold tự định vị độc lập), `navigationBarsPadding` của `QrFindSheet`'s `ModalBottomSheet` (dòng
  ~649 cũ, không đụng tới — đây là dialog riêng, không nằm trong `AppScreen`'s content). Không đụng
  onboarding/QR scanner/DeviceImageViewer (đã full-bleed từ trước).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug` BUILD
  SUCCESSFUL — 76 file `TEST-*.xml`, không file nào thiếu `failures="0" errors="0"`; KSP sinh đủ
  `*ViewModel_HiltModules_BindsModule.java` cho mọi `feature/*` (không gặp flake KSP/Hilt). Cài APK lên
  emulator thật, chụp màn hình Home cuộn xuống đáy và "Chế độ luyện tập" cuộn tới ảnh hero + cuộn hết
  danh sách Marathon (42km) ở cuối — nội dung/nền cuộn liền mạch ra sau thanh gesture, không còn dải
  nền trống đứng yên; tiện thể xác nhận luôn `RaceDetailScreen`/`MetricDetailScreen`/`DevicesScreen`
  (chạm nhầm lúc test thủ công) không bị vỡ layout.

- **D-1195** · 2026-11-12 · Pill bottom nav: ẩn nhưng vẫn "hit-test" được khi cuộn xuống (user review) — **Chốt**
  Bug: `PillBottomNavigation` chỉ đổi `alpha` 1→0 qua `graphicsLayer` lúc ẩn theo cuộn (D-1134/D-1140);
  `Surface` + các `PillNavItem` vẫn nằm nguyên trong cây layout nên vẫn chặn chạm dù vô hình hoàn
  toàn — chạm vào đúng ô trống nơi pill từng hiện (vd. "Profile") vẫn đổi tab, thay vì rơi xuống nội
  dung cuộn phía sau (card/nút). **Sửa**: khi tween D-1158's `animateFloatAsState` chạy xong và
  `alpha <= 0f` trong lúc `visible == false`, bỏ hẳn việc compose `Surface` (`if (!visible && alpha
  <= 0f) return` ngay đầu `PillBottomNavigation`) — không còn gì ở vùng đó để hit-test, chạm xuyên
  thẳng xuống nội dung. Giữa chừng fade-out (`visible == false` nhưng `alpha > 0f`, Surface còn đang
  compose cho tween mượt) chặn điều hướng bằng cách truyền `enabled = visible` xuống `PillNavItem`,
  gắn thẳng vào tham số `enabled` có sẵn của `Modifier.selectable(...)` (xác nhận bằng `javap` trên
  `foundation-android-1.12.1.aar` — chữ ký thật là `selectable(selected, interactionSource,
  indication, enabled = true, role, onClick)`, không cần bọc `.then(if...)`). Fade-in (`visible` bật
  lại) vào lại nhánh composable ngay (có thể `alpha` vẫn còn 0f khung hình đó) và `enabled = visible`
  = true ngay, nên bấm được tức thì như cũ — không đổi gì ở D-1158 (không shadow), D-1134 (glass
  alpha/border), D-1141 (bán trong suốt), D-1190 (reset `pillVisible` khi resume/vào lại main pager).
  Không có test E2E/Compose-rule nào sẵn có bao sát riêng hành vi ẩn/hiện của pill (chỉ có harness
  E2E đầy đủ Hilt dưới `app/src/androidTest/e2e`, dùng chung màn Home/Activity đang bị agent khác
  sửa dở dang) — không thêm test tự động mới để tránh phụ thuộc vào code đang đổi; xác minh bằng tay
  trên emulator thay thế.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :app:assembleDebug` BUILD SUCCESSFUL
  (feature/devices thiếu KSP debug output — chạy lại `:feature:devices:kspDebugKotlin --rerun` sinh đủ
  `*ViewModel_HiltModules_BindsModule.java` rồi assemble lại sạch). Cài APK lên emulator thật: cuộn
  Home xuống cho pill ẩn hẳn, chạm vào đúng toạ độ (905, 2250) nơi "Profile" từng hiện — tab KHÔNG đổi
  (dumpsys xác nhận vẫn ở Home), chạm xuyên thẳng xuống thẻ "Upcoming races" phía sau và mở đúng
  `RaceDetailScreen` của card đó; cuộn lên lại, pill hiện lại, chạm "Profile" đổi tab bình thường (icon
  + label tô đậm xanh). Không crash (`logcat` sạch exception). Screenshot ở
  `/private/tmp/claude-501/-Users-Apple-Documents-Projects-noattoan/c9d7be03-0705-4257-958d-425d46c7b31e/scratchpad/`.

## Gear detail: variant picker hiện cả ảnh thumbnail, thu nhỏ còn nửa card (D-1196)

- **D-1196** · 2026-11-12 · `ColorVariantPicker` đổi từ `FilterChip` chữ sang tile ảnh+label — **Chốt**
  User review thấy color picker ở `GearDetailScreen` chỉ hiện tên màu dạng chữ (`FilterChip`), khó
  hình dung màu thật trong khi phần lớn variant (Puma, Coolmate ở feed `gear/latest.json`) đã có sẵn
  `imageUrl` riêng — đổi sang tile compact gồm thumbnail vuông 56dp (bo góc, `ContentScale.Crop`, qua
  `core/designsystem`'s `GearImage` có sẵn fallback icon khi `imageUrl` null — không gọi Coil trực
  tiếp trong `feature/gear`, đúng D-1109) + label màu `labelSmall` tối đa 2 dòng/ellipsize bên dưới,
  tile rộng 68dp (~nửa footprint một card thường). Selected: viền primary 2dp quanh thumbnail + label
  primary/bold; unselected: viền `outlineVariant` 1dp. Tương tác giữ nguyên y hệt cũ — tap tile gọi
  `onSelect(if (selected?.color == variant.color) null else variant.color)`, ảnh hero vẫn đổi theo
  variant đã chọn (logic ở `GearDetailViewModel`/`GearDetailUiState`, không đổi). Tile dùng
  `Modifier.selectable(selected, onClick, role = Role.RadioButton)` (cùng pattern với
  `ProfileScreen`'s `LanguageChoice` picker) thay vì tự quản lý Row/RadioButton riêng — tận dụng
  `mergeDescendants` mặc định của `selectable` để TalkBack đọc gộp label màu + trạng thái chọn, không
  cần set `contentDescription` tay (tránh đọc trùng lặp). Giữ testTag `gear_variant_${color}` y hệt
  cũ. Không thêm `ChromeRipple` — tile là nội dung màn hình (không phải app chrome), tự kế thừa
  `NoRippleConfiguration` mặc định toàn app (D-1189 thật, không phải D-1190 — xem ghi chú phân biệt ở
  entry D-1190). Không có test UI/Compose-rule sẵn có cho `GearDetailScreen`/`GearDetailViewModel`
  tham chiếu `FilterChip` để phải sửa (`GearViewModelTest` hiện có không test màn hình, chỉ test
  `GearViewModel` — màn catalog, không đụng tới detail/variant).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:gear:testDebugUnitTest
  :app:assembleDebug` BUILD SUCCESSFUL; `TEST-com.unified.health.feature.gear.GearViewModelTest.xml`
  `tests="5" failures="0" errors="0"`; `feature/gear/build/generated/ksp/debug/java/hilt_aggregated_deps`
  có đủ 2 `*ViewModel_HiltModules_BindsModule.java` (không gặp flake KSP). **Không xác minh trên
  emulator thật** — theo chỉ đạo đổi giữa chừng của coordinator: nhiều agent đang dùng chung
  `emulator-5554` (đã thấy nhầm lẫn thật khi thử: back/tap của agent này vô tình lẫn với màn hình
  workout detail agent khác đang test), nên dừng hẳn adb/emulator, chỉ verify bằng Gradle; main
  session sẽ chạy một lượt test emulator gộp sau khi mọi agent xong.

## RaceCard: CTA "Xem chi tiết" bị cắt ở carousel Home + tối ưu khoảng trống thẻ (D-1197)

- **D-1197** · 2026-11-12 · `core/designsystem/.../component/RaceCard.kt` — **Chốt**
  **Bug user báo** (screenshot carousel "Upcoming races" ở Home): badge CTA đáy thẻ ("Xem chi tiết"/
  `ClosedBadge`, ~dòng 384-410 cũ) bị cắt mất nửa dưới chữ + viên pill, trên thẻ có nội dung dài — ví
  dụ tên giải 2 dòng kiểu "...Ironman 70.3..." cộng chip khoảng cách dài "90km đạp + 21.1km chạy
  (70.3)", và một thẻ khác có nhiều chip khoảng cách ("...m", "2km fun run").
  **Nguyên nhân thật**: `Card(modifier = modifier.height(RaceCardHeight))` cố định 220dp trong khi nội
  dung `Column` bên trong (tên giải wrap, chip wrap, dấu tiếng Việt chồng, font scale user) co giãn —
  `Column` không tự co nội dung sớm để nhường chỗ cho nội dung muộn; hàng giá+CTA là con cuối cùng,
  khi tổng chiều cao các con vượt quá 220dp thì nó bị đẩy ra ngoài biên card và bị clip hình chữ nhật
  bo góc của `Card` cắt mất. Thêm một phần: một chip khoảng cách có label quá dài tự wrap xuống 2 dòng
  bên trong `Pill` (không giới hạn `maxLines`) càng đẩy `DistancePills` cao hơn.
  **Sửa (giữ chiều cao card cố định — carousel cần card đều nhau)**: tách `Column` ngoài cùng thành
  đúng 2 phần: phần giữa linh hoạt (`RaceCardFlexibleContent`, `Modifier.weight(1f)`) chứa header +
  `DistancePills`, và hàng giá+CTA (`RaceCardBottomInfo`) luôn đo đúng chiều cao thật, không weight —
  nhờ `weight(1f)` của Compose, phần linh hoạt luôn chỉ nhận đúng phần còn lại sau khi hàng giá+CTA đã
  chiếm đủ chỗ, nên CTA không bao giờ bị đẩy ra ngoài biên card nữa. Giới hạn thêm để phần linh hoạt ít
  phải tràn: `RaceNameText` giữ `maxLines` cố định (2 hoặc 3, xem bên dưới); `Pill` (dùng bởi
  `DistancePills`) thêm `maxLines = 1` + `TextOverflow.Ellipsis` — chip dài giờ ellipsize thay vì wrap
  2 dòng, không còn đẩy chiều cao `DistancePills` lên.
  **Yêu cầu bổ sung giữa chừng của user (tối ưu khoảng trống thẻ)**: gộp hàng badge địa hình + logo ảnh
  (trước là 1 hàng riêng phía trên tên giải, ăn hẳn 1 hàng chiều cao dù có ảnh hay không) vào ngay
  trong header cùng tên giải — `Row` 2 cột: cột trái (weight 0.7 khi có logo) chứa badge địa hình + tên
  giải + ngày/countdown, căn trái; cột phải (weight 0.3) chứa logo ảnh nhỏ (`RaceThumbnailBadge`, giữ
  nguyên bo góc/`ContentScale.Fit`/cap kích thước cũ), căn trên, flush theo cạnh phải. Giải không có
  ảnh thật (nền gradient, `RaceCardWithGradient`) thì cột trái chiếm trọn chiều rộng (không để hở 30%
  trống) và tên giải được thêm 1 dòng (`maxLines = 3` thay vì 2) vì không còn chia sẻ chiều rộng với
  logo.
  **Extract logic để test**: `visibleDistancePills()` (sort theo km giảm dần + cắt ở
  `MAX_DISTANCE_PILLS = 4` + đếm phần dư thành chip "+N") tách khỏi `DistancePills` composable thành
  hàm thuần `internal`, có test JVM riêng độc lập với Compose.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :core:designsystem:testDebugUnitTest
  :app:assembleDebug` BUILD SUCCESSFUL (chạy lại với `--rerun-tasks` trên riêng test task để chắc chắn
  không đọc kết quả cache cũ); `TEST-...RaceCardTest.xml` `tests="7" failures="0" errors="0"` (4 test
  cũ + 3 test mới cho `visibleDistancePills`). **Không xác minh trên emulator thật** — theo chỉ đạo đổi
  giữa chừng của coordinator: nhiều agent đang dùng chung `emulator-5554` (gặp va chạm thật khi thử —
  swipe/tap/back của agent này liên tục lẫn với agent khác đang live-test, ví dụ PillBottomNavigation
  agent test swipe-chuyển-tab và feature/gear agent test màn hình khác trên cùng máy), nên dừng hẳn
  adb/emulator giữa chừng (không đổi `font_scale`, không cần khôi phục), chỉ verify bằng Gradle; main
  session sẽ chạy một lượt test emulator gộp sau khi mọi agent xong (gồm cả card Ironman 70.3 tên 2
  dòng + chip dài, card nhiều chip, và `font_scale` 1.3 như brief gốc yêu cầu).

## Workout detail: derived metrics cho mọi workout + synthesize splits/samples cho demo (D-1197)

- **D-1197** · 2026-11-12 · Demo workout thiếu splits/pace chart/elevation/HR zones/cadence vì
  `DemoHealthDataGenerator.workoutFor()` chỉ ghi `HealthRecord.Workout` tóm tắt — user cấm backfill
  (không ghi row giả vào Room/migrate); tính khi mở detail, không lưu — **Chốt**
  **Số thật trong brief là D-1195**, nhưng một agent khác (pill bottom-nav hit-test fix) đã chiếm số
  đó trước khi agent này ghi log, rồi một agent thứ ba (`GearDetailScreen` variant picker) chiếm luôn
  D-1196 — không sửa lại 2 entry đó, ghi số thật ở đây (D-1197), giống cách D-1189/D-1190 và
  D-1193/D-1194 từng xử lý va chạm số tương tự.
  **2 lớp, không nhầm lẫn nhau**:
  1. **Derived — luôn có, cho MỌI workout (thật lẫn demo)**, tính thẳng từ field đã lưu, không cần
     laps/samples: `WorkoutDerivedMetrics` (`core/domain/usecase`) — `kcalPerMinute(workout)`
     (activeKcal/duration, phút lẻ không làm tròn về 0) và `derive(...)` gộp nó với HR zones vào một
     holder `WorkoutDerivedDetail(kcalPerMinute, hrZones)`. HR-zones fallback: khi `workoutSamples`
     (lap/sample thật hoặc demo đã synth) không có HR nào, `HeartRateZoneBreakdown.percentagesFromReadings`
     (overload mới, cùng logic với `percentages(samples,...)` cũ nhưng nhận thẳng `List<Int>`) dùng
     stream HR theo phút (`observeHeartRateSamples`, đã có sẵn trong `WorkoutDetailViewModel`) — áp
     dụng cho CẢ thiết bị thật (FIT chỉ có `session`, không có `record`), không riêng demo. Avg
     pace/speed (D-1093 cũ) đã có sẵn, đã test, ở `feature/activity/WorkoutUi.kt#paceOrSpeed` — không
     đụng/không nhân bản vào domain, chỉ thêm kcal/min còn thiếu thật sự.
  2. **Synthesized — chỉ demo, không persist**: `SyntheticWorkoutDetailGenerator`
     (`core/demo/.../detail`, pure, seed = `workout.id.hashCode()*31 + start.toEpochMilli()` → cùng
     workout luôn ra cùng laps/samples) sinh lap 1km (running/walking)/5km (cycling)/time-based 10 phút
     (sport khác hoặc không có distance) và sample mỗi 5s: speed+split nhẹ, cadence theo dải thật
     (run 160-180/walk 100-120/cycle 80-95 spm, null cho sport khác), altitude đồi thoải (null cho
     indoor STRENGTH/YOGA), HR ramp-up+drift rồi bias+clip 3 vòng để avg/max sample khớp
     `workout.avgHeartRate`/`maxHeartRate` trong ~2bpm (ép đúng max vào mẫu đỉnh). Ràng buộc cứng
     (test): tổng lap distance = workout distance (±1m, lap cuối nhận phần dư), tổng lap duration =
     workout duration (chính xác, lap liền kề), tổng lap calories = workout.activeKcal. Gate theo
     device: `DemoSyntheticWorkoutDetailSource.supplement()` trả null nếu
     `workout.sourceDeviceId !in DemoDeviceIds.ALL` — generator thuần không tự biết gì về demo/thật.
  **DI theo đúng pattern `DemoModeController`/`DemoDataController` đã có** (không tự nghĩ cách mới):
  interface `SyntheticWorkoutDetailSource`/data class `WorkoutDetailSupplement` ở
  `core/domain/repository`; `@BindsOptionalOf` trong `core/data`'s `DataBindingsModule` (luôn có mặt,
  release inject `Optional.empty()`); `@Binds` thật trong `core/demo`'s `DemoDataModule` (chỉ debug/
  androidTest, app chỉ `debugImplementation(core.demo)`) — `assembleRelease`/`compileReleaseKotlin`
  build sạch xác nhận graph release không cần binding thật. `WorkoutDetailViewModel` nhận
  `Optional<SyntheticWorkoutDetailSource>`, cache theo `workoutId` trong map ở ViewModel (không tính
  lại khi rotation/recompose vì ViewModel sống qua đó), chỉ gọi `.supplement(workout)` khi
  `observeWorkoutLaps`/`observeWorkoutSamples` rỗng — **thật luôn thắng demo luôn thắng rỗng**.
  **Theo yêu cầu "giữ mở rộng được" của coordinator** (RE Huawei detail-parity sắp tới — best-km pace,
  stride length, running-form, training load/recovery): gộp mọi derived metric vào MỘT holder
  `WorkoutDerivedDetail` trong `WorkoutDetailUiState.Success` thay vì rải thêm field rời (field cũ
  `hrZones` cũng dời vào đây) — field mới sau này chỉ thêm vào holder, không đụng chữ ký `Success`/
  constructor ViewModel nữa. **Cân nhắc rồi KHÔNG làm**: thêm field `distanceMeters` vào
  `WorkoutSample` (core/model) để tính stride length — đổi schema cross-cutting (Room entity, mọi FIT
  parser driver/*), rủi ro/phạm vi vượt task này, và chưa có RE evidence Huawei thật có field tương
  ứng; cadence+speed hiện có đã đủ tính stride length sau này (speed/((cadence/60)) kiểu) khi task RE
  Huawei tới — để agent đó quyết định có cần field distance riêng hay không, không đoán trước.
  **Test mới (34, toàn bộ pass)**: `WorkoutDerivedMetricsTest` (7, gồm `derive` 2 case thắng/fallback),
  `HeartRateZoneBreakdownTest` (4, `percentages` vs `percentagesFromReadings` khớp nhau),
  `SyntheticWorkoutDetailGeneratorTest` (10 — determinism, reconcile distance/duration/calories/HR
  ±2bpm, cadence theo dải, non-distance sport, workout 0s), `DemoSyntheticWorkoutDetailSourceTest` (3
  — mọi id trong `DemoDeviceIds.ALL` có supplement, thiết bị thật/không rõ thì null),
  `WorkoutDetailViewModelTest` thêm 6 case (fallback synth khi rỗng, thật thắng synth dù cả hai có,
  không synthetic source thì rỗng kể cả workout "giống demo", HR-zone fallback từ stream phút, kcal/
  min).
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug`
  BUILD SUCCESSFUL cả hai; 91 file `TEST-*.xml` toàn repo, không file nào thiếu `failures="0"
  errors="0"` (34 test mới nằm trong số đó); `feature/activity/build/generated/ksp/debug/java/
  hilt_aggregated_deps` có đủ `WorkoutDetailViewModel_HiltModules_{Binds,Key}Module.java` (không gặp
  flake KSP). `:app:compileReleaseKotlin` (gồm `kspReleaseKotlin` validate toàn bộ Hilt graph) build
  sạch — xác nhận `Optional<SyntheticWorkoutDetailSource>` resolve về rỗng ở release, không kéo theo
  `:core:demo`. **Xác minh trên emulator thật (trước khi coordinator đổi chỉ đạo giữa chừng — xem
  D-1196)**: cài APK, mở Activity → mở lần lượt workout Running/Walking/Cycling thật từ demo data có
  sẵn — tile mới "Calorie rate" (vd. 330 kcal/30 min = 11.0 kcal/min, khớp phép chia) và cadence/
  elevation gain-loss (vd. running 170/180 spm trong dải 160-180, cycling 88/95 spm trong dải 80-95)
  đều hiện, trước đây rỗng; card "Trends" (Pace/Elevation) cũng lên được với 1 workout. Mở lại đúng
  workout Running đó 3 lần tách biệt (relaunch app giữa mỗi lần, ViewModel mới hoàn toàn mỗi lần) ra
  đúng 1 bộ số giống hệt cả 3 lần (170/180 spm, 190/175 m, 11.0 kcal/min, 154/167 bpm) — xác nhận
  determinism qua seed, không phải trùng hợp cache. Chưa chụp được Splits/HR-zones card riêng (cuộn
  trên màn pushed bị agent khác test pill nav cùng lúc làm sai lệch, xem D-1196) trước khi dừng hẳn
  adb theo chỉ đạo mới — bù lại bằng unit test `hasSplits`/`hasHrZones` ở trên. Screenshot ở
  `/private/tmp/claude-501/-Users-Apple-Documents-Projects-noattoan/c9d7be03-0705-4257-958d-425d46c7b31e/scratchpad/`
  (24/28/45/48/50/51/53 là các lần mở workout detail thành công).

## Đính chính số D cho entry RaceCard (D-1198)

- **D-1198** · 2026-11-12 · Entry "RaceCard: CTA 'Xem chi tiết' bị cắt ở carousel Home + tối ưu khoảng
  trống thẻ" ghi phía trên là **D-1198**, không phải **D-1197** như tiêu đề/nhãn gốc của nó — hai agent
  (RaceCard và "Workout detail: derived metrics...") đọc `docs/DECISIONS.md` cùng lúc, cùng thấy
  D-1197 còn trống và cùng chiếm nó khi ghi song song; không sửa lại nhãn của 1 trong 2 entry đó, ghi
  số thật ở đây, giống cách D-1193/D-1194 và D-1196/D-1197 (entry "Workout detail") từng xử lý va chạm
  số tương tự. Nội dung/code của entry RaceCard không đổi, chỉ số hiệu bị trùng.

## Home: "7 vòng mini" cho cả tuần dưới vòng lớn (D-1199)

- **D-1199** · 2026-11-12 · Home luôn hiện 7 vòng hoạt động mini (Move/Exercise/Steps) cho cả tuần
  ngay dưới vòng lớn, làm rõ ngày nào là "hôm nay" — **Chốt**
  **Tuần cố định Thứ 2→CN (quy ước Việt Nam), không phải cửa sổ trượt 7 ngày** — `WeekRange`
  (`core/domain/.../usecase/ObserveWeekActivitySummaryUseCase.kt`) tính `mondayOf`/`daysOf` thuần
  bằng `LocalDate` (`TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)` rồi `plusDays`), không đụng
  `Instant`/zone sau khi đã resolve "hôm nay" — nên an toàn qua DST tự nhiên (test riêng xác nhận qua
  biên DST mùa xuân `America/New_York`, biên tháng, biên năm, biên năm nhuận). "Hôm nay" dùng cùng
  cách `ObserveTodaySummaryUseCase` đã dùng (`Clock.systemDefaultZone()` mặc định, theo múi giờ máy).
  **`ObserveWeekActivitySummaryUseCase`** (file mới, không đụng `HealthDataRepository` interface):
  gọi lại đúng `HealthDataRepository.observeDailySummary(date)` 7 lần (1 lần/ngày, mỗi ngày 1 flow
  riêng nên chỉ ngày đó re-emit khi dữ liệu ngày đó đổi) rồi `combine` — đúng nguồn
  `ObserveTodaySummaryUseCase` dùng cho "hôm nay", nên số của "hôm nay" trong tuần luôn khớp number
  với vòng lớn, không tính lại riêng. Model mới `WeekActivityDay` (`core/model`, file riêng, không
  đụng `DailyHealthSummary`/`HealthMetrics.kt`): `summary` + `isToday` + `isFuture`.
  `HomeViewModel` thêm field `HomeUiState.Success.week: List<WeekActivityDay>`, combine thêm một
  bước cuối cùng (giống cách `todayWorkout` đã làm) — cập nhật live khi dữ liệu hôm nay đổi.
  **UI** (`feature/home/HomeScreen.kt`, composable mới `WeekRingsStrip`/`DayRing`, đặt ngay dưới
  `RingsCard` trong `Summary`'s `LazyColumn`): tái dùng thẳng `ActivityRings` (`core:designsystem`)
  với `size=40.dp, strokeWidth=3.dp, gap=1.dp` thay vì vẽ `Canvas` riêng — đúng góc độ "parametrize,
  đừng duplicate" vì composable đó đã sẵn tham số `size`/`strokeWidth`/`gap`. Cùng 3 vòng/goal/màu với
  vòng lớn (Move=calories, Exercise=activeMinutes, Steps=steps — cùng `MetricColors`).
  **Hôm nay**: nền tròn `primaryContainer` sau vòng (52dp, lớn hơn vòng 40dp) + label `primary` in
  đậm + chấm tròn nhỏ dưới label. **Tương lai** (`isFuture`): progress ép về 0 (chỉ hiện track rỗng)
  + `Modifier.alpha(0.4f)` cho cả cột (vòng lẫn label) — không thêm tham số track-alpha mới vào
  `ActivityRings` (giữ file đó nguyên vẹn, không đụng `core:designsystem` ngoài phạm vi giao). Ngày
  quá khứ không có dữ liệu: progress tự nhiên = 0 nên track rỗng ở alpha thường, không cần nhánh riêng.
  Ngày đạt đủ cả 3 goal: vòng khép kín tự nhiên, không cần code riêng. **Không bấm được** (D-1189):
  không `Surface`/`clickable`, không ripple. **A11y**: `Modifier.clearAndSetSemantics` ở cấp cột
  (vòng+label) gộp 1 node duy nhất mô tả `"T2: 420/830 kcal, 25/30 phút, 6.200/8.000 bước"` (+
  `", hôm nay"` nếu là hôm nay) — ghi đè/che hẳn semantics riêng của `Canvas` bên trong (không cần sửa
  `ActivityRings`). Dùng số trần (`%d`), không ép định dạng phân tách nghìn — khớp quy ước hiện có của
  `ring_calories_progress`/`ring_count_progress` trong cùng file, không tự chế convention mới. Nhãn
  thứ (T2..CN / Mon..Sun) qua string resource mới (`week_ring_mon`..`week_ring_sun`,
  `week_ring_description`, `week_ring_today_suffix`) trong `values/strings.xml` + `values-vi/
  strings.xml` của `feature:home`, đúng kiểu EN/VI D-1192 đã có sẵn trong module này.
  **Sửa kèm (theo yêu cầu user giữa chừng, đã confirm giữ phần equal-height, huỷ phần gap/padding vì
  sẽ có 1 đợt rà soát spacing/token toàn app riêng sau)**: Grid "Metrics" (`feedCardItems`'s
  `HomeMetricsViewMode.GRID` branch) — card "Workouts" cao hơn "VO2max" cùng hàng làm hàng so le +
  khoảng cách hàng sau lớn hơn bình thường. Sửa bằng `Row(..., Modifier.height(IntrinsicSize.Max))` +
  mỗi card trong cặp bọc `Modifier.weight(1f).fillMaxHeight()` (cả `Box` bọc ngoài lẫn `modifier` của
  `FeedCard`) — Compose co hàng theo card cao nhất rồi giãn card thấp hơn khớp chiều cao đó, không đổi
  nội dung/testTag từng card. Không đụng gap/padding (Spacing.md giữa card, Spacing.lg trong card) —
  phần đó để lại cho đợt rà soát token sau, tránh làm hai lần.
  **Test mới (18, toàn bộ pass)**: `WeekRangeTest` (6 — Monday-of chính nó, mỗi ngày trong tuần walk
  back đúng Monday, 7 ngày liên tiếp Mon→Sun, biên tháng, biên năm, biên năm nhuận tháng 2),
  `ObserveWeekActivitySummaryUseCaseTest` (6 — đúng 7 entry Mon→Sun, ngày sau hôm nay flag future,
  đúng 1 ngày flag today, today khớp y hệt `ObserveTodaySummaryUseCase`, update live khi data hôm nay
  đổi, tính tuần an toàn qua biên DST mùa xuân múi `America/New_York`), `HomeViewModelTest` thêm 3 case
  (week có đúng 7 entry Mon→Sun, today's entry khớp `state.summary`, ngày sau hôm nay flag future).
  **Verify (chỉ Gradle, không đụng emulator/adb theo chỉ đạo mới của coordinator — nhiều agent đang
  dùng chung máy ảo, sẽ test gộp 1 lần sau khi mọi agent xong)**: `JAVA_HOME=/opt/homebrew/opt/
  openjdk@21 ./gradlew :feature:home:testDebugUnitTest :core:domain:test :app:assembleDebug` BUILD
  SUCCESSFUL (chạy 2 lần, lần 2 toàn bộ UP-TO-DATE, không flake) — `TEST-*.xml` mới đều `failures="0"
  errors="0"` (`HomeViewModelTest` 7/7, `WeekRangeTest` 6/6, `ObserveWeekActivitySummaryUseCaseTest`
  6/6); `feature/home/build/generated/ksp/debug/java/hilt_aggregated_deps` có đủ
  `HomeViewModel_HiltModules_BindsModule.java`, không gặp flake KSP; `app:assembleDebug` build
  `app-debug.apk` sạch cùng lúc với thay đổi của các agent song song khác (feature/activity+core/
  domain+core/demo, RaceCard, feature/gear) — không có xung đột biên dịch.

## Devices: gộp 3 CTA thêm thiết bị bị trùng lặp (D-1200)

- **D-1200** · 2026-11-12 · `feature/devices` (DevicesScreen.kt) — **Chốt**
  Bug từ screenshot: màn Devices lúc chưa ghép nối hiện 3 nút cạnh tranh ngang hàng, một nút bị lặp —
  card trống "Chưa ghép nối thiết bị nào" có [Quét mã QR] (tonal) + [Quét tìm thiết bị] (outlined),
  ngay dưới đó section "Thiết bị gần đây" lặp lại [Quét mã QR] + [Nhập địa chỉ MAC].
  **Sửa theo đúng UX đã chốt với coordinator**:
  - Lúc chưa ghép nối thiết bị nào: gộp về **một** card onboarding — tiêu đề + mô tả 1 dòng, rồi 3 nút
    xếp dọc theo đúng thứ bậc thay vì cạnh tranh ngang hàng: PRIMARY `Button` "Quét tìm thiết bị" (quét
    BLE, tìm được hầu hết đồng hồ), SECONDARY `FilledTonalButton` "Quét mã QR", TERTIARY `TextButton`
    "Nhập địa chỉ MAC" (dành cho trường hợp nâng cao). Không còn nút nào lặp lại bên dưới.
  - Section "Thiết bị gần đây" không còn 2 nút QR/MAC riêng của nó nữa — chỉ còn hiện khi **đang quét
    hoặc đã từng quét ra kết quả** (`isScanning || discovered.isNotEmpty() || scanAttempted`, biến cục
    bộ `scanAttempted` lật lên qua `LaunchedEffect(state.isScanning)` bất kể lối vào nào kích hoạt quét
    — FAB, card onboarding, hay "Thêm thiết bị" — nên không cần luồn cờ qua từng call site). Quét xong
    mà rỗng thì hiện "Chưa tìm thấy thiết bị nào…" + nút Retry ngay trong section (chuỗi mới
    `scan_empty_no_results`, dùng lại `action_try_again` đã có ở `:core:designsystem`), không phải
    thêm nút trùng. Chuỗi `scan_empty_idle` cũ (không còn ai gọi tới) đã xóa khỏi cả 2 `strings.xml`.
  - Đã ghép nối ít nhất 1 thiết bị: 3 hành động thêm thiết bị gộp vào **một** điểm vào — nút văn bản
    "Thêm thiết bị" (`AddDeviceEntry`, góc phải phía trên danh sách thiết bị đã ghép nối) mở
    `DropdownMenu` 3 mục (quét / QR / MAC), dẫn tới đúng các luồng cũ (`requestScan`,
    `showScanner = true`, `showManualMacDialog = true`) — không đổi `QrFindSheet`, `QrScannerScreen`,
    `ManualMacDialog`, logic quyền hay `DevicesViewModel`.
  **testTag**: tag cũ `qr_scan_button`/`qr_scan_button_empty`/`manual_mac_button` (Nearby + card cũ) bị
  xóa cùng với 2 nút lặp — đã `grep` toàn bộ `app/src/androidTest` + `scripts/e2e.sh` trước khi xóa,
  không nơi nào tham chiếu 3 tag đó (chỉ `scan_fab`/`stop_scan_fab`/`discovered_*`/`pair_*` được E2E
  dùng, và các tag đó giữ nguyên). Tag mới: `onboarding_scan_button`/`onboarding_qr_button`/
  `onboarding_mac_button` (card onboarding), `add_device_button`/`add_device_scan`/`add_device_qr`/
  `add_device_mac` (menu "Thêm thiết bị"), `scan_retry_button` (Nearby rỗng).
  **Spacing**: không thêm `.dp` cứng nào cho gap/padding — dùng token `Spacing.sm/.md/.lg/.xs` sẵn có,
  để đúng theo đợt rà soát spacing-token sẽ chạy sau trên toàn app.
  **ECC skills áp dụng**: `make-interfaces-feel-better` → đổi hàng ngang 2 nút cạnh tranh thành 3 nút
  xếp dọc full-width theo thứ bậc rõ ràng (Filled > Tonal > Text) thay vì "equal-weight" cạnh nhau —
  đúng tinh thần phần hit-area/động lực (button đứng riêng dòng dễ bấm hơn, không cần đổi kích thước
  vì Material3 `Button`/`OutlinedButton`/`TextButton` đã tự áp dụng tối thiểu 48dp touch target).
  `accessibility` → giữ focus order logic (tiêu đề → mô tả → 3 nút theo đúng thứ bậc chính/phụ/phụ, menu
  "Thêm thiết bị" theo thứ tự quét/QR/MAC khớp card onboarding cũ), icon trang trí (`contentDescription
  = null`) đi kèm label chữ rõ ràng, không chỉ dựa màu sắc để phân biệt action.
  **i18n D-1192**: thêm chuỗi mới `add_device`/`scan_empty_no_results` ở cả `values/strings.xml` (EN)
  và `values-vi/strings.xml` (VI).
  **Không đụng** `DevicesViewModel.kt`/`DevicesViewModelTest.kt` (logic scan/pair/QR-find không đổi,
  chỉ UI) — 23 test cũ (`DevicesViewModelTest` 15, `DeviceDetailViewModelTest` 8) vẫn pass nguyên.
  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:devices:testDebugUnitTest`
  BUILD SUCCESSFUL (23 test, `failures="0" errors="0"`); `feature/devices/build/generated/ksp/debug/
  java/hilt_aggregated_deps` có đủ 2 file `*ViewModel_HiltModules_BindsModule.java`
  (`DevicesViewModel`, `DeviceDetailViewModel`), không gặp flake KSP. `./gradlew :app:assembleDebug`
  lần đầu FAIL ở `:driver:xiaomi:compileDebugKotlin` (`channelAndOpCodeFor` unresolved — code của
  session khác đang làm `driver/xiaomi`, không phải lỗi từ thay đổi này); chạy lại với
  `-x :driver:xiaomi:compileDebugKotlin` thì `:app:assembleDebug` BUILD SUCCESSFUL, xác nhận
  `feature/devices` biên dịch sạch và không phải nguồn gây lỗi. `:app:compileDebugAndroidTestKotlin`
  (cùng loại trừ `driver:xiaomi`) cũng BUILD SUCCESSFUL — E2E vẫn biên dịch được với tag mới.
  Chưa test trên emulator/adb theo đúng chỉ đạo (máy ảo dùng chung, coordinator test gộp 1 lần cuối).

## Workout detail: Huawei-parity metrics (splits, pace/speed/stride, HR-zone minutes, elevation hysteresis) + line charts (D-1201/D-1202)

- **D-1201** · 2026-11-12 · Workout detail hiện đủ bộ chỉ số như Huawei Health (trong giới hạn dữ liệu
  tự tính được, §9 của `docs/re-evidence/huawei/workout_detail_metrics.md`) — **Chốt**
  **Số thật trong code comment là D-1199**, nhưng số đó đã bị agent khác (Home "7 vòng mini") chiếm
  trước khi entry này được ghi — không sửa lại các KDoc/comment đã viết (rất nhiều file), ghi số thật
  ở đây, giống cách D-1193/D-1194 và D-1196/D-1197/D-1198 đã xử lý va chạm số tương tự trước đó.
  **Domain mới (core/domain/usecase, file mới, hầu như không sửa file cũ)**: `WorkoutRunningMetrics`
  (avg pace/speed theo `UnitSystem`, max speed từ sample, avg stride = distance/steps×100cm ẩn nếu
  >200cm, ước lượng tổng bước từ cadence×thời gian vì `Workout` chưa có field số bước thật),
  `WorkoutElevationProfile`/`WorkoutElevation` (gain/descent từ altitude samples với hysteresis 2.5m
  mặc định — chỉ dùng khi lap không mang sẵn ascent/descent), `WorkoutSplits`
  (`WorkoutSplit`/`WorkoutSplitsSummary`: 1 split/km hoặc /mi, ưu tiên lap có sẵn (đã là ~1km/5km từ
  D-1093/D-1195), nếu không có lap thì tích phân từ sample theo thời gian — nội suy đúng thời điểm cắt
  mốc; fastest split loại trừ split lẻ cuối; half/full marathon chỉ hiện khi quãng đường thật sự đạt
  tới, nội suy tuyến tính trong split chứa mốc đó), `HeartRateZoneDurations` (phút theo từng vùng nhịp
  tim theo đúng quy tắc §3.2 Huawei: tích luỹ 5s/sample khi dày hoặc khi count×60s vượt thời lượng
  buổi tập, còn lại 60s/sample — **dùng chung ngưỡng %HRmax 50/60/70/80/90/100% đã có sẵn ở
  `MetricThresholds.heartRateZones` (D-1030) vì trùng khớp chính xác với method-0 của Huawei, không
  thêm bảng ngưỡng thứ 2**). `WorkoutSampleSeries` thêm `cadence()` (nhỏ, cộng thêm vào file có sẵn).
  `WorkoutDerivedDetail` (file cũ D-1195, mở rộng có kiểm soát) thêm các field trên +
  `minHeartRate`/`hrZoneDurations`; `derive(...)` thêm tham số có default (`laps`, `unitSystem`,
  `avgCadence`) nên lời gọi cũ trong test không cần sửa.
  **Không làm** (theo đúng §9 "Cannot compute without device data"): Training Effect/VO2max/recovery
  time/RAI/training load/running posture (ground contact/vertical oscillation/...) — chỉ hiện khi model
  có sẵn field thật từ thiết bị (hiện chưa có field nào), không bịa số. HR-recovery drop (§3.3) bị bỏ vì
  app chưa có luồng dữ liệu "post-workout recovery HR window" nào — đúng như brief cho phép skip khi
  "no data path", không tự chế field mới ngoài phạm vi.
  **UI** (`feature/activity/.../detail/WorkoutDetailScreen.kt`, viết lại có kiểm soát, giữ nguyên mọi
  testTag cũ `workout_detail`/`workout_time_range`/`workout_hr_chart`/`workout_source` vì
  `WorkoutsE2ETest` dựa vào đúng các tag này): header thêm "chief number" (quãng đường to, hoặc thời
  lượng nếu workout không có quãng đường — heuristic thay cho field `chiefSportDataType` Huawei mà app
  không lưu) + dòng nguồn thiết bị; summary grid 2 cột đổi thành đúng thứ tự §2.2 (Duration, Calories,
  Avg pace, Avg speed, Avg cadence, Avg stride, Steps (ước lượng), Avg/Max HR, Elevation gain, Descent,
  kcal/min), lọc bỏ hẳn item vắng giá trị thay vì hiện ô "--"; bỏ hẳn tile Distance riêng (giờ là chief
  number, đúng Huawei: DISTANCE không nằm trong grid); gộp "Active calories" vào "Calories" vì model chỉ
  có 1 field `activeKcal`, không có 2 field riêng biệt như Huawei. Splits section viết lại hoàn toàn
  (trước đây chỉ là list lap thô) thành bảng kiểu Huawei: Fastest/Average + half/full marathon khi đạt,
  rồi từng dòng split với thanh pace tỷ lệ (ngắn hơn = nhanh hơn, hightlight dòng nhanh nhất), dòng lẻ
  cuối "< 1 km"/"< 1 mi". HR-zone card đổi từ hiện % sang hiện phút ("<1 phút" cho 1-59s, đúng quy tắc
  §3.2). Card "Heart rate" gốc (tag `workout_hr_chart`) giữ nguyên 100% không đổi (an toàn cho E2E);
  phần "Trends" cũ nhập chung vào 1 Card "Charts" (tag `workout_trend` giữ nguyên) thêm biểu đồ cadence.
  Dùng toàn bộ token `Spacing.*` cho khoảng cách/padding mới (coordinator yêu cầu để đợt gộp spacing
  sau tinh chỉnh tập trung, không hardcode `.dp` cho spacing — kích thước component như icon/bar/line
  vẫn giữ `.dp` như code cũ).
  **core/demo**: không sửa gì — `SyntheticWorkoutDetailGenerator` (D-1195) đã sinh sẵn cadence/speed/
  altitude/HR đầy đủ, đủ cho mọi field mới (bước suy ra từ cadence×thời gian).
  **Test**: `WorkoutSplitsTest`/`WorkoutRunningMetricsTest`/`WorkoutElevationTest`/
  `HeartRateZoneDurationsTest` (core/domain, mới) — split từ sample có dòng lẻ cuối + imperial, fastest
  loại trừ dòng lẻ, phát hiện half/full marathon, rule tích luỹ 5s/60s, ẩn stride >200cm, hysteresis độ
  cao (nhiễu dưới ngưỡng không cộng dồn, leo dốc thật vượt ngưỡng vẫn tính đúng).

- **D-1202** · 2026-11-12 · Thêm chế độ line chart (+ area-fill) vào `HealthCharts.kt` dùng chung, theo
  yêu cầu bổ sung giữa chừng của coordinator — **Chốt**
  **Số thật trong code comment là D-1200** (lý do trùng số giống D-1201 ở trên).
  Lý do: 3 mini-chart Pace/Elevation/Heart-rate trong "Trends" trước đây dùng `HealthRangeChart` (chấm
  rời theo bucket) nhìn rối vì dữ liệu dày (tới 60 bucket/buổi tập). Thêm `HealthLineChart` (file cũ
  `core/designsystem/.../component/HealthCharts.kt`, cộng thêm — không đụng `HealthBarChart`/
  `HealthRangeChart` hiện có, màn hình khác như `MetricDetailScreen` giữ nguyên dạng chấm/cột) +
  `LineChartMath` (pure, test riêng `LineChartMathTest`): `movingAverage` (làm mượt pace ~20s, null giữ
  nguyên null không lan sang điểm lân cận), `segments` (cắt đường tại chỗ thiếu dữ liệu, không nối qua
  khoảng trống — vì bucket đã cố định độ rộng từ `WorkoutSampleSeries`, 1 bucket rỗng tự nhiên đã là 1
  khoảng trống ≥ 1 chu kỳ bucket, không cần tính lại "3x median interval" ở tầng chart), `axisRange`
  (pad min/max rồi mới làm tròn tick đẹp — khác `niceFloor`/`niceCeil` cũ làm tròn trước, dễ nuốt mất
  dải dữ liệu hẹp như nhịp tim 145-155bpm thành true trục 100-200 phẳng lì). Trục Y luôn fit theo đúng
  **dữ liệu thật** (kể cả khi có `zoneBands` nền) — không giãn trục theo dải band. Pace: `invertY=true`
  (lật chiều trục bằng cách hoán đổi cặp giá trị đưa vào `drawAxes`/hàm `y()`, không âm hoá giá trị —
  nên label trục vẫn đúng số giây thật), bỏ hint "(lower is faster)" trong string EN/VI vì trục đã tự
  nói lên điều đó. Elevation: `areaFill=true`. Heart rate: dải nền mờ 5 vùng (cùng ngưỡng %HRmax
  D-1030/D-1201) tính ở tầng `feature/activity` (designsystem không phụ thuộc domain) rồi truyền vào
  như list `Triple<Float,Float,Color>` thuần, cộng đường trung bình nét đứt.
  **Verify**: chỉ Gradle, không chạm emulator/adb theo đúng chỉ đạo chung.


## Gear: lọc theo giá + màu sắc trên "Trang bị tham khảo" (D-1203)

- **D-1203** · 2026-11-12 · `feature/gear` (GearScreen.kt/GearViewModel.kt) + 2 file mới ở
  `core/domain/usecase` — **Chốt**. Mã nguồn vẫn còn ghi "D-1199"/"D-1201" ở một vài bản nháp do va
  chạm số hiệu với 2 agent khác chạy song song (home "7 vòng mini" chiếm D-1199, devices "gộp CTA"
  chiếm D-1200, rồi activity/workout-detail chiếm cả D-1201/D-1202) — đã sửa lại toàn bộ comment
  trong code về đúng D-1203 trước khi ghi entry này (khác tình huống D-1193/1196/1197/1198: ở đây
  chưa có entry nào được ghi/commit nên sửa thẳng code thay vì để lại số sai).

  **1. Chuẩn hoá màu (`core/domain/usecase/GearColorFamily.kt`)**: `enum ColorFamily` 12 giá trị
  (BLACK/WHITE/GREY/BLUE/GREEN/RED/PINK/ORANGE/YELLOW/PURPLE/BROWN_BEIGE/MULTI) +
  `classifyGearColor(raw: String): GearColorMatch(dominant, secondary)`, hàm thuần không phụ thuộc
  Android. Thuật toán: bỏ dấu (xử lý riêng "đ"→"d" vì NFD không tách được), tokenize theo
  `[^a-z0-9]+` (gộp "-"/"/"/" phối " làm một), bỏ token nhiễu "puma", quét trái→phải qua từ điển
  ~100 từ khoá (VN: đen/trắng/xám/xanh dương/xanh lá/đỏ/hồng/cam/vàng/tím/nâu/be…; EN: black/white/
  navy/lime/ruby/lavender/sandstone/inky…) — **gia đình đầu tiên khớp = dominant, các gia đình khác
  = secondary** (không có state "MULTI ngầm định" cho tên 2 màu như "PUMA Black-PUMA White" — dominant
  BLACK, secondary {WHITE}; MULTI chỉ dành cho tín hiệu rõ ràng "nhiều màu" — "Mix màu", hoặc hậu tố
  "AOP" (All-Over-Print) của PUMA). **Quy tắc "xanh"**: một mình mặc định BLUE; chỉ chuyển GREEN khi
  từ theo sau là lá/rêu/oliu/olive/lục/ngọc/mint (lookahead không "nuốt" token sau, token đó vẫn được
  quét riêng — nên "xanh đen" vẫn ra dominant BLUE + secondary {BLACK}). "kem" xếp vào WHITE (không
  phải BROWN_BEIGE) vì cách dùng thật trong feed ("Kem viền tím") mô tả nền trắng-kem viền màu, không
  phải be/nâu.

  **Coverage đo trên feed thật** (đọc read-only `unified_health_service/docs/gear/latest.json`, 486
  item/156 có variant/636 variant — KHÔNG sửa repo đó): **629/636 variant (98.9%) map được**; 7 cái
  còn lại cố ý không map (2× "Cool Weather" không có từ màu nào, 5× "Thêu <hoạ tiết>" là tên thêu,
  không mô tả màu — không đoán bừa). Item không có variant (330 item), thử suy từ tên sản phẩm: chỉ
  94/330 (28.5%) — thấp hơn nhiều vì đa số tên sản phẩm chỉ là tên model ("Deviate NITRO 3 Running
  Shoes Men"), không nhắc màu; vài tên Salomon có màu gắn liền mã sản phẩm không có dấu cách
  ("BlackLC2180300") nên tokenizer không tách ra được — chấp nhận, không cố match chuỗi con (rủi ro
  match nhầm chữ khác). Test (`GearColorFamilyTest`, 15 case) dùng đúng các chuỗi thật trong feed.

  **2. Lọc trong domain (`core/domain/usecase/GearCatalogFilters.kt`, 12 test)**: `gearColorFamilies()`
  (variant → dominant mỗi variant; không variant → dominant từ tên), `matchesColorFamilies`,
  `firstVariantMatchingColorFamilies` (quyết định 4), `gearColorFamilyCounts()` (chỉ liệt kê family có
  mặt, kèm số lượng item), `gearPriceBoundsVnd()`, `matchesPriceRange` (lọc giá chỉ loại item
  `priceVnd == null` khi filter đang bật), `GearPricePreset` (5 preset, bucket không chồng lắp, `OVER_3M`
  luôn trần ≥ 3tr dù category hiện tại rẻ hơn).

  **3. ViewModel (`GearViewModel.kt`)**: category/giá/màu đều chuyển sang `SavedStateHandle.getStateFlow`
  (trước đây category là `MutableStateFlow` thường) — `GearCategory`/`Set<ColorFamily>` tự
  `Serializable` (mọi `enum class`/`HashSet` Kotlin đều vậy) nên lưu thẳng không cần serialize tay;
  sống sót qua process death (test riêng: tạo lại ViewModel từ cùng `SavedStateHandle`). 5 flow
  (`items` + category + color + priceMin + priceMax) gộp bằng 1 lần `combine` 5-tham số.
  `availableColorFamilies`/`priceBoundsVnd` tính từ tập đã lọc category (CHƯA lọc giá/màu) — để chip
  màu/biên giá trong sheet không "biến mất" khi người dùng đang bật filter khác.

  **4. UI (`GearScreen.kt`)**: nút "Lọc" (`FilterList` icon) ở `actions` của `AppScreen`, bọc
  `ChromeRipple` riêng (D-1189) — `AppScreen` chỉ tự bọc ripple cho `navigationIcon`, không bọc cả
  slot `actions`, nên tự bọc ở đây; `BadgedBox` hiện số filter đang bật (không tính category — category
  đã có hàng chip riêng). `ModalBottomSheet`: giá (5 chip preset + `RangeSlider` liên tục, format
  "1.200.000đ") + màu (chip tròn-màu + tên + số lượng, multi-select, `FlowRow`) + 2 nút "Xoá lọc"/
  "Áp dụng" — áp dụng ngay khi chọn (không có state "pending" riêng), "Áp dụng" chỉ đóng sheet, đơn
  giản hoá vì không cần 2 tầng state. Dưới hàng chip category: hàng chip filter đang bật, có nút ×
  xoá từng cái (giá hoặc từng màu). Thẻ sản phẩm: khi có lọc màu, đổi ảnh sang variant đầu tiên khớp
  màu đó (quyết định 4) và truyền màu đó qua nav arg `GearDetailDestination.variantColor` —
  **đã nối đầy đủ** (không phải "bỏ qua vì phức tạp"): thêm field optional vào route, seed
  `selectedColor` trong `GearDetailViewModel` từ `route.variantColor`; `onOpenGearDetail` đổi chữ ký
  `(String) -> Unit` → `(String, String?) -> Unit` — `app/UnifiedHealthNavHost.kt` **không cần sửa**
  vì `navController::navigateToGearDetail` (tham số 2 có default `null`) tự khớp kiểu hàm 2-tham số
  khi dùng làm callable reference. Empty state "Không có trang bị khớp bộ lọc" thêm nút "Xoá lọc" khi
  có filter đang bật (ẩn nút nếu chỉ do category rỗng, không có gì để xoá). Màu sắc dùng token
  `Spacing` có sẵn, không thêm `.dp` cứng mới (theo yêu cầu coordinator hoãn việc chỉnh spacing
  sang đợt rà soát design-token riêng).

  **Không đụng**: `GearDetailScreen.kt`/variant tiles (D-1196, đã có sẵn), `core/model/GearItem.kt`
  (không cần field mới). Không thêm Compose UI test (`androidTest`) — chỉ unit test theo đúng brief.
  Chưa có test cho việc seed `selectedColor` từ `route.variantColor` ở `GearDetailViewModel` — không
  có tiền lệ unit test nào dùng `savedStateHandle.toRoute<T>()` trong repo này (kiểm tra: không file
  test nào mock được định dạng `SavedStateHandle` mà Navigation-Compose tạo ra cho `toRoute`), và
  `GearDetailViewModel` vốn chưa từng có test — để nguyên, đổi 1 dòng rủi ro thấp
  (`MutableStateFlow(route.variantColor)` thay vì `MutableStateFlow(null)`).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:gear:testDebugUnitTest
  :core:domain:test :app:assembleDebug --rerun-tasks` BUILD SUCCESSFUL (450 task); test mới
  `GearColorFamilyTest` 15, `GearCatalogFiltersTest` 12, `GearViewModelTest` 13 (cũ 5 + 8 mới) — toàn
  bộ `failures="0" errors="0"`. `feature/gear/build/generated/ksp/debug/java/hilt_aggregated_deps`
  có đủ 2 file `*ViewModel_HiltModules_BindsModule.java`, không gặp flake KSP. Lần chạy đầu tiên
  `:app:assembleDebug` FAIL ở `:app:hiltJavaCompileDebug` ("error reading
  ..._GeneratedInjector.java") — lỗi đọc file tạm do tranh chấp ghi đồng thời với agent khác đang
  build cùng cây thư mục (không phải lỗi từ thay đổi này); chạy lại ngay sau đó
  `:app:assembleDebug` BUILD SUCCESSFUL, xác nhận thoáng qua. Không test trên emulator/adb theo đúng
  chỉ đạo (máy ảo dùng chung, coordinator test gộp 1 lần cuối).

## Rà soát spacing/padding toàn app, chốt bộ token ngữ nghĩa `Gaps` (D-1204)

- **D-1204** · 2026-11-12 · `core/designsystem/theme/Spacing.kt` (token mới `Gaps`) + 21 file
  screen/component ở `feature/*`, `app/*`, `core/designsystem/component` — **Chốt**
  Phản hồi từ screenshot: UI "quá thoáng" (airy) — cụ thể Gear (khoảng cách dọc giữa top bar và hàng
  chip danh mục, và giữa hàng chip với nội dung bên dưới, đều quá lớn) và Home Metrics (khoảng cách
  giữa 2 card trong lưới 2 cột, padding trong card, và khoảng cách giữa hàng tiêu đề "Metrics" với
  hàng đầu tiên đều quá rộng). Yêu cầu: giảm (khoảng nửa) các khoảng dọc, lưới; đồng thời chốt token
  ngữ nghĩa áp dụng nhất quán toàn app thay vì mỗi màn tự chọn `Spacing.lg/md/sm` theo cảm tính.

  **1. Token mới — `object Gaps` trong `Spacing.kt`** (giữ nguyên thang nguyên tố 4dp của `Spacing`
  làm nền, `Gaps.*` chỉ tham chiếu lại các giá trị đó, không thêm `.dp` cứng mới):

  | Token | Vai trò | Giá trị cũ (phổ biến nhất) | Giá trị mới |
  |---|---|---|---|
  | `screenHorizontal` | lề ngang nội dung màn hình | `Spacing.lg` (16dp) | **không đổi** — 16dp |
  | `screenTop` | khoảng cách từ top bar → nội dung đầu tiên | `Spacing.sm` (8dp, Home/Activity/Devices) hoặc `Spacing.lg` (16dp, Training/TrainingCalendar/Races) — không nhất quán | **`Spacing.xs` — 4dp**, thống nhất mọi màn |
  | `sectionGap` | khoảng cách giữa các khối/card lớn xếp dọc 1 màn | `Spacing.lg`/`Spacing.xl` (16–24dp) | **`Spacing.md` — 12dp** |
  | `itemGap` | khoảng cách giữa các item cùng dạng trong 1 list | `Spacing.sm`/`Spacing.md` lẫn lộn (8/12dp) | **`Spacing.sm` — 8dp** |
  | `gridGap` | khoảng cách giữa các ô lưới (2 cột), cả 2 trục | `Spacing.md` (12dp) | **`Spacing.sm` — 8dp** |
  | `cardPadding` | padding bên trong 1 Card/ElevatedCard | `Spacing.lg` (16dp) | **`Spacing.md` — 12dp** |
  | `cardContentGap` | khoảng cách giữa các dòng nội dung trong 1 card | `Spacing.sm` (8dp, có nơi `Spacing.xxs` 2dp) | **`Spacing.xs` — 4dp** |
  | `chipGap` | khoảng cách giữa các chip trong 1 hàng chip | lẫn lộn `Spacing.xs`/`Spacing.sm` (4/8dp) | **`Spacing.sm` — 8dp** (không giảm — không nằm trong phản hồi "quá thoáng", đây là khoảng NGANG giữa các chip, không phải khoảng DỌC quanh hàng chip) |
  | `chipRowVertical` | khoảng dọc bao quanh 1 hàng chip (trên + dưới) | `Spacing.sm` (8dp) | **`Spacing.xs` — 4dp** |
  | `sheetPadding` | padding nội dung 1 `ModalBottomSheet` | `Spacing.lg` (16dp) | **`Spacing.md` — 12dp** |

  `bottomNavClearance` (96dp, che pill nav nổi) **giữ nguyên** — không phải "khoảng trống đọc thấy
  thoáng/chật", mà là khoảng che một footprint cố định, không phải ứng viên để siết lại.

  **2. Sửa lỗi cấu trúc gây "khoảng cách chồng đôi" ở Gear** (không chỉ đổi số, đổi cả cách ghép):
  trước đây `CategoryFilterRow` tự có padding dọc `Spacing.sm` (8dp) ở cả trên lẫn dưới, rồi
  `LazyVerticalGrid` bên dưới lại cộng thêm `top = Spacing.sm` (8dp) nữa trên contentPadding của
  chính nó → khoảng cách thực tế giữa hàng chip và lưới là 8+8=16dp dù mỗi nơi đọc riêng chỉ là
  8dp. Sửa: `CategoryFilterRow`/`ActiveFilterChipsRow` dùng `Gaps.chipRowVertical` (4dp) cho cả viền
  trên lẫn dưới, và `LazyVerticalGrid`'s `contentPadding.top` đổi thành `0.dp` hẳn (không cộng gì
  thêm) — khoảng cách chip→lưới giờ chỉ còn đúng 4dp từ phía chip, không chồng.

  **3. Di trú toàn bộ màn hình sang `Gaps.*`** (giữ nguyên mọi `testTag`/hành vi, chỉ đổi số/token
  spacing) — bảng trước/sau theo màn (giá trị chính, không liệt kê từng dòng nhỏ):
  - **Gear**: chip-row dọc 8→4dp + bỏ chồng gap (xem mục 2); grid gap 12→8dp; card padding (đã là
    12dp) giữ nguyên nhưng đổi sang token; card content gap 2→4dp; sheet padding 16→12dp.
  - **Home**: screenTop 8→4dp; item/grid gap (list + lưới Metrics 2 cột, cả 2 trục) 12→8dp — đây là
    khoảng cách "2 card quá rộng" VÀ "Metrics header → hàng đầu" cùng lúc (cùng 1 `Arrangement` của
    `LazyColumn`); card padding mọi feed/metric/highlight card 16→12dp; card content gap 8→4dp.
  - **Activity**: screenTop 8→4dp; card padding (Activity Load) 16→12dp, content gap 8→4dp; stat-row
    gap 8dp giữ nguyên số, đổi token (`gridGap`).
  - **Workout detail**: sectionGap 16→12dp; mọi card padding 16→12dp, content gap 8→4dp; splits-row
    gap 4dp giữ nguyên số đổi token; charts/HR-zones card dùng `itemGap` 8dp thay vì 12/8dp lẫn lộn.
  - **Devices**: screenTop 8→4dp; itemGap 12→8dp; mọi card padding 16→12dp, content gap 8→4dp;
    QrFindSheet padding 16→12dp.
  - **Device detail**: sectionGap 16→12dp; card padding 16→12dp, content gap 8→4dp.
  - **Profile / Notifications**: card (Thresholds reference, notifications-blocked) padding 16→12dp,
    content gap 8→4dp; sectionGap Notifications 12dp giữ nguyên số đổi token.
  - **Races**: screenTop **16→4dp** (màn này trước dùng `Spacing.lg`, mức giảm lớn nhất); itemGap
    12→8dp; chipGap trong `FilterChipRow` 4→8dp (tăng, theo quy tắc `chipGap` chốt ở 8dp).
  - **Race detail**: card padding 16→12dp; sectionGap 16→12dp.
  - **Training**: screenTop **16→4dp**; itemGap 12→8dp; mọi card (banner/entry/plan) padding
    16→12dp, content gap 2–8→4dp.
  - **Training calendar**: screenTop **16→4dp**; week-header padding dọc 8dp giữ nguyên số đổi
    token (`itemGap`).
  - **Running form**: toàn màn padding 16→12dp (dùng lại `cardPadding` vì không có top bar scaffold
    riêng để tách màn/card); sectionGap 16→12dp.
  - **Onboarding**: bước Permissions — padding 16→12dp, itemGap 12→8dp, mỗi `PermissionItem` card
    padding 16→12dp. Bước Welcome **giữ nguyên** `Spacing.xl` (24dp) + `Spacing.lg` (16dp) — lề cố ý
    rộng hơn cho màn splash căn giữa 1 lần duy nhất, không thuộc nhóm phản hồi "list/card quá
    thoáng"; có comment trong code giải thích rõ lý do giữ nguyên.
  - **Permissions rationale** (`PermissionsRationaleActivity`): đổi sang token `screenHorizontal`/
    `sectionGap` nhưng giá trị số không đổi (16dp/12dp từ trước).
  - **Metric detail / Metric data**: sectionGap 16→12dp; card (chart/insight) padding 16→12dp;
    stat-row gap 12→8dp (`gridGap`); header-row (All data) padding dọc 8→4dp (`screenTop`).

  **Không đổi (cố ý, có comment tại chỗ)**: mọi dp không phải spacing (icon size, ảnh, stroke
  width, corner radius, chiều cao chart) — không nằm trong phản hồi và không chia sẻ vai trò với
  bất kỳ token `Gaps` nào. `Spacing.xxl`/`Spacing.xl` ở `DeviceImageViewer.kt` (lề quanh ảnh phóng
  to) và toàn bộ `QrScannerScreen.kt` (overlay camera full-bleed) — không nằm trong danh sách màn
  hình brief liệt kê, giữ nguyên để tránh rủi ro cho overlay/viewer đặc thù. `StatTile.kt`'s
  `padding(bottom = 3.dp)` (canh baseline đơn vị cạnh số lớn) — không khớp thang 4dp, giữ nguyên.
  Các `Spacer(width/height = Spacing.xs/sm/md)` canh icon-text/inline đơn giản, dùng 1 vai trò rõ
  ràng duy nhất tại chỗ đó (không mơ hồ giữa nhiều vai trò) — không di trú sang `Gaps`, giữ
  `Spacing.*` nguyên bản theo đúng tinh thần "token sơ cấp vẫn là nền".

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest
  :app:compileDebugAndroidTestKotlin assembleDebug -x :driver:xiaomi:compileDebugKotlin -x
  :driver:xiaomi:testDebugUnitTest` → **BUILD SUCCESSFUL** cho cả 3; 799 test chạy toàn repo, chỉ 1
  fail (`XiaomiL1Test > cumulative ack handles seq wraparound`, thuộc `driver/xiaomi` — module đang
  có agent khác chỉnh sửa song song, không đụng tới, đúng theo chỉ đạo coordinator). 0 fail ở mọi
  module còn lại (`core/designsystem` 28, `feature/home` 15, `feature/activity` 19,
  `feature/devices` 23, `feature/gear` 13, `feature/profile` 14, `feature/races` 8,
  `feature/training` 3 — không có test nào viết riêng cho spacing, nên số test không đổi so với
  trước khi sửa, chỉ xác nhận hành vi/testTag không vỡ). Không kiểm tra KSP flake nào phát sinh
  (`hilt_aggregated_deps` đủ `*ViewModel_HiltModules_BindsModule.java` cho từng `@HiltViewModel`
  thật ở mọi `feature/*`). Không test trên emulator/adb theo đúng chỉ đạo (coordinator test gộp 1
  lần cuối).

## Home: sửa 2 lỗi phát hiện khi review trên máy thật — tuần mini-rings lệch nhãn + thiếu dấu cách "a day" (D-1205)

- **D-1205** · 2026-11-12 · `feature/home` (`HomeScreen.kt`, `strings.xml` EN+VI) — **Chốt**

  **1. Mini rings tuần (`WeekRingsStrip`/`DayRing`, D-1199/D-1196) lệch nhãn khi tới ngày hôm nay.**
  Nguyên nhân: `Box` bọc ring dùng `contentAlignment` không khai kích thước cố định, nên nó tự co
  giãn theo item con lớn nhất — riêng hôm nay có thêm backdrop "spotlight" 52dp (to hơn ring 40dp) vẽ
  cùng cấp, khiến `Box` của riêng ngày hôm nay cao hơn 6 ngày còn lại, đẩy `Text` nhãn + chấm tròn bên
  dưới lệch xuống so với hàng. Sửa: `Box` giờ có `Modifier.size(WEEK_RING_BOX_SIZE)` cố định áp dụng
  **cho mọi ngày như nhau** (backdrop chỉ là nội dung *bên trong*, không còn quyết định kích thước
  `Box`); chấm "hôm nay" dưới nhãn cũng luôn chiếm chỗ (`Color.Transparent` ở 6 ngày còn lại thay vì
  `if (isToday)` thêm/bớt `Spacer`+`Box`) — cả 7 cột giờ cùng chiều cao, cùng baseline nhãn.

  Nhân dịp này gộp luôn 2 yêu cầu UI khác trong cùng khu vực: **tăng gấp đôi kích thước ring** (
  `WEEK_RING_SIZE` 40dp→76dp, `WEEK_RING_STROKE` 3dp→6dp theo đúng tỷ lệ, backdrop 52dp→80dp — vẫn
  vừa 4 cột đều nhau trong bề ngang 360dp trừ `Gaps.screenHorizontal` 16dp mỗi bên, tức mỗi cột ~82dp)
  và **chia 2 hàng 4 cột đều nhau** thay vì 1 hàng 7 cột (hàng 1: T2–T5, hàng 2: T6–CN căn trái dưới 3
  cột đầu của hàng 1 bằng 1 `Spacer(weight(1f))` thế chỗ cột thứ 4 còn trống) — 7 ring to gấp đôi
  không còn vừa 1 hàng ở bề ngang màn hình tối thiểu 360dp.

  **2. Thẻ Highlights thiếu dấu cách trước "a day"/"mỗi ngày"**: "...averaged 7,606 stepsa day", "...34
  mina day", "...473 kcala day" ở cả bản EN lẫn VI, mọi đơn vị (steps/min/kcal) vì cùng dùng chung
  resource `highlight_per_day_suffix`. Nguyên nhân **không phải** lỗi logic format trong code — chuỗi
  Kotlin nối ghép đúng thứ tự — mà là lỗi `strings.xml`: giá trị `<string name="highlight_per_day_suffix">
  a day</string>` có dấu cách đầu dòng **không được quote/escape**, nên trình biên dịch tài nguyên
  Android tự động cắt khoảng trắng đầu/cuối không nằm trong dấu ngoặc kép — dấu cách bị mất ngay lúc
  build, không phải lúc runtime. Sửa: đổi dấu cách thường thành escape ` ` ở cả
  `values/strings.xml` (` a day`) và `values-vi/strings.xml` (` mỗi ngày`) — giữ nguyên nội
  dung chữ, chỉ thêm escape để trình biên dịch không cắt.

  Nhân tiện tách phần nối chuỗi của `HighlightCard`'s body (`stringResource(R.string.highlight_body,
  verb, recent, unit, perDay, change)`) ra hàm pure `highlightCardBody(...)` (không phụ thuộc
  Compose/Android) để có thể unit-test JVM thuần theo đúng pattern có sẵn của
  `metricInsightLine`/`MetricInsightTextTest` (`feature/home/.../insight/MetricInsightText.kt`) —
  test mới `HighlightCardBodyTest` (5 case: steps/min/kcal có đúng 1 dấu cách giữa đơn vị và hậu tố
  "a day", discrete/sleep không có hậu tố, và 1 test đọc thẳng `strings.xml` để khóa ` ` không
  bị ai vô tình sửa lại thành dấu cách trần).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:home:testDebugUnitTest
  :app:assembleDebug` → **BUILD SUCCESSFUL** cả 2 (không cần loại trừ `:driver:xiaomi`, module đó
  build sạch trong lần chạy này). `feature/home` 20 test (15 cũ + 5 `HighlightCardBodyTest` mới), 0
  fail. `hilt_aggregated_deps` có đủ 3 `*ViewModel_HiltModules_BindsModule.java` (không cần
  `kspDebugKotlin --rerun`). Không test trên emulator/adb (coordinator kiểm tra trên máy thật ở bước
  sau) — bố cục 2 hàng/4 cột và việc nhãn không còn lệch chỉ được xác nhận bằng đọc code bố cục
  (`Box` kích thước cố định cho mọi ngày) và test sẵn có không vỡ (`testTag` của từng ngày/ring
  không đổi), chưa có ảnh chụp màn hình thật.

## Workout detail: 5 lỗi phát hiện khi review trên máy thật (splits trùng pace, HR chart trùng lặp, MAC thô, HR-zone thiếu track, chart nuốt vuốt dọc) (D-1206)

- **D-1206** · 2026-11-12 · `feature/activity` (`WorkoutDetailScreen.kt`, `WorkoutDetailViewModel.kt`,
  `Fakes.kt`, `strings.xml` EN+VI), `core/demo/.../detail/SyntheticWorkoutDetailGenerator.kt`,
  `core/domain/.../repository/SyntheticWorkoutDetailSource.kt`,
  `core/demo/.../detail/DemoSyntheticWorkoutDetailSource.kt`,
  `core/designsystem/.../component/HealthCharts.kt` — **Chốt**

  **1. Bảng splits: cả 5 split "5'53" giống hệt nhau, chỉ split #1 có thanh pace.**
  Nguyên nhân thật nằm ở `SyntheticWorkoutDetailGenerator` (D-1195/D-1197), không phải ở công thức vẽ
  thanh: `generateLaps` cũ chia biên lap theo `secondBoundariesFromDistanceShares` — chia đều thời
  gian theo **tỉ lệ quãng đường ở pace trung bình cả buổi**, hoàn toàn không đọc `samples` (vốn đã có
  pace dao động 5'40"–6'10" qua `splitFactor`/noise) — nên mọi lap 1km full đều ra đúng cùng một số
  giây. Sửa tận gốc: `secondBoundariesFromSampleDistance` (hàm mới) tích phân hình thang tốc độ của
  chính `samples` đã sinh thành đường quãng đường tích luỹ, rồi nội suy đúng giây mà đường đó cắt mỗi
  mốc `k×lapMeters` — y hệt cách `WorkoutSplits.fromSamples` (core/domain, D-1201) làm, chỉ là bản
  độc lập vì hàm đó `private`. Kèm theo: `lapDistances` của nhánh split-theo-khoảng-cách đổi sang
  `fixedLapDistanceShares` (mục tiêu cố định lapMeters/lap, phần dư ở lap cuối) thay vì
  `distanceShares` (tỉ lệ theo thời lượng) — nếu không đổi, quãng đường mỗi lap sẽ lệch khỏi "đúng
  1km" ngay khi thời lượng lap bắt đầu dao động thật. Bất biến giữ nguyên (test xác nhận): tổng quãng
  đường = `Workout.distanceMeters` (chính xác, không chỉ ±1m), tổng thời lượng = `Workout.duration`
  (chính xác), tổng kcal = `activeKcal` (chính xác), determinism qua seed.
  Phần vẽ thanh (`WorkoutDetailScreen.kt`) tách ra hàm thuần `splitBarFraction(durationSeconds,
  minSeconds, maxSeconds)` (trước đây nằm trực tiếp trong `SplitRow`) để có unit test JVM riêng, giữ
  nguyên công thức floor 0.12f + trường hợp suy biến (mọi split bằng nhau → full bar mọi dòng, không
  còn rủi ro chia 0/0 ra bar rỗng) — hành vi không đổi, chỉ tách để test được độc lập với bug sinh dữ
  liệu ở trên.

  **2. Hai biểu đồ nhịp tim trùng nhau**: card "Heart rate" đầu trang vẫn vẽ `HealthRangeChart` cũ
  (chấm rời từ stream HR theo phút) + dòng "Average 151 · lowest 148 · highest 156" tính thuần từ
  `sampleStats` (stream phút), trong khi card "Trends" có `HealthLineChart` mới (D-1202, có dải vùng
  nhịp tim) vẽ lại **cùng nội dung nhịp tim** từ `sampleHeartRateSeries` — avg/max của 2 nơi lệch nhau
  vì khác nguồn (grid dùng `workout.avgHeartRate`/`maxHeartRate` = 154/167, card HR dùng `sampleStats`
  = 151/156). Sửa: gộp về đúng 1 biểu đồ — card "Heart rate" (giữ `testTag="workout_hr_chart"` cho
  E2E) giờ dùng `HealthLineChart` với dải vùng nhịp tim + optional `referenceValue`, chọn nguồn tốt
  nhất (`sampleHeartRateSeries` nếu có dữ liệu, else `heartRate` stream phút — đúng quy tắc
  `hasHeartRateChart` mới trong `WorkoutDetailViewModel`: `sampleHeartRateSeries.any{hasData} ||
  heartRate.any{hasData}`); card "Trends" bỏ hẳn nhánh vẽ HR (`hasSampleTrend` cũng bỏ điều kiện HR ra
  khỏi OR, chỉ còn pace/elevation/cadence). Dòng tóm tắt avg/min/max đổi sang quy tắc đã có sẵn ở
  `WorkoutDetailUiState.Success` (không tạo quy tắc mới): avg/max ưu tiên `workout.avgHeartRate`/
  `maxHeartRate` (đồng hồ thắng), min luôn lấy từ sample (`workout` không có field min) — khớp đúng
  số với summary grid, chỉ hiện dòng này khi cả 3 giá trị đều có.

  **3. Nguồn thiết bị hiện MAC thô** (`02:DE:30:00:00:01`) ở cả header lẫn card "Source" vì thiết bị
  demo không nằm trong `pairedDevices` (demo watch không phải BLE peripheral thật, không bao giờ được
  pair). Thêm `SyntheticWorkoutDetailSource.isDemoDevice(deviceId)` (interface `core/domain`, implement
  ở `DemoSyntheticWorkoutDetailSource` bằng `deviceId in DemoDeviceIds.ALL`) — đúng pattern
  `@BindsOptionalOf`/`Optional<SyntheticWorkoutDetailSource>` D-1195 đã có sẵn, không cần
  `feature/activity` biết gì về `core/demo`. `WorkoutDetailViewModel` giờ trả `source:
  WorkoutSourceDisplay` (sealed: `Paired(name, brand)` / `Demo` / `Unknown(deviceId: String?)`) thay vì
  `String?` thô. UI: header bỏ hẳn dòng nguồn (trước đây hiện ở cả 2 nơi); card "Source" là nơi duy
  nhất còn lại — headline là tên thân thiện ("Tên · Hãng" / "Demo watch"/"Đồng hồ demo" / "Thiết bị
  không xác định"), MAC chỉ còn là `supportingContent` nhỏ và **chỉ khi** `Unknown` (ẩn hẳn với
  `Paired`/`Demo`). Chuỗi mới `source_demo_watch` (EN "Demo watch", VI "Đồng hồ demo") ở cả 2
  `strings.xml` theo đúng quy ước song ngữ D-1192.
  **Theo dõi riêng (không sửa trong lần này — ngoài phạm vi `feature/activity`/`core/domain`/
  `core/demo`/`core/designsystem` coordinator giao)**: `app/src/androidTest/.../WorkoutsE2ETest.kt`
  hiện assert text chứa `DemoDevice.ADDRESS` (MAC thô) bên trong node `workout_source` — sau thay đổi
  này test đó sẽ fail khi chạy thật (giờ hiện "Demo watch"/"Đồng hồ demo" thay vì MAC), cần agent phụ
  trách `app/*` cập nhật assertion. `app/src/androidTest` đang nằm ngoài phạm vi được giao cho lần sửa
  này (coordinator giao vùng đó cho nhóm agent khác chạy song song), và test này không chạy trong lần
  verify Gradle hiện tại (`testDebugUnitTest`, không phải androidTest) nên không chặn build.

  **4. Hàng vùng nhịp tim 0 phút chỉ hiện 1 chấm tròn trôi nổi, không có track.** Nguyên nhân: Material3
  `LinearProgressIndicator` bản mới có hành vi gap/stop-indicator riêng quanh `progress == 0f` khiến
  track không vẽ, chỉ còn chấm đầu mút. Sửa: bỏ hẳn `LinearProgressIndicator`, thay bằng `Box` tự vẽ
  track (nền `surfaceVariant`, luôn hiện đủ mọi dòng kể cả 0 phút) + `Box` con là phần tô màu theo
  `fillMaxWidth(fraction)` (chỉ vẽ khi `fraction > 0f`) — bố cục mọi dòng giờ nhất quán, màu tô vẫn tỷ
  lệ thuận với thời lượng vùng.

  **5. Vuốt dọc bắt đầu trên biểu đồ bị nuốt, không cuộn được trang.** `chartScrubGestures`
  (`core/designsystem/.../HealthCharts.kt`, dùng chung bởi `HealthBarChart`/`HealthRangeChart`/
  `HealthLineChart`) dùng `detectDragGestures` (nhận mọi hướng) — tiêu thụ pixel đầu tiên của BẤT KỲ
  thao tác kéo nào, kể cả kéo dọc định cuộn trang, nên `Modifier.verticalScroll` của
  `WorkoutDetailContent` không bao giờ nhận được gesture nếu ngón tay bắt đầu trên 1 trong 4-5 biểu đồ
  (HR/pace/cadence/elevation) — đúng mọi biểu đồ trên màn workout detail vì không cái nào set
  `scrubEnabled = false`. Sửa: đổi sang `detectHorizontalDragGestures` — chỉ nhận gesture sau khi vượt
  ngưỡng trượt NGANG, nên một cú kéo dọc không bị tiêu thụ và được nhường cho `verticalScroll` của
  Column cha. Tap-to-scrub (`detectTapGestures`) giữ nguyên không đổi.

  **Test mới (24, toàn bộ pass)**: `SyntheticWorkoutDetailGeneratorTest` +5 (lap full dao động thời
  lượng theo pace mẫu — đúng bug báo cáo 5.10km/30 phút, lap distance vẫn đúng mục tiêu cố định dù
  thời lượng đổi, bộ bất biến đầy đủ cho đúng case 5.10km/30 phút, 1 test xác suất qua 20 seed xác
  nhận có dao động pace lap-to-lap). `WorkoutDetailScreenTest` (file mới, 5 — `splitBarFraction`:
  nhanh nhất full bar, chậm nhất có floor 0.12, tuyến tính giữa khoảng, trường hợp suy biến mọi split
  bằng nhau vẫn full bar mọi dòng, không chia 0/0). `WorkoutDetailViewModelTest` +7 (2 test cũ sửa lại
  theo kiểu `WorkoutSourceDisplay` mới; demo device → `Demo`; paired thắng demo; không có synthetic
  source → `Unknown` dù id giống demo; avg/max theo đồng hồ còn min theo sample — đúng case báo cáo
  154/167 vs 151/156; HR chart hiện được chỉ từ sample dày, không cần stream phút).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest assembleDebug
  -x :driver:xiaomi:testDebugUnitTest` → **BUILD SUCCESSFUL** cả 2. 919 test tổng cộng toàn repo qua
  117 file `TEST-*.xml` (`testDebugUnitTest` + JVM `test` của `core:domain`/`core:model`), **0 file
  nào thiếu `failures="0" errors="0"`**. `feature/activity/build/generated/ksp/debug/java/
  hilt_aggregated_deps` có đúng 2 file `*ViewModel_HiltModules_BindsModule.java`
  (`ActivityViewModel`, `WorkoutDetailViewModel`) — không gặp flake KSP. `./gradlew
  :app:compileReleaseKotlin -x :driver:xiaomi:compileReleaseKotlin` BUILD SUCCESSFUL — xác nhận
  `Optional<SyntheticWorkoutDetailSource>` (thêm method mới `isDemoDevice`) vẫn resolve sạch ở graph
  release, không kéo `:core:demo`. `./gradlew :app:compileDebugAndroidTestKotlin -x
  :driver:xiaomi:compileDebugKotlin` BUILD SUCCESSFUL — E2E vẫn biên dịch được (xem mục 3 về
  assertion cần cập nhật sau, không phải lỗi biên dịch). Không test trên emulator/adb theo đúng chỉ
  đạo (không dùng emulator/adb, chỉ Gradle build + unit test) — mục 5 (gesture) và phần hiển thị
  track mục 4 chỉ xác minh bằng đọc code + test logic thuần, chưa chụp màn hình thật.

- **D-1207** (2026-11-12, **Chốt**): Ảnh lệch tỷ lệ khung hình → nền mờ cùng ảnh thay vì viền trống/
  nền sai màu (gear card ảnh nền xám trong card trắng/xám, thấy viền 2 bên).

  Thêm composable dùng chung mới `BlurFillAsyncImage`
  (`core/designsystem/.../component/BlurFillAsyncImage.kt`, D-1109: Coil chỉ sống ở
  `core/designsystem`) — lớp nền cùng `model`, `ContentScale.Crop`, mờ `Modifier.blur(24dp)` (API 31+,
  dùng `RenderEffect`; có scrim đen 35% để chữ/foreground nổi hơn), lớp trước `ContentScale.Fit`. Chỉ
  vẽ nền mờ khi tỷ lệ khung hình ảnh đã tải lệch tỷ lệ container >5% (`aspectRatioMismatch`, đo từ
  `BoxWithConstraints` + `AsyncImage.onSuccess`'s intrinsic size) — và chỉ khi `contentScale == Fit`:
  caller xin thẳng `Crop` (ví dụ `GearImage`'s variant thumbnail 56dp) nghĩa là chủ ý fill-crop, không
  bao giờ thêm nền mờ cho trường hợp đó vì Crop vốn không bao giờ chừa khoảng trống. Dưới API 31
  (`Modifier.blur` no-op): nền đặc màu trung bình (`averageColor`, mean từng kênh RGB) tính từ bitmap
  downsample rẻ 16×16 qua Coil (`size(16,16)` + `allowHardware(false)`) — không thêm dependency nặng
  (`androidx.palette` chưa có trong app) chỉ để lấy màu chủ đạo. Một `ImageRequest` duy nhất (model +
  size tường minh từ constraints đo được) dùng chung cho cả 2 lớp để Coil dedupe/cache, không tải ảnh
  2 lần.

  3 file gọi: `GearImage.kt` (ảnh có `imageUrl` → `BlurFillAsyncImage`; fallback icon khi null giữ
  nguyên, không đổi), `TrainingHeroImage.kt` (đổi sang gọi `BlurFillAsyncImage`, nhưng `contentScale`
  default vẫn `Crop` như cũ nên hành vi hiện tại không đổi — chỉ gộp code dùng chung, sẵn sàng cho
  caller tương lai muốn `Fit`), `RaceCoverImage.kt` (nhánh "near-square" — vốn đã tự giải quyết đúng
  bug này bằng cơ chế riêng từ D-1150/1142 — đổi gọi `RaceImageBackdrop` cũ sang `ImageBackdropLayer`
  mới (cùng file `BlurFillAsyncImage.kt`, internal) để có luôn fallback màu trung bình dưới API 31;
  **không** route qua `BlurFillAsyncImage` tự-detect ở nhánh này — vì container của `RaceCoverImage`
  tự đổi aspect ratio bằng `animateFloatAsState` nên nếu để `BlurFillAsyncImage` tự đo lệch tỷ lệ theo
  thời gian thực sẽ bắt được lệch tạm thời trong lúc animation đang chạy, chớp nền mờ bật-tắt ở MỌI ảnh
  không-vuông chứ không chỉ ảnh vuông). `RaceCard.kt`'s `RaceImageBackdrop`/`RaceHeroImage` (nền mờ
  toàn-card trang trí, D-1136/1142) **không đổi** — mục đích khác (trang trí, không phải lấp khoảng
  trống do lệch tỷ lệ), và D-1136 đã chốt rõ "không cần fallback thủ công" cho trường hợp đó.

  Test mới (10, JVM thuần, `BlurFillAsyncImageTest.kt`): `aspectRatioMismatch` (khớp chính xác → false,
  lệch 1% dưới ngưỡng → false, lệch >5% → true như case ảnh vuông trong card 4:5, ngưỡng tuỳ chỉnh,
  không bao giờ true với tỷ lệ ≤0), `backdropRenderStyleFor` (API 31/36 → blur, API 30/26 → màu trung
  bình), `averageColor` (toàn bộ pixel đỏ → đỏ chính xác, nửa đen nửa trắng → xám 50%, mảng rỗng → đen
  không crash).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :core:designsystem:testDebugUnitTest
  :core:designsystem:compileDebugKotlin` BUILD SUCCESSFUL, 10/10 test qua. `./gradlew
  :feature:training:compileDebugKotlin :feature:races:compileDebugKotlin` BUILD SUCCESSFUL.
  `:feature:gear:compileDebugKotlin` fail nhưng vì lỗi không liên quan của agent khác đang sửa song
  song (`GearCardDisplay`/`GearItem` type mismatch trong `GearViewModel.kt`/`GearScreen.kt`, không
  đụng gì tới `GearImage`'s signature) — đã xác nhận không phải do thay đổi này.

- **D-1208** (2026-11-12, **Chốt**): Soát virtualization cho mọi màn hình cuộn ngoài `feature/gear`/
  `feature/devices` (agent khác đang sửa song song).

  Kết quả soát: `feature/home` (`HomeScreen`'s `Summary`, `MetricDataScreen`, `MetricDetailScreen`),
  `feature/activity` (`ActivityScreen`, `WorkoutDetailScreen`), `feature/races` (`RacesScreen`,
  `RaceDetailScreen`), `feature/training` (`TrainingScreen`, `TrainingCalendarScreen`,
  `RunningFormScreen`), `feature/profile` (`ProfileScreen`, `NotificationSettingsScreen`),
  `feature/onboarding` (`OnboardingScreen`) — hầu hết **đã** đúng: danh sách có thể dài (feed Home,
  toàn bộ data điểm `MetricDataScreen`, workout theo tháng `ActivityScreen`, races `RacesScreen`, kế
  hoạch tập `TrainingScreen`/lịch tập `TrainingCalendarScreen`) đều đã là `LazyColumn`/`LazyRow` với
  `items(..., key = ...)`, không có `LazyColumn` lồng trong `verticalScroll` ở đâu. Màn hình còn lại
  (`MetricDetailScreen`, `WorkoutDetailScreen`, `RaceDetailScreen`, `RunningFormScreen`,
  `ProfileScreen`, `NotificationSettingsScreen`, `OnboardingScreen`) dùng `Column` + `verticalScroll`
  thuần — đúng đắn vì nội dung cố định/giới hạn (vài card/row cố định, không phải danh sách dài theo
  dữ liệu người dùng — ví dụ `WorkoutDetailScreen`'s splits tối đa ~42 dòng cho 1 marathon, vẫn nằm
  trong 1 `Card` cố định chứ không lồng `LazyColumn` thứ 2 bên trong `verticalScroll` ngoài, tránh đúng
  lỗi nested-scroll task brief cảnh báo; `ProfileScreen`/`EditFeedCardsDialog`'s list card cũng cố định
  theo số `HealthMetricType`, không phải tăng theo dữ liệu).

  2 chỗ sửa thật:
  1. `MetricDataScreen.kt` (`feature/home/detail`): `itemsIndexed(rows)` thiếu `key` — list này là
     "Show All Data" của 1 metric, có thể hàng nghìn sample thô. Thêm `key = { index, row ->
     "${row.reading.time}_${row.reading.sourceId}_$index" }` (time+source+index, vì
     `MetricReading` không có id riêng) để ổn định danh tính item qua recomposition thay vì chỉ dựa vị
     trí mặc định.
  2. `ActivityScreen.kt`: header theo tháng (`SectionHeader` mỗi tháng) trước đó là `item(key =
     "month_...")` thường — đổi sang `stickyHeader(key = "month_...")` (`ExperimentalFoundationApi`,
     có `Modifier.background(colorScheme.surface)` để không lộ nội dung cuộn phía dưới xuyên qua chữ)
     để tên tháng hiện tại ghim ở đầu trong lúc cuộn qua các workout của tháng đó, giống kiểu danh bạ/
     sao kê dài — đúng yêu cầu "sticky month headers" của task brief cho đúng 1 trong 2 màn hình ưu
     tiên (`ActivityScreen`/`MetricDataScreen`; `MetricDataScreen` không có header nhóm theo tháng nên
     không áp dụng — không tự thêm tính năng nhóm tháng mới ngoài phạm vi "virtualize").

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew testDebugUnitTest -x
  :driver:xiaomi:testDebugUnitTest -x :feature:gear:testDebugUnitTest -x :app:testDebugUnitTest` BUILD
  SUCCESSFUL — 118 file `TEST-*.xml`, 0 file thiếu `failures="0" errors="0"`.
  `:core:designsystem:assembleDebug :feature:home:assembleDebug :feature:activity:assembleDebug
  :feature:training:assembleDebug :feature:races:assembleDebug` BUILD SUCCESSFUL. KSP Hilt: mỗi
  `feature/*` có đủ `*ViewModel_HiltModules_BindsModule.java` tương ứng trong
  `build/generated/ksp/debug/java/hilt_aggregated_deps`, không flake. `feature:gear`/`app` không chạy
  được (agent khác đang sửa song song, lỗi không liên quan tới thay đổi của task này) — đúng theo chỉ
  đạo verify từng module riêng khi module ngoài phạm vi đang vỡ.

## Pill bottom nav: tap không chuyển tab sau khi quay lại từ detail đã cuộn (D-1209)

- **D-1209** · 2026-11-12 · `app/src/main/kotlin/com/unified/health/ui/UnifiedHealthApp.kt` — **Chốt**
  **Số thật là D-1209** — code comment trong `UnifiedHealthApp.kt` đang ghi "D-1205" (viết lúc sửa,
  trước khi biết agent khác đã chiếm số đó cho batch fix `feature/home`) — không sửa lại comment
  (chi phí cao, không đáng), ghi rõ ở đây theo đúng tiền lệ D-1189/D-1190/D-1200/D-1201.

  **Repro (user báo trên máy thật)**: Activity tab → mở 1 workout detail → cuộn trong detail → hệ
  thống BACK → về main pager hiện Home (không phải Activity) → bấm "Devices"/"Profile" trên pill
  không có phản ứng gì, dù uiautomator dump thấy item `clickable=true enabled=true`, trong khi vuốt
  ngang trên pager vẫn đổi trang bình thường.

  **Điều tra**: đọc kỹ `UnifiedHealthApp.kt`/`PillBottomNavigation.kt`/`MainPagerDestination.kt`/
  `EdgeGestureExclusion.kt` — `pagerState`/`coroutineScope`/`switchTab` đều hoist ở `UnifiedHealthApp`
  (trên `NavHost`, đúng kiến trúc D-1052 để sống sót qua push/pop detail), không tìm thấy đường code
  nào thật sự gọi lại `pagerState.scrollToPage(0)`/tạo `rememberPagerState` lần 2 — tức hiện tượng
  "về Home" không tái lập được bằng cách đọc code tĩnh (không có thiết bị thật để trace runtime theo
  đúng giới hạn môi trường agent). **Nguyên nhân gốc tìm được và sửa được, giải thích đúng phần "tap
  không ăn"**: `scrollFadeConnection` (D-1134/D-1149) gắn trên `Modifier` của *toàn bộ* `NavHost`, nên
  vẫn phản ứng với scroll ngay cả khi đang ở 1 detail screen (pill không hiện) — cuộn trong detail có
  thể để lại `pillVisible = false` làm "rác" từ trước. Khi bấm back, `onMainPager` bật lại `true` ngay
  trong cùng 1 lần recompose mà `pillVisible` vẫn còn `false` (vì `LaunchedEffect(onMainPager)` reset
  nó về `true` chỉ chạy ở effect phase *sau* lần compose đó) — và trước đây `PillBottomNavigation`
  được compose có điều kiện qua `if (onMainPager) { ... }`, nên mỗi lần quay lại main pager nó bị
  **unmount rồi mount lại từ đầu**, làm mất hẳn `animateFloatAsState`'s `Animatable` (D-1134/D-1195)
  — một `Animatable` mới tạo không có giá trị cũ để animate từ, nên `alpha` "snap" thẳng về 0 ngay
  frame đầu tiên đó, rơi đúng vào điều kiện early-return của D-1195
  (`if (!visible && alpha <= 0f) return`) — pill không compose `Surface`/items ở đúng frame mà user
  dễ bấm nhất ngay sau khi back. Đây khớp với mọi triệu chứng đã log được (enabled=true khi dump sau
  đó vì đã tự hồi phục trong frame kế, nhưng cú tap đúng lúc "rỗng" đã bị bỏ qua) — **phần "về Home"
  cụ thể không chứng minh được 100% qua đọc code tĩnh** (pagerState không có đường nào bị reset về 0
  theo những gì tìm thấy), ghi nhận trung thực thay vì đoán — có khả năng là hiểu nhầm của reviewer về
  trạng thái UI trong đúng khung thời gian unmount/remount trên, và được fix gián tiếp bởi chính sửa
  đổi dưới đây (loại bỏ hẳn unmount/remount nên không còn khung thời gian "lạ" đó nữa để quan sát
  nhầm).

  **Sửa (2 thay đổi, cùng gốc)**:
  1. `scrollFadeConnection.onPreScroll` giờ chỉ đổi `pillVisible` khi đang thật sự ở main pager
     (`onMainPager`) — tách thành hàm thuần `pillVisibilityForScroll(onMainPager, availableX,
     availableY, current)`, đọc `onMainPager` qua `rememberUpdatedState` (tránh đúng bẫy "giá trị cũ
     bị đóng băng trong lambda `remember` không key" mà brief gợi ý kiểm tra) — cuộn trong 1 detail
     screen giờ không còn đụng `pillVisible` nữa, nên không còn "rác" nào để đối lúc quay lại.
  2. `PillBottomNavigation` giờ **luôn được compose** (bỏ hẳn `if (onMainPager) { ... }`) —
     `visible` gộp cả 2 điều kiện qua hàm thuần `pillNavVisible(onMainPager, pillVisible)`. D-1195's
     early-return vẫn là cơ chế duy nhất ẩn nó khi ở detail screen, nhưng giờ `animateFloatAsState`'s
     `Animatable` sống xuyên suốt vòng đời app, không bao giờ bị huỷ/tạo lại do điều hướng — loại bỏ
     hẳn lớp bug "mount lại ngay đúng lúc nhạy cảm" thay vì chỉ vá triệu chứng.

  **Test**: `app/src/test/kotlin/com/unified/health/ui/UnifiedHealthAppLogicTest.kt` (7 test JUnit4,
  module `app` trước đây chưa có `src/test` nào) — test trực tiếp 2 hàm thuần trên, bao gồm đúng kịch
  bản repro (cuộn ở detail screen không đổi `pillVisible`, quay lại main pager thấy pill visible ngay
  không cần đợi `LaunchedEffect`).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :app:testDebugUnitTest
  :app:assembleDebug :app:compileDebugAndroidTestKotlin` BUILD SUCCESSFUL cả 3; `app` module: 7/7 test
  pass (`UnifiedHealthAppLogicTest`), 0 fail.

## Devices: ẩn Scan FAB khi đang hiện onboarding card, nâng lên trên pill khi còn hiện (D-1210)

- **D-1210** · 2026-11-12 · `feature/devices/src/main/kotlin/com/unified/health/feature/devices/DevicesScreen.kt` — **Chốt**
  **Số thật là D-1210** — code comment trong file đang ghi "D-1206" (chiếm nhầm số thật của batch fix
  `feature/activity`/`WorkoutDetailScreen` — xem entry D-1206 thật), không sửa lại comment, ghi số thật
  ở đây theo đúng tiền lệ.

  **Vấn đề (review trên máy thật)**: khi chưa pair thiết bị nào, `NoPairedDeviceCard` (D-1200) đã có
  đủ 3 CTA Scan/QR/MAC, nhưng 1 FAB "Scan" riêng vẫn hiện góc dưới-phải — trùng lặp CTA chính, và còn
  bị pill nav nổi (D-1144) che khuất vì `Scaffold`'s FAB chỉ biết tự chừa inset thanh điều hướng hệ
  thống, không biết gì về footprint riêng của `PillBottomNavigation`.

  **Sửa**: FAB giờ **ẩn hẳn** khi chưa có thiết bị pair nào *và* không đang scan (điều kiện
  `!state.isScanning && state.pairedDevices.isEmpty()`) — `NoPairedDeviceCard` là CTA duy nhất lúc đó.
  Khi FAB có lý do để hiện (đang scan → `stop_scan_fab`, hoặc đã có ≥1 thiết bị pair → `scan_fab`, lúc
  này `AddDeviceEntry`/D-1200 là entry point theo từng dòng còn FAB vẫn có chỗ đứng cho "scan lại"),
  thêm `Modifier.padding(bottom = Spacing.bottomNavClearance)` lên chính FAB đó để nó nổi *trên* pill
  thay vì bị che — cùng hằng số `Spacing.bottomNavClearance` (96dp) mà mọi top-level tab khác đã dùng
  cho nội dung cuộn của mình (D-1144), áp lần đầu trực tiếp lên 1 FAB.

  **E2E**: `scan_fab`/`stop_scan_fab` testTag giữ nguyên hành vi khi có pair/đang scan. Khi chưa pair
  (đúng lúc FAB giờ bị ẩn), 7 chỗ trong `app/src/androidTest/kotlin/com/unified/health/e2e/` đang
  `clickTag("scan_fab")` ngay sau onboarding mới (trạng thái chưa pair) — đổi cả 7 sang
  `clickTag("onboarding_scan_button")` (nút Scan của chính `NoPairedDeviceCard`, test tag đã có sẵn từ
  D-1200): `UserJourneyE2ETest`, `DeviceSettingsE2ETest`, `StandardWatchE2ETest`, `ZeppWatchE2ETest`,
  `GarminWatchE2ETest`, `HuaweiWatchE2ETest` (2 chỗ, flow 10 + flow 11). Chỉ compile-check được
  (`:app:compileDebugAndroidTestKotlin`), không chạy thật trên thiết bị (đúng giới hạn môi trường
  agent — coordinator test gộp sau).

  **Việc khác không thuộc quyết định này, làm theo yêu cầu giữa chừng của coordinator**:
  `app/src/androidTest/kotlin/com/unified/health/e2e/WorkoutsE2ETest.kt` — agent xử lý
  `feature/activity`/`WorkoutDetailScreen` (D-1206 thật) đổi Source card từ hiện MAC thô sang nhãn
  thân thiện ("Demo watch"/`R.string.source_demo_watch`); test cũ assert thẳng `DemoDevice.ADDRESS`
  (MAC) trong node `workout_source` nên vỡ giả định — sửa sang đọc qua
  `context.getString(com.unified.health.feature.activity.R.string.source_demo_watch)` (locale-safe,
  không hardcode chuỗi tiếng Anh) thay vì MAC. Không phải quyết định thiết kế của agent này — chỉ cập
  nhật test cho khớp hành vi đã chốt ở nơi khác, ghi lại để truy vết.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:devices:testDebugUnitTest
  :app:assembleDebug :app:compileDebugAndroidTestKotlin` BUILD SUCCESSFUL cả 3; `feature:devices`:
  23/23 test pass (8 `DeviceDetailViewModelTest` + 15 `DevicesViewModelTest`), 0 fail — không test
  riêng cho FAB visibility/offset (thuần UI, không có logic đáng tách ra unit test; verify bằng đọc
  code + build xanh theo đúng giới hạn "không emulator/adb" của agent này).

## Gear: nút "Áp dụng"/"Xoá lọc" trong filter sheet thành nút chính + phụ rõ ràng (D-1211)

- **D-1211** · 2026-11-12 · `feature/gear/src/main/kotlin/com/unified/health/feature/gear/GearScreen.kt` — **Chốt**
  **Số thật là D-1211** — code comment trong file đang ghi "D-1207" (chiếm nhầm số thật của fix tỷ lệ
  khung hình ảnh/blur-fill `core/designsystem`), không sửa lại comment, ghi số thật ở đây.

  **Vấn đề**: hàng action của `GearFilterSheet` (D-1203) là 2 `TextButton` phẳng, căn trái — khó nhận
  ra "Áp dụng" mới là hành động chính của sheet, không có khác biệt thị giác giữa "xác nhận" và
  "reset".

  **Sửa**: "Áp dụng" → `Button` (filled primary) với `Modifier.weight(1f)` (chiếm hết phần còn lại của
  hàng, đọc như CTA chính mặc định của 1 bottom sheet); "Xoá lọc" → `OutlinedButton` cố định bề rộng
  bên cạnh. Vẫn nằm ở cuối `Column` với `navigationBarsPadding()` + `Gaps.sheetPadding` dưới (không
  đổi) — đã ở đúng vị trí "cuối sheet, trên nav bar inset" từ trước. `testTag` `gear_filter_clear`/
  `gear_filter_apply` giữ nguyên.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:gear:testDebugUnitTest
  :app:assembleDebug` BUILD SUCCESSFUL cả 2.

## Gear: bộ lọc Giới tính (Nam/Nữ/Trẻ em) + fallback classifier từ tên sản phẩm (D-1212)

- **D-1212** · 2026-11-12 · `core/model` (`GearItem.kt`), `core/data` (`GearFeedDto.kt`), `core/domain`
  (`GearGenderClassifier.kt` mới, `GearCatalogFilters.kt`), `feature/gear` (`GearViewModel.kt`,
  `GearScreen.kt`) — **Chốt**

  **Dữ liệu thật**: feed `unified_health_service/docs/gear/latest.json` (đọc trực tiếp, read-only, lúc
  viết: 485 item) **đã có sẵn field `gender`** cho 462/485 item (205 women, 199 men, 58 unisex, 0
  kids) — chỉ 23 item không có giá trị, đúng lúc classifier fallback cần chạy.

  **1. Model + DTO**: `GearItem.gender: GearGender? = null` (default để không vỡ mọi call site cũ —
  `core/domain`/`core/data`/`feature/gear` test); `GearGender { MEN, WOMEN, UNISEX, KIDS }`.
  `GearItemDto.gender: String? = null` map 1:1 case-insensitive từ chuỗi feed (`"men"`/`"women"`/
  `"unisex"`/`"kids"`) — **không bao giờ ghi đè** khi feed đã có giá trị; chỉ gọi fallback
  classifier khi feed trả null.

  **2. `classifyGearGender` (`core/domain`, thuần, không phụ thuộc Android/Compose)** — mirror thuật
  toán `classifyGearColor` (D-1203): strip "đ"/"Đ", NFD bỏ dấu, lowercase, tokenize trên
  `[^a-z0-9]+`, quét trái→phải, token khớp đầu tiên thắng. Từ điển đúng phạm vi brief liệt kê:
  women/womens/wmns/nu (="nữ"); men/mens/nam (**nguyên từ, không phải substring** — tokenize đã tự
  đảm bảo điều này); unisex; kids/kid/junior/jr + cụm 2 từ "trẻ em" (lookahead "tre"→"em", giống cách
  `classifyGearColor` xử lý "xanh"). **Đo coverage trên đúng 23 item null-gender thật**: resolve được
  8 (1 "...Unisex Salomon...", 2 "...Men"/"Men's...", 1 "...Women", 4 "trẻ em" — mỗi size 1 tên), 15
  còn lại (bình nước, balo, đai, gaiters...) đúng là tên không có tín hiệu giới tính, để null đúng chủ
  đích chứ không phải thiếu sót. Kiểm tra chéo thêm: 90 item có "Nam"/"Nữ" trong tên (đã có feed
  gender sẵn, classifier không thật sự chạy trên chúng) — không có false positive whole-word nào
  trong catalog này (không có tên kiểu địa danh "Nam Định..." gây nhầm) — ghi rõ trong KDoc đây là
  rủi ro tồn dư đã biết, chấp nhận được của riêng luật "nam nguyên từ", không cố vá thêm ngoài brief.

  **3. Filter logic (`GearCatalogFilters.kt`)**: `matchesGenderFilter(selected)` — null chọn tất cả;
  MEN/WOMEN khớp cả UNISEX (đúng rule brief: "UNISEX items match both Nam and Nữ"); KIDS chỉ khớp
  KIDS (UNISEX không tính là trẻ em); item `gender = null` chỉ bị loại khi có filter giới tính đang
  bật. `hasKidsItems()` — chip "Trẻ em" trong sheet chỉ hiện khi có.

  **4. UI**: section mới "Giới tính" trong `GearFilterSheet` — chip đơn-chọn Tất cả/Nam/Nữ (+Trẻ em
  nếu có kids item). Filter active hiện dưới dạng chip có thể gỡ trong `GearChipRow` đã gộp (D-1213),
  tính vào badge `activeFilterCount`, lưu qua `SavedStateHandle` (`gear_gender_filter`) giống
  category/price/color — sống sót qua process death, kết hợp AND với category/price/color trong
  `GearViewModel.buildSuccess`. `clearPriceAndColorFilters()` đổi tên thành `clearFilters()` (giờ reset
  cả 3: price, color, gender — không đổi category) — rename nội bộ trong cùng file, không ảnh hưởng gì
  bên ngoài module.

  **Test**: `GearGenderClassifierTest` (10 test, `core/domain` — dùng đúng chuỗi tên thật từ feed cho
  cả nhánh resolve-được lẫn null-đúng-chủ-đích lẫn check chéo false-positive); `GearCatalogFiltersTest`
  thêm 5 test cho `matchesGenderFilter`/`hasKidsItems`; `RemoteGearRepositoryTest` thêm 1 test (literal
  feed value thắng fallback, case-insensitive, fallback hoạt động khi feed null); `GearViewModelTest`
  thêm 3 test gender + sửa test `clearFilters` (tên cũ `clearPriceAndColorFilters`) cho khớp.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :core:domain:test
  :core:data:testDebugUnitTest :feature:gear:testDebugUnitTest :app:assembleDebug
  :app:compileDebugAndroidTestKotlin` BUILD SUCCESSFUL cả 5. `core:domain`: 10/10
  `GearGenderClassifierTest` + 17/17 `GearCatalogFiltersTest` (12 cũ + 5 mới) pass. `core:data`: 9/9
  `RemoteGearRepositoryTest` (8 cũ + 1 mới) pass. `feature:gear`: 16/16 `GearViewModelTest` (13 cũ + 3
  mới, trừ 1 đổi tên) pass. Không test nào fail ở module nào.

## Gear: gộp category-chip + active-filter chip thành 1 `ChipRow`, bỏ khoảng trống dọc do touch-target ẩn của Material3 chip (D-1213)

- **D-1213** · 2026-11-12 · `core/designsystem/src/main/kotlin/com/unified/health/core/designsystem/component/ChipRow.kt` (mới),
  `feature/gear/src/main/kotlin/com/unified/health/feature/gear/GearScreen.kt` — **Chốt**

  **Nguyên nhân gốc (review trên máy thật, sau cả D-1204 đã giảm `Gaps.chipRowVertical` 8→4dp)**:
  mọi chip Material3 (`FilterChip`/`InputChip`/...) tuy vẽ ra chỉ cao ~32dp, nhưng mỗi chip tự bọc
  nội dung trong `Modifier.minimumInteractiveComponentSize()`, đệm lên tới `LocalMinimumInteractiveComponentSize`
  (mặc định 48dp) — căn giữa, nên mỗi chip tự cộng thêm ~8dp padding **vô hình** ở cả trên lẫn dưới,
  cộng dồn lên trên bất kỳ padding tường minh nào hàng chip tự khai báo. Gear trước đây có 2 hàng chip
  xếp chồng (category + active-filter) — mỗi hàng tự cộng padding vô hình ở cả 2 phía, nên khoảng cách
  *đọc thấy* giữa 2 hàng lớn hơn nhiều so với con số `Gaps.chipRowVertical` (4dp) mà code khai báo,
  không công cụ đo layout nào chỉ thẳng ra nguyên nhân nếu không biết tra đúng composable.

  **Sửa, 2 phần**:
  1. `ChipRow` (`core/designsystem/component`, mới) — 1 `LazyRow` bọc
     `CompositionLocalProvider(LocalMinimumInteractiveComponentSize provides 0.dp)`, xoá hẳn phần đệm
     vô hình cho mọi chip bên trong. **Đánh đổi a11y có chủ đích, có giới hạn phạm vi** (ghi đầy đủ lý
     do trong KDoc): hướng dọc của touch target co về đúng 32dp vẽ ra — chấp nhận được vì chip trong 1
     hàng ngang không bao giờ xếp chồng lên nhau (không có target cạnh tranh trực tiếp trên/dưới, lý
     do chính 48dp tồn tại), hướng ngang vẫn giữ nguyên (mỗi chip đủ rộng + `Gaps.chipGap` giữa các
     chip). **Không** áp dụng cho chip trong `FlowRow` có thể xuống dòng (ví dụ price/color section
     trong chính `GearFilterSheet`) — ở đó 2 chip thật sự có thể xếp chồng, giữ nguyên 48dp.
  2. `GearScreen.kt`: gộp `CategoryFilterRow` + `ActiveFilterChipsRow` (2 hàm, 2 `LazyRow`/`FlowRow`
     riêng) thành 1 `GearChipRow` duy nhất dùng `ChipRow` — category chip trước, 1 `VerticalDivider`
     (chỉ hiện khi có filter đang active) ngăn cách, rồi tới chip gỡ được (giá/màu/giới tính — D-1212)
     — không còn 2 hàng xếp chồng, nên không còn "2 lần padding vô hình" cộng dồn. Gap app bar → hàng
     chip = `Gaps.screenTop` (qua `AppScreen`'s content padding, không đổi); hàng chip → grid =
     `Gaps.chipRowVertical` duy nhất, không cộng thêm gì (grid's `contentPadding.top = 0.dp`, giữ
     nguyên từ D-1204).
  **Phạm vi**: chỉ `feature/gear` dùng `ChipRow` ở task này — các hàng chip ngang khác trong app
  (races/training/metric-detail range chips...) đang do agent khác xử lý song song (coordinator nói
  rõ), không đụng tới ngoài khai báo component dùng chung sẵn ở `core/designsystem` cho agent đó tái
  sử dụng nếu cần.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :core:designsystem:compileDebugKotlin
  :feature:gear:testDebugUnitTest :app:assembleDebug` BUILD SUCCESSFUL cả 3; `feature:gear`: 16/16 test
  pass, không test nào viết riêng cho `ChipRow` (thuần layout/CompositionLocal, không có logic để tách
  unit test — verify bằng đọc code + build xanh, không có thiết bị thật để chụp màn hình theo đúng
  giới hạn môi trường agent).

## Gear: tối ưu performance lưới cho catalog lớn (486+ item) — stable key/contentType, bỏ tính toán per-item khỏi item lambda (D-1214)

- **D-1214** · 2026-11-12 · `feature/gear/src/main/kotlin/com/unified/health/feature/gear/GearViewModel.kt`,
  `GearScreen.kt` — **Chốt**
  **Số thật là D-1214** — code comment trong 2 file trên đang ghi "D-1209" (chiếm nhầm số thật của
  chính agent này ở entry D-1209 phía trên, pill-nav fix, viết trước khi biết số thật) — không sửa lại
  comment, ghi số thật ở đây.

  **Vấn đề**: `LazyVerticalGrid` của Gear (486+ item thật trên feed) đã có `key = { it.id }` từ trước,
  nhưng mỗi `GearCard` trong item lambda tự gọi `item.firstVariantMatchingColorFamilies(colorFilter)`
  — 1 phép quét `variants` để chọn ảnh hiển thị đúng theo màu đang lọc — **chạy lại mỗi lần recompose
  cho mỗi card đang hiện trên màn**, không chỉ khi `colorFilter` thật sự đổi. `GearItem` cũng có field
  `variants: List<GearVariant>` khiến Compose compiler suy luận nó **unstable** (interface `List`
  không đảm bảo bất biến), nên truyền thẳng `GearItem` vào item composable mất khả năng skip
  recomposition thông minh của Compose.

  **Sửa**: thêm `GearCardDisplay` (data class mới, `feature/gear`, mọi field là
  `String`/`Long?`/nullable-của-chúng — Compose compiler tự suy ra **stable**) — tính sẵn 1 lần cho
  mỗi item trong `GearViewModel.buildSuccess` (chạy lại đúng khi state/filter thật sự đổi, không phải
  mỗi frame recompose): `displayImageUrl`/`displayVariantColor` đã resolve sẵn từ
  `firstVariantMatchingColorFamilies`, không còn gọi lại trong Composable. `GearUiState.Success.items`
  đổi type từ `List<GearItem>` sang `List<GearCardDisplay>`; `GearCard` nhận thẳng
  `GearCardDisplay`, không nhận `colorFilter` nữa. `LazyVerticalGrid`'s `items(...)` thêm
  `contentType = { "gear_card" }` tường minh (mọi cell cùng 1 dạng hôm nay, nhưng khai báo rõ không
  tốn gì và giúp Compose không phải đoán khi tái sử dụng node).

  **`GearImage`/Coil size**: không đụng `core/designsystem`'s `GearImage.kt`/`RaceCoverImage.kt` theo
  đúng chỉ đạo (agent khác đang sửa blur-fill + Coil size ở đó) — `GearCard` vẫn truyền
  `Modifier.fillMaxWidth().aspectRatio(1f)` y như trước, không đổi cách gọi.

  **@Immutable cho `GearItem` gốc**: cân nhắc nhưng **không làm** — `core/model` là pure JVM, thêm
  annotation từ `androidx.compose.runtime` (dù chỉ 1 annotation) phá nguyên tắc module này không phụ
  thuộc framework UI; và dùng `kotlinx.collections.immutable.ImmutableList` cho `variants` sẽ lan
  dependency mới qua `core/domain`/`core/data` chỉ để phục vụ 1 màn hình UI — không đáng so với giải
  pháp đã chọn (tạo riêng 1 UI projection type nhẹ, named rõ, test được như mọi state khác trong
  `GearViewModel`).

  **Test**: không thêm test riêng cho `GearCardDisplay`/`contentType` (thuần đổi type + khai báo
  Compose, không có logic nhánh để test) — `GearViewModelTest`'s 16 test hiện có đã đi qua đường
  `buildSuccess` mới (map sang `GearCardDisplay`) nên xác nhận hành vi filter không vỡ.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:gear:testDebugUnitTest
  :app:assembleDebug :app:compileDebugAndroidTestKotlin` BUILD SUCCESSFUL cả 3; `feature:gear`: 16/16
  test pass.

## Verify gộp cuối cho toàn bộ batch D-1209..D-1214

**Lệnh**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :app:testDebugUnitTest
:feature:devices:testDebugUnitTest :feature:gear:testDebugUnitTest :core:domain:test
:core:data:testDebugUnitTest :core:designsystem:testDebugUnitTest :app:assembleDebug
:app:compileDebugAndroidTestKotlin` → **BUILD SUCCESSFUL** toàn bộ, không cần loại trừ
`:driver:xiaomi` (không đụng module đó, không có conflict lúc chạy). Test-result XML soát thủ công
từng module, không file nào thiếu `failures="0" errors="0"`: `app` 7 (`UnifiedHealthAppLogicTest`,
module trước đây chưa có `src/test`), `feature:devices` 23 (8+15, không đổi so với trước batch),
`feature:gear` 16 (13 cũ + 3 gender mới, trừ 1 rename), `core:domain` 2 file gear mới (10
`GearGenderClassifierTest` + 17 `GearCatalogFiltersTest`, 12 cũ +5) cộng toàn bộ suite cũ không đổi,
`core:data` 9 `RemoteGearRepositoryTest` (8 cũ +1), `core:designsystem` không đổi (không có logic mới
cần unit test ở `ChipRow`). Không test trên emulator/adb — đúng chỉ đạo coordinator test gộp trên máy
thật ở phiên sau.

## Home: chọn 1 ngày trong tuần-mini-rings để xem lại trên vòng lớn, thu nhỏ ring 1/3 (D-1215)

- **D-1215** · 2026-11-12 · `feature/home` (`HomeScreen.kt`, `HomeViewModel.kt`, `HomeDaySelection.kt`
  mới, `strings.xml` EN+VI) — **Chốt**

  **Yêu cầu**: bấm 1 vòng mini trong dải tuần (D-1196/D-1205) để thẻ vòng lớn (`RingsCard`) hiện lại
  đúng Move/Exercise/Steps của ngày đó, có nhãn ngày + nút "Hôm nay" để quay lại, chỉ vòng lớn theo
  lựa chọn (lưới Metrics/Highlights vẫn luôn là hôm nay); thu nhỏ ring mini ~1/3; thêm outline chọn
  phân biệt với marker "hôm nay"; a11y selectable; re-animate vòng lớn khi đổi ngày.

  **1. Logic lựa chọn thuần (`HomeDaySelection.kt`, file mới trong `feature/home`, không phụ thuộc
  Android/Compose/clock)**: `onDayTapped(current, tapped, today)` — ngày tương lai bị từ chối (trả
  nguyên `current`), bấm đúng ngày đang chọn (hoặc bấm hôm nay lúc đang xem hôm nay) toggle về `null`
  (= hôm nay), còn lại chọn `tapped` (chuẩn hoá về `null` nếu `tapped == today`). `onJumpToToday()` =
  `null`. `resolveRestoredSelection(persisted, persistedAsOfToday, today, week)` — phục hồi lựa chọn
  đã lưu qua process death, reset về `null` nếu: không có gì được lưu, **đã sang ngày mới** (so
  `persistedAsOfToday` với `today` — cố ý tách riêng khỏi điều kiện "còn trong tuần", vì 1 ngày có thể
  rời sang hôm sau mà vẫn cùng tuần lịch, brief yêu cầu 2 điều kiện reset độc lập), ngày đã chọn không
  còn nằm trong `week` hiện tại, hoặc nó chính là hôm nay/ở tương lai (chuẩn hoá phòng thủ). Bất biến
  xuyên suốt: `selectedDate == hôm nay` không bao giờ xảy ra (luôn là `null`), nên marker "hôm nay"
  (backdrop `primaryContainer` + nhãn đậm + chấm tròn, D-1196) và outline "đang chọn" (mục 3) không
  bao giờ cùng hiện trên 1 ngày — đúng theo cấu trúc dữ liệu, không cần check UI riêng.
  Test thuần (`HomeDaySelectionTest`, 13 case): toggle về hôm nay (bấm lại ngày đang chọn, bấm hôm nay
  lúc đang chọn ngày khác, bấm hôm nay lúc đang xem hôm nay), tương lai bị từ chối, phục hồi hợp lệ,
  reset khi sang ngày mới dù còn cùng tuần, reset khi ra khỏi tuần, chuẩn hoá hôm nay/tương lai lúc
  phục hồi.

  **2. `HomeViewModel`**: thêm `SavedStateHandle` vào constructor (theo đúng mẫu
  `GearViewModel`/D-1203 — `getStateFlow`/`savedStateHandle[key] = value`, `LocalDate` là
  `Serializable` nên lưu thẳng, không cần chuyển sang `String`). 2 key: `home_selected_date` (lựa
  chọn) + `home_selected_as_of_today` (ngày "hôm nay" lúc lưu, để `resolveRestoredSelection` phân biệt
  "sang ngày mới" khỏi "còn trong tuần"). `HomeUiState.Success` thêm `selectedDate: LocalDate?` (giải
  quyết trong bước `combine` cuối cùng của `uiState`, dựa trên `state.week` đã gắn ở bước trước đó —
  không subscribe `week` flow lần 2) và computed property `selectedDaySummary` (lấy từ `week` theo
  `selectedDate`, mặc định về `summary` khi `null` — **cố ý trả đúng cùng 1 object `summary` như
  trước khi có feature này khi đang xem hôm nay**, đúng yêu cầu "vòng lớn cho hôm nay phải y hệt như
  trước"). `selectDay(date)`/`jumpToToday()` đọc `uiState.value` (đã có `week`) để lấy "hôm nay" từ
  `WeekActivityDay.isToday` thay vì gọi `LocalDate.now()` riêng — không bao giờ lệch với tuần/vòng lớn
  đang hiển thị. `HomeViewModelTest` thêm 6 case (chọn ngày đổi `selectedDate`+`selectedDaySummary`,
  hôm nay giữ nguyên `selectedDaySummary == summary`, bấm lại toggle về hôm nay, `jumpToToday`, chọn
  tương lai bị từ chối, lựa chọn sống sót qua tạo lại ViewModel từ cùng `SavedStateHandle` — mô phỏng
  process death) — 4 case có ngày phụ thuộc "hôm nay" thật (`LocalDate.now()`) được bọc
  `firstOrNull { ... } ?: return@runTest` phòng trường hợp hiếm chạy đúng thứ Hai (không có ngày nào
  vừa quá khứ vừa không phải hôm nay trong tuần).

  **3. UI (`HomeScreen.kt`)**: `RingsCard` nhận thêm `selectedDate`/`onJumpToToday` — khi
  `selectedDate != null` hiện 1 `Row` phía trên vòng (nhãn ngày qua `selectedDayLabel()` +
  `TextButton` "Hôm nay"/"Today", `testTag` riêng `selected_day_label`/`jump_to_today`), còn lúc xem
  hôm nay thì không có hàng này — y hệt bố cục cũ. `ActivityRings` bọc trong
  `key(selectedDate) { ... }` — đổi ngày tạo lại composable, `LaunchedEffect(Unit)` trong
  `ActivityRings` (`core:designsystem`, D-1157, không đụng file đó) tự chạy lại intro animation có
  sẵn từ 0 tới progress ngày mới, tái dùng animation hiện có thay vì viết animation riêng; hôm nay thì
  key không đổi nên không tự re-animate khi có recomposition không liên quan (vd nhịp tim live).
  **Nhãn ngày** (`selected_day_label`, string resource riêng, không dùng chung `week_ring_mon..sun`
  vì cần dạng đầy đủ hơn — VI "Thứ 3" thay vì "T3"): bản EN `"%1$s, %4$s %2$d"` → "Tue, Nov 10" (tên
  tháng viết tắt tiếng Anh từ `LocalDate.month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH)`, tính
  thuần Kotlin, không phụ thuộc locale máy); bản VI `"%1$s, %2$02d/%3$02d"` → "Thứ 3, 10/11" (thuần số
  dd/mm, không cần tên tháng) — 2 template dùng tập argument-index khác nhau (EN bỏ qua %3, VI bỏ qua
  %4), hợp lệ với `String.format`/Android resource compiler, không có cấu hình `lint` chạy trong
  `testDebugUnitTest`/`assembleDebug` nên không ảnh hưởng lệnh verify.

  **Mini rings (`WeekRingsStrip`/`WeekRingsRow`/`DayRing`)**: `WEEK_RING_SIZE` 76dp→50dp,
  `WEEK_RING_STROKE` 6dp→4dp, `WEEK_RING_BOX_SIZE` 80dp→54dp (thu nhỏ ~1/3, giữ nguyên tỷ lệ D-1205
  đã lập) — 2 hàng 4 cột đều nhau giữ nguyên, cột vẫn cùng kích thước/baseline cố định (D-1205 fix
  không bị phá). Outline chọn: `Box` viền `WEEK_RING_SELECTION_OUTLINE_WIDTH` (2dp) màu `primary`,
  `CircleShape`, vẽ ở đúng `WEEK_RING_BOX_SIZE` bên trong `Box` cố định — không đổi kích thước
  cột/box khi chọn, chỉ vẽ thêm bên trong, đúng yêu cầu "outline vẽ trong box cố định". Mỗi ngày bọc
  `Modifier.sizeIn(minWidth/minHeight = Spacing.minTouchTarget)` (48dp) +
  `Modifier.selectable(selected, enabled = !isFuture, role = Role.Tab, onClick)` rồi mới tới
  `clearAndSetSemantics` sẵn có (D-1196) — thứ tự modifier này cố ý: `selectable` là node cha (tự
  `mergeDescendants = true`), `clearAndSetSemantics` là node con thay thế semantics của `Canvas` bên
  trong bằng 1 khối duy nhất; node cha gộp cả 2 lại thành 1 node a11y duy nhất mang đủ role/selected/
  click action (từ `selectable`) **và** `contentDescription`/`stateDescription` (từ khối
  `clearAndSetSemantics`) — không cần khai lại role/selected thủ công trong khối đó.
  `stateDescription` mới (`week_ring_state_selected` "Selected"/"Đã chọn") hiện khi `isSelected`,
  dùng lại `selected_day_today_action` ("Today"/"Hôm nay") khi `isToday` — tách khỏi
  `contentDescription` (giữ nguyên, D-1196) để TalkBack đọc đúng như trạng thái, không phải tên.
  Ngày tương lai: `enabled = false` trên `selectable` nên không có ripple/click, kể cả qua a11y
  (không có `onClick` action nào được set khi future).

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :feature:home:testDebugUnitTest
  :feature:home:assembleDebug` → **BUILD SUCCESSFUL** cả 2 lần chạy (lần đầu sau khi viết code, lần 2
  sau khi đổi toàn bộ comment từ "D-1216" — số tạm lúc viết code, trước khi đọc lại file này — về
  đúng "D-1215"). `feature:home`: 39 test, 0 fail (`HighlightCardBodyTest` 5, `HomeDaySelectionTest`
  13 mới, `HomeViewModelTest` 13 — 7 cũ + 6 mới, `MetricInsightTextTest` 8). `hilt_aggregated_deps` có
  đủ 3 `*ViewModel_HiltModules_BindsModule.java` (`HomeViewModel`/`MetricDetailViewModel`/
  `MetricDataViewModel`). Không chạy `:app:assembleDebug` (app module đang do agent khác sửa
  `UnifiedHealthApp.kt`/`PillBottomNavigation.kt` song song, đúng chỉ đạo coordinator chỉ verify module
  riêng); không đụng emulator/adb (agent khác đang debug trên đó) — bố cục outline/nhãn ngày/animation
  chỉ xác nhận bằng đọc code + build xanh + test logic lựa chọn, chưa có ảnh chụp màn hình thật.

## Pill bottom nav: tap không chuyển tab ngay sau khi mở app (race `onMainPager` lúc khởi động) (D-1216)

- **D-1216** · 2026-11-12 · `app/src/main/kotlin/com/unified/health/ui/UnifiedHealthApp.kt` — **Chốt**

  **Bug (vẫn còn sau D-1209..D-1214)**: trên máy thật, mở app xong, bấm 1 tab pill nav (Activity/
  Devices/Profile) ngay khi Home vừa hiện — không chuyển tab (vuốt ngang trên pager vẫn hoạt động
  bình thường). `uiautomator` dump sau đó cho thấy các item pill `clickable=true`/`enabled=true`,
  bounds đúng, Home đang `selected` — tức là lúc *kiểm tra* thì mọi thứ trông bình thường; bug chỉ xảy
  ra trong đúng khoảnh khắc chạm, không để lại dấu vết.

  **Cách tìm nguyên nhân**: thêm tạm `Log.d` vào `PillNavItem.onClick`, `switchTab`, và
  `snapshotFlow { pagerState.currentPage }`, chạy `adb logcat` qua ~50 lần mở app sạch (force-stop +
  start) rồi bấm pill ngay khi Home vừa render ổn định (chờ 2 frame liên tiếp giống hệt kích thước qua
  `screencap`, để loại trường hợp chụp trúng frame cũ còn sót lại lúc activity đang chuyển — artifact
  của chính kịch bản test, không phải bug thật). Log bắt được:
  ```
  recompose: backStackEntry=null destination=null onMainPager=false
  PillBottomNavigation visible param = false (onMainPager=false, pillVisible=true)
  pagerState.currentPage changed -> 0
  recompose: backStackEntry=... route=MainPagerDestination onMainPager=true
  PillBottomNavigation visible param = true (onMainPager=true, pillVisible=true)
  ```
  — khoảng ~200ms giữa dòng 1 và dòng 4 trên emulator (nhiều khả năng dài hơn trên máy thật chậm hơn/
  cold start nặng hơn, CPU yếu hơn, GC/JIT warmup).

  **Nguyên nhân gốc**: `navController.currentBackStackEntryAsState()` trả về `null` trong (những)
  frame đầu tiên sau khi `UnifiedHealthApp` vào composition — back stack entry của `NavHost` chỉ trở
  thành "current" sau khi nó đạt lifecycle `RESUMED`, việc này xảy ra sau, không phải *trong*, lần
  compose đầu tiên của chính `UnifiedHealthApp`. Code cũ `currentDestination?.hasRoute(...) == true`
  biến `null` thành `false`, nên `onMainPager` báo sai "không ở main pager" đúng trong khoảng ~200ms+
  đó — feed thẳng vào `pillNavVisible(onMainPager, pillVisible)` (D-1205) khiến cả thanh pill bị ẩn/vô
  hiệu hoá đúng lúc Home vừa xuất hiện, tức đúng lúc người dùng dễ bấm nhất. `PillBottomNavigation`
  với `visible=false`: hoặc không compose `Surface` luôn (`if (!visible && alpha <= 0f) return`,
  D-1195) hoặc disable `selectable` của từng item — cả 2 đường đều khiến `onSelect` không bao giờ
  được gọi, không có dấu hiệu thị giác nào cho thấy có vấn đề (`uiautomator` kiểm tra sau đó luôn thấy
  bình thường vì khoảng hẫng đã đóng lại từ lâu). `BackHandler`/`EdgeGestureExclusion` (cũng đọc
  `onMainPager`) bị ảnh hưởng tương tự nhưng ít thấy hơn (back hiếm khi bấm trong đúng 200ms đầu).

  **Sửa**: thay `== true` bằng `?: !startWithOnboarding` — khi back stack entry thật sự chưa kịp
  resolve (`currentDestination == null`), dùng đúng destination đã biết trước (`startWithOnboarding`,
  đã capture 1 lần ở trên) thay vì mặc định sai thành "không phải main pager". `currentDestination`
  chỉ từng là `null` trong đúng khoảng hẫng khởi động này (không bao giờ null lại sau khi `NavHost` đã
  chạy), nên đây là giá trị đúng, không phải đoán.

  **Verify**: `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :app:testDebugUnitTest
  :app:compileDebugAndroidTestKotlin :app:assembleDebug` → **BUILD SUCCESSFUL** cả 3;
  `UnifiedHealthAppLogicTest` 7/7 pass (không đổi, 2 hàm thuần `pillVisibilityForScroll`/
  `pillNavVisible` D-1205 không bị đụng, fix chỉ ở điểm gọi). Log tạm đã gỡ sạch khỏi
  `UnifiedHealthApp.kt`/`PillBottomNavigation.kt` sau khi xác nhận.
  Kiểm chứng trên emulator bằng log `onMainPager` qua nhiều vòng mở app sạch + bấm ngay khi Home vừa
  ổn định (2 frame `screencap` liên tiếp cùng kích thước, loại artifact chụp trúng frame cũ): sau fix,
  dòng log đầu tiên luôn là `onMainPager=true` (không còn `false` thoáng qua), và tất cả các lần bấm
  trong các đợt đo đều phát `onClick` + chuyển trang (0 lần thất bại thật qua nhiều đợt test, mỗi lần
  10-20 vòng mở app sạch). Một vài lần "thất bại" quan sát được trong lúc dò vấn đề hoá ra là do chính
  kịch bản test bấm trúng frame cũ còn sót lại giữa lúc `force-stop`/`am start` (0 dòng log hoặc đúng 1
  dòng `recompose` duy nhất không có gì theo sau) — không phải bug thật, bị loại khỏi kết luận bằng
  cách chờ 2 frame `screencap` ổn định liên tiếp trước khi bấm.
  **Dừng theo yêu cầu coordinator trước khi chạy xong đợt đo lớn cuối cùng (20 vòng)** — 2/2 vòng đầu
  của đợt đó đã pass trước khi dừng; không gọi thêm `adb`/emulator sau mốc này theo đúng chỉ đạo.
  Chưa có ảnh chụp màn hình thật từ máy của user xác nhận lại (agent chỉ test trên emulator) — đề nghị
  user tự cài `app-debug.apk` mới và thử lại đúng kịch bản bug gốc.

  **Còn lại, chưa làm trong task này (theo yêu cầu dừng sớm của coordinator)**: bước 4 của brief gốc
  ("nếu BACK từ detail screen về landing sai tab thì sửa luôn") và vòng verify đầy đủ trên thiết bị
  theo đúng kịch bản 6 bước trong brief (mở app → bấm Activity → Devices → Profile → Home → mở 1
  workout → cuộn → BACK → đúng tab cũ → bấm Devices → cuộn ẩn pill trên Home → bấm chỗ cũ của Profile
  → không chuyển → cuộn lên → bấm Profile → chuyển) **chưa được xác nhận lại sau khi gỡ log** — các
  phần đã thấy hoạt động đúng trong lúc còn log (switchTab hoàn tất, trang pager đổi đúng) nhưng chưa
  chạy lại kịch bản đầy đủ sau bản build log-free cuối cùng. Để lại cho vòng test tiếp theo của
  coordinator/user.

## Xiaomi MiWear M2: session auth + local bind (D-1217)

- **D-1217** · 2026-11-13 · `:driver:xiaomi` M2 (session auth V2 + no-cloud local bind) — triển
  khai xong, merge vào main — **Chốt** (đúng theo spec/evidence; kết quả trên thiết bị thật vẫn
  **Tạm**, xem bên dưới)

  `XiaomiAuthenticatorImpl` hết còn 3 `TODO()`: `probeBindMode` (§7.1 `getBindInfo`/`sb0`/`ha0`),
  `authenticateV2` (§6.1 `WearAuthV2` — nonce handshake `w90`→`ca0`→`t90`→`z90`, cài AES-CTR vào
  `XiaomiLink.encrypt`/`decrypt` với key==IV==appKey/deviceKey), `localBind` (§7.2
  `LocalWearBinderV2` — ECDH-P256 → HKDF-SHA256 `miwear-bind` → token 16 byte → AES-CCM bind
  result). `XiaomiDriver.openSession` phân nhánh first-bind vs reauth qua
  `AUTH_TOKEN.unboundMarkerKey` (cùng pattern với `driver/zepp`). PSK/cloud bind (`verifyMode==1`)
  vẫn out-of-scope, ném `UnsupportedDeviceException` hướng dẫn import token từ Mi Fitness, giữ
  đúng quyết định D-1193.

  Review (không chỉ tin báo cáo của agent, tự đối chiếu lại): từng bước khớp
  `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` §6.1/§7.2 và `docs/re-evidence/mi/jadx-base`;
  khớp byte-level với vector `authCrypto`/`authCcm`/`l2Ctr`/`getBindInfo` trong
  `docs/protocols/XIAOMI_TEST_VECTORS.json`. Tự chạy lại độc lập:
  `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :driver:xiaomi:testDebugUnitTest
  :app:compileDebugKotlin` → cả 2 **BUILD SUCCESSFUL**, 187 test/0 fail (tăng từ baseline 136).
  Merge fast-forward vào main tại `9fbf3ed64`; worktree
  `unified_watch_health_connect-wt-xiaomi-m2` + branch `worktree-xiaomi-m2-auth` đã dọn theo quy
  tắc git-worktree.

  **Gap phát hiện khi review, chưa sửa (ngoài phạm vi `driver/xiaomi`, đã tự xác minh lại là có
  thật)**: `DefaultWearableDeviceRepository.generateCredential()` (`core/data`) chỉ generate được
  khi `requirement.format.byteLength` khác null; `XiaomiDriver.USER_ID`/`APP_DEVICE_ID` dùng
  `CredentialFormat.TEXT` (`byteLength = null`) nhưng `generatable = true` → nút "Generate" trên
  UI sẽ fail cho 2 credential này, chặn luồng bind lần đầu trên máy thật. Cần fix trong
  `core/data` trước khi local bind thật sự chạy được từ UI.

  **Còn lại**: M3 (fitness ID sync §9.3 + channel 5 file receiver §9.4) và M4 (parser →
  `HealthRecord` §9.5) chưa làm, theo đúng thứ tự M0→M1→M2→M3→M4 của
  `XIAOMI_IMPLEMENTATION_BRIEF.md`. Chưa có xác nhận Gate 0 (`verifyMode` thật của con Band 10) —
  user sẽ tự verify trên thiết bị thật.

## Fix generateCredential cho CredentialFormat.TEXT (D-1218)

- **D-1218** · 2026-11-13 · `core/data` — `DefaultWearableDeviceRepository.generateCredential()`
  hỗ trợ credential dạng `TEXT` — **Chốt**

  Gap nêu ở D-1217 đã fix: `generateCredential()` trước đây bắt buộc
  `requirement.format.byteLength` khác null nên luôn fail với `CredentialFormat.TEXT`
  (`byteLength = null`) — đúng case của `XiaomiDriver.USER_ID`/`APP_DEVICE_ID`
  (`generatable = true` nhưng format `TEXT`). Sửa: sinh chuỗi hex ngẫu nhiên 16 byte cho cả hai
  format (giữ nguyên hành vi `HEX_16_BYTES` — cùng số byte, cùng dạng chuỗi trả về), rồi đi qua
  đúng `parse(requirement, value)` sẵn có thay vì ghép byte tay riêng cho từng format. Lý do dùng
  hex ngẫu nhiên cho `TEXT` dù nó là chuỗi: một credential `TEXT` *generatable* không phải secret
  của vendor cần đúng định dạng — chỉ cần là id ổn định, duy nhất ở local (theo đúng mô tả trong
  `XiaomiDriver.USER_ID`/`APP_DEVICE_ID`'s KDoc, "any stable string is probably accepted").

  Review + tự verify độc lập (không chỉ tin báo cáo agent): đọc diff
  `DefaultWearableDeviceRepository.kt` (18 dòng, không đụng `HEX_16_BYTES`'s shape cũ), tự chạy lại
  `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :core:data:testDebugUnitTest` → **BUILD
  SUCCESSFUL**, 61 test/0 fail (gồm 2 test mới cho `DefaultWearableDeviceRepositoryTest`, file test
  đầu tiên cho class này). Merge fast-forward vào main tại `d3d5d82f8`; worktree
  `unified_watch_health_connect-wt-text-credential` + branch `fix/generate-text-credential` đã
  dọn theo quy tắc git-worktree.

  Gap chặn local-bind-từ-UI nêu ở D-1217 coi như đã hết (user có thể tự thử bind con Band 10 thật
  với M2 + fix này).

## Xiaomi MiWear M3 (fitness id sync + channel 5 file receiver) + M4 scoped (3 parser) (D-1219)

- **D-1219** · 2026-11-13 · `driver/xiaomi` — M3 (§9.3/§9.4) và M4 thu hẹp phạm vi (3/~15 record
  kind: `DailyRecordParser`, `DailyReportParser`, `NightSleepParser`, §9.5) đã implement và merge
  — **Chốt** (phần parser bytes) / **Tạm** (chưa verify trên máy thật)

  `XiaomiFitnessSyncImpl.sync()` giờ chạy đủ: `f=1`/`f=2` lấy danh sách `FitnessDataId`, dedupe
  theo `SyncRequest.knownRawPayloadTimestamps` + cửa sổ `effectiveSince()` + cap 50 file/lần
  (giống `GarminFileSync`), `f=4` kích hoạt transfer, nhận stream không mời trên channel 5 (phải
  thêm `XiaomiLink.receiveRaw()` mới — `requestRaw` cũ luôn ghi-rồi-đợi, không hợp cho dữ liệu
  watch tự đẩy), `XiaomiFitnessFileReassembler` ghép segment theo `totalSegments/sequence`,
  `FitnessFilePayload` verify+strip CRC32 rồi tách `FitnessDataId`, lưu `HealthRecord.RawPayload`
  trước, `f=5` confirm sau cùng (đúng acceptance criterion "mất kết nối giữa chừng không mất dữ
  liệu" — confirm chỉ gửi sau khi raw bytes đã ghi xong).

  **CRC32 luôn bật, không phải đoán**: doc không nói transfer nào có CRC32; đọc
  `docs/re-evidence/mi/jadx-base/.../FitnessReceiverHandler.java` thấy
  `new FitnessDataReceiver(did, true)` — `crc32Verify` hardcode `true` cho mọi transfer kênh 5
  trong evidence, nên driver luôn kỳ vọng và strip CRC32, gắn `[V]` chứ không phải `[I]` như brief
  gợi ý ban đầu.

  **3 parser M4** (`codec/{DailyRecordCodec,DailyReportCodec,NightSleepCodec}.kt`) port field-by-
  field từ evidence (`DailyRecordParser`/`DailyReportParser`/`NightSleepParser`/
  `FourDimenDataParser`/`OneDimenDataParser`/`FitnessDataValidity`/`SleepState` annotation) —
  không đoán bit offset/byte size nào. `DailyRecordCodec` chỉ port `v2DataInfoArray` (version
  2/3/4); `version==1` (layout `v1DataInfoArray` khác hẳn) để trống có `TODO(xiaomi-protocol)`,
  cắt phạm vi có chủ đích chứ không đoán. Sleep state raw→`SleepStage` lấy từ
  `SleepState.java`/`annotation/SleepState.java` (2 file evidence độc lập, khớp nhau): 0=NOT_SLEEP,
  2=DEEP,3=LIGHT,4=REM,5=AWAKE,6=SLEEP_TRACE — NOT_SLEEP/SLEEP_TRACE không map vào 4 `SleepStage`
  hiện có nên bị drop (không đoán gán bừa vào AWAKE/LIGHT).

  `kind` string (`FitnessKind`): `daily_record`/`daily_report`/`night_sleep` cho 3 kind có parser,
  `fitness_<dataType>_<subType>_<fileType>` cho phần còn lại (sport, GPS, sleep ban ngày, user
  profile, ECG, cân nặng, nhiệt độ, ...) — raw-only, không parse, giống đúng tiền lệ
  `HuaweiSession.sync()` (lưu raw, parse sau). `XiaomiDriver.reprocess()` route theo đúng hàm
  decode sync dùng (`FitnessPayloadDecoder`), `bytes` lưu `id.encode() + payload` (giữ nguyên
  `FitnessDataId` để reprocess không cần link thật vẫn biết version/timezone).

  Review + tự verify độc lập: đọc toàn bộ diff, tự chạy lại
  `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :driver:xiaomi:testDebugUnitTest` → **BUILD
  SUCCESSFUL**, 228 test/0 fail (187 cũ + 41 test mới: reassembler, CRC/id split, 3 parser, sync
  e2e qua `FakeMiWearWatch` kịch bản thành công + dedupe + ngoài cửa sổ + CRC hỏng không crash cả
  sync, `receiveRaw`, `XiaomiDriver.reprocess`), `:driver:xiaomi:lintDebug` → **BUILD SUCCESSFUL**
  (fix 1 lỗi `NewApi` — `LocalDate.ofInstant` cần API 34, đổi sang `Instant.atZone(zone)
  .toLocalDate()` như phần còn lại của codebase), `:app:compileDebugKotlin` → **BUILD SUCCESSFUL**.
  Merge fast-forward vào main; worktree `unified_watch_health_connect-wt-xiaomi-m3m4` + branch
  `worktree-xiaomi-m3m4` đã dọn theo quy tắc git-worktree.

  **Chưa verify trên máy thật — cảnh báo rõ cho user trước khi test**: không có vendor test vector
  nào cho fitness payload bytes (`XIAOMI_TEST_VECTORS.json` chỉ có vector cho id-exchange), nên 3
  parser này build từ byte array tự tạo theo đúng bit layout đọc từ evidence, chưa test byte-for-
  byte với Band 10 thật. Mở với con Band 10 thật của user để xem có field nào lệch offset không.

  **Còn lại ngoài phạm vi D-1219** (cắt có chủ đích theo brief, không phải thiếu sót): 12/15 record
  kind khác ở §9.5 (daytime sleep, user profile, manual measure, all-day sleep, abnormal record,
  weight, ECG, temperature, mọi sport kind, GPS, recovery-rate) chỉ lưu `RawPayload`, không parse.
  `DailyRecordCodec` version 1. Ur9's field2Bytes/field3Bytes request/response mapping (nêu từ M2,
  vẫn chưa có byte vector xác nhận) — code đã handle cả hai field một cách thủ động, không chặn gì
  thêm.

## Xiaomi MiWear: sport workout (outdoor family) + GPS + daytime sleep (D-1220)

- **D-1220** · 2026-11-13 · `driver/xiaomi` — parse thêm sport/workout (nhóm outdoor) + GPS +
  daytime sleep, map vào `HealthRecord` có sẵn — **Chốt** (đúng theo spec/evidence; byte-level vẫn
  **Tạm**, chưa có máy thật)

  Chọn nhóm sportType **outdoor** (`RUNNING_OUTDOOR=1`, `WALKING_OUTDOOR=2`, `MOUNTAINEERING=4`,
  `CROSS_COUNTRY=5`, `HIKING_OUTDOOR=15`) thay vì `OutdoorStepRecordParser`/`FreeTrainingParser` —
  lý do: đọc thẳng dispatch switch thật trong `FitnessDataParser.java`, sportType 1/2 (chạy/đi bộ
  ngoài trời) là loại khối lượng cao nhất trên band Xiaomi, và bảng field của nhóm này ít version-
  fragment nhất trong evidence. `SportReportCodec` → `HealthRecord.Workout` (start/end/distance/
  calo/avgHR/maxHR); `SportGpsCodec` → `HealthRecord.WorkoutSample` (lat/lon/altitude/speed, GPS
  đứng riêng không gộp HR/cadence vì file sport-record dạng FourDimenData không có timestamp per-
  sample để correlate); `DaytimeSleepCodec` → `HealthRecord.Sleep`, tái dùng nguyên logic
  `NightSleepCodec` (đúng như `DaytimeSleepParser.java` gốc gọi thẳng `NightSleepParser`'s methods).

  Review: tự đối chiếu lại (không chỉ tin báo cáo agent) toàn bộ field-type-number của
  `SportReportCodec` với `SportReportBaseParser.ReportType`'s `int` constant thật (`startTime=1,
  endTime=2, duration=3, distance=5, calories=6, maxPace=8, minPace=9, maxSpeed=12, steps=13,
  maxCadence=14, avgHr=16, maxHr=17`) và với `OutdoorSportReportParser.java`'s
  `reportDataTypeArray` — khớp từng field, đúng thứ tự, đúng byte width. Sport-type catalog
  (`XiaomiSportTypes.kt`) đối chiếu với `FitnessProtoSportType.java` — khớp 1-1 toàn bộ 25 giá trị.
  Bit-validity (MSB-first per-field) đối chiếu với `OneDimenDataParser.isDataExist`'s real code
  (`(dataValid[i2] & (1 << (7 - i3))) > 0`) — khớp logic. Tự chạy lại độc lập:
  `JAVA_HOME=/opt/homebrew/opt/openjdk@21 ./gradlew :driver:xiaomi:testDebugUnitTest
  :app:compileDebugKotlin` → cả 2 **BUILD SUCCESSFUL**, 252 test/0 fail (tăng từ 228). Merge
  fast-forward vào main tại `dce457efe`; worktree `unified_watch_health_connect-wt-xiaomi-sport` +
  branch `feat/xiaomi-sport-gps-sleep` đã dọn theo quy tắc git-worktree.

  **Cắt có chủ đích, không phải thiếu sót**: `WorkoutLap`, interval/pause-handling, sport record
  per-sample (không có timestamp per-sample trong evidence để anchor), GPS dạng TGC (version≥4) và
  triathlon/ski (multi-segment), mọi sportType ngoài nhóm outdoor-5 — vẫn `RawPayload`. Không
  refactor `DailyReportCodec`/`DailyRecordCodec` để share logic với codec mới (quyết định của agent:
  rủi ro hồi quy code đã test cao hơn lợi ích gọn code ở milestone này) — khác với brief đề xuất,
  ghi nhận là deviation hợp lý.

  **Đơn vị chưa xác nhận trên máy thật**: distance/calo giả định mét/kcal nguyên (suy từ cách format
  khác trong cùng wire format), tốc độ GPS giả định m/s ×0.1 — cần verify với tổng số Mi Fitness
  hiện ra trên 1 buổi chạy ngoài trời thật.
