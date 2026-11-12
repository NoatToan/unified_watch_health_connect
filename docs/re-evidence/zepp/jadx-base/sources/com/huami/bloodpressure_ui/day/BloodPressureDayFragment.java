package com.huami.bloodpressure_ui.day;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchConfig;
import com.huami.bloodpressure_core.dc.research.BloodPressureResearchVo;
import com.huami.bloodpressure_ui.BloodPressureViewModel;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.add.BloodPressureAddActivityKt;
import com.huami.bloodpressure_ui.analyse.AnalyseFragment;
import com.huami.bloodpressure_ui.analyse.AnalyseItemEntity;
import com.huami.bloodpressure_ui.chart.BloodPressureStatus;
import com.huami.bloodpressure_ui.databinding.FragmentBloodPressureDayBinding;
import com.huami.bloodpressure_ui.day.BloodPressureDayFragment;
import com.huami.bloodpressure_ui.ext.BloodPressureExKt;
import com.huami.bloodpressure_ui.ext.I18nExKt;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.bloodpressure_ui.history.BloodPressureHistoryActivityKt;
import com.huami.bloodpressure_ui.intro.BloodPressureIntroFragment;
import com.huami.bloodpressure_ui.research.BloodPressureResearchFragment;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "a", "J", "currentTimeStamp", "Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureDayBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureDayBinding;", "bind", "Lcom/huami/bloodpressure_ui/day/BloodPressureDayViewModel;", "c", "Lkotlin/Lazy;", "g", "()Lcom/huami/bloodpressure_ui/day/BloodPressureDayViewModel;", "model", "Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartFragment;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartFragment;", "dayChartFragment", "Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;", "Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;", "analyseFragment", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "f", "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "dataViewModel", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDayFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long currentTimeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty bind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private BloodPressureDayChartFragment dayChartFragment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AnalyseFragment analyseFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayFragment$Companion;", "", "", "time", "Lcom/huami/bloodpressure_ui/day/BloodPressureDayFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BloodPressureDayFragment newInstance(long time) {
            BloodPressureDayFragment bloodPressureDayFragment = new BloodPressureDayFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ARGS_TIME", time);
            Unit unit = Unit.INSTANCE;
            bloodPressureDayFragment.setArguments(bundle);
            return bloodPressureDayFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BloodPressureAddActivityKt.navigateToAddBloodPressure(BloodPressureDayFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BloodPressureHistoryActivityKt.navigateToBloodPressureHistory(BloodPressureDayFragment.this.requireContext());
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureDayFragment.class), "bind", "getBind()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureDayBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureDayFragment() {
        super(R.layout.fragment_blood_pressure_day);
        this.bind = FragmentViewBindingKt.viewBinding(new BloodPressureDayFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentBloodPressureDayBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayFragment$special$$inlined$viewModel$default$1
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
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureDayViewModel>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.day.BloodPressureDayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BloodPressureDayViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureDayViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayFragment$special$$inlined$sharedViewModel$default$1
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
        this.dataViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayFragment$special$$inlined$sharedViewModel$default$2
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

    private final FragmentBloodPressureDayBinding e() {
        return (FragmentBloodPressureDayBinding) this.bind.getValue(this, g[0]);
    }

    private final BloodPressureViewModel f() {
        return (BloodPressureViewModel) this.dataViewModel.getValue();
    }

    private final BloodPressureDayViewModel g() {
        return (BloodPressureDayViewModel) this.model.getValue();
    }

    private final void h() {
        g().getHeadStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: r00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayFragment.i(this.a, (BloodPressureStatus) obj);
            }
        });
        g().getAnalyseList().observe(getViewLifecycleOwner(), new Observer() { // from class: s00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayFragment.j(this.a, (List) obj);
            }
        });
        g().getChartList().observe(getViewLifecycleOwner(), new Observer() { // from class: t00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayFragment.k(this.a, (List) obj);
            }
        });
        f().getResearchEntity().observe(getViewLifecycleOwner(), new Observer() { // from class: q00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayFragment.l(this.a, (BloodPressureResearchVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BloodPressureDayFragment bloodPressureDayFragment, BloodPressureStatus bloodPressureStatus) {
        BloodPressureDayChartFragment bloodPressureDayChartFragment = bloodPressureDayFragment.dayChartFragment;
        if (bloodPressureDayChartFragment == null) {
            return;
        }
        bloodPressureDayChartFragment.refreshChartHeadData(bloodPressureStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodPressureDayFragment bloodPressureDayFragment, List list) {
        if (list == null || list.isEmpty()) {
            AnalyseFragment analyseFragment = bloodPressureDayFragment.analyseFragment;
            if (analyseFragment == null) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = bloodPressureDayFragment.requireActivity();
            int i = R.string.blood_pressure_unit;
            analyseFragment.setDataList(CollectionsKt__CollectionsKt.listOf((Object[]) new AnalyseItemEntity[]{new AnalyseItemEntity(null, fragmentActivityRequireActivity.getString(i), bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_avg_sbp), 0, 9, null), new AnalyseItemEntity(null, bloodPressureDayFragment.requireActivity().getString(i), bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_avg_dbp), 0, 9, null), new AnalyseItemEntity(null, bloodPressureDayFragment.requireActivity().getString(i), bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_max_sbq), 0, 9, null), new AnalyseItemEntity(null, bloodPressureDayFragment.requireActivity().getString(i), bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_max_dbq), 0, 9, null)}));
            return;
        }
        AnalyseFragment analyseFragment2 = bloodPressureDayFragment.analyseFragment;
        if (analyseFragment2 == null) {
            return;
        }
        AnalyseItemEntity[] analyseItemEntityArr = new AnalyseItemEntity[4];
        FragmentActivity fragmentActivityRequireActivity2 = bloodPressureDayFragment.requireActivity();
        int i2 = R.string.blood_pressure_unit;
        String string = fragmentActivityRequireActivity2.getString(i2);
        String string2 = bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_avg_sbp);
        Integer num = (Integer) list.get(0);
        analyseItemEntityArr[0] = new AnalyseItemEntity(num == null ? null : I18nExKt.i18n(num.intValue()), string, string2, BloodPressureExKt.getAvgSbpStatus((Integer) list.get(0)));
        String string3 = bloodPressureDayFragment.requireActivity().getString(i2);
        String string4 = bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_avg_dbp);
        Integer num2 = (Integer) list.get(1);
        analyseItemEntityArr[1] = new AnalyseItemEntity(num2 == null ? null : I18nExKt.i18n(num2.intValue()), string3, string4, BloodPressureExKt.getAvgDbpStatus((Integer) list.get(1)));
        String string5 = bloodPressureDayFragment.requireActivity().getString(i2);
        String string6 = bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_max_sbq);
        Integer num3 = (Integer) list.get(2);
        analyseItemEntityArr[2] = new AnalyseItemEntity(num3 == null ? null : I18nExKt.i18n(num3.intValue()), string5, string6, BloodPressureExKt.getMaxSbpStatus((Integer) list.get(2)));
        String string7 = bloodPressureDayFragment.requireActivity().getString(i2);
        String string8 = bloodPressureDayFragment.requireActivity().getString(R.string.blood_pressure_max_dbq);
        Integer num4 = (Integer) list.get(3);
        analyseItemEntityArr[3] = new AnalyseItemEntity(num4 != null ? I18nExKt.i18n(num4.intValue()) : null, string7, string8, BloodPressureExKt.getMaxDbpStatus((Integer) list.get(3)));
        analyseFragment2.setDataList(CollectionsKt__CollectionsKt.listOf((Object[]) analyseItemEntityArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodPressureDayFragment bloodPressureDayFragment, List list) {
        BloodPressureDayChartFragment bloodPressureDayChartFragment = bloodPressureDayFragment.dayChartFragment;
        if (bloodPressureDayChartFragment == null) {
            return;
        }
        bloodPressureDayChartFragment.refreshChartData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureDayFragment bloodPressureDayFragment, BloodPressureResearchVo bloodPressureResearchVo) {
        if (bloodPressureResearchVo == null) {
            ViewExKt.setGone(bloodPressureDayFragment.e().containerResearch, true);
            return;
        }
        BloodPressureResearchConfig config = bloodPressureResearchVo.getConfig();
        if (!(config == null ? false : Intrinsics.areEqual(config.getOnlineFlag(), Boolean.TRUE))) {
            ViewExKt.setGone(bloodPressureDayFragment.e().containerResearch, true);
        } else {
            ViewExKt.setGone(bloodPressureDayFragment.e().containerResearch, false);
            com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(bloodPressureDayFragment, R.id.container_research, BloodPressureResearchFragment.INSTANCE.newInstance(bloodPressureResearchVo));
        }
    }

    @JvmStatic
    @NotNull
    public static final BloodPressureDayFragment newInstance(long j) {
        return INSTANCE.newInstance(j);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong("ARGS_TIME"));
        long jCurrentTimeMillis = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        this.currentTimeStamp = jCurrentTimeMillis;
        BloodPressureDayChartFragment bloodPressureDayChartFragmentNewInstance = BloodPressureDayChartFragment.INSTANCE.newInstance(jCurrentTimeMillis);
        this.dayChartFragment = bloodPressureDayChartFragmentNewInstance;
        com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(this, R.id.container_chart, bloodPressureDayChartFragmentNewInstance);
        AnalyseFragment analyseFragmentNewInstance = AnalyseFragment.INSTANCE.newInstance(getResources().getString(R.string.blood_pressure_day_analyse));
        this.analyseFragment = analyseFragmentNewInstance;
        com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(this, R.id.container_analyse, analyseFragmentNewInstance);
        com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(this, R.id.container_info, BloodPressureIntroFragment.INSTANCE.newInstance());
        ViewExKt.setOnDebounceClickListener(e().ltvAdd, new a());
        ViewExKt.setOnDebounceClickListener(e().ltvHistory, new b());
        g().loadData(this.currentTimeStamp);
        h();
    }
}
