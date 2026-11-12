package com.huami.nfc.web;

import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.entity.ApduScript;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/nfc/web/InitRequestApi;", "", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ApduScript;", "initApdu", "requestApdu", "web_release"}, k = 1, mv = {1, 5, 1})
public interface InitRequestApi {
    @NotNull
    PayResponse<ApduScript> initApdu(@NotNull Map<String, Object> map);

    @NotNull
    PayResponse<ApduScript> requestApdu(@NotNull Map<String, Object> map);
}
