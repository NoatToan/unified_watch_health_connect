# 07 — Ma trận sâu 5 brand

Bảng này là bản chi tiết của ma trận trong [README](README.md). Cột "Trạng thái" dùng đúng legend:
✅ implemented, 🟡 simulator-verified / chưa real-watch, 🔴 blocked. "Raw-only" nghĩa là dữ liệu được giữ
làm `RawPayload` nhưng chưa decode thành `HealthRecord` typed.

## 1. Bảng so sánh sâu

| Brand | Discovery signal | GATT services / characteristics | MTU | Bond | App auth | Session state | Live data | History | Blocker chính | Evidence path |
|---|---|---|---|---|---|---|---|---|---|---|
| **Garmin** | Company ID `0x0087` / `0x8700`; service data họ `6A4E…`, `0x2401`, `0x3E10`, `0xFE1F`; tên model Garmin | Dedicated GFDI: `6A4E2401` read `CD28` write `4C80`, legacy `9B012401` read `4ACBCD28` write `DF334C80`; Multi-Link `6A4E2800` notify `281x` write `282x`; realtime `6A4E2500/2501`; SIG `0x180F`, `0x180D` | Request **515**; `maxWriteLength = mtu-3`; `5024 maxPacketSize` là link budget, trừ COBS + 8/18 byte | OS bond bắt buộc bình thường; `bondOptional=true` cho phép tiếp tục unbonded (D-417) | Garmin Auth tầng app `5101→5111` bằng XXTEA khi watch gửi `5101`; passkey mode 0/1; LTK/EDIV/RAND lưu credential; fast path `5104` **chưa làm** | `clientId=0x554845414C544801`, ML handle theo phiên, device capability bitmask từ `5050`, `maxPacketSize`, `unitId`; LTK bền | `6A4E2501` → ML service 6 → SIG `0x2A37` | FIT directory index `0`, tải `5002/5004`, `FitHealthMapper`; không archive/xoá file | Client ID có thể bị firmware reject; MLR chưa làm; response service-4 chưa decode; Garmin Auth chưa real-watch | [connection](../analysis/GARMIN_CONNECTION_ANALYSIS.md), [auth](../analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md), [protocol](../protocols/GARMIN_DEVICE_PROTOCOL.md) |
| **Zepp / Amazfit** | Company ID `0x0157` (Huami, `[Ext]`); service `FEE0`/`FEE1`; prefix Amazfit/Zepp/Mi Band/T-Rex/GTR/GTS/Bip… | `FEE0`/`FEE1`; channel `0x0016`/`0x0017`; GDSP `0x0004/0x0005`; legacy auth `0x0009`; battery `0x0006`; SIG `0x180D/0x2A37`, `0x2A39`, `0x2A2B`, `0x180F`, `0x180A` | Request **247**; vendor không request MTU mà hỏi module `0x15`; giá trị 247 chưa xác nhận real-watch | Không bond (`bond=false`); bảo mật nằm ở auth key + channel cipher | `0x82` ECDH B-163; `0x80` AES-ECB; `0x0009` legacy AES-ECB; local bind nếu `allowLocalBinding=1`; cloud bind 🔴 | `sessionId` 0..255, `appId=0`, `r0/r1`, `ChannelCipher`, module map theo phiên; auth key bền theo MAC | `0x2A37`; OpenApp module `0x1D` hoặc `0x2A39` + heartbeat 10 s | GDSP ACTIVITY, SPO2_POINT, STRESS_ALL_DAY/SINGLE, RESTING_HEART_RATE; retry 3 lần | Cloud first-bind cần chữ ký Huami; `allowLocalBinding`/ECDH byte order chưa real-watch; sleep/PAI/sport chưa parse | [connection](../analysis/ZEPP_CONNECTION_ANALYSIS.md), [auth](../analysis/ZEPP_AUTH_CRYPTO_ANALYSIS.md), [protocol](../protocols/ZEPP_DEVICE_PROTOCOL.md) |
| **Huawei / Honor** | Service `FE86`; prefix `HUAWEI WATCH`, `HUAWEI Band`, `HONOR Band`, `HONOR Watch` | GATT `FE86` write `FE01`, notify `FE02`, CCCD `0x2902`; SIG `0x180A/0x180F` là fallback; protocol service 1 (DeviceConfig), 7 (Fitness), 23 (Workout/HR) | **Không** request MTU; frame size negotiate trong `0x0101` (`maxFrame`, `singleFrame`, `interval`) | Driver **luôn** `bond=true` trước handshake; vendor quyết định bond theo TLV 9 | `0x0101` TLV 5 `authVersion` + TLV 7 `authType`; `authVersion=0` → no auth; còn lại cần CAK/HiChain → 🔴 | `LinkParameters` + `DeviceConfiguration` theo phiên; no-auth không có work key; router raw 256 message | Service 23 cmd 18 open, notify cmd 3: TLV 3 = HR, TLV 4 = epoch | Service 7 request thô (`RawPayload`); chưa decode steps/HR/SpO2/sleep | CAK white-box / `libhichain_sdk_jni.so`; service 7 layout; chưa có `0x0101` capture của watch no-auth | [connection](../analysis/HUAWEI_CONNECTION_ANALYSIS.md), [auth](../analysis/HUAWEI_AUTH_CRYPTO_ANALYSIS.md), [protocol](../protocols/HUAWEI_DEVICE_PROTOCOL.md) |
| **COROS** | Prefix `COROS`; custom UUID weloop `6E400001-…-77656C6F6F70`, Nordic NUS `…-E50E24DCCA9E`, `ADF70001-…`, Nordic DFU `00001530-…` | SIG `0x180A`, `0x180F/0x2A19`, `0x180D/0x2A37`; vendor UART/ADF7 chưa xác định RX/TX; Nordic DFU cho OTA | Request **247**, chưa xác minh | `bond=true`; thứ tự bond/handshake chưa rõ | OS bond; `YfBtAuth`/`YfBtSystemBondAuth` chỉ là call point, không có byte layout | `GattRef` + `ProtocolAttemptToken` generation; capture snapshot; HR buffer 10k theo session; không có vendor context | Chỉ SIG `0x2A37` | Không có history thật; `sync()` chỉ drain live buffer; vendor history 🔴 | APK shell: không có CMD ID, frame/CRC/offset, UUID role; cần HCI snoop log | [connection](../analysis/COROS_CONNECTION_ANALYSIS.md), [auth](../analysis/COROS_AUTH_CRYPTO_ANALYSIS.md), [protocol](../protocols/COROS_DEVICE_PROTOCOL.md) |
| **Standard (SIG)** | Advertisement chứa HRS `0x180D`, PLXS `0x1822`, RSCS `0x1814`, BP `0x1810`, HT `0x1809`, WS `0x181D`, BC `0x181B` | Toàn bộ service SIG ở trên; DIS `0x180A`, battery `0x180F`, CTS `0x1805/2A2B`, `2A0F`, PLX `2A52` RACP | Không request (default ATT) | Không | Không | `StandardSampleStore` theo địa chỉ, 20 000 record, sống qua link loss; two-phase commit | HRS `0x2A37`; PLX pulse làm HR fallback khi không có HRS | Buffer live + PLX stored RACP; BP/temp/weight/body composition raw-only | Không có protocol blocker; rủi ro là thiết bị không expose đủ service | [D-601…D-611](../DECISIONS.md), code `driver/standard` |

## 2. Đọc nhanh "ai giữ state gì"

| Brand | State bền duy nhất | State mất khi reconnect | Có cần user secret? |
|---|---|---|---|
| Garmin | OS bond; LTK/EDIV/RAND (`garmin_auth_info`) | ML handle, cipher, `maxPacketSize` | Không (chỉ passkey khi app auth) |
| Zepp | Auth key 16 byte (`zepp.auth_key`) | `sessionId`, `r0/r1`, module map, cipher | Có — dán key hoặc local bind |
| Huawei | OS bond | `LinkParameters`, `DeviceConfiguration`, router queue | Không ở nhánh no-auth; auth-required không mở được |
| COROS | OS bond | HR buffer, generation token | Không |
| Standard | `StandardSampleStore` theo MAC (trong process) | Derived window flush trước khi đóng | Không |

## 3. Vì sao hai brand bị chặn (tóm tắt một dòng)

- **Huawei auth-required**: mọi authType (1/2/3/4/8) đều trộn **CAK white-box** của Huawei Health hoặc
  gọi native **HiChain**. Đây là trust anchor của vendor, không phải byte protocol có thể RE. Driver chỉ
  mở nhánh `authVersion == 0`; watch khác nhận lỗi rõ ràng và đi Health Connect
  ([D-322](../DECISIONS.md), [HUAWEI_AUTH_CRYPTO_ANALYSIS §6](../analysis/HUAWEI_AUTH_CRYPTO_ANALYSIS.md)).
- **COROS vendor protocol**: APK bị shell, không còn method body; command ID/frame layout/CRC/UUID role
  không thể xác định từ artifact hiện có. Driver không đoán byte; một **HCI snoop log** của app COROS
  pairing + sync là đủ để mở khoá phần lớn gap
  ([COROS_CONNECTION_ANALYSIS §5](../analysis/COROS_CONNECTION_ANALYSIS.md)).

## 4. Trạng thái theo từng năng lực

| Năng lực | Garmin | Zepp | Huawei | COROS | Standard |
|---|---|---|---|---|---|
| Discovery | ✅ | ✅ | ✅ | ✅ | ✅ |
| GATT connect / link | ✅ | ✅ | ✅ | ✅ | ✅ |
| OS bond | ✅ | không dùng | ✅ (luôn bond) | ✅ (chưa xác minh) | không |
| App auth | 🟡 unit-tested (5101→5111) | ✅ unit/JVM simulator; 🟡 real | 🔴 auth-required | 🔴 vendor auth | không |
| Live HR | ✅ unit; 🟡 real | ✅ simulator/unit; 🟡 real | ✅ simulator; 🟡 real | ✅ SIG; 🟡 real | ✅ |
| History typed | ✅ FIT unit/simulator; 🟡 real | ✅ GDSP simulator (activity); 🟡 real | 🔴 raw-only | 🔴 | ✅ buffer/PLX |
| Battery | ✅ SIG + 5023 fallback | ✅ module 0x29 / 0x0006 / SIG | ✅ svc1 cmd8 / SIG | ✅ SIG | ✅ SIG |
| Time sync | ✅ 5030/5052 + 5026 | ✅ 2A2B FEE0/0x1805 | ✅ 0x0105 + 0x0132 | 🔴 | ✅ CTS |
| Simulator E2E app | ✅ GFDI cơ bản (không 5101) | ✅ legacy 0x0009 | ✅ no-auth + auth-required error | ❌ | ✅ |

## 5. Evidence map

| Brand | Connection dossier | Auth dossier | Protocol | Implementation brief |
|---|---|---|---|---|
| Garmin | [GARMIN_CONNECTION_ANALYSIS.md](../analysis/GARMIN_CONNECTION_ANALYSIS.md) | [GARMIN_AUTH_CRYPTO_ANALYSIS.md](../analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md) | [GARMIN_DEVICE_PROTOCOL.md](../protocols/GARMIN_DEVICE_PROTOCOL.md) | [GARMIN_IMPLEMENTATION_BRIEF.md](../protocols/GARMIN_IMPLEMENTATION_BRIEF.md) |
| Zepp | [ZEPP_CONNECTION_ANALYSIS.md](../analysis/ZEPP_CONNECTION_ANALYSIS.md) | [ZEPP_AUTH_CRYPTO_ANALYSIS.md](../analysis/ZEPP_AUTH_CRYPTO_ANALYSIS.md) | [ZEPP_DEVICE_PROTOCOL.md](../protocols/ZEPP_DEVICE_PROTOCOL.md) | [ZEPP_IMPLEMENTATION_BRIEF.md](../protocols/ZEPP_IMPLEMENTATION_BRIEF.md) |
| Huawei | [HUAWEI_CONNECTION_ANALYSIS.md](../analysis/HUAWEI_CONNECTION_ANALYSIS.md) | [HUAWEI_AUTH_CRYPTO_ANALYSIS.md](../analysis/HUAWEI_AUTH_CRYPTO_ANALYSIS.md) | [HUAWEI_DEVICE_PROTOCOL.md](../protocols/HUAWEI_DEVICE_PROTOCOL.md) | [HUAWEI_IMPLEMENTATION_BRIEF.md](../protocols/HUAWEI_IMPLEMENTATION_BRIEF.md) |
| COROS | [COROS_CONNECTION_ANALYSIS.md](../analysis/COROS_CONNECTION_ANALYSIS.md) | [COROS_AUTH_CRYPTO_ANALYSIS.md](../analysis/COROS_AUTH_CRYPTO_ANALYSIS.md) | [COROS_DEVICE_PROTOCOL.md](../protocols/COROS_DEVICE_PROTOCOL.md) | [COROS_IMPLEMENTATION_BRIEF.md](../protocols/COROS_IMPLEMENTATION_BRIEF.md) |
| Standard | — (SIG spec [Ext]) | — | — | — (D-601…D-611) |

## 6. Sai lệch tài liệu đã biết (không sửa nguồn)

- `HUAWEI_CONNECTION_ANALYSIS.md §3` ghi live HR notify cmd 3 "TLV 4 = HR"; code/`D-324` xác minh
  **TLV 3 = HR, TLV 4 = epoch**; driver đọc TLV 3 và chấp nhận TLV 4 một byte làm fallback.
- `COROS_IMPLEMENTATION_BRIEF.md` từng coi `PACTYP_CRC16/32` là CRC framing BLE; analysis 2026-11-08 xác
  định chúng thuộc enum packet-type của Opus audio. Không dùng chúng làm bằng chứng CRC.
- `ZEPP_IMPLEMENTATION_BRIEF.md` còn ghi "battery module 0x29 chưa implement" và "time sync chỉ 0x1805";
  code hiện đã implement module `0x29`, FEE0 `0x0006` và FEE0-first `2A2B` (D-510).
- `ZEPP_CONNECTION_ANALYSIS.md` prose ghi `apiLevel u16 BE`, nhưng byte layout §5.2 và code dùng **LE**
  (`02 00` cho API 2); tài liệu kiến trúc bám code + ví dụ byte.
- `GARMIN_CONNECTION_ANALYSIS.md §3` ghi driver 5023 layout lệch vendor; code hiện đã sửa theo
  `status=[0]&0x70`, `percent=[2]` (D-414).
