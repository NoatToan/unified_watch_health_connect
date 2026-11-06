# Làm tiếp trên máy khác

Repo `NoatToan/vibe-projects` (private). App nằm ở `unified_health_app/`; các thư mục khác ở gốc repo đều bị ignore.

## 1. Clone

Repo nặng khoảng 2–3GB (source dịch ngược + APK cắt nhỏ). Nên clone qua mạng ổn định:

```bash
git clone https://github.com/NoatToan/vibe-projects.git noattoan
cd noattoan/unified_health_app
```

Nếu chỉ cần code app, không cần docs nặng (nhanh hơn nhiều):

```bash
git clone --filter=blob:none --sparse https://github.com/NoatToan/vibe-projects.git noattoan
cd noattoan
git sparse-checkout set --no-cone '/*' '!/unified_health_app/docs/re-evidence/*/jadx-*/' '!/unified_health_app/docs/apks/'
```

## 2. Môi trường build

- Android Studio (hoặc Android SDK: platform 37, build-tools 36+)
- JDK 17 hoặc 21. **Không dùng JDK 27** (Gradle/AGP chưa hỗ trợ)

```bash
cd unified_health_app
export JAVA_HOME=/opt/homebrew/opt/openjdk@21     # macOS + Homebrew; đổi theo máy
echo "sdk.dir=$HOME/Library/Android/sdk" > local.properties   # không commit

./gradlew assembleDebug testDebugUnitTest :core:domain:test lint
```

Chi tiết module/kiến trúc: [README.md](README.md). Tính năng: [FEATURES.md](FEATURES.md).

## 3. APK gốc (khi cần phân tích lại)

GitHub chặn file > 100MB nên APK được cắt thành `docs/apks/*.part-*`. Ghép lại và kiểm tra SHA-256:

```bash
scripts/restore-apks.sh
```

Ra các file (bị `.gitignore` bỏ qua, không commit lại):

| File | App | Phiên bản |
|---|---|---|
| `docs/apks/garmin-connect-5.30.1.apkm` | `com.garmin.android.apps.connectmobile` | 5.30.1 (11657) |
| `docs/apks/huawei-health-17.0.7.310.apk` | `com.huawei.health` | 17.0.7.310 |
| `docs/apks/zepp-6.10.1.apkm` | `com.huami.watch.hmwatchmanager` | 6.10.1-play (100770) |
| `docs/apks/coros-4.11.8.apk` | `com.yf.smart.coros.dist` | 4.11.8 (411080300). **Chưa phân tích, chưa có driver** |

`.apkm` là file zip: `unzip x.apkm base.apk` rồi `jadx -d out base.apk`.

## 4. Tài liệu dịch ngược

Xem [docs/README.md](docs/README.md): 3 doc protocol, output REA, source jadx đã commit sẵn và driver Huawei WearEngine đã archive.

## 5. Claude Code

- Agent dự án: `.claude/agents/wearable-driver-engineer.md`. Agent này có ghi đường dẫn tuyệt đối
  `/Users/Apple/Documents/Projects/noattoan/unified_health_app`. Nếu máy mới clone vào chỗ khác thì sửa lại dòng đó.
- Không có trên git (mỗi máy tự cài): plugin ECC, `tlm-claude-plugins`, rule global `~/.claude/rules/context7.md`,
  MCP context7, `.claude/settings.local.json`, `.claude/state/`.
- Thư mục `.gradle/`, `.idea/`, `.kotlin/`, `build/` sẽ tự sinh lại khi mở trong Android Studio.

## 6. Dọn dẹp sau này

Source jadx (`docs/re-evidence/*/jadx-*`) và `docs/apks/` chỉ để tạm. Xoá bằng `git rm` thì **lịch sử git vẫn giữ nguyên dung lượng**.
Muốn repo nhẹ thật sự phải viết lại lịch sử (`git filter-repo --path unified_health_app/docs/apks --path-glob 'unified_health_app/docs/re-evidence/*/jadx-*' --invert-paths`)
rồi force-push, và mọi máy đang clone phải clone lại.
