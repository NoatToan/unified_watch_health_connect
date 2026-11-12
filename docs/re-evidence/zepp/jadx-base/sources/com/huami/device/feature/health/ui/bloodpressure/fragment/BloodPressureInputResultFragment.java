package com.huami.device.feature.health.ui.bloodpressure.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureInputResultFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "initViewModel", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "i", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "Landroid/text/TextWatcher;", "b", "h", "()Landroid/text/TextWatcher;", "mTextWatcher", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureInputResultFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTextWatcher = LazyKt__LazyJVMKt.lazy(new Function0<BloodPressureInputResultFragment$mTextWatcher$2.AnonymousClass1>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment$mTextWatcher$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment$mTextWatcher$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 getA() {
            final BloodPressureInputResultFragment bloodPressureInputResultFragment = this.a;
            return new TextWatcher() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureInputResultFragment$mTextWatcher$2.1
                /* JADX WARN: Code duplicated, block: B:25:0x0062  */
                /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s) {
                    boolean z;
                    boolean z2;
                    Integer value = bloodPressureInputResultFragment.i().getMeasureTimes().getValue();
                    if (value == null) {
                        value = 1;
                    }
                    int iIntValue = value.intValue();
                    View view = bloodPressureInputResultFragment.getView();
                    if (((EditText) (view == null ? null : view.findViewById(R.id.diastolic_edit))).getText().length() > 0) {
                        z = true;
                    } else {
                        View view2 = bloodPressureInputResultFragment.getView();
                        if (((EditText) (view2 == null ? null : view2.findViewById(R.id.systolic_edit))).getText().length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (iIntValue == 1) {
                        View view3 = bloodPressureInputResultFragment.getView();
                        (view3 == null ? null : view3.findViewById(R.id.input_line_one)).setEnabled(z);
                    } else if (iIntValue == 2) {
                        View view4 = bloodPressureInputResultFragment.getView();
                        (view4 == null ? null : view4.findViewById(R.id.input_line_two)).setEnabled(z);
                    }
                    View view5 = bloodPressureInputResultFragment.getView();
                    if (((EditText) (view5 == null ? null : view5.findViewById(R.id.diastolic_edit))).getText().length() > 0) {
                        View view6 = bloodPressureInputResultFragment.getView();
                        z2 = ((EditText) (view6 == null ? null : view6.findViewById(R.id.systolic_edit))).getText().length() > 0;
                    }
                    View view7 = bloodPressureInputResultFragment.getView();
                    ((TextView) (view7 != null ? view7.findViewById(R.id.btn_save) : null)).setEnabled(z2);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
                }
            };
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
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
            FragmentKt.findNavController(BloodPressureInputResultFragment.this).navigateUp();
        }
    }

    private final void g(View view) {
        Context context = getContext();
        Object systemService = context == null ? null : context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private final TextWatcher h() {
        return (TextWatcher) this.mTextWatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodPressureCorrectViewModel i() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    private final void initView(View view) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: z00
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    BloodPressureInputResultFragment.j(dialogInterface);
                }
            });
        }
        setCancelable(false);
        view.setOnClickListener(new View.OnClickListener() { // from class: a10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodPressureInputResultFragment.k(this.a, view2);
            }
        });
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.re_measure))).setOnClickListener(new View.OnClickListener() { // from class: c10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BloodPressureInputResultFragment.l(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.btn_save))).setOnClickListener(new View.OnClickListener() { // from class: b10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BloodPressureInputResultFragment.m(this.a, view4);
            }
        });
        View view4 = getView();
        ((EditText) (view4 == null ? null : view4.findViewById(R.id.diastolic_edit))).addTextChangedListener(h());
        View view5 = getView();
        ((EditText) (view5 == null ? null : view5.findViewById(R.id.systolic_edit))).addTextChangedListener(h());
        View view6 = getView();
        ((EditText) (view6 != null ? view6.findViewById(R.id.diastolic_edit) : null)).postDelayed(new Runnable() { // from class: e10
            @Override // java.lang.Runnable
            public final void run() {
                BloodPressureInputResultFragment.n(this.a);
            }
        }, 100L);
    }

    private final void initViewModel() {
        i().getMeasureTimes().observe(getViewLifecycleOwner(), new Observer() { // from class: d10
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureInputResultFragment.o(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DialogInterface dialogInterface) {
        View viewFindViewById;
        BottomSheetDialog bottomSheetDialog = dialogInterface instanceof BottomSheetDialog ? (BottomSheetDialog) dialogInterface : null;
        if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        bottomSheetDialog.getBehavior().setState(3);
        viewFindViewById.getParent().getParent().requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BloodPressureInputResultFragment bloodPressureInputResultFragment, View view) {
        bloodPressureInputResultFragment.g(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BloodPressureInputResultFragment bloodPressureInputResultFragment, View view) {
        FragmentKt.findNavController(bloodPressureInputResultFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BloodPressureInputResultFragment bloodPressureInputResultFragment, View view) {
        Integer intOrNull;
        Integer intOrNull2;
        View view2 = bloodPressureInputResultFragment.getView();
        String string = ((EditText) (view2 == null ? null : view2.findViewById(R.id.systolic_edit))).getText().toString();
        int iIntValue = 0;
        if (!(string.length() > 0)) {
            string = null;
        }
        int iIntValue2 = (string == null || (intOrNull = l.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
        View view3 = bloodPressureInputResultFragment.getView();
        String string2 = ((EditText) (view3 == null ? null : view3.findViewById(R.id.diastolic_edit))).getText().toString();
        String str = string2.length() > 0 ? string2 : null;
        if (str != null && (intOrNull2 = l.toIntOrNull(str)) != null) {
            iIntValue = intOrNull2.intValue();
        }
        bloodPressureInputResultFragment.i().addMeasureResult(iIntValue2, iIntValue, bloodPressureInputResultFragment.new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BloodPressureInputResultFragment bloodPressureInputResultFragment) {
        View view = bloodPressureInputResultFragment.getView();
        ((EditText) (view == null ? null : view.findViewById(R.id.systolic_edit))).requestFocus();
        Object systemService = bloodPressureInputResultFragment.requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        View view2 = bloodPressureInputResultFragment.getView();
        inputMethodManager.showSoftInput(view2 != null ? view2.findViewById(R.id.systolic_edit) : null, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BloodPressureInputResultFragment bloodPressureInputResultFragment, Integer num) {
        int iIntValue = num.intValue();
        String string = 1 <= iIntValue && iIntValue <= 3 ? bloodPressureInputResultFragment.getResources().getStringArray(R.array.blood_pressure_result_input_title)[num.intValue() - 1] : bloodPressureInputResultFragment.getString(R.string.blood_pressure_result_input_title_other);
        View view = bloodPressureInputResultFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.input_title))).setText(string);
        View view2 = bloodPressureInputResultFragment.getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.input_times_one))).setEnabled(num.intValue() >= 1);
        View view3 = bloodPressureInputResultFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.input_times_two))).setEnabled(num.intValue() >= 2);
        View view4 = bloodPressureInputResultFragment.getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.input_times_three))).setEnabled(num.intValue() >= 3);
        View view5 = bloodPressureInputResultFragment.getView();
        (view5 == null ? null : view5.findViewById(R.id.input_line_one)).setEnabled(num.intValue() >= 2);
        View view6 = bloodPressureInputResultFragment.getView();
        (view6 != null ? view6.findViewById(R.id.input_line_two) : null).setEnabled(num.intValue() >= 3);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_measure_result, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initViewModel();
    }
}
