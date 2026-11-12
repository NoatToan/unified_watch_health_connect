package com.huami.bloodpressure_ui.chart;

import android.content.Context;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.DataExKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000H\u0000\u001a&\u0010\f\u001a\u00020\u000b2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0000\"\u001c\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0014\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u001c\u0010\u0017\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "style1", "style2", "checkedStyle", "", "checkStyleEnable", "Lkotlin/Pair;", "", "valuePair", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bloodpressure_ui/chart/BloodPressureValueStyleVo;", "getBpStyleValueString", "a", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "getNUM4_CHART_STYLE", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureChartTextSizeStyle;", "NUM4_CHART_STYLE", "b", "getNUM2_CHART_STYLE", "NUM2_CHART_STYLE", "c", "getDEFAULT_CHART_STYLE", "DEFAULT_CHART_STYLE", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureChartTextSizeStyleKt {

    @NotNull
    private static final BloodPressureChartTextSizeStyle a = new BloodPressureChartTextSizeStyle(R.style.Rainbow_TextAppearance_Number4);

    @NotNull
    private static final BloodPressureChartTextSizeStyle b;

    @NotNull
    private static final BloodPressureChartTextSizeStyle c;

    static {
        BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle = new BloodPressureChartTextSizeStyle(R.style.Rainbow_TextAppearance_Number2);
        b = bloodPressureChartTextSizeStyle;
        c = bloodPressureChartTextSizeStyle;
    }

    public static final boolean checkStyleEnable(@NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, @NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle2, @NotNull BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle3) {
        return Intrinsics.areEqual(bloodPressureChartTextSizeStyle, bloodPressureChartTextSizeStyle3) && Intrinsics.areEqual(bloodPressureChartTextSizeStyle2, bloodPressureChartTextSizeStyle3);
    }

    public static /* synthetic */ boolean checkStyleEnable$default(BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle, BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle2, BloodPressureChartTextSizeStyle bloodPressureChartTextSizeStyle3, int i, Object obj) {
        if ((i & 4) != 0) {
            bloodPressureChartTextSizeStyle3 = a;
        }
        return checkStyleEnable(bloodPressureChartTextSizeStyle, bloodPressureChartTextSizeStyle2, bloodPressureChartTextSizeStyle3);
    }

    @NotNull
    public static final BloodPressureValueStyleVo getBpStyleValueString(@Nullable Pair<? extends Number, ? extends Number> pair, @NotNull Context context) {
        if (pair == null) {
            return new BloodPressureValueStyleVo(context.getString(R.string.blood_pressure_empty), b);
        }
        return Intrinsics.areEqual(pair.getFirst(), pair.getSecond()) ? new BloodPressureValueStyleVo(DataExKt.formatWithDecimal((Float) pair.getFirst(), 0), b) : new BloodPressureValueStyleVo(context.getString(R.string.blood_pressure_value_range, DataExKt.formatWithDecimal((Float) pair.getFirst(), 0), DataExKt.formatWithDecimal((Float) pair.getSecond(), 0)), a);
    }

    @NotNull
    public static final BloodPressureChartTextSizeStyle getDEFAULT_CHART_STYLE() {
        return c;
    }

    @NotNull
    public static final BloodPressureChartTextSizeStyle getNUM2_CHART_STYLE() {
        return b;
    }

    @NotNull
    public static final BloodPressureChartTextSizeStyle getNUM4_CHART_STYLE() {
        return a;
    }
}
