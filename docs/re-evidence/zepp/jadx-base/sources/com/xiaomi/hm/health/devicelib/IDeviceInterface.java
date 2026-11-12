package com.xiaomi.hm.health.devicelib;

import com.huami.bluetooth.profile.ecf.data.AppState;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;

/* JADX INFO: loaded from: classes21.dex */
public interface IDeviceInterface {
    void enableRealtimeHeartRate(HMDeviceSource hMDeviceSource, boolean z, IDeviceHRCallback iDeviceHRCallback);

    void enableRealtimeStep(HMDeviceSource hMDeviceSource, boolean z, IDeviceStepCallback iDeviceStepCallback);

    void enableSixAxis(HMDeviceSource hMDeviceSource, boolean z, IDeviceCallback iDeviceCallback);

    int getBoundBrandType(HMDeviceType hMDeviceType);

    HMDeviceSource getBoundDevice(HMDeviceType hMDeviceType);

    DeviceBattery getDeviceBattery(HMDeviceSource hMDeviceSource);

    String getDeviceId(HMDeviceSource hMDeviceSource);

    UserData getUserData();

    boolean hasBound(HMDeviceSource hMDeviceSource);

    boolean hasBound(HMDeviceType hMDeviceType);

    boolean isConnected(HMDeviceSource hMDeviceSource);

    void sendSportCommand(HMDeviceSource hMDeviceSource, SportCommand sportCommand, SportInfo sportInfo);

    void sendSportConfig(HMDeviceSource hMDeviceSource, SportConfig sportConfig, IHMSportListener iHMSportListener);

    void sendVerifyDistanceCommand(HMDeviceSource hMDeviceSource, long j, int i, int i2, HMCallback hMCallback);

    void setBatteryCallback(HMDeviceSource hMDeviceSource, IDeviceBatteryCallback iDeviceBatteryCallback);

    void setConnectionCallback(HMDeviceSource hMDeviceSource, IDeviceConnectionCallback iDeviceConnectionCallback);

    void syncAppState(HMDeviceSource hMDeviceSource, AppState appState);

    void vibrateHr(HMDeviceType hMDeviceType, int i);

    void vibratePace(HMDeviceType hMDeviceType, int i);
}
