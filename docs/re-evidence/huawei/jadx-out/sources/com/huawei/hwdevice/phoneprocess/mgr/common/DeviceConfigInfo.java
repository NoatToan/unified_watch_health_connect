package com.huawei.hwdevice.phoneprocess.mgr.common;

import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import defpackage.eeg;

/* JADX INFO: loaded from: classes10.dex */
public enum DeviceConfigInfo {
    GolfDevice("hw.unitedevice.golf", "com.huawei.health.wear.golf", 105, eeg.b.f32843b, true, true),
    FtpDevice("hw.sport.linkage.app", "hw.sport.linkage.device", OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, eeg.b.e, true, true),
    BloodPressureRemindDevice("hw.unitedevice.bloodpressure", "hw.watch.health.bp", 59, eeg.b.e, false, false),
    WHEEL_CHAIR_DEVICE("hw.unitedevice.wheelchair", "hw.watch.wheelchair", 276, eeg.b.d, true, true),
    GOLF_AUTO_DOWNLOAD("hw.unitedevice.golf", "com.huawei.health.wear.golf", 285, eeg.b.d, true, true),
    DRINK_UNIT("hw.health.healthyLiving", "hw.watch.health.healthyLiving", 303, eeg.b.d, true, true);

    private final int mChannelCapability;
    private final boolean mDataChangeUseDefaultSend;
    private final String mSrcPkgName;
    private final int mSupportCapability;
    private final boolean mUseInitSend;
    private final String mWearPkgName;

    DeviceConfigInfo(String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.mSrcPkgName = str;
        this.mWearPkgName = str2;
        this.mSupportCapability = i;
        this.mChannelCapability = i2;
        this.mDataChangeUseDefaultSend = z;
        this.mUseInitSend = z2;
    }

    public String getSrcPkgName() {
        return this.mSrcPkgName;
    }

    public int getSupportCapability() {
        return this.mSupportCapability;
    }

    public String getWearPkgName() {
        return this.mWearPkgName;
    }

    public int getChannelCapability() {
        return this.mChannelCapability;
    }

    public boolean isDataChangeUseDefaultSend() {
        return this.mDataChangeUseDefaultSend;
    }

    public boolean isUseInitSend() {
        return this.mUseInitSend;
    }
}
