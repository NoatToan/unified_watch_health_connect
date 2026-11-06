# Phương pháp phân tích COROS 4.11.8 (tái lập được)

Xem `docs/protocols/COROS_DEVICE_PROTOCOL.md` §0 để biết bối cảnh đầy đủ. File này chỉ ghi lại
các lệnh/kịch bản để ai cũng chạy lại được, không lặp lại phần diễn giải.

## 1. Dựng APK và chạy rea

```bash
bash scripts/restore-apks.sh                     # ghép docs/apks/coros-4.11.8.apk.part-*
mkdir -p ../rea-output/coros
cp docs/apks/coros-4.11.8.apk ../rea-output/coros/
cd ../rea-output/coros
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
export REA_JADX_MCP_JAR=~/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar
# Tránh đặt tên output "package.json" trong cùng thư mục: volta coi đó là project manifest và
# lỗi "Could not parse project manifest" khi gọi `rea` qua shim volta.
rea inspect-android-package coros-4.11.8.apk --format json > coros_package.json
rea search-android-classes coros-4.11.8.apk "" --format json   # → total_classes: 32 (xem bên dưới)
```

`coros_package.json` (copy ở cạnh file này) chứa: package name, version, toàn bộ `<uses-permission>`,
danh sách `<activity>/<service>/<provider>/<receiver>` export + intent-filter, decode bằng
jadx-headless-mcp 0.7.1 (không cần Ghidra/IDA). Đây là **bằng chứng [V] đầy đủ, không bị cắt**, dùng
làm nguồn cho mọi khẳng định về manifest/permission/component trong tài liệu protocol.

## 2. Phát hiện APK bị đóng gói (shell) — phân tích header DEX

```bash
unzip -o coros-4.11.8.apk classes.dex   # 89,726,624 byte
python3 - <<'EOF'
import struct
data = open("classes.dex","rb").read()
string_ids_size, string_ids_off = struct.unpack_from("<II", data, 56)
type_ids_size = struct.unpack_from("<I", data, 64)[0]
class_defs_size, class_defs_off = struct.unpack_from("<II", data, 96)
map_off = struct.unpack_from("<I", data, 52)[0]
print("string_ids_size", string_ids_size, "type_ids_size", type_ids_size,
      "class_defs_size", class_defs_size, "class_defs_off", class_defs_off, "map_off", map_off)
EOF
# → string_ids_size=1149  type_ids_size=133  class_defs_size=30  class_defs_off=16276  map_off=69532
# map_list (ở map_off) tự xác nhận các count trên: hoàn toàn nhất quán cho MỘT dex 30-class.
# Vùng có cấu trúc kết thúc ở ~69,728 byte; 89,656,896 byte còn lại không có header DEX hợp lệ
# (không tìm thấy "dex\n035\0" lần 2, không tìm thấy endian_tag 0x12345678 lần 2 ở byte-offset nào khác
# ngoài offset 40 trong header gốc).
```

Entropy đo trên 2 mẫu 2 MB (vùng sau map_list, và 2 MB cuối file) ≈ 5.1–6.1 bit/byte (không phải ~8
bit/byte của dữ liệu mã hoá khối thật) → dữ liệu còn lại nhiều khả năng là **dex thật bị tước header**
(không phải ciphertext), nhưng không đủ cấu trúc để jadx/baksmali nạp lại mà không viết công cụ sửa
header riêng (ngoài phạm vi, xem quyết định D-101/D-102 trong `docs/DECISIONS.md`).

32 class mà `rea`/jadx đọc được toàn bộ đều thuộc gói `com.zgpgarg.zmr.kcaqqgc` (+ `R`, `a.auu.a`,
`kotlin.coroutines.jvm.internal.DebugProbesKt`) — lớp vỏ (shell loader), không phải code COROS thật.

## 3. Trích chuỗi còn đọc được (bằng chứng cấp "string evidence", không phải file:line)

```bash
unzip -o coros-4.11.8.apk classes.dex
strings -n 6 classes.dex > strings_classes.txt      # 648 536 dòng
grep -n "<pattern>" strings_classes.txt             # tra cứu lớp/hằng số/UUID cụ thể
```

Mọi trích dẫn [V] trong `docs/protocols/COROS_DEVICE_PROTOCOL.md` và các file khác trong thư mục này
lấy từ `strings_classes.txt` (không commit file này — 648K dòng, quá lớn và phần lớn là nhiễu; các
file `.md` cạnh đây giữ lại đúng các đoạn trích đã dùng, đủ để tái lập bằng lệnh `grep` ghi kèm).

Ví dụ lệnh tái lập các bảng trong `ble-architecture-strings.md`:
```bash
grep -E "Lcom/yf/lib/bluetooth/" strings_classes.txt | sed -E 's/^[^L]*L/L/' | sort -u
grep -E "Lcom/yf/coros/blecmd/" strings_classes.txt | sed -E 's/^[^L]*L/L/' | sort -u
grep -oE "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" strings_classes.txt | sort -u
grep -n "COROS APEX" strings_classes.txt    # dẫn tới cụm danh sách tên model (device-names.md)
```

## 4. Giới hạn môi trường phân tích

`rea doctor` tại thời điểm chạy: không có Ghidra (`GHIDRA_INSTALL_DIR` chưa đặt), không có Hopper/IDA/
Kuna. Native libs (`lib/arm64-v8a/*.so`) chưa được disassemble; chỉ soát bằng `strings`/`unzip -l`.
Không có thiết bị COROS thật, không có HCI snoop log.
