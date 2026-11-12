package com.huami.sleep.daysleep.tonality.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J_\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\u0016\u001a\u00020\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+¨\u00068"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/bean/TonalityDisplayDataInfo;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "", "component6", "", "component7", "component8", "selectDateKey", "selectDateTime", "sleepStartTime", "sleepEndTime", "intoSleepCount", "beMainSleep", "intoSleepTimes", "awakeTimeIndex", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getSelectDateKey", "()Ljava/lang/String;", "b", "J", "getSelectDateTime", "()J", "c", "getSleepStartTime", GoogleApiAvailabilityLight.a, "getSleepEndTime", "e", LogUtil.I, "getIntoSleepCount", "()I", "f", "Z", "getBeMainSleep", "()Z", "g", "Ljava/util/List;", "getIntoSleepTimes", "()Ljava/util/List;", "h", "getAwakeTimeIndex", "<init>", "(Ljava/lang/String;JJJIZLjava/util/List;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TonalityDisplayDataInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String selectDateKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long selectDateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long sleepStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long sleepEndTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int intoSleepCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean beMainSleep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Long> intoSleepTimes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int awakeTimeIndex;

    public TonalityDisplayDataInfo(@NotNull String str, long j, long j2, long j3, int i, boolean z, @NotNull List<Long> list, int i2) {
        this.selectDateKey = str;
        this.selectDateTime = j;
        this.sleepStartTime = j2;
        this.sleepEndTime = j3;
        this.intoSleepCount = i;
        this.beMainSleep = z;
        this.intoSleepTimes = list;
        this.awakeTimeIndex = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectDateKey() {
        return this.selectDateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSelectDateTime() {
        return this.selectDateTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSleepEndTime() {
        return this.sleepEndTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIntoSleepCount() {
        return this.intoSleepCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBeMainSleep() {
        return this.beMainSleep;
    }

    @NotNull
    public final List<Long> component7() {
        return this.intoSleepTimes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAwakeTimeIndex() {
        return this.awakeTimeIndex;
    }

    @NotNull
    public final TonalityDisplayDataInfo copy(@NotNull String selectDateKey, long selectDateTime, long sleepStartTime, long sleepEndTime, int intoSleepCount, boolean beMainSleep, @NotNull List<Long> intoSleepTimes, int awakeTimeIndex) {
        return new TonalityDisplayDataInfo(selectDateKey, selectDateTime, sleepStartTime, sleepEndTime, intoSleepCount, beMainSleep, intoSleepTimes, awakeTimeIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TonalityDisplayDataInfo)) {
            return false;
        }
        TonalityDisplayDataInfo tonalityDisplayDataInfo = (TonalityDisplayDataInfo) other;
        return Intrinsics.areEqual(this.selectDateKey, tonalityDisplayDataInfo.selectDateKey) && this.selectDateTime == tonalityDisplayDataInfo.selectDateTime && this.sleepStartTime == tonalityDisplayDataInfo.sleepStartTime && this.sleepEndTime == tonalityDisplayDataInfo.sleepEndTime && this.intoSleepCount == tonalityDisplayDataInfo.intoSleepCount && this.beMainSleep == tonalityDisplayDataInfo.beMainSleep && Intrinsics.areEqual(this.intoSleepTimes, tonalityDisplayDataInfo.intoSleepTimes) && this.awakeTimeIndex == tonalityDisplayDataInfo.awakeTimeIndex;
    }

    public final int getAwakeTimeIndex() {
        return this.awakeTimeIndex;
    }

    public final boolean getBeMainSleep() {
        return this.beMainSleep;
    }

    public final int getIntoSleepCount() {
        return this.intoSleepCount;
    }

    @NotNull
    public final List<Long> getIntoSleepTimes() {
        return this.intoSleepTimes;
    }

    @NotNull
    public final String getSelectDateKey() {
        return this.selectDateKey;
    }

    public final long getSelectDateTime() {
        return this.selectDateTime;
    }

    public final long getSleepEndTime() {
        return this.sleepEndTime;
    }

    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.selectDateKey.hashCode() * 31) + b.a(this.selectDateTime)) * 31) + b.a(this.sleepStartTime)) * 31) + b.a(this.sleepEndTime)) * 31) + this.intoSleepCount) * 31;
        boolean z = this.beMainSleep;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.intoSleepTimes.hashCode()) * 31) + this.awakeTimeIndex;
    }

    @NotNull
    public String toString() {
        return "TonalityDisplayDataInfo(selectDateKey=" + this.selectDateKey + ", selectDateTime=" + this.selectDateTime + ", sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", intoSleepCount=" + this.intoSleepCount + ", beMainSleep=" + this.beMainSleep + ", intoSleepTimes=" + this.intoSleepTimes + ", awakeTimeIndex=" + this.awakeTimeIndex + ")";
    }
}
