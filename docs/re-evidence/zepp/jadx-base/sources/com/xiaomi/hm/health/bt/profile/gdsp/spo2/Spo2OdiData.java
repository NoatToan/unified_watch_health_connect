package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "ODI已经废弃")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OdiData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "b", "J", "getStopTime", "()J", "stopTime", "c", "getOdi", "odi", "startTime", "<init>", "(JJJ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Spo2OdiData extends Spo2Data {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long stopTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long odi;

    public Spo2OdiData(long j, long j2, long j3) {
        super(j);
        this.stopTime = j2;
        this.odi = j3;
    }

    public final long getOdi() {
        return this.odi;
    }

    public final long getStopTime() {
        return this.stopTime;
    }

    @NotNull
    public String toString() {
        return "Spo2OdiData, startTime: " + getTimeStamp() + ", stopTime: " + this.stopTime + ", odi: " + this.odi;
    }
}
