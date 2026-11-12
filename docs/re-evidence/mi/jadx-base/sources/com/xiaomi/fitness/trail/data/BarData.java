package com.xiaomi.fitness.trail.data;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/trail/data/BarData;", "", "duration", "", "distance", "calorie", "mills", "", "num", SportDataTypeKt.DIMEN_TOTAL, "", "<init>", "(IIIJIZ)V", "getDuration", "()I", "setDuration", "(I)V", "getDistance", "setDistance", "getCalorie", "setCalorie", "getMills", "()J", "getNum", "setNum", "getTotal", "()Z", "setTotal", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BarData {
    private int calorie;
    private int distance;
    private int duration;
    private final long mills;
    private int num;
    private boolean total;

    public BarData(int i, int i2, int i3, long j, int i4, boolean z) {
        this.duration = i;
        this.distance = i2;
        this.calorie = i3;
        this.mills = j;
        this.num = i4;
        this.total = z;
    }

    public static /* synthetic */ BarData copy$default(BarData barData, int i, int i2, int i3, long j, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = barData.duration;
        }
        if ((i5 & 2) != 0) {
            i2 = barData.distance;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = barData.calorie;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            j = barData.mills;
        }
        long j2 = j;
        if ((i5 & 16) != 0) {
            i4 = barData.num;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            z = barData.total;
        }
        return barData.copy(i, i6, i7, j2, i8, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMills() {
        return this.mills;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getTotal() {
        return this.total;
    }

    @NotNull
    public final BarData copy(int duration, int distance, int calorie, long mills, int num, boolean total) {
        return new BarData(duration, distance, calorie, mills, num, total);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarData)) {
            return false;
        }
        BarData barData = (BarData) other;
        return this.duration == barData.duration && this.distance == barData.distance && this.calorie == barData.calorie && this.mills == barData.mills && this.num == barData.num && this.total == barData.total;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getMills() {
        return this.mills;
    }

    public final int getNum() {
        return this.num;
    }

    public final boolean getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.duration) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.calorie)) * 31) + Long.hashCode(this.mills)) * 31) + Integer.hashCode(this.num)) * 31) + Boolean.hashCode(this.total);
    }

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setTotal(boolean z) {
        this.total = z;
    }

    @NotNull
    public String toString() {
        return "BarData(duration=" + this.duration + ", distance=" + this.distance + ", calorie=" + this.calorie + ", mills=" + this.mills + ", num=" + this.num + ", total=" + this.total + ")";
    }

    public /* synthetic */ BarData(int i, int i2, int i3, long j, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, j, (i5 & 16) != 0 ? 1 : i4, (i5 & 32) != 0 ? true : z);
    }
}
