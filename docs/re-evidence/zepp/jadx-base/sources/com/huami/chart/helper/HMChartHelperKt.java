package com.huami.chart.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.timepicker.TimeModel;
import com.huami.chart.R;
import com.huami.chart.chart.HMShimmerLineChart;
import com.huami.chart.util.ShimmerHelperKt;
import com.huami.tools.analytics.DbUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a$\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u0007\u001a\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0001H\u0000\"\u0017\u0010\u0019\u001a\u00020\u0003*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u00020\u0003*\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a\"\u0017\u0010\u001c\u001a\u00020\u0003*\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/chart/chart/HMShimmerLineChart;", "", "shimmerRes", "", "shimmerWidth", "shimmerHeight", "", "defaultConfig", "min", "max", "uniform", "", "buildYAxis", "maxY", "getRoundUpTen", "getRoundDownTen", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "colorRes", "percent", "getResColor", "", "i18n", "getDpToPx", "(I)F", "dpToPx", "(F)F", "getSpToPx", "spToPx", "chart_release"}, k = 2, mv = {1, 5, 1})
public final class HMChartHelperKt {
    @NotNull
    public static final float[] buildYAxis(float f, float f2, int i) {
        float roundDownTen = getRoundDownTen(f);
        float roundUpTen = getRoundUpTen(f2);
        float f3 = (roundUpTen - roundDownTen) / i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(roundDownTen));
        int i2 = 1;
        if (1 < i) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(Float.valueOf((i2 * f3) + roundDownTen));
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        arrayList.add(Float.valueOf(roundUpTen));
        return CollectionsKt___CollectionsKt.toFloatArray(arrayList);
    }

    public static /* synthetic */ float[] buildYAxis$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        return buildYAxis(f, f2, i);
    }

    public static final void defaultConfig(@NotNull HMShimmerLineChart hMShimmerLineChart, @DrawableRes int i, float f, float f2) {
        hMShimmerLineChart.setLineColor(Color.parseColor("#7f7f7f"));
        hMShimmerLineChart.setDisconnectLineGap(1);
        hMShimmerLineChart.setGapDashPathEffect(new DashPathEffect(new float[]{8.0f, 10.0f, 8.0f, 10.0f}, 0.0f));
        hMShimmerLineChart.setLineWidth(getDpToPx(1.5f));
        hMShimmerLineChart.setPointRadius(getDpToPx(4.0f));
        hMShimmerLineChart.setPointColor(Color.parseColor("#7f7f7f"));
        hMShimmerLineChart.setShimmerBg(ShimmerHelperKt.changeShimmerBgBitmapSize(hMShimmerLineChart.getContext(), i, f, f2));
        hMShimmerLineChart.setWaveColor(getResColor(hMShimmerLineChart.getContext(), R.color.s5, 0.7f));
    }

    public static final float getDpToPx(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    @JvmOverloads
    public static final int getResColor(@NotNull Context context, @ColorRes int i) {
        return getResColor$default(context, i, 0.0f, 4, null);
    }

    @JvmOverloads
    public static final int getResColor(@NotNull Context context, @ColorRes int i, float f) {
        return ColorUtils.setAlphaComponent(ContextCompat.getColor(context, i), (int) (f * 255));
    }

    public static /* synthetic */ int getResColor$default(Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        return getResColor(context, i, f);
    }

    public static final float getRoundDownTen(float f) {
        double d = 100;
        return (float) (BigDecimal.valueOf(((double) f) / d).setScale(1, 3).doubleValue() * d);
    }

    public static final float getRoundUpTen(float f) {
        double d = 100;
        return (float) (BigDecimal.valueOf(((double) f) / d).setScale(1, 0).doubleValue() * d);
    }

    public static final float getSpToPx(int i) {
        return TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public static final String i18n(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static final float getDpToPx(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }
}
