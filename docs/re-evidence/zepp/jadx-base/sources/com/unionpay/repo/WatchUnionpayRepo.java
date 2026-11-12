package com.unionpay.repo;

import android.os.Bundle;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import com.tekartik.sqflite.Constant;
import com.unionpay.entity.SimpleChannel;
import com.unionpay.entity.WatchBankCardInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u000fH&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u0016H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u0016H&J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&J\u0016\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006&"}, d2 = {"Lcom/unionpay/repo/WatchUnionpayRepo;", "", "", "getWebHost", "url", "Landroid/os/Bundle;", "extras", "", "goToWeb", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "getBindCards", "aidList", "deleteCards", "aid", "", "bindCard", "getTsmDownloadUrl", "getCplc", "getDeviceModel", "queryPwd", "verifyPwd", "", "Lcom/unionpay/entity/SimpleChannel;", "openLogicChannel", "", "channelId", "closeLogicChannel", Constant.h, "transmit", "syncDeleteResultToDevice", "info", "syncCardInfoToDevice", "", "Lcom/unionpay/entity/WatchBankCardInfo;", "cardList", "syncCardListToDevice", "syncIssueResultToDevice", "watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public interface WatchUnionpayRepo {
    boolean bindCard(@NotNull String aid);

    int closeLogicChannel(int channelId);

    void deleteCards(@NotNull List<String> aidList);

    @Nullable
    List<BankCardBindStatus> getBindCards();

    @NotNull
    String getCplc();

    @NotNull
    String getDeviceModel();

    @NotNull
    String getTsmDownloadUrl();

    @NotNull
    String getWebHost();

    void goToWeb(@NotNull String url, @Nullable Bundle extras);

    @Nullable
    SimpleChannel openLogicChannel(@NotNull byte[] aid);

    boolean queryPwd();

    void syncCardInfoToDevice(@NotNull String aid, @NotNull String info);

    void syncCardListToDevice(@NotNull List<WatchBankCardInfo> cardList);

    void syncDeleteResultToDevice(@NotNull String aid);

    void syncIssueResultToDevice(@NotNull String aid);

    @Nullable
    byte[] transmit(@NotNull byte[] cmd);

    boolean verifyPwd();
}
