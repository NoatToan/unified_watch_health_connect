package com.xiaomi.fit.fitness.export.data.item;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "time", "", "timeInZero", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJ)V", "getDataType", "()Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTime", "()J", "getTimeInZero", "setTimeInZero", "(J)V", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RedDotItem {

    @NotNull
    private final HomeDataType dataType;
    private final long time;
    private long timeInZero;

    public RedDotItem(@NotNull HomeDataType dataType, long j, long j2) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        this.dataType = dataType;
        this.time = j;
        this.timeInZero = j2;
    }

    public static /* synthetic */ RedDotItem copy$default(RedDotItem redDotItem, HomeDataType homeDataType, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDataType = redDotItem.dataType;
        }
        if ((i & 2) != 0) {
            j = redDotItem.time;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = redDotItem.timeInZero;
        }
        return redDotItem.copy(homeDataType, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HomeDataType getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeInZero() {
        return this.timeInZero;
    }

    @NotNull
    public final RedDotItem copy(@NotNull HomeDataType dataType, long time, long timeInZero) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return new RedDotItem(dataType, time, timeInZero);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedDotItem)) {
            return false;
        }
        RedDotItem redDotItem = (RedDotItem) other;
        return this.dataType == redDotItem.dataType && this.time == redDotItem.time && this.timeInZero == redDotItem.timeInZero;
    }

    @NotNull
    public final HomeDataType getDataType() {
        return this.dataType;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeInZero() {
        return this.timeInZero;
    }

    public int hashCode() {
        return (((this.dataType.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.timeInZero);
    }

    public final void setTimeInZero(long j) {
        this.timeInZero = j;
    }

    @NotNull
    public String toString() {
        return "RedDotItem(dataType=" + this.dataType + ", time=" + this.time + ", timeInZero=" + this.timeInZero + ")";
    }

    public /* synthetic */ RedDotItem(HomeDataType homeDataType, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(homeDataType, j, (i & 4) != 0 ? 0L : j2);
    }
}
