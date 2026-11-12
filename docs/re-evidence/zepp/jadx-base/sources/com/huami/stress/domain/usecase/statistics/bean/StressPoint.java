package com.huami.stress.domain.usecase.statistics.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/stress/domain/usecase/statistics/bean/StressPoint;", "", "", "component1", "", "component2", "", "component3", "value", "time", "allDay", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getValue", "()I", "b", "J", "getTime", "()J", "c", "Z", "getAllDay", "()Z", "<init>", "(IJZ)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StressPoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean allDay;

    public StressPoint(int i, long j, boolean z) {
        this.value = i;
        this.time = j;
        this.allDay = z;
    }

    public static /* synthetic */ StressPoint copy$default(StressPoint stressPoint, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stressPoint.value;
        }
        if ((i2 & 2) != 0) {
            j = stressPoint.time;
        }
        if ((i2 & 4) != 0) {
            z = stressPoint.allDay;
        }
        return stressPoint.copy(i, j, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAllDay() {
        return this.allDay;
    }

    @NotNull
    public final StressPoint copy(int value, long time, boolean allDay) {
        return new StressPoint(value, time, allDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressPoint)) {
            return false;
        }
        StressPoint stressPoint = (StressPoint) other;
        return this.value == stressPoint.value && this.time == stressPoint.time && this.allDay == stressPoint.allDay;
    }

    public final boolean getAllDay() {
        return this.allDay;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iA = ((this.value * 31) + b.a(this.time)) * 31;
        boolean z = this.allDay;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    @NotNull
    public String toString() {
        return "StressPoint(value=" + this.value + ", time=" + this.time + ", allDay=" + this.allDay + ')';
    }
}
