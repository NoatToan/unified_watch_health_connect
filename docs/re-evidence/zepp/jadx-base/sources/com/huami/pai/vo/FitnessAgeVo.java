package com.huami.pai.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"Lcom/huami/pai/vo/FitnessAgeVo;", "", "", "component1", "", "component2", "component3", "", "component4", "date", "age", "vo2max", "isPredicted", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "J", "getDate", "()J", "b", "F", "getAge", "()F", "c", "getVo2max", GoogleApiAvailabilityLight.a, "Z", "()Z", "<init>", "(JFFZ)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FitnessAgeVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float age;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float vo2max;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean isPredicted;

    public FitnessAgeVo(long j, float f, float f2, boolean z) {
        this.date = j;
        this.age = f;
        this.vo2max = f2;
        this.isPredicted = z;
    }

    public static /* synthetic */ FitnessAgeVo copy$default(FitnessAgeVo fitnessAgeVo, long j, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fitnessAgeVo.date;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = fitnessAgeVo.age;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            f2 = fitnessAgeVo.vo2max;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            z = fitnessAgeVo.isPredicted;
        }
        return fitnessAgeVo.copy(j2, f3, f4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getVo2max() {
        return this.vo2max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPredicted() {
        return this.isPredicted;
    }

    @NotNull
    public final FitnessAgeVo copy(long date, float age, float vo2max, boolean isPredicted) {
        return new FitnessAgeVo(date, age, vo2max, isPredicted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessAgeVo)) {
            return false;
        }
        FitnessAgeVo fitnessAgeVo = (FitnessAgeVo) other;
        return this.date == fitnessAgeVo.date && Intrinsics.areEqual((Object) Float.valueOf(this.age), (Object) Float.valueOf(fitnessAgeVo.age)) && Intrinsics.areEqual((Object) Float.valueOf(this.vo2max), (Object) Float.valueOf(fitnessAgeVo.vo2max)) && this.isPredicted == fitnessAgeVo.isPredicted;
    }

    public final float getAge() {
        return this.age;
    }

    public final long getDate() {
        return this.date;
    }

    public final float getVo2max() {
        return this.vo2max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iA = ((((b.a(this.date) * 31) + Float.floatToIntBits(this.age)) * 31) + Float.floatToIntBits(this.vo2max)) * 31;
        boolean z = this.isPredicted;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isPredicted() {
        return this.isPredicted;
    }

    @NotNull
    public String toString() {
        return "FitnessAgeVo(date=" + this.date + ", age=" + this.age + ", vo2max=" + this.vo2max + ", isPredicted=" + this.isPredicted + ")";
    }
}
