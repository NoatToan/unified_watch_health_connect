package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceSyncGpsDataEvent extends HMDeviceEvent {
    public static final int PROGRESS = 1;
    public static final int START = 0;
    public static final int STOP = 2;
    private int b;
    private Progress c;
    private boolean d;

    public HMDeviceSyncGpsDataEvent(HMDeviceType hMDeviceType) {
        super(hMDeviceType);
        this.b = 0;
        this.c = new Progress();
        this.d = true;
        this.b = 0;
    }

    @Override // com.xiaomi.hm.health.device.event.HMDeviceEvent
    public HMDeviceType getDeviceType() {
        return super.getDeviceType();
    }

    public Progress getProgress() {
        return this.c;
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

    public boolean isSuccess() {
        return this.d;
    }

    public void setProgress(Progress progress) {
        this.c = progress;
    }

    public String toString() {
        return "HMDeviceSyncGpsDataEvent{deviceType=" + getDeviceType() + ", mState=" + this.b + ", mProgress=" + this.c + ", mResult=" + this.d + '}';
    }

    public HMDeviceSyncGpsDataEvent(HMDeviceType hMDeviceType, Progress progress) {
        super(hMDeviceType);
        this.b = 0;
        this.c = new Progress();
        this.d = true;
        this.b = 1;
        this.c = progress;
    }

    public HMDeviceSyncGpsDataEvent(HMDeviceType hMDeviceType, boolean z) {
        super(hMDeviceType);
        this.b = 0;
        this.c = new Progress();
        this.d = true;
        this.b = 2;
        this.d = z;
    }
}
