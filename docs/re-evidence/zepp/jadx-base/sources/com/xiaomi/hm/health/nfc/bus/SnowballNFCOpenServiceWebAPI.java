package com.xiaomi.hm.health.nfc.bus;

import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.City;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.api.ISnowballWebApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/nfc/bus/SnowballNFCOpenServiceWebAPI;", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "", "aid", "number", "Lcom/huami/nfc/base/PayResponse;", "getCardNumber", "Lcom/huami/nfc/applet/City;", "city", "deviceId", "", "deleteApp", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "a", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "snowballWebApi", "<init>", "(Lcom/huami/nfc/bus/api/ISnowballWebApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SnowballNFCOpenServiceWebAPI implements INFCOpenServiceWebAPI {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISnowballWebApi snowballWebApi;

    public SnowballNFCOpenServiceWebAPI(@NotNull ISnowballWebApi iSnowballWebApi) {
        this.snowballWebApi = iSnowballWebApi;
    }

    @Override // com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull City city, @NotNull String deviceId) {
        return Intrinsics.areEqual(city.getAppCode(), City.ShangHai.getAppCode()) ? this.snowballWebApi.safeDeleteApp(city.getAppCode(), deviceId) : this.snowballWebApi.deleteApp(city.getAppCode(), deviceId);
    }

    @Override // com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String aid, @NotNull String number) {
        return this.snowballWebApi.getCardNumber(BusCardExtensions.fromAid(aid).getAppCode());
    }
}
