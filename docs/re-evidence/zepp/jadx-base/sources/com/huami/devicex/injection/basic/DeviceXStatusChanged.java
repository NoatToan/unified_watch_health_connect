package com.huami.devicex.injection.basic;

import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface DeviceXStatusChanged {
    void onDeviceBatteryChanged(HMDeviceType hMDeviceType, BatteryInfo batteryInfo);

    void onDeviceBind(HMDeviceType hMDeviceType, boolean z);

    void onDeviceConnectTimeout(HMDeviceType hMDeviceType);

    void onDeviceConnected(HMDeviceType hMDeviceType, boolean z);

    void onDeviceConnecting(HMDeviceType hMDeviceType);

    void onDeviceSyncCenterStatusChange(WorkStatusDto workStatusDto);

    void onDeviceSyncGPSData(HMDeviceType hMDeviceType, boolean z, boolean z2);

    void onDeviceSyncingGPSData(HMDeviceType hMDeviceType, int i);

    void onMajorDeviceSyncDataDone(boolean z);

    void onMajorDeviceSyncDataFail(int i);

    void onMajorDeviceSyncDataSuccess(boolean z);

    void onMajorDeviceSyncing(boolean z);

    void onMajorDeviceSyncingData(int i, RefreshFinishListener refreshFinishListener);

    void onOtherDeviceSyncEnd();
}
