package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/AltitudePoint;", "", "time", "", "altitude", "", "(JI)V", "getAltitude", "()I", "setAltitude", "(I)V", "getTime", "()J", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AltitudePoint {
    private int altitude;
    private final long time;

    public AltitudePoint(long j, int i) {
        this.time = j;
        this.altitude = i;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAltitude(int i) {
        this.altitude = i;
    }
}
