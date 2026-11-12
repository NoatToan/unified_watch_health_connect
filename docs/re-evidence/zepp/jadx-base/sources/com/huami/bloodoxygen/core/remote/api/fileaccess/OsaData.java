package com.huami.bloodoxygen.core.remote.api.fileaccess;

import androidx.annotation.Keep;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/OsaData;", "", "", "component1", "component2", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/Extra;", "component3", "startTime", "endTime", "extra", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getStartTime", "()J", "getEndTime", "Lcom/huami/bloodoxygen/core/remote/api/fileaccess/Extra;", "getExtra", "()Lcom/huami/bloodoxygen/core/remote/api/fileaccess/Extra;", "<init>", "(JJLcom/huami/bloodoxygen/core/remote/api/fileaccess/Extra;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OsaData {
    private final long endTime;

    @NotNull
    private final Extra extra;
    private final long startTime;

    public OsaData(long j, long j2, @NotNull Extra extra) {
        this.startTime = j;
        this.endTime = j2;
        this.extra = extra;
    }

    public static /* synthetic */ OsaData copy$default(OsaData osaData, long j, long j2, Extra extra, int i, Object obj) {
        if ((i & 1) != 0) {
            j = osaData.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = osaData.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            extra = osaData.extra;
        }
        return osaData.copy(j3, j4, extra);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Extra getExtra() {
        return this.extra;
    }

    @NotNull
    public final OsaData copy(long startTime, long endTime, @NotNull Extra extra) {
        return new OsaData(startTime, endTime, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsaData)) {
            return false;
        }
        OsaData osaData = (OsaData) other;
        return this.startTime == osaData.startTime && this.endTime == osaData.endTime && Intrinsics.areEqual(this.extra, osaData.extra);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final Extra getExtra() {
        return this.extra;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((b.a(this.startTime) * 31) + b.a(this.endTime)) * 31) + this.extra.hashCode();
    }

    @NotNull
    public String toString() {
        return "OsaData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", extra=" + this.extra + ")";
    }
}
