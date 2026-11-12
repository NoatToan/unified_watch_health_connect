package com.huami.device.feature.health.ui.bloodpressure.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureCorrectFragment;
import com.huami.device.feature.health.ui.bloodpressure.model.BloodPressureCorrectPageStatus;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.loc.z;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureCorrectFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initViewModel", "", "title", "msg", z.j, "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStop", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureCorrectFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureCorrectFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureCorrectFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    private final BloodPressureCorrectViewModel f() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BloodPressureCorrectFragment bloodPressureCorrectFragment, View view) {
        if (bloodPressureCorrectFragment.f().checkDeviceConnect()) {
            bloodPressureCorrectFragment.f().watchCorrect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BloodPressureCorrectFragment bloodPressureCorrectFragment, View view) {
        FragmentActivity activity = bloodPressureCorrectFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BloodPressureCorrectFragment bloodPressureCorrectFragment, BloodPressureCorrectPageStatus bloodPressureCorrectPageStatus) {
        View view = bloodPressureCorrectFragment.getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.tips));
        BloodPressureCorrectPageStatus.Success success = BloodPressureCorrectPageStatus.Success.INSTANCE;
        textView.setVisibility(Intrinsics.areEqual(bloodPressureCorrectPageStatus, success) ? 0 : 8);
        if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.Tip.INSTANCE)) {
            View view2 = bloodPressureCorrectFragment.getView();
            ((Button) (view2 == null ? null : view2.findViewById(R.id.btn_next))).setVisibility(0);
            View view3 = bloodPressureCorrectFragment.getView();
            ((Button) (view3 == null ? null : view3.findViewById(R.id.btn_finish))).setVisibility(8);
            View view4 = bloodPressureCorrectFragment.getView();
            ((TextView) (view4 == null ? null : view4.findViewById(R.id.measure_title))).setText(bloodPressureCorrectPageStatus.getTitle());
            View view5 = bloodPressureCorrectFragment.getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.measure_summary))).setText(bloodPressureCorrectPageStatus.getSummary());
            View view6 = bloodPressureCorrectFragment.getView();
            ((ImageView) (view6 != null ? view6.findViewById(R.id.watch_img) : null)).setImageResource(bloodPressureCorrectPageStatus.getImg());
            return;
        }
        if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.Start.INSTANCE)) {
            View view7 = bloodPressureCorrectFragment.getView();
            ((Button) (view7 == null ? null : view7.findViewById(R.id.btn_next))).setVisibility(8);
            View view8 = bloodPressureCorrectFragment.getView();
            ((Button) (view8 == null ? null : view8.findViewById(R.id.btn_finish))).setVisibility(8);
            View view9 = bloodPressureCorrectFragment.getView();
            ((TextView) (view9 == null ? null : view9.findViewById(R.id.measure_title))).setText(bloodPressureCorrectPageStatus.getTitle());
            View view10 = bloodPressureCorrectFragment.getView();
            ((TextView) (view10 == null ? null : view10.findViewById(R.id.measure_summary))).setText(bloodPressureCorrectPageStatus.getSummary());
            View view11 = bloodPressureCorrectFragment.getView();
            ((ImageView) (view11 != null ? view11.findViewById(R.id.watch_img) : null)).setImageResource(bloodPressureCorrectPageStatus.getImg());
            return;
        }
        if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.Ing.INSTANCE)) {
            View view12 = bloodPressureCorrectFragment.getView();
            ((Button) (view12 == null ? null : view12.findViewById(R.id.btn_next))).setVisibility(8);
            View view13 = bloodPressureCorrectFragment.getView();
            ((Button) (view13 == null ? null : view13.findViewById(R.id.btn_finish))).setVisibility(8);
            View view14 = bloodPressureCorrectFragment.getView();
            ((TextView) (view14 == null ? null : view14.findViewById(R.id.measure_title))).setText(bloodPressureCorrectPageStatus.getTitle());
            View view15 = bloodPressureCorrectFragment.getView();
            ((TextView) (view15 == null ? null : view15.findViewById(R.id.measure_summary))).setText(bloodPressureCorrectPageStatus.getSummary());
            View view16 = bloodPressureCorrectFragment.getView();
            ((ImageView) (view16 != null ? view16.findViewById(R.id.watch_img) : null)).setImageResource(bloodPressureCorrectPageStatus.getImg());
            return;
        }
        if (!Intrinsics.areEqual(bloodPressureCorrectPageStatus, success)) {
            if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.Fail.INSTANCE)) {
                bloodPressureCorrectFragment.j(R.string.blood_pressure_correct_fail, R.string.blood_pressure_correct_fail_msg);
                return;
            } else if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.CheckConnect.INSTANCE)) {
                bloodPressureCorrectFragment.f().checkDeviceConnect();
                return;
            } else {
                if (Intrinsics.areEqual(bloodPressureCorrectPageStatus, BloodPressureCorrectPageStatus.CANCEL.INSTANCE)) {
                    bloodPressureCorrectFragment.l();
                    return;
                }
                return;
            }
        }
        View view17 = bloodPressureCorrectFragment.getView();
        ((Button) (view17 == null ? null : view17.findViewById(R.id.btn_next))).setVisibility(8);
        View view18 = bloodPressureCorrectFragment.getView();
        ((Button) (view18 == null ? null : view18.findViewById(R.id.btn_finish))).setVisibility(0);
        View view19 = bloodPressureCorrectFragment.getView();
        ((TextView) (view19 == null ? null : view19.findViewById(R.id.measure_title))).setText(bloodPressureCorrectPageStatus.getTitle());
        View view20 = bloodPressureCorrectFragment.getView();
        ((TextView) (view20 == null ? null : view20.findViewById(R.id.measure_summary))).setText(bloodPressureCorrectPageStatus.getSummary());
        View view21 = bloodPressureCorrectFragment.getView();
        ((ImageView) (view21 != null ? view21.findViewById(R.id.watch_img) : null)).setImageResource(bloodPressureCorrectPageStatus.getImg());
    }

    private final void initView() {
        View view = getView();
        ((Button) (view == null ? null : view.findViewById(R.id.btn_next))).setOnClickListener(new View.OnClickListener() { // from class: j00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressureCorrectFragment.g(this.a, view2);
            }
        });
        View view2 = getView();
        ((Button) (view2 != null ? view2.findViewById(R.id.btn_finish) : null)).setOnClickListener(new View.OnClickListener() { // from class: i00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BloodPressureCorrectFragment.h(this.a, view3);
            }
        });
    }

    private final void initViewModel() {
        f().getCorrectStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: k00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureCorrectFragment.i(this.a, (BloodPressureCorrectPageStatus) obj);
            }
        });
    }

    private final void j(@StringRes int title, @StringRes int msg) {
        new AlertDialogFragment.Builder(requireActivity()).setTitle(title).setMessage(msg).setNeutralButton(R.string.btn_i_know, new DialogInterface.OnClickListener() { // from class: h00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectFragment.k(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getChildFragmentManager(), "correct fail").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodPressureCorrectFragment bloodPressureCorrectFragment, DialogInterface dialogInterface, int i) {
        bloodPressureCorrectFragment.f().reQueryWatchStatus();
    }

    private final void l() {
        new AlertDialogFragment.Builder(requireActivity()).setMessage(R.string.blood_pressure_correct__cancel_msg).setNeutralButton(R.string.btn_ok, new DialogInterface.OnClickListener() { // from class: g00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BloodPressureCorrectFragment.m(this.a, dialogInterface, i);
            }
        }).setCancelable(false).show(getChildFragmentManager(), "correct cancel").setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BloodPressureCorrectFragment bloodPressureCorrectFragment, DialogInterface dialogInterface, int i) {
        bloodPressureCorrectFragment.requireActivity().onBackPressed();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blood_pressure_correct, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        f().stopQueryWatchCorrectStatus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
    }
}
