package com.huami.watch.companion.location;

/* JADX INFO: loaded from: classes16.dex */
public class LocationOption {
    private LocationMode a;
    private long b;
    private boolean c;

    public enum LocationMode {
        HighAccuracy,
        BatterySave,
        GpsOnly
    }

    public LocationMode getMode() {
        return this.a;
    }

    public long getUpdateInterval() {
        return this.b;
    }

    public boolean isNeedAddress() {
        return this.c;
    }

    public void setMode(LocationMode locationMode) {
        this.a = locationMode;
    }

    public void setNeedAddress(boolean z) {
        this.c = z;
    }

    public void setUpdateInterval(long j) {
        this.b = j;
    }
}
