package com.huami.sleep.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 ¨\u0006)"}, d2 = {"Lcom/huami/sleep/service/SleepData;", "", "Ljava/util/Date;", "component1", "component2", "", "component3", "component4", "component5", "component6", "sleepStartTime", "sleepEndTime", "sleepScore", "sleepDuration", "deepSleepDuration", "toBeSleepTimeCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getSleepStartTime", "()Ljava/util/Date;", "b", "getSleepEndTime", "c", LogUtil.I, "getSleepScore", "()I", GoogleApiAvailabilityLight.a, "getSleepDuration", "e", "getDeepSleepDuration", "f", "getToBeSleepTimeCount", "<init>", "(Ljava/util/Date;Ljava/util/Date;IIII)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepEndTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int sleepScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int sleepDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int deepSleepDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int toBeSleepTimeCount;

    public SleepData(@NotNull Date date, @NotNull Date date2, int i, int i2, int i3, int i4) {
        this.sleepStartTime = date;
        this.sleepEndTime = date2;
        this.sleepScore = i;
        this.sleepDuration = i2;
        this.deepSleepDuration = i3;
        this.toBeSleepTimeCount = i4;
    }

    public static /* synthetic */ SleepData copy$default(SleepData sleepData, Date date, Date date2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            date = sleepData.sleepStartTime;
        }
        if ((i5 & 2) != 0) {
            date2 = sleepData.sleepEndTime;
        }
        Date date3 = date2;
        if ((i5 & 4) != 0) {
            i = sleepData.sleepScore;
        }
        int i6 = i;
        if ((i5 & 8) != 0) {
            i2 = sleepData.sleepDuration;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = sleepData.deepSleepDuration;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = sleepData.toBeSleepTimeCount;
        }
        return sleepData.copy(date, date3, i6, i7, i8, i4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getToBeSleepTimeCount() {
        return this.toBeSleepTimeCount;
    }

    @NotNull
    public final SleepData copy(@NotNull Date sleepStartTime, @NotNull Date sleepEndTime, int sleepScore, int sleepDuration, int deepSleepDuration, int toBeSleepTimeCount) {
        return new SleepData(sleepStartTime, sleepEndTime, sleepScore, sleepDuration, deepSleepDuration, toBeSleepTimeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepData)) {
            return false;
        }
        SleepData sleepData = (SleepData) other;
        return Intrinsics.areEqual(this.sleepStartTime, sleepData.sleepStartTime) && Intrinsics.areEqual(this.sleepEndTime, sleepData.sleepEndTime) && this.sleepScore == sleepData.sleepScore && this.sleepDuration == sleepData.sleepDuration && this.deepSleepDuration == sleepData.deepSleepDuration && this.toBeSleepTimeCount == sleepData.toBeSleepTimeCount;
    }

    public final int getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @NotNull
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    @NotNull
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    public final int getToBeSleepTimeCount() {
        return this.toBeSleepTimeCount;
    }

    public int hashCode() {
        return (((((((((this.sleepStartTime.hashCode() * 31) + this.sleepEndTime.hashCode()) * 31) + this.sleepScore) * 31) + this.sleepDuration) * 31) + this.deepSleepDuration) * 31) + this.toBeSleepTimeCount;
    }

    @NotNull
    public String toString() {
        return "SleepData(sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", sleepScore=" + this.sleepScore + ", sleepDuration=" + this.sleepDuration + ", deepSleepDuration=" + this.deepSleepDuration + ", toBeSleepTimeCount=" + this.toBeSleepTimeCount + ")";
    }
}
