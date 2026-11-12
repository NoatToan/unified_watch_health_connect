You are implementing the cryptography primitives and cloud request signer for the Xiaomi MiWear
driver in `/Users/Apple/Documents/Projects/noattoan/unified_health_app`, module `:driver:xiaomi`.
This is SECRET-BEARING work. Work only inside `driver/xiaomi/`.

Read first:
- `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md` §5 (crypto) and §8 (cloud signing)
- `docs/protocols/XIAOMI_TEST_VECTORS.json` (`authCrypto`, `authCcm`, `l2Ctr`, `cloudPost`, `cloudGet`)
- `docs/DECISIONS.md` D-1193 (cloud self-bind is blocked by Xiaomi Passport; do not wire it)
- existing `driver/xiaomi` sources, especially `proto/NanoProto.kt`, `transport/XiaomiLink.kt` if present

DELIVERABLES (all under `driver/xiaomi/src/main/kotlin/com/unified/health/driver/xiaomi/`):

1. `crypto/XiaomiCrypto.kt` (you may split into small files):
   - HKDF-SHA256: Extract PRK = HMAC-SHA256(key=saltInput, message=ikm); Expand with
     info=ASCII(label), L=64, counter 1.., HMAC(PRK, prev||info||counter). Argument order per §5.1.
   - HMAC-SHA256 raw 32 bytes.
   - AES-CCM encrypt/decrypt with 32-bit MAC tag, 12-byte nonce, optional AAD; result is
     ciphertext||tag(4). Use BouncyCastle `bcprov-jdk18on` (already a dependency):
     `Cipher.getInstance("AES/CCM/NoPadding", "BC")` with `AEADParameters`.
   - AES-128-CTR/NoPadding with key=IV.
   - ECDH P-256: generate keypair, encode public key X||Y 64 bytes (uncompressed without 0x04),
     decode peer 64-byte public key, shared secret 32-byte X coordinate.
   - Constant-time compare with `MessageDigest.isEqual`.
   - Never log keys/tokens/plaintext/derived bytes.

2. `auth/XiaomiToken.kt`: parse a 16-byte device token from 32 hex chars (upper/lower case,
   optional `0x`, surrounding whitespace); reject wrong length/characters; uppercase hex output
   helper. Tests must not contain a real token.

3. `cloud/XiaomiCloudSigner.kt` + minimal models: implement §8.2 ONLY as pure functions:
   - keyString/keyBytes from Base64(security) and Base64(nonce) = Base64(SHA256(decode(sec)||decode(nonce)));
   - POST: sorted canonical tree, `rc4_hash_raw = Base64(SHA1(canonical))`, insert
     `rc4_hash__`, fresh stateful RC4 (discard 1024 bytes) encrypting values in sorted-key order,
     `signature = Base64(SHA1(canonical(encrypted)))`, return encrypted form fields;
   - GET: HMAC-SHA256 signature and canonical query;
   - response decrypt: Base64-decode then RC4 (fresh state, discard 1024) to UTF-8 JSON.
   Verify against BOTH `cloudPost` and `cloudGet` vectors. Do NOT add OkHttp/INTERNET permission,
   do NOT call the network, do NOT wire cloud binding anywhere. Cloud self-bind remains blocked
   (D-1193); this is completeness/tested code only.

4. Tests (`driver/xiaomi/src/test/kotlin/...`):
   - HKDF -> OKM64, key split 16/16/4/4, deviceSign/appSign exact vectors.
   - AES-CCM dc0 vector -> ciphertext||tag; decrypt round-trip; wrong AAD/tag fails.
   - AES-CTR L2 vector.
   - ECDH symmetry with two generated P-256 keypairs; shared secret 32 bytes.
   - token parse/format edge cases.
   - cloud POST and GET vectors exact.

CONSTRAINTS:
- Use `WearableProtocolException` subclasses where a failure crosses the driver API; primitive
  functions may throw `GeneralSecurityException`/`IllegalArgumentException` but must be documented.
- Do not edit `sync/`, `transport/` semantics, or anything outside `driver/xiaomi/`.
- Do not commit. No GPL code, no vendor secret/white-box key.

VERIFY:
```
export JAVA_HOME=/opt/homebrew/opt/openjdk@21
./gradlew :driver:xiaomi:testDebugUnitTest :driver:xiaomi:lintDebug
```
Confirm test XML exists. Report files, test count/result, and any vector mismatch with exact bytes.
