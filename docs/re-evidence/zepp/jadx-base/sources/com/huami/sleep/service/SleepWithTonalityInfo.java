package com.huami.sleep.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/service/SleepWithTonalityInfo;", "", "", "component1", "component2", "component3", "component4", "maxTonalityScore", "mainSleepDeepRatio", "mainSleepTotalDuration", "mainSleepScore", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMaxTonalityScore", "()I", "b", "getMainSleepDeepRatio", "c", "getMainSleepTotalDuration", GoogleApiAvailabilityLight.a, "getMainSleepScore", "<init>", "(IIII)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepWithTonalityInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int maxTonalityScore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int mainSleepDeepRatio;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int mainSleepTotalDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int mainSleepScore;

    public SleepWithTonalityInfo(int i, int i2, int i3, int i4) {
        this.maxTonalityScore = i;
        this.mainSleepDeepRatio = i2;
        this.mainSleepTotalDuration = i3;
        this.mainSleepScore = i4;
    }

    public static /* synthetic */ SleepWithTonalityInfo copy$default(SleepWithTonalityInfo sleepWithTonalityInfo, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = sleepWithTonalityInfo.maxTonalityScore;
        }
        if ((i5 & 2) != 0) {
            i2 = sleepWithTonalityInfo.mainSleepDeepRatio;
        }
        if ((i5 & 4) != 0) {
            i3 = sleepWithTonalityInfo.mainSleepTotalDuration;
        }
        if ((i5 & 8) != 0) {
            i4 = sleepWithTonalityInfo.mainSleepScore;
        }
        return sleepWithTonalityInfo.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxTonalityScore() {
        return this.maxTonalityScore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMainSleepDeepRatio() {
        return this.mainSleepDeepRatio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMainSleepTotalDuration() {
        return this.mainSleepTotalDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMainSleepScore() {
        return this.mainSleepScore;
    }

    @NotNull
    public final SleepWithTonalityInfo copy(int maxTonalityScore, int mainSleepDeepRatio, int mainSleepTotalDuration, int mainSleepScore) {
        return new SleepWithTonalityInfo(maxTonalityScore, mainSleepDeepRatio, mainSleepTotalDuration, mainSleepScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepWithTonalityInfo)) {
            return false;
        }
        SleepWithTonalityInfo sleepWithTonalityInfo = (SleepWithTonalityInfo) other;
        return this.maxTonalityScore == sleepWithTonalityInfo.maxTonalityScore && this.mainSleepDeepRatio == sleepWithTonalityInfo.mainSleepDeepRatio && this.mainSleepTotalDuration == sleepWithTonalityInfo.mainSleepTotalDuration && this.mainSleepScore == sleepWithTonalityInfo.mainSleepScore;
    }

    public final int getMainSleepDeepRatio() {
        return this.mainSleepDeepRatio;
    }

    public final int getMainSleepScore() {
        return this.mainSleepScore;
    }

    public final int getMainSleepTotalDuration() {
        return this.mainSleepTotalDuration;
    }

    public final int getMaxTonalityScore() {
        return this.maxTonalityScore;
    }

    public int hashCode() {
        return (((((this.maxTonalityScore * 31) + this.mainSleepDeepRatio) * 31) + this.mainSleepTotalDuration) * 31) + this.mainSleepScore;
    }

    @NotNull
    public String toString() {
        return "SleepWithTonalityInfo(maxTonalityScore=" + this.maxTonalityScore + ", mainSleepDeepRatio=" + this.mainSleepDeepRatio + ", mainSleepTotalDuration=" + this.mainSleepTotalDuration + ", mainSleepScore=" + this.mainSleepScore + ")";
    }
}
