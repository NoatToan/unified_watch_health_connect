package com.huami.heartrate.chart;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.data.Data;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.data.StaticChartConfig;
import com.huami.chart.data.XYAxisData;
import com.huami.chart.helper.ChartBuildKt;
import com.huami.chart.helper.DataConfig;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.helper.UnifiedChart;
import com.huami.chart.helper.UnifiedChartKt;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.heartrate.vo.BarChartBuilder;
import com.huami.heartrate.vo.BarChartVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import defpackage.nc4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00106\u001a\u000204¢\u0006\u0004\b=\u0010>J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jd\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192:\u0010#\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001bj\u0002`\"2\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020!0$j\u0002`%J¼\u0001\u0010,\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2:\u0010#\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001bj\u0002`\"2\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020!0$j\u0002`%2@\b\u0002\u0010+\u001a:\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001bj\u0004\u0018\u0001`\"2\u0006\u0010\u0012\u001a\u00020\u0002Jv\u00103\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-2:\u00101\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110/¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020!0\u001bj\u0002`02\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020!0$j\u0002`22\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020!0$j\u0002`%R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107¨\u0006?"}, d2 = {"Lcom/huami/heartrate/chart/HRChartHelper;", "", "", "lastIndex", "Lcom/huami/chart/data/ChartDataList;", "chartDataList", "Lcom/huami/chart/util/Index;", GoogleApiAvailabilityLight.a, "(Ljava/lang/Integer;Lcom/huami/chart/data/ChartDataList;)Lcom/huami/chart/util/Index;", "", "maxY", "minY", "Landroid/view/View;", "container", "a", "b", "", "datas", "gap", "", "Lcom/huami/chart/data/ColorSegmentBar;", "c", "([II)[Lcom/huami/chart/data/ColorSegmentBar;", "Landroid/view/ViewGroup;", "chartContainer", "Lcom/huami/heartrate/chart/model/HRDayChartData;", "data", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "Lcom/huami/chart/chart/HMChart;", "chart", "", "Lcom/huami/heartrate/chart/OnTouchDownValue;", "onTouchDownValue", "Lkotlin/Function0;", "Lcom/huami/heartrate/chart/OnTouchEmptyArea;", "onTouchEmptyArea", "refreshRestHrChart", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "abnormalRange", "onTouchUpValue", "refreshLineChart", "Lcom/huami/heartrate/vo/BarChartBuilder;", "builder", "Lcom/huami/heartrate/vo/BarChartVo;", "Lcom/huami/heartrate/chart/OnBarTouchDownValue;", "onBarTouchDownValue", "Lcom/huami/heartrate/chart/OnTouchUpValue;", "refreshBarChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "F", "dataMarginTop", "dataMarginBottom", "barWidthDay", "e", "lineDataWidth", "<init>", "(Landroid/content/Context;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HRChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float dataMarginTop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float dataMarginBottom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float barWidthDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float lineDataWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "GAP：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "高度：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int[] iArr) {
            super(0);
            this.a = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "原始的数据：" + ArraysKt___ArraysJvmKt.asList(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Pair<Integer, Integer>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Pair<Integer, Integer>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "分组后的数据：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Index a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Index index) {
            super(0);
            this.a = index;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "dataIndex:" + this.a.getDataIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Index a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Index index) {
            super(0);
            this.a = index;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onUp dataIndex:" + this.a.getDataIndex();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "Lcom/huami/chart/helper/UnifiedChart;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<RenderConfig.Builder, UnifiedChart, Unit> {
        public g() {
            super(2);
        }

        public final void a(@NotNull RenderConfig.Builder builder, @NotNull UnifiedChart unifiedChart) {
            UnifiedChartKt.unifiedBarConfig$default(builder, HRChartHelper.this.context, 0, 0, 0.0f, 0, null, 62, null);
            ChartBuildKt.emptyDataConfig$default(builder, HRChartHelper.this.context, HRChartHelper.this.context.getString(R.string.heart_rate_no_data), null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, UnifiedChart unifiedChart) {
            a(builder, unifiedChart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Index a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Index index) {
            super(0);
            this.a = index;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "down current index " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "Lcom/huami/chart/helper/UnifiedChart;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<RenderConfig.Builder, UnifiedChart, Unit> {
        public final /* synthetic */ int b;
        public final /* synthetic */ ArrayList<RangeIndex> c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ ArrayList<int[]> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/LineStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<LineStyle.Builder, Unit> {
            public final /* synthetic */ ArrayList<RangeIndex> a;
            public final /* synthetic */ HRChartHelper b;
            public final /* synthetic */ int[] c;
            public final /* synthetic */ ArrayList<int[]> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList<RangeIndex> arrayList, HRChartHelper hRChartHelper, int[] iArr, ArrayList<int[]> arrayList2) {
                super(1);
                this.a = arrayList;
                this.b = hRChartHelper;
                this.c = iArr;
                this.d = arrayList2;
            }

            public final void a(@NotNull LineStyle.Builder builder) {
                builder.setSubIndex(this.a);
                Context context = this.b.context;
                int i = R.color.s15;
                builder.setSubLinecolor(ContextCompat.getColor(context, i));
                builder.setSubShadowColors(this.c);
                builder.setSubBezierLineColor(ContextCompat.getColor(this.b.context, i));
                builder.setSubIndexShadowColors(this.d);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LineStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, ArrayList<RangeIndex> arrayList, int[] iArr, ArrayList<int[]> arrayList2) {
            super(2);
            this.b = i;
            this.c = arrayList;
            this.d = iArr;
            this.e = arrayList2;
        }

        public final void a(@NotNull RenderConfig.Builder builder, @NotNull UnifiedChart unifiedChart) {
            Context context = HRChartHelper.this.context;
            Context context2 = HRChartHelper.this.context;
            int i = R.color.s51;
            ChartBuildKt.lineConfig$default(builder, context, 0, HMChartHelperKt.getResColor$default(context2, i, 0.0f, 4, null), new int[]{ColorUtils.setAlphaComponent(ContextCompat.getColor(HRChartHelper.this.context, i), 128), ColorUtils.setAlphaComponent(ContextCompat.getColor(HRChartHelper.this.context, i), 0)}, this.b, 0.0f, 0.0f, 0.0f, 0, 0, new a(this.c, HRChartHelper.this, this.d, this.e), 930, null);
            ChartBuildKt.emptyDataConfig$default(builder, HRChartHelper.this.context, HRChartHelper.this.context.getString(R.string.heart_rate_no_data), null, 4, null);
            ChartBuildKt.interactiveLineConfig$default(builder, HRChartHelper.this.context, 32, HMChartHelperKt.getDpToPx(4.0f), Integer.valueOf(HMChartHelperKt.getResColor$default(HRChartHelper.this.context, i, 0.0f, 4, null)), null, 16, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, UnifiedChart unifiedChart) {
            a(builder, unifiedChart);
            return Unit.INSTANCE;
        }
    }

    public HRChartHelper(@NotNull Context context) {
        this.context = context;
        this.dataMarginTop = ChartUtil.dp2px(context, 15.0f);
        this.dataMarginBottom = ChartUtil.dp2px(context, 52.0f);
        this.barWidthDay = ChartUtil.dp2px(context, 6.0f);
        this.lineDataWidth = ChartUtil.dp2px(context, 1.0f);
    }

    private final int a(float maxY, float minY, View container) {
        int iCeil = (int) Math.ceil((maxY - minY) / ((float) Math.ceil(b(container) / this.barWidthDay)));
        if (iCeil < 10) {
            iCeil = 10;
        }
        HMLog.debug("HRChartHelper", new a(iCeil));
        return iCeil;
    }

    private final int b(View container) {
        int height = (int) ((container.getHeight() - this.dataMarginTop) - this.dataMarginBottom);
        HMLog.debug("HRChartHelper", new b(height));
        return height;
    }

    private final ColorSegmentBar[] c(int[] datas, int gap) {
        if (datas != null) {
            if (!(datas.length == 0)) {
                HMLog.debug("HRChartHelper", new c(datas));
                ArrayList<Pair> arrayList = new ArrayList();
                int i2 = 1;
                int i3 = 0;
                while (i2 <= ArraysKt___ArraysKt.getLastIndex(datas)) {
                    int i4 = i2 - 1;
                    if (datas[i2] - datas[i4] > gap) {
                        arrayList.add(new Pair(Integer.valueOf(datas[i3]), Integer.valueOf(datas[i4])));
                        i3 = i2;
                    }
                    i2++;
                }
                arrayList.add(new Pair(Integer.valueOf(datas[i3]), Integer.valueOf(datas[i2 - 1])));
                HMLog.debug("HRChartHelper", new d(arrayList));
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (Pair pair : arrayList) {
                    arrayList3.add(Boolean.valueOf(arrayList2.add(new ColorSegmentBar(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), ContextCompat.getColor(this.context, R.color.s51)))));
                }
                Object[] array = arrayList2.toArray(new ColorSegmentBar[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return (ColorSegmentBar[]) array;
            }
        }
        return new ColorSegmentBar[0];
    }

    private final Index d(Integer lastIndex, ChartDataList chartDataList) {
        int iIntValue;
        ChartData dataByDataIndex;
        if (lastIndex == null || (dataByDataIndex = chartDataList.getDataByDataIndex((iIntValue = lastIndex.intValue()))) == null) {
            return null;
        }
        return new Index(iIntValue, dataByDataIndex.getBaseIndex());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshLineChart$default(HRChartHelper hRChartHelper, ViewGroup viewGroup, HRDayChartData hRDayChartData, ArrayList arrayList, Function2 function2, Function0 function0, Function2 function3, int i2, int i3, Object obj) {
        hRChartHelper.refreshLineChart(viewGroup, hRDayChartData, arrayList, function2, function0, (i3 & 32) != 0 ? null : function3, i2);
    }

    public final void refreshBarChart(@NotNull ViewGroup chartContainer, @NotNull final BarChartBuilder builder, @NotNull final Function2<? super Index, ? super BarChartVo, Unit> onBarTouchDownValue, @NotNull Function0<Unit> onTouchUpValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        int iKeyAt = builder.getXAxisData().keyAt(0);
        int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        float value = builder.getYAxisData().get(0).getValue();
        float value2 = builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue();
        int iA = a(value2, value, chartContainer);
        SparseArray sparseArray = new SparseArray();
        for (BarChartVo barChartVo : builder.getBars()) {
            sparseArray.put(barChartVo.getIndex(), new ChartData(barChartVo.getIndex(), c(barChartVo.getHeartRateValue(), iA)));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iKeyAt);
        chartDataList.setEnd(iKeyAt2);
        chartDataList.setMinValue(value);
        chartDataList.setMaxValue(value2);
        Context context = this.context;
        StaticChartConfig staticChartConfig = new StaticChartConfig(new Data(chartDataList, null, 2, null), new XYAxisData(builder.getXAxisData(), builder.getYAxisData()), new DataConfig(this.barWidthDay, null, 2, null), d(builder.getLastValidIndex(), chartDataList));
        g gVar = new g();
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context, chartContainer, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, gVar);
        final ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.heartrate.chart.HRChartHelper$refreshBarChart$$inlined$initStaticHMChart$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i2) {
                HMLog.info("HRChartHelper", new HRChartHelper.e(i2));
                BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.getOrNull(builder.getBars(), i2.getDataIndex());
                if (barChartVo2 == null) {
                    onTouchEmptyArea.getA();
                } else {
                    onBarTouchDownValue.invoke(i2, barChartVo2);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i2) {
                HMLog.info("HRChartHelper", new HRChartHelper.f(i2));
                BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.getOrNull(builder.getBars(), i2.getPosiIndex().getIndex() - 1);
                if (barChartVo2 == null) {
                    onTouchEmptyArea.getA();
                } else {
                    onBarTouchDownValue.invoke(i2, barChartVo2);
                }
            }
        });
    }

    public final void refreshLineChart(@NotNull ViewGroup chartContainer, @NotNull HRDayChartData data, @NotNull ArrayList<RangeIndex> abnormalRange, @NotNull final Function2<? super Index, ? super HMChart, Unit> onTouchDownValue, @NotNull final Function0<Unit> onTouchEmptyArea, @Nullable Function2<? super Index, ? super HMChart, Unit> onTouchUpValue, int gap) {
        Context context = this.context;
        int i2 = R.color.s41;
        int[] iArr = {ColorUtils.setAlphaComponent(ContextCompat.getColor(context, i2), 128), ColorUtils.setAlphaComponent(ContextCompat.getColor(this.context, i2), 0)};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abnormalRange, 10));
        for (RangeIndex rangeIndex : abnormalRange) {
            arrayList2.add(Boolean.valueOf(arrayList.add(iArr)));
        }
        Context context2 = this.context;
        ChartDataList chartDataList = data.getChartDataList();
        chartDataList.setMinValue(data.getYMin());
        chartDataList.setMaxValue(data.getYMax());
        Unit unit = Unit.INSTANCE;
        StaticChartConfig staticChartConfig = new StaticChartConfig(new Data(chartDataList, null, 2, null), new XYAxisData(data.getXData(), data.getYData()), new DataConfig(this.lineDataWidth, null, 2, null), null, 8, null);
        i iVar = new i(gap, abnormalRange, iArr, arrayList);
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context2, chartContainer, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, iVar);
        final ChartProvider chartProvider = new ChartProvider(context2, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.heartrate.chart.HRChartHelper$refreshLineChart$$inlined$initStaticHMChart$default$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i3) {
                ChartProvider chartProvider2 = chartProvider;
                HMLog.debug("HRChartHelper", new HRChartHelper.h(i3));
                if (Intrinsics.areEqual(i3, Index.INVALID_INDEX)) {
                    onTouchEmptyArea.getA();
                } else {
                    onTouchDownValue.invoke(i3, chartProvider2.getChart());
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i3) {
            }
        });
    }

    public final void refreshRestHrChart(@NotNull ViewGroup chartContainer, @NotNull HRDayChartData data, @NotNull Function2<? super Index, ? super HMChart, Unit> onTouchDownValue, @NotNull Function0<Unit> onTouchEmptyArea) {
        refreshLineChart$default(this, chartContainer, data, new ArrayList(), onTouchDownValue, onTouchEmptyArea, null, 1, 32, null);
    }
}
