# Unified Health (Android)

Ứng dụng Android native hiển thị dữ liệu sức khỏe (bước chân, nhịp tim, giấc ngủ, SpO2, căng thẳng, bài tập) từ **đồng hồ/vòng đeo Huawei của chính bạn** qua BLE, kèm đồng bộ Health Connect.

> **Trạng thái:** skeleton chạy được. Toàn bộ dữ liệu sức khỏe và kết nối BLE hiện là **giả lập (Fake)**. Giao thức Huawei (BLE GATT + handshake/xác thực link-layer) **chưa được cài đặt**, sẽ cắm vào sau dựa trên một bản phân tích reverse-engineering riêng.

Đặc tả tính năng và UI: xem [FEATURES.md](FEATURES.md).

---

## Công nghệ

| Hạng mục | Phiên bản |
|---|---|
| Android Gradle Plugin | 9.5.0 (Kotlin tích hợp sẵn của AGP 9) |
| Gradle | 9.8.2 (wrapper) |
| Kotlin | 2.4.21 · KSP 2.3.13 |
| Compose BOM | 2026.09.00 (Material 3) |
| Navigation Compose | 2.10.2 (route type-safe bằng kotlinx.serialization) |
| Hilt | 2.60.1 · androidx.hilt 1.4.0 (`hilt-lifecycle-viewmodel-compose`) |
| Room | 2.8.5 · DataStore 1.3.0 |
| Health Connect | `connect-client` 1.1.0 |
| Lifecycle 2.11.0 · Activity 1.13.0 · Coroutines 1.11.0 | |
| SDK | minSdk 26 · compileSdk / targetSdk 37 |
| JDK để build | 17 hoặc 21 (đã kiểm thử với 21) |

Toàn bộ phiên bản nằm ở `gradle/libs.versions.toml`.

## Build

Yêu cầu: Android SDK (platform 37, build-tools 36+), JDK 17/21.

```bash
# macOS (Homebrew): JDK hệ thống /usr/bin/java trên máy này bị hỏng, chỉ định rõ JDK 21
export JAVA_HOME=/opt/homebrew/opt/openjdk@21

# local.properties (không commit) trỏ tới SDK:
echo "sdk.dir=$HOME/Library/Android/sdk" > local.properties

./gradlew assembleDebug            # APK: app/build/outputs/apk/debug/app-debug.apk
./gradlew testDebugUnitTest :core:domain:test   # unit test
./gradlew lint                     # Android lint (hiện sạch)
./gradlew installDebug             # cài lên thiết bị/emulator đang kết nối
```

> Không dùng JDK 27: Gradle/AGP hiện tại chưa hỗ trợ chạy trên JDK đó.

## Cấu trúc module

```
unified_health_app/
├── build-logic/convention/      # Convention plugins (Gradle Kotlin DSL)
│     unifiedhealth.android.application | .android.library | .android.compose
│     unifiedhealth.android.feature | .hilt | .jvm.library
├── gradle/libs.versions.toml    # Version catalog
├── app/                         # Single Activity, NavHost, NavigationBar, Hilt Application,
│                                #   Manifest (quyền), PermissionsRationaleActivity (Health Connect),
│                                #   DeviceSyncService (placeholder foreground service)
├── core/
│   ├── model/        (JVM)      # Domain models: Steps, HeartRate, Sleep, SpO2, Stress, Workout,
│   │                            #   WearableDevice, ConnectionState, SyncState, UserPreferences…
│   ├── domain/       (JVM)      # Interface repository + use case (HealthDataRepository,
│   │                            #   WearableDeviceRepository, UserPreferencesRepository,
│   │                            #   HealthConnectRepository)
│   ├── designsystem/            # Theme M3 (màu, typography, shape, spacing, dynamic color),
│   │                            #   components: MetricCard, ActivityRings, SimpleBarChart,
│   │                            #   ConnectionStatusChip, Loading/Empty/ErrorState, RuntimePermissions
│   ├── ble/                     # Abstraction kết nối thiết bị: DeviceScanner, DeviceConnection,
│   │                            #   HealthDataSync + Fake*, BleModule (Hilt). TODO giao thức Huawei
│   └── data/                    # Room (paired devices), DataStore (preferences), HealthConnectManager,
│                                #   FakeHealthDataRepository, DefaultWearableDeviceRepository, DI
└── feature/
    ├── onboarding/              # Welcome + luồng xin quyền runtime
    ├── home/                    # Dashboard + chi tiết chỉ số (Ngày/Tuần/Tháng)
    ├── activity/                # Danh sách bài tập (placeholder, dữ liệu giả)
    ├── sleep/                   # Placeholder
    ├── devices/                 # Quét / ghép đôi / kết nối / đồng bộ / bỏ ghép đôi
    └── profile/                 # Cài đặt (placeholder, có toggle đơn vị + dynamic color)
```

Quy tắc phụ thuộc: `feature:*` chỉ phụ thuộc `core:model`, `core:domain`, `core:designsystem`. Không feature nào biết tới `core:data` hay `core:ble`; chỉ `:app` ghép tất cả qua Hilt.

## Kiến trúc

```
┌──────────────────────────────── UI layer (feature:*, app) ────────────────────────────────┐
│  Composable Screen  ◀── StateFlow<UiState> ──  @HiltViewModel                              │
│  (M3, stateless)    ── events (onClick…) ──▶   (combine flows, stateIn)                    │
└──────────────────────────────────────────────────────┬────────────────────────────────────┘
                                                       │ gọi use case / repository interface
┌──────────────────────────── Domain layer (core:domain + core:model, thuần Kotlin) ────────┐
│  ObserveTodaySummaryUseCase · ObserveMetricSeriesUseCase · ObservePrimaryDeviceUseCase      │
│  interface HealthDataRepository · WearableDeviceRepository · UserPreferencesRepository     │
│            HealthConnectRepository                                                          │
└──────────────────────────────────────────────────────┬────────────────────────────────────┘
                                                       │ implemented by (Hilt @Binds)
┌──────────────────────────────────── Data layer (core:data) ───────────────────────────────┐
│  FakeHealthDataRepository ──(TODO)──▶ Room health records + Health Connect                 │
│  DefaultWearableDeviceRepository ── Room: PairedDeviceDao                                  │
│  DataStoreUserPreferencesRepository · HealthConnectManager                                 │
└──────────────────────────────────────────────────────┬────────────────────────────────────┘
                                                       │ uses
┌───────────────────────────── Device transport (core:ble) ─────────────────────────────────┐
│  interface DeviceScanner · DeviceConnection · HealthDataSync (+ HealthRecordSink)          │
│      ├── FakeDeviceScanner / FakeDeviceConnection / FakeHealthDataSync   ◀── đang bind      │
│      └── (TODO) HuaweiDeviceScanner / HuaweiDeviceConnection / HuaweiHealthDataSync         │
│                 BLE GATT + Huawei link-layer handshake/auth (từ phân tích RE riêng)          │
└────────────────────────────────────────────────────────────────────────────────────────────┘
```

- **MVVM + Clean Architecture**, single-activity, Navigation Compose type-safe.
- **Hilt** ở mọi tầng; đổi Fake sang triển khai thật chỉ cần sửa `core/ble/.../di/BleModule.kt` (và `DataModule.kt` cho repository sức khỏe).
- **Coroutines/Flow**: repository trả `Flow`; ViewModel dùng `stateIn(WhileSubscribed(5s))`; UI dùng `collectAsStateWithLifecycle`.

## Màn hình đã có

| Màn hình | Trạng thái |
|---|---|
| Onboarding: Welcome + Quyền (Bluetooth / Location ≤ API 30 / Thông báo / Health Connect / Pin nền) | ✅ |
| Trang chủ: banner thiết bị, vòng hoạt động, 6 card chỉ số, pull-to-refresh | ✅ (dữ liệu giả) |
| Chi tiết chỉ số: Ngày/Tuần/Tháng, biểu đồ cột, TB/Min/Max | ✅ (dữ liệu giả) |
| Thiết bị: quét, ghép đôi, trạng thái kết nối, pin, firmware, đồng bộ, ngắt, bỏ ghép đôi | ✅ (BLE giả) |
| Hoạt động: danh sách bài tập + FAB "Bắt đầu tập" | 🟡 placeholder |
| Giấc ngủ | 🟡 placeholder |
| Hồ sơ: danh sách cài đặt, toggle đơn vị + dynamic color | 🟡 placeholder |
| Chính sách quyền riêng tư (Health Connect rationale) | ✅ |

## Bước tiếp theo

1. **Giao thức Huawei** (ưu tiên số 1): triển khai `HuaweiDeviceScanner`, `HuaweiDeviceConnection`, `HuaweiHealthDataSync` trong `:core:ble` theo bản phân tích reverse-engineering riêng; đổi binding trong `BleModule`. Xem `core/ble/.../WearableProtocol.kt`.
2. **Foreground service** `DeviceSyncService` (`connectedDevice`): giữ kết nối, tự kết nối lại có back-off, notification ongoing.
3. **Lưu dữ liệu sức khỏe thật**: entity Room cho steps/HR/sleep/SpO2/stress/workout; `HealthRecordSink` ghi vào Room; thay `FakeHealthDataRepository`.
4. **Health Connect hai chiều**: ghi dữ liệu từ đồng hồ (thêm quyền WRITE_*), dedupe bằng `clientRecordId`, đồng bộ nền bằng WorkManager.
5. Kiểm tra trạng thái Bluetooth bật/tắt, xử lý quyền bị từ chối vĩnh viễn.
6. **Bản địa hóa**: đưa chuỗi UI (đang viết cứng tiếng Anh) vào `strings.xml` + `values-vi`.
7. Màn Giấc ngủ (hypnogram), live workout, vùng nhịp tim & cảnh báo (xem FEATURES.md).
8. Thư viện biểu đồ (ví dụ Vico) thay `SimpleBarChart`.
9. Test: ViewModel tests (Turbine), Compose UI tests, Room DAO tests; CI chạy `assembleDebug lint test`.
10. Chính sách quyền riêng tư chính thức trước khi phát hành (bắt buộc với Health Connect trên Play).

## Ghi chú

- Clone sang máy khác: [`SETUP_NEW_MACHINE.md`](SETUP_NEW_MACHINE.md).
- Tài liệu giao thức (Garmin/Huawei/Zepp), evidence dịch ngược và driver đã archive: xem [`docs/`](docs/README.md).
- `local.properties` không được commit (đã có trong `.gitignore`).
- `android:usesPermissionFlags="neverForLocation"` trên `BLUETOOTH_SCAN`: nếu quảng bá BLE của đồng hồ bị lọc khi quét, bỏ cờ này và xin quyền vị trí.
- Bản debug dùng `applicationIdSuffix = ".debug"` → package `com.unified.health.debug`.
