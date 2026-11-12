package com.xiaomi.fitness.steps;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/steps/StepItem;", "", "beginTime", "", "endTime", "mode", "", "steps", "<init>", "(JJII)V", "getBeginTime", "()J", "setBeginTime", "(J)V", "getEndTime", "setEndTime", "getMode", "()I", "setMode", "(I)V", "getSteps", "setSteps", "isValid", "", "()Z", "toString", "", "Companion", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepItem {
    public static final int MODE_REST = 1;
    public static final int MODE_RUNNING = 3;
    public static final int MODE_WALKING = 2;
    private long beginTime;
    private long endTime;
    private int mode;
    private int steps;

    @JvmOverloads
    public StepItem() {
        this(0L, 0L, 0, 0, 15, null);
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final boolean isValid() {
        return this.mode != -1;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public final void setSteps(int i) {
        this.steps = i;
    }

    @NotNull
    public String toString() {
        return "StepItem{beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", mode=" + this.mode + ", steps=" + this.steps + "}";
    }

    @JvmOverloads
    public StepItem(long j) {
        this(j, 0L, 0, 0, 14, null);
    }

    @JvmOverloads
    public StepItem(long j, long j2) {
        this(j, j2, 0, 0, 12, null);
    }

    @JvmOverloads
    public StepItem(long j, long j2, int i) {
        this(j, j2, i, 0, 8, null);
    }

    @JvmOverloads
    public StepItem(long j, long j2, int i, int i2) {
        this.beginTime = j;
        this.endTime = j2;
        this.mode = i;
        this.steps = i2;
    }

    public /* synthetic */ StepItem(long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) == 0 ? j2 : 0L, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
