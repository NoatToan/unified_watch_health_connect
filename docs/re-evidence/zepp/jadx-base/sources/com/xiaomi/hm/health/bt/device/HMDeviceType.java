package com.xiaomi.hm.health.bt.device;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public enum HMDeviceType implements Serializable {
    VDevice(-1),
    MILI(0),
    SENSORHUB(2),
    WEIGHT(1),
    SHOES(3),
    WATCH(4),
    OTHER(5),
    TREADMILL(6),
    HEADSET(7),
    BLOOD_PRESSURE(8),
    EARBUD(9),
    HEARING_AID(12);

    private int mValue;

    HMDeviceType(int i) {
        this.mValue = i;
    }

    public static HMDeviceType fromValue(int i) {
        for (HMDeviceType hMDeviceType : values()) {
            if (i == hMDeviceType.getValue()) {
                return hMDeviceType;
            }
        }
        return VDevice;
    }

    public int getValue() {
        return this.mValue;
    }
}
