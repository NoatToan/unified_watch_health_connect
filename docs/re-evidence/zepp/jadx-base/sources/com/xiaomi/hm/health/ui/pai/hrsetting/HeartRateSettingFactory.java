package com.xiaomi.hm.health.ui.pai.hrsetting;

import com.huami.pai.ui.hrsetting.IHeartRateSetting;
import com.huami.pai.ui.hrsetting.IHeartRateSettingFactory;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.ui.heartrate.HeartRateUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/hrsetting/HeartRateSettingFactory;", "Lcom/huami/pai/ui/hrsetting/IHeartRateSettingFactory;", "", "strategy", "Lcom/huami/pai/ui/hrsetting/IHeartRateSetting;", "getHrDevice", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRateSettingFactory implements IHeartRateSettingFactory {
    public static final int DETAIL_STRATEGY = 0;
    public static final int HOME_STRATEGY = 1;

    @Override // com.huami.pai.ui.hrsetting.IHeartRateSettingFactory
    @NotNull
    public IHeartRateSetting getHrDevice(int strategy) {
        if (!HMDeviceConfig.hasBoundPai()) {
            if (strategy == 1) {
                return new NoHeartRateSetting();
            }
            if (HMDeviceConfig.hasBoundClassicWatch()) {
                return new NoPaiAssistHeartRateSetting();
            }
            return HeartRateUtils.INSTANCE.isSupportFullHr() ? new NoPaiGTHeartRateSetting() : new NoHeartRateSetting();
        }
        if (HMDeviceConfig.isVirtual()) {
            return new DefaultHeartRateSetting();
        }
        if (HMDeviceConfig.hasBoundClassicWatch()) {
            return new AssistHeartRateSetting();
        }
        if (HMDeviceConfig.isTokyo()) {
            return new TokyoHeartRateSetting();
        }
        return HMDeviceConfig.isGt2() ? new Gt2HeartRateSetting() : new GTHeartRateSetting();
    }
}
