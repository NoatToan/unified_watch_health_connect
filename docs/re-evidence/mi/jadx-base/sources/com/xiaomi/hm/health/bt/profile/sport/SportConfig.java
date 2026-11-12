package com.xiaomi.hm.health.bt.profile.sport;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportConfig {
    public static final int SOURCE_DEVICE = 1;
    public static final int SOURCE_PHONE = 0;
    public static final int SOURCE_UNKNOWN = -1;
    private static final byte SPORT_VERSION = 1;
    private boolean isAutoRecognizeSport;
    private boolean isNeedGps;
    private SportKind mSportKind;
    private byte mVersion;
    private boolean needDeviceClock;
    private int source;

    public SportConfig(int i) {
        this.mSportKind = SportKind.OUTDOOR;
        this.mVersion = (byte) 1;
        this.isNeedGps = false;
        this.isAutoRecognizeSport = false;
        this.needDeviceClock = true;
        this.source = i;
    }

    public int getSource() {
        return this.source;
    }

    public SportKind getSportKind() {
        return this.mSportKind;
    }

    public byte getVersion() {
        return this.mVersion;
    }

    public boolean isAutoRecognizeSport() {
        return this.isAutoRecognizeSport;
    }

    public boolean isNeedDeviceClock() {
        return this.needDeviceClock;
    }

    public boolean isNeedGps() {
        return this.isNeedGps;
    }

    public void setAutoRecognizeSport(boolean z) {
        this.isAutoRecognizeSport = z;
    }

    public void setNeedDeviceClock(boolean z) {
        this.needDeviceClock = z;
    }

    public void setNeedGps(boolean z) {
        this.isNeedGps = z;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSportKind(SportKind sportKind) {
        this.mSportKind = sportKind;
    }

    public void setVersion(byte b2) {
        this.mVersion = b2;
    }

    public String toString() {
        return "SportConfig{mSportKind=" + this.mSportKind + ", mVersion=" + ((int) this.mVersion) + ", source=" + this.source + AbstractJsonLexerKt.END_OBJ;
    }

    public SportConfig(SportKind sportKind) {
        SportKind sportKind2 = SportKind.NONE;
        this.mVersion = (byte) 1;
        this.source = 0;
        this.isNeedGps = false;
        this.isAutoRecognizeSport = false;
        this.needDeviceClock = true;
        this.mSportKind = sportKind;
    }

    public SportConfig(SportKind sportKind, int i, boolean z) {
        SportKind sportKind2 = SportKind.NONE;
        this.mVersion = (byte) 1;
        this.isAutoRecognizeSport = false;
        this.needDeviceClock = true;
        this.mSportKind = sportKind;
        this.source = i;
        this.isNeedGps = z;
    }
}
