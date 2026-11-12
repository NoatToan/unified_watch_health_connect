package com.xiaomi.hm.health.device.headset;

import com.alipay.sdk.m.u.i;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "", "toPrintString", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HeadSetSportSettingViewModelKt {
    @NotNull
    public static final String toPrintString(@NotNull HeadsetSportSetting headsetSportSetting) {
        return "{" + headsetSportSetting.getMeterEnhancement() + "," + headsetSportSetting.getAutoSideListen() + "," + headsetSportSetting.getHrBroadcast() + i.d;
    }
}
