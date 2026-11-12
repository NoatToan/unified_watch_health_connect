package com.xiaomi.fitness.health.todayhealth.ui.items;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/DataRecordItem;", "", "heartRate", "", "status", "time", "", "<init>", "(IIJ)V", "getHeartRate", "()I", "getStatus", "getTime", "()J", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DataRecordItem {
    private final int heartRate;
    private final int status;
    private final long time;

    public DataRecordItem(int i, int i2, long j) {
        this.heartRate = i;
        this.status = i2;
        this.time = j;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public String toString() {
        return "DataRecordItem(heartRate=" + this.heartRate + ", status=" + this.status + ", time='" + this.time + "')";
    }
}
