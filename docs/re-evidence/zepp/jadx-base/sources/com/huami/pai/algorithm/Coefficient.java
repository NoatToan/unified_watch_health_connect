package com.huami.pai.algorithm;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006'"}, d2 = {"Lcom/huami/pai/algorithm/Coefficient;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "female_a", "female_b", "female_c", "male_a", "male_b", "male_c", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", LogUtil.D, "getFemale_a", "()D", "b", "getFemale_b", "c", "getFemale_c", GoogleApiAvailabilityLight.a, "getMale_a", "e", "getMale_b", "f", "getMale_c", "<init>", "(DDDDDD)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Coefficient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final double female_a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final double female_b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final double female_c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final double male_a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final double male_b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final double male_c;

    public Coefficient(double d, double d2, double d3, double d4, double d5, double d6) {
        this.female_a = d;
        this.female_b = d2;
        this.female_c = d3;
        this.male_a = d4;
        this.male_b = d5;
        this.male_c = d6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getFemale_a() {
        return this.female_a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getFemale_b() {
        return this.female_b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getFemale_c() {
        return this.female_c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMale_a() {
        return this.male_a;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMale_b() {
        return this.male_b;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMale_c() {
        return this.male_c;
    }

    @NotNull
    public final Coefficient copy(double female_a, double female_b, double female_c, double male_a, double male_b, double male_c) {
        return new Coefficient(female_a, female_b, female_c, male_a, male_b, male_c);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coefficient)) {
            return false;
        }
        Coefficient coefficient = (Coefficient) other;
        return Intrinsics.areEqual((Object) Double.valueOf(this.female_a), (Object) Double.valueOf(coefficient.female_a)) && Intrinsics.areEqual((Object) Double.valueOf(this.female_b), (Object) Double.valueOf(coefficient.female_b)) && Intrinsics.areEqual((Object) Double.valueOf(this.female_c), (Object) Double.valueOf(coefficient.female_c)) && Intrinsics.areEqual((Object) Double.valueOf(this.male_a), (Object) Double.valueOf(coefficient.male_a)) && Intrinsics.areEqual((Object) Double.valueOf(this.male_b), (Object) Double.valueOf(coefficient.male_b)) && Intrinsics.areEqual((Object) Double.valueOf(this.male_c), (Object) Double.valueOf(coefficient.male_c));
    }

    public final double getFemale_a() {
        return this.female_a;
    }

    public final double getFemale_b() {
        return this.female_b;
    }

    public final double getFemale_c() {
        return this.female_c;
    }

    public final double getMale_a() {
        return this.male_a;
    }

    public final double getMale_b() {
        return this.male_b;
    }

    public final double getMale_c() {
        return this.male_c;
    }

    public int hashCode() {
        return (((((((((dz.a(this.female_a) * 31) + dz.a(this.female_b)) * 31) + dz.a(this.female_c)) * 31) + dz.a(this.male_a)) * 31) + dz.a(this.male_b)) * 31) + dz.a(this.male_c);
    }

    @NotNull
    public String toString() {
        return "Coefficient(female_a=" + this.female_a + ", female_b=" + this.female_b + ", female_c=" + this.female_c + ", male_a=" + this.male_a + ", male_b=" + this.male_b + ", male_c=" + this.male_c + ")";
    }
}
