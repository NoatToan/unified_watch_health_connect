package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000f\u0010$¨\u0006'"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "duration", "deepDuration", "lightDuration", "awakeDuration", "remDuration", "isRemSupport", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getDuration", "()I", "b", "getDeepDuration", "c", "getLightDuration", GoogleApiAvailabilityLight.a, "getAwakeDuration", "e", "getRemDuration", "f", "Z", "()Z", "<init>", "(IIIIIZ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepStageDurationInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int deepDuration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int lightDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int awakeDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int remDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isRemSupport;

    public SleepStageDurationInfo(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.duration = i;
        this.deepDuration = i2;
        this.lightDuration = i3;
        this.awakeDuration = i4;
        this.remDuration = i5;
        this.isRemSupport = z;
    }

    public static /* synthetic */ SleepStageDurationInfo copy$default(SleepStageDurationInfo sleepStageDurationInfo, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sleepStageDurationInfo.duration;
        }
        if ((i6 & 2) != 0) {
            i2 = sleepStageDurationInfo.deepDuration;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = sleepStageDurationInfo.lightDuration;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = sleepStageDurationInfo.awakeDuration;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = sleepStageDurationInfo.remDuration;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            z = sleepStageDurationInfo.isRemSupport;
        }
        return sleepStageDurationInfo.copy(i, i7, i8, i9, i10, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeepDuration() {
        return this.deepDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLightDuration() {
        return this.lightDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRemDuration() {
        return this.remDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsRemSupport() {
        return this.isRemSupport;
    }

    @NotNull
    public final SleepStageDurationInfo copy(int duration, int deepDuration, int lightDuration, int awakeDuration, int remDuration, boolean isRemSupport) {
        return new SleepStageDurationInfo(duration, deepDuration, lightDuration, awakeDuration, remDuration, isRemSupport);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepStageDurationInfo)) {
            return false;
        }
        SleepStageDurationInfo sleepStageDurationInfo = (SleepStageDurationInfo) other;
        return this.duration == sleepStageDurationInfo.duration && this.deepDuration == sleepStageDurationInfo.deepDuration && this.lightDuration == sleepStageDurationInfo.lightDuration && this.awakeDuration == sleepStageDurationInfo.awakeDuration && this.remDuration == sleepStageDurationInfo.remDuration && this.isRemSupport == sleepStageDurationInfo.isRemSupport;
    }

    public final int getAwakeDuration() {
        return this.awakeDuration;
    }

    public final int getDeepDuration() {
        return this.deepDuration;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getLightDuration() {
        return this.lightDuration;
    }

    public final int getRemDuration() {
        return this.remDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int i = ((((((((this.duration * 31) + this.deepDuration) * 31) + this.lightDuration) * 31) + this.awakeDuration) * 31) + this.remDuration) * 31;
        boolean z = this.isRemSupport;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isRemSupport() {
        return this.isRemSupport;
    }

    @NotNull
    public String toString() {
        return "SleepStageDurationInfo(duration=" + this.duration + ", deepDuration=" + this.deepDuration + ", lightDuration=" + this.lightDuration + ", awakeDuration=" + this.awakeDuration + ", remDuration=" + this.remDuration + ", isRemSupport=" + this.isRemSupport + ")";
    }
}
