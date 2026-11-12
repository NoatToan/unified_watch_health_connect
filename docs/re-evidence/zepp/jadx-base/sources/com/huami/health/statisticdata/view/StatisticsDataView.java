package com.huami.health.statisticdata.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.health.statisticdata.R;
import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.BasicArgumentsData;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.health.statisticdata.util.StatisticDataHelperKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FBG\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010=\u001a\u00020\u0011\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020>¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u001c\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0012R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@¨\u0006G"}, d2 = {"Lcom/huami/health/statisticdata/view/StatisticsDataView;", "", "", "a", "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "mCompareList", "c", "Lcom/huami/chart/provider/RenderConfig;", "b", "Lcom/huami/chart/provider/DrawConfig;", GoogleApiAvailabilityLight.a, "recycle", "", "personCurrentValue", "mAllCompareList", "updateCompareView", "", LogUtil.I, "mCompareBaseIndex", "Lcom/huami/chart/data/ChartDataList;", "Lcom/huami/chart/data/ChartDataList;", "mCompareChartDataList", "Lcom/huami/chart/chart/ChartProvider;", "Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "mPosBitmap", "e", "mChartSize", "f", "Ljava/util/List;", "g", "F", "maxCategory", "h", "maxCountIndex", "Lcom/huami/chart/chart/IChartProvider;", "i", "Lcom/huami/chart/chart/IChartProvider;", "mCompareBaseChartProvider", "Landroid/content/Context;", z.j, "Landroid/content/Context;", "mContext", "Landroid/widget/TextView;", hl.k, "Landroid/widget/TextView;", "mCompareTitle", "l", "mCompareSubTitle", "Landroid/widget/RelativeLayout;", "m", "Landroid/widget/RelativeLayout;", "mCompareChartContainer", "Lcom/huami/health/statisticdata/model/BasicArgumentsData;", GoogleApiAvailabilityLight.b, "Lcom/huami/health/statisticdata/model/BasicArgumentsData;", "basicArgumentsData", "o", "lineColor", "", com.google.android.exoplayer2.text.ttml.b.r, "[I", "shadowColors", DTransferConstants.SEARCH_KEY, "subIndexShadowColors", "<init>", "(Landroid/content/Context;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Lcom/huami/health/statisticdata/model/BasicArgumentsData;I[I[I)V", "Companion", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticsDataView {

    @NotNull
    public static final String TAG = "StatisticsDataView";
    public static final float VALUE_BOTTOM_MARGIN = 5.0f;
    public static final float X_LABEL_MARGIN_TOP = 7.0f;
    public static final float X_LABEL_SIZE = 12.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mCompareBaseIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ChartDataList mCompareChartDataList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ChartProvider chartProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Bitmap mPosBitmap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mChartSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private List<StatisticDataModel> mCompareList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float maxCategory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int maxCountIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final IChartProvider mCompareBaseChartProvider = new ChartProvider.StatisChartProvider() { // from class: com.huami.health.statisticdata.view.StatisticsDataView$mCompareBaseChartProvider$1
        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        /* JADX INFO: renamed from: getChartContainer */
        public ViewGroup getA() {
            return this.a.mCompareChartContainer;
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        /* JADX INFO: renamed from: getChartDataList */
        public ChartDataList getB() {
            return this.a.mCompareChartDataList;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        @NotNull
        public Index getCurrentIndex() {
            return new Index(this.a.mCompareBaseIndex, new BaseIndex(this.a.mCompareBaseIndex));
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public DrawConfig getDrawConfig() {
            return this.a.d();
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public RenderConfig getRenderConfig() {
            return this.a.b();
        }
    };

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Context mContext;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextView mCompareTitle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextView mCompareSubTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final RelativeLayout mCompareChartContainer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final BasicArgumentsData basicArgumentsData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int lineColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int[] shadowColors;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int[] subIndexShadowColors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<anonymous parameter 0>", "Lcom/huami/chart/util/Index;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onValueTrans", "(FLcom/huami/chart/util/Index;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements IValueTransformation {
        public static final a a = new a();

        @Override // com.huami.chart.listener.IValueTransformation
        public final String onValueTrans(float f, Index index) {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "compare chart data size == " + StatisticsDataView.this.mChartSize;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "" + StatisticsDataView.this.mCompareChartContainer.getMeasuredWidth() + " , " + StatisticsDataView.this.mCompareChartContainer.getMeasuredHeight() + " , " + StatisticsDataView.this.mChartSize;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Select person value is : " + this.a + StringUtil.SPACE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Statistic compare data!! mCompareList data list is : " + StatisticsDataView.this.mCompareList.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ float b;
        public final /* synthetic */ Ref.IntRef c;
        public final /* synthetic */ Ref.IntRef d;
        public final /* synthetic */ float e;
        public final /* synthetic */ Ref.IntRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f, Ref.IntRef intRef, Ref.IntRef intRef2, float f2, Ref.IntRef intRef3) {
            super(0);
            this.b = f;
            this.c = intRef;
            this.d = intRef2;
            this.e = f2;
            this.f = intRef3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "type :" + StatisticsDataView.this.basicArgumentsData.getDistributionTypeEnum() + ", timeGroup : " + StatisticsDataView.this.basicArgumentsData.getTimeGroup() + ",current value : " + this.b + ", compare result current count is : " + this.c.element + " , total count is : " + this.d.element + " , percent int float is : " + this.e + ", show percent is : " + this.f.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "calculate compare data time used = " + (System.currentTimeMillis() - this.a);
        }
    }

    public StatisticsDataView(@NotNull Context context, @NotNull TextView textView, @NotNull TextView textView2, @NotNull RelativeLayout relativeLayout, @NotNull BasicArgumentsData basicArgumentsData, int i, @NotNull int[] iArr, @NotNull int[] iArr2) {
        this.mContext = context;
        this.mCompareTitle = textView;
        this.mCompareSubTitle = textView2;
        this.mCompareChartContainer = relativeLayout;
        this.basicArgumentsData = basicArgumentsData;
        this.lineColor = i;
        this.shadowColors = iArr;
        this.subIndexShadowColors = iArr2;
    }

    private final void a() {
        if (this.chartProvider == null) {
            this.chartProvider = new ChartProvider(this.mContext);
        }
        this.chartProvider.createChart(this.mCompareBaseChartProvider, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig b() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int startIndex = StatisticDataHelperKt.getStartIndex(this.basicArgumentsData.getDistributionTypeEnum(), this.mCompareList);
        int endIndex = StatisticDataHelperKt.getEndIndex(this.basicArgumentsData.getDistributionTypeEnum(), this.mCompareList);
        String startCategory = StatisticDataHelperKt.getStartCategory(this.basicArgumentsData.getDistributionTypeEnum(), this.mCompareList);
        String endCategory = StatisticDataHelperKt.getEndCategory(this.basicArgumentsData.getDistributionTypeEnum(), this.mCompareList);
        String unitText = this.basicArgumentsData.getUnitText().length() == 0 ? "" : this.basicArgumentsData.getUnitText();
        String label = StatisticDataHelperKt.getLabel(this.basicArgumentsData.getDistributionTypeEnum(), (int) this.maxCategory);
        sparseArray.put(startIndex, new XAxisData(startIndex, startCategory + unitText));
        sparseArray.put(this.maxCountIndex, new XAxisData(this.maxCountIndex, label + unitText));
        sparseArray.put(endIndex, new XAxisData(endIndex, endCategory + unitText));
        if (this.shadowColors.length == 0) {
            this.shadowColors = new int[]{ContextCompat.getColor(this.mContext, R.color.shadow_color_1), ContextCompat.getColor(this.mContext, R.color.shadow_color_2), ContextCompat.getColor(this.mContext, R.color.shadow_color_3), ContextCompat.getColor(this.mContext, R.color.shadow_color_4), ContextCompat.getColor(this.mContext, R.color.shadow_color_5), ContextCompat.getColor(this.mContext, R.color.shadow_color_6)};
        }
        if (this.subIndexShadowColors.length == 0) {
            this.subIndexShadowColors = new int[]{ContextCompat.getColor(this.mContext, R.color.shadow_color_1), ContextCompat.getColor(this.mContext, R.color.shadow_color_2), ContextCompat.getColor(this.mContext, R.color.shadow_color_3), ContextCompat.getColor(this.mContext, R.color.shadow_color_4), ContextCompat.getColor(this.mContext, R.color.shadow_color_5), ContextCompat.getColor(this.mContext, R.color.shadow_color_6)};
        }
        RenderConfig.Builder valueStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this.mContext).setLineColor(this.lineColor).setLineWidth(ChartUtil.dp2px(this.mContext, 1.3f)).setLineStyle(4).setShadowColors(this.shadowColors).setSubIndexShadowColors(CollectionsKt__CollectionsKt.arrayListOf(this.subIndexShadowColors)).setShadowBeforeIndex(false).create()).setValueStyle(new ValueStyle.Builder(this.mContext).setDrawEmptyValue(true).setValueStyle(4).setValueBitmap(this.mPosBitmap).setValueBottomMargin(ChartUtil.dp2px(this.mContext, 5.0f)).setValueTransformation(a.a).create());
        AxisStyle.Builder axisStyle = new AxisStyle.Builder(this.mContext).setZeroY(ChartUtil.dp2px(this.mContext, 20.0f)).setAxisStyle(42);
        Context context = this.mContext;
        int i = R.color.statistic_data_transparent;
        return valueStyle.setAxisStyle(axisStyle.setXAxisScaleLineColor(ContextCompat.getColor(context, i)).setXLabelSize(ChartUtil.dp2px(this.mContext, 12.0f)).setXLabelColor(ContextCompat.getColor(this.mContext, R.color.statistic_data_x_label_color)).setXAxisData(sparseArray).setXLabelMarginTop(ChartUtil.dp2px(this.mContext, 7.0f)).setXAxisLineColor(ContextCompat.getColor(this.mContext, i)).create()).create();
    }

    private final void c(List<StatisticDataModel> mCompareList) {
        SparseArray sparseArray = new SparseArray();
        int size = mCompareList.size();
        for (int i = 0; i < size; i++) {
            StatisticDataModel statisticDataModel = mCompareList.get(i);
            sparseArray.put(i, new ChartData((int) statisticDataModel.getCategory(), statisticDataModel.getCount()));
        }
        this.mChartSize = sparseArray.size();
        HMLog.debug(TAG, new b());
        if (this.mCompareChartDataList == null) {
            this.mPosBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), this.basicArgumentsData.getGoalIconResId());
        }
        this.mCompareChartDataList = new ChartDataList(sparseArray, 0, sparseArray.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig d() {
        HMLog.debug(TAG, new c());
        return new DrawConfig.Builder(this.mContext).setCanvasHeight(this.mCompareChartContainer.getMeasuredHeight()).setCanvasWidth(this.mCompareChartContainer.getMeasuredWidth()).setDataWidth(this.mCompareChartContainer.getMeasuredWidth() / this.mChartSize).setDataMarginLeft(ChartUtil.dp2px(this.mContext, 20.0f)).setDataMarginRight(ChartUtil.dp2px(this.mContext, 20.0f)).setDataMarginTop(ChartUtil.dp2px(this.mContext, 20.0f)).setDataMarginBottom(ChartUtil.dp2px(this.mContext, 25.0f)).create();
    }

    public final void recycle() {
        Bitmap bitmap = this.mPosBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final void updateCompareView(float personCurrentValue, @NotNull List<StatisticDataModel> mAllCompareList) {
        List<StatisticDataModel> statisticDataList = StatisticDataHelperKt.getStatisticDataList(this.basicArgumentsData.getDistributionTypeEnum(), mAllCompareList);
        this.mCompareList = statisticDataList;
        if (statisticDataList.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMLog.info(TAG, new d(personCurrentValue));
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = 0;
        this.maxCategory = 0.0f;
        this.maxCountIndex = 0;
        float category = this.mCompareList.get(0).getCategory();
        HMLog.debug(TAG, new e());
        intRef.element = this.mCompareList.get(0).getCategoryCount();
        int size = this.mCompareList.size();
        float category2 = category;
        int count = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.basicArgumentsData.getDistributionTypeEnum() == DistributionTypeEnum.BODY_WEIGHT || this.basicArgumentsData.getDistributionTypeEnum() == DistributionTypeEnum.SLEEP_START) {
                if (personCurrentValue < this.mCompareList.get(i2).getCategory()) {
                    intRef2.element += this.mCompareList.get(i2).getCount();
                }
            } else if (personCurrentValue > this.mCompareList.get(i2).getCategory()) {
                intRef2.element += this.mCompareList.get(i2).getCount();
            }
            if (count < this.mCompareList.get(i2).getCount()) {
                count = this.mCompareList.get(i2).getCount();
                this.maxCategory = this.mCompareList.get(i2).getCategory();
                this.maxCountIndex = i2;
            }
            if ((i2 < this.mCompareList.size() - 1 && personCurrentValue >= this.mCompareList.get(i2).getCategory() && personCurrentValue < this.mCompareList.get(i2 + 1).getCategory()) || ((i2 == this.mCompareList.size() - 1 && personCurrentValue >= this.mCompareList.get(i2).getCategory()) || (i2 == 0 && i2 < this.mCompareList.get(i2).getCategory()))) {
                i = i2;
                category2 = this.mCompareList.get(i2).getCategory();
            }
        }
        float f2 = (intRef2.element / intRef.element) * 100;
        Ref.IntRef intRef3 = new Ref.IntRef();
        int i3 = (int) f2;
        intRef3.element = i3;
        if (i3 < 1) {
            i3 = 1;
        } else if (i3 > 99) {
            i3 = 99;
        }
        intRef3.element = i3;
        TextView textView = this.mCompareTitle;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format(this.basicArgumentsData.getChartTitle(), Arrays.copyOf(new Object[]{Integer.valueOf(intRef3.element)}, 1)));
        if (this.basicArgumentsData.getChartTitleColorResId() != null) {
            this.mCompareTitle.setTextColor(ContextCompat.getColor(this.mContext, this.basicArgumentsData.getChartTitleColorResId().intValue()));
        }
        if (this.basicArgumentsData.getChartSubTitle().length() > 0) {
            this.mCompareSubTitle.setVisibility(0);
            this.mCompareSubTitle.setText(this.basicArgumentsData.getChartSubTitle());
        }
        if (this.basicArgumentsData.getChartSubTitleColorResId() != null) {
            this.mCompareSubTitle.setTextColor(ContextCompat.getColor(this.mContext, this.basicArgumentsData.getChartSubTitleColorResId().intValue()));
        }
        HMLog.info(TAG, new f(personCurrentValue, intRef2, intRef, f2, intRef3));
        if (i != 0 && i != this.mCompareList.size() - 1 && personCurrentValue - category2 >= ((double) this.basicArgumentsData.getDistributionTypeEnum().getCategoryGap()) * 0.5d) {
            i++;
        }
        this.mCompareBaseIndex = i;
        c(this.mCompareList);
        a();
        HMLog.info(TAG, new g(jCurrentTimeMillis));
    }
}
