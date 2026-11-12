package com.huami.bloodoxygen.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.huami.bloodoxygen.ui.R;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J:\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fJ\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/ui/utils/ChartStyleProvider;", "", "", "b", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/chart/style/NoDataStyle;", "createNoDataStyle", "Lcom/huami/chart/style/InteractiveLineStyle;", "createInteractiveLineStyle", "", "hasData", "zeroX", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "yAxisData", "Lcom/huami/chart/style/AxisStyle;", "createAxisStyle", "Lcom/huami/chart/provider/DrawConfig;", "createDrawConfig", "getChartWidth", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartStyleProvider {

    @NotNull
    public static final ChartStyleProvider INSTANCE = new ChartStyleProvider();

    private ChartStyleProvider() {
    }

    private final float a(int i) {
        return TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    private final float b() {
        return a(188);
    }

    @NotNull
    public final AxisStyle createAxisStyle(@NotNull Context context, boolean hasData, float zeroX, @NotNull SparseArray<XAxisData> xAxisData, @NotNull SparseArray<YAxisData> yAxisData) {
        boolean zIsRtl$ui_release = ChartDataHelper.INSTANCE.isRtl$ui_release();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(12.0f);
        float fMeasureText = textPaint.measureText(yAxisData.get(yAxisData.keyAt(yAxisData.size() - 1)).getTitle()) + a(40);
        float dimension = context.getResources().getDimension(R.dimen.bo_ui_size_50dp);
        if (fMeasureText < dimension) {
            fMeasureText = dimension;
        }
        AxisStyle.Builder xLabelSize = new AxisStyle.Builder(context).setAxisStyle(16550).setBottomIndicatorShape(hasData ? 10 : 9).setBottomIndicatorCircleRadius(a(10)).setXLabelSupportAnimation(true).setInteractiveUpCancel(false).setXMovableLabelMarginTop(a(18)).setBottomIndicatorTintColor(ContextCompat.getColor(context, R.color.s5)).setBottomIndicatorBackgroundMarginTop(a(4)).setBottomIndicatorShapeMarginTop(a(4)).setBottomIndicatorBackgroundHeight(a(12)).setBottomIndicatorBackgroundColor(ContextCompat.getColor(context, R.color.s10)).setBottomIndicatorShadow().setLabelCenter(true).setXLabelColor(ContextCompat.getColor(context, R.color.s2)).setXLabelSize(12.0f);
        if (zIsRtl$ui_release) {
            zeroX = 100.0f;
        }
        AxisStyle.Builder xAxisLineColor = xLabelSize.setZeroX(zeroX).setXAxisLineColor(0);
        Resources resources = context.getResources();
        int i = R.dimen.bo_ui_size_12sp;
        AxisStyle.Builder xAxisMarginLeft = xAxisLineColor.setXLabelSize(resources.getDimension(i)).setXAxisData(xAxisData).setYLabelColor(ContextCompat.getColor(context, R.color.s3)).setYAxisLineColor(0).setYLabelSize(context.getResources().getDimension(i)).setXLabelMarginTop(context.getResources().getDimension(R.dimen.bo_ui_size_5dp)).setYAxisScaleLineColor(ContextCompat.getColor(context, R.color.s4)).setXAxisMarginLeft(zIsRtl$ui_release ? 110.0f : context.getResources().getDimension(R.dimen.bo_ui_size_15dp));
        if (zIsRtl$ui_release) {
            fMeasureText = context.getResources().getDimension(R.dimen.bo_ui_size_20dp);
        }
        return xAxisMarginLeft.setXAxisMarginRight(fMeasureText).setYAxisData(yAxisData).create();
    }

    @NotNull
    public final DrawConfig createDrawConfig(@NotNull Context context) {
        boolean zIsRtl$ui_release = ChartDataHelper.INSTANCE.isRtl$ui_release();
        return new DrawConfig.Builder(context).setCanvasHeight(b()).setCanvasWidth(getChartWidth(context)).setDataMarginTop(ChartUtil.dp2px(context, 15.0f)).setDataMarginLeft(ChartUtil.dp2px(context, zIsRtl$ui_release ? 60.0f : 30.0f)).setDataMarginRight(ChartUtil.dp2px(context, zIsRtl$ui_release ? 30.0f : 60.0f)).setDataMarginBottom(ChartUtil.dp2px(context, 20.0f)).setDataWidth(context.getResources().getDimension(R.dimen.bo_ui_size_6dp)).create();
    }

    @NotNull
    public final InteractiveLineStyle createInteractiveLineStyle(@NotNull Context context) {
        return new InteractiveLineStyle.Builder(context).setInteractiveLineStyle(16).setInteractiveUpCancel(false).setVerticalLineColor(ContextCompat.getColor(context, R.color.s3)).setVerticalLineWidth(ChartUtil.dp2px(context, 1.0f)).setShowVerticalLineOnlyInRange(true).create();
    }

    @NotNull
    public final NoDataStyle createNoDataStyle(@NotNull Context context) {
        return new NoDataStyle.Builder(context).setNoDataStyle(2).setNoDataLabel(context.getString(R.string.bo_ui_no_data)).setNoDataLabelColor(ContextCompat.getColor(context, R.color.s1)).setNoDataLabelSize(context.getResources().getDimension(R.dimen.bo_ui_size_14sp)).setLabelCenterInCanvas(true).create();
    }

    public final int getChartWidth(@NotNull Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
