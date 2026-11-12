package com.xiaomi.hm.health.bt.profile.sport;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class SportGpsPoint {
    private int a;
    private int b;
    private long c;
    private int d;
    private long e;
    private int f;
    private int g;
    private short h;

    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(GattUtils.intToBytes(this.a));
            byteArrayOutputStream.write(GattUtils.intToBytes(this.b));
            byteArrayOutputStream.write(GattUtils.intToBytes((int) this.c));
            byteArrayOutputStream.write(GattUtils.intToBytes(this.d));
            byteArrayOutputStream.write(GattUtils.longToBytes(this.e));
            byteArrayOutputStream.write(GattUtils.intToBytes(this.f));
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.g));
            byteArrayOutputStream.write(this.h);
        } catch (Exception unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int getAltitude() {
        return this.d;
    }

    public int getBarometer() {
        return this.f;
    }

    public int getCourse() {
        return this.g;
    }

    public int getLatitude() {
        return this.b;
    }

    public int getLongitude() {
        return this.a;
    }

    public short getMode() {
        return this.h;
    }

    public long getSpeed() {
        return this.c;
    }

    public long getTimestamp() {
        return this.e;
    }

    public void setAltitude(int altitude) {
        this.d = altitude;
    }

    public void setBarometer(int barometer) {
        this.f = barometer;
    }

    public void setCourse(int course) {
        this.g = course;
    }

    public void setLatitude(int latitude) {
        this.b = latitude;
    }

    public void setLongitude(int longitude) {
        this.a = longitude;
    }

    public void setMode(short mode) {
        this.h = mode;
    }

    public void setSpeed(long speed) {
        this.c = speed;
    }

    public void setTimestamp(long timestamp) {
        this.e = timestamp;
    }

    public String toString() {
        return "SportGpsPoint{longitude=" + this.a + ", latitude=" + this.b + ", speed=" + this.c + ", altitude=" + this.d + ", timestamp=" + this.e + ", barometer=" + this.f + ", course=" + this.g + ", mode=" + ((int) this.h) + '}';
    }
}
