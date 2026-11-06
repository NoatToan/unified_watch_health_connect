# Tài liệu ngoài code

Các tài liệu phân tích được tạo ở thư mục cha `noattoan/` trong lúc làm app, gom về đây để làm tiếp trên máy khác.

| Đường dẫn | Nội dung |
|---|---|
| `protocols/GARMIN_DEVICE_PROTOCOL.md` | Giao thức GFDI/BLE của Garmin Connect 5.30.1 → `driver/garmin` |
| `protocols/HUAWEI_DEVICE_PROTOCOL.md` | Giao thức Link Layer/HiChain của Huawei Health 17.0.7.310 → `driver/huawei` |
| `protocols/ZEPP_DEVICE_PROTOCOL.md` | Giao thức Zepp OS (ECDH sect163r2) của Zepp 6.10.1 → `driver/zepp` |
| `re-evidence/{garmin,huawei,zepp}/` | Output REA CLI (manifest, permissions, `cls_*`/`class_*`/`method_*.json`) mà các doc protocol trích dẫn |
| `archive/driver-huawei-wearengine/` | Driver Huawei qua WearEngine SDK, đã gỡ khi chuyển sang BLE-only. Không nằm trong `settings.gradle.kts`; cách khôi phục xem README trong đó |

## Đối chiếu đường dẫn trong doc protocol

Các doc ghi đường dẫn theo bố cục cũ ở `noattoan/`:

| Trong doc | Hiện tại |
|---|---|
| `garmin-analysis/rea-output/…` | `docs/re-evidence/garmin/…` |
| `zepp-analysis/rea-output/…` | `docs/re-evidence/zepp/…` |
| `rea-output/…` (doc Huawei) | `docs/re-evidence/huawei/…` |
| `garmin-analysis/jadx-base/sources/`, `zepp-analysis/jadx-base/sources/`, `jadx-out/sources/` | **Không commit** (hàng trăm MB–GB). Tạo lại bằng jadx từ APK gốc |

## Tạo lại source dịch ngược (khi cần tra `pkg/X.java:NN`)

APK không commit. Tải đúng phiên bản từ APKMirror:
- Garmin Connect `com.garmin.android.apps.connectmobile` 5.30.1 (11657), `.apkm`
- Zepp `com.huami.watch.hmwatchmanager` 6.10.1-play (100770), `.apkm`
- Huawei Health `com.huawei.health` 17.0.7.310, `.apk`

`.apkm` là file zip: giải nén lấy `base.apk`, rồi `jadx -d <brand>-analysis/jadx-base base.apk`.
