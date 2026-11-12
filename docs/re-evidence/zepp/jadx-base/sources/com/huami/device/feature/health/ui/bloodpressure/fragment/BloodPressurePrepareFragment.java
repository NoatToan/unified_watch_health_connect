package com.huami.device.feature.health.ui.bloodpressure.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.NavController;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressurePrepareFragment;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressurePrepareFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressurePrepareFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressurePrepareFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressurePrepareFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    private final BloodPressureCorrectViewModel c() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BloodPressurePrepareFragment bloodPressurePrepareFragment, View view) {
        if (bloodPressurePrepareFragment.c().checkDeviceConnect()) {
            FragmentKt.findNavController(bloodPressurePrepareFragment).navigate(R.id.prepare_to_guide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BloodPressurePrepareFragment bloodPressurePrepareFragment, View view) {
        if (bloodPressurePrepareFragment.c().checkDeviceConnect()) {
            NavController navControllerFindNavController = FragmentKt.findNavController(bloodPressurePrepareFragment);
            int i = R.id.prepare_to_measure;
            Bundle bundle = new Bundle();
            bundle.putBoolean(BloodPressureMeasureFragment.NEED_REST_PARAM, false);
            Unit unit = Unit.INSTANCE;
            navControllerFindNavController.navigate(i, bundle);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blood_pressure_prepare, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_to_guide).setOnClickListener(new View.OnClickListener() { // from class: d20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressurePrepareFragment.d(this.a, view2);
            }
        });
        view.findViewById(R.id.btn_to_measure).setOnClickListener(new View.OnClickListener() { // from class: e20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressurePrepareFragment.e(this.a, view2);
            }
        });
    }
}
