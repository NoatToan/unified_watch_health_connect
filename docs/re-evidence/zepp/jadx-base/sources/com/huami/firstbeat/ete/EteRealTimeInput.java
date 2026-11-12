package com.huami.firstbeat.ete;

import fi.firstbeat.ete.EteInput;

/* JADX INFO: loaded from: classes9.dex */
public class EteRealTimeInput {
    public float altitude;
    public int altitudeSource;
    public int hr;
    public int hrQuality;
    public boolean isPause;
    public int rri;
    public float speed;
    public int stepFreq;

    public static class b {
        private static final EteRealTimeInput a = new EteRealTimeInput();

        private b() {
        }
    }

    public static EteRealTimeInput getInstance() {
        return b.a;
    }

    public EteInput.UserState getUserState(int i) {
        if (i == 1 || i == 6) {
            return EteInput.UserState.RUNNING;
        }
        if (i != 8) {
            return i != 9 ? EteInput.UserState.NOT_AVAILABLE : EteInput.UserState.CYCLING;
        }
        return EteInput.UserState.NOT_AVAILABLE;
    }

    public void setHeartRate(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.hr = i;
    }

    public void setPause(boolean z) {
        this.isPause = z;
    }

    public void setRealTimeHRWhenPause(int i) {
        if (this.isPause) {
            if (i <= 0) {
                i = 0;
            }
            this.hr = i;
            this.speed = 0.0f;
            this.altitude = 0.0f;
            this.stepFreq = 0;
        }
    }

    public void setRealTimeInput(float f, float f2, int i) {
        this.speed = f;
        this.altitude = f2;
        this.stepFreq = i;
    }

    private EteRealTimeInput() {
    }
}
