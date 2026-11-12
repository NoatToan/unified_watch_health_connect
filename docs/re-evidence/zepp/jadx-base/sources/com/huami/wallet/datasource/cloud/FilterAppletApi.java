package com.huami.wallet.datasource.cloud;

import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.PayResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001J#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0001J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0001J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0001J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0001J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096\u0001J\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001R\u0016\u0010 \u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/wallet/datasource/cloud/FilterAppletApi;", "Lcom/huami/nfc/applet/api/SeAppletApi;", "", "appCode", "Lcom/huami/nfc/base/PayResponse;", "", "activateCard", "aid", "deactivateCard", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "", "aids", "getAppletsState", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "getCplc", "aidList", "getDefaultCard", "getDefaultCardAid", "getLingNanTongCityCode", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "", "isInstalled", "setDefaultCard", "setDefaultCardBySeResponse", "setDefaultCardBySearchSe", "a", "Lcom/huami/nfc/applet/api/SeAppletApi;", "delegate", "<init>", "(Lcom/huami/nfc/applet/api/SeAppletApi;)V", "cloud-api_release"}, k = 1, mv = {1, 5, 1})
public class FilterAppletApi implements SeAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SeAppletApi delegate;

    public FilterAppletApi(@NotNull SeAppletApi seAppletApi) {
        this.delegate = seAppletApi;
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> activateCard(@NotNull String appCode) {
        return this.delegate.activateCard(appCode);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> deactivateCard(@NotNull String aid) {
        return this.delegate.deactivateCard(aid);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getAppletState(@NotNull String aid) {
        return this.delegate.getAppletState(aid);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<AppletState>> getAppletsState(@NotNull List<String> aids) {
        return this.delegate.getAppletsState(aids);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String appCode) {
        return this.delegate.getBalance(appCode);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String appCode) {
        return this.delegate.getCardInfo(appCode);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getCplc() {
        return this.delegate.getCplc();
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getDefaultCard(@NotNull List<String> aidList) {
        return this.delegate.getDefaultCard(aidList);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getDefaultCardAid(@NotNull List<String> aidList) {
        return this.delegate.getDefaultCardAid(aidList);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getLingNanTongCityCode() {
        return this.delegate.getLingNanTongCityCode();
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransRecord(@NotNull String appCode) {
        return this.delegate.getTransRecord(appCode);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Boolean> isInstalled(@NotNull String appCode) {
        return this.delegate.isInstalled(appCode);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCard(@NotNull String aid) {
        return this.delegate.setDefaultCard(aid);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySeResponse(@NotNull String aid) {
        return this.delegate.setDefaultCardBySeResponse(aid);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySearchSe(@NotNull String aid) {
        return this.delegate.setDefaultCardBySearchSe(aid);
    }
}
