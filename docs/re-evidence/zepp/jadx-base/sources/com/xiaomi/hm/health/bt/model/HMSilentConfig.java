package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMSilentConfig {
    public static final int DEFAULT_OFFTIME_INDEX = 420;
    public static final int DEFAULT_ONTIME_INDEX = 1320;
    public static final int ENABLE_TYPE_SMART = 0;
    public static final int ENABLE_TYPE_TIME = 1;
    private static final String j = "HMSilentConfig";
    private boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public HMSilentConfig() {
        this(false, DEFAULT_ONTIME_INDEX, 420, 0, false);
    }

    private void a() {
        int i = this.f;
        this.b = (byte) (i / 60);
        this.c = (byte) (i % 60);
        int i2 = this.g;
        this.d = (byte) (i2 / 60);
        this.e = (byte) (i2 % 60);
    }

    public void enableWristLift(boolean enable) {
        this.h = enable;
    }

    public byte getStartHour() {
        return this.b;
    }

    public int getStartIndex() {
        return this.f;
    }

    public byte getStartMinute() {
        return this.c;
    }

    public byte getStopHour() {
        return this.d;
    }

    public int getStopIndex() {
        return this.g;
    }

    public byte getStopMinute() {
        return this.e;
    }

    public boolean isEnable() {
        return this.a;
    }

    public boolean isEnableWristLift() {
        return this.h;
    }

    public boolean isSmart() {
        return this.i;
    }

    public void setEnable(boolean enable) {
        this.a = enable;
    }

    public void setSmart(boolean smart) {
        this.i = smart;
    }

    public void setStartIndex(int index) {
        this.f = index;
        a();
    }

    public void setStopIndex(int index) {
        this.g = index;
        a();
    }

    public String toString() {
        return "HMSilentConfig{mEnable=" + this.a + ", mStartHour=" + ((int) this.b) + ", mStartMinute=" + ((int) this.c) + ", mStopHour=" + ((int) this.d) + ", mStopMinute=" + ((int) this.e) + ", mStartIndex=" + this.f + ", mStopIndex=" + this.g + ", mEnableWristLift=" + this.h + ", mIsSmart=" + this.i + '}';
    }

    public HMSilentConfig(boolean enable) {
        this(enable, 0, 0, 1, false);
    }

    public HMSilentConfig(boolean enable, int startIndex, int stopIndex, int type, boolean linghtEnable) {
        this.a = false;
        this.b = (byte) 0;
        this.c = (byte) 0;
        this.d = (byte) 0;
        this.e = (byte) 0;
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.a = enable;
        this.f = startIndex;
        this.g = stopIndex;
        this.i = type == 0;
        this.h = linghtEnable;
        a();
    }
}
