package com.xiaomi.fit.fitness.export.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/export/utils/BloodSugarTargetRange;", "", "lowValue", "", "highValue", "<init>", "(FF)V", "getLowValue", "()F", "getHighValue", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodSugarTargetRange {
    private final float highValue;
    private final float lowValue;

    /* JADX WARN: Illegal instructions before constructor call */
    public BloodSugarTargetRange() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ BloodSugarTargetRange copy$default(BloodSugarTargetRange bloodSugarTargetRange, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bloodSugarTargetRange.lowValue;
        }
        if ((i & 2) != 0) {
            f2 = bloodSugarTargetRange.highValue;
        }
        return bloodSugarTargetRange.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLowValue() {
        return this.lowValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHighValue() {
        return this.highValue;
    }

    @NotNull
    public final BloodSugarTargetRange copy(float lowValue, float highValue) {
        return new BloodSugarTargetRange(lowValue, highValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarTargetRange)) {
            return false;
        }
        BloodSugarTargetRange bloodSugarTargetRange = (BloodSugarTargetRange) other;
        return Float.compare(this.lowValue, bloodSugarTargetRange.lowValue) == 0 && Float.compare(this.highValue, bloodSugarTargetRange.highValue) == 0;
    }

    public final float getHighValue() {
        return this.highValue;
    }

    public final float getLowValue() {
        return this.lowValue;
    }

    public int hashCode() {
        return (Float.hashCode(this.lowValue) * 31) + Float.hashCode(this.highValue);
    }

    @NotNull
    public String toString() {
        return "lowValue=" + this.lowValue + ",highValue=" + this.highValue;
    }

    public BloodSugarTargetRange(float f, float f2) {
        this.lowValue = f;
        this.highValue = f2;
    }

    public /* synthetic */ BloodSugarTargetRange(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 3.9f : f, (i & 2) != 0 ? 10.0f : f2);
    }
}
