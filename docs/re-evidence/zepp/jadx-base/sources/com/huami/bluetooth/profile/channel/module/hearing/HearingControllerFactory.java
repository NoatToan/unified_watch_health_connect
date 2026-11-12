package com.huami.bluetooth.profile.channel.module.hearing;

import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingControllerFactory;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "create", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingBatteryApi;", "createBatteryApi", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingControllerFactory {

    @NotNull
    public static final HearingControllerFactory INSTANCE = new HearingControllerFactory();

    private HearingControllerFactory() {
    }

    @Nullable
    public final HearingAidApi create(@NotNull BaseProfile baseProfile) {
        HearingAidModule hearingAidModule;
        if (!baseProfile.supportModule(HearingAidModule.class) || (hearingAidModule = (HearingAidModule) baseProfile.getChannelModule(HearingAidModule.class)) == null) {
            return null;
        }
        return hearingAidModule.getHearingAidApi();
    }

    @Nullable
    public final HearingBatteryApi createBatteryApi(@NotNull BaseProfile baseProfile) {
        HearingBatteryModule hearingBatteryModule;
        if (!baseProfile.supportModule(HearingBatteryModule.class) || (hearingBatteryModule = (HearingBatteryModule) baseProfile.getChannelModule(HearingBatteryModule.class)) == null) {
            return null;
        }
        return hearingBatteryModule.getHearingBatteryApi();
    }
}
