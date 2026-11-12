package com.huami.bloodpressure_ui.chart;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartInfoStyle;", "", "component1", "textSizeStyle", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTextSizeStyle", "()I", "<init>", "(I)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureChartTextSizeStyle extends BloodPressureChartInfoStyle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int textSizeStyle;

    public BloodPressureChartTextSizeStyle(int i) {
        super(null);
        this.textSizeStyle = i;
    }

    public static /* synthetic */ BloodPressureChartTextSizeStyle copy$default(BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bloodPressureChartTextSizeStyle.textSizeStyle;
        }
        return bloodPressureChartTextSizeStyle.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTextSizeStyle() {
        return this.textSizeStyle;
    }

    @NotNull
    public final BloodPressureChartTextSizeStyle copy(int textSizeStyle) {
        return new BloodPressureChartTextSizeStyle(textSizeStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BloodPressureChartTextSizeStyle) && this.textSizeStyle == ((BloodPressureChartTextSizeStyle) other).textSizeStyle;
    }

    public final int getTextSizeStyle() {
        return this.textSizeStyle;
    }

    public int hashCode() {
        return this.textSizeStyle;
    }

    @NotNull
    public String toString() {
        return "BloodPressureChartTextSizeStyle(textSizeStyle=" + this.textSizeStyle + ")";
    }
}
