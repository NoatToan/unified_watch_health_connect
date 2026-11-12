package com.xiaomi.hm.health.healthdata.ui.detail.temperature;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureDailyFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.view.TempSubLineAndPointChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempDailyDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J+\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u0010/\u001a\u0004\u0018\u00010+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureDailyFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "l", "Lcom/xiaomi/hm/health/healthdata/ui/view/TempSubLineAndPointChartBuilder;", "chartBuilder", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "statisticsInfo", DTransferConstants.SEARCH_KEY, "", "tempFloat", "", "selected", "", "timeStr", "f", "(Ljava/lang/Float;ZLjava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempDailyDetailViewModel;", "a", "Lkotlin/Lazy;", "h", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempDailyDetailViewModel;", "viewModel", "b", "Ljava/lang/String;", "defaultTimeStr", "", "c", "Ljava/lang/Long;", "timeStamp", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", GoogleApiAvailabilityLight.a, "g", "()Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "chartHelper", "Lcom/huami/sleep/util/ViewSlideWrapper;", "e", "i", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TemperatureDailyFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String f = "time";
    private static final String g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String defaultTimeStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R!\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureDailyFragment$Companion;", "", "", "time", "Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureDailyFragment;", "getInstance", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "ARGS_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureDailyFragment getInstance(long time) {
            TemperatureDailyFragment temperatureDailyFragment = new TemperatureDailyFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            Unit unit = Unit.INSTANCE;
            temperatureDailyFragment.setArguments(bundle);
            return temperatureDailyFragment;
        }

        public final String getTAG() {
            return TemperatureDailyFragment.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper invoke() {
            Context context = TemperatureDailyFragment.this.getContext();
            if (context == null) {
                return null;
            }
            return new ChartHelper(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Index, HealthChartDataVo, Unit> {
        public b() {
            super(2);
        }

        public final void a(@NotNull Index index, @NotNull HealthChartDataVo healthChartDataVo) {
            TemperatureDailyFragment.this.i().slide(index.getCenterX());
            TemperatureDailyFragment.this.f(k.toFloatOrNull(healthChartDataVo.getValue()), true, healthChartDataVo.getExtra());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Index index, HealthChartDataVo healthChartDataVo) {
            a(index, healthChartDataVo);
            return Unit.INSTANCE;
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
            TemperatureDailyFragment.this.i().reset();
            HealthChartDataVo value = TemperatureDailyFragment.this.h().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            TemperatureDailyFragment temperatureDailyFragment = TemperatureDailyFragment.this;
            Float floatOrNull = k.toFloatOrNull(value.getValue());
            if (floatOrNull == null) {
                return;
            }
            temperatureDailyFragment.f(Float.valueOf(floatOrNull.floatValue()), false, value.getExtra());
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
            View view = TemperatureDailyFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.value_container), ViewUtils.dp2px(TemperatureDailyFragment.this.getContext(), 8.0f), TemperatureDailyFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(TemperatureDailyFragment.this.getContext(), 15.0f));
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        g = companion.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureDailyFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureDailyFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempDailyDetailViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureDailyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempDailyDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempDailyDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempDailyDetailViewModel.class), function0, objArr);
            }
        });
        this.defaultTimeStr = "";
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Float tempFloat, boolean selected, String timeStr) {
        String string;
        if ((tempFloat == null || Float.isNaN(tempFloat.floatValue())) ? false : true) {
            View view = getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.value);
            TempUtils tempUtils = TempUtils.INSTANCE;
            ((TypefaceTextView) viewFindViewById).setText(DataExKt.formatWithDecimal(Float.valueOf(tempUtils.getTempDisplayFloat(tempFloat.floatValue())), 1));
            View view2 = getView();
            ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.unit), true);
            View view3 = getView();
            TypefaceTextView typefaceTextView = (TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.unit));
            int tempUnit = tempUtils.getTempUnit();
            if (tempUnit != 0) {
                string = tempUnit != 1 ? "" : getString(com.huami.watch.hmwatchmanager.R.string.temperature_unit_f);
            } else {
                string = getString(com.huami.watch.hmwatchmanager.R.string.unit_temp);
            }
            typefaceTextView.setText(string);
        } else {
            View view4 = getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.value))).setText(getString(com.huami.watch.hmwatchmanager.R.string.value_invalid));
            View view5 = getView();
            ViewExKt.setVisible(view5 == null ? null : view5.findViewById(R.id.unit), false);
        }
        View view6 = getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.time));
        if (timeStr == null) {
            timeStr = this.defaultTimeStr;
        }
        typefaceTextView2.setText(timeStr);
        if (!selected) {
            View view7 = getView();
            ((ConstraintLayout) (view7 != null ? view7.findViewById(R.id.value_container) : null)).setBackgroundColor(0);
        } else {
            View view8 = getView();
            ConstraintLayout constraintLayout = (ConstraintLayout) (view8 != null ? view8.findViewById(R.id.value_container) : null);
            constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), com.huami.watch.hmwatchmanager.R.drawable.slp_info_rect_tip_bg));
        }
    }

    private final ChartHelper g() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempDailyDetailViewModel h() {
        return (TempDailyDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper i() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void initView() {
        View view = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view == null ? null : view.findViewById(R.id.add_data));
        typefaceTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.huami.watch.hmwatchmanager.R.drawable.ic_arrow_forward_16, 0);
        typefaceTextView.setOnClickListener(new View.OnClickListener() { // from class: om7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TemperatureDailyFragment.j(this.a, view2);
            }
        });
        View view2 = getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view2 != null ? view2.findViewById(R.id.history_data) : null);
        typefaceTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.huami.watch.hmwatchmanager.R.drawable.ic_arrow_forward_16, 0);
        typefaceTextView2.setOnClickListener(new View.OnClickListener() { // from class: pm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TemperatureDailyFragment.k(view3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TemperatureDailyFragment temperatureDailyFragment, View view) {
        HealthDataNavigator.INSTANCE.navigateToAddHealthData(temperatureDailyFragment, TemperatureDataType.MANUAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        HealthDataNavigator.INSTANCE.navigateToHealthDataHistory(view.getContext(), TemperatureDataType.MANUAL);
    }

    private final void l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            long jLongValue = Long.valueOf(arguments.getLong("time")).longValue();
            this.timeStamp = Long.valueOf(jLongValue);
            String timeYMD = HealthDataTimeUtils.INSTANCE.formatTimeYMD(jLongValue);
            this.defaultTimeStr = timeYMD;
            f(null, false, timeYMD);
        }
        TempDailyDetailViewModel tempDailyDetailViewModelH = h();
        tempDailyDetailViewModelH.getStatisticsInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: sm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDailyFragment.m(this.a, (TempStatisticsInfo) obj);
            }
        });
        tempDailyDetailViewModelH.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: rm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDailyFragment.n(this.a, (HealthChartDataVo) obj);
            }
        });
        tempDailyDetailViewModelH.getChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: qm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDailyFragment.o(this.a, (TempSubLineAndPointChartBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TemperatureDailyFragment temperatureDailyFragment, TempStatisticsInfo tempStatisticsInfo) {
        temperatureDailyFragment.q(tempStatisticsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TemperatureDailyFragment temperatureDailyFragment, HealthChartDataVo healthChartDataVo) {
        String value;
        Float floatOrNull;
        if (healthChartDataVo == null || (value = healthChartDataVo.getValue()) == null || (floatOrNull = k.toFloatOrNull(value)) == null) {
            return;
        }
        temperatureDailyFragment.f(Float.valueOf(floatOrNull.floatValue()), false, healthChartDataVo.getExtra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TemperatureDailyFragment temperatureDailyFragment, TempSubLineAndPointChartBuilder tempSubLineAndPointChartBuilder) {
        temperatureDailyFragment.p(tempSubLineAndPointChartBuilder);
    }

    private final void p(TempSubLineAndPointChartBuilder chartBuilder) {
        ChartHelper chartHelperG;
        if (chartBuilder == null || (chartHelperG = g()) == null) {
            return;
        }
        View view = getView();
        chartHelperG.refreshMixLineChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), chartBuilder, new b(), new c());
    }

    private final void q(TempStatisticsInfo statisticsInfo) {
        Context context;
        boolean z = !statisticsInfo.isInValid();
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.statistics_zone), z);
        if (!z || (context = getContext()) == null) {
            return;
        }
        View view2 = getView();
        View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.statistics_max);
        TempUtils tempUtils = TempUtils.INSTANCE;
        ((UpDownTextItem) viewFindViewById).setUpText(tempUtils.getTempDisplayString(context, statisticsInfo.getMax()));
        View view3 = getView();
        ((UpDownTextItem) (view3 == null ? null : view3.findViewById(R.id.statistics_min))).setUpText(tempUtils.getTempDisplayString(context, statisticsInfo.getMin()));
        View view4 = getView();
        ((UpDownTextItem) (view4 != null ? view4.findViewById(R.id.statistics_avg) : null)).setUpText(tempUtils.getTempDisplayString(context, statisticsInfo.getAvg()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.fragment_temperature_daily_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Long l = this.timeStamp;
        if (l == null) {
            return;
        }
        h().loadData(l.longValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        l();
    }
}
