package com.huami.phn.coach.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.helper.ChartBuildKt;
import com.huami.chart.helper.DataConfig;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.helper.MultiLineConfig;
import com.huami.chart.helper.UnifiedChart;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.chart.util.Index;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.activity.NounType;
import com.huami.phn.coach.ui.activity.PHNNounExplainActivity;
import com.huami.phn.coach.ui.view.PHNTrainingStatusChart;
import com.huami.phn.coach.usecase.PhnDailyAnalysis;
import com.huami.phn.util.StringKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.nc4;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010Y\u001a\u0004\u0018\u00010X\u0012\u0006\u0010Z\u001a\u00020\u0015¢\u0006\u0004\b[\u0010\\B\u0011\b\u0016\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\b[\u0010]B\u001b\b\u0016\u0012\u0006\u0010W\u001a\u00020V\u0012\b\u0010Y\u001a\u0004\u0018\u00010X¢\u0006\u0004\b[\u0010^J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002J\u0014\u0010 \u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0016\u00101\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u00102\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0016\u00103\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0016\u00104\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u00106\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020<078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00108R\u0016\u0010E\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010K\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010DR\u0016\u0010M\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0016\u0010O\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0016\u0010Q\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010DR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006_"}, d2 = {"Lcom/huami/phn/coach/ui/view/PHNTrainingStatusChart;", "Landroid/widget/RelativeLayout;", "", "isToggle", "", "o", com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "isSwitchToggle", "l", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", hl.k, "Lcom/huami/chart/data/XAxisData;", z.j, "Lcom/huami/chart/data/ChartDataList;", "g", "h", "", "value", "Lkotlin/Pair;", "", GoogleApiAvailabilityLight.b, "i", "Landroid/view/ViewGroup;", "chartParent", "m", "show", "showTrainingStatus", "", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", "list", "fillingDailyAnalysis", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "clTrainingStatus", "b", "clFatigueFitness", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "tvTrainingStatus", GoogleApiAvailabilityLight.a, "tvTrainingFatigueLevel", "e", "tvTrainingFitnessLevel", "f", "tvTrainingStatusValue", "tvTrainingStatusDesc", "tvTrainingFatigueLevelValue", "tvTrainingFitnessLevelValue", "tvXDate", "Landroid/widget/RelativeLayout;", "llTSChartContainer", "", "Ljava/util/List;", "dataTSLists", "dataTFatLists", "dataTFitLists", "Ljava/util/Date;", "dataXLists", "phnDailyList", "Z", "isShowHistogram", "r", "histogramBGList", SOAP.XMLNS, "F", "yOffset", "t", "dataTSYMax", "u", "dataTSYMin", "v", "dataTFYMax", "w", "dataTFYMin", "x", AnimatorViewWrapper.SCALE, "y", "invalidValue", "", "z", "Ljava/lang/String;", "defaultValue", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTrainingStatusChart extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ConstraintLayout clTrainingStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConstraintLayout clFatigueFitness;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingFatigueLevel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingFitnessLevel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingStatusValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingStatusDesc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingFatigueLevelValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final TextView tvTrainingFitnessLevelValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final TextView tvXDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final RelativeLayout llTSChartContainer;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private List<Float> dataTSLists;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private List<Float> dataTFatLists;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private List<Float> dataTFitLists;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private List<Date> dataXLists;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private List<PhnDailyAnalysis> phnDailyList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isShowHistogram;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private List<Integer> histogramBGList;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float yOffset;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float dataTSYMax;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private float dataTSYMin;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float dataTFYMax;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float dataTFYMin;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private float scale;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final float invalidValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final String defaultValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "Lcom/huami/chart/helper/UnifiedChart;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<RenderConfig.Builder, UnifiedChart, Unit> {
        public final /* synthetic */ MultiLineConfig b;

        /* JADX INFO: renamed from: com.huami.phn.coach.ui.view.PHNTrainingStatusChart$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/BarStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0533a extends Lambda implements Function1<BarStyle.Builder, Unit> {
            public static final C0533a a = new C0533a();

            public C0533a() {
                super(1);
            }

            public final void a(@NotNull BarStyle.Builder builder) {
                builder.setHighlightContrast(102);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BarStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MultiLineConfig multiLineConfig) {
            super(2);
            this.b = multiLineConfig;
        }

        public final void a(@NotNull RenderConfig.Builder builder, @NotNull UnifiedChart unifiedChart) {
            ChartBuildKt.barConfig$default(builder, PHNTrainingStatusChart.this.getContext(), 8, 0.0f, 0, C0533a.a, 12, null);
            ChartBuildKt.multiLineConfig$default(builder, this.b, null, 2, null);
            ChartBuildKt.interactiveLineConfig$default(builder, PHNTrainingStatusChart.this.getContext(), 1, 0.0f, null, null, 28, null);
            ChartBuildKt.emptyDataConfig$default(builder, PHNTrainingStatusChart.this.getContext(), PHNTrainingStatusChart.this.getContext().getString(R.string.phn_training_status_chart_no_data), null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, UnifiedChart unifiedChart) {
            a(builder, unifiedChart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "Lcom/huami/chart/helper/UnifiedChart;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<RenderConfig.Builder, UnifiedChart, Unit> {
        public final /* synthetic */ MultiLineConfig b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/MultiLineStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<MultiLineStyle.Builder, Unit> {
            public final /* synthetic */ PHNTrainingStatusChart a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PHNTrainingStatusChart pHNTrainingStatusChart) {
                super(1);
                this.a = pHNTrainingStatusChart;
            }

            public final void a(@NotNull MultiLineStyle.Builder builder) {
                builder.setIntersectionPointColor(new int[]{HMChartHelperKt.getResColor(this.a.getContext(), R.color.s51, 1.0f)});
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MultiLineStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.phn.coach.ui.view.PHNTrainingStatusChart$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/InteractiveLineStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0534b extends Lambda implements Function1<InteractiveLineStyle.Builder, Unit> {
            public final /* synthetic */ PHNTrainingStatusChart a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0534b(PHNTrainingStatusChart pHNTrainingStatusChart) {
                super(1);
                this.a = pHNTrainingStatusChart;
            }

            public final void a(@NotNull InteractiveLineStyle.Builder builder) {
                builder.setIntersectionPointColor(HMChartHelperKt.getResColor(this.a.getContext(), R.color.s15, 1.0f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InteractiveLineStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MultiLineConfig multiLineConfig) {
            super(2);
            this.b = multiLineConfig;
        }

        public final void a(@NotNull RenderConfig.Builder builder, @NotNull UnifiedChart unifiedChart) {
            ChartBuildKt.lineConfig$default(builder, PHNTrainingStatusChart.this.getContext(), 4, HMChartHelperKt.getResColor(PHNTrainingStatusChart.this.getContext(), R.color.s15, 1.0f), new int[]{HMChartHelperKt.getResColor(PHNTrainingStatusChart.this.getContext(), R.color.s16, 0.2f), HMChartHelperKt.getResColor(PHNTrainingStatusChart.this.getContext(), R.color.s38, 0.0f)}, 0, 0.0f, 0.0f, 0.0f, 0, 0, null, 1968, null);
            ChartBuildKt.multiLineConfig(builder, this.b, new a(PHNTrainingStatusChart.this));
            ChartBuildKt.interactiveLineConfig$default(builder, PHNTrainingStatusChart.this.getContext(), 1, HMChartHelperKt.getDpToPx(3), null, new C0534b(PHNTrainingStatusChart.this), 8, null);
            ChartBuildKt.emptyDataConfig$default(builder, PHNTrainingStatusChart.this.getContext(), PHNTrainingStatusChart.this.getContext().getString(R.string.phn_training_status_chart_no_data), null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, UnifiedChart unifiedChart) {
            a(builder, unifiedChart);
            return Unit.INSTANCE;
        }
    }

    public PHNTrainingStatusChart(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dataTSLists = new ArrayList();
        this.dataTFatLists = new ArrayList();
        this.dataTFitLists = new ArrayList();
        this.dataXLists = new ArrayList();
        this.phnDailyList = new ArrayList();
        this.histogramBGList = CollectionsKt__CollectionsKt.mutableListOf(Integer.valueOf(R.color.s25), Integer.valueOf(R.color.s15), Integer.valueOf(R.color.s20), Integer.valueOf(R.color.s22), Integer.valueOf(R.color.s33));
        this.scale = 1.0f;
        this.invalidValue = -10000.0f;
        this.defaultValue = "--";
        LayoutInflater.from(context).inflate(R.layout.phn_view_training_status_chart, this);
        this.clTrainingStatus = (ConstraintLayout) findViewById(R.id.cl_training_status);
        this.clFatigueFitness = (ConstraintLayout) findViewById(R.id.cl_fatigue_fitness);
        TextView textView = (TextView) findViewById(R.id.tv_training_analysis_status);
        this.tvTrainingStatus = textView;
        TextView textView2 = (TextView) findViewById(R.id.tv_training_analysis_fatigue_level);
        this.tvTrainingFatigueLevel = textView2;
        TextView textView3 = (TextView) findViewById(R.id.tv_training_analysis_fitness_level);
        this.tvTrainingFitnessLevel = textView3;
        this.tvTrainingStatusValue = (TextView) findViewById(R.id.tv_training_analysis_status_value);
        this.tvTrainingStatusDesc = (TextView) findViewById(R.id.tv_training_analysis_status_desc);
        this.tvTrainingFatigueLevelValue = (TextView) findViewById(R.id.tv_training_analysis_fatigue_level_value);
        this.tvTrainingFitnessLevelValue = (TextView) findViewById(R.id.tv_training_analysis_fitness_level_value);
        this.tvXDate = (TextView) findViewById(R.id.tv_x_date);
        textView.setOnClickListener(new View.OnClickListener() { // from class: gp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNTrainingStatusChart.d(context, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNTrainingStatusChart.e(context, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: fp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNTrainingStatusChart.f(context, view);
            }
        });
        this.llTSChartContainer = (RelativeLayout) findViewById(R.id.rl_training_status_chart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, View view) {
        PHNNounExplainActivity.INSTANCE.start(context, NounType.ANALYSIS_STATUS.ordinal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Context context, View view) {
        PHNNounExplainActivity.INSTANCE.start(context, NounType.FATIGUE_LEVEL.ordinal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Context context, View view) {
        PHNNounExplainActivity.INSTANCE.start(context, NounType.FITNESS_LEVEL.ordinal());
    }

    private final ChartDataList g() {
        SparseArray sparseArray = new SparseArray();
        List<Float> list = this.dataTSLists;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (!(fFloatValue == this.invalidValue)) {
                float f = this.yOffset;
                sparseArray.put(i, new ChartData(i, new ColorSegmentBar[]{new ColorSegmentBar(f, fFloatValue + f, ContextCompat.getColor(getContext(), n(fFloatValue).getFirst().intValue()))}));
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(41);
        chartDataList.setMinValue(this.dataTSYMin + this.yOffset);
        chartDataList.setMaxValue(this.dataTSYMax + this.yOffset);
        return chartDataList;
    }

    private final ChartDataList h() {
        SparseArray sparseArray = new SparseArray();
        List<Float> list = this.dataTFitLists;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (!(fFloatValue == this.invalidValue)) {
                if (this.isShowHistogram) {
                    fFloatValue = ((fFloatValue - this.dataTFYMin) * this.scale) + this.dataTSYMin + this.yOffset;
                }
                sparseArray.put(i, new ChartData(i, fFloatValue));
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(41);
        if (!this.isShowHistogram) {
            chartDataList.setMinValue(this.dataTFYMin);
            chartDataList.setMaxValue(this.dataTFYMax);
        }
        return chartDataList;
    }

    private final ChartDataList i() {
        SparseArray sparseArray = new SparseArray();
        List<Float> list = this.dataTFatLists;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (!(fFloatValue == this.invalidValue)) {
                if (this.isShowHistogram) {
                    fFloatValue = ((fFloatValue - this.dataTFYMin) * this.scale) + this.dataTSYMin + this.yOffset;
                }
                sparseArray.put(i, new ChartData(i, fFloatValue));
            }
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(41);
        if (!this.isShowHistogram) {
            chartDataList.setMinValue(this.dataTFYMin);
            chartDataList.setMaxValue(this.dataTFYMax);
        }
        return chartDataList;
    }

    private final SparseArray<XAxisData> j() {
        SparseArray<XAxisData> sparseArray = new SparseArray<>();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i == 0 || i == 14 || i == 28 || i == 41) {
                sparseArray.put(i, new XAxisData(i, TimeUtils.formatDate_no_y(getContext(), this.dataXLists.get(i), true)));
            }
            if (i2 > 41) {
                return sparseArray;
            }
            i = i2;
        }
    }

    private final SparseArray<YAxisData> k() {
        boolean z;
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        List<Float> list = this.dataTSLists;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                if (!(((Number) it2.next()).floatValue() == this.invalidValue)) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            return sparseArray;
        }
        if (this.isShowHistogram) {
            float f = this.dataTSYMax;
            float f2 = this.dataTSYMin;
            float f3 = ((f - f2) / 2) + f2;
            sparseArray.put(0, new YAxisData(this.yOffset + f2, StringKt.i18n((int) f2)));
            sparseArray.put(1, new YAxisData(this.yOffset + f3, StringKt.i18n(c.roundToInt(f3))));
            float f4 = this.dataTSYMax;
            sparseArray.put(2, new YAxisData(this.yOffset + f4, StringKt.i18n((int) f4)));
        } else {
            float f5 = this.dataTFYMax;
            float f6 = this.dataTFYMin;
            float f7 = ((f5 - f6) / 2) + f6;
            sparseArray.put(0, new YAxisData(f6, StringKt.i18n((int) f6)));
            sparseArray.put(1, new YAxisData(f7, StringKt.i18n(c.roundToInt(f7))));
            float f8 = this.dataTFYMax;
            sparseArray.put(2, new YAxisData(f8, StringKt.i18n((int) f8)));
        }
        return sparseArray;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    private final void l(boolean isSwitchToggle) {
        int i;
        int i2;
        Calendar date;
        if (isSwitchToggle) {
            return;
        }
        List<PhnDailyAnalysis> list = this.phnDailyList;
        if (list.size() > 1) {
            g.sortWith(list, new Comparator() { // from class: com.huami.phn.coach.ui.view.PHNTrainingStatusChart$dealAxisData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((PhnDailyAnalysis) t).getDate().getTime(), ((PhnDailyAnalysis) t2).getDate().getTime());
                }
            });
        }
        for (PhnDailyAnalysis phnDailyAnalysis : this.phnDailyList) {
            this.dataTSLists.add(Float.valueOf(phnDailyAnalysis.getTsb()));
            this.dataTFatLists.add(Float.valueOf(phnDailyAnalysis.getAtl()));
            this.dataTFitLists.add(Float.valueOf(phnDailyAnalysis.getCtl()));
            this.dataXLists.add(phnDailyAnalysis.getDate().getTime());
        }
        List<Float> list2 = this.dataTFitLists;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!(((Number) next).floatValue() == this.invalidValue)) {
                arrayList.add(next);
            }
        }
        Float fM3963maxOrNull = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList);
        float fFloatValue = fM3963maxOrNull == null ? 0.0f : fM3963maxOrNull.floatValue();
        List<Float> list3 = this.dataTFatLists;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (!(((Number) obj).floatValue() == this.invalidValue)) {
                arrayList2.add(obj);
            }
        }
        Float fM3963maxOrNull2 = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList2);
        float fMax = Math.max(fFloatValue, fM3963maxOrNull2 == null ? 0.0f : fM3963maxOrNull2.floatValue());
        List<Float> list4 = this.dataTSLists;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list4) {
            if (!(((Number) obj2).floatValue() == this.invalidValue)) {
                arrayList3.add(obj2);
            }
        }
        Float fM3963maxOrNull3 = CollectionsKt___CollectionsKt.m3963maxOrNull((Iterable<Float>) arrayList3);
        float fFloatValue2 = fM3963maxOrNull3 == null ? 0.0f : fM3963maxOrNull3.floatValue();
        List<Float> list5 = this.dataTFitLists;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list5) {
            if (!(((Number) obj3).floatValue() == this.invalidValue)) {
                arrayList4.add(obj3);
            }
        }
        Float fM3967minOrNull = CollectionsKt___CollectionsKt.m3967minOrNull((Iterable<Float>) arrayList4);
        float fFloatValue3 = fM3967minOrNull == null ? 0.0f : fM3967minOrNull.floatValue();
        List<Float> list6 = this.dataTFatLists;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list6) {
            if (!(((Number) obj4).floatValue() == this.invalidValue)) {
                arrayList5.add(obj4);
            }
        }
        Float fM3967minOrNull2 = CollectionsKt___CollectionsKt.m3967minOrNull((Iterable<Float>) arrayList5);
        float fMin = Math.min(fFloatValue3, fM3967minOrNull2 == null ? 0.0f : fM3967minOrNull2.floatValue());
        List<Float> list7 = this.dataTSLists;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list7) {
            if (!(((Number) obj5).floatValue() == this.invalidValue)) {
                arrayList6.add(obj5);
            }
        }
        Float fM3967minOrNull3 = CollectionsKt___CollectionsKt.m3967minOrNull((Iterable<Float>) arrayList6);
        float fFloatValue4 = fM3967minOrNull3 == null ? 0.0f : fM3967minOrNull3.floatValue();
        if (fFloatValue2 < 0.0f) {
            float f = 5;
            if (fFloatValue2 % f == 0.0f) {
                i = ((int) (fFloatValue2 / 5)) + 1;
            } else {
                i = (int) (fFloatValue2 / f);
            }
        } else {
            i = ((int) (fFloatValue2 / 5)) + 1;
        }
        float f2 = i * 5.0f;
        this.dataTSYMax = f2;
        if (fFloatValue4 > 0.0f) {
            float f3 = 5;
            if (fFloatValue4 % f3 == 0.0f) {
                i2 = ((int) (fFloatValue4 / 5)) - 1;
            } else {
                i2 = (int) (fFloatValue4 / f3);
            }
        } else {
            i2 = ((int) (fFloatValue4 / 5)) - 1;
        }
        float f4 = i2 * 5.0f;
        this.dataTSYMin = f4;
        if (f2 < 0.0f) {
            this.dataTSYMax = 0.0f;
        }
        if (f4 > 0.0f) {
            this.dataTSYMin = 0.0f;
        }
        float f5 = 5;
        float f6 = (((int) (fMax / f5)) + 1) * 5.0f;
        this.dataTFYMax = f6;
        float f7 = (((fMin % f5) > 0.0f ? 1 : ((fMin % f5) == 0.0f ? 0 : -1)) == 0 ? ((int) (fMin / f5)) - 1 : (int) (fMin / f5)) * 5.0f;
        this.dataTFYMin = f7;
        float f8 = this.dataTSYMax;
        float f9 = this.dataTSYMin;
        this.scale = (f8 - f9) / (f6 - f7);
        if (f9 < 0.0f) {
            this.yOffset = -f9;
        }
        if (this.phnDailyList.size() < 42) {
            Calendar calendar = Calendar.getInstance();
            PhnDailyAnalysis phnDailyAnalysis2 = (PhnDailyAnalysis) CollectionsKt.firstOrNull((List) this.phnDailyList);
            Date date2 = null;
            if (phnDailyAnalysis2 != null && (date = phnDailyAnalysis2.getDate()) != null) {
                date2 = date.getTime();
            }
            if (date2 == null) {
                date2 = new Date();
            }
            calendar.setTime(date2);
            while (42 - this.dataXLists.size() > 0) {
                calendar.add(5, -1);
                this.dataTSLists.add(0, Float.valueOf(this.invalidValue));
                this.dataTFatLists.add(0, Float.valueOf(this.invalidValue));
                this.dataTFitLists.add(0, Float.valueOf(this.invalidValue));
                this.dataXLists.add(0, calendar.getTime());
            }
        }
    }

    private final int m(ViewGroup chartParent) {
        int width = chartParent.getWidth();
        return width == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, Integer> n(float value) {
        if (value >= 10.0f) {
            return new Pair<>(this.histogramBGList.get(4), Integer.valueOf(R.string.phn_training_analysis_status_rest_modify));
        }
        if (value >= 5.0f && value < 10.0f) {
            return new Pair<>(this.histogramBGList.get(3), Integer.valueOf(R.string.phn_training_analysis_status_abundant));
        }
        if (value >= -5.0f && value < 5.0f) {
            return new Pair<>(this.histogramBGList.get(2), Integer.valueOf(R.string.phn_training_analysis_status_balance));
        }
        if (value < -30.0f || value >= -5.0f) {
            return value < -30.0f ? new Pair<>(this.histogramBGList.get(0), Integer.valueOf(R.string.phn_training_analysis_status_over)) : new Pair<>(this.histogramBGList.get(4), Integer.valueOf(R.string.phn_training_analysis_status_over));
        }
        return new Pair<>(this.histogramBGList.get(1), Integer.valueOf(R.string.phn_training_analysis_status_optimal));
    }

    private final void o(boolean isToggle) {
        List<PhnDailyAnalysis> list = this.phnDailyList;
        if (list == null || list.isEmpty()) {
            return;
        }
        l(isToggle);
        if (this.isShowHistogram) {
            p();
        } else {
            q();
        }
    }

    private final void p() {
        boolean z;
        boolean z2;
        Float f;
        Float fPrevious;
        ChartProvider chartProvider = new ChartProvider(getContext(), true);
        ChartDataList chartDataListH = h();
        ChartDataList chartDataListI = i();
        UnifiedChart unifiedChart = new UnifiedChart(getContext(), this.llTSChartContainer, j(), k(), g(), new ChartDataList[]{chartDataListH, chartDataListI}, new DataConfig(((m(this.llTSChartContainer) - HMChartHelperKt.getDpToPx(50)) / 42) - HMChartHelperKt.getDpToPx(2), null, 2, null), null, new a(new MultiLineConfig(getContext(), 0, new int[]{HMChartHelperKt.getResColor(getContext(), R.color.s15, 0.4f), HMChartHelperKt.getResColor(getContext(), R.color.s51, 0.4f)}, true, null, (chartDataListH.getCount() <= 0 || chartDataListI.getCount() <= 0) ? null : new HMGradientDrawableRectValue[]{new HMGradientDrawableRectValue(0.0f, chartDataListH.getMaxDataValue(), 0.0f, chartDataListH.getMinDataValue(), 5, null), new HMGradientDrawableRectValue(0.0f, chartDataListI.getMaxDataValue(), 0.0f, chartDataListI.getMinDataValue(), 5, null)}, 0.0f, 0.0f, 0.0f, 0, 0, 0, 3922, null)), 128, null);
        if (chartDataListH.getCount() <= 0 || chartDataListI.getCount() <= 0) {
            z = false;
            z2 = false;
        } else {
            z = false;
            z2 = true;
        }
        chartProvider.createAutoAdjustChart(unifiedChart, z2, z);
        TextView textView = this.tvTrainingStatusValue;
        List<Float> list = this.dataTSLists;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((Number) obj).floatValue() == this.invalidValue)) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        String strI18n$default = (arrayList == null || (f = (Float) CollectionsKt.last((List) arrayList)) == null) ? null : StringKt.i18n$default(f.floatValue(), 0, 1, null);
        if (strI18n$default == null) {
            strI18n$default = this.defaultValue;
        }
        textView.setText(strI18n$default);
        TextView textView2 = this.tvTrainingStatusDesc;
        List<Float> list2 = this.dataTSLists;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!(((Number) obj2).floatValue() == this.invalidValue)) {
                arrayList2.add(obj2);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        textView2.setText(arrayList2 == null ? null : getContext().getString(n(((Number) CollectionsKt.last((List) arrayList2)).floatValue()).getSecond().intValue()));
        TextView textView3 = this.tvXDate;
        List<Float> list3 = this.dataTFatLists;
        ListIterator<Float> listIterator = list3.listIterator(list3.size());
        do {
            if (!listIterator.hasPrevious()) {
                fPrevious = null;
                break;
            }
            fPrevious = listIterator.previous();
        } while (!(!(fPrevious.floatValue() == this.invalidValue)));
        Float f2 = fPrevious;
        textView3.setText(f2 == null ? null : TimeUtils.formatDate(getContext(), this.dataXLists.get(this.dataTFatLists.lastIndexOf(Float.valueOf(f2.floatValue()))), true));
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.phn.coach.ui.view.PHNTrainingStatusChart$initHistogramConfig$9
            /* JADX WARN: Code duplicated, block: B:20:0x0068  */
            /* JADX WARN: Code duplicated, block: B:4:0x000b  */
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@Nullable Index i) {
                String strI18n$default2;
                String string;
                TextView textView4 = this.a.tvTrainingStatusValue;
                String date = null;
                if (i == null) {
                    strI18n$default2 = null;
                } else {
                    PHNTrainingStatusChart pHNTrainingStatusChart = this.a;
                    Index index = ((((Number) pHNTrainingStatusChart.dataTSLists.get(i.getPosiIndex().getIndex())).floatValue() > pHNTrainingStatusChart.invalidValue ? 1 : (((Number) pHNTrainingStatusChart.dataTSLists.get(i.getPosiIndex().getIndex())).floatValue() == pHNTrainingStatusChart.invalidValue ? 0 : -1)) == 0) ^ true ? i : null;
                    if (index == null) {
                        strI18n$default2 = null;
                    } else {
                        strI18n$default2 = StringKt.i18n$default(((Number) this.a.dataTSLists.get(index.getPosiIndex().getIndex())).floatValue(), 0, 1, null);
                    }
                }
                if (strI18n$default2 == null) {
                    strI18n$default2 = this.a.defaultValue;
                }
                textView4.setText(strI18n$default2);
                TextView textView5 = this.a.tvTrainingStatusDesc;
                if (i == null) {
                    string = null;
                } else {
                    PHNTrainingStatusChart pHNTrainingStatusChart2 = this.a;
                    Index index2 = (((Number) pHNTrainingStatusChart2.dataTSLists.get(i.getPosiIndex().getIndex())).floatValue() == pHNTrainingStatusChart2.invalidValue) ^ true ? i : null;
                    if (index2 == null) {
                        string = null;
                    } else {
                        PHNTrainingStatusChart pHNTrainingStatusChart3 = this.a;
                        string = pHNTrainingStatusChart3.getContext().getString(((Number) pHNTrainingStatusChart3.n(((Number) pHNTrainingStatusChart3.dataTSLists.get(index2.getPosiIndex().getIndex())).floatValue()).getSecond()).intValue());
                    }
                }
                textView5.setText(string);
                TextView textView6 = this.a.tvXDate;
                if (i != null) {
                    PHNTrainingStatusChart pHNTrainingStatusChart4 = this.a;
                    date = TimeUtils.formatDate(pHNTrainingStatusChart4.getContext(), (Date) pHNTrainingStatusChart4.dataXLists.get(i.getPosiIndex().getIndex()), true);
                }
                if (date == null) {
                    date = this.a.defaultValue;
                }
                textView6.setText(date);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index i) {
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v27 */
    private final void q() {
        boolean z;
        boolean z2;
        Float f;
        String str;
        String strI18n$default;
        Float f2;
        Object objPrevious;
        ChartProvider chartProvider = new ChartProvider(getContext(), true);
        ChartDataList chartDataListH = h();
        ChartDataList chartDataListI = i();
        Context context = getContext();
        Context context2 = getContext();
        int i = R.color.s51;
        UnifiedChart unifiedChart = new UnifiedChart(getContext(), this.llTSChartContainer, j(), k(), chartDataListH, new ChartDataList[]{chartDataListI}, new DataConfig(HMChartHelperKt.getDpToPx(2), null, 2, null), null, new b(new MultiLineConfig(context, 0, new int[]{HMChartHelperKt.getResColor(context2, i, 1.0f)}, true, new int[][]{new int[]{HMChartHelperKt.getResColor(getContext(), i, 0.2f), HMChartHelperKt.getResColor(getContext(), R.color.s38, 0.0f)}}, chartDataListI.getCount() > 0 ? new HMGradientDrawableRectValue[]{new HMGradientDrawableRectValue(0.0f, chartDataListI.getMaxDataValue(), 0.0f, chartDataListI.getMinDataValue(), 5, null)} : null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 3906, null)), 128, null);
        if (chartDataListI.getCount() > 0) {
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        chartProvider.createAutoAdjustChart(unifiedChart, z2, z);
        TextView textView = this.tvTrainingFatigueLevelValue;
        List<Float> list = this.dataTFatLists;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((Number) obj).floatValue() == this.invalidValue)) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null || (f = (Float) CollectionsKt.last((List) arrayList)) == null) {
            str = null;
            strI18n$default = null;
        } else {
            str = null;
            strI18n$default = StringKt.i18n$default(f.floatValue(), 0, 1, null);
        }
        if (strI18n$default == null) {
            strI18n$default = this.defaultValue;
        }
        textView.setText(strI18n$default);
        TextView textView2 = this.tvTrainingFitnessLevelValue;
        List<Float> list2 = this.dataTFitLists;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!(((Number) obj2).floatValue() == this.invalidValue)) {
                arrayList2.add(obj2);
            }
        }
        boolean z3 = !arrayList2.isEmpty();
        ?? r7 = arrayList2;
        if (!z3) {
            r7 = str;
        }
        String strI18n$default2 = (r7 == 0 || (f2 = (Float) CollectionsKt.last((List) r7)) == null) ? str : StringKt.i18n$default(f2.floatValue(), 0, 1, str);
        if (strI18n$default2 == null) {
            strI18n$default2 = this.defaultValue;
        }
        textView2.setText(strI18n$default2);
        TextView textView3 = this.tvXDate;
        List<Float> list3 = this.dataTFatLists;
        ListIterator<Float> listIterator = list3.listIterator(list3.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = str;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(!(((Number) objPrevious).floatValue() == this.invalidValue)));
        Float f3 = (Float) objPrevious;
        textView3.setText(f3 == null ? str : TimeUtils.formatDate(getContext(), this.dataXLists.get(this.dataTFatLists.lastIndexOf(Float.valueOf(f3.floatValue()))), true));
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.phn.coach.ui.view.PHNTrainingStatusChart$initLineConfig$8
            /* JADX WARN: Code duplicated, block: B:20:0x0068  */
            /* JADX WARN: Code duplicated, block: B:4:0x000b  */
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@Nullable Index i2) {
                String strI18n$default3;
                String strI18n$default4;
                TextView textView4 = this.a.tvTrainingFatigueLevelValue;
                String date = null;
                if (i2 == null) {
                    strI18n$default3 = null;
                } else {
                    PHNTrainingStatusChart pHNTrainingStatusChart = this.a;
                    Index index = ((((Number) pHNTrainingStatusChart.dataTFatLists.get(i2.getPosiIndex().getIndex())).floatValue() > pHNTrainingStatusChart.invalidValue ? 1 : (((Number) pHNTrainingStatusChart.dataTFatLists.get(i2.getPosiIndex().getIndex())).floatValue() == pHNTrainingStatusChart.invalidValue ? 0 : -1)) == 0) ^ true ? i2 : null;
                    if (index == null) {
                        strI18n$default3 = null;
                    } else {
                        strI18n$default3 = StringKt.i18n$default(((Number) this.a.dataTFatLists.get(index.getPosiIndex().getIndex())).floatValue(), 0, 1, null);
                    }
                }
                if (strI18n$default3 == null) {
                    strI18n$default3 = this.a.defaultValue;
                }
                textView4.setText(strI18n$default3);
                TextView textView5 = this.a.tvTrainingFitnessLevelValue;
                if (i2 == null) {
                    strI18n$default4 = null;
                } else {
                    PHNTrainingStatusChart pHNTrainingStatusChart2 = this.a;
                    Index index2 = ((((Number) pHNTrainingStatusChart2.dataTFitLists.get(i2.getPosiIndex().getIndex())).floatValue() > pHNTrainingStatusChart2.invalidValue ? 1 : (((Number) pHNTrainingStatusChart2.dataTFitLists.get(i2.getPosiIndex().getIndex())).floatValue() == pHNTrainingStatusChart2.invalidValue ? 0 : -1)) == 0) ^ true ? i2 : null;
                    if (index2 == null) {
                        strI18n$default4 = null;
                    } else {
                        strI18n$default4 = StringKt.i18n$default(((Number) this.a.dataTFitLists.get(index2.getPosiIndex().getIndex())).floatValue(), 0, 1, null);
                    }
                }
                if (strI18n$default4 == null) {
                    strI18n$default4 = this.a.defaultValue;
                }
                textView5.setText(strI18n$default4);
                TextView textView6 = this.a.tvXDate;
                if (i2 != null) {
                    PHNTrainingStatusChart pHNTrainingStatusChart3 = this.a;
                    date = TimeUtils.formatDate(pHNTrainingStatusChart3.getContext(), (Date) pHNTrainingStatusChart3.dataXLists.get(i2.getPosiIndex().getIndex()), true);
                }
                if (date == null) {
                    date = this.a.defaultValue;
                }
                textView6.setText(date);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index i2) {
            }
        });
    }

    public final void fillingDailyAnalysis(@NotNull List<PhnDailyAnalysis> list) {
        if (!list.isEmpty()) {
            this.phnDailyList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        }
        o(false);
    }

    public final void showTrainingStatus(boolean show) {
        this.isShowHistogram = show;
        if (show) {
            this.clTrainingStatus.setVisibility(0);
            this.clFatigueFitness.setVisibility(8);
        } else {
            this.clTrainingStatus.setVisibility(8);
            this.clFatigueFitness.setVisibility(0);
        }
        o(true);
    }

    public PHNTrainingStatusChart(@NotNull Context context) {
        this(context, null);
    }

    public PHNTrainingStatusChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
