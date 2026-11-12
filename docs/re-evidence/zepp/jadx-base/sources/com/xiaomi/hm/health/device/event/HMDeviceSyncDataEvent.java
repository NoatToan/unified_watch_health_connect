package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceSyncDataEvent extends HMDeviceEvent {
    public static final int PROGRESS = 1;
    public static final int START = 0;
    public static final int STOP = 2;
    private int b;
    private Progress c;
    private boolean d;
    private int e;
    private boolean f;
    private String g;

    public HMDeviceSyncDataEvent(HMDeviceType hMDeviceType, int i, Progress progress) {
        super(hMDeviceType);
        this.b = 0;
        this.c = new Progress();
        this.d = true;
        this.e = 0;
        this.f = true;
        this.b = i;
        this.c = progress;
        this.g = "";
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

    public int getSyncEvent() {
        return this.b;
    }

    public boolean isProgress() {
        return this.b == 1;
    }

    public boolean isShowProgress() {
        return this.f;
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

    public void setShowProgress(boolean z) {
        this.f = z;
    }

    public String toString() {
        return "HMDeviceSyncDataEvent{deviceType=" + getDeviceType() + ", mSyncEvent=" + this.b + ", mProgress=" + this.c + ", mResult=" + this.d + ", source=" + this.g + ", error=" + this.e + ", showProgress=" + this.f + '}';
    }
}
