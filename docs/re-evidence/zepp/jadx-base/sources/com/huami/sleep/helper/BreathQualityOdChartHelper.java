package com.huami.sleep.helper;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.SectionLineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.ScopesKt;
import com.huami.sleep.repo.IBreathQualitySelectHistoryRepo;
import com.huami.sleep.vo.BreathQualityDayOdVo;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import defpackage.nc4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b7\u00108J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002JO\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2%\u0010\u0015\u001a!\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000ej\u0002`\u00142\u0010\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00130\u0016j\u0002`\u0017R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R#\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u001d\u00105¨\u00069"}, d2 = {"Lcom/huami/sleep/helper/BreathQualityOdChartHelper;", "Lorg/koin/core/component/KoinComponent;", "", "text", "", "textSize", "c", "Landroid/view/ViewGroup;", "chartParent", "dataMarginEnd", "Lcom/huami/chart/provider/DrawConfig;", "a", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "data", "Lkotlin/Function1;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "", "Lcom/huami/sleep/helper/OnTouchSectionValue;", "onTouchSelectedValue", "Lkotlin/Function0;", "Lcom/huami/sleep/helper/OnTouchSectionUpValue;", "onTouchBarUpValue", "refreshBarChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "F", "labelSize11", "labelSize12", GoogleApiAvailabilityLight.a, "xMarginStart", "e", "xMarginEnd", "f", "xLabelMarginTop", "g", "dataMarginStart", "h", "i", "dataMarginTop", z.j, "dataMarginBottom", "", hl.k, LogUtil.I, "labelColor", "Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "l", "Lkotlin/Lazy;", "()Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "mHistoryRecordRepo", "<init>", "(Landroid/content/Context;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityOdChartHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float xMarginStart;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int labelColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float labelSize11 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 11.0f);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float labelSize12 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 12.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float xMarginEnd = ChartUtil.sp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float xLabelMarginTop = ChartUtil.dp2px(KoinExtKt.getAppContext(), 5.0f);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dataMarginStart = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float dataMarginEnd = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float dataMarginTop = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float dataMarginBottom = ChartUtil.dp2px(KoinExtKt.getAppContext(), 20.0f);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHistoryRecordRepo = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "Lcom/huami/chart/util/Index;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IBreathQualitySelectHistoryRepo<Index>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBreathQualitySelectHistoryRepo<Index> getA() {
            return (IBreathQualitySelectHistoryRepo) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IBreathQualitySelectHistoryRepo.class), null, null);
        }
    }

    public BreathQualityOdChartHelper(@NotNull Context context) {
        this.context = context;
        this.labelColor = ContextCompat.getColor(context, R.color.s1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig a(ViewGroup chartParent, float dataMarginEnd) {
        int width = chartParent.getWidth();
        int height = chartParent.getHeight();
        if (width == 0) {
            width = this.context.getResources().getDisplayMetrics().widthPixels;
        }
        return new DrawConfig.Builder(this.context).setCanvasWidth(width).setCanvasHeight(height).setDataMarginTop(this.dataMarginTop).setDataMarginLeft(this.dataMarginStart).setDataMarginRight(dataMarginEnd).setDataMarginBottom(this.dataMarginBottom).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBreathQualitySelectHistoryRepo<Index> b() {
        return (IBreathQualitySelectHistoryRepo) this.mHistoryRecordRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float c(String text, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Type inference failed for: r3v25, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, com.huami.chart.util.Index] */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, com.huami.chart.util.Index] */
    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final BreathQualityDayOdVo data, @NotNull final Function1<? super Index, Unit> onTouchSelectedValue, @NotNull Function0<Unit> onTouchBarUpValue) {
        String title;
        float value = data.getYAxisData().size() != 0 ? data.getYAxisData().get(data.getYAxisData().size() - 1).getValue() : 0.0f;
        final ChartDataList chartDataList = new ChartDataList(data.getChartData());
        chartDataList.setStart(data.getMinIndex());
        chartDataList.setEnd(data.getMaxIndex());
        chartDataList.setMinValue(0.0f);
        chartDataList.setMaxValue(50.0f);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (b().get(data.getTimeStr()) != null) {
            objectRef.element = b().get(data.getTimeStr());
        } else {
            SparseIntArray valueInfoList = data.getValueInfoList();
            int size = valueInfoList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                valueInfoList.keyAt(i2);
                int iValueAt = valueInfoList.valueAt(i2);
                if (iValueAt > i) {
                    i = iValueAt;
                }
            }
            int iIndexOfValue = data.getValueInfoList().indexOfValue(i);
            if (iIndexOfValue < 0) {
                objectRef.element = Index.INVALID_INDEX;
            } else {
                BaseIndex baseIndex = data.getChartData().get(data.getChartData().keyAt(iIndexOfValue), null).getBaseIndex();
                objectRef.element = new Index(iIndexOfValue, baseIndex != null ? baseIndex : null);
            }
        }
        this.xMarginStart = c(String.valueOf(value), this.labelSize11) + ChartUtil.dp2px(this.context, 15.0f);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        if (data.getXAxisData().size() != 0) {
            float f = this.xMarginStart;
            XAxisData xAxisData = data.getXAxisData().get(data.getMinIndex());
            String title2 = "";
            if (xAxisData == null || (title = xAxisData.getTitle()) == null) {
                title = "";
            }
            float f2 = 2;
            this.dataMarginStart = f + (c(title, this.labelSize12) / f2);
            SparseArray<XAxisData> xAxisData2 = data.getXAxisData();
            int size2 = xAxisData2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                xAxisData2.keyAt(i3);
                title2 = xAxisData2.valueAt(i3).getTitle();
            }
            floatRef.element += (c(title2, this.labelSize12) / f2) + this.dataMarginEnd;
        }
        final int i4 = 166;
        final ChartProvider chartProvider = new ChartProvider(this.context, true);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.helper.BreathQualityOdChartHelper.refreshBarChart.3
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getD() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getF() {
                return chartDataList;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                Index index = objectRef.element;
                if (index != null && index.getPosiIndex() != null && !Intrinsics.areEqual(chartProvider.getChart().getInteractiveManager().getCurrentIndex(), Index.INVALID_INDEX)) {
                    RectF cacheRectByDataIndex = chartProvider.getChart().getHmDataCacheCenter().getCacheRectByDataIndex(chartProvider.getChart().getInteractiveManager().getCurrentIndex().getDataIndex());
                    Function1<Index, Unit> function1 = onTouchSelectedValue;
                    Ref.ObjectRef<Index> objectRef2 = objectRef;
                    Index index2 = objectRef2.element;
                    index2.setCenterX(cacheRectByDataIndex.centerX() + (BreathQualityOdChartHelper.this.c(data.getSelectInfoList().get(objectRef2.element.getDataIndex()), 11.0f) / 2));
                    Unit unit = Unit.INSTANCE;
                    function1.invoke(index2);
                }
                Index index3 = objectRef.element;
                return (index3 == null || index3.getPosiIndex() == null) ? super.getCurrentIndex() : objectRef.element;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return BreathQualityOdChartHelper.this.a(chartParent, floatRef.element);
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder builder = new RenderConfig.Builder();
                SectionLineStyle.Builder lineWidth = new SectionLineStyle.Builder(BreathQualityOdChartHelper.this.context).setLineStyle(8).setLineWidth(ChartUtil.dp2px(BreathQualityOdChartHelper.this.context, 2.0f));
                Context context = BreathQualityOdChartHelper.this.context;
                int i5 = R.color.s3;
                return builder.setSectionLineStyle(lineWidth.setInteractiveLineColor(ContextCompat.getColor(context, i5)).setInteractiveLineWidth(ChartUtil.dp2px(BreathQualityOdChartHelper.this.context, 1.5f)).setInteractiveType(16).setInteractiveSlide(true).setInteractiveUpCancel(false).create()).setAxisStyle(new AxisStyle.Builder(BreathQualityOdChartHelper.this.context).setAxisStyle(i4).setXLabelColor(BreathQualityOdChartHelper.this.labelColor).setXAxisLineColor(ContextCompat.getColor(BreathQualityOdChartHelper.this.context, i5)).setXLabelSize(BreathQualityOdChartHelper.this.labelSize12).setXAxisData(data.getXAxisData()).setYAxisData(data.getYAxisData()).setZeroX(BreathQualityOdChartHelper.this.xMarginStart).setZeroY(BreathQualityOdChartHelper.this.dataMarginBottom).setYAxisRight(true).setYLabelColor(BreathQualityOdChartHelper.this.labelColor).setYAxisLineColor(0).setYLabelSize(BreathQualityOdChartHelper.this.labelSize11).setYAxisScaleLineWidth(ChartUtil.dp2px(BreathQualityOdChartHelper.this.context, 0.5f)).setXLabelMarginTop(BreathQualityOdChartHelper.this.xLabelMarginTop).setXAxisMarginLeft(BreathQualityOdChartHelper.this.xMarginStart).setXAxisMarginRight(BreathQualityOdChartHelper.this.xMarginEnd).create()).create();
            }
        }, true, false, false, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.helper.BreathQualityOdChartHelper.refreshBarChart.4
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                onTouchSelectedValue.invoke(index);
                if (data.getSelectInfoList().indexOfKey(index.getDataIndex()) >= 0) {
                    this.b().record(data.getTimeStr(), index);
                } else {
                    this.b().record(data.getTimeStr(), Index.INVALID_INDEX);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
            }
        });
    }
}
