package com.xiaomi.hm.health.healthdata.ui.detail.stress;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataTimeExtKt;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressStatisticsFragment;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressStatisticsDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StatisticsStressDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J*\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00106\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b1\u00105¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressStatisticsFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, hl.k, "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "stressStatisticsInfo", z.j, "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "barChartBuilder", "i", "", "min", "max", "", "selected", "", "dateStr", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressStatisticsDetailViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressStatisticsDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "b", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "chartHelper", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", "", "Ljava/lang/Long;", "timeStamp", "e", "Ljava/lang/String;", "defaultDate", "Lcom/huami/sleep/util/ViewSlideWrapper;", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressStatisticsFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String g = "time_mode";

    @NotNull
    private static final String h = "time";
    private static final String i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ChartHelper chartHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TimeMode timeMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String defaultDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R!\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressStatisticsFragment$Companion;", "", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressStatisticsFragment;", "getInstance", "", "kotlin.jvm.PlatformType", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "ARGS_TIME", "ARGS_TIME_MODE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StressStatisticsFragment getInstance(@NotNull TimeMode timeMode, long time) {
            StressStatisticsFragment stressStatisticsFragment = new StressStatisticsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("time_mode", timeMode.name());
            bundle.putLong("time", time);
            Unit unit = Unit.INSTANCE;
            stressStatisticsFragment.setArguments(bundle);
            return stressStatisticsFragment;
        }

        public final String getTag() {
            return StressStatisticsFragment.i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "<anonymous parameter 0>", "Lkotlin/Pair;", "", "high", "<anonymous parameter 2>", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public a() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            if (pair == null) {
                return;
            }
            StressStatisticsFragment.this.c((int) pair.getFirst().floatValue(), (int) pair.getSecond().floatValue(), true, str);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BarChartVo<Number> value = StressStatisticsFragment.this.d().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            StressStatisticsFragment stressStatisticsFragment = StressStatisticsFragment.this;
            Pair<Float, Float> highValue = DataConverterKt.toRawBarChartVo(value).getHighValue();
            if (highValue == null) {
                return;
            }
            stressStatisticsFragment.c((int) highValue.getFirst().floatValue(), (int) highValue.getSecond().floatValue(), false, value.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StressStatisticsFragment stressStatisticsFragment = StressStatisticsFragment.this;
            stressStatisticsFragment.c(0, 0, false, stressStatisticsFragment.defaultDate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ViewSlideWrapper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = StressStatisticsFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.value_container), ViewUtils.dp2px(StressStatisticsFragment.this.getContext(), 8.0f), StressStatisticsFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(StressStatisticsFragment.this.getContext(), 15.0f));
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        i = companion.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressStatisticsFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.stress.StressStatisticsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StressStatisticsDetailViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.stress.StressStatisticsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressStatisticsDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StressStatisticsDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StressStatisticsDetailViewModel.class), function0, objArr);
            }
        });
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int min, int max, boolean selected, String dateStr) {
        String strValueOf;
        if (min == 0 && max == 0) {
            strValueOf = getString(com.huami.watch.hmwatchmanager.R.string.value_invalid);
        } else {
            strValueOf = min == max ? String.valueOf(min) : getString(com.huami.watch.hmwatchmanager.R.string.value_range, String.valueOf(min), String.valueOf(max));
        }
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.value))).setText(strValueOf);
        View view2 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view2 != null ? view2.findViewById(R.id.time) : null);
        if (dateStr == null) {
            dateStr = this.defaultDate;
        }
        typefaceTextView.setText(dateStr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StressStatisticsDetailViewModel d() {
        return (StressStatisticsDetailViewModel) this.viewModel.getValue();
    }

    private final ViewSlideWrapper e() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void f() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("time_mode");
            if (string != null) {
                TimeMode timeModeValueOf = TimeMode.valueOf(string);
                this.timeMode = timeModeValueOf;
                k(timeModeValueOf);
            }
            this.timeStamp = Long.valueOf(arguments.getLong("time"));
        }
        if (this.defaultDate == null) {
            this.defaultDate = HealthDataTimeExtKt.formatTime(new TimeParam(this.timeMode, this.timeStamp.longValue()));
            View view = getView();
            ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.time))).setText(this.defaultDate);
        }
        d().loadStatisticsStress(this.timeStamp, this.timeMode);
        StressStatisticsDetailViewModel stressStatisticsDetailViewModelD = d();
        stressStatisticsDetailViewModelD.getDetailDataLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: hh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressStatisticsFragment.g(this.a, (StatisticsStressDetailData) obj);
            }
        });
        stressStatisticsDetailViewModelD.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: gh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressStatisticsFragment.h(this.a, (BarChartVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(StressStatisticsFragment stressStatisticsFragment, StatisticsStressDetailData statisticsStressDetailData) {
        stressStatisticsFragment.i(statisticsStressDetailData.getBarChartBuilder());
        stressStatisticsFragment.j(statisticsStressDetailData.getStatisticsInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StressStatisticsFragment stressStatisticsFragment, BarChartVo barChartVo) {
        Pair<Float, Float> highValue;
        if (barChartVo == null || (highValue = DataConverterKt.toRawBarChartVo(barChartVo).getHighValue()) == null) {
            return;
        }
        stressStatisticsFragment.c((int) highValue.getFirst().floatValue(), (int) highValue.getSecond().floatValue(), false, barChartVo.getExtra());
    }

    private final void i(BarChartBuilder<Number> barChartBuilder) {
        if (barChartBuilder == null) {
            return;
        }
        ChartHelper chartHelper = this.chartHelper;
        Objects.requireNonNull(chartHelper);
        View view = getView();
        chartHelper.refreshAnimationBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.statistics_chart)), barChartBuilder, new a(), new b(), new c());
    }

    private final void j(StressStatisticsInfo stressStatisticsInfo) {
        View view = getView();
        ((UpDownTextItem) (view == null ? null : view.findViewById(R.id.statistics_max))).setUpText(String.valueOf(stressStatisticsInfo.getMax()));
        View view2 = getView();
        ((UpDownTextItem) (view2 == null ? null : view2.findViewById(R.id.statistics_min))).setUpText(String.valueOf(stressStatisticsInfo.getMin()));
        View view3 = getView();
        ((UpDownTextItem) (view3 == null ? null : view3.findViewById(R.id.statistics_avg))).setUpText(String.valueOf(stressStatisticsInfo.getAvg()));
        View view4 = getView();
        ((UpDownTextItem) (view4 != null ? view4.findViewById(R.id.statistics_single_times) : null)).setUpText(String.valueOf(stressStatisticsInfo.getSingleCount()));
    }

    private final void k(TimeMode timeMode) {
        String string;
        int i2 = timeMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i2 == 1) {
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_statistics_week);
        } else if (i2 != 2) {
            string = i2 != 3 ? "" : getString(com.huami.watch.hmwatchmanager.R.string.stress_statistics_year);
        } else {
            string = getString(com.huami.watch.hmwatchmanager.R.string.stress_statistics_month);
        }
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.statistics_title))).setText(string);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.chartHelper = new ChartHelper(context);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.fragment_stress_statistics_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        f();
    }
}
