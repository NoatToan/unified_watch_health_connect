# Per-brand analysis — connection & auth

Merged 2026-11-08 from the local per-brand RE trees (`garmin-analysis/`, `zepp-analysis/`,
`rea-output/huawei/`, `rea-output/coros/`). One connection dossier and one auth dossier per brand, 1:1.

| Brand | Connection / session | Auth & crypto |
|---|---|---|
| Garmin | [GARMIN_CONNECTION_ANALYSIS.md](GARMIN_CONNECTION_ANALYSIS.md) | [GARMIN_AUTH_CRYPTO_ANALYSIS.md](GARMIN_AUTH_CRYPTO_ANALYSIS.md) |
| Zepp / Amazfit | [ZEPP_CONNECTION_ANALYSIS.md](ZEPP_CONNECTION_ANALYSIS.md) | [ZEPP_AUTH_CRYPTO_ANALYSIS.md](ZEPP_AUTH_CRYPTO_ANALYSIS.md) |
| Huawei | [HUAWEI_CONNECTION_ANALYSIS.md](HUAWEI_CONNECTION_ANALYSIS.md) | [HUAWEI_AUTH_CRYPTO_ANALYSIS.md](HUAWEI_AUTH_CRYPTO_ANALYSIS.md) |
| COROS | [COROS_CONNECTION_ANALYSIS.md](COROS_CONNECTION_ANALYSIS.md) | [COROS_AUTH_CRYPTO_ANALYSIS.md](COROS_AUTH_CRYPTO_ANALYSIS.md) |

Scope: how each vendor app discovers, connects, holds the session context and does basic operations
(time/battery/device info/live HR), plus the authentication and payload-cipher mechanisms needed to
interoperate with the user's own device. Every claim is tagged `[V]` verified in decompiled code,
`[I]` inferred, `[Ext]` public/native.

No vendor secret keys are extracted or embedded. Blockers that require vendor trust anchors
(Huawei white-box CAK/HiChain, Zepp cloud first-bind signature) are stated explicitly; they are not
bypassed.

Findings marked in the connection dossiers as corrections to `docs/protocols/` are being applied
separately. Real-watch / HCI-capture items remain open in the implementation briefs.
