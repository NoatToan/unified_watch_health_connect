package com.huami.nfc.door.api;

import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.nfc.base.PayResponse;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/door/api/IIdentityApi;", "", "Lcom/huami/nfc/base/PayResponse;", "", "query", "", "type", "frontImage", "backImage", "", "verify", "realName", "cardNo", Constant.KEY_CARD_TYPE, PhoneBindActivity.EXTRA_BIND_TYPE, "bind", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public interface IIdentityApi {
    @NotNull
    PayResponse<Unit> bind(@NotNull String realName, @NotNull String cardNo, @NotNull String cardType, int bindType);

    @NotNull
    PayResponse<Integer> query();

    @NotNull
    PayResponse<Unit> verify(@NotNull String type, @NotNull String frontImage, @NotNull String backImage);
}
