package com.huami.assistant.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.fragment.app.FragmentManager;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.CustomRepeatPickerFragment;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.viewmodel.AddOrUpdateScheduleViewModel;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\u0012\u001a\u00020\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010)\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u00060"}, d2 = {"Lcom/huami/assistant/ui/v2/CustomRepeatPickerFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", hl.k, "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "onViewCreated", "submit", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "a", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "mViewModel", "b", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "Landroid/widget/CheckBox;", "c", "Landroid/widget/CheckBox;", "mMoCheck", GoogleApiAvailabilityLight.a, "mTuCheck", "e", "mWeCheck", "f", "mThCheck", "g", "mFrCheck", "h", "mSaCheck", "i", "mSuCheck", "Landroid/view/View;", "mBtnCancel", "mBtnSubmit", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class CustomRepeatPickerFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AddOrUpdateScheduleViewModel mViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private ScheduleRepeatMode mode = ScheduleRepeatMode.Once.INSTANCE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private CheckBox mMoCheck;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CheckBox mTuCheck;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private CheckBox mWeCheck;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private CheckBox mThCheck;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CheckBox mFrCheck;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private CheckBox mSaCheck;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private CheckBox mSuCheck;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private View mBtnCancel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View mBtnSubmit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/assistant/ui/v2/CustomRepeatPickerFragment$Companion;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "viewModel", "", "show", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull ScheduleRepeatMode mode, @NotNull AddOrUpdateScheduleViewModel viewModel) {
            CustomRepeatPickerFragment customRepeatPickerFragment = new CustomRepeatPickerFragment();
            customRepeatPickerFragment.mode = mode;
            customRepeatPickerFragment.mViewModel = viewModel;
            customRepeatPickerFragment.show(fragmentManager, "Picker-Repeat");
        }
    }

    private final void initView(View view) {
        this.mMoCheck = (CheckBox) view.findViewById(R.id.repeat_on_mo_check);
        this.mTuCheck = (CheckBox) view.findViewById(R.id.repeat_on_tu_check);
        this.mWeCheck = (CheckBox) view.findViewById(R.id.repeat_on_we_check);
        this.mThCheck = (CheckBox) view.findViewById(R.id.repeat_on_th_check);
        this.mFrCheck = (CheckBox) view.findViewById(R.id.repeat_on_fr_check);
        this.mSaCheck = (CheckBox) view.findViewById(R.id.repeat_on_sa_check);
        this.mSuCheck = (CheckBox) view.findViewById(R.id.repeat_on_su_check);
        this.mBtnCancel = view.findViewById(R.id.dialog_negative_button);
        this.mBtnSubmit = view.findViewById(R.id.dialog_positive_button);
        view.findViewById(R.id.repeat_on_mo).setOnClickListener(new View.OnClickListener() { // from class: d21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.l(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_tu).setOnClickListener(new View.OnClickListener() { // from class: f21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.m(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_we).setOnClickListener(new View.OnClickListener() { // from class: b21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.n(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_th).setOnClickListener(new View.OnClickListener() { // from class: h21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.o(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_fr).setOnClickListener(new View.OnClickListener() { // from class: c21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.p(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_sa).setOnClickListener(new View.OnClickListener() { // from class: g21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.q(this.a, view2);
            }
        });
        view.findViewById(R.id.repeat_on_su).setOnClickListener(new View.OnClickListener() { // from class: e21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomRepeatPickerFragment.r(this.a, view2);
            }
        });
        View view2 = this.mBtnCancel;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: j21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                CustomRepeatPickerFragment.s(this.a, view3);
            }
        });
        View view3 = this.mBtnSubmit;
        (view3 != null ? view3 : null).setOnClickListener(new View.OnClickListener() { // from class: i21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CustomRepeatPickerFragment.t(this.a, view4);
            }
        });
    }

    private final ScheduleRepeatMode j() {
        CheckBox checkBox = this.mMoCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        long mode = checkBox.isChecked() ? 0 | ScheduleRepeatMode.Monday.INSTANCE.getMode() : 0L;
        CheckBox checkBox2 = this.mTuCheck;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        if (checkBox2.isChecked()) {
            mode |= ScheduleRepeatMode.Tuesday.INSTANCE.getMode();
        }
        CheckBox checkBox3 = this.mWeCheck;
        if (checkBox3 == null) {
            checkBox3 = null;
        }
        if (checkBox3.isChecked()) {
            mode |= ScheduleRepeatMode.Wednesday.INSTANCE.getMode();
        }
        CheckBox checkBox4 = this.mThCheck;
        if (checkBox4 == null) {
            checkBox4 = null;
        }
        if (checkBox4.isChecked()) {
            mode |= ScheduleRepeatMode.Thursday.INSTANCE.getMode();
        }
        CheckBox checkBox5 = this.mFrCheck;
        if (checkBox5 == null) {
            checkBox5 = null;
        }
        if (checkBox5.isChecked()) {
            mode |= ScheduleRepeatMode.Friday.INSTANCE.getMode();
        }
        CheckBox checkBox6 = this.mSaCheck;
        if (checkBox6 == null) {
            checkBox6 = null;
        }
        if (checkBox6.isChecked()) {
            mode |= ScheduleRepeatMode.Saturday.INSTANCE.getMode();
        }
        CheckBox checkBox7 = this.mSuCheck;
        if ((checkBox7 != null ? checkBox7 : null).isChecked()) {
            mode |= ScheduleRepeatMode.Sunday.INSTANCE.getMode();
        }
        return new ScheduleRepeatMode(mode);
    }

    private final void k() {
        CheckBox checkBox = this.mMoCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setChecked((this.mode.getMode() & ScheduleRepeatMode.Monday.INSTANCE.getMode()) != 0);
        CheckBox checkBox2 = this.mTuCheck;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        checkBox2.setChecked((this.mode.getMode() & ScheduleRepeatMode.Tuesday.INSTANCE.getMode()) != 0);
        CheckBox checkBox3 = this.mWeCheck;
        if (checkBox3 == null) {
            checkBox3 = null;
        }
        checkBox3.setChecked((this.mode.getMode() & ScheduleRepeatMode.Wednesday.INSTANCE.getMode()) != 0);
        CheckBox checkBox4 = this.mThCheck;
        if (checkBox4 == null) {
            checkBox4 = null;
        }
        checkBox4.setChecked((this.mode.getMode() & ScheduleRepeatMode.Thursday.INSTANCE.getMode()) != 0);
        CheckBox checkBox5 = this.mFrCheck;
        if (checkBox5 == null) {
            checkBox5 = null;
        }
        checkBox5.setChecked((this.mode.getMode() & ScheduleRepeatMode.Friday.INSTANCE.getMode()) != 0);
        CheckBox checkBox6 = this.mSaCheck;
        if (checkBox6 == null) {
            checkBox6 = null;
        }
        checkBox6.setChecked((this.mode.getMode() & ScheduleRepeatMode.Saturday.INSTANCE.getMode()) != 0);
        CheckBox checkBox7 = this.mSuCheck;
        (checkBox7 != null ? checkBox7 : null).setChecked((this.mode.getMode() & ScheduleRepeatMode.Sunday.INSTANCE.getMode()) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mMoCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mTuCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mWeCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mThCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mFrCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mSaCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        CheckBox checkBox = customRepeatPickerFragment.mSuCheck;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        customRepeatPickerFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CustomRepeatPickerFragment customRepeatPickerFragment, View view) {
        customRepeatPickerFragment.submit();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule_custom_repeat_picker, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        k();
    }

    public final void submit() {
        AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel = this.mViewModel;
        if (addOrUpdateScheduleViewModel != null) {
            addOrUpdateScheduleViewModel.setRepeatMode(j());
        }
        dismissAllowingStateLoss();
    }
}
