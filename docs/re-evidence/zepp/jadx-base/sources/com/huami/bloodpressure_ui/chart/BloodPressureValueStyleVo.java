package com.huami.bloodpressure_ui.chart;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;", "", "", "component1", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "component2", "value", "textStyle", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "getTextStyle", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "<init>", "(Ljava/lang/String;Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureValueStyleVo {

    @NotNull
    private final BloodPressureChartTextSizeStyle textStyle;

    @NotNull
    private final String value;

    public BloodPressureValueStyleVo(@NotNull String str, @NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle) {
        this.value = str;
        this.textStyle = bloodPressureChartTextSizeStyle;
    }

    public static /* synthetic */ BloodPressureValueStyleVo copy$default(BloodPressureValueStyleVo bloodPressureValueStyleVo, String str, BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureValueStyleVo.value;
        }
        if ((i & 2) != 0) {
            bloodPressureChartTextSizeStyle = bloodPressureValueStyleVo.textStyle;
        }
        return bloodPressureValueStyleVo.copy(str, bloodPressureChartTextSizeStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodPressureChartTextSizeStyle getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final BloodPressureValueStyleVo copy(@NotNull String value, @NotNull BloodPressureChartTextSizeStyle textStyle) {
        return new BloodPressureValueStyleVo(value, textStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureValueStyleVo)) {
            return false;
        }
        BloodPressureValueStyleVo bloodPressureValueStyleVo = (BloodPressureValueStyleVo) other;
        return Intrinsics.areEqual(this.value, bloodPressureValueStyleVo.value) && Intrinsics.areEqual(this.textStyle, bloodPressureValueStyleVo.textStyle);
    }

    @NotNull
    public final BloodPressureChartTextSizeStyle getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.textStyle.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureValueStyleVo(value=" + this.value + ", textStyle=" + this.textStyle + ")";
    }
}
