package com.xiaomi.hm.health.nfc.bus;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000¨\u0006\u0003"}, d2 = {"", "isNfcDeviceConnected", "isClassicBluetoothWatch", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class BusDeviceUtilKt {
    public static final boolean isClassicBluetoothWatch() {
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceManager.getInstance().getMajorDeviceType());
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue((bindInfo == null ? null : bindInfo.getDevice_source()).intValue());
        return hMDeviceSourceFromValue == HMDeviceSource.WATCH_AMAZFIT_QOG || hMDeviceSourceFromValue == HMDeviceSource.WATCH_AMAZFIT_XIHU || hMDeviceSourceFromValue == HMDeviceSource.WATCH_AMAZFIT_XIHU_E || hMDeviceSourceFromValue == HMDeviceSource.WATCH_AMAZFIT_XIHU_EA || hMDeviceSourceFromValue == HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY;
    }

    public static final boolean isNfcDeviceConnected() {
        if (isClassicBluetoothWatch()) {
            return HMDeviceManager.getInstance().isConnected(HMDeviceType.WATCH);
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        return device != null && device.isConnected();
    }
}
