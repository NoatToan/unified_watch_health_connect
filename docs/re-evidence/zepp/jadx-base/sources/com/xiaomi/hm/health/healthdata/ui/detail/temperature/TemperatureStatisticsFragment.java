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
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureStatisticsFragment;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempStatisticsDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.temperature.TempStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002JF\u0010\u0013\u001a\u00020\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001f\u00102\u001a\u0004\u0018\u00010/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b0\u00101R\u001d\u00106\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureStatisticsFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempStatisticsInfo;", "statisticsInfo", "m", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "barChartBuilder", "l", "Lkotlin/Pair;", "", "abnormalPair", "normalPair", "", "selected", "", "dateStr", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempStatisticsDetailViewModel;", "a", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/temperature/TempStatisticsDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", "b", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "c", "Ljava/lang/Long;", "timeStamp", "Ljava/lang/String;", "defaultDate", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "e", "()Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "chartHelper", "Lcom/huami/sleep/util/ViewSlideWrapper;", "g", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TemperatureStatisticsFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "time_mode";

    @NotNull
    private static final String h = "time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TimeMode timeMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String defaultDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureStatisticsFragment$Companion;", "", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureStatisticsFragment;", "getInstance", "", "ARGS_TIME", "Ljava/lang/String;", "ARGS_TIME_MODE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureStatisticsFragment getInstance(@NotNull TimeMode timeMode, long time) {
            TemperatureStatisticsFragment temperatureStatisticsFragment = new TemperatureStatisticsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("time_mode", timeMode.name());
            bundle.putLong("time", time);
            Unit unit = Unit.INSTANCE;
            temperatureStatisticsFragment.setArguments(bundle);
            return temperatureStatisticsFragment;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper invoke() {
            Context context = TemperatureStatisticsFragment.this.getContext();
            if (context == null) {
                return null;
            }
            return new ChartHelper(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lkotlin/Pair;", "", "high", "low", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public b() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            TemperatureStatisticsFragment.this.g().slide(index.getCenterX());
            TemperatureStatisticsFragment.this.d(pair, pair2, true, str);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
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
            TemperatureStatisticsFragment.this.g().reset();
            BarChartVo<Number> value = TemperatureStatisticsFragment.this.f().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            TemperatureStatisticsFragment temperatureStatisticsFragment = TemperatureStatisticsFragment.this;
            BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(value);
            temperatureStatisticsFragment.d(rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), false, value.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TemperatureStatisticsFragment.this.g().reset();
            BarChartVo<Number> value = TemperatureStatisticsFragment.this.f().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            TemperatureStatisticsFragment temperatureStatisticsFragment = TemperatureStatisticsFragment.this;
            BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(value);
            temperatureStatisticsFragment.d(rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), false, value.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ViewSlideWrapper> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = TemperatureStatisticsFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.value_container), ViewUtils.dp2px(TemperatureStatisticsFragment.this.getContext(), 8.0f), TemperatureStatisticsFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(TemperatureStatisticsFragment.this.getContext(), 15.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureStatisticsFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureStatisticsFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempStatisticsDetailViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.temperature.TemperatureStatisticsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.temperature.TempStatisticsDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempStatisticsDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempStatisticsDetailViewModel.class), function0, objArr);
            }
        });
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Pair<Float, Float> abnormalPair, Pair<Float, Float> normalPair, boolean selected, String dateStr) {
        String string;
        Float first = normalPair == null ? null : normalPair.getFirst();
        if (first == null) {
            first = abnormalPair == null ? null : abnormalPair.getFirst();
        }
        Float second = abnormalPair == null ? null : abnormalPair.getSecond();
        if (second == null) {
            second = normalPair == null ? null : normalPair.getSecond();
        }
        if ((first == null && second == null) ? false : true) {
            if (Intrinsics.areEqual(first, second)) {
                View view = getView();
                ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.value))).setText(DataExKt.formatWithDecimal(Float.valueOf(TempUtils.INSTANCE.getTempDisplayFloat(first.floatValue())), 1));
            } else {
                View view2 = getView();
                View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.value);
                TempUtils tempUtils = TempUtils.INSTANCE;
                ((TypefaceTextView) viewFindViewById).setText(getString(com.huami.watch.hmwatchmanager.R.string.value_range, DataExKt.formatWithDecimal(Float.valueOf(tempUtils.getTempDisplayFloat(first.floatValue())), 1), DataExKt.formatWithDecimal(Float.valueOf(tempUtils.getTempDisplayFloat(second.floatValue())), 1)));
            }
            View view3 = getView();
            ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.unit), true);
            View view4 = getView();
            TypefaceTextView typefaceTextView = (TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.unit));
            int tempUnit = TempUtils.INSTANCE.getTempUnit();
            if (tempUnit != 0) {
                string = tempUnit != 1 ? "" : getString(com.huami.watch.hmwatchmanager.R.string.temperature_unit_f);
            } else {
                string = getString(com.huami.watch.hmwatchmanager.R.string.unit_temp);
            }
            typefaceTextView.setText(string);
        } else {
            View view5 = getView();
            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.value))).setText(getString(com.huami.watch.hmwatchmanager.R.string.value_invalid));
            View view6 = getView();
            ViewExKt.setVisible(view6 == null ? null : view6.findViewById(R.id.unit), false);
        }
        View view7 = getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.time));
        if (dateStr == null) {
            dateStr = this.defaultDate;
        }
        typefaceTextView2.setText(dateStr);
        if (!selected) {
            View view8 = getView();
            ((ConstraintLayout) (view8 != null ? view8.findViewById(R.id.value_container) : null)).setBackgroundColor(0);
        } else {
            View view9 = getView();
            ConstraintLayout constraintLayout = (ConstraintLayout) (view9 != null ? view9.findViewById(R.id.value_container) : null);
            constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), com.huami.watch.hmwatchmanager.R.drawable.slp_info_rect_tip_bg));
        }
    }

    private final ChartHelper e() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempStatisticsDetailViewModel f() {
        return (TempStatisticsDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper g() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void h() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string2 = arguments.getString("time_mode");
            if (string2 != null) {
                TimeMode timeModeValueOf = TimeMode.valueOf(string2);
                this.timeMode = timeModeValueOf;
                int i = timeModeValueOf == null ? -1 : WhenMappings.$EnumSwitchMapping$0[timeModeValueOf.ordinal()];
                if (i == 1) {
                    string = getString(com.huami.watch.hmwatchmanager.R.string.temperature_statistics_week);
                } else if (i != 2) {
                    string = i != 3 ? "" : getString(com.huami.watch.hmwatchmanager.R.string.temperature_statistics_year);
                } else {
                    string = getString(com.huami.watch.hmwatchmanager.R.string.temperature_statistics_month);
                }
                View view = getView();
                ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.statistics_title))).setText(string);
            }
            this.timeStamp = Long.valueOf(arguments.getLong("time"));
        }
        TempStatisticsDetailViewModel tempStatisticsDetailViewModelF = f();
        tempStatisticsDetailViewModelF.getStatisticsInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: gn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsFragment.i(this.a, (TempStatisticsInfo) obj);
            }
        });
        tempStatisticsDetailViewModelF.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: fn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsFragment.j(this.a, (BarChartVo) obj);
            }
        });
        tempStatisticsDetailViewModelF.getBarChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: en7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsFragment.k(this.a, (BarChartBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TemperatureStatisticsFragment temperatureStatisticsFragment, TempStatisticsInfo tempStatisticsInfo) {
        temperatureStatisticsFragment.m(tempStatisticsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TemperatureStatisticsFragment temperatureStatisticsFragment, BarChartVo barChartVo) {
        if (barChartVo == null) {
            return;
        }
        BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(barChartVo);
        temperatureStatisticsFragment.d(rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), false, barChartVo.getExtra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TemperatureStatisticsFragment temperatureStatisticsFragment, BarChartBuilder barChartBuilder) {
        temperatureStatisticsFragment.l(barChartBuilder);
    }

    private final void l(BarChartBuilder<Number> barChartBuilder) {
        ChartHelper chartHelperE;
        if (barChartBuilder == null || (chartHelperE = e()) == null) {
            return;
        }
        View view = getView();
        chartHelperE.refreshBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), barChartBuilder, new b(), new c(), new d());
    }

    private final void m(TempStatisticsInfo statisticsInfo) {
        Context context;
        boolean z = !statisticsInfo.isInValid();
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.statistics_container), z);
        if (!z || (context = getContext()) == null) {
            return;
        }
        View view2 = getView();
        View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.statistics_max);
        TempUtils tempUtils = TempUtils.INSTANCE;
        ((TypefaceTextView) viewFindViewById).setText(tempUtils.getTempDisplayString(context, statisticsInfo.getMax()));
        View view3 = getView();
        ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.statistics_min))).setText(tempUtils.getTempDisplayString(context, statisticsInfo.getMin()));
        View view4 = getView();
        ((TypefaceTextView) (view4 != null ? view4.findViewById(R.id.statistics_avg) : null)).setText(tempUtils.getTempDisplayString(context, statisticsInfo.getAvg()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.fragment_temperature_statistics_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.timeMode == null || this.timeStamp == null) {
            return;
        }
        f().loadData(this.timeMode, this.timeStamp.longValue());
        if (this.defaultDate == null) {
            String timeToUi = HealthDataTimeUtils.INSTANCE.getTimeToUi(new TimeParam(this.timeMode, this.timeStamp.longValue()));
            this.defaultDate = timeToUi;
            d(null, null, false, timeToUi);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        h();
    }
}
