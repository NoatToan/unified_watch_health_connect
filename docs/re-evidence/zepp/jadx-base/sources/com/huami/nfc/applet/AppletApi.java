package com.huami.nfc.applet;

import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0096\u0001J\u0019\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0096\u0001J\u0019\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0096\u0001J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0096\u0001J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0096\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u0096\u0001R\u0016\u0010\u001e\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/nfc/applet/AppletApi;", "Lcom/huami/nfc/applet/ITrafficCardApplet;", "Lcom/huami/nfc/applet/ICommonApplet;", "", "aid", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getChargeRecord", "getTransRecord", "", "isInstalled", "isDefault", "activateCard", "activateCardByResponse", "activateCardBySearchSe", "Lcom/huami/nfc/applet/AppletState;", "getActiveApplet", "getAppletInfoFromSe", "getAppletState", "aids", "getAppletStateFromSe", "getAppletsState", "getCplc", "getLingNanTongCityCode", "a", "Lcom/huami/nfc/applet/ITrafficCardApplet;", "bus", "b", "Lcom/huami/nfc/applet/ICommonApplet;", NavigateContent.TOPIC_COMMON_TYPE, "<init>", "(Lcom/huami/nfc/applet/ITrafficCardApplet;Lcom/huami/nfc/applet/ICommonApplet;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppletApi implements ITrafficCardApplet, ICommonApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ITrafficCardApplet bus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ICommonApplet common;

    public AppletApi(@NotNull ITrafficCardApplet iTrafficCardApplet, @NotNull ICommonApplet iCommonApplet) {
        this.bus = iTrafficCardApplet;
        this.common = iCommonApplet;
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCard(@NotNull String aid, boolean isDefault) {
        return this.common.activateCard(aid, isDefault);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCardByResponse(@NotNull String aid, boolean isDefault) {
        return this.common.activateCardByResponse(aid, isDefault);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCardBySearchSe(@NotNull String aid, boolean isDefault) {
        return this.common.activateCardBySearchSe(aid, isDefault);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @Nullable
    public AppletState getActiveApplet() {
        return this.common.getActiveApplet();
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getAppletInfoFromSe() {
        return this.common.getAppletInfoFromSe();
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public AppletState getAppletState(@NotNull String aid) {
        return this.common.getAppletState(aid);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public List<AppletState> getAppletStateFromSe(@NotNull List<String> aids) {
        return this.common.getAppletStateFromSe(aids);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public List<AppletState> getAppletsState(@NotNull List<String> aids) {
        return this.common.getAppletsState(aids);
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    public int getBalance(@NotNull String aid) {
        return this.bus.getBalance(aid);
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public CardInfo getCardInfo(@NotNull String aid) {
        return this.bus.getCardInfo(aid);
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public List<TransEntity> getChargeRecord(@NotNull String aid) {
        return this.bus.getChargeRecord(aid);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getCplc() {
        return this.common.getCplc();
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getLingNanTongCityCode() {
        return this.common.getLingNanTongCityCode();
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    @NotNull
    public List<TransEntity> getTransRecord(@NotNull String aid) {
        return this.bus.getTransRecord(aid);
    }

    @Override // com.huami.nfc.applet.ITrafficCardApplet
    public boolean isInstalled(@NotNull String aid) {
        return this.bus.isInstalled(aid);
    }
}
