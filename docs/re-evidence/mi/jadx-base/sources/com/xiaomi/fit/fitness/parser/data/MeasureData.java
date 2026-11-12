package com.xiaomi.fit.fitness.parser.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0001HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/MeasureData;", "", "type", "", "time", "", "value", "<init>", "(IJLjava/lang/Object;)V", "getType", "()I", "getTime", "()J", "getValue", "()Ljava/lang/Object;", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeasureData {
    private final long time;
    private final int type;

    @NotNull
    private final Object value;

    public MeasureData(@MeasureDataType int i, long j, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = i;
        this.time = j;
        this.value = value;
    }

    public static /* synthetic */ MeasureData copy$default(MeasureData measureData, int i, long j, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = measureData.type;
        }
        if ((i2 & 2) != 0) {
            j = measureData.time;
        }
        if ((i2 & 4) != 0) {
            obj = measureData.value;
        }
        return measureData.copy(i, j, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    @NotNull
    public final MeasureData copy(@MeasureDataType int type, long time, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new MeasureData(type, time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureData)) {
            return false;
        }
        MeasureData measureData = (MeasureData) other;
        return this.type == measureData.type && this.time == measureData.time && Intrinsics.areEqual(this.value, measureData.value);
    }

    public final long getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Long.hashCode(this.time)) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "type = " + this.type + ", time = " + this.time + ", value = " + this.value;
    }
}
