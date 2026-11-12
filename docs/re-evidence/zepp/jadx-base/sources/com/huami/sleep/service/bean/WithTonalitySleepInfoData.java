package com.huami.sleep.service.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/sleep/service/bean/WithTonalitySleepInfoData;", "", "", "component1", "component2", "component3", "", "component4", "component5", "mainSleepDeepRatio", "mainSleepTotalDuration", "mainSleepScore", "mainSleepStartTime", "mainSleepStopTime", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMainSleepDeepRatio", "()I", "b", "getMainSleepTotalDuration", "c", "getMainSleepScore", GoogleApiAvailabilityLight.a, "J", "getMainSleepStartTime", "()J", "e", "getMainSleepStopTime", "<init>", "(IIIJJ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WithTonalitySleepInfoData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int mainSleepDeepRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int mainSleepTotalDuration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int mainSleepScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long mainSleepStartTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long mainSleepStopTime;

    public WithTonalitySleepInfoData(int i, int i2, int i3, long j, long j2) {
        this.mainSleepDeepRatio = i;
        this.mainSleepTotalDuration = i2;
        this.mainSleepScore = i3;
        this.mainSleepStartTime = j;
        this.mainSleepStopTime = j2;
    }

    public static /* synthetic */ WithTonalitySleepInfoData copy$default(WithTonalitySleepInfoData withTonalitySleepInfoData, int i, int i2, int i3, long j, long j2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = withTonalitySleepInfoData.mainSleepDeepRatio;
        }
        if ((i4 & 2) != 0) {
            i2 = withTonalitySleepInfoData.mainSleepTotalDuration;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = withTonalitySleepInfoData.mainSleepScore;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = withTonalitySleepInfoData.mainSleepStartTime;
        }
        long j3 = j;
        if ((i4 & 16) != 0) {
            j2 = withTonalitySleepInfoData.mainSleepStopTime;
        }
        return withTonalitySleepInfoData.copy(i, i5, i6, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMainSleepDeepRatio() {
        return this.mainSleepDeepRatio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMainSleepTotalDuration() {
        return this.mainSleepTotalDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMainSleepScore() {
        return this.mainSleepScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMainSleepStartTime() {
        return this.mainSleepStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMainSleepStopTime() {
        return this.mainSleepStopTime;
    }

    @NotNull
    public final WithTonalitySleepInfoData copy(int mainSleepDeepRatio, int mainSleepTotalDuration, int mainSleepScore, long mainSleepStartTime, long mainSleepStopTime) {
        return new WithTonalitySleepInfoData(mainSleepDeepRatio, mainSleepTotalDuration, mainSleepScore, mainSleepStartTime, mainSleepStopTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithTonalitySleepInfoData)) {
            return false;
        }
        WithTonalitySleepInfoData withTonalitySleepInfoData = (WithTonalitySleepInfoData) other;
        return this.mainSleepDeepRatio == withTonalitySleepInfoData.mainSleepDeepRatio && this.mainSleepTotalDuration == withTonalitySleepInfoData.mainSleepTotalDuration && this.mainSleepScore == withTonalitySleepInfoData.mainSleepScore && this.mainSleepStartTime == withTonalitySleepInfoData.mainSleepStartTime && this.mainSleepStopTime == withTonalitySleepInfoData.mainSleepStopTime;
    }

    public final int getMainSleepDeepRatio() {
        return this.mainSleepDeepRatio;
    }

    public final int getMainSleepScore() {
        return this.mainSleepScore;
    }

    public final long getMainSleepStartTime() {
        return this.mainSleepStartTime;
    }

    public final long getMainSleepStopTime() {
        return this.mainSleepStopTime;
    }

    public final int getMainSleepTotalDuration() {
        return this.mainSleepTotalDuration;
    }

    public int hashCode() {
        return (((((((this.mainSleepDeepRatio * 31) + this.mainSleepTotalDuration) * 31) + this.mainSleepScore) * 31) + b.a(this.mainSleepStartTime)) * 31) + b.a(this.mainSleepStopTime);
    }

    @NotNull
    public String toString() {
        return "WithTonalitySleepInfoData(mainSleepDeepRatio=" + this.mainSleepDeepRatio + ", mainSleepTotalDuration=" + this.mainSleepTotalDuration + ", mainSleepScore=" + this.mainSleepScore + ", mainSleepStartTime=" + this.mainSleepStartTime + ", mainSleepStopTime=" + this.mainSleepStopTime + ")";
    }
}
