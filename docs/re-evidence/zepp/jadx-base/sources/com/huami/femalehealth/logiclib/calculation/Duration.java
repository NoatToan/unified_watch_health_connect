package com.huami.femalehealth.logiclib.calculation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u0013\u0010\u0011\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/Duration;", "", "", "toString", "", "a", "J", "getStart", "()J", "setStart", "(J)V", "start", "b", "getEnd", "setEnd", "end", "getDurMilli", "durMilli", "<init>", "(JJ)V", "", "day", "(JI)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class Duration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long end;

    public Duration(long j, long j2) {
        this.start = j;
        this.end = j2;
    }

    public final long getDurMilli() {
        return this.end - this.start;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    @NotNull
    public String toString() {
        return "Duration -> (" + this.start + ", " + this.end + ") durMilli:" + getDurMilli() + "  day:" + ((getDurMilli() / 86400000) + ((double) 1));
    }

    public Duration(long j, int i) {
        this.start = j;
        this.end = j + (((long) (i - 1)) * 86400000);
    }
}
