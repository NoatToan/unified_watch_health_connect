package com.huami.sleep.daysleep.quotient;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0004\bS\u0010TJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003J\u00ad\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\u001b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\u001b\u0010:R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-R\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u0010-R\u0019\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010 \u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0019\u0010!\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\b!\u0010:R\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00109\u001a\u0004\b\"\u0010:\"\u0004\bI\u0010JR6\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bQ\u0010R\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006U"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/SleepQuotientDto;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "", "component11", "component12", "component13", "component14", "Lkotlin/Pair;", "component15", "sleepDuration", "sleepScore", "intoSleepDuration", "deepRatio", "lightRatio", "remRatio", "isRemSupport", "wakeupCount", "fallAsleepTime", "wakeUpTime", "startTime", "endTime", "isStatistics", "isEarbud", "odiScoreAndCode", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getSleepDuration", "()I", "b", "getSleepScore", "c", "getIntoSleepDuration", GoogleApiAvailabilityLight.a, "getDeepRatio", "e", "getLightRatio", "f", "getRemRatio", "g", "Z", "()Z", "h", "getWakeupCount", "i", "getFallAsleepTime", z.j, "getWakeUpTime", hl.k, "J", "getStartTime", "()J", "l", "getEndTime", "m", GoogleApiAvailabilityLight.b, "setEarbud", "(Z)V", "o", "Lkotlin/Pair;", "getOdiScoreAndCode", "()Lkotlin/Pair;", "setOdiScoreAndCode", "(Lkotlin/Pair;)V", "getOdiScoreAndCode$annotations", "()V", "<init>", "(IIIIIIZIIIJJZZLkotlin/Pair;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepQuotientDto {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sleepDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int sleepScore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int intoSleepDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int deepRatio;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int lightRatio;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int remRatio;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isRemSupport;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int wakeupCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int fallAsleepTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int wakeUpTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final boolean isStatistics;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private boolean isEarbud;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private Pair<Integer, Integer> odiScoreAndCode;

    public SleepQuotientDto() {
        this(0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0L, 0L, false, false, null, 32767, null);
    }

    public SleepQuotientDto(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9, long j, long j2, boolean z2, boolean z3, @Nullable Pair<Integer, Integer> pair) {
        this.sleepDuration = i;
        this.sleepScore = i2;
        this.intoSleepDuration = i3;
        this.deepRatio = i4;
        this.lightRatio = i5;
        this.remRatio = i6;
        this.isRemSupport = z;
        this.wakeupCount = i7;
        this.fallAsleepTime = i8;
        this.wakeUpTime = i9;
        this.startTime = j;
        this.endTime = j2;
        this.isStatistics = z2;
        this.isEarbud = z3;
        this.odiScoreAndCode = pair;
    }

    @Deprecated(message = "单独作为一个卡片，不需要放在睡眠质量得分卡片中展示呼吸质量了")
    public static /* synthetic */ void getOdiScoreAndCode$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWakeUpTime() {
        return this.wakeUpTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsStatistics() {
        return this.isStatistics;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsEarbud() {
        return this.isEarbud;
    }

    @Nullable
    public final Pair<Integer, Integer> component15() {
        return this.odiScoreAndCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntoSleepDuration() {
        return this.intoSleepDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeepRatio() {
        return this.deepRatio;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLightRatio() {
        return this.lightRatio;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRemRatio() {
        return this.remRatio;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsRemSupport() {
        return this.isRemSupport;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWakeupCount() {
        return this.wakeupCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFallAsleepTime() {
        return this.fallAsleepTime;
    }

    @NotNull
    public final SleepQuotientDto copy(int sleepDuration, int sleepScore, int intoSleepDuration, int deepRatio, int lightRatio, int remRatio, boolean isRemSupport, int wakeupCount, int fallAsleepTime, int wakeUpTime, long startTime, long endTime, boolean isStatistics, boolean isEarbud, @Nullable Pair<Integer, Integer> odiScoreAndCode) {
        return new SleepQuotientDto(sleepDuration, sleepScore, intoSleepDuration, deepRatio, lightRatio, remRatio, isRemSupport, wakeupCount, fallAsleepTime, wakeUpTime, startTime, endTime, isStatistics, isEarbud, odiScoreAndCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepQuotientDto)) {
            return false;
        }
        SleepQuotientDto sleepQuotientDto = (SleepQuotientDto) other;
        return this.sleepDuration == sleepQuotientDto.sleepDuration && this.sleepScore == sleepQuotientDto.sleepScore && this.intoSleepDuration == sleepQuotientDto.intoSleepDuration && this.deepRatio == sleepQuotientDto.deepRatio && this.lightRatio == sleepQuotientDto.lightRatio && this.remRatio == sleepQuotientDto.remRatio && this.isRemSupport == sleepQuotientDto.isRemSupport && this.wakeupCount == sleepQuotientDto.wakeupCount && this.fallAsleepTime == sleepQuotientDto.fallAsleepTime && this.wakeUpTime == sleepQuotientDto.wakeUpTime && this.startTime == sleepQuotientDto.startTime && this.endTime == sleepQuotientDto.endTime && this.isStatistics == sleepQuotientDto.isStatistics && this.isEarbud == sleepQuotientDto.isEarbud && Intrinsics.areEqual(this.odiScoreAndCode, sleepQuotientDto.odiScoreAndCode);
    }

    public final int getDeepRatio() {
        return this.deepRatio;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFallAsleepTime() {
        return this.fallAsleepTime;
    }

    public final int getIntoSleepDuration() {
        return this.intoSleepDuration;
    }

    public final int getLightRatio() {
        return this.lightRatio;
    }

    @Nullable
    public final Pair<Integer, Integer> getOdiScoreAndCode() {
        return this.odiScoreAndCode;
    }

    public final int getRemRatio() {
        return this.remRatio;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getWakeUpTime() {
        return this.wakeUpTime;
    }

    public final int getWakeupCount() {
        return this.wakeupCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = ((((((((((this.sleepDuration * 31) + this.sleepScore) * 31) + this.intoSleepDuration) * 31) + this.deepRatio) * 31) + this.lightRatio) * 31) + this.remRatio) * 31;
        boolean z = this.isRemSupport;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iA = (((((((((((i + r1) * 31) + this.wakeupCount) * 31) + this.fallAsleepTime) * 31) + this.wakeUpTime) * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime)) * 31;
        boolean z2 = this.isStatistics;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iA + r2) * 31;
        boolean z3 = this.isEarbud;
        int i3 = (i2 + (z3 ? 1 : z3)) * 31;
        Pair<Integer, Integer> pair = this.odiScoreAndCode;
        return i3 + (pair == null ? 0 : pair.hashCode());
    }

    public final boolean isEarbud() {
        return this.isEarbud;
    }

    public final boolean isRemSupport() {
        return this.isRemSupport;
    }

    public final boolean isStatistics() {
        return this.isStatistics;
    }

    public final void setEarbud(boolean z) {
        this.isEarbud = z;
    }

    public final void setOdiScoreAndCode(@Nullable Pair<Integer, Integer> pair) {
        this.odiScoreAndCode = pair;
    }

    @NotNull
    public String toString() {
        return "SleepQuotientDto(sleepDuration=" + this.sleepDuration + ", sleepScore=" + this.sleepScore + ", intoSleepDuration=" + this.intoSleepDuration + ", deepRatio=" + this.deepRatio + ", lightRatio=" + this.lightRatio + ", remRatio=" + this.remRatio + ", isRemSupport=" + this.isRemSupport + ", wakeupCount=" + this.wakeupCount + ", fallAsleepTime=" + this.fallAsleepTime + ", wakeUpTime=" + this.wakeUpTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isStatistics=" + this.isStatistics + ", isEarbud=" + this.isEarbud + ", odiScoreAndCode=" + this.odiScoreAndCode + ")";
    }

    public /* synthetic */ SleepQuotientDto(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9, long j, long j2, boolean z2, boolean z3, Pair pair, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? 0 : i3, (i10 & 8) != 0 ? 0 : i4, (i10 & 16) != 0 ? 0 : i5, (i10 & 32) != 0 ? 0 : i6, (i10 & 64) != 0 ? false : z, (i10 & 128) != 0 ? 0 : i7, (i10 & 256) != 0 ? 0 : i8, (i10 & 512) != 0 ? 0 : i9, (i10 & 1024) != 0 ? 0L : j, (i10 & 2048) == 0 ? j2 : 0L, (i10 & 4096) != 0 ? false : z2, (i10 & 8192) != 0 ? false : z3, (i10 & 16384) != 0 ? null : pair);
    }
}
