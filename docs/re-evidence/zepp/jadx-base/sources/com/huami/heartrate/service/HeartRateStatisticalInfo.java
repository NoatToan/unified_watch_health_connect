package com.huami.heartrate.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/heartrate/service/HeartRateStatisticalInfo;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/heartrate/service/HeartRate;", "component5", "restHeartRate", "minHeartRate", "maxHeartRate", "avgHeartRate", "latestHeartRate", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getRestHeartRate", "()I", "b", "getMinHeartRate", "c", "getMaxHeartRate", GoogleApiAvailabilityLight.a, "getAvgHeartRate", "e", "Lcom/huami/heartrate/service/HeartRate;", "getLatestHeartRate", "()Lcom/huami/heartrate/service/HeartRate;", "<init>", "(IIIILcom/huami/heartrate/service/HeartRate;)V", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateStatisticalInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int restHeartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int minHeartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int maxHeartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int avgHeartRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final HeartRate latestHeartRate;

    public HeartRateStatisticalInfo(int i, int i2, int i3, int i4, @Nullable HeartRate heartRate) {
        this.restHeartRate = i;
        this.minHeartRate = i2;
        this.maxHeartRate = i3;
        this.avgHeartRate = i4;
        this.latestHeartRate = heartRate;
    }

    public static /* synthetic */ HeartRateStatisticalInfo copy$default(HeartRateStatisticalInfo heartRateStatisticalInfo, int i, int i2, int i3, int i4, HeartRate heartRate, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = heartRateStatisticalInfo.restHeartRate;
        }
        if ((i5 & 2) != 0) {
            i2 = heartRateStatisticalInfo.minHeartRate;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = heartRateStatisticalInfo.maxHeartRate;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = heartRateStatisticalInfo.avgHeartRate;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            heartRate = heartRateStatisticalInfo.latestHeartRate;
        }
        return heartRateStatisticalInfo.copy(i, i6, i7, i8, heartRate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRestHeartRate() {
        return this.restHeartRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HeartRate getLatestHeartRate() {
        return this.latestHeartRate;
    }

    @NotNull
    public final HeartRateStatisticalInfo copy(int restHeartRate, int minHeartRate, int maxHeartRate, int avgHeartRate, @Nullable HeartRate latestHeartRate) {
        return new HeartRateStatisticalInfo(restHeartRate, minHeartRate, maxHeartRate, avgHeartRate, latestHeartRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateStatisticalInfo)) {
            return false;
        }
        HeartRateStatisticalInfo heartRateStatisticalInfo = (HeartRateStatisticalInfo) other;
        return this.restHeartRate == heartRateStatisticalInfo.restHeartRate && this.minHeartRate == heartRateStatisticalInfo.minHeartRate && this.maxHeartRate == heartRateStatisticalInfo.maxHeartRate && this.avgHeartRate == heartRateStatisticalInfo.avgHeartRate && Intrinsics.areEqual(this.latestHeartRate, heartRateStatisticalInfo.latestHeartRate);
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    public final HeartRate getLatestHeartRate() {
        return this.latestHeartRate;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final int getRestHeartRate() {
        return this.restHeartRate;
    }

    public int hashCode() {
        int i = ((((((this.restHeartRate * 31) + this.minHeartRate) * 31) + this.maxHeartRate) * 31) + this.avgHeartRate) * 31;
        HeartRate heartRate = this.latestHeartRate;
        return i + (heartRate == null ? 0 : heartRate.hashCode());
    }

    @NotNull
    public String toString() {
        return "HeartRateStatisticalInfo(restHeartRate=" + this.restHeartRate + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", avgHeartRate=" + this.avgHeartRate + ", latestHeartRate=" + this.latestHeartRate + ")";
    }
}
