package com.huami.bloodpressure_ui.month;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureDateData;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.BloodPressureViewModel;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.chart.BloodPressureAvgDataStyleStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureChartBuilder;
import com.huami.bloodpressure_ui.chart.BloodPressureChartHelper;
import com.huami.bloodpressure_ui.chart.BloodPressureChartIntroManager;
import com.huami.bloodpressure_ui.chart.BloodPressureChartTextSizeStyle;
import com.huami.bloodpressure_ui.chart.BloodPressureChartTextSizeStyleKt;
import com.huami.bloodpressure_ui.chart.BloodPressureDataStyleStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureEmptyStyleStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureValueStyleVo;
import com.huami.bloodpressure_ui.databinding.BloodPressureDayChartFragmentBinding;
import com.huami.bloodpressure_ui.databinding.ChartEmptyStatuFragmentBinding;
import com.huami.bloodpressure_ui.ext.TimeEx;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.bloodpressure_ui.month.BloodPressureMonthChartFragment;
import com.huami.chart.util.Index;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0010\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001d\u0010+\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/huami/bloodpressure_ui/month/BloodPressureMonthChartFragment;", "Landroidx/fragment/app/Fragment;", "", hl.k, "", "key", "Lcom/huami/chart/util/Index;", "index", DTransferConstants.SEARCH_KEY, "(Ljava/lang/Long;Lcom/huami/chart/util/Index;)V", "i", "(Ljava/lang/Long;)Lcom/huami/chart/util/Index;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "dateData", "refreshChartData", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "dayStatus", "refreshChartHeadData", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "chartHelper", "b", "J", "currentTimeStamp", "Lcom/huami/bloodpressure_ui/month/BloodPressureMonthChartViewModel;", "c", z.j, "()Lcom/huami/bloodpressure_ui/month/BloodPressureMonthChartViewModel;", "viewModel", "Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;", GoogleApiAvailabilityLight.a, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;", "binding", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "e", "h", "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "dataViewModel", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureMonthChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long currentTimeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/month/BloodPressureMonthChartFragment$Companion;", "", "", "timeStamp", "Lcom/huami/bloodpressure_ui/month/BloodPressureMonthChartFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodPressureMonthChartFragment newInstance(long timeStamp) {
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment = new BloodPressureMonthChartFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ARG_TIME", timeStamp);
            Unit unit = Unit.INSTANCE;
            bloodPressureMonthChartFragment.setArguments(bundle);
            return bloodPressureMonthChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BloodPressureChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureChartHelper getA() {
            Context context = BloodPressureMonthChartFragment.this.getContext();
            if (context == null) {
                return null;
            }
            return new BloodPressureChartHelper(context, ViewExKt.dp2px(context, 6.0f), null, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lkotlin/Pair;", "", "highValue", "lowValue", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public b() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment = BloodPressureMonthChartFragment.this;
            bloodPressureMonthChartFragment.q(Long.valueOf(bloodPressureMonthChartFragment.currentTimeStamp), index);
            BloodPressureValueStyleVo bpStyleValueString = BloodPressureChartTextSizeStyleKt.getBpStyleValueString(pair, BloodPressureMonthChartFragment.this.requireContext());
            BloodPressureValueStyleVo bpStyleValueString2 = BloodPressureChartTextSizeStyleKt.getBpStyleValueString(pair2, BloodPressureMonthChartFragment.this.requireContext());
            if (str == null) {
                return;
            }
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment2 = BloodPressureMonthChartFragment.this;
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_MONTH_DIVISION_C()));
            bloodPressureMonthChartFragment2.j().setStatus(new BloodPressureDataStyleStatus(str, bpStyleValueString, bpStyleValueString2, true, TimeFormatEx.INSTANCE.parseYMDToLong(str)));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "emptyIndex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Index, Unit> {
        public d() {
            super(1);
        }

        public final void a(@Nullable Index index) {
            if (index == null) {
                return;
            }
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment = BloodPressureMonthChartFragment.this;
            TimeEx timeEx = TimeEx.INSTANCE;
            bloodPressureMonthChartFragment.j().setStatus(new BloodPressureEmptyStyleStatus(TimeFormatEx.INSTANCE.formatTimeYMD(timeEx.nextDay(timeEx.getFirstDayOfMonthTime(bloodPressureMonthChartFragment.currentTimeStamp), index.getPosiIndex().getIndex() - 1)), false, null, 4, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "dbpValue", "sbpValue", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function4<Index, Float, Float, String, Unit> {
        public e() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Float f, @Nullable Float f2, @Nullable String str) {
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment = BloodPressureMonthChartFragment.this;
            bloodPressureMonthChartFragment.q(Long.valueOf(bloodPressureMonthChartFragment.currentTimeStamp), index);
            if (f != null && f2 != null && str != null) {
                BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_MONTH_DIVISION_C()));
                BloodPressureMonthChartFragment.this.j().setStatus(new BloodPressureAvgDataStyleStatus(str, new BloodPressureValueStyleVo(String.valueOf((int) f2.floatValue()), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), new BloodPressureValueStyleVo(String.valueOf((int) f.floatValue()), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), true, TimeFormatEx.INSTANCE.parseYMDToLong(str)));
                return;
            }
            TimeEx timeEx = TimeEx.INSTANCE;
            long jNextDay = timeEx.nextDay(timeEx.getFirstDayOfMonthTime(BloodPressureMonthChartFragment.this.currentTimeStamp), index.getPosiIndex().getIndex() - 1);
            BloodPressureMonthChartViewModel bloodPressureMonthChartViewModelJ = BloodPressureMonthChartFragment.this.j();
            String timeYMD = TimeFormatEx.INSTANCE.formatTimeYMD(jNextDay);
            BloodPressureMonthChartFragment bloodPressureMonthChartFragment2 = BloodPressureMonthChartFragment.this;
            int i = R.string.blood_pressure_empty;
            bloodPressureMonthChartViewModelJ.setStatus(new BloodPressureAvgDataStyleStatus(timeYMD, new BloodPressureValueStyleVo(bloodPressureMonthChartFragment2.getString(i), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), new BloodPressureValueStyleVo(BloodPressureMonthChartFragment.this.getString(i), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), false, Long.valueOf(jNextDay)));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Float f, Float f2, String str) {
            a(index, f, f2, str);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureMonthChartFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureMonthChartFragment() {
        super(R.layout.blood_pressure_statistics_chart_fragment);
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.month.BloodPressureMonthChartFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureMonthChartViewModel>() { // from class: com.huami.bloodpressure_ui.month.BloodPressureMonthChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.month.BloodPressureMonthChartViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BloodPressureMonthChartViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureMonthChartViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureMonthChartFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(BloodPressureDayChartFragmentBinding.class)));
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.month.BloodPressureMonthChartFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.dataViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.month.BloodPressureMonthChartFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.BloodPressureViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BloodPressureViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(BloodPressureViewModel.class), function1, objArr3);
            }
        });
    }

    private final BloodPressureDayChartFragmentBinding f() {
        return (BloodPressureDayChartFragmentBinding) this.binding.getValue(this, f[2]);
    }

    private final BloodPressureChartHelper g() {
        return (BloodPressureChartHelper) this.chartHelper.getValue();
    }

    private final BloodPressureViewModel h() {
        return (BloodPressureViewModel) this.dataViewModel.getValue();
    }

    private final Index i(Long key) {
        if (key == null) {
            return null;
        }
        return h().getMonthIndex(key.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodPressureMonthChartViewModel j() {
        return (BloodPressureMonthChartViewModel) this.viewModel.getValue();
    }

    private final void k() {
        j().getCurrentStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: o10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMonthChartFragment.m(this.a, (BloodPressureStatus) obj);
            }
        });
        j().getMultiLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: q10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMonthChartFragment.p(this.a, (Pair) obj);
            }
        });
        h().getAvgLineEnable().observe(getViewLifecycleOwner(), new Observer() { // from class: p10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureMonthChartFragment.l(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureMonthChartFragment bloodPressureMonthChartFragment, Boolean bool) {
        bloodPressureMonthChartFragment.j().setAvgLineEnable(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final BloodPressureMonthChartFragment bloodPressureMonthChartFragment, final BloodPressureStatus bloodPressureStatus) {
        if (bloodPressureStatus instanceof BloodPressureEmptyStyleStatus) {
            ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding = bloodPressureMonthChartFragment.f().containerStatus;
            chartEmptyStatuFragmentBinding.tvDbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_dbp));
            chartEmptyStatuFragmentBinding.tvSbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_sbp));
            AppCompatTextView appCompatTextView = chartEmptyStatuFragmentBinding.tvDbpValue;
            int i = R.string.blood_pressure_empty;
            appCompatTextView.setText(bloodPressureMonthChartFragment.getString(i));
            BloodPressureEmptyStyleStatus bloodPressureEmptyStyleStatus = (BloodPressureEmptyStyleStatus) bloodPressureStatus;
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding.tvDbpValue, bloodPressureEmptyStyleStatus.getTextSizeStyle().getTextSizeStyle());
            chartEmptyStatuFragmentBinding.tvSbpValue.setText(bloodPressureMonthChartFragment.getString(i));
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding.tvSbpValue, bloodPressureEmptyStyleStatus.getTextSizeStyle().getTextSizeStyle());
            chartEmptyStatuFragmentBinding.tvStatusTime.setText(bloodPressureEmptyStyleStatus.getDateString());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding.tvStatusDetail, !bloodPressureEmptyStyleStatus.getShowDetail());
            return;
        }
        if (bloodPressureStatus instanceof BloodPressureAvgDataStyleStatus) {
            ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding2 = bloodPressureMonthChartFragment.f().containerStatus;
            chartEmptyStatuFragmentBinding2.tvDbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_avg_dbp));
            chartEmptyStatuFragmentBinding2.tvSbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_avg_sbp));
            BloodPressureAvgDataStyleStatus bloodPressureAvgDataStyleStatus = (BloodPressureAvgDataStyleStatus) bloodPressureStatus;
            chartEmptyStatuFragmentBinding2.tvSbpValue.setText(bloodPressureAvgDataStyleStatus.getFirstValue().getValue());
            chartEmptyStatuFragmentBinding2.tvDbpValue.setText(bloodPressureAvgDataStyleStatus.getSecondValue().getValue());
            BloodPressureChartTextSizeStyle num2_chart_style = BloodPressureChartTextSizeStyleKt.checkStyleEnable(bloodPressureAvgDataStyleStatus.getFirstValue().getTextStyle(), bloodPressureAvgDataStyleStatus.getSecondValue().getTextStyle(), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()) ? BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE() : BloodPressureChartTextSizeStyleKt.getNUM4_CHART_STYLE();
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding2.tvSbpValue, num2_chart_style.getTextSizeStyle());
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding2.tvDbpValue, num2_chart_style.getTextSizeStyle());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding2.tvStatusDetail, !bloodPressureAvgDataStyleStatus.getShowDetail());
            chartEmptyStatuFragmentBinding2.tvStatusDetail.setOnClickListener(new View.OnClickListener() { // from class: m10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodPressureMonthChartFragment.n(bloodPressureStatus, bloodPressureMonthChartFragment, view);
                }
            });
            chartEmptyStatuFragmentBinding2.tvStatusTime.setText(bloodPressureAvgDataStyleStatus.getDateString());
            return;
        }
        if (bloodPressureStatus instanceof BloodPressureDataStyleStatus) {
            ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding3 = bloodPressureMonthChartFragment.f().containerStatus;
            chartEmptyStatuFragmentBinding3.tvDbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_dbp));
            chartEmptyStatuFragmentBinding3.tvSbp.setText(bloodPressureMonthChartFragment.getString(R.string.blood_pressure_sbp));
            BloodPressureDataStyleStatus bloodPressureDataStyleStatus = (BloodPressureDataStyleStatus) bloodPressureStatus;
            chartEmptyStatuFragmentBinding3.tvSbpValue.setText(bloodPressureDataStyleStatus.getFirstValue().getValue());
            chartEmptyStatuFragmentBinding3.tvDbpValue.setText(bloodPressureDataStyleStatus.getSecondValue().getValue());
            BloodPressureChartTextSizeStyle num2_chart_style2 = BloodPressureChartTextSizeStyleKt.checkStyleEnable(bloodPressureDataStyleStatus.getFirstValue().getTextStyle(), bloodPressureDataStyleStatus.getSecondValue().getTextStyle(), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()) ? BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE() : BloodPressureChartTextSizeStyleKt.getNUM4_CHART_STYLE();
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding3.tvSbpValue, num2_chart_style2.getTextSizeStyle());
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding3.tvDbpValue, num2_chart_style2.getTextSizeStyle());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding3.tvStatusDetail, !bloodPressureDataStyleStatus.getShowDetail());
            chartEmptyStatuFragmentBinding3.tvStatusDetail.setOnClickListener(new View.OnClickListener() { // from class: n10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodPressureMonthChartFragment.o(bloodPressureStatus, bloodPressureMonthChartFragment, view);
                }
            });
            chartEmptyStatuFragmentBinding3.tvStatusTime.setText(bloodPressureDataStyleStatus.getDateString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BloodPressureStatus bloodPressureStatus, BloodPressureMonthChartFragment bloodPressureMonthChartFragment, View view) {
        Long timeStamp = bloodPressureStatus.getTimeStamp();
        if (timeStamp == null) {
            return;
        }
        bloodPressureMonthChartFragment.h().setDayTimeStamp(timeStamp.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BloodPressureStatus bloodPressureStatus, BloodPressureMonthChartFragment bloodPressureMonthChartFragment, View view) {
        Long timeStamp = bloodPressureStatus.getTimeStamp();
        if (timeStamp == null) {
            return;
        }
        bloodPressureMonthChartFragment.h().setDayTimeStamp(timeStamp.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(BloodPressureMonthChartFragment bloodPressureMonthChartFragment, Pair pair) {
        BloodPressureChartBuilder bloodPressureChartBuilder = (BloodPressureChartBuilder) pair.getFirst();
        BloodPressureChartHelper bloodPressureChartHelperG = bloodPressureMonthChartFragment.g();
        if (bloodPressureChartHelperG == null) {
            return;
        }
        bloodPressureChartHelperG.refreshAnimationBarChart(bloodPressureMonthChartFragment.f().containerChart, bloodPressureChartBuilder, bloodPressureMonthChartFragment.new b(), c.a, bloodPressureMonthChartFragment.new d(), bloodPressureMonthChartFragment.i(Long.valueOf(bloodPressureMonthChartFragment.currentTimeStamp)), ((Boolean) pair.getSecond()).booleanValue(), bloodPressureMonthChartFragment.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Long key, Index index) {
        if (key == null) {
            return;
        }
        h().saveMonthIndex(key.longValue(), index);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong("ARG_TIME"));
        this.currentTimeStamp = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        j().setOffset(ViewExKt.dp2px(requireContext(), 1.0f));
        k();
        j().setTimeStamp(this.currentTimeStamp);
        com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(this, R.id.container_chart_info, BloodPressureChartIntroManager.INSTANCE.getChartIntroFragment(requireActivity(), true));
    }

    public final void refreshChartData(@Nullable List<BloodPressureDateData> dateData) {
        j().setChartList(dateData);
    }

    public final void refreshChartHeadData(@Nullable BloodPressureStatus dayStatus) {
        if (dayStatus == null) {
            return;
        }
        j().setStatus(dayStatus);
    }
}
