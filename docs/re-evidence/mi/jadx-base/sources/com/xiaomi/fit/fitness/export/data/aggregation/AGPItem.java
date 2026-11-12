package com.xiaomi.fit.fitness.export.data.aggregation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "", "tenValue", "", "twentyFiveValue", "fiftyValue", "seventyFiveValue", "ninetyValue", "<init>", "(FFFFF)V", "getTenValue", "()F", "setTenValue", "(F)V", "getTwentyFiveValue", "setTwentyFiveValue", "getFiftyValue", "setFiftyValue", "getSeventyFiveValue", "setSeventyFiveValue", "getNinetyValue", "setNinetyValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AGPItem {
    private float fiftyValue;
    private float ninetyValue;
    private float seventyFiveValue;
    private float tenValue;
    private float twentyFiveValue;

    public AGPItem() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ AGPItem copy$default(AGPItem aGPItem, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = aGPItem.tenValue;
        }
        if ((i & 2) != 0) {
            f2 = aGPItem.twentyFiveValue;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = aGPItem.fiftyValue;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = aGPItem.seventyFiveValue;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            f5 = aGPItem.ninetyValue;
        }
        return aGPItem.copy(f, f6, f7, f8, f5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getTenValue() {
        return this.tenValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTwentyFiveValue() {
        return this.twentyFiveValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFiftyValue() {
        return this.fiftyValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getSeventyFiveValue() {
        return this.seventyFiveValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getNinetyValue() {
        return this.ninetyValue;
    }

    @NotNull
    public final AGPItem copy(float tenValue, float twentyFiveValue, float fiftyValue, float seventyFiveValue, float ninetyValue) {
        return new AGPItem(tenValue, twentyFiveValue, fiftyValue, seventyFiveValue, ninetyValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AGPItem)) {
            return false;
        }
        AGPItem aGPItem = (AGPItem) other;
        return Float.compare(this.tenValue, aGPItem.tenValue) == 0 && Float.compare(this.twentyFiveValue, aGPItem.twentyFiveValue) == 0 && Float.compare(this.fiftyValue, aGPItem.fiftyValue) == 0 && Float.compare(this.seventyFiveValue, aGPItem.seventyFiveValue) == 0 && Float.compare(this.ninetyValue, aGPItem.ninetyValue) == 0;
    }

    public final float getFiftyValue() {
        return this.fiftyValue;
    }

    public final float getNinetyValue() {
        return this.ninetyValue;
    }

    public final float getSeventyFiveValue() {
        return this.seventyFiveValue;
    }

    public final float getTenValue() {
        return this.tenValue;
    }

    public final float getTwentyFiveValue() {
        return this.twentyFiveValue;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.tenValue) * 31) + Float.hashCode(this.twentyFiveValue)) * 31) + Float.hashCode(this.fiftyValue)) * 31) + Float.hashCode(this.seventyFiveValue)) * 31) + Float.hashCode(this.ninetyValue);
    }

    public final void setFiftyValue(float f) {
        this.fiftyValue = f;
    }

    public final void setNinetyValue(float f) {
        this.ninetyValue = f;
    }

    public final void setSeventyFiveValue(float f) {
        this.seventyFiveValue = f;
    }

    public final void setTenValue(float f) {
        this.tenValue = f;
    }

    public final void setTwentyFiveValue(float f) {
        this.twentyFiveValue = f;
    }

    @NotNull
    public String toString() {
        return "AGPItem(tenValue=" + this.tenValue + ", twentyFiveValue=" + this.twentyFiveValue + ", fiftyValue=" + this.fiftyValue + ", seventyFiveValue=" + this.seventyFiveValue + ", ninetyValue=" + this.ninetyValue + ")";
    }

    public AGPItem(float f, float f2, float f3, float f4, float f5) {
        this.tenValue = f;
        this.twentyFiveValue = f2;
        this.fiftyValue = f3;
        this.seventyFiveValue = f4;
        this.ninetyValue = f5;
    }

    public /* synthetic */ AGPItem(float f, float f2, float f3, float f4, float f5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5);
    }
}
