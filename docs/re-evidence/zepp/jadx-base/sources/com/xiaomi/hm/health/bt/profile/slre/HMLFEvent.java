package com.xiaomi.hm.health.bt.profile.slre;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes18.dex */
public class HMLFEvent {
    public static final int HEART_RATE_CLOSE = 0;
    public static final int HEART_RATE_OPEN = 1;
    public static final int MUTE_PHONE_MUTE = 1;
    public static final int MUTE_PHONE_NORMAL = 0;
    public static final int RECORD_START = 1;
    public static final int RECORD_STOP = 0;
    public static final int SPORT_INIT = 0;
    public static final int SPORT_NONE = 1;
    public static final int SPORT_RESUME = 2;
    private LfType a;
    private HMDeviceType b;
    private byte[] c = null;

    public HMLFEvent(HMDeviceType deviceType, LfType type) {
        this.a = LfType.UNKNOWN;
        this.b = HMDeviceType.VDevice;
        this.b = deviceType;
        this.a = type;
    }

    public HMDeviceType getDeviceType() {
        return this.b;
    }

    public byte[] getExtra() {
        return this.c;
    }

    public LfType getLfType() {
        return this.a;
    }

    public void setDeviceType(HMDeviceType deviceType) {
        this.b = deviceType;
    }

    public void setExtra(byte[] extra) {
        this.c = extra;
    }

    public void setLfType(LfType type) {
        this.a = type;
    }

    public String toString() {
        return "HMLFEvent{mType=" + this.a + ", mDeviceType=" + this.b + ", extra=" + GattUtils.bytesToHexString(this.c) + '}';
    }
}
