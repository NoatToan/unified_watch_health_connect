package com.xiaomi.hm.health.bt.profile.base;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class RealtimeStep {
    public static final int REALTIME_STEP_MIN_BYTES = 5;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private GaitInfo h;

    public RealtimeStep() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = null;
    }

    @Nullable
    public static RealtimeStep parseFrom(byte[] value) {
        if (value == null) {
            return null;
        }
        int i = 5;
        if (value.length < 5) {
            return null;
        }
        int i2 = value[0] & 255;
        RealtimeStep realtimeStep = new RealtimeStep((value[1] & 255) | ((value[2] & 255) << 8) | ((value[3] & 255) << 16) | ((value[4] & 255) << 24), -1);
        boolean z = (i2 & 1) == 1;
        boolean z2 = ((i2 >> 1) & 1) == 1;
        boolean z3 = ((i2 >> 2) & 1) == 1;
        boolean z4 = ((i2 >> 3) & 1) == 1;
        boolean z5 = ((i2 >> 4) & 1) == 1;
        if (z) {
            realtimeStep.setRunning((value[5] & 255) | ((value[6] & 255) << 8) | ((value[7] & 255) << 16) | ((value[8] & 255) << 24));
            i = 9;
        }
        if (z2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = (value[i] & 255) | ((value[i3] & 255) << 8);
            int i6 = i4 + 1;
            realtimeStep.setWalking(i5 | ((value[i4] & 255) << 16) | ((value[i6] & 255) << 24));
            i = i6 + 1;
        }
        if (z3 && z4) {
            realtimeStep.setIsSupportStepExtra(true);
            int i7 = i + 1;
            int i8 = i7 + 1;
            int i9 = (value[i] & 255) | ((value[i7] & 255) << 8);
            int i10 = i8 + 1;
            int i11 = i9 | ((value[i8] & 255) << 16);
            int i12 = i10 + 1;
            realtimeStep.setTotalDis(i11 | ((value[i10] & 255) << 24));
            int i13 = i12 + 1;
            int i14 = value[i12] & 255;
            int i15 = i13 + 1;
            int i16 = ((value[i13] & 255) << 8) | i14;
            int i17 = i15 + 1;
            realtimeStep.setTotalCal(i16 | ((value[i15] & 255) << 16) | ((value[i17] & 255) << 24));
            i = i17 + 1;
        }
        if (z5) {
            try {
                GaitInfo gaitInfo = new GaitInfo();
                int i18 = i + 1;
                gaitInfo.setType(value[i] & 255);
                int i19 = i18 + 1;
                int i20 = i19 + 1;
                int i21 = ((value[i19] & 255) << 8) | (value[i18] & 255);
                int i22 = i20 + 1;
                int i23 = i22 + 1;
                gaitInfo.addGait(0, i21, ((value[i22] & 255) << 8) | (value[i20] & 255));
                int i24 = i23 + 1;
                int i25 = i24 + 1;
                gaitInfo.addGait(1, ((value[i24] & 255) << 8) | (value[i23] & 255), ((value[i25 + 1] & 255) << 8) | (value[i25] & 255));
                realtimeStep.setGaitInfo(gaitInfo);
            } catch (Exception unused) {
            }
        }
        return realtimeStep;
    }

    public int getFront() {
        return this.f;
    }

    public GaitInfo getGaitInfo() {
        return this.h;
    }

    public int getRunning() {
        return this.d;
    }

    public int getTotalCal() {
        return this.c;
    }

    public int getTotalDis() {
        return this.b;
    }

    public int getTotalStep() {
        return this.a;
    }

    public int getWalking() {
        return this.e;
    }

    public boolean isSupportStepExtra() {
        return this.g;
    }

    public void setFront(int front) {
        this.f = front;
    }

    public void setGaitInfo(GaitInfo gaitInfo) {
        this.h = gaitInfo;
    }

    public void setIsSupportStepExtra(boolean isSupportStepExtra) {
        this.g = isSupportStepExtra;
    }

    public void setRunning(int running) {
        this.d = running;
    }

    public void setTotalCal(int totalCal) {
        this.c = totalCal;
    }

    public void setTotalDis(int totalDis) {
        this.b = totalDis;
    }

    public void setTotalStep(int totalStep) {
        this.a = totalStep;
    }

    public void setWalking(int walking) {
        this.e = walking;
    }

    public String toString() {
        return "RealtimeStep{totalStep=" + this.a + ", totalDis=" + this.b + ", totalCal=" + this.c + ", running=" + this.d + ", walking=" + this.e + ", front=" + this.f + ", isSupportStepExtra=" + this.g + ", gaitInfo=" + this.h + '}';
    }

    public RealtimeStep(int totalStep) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = null;
        this.a = totalStep;
        this.e = totalStep;
    }

    public RealtimeStep(int totalStep, int front) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = null;
        this.a = totalStep;
        this.f = front;
    }

    public RealtimeStep(int totalStep, int running, int walking) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = null;
        this.a = totalStep;
        this.d = running;
        this.e = walking;
    }
}
