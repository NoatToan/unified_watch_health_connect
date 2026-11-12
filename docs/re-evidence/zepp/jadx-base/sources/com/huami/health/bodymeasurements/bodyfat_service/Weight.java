package com.huami.health.bodymeasurements.bodyfat_service;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/health/bodymeasurements/bodyfat_service/Weight;", "", "", "component1", "", "component2", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "component3", "time", "weight", "unit", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "Ljava/lang/String;", "getWeight", "()Ljava/lang/String;", "c", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "getUnit", "()Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "<init>", "(JLjava/lang/String;Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;)V", "bodyfat-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Weight {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final WeightUnit unit;

    public Weight(long j, @NotNull String str, @NotNull WeightUnit weightUnit) {
        this.time = j;
        this.weight = str;
        this.unit = weightUnit;
    }

    public static /* synthetic */ Weight copy$default(Weight weight, long j, String str, WeightUnit weightUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = weight.time;
        }
        if ((i & 2) != 0) {
            str = weight.weight;
        }
        if ((i & 4) != 0) {
            weightUnit = weight.unit;
        }
        return weight.copy(j, str, weightUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WeightUnit getUnit() {
        return this.unit;
    }

    @NotNull
    public final Weight copy(long time, @NotNull String weight, @NotNull WeightUnit unit) {
        return new Weight(time, weight, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Weight)) {
            return false;
        }
        Weight weight = (Weight) other;
        return this.time == weight.time && Intrinsics.areEqual(this.weight, weight.weight) && Intrinsics.areEqual(this.unit, weight.unit);
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final WeightUnit getUnit() {
        return this.unit;
    }

    @NotNull
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iA = b.a(this.time) * 31;
        String str = this.weight;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        WeightUnit weightUnit = this.unit;
        return iHashCode + (weightUnit != null ? weightUnit.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Weight(time=" + this.time + ", weight=" + this.weight + ", unit=" + this.unit + ")";
    }
}
