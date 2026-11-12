package com.huami.pai.ui.detail;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.GoalLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.pai.ext.I18nKt;
import com.huami.pai.lib.R;
import com.huami.pai.vo.ChartDataVo;
import com.huami.pai.vo.ChartPointVo;
import com.huami.pai.vo.RangeIndexVo;
import com.huami.tools.analytics.DbUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/pai/ui/detail/ChartHelper;", "", "", "hasNoPoints", "", "minValue", "maxValue", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "a", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/pai/vo/ChartDataVo;", "chartDataVo", "", "refreshChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", LogUtil.I, "s3Color", "c", "s25Color", "Lcom/huami/chart/chart/ChartProvider;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "<init>", "(Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int s3Color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int s25Color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider chartProvider;

    public ChartHelper(@NotNull Context context) {
        this.context = context;
        this.s3Color = ContextCompat.getColor(context, R.color.s3);
        this.s25Color = ContextCompat.getColor(context, R.color.s25);
        this.chartProvider = new ChartProvider(context);
    }

    private final SparseArray<YAxisData> a(boolean hasNoPoints, float minValue, float maxValue) {
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int i = 0;
        if (hasNoPoints) {
            sparseArray.put(0, new YAxisData(80.0f, "0"));
            sparseArray.put(1, new YAxisData(155.0f, "50"));
            sparseArray.put(2, new YAxisData(230.0f, "100"));
        } else {
            float f = (maxValue - minValue) / (3 - 1.0f);
            while (true) {
                int i2 = i + 1;
                BigDecimal bigDecimal = new BigDecimal((i * f) + minValue);
                bigDecimal.setScale(1, 4);
                float fFloatValue = bigDecimal.floatValue();
                sparseArray.put(i, new YAxisData(fFloatValue, I18nKt.i18nString((int) fFloatValue)));
                if (i2 >= 3) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }

    public final void refreshChart(@NotNull final ViewGroup chartParent, @NotNull final ChartDataVo chartDataVo) {
        List<ChartPointVo> points = chartDataVo.getPoints();
        List<RangeIndexVo> subIndices = chartDataVo.getSubIndices();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points, 10));
        Iterator<T> it2 = points.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((ChartPointVo) it2.next()).getValue()));
        }
        Float fM3963maxOrNull = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList);
        final float fFloatValue = fM3963maxOrNull == null ? 100.0f : fM3963maxOrNull.floatValue() + 3.0f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points, 10));
        Iterator<T> it3 = points.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((ChartPointVo) it3.next()).getValue()));
        }
        Float fM3967minOrNull = CollectionsKt___CollectionsKt.m3967minOrNull((Iterable<Float>) arrayList2);
        final float fFloatValue2 = fM3967minOrNull == null ? 0.0f : fM3967minOrNull.floatValue() - 3.0f;
        final SparseArray sparseArray = new SparseArray();
        for (ChartPointVo chartPointVo : points) {
            sparseArray.put(chartPointVo.getIndex(), new ChartData(chartPointVo.getIndex(), chartPointVo.getValue()));
        }
        final ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subIndices, 10));
        for (RangeIndexVo rangeIndexVo : subIndices) {
            arrayList3.add(new RangeIndex(rangeIndexVo.getStart(), rangeIndexVo.getEnd()));
        }
        final SparseArray<YAxisData> sparseArrayA = a(points.isEmpty(), fFloatValue2, fFloatValue);
        final ArrayList arrayList4 = new ArrayList();
        int size = sparseArrayA.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList4.add(Float.valueOf(sparseArrayA.get(sparseArrayA.keyAt(i)).getValue()));
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        final float fDp2px = ChartUtil.dp2px(this.context, 10.0f);
        final float fDp2px2 = ChartUtil.dp2px(this.context, 30.0f);
        final float fDp2px3 = ChartUtil.dp2px(this.context, 25.0f);
        final int i3 = 0;
        final int i4 = 89;
        this.chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.pai.ui.detail.ChartHelper.refreshChart.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getB() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getF() {
                ChartDataList chartDataList = new ChartDataList(sparseArray);
                int i5 = i3;
                int i6 = i4;
                float f = fFloatValue;
                float f2 = fFloatValue2;
                chartDataList.setStart(i5);
                chartDataList.setEnd(i6);
                chartDataList.setMaxValue(f);
                chartDataList.setMinValue(f2);
                return chartDataList;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return new DrawConfig.Builder(ChartHelper.this.context).setCanvasWidth(chartParent.getMeasuredWidth()).setCanvasHeight(chartParent.getMeasuredHeight()).setDataWidth(ChartUtil.dp2px(ChartHelper.this.context, 5.0f)).setDataMarginTop(ChartUtil.dp2px(ChartHelper.this.context, 20.0f)).setDataMarginLeft(fDp2px).setDataMarginRight(fDp2px2).setDataMarginBottom(fDp2px3).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setAxisStyle(new AxisStyle.Builder(ChartHelper.this.context).setAxisStyle(136).setLabelCenter(true).setZeroX(chartParent.getWidth()).setZeroY(fDp2px3).setYAxisData(sparseArrayA).setYLabelColor(ChartHelper.this.s3Color).setYLabelSize(ChartUtil.sp2px(ChartHelper.this.context, 10.6f)).setYAxisMarginBottom(fDp2px3).setYLabelMarginYAxis(ChartUtil.dp2px(ChartHelper.this.context, 2.0f)).create()).setLineStyle(new LineStyle.Builder(ChartHelper.this.context).setLineStyle(2).setLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 2.0f)).setLineColor(ChartHelper.this.s25Color).setSubIndex(new ArrayList<>(arrayList3)).setSubLinePathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f)).setSubLinecolor(-1).create()).setLineJoinStyle(new LineJoinStyle.Builder(ChartHelper.this.context).setLineJointStyle(8).setLineJointSize(ChartUtil.dp2px(ChartHelper.this.context, 2.0f)).setLineJointColor(ChartHelper.this.s25Color).setDrawSpecificIndices(true).setIndices(CollectionsKt___CollectionsKt.toHashSet(chartDataVo.getJoinerIndices())).create()).setGoalLineStyle(new GoalLineStyle.Builder(ChartHelper.this.context).setGoals(CollectionsKt___CollectionsKt.toFloatArray(arrayList4)).setGoalLineStyle(2).setDashLineInterval(new float[]{12.0f, 7.0f}).setGoalLineColor(new int[]{ChartHelper.this.s3Color}).setGoalLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 0.5f)).setGoalLineMarginStart(fDp2px).setGoalLineMarginEnd(fDp2px2).create()).create();
            }
        }, false, false, false);
    }
}
