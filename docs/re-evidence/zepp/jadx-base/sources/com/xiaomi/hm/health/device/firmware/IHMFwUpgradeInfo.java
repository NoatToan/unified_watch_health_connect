package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;

/* JADX INFO: loaded from: classes20.dex */
public interface IHMFwUpgradeInfo {
    public static final int AGPS = 7;
    public static final int BLUEMONKEY = 10;
    public static final int CHAOHU = 8;
    public static final int CHAOHU_GPS = 9;
    public static final int EARBUD = 13;
    public static final int FONT = 5;
    public static final int HEADSET = 12;
    public static final int INVALID = -1;
    public static final int MILI = 0;
    public static final int MILI_HR = 1;
    public static final int NORMANDY = 4;
    public static final int RESOURCE = 6;
    public static final int SHOES = 3;
    public static final int TREADMILL = 11;
    public static final int WEIGHT = 2;

    boolean deleteFwFile();

    Context getContext();

    HMDeviceSource getDeviceSource();

    HMFirmwareType getFirmwareType();

    String getFwFilePath();

    int getFwType();

    String getFwVersionName();

    boolean isForceUpgrade();
}
