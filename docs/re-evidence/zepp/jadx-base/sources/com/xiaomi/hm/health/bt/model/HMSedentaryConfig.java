package com.xiaomi.hm.health.bt.model;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class HMSedentaryConfig extends HealthRemindConfig implements Serializable {
    public static final int DEFAULT_INTERVAL = 60;
    public static final int DEFAULT_START_INDEX = 480;
    public static final int DEFAULT_STOP_INDEX = 1260;
    public static final int INGORE_START_INDEX = 720;
    public static final int INGORE_STOP_INDEX = 840;
    private static final String q = "HMSedentaryConfig";
    private static final long serialVersionUID = 1;
    private boolean b;
    private boolean c;
    private short d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i;
    private byte j;
    private byte k;
    private byte l;
    private byte m;
    private byte n;
    private byte o;
    private byte p;

    public HMSedentaryConfig() {
        this.b = false;
        this.c = false;
        this.d = (short) 60;
        this.e = 480;
        this.f = 1260;
        this.g = 720;
        this.h = INGORE_STOP_INDEX;
        this.i = (byte) 0;
        this.j = (byte) 0;
        this.k = (byte) 23;
        this.l = MiLiProProfile.ECF_WRITE_PAI_DATA;
        this.m = (byte) 0;
        this.n = (byte) 0;
        this.o = (byte) 0;
        this.p = (byte) 0;
        a();
    }

    private void a() {
        int i;
        int i2;
        int i3;
        int i4;
        Debug.i(q, "startIndex:" + this.e + ",stopIndex:" + this.f);
        int i5 = 0;
        if (this.c) {
            i2 = this.f;
            i = this.g;
            if (i2 <= i || (i4 = this.e) >= (i3 = this.h)) {
                i5 = this.e;
                i3 = 0;
                i = i2;
                i2 = 0;
            } else {
                if (i4 >= i && i2 <= i3) {
                    Debug.i("xxx", "do nothing");
                } else if (i4 < i && i2 > i3) {
                    i5 = i4;
                } else if (i4 >= i || i2 > i3) {
                    if (i4 >= i && i2 > i3) {
                        i = i2;
                        i5 = i3;
                    }
                    i3 = 0;
                } else {
                    i5 = i4;
                }
                i2 = 0;
                i = 0;
                i3 = 0;
            }
            Debug.i(q, "newStartIdx:" + i5 + ",newStopIdx:" + i + ",newStartIdx2:" + i3 + ",newStopIdx2:" + i2);
            this.i = (byte) (i5 / 60);
            this.j = (byte) (i5 % 60);
            this.k = (byte) (i / 60);
            this.l = (byte) (i % 60);
            this.m = (byte) (i3 / 60);
            this.n = (byte) (i3 % 60);
            this.o = (byte) (i2 / 60);
            this.p = (byte) (i2 % 60);
            Debug.i(q, toString());
        }
        int i6 = this.e;
        i = this.f;
        i5 = i6;
        i2 = 0;
        i3 = 0;
        Debug.i(q, "newStartIdx:" + i5 + ",newStopIdx:" + i + ",newStartIdx2:" + i3 + ",newStopIdx2:" + i2);
        this.i = (byte) (i5 / 60);
        this.j = (byte) (i5 % 60);
        this.k = (byte) (i / 60);
        this.l = (byte) (i % 60);
        this.m = (byte) (i3 / 60);
        this.n = (byte) (i3 % 60);
        this.o = (byte) (i2 / 60);
        this.p = (byte) (i2 % 60);
        Debug.i(q, toString());
    }

    public int getDndStart() {
        return this.g;
    }

    public int getDndStop() {
        return this.h;
    }

    public short getInterval() {
        return this.d;
    }

    public byte getStartHour() {
        return this.i;
    }

    public byte getStartHour2() {
        return this.m;
    }

    public int getStartIndex() {
        return this.e;
    }

    public byte getStartMinutes() {
        return this.j;
    }

    public byte getStartMinutes2() {
        return this.n;
    }

    public byte getStopHour() {
        return this.k;
    }

    public byte getStopHour2() {
        return this.o;
    }

    public int getStopIndex() {
        return this.f;
    }

    public byte getStopMinutes() {
        return this.l;
    }

    public byte getStopMinutes2() {
        return this.p;
    }

    public boolean isEnable() {
        return this.b;
    }

    public boolean isPeriodEnable() {
        return this.c;
    }

    public void setDndStart(int dndStart) {
        this.g = dndStart;
    }

    public void setDndStop(int dndStop) {
        this.h = dndStop;
    }

    public void setEnable(boolean enable) {
        this.b = enable;
    }

    public void setInterval(short interval) {
        this.d = interval;
    }

    public void setPeriodEnable(boolean periodEnable) {
        this.c = periodEnable;
        a();
    }

    public void setStartIndex(int idx) {
        this.e = idx;
        a();
    }

    public void setStopIndex(int idx) {
        this.f = idx;
        a();
    }

    public String toString() {
        return "HMSedentaryConfig{enable=" + this.b + ", periodEnable=" + this.c + ", interval=" + ((int) this.d) + ", dndStart=" + this.g + ", dndStop=" + this.h + ", startHour=" + ((int) this.i) + ", startMinutes=" + ((int) this.j) + ", stopHour=" + ((int) this.k) + ", stopMinutes=" + ((int) this.l) + ", startHour2=" + ((int) this.m) + ", startMinutes2=" + ((int) this.n) + ", stopHour2=" + ((int) this.o) + ", stopMinutes2=" + ((int) this.p) + ", invalidTime=" + getInvalidTime() + '}';
    }

    public HMSedentaryConfig(boolean enable) {
        this.b = false;
        this.c = false;
        this.d = (short) 60;
        this.e = 480;
        this.f = 1260;
        this.g = 720;
        this.h = INGORE_STOP_INDEX;
        this.i = (byte) 0;
        this.j = (byte) 0;
        this.k = (byte) 23;
        this.l = MiLiProProfile.ECF_WRITE_PAI_DATA;
        this.m = (byte) 0;
        this.n = (byte) 0;
        this.o = (byte) 0;
        this.p = (byte) 0;
        this.b = enable;
        a();
    }

    public HMSedentaryConfig(boolean enable, boolean periodEnable, short interval, int startIndex, int stopIndex) {
        this(enable, periodEnable, interval, startIndex, stopIndex, 720, INGORE_STOP_INDEX);
    }

    public HMSedentaryConfig(boolean enable, boolean periodEnable, short interval, int startIndex, int stopIndex, int dndStart, int dndStop) {
        this.b = false;
        this.c = false;
        this.d = (short) 60;
        this.e = 480;
        this.f = 1260;
        this.g = 720;
        this.h = INGORE_STOP_INDEX;
        this.i = (byte) 0;
        this.j = (byte) 0;
        this.k = (byte) 23;
        this.l = MiLiProProfile.ECF_WRITE_PAI_DATA;
        this.m = (byte) 0;
        this.n = (byte) 0;
        this.o = (byte) 0;
        this.p = (byte) 0;
        this.b = enable;
        this.d = interval;
        this.c = periodEnable;
        this.e = startIndex;
        this.f = stopIndex;
        this.g = dndStart;
        this.h = dndStop;
        a();
    }
}
