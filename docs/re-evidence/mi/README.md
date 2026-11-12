# Xiaomi / MiWear evidence

Source: Mi Fitness `com.mi.health` 3.46.1 (versionCode 346001), APK in `docs/apks/`.

- `jadx-base/` — full jadx decompile (≈519 MB), **local-only and gitignored** (`docs/re-evidence/*/jadx-*/`).
  Paths cited by the protocol docs refer to this tree.
- `proto/` — `.proto` files accidentally bundled at APK root (vendor files, local-only, gitignored).
- `tools/gen_vectors.js` — generates the reference byte vectors (CRC-16/ARC, protobuf frames,
  HKDF/HMAC, AES-CCM tag 4, AES-CTR, cloud RC4/signature).
- The committed distilled references are `docs/protocols/XIAOMI_MIWEAR_DEVICE_PROTOCOL.md`,
  `docs/protocols/XIAOMI_IMPLEMENTATION_BRIEF.md` and `docs/protocols/XIAOMI_TEST_VECTORS.json`.

Key source files for citations: see the protocol doc §11. Cross-check [Ext]: Gadgetbridge
`service/devices/xiaomi/XiaomiAuthService.java`, `XiaomiBleProtocolV2.java`, `XiaomiUuids.java`.
