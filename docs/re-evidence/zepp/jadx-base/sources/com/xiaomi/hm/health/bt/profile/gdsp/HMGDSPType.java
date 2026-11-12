package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.model.HMDisplaySetting;

/* JADX INFO: loaded from: classes13.dex */
public enum HMGDSPType {
    ACTIVITY((byte) 1),
    HEARTRATE((byte) 2),
    ECG((byte) 3),
    TEMPERATURE((byte) 4),
    GPS_SUMMARY((byte) 5),
    GPS_DETAIL((byte) 6),
    LOG((byte) 7),
    PPG_RR((byte) 8),
    PROTO((byte) 9),
    HEADSET_HEALTH(HMDisplaySetting.TYPE_OSPREY_W),
    DEVICE_SETTINGS(HMDisplaySetting.TYPE_VENICE),
    GEO((byte) 64),
    AF((byte) 10);

    private byte mValue;

    HMGDSPType(byte type) {
        this.mValue = (byte) 0;
        this.mValue = type;
    }

    public byte getValue() {
        return this.mValue;
    }
}
