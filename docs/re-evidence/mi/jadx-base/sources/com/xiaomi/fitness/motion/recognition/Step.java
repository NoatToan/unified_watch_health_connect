package com.xiaomi.fitness.motion.recognition;

import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/Step;", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "actType", "", "steps", "<init>", "(JJII)V", "getStart", "()J", "setStart", "(J)V", "getEnd", "getActType", "()I", "getSteps", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Step {
    private final int actType;
    private final long end;
    private long start;
    private final int steps;

    public Step() {
        this(0L, 0L, 0, 0, 15, null);
    }

    public static /* synthetic */ Step copy$default(Step step, long j, long j2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = step.start;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = step.end;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            i = step.actType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = step.steps;
        }
        return step.copy(j3, j4, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActType() {
        return this.actType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    @NotNull
    public final Step copy(long start, long end, int actType, int steps) {
        return new Step(start, end, actType, steps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Step)) {
            return false;
        }
        Step step = (Step) other;
        return this.start == step.start && this.end == step.end && this.actType == step.actType && this.steps == step.steps;
    }

    public final int getActType() {
        return this.actType;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.start) * 31) + Long.hashCode(this.end)) * 31) + Integer.hashCode(this.actType)) * 31) + Integer.hashCode(this.steps);
    }

    public final void setStart(long j) {
        this.start = j;
    }

    @NotNull
    public String toString() {
        return "Step(start=" + this.start + ", end=" + this.end + ", actType=" + this.actType + ", steps=" + this.steps + ")";
    }

    public Step(long j, long j2, int i, int i2) {
        this.start = j;
        this.end = j2;
        this.actType = i;
        this.steps = i2;
    }

    public /* synthetic */ Step(long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) == 0 ? j2 : 0L, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
