package com.xiaomi.hm.health.bt.error;

/* JADX INFO: loaded from: classes19.dex */
public class HMDeviceSyncDataError extends HMDeviceError {
    private boolean b;

    public HMDeviceSyncDataError(int error) {
        super(error);
        this.b = false;
    }

    public boolean isLosePackageHappened() {
        return this.b;
    }

    public void setLosePackageHappened(boolean losePackageHappened) {
        this.b = losePackageHappened;
    }
}
