# Tài liệu ngoài code

Các tài liệu phân tích được tạo ở thư mục cha `noattoan/` trong lúc làm app, gom về đây để làm tiếp trên máy khác.

| Đường dẫn | Nội dung |
|---|---|
| `protocols/GARMIN_DEVICE_PROTOCOL.md` | Giao thức GFDI/BLE của Garmin Connect 5.30.1 → `driver/garmin` |
| `protocols/HUAWEI_DEVICE_PROTOCOL.md` | Giao thức Link Layer/HiChain của Huawei Health 17.0.7.310 → `driver/huawei` |
| `protocols/ZEPP_DEVICE_PROTOCOL.md` | Giao thức Zepp OS (ECDH sect163r2) của Zepp 6.10.1 → `driver/zepp` |
| `re-evidence/{garmin,huawei,zepp}/` | Output REA CLI (manifest, permissions, `cls_*`/`class_*`/`method_*.json`) mà các doc protocol trích dẫn |
| `re-evidence/garmin/jadx-base`, `jadx-gcm`, `re-evidence/zepp/jadx-base`, `re-evidence/huawei/jadx-out` | Source jadx dịch ngược (tạm thời, sẽ xoá) |
| `apks/` | APK gốc cắt nhỏ; ghép bằng `scripts/restore-apks.sh` (xem [SETUP_NEW_MACHINE.md](../SETUP_NEW_MACHINE.md)) |
| `archive/driver-huawei-wearengine/` | Driver Huawei qua WearEngine SDK, đã gỡ khi chuyển sang BLE-only. Không nằm trong `settings.gradle.kts`; cách khôi phục xem README trong đó |

## Đối chiếu đường dẫn trong doc protocol

Các doc ghi đường dẫn theo bố cục cũ ở `noattoan/`:

| Trong doc | Hiện tại |
|---|---|
| `garmin-analysis/rea-output/…` | `docs/re-evidence/garmin/…` |
| `zepp-analysis/rea-output/…` | `docs/re-evidence/zepp/…` |
| `rea-output/…` (doc Huawei) | `docs/re-evidence/huawei/…` |
| `garmin-analysis/jadx-base/…`, `garmin-analysis/jadx-gcm/…` | `docs/re-evidence/garmin/jadx-base/…`, `…/jadx-gcm/…` |
| `zepp-analysis/jadx-base/…` | `docs/re-evidence/zepp/jadx-base/…` |
| `jadx-out/sources/…` (doc Huawei) | `docs/re-evidence/huawei/jadx-out/sources/…` |

## APK gốc

Đã commit dạng cắt nhỏ ở `apks/`. Chạy `scripts/restore-apks.sh` để ghép lại và kiểm tra checksum.
