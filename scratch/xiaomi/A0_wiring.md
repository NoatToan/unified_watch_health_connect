You are doing the wiring step for a new Xiaomi BLE driver in the Unified Health repo at
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`.

Read `CLAUDE.md`, `.claude/agents/android-coder.md`, and `driver/standard/build.gradle.kts` first.

Create ONLY the module skeleton and wiring; do NOT implement any driver/protocol code (another
agent owns that):

1. Create `driver/xiaomi/build.gradle.kts` modeled on `driver/standard/build.gradle.kts`:
   - plugins: same library + hilt plugins
   - namespace = "com.unified.health.driver.xiaomi"
   - dependencies: `implementation(projects.core.ble)`, `implementation(libs.kotlinx.coroutines.android)`,
     `implementation(libs.bouncycastle.prov)`, `testImplementation(projects.core.testing)`
   - create `driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/package-info.kt` with a
     package declaration and a short KDoc placeholder (so the module is not empty). Do not add a driver.
2. Add `include(":driver:xiaomi")` to `settings.gradle.kts` after `:driver:coros`.
3. Add `implementation(projects.driver.xiaomi)` to `app/build.gradle.kts` after the other drivers.
4. Add `XIAOMI("Xiaomi")` to `WearableVendor` in
   `core/model/src/main/kotlin/com/unified/health/core/model/Device.kt`, after COROS.
5. Verify:
   ```
   export JAVA_HOME=/opt/homebrew/opt/openjdk@21
   ./gradlew :app:assembleDebug :core:model:testDebugUnitTest
   ```
   A Gradle lock timeout means another build is running: wait and retry. Do not commit.

Report exactly which files you changed and whether the build passed. Do not touch anything else.
