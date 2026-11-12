package com.xiaomi.hm.health.bt.model;

import defpackage.t5t;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMSedentaryConfig extends HealthRemindConfig implements Serializable {
    public static final int DEFAULT_INTERVAL = 60;
    public static final int DEFAULT_START_INDEX = 480;
    public static final int DEFAULT_STOP_INDEX = 1260;
    public static final int INGORE_START_INDEX = 720;
    public static final int INGORE_STOP_INDEX = 840;
    private static final String TAG = "HMSedentaryConfig";
    private static final long serialVersionUID = 1;
    private int dndStart;
    private int dndStop;
    private boolean enable;
    private short interval;
    private boolean periodEnable;
    private byte startHour;
    private byte startHour2;
    private int startIndex;
    private byte startMinutes;
    private byte startMinutes2;
    private byte stopHour;
    private byte stopHour2;
    private int stopIndex;
    private byte stopMinutes;
    private byte stopMinutes2;

    public HMSedentaryConfig() {
        this.enable = false;
        this.periodEnable = false;
        this.interval = (short) 60;
        this.startIndex = 480;
        this.stopIndex = DEFAULT_STOP_INDEX;
        this.dndStart = INGORE_START_INDEX;
        this.dndStop = INGORE_STOP_INDEX;
        this.startHour = (byte) 0;
        this.startMinutes = (byte) 0;
        this.stopHour = (byte) 23;
        this.stopMinutes = (byte) 59;
        this.startHour2 = (byte) 0;
        this.startMinutes2 = (byte) 0;
        this.stopHour2 = (byte) 0;
        this.stopMinutes2 = (byte) 0;
        update();
    }

    private void update() {
        int i;
        int i2;
        int i3;
        t5t.m(TAG, "startIndex:" + this.startIndex + ",stopIndex:" + this.stopIndex);
        int i4 = 0;
        if (this.periodEnable) {
            int i5 = this.stopIndex;
            i = this.dndStart;
            if (i5 <= i || (i2 = this.startIndex) >= (i3 = this.dndStop)) {
                i3 = 0;
                i2 = this.startIndex;
                i = i5;
            } else {
                if (i2 >= i && i5 <= i3) {
                    t5t.m("xxx", "do nothing");
                } else if (i2 < i && i5 > i3) {
                    i4 = i5;
                } else if (i2 >= i || i5 > i3) {
                    if (i2 >= i && i5 > i3) {
                        i = i5;
                        i2 = i3;
                    }
                }
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            t5t.m(TAG, "newStartIdx:" + i2 + ",newStopIdx:" + i + ",newStartIdx2:" + i3 + ",newStopIdx2:" + i4);
            this.startHour = (byte) (i2 / 60);
            this.startMinutes = (byte) (i2 % 60);
            this.stopHour = (byte) (i / 60);
            this.stopMinutes = (byte) (i % 60);
            this.startHour2 = (byte) (i3 / 60);
            this.startMinutes2 = (byte) (i3 % 60);
            this.stopHour2 = (byte) (i4 / 60);
            this.stopMinutes2 = (byte) (i4 % 60);
            t5t.m(TAG, toString());
        }
        int i6 = this.startIndex;
        i = this.stopIndex;
        i2 = i6;
        i3 = 0;
        t5t.m(TAG, "newStartIdx:" + i2 + ",newStopIdx:" + i + ",newStartIdx2:" + i3 + ",newStopIdx2:" + i4);
        this.startHour = (byte) (i2 / 60);
        this.startMinutes = (byte) (i2 % 60);
        this.stopHour = (byte) (i / 60);
        this.stopMinutes = (byte) (i % 60);
        this.startHour2 = (byte) (i3 / 60);
        this.startMinutes2 = (byte) (i3 % 60);
        this.stopHour2 = (byte) (i4 / 60);
        this.stopMinutes2 = (byte) (i4 % 60);
        t5t.m(TAG, toString());
    }

    public int getDndStart() {
        return this.dndStart;
    }

    public int getDndStop() {
        return this.dndStop;
    }

    public short getInterval() {
        return this.interval;
    }

    public byte getStartHour() {
        return this.startHour;
    }

    public byte getStartHour2() {
        return this.startHour2;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public byte getStartMinutes() {
        return this.startMinutes;
    }

    public byte getStartMinutes2() {
        return this.startMinutes2;
    }

    public byte getStopHour() {
        return this.stopHour;
    }

    public byte getStopHour2() {
        return this.stopHour2;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public byte getStopMinutes() {
        return this.stopMinutes;
    }

    public byte getStopMinutes2() {
        return this.stopMinutes2;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isPeriodEnable() {
        return this.periodEnable;
    }

    public void setDndStart(int i) {
        this.dndStart = i;
    }

    public void setDndStop(int i) {
        this.dndStop = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setInterval(short s) {
        this.interval = s;
    }

    public void setPeriodEnable(boolean z) {
        this.periodEnable = z;
        update();
    }

    public void setStartIndex(int i) {
        this.startIndex = i;
        update();
    }

    public void setStopIndex(int i) {
        this.stopIndex = i;
        update();
    }

    public String toString() {
        return "HMSedentaryConfig{enable=" + this.enable + ", periodEnable=" + this.periodEnable + ", interval=" + ((int) this.interval) + ", dndStart=" + this.dndStart + ", dndStop=" + this.dndStop + ", startHour=" + ((int) this.startHour) + ", startMinutes=" + ((int) this.startMinutes) + ", stopHour=" + ((int) this.stopHour) + ", stopMinutes=" + ((int) this.stopMinutes) + ", startHour2=" + ((int) this.startHour2) + ", startMinutes2=" + ((int) this.startMinutes2) + ", stopHour2=" + ((int) this.stopHour2) + ", stopMinutes2=" + ((int) this.stopMinutes2) + ", invalidTime=" + getInvalidTime() + AbstractJsonLexerKt.END_OBJ;
    }

    public HMSedentaryConfig(boolean z) {
        this.periodEnable = false;
        this.interval = (short) 60;
        this.startIndex = 480;
        this.stopIndex = DEFAULT_STOP_INDEX;
        this.dndStart = INGORE_START_INDEX;
        this.dndStop = INGORE_STOP_INDEX;
        this.startHour = (byte) 0;
        this.startMinutes = (byte) 0;
        this.stopHour = (byte) 23;
        this.stopMinutes = (byte) 59;
        this.startHour2 = (byte) 0;
        this.startMinutes2 = (byte) 0;
        this.stopHour2 = (byte) 0;
        this.stopMinutes2 = (byte) 0;
        this.enable = z;
        update();
    }

    public HMSedentaryConfig(boolean z, boolean z2, short s, int i, int i2) {
        this(z, z2, s, i, i2, INGORE_START_INDEX, INGORE_STOP_INDEX);
    }

    public HMSedentaryConfig(boolean z, boolean z2, short s, int i, int i2, int i3, int i4) {
        this.startHour = (byte) 0;
        this.startMinutes = (byte) 0;
        this.stopHour = (byte) 23;
        this.stopMinutes = (byte) 59;
        this.startHour2 = (byte) 0;
        this.startMinutes2 = (byte) 0;
        this.stopHour2 = (byte) 0;
        this.stopMinutes2 = (byte) 0;
        this.enable = z;
        this.interval = s;
        this.periodEnable = z2;
        this.startIndex = i;
        this.stopIndex = i2;
        this.dndStart = i3;
        this.dndStop = i4;
        update();
    }
}
