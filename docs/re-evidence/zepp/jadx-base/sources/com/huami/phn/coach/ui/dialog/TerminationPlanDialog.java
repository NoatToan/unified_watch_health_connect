package com.huami.phn.coach.ui.dialog;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.phn.coach.R;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.ui.dialog.TerminationPlanDialog;
import com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel;
import com.huami.phn.core.device.DeviceManager;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/phn/coach/ui/dialog/TerminationPlanDialog;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Landroid/view/View;", "getContentView", "", "type", "", "reason", "", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "h", "Lkotlin/Lazy;", "m", "()Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "viewModel", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class TerminationPlanDialog extends AlertDialogFragment {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public TerminationPlanDialog() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.dialog.TerminationPlanDialog$special$$inlined$sharedViewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PHNTerminationPlanViewModel>() { // from class: com.huami.phn.coach.ui.dialog.TerminationPlanDialog$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PHNTerminationPlanViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PHNTerminationPlanViewModel.class), function0, objArr);
            }
        });
    }

    private final View getContentView() {
        View viewInflate = View.inflate(getContext(), R.layout.phn_dialog_termination_plan, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_reason_jump_over);
        final TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_reason_submit);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_termination_plan_reason_list);
        final AppCompatEditText appCompatEditText = (AppCompatEditText) viewInflate.findViewById(R.id.et_other);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: jn7
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                TerminationPlanDialog.i(appCompatEditText, intRef, textView2, this, radioGroup2, i);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: in7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TerminationPlanDialog.j(this.a, view);
            }
        });
        appCompatEditText.addTextChangedListener(new TextWatcher() { // from class: com.huami.phn.coach.ui.dialog.TerminationPlanDialog$getContentView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                if (String.valueOf(s).length() == 0) {
                    textView2.setTextColor(this.getResources().getColor(R.color.s2));
                } else {
                    textView2.setTextColor(this.getResources().getColor(R.color.s1));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: hn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TerminationPlanDialog.k(appCompatEditText, intRef, this, view);
            }
        });
        m().getStopPlanLiveData().observe(this, new Observer() { // from class: kn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TerminationPlanDialog.l(this.a, (Boolean) obj);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AppCompatEditText appCompatEditText, Ref.IntRef intRef, TextView textView, TerminationPlanDialog terminationPlanDialog, RadioGroup radioGroup, int i) {
        if (i == R.id.rb_reason_first) {
            appCompatEditText.setVisibility(8);
            intRef.element = ReasonType.REASON_FIRST.ordinal();
            textView.setTextColor(terminationPlanDialog.getResources().getColor(R.color.s1));
        } else if (i == R.id.rb_reason_second) {
            appCompatEditText.setVisibility(8);
            intRef.element = ReasonType.REASON_SECOND.ordinal();
            textView.setTextColor(terminationPlanDialog.getResources().getColor(R.color.s1));
        } else if (i == R.id.rb_reason_third) {
            appCompatEditText.setVisibility(8);
            intRef.element = ReasonType.REASON_THIRD.ordinal();
            textView.setTextColor(terminationPlanDialog.getResources().getColor(R.color.s1));
        } else if (i == R.id.rb_reason_other) {
            appCompatEditText.setVisibility(0);
            textView.setTextColor(terminationPlanDialog.getResources().getColor(R.color.s2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TerminationPlanDialog terminationPlanDialog, View view) {
        terminationPlanDialog.n(0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AppCompatEditText appCompatEditText, Ref.IntRef intRef, TerminationPlanDialog terminationPlanDialog, View view) {
        int i;
        String strValueOf = String.valueOf(appCompatEditText.getText());
        if (!(appCompatEditText.getVisibility() == 0) && (i = intRef.element) != -1) {
            terminationPlanDialog.n(i, null);
            return;
        }
        if (!(appCompatEditText.getVisibility() == 0) || TextUtils.isEmpty(strValueOf)) {
            return;
        }
        terminationPlanDialog.n(ReasonType.REASON_OTHER.ordinal(), strValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TerminationPlanDialog terminationPlanDialog, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        IconToast.showError(terminationPlanDialog.getContext(), terminationPlanDialog.getString(R.string.phn_operation_failed));
    }

    private final PHNTerminationPlanViewModel m() {
        return (PHNTerminationPlanViewModel) this.viewModel.getValue();
    }

    private final void n(int type, String reason) {
        if (!((DeviceManager) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null)).isActiveDeviceConnected()) {
            IconToast.showError(getContext(), getString(R.string.phn_device_not_connected));
        } else if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            m().stopPlan(type, reason);
        } else {
            IconToast.showError(getContext(), getString(R.string.phn_network_not_connected));
        }
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = "";
        dialogParams.contentView = getContentView();
        setParams(dialogParams);
    }
}
