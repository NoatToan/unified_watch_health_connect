package com.huami.watch.companion.event;

/* JADX INFO: loaded from: classes16.dex */
public class WatchChargingEvent {
    private int mBatteryLevel;
    private int mCode;
    private boolean mIsCharging;

    public WatchChargingEvent(int i, boolean z, int i2) {
        if (i == 0) {
            this.mCode = 0;
            this.mIsCharging = z;
        } else if (i == 1) {
            this.mCode = 1;
            this.mBatteryLevel = i2;
        }
    }

    public int getBatteryLevel() {
        return this.mBatteryLevel;
    }

    public int getEventCode() {
        return this.mCode;
    }

    public boolean isWatchCharging() {
        return this.mIsCharging;
    }
}
