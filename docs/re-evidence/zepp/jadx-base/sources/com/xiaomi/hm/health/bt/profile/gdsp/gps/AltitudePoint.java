package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/AltitudePoint;", "", "", "a", "J", "getTime", "()J", "time", "", "b", LogUtil.I, "getAltitude", "()I", "setAltitude", "(I)V", "altitude", "<init>", "(JI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AltitudePoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int altitude;

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
