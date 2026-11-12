package com.huami.sync;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.dataflow.Constant;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/sync/HeartRate;", "", "", "component1", "", "component2", "time", Constant.KEY_HR_VALUE, "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getHeartRate", "()I", "<init>", "(JI)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int heartRate;

    public HeartRate(long j, int i) {
        this.time = j;
        this.heartRate = i;
    }

    public static /* synthetic */ HeartRate copy$default(HeartRate heartRate, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = heartRate.time;
        }
        if ((i2 & 2) != 0) {
            i = heartRate.heartRate;
        }
        return heartRate.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    @NotNull
    public final HeartRate copy(long time, int heartRate) {
        return new HeartRate(time, heartRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRate)) {
            return false;
        }
        HeartRate heartRate = (HeartRate) other;
        return this.time == heartRate.time && this.heartRate == heartRate.heartRate;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (b.a(this.time) * 31) + this.heartRate;
    }

    @NotNull
    public String toString() {
        return "HeartRate(time=" + this.time + ", heartRate=" + this.heartRate + ')';
    }
}
