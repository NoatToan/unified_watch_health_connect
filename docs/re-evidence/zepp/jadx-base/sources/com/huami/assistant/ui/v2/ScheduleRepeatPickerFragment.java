package com.huami.assistant.ui.v2;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.ScheduleRepeatPickerFragment;
import com.huami.assistant.ui.v2.model.ScheduleRepeatMode;
import com.huami.assistant.ui.v2.viewmodel.AddOrUpdateScheduleViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/assistant/ui/v2/ScheduleRepeatPickerFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "initViews", "initData", "Landroid/view/View;", "v", "onSelectRepeat", SOAP.XMLNS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "a", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "", "b", "Z", "isSupportWorkDay", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "c", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "mViewModel", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleRepeatPickerFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ScheduleRepeatMode mode = ScheduleRepeatMode.Once.INSTANCE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isSupportWorkDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AddOrUpdateScheduleViewModel mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/huami/assistant/ui/v2/ScheduleRepeatPickerFragment$Companion;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "mode", "", "isSupportWorkDay", "Lcom/huami/assistant/ui/v2/viewmodel/AddOrUpdateScheduleViewModel;", "viewModel", "", "show", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull ScheduleRepeatMode mode, boolean isSupportWorkDay, @NotNull AddOrUpdateScheduleViewModel viewModel) {
            ScheduleRepeatPickerFragment scheduleRepeatPickerFragment = new ScheduleRepeatPickerFragment();
            scheduleRepeatPickerFragment.isSupportWorkDay = isSupportWorkDay;
            scheduleRepeatPickerFragment.mode = mode;
            scheduleRepeatPickerFragment.mViewModel = viewModel;
            scheduleRepeatPickerFragment.show(fragmentManager, "Picker-Repeat");
        }
    }

    private final void initData() {
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.repeat_never_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Once.INSTANCE) ? 0 : 8);
        View view2 = getView();
        ((ImageView) (view2 == null ? null : view2.findViewById(R.id.repeat_every_day_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.EveryDay.INSTANCE) ? 0 : 8);
        View view3 = getView();
        ((ImageView) (view3 == null ? null : view3.findViewById(R.id.repeat_every_work_day_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.WorkDay.INSTANCE) ? 0 : 8);
        View view4 = getView();
        ((ImageView) (view4 == null ? null : view4.findViewById(R.id.repeat_every_weekend_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Weekend.INSTANCE) ? 0 : 8);
        View view5 = getView();
        ((ImageView) (view5 == null ? null : view5.findViewById(R.id.repeat_every_week_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Week.INSTANCE) ? 0 : 8);
        View view6 = getView();
        ((ImageView) (view6 == null ? null : view6.findViewById(R.id.repeat_every_two_week_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Fortnight.INSTANCE) ? 0 : 8);
        View view7 = getView();
        ((ImageView) (view7 == null ? null : view7.findViewById(R.id.repeat_every_month_check))).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Month.INSTANCE) ? 0 : 8);
        View view8 = getView();
        ((ImageView) (view8 != null ? view8.findViewById(R.id.repeat_every_year_check) : null)).setVisibility(Intrinsics.areEqual(this.mode, ScheduleRepeatMode.Year.INSTANCE) ? 0 : 8);
    }

    private final void initViews() {
        View view = getView();
        ((RelativeLayout) (view == null ? null : view.findViewById(R.id.repeat_once))).setOnClickListener(new View.OnClickListener() { // from class: cj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScheduleRepeatPickerFragment.j(this.a, view2);
            }
        });
        View view2 = getView();
        ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.repeat_every_day))).setOnClickListener(new View.OnClickListener() { // from class: fj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ScheduleRepeatPickerFragment.k(this.a, view3);
            }
        });
        View view3 = getView();
        ((RelativeLayout) (view3 == null ? null : view3.findViewById(R.id.repeat_every_work_day))).setOnClickListener(new View.OnClickListener() { // from class: hj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                ScheduleRepeatPickerFragment.l(this.a, view4);
            }
        });
        View view4 = getView();
        ((RelativeLayout) (view4 == null ? null : view4.findViewById(R.id.repeat_every_weekend))).setOnClickListener(new View.OnClickListener() { // from class: aj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ScheduleRepeatPickerFragment.m(this.a, view5);
            }
        });
        View view5 = getView();
        ((RelativeLayout) (view5 == null ? null : view5.findViewById(R.id.repeat_every_week))).setOnClickListener(new View.OnClickListener() { // from class: gj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                ScheduleRepeatPickerFragment.n(this.a, view6);
            }
        });
        View view6 = getView();
        ((RelativeLayout) (view6 == null ? null : view6.findViewById(R.id.repeat_every_two_week))).setOnClickListener(new View.OnClickListener() { // from class: dj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                ScheduleRepeatPickerFragment.o(this.a, view7);
            }
        });
        View view7 = getView();
        ((RelativeLayout) (view7 == null ? null : view7.findViewById(R.id.repeat_every_month))).setOnClickListener(new View.OnClickListener() { // from class: bj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                ScheduleRepeatPickerFragment.p(this.a, view8);
            }
        });
        View view8 = getView();
        ((RelativeLayout) (view8 == null ? null : view8.findViewById(R.id.repeat_every_year))).setOnClickListener(new View.OnClickListener() { // from class: ej6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                ScheduleRepeatPickerFragment.q(this.a, view9);
            }
        });
        View view9 = getView();
        ((RelativeLayout) (view9 == null ? null : view9.findViewById(R.id.repeat_custom))).setOnClickListener(new View.OnClickListener() { // from class: zi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                ScheduleRepeatPickerFragment.r(this.a, view10);
            }
        });
        int i = this.isSupportWorkDay ? 0 : 8;
        View view10 = getView();
        ((RelativeLayout) (view10 == null ? null : view10.findViewById(R.id.repeat_every_work_day))).setVisibility(i);
        View view11 = getView();
        ((RelativeLayout) (view11 != null ? view11.findViewById(R.id.repeat_every_weekend) : null)).setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    private final void onSelectRepeat(View v) {
        int id = v.getId();
        if (R.id.repeat_once == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel = this.mViewModel;
            if (addOrUpdateScheduleViewModel != null) {
                addOrUpdateScheduleViewModel.setRepeatMode(ScheduleRepeatMode.Once.INSTANCE);
            }
        } else if (R.id.repeat_every_day == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel2 = this.mViewModel;
            if (addOrUpdateScheduleViewModel2 != null) {
                addOrUpdateScheduleViewModel2.setRepeatMode(ScheduleRepeatMode.EveryDay.INSTANCE);
            }
        } else if (R.id.repeat_every_work_day == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel3 = this.mViewModel;
            if (addOrUpdateScheduleViewModel3 != null) {
                addOrUpdateScheduleViewModel3.setRepeatMode(ScheduleRepeatMode.WorkDay.INSTANCE);
            }
        } else if (R.id.repeat_every_weekend == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel4 = this.mViewModel;
            if (addOrUpdateScheduleViewModel4 != null) {
                addOrUpdateScheduleViewModel4.setRepeatMode(ScheduleRepeatMode.Weekend.INSTANCE);
            }
        } else if (R.id.repeat_every_week == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel5 = this.mViewModel;
            if (addOrUpdateScheduleViewModel5 != null) {
                addOrUpdateScheduleViewModel5.setRepeatMode(ScheduleRepeatMode.Week.INSTANCE);
            }
        } else if (R.id.repeat_every_two_week == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel6 = this.mViewModel;
            if (addOrUpdateScheduleViewModel6 != null) {
                addOrUpdateScheduleViewModel6.setRepeatMode(ScheduleRepeatMode.Fortnight.INSTANCE);
            }
        } else if (R.id.repeat_every_month == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel7 = this.mViewModel;
            if (addOrUpdateScheduleViewModel7 != null) {
                addOrUpdateScheduleViewModel7.setRepeatMode(ScheduleRepeatMode.Month.INSTANCE);
            }
        } else if (R.id.repeat_every_year == id) {
            AddOrUpdateScheduleViewModel addOrUpdateScheduleViewModel8 = this.mViewModel;
            if (addOrUpdateScheduleViewModel8 != null) {
                addOrUpdateScheduleViewModel8.setRepeatMode(ScheduleRepeatMode.Year.INSTANCE);
            }
        } else if (R.id.repeat_custom == id) {
            s();
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ScheduleRepeatPickerFragment scheduleRepeatPickerFragment, View view) {
        scheduleRepeatPickerFragment.onSelectRepeat(view);
    }

    private final void s() {
        CustomRepeatPickerFragment.INSTANCE.show(requireActivity().getSupportFragmentManager(), this.mode, this.mViewModel);
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
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        return inflater.inflate(R.layout.fragment_schedule_repeat_picker, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initViews();
        initData();
    }
}
