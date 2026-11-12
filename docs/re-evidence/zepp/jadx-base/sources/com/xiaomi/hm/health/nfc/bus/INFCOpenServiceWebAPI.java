package com.xiaomi.hm.health.nfc.bus;

import com.huami.nfc.applet.City;
import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "", "", "aid", "number", "Lcom/huami/nfc/base/PayResponse;", "getCardNumber", "Lcom/huami/nfc/applet/City;", "city", "deviceId", "", "deleteApp", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface INFCOpenServiceWebAPI {
    @NotNull
    PayResponse<Unit> deleteApp(@NotNull City city, @NotNull String deviceId);

    @NotNull
    PayResponse<String> getCardNumber(@NotNull String aid, @NotNull String number);
}
