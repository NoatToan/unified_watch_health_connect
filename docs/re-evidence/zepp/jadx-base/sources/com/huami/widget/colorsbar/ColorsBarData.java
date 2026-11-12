package com.huami.widget.colorsbar;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J3\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/widget/colorsbar/ColorsBarData;", "", "", "", "component1", "component2", "component3", "rangeValues", "rangeColors", "value", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getRangeValues", "()Ljava/util/List;", "setRangeValues", "(Ljava/util/List;)V", "b", "getRangeColors", "c", LogUtil.I, "getValue", "()I", "setValue", "(I)V", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "colorsbar_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ColorsBarData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private List<Integer> rangeValues;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Integer> rangeColors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int value;

    public ColorsBarData(@NotNull List<Integer> list, @NotNull List<Integer> list2, int i) {
        this.rangeValues = list;
        this.rangeColors = list2;
        this.value = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorsBarData copy$default(ColorsBarData colorsBarData, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = colorsBarData.rangeValues;
        }
        if ((i2 & 2) != 0) {
            list2 = colorsBarData.rangeColors;
        }
        if ((i2 & 4) != 0) {
            i = colorsBarData.value;
        }
        return colorsBarData.copy(list, list2, i);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.rangeValues;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.rangeColors;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final ColorsBarData copy(@NotNull List<Integer> rangeValues, @NotNull List<Integer> rangeColors, int value) {
        return new ColorsBarData(rangeValues, rangeColors, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorsBarData)) {
            return false;
        }
        ColorsBarData colorsBarData = (ColorsBarData) other;
        return Intrinsics.areEqual(this.rangeValues, colorsBarData.rangeValues) && Intrinsics.areEqual(this.rangeColors, colorsBarData.rangeColors) && this.value == colorsBarData.value;
    }

    @NotNull
    public final List<Integer> getRangeColors() {
        return this.rangeColors;
    }

    @NotNull
    public final List<Integer> getRangeValues() {
        return this.rangeValues;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        List<Integer> list = this.rangeValues;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.rangeColors;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.value;
    }

    public final void setRangeValues(@NotNull List<Integer> list) {
        this.rangeValues = list;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "ColorsBarData(rangeValues=" + this.rangeValues + ", rangeColors=" + this.rangeColors + ", value=" + this.value + ")";
    }
}
