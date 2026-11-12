package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes18.dex */
public class SportConfig {
    public static final int SOURCE_DEVICE = 1;
    public static final int SOURCE_PHONE = 0;
    public static final int SOURCE_UNKNOWN = -1;
    private static final byte g = 1;
    private SportKind a;
    private byte b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public SportConfig(int source) {
        this.a = SportKind.OUTDOOR;
        this.b = (byte) 1;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = true;
        this.c = source;
    }

    public int getSource() {
        return this.c;
    }

    public SportKind getSportKind() {
        return this.a;
    }

    public byte getVersion() {
        return this.b;
    }

    public boolean isAutoRecognizeSport() {
        return this.e;
    }

    public boolean isNeedDeviceClock() {
        return this.f;
    }

    public boolean isNeedGps() {
        return this.d;
    }

    public void setAutoRecognizeSport(boolean autoRecognizeSport) {
        this.e = autoRecognizeSport;
    }

    public void setNeedDeviceClock(boolean needDeviceClock) {
        this.f = needDeviceClock;
    }

    public void setNeedGps(boolean needGps) {
        this.d = needGps;
    }

    public void setSource(int source) {
        this.c = source;
    }

    public void setSportKind(SportKind sportKind) {
        this.a = sportKind;
    }

    public void setVersion(byte version) {
        this.b = version;
    }

    public String toString() {
        return "SportConfig{mSportKind=" + this.a + ", mVersion=" + ((int) this.b) + ", source=" + this.c + '}';
    }

    public SportConfig(SportKind kind) {
        this.a = SportKind.OUTDOOR;
        this.b = (byte) 1;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = true;
        this.a = kind;
    }

    public SportConfig(SportKind kind, int source, boolean isNeedGps) {
        this.a = SportKind.OUTDOOR;
        this.b = (byte) 1;
        this.c = 0;
        this.d = false;
        this.e = false;
        this.f = true;
        this.a = kind;
        this.c = source;
        this.d = isNeedGps;
    }
}
