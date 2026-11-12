package com.xiaomi.hm.health.nfc.door;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getHMBaseBleDevice", "", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class BandSupportBleDeviceKt {
    private static final boolean a() {
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceManager.getInstance().getMajorDeviceType());
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue((bindInfo == null ? null : bindInfo.getDevice_source()).intValue());
        return hMDeviceSourceFromValue == HMDeviceSource.SMART_WATCH_EVEREST_2 || hMDeviceSourceFromValue == HMDeviceSource.SMART_WATCH_EVEREST_2S || hMDeviceSourceFromValue == HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR;
    }

    @Nullable
    public static final HMBaseDevice getHMBaseBleDevice() {
        return HMDeviceManager.getInstance().getDevice(a() ? HMDeviceType.WATCH : HMDeviceType.MILI);
    }
}
