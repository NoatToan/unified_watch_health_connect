package com.huami.sync;

import com.google.android.gms.fitness.data.Field;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/sync/Step;", "", "", "component1", "component2", "component3", "time", GetWatermarkAPI.KEY_NAME_STEPS, Field.NUTRIENT_CALORIES, "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "getSteps", "c", "getCalories", "<init>", "(JJJ)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Step {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long steps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long calories;

    public Step(long j, long j2, long j3) {
        this.time = j;
        this.steps = j2;
        this.calories = j3;
    }

    public static /* synthetic */ Step copy$default(Step step, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = step.time;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = step.steps;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = step.calories;
        }
        return step.copy(j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCalories() {
        return this.calories;
    }

    @NotNull
    public final Step copy(long time, long steps, long calories) {
        return new Step(time, steps, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return this.time == step.time && this.steps == step.steps && this.calories == step.calories;
    }

    public final long getCalories() {
        return this.calories;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((b.a(this.time) * 31) + b.a(this.steps)) * 31) + b.a(this.calories);
    }

    @NotNull
    public String toString() {
        return "Step(time=" + this.time + ", steps=" + this.steps + ", calories=" + this.calories + ')';
    }
}
