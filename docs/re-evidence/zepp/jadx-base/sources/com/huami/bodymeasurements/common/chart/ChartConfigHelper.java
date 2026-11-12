package com.huami.bodymeasurements.common.chart;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.analytics.DbUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u000eJB\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0006R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006("}, d2 = {"Lcom/huami/bodymeasurements/common/chart/ChartConfigHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "start", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "b", GoogleApiAvailabilityLight.a, "c", "e", "Landroid/view/ViewGroup;", "chartParent", "", "a", "startDate", "", "dateMode", "getXAxisData", "getChartWidth", "Lcom/huami/chart/provider/DrawConfig;", "createDrawConfig", "noDataStringRes", "Lcom/huami/chart/style/NoDataStyle;", "createNoDataStyle", "axisStyle", "", "hasData", "", "zeroX", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "yAxisData", "Lcom/huami/chart/style/AxisStyle;", "createAxisStyle", LogUtil.I, "DAY_XAxisData_COUNT", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class ChartConfigHelper {

    @NotNull
    public static final ChartConfigHelper INSTANCE = new ChartConfigHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int DAY_XAxisData_COUNT = 5;

    private ChartConfigHelper() {
    }

    private final int a(ViewGroup chartParent) {
        Context context = chartParent.getContext();
        int height = chartParent.getHeight();
        return height == 0 ? (int) ChartUtil.dp2px(context, 180.0f) : height;
    }

    private final SparseArray<XAxisData> b(Context context, Date start) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (context == null) {
            return sparseArray;
        }
        long jLongValue = TimeUtils.INSTANCE.getTimeRangeByDateMode(start.getTime(), "day").getFirst().longValue();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3 = i * 21600;
            if (i == 4) {
                i3 -= 60;
            }
            sparseArray.put(i3, new XAxisData(i3, TimeFormatUtils.INSTANCE.formatTimeHHmm(context, ((long) (i3 * 1000)) + jLongValue)));
            if (i2 >= 5) {
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<XAxisData> c(Context context, Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (context == null) {
            return sparseArray;
        }
        calendar.set(5, 1);
        TimeFormatUtils timeFormatUtils = TimeFormatUtils.INSTANCE;
        sparseArray.put(1, new XAxisData(1, timeFormatUtils.formatTimeMD(context, calendar.getTimeInMillis())));
        calendar.set(5, 10);
        sparseArray.put(10, new XAxisData(10, timeFormatUtils.formatTimeMD(context, calendar.getTimeInMillis())));
        calendar.set(5, 20);
        sparseArray.put(20, new XAxisData(20, timeFormatUtils.formatTimeMD(context, calendar.getTimeInMillis())));
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, actualMaximum);
        sparseArray.put(actualMaximum, new XAxisData(actualMaximum, timeFormatUtils.formatTimeMD(context, calendar.getTimeInMillis())));
        return sparseArray;
    }

    private final SparseArray<XAxisData> d(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            calendar.set(7, i2 % 7);
            sparseArray.put(i, new XAxisData(i, calendar.getDisplayName(7, 1, Locale.getDefault())));
            if (i2 > 7) {
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<XAxisData> e(Date start) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        int maximum = calendar.getMaximum(2);
        int i = 1;
        int i2 = maximum + 1;
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (1 <= i2) {
            while (true) {
                int i3 = i + 1;
                sparseArray.put(i, new XAxisData(i, String.valueOf(i)));
                if (i == i2) {
                    break;
                }
                i = i3;
            }
        }
        return sparseArray;
    }

    public static /* synthetic */ SparseArray getXAxisData$default(ChartConfigHelper chartConfigHelper, Date date, String str, Context context, int i, Object obj) {
        if ((i & 4) != 0) {
            context = null;
        }
        return chartConfigHelper.getXAxisData(date, str, context);
    }

    @NotNull
    public final AxisStyle createAxisStyle(@NotNull Context context, int axisStyle, boolean hasData, float zeroX, @NotNull SparseArray<XAxisData> xAxisData, @NotNull SparseArray<YAxisData> yAxisData) {
        return new AxisStyle.Builder(context).setAxisStyle(axisStyle).setZeroX(zeroX).setZeroY(ChartUtil.dp2px(context, 20.0f)).setLabelCenter(true).setXLabelColor(Color.parseColor("#B2B2B2")).setXAxisLineColor(hasData ? 0 : Color.parseColor("#F2F2F2")).setXLabelSize(ChartUtil.sp2px(context, 12.0f)).setXAxisData(xAxisData).setYLabelColor(Color.parseColor("#B2B2B2")).setYAxisLineColor(0).setYLabelSize(ChartUtil.sp2px(context, 11.0f)).setXLabelMarginTop(ChartUtil.dp2px(context, 5.0f)).setXAxisMarginLeft(ChartUtil.dp2px(context, 15.0f)).setXAxisMarginRight(ChartUtil.dp2px(context, 60.0f)).setYAxisData(yAxisData).create();
    }

    @NotNull
    public final DrawConfig createDrawConfig(@NotNull ViewGroup chartParent) {
        Context context = chartParent.getContext();
        return new DrawConfig.Builder(context).setCanvasHeight(a(chartParent)).setCanvasWidth(getChartWidth(chartParent)).setDataMarginTop(ChartUtil.dp2px(context, 15.0f)).setDataMarginLeft(ChartUtil.dp2px(context, 30.0f)).setDataMarginRight(ChartUtil.dp2px(context, 80.0f)).setDataMarginBottom(ChartUtil.dp2px(context, 20.0f)).setDataWidth(ChartUtil.dp2px(context, 6.0f)).create();
    }

    @NotNull
    public final NoDataStyle createNoDataStyle(@NotNull Context context, @StringRes int noDataStringRes) {
        return new NoDataStyle.Builder(context).setNoDataStyle(2).setNoDataLabel(context.getString(noDataStringRes)).setNoDataLabelColor(Color.parseColor("#B2B2B2")).setNoDataLabelSize(ChartUtil.sp2px(context, 12.0f)).create();
    }

    public final int getChartWidth(@NotNull ViewGroup chartParent) {
        Context context = chartParent.getContext();
        int width = chartParent.getWidth();
        return width == 0 ? context.getResources().getDisplayMetrics().widthPixels : width;
    }

    @NotNull
    public final SparseArray<XAxisData> getXAxisData(@NotNull Date startDate, @NotNull String dateMode, @Nullable Context context) {
        int iHashCode = dateMode.hashCode();
        if (iHashCode != 99228) {
            if (iHashCode != 3645428) {
                if (iHashCode == 104080000 && dateMode.equals("month")) {
                    return c(context, startDate);
                }
            } else if (dateMode.equals("week")) {
                return d(startDate);
            }
        } else if (dateMode.equals("day")) {
            return b(context, startDate);
        }
        return e(startDate);
    }
}
