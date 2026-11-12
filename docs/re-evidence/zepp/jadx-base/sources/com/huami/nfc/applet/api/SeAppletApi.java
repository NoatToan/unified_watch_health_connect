package com.huami.nfc.applet.api;

import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.BalanceException;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.OverdraftException;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.PayResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\n\u001a\u00020\u0003H&J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u001e"}, d2 = {"Lcom/huami/nfc/applet/api/SeAppletApi;", "", "Lcom/huami/nfc/base/PayResponse;", "", "getCplc", "appCode", "", "getBalance", "", "activateCard", "aid", "setDefaultCard", "setDefaultCardBySearchSe", "setDefaultCardBySeResponse", "deactivateCard", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "", "aids", "getAppletsState", "aidList", "getDefaultCard", "getDefaultCardAid", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "", "isInstalled", "getLingNanTongCityCode", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public interface SeAppletApi {
    @NotNull
    PayResponse<Unit> activateCard(@NotNull String appCode);

    @NotNull
    PayResponse<Unit> deactivateCard(@NotNull String aid);

    @NotNull
    PayResponse<AppletState> getAppletState(@NotNull String aid);

    @NotNull
    PayResponse<List<AppletState>> getAppletsState(@NotNull List<String> aids);

    @NotNull
    PayResponse<Integer> getBalance(@NotNull String appCode) throws OverdraftException, BalanceException;

    @NotNull
    PayResponse<CardInfo> getCardInfo(@NotNull String appCode);

    @NotNull
    PayResponse<String> getCplc();

    @NotNull
    PayResponse<AppletState> getDefaultCard(@NotNull List<String> aidList);

    @NotNull
    PayResponse<String> getDefaultCardAid(@NotNull List<String> aidList);

    @NotNull
    PayResponse<String> getLingNanTongCityCode();

    @NotNull
    PayResponse<List<TransEntity>> getTransRecord(@NotNull String appCode);

    @NotNull
    PayResponse<Boolean> isInstalled(@NotNull String appCode);

    @NotNull
    PayResponse<Unit> setDefaultCard(@NotNull String aid);

    @NotNull
    PayResponse<Unit> setDefaultCardBySeResponse(@NotNull String aid);

    @NotNull
    PayResponse<Unit> setDefaultCardBySearchSe(@NotNull String aid);
}
