package com.unionpay.api;

import com.huami.nfc.base.PayResponse;
import com.tekartik.sqflite.Constant;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.entity.WatchBankCardInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH&J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH&J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH&¨\u0006\u0019"}, d2 = {"Lcom/unionpay/api/WatchUnionpayDeviceApi;", "", "Lcom/huami/nfc/base/PayResponse;", "", "queryPwd", "verifyPwd", "", "aid", "Lcom/unionpay/entity/SimpleChannel;", "openLogicChannel", "", "channelId", "closeLogicChannel", Constant.h, "transmit", "", "", "syncDeleteResultToDevice", "", "Lcom/unionpay/entity/WatchBankCardInfo;", "cardList", "syncCardListToDevice", "info", "syncCardInfoToDevice", "syncIssueResultToDevice", "watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public interface WatchUnionpayDeviceApi {
    @NotNull
    PayResponse<Integer> closeLogicChannel(int channelId);

    @NotNull
    PayResponse<SimpleChannel> openLogicChannel(@NotNull byte[] aid);

    @NotNull
    PayResponse<Boolean> queryPwd();

    void syncCardInfoToDevice(@NotNull String aid, @NotNull String info);

    void syncCardListToDevice(@NotNull List<WatchBankCardInfo> cardList);

    void syncDeleteResultToDevice(@NotNull String aid);

    void syncIssueResultToDevice(@NotNull String aid);

    @NotNull
    PayResponse<byte[]> transmit(@NotNull byte[] cmd);

    @NotNull
    PayResponse<Boolean> verifyPwd();
}
