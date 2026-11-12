package com.xiaomi.fitness.trail.data;

import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/trail/data/DimenStart;", "", StatConstants.PARAM_START, "", "state", "", "<init>", "(JI)V", "getStart", "()J", "getState", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DimenStart {
    private final long start;
    private final int state;

    public DimenStart(long j, int i) {
        this.start = j;
        this.state = i;
    }

    public static /* synthetic */ DimenStart copy$default(DimenStart dimenStart, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = dimenStart.start;
        }
        if ((i2 & 2) != 0) {
            i = dimenStart.state;
        }
        return dimenStart.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final DimenStart copy(long start, int state) {
        return new DimenStart(start, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DimenStart)) {
            return false;
        }
        DimenStart dimenStart = (DimenStart) other;
        return this.start == dimenStart.start && this.state == dimenStart.state;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return (Long.hashCode(this.start) * 31) + Integer.hashCode(this.state);
    }

    @NotNull
    public String toString() {
        return "DimenStart(start=" + this.start + ", state=" + this.state + ")";
    }
}
