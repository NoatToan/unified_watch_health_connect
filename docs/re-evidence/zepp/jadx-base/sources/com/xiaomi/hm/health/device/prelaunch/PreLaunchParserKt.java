package com.xiaomi.hm.health.device.prelaunch;

import com.huami.prelaunch.elements.Text;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/huami/prelaunch/elements/Text;", "getDeviceTextBySource", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class PreLaunchParserKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_LISBON_W.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Text getDeviceTextBySource(@NotNull HMDeviceSource hMDeviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) {
            case 1:
                return Text.ONYX_DEVICE_NAME;
            case 2:
                return Text.CORSICA_DEVICE_NAME;
            case 3:
                return Text.OSPREY_DEVICE_NAME;
            case 4:
                return Text.OSPREY_DEVICE_NAME;
            case 5:
                return Text.OSPREY_DEVICE_NAME;
            case 6:
                return Text.OSPREY_DEVICE_NAME;
            case 7:
                return Text.OSPREY_DEVICE_NAME;
            default:
                return Text.ONYX_DEVICE_NAME;
        }
    }
}
