package com.huami.bloodpressure_ui.tab;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.databinding.FragmentBloodPressureTabBinding;
import com.huami.bloodpressure_ui.tab.BloodPressureTabFragment;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodpressure_ui/tab/BloodPressureTabFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/bloodpressure_ui/tab/BloodPressureTabViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_ui/tab/BloodPressureTabViewModel;", "tabViewModel", "Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureTabBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "c", "()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureTabBinding;", "binding", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureTabFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            iArr[TimeMode.DAY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureTabFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/FragmentBloodPressureTabBinding;"));
        c = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureTabFragment() {
        super(R.layout.fragment_blood_pressure_tab);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.tab.BloodPressureTabFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.tabViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureTabViewModel>() { // from class: com.huami.bloodpressure_ui.tab.BloodPressureTabFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.tab.BloodPressureTabViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BloodPressureTabViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureTabViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureTabFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentBloodPressureTabBinding.class)));
    }

    private final FragmentBloodPressureTabBinding c() {
        return (FragmentBloodPressureTabBinding) this.binding.getValue(this, c[1]);
    }

    private final BloodPressureTabViewModel d() {
        return (BloodPressureTabViewModel) this.tabViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BloodPressureTabFragment bloodPressureTabFragment, TimeMode timeMode) {
        int i = timeMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()];
        if (i == 1) {
            bloodPressureTabFragment.c().tabWeek.setChecked(true);
            return;
        }
        if (i == 2) {
            bloodPressureTabFragment.c().tabMonth.setChecked(true);
        } else if (i == 3) {
            bloodPressureTabFragment.c().tabYear.setChecked(true);
        } else {
            if (i != 4) {
                return;
            }
            bloodPressureTabFragment.c().tabDay.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BloodPressureTabFragment bloodPressureTabFragment, RadioGroup radioGroup, int i) {
        if (i == bloodPressureTabFragment.c().tabDay.getId()) {
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_DAY_C()));
            bloodPressureTabFragment.d().setTimeMode(TimeMode.DAY);
            return;
        }
        if (i == bloodPressureTabFragment.c().tabWeek.getId()) {
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_WEEK_C()));
            bloodPressureTabFragment.d().setTimeMode(TimeMode.WEEK);
        } else if (i == bloodPressureTabFragment.c().tabMonth.getId()) {
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_MONTH_C()));
            bloodPressureTabFragment.d().setTimeMode(TimeMode.MONTH);
        } else if (i == bloodPressureTabFragment.c().tabYear.getId()) {
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_YEAR_C()));
            bloodPressureTabFragment.d().setTimeMode(TimeMode.YEAR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d().getCurrentTimeMode().observe(getViewLifecycleOwner(), new Observer() { // from class: k20
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureTabFragment.e(this.a, (TimeMode) obj);
            }
        });
        c().tabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: j20
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                BloodPressureTabFragment.f(this.a, radioGroup, i);
            }
        });
    }
}
