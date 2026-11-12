package com.xiaomi.hm.health.bt.profile.sport;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class SportInfo {
    private static final int C = 1;
    private static final int D = 2;
    public static final int DEFAULT_INVALID_HR = 255;
    private static final int E = 4;
    private static final int F = 8;
    private static final int G = 16;
    public static final int GPS_STATE_GPS_SERVICE_CLOSED = 4;
    public static final int GPS_STATE_LOCATE_ED = 1;
    public static final int GPS_STATE_LOCATE_ING = 2;
    public static final int GPS_STATE_NO_BACKGROUND_PERMISSION = 5;
    public static final int GPS_STATE_NO_PERMISSION = 3;
    private static final int H = 32;
    private static final int I = 64;
    private static final int J = 128;
    private static final int K = 256;
    private static final int L = 512;
    private static final int M = 1024;
    private static final int N = 2048;
    private static final int O = 4096;
    private static final int P = 8192;
    private static final int Q = 16384;
    private static final int R = 32768;
    private static final int S = 65536;
    private static final int T = 131072;
    private static final int U = 262144;
    public static final int UNKNOWN = -1;
    private static final int V = 524288;
    private static final int W = 1048576;
    private static final int X = 2097152;
    private static final int Y = 4194304;
    private static final int Z = 8388608;
    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private SportGpsPoint s = null;
    private SportTemperature t = null;
    private SportType u = SportType.SPORT_TYPE_ODRUN;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private int y = -1;
    private final int z = 1;
    private final int A = 2;
    private final int B = 4;

    public static byte[] nullValue() {
        return new byte[]{0, 0, 0, 0};
    }

    public int getAscent() {
        return this.l;
    }

    public int getAvePace() {
        return this.q;
    }

    public int getAveSpeed() {
        return this.r;
    }

    public int getAvgCadence() {
        return this.v;
    }

    public byte[] getBytes() {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = this.a;
        if (i2 != -1) {
            byteArrayOutputStream.write((byte) i2);
            i = 1;
        } else {
            i = 0;
        }
        int i3 = this.c;
        if (i3 != -1) {
            i |= 2;
            byteArrayOutputStream.write(GattUtils.intToBytes(i3), 0, 4);
        }
        int i4 = this.b;
        if (i4 != -1) {
            i |= 4;
            byteArrayOutputStream.write(GattUtils.intToBytes(i4), 0, 4);
        }
        int i5 = this.d;
        if (i5 != -1) {
            i |= 8;
            byteArrayOutputStream.write(GattUtils.intToBytes(i5), 0, 4);
        }
        int i6 = this.e;
        if (i6 != -1) {
            i |= 16;
            byteArrayOutputStream.write(GattUtils.intToBytes(i6), 0, 4);
        }
        int i7 = this.f;
        if (i7 != -1) {
            i |= 32;
            byteArrayOutputStream.write((byte) i7);
        }
        int i8 = this.g;
        if (i8 != -1) {
            i |= 64;
            byteArrayOutputStream.write(GattUtils.intToBytes(i8), 0, 4);
        }
        int i9 = this.h;
        if (i9 != -1) {
            i |= 128;
            byteArrayOutputStream.write(GattUtils.intToBytes(i9), 0, 4);
        }
        int i10 = this.i;
        if (i10 != -1) {
            i |= 256;
            byteArrayOutputStream.write(GattUtils.intToBytes(i10), 0, 4);
        }
        int i11 = this.j;
        if (i11 != -1) {
            i |= 512;
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) i11), 0, 2);
        }
        int i12 = this.k;
        if (i12 != -1) {
            i |= 1024;
            byteArrayOutputStream.write(GattUtils.shortToBytes((short) i12), 0, 2);
        }
        int i13 = this.l;
        if (i13 != -1) {
            i |= 2048;
            byteArrayOutputStream.write(GattUtils.intToBytes(i13), 0, 4);
        }
        int i14 = this.m;
        if (i14 != -1) {
            i |= 4096;
            byteArrayOutputStream.write(GattUtils.intToBytes(i14), 0, 4);
        }
        int i15 = this.n;
        if (i15 != -1) {
            i |= 8192;
            byteArrayOutputStream.write(GattUtils.intToBytes(i15), 0, 4);
        }
        int i16 = this.o;
        if (i16 != -1) {
            i |= 16384;
            byteArrayOutputStream.write(GattUtils.intToBytes(i16), 0, 4);
        }
        int i17 = this.p;
        if (i17 != -1) {
            i |= 32768;
            byteArrayOutputStream.write(GattUtils.intToBytes(i17), 0, 4);
        }
        int i18 = this.q;
        if (i18 != -1) {
            i |= 65536;
            byteArrayOutputStream.write(GattUtils.intToBytes(i18), 0, 4);
        }
        int i19 = this.r;
        if (i19 != -1) {
            i |= 131072;
            byteArrayOutputStream.write(GattUtils.intToBytes(i19), 0, 4);
        }
        SportGpsPoint sportGpsPoint = this.s;
        if (sportGpsPoint != null) {
            i |= 262144;
            byte[] bArrA = sportGpsPoint.a();
            byteArrayOutputStream.write(bArrA, 0, bArrA.length);
        }
        SportTemperature sportTemperature = this.t;
        if (sportTemperature != null) {
            i |= 524288;
            byte[] bytes = sportTemperature.getBytes();
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        int i20 = this.v;
        if (i20 != -1) {
            i |= 1048576;
            byteArrayOutputStream.write(GattUtils.intToBytes(i20), 0, 2);
        }
        int i21 = this.w;
        if (i21 != -1) {
            i |= 2097152;
            byteArrayOutputStream.write(GattUtils.intToBytes(i21), 0, 1);
        }
        int i22 = this.x;
        if (i22 != -1) {
            i |= 4194304;
            byteArrayOutputStream.write(GattUtils.intToBytes(i22), 0, 4);
        }
        int i23 = this.y;
        if (i23 != -1) {
            i |= 8388608;
            byteArrayOutputStream.write(GattUtils.intToBytes(i23), 0, 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(GattUtils.intToBytes(i), 0, 4);
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            }
            return byteArrayOutputStream2.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getCal() {
        return this.i;
    }

    public int getClimbDistance() {
        return this.p;
    }

    public int getDescent() {
        return this.m;
    }

    public int getDistance() {
        return this.d;
    }

    public int getElapsedTime() {
        return this.b;
    }

    public SportGpsPoint getGpsPoint() {
        return this.s;
    }

    public int getGpsState() {
        return this.a;
    }

    public int getHr() {
        return this.f;
    }

    public int getHrRemindThreshold() {
        return this.w;
    }

    public int getMaxSpeed() {
        return this.n;
    }

    public int getPace() {
        return this.e;
    }

    public int getPaceRemindThreshold() {
        return this.x;
    }

    public int getRideTime() {
        return this.o;
    }

    public int getSpeed() {
        return this.h;
    }

    public int getSpeedRemindThreshold() {
        return this.y;
    }

    public SportTemperature getSportTemperature() {
        return this.t;
    }

    public SportType getSportType() {
        return this.u;
    }

    public int getStartTime() {
        return this.c;
    }

    public int getStep() {
        return this.g;
    }

    public int getStepFreq() {
        return this.j;
    }

    public int getStepLen() {
        return this.k;
    }

    public void setAscent(int ascent) {
        this.l = ascent;
    }

    public void setAvePace(int avePace) {
        this.q = avePace;
    }

    public void setAveSpeed(int aveSpeed) {
        this.r = aveSpeed;
    }

    public void setAvgCadence(int avgCadence) {
        this.v = avgCadence;
    }

    public void setCal(int cal) {
        this.i = cal;
    }

    public void setClimbDistance(int climbDistance) {
        this.p = climbDistance;
    }

    public void setDescent(int descent) {
        this.m = descent;
    }

    public void setDistance(int distance) {
        this.d = distance;
    }

    public void setElapsedTime(int elapsedTime) {
        this.b = elapsedTime;
    }

    public void setGpsPoint(SportGpsPoint gpsPoint) {
        this.s = gpsPoint;
    }

    public void setGpsState(int gpsState) {
        this.a = gpsState;
    }

    public void setHr(int hr) {
        if (hr == -1) {
            return;
        }
        this.f = hr;
    }

    public void setHrRemindThreshold(int hrRemindThreshold) {
        this.w = hrRemindThreshold;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.n = maxSpeed;
    }

    public void setPace(int pace) {
        this.e = pace;
    }

    public void setPaceRemindThreshold(int paceRemindThreshold) {
        this.x = paceRemindThreshold;
    }

    public void setRideTime(int rideTime) {
        this.o = rideTime;
    }

    public void setSpeed(int speed) {
        this.h = speed;
    }

    public void setSpeedRemindThreshold(int speedRemindThreshold) {
        this.y = speedRemindThreshold;
    }

    public void setSportTemperature(SportTemperature sportTemperature) {
        this.t = sportTemperature;
    }

    public void setSportType(SportType sportType) {
        this.u = sportType;
    }

    public void setStartTime(int startTime) {
        this.c = startTime;
    }

    public void setStep(int step) {
        this.g = step;
    }

    public void setStepFreq(int stepFreq) {
        this.j = stepFreq;
    }

    public void setStepLen(int stepLen) {
        this.k = stepLen;
    }

    public String toString() {
        return "SportInfo{gpsState=" + this.a + ", elapsedTime=" + this.b + ", startTime=" + this.c + ", distance=" + this.d + ", pace=" + this.e + ", hr=" + this.f + ", step=" + this.g + ", speed=" + this.h + ", cal=" + this.i + ", stepFreq=" + this.j + ", stepLen=" + this.k + ", ascent=" + this.l + ", descent=" + this.m + ", maxSpeed=" + this.n + ", rideTime=" + this.o + ", climbDistance=" + this.p + ", avePace=" + this.q + ", aveSpeed=" + this.r + ", gpsPoint=" + this.s + ", sportType=" + this.u + '}';
    }
}
