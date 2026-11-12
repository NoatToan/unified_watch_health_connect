You are fixing a JVM test hang in `:driver:xiaomi` at
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`. Work only inside `driver/xiaomi/src/test/`.

PROBLEM: `./gradlew :driver:xiaomi:testDebugUnitTest` never finishes; the Gradle test worker
spins at 100% CPU. Thread dumps show `kotlinx.coroutines.test.TestCoroutineScheduler.advanceUntilIdle`
inside `XiaomiDeviceCommandsTest.readBattery tolerates an empty response` and other tests that build
a `XiaomiLink`. Cause: `XiaomiLink.start()` launches an infinite background pump
(`while (true) { delay(...) ... }`) on the test scheduler, and the tests never cancel/close the
link, so `runTest` never reaches idle.

Fix the TEST lifecycle, not the production protocol logic:
1. In every test class that creates `XiaomiLink` (`XiaomiDeviceCommandsTest`, `XiaomiLinkTest`,
   and any other), ensure the link's scope is cancelled or `link.close()` runs at test end.
   Preferred minimal fix: make the helper use `runTest`'s `backgroundScope` (TestScope extension),
   e.g. `private suspend fun TestScope.startedLink(watch): XiaomiLink` constructing the link with
   `backgroundScope`, so `runTest` cancels the pump automatically. Otherwise add an `@After` that
   `runBlocking { link.close() }` for every created link.
2. If a test intentionally checks a timeout, keep it deterministic and ensure the link is closed.
3. Do NOT change `XiaomiLink`, `XiaomiL1`, `XiaomiDeviceCommands`, or any production code unless
   the test reveals a real bug (report it instead).
4. Run only:
   `export JAVA_HOME=/opt/homebrew/opt/openjdk@21; ./gradlew :driver:xiaomi:testDebugUnitTest --console=plain --no-daemon`
   Use a hard shell timeout (e.g. `timeout 300 ./gradlew ...`) so a hang cannot block again. Do NOT
   run lint or app builds.
5. Confirm test-result XML exists and report per-class counts; if another test hangs, fix the same
   lifecycle issue. Do not commit.
