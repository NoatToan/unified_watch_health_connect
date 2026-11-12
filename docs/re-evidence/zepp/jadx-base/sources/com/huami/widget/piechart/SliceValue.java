package com.huami.widget.piechart;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/widget/piechart/SliceValue;", "", "", "component1", "", "component2", "value", "color", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getValue", "()F", "b", LogUtil.I, "getColor", "()I", "<init>", "(FI)V", "piechart_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SliceValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int color;

    public SliceValue(float f, int i) {
        this.value = f;
        this.color = i;
    }

    public static /* synthetic */ SliceValue copy$default(SliceValue sliceValue, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = sliceValue.value;
        }
        if ((i2 & 2) != 0) {
            i = sliceValue.color;
        }
        return sliceValue.copy(f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final SliceValue copy(float value, int color) {
        return new SliceValue(value, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliceValue)) {
            return false;
        }
        SliceValue sliceValue = (SliceValue) other;
        return Float.compare(this.value, sliceValue.value) == 0 && this.color == sliceValue.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.value) * 31) + this.color;
    }

    @NotNull
    public String toString() {
        return "SliceValue(value=" + this.value + ", color=" + this.color + ")";
    }
}
