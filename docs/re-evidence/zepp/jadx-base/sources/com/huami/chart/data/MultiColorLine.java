package com.huami.chart.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/chart/data/MultiColorLine;", "", "other", "", "compareTo", "", "component1", "component2", "yFloatArray", "lineColor", "copy", "", "toString", "hashCode", "", "", "equals", "a", "[F", "getYFloatArray", "()[F", "b", LogUtil.I, "getLineColor", "()I", "<init>", "([FI)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MultiColorLine implements Comparable<MultiColorLine> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final float[] yFloatArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int lineColor;

    public MultiColorLine(@NotNull float[] fArr, int i) {
        this.yFloatArray = fArr;
        this.lineColor = i;
    }

    public static /* synthetic */ MultiColorLine copy$default(MultiColorLine multiColorLine, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = multiColorLine.yFloatArray;
        }
        if ((i2 & 2) != 0) {
            i = multiColorLine.lineColor;
        }
        return multiColorLine.copy(fArr, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float[] getYFloatArray() {
        return this.yFloatArray;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLineColor() {
        return this.lineColor;
    }

    @NotNull
    public final MultiColorLine copy(@NotNull float[] yFloatArray, int lineColor) {
        return new MultiColorLine(yFloatArray, lineColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiColorLine)) {
            return false;
        }
        MultiColorLine multiColorLine = (MultiColorLine) other;
        return Intrinsics.areEqual(this.yFloatArray, multiColorLine.yFloatArray) && this.lineColor == multiColorLine.lineColor;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    @NotNull
    public final float[] getYFloatArray() {
        return this.yFloatArray;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.yFloatArray) * 31) + this.lineColor;
    }

    @NotNull
    public String toString() {
        return "MultiColorLine(yFloatArray=" + Arrays.toString(this.yFloatArray) + ", lineColor=" + this.lineColor + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull MultiColorLine other) {
        float[] fArr = this.yFloatArray;
        float f = fArr[0];
        float[] fArr2 = other.yFloatArray;
        if (f == fArr2[0]) {
            return 0;
        }
        return ((int) fArr[0]) - ((int) fArr2[0]);
    }
}
