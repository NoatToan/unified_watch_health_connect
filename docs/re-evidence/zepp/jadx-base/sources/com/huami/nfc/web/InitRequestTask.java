package com.huami.nfc.web;

import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.base.PayResponse;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/nfc/web/InitRequestTask;", "", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/nfc/base/PayResponse;", "apply", "web_release"}, k = 1, mv = {1, 5, 1})
public interface InitRequestTask {
    @NotNull
    PayResponse<String> apply(@NotNull Map<String, Object> map);
}
