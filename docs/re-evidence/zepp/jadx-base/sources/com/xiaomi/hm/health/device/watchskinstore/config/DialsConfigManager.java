package com.xiaomi.hm.health.device.watchskinstore.config;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/config/DialsConfigManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/watchskinstore/config/DeviceDialsConfig;", "getDialsConfig", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialsConfigManager {

    @NotNull
    public static final DialsConfigManager INSTANCE = new DialsConfigManager();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_KONGMING_LITE.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_KONGMING_PRO_L.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_PANGU.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_PANGU_L.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_L66.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_L66_AP.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_L66_IN.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_L66_NFC.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_L66_WE.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_L66_I.ordinal()] = 14;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DialsConfigManager() {
    }

    public static /* synthetic */ DeviceDialsConfig getDialsConfig$default(DialsConfigManager dialsConfigManager, HMDeviceSource hMDeviceSource, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = null;
        }
        return dialsConfigManager.getDialsConfig(hMDeviceSource);
    }

    @NotNull
    public final DeviceDialsConfig getDialsConfig(@Nullable HMDeviceSource source) {
        switch (source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
                return new KongMingDials();
            case 3:
                return new KongMingLiteDials();
            case 4:
            case 5:
            case 6:
            case 7:
                return new KongMingProDials();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new L66Dials();
            default:
                return new DefaultDials();
        }
    }
}
