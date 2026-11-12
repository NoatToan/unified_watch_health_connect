package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes19.dex */
public class BFDeviceSyncDataEvent extends BFDeviceEvent {
    public static final int PROGRESS = 1;
    public static final int START = 0;
    public static final int STOP = 2;
    private int b;
    private Progress c;
    private boolean d;
    private int e;

    public BFDeviceSyncDataEvent(HMDeviceType hMDeviceType, int i, Progress progress) {
        super(hMDeviceType);
        this.b = 0;
        this.c = new Progress();
        this.d = true;
        this.e = 0;
        this.b = i;
        this.c = progress;
    }

    public int getError() {
        return this.e;
    }

    public Progress getProgress() {
        return this.c;
    }

    public boolean getResult() {
        return this.d;
    }

    public boolean isProgress() {
        return this.b == 1;
    }

    public boolean isStart() {
        return this.b == 0;
    }

    public boolean isStop() {
        return this.b == 2;
    }

    public void setError(int i) {
        this.e = i;
        this.d = i == 0;
    }

    public void setResult(boolean z) {
        this.d = z;
    }

    public String toString() {
        return "HMDeviceSyncDataEvent{deviceType=" + getDeviceType() + ", mSyncEvent=" + this.b + ", mProgress=" + this.c + '}';
    }
}
