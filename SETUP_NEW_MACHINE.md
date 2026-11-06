# Set up on a new machine

## 1. Clone

```bash
git clone https://github.com/NoatToan/unified_watch_health_connect.git
cd unified_watch_health_connect
```

## 2. Build environment

- Android Studio (or Android SDK: platform 37, build-tools 36+)
- JDK 17 or 21. **Not JDK 27** (Gradle/AGP don't support it yet)

```bash
export JAVA_HOME=/opt/homebrew/opt/openjdk@21                 # macOS + Homebrew; adjust per machine
echo "sdk.dir=$HOME/Library/Android/sdk" > local.properties   # never committed

./gradlew assembleDebug testDebugUnitTest lint
scripts/e2e.sh [serial]                                       # instrumented E2E + screenshot report
```

Modules and architecture: [README.md](README.md). Feature spec: [FEATURES.md](FEATURES.md).

## 3. Vendor apps (only to re-run protocol analysis)

Vendor APKs and decompiled sources are **not** part of this repository (they are copyrighted by their vendors).
To re-check a protocol detail, install the official app on your own device or obtain the APK yourself, put it in
`docs/apks/` (git-ignored), and keep any decompiled output outside the repo. Only distilled, cited findings belong in
[`docs/protocols/`](docs/protocols/) and [`docs/re-evidence/`](docs/re-evidence/).

| Vendor app | Package | Version analysed |
|---|---|---|
| Garmin Connect | `com.garmin.android.apps.connectmobile` | 5.30.1 (11657) |
| Huawei Health | `com.huawei.health` | 17.0.7.310 |
| Zepp | `com.huami.watch.hmwatchmanager` | 6.10.1-play (100770) |
| COROS | `com.yf.smart.coros.dist` | 4.11.8 (411080300) |

## 4. Claude Code

- Project agents live in `.claude/agents/` (`wearable-driver-engineer`, `device-protocol-re`, `e2e-flows`). Some contain the
  absolute path of the original machine; adjust it if you clone elsewhere.
- Not in git (install per machine): plugins, global rules, MCP servers, `.claude/settings.local.json`, `.claude/state/`.
