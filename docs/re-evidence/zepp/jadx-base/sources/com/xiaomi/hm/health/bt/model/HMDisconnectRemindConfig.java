package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMDisconnectRemindConfig {
    public static final int DEFAULT_START_INDEX = 480;
    public static final int DEFAULT_STOP_INDEX = 1260;
    private static final String h = "HMDisconnectRemindConfig";
    private boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private int f;
    private int g;

    public HMDisconnectRemindConfig(boolean enable) {
        this(enable, 480, 1260);
    }

    private void a() {
        int i = this.f;
        this.b = (byte) (i / 60);
        this.c = (byte) (i % 60);
        int i2 = this.g;
        this.d = (byte) (i2 / 60);
        this.e = (byte) (i2 % 60);
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

    public void setEnable(boolean enable) {
        this.a = enable;
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
        return "HMDisconnectRemindConfig{mEnable=" + this.a + ", mStartHour=" + ((int) this.b) + ", mStartMinute=" + ((int) this.c) + ", mStopHour=" + ((int) this.d) + ", mStopMinute=" + ((int) this.e) + ", mStartIndex=" + this.f + ", mStopIndex=" + this.g + '}';
    }

    public HMDisconnectRemindConfig(boolean enable, int startIndex, int stopIndex) {
        this.a = false;
        this.b = (byte) 0;
        this.c = (byte) 0;
        this.d = (byte) 0;
        this.e = (byte) 0;
        this.f = 480;
        this.g = 1260;
        this.a = enable;
        this.f = startIndex;
        this.g = stopIndex;
        a();
    }
}
