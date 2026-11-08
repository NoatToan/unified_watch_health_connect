# Docs

| Path | Contents |
|---|---|
| `protocols/<BRAND>_DEVICE_PROTOCOL.md` | Wire protocol per brand (GATT services, framing, handshake, commands, sync), each fact tagged [V] verified / [I] inferred / [Ext] public spec |
| `protocols/<BRAND>_IMPLEMENTATION_BRIEF.md` | Engineer checklist derived from the protocol docs: RESOLVED / PARTIAL / NEEDS-REAL-WATCH |
| `re-evidence/<brand>/*.md` | Distilled evidence the protocol docs cite (short excerpts and identifiers only) |
| `analysis/<BRAND>_{CONNECTION,AUTH_CRYPTO}_ANALYSIS.md` | Per-brand deep dives: connection/session lifecycle and auth/crypto, 1:1 per vendor ([README](analysis/README.md)) |
| `re-analysis/` | Local-only raw RE artifacts (APKs, dex, jadx trees, rea JSON) moved from the workspace root; gitignored, never committed (D-017) |
| `architecture/` | App architecture and per-brand connection/auth sequence with Mermaid diagrams ([README](architecture/README.md)) |
| `DECISIONS.md` | Every engineering decision with its rationale (Vietnamese) |
| `SCREEN_INVENTORY.md` | Screens of the vendor apps mapped to Unified Health, with the merge plan |
| `e2e-report/` | Latest instrumented E2E run: ordered screenshots per flow ([README](e2e-report/README.md), `index.html`) |
| `archive/driver-huawei-wearengine/` | Former Huawei driver built on the WearEngine SDK, removed when the app went BLE-only |

Vendor APKs and full decompiled sources are intentionally not included. Some protocol docs cite paths inside a local
decompile (`jadx-*`, `*-analysis/…`, `rea-output/…`); those trees exist only on the analyst's machine.
