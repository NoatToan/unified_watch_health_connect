package com.huami.step.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/step/service/StepEntry;", "", "", "component1", "", "component2", "component3", "component4", "time", "step", "distance", "calorie", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", LogUtil.I, "getStep", "()I", "c", "getDistance", GoogleApiAvailabilityLight.a, "getCalorie", "<init>", "(JIII)V", "step-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StepEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int step;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int distance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int calorie;

    public StepEntry(long j, int i, int i2, int i3) {
        this.time = j;
        this.step = i;
        this.distance = i2;
        this.calorie = i3;
    }

    public static /* synthetic */ StepEntry copy$default(StepEntry stepEntry, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = stepEntry.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = stepEntry.step;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = stepEntry.distance;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = stepEntry.calorie;
        }
        return stepEntry.copy(j2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    @NotNull
    public final StepEntry copy(long time, int step, int distance, int calorie) {
        return new StepEntry(time, step, distance, calorie);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepEntry)) {
            return false;
        }
        StepEntry stepEntry = (StepEntry) other;
        return this.time == stepEntry.time && this.step == stepEntry.step && this.distance == stepEntry.distance && this.calorie == stepEntry.calorie;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getStep() {
        return this.step;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((b.a(this.time) * 31) + this.step) * 31) + this.distance) * 31) + this.calorie;
    }

    @NotNull
    public String toString() {
        return "StepEntry(time=" + this.time + ", step=" + this.step + ", distance=" + this.distance + ", calorie=" + this.calorie + ')';
    }
}
