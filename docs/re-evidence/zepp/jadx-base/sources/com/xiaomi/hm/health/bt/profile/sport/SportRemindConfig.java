package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes18.dex */
public class SportRemindConfig {
    private short a = 180;
    private short b = 30;
    private boolean c = true;
    private boolean d = true;
    private boolean e = false;

    public byte[] getBytes() {
        short s = this.a;
        short s2 = this.b;
        return new byte[]{(byte) s, (byte) (s >> 8), (byte) s2, (byte) (s2 >> 8), this.c ? (byte) 1 : (byte) 0, this.d ? (byte) 1 : (byte) 0, this.e ? (byte) 1 : (byte) 0};
    }

    public short getMaxHr() {
        return this.a;
    }

    public short getMaxPace() {
        return this.b;
    }

    public boolean isAutoPause() {
        return this.e;
    }

    public boolean isKmPaceReminder() {
        return this.c;
    }

    public boolean isKmSpeedReminder() {
        return this.d;
    }

    public void setAutoPause(boolean autoPause) {
        this.e = autoPause;
    }

    public void setKmPaceReminder(boolean kmPaceReminder) {
        this.c = kmPaceReminder;
    }

    public void setKmSpeedReminder(boolean kmSpeedReminder) {
        this.d = kmSpeedReminder;
    }

    public void setMaxHr(short maxHr) {
        this.a = maxHr;
    }

    public void setMaxPace(short maxPace) {
        this.b = maxPace;
    }

    public String toString() {
        return "SportRemindConfig{maxHr=" + ((int) this.a) + ", maxPace=" + ((int) this.b) + ", kmPaceReminder=" + this.c + ", kmSpeedReminder=" + this.d + '}';
    }
}
