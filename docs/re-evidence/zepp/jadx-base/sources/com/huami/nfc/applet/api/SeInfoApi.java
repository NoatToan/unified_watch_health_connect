package com.huami.nfc.applet.api;

import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/nfc/applet/api/SeInfoApi;", "", "", ParamKey.deviceSn, "Lcom/huami/nfc/base/PayResponse;", "getClpcFromCache", "getCplc", "cplc", "getSeId", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface SeInfoApi {
    @NotNull
    PayResponse<String> getClpcFromCache(@NotNull String deviceSn);

    @NotNull
    PayResponse<String> getCplc(@NotNull String deviceSn);

    @NotNull
    PayResponse<String> getSeId(@NotNull String cplc);
}
