You are finishing and verifying the non-secret `:driver:xiaomi` foundation in
`/Users/Apple/Documents/Projects/noattoan/unified_health_app`. Do NOT implement auth, crypto, bind,
cloud, fitness parsing, or change protocol semantics. Work only inside `driver/xiaomi/`.

The previous agent wrote the module but ran out of time before verification. Current state:
- All main sources and many JVM tests exist under `driver/xiaomi/src/`.
- `auth/XiaomiAuthenticatorImpl.kt` and `sync/XiaomiFitnessSyncImpl.kt` are intentionally TODO
  stubs for other agents. Do not fill them.
- `:driver:xiaomi:testDebugUnitTest` currently has exactly one failure:
  `XiaomiL1Test > cumulative ack handles seq wraparound` at XiaomiL1Test.kt:161:
  expected `<0>` but was `<125>`.
  Root cause: the test queues 254 unacked frames (far beyond the protocol TX window of 32), then
  applies a cumulative ACK; the signed mod-256 distance is ambiguous once more than 128 frames are
  pending. The implementation is correct for the real window (<128); the test scenario is invalid.
  Fix the TEST to reach seq 254 realistically: send/ack in batches (e.g. for each seq 0..253,
  `prepareData` then `onAck(seq)`), then send seq 254, 255, 0 and `onAck(0)`; assert 3 then 0
  outstanding. Do not change `XiaomiL1.onAck`/`seqDistance` unless you find a real protocol bug
  (window 32 means max 32 outstanding, so the current logic is fine).

1. Fix that test (only if the diagnosis above is confirmed by reading the code).
2. Run `export JAVA_HOME=/opt/homebrew/opt/openjdk@21; ./gradlew :driver:xiaomi:testDebugUnitTest --console=plain`.
   Do NOT run lintDebug or app builds; another Gradle process may be holding the project and lint
   hung last time. Confirm test-result XML exists and report the exact pass/fail counts per class.
3. If compilation or another test fails, fix only non-secret issues in this module (codecs,
   transport, device commands, driver recognition/session skeleton, tests). Leave auth/sync stubs.
4. Quickly audit the module for accidental secret logic: `auth/XiaomiAuthenticatorImpl.kt` must
   contain only TODO/UnsupportedDeviceException, no HKDF/HMAC/AES/ECDH/token/cloud code. Report if
   that is not true.
5. Report: files changed, test counts, any remaining TODO (with file:line), and whether the module
   is ready for the crypto and fitness agents. Do not commit.
