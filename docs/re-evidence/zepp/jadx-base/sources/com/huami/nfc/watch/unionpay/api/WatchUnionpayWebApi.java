package com.huami.nfc.watch.unionpay.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\f\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "getBindCards", "", "aidList", "", "deleteCards", "aid", "bindCard", "appName", "getTsmDownloadUrl", "nfc-watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public interface WatchUnionpayWebApi {
    @NotNull
    PayResponse<Unit> bindCard(@NotNull String aid);

    @NotNull
    PayResponse<Unit> deleteCards(@NotNull List<String> aidList);

    @NotNull
    PayResponse<List<BankCardBindStatus>> getBindCards();

    @NotNull
    PayResponse<String> getTsmDownloadUrl(@NotNull String appName);
}
