package com.xiaomi.hm.health.nfc.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/INfcOpenService;", "", "", "info", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "getSeId", "Lcom/xiaomi/hm/health/nfc/service/CardInfoEntity;", "queryCardInfo", "", "deleteCard", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface INfcOpenService {
    @NotNull
    NfcOpenServiceResponse<Unit> deleteCard(@NotNull Map<Object, ? extends Object> info);

    @NotNull
    NfcOpenServiceResponse<SeInfoEntity> getSeId(@NotNull Map<Object, ? extends Object> info);

    @NotNull
    NfcOpenServiceResponse<CardInfoEntity> queryCardInfo(@NotNull Map<Object, ? extends Object> info);
}
