package com.huami.wallet.datasource.cloud;

import com.huami.nfc.base.PayResponse;
import com.huami.wallet.lib.entity.BusCardSimple2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/huami/wallet/datasource/cloud/SyncAppletApi;", "", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "list", "Lcom/huami/nfc/base/PayResponse;", "", "syncAppletList", "", "appCode", "Lcom/huami/wallet/datasource/cloud/ChangeCityType;", "type", "notifyToDevice", "cloud-api_release"}, k = 1, mv = {1, 5, 1})
public interface SyncAppletApi {
    @NotNull
    PayResponse<Unit> notifyToDevice(@NotNull String appCode, @NotNull ChangeCityType type);

    @NotNull
    PayResponse<Unit> syncAppletList(@NotNull List<? extends BusCardSimple2> list);
}
