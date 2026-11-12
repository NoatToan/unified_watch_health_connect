package com.huami.heartrate.chart;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/chart/ShowValue;", "", "", "component1", "component2", "component3", "maxHR", "minHR", "averageValidValue", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMaxHR", "()I", "b", "getMinHR", "c", "getAverageValidValue", "<init>", "(III)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShowValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int maxHR;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int minHR;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int averageValidValue;

    public ShowValue() {
        this(0, 0, 0, 7, null);
    }

    public ShowValue(int i, int i2, int i3) {
        this.maxHR = i;
        this.minHR = i2;
        this.averageValidValue = i3;
    }

    public static /* synthetic */ ShowValue copy$default(ShowValue showValue, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = showValue.maxHR;
        }
        if ((i4 & 2) != 0) {
            i2 = showValue.minHR;
        }
        if ((i4 & 4) != 0) {
            i3 = showValue.averageValidValue;
        }
        return showValue.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxHR() {
        return this.maxHR;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinHR() {
        return this.minHR;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAverageValidValue() {
        return this.averageValidValue;
    }

    @NotNull
    public final ShowValue copy(int maxHR, int minHR, int averageValidValue) {
        return new ShowValue(maxHR, minHR, averageValidValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowValue)) {
            return false;
        }
        ShowValue showValue = (ShowValue) other;
        return this.maxHR == showValue.maxHR && this.minHR == showValue.minHR && this.averageValidValue == showValue.averageValidValue;
    }

    public final int getAverageValidValue() {
        return this.averageValidValue;
    }

    public final int getMaxHR() {
        return this.maxHR;
    }

    public final int getMinHR() {
        return this.minHR;
    }

    public int hashCode() {
        return (((this.maxHR * 31) + this.minHR) * 31) + this.averageValidValue;
    }

    @NotNull
    public String toString() {
        return "ShowValue(maxHR=" + this.maxHR + ", minHR=" + this.minHR + ", averageValidValue=" + this.averageValidValue + ")";
    }

    public /* synthetic */ ShowValue(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
