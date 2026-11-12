package com.huami.bloodpressure_ui.chart;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.BloodPressureViewModel;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.chart.BloodPressureChartIntroLongFragment;
import com.huami.bloodpressure_ui.chart.ChartIntroButtonState;
import com.huami.bloodpressure_ui.databinding.FragmentChartIntroLongBinding;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroLongFragment;", "Landroidx/fragment/app/Fragment;", "", "g", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "a", "Z", "checkBoxVisible", "Lcom/huami/bloodpressure_ui/databinding/FragmentChartIntroLongBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/bloodpressure_ui/databinding/FragmentChartIntroLongBinding;", "binding", "Lcom/huami/bloodpressure_ui/chart/ChartIntroViewModel;", "c", "Lkotlin/Lazy;", "f", "()Lcom/huami/bloodpressure_ui/chart/ChartIntroViewModel;", "chartInfoViewModel", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "activityDataModel", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartIntroLongFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean checkBoxVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartInfoViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityDataModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroLongFragment$Companion;", "", "", "checkBoxVisible", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartIntroLongFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BloodPressureChartIntroLongFragment newInstance$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.newInstance(z);
        }

        @NotNull
        public final BloodPressureChartIntroLongFragment newInstance(boolean checkBoxVisible) {
            BloodPressureChartIntroLongFragment bloodPressureChartIntroLongFragment = new BloodPressureChartIntroLongFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(BloodPressureChartIntroLongFragmentKt.a, checkBoxVisible);
            Unit unit = Unit.INSTANCE;
            bloodPressureChartIntroLongFragment.setArguments(bundle);
            return bloodPressureChartIntroLongFragment;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureChartIntroLongFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/FragmentChartIntroLongBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureChartIntroLongFragment() {
        super(R.layout.fragment_chart_intro_long);
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureChartIntroLongFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentChartIntroLongBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroLongFragment$special$$inlined$viewModel$default$1
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
        this.chartInfoViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ChartIntroViewModel>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroLongFragment$special$$inlined$viewModel$default$2
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
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroLongFragment$special$$inlined$sharedViewModel$default$1
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
        this.activityDataModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartIntroLongFragment$special$$inlined$sharedViewModel$default$2
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

    private final FragmentChartIntroLongBinding e() {
        return (FragmentChartIntroLongBinding) this.binding.getValue(this, e[0]);
    }

    private final ChartIntroViewModel f() {
        return (ChartIntroViewModel) this.chartInfoViewModel.getValue();
    }

    private final void g() {
        f().getBtnStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: wz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureChartIntroLongFragment.h(this.a, (ChartIntroButtonState) obj);
            }
        });
        d().getAvgLineEnable().observe(getViewLifecycleOwner(), new Observer() { // from class: xz
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureChartIntroLongFragment.i(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BloodPressureChartIntroLongFragment bloodPressureChartIntroLongFragment, ChartIntroButtonState chartIntroButtonState) {
        if (Intrinsics.areEqual(chartIntroButtonState, ChartIntroButtonState.ChartIntroButtonUnable.INSTANCE)) {
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().switchAvgLineLong, true);
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().tvAvgLineLong, true);
        } else if (Intrinsics.areEqual(chartIntroButtonState, ChartIntroButtonState.ChartIntroButtonChecked.INSTANCE)) {
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().tvAvgLineLong, false);
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().switchAvgLineLong, false);
            bloodPressureChartIntroLongFragment.e().switchAvgLineLong.setChecked(true);
        } else {
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().switchAvgLineLong, false);
            ViewExKt.setGone(bloodPressureChartIntroLongFragment.e().tvAvgLineLong, false);
            bloodPressureChartIntroLongFragment.e().switchAvgLineLong.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BloodPressureChartIntroLongFragment bloodPressureChartIntroLongFragment, Boolean bool) {
        if (bloodPressureChartIntroLongFragment.checkBoxVisible) {
            bloodPressureChartIntroLongFragment.f().setBtnStatusChecked(bool.booleanValue());
        } else {
            bloodPressureChartIntroLongFragment.f().setBtnStatusEnable(false);
        }
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.checkBoxVisible = arguments == null ? false : arguments.getBoolean(BloodPressureChartIntroLongFragmentKt.a);
        e().switchAvgLineLong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BloodPressureChartIntroLongFragment.j(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BloodPressureChartIntroLongFragment bloodPressureChartIntroLongFragment, CompoundButton compoundButton, boolean z) {
        BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BPAVE_CURVE_C()));
        bloodPressureChartIntroLongFragment.f().setBtnStatusChecked(z);
        bloodPressureChartIntroLongFragment.d().setAvgLineEnable(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        g();
    }
}
