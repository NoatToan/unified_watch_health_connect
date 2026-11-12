package com.huami.bloodpressure_ui.chart;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.BloodPressureViewModel;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.chart.BloodPressureChartIntroFragment;
import com.huami.bloodpressure_ui.chart.ChartIntroButtonState;
import com.huami.bloodpressure_ui.databinding.ChartIntroFragmentBinding;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroFragment;", "Landroidx/fragment/app/Fragment;", "", "show", "", hl.k, "g", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "a", "Z", "checkBoxVisible", "Lcom/huami/bloodpressure_ui/chart/ChartIntroViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/bloodpressure_ui/chart/ChartIntroViewModel;", "viewModel", "Lcom/huami/bloodpressure_ui/databinding/ChartIntroFragmentBinding;", "c", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/bloodpressure_ui/databinding/ChartIntroFragmentBinding;", "binding", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "activityDataModel", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartIntroFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean checkBoxVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityDataModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroFragment$Companion;", "", "", "checkBoxVisible", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BloodPressureChartIntroFragment newInstance$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.newInstance(z);
        }

        @NotNull
        public final BloodPressureChartIntroFragment newInstance(boolean checkBoxVisible) {
            BloodPressureChartIntroFragment bloodPressureChartIntroFragment = new BloodPressureChartIntroFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(BloodPressureChartIntroFragmentKt.a, checkBoxVisible);
            Unit unit = Unit.INSTANCE;
            bloodPressureChartIntroFragment.setArguments(bundle);
            return bloodPressureChartIntroFragment;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureChartIntroFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ChartIntroFragmentBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureChartIntroFragment() {
        super(R.layout.chart_intro_fragment);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ChartIntroViewModel>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.chart.ChartIntroViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ChartIntroViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ChartIntroViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureChartIntroFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(ChartIntroFragmentBinding.class)));
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.activityDataModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.BloodPressureViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(BloodPressureViewModel.class), function1, objArr3);
            }
        });
    }

    private final BloodPressureViewModel d() {
        return (BloodPressureViewModel) this.activityDataModel.getValue();
    }

    private final ChartIntroFragmentBinding e() {
        return (ChartIntroFragmentBinding) this.binding.getValue(this, e[1]);
    }

    private final ChartIntroViewModel f() {
        return (ChartIntroViewModel) this.viewModel.getValue();
    }

    private final void g() {
        f().getBtnStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: tz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureChartIntroFragment.h(this.a, (ChartIntroButtonState) obj);
            }
        });
        d().getAvgLineEnable().observe(getViewLifecycleOwner(), new Observer() { // from class: uz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureChartIntroFragment.i(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BloodPressureChartIntroFragment bloodPressureChartIntroFragment, ChartIntroButtonState chartIntroButtonState) {
        if (Intrinsics.areEqual(chartIntroButtonState, ChartIntroButtonState.ChartIntroButtonUnable.INSTANCE)) {
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().switchAvgLine, true);
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().tvAvgLine, true);
        } else if (Intrinsics.areEqual(chartIntroButtonState, ChartIntroButtonState.ChartIntroButtonChecked.INSTANCE)) {
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().tvAvgLine, false);
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().switchAvgLine, false);
            bloodPressureChartIntroFragment.e().switchAvgLine.setChecked(true);
        } else {
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().switchAvgLine, false);
            ViewExKt.setGone(bloodPressureChartIntroFragment.e().tvAvgLine, false);
            bloodPressureChartIntroFragment.e().switchAvgLine.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BloodPressureChartIntroFragment bloodPressureChartIntroFragment, Boolean bool) {
        if (bloodPressureChartIntroFragment.checkBoxVisible) {
            bloodPressureChartIntroFragment.f().setBtnStatusChecked(bool.booleanValue());
        } else {
            bloodPressureChartIntroFragment.f().setBtnStatusEnable(false);
        }
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.checkBoxVisible = arguments == null ? false : arguments.getBoolean(BloodPressureChartIntroFragmentKt.a);
        e().switchAvgLine.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BloodPressureChartIntroFragment.j(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodPressureChartIntroFragment bloodPressureChartIntroFragment, CompoundButton compoundButton, boolean z) {
        BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BPAVE_CURVE_C()));
        bloodPressureChartIntroFragment.f().setBtnStatusChecked(z);
        bloodPressureChartIntroFragment.d().setAvgLineEnable(z);
    }

    private final void k(boolean show) {
        ViewExKt.setGone(e().containerChartInfoShort, !show);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        g();
        k(true);
    }
}
