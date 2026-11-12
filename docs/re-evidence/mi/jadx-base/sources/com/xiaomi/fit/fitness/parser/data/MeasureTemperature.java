package com.xiaomi.fit.fitness.parser.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/MeasureTemperature;", "", "skinTemp", "", "bodyTemp", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getSkinTemp", "()Ljava/lang/Float;", "setSkinTemp", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getBodyTemp", "setBodyTemp", "toString", "", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fit/fitness/parser/data/MeasureTemperature;", "equals", "", "other", "hashCode", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeasureTemperature {

    @Nullable
    private Float bodyTemp;

    @Nullable
    private Float skinTemp;

    /* JADX WARN: Multi-variable type inference failed */
    public MeasureTemperature() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MeasureTemperature copy$default(MeasureTemperature measureTemperature, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = measureTemperature.skinTemp;
        }
        if ((i & 2) != 0) {
            f2 = measureTemperature.bodyTemp;
        }
        return measureTemperature.copy(f, f2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getSkinTemp() {
        return this.skinTemp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getBodyTemp() {
        return this.bodyTemp;
    }

    @NotNull
    public final MeasureTemperature copy(@Nullable Float skinTemp, @Nullable Float bodyTemp) {
        return new MeasureTemperature(skinTemp, bodyTemp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureTemperature)) {
            return false;
        }
        MeasureTemperature measureTemperature = (MeasureTemperature) other;
        return Intrinsics.areEqual((Object) this.skinTemp, (Object) measureTemperature.skinTemp) && Intrinsics.areEqual((Object) this.bodyTemp, (Object) measureTemperature.bodyTemp);
    }

    @Nullable
    public final Float getBodyTemp() {
        return this.bodyTemp;
    }

    @Nullable
    public final Float getSkinTemp() {
        return this.skinTemp;
    }

    public int hashCode() {
        Float f = this.skinTemp;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.bodyTemp;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final void setBodyTemp(@Nullable Float f) {
        this.bodyTemp = f;
    }

    public final void setSkinTemp(@Nullable Float f) {
        this.skinTemp = f;
    }

    @NotNull
    public String toString() {
        return "skinTemp = " + this.skinTemp + ", bodyTemp = " + this.bodyTemp;
    }

    public MeasureTemperature(@Nullable Float f, @Nullable Float f2) {
        this.skinTemp = f;
        this.bodyTemp = f2;
    }

    public /* synthetic */ MeasureTemperature(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }
}
