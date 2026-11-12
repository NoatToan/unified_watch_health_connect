package com.huami.sleep.sleepintrodetail.dto;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\bW\u0010XJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u0095\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010(\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010(\u001a\u0004\bL\u0010*\"\u0004\bM\u0010,R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010(\u001a\u0004\bO\u0010*\"\u0004\bP\u0010,R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010(\u001a\u0004\bR\u0010*\"\u0004\bS\u0010,R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010(\u001a\u0004\bU\u0010*\"\u0004\bV\u0010,¨\u0006Y"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "score", "totalDur", "deepDur", "lightDur", "remDur", "awakeDur", "awakeCount", "editDur", "startTime", "endTime", "startIndex", "endIndex", "intoDuration", "lazyOutBedDuration", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getScore", "()I", "setScore", "(I)V", "b", "getTotalDur", "setTotalDur", "c", "getDeepDur", "setDeepDur", GoogleApiAvailabilityLight.a, "getLightDur", "setLightDur", "e", "getRemDur", "setRemDur", "f", "getAwakeDur", "setAwakeDur", "g", "getAwakeCount", "setAwakeCount", "h", "getEditDur", "setEditDur", "i", "J", "getStartTime", "()J", "setStartTime", "(J)V", z.j, "getEndTime", "setEndTime", hl.k, "getStartIndex", "setStartIndex", "l", "getEndIndex", "setEndIndex", "m", "getIntoDuration", "setIntoDuration", GoogleApiAvailabilityLight.b, "getLazyOutBedDuration", "setLazyOutBedDuration", "<init>", "(IIIIIIIIJJIIII)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepDetail {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int totalDur;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int deepDur;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int lightDur;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private int remDur;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int awakeDur;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private int awakeCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private int editDur;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private long startTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private long endTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private int startIndex;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private int endIndex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private int intoDuration;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private int lazyOutBedDuration;

    public SleepDetail() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 16383, null);
    }

    public SleepDetail(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, int i9, int i10, int i11, int i12) {
        this.score = i;
        this.totalDur = i2;
        this.deepDur = i3;
        this.lightDur = i4;
        this.remDur = i5;
        this.awakeDur = i6;
        this.awakeCount = i7;
        this.editDur = i8;
        this.startTime = j;
        this.endTime = j2;
        this.startIndex = i9;
        this.endIndex = i10;
        this.intoDuration = i11;
        this.lazyOutBedDuration = i12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getIntoDuration() {
        return this.intoDuration;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getLazyOutBedDuration() {
        return this.lazyOutBedDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDur() {
        return this.totalDur;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeepDur() {
        return this.deepDur;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLightDur() {
        return this.lightDur;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRemDur() {
        return this.remDur;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAwakeDur() {
        return this.awakeDur;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAwakeCount() {
        return this.awakeCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEditDur() {
        return this.editDur;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final SleepDetail copy(int score, int totalDur, int deepDur, int lightDur, int remDur, int awakeDur, int awakeCount, int editDur, long startTime, long endTime, int startIndex, int endIndex, int intoDuration, int lazyOutBedDuration) {
        return new SleepDetail(score, totalDur, deepDur, lightDur, remDur, awakeDur, awakeCount, editDur, startTime, endTime, startIndex, endIndex, intoDuration, lazyOutBedDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDetail)) {
            return false;
        }
        SleepDetail sleepDetail = (SleepDetail) other;
        return this.score == sleepDetail.score && this.totalDur == sleepDetail.totalDur && this.deepDur == sleepDetail.deepDur && this.lightDur == sleepDetail.lightDur && this.remDur == sleepDetail.remDur && this.awakeDur == sleepDetail.awakeDur && this.awakeCount == sleepDetail.awakeCount && this.editDur == sleepDetail.editDur && this.startTime == sleepDetail.startTime && this.endTime == sleepDetail.endTime && this.startIndex == sleepDetail.startIndex && this.endIndex == sleepDetail.endIndex && this.intoDuration == sleepDetail.intoDuration && this.lazyOutBedDuration == sleepDetail.lazyOutBedDuration;
    }

    public final int getAwakeCount() {
        return this.awakeCount;
    }

    public final int getAwakeDur() {
        return this.awakeDur;
    }

    public final int getDeepDur() {
        return this.deepDur;
    }

    public final int getEditDur() {
        return this.editDur;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getIntoDuration() {
        return this.intoDuration;
    }

    public final int getLazyOutBedDuration() {
        return this.lazyOutBedDuration;
    }

    public final int getLightDur() {
        return this.lightDur;
    }

    public final int getRemDur() {
        return this.remDur;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getTotalDur() {
        return this.totalDur;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.score * 31) + this.totalDur) * 31) + this.deepDur) * 31) + this.lightDur) * 31) + this.remDur) * 31) + this.awakeDur) * 31) + this.awakeCount) * 31) + this.editDur) * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime)) * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.intoDuration) * 31) + this.lazyOutBedDuration;
    }

    public final void setAwakeCount(int i) {
        this.awakeCount = i;
    }

    public final void setAwakeDur(int i) {
        this.awakeDur = i;
    }

    public final void setDeepDur(int i) {
        this.deepDur = i;
    }

    public final void setEditDur(int i) {
        this.editDur = i;
    }

    public final void setEndIndex(int i) {
        this.endIndex = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setIntoDuration(int i) {
        this.intoDuration = i;
    }

    public final void setLazyOutBedDuration(int i) {
        this.lazyOutBedDuration = i;
    }

    public final void setLightDur(int i) {
        this.lightDur = i;
    }

    public final void setRemDur(int i) {
        this.remDur = i;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setStartIndex(int i) {
        this.startIndex = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTotalDur(int i) {
        this.totalDur = i;
    }

    @NotNull
    public String toString() {
        return "SleepDetail(score=" + this.score + ", totalDur=" + this.totalDur + ", deepDur=" + this.deepDur + ", lightDur=" + this.lightDur + ", remDur=" + this.remDur + ", awakeDur=" + this.awakeDur + ", awakeCount=" + this.awakeCount + ", editDur=" + this.editDur + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", intoDuration=" + this.intoDuration + ", lazyOutBedDuration=" + this.lazyOutBedDuration + ")";
    }

    public /* synthetic */ SleepDetail(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? 0 : i3, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? 0 : i5, (i13 & 32) != 0 ? 0 : i6, (i13 & 64) != 0 ? 0 : i7, (i13 & 128) != 0 ? 0 : i8, (i13 & 256) != 0 ? 0L : j, (i13 & 512) == 0 ? j2 : 0L, (i13 & 1024) != 0 ? 0 : i9, (i13 & 2048) != 0 ? 0 : i10, (i13 & 4096) != 0 ? 0 : i11, (i13 & 8192) != 0 ? 0 : i12);
    }
}
