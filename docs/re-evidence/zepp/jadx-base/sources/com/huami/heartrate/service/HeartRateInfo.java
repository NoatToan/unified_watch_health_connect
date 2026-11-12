package com.huami.heartrate.service;

import defpackage.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/heartrate/service/HeartRateInfo;", "", "", "component1", "Lcom/huami/heartrate/service/HeartRateStatisticalInfo;", "component2", "", "component3", "date", "heartRateStatisticalInfo", "mergedRawHeartData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getDate", "()J", "b", "Lcom/huami/heartrate/service/HeartRateStatisticalInfo;", "getHeartRateStatisticalInfo", "()Lcom/huami/heartrate/service/HeartRateStatisticalInfo;", "c", "[B", "getMergedRawHeartData", "()[B", "<init>", "(JLcom/huami/heartrate/service/HeartRateStatisticalInfo;[B)V", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final HeartRateStatisticalInfo heartRateStatisticalInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] mergedRawHeartData;

    public HeartRateInfo(long j, @Nullable HeartRateStatisticalInfo heartRateStatisticalInfo, @NotNull byte[] bArr) {
        this.date = j;
        this.heartRateStatisticalInfo = heartRateStatisticalInfo;
        this.mergedRawHeartData = bArr;
    }

    public static /* synthetic */ HeartRateInfo copy$default(HeartRateInfo heartRateInfo, long j, HeartRateStatisticalInfo heartRateStatisticalInfo, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = heartRateInfo.date;
        }
        if ((i & 2) != 0) {
            heartRateStatisticalInfo = heartRateInfo.heartRateStatisticalInfo;
        }
        if ((i & 4) != 0) {
            bArr = heartRateInfo.mergedRawHeartData;
        }
        return heartRateInfo.copy(j, heartRateStatisticalInfo, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeartRateStatisticalInfo getHeartRateStatisticalInfo() {
        return this.heartRateStatisticalInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getMergedRawHeartData() {
        return this.mergedRawHeartData;
    }

    @NotNull
    public final HeartRateInfo copy(long date, @Nullable HeartRateStatisticalInfo heartRateStatisticalInfo, @NotNull byte[] mergedRawHeartData) {
        return new HeartRateInfo(date, heartRateStatisticalInfo, mergedRawHeartData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateInfo)) {
            return false;
        }
        HeartRateInfo heartRateInfo = (HeartRateInfo) other;
        return this.date == heartRateInfo.date && Intrinsics.areEqual(this.heartRateStatisticalInfo, heartRateInfo.heartRateStatisticalInfo) && Intrinsics.areEqual(this.mergedRawHeartData, heartRateInfo.mergedRawHeartData);
    }

    public final long getDate() {
        return this.date;
    }

    @Nullable
    public final HeartRateStatisticalInfo getHeartRateStatisticalInfo() {
        return this.heartRateStatisticalInfo;
    }

    @NotNull
    public final byte[] getMergedRawHeartData() {
        return this.mergedRawHeartData;
    }

    public int hashCode() {
        int iA = b.a(this.date) * 31;
        HeartRateStatisticalInfo heartRateStatisticalInfo = this.heartRateStatisticalInfo;
        return ((iA + (heartRateStatisticalInfo == null ? 0 : heartRateStatisticalInfo.hashCode())) * 31) + Arrays.hashCode(this.mergedRawHeartData);
    }

    @NotNull
    public String toString() {
        return "HeartRateInfo(date=" + this.date + ", heartRateStatisticalInfo=" + this.heartRateStatisticalInfo + ", mergedRawHeartData=" + Arrays.toString(this.mergedRawHeartData) + ")";
    }
}
