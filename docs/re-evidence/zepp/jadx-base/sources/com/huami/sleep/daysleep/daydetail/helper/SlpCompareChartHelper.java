package com.huami.sleep.daysleep.daydetail.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.XAxisData;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.SleepTimeUtilKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/helper/SlpCompareChartHelper;", "", "Landroid/view/ViewGroup;", "content", "", "size", "Lcom/huami/chart/provider/DrawConfig;", "b", "", "isIntoSlp", "position", "", "currTime", "Lcom/huami/chart/provider/RenderConfig;", "c", "(ZILjava/lang/Float;I)Lcom/huami/chart/provider/RenderConfig;", "intoSlpTime", "chartParent", "Lcom/huami/chart/data/ChartDataList;", "data", "", "refreshIntoSlpCompareChart", "dpTime", "refreshDpSlpCompareChart", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/huami/chart/chart/ChartProvider;", "Lcom/huami/chart/chart/ChartProvider;", "mIntoSlpChartProvider", GoogleApiAvailabilityLight.a, "mDpSlpChartProvider", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SlpCompareChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ChartProvider mIntoSlpChartProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ChartProvider mDpSlpChartProvider;

    public SlpCompareChartHelper(@NotNull Context context, @Nullable Bitmap bitmap) {
        this.context = context;
        this.bitmap = bitmap;
        this.mIntoSlpChartProvider = new ChartProvider(context, true);
        this.mDpSlpChartProvider = new ChartProvider(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig b(ViewGroup content, int size) {
        return new DrawConfig.Builder(this.context).setCanvasHeight(content.getMeasuredHeight()).setCanvasWidth(content.getMeasuredWidth()).setDataWidth(content.getMeasuredWidth() / size).setDataMarginTop(ChartUtil.dp2px(this.context, 20.0f)).setDataMarginBottom(ChartUtil.dp2px(this.context, 26.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig c(boolean isIntoSlp, int position, Float currTime, int size) {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        if (isIntoSlp) {
            sparseArray.put(6, new XAxisData(6, TimeUtils.formatTime(this.context, TimeUtils.getDate(1260), true)));
            sparseArray.put(54, new XAxisData(6, TimeUtils.formatTime(this.context, TimeUtils.getDate(SleepDetailFragment.END_VALID_LABEL_TIME), true)));
            if ((6 <= position && position <= 54) && position - 6 >= 6 && 54 - position >= 6) {
                sparseArray.put(position, new XAxisData(position, currTime != null ? TimeUtils.formatTime(this.context, TimeUtils.getDate((int) currTime.floatValue()), true) : null));
            }
        } else {
            sparseArray.put(6, new XAxisData(6, SleepTimeUtilKt.formatMinToH(30)));
            sparseArray.put(54, new XAxisData(54, SleepTimeUtilKt.formatMinToH(270)));
            if ((6 <= position && position <= 54) && position - 6 >= 6 && 54 - position >= 6) {
                sparseArray.put(position, new XAxisData(position, currTime != null ? SleepTimeUtilKt.formatMinToH((int) currTime.floatValue()) : null));
            }
        }
        Context context = this.context;
        int i = R.color.s25;
        int color = ContextCompat.getColor(context, i);
        int[] iArr = {ViewExKt.addAlpha(ContextCompat.getColor(this.context, i), 0.2d), ViewExKt.addAlpha(ContextCompat.getColor(this.context, i), 0.133d), ViewExKt.addAlpha(ContextCompat.getColor(this.context, i), 0.07d), ViewExKt.addAlpha(ContextCompat.getColor(this.context, i), 0.0d)};
        ArrayList<RangeIndex> arrayList = new ArrayList<>();
        arrayList.add(new RangeIndex(0, position));
        RenderConfig.Builder valueStyle = new RenderConfig.Builder().setNoDataStyle(new NoDataStyle.Builder(this.context).create()).setLineStyle(new LineStyle.Builder(this.context).setLineColor(color).setLineWidth(ChartUtil.dp2px(this.context, 1.3f)).setLineStyle(4).setShadowColors(iArr).setShadowBeforeIndex(false).setSubIndex(arrayList).setSubLinecolor(color).setSubIndexShadowColors(CollectionsKt__CollectionsKt.arrayListOf(iArr)).create()).setValueStyle(new ValueStyle.Builder(this.context).setValueStyle(4).setBitmapTintColor(color).setValueBitmap(this.bitmap).setValueBottomMargin(ChartUtil.dp2px(this.context, 8.0f)).setValueTransformation(new IValueTransformation() { // from class: n37
            @Override // com.huami.chart.listener.IValueTransformation
            public final String onValueTrans(float f, Index index) {
                return SlpCompareChartHelper.d(f, index);
            }
        }).create());
        AxisStyle.Builder xAxisScaleLineHeight = new AxisStyle.Builder(this.context).setAxisStyle(34).setXAxisScaleLineColor(ContextCompat.getColor(this.context, R.color.s3)).setXAxisScaleLineHeight(ChartUtil.dp2px(this.context, 20.0f));
        TypefaceManager typefaceManager = TypefaceManager.get();
        Context context2 = this.context;
        Font font = Font.KM;
        return valueStyle.setAxisStyle(xAxisScaleLineHeight.setXLabelTypeface(typefaceManager.getTypeface(context2, font)).setXLabelSize(ChartUtil.dp2px(this.context, 12.0f)).setXLabelColor(ContextCompat.getColor(this.context, R.color.s2)).setZeroY(ChartUtil.dp2px(this.context, 20.0f)).setXAxisLineWidth(ChartUtil.dp2px(this.context, 1.0f)).setXAxisLineColor(ContextCompat.getColor(this.context, R.color.s4)).setXAxisData(sparseArray).setXLabelTypeface(TypefaceManager.get().getTypeface(this.context, font)).setXLabelMarginTop(ChartUtil.dp2px(this.context, 8.0f)).create()).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(float f, Index index) {
        return "";
    }

    public final void refreshDpSlpCompareChart(final int dpTime, @NotNull final ViewGroup chartParent, @NotNull final ChartDataList data) {
        final int i = dpTime / 5;
        ChartProvider chartProvider = this.mDpSlpChartProvider;
        if (chartProvider == null) {
            return;
        }
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper.refreshDpSlpCompareChart.1

            /* JADX INFO: renamed from: com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper$refreshDpSlpCompareChart$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ViewGroup a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ViewGroup viewGroup) {
                    super(0);
                    this.a = viewGroup;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "refreshDpSlpCompareChart chartParent.measuredWidth = " + this.a.getMeasuredWidth() + " - measuredHeight = " + this.a.getMeasuredHeight();
                }
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getA() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getB() {
                return data;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                return new Index(-1, new BaseIndex(i));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                HMLog.info("SlpCompareChartHelper", new a(chartParent));
                return this.b(chartParent, data.getCount());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return this.c(false, i, Float.valueOf(dpTime), data.getCount());
            }
        }, false, false);
    }

    public final void refreshIntoSlpCompareChart(final int intoSlpTime, @NotNull final ViewGroup chartParent, @NotNull final ChartDataList data) {
        final int i = (intoSlpTime - 1200) / 10;
        ChartProvider chartProvider = this.mIntoSlpChartProvider;
        if (chartProvider == null) {
            return;
        }
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper.refreshIntoSlpCompareChart.1

            /* JADX INFO: renamed from: com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper$refreshIntoSlpCompareChart$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ ViewGroup a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ViewGroup viewGroup) {
                    super(0);
                    this.a = viewGroup;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "refreshIntoSlpCompareChart chartParent.measuredWidth = " + this.a.getMeasuredWidth() + " - measuredHeight = " + this.a.getMeasuredHeight();
                }
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getA() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getB() {
                return data;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                return new Index(-1, new BaseIndex(i));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                HMLog.info("SlpCompareChartHelper", new a(chartParent));
                return this.b(chartParent, getB().getCount());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return this.c(true, i, Float.valueOf(intoSlpTime), data.getCount());
            }
        }, false, false);
    }
}
