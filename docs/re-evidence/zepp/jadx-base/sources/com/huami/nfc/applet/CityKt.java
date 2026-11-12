package com.huami.nfc.applet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/nfc/applet/City;", "", "getCardName", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
public final class CityKt {
    @NotNull
    public static final String getCardName(@NotNull City city) {
        BusCard busCardFromAppCode = BusCardExtensions.fromAppCode(city.getAppCode());
        if (!BusCardExtensions.getLNT_CITYS().contains(city.getAppCode())) {
            return busCardFromAppCode.getName();
        }
        return busCardFromAppCode.getName() + '(' + busCardFromAppCode.getAppCode() + ')';
    }
}
