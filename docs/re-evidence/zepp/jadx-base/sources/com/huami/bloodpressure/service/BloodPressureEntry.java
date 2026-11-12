package com.huami.bloodpressure.service;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodpressure/service/BloodPressureEntry;", "", "", "component1", "", "component2", "component3", "latestTime", "sbp", "dbp", "copy", "", "toString", "hashCode", "other", "", "equals", "J", "getLatestTime", "()J", LogUtil.I, "getSbp", "()I", "getDbp", "<init>", "(JII)V", "bloodpressure-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureEntry {
    private final int dbp;
    private final long latestTime;
    private final int sbp;

    public BloodPressureEntry(long j, int i, int i2) {
        this.latestTime = j;
        this.sbp = i;
        this.dbp = i2;
    }

    public static /* synthetic */ BloodPressureEntry copy$default(BloodPressureEntry bloodPressureEntry, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = bloodPressureEntry.latestTime;
        }
        if ((i3 & 2) != 0) {
            i = bloodPressureEntry.sbp;
        }
        if ((i3 & 4) != 0) {
            i2 = bloodPressureEntry.dbp;
        }
        return bloodPressureEntry.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLatestTime() {
        return this.latestTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSbp() {
        return this.sbp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDbp() {
        return this.dbp;
    }

    @NotNull
    public final BloodPressureEntry copy(long latestTime, int sbp, int dbp) {
        return new BloodPressureEntry(latestTime, sbp, dbp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureEntry)) {
            return false;
        }
        BloodPressureEntry bloodPressureEntry = (BloodPressureEntry) other;
        return this.latestTime == bloodPressureEntry.latestTime && this.sbp == bloodPressureEntry.sbp && this.dbp == bloodPressureEntry.dbp;
    }

    public final int getDbp() {
        return this.dbp;
    }

    public final long getLatestTime() {
        return this.latestTime;
    }

    public final int getSbp() {
        return this.sbp;
    }

    public int hashCode() {
        return (((b.a(this.latestTime) * 31) + this.sbp) * 31) + this.dbp;
    }

    @NotNull
    public String toString() {
        return "BloodPressureEntry(latestTime=" + this.latestTime + ", sbp=" + this.sbp + ", dbp=" + this.dbp + ")";
    }
}
