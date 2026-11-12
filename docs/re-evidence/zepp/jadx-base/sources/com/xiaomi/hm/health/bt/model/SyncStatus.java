package com.xiaomi.hm.health.bt.model;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes19.dex */
public class SyncStatus {
    private Progress a;
    private HMDeviceError b;

    public SyncStatus() {
        this.a = null;
        this.b = new HMDeviceError(0);
    }

    public HMDeviceError getError() {
        return this.b;
    }

    public Progress getProgress() {
        return this.a;
    }

    public void setError(HMDeviceError error) {
        this.b = error;
    }

    public void setProgress(Progress progress) {
        this.a = progress;
    }

    public SyncStatus(Progress progress, HMDeviceError error) {
        this.a = null;
        this.b = new HMDeviceError(0);
        this.a = progress;
        this.b = error;
    }
}
